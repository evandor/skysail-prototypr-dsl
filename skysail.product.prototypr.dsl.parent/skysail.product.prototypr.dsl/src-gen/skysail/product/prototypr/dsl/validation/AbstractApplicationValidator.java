/*
 * generated by Xtext 2.10.0
 */
package skysail.product.prototypr.dsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractApplicationValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(skysail.product.prototypr.dsl.application.ApplicationPackage.eINSTANCE);
		return result;
	}
	
}