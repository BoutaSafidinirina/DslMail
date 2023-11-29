package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MailGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMailParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AlefasoMailaka'", "'['", "'Hafatra'", "':'", "'Lohahevitra'", "'Anyaminy'", "'Mpandefa'", "'Tenymiafina'", "']'", "','"
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

    	public void setGrammarAccess(MailGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalMail.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMail.g:54:1: ( ruleModel EOF )
            // InternalMail.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMail.g:62:1: ruleModel : ( ruleAlefasoMailaka ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:66:2: ( ( ruleAlefasoMailaka ) )
            // InternalMail.g:67:2: ( ruleAlefasoMailaka )
            {
            // InternalMail.g:67:2: ( ruleAlefasoMailaka )
            // InternalMail.g:68:3: ruleAlefasoMailaka
            {
             before(grammarAccess.getModelAccess().getAlefasoMailakaParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAlefasoMailaka();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAlefasoMailakaParserRuleCall()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAlefasoMailaka"
    // InternalMail.g:78:1: entryRuleAlefasoMailaka : ruleAlefasoMailaka EOF ;
    public final void entryRuleAlefasoMailaka() throws RecognitionException {
        try {
            // InternalMail.g:79:1: ( ruleAlefasoMailaka EOF )
            // InternalMail.g:80:1: ruleAlefasoMailaka EOF
            {
             before(grammarAccess.getAlefasoMailakaRule()); 
            pushFollow(FOLLOW_1);
            ruleAlefasoMailaka();

            state._fsp--;

             after(grammarAccess.getAlefasoMailakaRule()); 
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
    // $ANTLR end "entryRuleAlefasoMailaka"


    // $ANTLR start "ruleAlefasoMailaka"
    // InternalMail.g:87:1: ruleAlefasoMailaka : ( ( rule__AlefasoMailaka__Group__0 ) ) ;
    public final void ruleAlefasoMailaka() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:91:2: ( ( ( rule__AlefasoMailaka__Group__0 ) ) )
            // InternalMail.g:92:2: ( ( rule__AlefasoMailaka__Group__0 ) )
            {
            // InternalMail.g:92:2: ( ( rule__AlefasoMailaka__Group__0 ) )
            // InternalMail.g:93:3: ( rule__AlefasoMailaka__Group__0 )
            {
             before(grammarAccess.getAlefasoMailakaAccess().getGroup()); 
            // InternalMail.g:94:3: ( rule__AlefasoMailaka__Group__0 )
            // InternalMail.g:94:4: rule__AlefasoMailaka__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlefasoMailakaAccess().getGroup()); 

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
    // $ANTLR end "ruleAlefasoMailaka"


    // $ANTLR start "entryRuleEmailRecipient"
    // InternalMail.g:103:1: entryRuleEmailRecipient : ruleEmailRecipient EOF ;
    public final void entryRuleEmailRecipient() throws RecognitionException {
        try {
            // InternalMail.g:104:1: ( ruleEmailRecipient EOF )
            // InternalMail.g:105:1: ruleEmailRecipient EOF
            {
             before(grammarAccess.getEmailRecipientRule()); 
            pushFollow(FOLLOW_1);
            ruleEmailRecipient();

            state._fsp--;

             after(grammarAccess.getEmailRecipientRule()); 
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
    // $ANTLR end "entryRuleEmailRecipient"


    // $ANTLR start "ruleEmailRecipient"
    // InternalMail.g:112:1: ruleEmailRecipient : ( ( rule__EmailRecipient__EmailAssignment ) ) ;
    public final void ruleEmailRecipient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:116:2: ( ( ( rule__EmailRecipient__EmailAssignment ) ) )
            // InternalMail.g:117:2: ( ( rule__EmailRecipient__EmailAssignment ) )
            {
            // InternalMail.g:117:2: ( ( rule__EmailRecipient__EmailAssignment ) )
            // InternalMail.g:118:3: ( rule__EmailRecipient__EmailAssignment )
            {
             before(grammarAccess.getEmailRecipientAccess().getEmailAssignment()); 
            // InternalMail.g:119:3: ( rule__EmailRecipient__EmailAssignment )
            // InternalMail.g:119:4: rule__EmailRecipient__EmailAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EmailRecipient__EmailAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEmailRecipientAccess().getEmailAssignment()); 

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
    // $ANTLR end "ruleEmailRecipient"


    // $ANTLR start "rule__AlefasoMailaka__Group__0"
    // InternalMail.g:127:1: rule__AlefasoMailaka__Group__0 : rule__AlefasoMailaka__Group__0__Impl rule__AlefasoMailaka__Group__1 ;
    public final void rule__AlefasoMailaka__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:131:1: ( rule__AlefasoMailaka__Group__0__Impl rule__AlefasoMailaka__Group__1 )
            // InternalMail.g:132:2: rule__AlefasoMailaka__Group__0__Impl rule__AlefasoMailaka__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AlefasoMailaka__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__Group__1();

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
    // $ANTLR end "rule__AlefasoMailaka__Group__0"


    // $ANTLR start "rule__AlefasoMailaka__Group__0__Impl"
    // InternalMail.g:139:1: rule__AlefasoMailaka__Group__0__Impl : ( 'AlefasoMailaka' ) ;
    public final void rule__AlefasoMailaka__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:143:1: ( ( 'AlefasoMailaka' ) )
            // InternalMail.g:144:1: ( 'AlefasoMailaka' )
            {
            // InternalMail.g:144:1: ( 'AlefasoMailaka' )
            // InternalMail.g:145:2: 'AlefasoMailaka'
            {
             before(grammarAccess.getAlefasoMailakaAccess().getAlefasoMailakaKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAlefasoMailakaAccess().getAlefasoMailakaKeyword_0()); 

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
    // $ANTLR end "rule__AlefasoMailaka__Group__0__Impl"


    // $ANTLR start "rule__AlefasoMailaka__Group__1"
    // InternalMail.g:154:1: rule__AlefasoMailaka__Group__1 : rule__AlefasoMailaka__Group__1__Impl rule__AlefasoMailaka__Group__2 ;
    public final void rule__AlefasoMailaka__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:158:1: ( rule__AlefasoMailaka__Group__1__Impl rule__AlefasoMailaka__Group__2 )
            // InternalMail.g:159:2: rule__AlefasoMailaka__Group__1__Impl rule__AlefasoMailaka__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AlefasoMailaka__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__Group__2();

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
    // $ANTLR end "rule__AlefasoMailaka__Group__1"


    // $ANTLR start "rule__AlefasoMailaka__Group__1__Impl"
    // InternalMail.g:166:1: rule__AlefasoMailaka__Group__1__Impl : ( '[' ) ;
    public final void rule__AlefasoMailaka__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:170:1: ( ( '[' ) )
            // InternalMail.g:171:1: ( '[' )
            {
            // InternalMail.g:171:1: ( '[' )
            // InternalMail.g:172:2: '['
            {
             before(grammarAccess.getAlefasoMailakaAccess().getLeftSquareBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAlefasoMailakaAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__AlefasoMailaka__Group__1__Impl"


    // $ANTLR start "rule__AlefasoMailaka__Group__2"
    // InternalMail.g:181:1: rule__AlefasoMailaka__Group__2 : rule__AlefasoMailaka__Group__2__Impl rule__AlefasoMailaka__Group__3 ;
    public final void rule__AlefasoMailaka__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:185:1: ( rule__AlefasoMailaka__Group__2__Impl rule__AlefasoMailaka__Group__3 )
            // InternalMail.g:186:2: rule__AlefasoMailaka__Group__2__Impl rule__AlefasoMailaka__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__AlefasoMailaka__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__Group__3();

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
    // $ANTLR end "rule__AlefasoMailaka__Group__2"


    // $ANTLR start "rule__AlefasoMailaka__Group__2__Impl"
    // InternalMail.g:193:1: rule__AlefasoMailaka__Group__2__Impl : ( 'Hafatra' ) ;
    public final void rule__AlefasoMailaka__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:197:1: ( ( 'Hafatra' ) )
            // InternalMail.g:198:1: ( 'Hafatra' )
            {
            // InternalMail.g:198:1: ( 'Hafatra' )
            // InternalMail.g:199:2: 'Hafatra'
            {
             before(grammarAccess.getAlefasoMailakaAccess().getHafatraKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAlefasoMailakaAccess().getHafatraKeyword_2()); 

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
    // $ANTLR end "rule__AlefasoMailaka__Group__2__Impl"


    // $ANTLR start "rule__AlefasoMailaka__Group__3"
    // InternalMail.g:208:1: rule__AlefasoMailaka__Group__3 : rule__AlefasoMailaka__Group__3__Impl rule__AlefasoMailaka__Group__4 ;
    public final void rule__AlefasoMailaka__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:212:1: ( rule__AlefasoMailaka__Group__3__Impl rule__AlefasoMailaka__Group__4 )
            // InternalMail.g:213:2: rule__AlefasoMailaka__Group__3__Impl rule__AlefasoMailaka__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__AlefasoMailaka__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__Group__4();

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
    // $ANTLR end "rule__AlefasoMailaka__Group__3"


    // $ANTLR start "rule__AlefasoMailaka__Group__3__Impl"
    // InternalMail.g:220:1: rule__AlefasoMailaka__Group__3__Impl : ( ':' ) ;
    public final void rule__AlefasoMailaka__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:224:1: ( ( ':' ) )
            // InternalMail.g:225:1: ( ':' )
            {
            // InternalMail.g:225:1: ( ':' )
            // InternalMail.g:226:2: ':'
            {
             before(grammarAccess.getAlefasoMailakaAccess().getColonKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAlefasoMailakaAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__AlefasoMailaka__Group__3__Impl"


    // $ANTLR start "rule__AlefasoMailaka__Group__4"
    // InternalMail.g:235:1: rule__AlefasoMailaka__Group__4 : rule__AlefasoMailaka__Group__4__Impl rule__AlefasoMailaka__Group__5 ;
    public final void rule__AlefasoMailaka__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:239:1: ( rule__AlefasoMailaka__Group__4__Impl rule__AlefasoMailaka__Group__5 )
            // InternalMail.g:240:2: rule__AlefasoMailaka__Group__4__Impl rule__AlefasoMailaka__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__AlefasoMailaka__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__Group__5();

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
    // $ANTLR end "rule__AlefasoMailaka__Group__4"


    // $ANTLR start "rule__AlefasoMailaka__Group__4__Impl"
    // InternalMail.g:247:1: rule__AlefasoMailaka__Group__4__Impl : ( ( rule__AlefasoMailaka__MessageAssignment_4 ) ) ;
    public final void rule__AlefasoMailaka__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:251:1: ( ( ( rule__AlefasoMailaka__MessageAssignment_4 ) ) )
            // InternalMail.g:252:1: ( ( rule__AlefasoMailaka__MessageAssignment_4 ) )
            {
            // InternalMail.g:252:1: ( ( rule__AlefasoMailaka__MessageAssignment_4 ) )
            // InternalMail.g:253:2: ( rule__AlefasoMailaka__MessageAssignment_4 )
            {
             before(grammarAccess.getAlefasoMailakaAccess().getMessageAssignment_4()); 
            // InternalMail.g:254:2: ( rule__AlefasoMailaka__MessageAssignment_4 )
            // InternalMail.g:254:3: rule__AlefasoMailaka__MessageAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__MessageAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAlefasoMailakaAccess().getMessageAssignment_4()); 

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
    // $ANTLR end "rule__AlefasoMailaka__Group__4__Impl"


    // $ANTLR start "rule__AlefasoMailaka__Group__5"
    // InternalMail.g:262:1: rule__AlefasoMailaka__Group__5 : rule__AlefasoMailaka__Group__5__Impl rule__AlefasoMailaka__Group__6 ;
    public final void rule__AlefasoMailaka__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:266:1: ( rule__AlefasoMailaka__Group__5__Impl rule__AlefasoMailaka__Group__6 )
            // InternalMail.g:267:2: rule__AlefasoMailaka__Group__5__Impl rule__AlefasoMailaka__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__AlefasoMailaka__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__Group__6();

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
    // $ANTLR end "rule__AlefasoMailaka__Group__5"


    // $ANTLR start "rule__AlefasoMailaka__Group__5__Impl"
    // InternalMail.g:274:1: rule__AlefasoMailaka__Group__5__Impl : ( 'Lohahevitra' ) ;
    public final void rule__AlefasoMailaka__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:278:1: ( ( 'Lohahevitra' ) )
            // InternalMail.g:279:1: ( 'Lohahevitra' )
            {
            // InternalMail.g:279:1: ( 'Lohahevitra' )
            // InternalMail.g:280:2: 'Lohahevitra'
            {
             before(grammarAccess.getAlefasoMailakaAccess().getLohahevitraKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAlefasoMailakaAccess().getLohahevitraKeyword_5()); 

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
    // $ANTLR end "rule__AlefasoMailaka__Group__5__Impl"


    // $ANTLR start "rule__AlefasoMailaka__Group__6"
    // InternalMail.g:289:1: rule__AlefasoMailaka__Group__6 : rule__AlefasoMailaka__Group__6__Impl rule__AlefasoMailaka__Group__7 ;
    public final void rule__AlefasoMailaka__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:293:1: ( rule__AlefasoMailaka__Group__6__Impl rule__AlefasoMailaka__Group__7 )
            // InternalMail.g:294:2: rule__AlefasoMailaka__Group__6__Impl rule__AlefasoMailaka__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__AlefasoMailaka__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__Group__7();

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
    // $ANTLR end "rule__AlefasoMailaka__Group__6"


    // $ANTLR start "rule__AlefasoMailaka__Group__6__Impl"
    // InternalMail.g:301:1: rule__AlefasoMailaka__Group__6__Impl : ( ':' ) ;
    public final void rule__AlefasoMailaka__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:305:1: ( ( ':' ) )
            // InternalMail.g:306:1: ( ':' )
            {
            // InternalMail.g:306:1: ( ':' )
            // InternalMail.g:307:2: ':'
            {
             before(grammarAccess.getAlefasoMailakaAccess().getColonKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAlefasoMailakaAccess().getColonKeyword_6()); 

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
    // $ANTLR end "rule__AlefasoMailaka__Group__6__Impl"


    // $ANTLR start "rule__AlefasoMailaka__Group__7"
    // InternalMail.g:316:1: rule__AlefasoMailaka__Group__7 : rule__AlefasoMailaka__Group__7__Impl rule__AlefasoMailaka__Group__8 ;
    public final void rule__AlefasoMailaka__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:320:1: ( rule__AlefasoMailaka__Group__7__Impl rule__AlefasoMailaka__Group__8 )
            // InternalMail.g:321:2: rule__AlefasoMailaka__Group__7__Impl rule__AlefasoMailaka__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__AlefasoMailaka__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__Group__8();

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
    // $ANTLR end "rule__AlefasoMailaka__Group__7"


    // $ANTLR start "rule__AlefasoMailaka__Group__7__Impl"
    // InternalMail.g:328:1: rule__AlefasoMailaka__Group__7__Impl : ( ( rule__AlefasoMailaka__Objet_de_mailAssignment_7 ) ) ;
    public final void rule__AlefasoMailaka__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:332:1: ( ( ( rule__AlefasoMailaka__Objet_de_mailAssignment_7 ) ) )
            // InternalMail.g:333:1: ( ( rule__AlefasoMailaka__Objet_de_mailAssignment_7 ) )
            {
            // InternalMail.g:333:1: ( ( rule__AlefasoMailaka__Objet_de_mailAssignment_7 ) )
            // InternalMail.g:334:2: ( rule__AlefasoMailaka__Objet_de_mailAssignment_7 )
            {
             before(grammarAccess.getAlefasoMailakaAccess().getObjet_de_mailAssignment_7()); 
            // InternalMail.g:335:2: ( rule__AlefasoMailaka__Objet_de_mailAssignment_7 )
            // InternalMail.g:335:3: rule__AlefasoMailaka__Objet_de_mailAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__Objet_de_mailAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAlefasoMailakaAccess().getObjet_de_mailAssignment_7()); 

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
    // $ANTLR end "rule__AlefasoMailaka__Group__7__Impl"


    // $ANTLR start "rule__AlefasoMailaka__Group__8"
    // InternalMail.g:343:1: rule__AlefasoMailaka__Group__8 : rule__AlefasoMailaka__Group__8__Impl rule__AlefasoMailaka__Group__9 ;
    public final void rule__AlefasoMailaka__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:347:1: ( rule__AlefasoMailaka__Group__8__Impl rule__AlefasoMailaka__Group__9 )
            // InternalMail.g:348:2: rule__AlefasoMailaka__Group__8__Impl rule__AlefasoMailaka__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__AlefasoMailaka__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__Group__9();

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
    // $ANTLR end "rule__AlefasoMailaka__Group__8"


    // $ANTLR start "rule__AlefasoMailaka__Group__8__Impl"
    // InternalMail.g:355:1: rule__AlefasoMailaka__Group__8__Impl : ( 'Anyaminy' ) ;
    public final void rule__AlefasoMailaka__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:359:1: ( ( 'Anyaminy' ) )
            // InternalMail.g:360:1: ( 'Anyaminy' )
            {
            // InternalMail.g:360:1: ( 'Anyaminy' )
            // InternalMail.g:361:2: 'Anyaminy'
            {
             before(grammarAccess.getAlefasoMailakaAccess().getAnyaminyKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAlefasoMailakaAccess().getAnyaminyKeyword_8()); 

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
    // $ANTLR end "rule__AlefasoMailaka__Group__8__Impl"


    // $ANTLR start "rule__AlefasoMailaka__Group__9"
    // InternalMail.g:370:1: rule__AlefasoMailaka__Group__9 : rule__AlefasoMailaka__Group__9__Impl rule__AlefasoMailaka__Group__10 ;
    public final void rule__AlefasoMailaka__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:374:1: ( rule__AlefasoMailaka__Group__9__Impl rule__AlefasoMailaka__Group__10 )
            // InternalMail.g:375:2: rule__AlefasoMailaka__Group__9__Impl rule__AlefasoMailaka__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__AlefasoMailaka__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__Group__10();

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
    // $ANTLR end "rule__AlefasoMailaka__Group__9"


    // $ANTLR start "rule__AlefasoMailaka__Group__9__Impl"
    // InternalMail.g:382:1: rule__AlefasoMailaka__Group__9__Impl : ( ':' ) ;
    public final void rule__AlefasoMailaka__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:386:1: ( ( ':' ) )
            // InternalMail.g:387:1: ( ':' )
            {
            // InternalMail.g:387:1: ( ':' )
            // InternalMail.g:388:2: ':'
            {
             before(grammarAccess.getAlefasoMailakaAccess().getColonKeyword_9()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAlefasoMailakaAccess().getColonKeyword_9()); 

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
    // $ANTLR end "rule__AlefasoMailaka__Group__9__Impl"


    // $ANTLR start "rule__AlefasoMailaka__Group__10"
    // InternalMail.g:397:1: rule__AlefasoMailaka__Group__10 : rule__AlefasoMailaka__Group__10__Impl rule__AlefasoMailaka__Group__11 ;
    public final void rule__AlefasoMailaka__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:401:1: ( rule__AlefasoMailaka__Group__10__Impl rule__AlefasoMailaka__Group__11 )
            // InternalMail.g:402:2: rule__AlefasoMailaka__Group__10__Impl rule__AlefasoMailaka__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__AlefasoMailaka__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__Group__11();

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
    // $ANTLR end "rule__AlefasoMailaka__Group__10"


    // $ANTLR start "rule__AlefasoMailaka__Group__10__Impl"
    // InternalMail.g:409:1: rule__AlefasoMailaka__Group__10__Impl : ( ( rule__AlefasoMailaka__RecipientsAssignment_10 ) ) ;
    public final void rule__AlefasoMailaka__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:413:1: ( ( ( rule__AlefasoMailaka__RecipientsAssignment_10 ) ) )
            // InternalMail.g:414:1: ( ( rule__AlefasoMailaka__RecipientsAssignment_10 ) )
            {
            // InternalMail.g:414:1: ( ( rule__AlefasoMailaka__RecipientsAssignment_10 ) )
            // InternalMail.g:415:2: ( rule__AlefasoMailaka__RecipientsAssignment_10 )
            {
             before(grammarAccess.getAlefasoMailakaAccess().getRecipientsAssignment_10()); 
            // InternalMail.g:416:2: ( rule__AlefasoMailaka__RecipientsAssignment_10 )
            // InternalMail.g:416:3: rule__AlefasoMailaka__RecipientsAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__RecipientsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getAlefasoMailakaAccess().getRecipientsAssignment_10()); 

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
    // $ANTLR end "rule__AlefasoMailaka__Group__10__Impl"


    // $ANTLR start "rule__AlefasoMailaka__Group__11"
    // InternalMail.g:424:1: rule__AlefasoMailaka__Group__11 : rule__AlefasoMailaka__Group__11__Impl rule__AlefasoMailaka__Group__12 ;
    public final void rule__AlefasoMailaka__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:428:1: ( rule__AlefasoMailaka__Group__11__Impl rule__AlefasoMailaka__Group__12 )
            // InternalMail.g:429:2: rule__AlefasoMailaka__Group__11__Impl rule__AlefasoMailaka__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__AlefasoMailaka__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__Group__12();

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
    // $ANTLR end "rule__AlefasoMailaka__Group__11"


    // $ANTLR start "rule__AlefasoMailaka__Group__11__Impl"
    // InternalMail.g:436:1: rule__AlefasoMailaka__Group__11__Impl : ( ( rule__AlefasoMailaka__Group_11__0 )* ) ;
    public final void rule__AlefasoMailaka__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:440:1: ( ( ( rule__AlefasoMailaka__Group_11__0 )* ) )
            // InternalMail.g:441:1: ( ( rule__AlefasoMailaka__Group_11__0 )* )
            {
            // InternalMail.g:441:1: ( ( rule__AlefasoMailaka__Group_11__0 )* )
            // InternalMail.g:442:2: ( rule__AlefasoMailaka__Group_11__0 )*
            {
             before(grammarAccess.getAlefasoMailakaAccess().getGroup_11()); 
            // InternalMail.g:443:2: ( rule__AlefasoMailaka__Group_11__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMail.g:443:3: rule__AlefasoMailaka__Group_11__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AlefasoMailaka__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getAlefasoMailakaAccess().getGroup_11()); 

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
    // $ANTLR end "rule__AlefasoMailaka__Group__11__Impl"


    // $ANTLR start "rule__AlefasoMailaka__Group__12"
    // InternalMail.g:451:1: rule__AlefasoMailaka__Group__12 : rule__AlefasoMailaka__Group__12__Impl rule__AlefasoMailaka__Group__13 ;
    public final void rule__AlefasoMailaka__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:455:1: ( rule__AlefasoMailaka__Group__12__Impl rule__AlefasoMailaka__Group__13 )
            // InternalMail.g:456:2: rule__AlefasoMailaka__Group__12__Impl rule__AlefasoMailaka__Group__13
            {
            pushFollow(FOLLOW_5);
            rule__AlefasoMailaka__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__Group__13();

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
    // $ANTLR end "rule__AlefasoMailaka__Group__12"


    // $ANTLR start "rule__AlefasoMailaka__Group__12__Impl"
    // InternalMail.g:463:1: rule__AlefasoMailaka__Group__12__Impl : ( 'Mpandefa' ) ;
    public final void rule__AlefasoMailaka__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:467:1: ( ( 'Mpandefa' ) )
            // InternalMail.g:468:1: ( 'Mpandefa' )
            {
            // InternalMail.g:468:1: ( 'Mpandefa' )
            // InternalMail.g:469:2: 'Mpandefa'
            {
             before(grammarAccess.getAlefasoMailakaAccess().getMpandefaKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAlefasoMailakaAccess().getMpandefaKeyword_12()); 

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
    // $ANTLR end "rule__AlefasoMailaka__Group__12__Impl"


    // $ANTLR start "rule__AlefasoMailaka__Group__13"
    // InternalMail.g:478:1: rule__AlefasoMailaka__Group__13 : rule__AlefasoMailaka__Group__13__Impl rule__AlefasoMailaka__Group__14 ;
    public final void rule__AlefasoMailaka__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:482:1: ( rule__AlefasoMailaka__Group__13__Impl rule__AlefasoMailaka__Group__14 )
            // InternalMail.g:483:2: rule__AlefasoMailaka__Group__13__Impl rule__AlefasoMailaka__Group__14
            {
            pushFollow(FOLLOW_6);
            rule__AlefasoMailaka__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__Group__14();

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
    // $ANTLR end "rule__AlefasoMailaka__Group__13"


    // $ANTLR start "rule__AlefasoMailaka__Group__13__Impl"
    // InternalMail.g:490:1: rule__AlefasoMailaka__Group__13__Impl : ( ':' ) ;
    public final void rule__AlefasoMailaka__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:494:1: ( ( ':' ) )
            // InternalMail.g:495:1: ( ':' )
            {
            // InternalMail.g:495:1: ( ':' )
            // InternalMail.g:496:2: ':'
            {
             before(grammarAccess.getAlefasoMailakaAccess().getColonKeyword_13()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAlefasoMailakaAccess().getColonKeyword_13()); 

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
    // $ANTLR end "rule__AlefasoMailaka__Group__13__Impl"


    // $ANTLR start "rule__AlefasoMailaka__Group__14"
    // InternalMail.g:505:1: rule__AlefasoMailaka__Group__14 : rule__AlefasoMailaka__Group__14__Impl rule__AlefasoMailaka__Group__15 ;
    public final void rule__AlefasoMailaka__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:509:1: ( rule__AlefasoMailaka__Group__14__Impl rule__AlefasoMailaka__Group__15 )
            // InternalMail.g:510:2: rule__AlefasoMailaka__Group__14__Impl rule__AlefasoMailaka__Group__15
            {
            pushFollow(FOLLOW_11);
            rule__AlefasoMailaka__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__Group__15();

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
    // $ANTLR end "rule__AlefasoMailaka__Group__14"


    // $ANTLR start "rule__AlefasoMailaka__Group__14__Impl"
    // InternalMail.g:517:1: rule__AlefasoMailaka__Group__14__Impl : ( ( rule__AlefasoMailaka__SenderAssignment_14 ) ) ;
    public final void rule__AlefasoMailaka__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:521:1: ( ( ( rule__AlefasoMailaka__SenderAssignment_14 ) ) )
            // InternalMail.g:522:1: ( ( rule__AlefasoMailaka__SenderAssignment_14 ) )
            {
            // InternalMail.g:522:1: ( ( rule__AlefasoMailaka__SenderAssignment_14 ) )
            // InternalMail.g:523:2: ( rule__AlefasoMailaka__SenderAssignment_14 )
            {
             before(grammarAccess.getAlefasoMailakaAccess().getSenderAssignment_14()); 
            // InternalMail.g:524:2: ( rule__AlefasoMailaka__SenderAssignment_14 )
            // InternalMail.g:524:3: rule__AlefasoMailaka__SenderAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__SenderAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getAlefasoMailakaAccess().getSenderAssignment_14()); 

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
    // $ANTLR end "rule__AlefasoMailaka__Group__14__Impl"


    // $ANTLR start "rule__AlefasoMailaka__Group__15"
    // InternalMail.g:532:1: rule__AlefasoMailaka__Group__15 : rule__AlefasoMailaka__Group__15__Impl rule__AlefasoMailaka__Group__16 ;
    public final void rule__AlefasoMailaka__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:536:1: ( rule__AlefasoMailaka__Group__15__Impl rule__AlefasoMailaka__Group__16 )
            // InternalMail.g:537:2: rule__AlefasoMailaka__Group__15__Impl rule__AlefasoMailaka__Group__16
            {
            pushFollow(FOLLOW_5);
            rule__AlefasoMailaka__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__Group__16();

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
    // $ANTLR end "rule__AlefasoMailaka__Group__15"


    // $ANTLR start "rule__AlefasoMailaka__Group__15__Impl"
    // InternalMail.g:544:1: rule__AlefasoMailaka__Group__15__Impl : ( 'Tenymiafina' ) ;
    public final void rule__AlefasoMailaka__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:548:1: ( ( 'Tenymiafina' ) )
            // InternalMail.g:549:1: ( 'Tenymiafina' )
            {
            // InternalMail.g:549:1: ( 'Tenymiafina' )
            // InternalMail.g:550:2: 'Tenymiafina'
            {
             before(grammarAccess.getAlefasoMailakaAccess().getTenymiafinaKeyword_15()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAlefasoMailakaAccess().getTenymiafinaKeyword_15()); 

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
    // $ANTLR end "rule__AlefasoMailaka__Group__15__Impl"


    // $ANTLR start "rule__AlefasoMailaka__Group__16"
    // InternalMail.g:559:1: rule__AlefasoMailaka__Group__16 : rule__AlefasoMailaka__Group__16__Impl rule__AlefasoMailaka__Group__17 ;
    public final void rule__AlefasoMailaka__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:563:1: ( rule__AlefasoMailaka__Group__16__Impl rule__AlefasoMailaka__Group__17 )
            // InternalMail.g:564:2: rule__AlefasoMailaka__Group__16__Impl rule__AlefasoMailaka__Group__17
            {
            pushFollow(FOLLOW_6);
            rule__AlefasoMailaka__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__Group__17();

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
    // $ANTLR end "rule__AlefasoMailaka__Group__16"


    // $ANTLR start "rule__AlefasoMailaka__Group__16__Impl"
    // InternalMail.g:571:1: rule__AlefasoMailaka__Group__16__Impl : ( ':' ) ;
    public final void rule__AlefasoMailaka__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:575:1: ( ( ':' ) )
            // InternalMail.g:576:1: ( ':' )
            {
            // InternalMail.g:576:1: ( ':' )
            // InternalMail.g:577:2: ':'
            {
             before(grammarAccess.getAlefasoMailakaAccess().getColonKeyword_16()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAlefasoMailakaAccess().getColonKeyword_16()); 

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
    // $ANTLR end "rule__AlefasoMailaka__Group__16__Impl"


    // $ANTLR start "rule__AlefasoMailaka__Group__17"
    // InternalMail.g:586:1: rule__AlefasoMailaka__Group__17 : rule__AlefasoMailaka__Group__17__Impl rule__AlefasoMailaka__Group__18 ;
    public final void rule__AlefasoMailaka__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:590:1: ( rule__AlefasoMailaka__Group__17__Impl rule__AlefasoMailaka__Group__18 )
            // InternalMail.g:591:2: rule__AlefasoMailaka__Group__17__Impl rule__AlefasoMailaka__Group__18
            {
            pushFollow(FOLLOW_12);
            rule__AlefasoMailaka__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__Group__18();

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
    // $ANTLR end "rule__AlefasoMailaka__Group__17"


    // $ANTLR start "rule__AlefasoMailaka__Group__17__Impl"
    // InternalMail.g:598:1: rule__AlefasoMailaka__Group__17__Impl : ( ( rule__AlefasoMailaka__PasswordAssignment_17 ) ) ;
    public final void rule__AlefasoMailaka__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:602:1: ( ( ( rule__AlefasoMailaka__PasswordAssignment_17 ) ) )
            // InternalMail.g:603:1: ( ( rule__AlefasoMailaka__PasswordAssignment_17 ) )
            {
            // InternalMail.g:603:1: ( ( rule__AlefasoMailaka__PasswordAssignment_17 ) )
            // InternalMail.g:604:2: ( rule__AlefasoMailaka__PasswordAssignment_17 )
            {
             before(grammarAccess.getAlefasoMailakaAccess().getPasswordAssignment_17()); 
            // InternalMail.g:605:2: ( rule__AlefasoMailaka__PasswordAssignment_17 )
            // InternalMail.g:605:3: rule__AlefasoMailaka__PasswordAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__PasswordAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getAlefasoMailakaAccess().getPasswordAssignment_17()); 

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
    // $ANTLR end "rule__AlefasoMailaka__Group__17__Impl"


    // $ANTLR start "rule__AlefasoMailaka__Group__18"
    // InternalMail.g:613:1: rule__AlefasoMailaka__Group__18 : rule__AlefasoMailaka__Group__18__Impl ;
    public final void rule__AlefasoMailaka__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:617:1: ( rule__AlefasoMailaka__Group__18__Impl )
            // InternalMail.g:618:2: rule__AlefasoMailaka__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__Group__18__Impl();

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
    // $ANTLR end "rule__AlefasoMailaka__Group__18"


    // $ANTLR start "rule__AlefasoMailaka__Group__18__Impl"
    // InternalMail.g:624:1: rule__AlefasoMailaka__Group__18__Impl : ( ']' ) ;
    public final void rule__AlefasoMailaka__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:628:1: ( ( ']' ) )
            // InternalMail.g:629:1: ( ']' )
            {
            // InternalMail.g:629:1: ( ']' )
            // InternalMail.g:630:2: ']'
            {
             before(grammarAccess.getAlefasoMailakaAccess().getRightSquareBracketKeyword_18()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAlefasoMailakaAccess().getRightSquareBracketKeyword_18()); 

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
    // $ANTLR end "rule__AlefasoMailaka__Group__18__Impl"


    // $ANTLR start "rule__AlefasoMailaka__Group_11__0"
    // InternalMail.g:640:1: rule__AlefasoMailaka__Group_11__0 : rule__AlefasoMailaka__Group_11__0__Impl rule__AlefasoMailaka__Group_11__1 ;
    public final void rule__AlefasoMailaka__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:644:1: ( rule__AlefasoMailaka__Group_11__0__Impl rule__AlefasoMailaka__Group_11__1 )
            // InternalMail.g:645:2: rule__AlefasoMailaka__Group_11__0__Impl rule__AlefasoMailaka__Group_11__1
            {
            pushFollow(FOLLOW_6);
            rule__AlefasoMailaka__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__Group_11__1();

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
    // $ANTLR end "rule__AlefasoMailaka__Group_11__0"


    // $ANTLR start "rule__AlefasoMailaka__Group_11__0__Impl"
    // InternalMail.g:652:1: rule__AlefasoMailaka__Group_11__0__Impl : ( ',' ) ;
    public final void rule__AlefasoMailaka__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:656:1: ( ( ',' ) )
            // InternalMail.g:657:1: ( ',' )
            {
            // InternalMail.g:657:1: ( ',' )
            // InternalMail.g:658:2: ','
            {
             before(grammarAccess.getAlefasoMailakaAccess().getCommaKeyword_11_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAlefasoMailakaAccess().getCommaKeyword_11_0()); 

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
    // $ANTLR end "rule__AlefasoMailaka__Group_11__0__Impl"


    // $ANTLR start "rule__AlefasoMailaka__Group_11__1"
    // InternalMail.g:667:1: rule__AlefasoMailaka__Group_11__1 : rule__AlefasoMailaka__Group_11__1__Impl ;
    public final void rule__AlefasoMailaka__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:671:1: ( rule__AlefasoMailaka__Group_11__1__Impl )
            // InternalMail.g:672:2: rule__AlefasoMailaka__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__Group_11__1__Impl();

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
    // $ANTLR end "rule__AlefasoMailaka__Group_11__1"


    // $ANTLR start "rule__AlefasoMailaka__Group_11__1__Impl"
    // InternalMail.g:678:1: rule__AlefasoMailaka__Group_11__1__Impl : ( ( rule__AlefasoMailaka__RecipientsAssignment_11_1 ) ) ;
    public final void rule__AlefasoMailaka__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:682:1: ( ( ( rule__AlefasoMailaka__RecipientsAssignment_11_1 ) ) )
            // InternalMail.g:683:1: ( ( rule__AlefasoMailaka__RecipientsAssignment_11_1 ) )
            {
            // InternalMail.g:683:1: ( ( rule__AlefasoMailaka__RecipientsAssignment_11_1 ) )
            // InternalMail.g:684:2: ( rule__AlefasoMailaka__RecipientsAssignment_11_1 )
            {
             before(grammarAccess.getAlefasoMailakaAccess().getRecipientsAssignment_11_1()); 
            // InternalMail.g:685:2: ( rule__AlefasoMailaka__RecipientsAssignment_11_1 )
            // InternalMail.g:685:3: rule__AlefasoMailaka__RecipientsAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__AlefasoMailaka__RecipientsAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getAlefasoMailakaAccess().getRecipientsAssignment_11_1()); 

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
    // $ANTLR end "rule__AlefasoMailaka__Group_11__1__Impl"


    // $ANTLR start "rule__AlefasoMailaka__MessageAssignment_4"
    // InternalMail.g:694:1: rule__AlefasoMailaka__MessageAssignment_4 : ( RULE_STRING ) ;
    public final void rule__AlefasoMailaka__MessageAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:698:1: ( ( RULE_STRING ) )
            // InternalMail.g:699:2: ( RULE_STRING )
            {
            // InternalMail.g:699:2: ( RULE_STRING )
            // InternalMail.g:700:3: RULE_STRING
            {
             before(grammarAccess.getAlefasoMailakaAccess().getMessageSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAlefasoMailakaAccess().getMessageSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__AlefasoMailaka__MessageAssignment_4"


    // $ANTLR start "rule__AlefasoMailaka__Objet_de_mailAssignment_7"
    // InternalMail.g:709:1: rule__AlefasoMailaka__Objet_de_mailAssignment_7 : ( RULE_STRING ) ;
    public final void rule__AlefasoMailaka__Objet_de_mailAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:713:1: ( ( RULE_STRING ) )
            // InternalMail.g:714:2: ( RULE_STRING )
            {
            // InternalMail.g:714:2: ( RULE_STRING )
            // InternalMail.g:715:3: RULE_STRING
            {
             before(grammarAccess.getAlefasoMailakaAccess().getObjet_de_mailSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAlefasoMailakaAccess().getObjet_de_mailSTRINGTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__AlefasoMailaka__Objet_de_mailAssignment_7"


    // $ANTLR start "rule__AlefasoMailaka__RecipientsAssignment_10"
    // InternalMail.g:724:1: rule__AlefasoMailaka__RecipientsAssignment_10 : ( ruleEmailRecipient ) ;
    public final void rule__AlefasoMailaka__RecipientsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:728:1: ( ( ruleEmailRecipient ) )
            // InternalMail.g:729:2: ( ruleEmailRecipient )
            {
            // InternalMail.g:729:2: ( ruleEmailRecipient )
            // InternalMail.g:730:3: ruleEmailRecipient
            {
             before(grammarAccess.getAlefasoMailakaAccess().getRecipientsEmailRecipientParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEmailRecipient();

            state._fsp--;

             after(grammarAccess.getAlefasoMailakaAccess().getRecipientsEmailRecipientParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__AlefasoMailaka__RecipientsAssignment_10"


    // $ANTLR start "rule__AlefasoMailaka__RecipientsAssignment_11_1"
    // InternalMail.g:739:1: rule__AlefasoMailaka__RecipientsAssignment_11_1 : ( ruleEmailRecipient ) ;
    public final void rule__AlefasoMailaka__RecipientsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:743:1: ( ( ruleEmailRecipient ) )
            // InternalMail.g:744:2: ( ruleEmailRecipient )
            {
            // InternalMail.g:744:2: ( ruleEmailRecipient )
            // InternalMail.g:745:3: ruleEmailRecipient
            {
             before(grammarAccess.getAlefasoMailakaAccess().getRecipientsEmailRecipientParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEmailRecipient();

            state._fsp--;

             after(grammarAccess.getAlefasoMailakaAccess().getRecipientsEmailRecipientParserRuleCall_11_1_0()); 

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
    // $ANTLR end "rule__AlefasoMailaka__RecipientsAssignment_11_1"


    // $ANTLR start "rule__AlefasoMailaka__SenderAssignment_14"
    // InternalMail.g:754:1: rule__AlefasoMailaka__SenderAssignment_14 : ( RULE_STRING ) ;
    public final void rule__AlefasoMailaka__SenderAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:758:1: ( ( RULE_STRING ) )
            // InternalMail.g:759:2: ( RULE_STRING )
            {
            // InternalMail.g:759:2: ( RULE_STRING )
            // InternalMail.g:760:3: RULE_STRING
            {
             before(grammarAccess.getAlefasoMailakaAccess().getSenderSTRINGTerminalRuleCall_14_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAlefasoMailakaAccess().getSenderSTRINGTerminalRuleCall_14_0()); 

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
    // $ANTLR end "rule__AlefasoMailaka__SenderAssignment_14"


    // $ANTLR start "rule__AlefasoMailaka__PasswordAssignment_17"
    // InternalMail.g:769:1: rule__AlefasoMailaka__PasswordAssignment_17 : ( RULE_STRING ) ;
    public final void rule__AlefasoMailaka__PasswordAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:773:1: ( ( RULE_STRING ) )
            // InternalMail.g:774:2: ( RULE_STRING )
            {
            // InternalMail.g:774:2: ( RULE_STRING )
            // InternalMail.g:775:3: RULE_STRING
            {
             before(grammarAccess.getAlefasoMailakaAccess().getPasswordSTRINGTerminalRuleCall_17_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAlefasoMailakaAccess().getPasswordSTRINGTerminalRuleCall_17_0()); 

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
    // $ANTLR end "rule__AlefasoMailaka__PasswordAssignment_17"


    // $ANTLR start "rule__EmailRecipient__EmailAssignment"
    // InternalMail.g:784:1: rule__EmailRecipient__EmailAssignment : ( RULE_STRING ) ;
    public final void rule__EmailRecipient__EmailAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMail.g:788:1: ( ( RULE_STRING ) )
            // InternalMail.g:789:2: ( RULE_STRING )
            {
            // InternalMail.g:789:2: ( RULE_STRING )
            // InternalMail.g:790:3: RULE_STRING
            {
             before(grammarAccess.getEmailRecipientAccess().getEmailSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEmailRecipientAccess().getEmailSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__EmailRecipient__EmailAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});

}