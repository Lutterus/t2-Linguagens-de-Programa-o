package org.example.domainmodel.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.example.domainmodel.domainmodel.Entity
import org.example.domainmodel.domainmodel.Feature
import org.eclipse.xtext.naming.IQualifiedNameProvider

import com.google.inject.Inject
import java.util.ArrayList
import java.util.List
import org.example.domainmodel.domainmodel.DataType

class DomainmodelGenerator extends AbstractGenerator {
	List<String> tables = new ArrayList<String>();
	List<String> alterTables = new ArrayList<String>();
	String finals = "";
	String DBname = "";
	DataType dt;
	List<Entity> tablesEntity = new ArrayList<Entity>();
	@Inject extension IQualifiedNameProvider
	
	
	def valAssign() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (e : resource.allContents.toIterable.filter(Entity)) {
			tables.add(e.name.toString);
			tablesEntity.add(e);
			fsa.generateFile(e.fullyQualifiedName.toString("/") + ".sql", e.compile)
		}
		for (e : resource.allContents.toIterable.filter(DataType)) {
			dt=e;
		}
		fsa.generateFile("alterTables" + ".sql", prints());
		fsa.generateFile("CreateTable" + ".sql", create());
		fsa.generateFile("JavaJDCB" + ".java", jdbcCreate());
		
}	
	def String prints() {		
		for (String name : alterTables) {
			finals += name + "\n"
		}
    	return finals;
	}
	def String create() {		
		DBname = "CREATE DATABASE " + dt.name + ";" + "\n"
		DBname = DBname + "USE " + dt.name + ";" + "\n"
    	return DBname;
	}
	
	

	def compile(Entity e) ''' 
		"CREATE TABLE IF NOT EXISTS «e.name» ("+
			    "pk«e.name» INT NOT NULL,"+
		    «FOR f : e.features»
		    «IF tables.contains(f.name)»
		    «alterTables.add("ALTER TABLE "+f.name+" ADD fk" +e.name+" INT NOT NULL, ADD FOREIGN KEY (fk"+e.name+") REFERENCES "+e.name+"(pk"+e.name+");")»
		    «ELSE»
		    «f.compile»
		    «ENDIF»
		    «ENDFOR»
		    
		«IF e.superType !== null
		»
		        "fk«e.superType.fullyQualifiedName» INT NOT NULL,"+
		        "FOREIGN KEY (fk«e.superType.fullyQualifiedName») REFERENCES «e.superType.fullyQualifiedName» (pk«e.superType.fullyQualifiedName»),"+«ENDIF»
		      "PRIMARY KEY (pk«e.name»))";
	'''

	def compile(Feature f) '''
		"«f.name» «f.type» «f.s»,"+
	'''
	def jdbcCreate() '''
		
		//STEP 1. Import required packages
		import java.sql.*;
		
		public class Main {
		   // JDBC driver name and database URL
		   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		   static final String DB_URL = "jdbc:mysql://localhost/«dt.name»";
		
		   //  Database credentials
		   static final String USER = "username";
		   static final String PASS = "password";
		   
		   public static void main(String[] args) {
		   Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");
		
		      //STEP 3: Open a connection
		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		      System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		      System.out.println("Creating tables in given database...");
		      stmt = conn.createStatement();
		      String sql = "";
		      «FOR t : tablesEntity»
		      
		      sql = «compile(t)»
		      stmt.executeUpdate(sql);
		      System.out.println("Created table in given database...");
		      «ENDFOR»	
		      
		      «FOR t : alterTables»
		      sql = "«t»";
		      stmt.executeUpdate(sql);
		      System.out.println("Altered table in given database...");
		      «ENDFOR»		
		      
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("Goodbye!");
		}//end main
		}//end JDBCExample
	'''
}
