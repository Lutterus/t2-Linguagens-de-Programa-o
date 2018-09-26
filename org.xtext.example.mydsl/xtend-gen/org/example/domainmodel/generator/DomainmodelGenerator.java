package org.example.domainmodel.generator;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.example.domainmodel.domainmodel.DataType;
import org.example.domainmodel.domainmodel.Entity;
import org.example.domainmodel.domainmodel.Feature;

@SuppressWarnings("all")
public class DomainmodelGenerator extends AbstractGenerator {
  private List<String> tables = new ArrayList<String>();
  
  private List<String> alterTables = new ArrayList<String>();
  
  private String finals = "";
  
  private String DBname = "";
  
  private DataType dt;
  
  private List<Entity> tablesEntity = new ArrayList<Entity>();
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  public void valAssign() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
    for (final Entity e : _filter) {
      {
        this.tables.add(e.getName().toString());
        this.tablesEntity.add(e);
        String _string = this._iQualifiedNameProvider.getFullyQualifiedName(e).toString("/");
        String _plus = (_string + ".sql");
        fsa.generateFile(_plus, this.compile(e));
      }
    }
    Iterable<DataType> _filter_1 = Iterables.<DataType>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), DataType.class);
    for (final DataType e_1 : _filter_1) {
      this.dt = e_1;
    }
    fsa.generateFile(("alterTables" + ".sql"), this.prints());
    fsa.generateFile(("CreateTable" + ".sql"), this.create());
    fsa.generateFile(("JavaJDCB" + ".java"), this.jdbcCreate());
  }
  
  public String prints() {
    for (final String name : this.alterTables) {
      String _finals = this.finals;
      this.finals = (_finals + (name + "\n"));
    }
    return this.finals;
  }
  
  public String create() {
    String _name = this.dt.getName();
    String _plus = ("CREATE DATABASE " + _name);
    String _plus_1 = (_plus + ";");
    String _plus_2 = (_plus_1 + "\n");
    this.DBname = _plus_2;
    String _name_1 = this.dt.getName();
    String _plus_3 = ((this.DBname + "USE ") + _name_1);
    String _plus_4 = (_plus_3 + ";");
    String _plus_5 = (_plus_4 + "\n");
    this.DBname = _plus_5;
    return this.DBname;
  }
  
  public CharSequence compile(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"CREATE TABLE IF NOT EXISTS ");
    String _name = e.getName();
    _builder.append(_name);
    _builder.append(" (\"+");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    _builder.append("\"pk");
    String _name_1 = e.getName();
    _builder.append(_name_1, "\t    ");
    _builder.append(" INT NOT NULL,\"+");
    _builder.newLineIfNotEmpty();
    {
      EList<Feature> _features = e.getFeatures();
      for(final Feature f : _features) {
        {
          boolean _contains = this.tables.contains(f.getName());
          if (_contains) {
            _builder.append("    ");
            String _name_2 = f.getName();
            String _plus = ("ALTER TABLE " + _name_2);
            String _plus_1 = (_plus + " ADD fk");
            String _name_3 = e.getName();
            String _plus_2 = (_plus_1 + _name_3);
            String _plus_3 = (_plus_2 + " INT NOT NULL, ADD FOREIGN KEY (fk");
            String _name_4 = e.getName();
            String _plus_4 = (_plus_3 + _name_4);
            String _plus_5 = (_plus_4 + ") REFERENCES ");
            String _name_5 = e.getName();
            String _plus_6 = (_plus_5 + _name_5);
            String _plus_7 = (_plus_6 + "(pk");
            String _name_6 = e.getName();
            String _plus_8 = (_plus_7 + _name_6);
            String _plus_9 = (_plus_8 + ");");
            boolean _add = this.alterTables.add(_plus_9);
            _builder.append(_add, "    ");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("    ");
            CharSequence _compile = this.compile(f);
            _builder.append(_compile, "    ");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("    ");
    _builder.newLine();
    {
      Entity _superType = e.getSuperType();
      boolean _tripleNotEquals = (_superType != null);
      if (_tripleNotEquals) {
        _builder.append("\"fk");
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e.getSuperType());
        _builder.append(_fullyQualifiedName);
        _builder.append(" INT NOT NULL,\"+");
        _builder.newLineIfNotEmpty();
        _builder.append("\"FOREIGN KEY (fk");
        QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(e.getSuperType());
        _builder.append(_fullyQualifiedName_1);
        _builder.append(") REFERENCES ");
        QualifiedName _fullyQualifiedName_2 = this._iQualifiedNameProvider.getFullyQualifiedName(e.getSuperType());
        _builder.append(_fullyQualifiedName_2);
        _builder.append(" (pk");
        QualifiedName _fullyQualifiedName_3 = this._iQualifiedNameProvider.getFullyQualifiedName(e.getSuperType());
        _builder.append(_fullyQualifiedName_3);
        _builder.append("),\"+");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("      ");
    _builder.append("\"PRIMARY KEY (pk");
    String _name_7 = e.getName();
    _builder.append(_name_7, "      ");
    _builder.append("))\";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Feature f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _name = f.getName();
    _builder.append(_name);
    _builder.append(" ");
    String _type = f.getType();
    _builder.append(_type);
    _builder.append(" ");
    String _s = f.getS();
    _builder.append(_s);
    _builder.append(",\"+");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence jdbcCreate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("//STEP 1. Import required packages");
    _builder.newLine();
    _builder.append("import java.sql.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Main {");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("// JDBC driver name and database URL");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("static final String JDBC_DRIVER = \"com.mysql.jdbc.Driver\";  ");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("static final String DB_URL = \"jdbc:mysql://localhost/");
    String _name = this.dt.getName();
    _builder.append(_name, "   ");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("   ");
    _builder.append("//  Database credentials");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("static final String USER = \"username\";");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("static final String PASS = \"password\";");
    _builder.newLine();
    _builder.append("   ");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("Connection conn = null;");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("Statement stmt = null;");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("try{");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("//STEP 2: Register JDBC driver");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("Class.forName(\"com.mysql.jdbc.Driver\");");
    _builder.newLine();
    _builder.newLine();
    _builder.append("      ");
    _builder.append("//STEP 3: Open a connection");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("System.out.println(\"Connecting to a selected database...\");");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("conn = DriverManager.getConnection(DB_URL, USER, PASS);");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("System.out.println(\"Connected database successfully...\");");
    _builder.newLine();
    _builder.append("      ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("//STEP 4: Execute a query");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("System.out.println(\"Creating tables in given database...\");");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("stmt = conn.createStatement();");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("String sql = \"\";");
    _builder.newLine();
    {
      for(final Entity t : this.tablesEntity) {
        _builder.append("      ");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("sql = ");
        CharSequence _compile = this.compile(t);
        _builder.append(_compile, "      ");
        _builder.newLineIfNotEmpty();
        _builder.append("      ");
        _builder.append("stmt.executeUpdate(sql);");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("System.out.println(\"Created table in given database...\");");
        _builder.newLine();
      }
    }
    _builder.append("      ");
    _builder.newLine();
    {
      for(final String t_1 : this.alterTables) {
        _builder.append("      ");
        _builder.append("sql = \"");
        _builder.append(t_1, "      ");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.append("      ");
        _builder.append("stmt.executeUpdate(sql);");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("System.out.println(\"Altered table in given database...\");");
        _builder.newLine();
      }
    }
    _builder.append("      ");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("}catch(SQLException se){");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("//Handle errors for JDBC");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("se.printStackTrace();");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("}catch(Exception e){");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("//Handle errors for Class.forName");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("e.printStackTrace();");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("}finally{");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("//finally block used to close resources");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("try{");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("if(stmt!=null)");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("conn.close();");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("}catch(SQLException se){");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("}// do nothing");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("try{");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("if(conn!=null)");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("conn.close();");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("}catch(SQLException se){");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("se.printStackTrace();");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("}//end finally try");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("}//end try");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("System.out.println(\"Goodbye!\");");
    _builder.newLine();
    _builder.append("}//end main");
    _builder.newLine();
    _builder.append("}//end JDBCExample");
    _builder.newLine();
    return _builder;
  }
}
