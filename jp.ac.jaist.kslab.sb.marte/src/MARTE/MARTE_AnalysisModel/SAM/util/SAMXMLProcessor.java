/**
 */
package MARTE.MARTE_AnalysisModel.SAM.util;

import MARTE.MARTE_AnalysisModel.SAM.SAMPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SAMXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAMXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		SAMPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the SAMResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new SAMResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new SAMResourceFactoryImpl());
		}
		return registrations;
	}

} //SAMXMLProcessor
