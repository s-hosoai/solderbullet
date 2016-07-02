/**
 */
package MARTE.MARTE_Foundations.CoreElements.util;

import MARTE.MARTE_Foundations.CoreElements.CoreElementsPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreElementsXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreElementsXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		CoreElementsPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the CoreElementsResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new CoreElementsResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new CoreElementsResourceFactoryImpl());
		}
		return registrations;
	}

} //CoreElementsXMLProcessor
