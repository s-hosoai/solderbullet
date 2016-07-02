/**
 */
package MARTE.MARTE_Foundations.Alloc.util;

import MARTE.MARTE_Foundations.Alloc.AllocPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AllocXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		AllocPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the AllocResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new AllocResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new AllocResourceFactoryImpl());
		}
		return registrations;
	}

} //AllocXMLProcessor
