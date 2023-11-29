/*
 * generated by Xtext 2.32.0
 */
grammar InternalMail;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getAlefasoMailakaParserRuleCall()); }
		ruleAlefasoMailaka
		{ after(grammarAccess.getModelAccess().getAlefasoMailakaParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAlefasoMailaka
entryRuleAlefasoMailaka
:
{ before(grammarAccess.getAlefasoMailakaRule()); }
	 ruleAlefasoMailaka
{ after(grammarAccess.getAlefasoMailakaRule()); } 
	 EOF 
;

// Rule AlefasoMailaka
ruleAlefasoMailaka 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAlefasoMailakaAccess().getGroup()); }
		(rule__AlefasoMailaka__Group__0)
		{ after(grammarAccess.getAlefasoMailakaAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEmailRecipient
entryRuleEmailRecipient
:
{ before(grammarAccess.getEmailRecipientRule()); }
	 ruleEmailRecipient
{ after(grammarAccess.getEmailRecipientRule()); } 
	 EOF 
;

// Rule EmailRecipient
ruleEmailRecipient 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEmailRecipientAccess().getEmailAssignment()); }
		(rule__EmailRecipient__EmailAssignment)
		{ after(grammarAccess.getEmailRecipientAccess().getEmailAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlefasoMailaka__Group__0__Impl
	rule__AlefasoMailaka__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlefasoMailakaAccess().getAlefasoMailakaKeyword_0()); }
	'AlefasoMailaka'
	{ after(grammarAccess.getAlefasoMailakaAccess().getAlefasoMailakaKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlefasoMailaka__Group__1__Impl
	rule__AlefasoMailaka__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlefasoMailakaAccess().getLeftSquareBracketKeyword_1()); }
	'['
	{ after(grammarAccess.getAlefasoMailakaAccess().getLeftSquareBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlefasoMailaka__Group__2__Impl
	rule__AlefasoMailaka__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlefasoMailakaAccess().getHafatraKeyword_2()); }
	'Hafatra'
	{ after(grammarAccess.getAlefasoMailakaAccess().getHafatraKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlefasoMailaka__Group__3__Impl
	rule__AlefasoMailaka__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlefasoMailakaAccess().getColonKeyword_3()); }
	':'
	{ after(grammarAccess.getAlefasoMailakaAccess().getColonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlefasoMailaka__Group__4__Impl
	rule__AlefasoMailaka__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlefasoMailakaAccess().getMessageAssignment_4()); }
	(rule__AlefasoMailaka__MessageAssignment_4)
	{ after(grammarAccess.getAlefasoMailakaAccess().getMessageAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlefasoMailaka__Group__5__Impl
	rule__AlefasoMailaka__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlefasoMailakaAccess().getLohahevitraKeyword_5()); }
	'Lohahevitra'
	{ after(grammarAccess.getAlefasoMailakaAccess().getLohahevitraKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlefasoMailaka__Group__6__Impl
	rule__AlefasoMailaka__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlefasoMailakaAccess().getColonKeyword_6()); }
	':'
	{ after(grammarAccess.getAlefasoMailakaAccess().getColonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlefasoMailaka__Group__7__Impl
	rule__AlefasoMailaka__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlefasoMailakaAccess().getObjet_de_mailAssignment_7()); }
	(rule__AlefasoMailaka__Objet_de_mailAssignment_7)
	{ after(grammarAccess.getAlefasoMailakaAccess().getObjet_de_mailAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlefasoMailaka__Group__8__Impl
	rule__AlefasoMailaka__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlefasoMailakaAccess().getAnyaminyKeyword_8()); }
	'Anyaminy'
	{ after(grammarAccess.getAlefasoMailakaAccess().getAnyaminyKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlefasoMailaka__Group__9__Impl
	rule__AlefasoMailaka__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlefasoMailakaAccess().getColonKeyword_9()); }
	':'
	{ after(grammarAccess.getAlefasoMailakaAccess().getColonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlefasoMailaka__Group__10__Impl
	rule__AlefasoMailaka__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlefasoMailakaAccess().getRecipientsAssignment_10()); }
	(rule__AlefasoMailaka__RecipientsAssignment_10)
	{ after(grammarAccess.getAlefasoMailakaAccess().getRecipientsAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlefasoMailaka__Group__11__Impl
	rule__AlefasoMailaka__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlefasoMailakaAccess().getGroup_11()); }
	(rule__AlefasoMailaka__Group_11__0)*
	{ after(grammarAccess.getAlefasoMailakaAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlefasoMailaka__Group__12__Impl
	rule__AlefasoMailaka__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlefasoMailakaAccess().getMpandefaKeyword_12()); }
	'Mpandefa'
	{ after(grammarAccess.getAlefasoMailakaAccess().getMpandefaKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlefasoMailaka__Group__13__Impl
	rule__AlefasoMailaka__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlefasoMailakaAccess().getColonKeyword_13()); }
	':'
	{ after(grammarAccess.getAlefasoMailakaAccess().getColonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlefasoMailaka__Group__14__Impl
	rule__AlefasoMailaka__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlefasoMailakaAccess().getSenderAssignment_14()); }
	(rule__AlefasoMailaka__SenderAssignment_14)
	{ after(grammarAccess.getAlefasoMailakaAccess().getSenderAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlefasoMailaka__Group__15__Impl
	rule__AlefasoMailaka__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlefasoMailakaAccess().getTenymiafinaKeyword_15()); }
	'Tenymiafina'
	{ after(grammarAccess.getAlefasoMailakaAccess().getTenymiafinaKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlefasoMailaka__Group__16__Impl
	rule__AlefasoMailaka__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlefasoMailakaAccess().getColonKeyword_16()); }
	':'
	{ after(grammarAccess.getAlefasoMailakaAccess().getColonKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlefasoMailaka__Group__17__Impl
	rule__AlefasoMailaka__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlefasoMailakaAccess().getPasswordAssignment_17()); }
	(rule__AlefasoMailaka__PasswordAssignment_17)
	{ after(grammarAccess.getAlefasoMailakaAccess().getPasswordAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlefasoMailaka__Group__18__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlefasoMailakaAccess().getRightSquareBracketKeyword_18()); }
	']'
	{ after(grammarAccess.getAlefasoMailakaAccess().getRightSquareBracketKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AlefasoMailaka__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlefasoMailaka__Group_11__0__Impl
	rule__AlefasoMailaka__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlefasoMailakaAccess().getCommaKeyword_11_0()); }
	','
	{ after(grammarAccess.getAlefasoMailakaAccess().getCommaKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlefasoMailaka__Group_11__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlefasoMailakaAccess().getRecipientsAssignment_11_1()); }
	(rule__AlefasoMailaka__RecipientsAssignment_11_1)
	{ after(grammarAccess.getAlefasoMailakaAccess().getRecipientsAssignment_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AlefasoMailaka__MessageAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAlefasoMailakaAccess().getMessageSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getAlefasoMailakaAccess().getMessageSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__Objet_de_mailAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAlefasoMailakaAccess().getObjet_de_mailSTRINGTerminalRuleCall_7_0()); }
		RULE_STRING
		{ after(grammarAccess.getAlefasoMailakaAccess().getObjet_de_mailSTRINGTerminalRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__RecipientsAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAlefasoMailakaAccess().getRecipientsEmailRecipientParserRuleCall_10_0()); }
		ruleEmailRecipient
		{ after(grammarAccess.getAlefasoMailakaAccess().getRecipientsEmailRecipientParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__RecipientsAssignment_11_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAlefasoMailakaAccess().getRecipientsEmailRecipientParserRuleCall_11_1_0()); }
		ruleEmailRecipient
		{ after(grammarAccess.getAlefasoMailakaAccess().getRecipientsEmailRecipientParserRuleCall_11_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__SenderAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAlefasoMailakaAccess().getSenderSTRINGTerminalRuleCall_14_0()); }
		RULE_STRING
		{ after(grammarAccess.getAlefasoMailakaAccess().getSenderSTRINGTerminalRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlefasoMailaka__PasswordAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAlefasoMailakaAccess().getPasswordSTRINGTerminalRuleCall_17_0()); }
		RULE_STRING
		{ after(grammarAccess.getAlefasoMailakaAccess().getPasswordSTRINGTerminalRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EmailRecipient__EmailAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEmailRecipientAccess().getEmailSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEmailRecipientAccess().getEmailSTRINGTerminalRuleCall_0()); }
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
