/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.util;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HwComputingXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwComputingXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		HwComputingPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the HwComputingResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new HwComputingResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new HwComputingResourceFactoryImpl());
		}
		return registrations;
	}

} //HwComputingXMLProcessor
