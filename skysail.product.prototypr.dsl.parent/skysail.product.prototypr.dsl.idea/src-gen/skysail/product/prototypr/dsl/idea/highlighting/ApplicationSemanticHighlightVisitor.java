/*
 * generated by Xtext 2.10.0
 */
package skysail.product.prototypr.dsl.idea.highlighting;

import org.eclipse.xtext.idea.highlighting.SemanticHighlightVisitor;
import skysail.product.prototypr.dsl.idea.lang.ApplicationLanguage;

public class ApplicationSemanticHighlightVisitor extends SemanticHighlightVisitor {
	public ApplicationSemanticHighlightVisitor() {
		ApplicationLanguage.INSTANCE.injectMembers(this);
	}
}
