/**
 */
package MARTE.MARTE_Foundations.GRM.util;

import MARTE.MARTE_Foundations.GRM.GRMPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GRMXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRMXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		GRMPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the GRMResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new GRMResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new GRMResourceFactoryImpl());
		}
		return registrations;
	}

} //GRMXMLProcessor
