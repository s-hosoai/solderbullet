/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package blockdiagram;

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
 * @see blockdiagram.BlockdiagramFactory
 * @model kind="package"
 * @generated
 */
public interface BlockdiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "blockdiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blockdiagram/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "blockdiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BlockdiagramPackage eINSTANCE = blockdiagram.impl.BlockdiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link blockdiagram.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockdiagram.impl.DiagramImpl
	 * @see blockdiagram.impl.BlockdiagramPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Com</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__COM = 0;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link blockdiagram.impl.HwComponentImpl <em>Hw Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockdiagram.impl.HwComponentImpl
	 * @see blockdiagram.impl.BlockdiagramPackageImpl#getHwComponent()
	 * @generated
	 */
	int HW_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Conection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__CONECTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Hw Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link blockdiagram.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockdiagram.impl.ConnectionImpl
	 * @see blockdiagram.impl.BlockdiagramPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__REF = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link blockdiagram.impl.MCUImpl <em>MCU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockdiagram.impl.MCUImpl
	 * @see blockdiagram.impl.BlockdiagramPackageImpl#getMCU()
	 * @generated
	 */
	int MCU = 3;

	/**
	 * The feature id for the '<em><b>Conection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCU__CONECTION = HW_COMPONENT__CONECTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCU__NAME = HW_COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>MCU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCU_FEATURE_COUNT = HW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockdiagram.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockdiagram.impl.DeviceImpl
	 * @see blockdiagram.impl.BlockdiagramPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 4;

	/**
	 * The feature id for the '<em><b>Conection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__CONECTION = HW_COMPONENT__CONECTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = HW_COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = HW_COMPONENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link blockdiagram.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see blockdiagram.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link blockdiagram.Diagram#getCom <em>Com</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Com</em>'.
	 * @see blockdiagram.Diagram#getCom()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Com();

	/**
	 * Returns the meta object for class '{@link blockdiagram.HwComponent <em>Hw Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Component</em>'.
	 * @see blockdiagram.HwComponent
	 * @generated
	 */
	EClass getHwComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link blockdiagram.HwComponent#getConection <em>Conection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conection</em>'.
	 * @see blockdiagram.HwComponent#getConection()
	 * @see #getHwComponent()
	 * @generated
	 */
	EReference getHwComponent_Conection();

	/**
	 * Returns the meta object for the attribute '{@link blockdiagram.HwComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see blockdiagram.HwComponent#getName()
	 * @see #getHwComponent()
	 * @generated
	 */
	EAttribute getHwComponent_Name();

	/**
	 * Returns the meta object for class '{@link blockdiagram.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see blockdiagram.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link blockdiagram.Connection#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see blockdiagram.Connection#getRef()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Ref();

	/**
	 * Returns the meta object for the attribute '{@link blockdiagram.Connection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see blockdiagram.Connection#getName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Name();

	/**
	 * Returns the meta object for class '{@link blockdiagram.MCU <em>MCU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MCU</em>'.
	 * @see blockdiagram.MCU
	 * @generated
	 */
	EClass getMCU();

	/**
	 * Returns the meta object for class '{@link blockdiagram.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see blockdiagram.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BlockdiagramFactory getBlockdiagramFactory();

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
		 * The meta object literal for the '{@link blockdiagram.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockdiagram.impl.DiagramImpl
		 * @see blockdiagram.impl.BlockdiagramPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Com</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__COM = eINSTANCE.getDiagram_Com();

		/**
		 * The meta object literal for the '{@link blockdiagram.impl.HwComponentImpl <em>Hw Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockdiagram.impl.HwComponentImpl
		 * @see blockdiagram.impl.BlockdiagramPackageImpl#getHwComponent()
		 * @generated
		 */
		EClass HW_COMPONENT = eINSTANCE.getHwComponent();

		/**
		 * The meta object literal for the '<em><b>Conection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_COMPONENT__CONECTION = eINSTANCE.getHwComponent_Conection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_COMPONENT__NAME = eINSTANCE.getHwComponent_Name();

		/**
		 * The meta object literal for the '{@link blockdiagram.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockdiagram.impl.ConnectionImpl
		 * @see blockdiagram.impl.BlockdiagramPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__REF = eINSTANCE.getConnection_Ref();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__NAME = eINSTANCE.getConnection_Name();

		/**
		 * The meta object literal for the '{@link blockdiagram.impl.MCUImpl <em>MCU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockdiagram.impl.MCUImpl
		 * @see blockdiagram.impl.BlockdiagramPackageImpl#getMCU()
		 * @generated
		 */
		EClass MCU = eINSTANCE.getMCU();

		/**
		 * The meta object literal for the '{@link blockdiagram.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockdiagram.impl.DeviceImpl
		 * @see blockdiagram.impl.BlockdiagramPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

	}

} //BlockdiagramPackage
