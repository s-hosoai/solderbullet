/**
 */
package MARTE.MARTE_DesignModel.HRM.HwProtocol;

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
 * @see MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocolFactory
 * @model kind="package"
 * @generated
 */
public interface HwProtocolPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HwProtocol";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///MARTE/MARTE_DesignModel/HRM/HwProtocol.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MARTE.MARTE_DesignModel.HSM.HwProtocol";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwProtocolPackage eINSTANCE = MARTE.MARTE_DesignModel.HRM.HwProtocol.impl.HwProtocolPackageImpl.init();

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwProtocol.impl.HwProtocolImpl <em>Hw Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwProtocol.impl.HwProtocolImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwProtocol.impl.HwProtocolPackageImpl#getHwProtocol()
	 * @generated
	 */
	int HW_PROTOCOL = 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROTOCOL__OPERATIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROTOCOL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Hw Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROTOCOL_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocol <em>Hw Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Protocol</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocol
	 * @generated
	 */
	EClass getHwProtocol();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocol#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocol#getOperations()
	 * @see #getHwProtocol()
	 * @generated
	 */
	EReference getHwProtocol_Operations();

	/**
	 * Returns the meta object for the attribute '{@link MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocol#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocol#getName()
	 * @see #getHwProtocol()
	 * @generated
	 */
	EAttribute getHwProtocol_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HwProtocolFactory getHwProtocolFactory();

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
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwProtocol.impl.HwProtocolImpl <em>Hw Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwProtocol.impl.HwProtocolImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwProtocol.impl.HwProtocolPackageImpl#getHwProtocol()
		 * @generated
		 */
		EClass HW_PROTOCOL = eINSTANCE.getHwProtocol();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PROTOCOL__OPERATIONS = eINSTANCE.getHwProtocol_Operations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_PROTOCOL__NAME = eINSTANCE.getHwProtocol_Name();

	}

} //HwProtocolPackage
