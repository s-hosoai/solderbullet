package jp.ac.jaist.kslab.sb.marte.dsl.circuit.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractCircuitDslJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http:///MARTE/MARTE_DesignModel/HRM/HwDiagram.ecore"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http:///MARTE/MARTE_DesignModel/HRM/HwSpecification/HwPackage.ecore"));
		return result;
	}

}
