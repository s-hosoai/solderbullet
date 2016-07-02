/**
 */
package MARTE.MARTE_Foundations.NFPs.util;

import MARTE.MARTE_Foundations.NFPs.NFPsPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NFPsXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFPsXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		NFPsPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the NFPsResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new NFPsResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new NFPsResourceFactoryImpl());
		}
		return registrations;
	}

} //NFPsXMLProcessor
