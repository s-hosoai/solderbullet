package jp.ac.jaist.kslab.sb.marte.spec.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractSpecDslJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage.eINSTANCE);
		return result;
	}

}
