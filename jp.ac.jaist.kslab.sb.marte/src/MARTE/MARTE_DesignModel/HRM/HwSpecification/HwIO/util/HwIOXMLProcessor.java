/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.util;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwIOPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HwIOXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwIOXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		HwIOPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the HwIOResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new HwIOResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new HwIOResourceFactoryImpl());
		}
		return registrations;
	}

} //HwIOXMLProcessor
