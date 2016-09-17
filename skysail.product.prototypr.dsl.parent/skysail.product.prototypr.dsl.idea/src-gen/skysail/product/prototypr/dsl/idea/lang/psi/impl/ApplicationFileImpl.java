/*
 * generated by Xtext 2.10.0
 */
package skysail.product.prototypr.dsl.idea.lang.psi.impl;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.eclipse.xtext.psi.impl.BaseXtextFile;
import skysail.product.prototypr.dsl.idea.lang.ApplicationFileType;
import skysail.product.prototypr.dsl.idea.lang.ApplicationLanguage;

public final class ApplicationFileImpl extends BaseXtextFile {

	public ApplicationFileImpl(FileViewProvider viewProvider) {
		super(viewProvider, ApplicationLanguage.INSTANCE);
	}

	@Override
	public FileType getFileType() {
		return ApplicationFileType.INSTANCE;
	}
}
