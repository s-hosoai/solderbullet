/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Interaction.util;

import MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SW_InteractionXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SW_InteractionXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		SW_InteractionPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the SW_InteractionResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new SW_InteractionResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new SW_InteractionResourceFactoryImpl());
		}
		return registrations;
	}

} //SW_InteractionXMLProcessor
