/**
 */
package MARTE.MARTE_DesignModel.HRM.HwDiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramFactory
 * @model kind="package"
 * @generated
 */
public interface HwDiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HwDiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///MARTE/MARTE_DesignModel/HRM/HwDiagram.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MARTE.MARTE_DesignModel.HRM.HwDiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwDiagramPackage eINSTANCE = MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwDiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwBlockDiagramImpl <em>Hw Block Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwBlockDiagramImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwDiagramPackageImpl#getHwBlockDiagram()
	 * @generated
	 */
	int HW_BLOCK_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BLOCK_DIAGRAM__PROTOCOLS = 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BLOCK_DIAGRAM__CONNECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BLOCK_DIAGRAM__COMPONENTS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BLOCK_DIAGRAM__NAME = 3;

	/**
	 * The number of structural features of the '<em>Hw Block Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BLOCK_DIAGRAM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwCircuitDiagramImpl <em>Hw Circuit Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwCircuitDiagramImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwDiagramPackageImpl#getHwCircuitDiagram()
	 * @generated
	 */
	int HW_CIRCUIT_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CIRCUIT_DIAGRAM__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Wires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CIRCUIT_DIAGRAM__WIRES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CIRCUIT_DIAGRAM__NAME = 2;

	/**
	 * The number of structural features of the '<em>Hw Circuit Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CIRCUIT_DIAGRAM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwHRMDiagramImpl <em>Hw HRM Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwHRMDiagramImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwDiagramPackageImpl#getHwHRMDiagram()
	 * @generated
	 */
	int HW_HRM_DIAGRAM = 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_HRM_DIAGRAM__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_HRM_DIAGRAM__CONNECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_HRM_DIAGRAM__PROTOCOLS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_HRM_DIAGRAM__NAME = 3;

	/**
	 * The feature id for the '<em><b>Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_HRM_DIAGRAM__DATATYPES = 4;

	/**
	 * The number of structural features of the '<em>Hw HRM Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_HRM_DIAGRAM_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.SRMDiagramImpl <em>SRM Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.SRMDiagramImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwDiagramPackageImpl#getSRMDiagram()
	 * @generated
	 */
	int SRM_DIAGRAM = 3;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRM_DIAGRAM__DEVICES = 0;

	/**
	 * The feature id for the '<em><b>Hwcomponents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRM_DIAGRAM__HWCOMPONENTS = 1;

	/**
	 * The number of structural features of the '<em>SRM Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRM_DIAGRAM_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwBlockDiagram <em>Hw Block Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Block Diagram</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwBlockDiagram
	 * @generated
	 */
	EClass getHwBlockDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwBlockDiagram#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocols</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwBlockDiagram#getProtocols()
	 * @see #getHwBlockDiagram()
	 * @generated
	 */
	EReference getHwBlockDiagram_Protocols();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwBlockDiagram#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwBlockDiagram#getConnections()
	 * @see #getHwBlockDiagram()
	 * @generated
	 */
	EReference getHwBlockDiagram_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwBlockDiagram#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwBlockDiagram#getComponents()
	 * @see #getHwBlockDiagram()
	 * @generated
	 */
	EReference getHwBlockDiagram_Components();

	/**
	 * Returns the meta object for the attribute '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwBlockDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwBlockDiagram#getName()
	 * @see #getHwBlockDiagram()
	 * @generated
	 */
	EAttribute getHwBlockDiagram_Name();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwCircuitDiagram <em>Hw Circuit Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Circuit Diagram</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwCircuitDiagram
	 * @generated
	 */
	EClass getHwCircuitDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwCircuitDiagram#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwCircuitDiagram#getComponents()
	 * @see #getHwCircuitDiagram()
	 * @generated
	 */
	EReference getHwCircuitDiagram_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwCircuitDiagram#getWires <em>Wires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wires</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwCircuitDiagram#getWires()
	 * @see #getHwCircuitDiagram()
	 * @generated
	 */
	EReference getHwCircuitDiagram_Wires();

	/**
	 * Returns the meta object for the attribute '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwCircuitDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwCircuitDiagram#getName()
	 * @see #getHwCircuitDiagram()
	 * @generated
	 */
	EAttribute getHwCircuitDiagram_Name();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwHRMDiagram <em>Hw HRM Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw HRM Diagram</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwHRMDiagram
	 * @generated
	 */
	EClass getHwHRMDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwHRMDiagram#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwHRMDiagram#getComponents()
	 * @see #getHwHRMDiagram()
	 * @generated
	 */
	EReference getHwHRMDiagram_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwHRMDiagram#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwHRMDiagram#getConnections()
	 * @see #getHwHRMDiagram()
	 * @generated
	 */
	EReference getHwHRMDiagram_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwHRMDiagram#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocols</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwHRMDiagram#getProtocols()
	 * @see #getHwHRMDiagram()
	 * @generated
	 */
	EReference getHwHRMDiagram_Protocols();

	/**
	 * Returns the meta object for the attribute '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwHRMDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwHRMDiagram#getName()
	 * @see #getHwHRMDiagram()
	 * @generated
	 */
	EAttribute getHwHRMDiagram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwHRMDiagram#getDatatypes <em>Datatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatypes</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwHRMDiagram#getDatatypes()
	 * @see #getHwHRMDiagram()
	 * @generated
	 */
	EReference getHwHRMDiagram_Datatypes();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.SRMDiagram <em>SRM Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SRM Diagram</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.SRMDiagram
	 * @generated
	 */
	EClass getSRMDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.SRMDiagram#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Devices</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.SRMDiagram#getDevices()
	 * @see #getSRMDiagram()
	 * @generated
	 */
	EReference getSRMDiagram_Devices();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.SRMDiagram#getHwcomponents <em>Hwcomponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hwcomponents</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.SRMDiagram#getHwcomponents()
	 * @see #getSRMDiagram()
	 * @generated
	 */
	EReference getSRMDiagram_Hwcomponents();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HwDiagramFactory getHwDiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwBlockDiagramImpl <em>Hw Block Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwBlockDiagramImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwDiagramPackageImpl#getHwBlockDiagram()
		 * @generated
		 */
		EClass HW_BLOCK_DIAGRAM = eINSTANCE.getHwBlockDiagram();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_BLOCK_DIAGRAM__PROTOCOLS = eINSTANCE.getHwBlockDiagram_Protocols();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_BLOCK_DIAGRAM__CONNECTIONS = eINSTANCE.getHwBlockDiagram_Connections();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_BLOCK_DIAGRAM__COMPONENTS = eINSTANCE.getHwBlockDiagram_Components();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_BLOCK_DIAGRAM__NAME = eINSTANCE.getHwBlockDiagram_Name();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwCircuitDiagramImpl <em>Hw Circuit Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwCircuitDiagramImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwDiagramPackageImpl#getHwCircuitDiagram()
		 * @generated
		 */
		EClass HW_CIRCUIT_DIAGRAM = eINSTANCE.getHwCircuitDiagram();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_CIRCUIT_DIAGRAM__COMPONENTS = eINSTANCE.getHwCircuitDiagram_Components();

		/**
		 * The meta object literal for the '<em><b>Wires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_CIRCUIT_DIAGRAM__WIRES = eINSTANCE.getHwCircuitDiagram_Wires();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_CIRCUIT_DIAGRAM__NAME = eINSTANCE.getHwCircuitDiagram_Name();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwHRMDiagramImpl <em>Hw HRM Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwHRMDiagramImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwDiagramPackageImpl#getHwHRMDiagram()
		 * @generated
		 */
		EClass HW_HRM_DIAGRAM = eINSTANCE.getHwHRMDiagram();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_HRM_DIAGRAM__COMPONENTS = eINSTANCE.getHwHRMDiagram_Components();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_HRM_DIAGRAM__CONNECTIONS = eINSTANCE.getHwHRMDiagram_Connections();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_HRM_DIAGRAM__PROTOCOLS = eINSTANCE.getHwHRMDiagram_Protocols();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_HRM_DIAGRAM__NAME = eINSTANCE.getHwHRMDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Datatypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_HRM_DIAGRAM__DATATYPES = eINSTANCE.getHwHRMDiagram_Datatypes();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.SRMDiagramImpl <em>SRM Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.SRMDiagramImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwDiagramPackageImpl#getSRMDiagram()
		 * @generated
		 */
		EClass SRM_DIAGRAM = eINSTANCE.getSRMDiagram();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRM_DIAGRAM__DEVICES = eINSTANCE.getSRMDiagram_Devices();

		/**
		 * The meta object literal for the '<em><b>Hwcomponents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRM_DIAGRAM__HWCOMPONENTS = eINSTANCE.getSRMDiagram_Hwcomponents();

	}

} //HwDiagramPackage
