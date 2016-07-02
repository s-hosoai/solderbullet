/**
 */
package MARTE.MARTE_Annexes.VSL.Variables.util;

import MARTE.MARTE_Annexes.VSL.Variables.VariablesPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VariablesXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariablesXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		VariablesPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the VariablesResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new VariablesResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new VariablesResourceFactoryImpl());
		}
		return registrations;
	}

} //VariablesXMLProcessor
