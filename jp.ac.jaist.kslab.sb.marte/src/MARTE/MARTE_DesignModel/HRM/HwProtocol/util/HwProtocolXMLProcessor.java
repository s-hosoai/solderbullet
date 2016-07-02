/**
 */
package MARTE.MARTE_DesignModel.HRM.HwProtocol.util;

import MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocolPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HwProtocolXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwProtocolXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		HwProtocolPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the HwProtocolResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new HwProtocolResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new HwProtocolResourceFactoryImpl());
		}
		return registrations;
	}

} //HwProtocolXMLProcessor
