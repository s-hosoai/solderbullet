/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegisterFactory
 * @model kind="package"
 * @generated
 */
public interface HwRegisterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HwRegister";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///MARTE/MARTE_DesignModel/HRM/HwSpecification/HwRegister.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MARTE.MARTE_DesignModel.HRM.HwSpesification.HwRegister";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwRegisterPackage eINSTANCE = MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.impl.HwRegisterPackageImpl.init();

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.impl.HwRegisterImpl <em>Hw Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.impl.HwRegisterImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.impl.HwRegisterPackageImpl#getHwRegister()
	 * @generated
	 */
	int HW_REGISTER = 0;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_REGISTER__RES_MULT = HwMemoryPackage.HW_MEMORY__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_REGISTER__IS_PROTECTED = HwMemoryPackage.HW_MEMORY__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_REGISTER__BASE_PROPERTY = HwMemoryPackage.HW_MEMORY__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_REGISTER__BASE_INSTANCE_SPECIFICATION = HwMemoryPackage.HW_MEMORY__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_REGISTER__BASE_CLASSIFIER = HwMemoryPackage.HW_MEMORY__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_REGISTER__BASE_LIFELINE = HwMemoryPackage.HW_MEMORY__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_REGISTER__BASE_CONNECTABLE_ELEMENT = HwMemoryPackage.HW_MEMORY__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_REGISTER__DESCRIPTION = HwMemoryPackage.HW_MEMORY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_REGISTER__PHW_SERVICES = HwMemoryPackage.HW_MEMORY__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_REGISTER__RHW_SERVICES = HwMemoryPackage.HW_MEMORY__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_REGISTER__OWNED_HW = HwMemoryPackage.HW_MEMORY__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_REGISTER__END_POINTS = HwMemoryPackage.HW_MEMORY__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_REGISTER__FREQUENCY = HwMemoryPackage.HW_MEMORY__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_REGISTER__OPERATIONS = HwMemoryPackage.HW_MEMORY__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_REGISTER__ACTIVITIES = HwMemoryPackage.HW_MEMORY__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_REGISTER__NAME = HwMemoryPackage.HW_MEMORY__NAME;

	/**
	 * The feature id for the '<em><b>Element Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_REGISTER__ELEMENT_SIZE = HwMemoryPackage.HW_MEMORY__ELEMENT_SIZE;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_REGISTER__MEMORY_SIZE = HwMemoryPackage.HW_MEMORY__MEMORY_SIZE;

	/**
	 * The feature id for the '<em><b>Adress Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_REGISTER__ADRESS_SIZE = HwMemoryPackage.HW_MEMORY__ADRESS_SIZE;

	/**
	 * The feature id for the '<em><b>Timings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_REGISTER__TIMINGS = HwMemoryPackage.HW_MEMORY__TIMINGS;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_REGISTER__THROUGHPUT = HwMemoryPackage.HW_MEMORY__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_REGISTER__ADDRESS = HwMemoryPackage.HW_MEMORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hw Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_REGISTER_FEATURE_COUNT = HwMemoryPackage.HW_MEMORY_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegister <em>Hw Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Register</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegister
	 * @generated
	 */
	EClass getHwRegister();

	/**
	 * Returns the meta object for the attribute '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegister#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegister#getAddress()
	 * @see #getHwRegister()
	 * @generated
	 */
	EAttribute getHwRegister_Address();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HwRegisterFactory getHwRegisterFactory();

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
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.impl.HwRegisterImpl <em>Hw Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.impl.HwRegisterImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.impl.HwRegisterPackageImpl#getHwRegister()
		 * @generated
		 */
		EClass HW_REGISTER = eINSTANCE.getHwRegister();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_REGISTER__ADDRESS = eINSTANCE.getHwRegister_Address();

	}

} //HwRegisterPackage
