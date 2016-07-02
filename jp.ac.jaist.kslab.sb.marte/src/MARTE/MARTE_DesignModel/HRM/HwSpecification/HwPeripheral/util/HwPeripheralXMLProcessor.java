/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.util;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.HwPeripheralPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HwPeripheralXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPeripheralXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		HwPeripheralPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the HwPeripheralResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new HwPeripheralResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new HwPeripheralResourceFactoryImpl());
		}
		return registrations;
	}

} //HwPeripheralXMLProcessor
