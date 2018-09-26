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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainmodelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DATE'", "'INT'", "'CHAR'", "'VARCHAR'", "'DATETIME'", "'TIMESTAMP'", "'TEXT'", "'NUMBER'", "'DATABASE name'", "'entity'", "'{'", "'}'", "'extends'", "':'", "'('", "')'", "'many'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDomainmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainmodelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDomainmodel.g"; }


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



    // $ANTLR start "entryRuleDomainmodel"
    // InternalDomainmodel.g:53:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // InternalDomainmodel.g:54:1: ( ruleDomainmodel EOF )
            // InternalDomainmodel.g:55:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalDomainmodel.g:62:1: ruleDomainmodel : ( ( rule__Domainmodel__ElementsAssignment )* ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:66:2: ( ( ( rule__Domainmodel__ElementsAssignment )* ) )
            // InternalDomainmodel.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            {
            // InternalDomainmodel.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            // InternalDomainmodel.g:68:3: ( rule__Domainmodel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 
            // InternalDomainmodel.g:69:3: ( rule__Domainmodel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=19 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomainmodel.g:69:4: rule__Domainmodel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Domainmodel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleType"
    // InternalDomainmodel.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalDomainmodel.g:79:1: ( ruleType EOF )
            // InternalDomainmodel.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDomainmodel.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalDomainmodel.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalDomainmodel.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalDomainmodel.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalDomainmodel.g:94:3: ( rule__Type__Alternatives )
            // InternalDomainmodel.g:94:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // InternalDomainmodel.g:103:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalDomainmodel.g:104:1: ( ruleDataType EOF )
            // InternalDomainmodel.g:105:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalDomainmodel.g:112:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:116:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalDomainmodel.g:117:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalDomainmodel.g:117:2: ( ( rule__DataType__Group__0 ) )
            // InternalDomainmodel.g:118:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalDomainmodel.g:119:3: ( rule__DataType__Group__0 )
            // InternalDomainmodel.g:119:4: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // InternalDomainmodel.g:128:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalDomainmodel.g:129:1: ( ruleEntity EOF )
            // InternalDomainmodel.g:130:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDomainmodel.g:137:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:141:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalDomainmodel.g:142:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalDomainmodel.g:142:2: ( ( rule__Entity__Group__0 ) )
            // InternalDomainmodel.g:143:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalDomainmodel.g:144:3: ( rule__Entity__Group__0 )
            // InternalDomainmodel.g:144:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // InternalDomainmodel.g:153:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalDomainmodel.g:154:1: ( ruleFeature EOF )
            // InternalDomainmodel.g:155:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalDomainmodel.g:162:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:166:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalDomainmodel.g:167:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalDomainmodel.g:167:2: ( ( rule__Feature__Group__0 ) )
            // InternalDomainmodel.g:168:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalDomainmodel.g:169:3: ( rule__Feature__Group__0 )
            // InternalDomainmodel.g:169:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRulevariableType"
    // InternalDomainmodel.g:178:1: entryRulevariableType : rulevariableType EOF ;
    public final void entryRulevariableType() throws RecognitionException {
        try {
            // InternalDomainmodel.g:179:1: ( rulevariableType EOF )
            // InternalDomainmodel.g:180:1: rulevariableType EOF
            {
             before(grammarAccess.getVariableTypeRule()); 
            pushFollow(FOLLOW_1);
            rulevariableType();

            state._fsp--;

             after(grammarAccess.getVariableTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevariableType"


    // $ANTLR start "rulevariableType"
    // InternalDomainmodel.g:187:1: rulevariableType : ( ( rule__VariableType__Alternatives ) ) ;
    public final void rulevariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:191:2: ( ( ( rule__VariableType__Alternatives ) ) )
            // InternalDomainmodel.g:192:2: ( ( rule__VariableType__Alternatives ) )
            {
            // InternalDomainmodel.g:192:2: ( ( rule__VariableType__Alternatives ) )
            // InternalDomainmodel.g:193:3: ( rule__VariableType__Alternatives )
            {
             before(grammarAccess.getVariableTypeAccess().getAlternatives()); 
            // InternalDomainmodel.g:194:3: ( rule__VariableType__Alternatives )
            // InternalDomainmodel.g:194:4: rule__VariableType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VariableType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevariableType"


    // $ANTLR start "entryRulevariableSize"
    // InternalDomainmodel.g:203:1: entryRulevariableSize : rulevariableSize EOF ;
    public final void entryRulevariableSize() throws RecognitionException {
        try {
            // InternalDomainmodel.g:204:1: ( rulevariableSize EOF )
            // InternalDomainmodel.g:205:1: rulevariableSize EOF
            {
             before(grammarAccess.getVariableSizeRule()); 
            pushFollow(FOLLOW_1);
            rulevariableSize();

            state._fsp--;

             after(grammarAccess.getVariableSizeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevariableSize"


    // $ANTLR start "rulevariableSize"
    // InternalDomainmodel.g:212:1: rulevariableSize : ( ( rule__VariableSize__Group__0 )? ) ;
    public final void rulevariableSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:216:2: ( ( ( rule__VariableSize__Group__0 )? ) )
            // InternalDomainmodel.g:217:2: ( ( rule__VariableSize__Group__0 )? )
            {
            // InternalDomainmodel.g:217:2: ( ( rule__VariableSize__Group__0 )? )
            // InternalDomainmodel.g:218:3: ( rule__VariableSize__Group__0 )?
            {
             before(grammarAccess.getVariableSizeAccess().getGroup()); 
            // InternalDomainmodel.g:219:3: ( rule__VariableSize__Group__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==25) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDomainmodel.g:219:4: rule__VariableSize__Group__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableSize__Group__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableSizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevariableSize"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalDomainmodel.g:227:1: rule__Type__Alternatives : ( ( ( rule__Type__SdAssignment_0 ) ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:231:1: ( ( ( rule__Type__SdAssignment_0 ) ) | ( ruleEntity ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDomainmodel.g:232:2: ( ( rule__Type__SdAssignment_0 ) )
                    {
                    // InternalDomainmodel.g:232:2: ( ( rule__Type__SdAssignment_0 ) )
                    // InternalDomainmodel.g:233:3: ( rule__Type__SdAssignment_0 )
                    {
                     before(grammarAccess.getTypeAccess().getSdAssignment_0()); 
                    // InternalDomainmodel.g:234:3: ( rule__Type__SdAssignment_0 )
                    // InternalDomainmodel.g:234:4: rule__Type__SdAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__SdAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getSdAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:238:2: ( ruleEntity )
                    {
                    // InternalDomainmodel.g:238:2: ( ruleEntity )
                    // InternalDomainmodel.g:239:3: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__VariableType__Alternatives"
    // InternalDomainmodel.g:248:1: rule__VariableType__Alternatives : ( ( 'DATE' ) | ( 'INT' ) | ( 'CHAR' ) | ( 'VARCHAR' ) | ( 'DATETIME' ) | ( 'TIMESTAMP' ) | ( 'TEXT' ) | ( 'NUMBER' ) );
    public final void rule__VariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:252:1: ( ( 'DATE' ) | ( 'INT' ) | ( 'CHAR' ) | ( 'VARCHAR' ) | ( 'DATETIME' ) | ( 'TIMESTAMP' ) | ( 'TEXT' ) | ( 'NUMBER' ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case 16:
                {
                alt4=6;
                }
                break;
            case 17:
                {
                alt4=7;
                }
                break;
            case 18:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDomainmodel.g:253:2: ( 'DATE' )
                    {
                    // InternalDomainmodel.g:253:2: ( 'DATE' )
                    // InternalDomainmodel.g:254:3: 'DATE'
                    {
                     before(grammarAccess.getVariableTypeAccess().getDATEKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getVariableTypeAccess().getDATEKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:259:2: ( 'INT' )
                    {
                    // InternalDomainmodel.g:259:2: ( 'INT' )
                    // InternalDomainmodel.g:260:3: 'INT'
                    {
                     before(grammarAccess.getVariableTypeAccess().getINTKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getVariableTypeAccess().getINTKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:265:2: ( 'CHAR' )
                    {
                    // InternalDomainmodel.g:265:2: ( 'CHAR' )
                    // InternalDomainmodel.g:266:3: 'CHAR'
                    {
                     before(grammarAccess.getVariableTypeAccess().getCHARKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getVariableTypeAccess().getCHARKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:271:2: ( 'VARCHAR' )
                    {
                    // InternalDomainmodel.g:271:2: ( 'VARCHAR' )
                    // InternalDomainmodel.g:272:3: 'VARCHAR'
                    {
                     before(grammarAccess.getVariableTypeAccess().getVARCHARKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getVariableTypeAccess().getVARCHARKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDomainmodel.g:277:2: ( 'DATETIME' )
                    {
                    // InternalDomainmodel.g:277:2: ( 'DATETIME' )
                    // InternalDomainmodel.g:278:3: 'DATETIME'
                    {
                     before(grammarAccess.getVariableTypeAccess().getDATETIMEKeyword_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getVariableTypeAccess().getDATETIMEKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDomainmodel.g:283:2: ( 'TIMESTAMP' )
                    {
                    // InternalDomainmodel.g:283:2: ( 'TIMESTAMP' )
                    // InternalDomainmodel.g:284:3: 'TIMESTAMP'
                    {
                     before(grammarAccess.getVariableTypeAccess().getTIMESTAMPKeyword_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getVariableTypeAccess().getTIMESTAMPKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDomainmodel.g:289:2: ( 'TEXT' )
                    {
                    // InternalDomainmodel.g:289:2: ( 'TEXT' )
                    // InternalDomainmodel.g:290:3: 'TEXT'
                    {
                     before(grammarAccess.getVariableTypeAccess().getTEXTKeyword_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getVariableTypeAccess().getTEXTKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDomainmodel.g:295:2: ( 'NUMBER' )
                    {
                    // InternalDomainmodel.g:295:2: ( 'NUMBER' )
                    // InternalDomainmodel.g:296:3: 'NUMBER'
                    {
                     before(grammarAccess.getVariableTypeAccess().getNUMBERKeyword_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getVariableTypeAccess().getNUMBERKeyword_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableType__Alternatives"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalDomainmodel.g:305:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:309:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalDomainmodel.g:310:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // InternalDomainmodel.g:317:1: rule__DataType__Group__0__Impl : ( 'DATABASE name' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:321:1: ( ( 'DATABASE name' ) )
            // InternalDomainmodel.g:322:1: ( 'DATABASE name' )
            {
            // InternalDomainmodel.g:322:1: ( 'DATABASE name' )
            // InternalDomainmodel.g:323:2: 'DATABASE name'
            {
             before(grammarAccess.getDataTypeAccess().getDATABASENameKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getDATABASENameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // InternalDomainmodel.g:332:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:336:1: ( rule__DataType__Group__1__Impl )
            // InternalDomainmodel.g:337:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // InternalDomainmodel.g:343:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:347:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:348:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:348:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalDomainmodel.g:349:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:350:2: ( rule__DataType__NameAssignment_1 )
            // InternalDomainmodel.g:350:3: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalDomainmodel.g:359:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:363:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalDomainmodel.g:364:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalDomainmodel.g:371:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:375:1: ( ( 'entity' ) )
            // InternalDomainmodel.g:376:1: ( 'entity' )
            {
            // InternalDomainmodel.g:376:1: ( 'entity' )
            // InternalDomainmodel.g:377:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalDomainmodel.g:386:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:390:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalDomainmodel.g:391:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalDomainmodel.g:398:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:402:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:403:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:403:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalDomainmodel.g:404:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:405:2: ( rule__Entity__NameAssignment_1 )
            // InternalDomainmodel.g:405:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalDomainmodel.g:413:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:417:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalDomainmodel.g:418:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalDomainmodel.g:425:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:429:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalDomainmodel.g:430:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalDomainmodel.g:430:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalDomainmodel.g:431:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalDomainmodel.g:432:2: ( rule__Entity__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDomainmodel.g:432:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalDomainmodel.g:440:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:444:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalDomainmodel.g:445:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalDomainmodel.g:452:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:456:1: ( ( '{' ) )
            // InternalDomainmodel.g:457:1: ( '{' )
            {
            // InternalDomainmodel.g:457:1: ( '{' )
            // InternalDomainmodel.g:458:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalDomainmodel.g:467:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:471:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalDomainmodel.g:472:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalDomainmodel.g:479:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__FeaturesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:483:1: ( ( ( rule__Entity__FeaturesAssignment_4 )* ) )
            // InternalDomainmodel.g:484:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            {
            // InternalDomainmodel.g:484:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            // InternalDomainmodel.g:485:2: ( rule__Entity__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 
            // InternalDomainmodel.g:486:2: ( rule__Entity__FeaturesAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDomainmodel.g:486:3: rule__Entity__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Entity__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalDomainmodel.g:494:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:498:1: ( rule__Entity__Group__5__Impl )
            // InternalDomainmodel.g:499:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalDomainmodel.g:505:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:509:1: ( ( '}' ) )
            // InternalDomainmodel.g:510:1: ( '}' )
            {
            // InternalDomainmodel.g:510:1: ( '}' )
            // InternalDomainmodel.g:511:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalDomainmodel.g:521:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:525:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalDomainmodel.g:526:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalDomainmodel.g:533:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:537:1: ( ( 'extends' ) )
            // InternalDomainmodel.g:538:1: ( 'extends' )
            {
            // InternalDomainmodel.g:538:1: ( 'extends' )
            // InternalDomainmodel.g:539:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalDomainmodel.g:548:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:552:1: ( rule__Entity__Group_2__1__Impl )
            // InternalDomainmodel.g:553:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalDomainmodel.g:559:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:563:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // InternalDomainmodel.g:564:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // InternalDomainmodel.g:564:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // InternalDomainmodel.g:565:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // InternalDomainmodel.g:566:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            // InternalDomainmodel.g:566:3: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalDomainmodel.g:575:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:579:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalDomainmodel.g:580:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalDomainmodel.g:587:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__ManyAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:591:1: ( ( ( rule__Feature__ManyAssignment_0 )? ) )
            // InternalDomainmodel.g:592:1: ( ( rule__Feature__ManyAssignment_0 )? )
            {
            // InternalDomainmodel.g:592:1: ( ( rule__Feature__ManyAssignment_0 )? )
            // InternalDomainmodel.g:593:2: ( rule__Feature__ManyAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getManyAssignment_0()); 
            // InternalDomainmodel.g:594:2: ( rule__Feature__ManyAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomainmodel.g:594:3: rule__Feature__ManyAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__ManyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getManyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalDomainmodel.g:602:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:606:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalDomainmodel.g:607:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalDomainmodel.g:614:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:618:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:619:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:619:1: ( ( rule__Feature__NameAssignment_1 ) )
            // InternalDomainmodel.g:620:2: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:621:2: ( rule__Feature__NameAssignment_1 )
            // InternalDomainmodel.g:621:3: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // InternalDomainmodel.g:629:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:633:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalDomainmodel.g:634:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // InternalDomainmodel.g:641:1: rule__Feature__Group__2__Impl : ( ':' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:645:1: ( ( ':' ) )
            // InternalDomainmodel.g:646:1: ( ':' )
            {
            // InternalDomainmodel.g:646:1: ( ':' )
            // InternalDomainmodel.g:647:2: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // InternalDomainmodel.g:656:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:660:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalDomainmodel.g:661:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Feature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // InternalDomainmodel.g:668:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__TypeAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:672:1: ( ( ( rule__Feature__TypeAssignment_3 ) ) )
            // InternalDomainmodel.g:673:1: ( ( rule__Feature__TypeAssignment_3 ) )
            {
            // InternalDomainmodel.g:673:1: ( ( rule__Feature__TypeAssignment_3 ) )
            // InternalDomainmodel.g:674:2: ( rule__Feature__TypeAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 
            // InternalDomainmodel.g:675:2: ( rule__Feature__TypeAssignment_3 )
            // InternalDomainmodel.g:675:3: rule__Feature__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Feature__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group__4"
    // InternalDomainmodel.g:683:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:687:1: ( rule__Feature__Group__4__Impl )
            // InternalDomainmodel.g:688:2: rule__Feature__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4"


    // $ANTLR start "rule__Feature__Group__4__Impl"
    // InternalDomainmodel.g:694:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__SAssignment_4 ) ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:698:1: ( ( ( rule__Feature__SAssignment_4 ) ) )
            // InternalDomainmodel.g:699:1: ( ( rule__Feature__SAssignment_4 ) )
            {
            // InternalDomainmodel.g:699:1: ( ( rule__Feature__SAssignment_4 ) )
            // InternalDomainmodel.g:700:2: ( rule__Feature__SAssignment_4 )
            {
             before(grammarAccess.getFeatureAccess().getSAssignment_4()); 
            // InternalDomainmodel.g:701:2: ( rule__Feature__SAssignment_4 )
            // InternalDomainmodel.g:701:3: rule__Feature__SAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Feature__SAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getSAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4__Impl"


    // $ANTLR start "rule__VariableSize__Group__0"
    // InternalDomainmodel.g:710:1: rule__VariableSize__Group__0 : rule__VariableSize__Group__0__Impl rule__VariableSize__Group__1 ;
    public final void rule__VariableSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:714:1: ( rule__VariableSize__Group__0__Impl rule__VariableSize__Group__1 )
            // InternalDomainmodel.g:715:2: rule__VariableSize__Group__0__Impl rule__VariableSize__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__VariableSize__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableSize__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableSize__Group__0"


    // $ANTLR start "rule__VariableSize__Group__0__Impl"
    // InternalDomainmodel.g:722:1: rule__VariableSize__Group__0__Impl : ( '(' ) ;
    public final void rule__VariableSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:726:1: ( ( '(' ) )
            // InternalDomainmodel.g:727:1: ( '(' )
            {
            // InternalDomainmodel.g:727:1: ( '(' )
            // InternalDomainmodel.g:728:2: '('
            {
             before(grammarAccess.getVariableSizeAccess().getLeftParenthesisKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVariableSizeAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableSize__Group__0__Impl"


    // $ANTLR start "rule__VariableSize__Group__1"
    // InternalDomainmodel.g:737:1: rule__VariableSize__Group__1 : rule__VariableSize__Group__1__Impl rule__VariableSize__Group__2 ;
    public final void rule__VariableSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:741:1: ( rule__VariableSize__Group__1__Impl rule__VariableSize__Group__2 )
            // InternalDomainmodel.g:742:2: rule__VariableSize__Group__1__Impl rule__VariableSize__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__VariableSize__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableSize__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableSize__Group__1"


    // $ANTLR start "rule__VariableSize__Group__1__Impl"
    // InternalDomainmodel.g:749:1: rule__VariableSize__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__VariableSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:753:1: ( ( RULE_INT ) )
            // InternalDomainmodel.g:754:1: ( RULE_INT )
            {
            // InternalDomainmodel.g:754:1: ( RULE_INT )
            // InternalDomainmodel.g:755:2: RULE_INT
            {
             before(grammarAccess.getVariableSizeAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVariableSizeAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableSize__Group__1__Impl"


    // $ANTLR start "rule__VariableSize__Group__2"
    // InternalDomainmodel.g:764:1: rule__VariableSize__Group__2 : rule__VariableSize__Group__2__Impl ;
    public final void rule__VariableSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:768:1: ( rule__VariableSize__Group__2__Impl )
            // InternalDomainmodel.g:769:2: rule__VariableSize__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableSize__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableSize__Group__2"


    // $ANTLR start "rule__VariableSize__Group__2__Impl"
    // InternalDomainmodel.g:775:1: rule__VariableSize__Group__2__Impl : ( ')' ) ;
    public final void rule__VariableSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:779:1: ( ( ')' ) )
            // InternalDomainmodel.g:780:1: ( ')' )
            {
            // InternalDomainmodel.g:780:1: ( ')' )
            // InternalDomainmodel.g:781:2: ')'
            {
             before(grammarAccess.getVariableSizeAccess().getRightParenthesisKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVariableSizeAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableSize__Group__2__Impl"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment"
    // InternalDomainmodel.g:791:1: rule__Domainmodel__ElementsAssignment : ( ruleType ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:795:1: ( ( ruleType ) )
            // InternalDomainmodel.g:796:2: ( ruleType )
            {
            // InternalDomainmodel.g:796:2: ( ruleType )
            // InternalDomainmodel.g:797:3: ruleType
            {
             before(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__ElementsAssignment"


    // $ANTLR start "rule__Type__SdAssignment_0"
    // InternalDomainmodel.g:806:1: rule__Type__SdAssignment_0 : ( ruleDataType ) ;
    public final void rule__Type__SdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:810:1: ( ( ruleDataType ) )
            // InternalDomainmodel.g:811:2: ( ruleDataType )
            {
            // InternalDomainmodel.g:811:2: ( ruleDataType )
            // InternalDomainmodel.g:812:3: ruleDataType
            {
             before(grammarAccess.getTypeAccess().getSdDataTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getSdDataTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__SdAssignment_0"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalDomainmodel.g:821:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:825:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:826:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:826:2: ( RULE_ID )
            // InternalDomainmodel.g:827:3: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalDomainmodel.g:836:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:840:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:841:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:841:2: ( RULE_ID )
            // InternalDomainmodel.g:842:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_2_1"
    // InternalDomainmodel.g:851:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:855:1: ( ( ( RULE_ID ) ) )
            // InternalDomainmodel.g:856:2: ( ( RULE_ID ) )
            {
            // InternalDomainmodel.g:856:2: ( ( RULE_ID ) )
            // InternalDomainmodel.g:857:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // InternalDomainmodel.g:858:3: ( RULE_ID )
            // InternalDomainmodel.g:859:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Entity__FeaturesAssignment_4"
    // InternalDomainmodel.g:870:1: rule__Entity__FeaturesAssignment_4 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:874:1: ( ( ruleFeature ) )
            // InternalDomainmodel.g:875:2: ( ruleFeature )
            {
            // InternalDomainmodel.g:875:2: ( ruleFeature )
            // InternalDomainmodel.g:876:3: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FeaturesAssignment_4"


    // $ANTLR start "rule__Feature__ManyAssignment_0"
    // InternalDomainmodel.g:885:1: rule__Feature__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Feature__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:889:1: ( ( ( 'many' ) ) )
            // InternalDomainmodel.g:890:2: ( ( 'many' ) )
            {
            // InternalDomainmodel.g:890:2: ( ( 'many' ) )
            // InternalDomainmodel.g:891:3: ( 'many' )
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            // InternalDomainmodel.g:892:3: ( 'many' )
            // InternalDomainmodel.g:893:4: 'many'
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 

            }

             after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ManyAssignment_0"


    // $ANTLR start "rule__Feature__NameAssignment_1"
    // InternalDomainmodel.g:904:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:908:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:909:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:909:2: ( RULE_ID )
            // InternalDomainmodel.g:910:3: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_1"


    // $ANTLR start "rule__Feature__TypeAssignment_3"
    // InternalDomainmodel.g:919:1: rule__Feature__TypeAssignment_3 : ( rulevariableType ) ;
    public final void rule__Feature__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:923:1: ( ( rulevariableType ) )
            // InternalDomainmodel.g:924:2: ( rulevariableType )
            {
            // InternalDomainmodel.g:924:2: ( rulevariableType )
            // InternalDomainmodel.g:925:3: rulevariableType
            {
             before(grammarAccess.getFeatureAccess().getTypeVariableTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulevariableType();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTypeVariableTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__TypeAssignment_3"


    // $ANTLR start "rule__Feature__SAssignment_4"
    // InternalDomainmodel.g:934:1: rule__Feature__SAssignment_4 : ( rulevariableSize ) ;
    public final void rule__Feature__SAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:938:1: ( ( rulevariableSize ) )
            // InternalDomainmodel.g:939:2: ( rulevariableSize )
            {
            // InternalDomainmodel.g:939:2: ( rulevariableSize )
            // InternalDomainmodel.g:940:3: rulevariableSize
            {
             before(grammarAccess.getFeatureAccess().getSVariableSizeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulevariableSize();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getSVariableSizeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__SAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008400020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000007F800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});

}