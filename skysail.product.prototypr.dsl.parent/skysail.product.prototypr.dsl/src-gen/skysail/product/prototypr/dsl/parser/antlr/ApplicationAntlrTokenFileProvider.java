/*
 * generated by Xtext 2.10.0
 */
package skysail.product.prototypr.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ApplicationAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("skysail/product/prototypr/dsl/parser/antlr/internal/InternalApplication.tokens");
	}
}
