package org.example.domainmodel.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.domainmodel.services.DomainmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainmodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DATABASE name'", "'entity'", "'extends'", "'{'", "'}'", "'many'", "':'", "'DATE'", "'INT'", "'CHAR'", "'VARCHAR'", "'DATETIME'", "'TIMESTAMP'", "'TEXT'", "'NUMBER'", "'('", "')'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=5;
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

        public InternalDomainmodelParser(TokenStream input, DomainmodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";
       	}

       	@Override
       	protected DomainmodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainmodel"
    // InternalDomainmodel.g:64:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalDomainmodel.g:64:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalDomainmodel.g:65:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalDomainmodel.g:71:1: ruleDomainmodel returns [EObject current=null] : ( (lv_elements_0_0= ruleType ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:77:2: ( ( (lv_elements_0_0= ruleType ) )* )
            // InternalDomainmodel.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            {
            // InternalDomainmodel.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomainmodel.g:79:3: (lv_elements_0_0= ruleType )
            	    {
            	    // InternalDomainmodel.g:79:3: (lv_elements_0_0= ruleType )
            	    // InternalDomainmodel.g:80:4: lv_elements_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.example.domainmodel.Domainmodel.Type");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleType"
    // InternalDomainmodel.g:100:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalDomainmodel.g:100:45: (iv_ruleType= ruleType EOF )
            // InternalDomainmodel.g:101:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDomainmodel.g:107:1: ruleType returns [EObject current=null] : ( ( (lv_sd_0_0= ruleDataType ) ) | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject lv_sd_0_0 = null;

        EObject this_Entity_1 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:113:2: ( ( ( (lv_sd_0_0= ruleDataType ) ) | this_Entity_1= ruleEntity ) )
            // InternalDomainmodel.g:114:2: ( ( (lv_sd_0_0= ruleDataType ) ) | this_Entity_1= ruleEntity )
            {
            // InternalDomainmodel.g:114:2: ( ( (lv_sd_0_0= ruleDataType ) ) | this_Entity_1= ruleEntity )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDomainmodel.g:115:3: ( (lv_sd_0_0= ruleDataType ) )
                    {
                    // InternalDomainmodel.g:115:3: ( (lv_sd_0_0= ruleDataType ) )
                    // InternalDomainmodel.g:116:4: (lv_sd_0_0= ruleDataType )
                    {
                    // InternalDomainmodel.g:116:4: (lv_sd_0_0= ruleDataType )
                    // InternalDomainmodel.g:117:5: lv_sd_0_0= ruleDataType
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getSdDataTypeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_sd_0_0=ruleDataType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"sd",
                    						lv_sd_0_0,
                    						"org.example.domainmodel.Domainmodel.DataType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:135:3: this_Entity_1= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_1=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // InternalDomainmodel.g:147:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalDomainmodel.g:147:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalDomainmodel.g:148:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalDomainmodel.g:154:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'DATABASE name' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:160:2: ( (otherlv_0= 'DATABASE name' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDomainmodel.g:161:2: (otherlv_0= 'DATABASE name' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDomainmodel.g:161:2: (otherlv_0= 'DATABASE name' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDomainmodel.g:162:3: otherlv_0= 'DATABASE name' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDATABASENameKeyword_0());
            		
            // InternalDomainmodel.g:166:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainmodel.g:167:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainmodel.g:167:4: (lv_name_1_0= RULE_ID )
            // InternalDomainmodel.g:168:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // InternalDomainmodel.g:188:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDomainmodel.g:188:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalDomainmodel.g:189:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDomainmodel.g:195:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_5_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:201:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) )
            // InternalDomainmodel.g:202:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            {
            // InternalDomainmodel.g:202:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            // InternalDomainmodel.g:203:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalDomainmodel.g:207:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainmodel.g:208:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainmodel.g:208:4: (lv_name_1_0= RULE_ID )
            // InternalDomainmodel.g:209:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomainmodel.g:225:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDomainmodel.g:226:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                    			
                    // InternalDomainmodel.g:230:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDomainmodel.g:231:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDomainmodel.g:231:5: (otherlv_3= RULE_ID )
                    // InternalDomainmodel.g:232:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDomainmodel.g:248:3: ( (lv_features_5_0= ruleFeature ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDomainmodel.g:249:4: (lv_features_5_0= ruleFeature )
            	    {
            	    // InternalDomainmodel.g:249:4: (lv_features_5_0= ruleFeature )
            	    // InternalDomainmodel.g:250:5: lv_features_5_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_features_5_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_5_0,
            	    						"org.example.domainmodel.Domainmodel.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // InternalDomainmodel.g:275:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalDomainmodel.g:275:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalDomainmodel.g:276:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalDomainmodel.g:282:1: ruleFeature returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= rulevariableType ) ) ( (lv_s_4_0= rulevariableSize ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_s_4_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:288:2: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= rulevariableType ) ) ( (lv_s_4_0= rulevariableSize ) ) ) )
            // InternalDomainmodel.g:289:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= rulevariableType ) ) ( (lv_s_4_0= rulevariableSize ) ) )
            {
            // InternalDomainmodel.g:289:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= rulevariableType ) ) ( (lv_s_4_0= rulevariableSize ) ) )
            // InternalDomainmodel.g:290:3: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= rulevariableType ) ) ( (lv_s_4_0= rulevariableSize ) )
            {
            // InternalDomainmodel.g:290:3: ( (lv_many_0_0= 'many' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDomainmodel.g:291:4: (lv_many_0_0= 'many' )
                    {
                    // InternalDomainmodel.g:291:4: (lv_many_0_0= 'many' )
                    // InternalDomainmodel.g:292:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,16,FOLLOW_4); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getFeatureAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            // InternalDomainmodel.g:304:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainmodel.g:305:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainmodel.g:305:4: (lv_name_1_0= RULE_ID )
            // InternalDomainmodel.g:306:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getColonKeyword_2());
            		
            // InternalDomainmodel.g:326:3: ( (lv_type_3_0= rulevariableType ) )
            // InternalDomainmodel.g:327:4: (lv_type_3_0= rulevariableType )
            {
            // InternalDomainmodel.g:327:4: (lv_type_3_0= rulevariableType )
            // InternalDomainmodel.g:328:5: lv_type_3_0= rulevariableType
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getTypeVariableTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_type_3_0=rulevariableType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.example.domainmodel.Domainmodel.variableType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomainmodel.g:345:3: ( (lv_s_4_0= rulevariableSize ) )
            // InternalDomainmodel.g:346:4: (lv_s_4_0= rulevariableSize )
            {
            // InternalDomainmodel.g:346:4: (lv_s_4_0= rulevariableSize )
            // InternalDomainmodel.g:347:5: lv_s_4_0= rulevariableSize
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getSVariableSizeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_s_4_0=rulevariableSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"s",
            						lv_s_4_0,
            						"org.example.domainmodel.Domainmodel.variableSize");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRulevariableType"
    // InternalDomainmodel.g:368:1: entryRulevariableType returns [String current=null] : iv_rulevariableType= rulevariableType EOF ;
    public final String entryRulevariableType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariableType = null;


        try {
            // InternalDomainmodel.g:368:52: (iv_rulevariableType= rulevariableType EOF )
            // InternalDomainmodel.g:369:2: iv_rulevariableType= rulevariableType EOF
            {
             newCompositeNode(grammarAccess.getVariableTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariableType=rulevariableType();

            state._fsp--;

             current =iv_rulevariableType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariableType"


    // $ANTLR start "rulevariableType"
    // InternalDomainmodel.g:375:1: rulevariableType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'DATE' | kw= 'INT' | kw= 'CHAR' | kw= 'VARCHAR' | kw= 'DATETIME' | kw= 'TIMESTAMP' | kw= 'TEXT' | kw= 'NUMBER' ) ;
    public final AntlrDatatypeRuleToken rulevariableType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:381:2: ( (kw= 'DATE' | kw= 'INT' | kw= 'CHAR' | kw= 'VARCHAR' | kw= 'DATETIME' | kw= 'TIMESTAMP' | kw= 'TEXT' | kw= 'NUMBER' ) )
            // InternalDomainmodel.g:382:2: (kw= 'DATE' | kw= 'INT' | kw= 'CHAR' | kw= 'VARCHAR' | kw= 'DATETIME' | kw= 'TIMESTAMP' | kw= 'TEXT' | kw= 'NUMBER' )
            {
            // InternalDomainmodel.g:382:2: (kw= 'DATE' | kw= 'INT' | kw= 'CHAR' | kw= 'VARCHAR' | kw= 'DATETIME' | kw= 'TIMESTAMP' | kw= 'TEXT' | kw= 'NUMBER' )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 21:
                {
                alt6=4;
                }
                break;
            case 22:
                {
                alt6=5;
                }
                break;
            case 23:
                {
                alt6=6;
                }
                break;
            case 24:
                {
                alt6=7;
                }
                break;
            case 25:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDomainmodel.g:383:3: kw= 'DATE'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableTypeAccess().getDATEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:389:3: kw= 'INT'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableTypeAccess().getINTKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:395:3: kw= 'CHAR'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableTypeAccess().getCHARKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:401:3: kw= 'VARCHAR'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableTypeAccess().getVARCHARKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalDomainmodel.g:407:3: kw= 'DATETIME'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableTypeAccess().getDATETIMEKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalDomainmodel.g:413:3: kw= 'TIMESTAMP'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableTypeAccess().getTIMESTAMPKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalDomainmodel.g:419:3: kw= 'TEXT'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableTypeAccess().getTEXTKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalDomainmodel.g:425:3: kw= 'NUMBER'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableTypeAccess().getNUMBERKeyword_7());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariableType"


    // $ANTLR start "entryRulevariableSize"
    // InternalDomainmodel.g:434:1: entryRulevariableSize returns [String current=null] : iv_rulevariableSize= rulevariableSize EOF ;
    public final String entryRulevariableSize() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevariableSize = null;


        try {
            // InternalDomainmodel.g:434:52: (iv_rulevariableSize= rulevariableSize EOF )
            // InternalDomainmodel.g:435:2: iv_rulevariableSize= rulevariableSize EOF
            {
             newCompositeNode(grammarAccess.getVariableSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariableSize=rulevariableSize();

            state._fsp--;

             current =iv_rulevariableSize.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariableSize"


    // $ANTLR start "rulevariableSize"
    // InternalDomainmodel.g:441:1: rulevariableSize returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' this_INT_1= RULE_INT kw= ')' )? ;
    public final AntlrDatatypeRuleToken rulevariableSize() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:447:2: ( (kw= '(' this_INT_1= RULE_INT kw= ')' )? )
            // InternalDomainmodel.g:448:2: (kw= '(' this_INT_1= RULE_INT kw= ')' )?
            {
            // InternalDomainmodel.g:448:2: (kw= '(' this_INT_1= RULE_INT kw= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomainmodel.g:449:3: kw= '(' this_INT_1= RULE_INT kw= ')'
                    {
                    kw=(Token)match(input,26,FOLLOW_11); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableSizeAccess().getLeftParenthesisKeyword_0());
                    		
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_12); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getVariableSizeAccess().getINTTerminalRuleCall_1());
                    		
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableSizeAccess().getRightParenthesisKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariableSize"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003FC0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});

}