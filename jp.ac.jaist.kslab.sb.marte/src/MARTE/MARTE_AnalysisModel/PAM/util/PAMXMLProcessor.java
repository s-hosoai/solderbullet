/**
 */
package MARTE.MARTE_AnalysisModel.PAM.util;

import MARTE.MARTE_AnalysisModel.PAM.PAMPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PAMXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PAMXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		PAMPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the PAMResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new PAMResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new PAMResourceFactoryImpl());
		}
		return registrations;
	}

} //PAMXMLProcessor
