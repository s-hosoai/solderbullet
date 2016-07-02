/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Concurrency.util;

import MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SW_ConcurrencyXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SW_ConcurrencyXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		SW_ConcurrencyPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the SW_ConcurrencyResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new SW_ConcurrencyResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new SW_ConcurrencyResourceFactoryImpl());
		}
		return registrations;
	}

} //SW_ConcurrencyXMLProcessor
