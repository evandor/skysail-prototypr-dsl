/*
 * generated by Xtext 2.10.0
 */
package skysail.product.prototypr.dsl.idea

import org.eclipse.xtext.ISetup
import org.eclipse.xtext.idea.extensions.EcoreGlobalRegistries

class ApplicationIdeaSetup implements ISetup {

	override createInjectorAndDoEMFRegistration() {
		EcoreGlobalRegistries.ensureInitialized
		new ApplicationStandaloneSetupIdea().createInjector
	}

}