/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.util;

import MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SW_ResourceCorePackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SW_ResourceCoreXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SW_ResourceCoreXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		SW_ResourceCorePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the SW_ResourceCoreResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new SW_ResourceCoreResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new SW_ResourceCoreResourceFactoryImpl());
		}
		return registrations;
	}

} //SW_ResourceCoreXMLProcessor
