/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDeviceFunction.util;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDeviceFunction.HwDeviceFunctionPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HwDeviceFunctionXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwDeviceFunctionXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		HwDeviceFunctionPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the HwDeviceFunctionResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new HwDeviceFunctionResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new HwDeviceFunctionResourceFactoryImpl());
		}
		return registrations;
	}

} //HwDeviceFunctionXMLProcessor
