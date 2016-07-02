/**
 */
package MARTE.MARTE_DesignModel.HLAM.util;

import MARTE.MARTE_DesignModel.HLAM.HLAMPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HLAMXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLAMXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		HLAMPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the HLAMResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new HLAMResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new HLAMResourceFactoryImpl());
		}
		return registrations;
	}

} //HLAMXMLProcessor
