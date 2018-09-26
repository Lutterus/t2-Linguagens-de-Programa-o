/*
 * generated by Xtext 2.14.0
 */
package org.example.domainmodel.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class DomainmodelGrammarAccess extends AbstractGrammarElementFinder {
	
	public class DomainmodelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.example.domainmodel.Domainmodel.Domainmodel");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsTypeParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Domainmodel:
		//	elements+=Type*;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=Type*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//Type
		public RuleCall getElementsTypeParserRuleCall_0() { return cElementsTypeParserRuleCall_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.example.domainmodel.Domainmodel.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cSdAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cSdDataTypeParserRuleCall_0_0 = (RuleCall)cSdAssignment_0.eContents().get(0);
		private final RuleCall cEntityParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Type:
		//	sd=DataType | Entity;
		@Override public ParserRule getRule() { return rule; }
		
		//sd=DataType | Entity
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//sd=DataType
		public Assignment getSdAssignment_0() { return cSdAssignment_0; }
		
		//DataType
		public RuleCall getSdDataTypeParserRuleCall_0_0() { return cSdDataTypeParserRuleCall_0_0; }
		
		//Entity
		public RuleCall getEntityParserRuleCall_1() { return cEntityParserRuleCall_1; }
	}
	public class DataTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.example.domainmodel.Domainmodel.DataType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDATABASENameKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//DataType:
		//	'DATABASE name' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'DATABASE name' name=ID
		public Group getGroup() { return cGroup; }
		
		//'DATABASE name'
		public Keyword getDATABASENameKeyword_0() { return cDATABASENameKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.example.domainmodel.Domainmodel.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSuperTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cSuperTypeEntityCrossReference_2_1_0 = (CrossReference)cSuperTypeAssignment_2_1.eContents().get(0);
		private final RuleCall cSuperTypeEntityIDTerminalRuleCall_2_1_0_1 = (RuleCall)cSuperTypeEntityCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFeaturesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFeaturesFeatureParserRuleCall_4_0 = (RuleCall)cFeaturesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Entity:
		//	'entity' name=ID ('extends' superType=[Entity])? '{'
		//	features+=Feature*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'entity' name=ID ('extends' superType=[Entity])? '{' features+=Feature* '}'
		public Group getGroup() { return cGroup; }
		
		//'entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('extends' superType=[Entity])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'extends'
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }
		
		//superType=[Entity]
		public Assignment getSuperTypeAssignment_2_1() { return cSuperTypeAssignment_2_1; }
		
		//[Entity]
		public CrossReference getSuperTypeEntityCrossReference_2_1_0() { return cSuperTypeEntityCrossReference_2_1_0; }
		
		//ID
		public RuleCall getSuperTypeEntityIDTerminalRuleCall_2_1_0_1() { return cSuperTypeEntityIDTerminalRuleCall_2_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//features+=Feature*
		public Assignment getFeaturesAssignment_4() { return cFeaturesAssignment_4; }
		
		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_4_0() { return cFeaturesFeatureParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.example.domainmodel.Domainmodel.Feature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cManyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cManyManyKeyword_0_0 = (Keyword)cManyAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeVariableTypeParserRuleCall_3_0 = (RuleCall)cTypeAssignment_3.eContents().get(0);
		private final Assignment cSAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSVariableSizeParserRuleCall_4_0 = (RuleCall)cSAssignment_4.eContents().get(0);
		
		//Feature:
		//	many?='many'? name=ID ':' type=variableType s=variableSize;
		@Override public ParserRule getRule() { return rule; }
		
		//many?='many'? name=ID ':' type=variableType s=variableSize
		public Group getGroup() { return cGroup; }
		
		//many?='many'?
		public Assignment getManyAssignment_0() { return cManyAssignment_0; }
		
		//'many'
		public Keyword getManyManyKeyword_0_0() { return cManyManyKeyword_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//type=variableType
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }
		
		//variableType
		public RuleCall getTypeVariableTypeParserRuleCall_3_0() { return cTypeVariableTypeParserRuleCall_3_0; }
		
		//s=variableSize
		public Assignment getSAssignment_4() { return cSAssignment_4; }
		
		//variableSize
		public RuleCall getSVariableSizeParserRuleCall_4_0() { return cSVariableSizeParserRuleCall_4_0; }
	}
	public class VariableTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.example.domainmodel.Domainmodel.variableType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cDATEKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cINTKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cCHARKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cVARCHARKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cDATETIMEKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cTIMESTAMPKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		private final Keyword cTEXTKeyword_6 = (Keyword)cAlternatives.eContents().get(6);
		private final Keyword cNUMBERKeyword_7 = (Keyword)cAlternatives.eContents().get(7);
		
		//variableType:
		//	'DATE' | 'INT' | 'CHAR' | 'VARCHAR' | 'DATETIME' | 'TIMESTAMP' | 'TEXT' | 'NUMBER';
		@Override public ParserRule getRule() { return rule; }
		
		//'DATE' | 'INT' | 'CHAR' | 'VARCHAR' | 'DATETIME' | 'TIMESTAMP' | 'TEXT' | 'NUMBER'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'DATE'
		public Keyword getDATEKeyword_0() { return cDATEKeyword_0; }
		
		//'INT'
		public Keyword getINTKeyword_1() { return cINTKeyword_1; }
		
		//'CHAR'
		public Keyword getCHARKeyword_2() { return cCHARKeyword_2; }
		
		//'VARCHAR'
		public Keyword getVARCHARKeyword_3() { return cVARCHARKeyword_3; }
		
		//'DATETIME'
		public Keyword getDATETIMEKeyword_4() { return cDATETIMEKeyword_4; }
		
		//'TIMESTAMP'
		public Keyword getTIMESTAMPKeyword_5() { return cTIMESTAMPKeyword_5; }
		
		//'TEXT'
		public Keyword getTEXTKeyword_6() { return cTEXTKeyword_6; }
		
		//'NUMBER'
		public Keyword getNUMBERKeyword_7() { return cNUMBERKeyword_7; }
	}
	public class VariableSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.example.domainmodel.Domainmodel.variableSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//variableSize:
		//	('(' INT ')')?;
		@Override public ParserRule getRule() { return rule; }
		
		//('(' INT ')')?
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	
	
	private final DomainmodelElements pDomainmodel;
	private final TypeElements pType;
	private final DataTypeElements pDataType;
	private final EntityElements pEntity;
	private final FeatureElements pFeature;
	private final VariableTypeElements pVariableType;
	private final VariableSizeElements pVariableSize;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DomainmodelGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDomainmodel = new DomainmodelElements();
		this.pType = new TypeElements();
		this.pDataType = new DataTypeElements();
		this.pEntity = new EntityElements();
		this.pFeature = new FeatureElements();
		this.pVariableType = new VariableTypeElements();
		this.pVariableSize = new VariableSizeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.example.domainmodel.Domainmodel".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Domainmodel:
	//	elements+=Type*;
	public DomainmodelElements getDomainmodelAccess() {
		return pDomainmodel;
	}
	
	public ParserRule getDomainmodelRule() {
		return getDomainmodelAccess().getRule();
	}
	
	//Type:
	//	sd=DataType | Entity;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//DataType:
	//	'DATABASE name' name=ID;
	public DataTypeElements getDataTypeAccess() {
		return pDataType;
	}
	
	public ParserRule getDataTypeRule() {
		return getDataTypeAccess().getRule();
	}
	
	//Entity:
	//	'entity' name=ID ('extends' superType=[Entity])? '{'
	//	features+=Feature*
	//	'}';
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//Feature:
	//	many?='many'? name=ID ':' type=variableType s=variableSize;
	public FeatureElements getFeatureAccess() {
		return pFeature;
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}
	
	//variableType:
	//	'DATE' | 'INT' | 'CHAR' | 'VARCHAR' | 'DATETIME' | 'TIMESTAMP' | 'TEXT' | 'NUMBER';
	public VariableTypeElements getVariableTypeAccess() {
		return pVariableType;
	}
	
	public ParserRule getVariableTypeRule() {
		return getVariableTypeAccess().getRule();
	}
	
	//variableSize:
	//	('(' INT ')')?;
	public VariableSizeElements getVariableSizeAccess() {
		return pVariableSize;
	}
	
	public ParserRule getVariableSizeRule() {
		return getVariableSizeAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}