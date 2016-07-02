/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.util;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HwPackageXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPackageXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		HwPackagePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the HwPackageResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new HwPackageResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new HwPackageResourceFactoryImpl());
		}
		return registrations;
	}

} //HwPackageXMLProcessor
