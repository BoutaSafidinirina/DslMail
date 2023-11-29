package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MailGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMailParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AlefasoMailaka'", "'['", "'Hafatra'", "':'", "'Lohahevitra'", "'Anyaminy'", "','", "'Mpandefa'", "'Tenymiafina'", "']'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalMailParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMailParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMailParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMail.g"; }



     	private MailGrammarAccess grammarAccess;

        public InternalMailParser(TokenStream input, MailGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MailGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMail.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMail.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMail.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMail.g:71:1: ruleModel returns [EObject current=null] : this_AlefasoMailaka_0= ruleAlefasoMailaka ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_AlefasoMailaka_0 = null;



        	enterRule();

        try {
            // InternalMail.g:77:2: (this_AlefasoMailaka_0= ruleAlefasoMailaka )
            // InternalMail.g:78:2: this_AlefasoMailaka_0= ruleAlefasoMailaka
            {

            		newCompositeNode(grammarAccess.getModelAccess().getAlefasoMailakaParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_AlefasoMailaka_0=ruleAlefasoMailaka();

            state._fsp--;


            		current = this_AlefasoMailaka_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAlefasoMailaka"
    // InternalMail.g:89:1: entryRuleAlefasoMailaka returns [EObject current=null] : iv_ruleAlefasoMailaka= ruleAlefasoMailaka EOF ;
    public final EObject entryRuleAlefasoMailaka() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlefasoMailaka = null;


        try {
            // InternalMail.g:89:55: (iv_ruleAlefasoMailaka= ruleAlefasoMailaka EOF )
            // InternalMail.g:90:2: iv_ruleAlefasoMailaka= ruleAlefasoMailaka EOF
            {
             newCompositeNode(grammarAccess.getAlefasoMailakaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlefasoMailaka=ruleAlefasoMailaka();

            state._fsp--;

             current =iv_ruleAlefasoMailaka; 
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
    // $ANTLR end "entryRuleAlefasoMailaka"


    // $ANTLR start "ruleAlefasoMailaka"
    // InternalMail.g:96:1: ruleAlefasoMailaka returns [EObject current=null] : (otherlv_0= 'AlefasoMailaka' otherlv_1= '[' otherlv_2= 'Hafatra' otherlv_3= ':' ( (lv_message_4_0= RULE_STRING ) ) otherlv_5= 'Lohahevitra' otherlv_6= ':' ( (lv_objet_de_mail_7_0= RULE_STRING ) ) otherlv_8= 'Anyaminy' otherlv_9= ':' ( (lv_recipients_10_0= ruleEmailRecipient ) ) (otherlv_11= ',' ( (lv_recipients_12_0= ruleEmailRecipient ) ) )* otherlv_13= 'Mpandefa' otherlv_14= ':' ( (lv_sender_15_0= RULE_STRING ) ) otherlv_16= 'Tenymiafina' otherlv_17= ':' ( (lv_password_18_0= RULE_STRING ) ) otherlv_19= ']' ) ;
    public final EObject ruleAlefasoMailaka() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_message_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_objet_de_mail_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_sender_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_password_18_0=null;
        Token otherlv_19=null;
        EObject lv_recipients_10_0 = null;

        EObject lv_recipients_12_0 = null;



        	enterRule();

        try {
            // InternalMail.g:102:2: ( (otherlv_0= 'AlefasoMailaka' otherlv_1= '[' otherlv_2= 'Hafatra' otherlv_3= ':' ( (lv_message_4_0= RULE_STRING ) ) otherlv_5= 'Lohahevitra' otherlv_6= ':' ( (lv_objet_de_mail_7_0= RULE_STRING ) ) otherlv_8= 'Anyaminy' otherlv_9= ':' ( (lv_recipients_10_0= ruleEmailRecipient ) ) (otherlv_11= ',' ( (lv_recipients_12_0= ruleEmailRecipient ) ) )* otherlv_13= 'Mpandefa' otherlv_14= ':' ( (lv_sender_15_0= RULE_STRING ) ) otherlv_16= 'Tenymiafina' otherlv_17= ':' ( (lv_password_18_0= RULE_STRING ) ) otherlv_19= ']' ) )
            // InternalMail.g:103:2: (otherlv_0= 'AlefasoMailaka' otherlv_1= '[' otherlv_2= 'Hafatra' otherlv_3= ':' ( (lv_message_4_0= RULE_STRING ) ) otherlv_5= 'Lohahevitra' otherlv_6= ':' ( (lv_objet_de_mail_7_0= RULE_STRING ) ) otherlv_8= 'Anyaminy' otherlv_9= ':' ( (lv_recipients_10_0= ruleEmailRecipient ) ) (otherlv_11= ',' ( (lv_recipients_12_0= ruleEmailRecipient ) ) )* otherlv_13= 'Mpandefa' otherlv_14= ':' ( (lv_sender_15_0= RULE_STRING ) ) otherlv_16= 'Tenymiafina' otherlv_17= ':' ( (lv_password_18_0= RULE_STRING ) ) otherlv_19= ']' )
            {
            // InternalMail.g:103:2: (otherlv_0= 'AlefasoMailaka' otherlv_1= '[' otherlv_2= 'Hafatra' otherlv_3= ':' ( (lv_message_4_0= RULE_STRING ) ) otherlv_5= 'Lohahevitra' otherlv_6= ':' ( (lv_objet_de_mail_7_0= RULE_STRING ) ) otherlv_8= 'Anyaminy' otherlv_9= ':' ( (lv_recipients_10_0= ruleEmailRecipient ) ) (otherlv_11= ',' ( (lv_recipients_12_0= ruleEmailRecipient ) ) )* otherlv_13= 'Mpandefa' otherlv_14= ':' ( (lv_sender_15_0= RULE_STRING ) ) otherlv_16= 'Tenymiafina' otherlv_17= ':' ( (lv_password_18_0= RULE_STRING ) ) otherlv_19= ']' )
            // InternalMail.g:104:3: otherlv_0= 'AlefasoMailaka' otherlv_1= '[' otherlv_2= 'Hafatra' otherlv_3= ':' ( (lv_message_4_0= RULE_STRING ) ) otherlv_5= 'Lohahevitra' otherlv_6= ':' ( (lv_objet_de_mail_7_0= RULE_STRING ) ) otherlv_8= 'Anyaminy' otherlv_9= ':' ( (lv_recipients_10_0= ruleEmailRecipient ) ) (otherlv_11= ',' ( (lv_recipients_12_0= ruleEmailRecipient ) ) )* otherlv_13= 'Mpandefa' otherlv_14= ':' ( (lv_sender_15_0= RULE_STRING ) ) otherlv_16= 'Tenymiafina' otherlv_17= ':' ( (lv_password_18_0= RULE_STRING ) ) otherlv_19= ']'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAlefasoMailakaAccess().getAlefasoMailakaKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAlefasoMailakaAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAlefasoMailakaAccess().getHafatraKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAlefasoMailakaAccess().getColonKeyword_3());
            		
            // InternalMail.g:120:3: ( (lv_message_4_0= RULE_STRING ) )
            // InternalMail.g:121:4: (lv_message_4_0= RULE_STRING )
            {
            // InternalMail.g:121:4: (lv_message_4_0= RULE_STRING )
            // InternalMail.g:122:5: lv_message_4_0= RULE_STRING
            {
            lv_message_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_message_4_0, grammarAccess.getAlefasoMailakaAccess().getMessageSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlefasoMailakaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"message",
            						lv_message_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getAlefasoMailakaAccess().getLohahevitraKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getAlefasoMailakaAccess().getColonKeyword_6());
            		
            // InternalMail.g:146:3: ( (lv_objet_de_mail_7_0= RULE_STRING ) )
            // InternalMail.g:147:4: (lv_objet_de_mail_7_0= RULE_STRING )
            {
            // InternalMail.g:147:4: (lv_objet_de_mail_7_0= RULE_STRING )
            // InternalMail.g:148:5: lv_objet_de_mail_7_0= RULE_STRING
            {
            lv_objet_de_mail_7_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_objet_de_mail_7_0, grammarAccess.getAlefasoMailakaAccess().getObjet_de_mailSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlefasoMailakaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"objet_de_mail",
            						lv_objet_de_mail_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getAlefasoMailakaAccess().getAnyaminyKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getAlefasoMailakaAccess().getColonKeyword_9());
            		
            // InternalMail.g:172:3: ( (lv_recipients_10_0= ruleEmailRecipient ) )
            // InternalMail.g:173:4: (lv_recipients_10_0= ruleEmailRecipient )
            {
            // InternalMail.g:173:4: (lv_recipients_10_0= ruleEmailRecipient )
            // InternalMail.g:174:5: lv_recipients_10_0= ruleEmailRecipient
            {

            					newCompositeNode(grammarAccess.getAlefasoMailakaAccess().getRecipientsEmailRecipientParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_9);
            lv_recipients_10_0=ruleEmailRecipient();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlefasoMailakaRule());
            					}
            					add(
            						current,
            						"recipients",
            						lv_recipients_10_0,
            						"org.xtext.example.mydsl.Mail.EmailRecipient");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMail.g:191:3: (otherlv_11= ',' ( (lv_recipients_12_0= ruleEmailRecipient ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMail.g:192:4: otherlv_11= ',' ( (lv_recipients_12_0= ruleEmailRecipient ) )
            	    {
            	    otherlv_11=(Token)match(input,17,FOLLOW_6); 

            	    				newLeafNode(otherlv_11, grammarAccess.getAlefasoMailakaAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalMail.g:196:4: ( (lv_recipients_12_0= ruleEmailRecipient ) )
            	    // InternalMail.g:197:5: (lv_recipients_12_0= ruleEmailRecipient )
            	    {
            	    // InternalMail.g:197:5: (lv_recipients_12_0= ruleEmailRecipient )
            	    // InternalMail.g:198:6: lv_recipients_12_0= ruleEmailRecipient
            	    {

            	    						newCompositeNode(grammarAccess.getAlefasoMailakaAccess().getRecipientsEmailRecipientParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_recipients_12_0=ruleEmailRecipient();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAlefasoMailakaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"recipients",
            	    							lv_recipients_12_0,
            	    							"org.xtext.example.mydsl.Mail.EmailRecipient");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_13=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_13, grammarAccess.getAlefasoMailakaAccess().getMpandefaKeyword_12());
            		
            otherlv_14=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_14, grammarAccess.getAlefasoMailakaAccess().getColonKeyword_13());
            		
            // InternalMail.g:224:3: ( (lv_sender_15_0= RULE_STRING ) )
            // InternalMail.g:225:4: (lv_sender_15_0= RULE_STRING )
            {
            // InternalMail.g:225:4: (lv_sender_15_0= RULE_STRING )
            // InternalMail.g:226:5: lv_sender_15_0= RULE_STRING
            {
            lv_sender_15_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_sender_15_0, grammarAccess.getAlefasoMailakaAccess().getSenderSTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlefasoMailakaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sender",
            						lv_sender_15_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_16=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_16, grammarAccess.getAlefasoMailakaAccess().getTenymiafinaKeyword_15());
            		
            otherlv_17=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_17, grammarAccess.getAlefasoMailakaAccess().getColonKeyword_16());
            		
            // InternalMail.g:250:3: ( (lv_password_18_0= RULE_STRING ) )
            // InternalMail.g:251:4: (lv_password_18_0= RULE_STRING )
            {
            // InternalMail.g:251:4: (lv_password_18_0= RULE_STRING )
            // InternalMail.g:252:5: lv_password_18_0= RULE_STRING
            {
            lv_password_18_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_password_18_0, grammarAccess.getAlefasoMailakaAccess().getPasswordSTRINGTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlefasoMailakaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"password",
            						lv_password_18_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_19=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getAlefasoMailakaAccess().getRightSquareBracketKeyword_18());
            		

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
    // $ANTLR end "ruleAlefasoMailaka"


    // $ANTLR start "entryRuleEmailRecipient"
    // InternalMail.g:276:1: entryRuleEmailRecipient returns [EObject current=null] : iv_ruleEmailRecipient= ruleEmailRecipient EOF ;
    public final EObject entryRuleEmailRecipient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmailRecipient = null;


        try {
            // InternalMail.g:276:55: (iv_ruleEmailRecipient= ruleEmailRecipient EOF )
            // InternalMail.g:277:2: iv_ruleEmailRecipient= ruleEmailRecipient EOF
            {
             newCompositeNode(grammarAccess.getEmailRecipientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmailRecipient=ruleEmailRecipient();

            state._fsp--;

             current =iv_ruleEmailRecipient; 
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
    // $ANTLR end "entryRuleEmailRecipient"


    // $ANTLR start "ruleEmailRecipient"
    // InternalMail.g:283:1: ruleEmailRecipient returns [EObject current=null] : ( (lv_email_0_0= RULE_STRING ) ) ;
    public final EObject ruleEmailRecipient() throws RecognitionException {
        EObject current = null;

        Token lv_email_0_0=null;


        	enterRule();

        try {
            // InternalMail.g:289:2: ( ( (lv_email_0_0= RULE_STRING ) ) )
            // InternalMail.g:290:2: ( (lv_email_0_0= RULE_STRING ) )
            {
            // InternalMail.g:290:2: ( (lv_email_0_0= RULE_STRING ) )
            // InternalMail.g:291:3: (lv_email_0_0= RULE_STRING )
            {
            // InternalMail.g:291:3: (lv_email_0_0= RULE_STRING )
            // InternalMail.g:292:4: lv_email_0_0= RULE_STRING
            {
            lv_email_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_email_0_0, grammarAccess.getEmailRecipientAccess().getEmailSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEmailRecipientRule());
            				}
            				setWithLastConsumed(
            					current,
            					"email",
            					lv_email_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleEmailRecipient"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});

}