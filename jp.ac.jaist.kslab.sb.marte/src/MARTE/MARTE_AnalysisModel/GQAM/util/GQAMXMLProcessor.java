/**
 */
package MARTE.MARTE_AnalysisModel.GQAM.util;

import MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GQAMXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GQAMXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		GQAMPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the GQAMResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new GQAMResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new GQAMResourceFactoryImpl());
		}
		return registrations;
	}

} //GQAMXMLProcessor
