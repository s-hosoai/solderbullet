/**
 */
package MARTE.MARTE_DesignModel.HRM.HwGeneral.util;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HwGeneralXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwGeneralXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		HwGeneralPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the HwGeneralResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new HwGeneralResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new HwGeneralResourceFactoryImpl());
		}
		return registrations;
	}

} //HwGeneralXMLProcessor
