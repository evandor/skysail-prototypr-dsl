/*
 * generated by Xtext 2.10.0
 */
grammar PsiInternalApplication;

options {
	superClass=AbstractPsiAntlrParser;
}

@lexer::header {
package skysail.product.prototypr.dsl.idea.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package skysail.product.prototypr.dsl.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import skysail.product.prototypr.dsl.idea.lang.ApplicationElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import skysail.product.prototypr.dsl.services.ApplicationGrammarAccess;

import com.intellij.lang.PsiBuilder;
}

@parser::members {

	protected ApplicationGrammarAccess grammarAccess;

	protected ApplicationElementTypeProvider elementTypeProvider;

	public PsiInternalApplicationParser(PsiBuilder builder, TokenStream input, ApplicationElementTypeProvider elementTypeProvider, ApplicationGrammarAccess grammarAccess) {
		this(input);
		setPsiBuilder(builder);
		this.grammarAccess = grammarAccess;
		this.elementTypeProvider = elementTypeProvider;
	}

	@Override
	protected String getFirstRuleName() {
		return "Model";
	}

}

//Entry rule entryRuleModel
entryRuleModel returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getModelElementType()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [Boolean current=false]
:
	(
		(
			{
				markComposite(elementTypeProvider.getModel_GreetingsGreetingParserRuleCall_0ElementType());
			}
			lv_greetings_0_0=ruleGreeting
			{
				doneComposite();
				if(!$current) {
					associateWithSemanticElement();
					$current = true;
				}
			}
		)
	)*
;

//Entry rule entryRuleGreeting
entryRuleGreeting returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getGreetingElementType()); }
	iv_ruleGreeting=ruleGreeting
	{ $current=$iv_ruleGreeting.current; }
	EOF;

// Rule Greeting
ruleGreeting returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getGreeting_HelloKeyword_0ElementType());
		}
		otherlv_0='Hello'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getGreeting_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getGreeting_ExclamationMarkKeyword_2ElementType());
		}
		otherlv_2='!'
		{
			doneLeaf(otherlv_2);
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;