package jp.ac.jaist.kslab.sb.marte.dsl.circuit.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import jp.ac.jaist.kslab.sb.marte.dsl.circuit.services.CircuitDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCircuitDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'net {'", "','", "'}'", "'component'", "'{'", "':'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalCircuitDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCircuitDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCircuitDslParser.tokenNames; }
    public String getGrammarFileName() { return "../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g"; }



     	private CircuitDslGrammarAccess grammarAccess;
     	
        public InternalCircuitDslParser(TokenStream input, CircuitDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "HwCircuitDiagram";	
       	}
       	
       	@Override
       	protected CircuitDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleHwCircuitDiagram"
    // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:67:1: entryRuleHwCircuitDiagram returns [EObject current=null] : iv_ruleHwCircuitDiagram= ruleHwCircuitDiagram EOF ;
    public final EObject entryRuleHwCircuitDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHwCircuitDiagram = null;


        try {
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:68:2: (iv_ruleHwCircuitDiagram= ruleHwCircuitDiagram EOF )
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:69:2: iv_ruleHwCircuitDiagram= ruleHwCircuitDiagram EOF
            {
             newCompositeNode(grammarAccess.getHwCircuitDiagramRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHwCircuitDiagram_in_entryRuleHwCircuitDiagram75);
            iv_ruleHwCircuitDiagram=ruleHwCircuitDiagram();

            state._fsp--;

             current =iv_ruleHwCircuitDiagram; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHwCircuitDiagram85); 

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
    // $ANTLR end "entryRuleHwCircuitDiagram"


    // $ANTLR start "ruleHwCircuitDiagram"
    // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:76:1: ruleHwCircuitDiagram returns [EObject current=null] : ( () otherlv_1= 'net {' ( (lv_wires_2_0= ruleHwWire ) ) (otherlv_3= ',' ( (lv_wires_4_0= ruleHwWire ) ) )* otherlv_5= '}' ( (lv_components_6_0= ruleHwComponents ) )* ) ;
    public final EObject ruleHwCircuitDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_wires_2_0 = null;

        EObject lv_wires_4_0 = null;

        EObject lv_components_6_0 = null;


         enterRule(); 
            
        try {
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:79:28: ( ( () otherlv_1= 'net {' ( (lv_wires_2_0= ruleHwWire ) ) (otherlv_3= ',' ( (lv_wires_4_0= ruleHwWire ) ) )* otherlv_5= '}' ( (lv_components_6_0= ruleHwComponents ) )* ) )
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:80:1: ( () otherlv_1= 'net {' ( (lv_wires_2_0= ruleHwWire ) ) (otherlv_3= ',' ( (lv_wires_4_0= ruleHwWire ) ) )* otherlv_5= '}' ( (lv_components_6_0= ruleHwComponents ) )* )
            {
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:80:1: ( () otherlv_1= 'net {' ( (lv_wires_2_0= ruleHwWire ) ) (otherlv_3= ',' ( (lv_wires_4_0= ruleHwWire ) ) )* otherlv_5= '}' ( (lv_components_6_0= ruleHwComponents ) )* )
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:80:2: () otherlv_1= 'net {' ( (lv_wires_2_0= ruleHwWire ) ) (otherlv_3= ',' ( (lv_wires_4_0= ruleHwWire ) ) )* otherlv_5= '}' ( (lv_components_6_0= ruleHwComponents ) )*
            {
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:80:2: ()
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHwCircuitDiagramAccess().getHwCircuitDiagramAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleHwCircuitDiagram131); 

                	newLeafNode(otherlv_1, grammarAccess.getHwCircuitDiagramAccess().getNetKeyword_1());
                
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:90:1: ( (lv_wires_2_0= ruleHwWire ) )
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:91:1: (lv_wires_2_0= ruleHwWire )
            {
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:91:1: (lv_wires_2_0= ruleHwWire )
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:92:3: lv_wires_2_0= ruleHwWire
            {
             
            	        newCompositeNode(grammarAccess.getHwCircuitDiagramAccess().getWiresHwWireParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleHwWire_in_ruleHwCircuitDiagram152);
            lv_wires_2_0=ruleHwWire();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHwCircuitDiagramRule());
            	        }
                   		add(
                   			current, 
                   			"wires",
                    		lv_wires_2_0, 
                    		"HwWire");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:108:2: (otherlv_3= ',' ( (lv_wires_4_0= ruleHwWire ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:108:4: otherlv_3= ',' ( (lv_wires_4_0= ruleHwWire ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHwCircuitDiagram165); 

            	        	newLeafNode(otherlv_3, grammarAccess.getHwCircuitDiagramAccess().getCommaKeyword_3_0());
            	        
            	    // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:112:1: ( (lv_wires_4_0= ruleHwWire ) )
            	    // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:113:1: (lv_wires_4_0= ruleHwWire )
            	    {
            	    // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:113:1: (lv_wires_4_0= ruleHwWire )
            	    // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:114:3: lv_wires_4_0= ruleHwWire
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHwCircuitDiagramAccess().getWiresHwWireParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleHwWire_in_ruleHwCircuitDiagram186);
            	    lv_wires_4_0=ruleHwWire();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHwCircuitDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wires",
            	            		lv_wires_4_0, 
            	            		"HwWire");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleHwCircuitDiagram200); 

                	newLeafNode(otherlv_5, grammarAccess.getHwCircuitDiagramAccess().getRightCurlyBracketKeyword_4());
                
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:134:1: ( (lv_components_6_0= ruleHwComponents ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:135:1: (lv_components_6_0= ruleHwComponents )
            	    {
            	    // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:135:1: (lv_components_6_0= ruleHwComponents )
            	    // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:136:3: lv_components_6_0= ruleHwComponents
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHwCircuitDiagramAccess().getComponentsHwComponentsParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleHwComponents_in_ruleHwCircuitDiagram221);
            	    lv_components_6_0=ruleHwComponents();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHwCircuitDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_6_0, 
            	            		"HwComponents");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleHwCircuitDiagram"


    // $ANTLR start "entryRuleHwComponents"
    // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:160:1: entryRuleHwComponents returns [EObject current=null] : iv_ruleHwComponents= ruleHwComponents EOF ;
    public final EObject entryRuleHwComponents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHwComponents = null;


        try {
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:161:2: (iv_ruleHwComponents= ruleHwComponents EOF )
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:162:2: iv_ruleHwComponents= ruleHwComponents EOF
            {
             newCompositeNode(grammarAccess.getHwComponentsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHwComponents_in_entryRuleHwComponents258);
            iv_ruleHwComponents=ruleHwComponents();

            state._fsp--;

             current =iv_ruleHwComponents; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHwComponents268); 

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
    // $ANTLR end "entryRuleHwComponents"


    // $ANTLR start "ruleHwComponents"
    // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:169:1: ruleHwComponents returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pins_3_0= ruleHwPackagePin ) ) (otherlv_4= ',' ( (lv_pins_5_0= ruleHwPackagePin ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleHwComponents() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_pins_3_0 = null;

        EObject lv_pins_5_0 = null;


         enterRule(); 
            
        try {
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:172:28: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pins_3_0= ruleHwPackagePin ) ) (otherlv_4= ',' ( (lv_pins_5_0= ruleHwPackagePin ) ) )* otherlv_6= '}' ) )
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:173:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pins_3_0= ruleHwPackagePin ) ) (otherlv_4= ',' ( (lv_pins_5_0= ruleHwPackagePin ) ) )* otherlv_6= '}' )
            {
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:173:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pins_3_0= ruleHwPackagePin ) ) (otherlv_4= ',' ( (lv_pins_5_0= ruleHwPackagePin ) ) )* otherlv_6= '}' )
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:173:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_pins_3_0= ruleHwPackagePin ) ) (otherlv_4= ',' ( (lv_pins_5_0= ruleHwPackagePin ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleHwComponents305); 

                	newLeafNode(otherlv_0, grammarAccess.getHwComponentsAccess().getComponentKeyword_0());
                
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:177:1: ( (lv_name_1_0= RULE_ID ) )
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:178:1: (lv_name_1_0= RULE_ID )
            {
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:178:1: (lv_name_1_0= RULE_ID )
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:179:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleHwComponents322); 

            			newLeafNode(lv_name_1_0, grammarAccess.getHwComponentsAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHwComponentsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleHwComponents339); 

                	newLeafNode(otherlv_2, grammarAccess.getHwComponentsAccess().getLeftCurlyBracketKeyword_2());
                
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:199:1: ( (lv_pins_3_0= ruleHwPackagePin ) )
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:200:1: (lv_pins_3_0= ruleHwPackagePin )
            {
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:200:1: (lv_pins_3_0= ruleHwPackagePin )
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:201:3: lv_pins_3_0= ruleHwPackagePin
            {
             
            	        newCompositeNode(grammarAccess.getHwComponentsAccess().getPinsHwPackagePinParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleHwPackagePin_in_ruleHwComponents360);
            lv_pins_3_0=ruleHwPackagePin();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHwComponentsRule());
            	        }
                   		add(
                   			current, 
                   			"pins",
                    		lv_pins_3_0, 
                    		"HwPackagePin");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:217:2: (otherlv_4= ',' ( (lv_pins_5_0= ruleHwPackagePin ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:217:4: otherlv_4= ',' ( (lv_pins_5_0= ruleHwPackagePin ) )
            	    {
            	    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHwComponents373); 

            	        	newLeafNode(otherlv_4, grammarAccess.getHwComponentsAccess().getCommaKeyword_4_0());
            	        
            	    // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:221:1: ( (lv_pins_5_0= ruleHwPackagePin ) )
            	    // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:222:1: (lv_pins_5_0= ruleHwPackagePin )
            	    {
            	    // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:222:1: (lv_pins_5_0= ruleHwPackagePin )
            	    // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:223:3: lv_pins_5_0= ruleHwPackagePin
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHwComponentsAccess().getPinsHwPackagePinParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleHwPackagePin_in_ruleHwComponents394);
            	    lv_pins_5_0=ruleHwPackagePin();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHwComponentsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pins",
            	            		lv_pins_5_0, 
            	            		"HwPackagePin");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleHwComponents408); 

                	newLeafNode(otherlv_6, grammarAccess.getHwComponentsAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleHwComponents"


    // $ANTLR start "entryRuleHwPackagePin"
    // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:251:1: entryRuleHwPackagePin returns [EObject current=null] : iv_ruleHwPackagePin= ruleHwPackagePin EOF ;
    public final EObject entryRuleHwPackagePin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHwPackagePin = null;


        try {
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:252:2: (iv_ruleHwPackagePin= ruleHwPackagePin EOF )
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:253:2: iv_ruleHwPackagePin= ruleHwPackagePin EOF
            {
             newCompositeNode(grammarAccess.getHwPackagePinRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHwPackagePin_in_entryRuleHwPackagePin444);
            iv_ruleHwPackagePin=ruleHwPackagePin();

            state._fsp--;

             current =iv_ruleHwPackagePin; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHwPackagePin454); 

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
    // $ANTLR end "entryRuleHwPackagePin"


    // $ANTLR start "ruleHwPackagePin"
    // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:260:1: ruleHwPackagePin returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleHwPackagePin() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:263:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:264:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:264:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:264:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:264:2: ( (lv_name_0_0= RULE_ID ) )
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:265:1: (lv_name_0_0= RULE_ID )
            {
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:265:1: (lv_name_0_0= RULE_ID )
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:266:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleHwPackagePin496); 

            			newLeafNode(lv_name_0_0, grammarAccess.getHwPackagePinAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHwPackagePinRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleHwPackagePin513); 

                	newLeafNode(otherlv_1, grammarAccess.getHwPackagePinAccess().getColonKeyword_1());
                
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:286:1: ( (otherlv_2= RULE_ID ) )
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:287:1: (otherlv_2= RULE_ID )
            {
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:287:1: (otherlv_2= RULE_ID )
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:288:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getHwPackagePinRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleHwPackagePin533); 

            		newLeafNode(otherlv_2, grammarAccess.getHwPackagePinAccess().getWireHwWireCrossReference_2_0()); 
            	

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
    // $ANTLR end "ruleHwPackagePin"


    // $ANTLR start "entryRuleHwWire"
    // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:307:1: entryRuleHwWire returns [EObject current=null] : iv_ruleHwWire= ruleHwWire EOF ;
    public final EObject entryRuleHwWire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHwWire = null;


        try {
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:308:2: (iv_ruleHwWire= ruleHwWire EOF )
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:309:2: iv_ruleHwWire= ruleHwWire EOF
            {
             newCompositeNode(grammarAccess.getHwWireRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHwWire_in_entryRuleHwWire569);
            iv_ruleHwWire=ruleHwWire();

            state._fsp--;

             current =iv_ruleHwWire; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHwWire579); 

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
    // $ANTLR end "entryRuleHwWire"


    // $ANTLR start "ruleHwWire"
    // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:316:1: ruleHwWire returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleHwWire() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:319:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:320:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:320:1: ( (lv_name_0_0= RULE_ID ) )
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:321:1: (lv_name_0_0= RULE_ID )
            {
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:321:1: (lv_name_0_0= RULE_ID )
            // ../jp.ac.jaist.kslab.sb.marte.dsl.circuit/src-gen/jp/ac/jaist/kslab/sb/marte/dsl/circuit/parser/antlr/internal/InternalCircuitDsl.g:322:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleHwWire620); 

            			newLeafNode(lv_name_0_0, grammarAccess.getHwWireAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHwWireRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleHwWire"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleHwCircuitDiagram_in_entryRuleHwCircuitDiagram75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHwCircuitDiagram85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleHwCircuitDiagram131 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleHwWire_in_ruleHwCircuitDiagram152 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_12_in_ruleHwCircuitDiagram165 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleHwWire_in_ruleHwCircuitDiagram186 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_13_in_ruleHwCircuitDiagram200 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleHwComponents_in_ruleHwCircuitDiagram221 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleHwComponents_in_entryRuleHwComponents258 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHwComponents268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleHwComponents305 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleHwComponents322 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleHwComponents339 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleHwPackagePin_in_ruleHwComponents360 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_12_in_ruleHwComponents373 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleHwPackagePin_in_ruleHwComponents394 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_13_in_ruleHwComponents408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHwPackagePin_in_entryRuleHwPackagePin444 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHwPackagePin454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleHwPackagePin496 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleHwPackagePin513 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleHwPackagePin533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHwWire_in_entryRuleHwWire569 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHwWire579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleHwWire620 = new BitSet(new long[]{0x0000000000000002L});
    }


}