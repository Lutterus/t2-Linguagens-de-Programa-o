/*
 * generated by Xtext 2.14.0
 */
grammar InternalDomainmodel;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.example.domainmodel.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.example.domainmodel.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.example.domainmodel.services.DomainmodelGrammarAccess;

}
@parser::members {
	private DomainmodelGrammarAccess grammarAccess;

	public void setGrammarAccess(DomainmodelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleDomainmodel
entryRuleDomainmodel
:
{ before(grammarAccess.getDomainmodelRule()); }
	 ruleDomainmodel
{ after(grammarAccess.getDomainmodelRule()); } 
	 EOF 
;

// Rule Domainmodel
ruleDomainmodel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDomainmodelAccess().getElementsAssignment()); }
		(rule__Domainmodel__ElementsAssignment)*
		{ after(grammarAccess.getDomainmodelAccess().getElementsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleType
entryRuleType
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeAccess().getAlternatives()); }
		(rule__Type__Alternatives)
		{ after(grammarAccess.getTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDataType
entryRuleDataType
:
{ before(grammarAccess.getDataTypeRule()); }
	 ruleDataType
{ after(grammarAccess.getDataTypeRule()); } 
	 EOF 
;

// Rule DataType
ruleDataType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDataTypeAccess().getGroup()); }
		(rule__DataType__Group__0)
		{ after(grammarAccess.getDataTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntity
entryRuleEntity
:
{ before(grammarAccess.getEntityRule()); }
	 ruleEntity
{ after(grammarAccess.getEntityRule()); } 
	 EOF 
;

// Rule Entity
ruleEntity 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityAccess().getGroup()); }
		(rule__Entity__Group__0)
		{ after(grammarAccess.getEntityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFeature
entryRuleFeature
:
{ before(grammarAccess.getFeatureRule()); }
	 ruleFeature
{ after(grammarAccess.getFeatureRule()); } 
	 EOF 
;

// Rule Feature
ruleFeature 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeatureAccess().getGroup()); }
		(rule__Feature__Group__0)
		{ after(grammarAccess.getFeatureAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulevariableType
entryRulevariableType
:
{ before(grammarAccess.getVariableTypeRule()); }
	 rulevariableType
{ after(grammarAccess.getVariableTypeRule()); } 
	 EOF 
;

// Rule variableType
rulevariableType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVariableTypeAccess().getAlternatives()); }
		(rule__VariableType__Alternatives)
		{ after(grammarAccess.getVariableTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulevariableSize
entryRulevariableSize
:
{ before(grammarAccess.getVariableSizeRule()); }
	 rulevariableSize
{ after(grammarAccess.getVariableSizeRule()); } 
	 EOF 
;

// Rule variableSize
rulevariableSize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVariableSizeAccess().getGroup()); }
		(rule__VariableSize__Group__0)?
		{ after(grammarAccess.getVariableSizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getSdAssignment_0()); }
		(rule__Type__SdAssignment_0)
		{ after(grammarAccess.getTypeAccess().getSdAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); }
		ruleEntity
		{ after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableTypeAccess().getDATEKeyword_0()); }
		'DATE'
		{ after(grammarAccess.getVariableTypeAccess().getDATEKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getVariableTypeAccess().getINTKeyword_1()); }
		'INT'
		{ after(grammarAccess.getVariableTypeAccess().getINTKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getVariableTypeAccess().getCHARKeyword_2()); }
		'CHAR'
		{ after(grammarAccess.getVariableTypeAccess().getCHARKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getVariableTypeAccess().getVARCHARKeyword_3()); }
		'VARCHAR'
		{ after(grammarAccess.getVariableTypeAccess().getVARCHARKeyword_3()); }
	)
	|
	(
		{ before(grammarAccess.getVariableTypeAccess().getDATETIMEKeyword_4()); }
		'DATETIME'
		{ after(grammarAccess.getVariableTypeAccess().getDATETIMEKeyword_4()); }
	)
	|
	(
		{ before(grammarAccess.getVariableTypeAccess().getTIMESTAMPKeyword_5()); }
		'TIMESTAMP'
		{ after(grammarAccess.getVariableTypeAccess().getTIMESTAMPKeyword_5()); }
	)
	|
	(
		{ before(grammarAccess.getVariableTypeAccess().getTEXTKeyword_6()); }
		'TEXT'
		{ after(grammarAccess.getVariableTypeAccess().getTEXTKeyword_6()); }
	)
	|
	(
		{ before(grammarAccess.getVariableTypeAccess().getNUMBERKeyword_7()); }
		'NUMBER'
		{ after(grammarAccess.getVariableTypeAccess().getNUMBERKeyword_7()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType__Group__0__Impl
	rule__DataType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataTypeAccess().getDATABASENameKeyword_0()); }
	'DATABASE name'
	{ after(grammarAccess.getDataTypeAccess().getDATABASENameKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); }
	(rule__DataType__NameAssignment_1)
	{ after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__0__Impl
	rule__Entity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
	'entity'
	{ after(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__1__Impl
	rule__Entity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getNameAssignment_1()); }
	(rule__Entity__NameAssignment_1)
	{ after(grammarAccess.getEntityAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__2__Impl
	rule__Entity__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getGroup_2()); }
	(rule__Entity__Group_2__0)?
	{ after(grammarAccess.getEntityAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__3__Impl
	rule__Entity__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__4__Impl
	rule__Entity__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); }
	(rule__Entity__FeaturesAssignment_4)*
	{ after(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_2__0__Impl
	rule__Entity__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); }
	'extends'
	{ after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); }
	(rule__Entity__SuperTypeAssignment_2_1)
	{ after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__0__Impl
	rule__Feature__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getManyAssignment_0()); }
	(rule__Feature__ManyAssignment_0)?
	{ after(grammarAccess.getFeatureAccess().getManyAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__1__Impl
	rule__Feature__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getNameAssignment_1()); }
	(rule__Feature__NameAssignment_1)
	{ after(grammarAccess.getFeatureAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__2__Impl
	rule__Feature__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getFeatureAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__3__Impl
	rule__Feature__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); }
	(rule__Feature__TypeAssignment_3)
	{ after(grammarAccess.getFeatureAccess().getTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getSAssignment_4()); }
	(rule__Feature__SAssignment_4)
	{ after(grammarAccess.getFeatureAccess().getSAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VariableSize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableSize__Group__0__Impl
	rule__VariableSize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableSize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableSizeAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getVariableSizeAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableSize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableSize__Group__1__Impl
	rule__VariableSize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableSize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableSizeAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
	{ after(grammarAccess.getVariableSizeAccess().getINTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableSize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableSize__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableSize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableSizeAccess().getRightParenthesisKeyword_2()); }
	')'
	{ after(grammarAccess.getVariableSizeAccess().getRightParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Domainmodel__ElementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0()); }
		ruleType
		{ after(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__SdAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getSdDataTypeParserRuleCall_0_0()); }
		ruleDataType
		{ after(grammarAccess.getTypeAccess().getSdDataTypeParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__SuperTypeAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__FeaturesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); }
		ruleFeature
		{ after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__ManyAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); }
		(
			{ before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); }
			'many'
			{ after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); }
		)
		{ after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__TypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getTypeVariableTypeParserRuleCall_3_0()); }
		rulevariableType
		{ after(grammarAccess.getFeatureAccess().getTypeVariableTypeParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__SAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getSVariableSizeParserRuleCall_4_0()); }
		rulevariableSize
		{ after(grammarAccess.getFeatureAccess().getSVariableSizeParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
