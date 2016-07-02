/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.util;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegisterPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HwRegisterXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwRegisterXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		HwRegisterPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the HwRegisterResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new HwRegisterResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new HwRegisterResourceFactoryImpl());
		}
		return registrations;
	}

} //HwRegisterXMLProcessor
