/*
 * generated by Xtext 2.10.0
 */
package skysail.product.prototypr.dsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import skysail.product.prototypr.dsl.parser.antlr.internal.InternalApplicationParser;
import skysail.product.prototypr.dsl.services.ApplicationGrammarAccess;

public class ApplicationParser extends AbstractAntlrParser {

	@Inject
	private ApplicationGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalApplicationParser createParser(XtextTokenStream stream) {
		return new InternalApplicationParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Application";
	}

	public ApplicationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ApplicationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
