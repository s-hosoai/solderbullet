/**
 */
package MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.util;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HwPowerXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPowerXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		HwPowerPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the HwPowerResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new HwPowerResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new HwPowerResourceFactoryImpl());
		}
		return registrations;
	}

} //HwPowerXMLProcessor
