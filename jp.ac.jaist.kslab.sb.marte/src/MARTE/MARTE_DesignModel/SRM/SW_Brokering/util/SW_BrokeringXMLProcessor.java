/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Brokering.util;

import MARTE.MARTE_DesignModel.SRM.SW_Brokering.SW_BrokeringPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SW_BrokeringXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SW_BrokeringXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		SW_BrokeringPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the SW_BrokeringResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new SW_BrokeringResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new SW_BrokeringResourceFactoryImpl());
		}
		return registrations;
	}

} //SW_BrokeringXMLProcessor
