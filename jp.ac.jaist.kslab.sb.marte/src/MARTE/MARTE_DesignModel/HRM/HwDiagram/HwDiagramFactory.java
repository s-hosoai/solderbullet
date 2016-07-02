/**
 */
package MARTE.MARTE_DesignModel.HRM.HwDiagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage
 * @generated
 */
public interface HwDiagramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwDiagramFactory eINSTANCE = MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwDiagramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hw Block Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw Block Diagram</em>'.
	 * @generated
	 */
	HwBlockDiagram createHwBlockDiagram();

	/**
	 * Returns a new object of class '<em>Hw Circuit Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw Circuit Diagram</em>'.
	 * @generated
	 */
	HwCircuitDiagram createHwCircuitDiagram();

	/**
	 * Returns a new object of class '<em>Hw HRM Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw HRM Diagram</em>'.
	 * @generated
	 */
	HwHRMDiagram createHwHRMDiagram();

	/**
	 * Returns a new object of class '<em>SRM Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SRM Diagram</em>'.
	 * @generated
	 */
	SRMDiagram createSRMDiagram();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HwDiagramPackage getHwDiagramPackage();

} //HwDiagramFactory
