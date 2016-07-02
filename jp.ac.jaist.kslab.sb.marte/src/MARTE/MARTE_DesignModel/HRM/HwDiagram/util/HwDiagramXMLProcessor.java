/**
 */
package MARTE.MARTE_DesignModel.HRM.HwDiagram.util;

import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HwDiagramXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwDiagramXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		HwDiagramPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the HwDiagramResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new HwDiagramResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new HwDiagramResourceFactoryImpl());
		}
		return registrations;
	}

} //HwDiagramXMLProcessor
