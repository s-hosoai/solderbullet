/**
 */
package MARTE.MARTE_Annexes.VSL.DataTypes.util;

import MARTE.MARTE_Annexes.VSL.DataTypes.DataTypesPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTypesXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypesXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		DataTypesPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the DataTypesResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new DataTypesResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new DataTypesResourceFactoryImpl());
		}
		return registrations;
	}

} //DataTypesXMLProcessor
