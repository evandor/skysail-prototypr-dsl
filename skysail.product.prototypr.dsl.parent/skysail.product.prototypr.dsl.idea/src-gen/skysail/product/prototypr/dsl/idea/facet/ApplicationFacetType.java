/*
 * generated by Xtext 2.10.0
 */
package skysail.product.prototypr.dsl.idea.facet;

import com.intellij.facet.Facet;
import com.intellij.facet.FacetTypeId;
import org.eclipse.xtext.idea.facet.AbstractFacetType;
import skysail.product.prototypr.dsl.idea.lang.ApplicationLanguage;

public class ApplicationFacetType extends AbstractFacetType<ApplicationFacetConfiguration> {

	public static final FacetTypeId<Facet<ApplicationFacetConfiguration>> TYPEID = new FacetTypeId<Facet<ApplicationFacetConfiguration>>("skysail.product.prototypr.dsl.Application");

	public ApplicationFacetType() {
		super(TYPEID, "skysail.product.prototypr.dsl.Application", "Application");
		ApplicationLanguage.INSTANCE.injectMembers(this);
	}
}