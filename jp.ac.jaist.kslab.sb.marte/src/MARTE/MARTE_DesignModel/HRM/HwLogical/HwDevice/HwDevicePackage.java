/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage;

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
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDeviceFactory
 * @model kind="package"
 * @generated
 */
public interface HwDevicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HwDevice";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///MARTE/MARTE_DesignModel/HRM/HwLogical/HwDevice.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwDevicePackage eINSTANCE = MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDevicePackageImpl.init();

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDeviceImpl <em>Hw Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDeviceImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDevicePackageImpl#getHwDevice()
	 * @generated
	 */
	int HW_DEVICE = 0;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__RES_MULT = HwGeneralPackage.HW_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__IS_PROTECTED = HwGeneralPackage.HW_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__BASE_PROPERTY = HwGeneralPackage.HW_RESOURCE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__BASE_INSTANCE_SPECIFICATION = HwGeneralPackage.HW_RESOURCE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__BASE_CLASSIFIER = HwGeneralPackage.HW_RESOURCE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__BASE_LIFELINE = HwGeneralPackage.HW_RESOURCE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__BASE_CONNECTABLE_ELEMENT = HwGeneralPackage.HW_RESOURCE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__DESCRIPTION = HwGeneralPackage.HW_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__PHW_SERVICES = HwGeneralPackage.HW_RESOURCE__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__RHW_SERVICES = HwGeneralPackage.HW_RESOURCE__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__OWNED_HW = HwGeneralPackage.HW_RESOURCE__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__END_POINTS = HwGeneralPackage.HW_RESOURCE__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__FREQUENCY = HwGeneralPackage.HW_RESOURCE__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__OPERATIONS = HwGeneralPackage.HW_RESOURCE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__ACTIVITIES = HwGeneralPackage.HW_RESOURCE__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__NAME = HwGeneralPackage.HW_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__SPEED_FACTOR = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__MAIN_SCHEDULER = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__FUNCTIONS = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compliant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__COMPLIANT = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__PACKAGES = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__PINS = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__REGISTERS = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE__PORTS = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Hw Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DEVICE_FEATURE_COUNT = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwI_OImpl <em>Hw IO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwI_OImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDevicePackageImpl#getHwI_O()
	 * @generated
	 */
	int HW_IO = 1;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__RES_MULT = HW_DEVICE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__IS_PROTECTED = HW_DEVICE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__BASE_PROPERTY = HW_DEVICE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__BASE_INSTANCE_SPECIFICATION = HW_DEVICE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__BASE_CLASSIFIER = HW_DEVICE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__BASE_LIFELINE = HW_DEVICE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__BASE_CONNECTABLE_ELEMENT = HW_DEVICE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__DESCRIPTION = HW_DEVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__PHW_SERVICES = HW_DEVICE__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__RHW_SERVICES = HW_DEVICE__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__OWNED_HW = HW_DEVICE__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__END_POINTS = HW_DEVICE__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__FREQUENCY = HW_DEVICE__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__OPERATIONS = HW_DEVICE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__ACTIVITIES = HW_DEVICE__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__NAME = HW_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__SPEED_FACTOR = HW_DEVICE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__MAIN_SCHEDULER = HW_DEVICE__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__FUNCTIONS = HW_DEVICE__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Compliant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__COMPLIANT = HW_DEVICE__COMPLIANT;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__PACKAGES = HW_DEVICE__PACKAGES;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__PINS = HW_DEVICE__PINS;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__REGISTERS = HW_DEVICE__REGISTERS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO__PORTS = HW_DEVICE__PORTS;

	/**
	 * The number of structural features of the '<em>Hw IO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_IO_FEATURE_COUNT = HW_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwSupportImpl <em>Hw Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwSupportImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDevicePackageImpl#getHwSupport()
	 * @generated
	 */
	int HW_SUPPORT = 2;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__RES_MULT = HW_DEVICE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__IS_PROTECTED = HW_DEVICE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__BASE_PROPERTY = HW_DEVICE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__BASE_INSTANCE_SPECIFICATION = HW_DEVICE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__BASE_CLASSIFIER = HW_DEVICE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__BASE_LIFELINE = HW_DEVICE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__BASE_CONNECTABLE_ELEMENT = HW_DEVICE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__DESCRIPTION = HW_DEVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__PHW_SERVICES = HW_DEVICE__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__RHW_SERVICES = HW_DEVICE__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__OWNED_HW = HW_DEVICE__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__END_POINTS = HW_DEVICE__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__FREQUENCY = HW_DEVICE__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__OPERATIONS = HW_DEVICE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__ACTIVITIES = HW_DEVICE__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__NAME = HW_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__SPEED_FACTOR = HW_DEVICE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__MAIN_SCHEDULER = HW_DEVICE__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__FUNCTIONS = HW_DEVICE__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Compliant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__COMPLIANT = HW_DEVICE__COMPLIANT;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__PACKAGES = HW_DEVICE__PACKAGES;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__PINS = HW_DEVICE__PINS;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__REGISTERS = HW_DEVICE__REGISTERS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT__PORTS = HW_DEVICE__PORTS;

	/**
	 * The number of structural features of the '<em>Hw Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SUPPORT_FEATURE_COUNT = HW_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HWActuatorImpl <em>HW Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HWActuatorImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDevicePackageImpl#getHWActuator()
	 * @generated
	 */
	int HW_ACTUATOR = 3;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__RES_MULT = HW_IO__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__IS_PROTECTED = HW_IO__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__BASE_PROPERTY = HW_IO__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__BASE_INSTANCE_SPECIFICATION = HW_IO__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__BASE_CLASSIFIER = HW_IO__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__BASE_LIFELINE = HW_IO__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__BASE_CONNECTABLE_ELEMENT = HW_IO__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__DESCRIPTION = HW_IO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__PHW_SERVICES = HW_IO__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__RHW_SERVICES = HW_IO__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__OWNED_HW = HW_IO__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__END_POINTS = HW_IO__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__FREQUENCY = HW_IO__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__OPERATIONS = HW_IO__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__ACTIVITIES = HW_IO__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__NAME = HW_IO__NAME;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__SPEED_FACTOR = HW_IO__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__MAIN_SCHEDULER = HW_IO__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__FUNCTIONS = HW_IO__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Compliant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__COMPLIANT = HW_IO__COMPLIANT;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__PACKAGES = HW_IO__PACKAGES;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__PINS = HW_IO__PINS;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__REGISTERS = HW_IO__REGISTERS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR__PORTS = HW_IO__PORTS;

	/**
	 * The number of structural features of the '<em>HW Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ACTUATOR_FEATURE_COUNT = HW_IO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HWSensorImpl <em>HW Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HWSensorImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDevicePackageImpl#getHWSensor()
	 * @generated
	 */
	int HW_SENSOR = 4;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__RES_MULT = HW_IO__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__IS_PROTECTED = HW_IO__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__BASE_PROPERTY = HW_IO__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__BASE_INSTANCE_SPECIFICATION = HW_IO__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__BASE_CLASSIFIER = HW_IO__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__BASE_LIFELINE = HW_IO__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__BASE_CONNECTABLE_ELEMENT = HW_IO__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__DESCRIPTION = HW_IO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__PHW_SERVICES = HW_IO__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__RHW_SERVICES = HW_IO__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__OWNED_HW = HW_IO__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__END_POINTS = HW_IO__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__FREQUENCY = HW_IO__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__OPERATIONS = HW_IO__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__ACTIVITIES = HW_IO__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__NAME = HW_IO__NAME;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__SPEED_FACTOR = HW_IO__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__MAIN_SCHEDULER = HW_IO__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__FUNCTIONS = HW_IO__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Compliant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__COMPLIANT = HW_IO__COMPLIANT;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__PACKAGES = HW_IO__PACKAGES;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__PINS = HW_IO__PINS;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__REGISTERS = HW_IO__REGISTERS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR__PORTS = HW_IO__PORTS;

	/**
	 * The number of structural features of the '<em>HW Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SENSOR_FEATURE_COUNT = HW_IO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwPeripheralImpl <em>Hw Peripheral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwPeripheralImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDevicePackageImpl#getHwPeripheral()
	 * @generated
	 */
	int HW_PERIPHERAL = 5;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__RES_MULT = HW_DEVICE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__IS_PROTECTED = HW_DEVICE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__BASE_PROPERTY = HW_DEVICE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__BASE_INSTANCE_SPECIFICATION = HW_DEVICE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__BASE_CLASSIFIER = HW_DEVICE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__BASE_LIFELINE = HW_DEVICE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__BASE_CONNECTABLE_ELEMENT = HW_DEVICE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__DESCRIPTION = HW_DEVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__PHW_SERVICES = HW_DEVICE__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__RHW_SERVICES = HW_DEVICE__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__OWNED_HW = HW_DEVICE__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__END_POINTS = HW_DEVICE__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__FREQUENCY = HW_DEVICE__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__OPERATIONS = HW_DEVICE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__ACTIVITIES = HW_DEVICE__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__NAME = HW_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__SPEED_FACTOR = HW_DEVICE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__MAIN_SCHEDULER = HW_DEVICE__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__FUNCTIONS = HW_DEVICE__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Compliant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__COMPLIANT = HW_DEVICE__COMPLIANT;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__PACKAGES = HW_DEVICE__PACKAGES;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__PINS = HW_DEVICE__PINS;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__REGISTERS = HW_DEVICE__REGISTERS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__PORTS = HW_DEVICE__PORTS;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__IMPLEMENTS = HW_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operationimpls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__OPERATIONIMPLS = HW_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refsfr</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__REFSFR = HW_DEVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__REFPORTS = HW_DEVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Peripheral Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL__PERIPHERAL_ACTIVITIES = HW_DEVICE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Hw Peripheral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PERIPHERAL_FEATURE_COUNT = HW_DEVICE_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice <em>Hw Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Device</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice
	 * @generated
	 */
	EClass getHwDevice();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice#getFunctions()
	 * @see #getHwDevice()
	 * @generated
	 */
	EReference getHwDevice_Functions();

	/**
	 * Returns the meta object for the reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice#getCompliant <em>Compliant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compliant</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice#getCompliant()
	 * @see #getHwDevice()
	 * @generated
	 */
	EReference getHwDevice_Compliant();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice#getPackages()
	 * @see #getHwDevice()
	 * @generated
	 */
	EReference getHwDevice_Packages();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pins</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice#getPins()
	 * @see #getHwDevice()
	 * @generated
	 */
	EReference getHwDevice_Pins();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice#getRegisters <em>Registers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registers</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice#getRegisters()
	 * @see #getHwDevice()
	 * @generated
	 */
	EReference getHwDevice_Registers();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice#getPorts()
	 * @see #getHwDevice()
	 * @generated
	 */
	EReference getHwDevice_Ports();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwI_O <em>Hw IO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw IO</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwI_O
	 * @generated
	 */
	EClass getHwI_O();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwSupport <em>Hw Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Support</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwSupport
	 * @generated
	 */
	EClass getHwSupport();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HWActuator <em>HW Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Actuator</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HWActuator
	 * @generated
	 */
	EClass getHWActuator();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HWSensor <em>HW Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Sensor</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HWSensor
	 * @generated
	 */
	EClass getHWSensor();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral <em>Hw Peripheral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Peripheral</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral
	 * @generated
	 */
	EClass getHwPeripheral();

	/**
	 * Returns the meta object for the reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implements</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral#getImplements()
	 * @see #getHwPeripheral()
	 * @generated
	 */
	EReference getHwPeripheral_Implements();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral#getOperationimpls <em>Operationimpls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operationimpls</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral#getOperationimpls()
	 * @see #getHwPeripheral()
	 * @generated
	 */
	EReference getHwPeripheral_Operationimpls();

	/**
	 * Returns the meta object for the reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral#getRefsfr <em>Refsfr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refsfr</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral#getRefsfr()
	 * @see #getHwPeripheral()
	 * @generated
	 */
	EReference getHwPeripheral_Refsfr();

	/**
	 * Returns the meta object for the reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral#getRefports <em>Refports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refports</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral#getRefports()
	 * @see #getHwPeripheral()
	 * @generated
	 */
	EReference getHwPeripheral_Refports();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral#getPeripheralActivities <em>Peripheral Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Peripheral Activities</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral#getPeripheralActivities()
	 * @see #getHwPeripheral()
	 * @generated
	 */
	EReference getHwPeripheral_PeripheralActivities();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HwDeviceFactory getHwDeviceFactory();

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
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDeviceImpl <em>Hw Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDeviceImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDevicePackageImpl#getHwDevice()
		 * @generated
		 */
		EClass HW_DEVICE = eINSTANCE.getHwDevice();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_DEVICE__FUNCTIONS = eINSTANCE.getHwDevice_Functions();

		/**
		 * The meta object literal for the '<em><b>Compliant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_DEVICE__COMPLIANT = eINSTANCE.getHwDevice_Compliant();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_DEVICE__PACKAGES = eINSTANCE.getHwDevice_Packages();

		/**
		 * The meta object literal for the '<em><b>Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_DEVICE__PINS = eINSTANCE.getHwDevice_Pins();

		/**
		 * The meta object literal for the '<em><b>Registers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_DEVICE__REGISTERS = eINSTANCE.getHwDevice_Registers();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_DEVICE__PORTS = eINSTANCE.getHwDevice_Ports();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwI_OImpl <em>Hw IO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwI_OImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDevicePackageImpl#getHwI_O()
		 * @generated
		 */
		EClass HW_IO = eINSTANCE.getHwI_O();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwSupportImpl <em>Hw Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwSupportImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDevicePackageImpl#getHwSupport()
		 * @generated
		 */
		EClass HW_SUPPORT = eINSTANCE.getHwSupport();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HWActuatorImpl <em>HW Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HWActuatorImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDevicePackageImpl#getHWActuator()
		 * @generated
		 */
		EClass HW_ACTUATOR = eINSTANCE.getHWActuator();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HWSensorImpl <em>HW Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HWSensorImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDevicePackageImpl#getHWSensor()
		 * @generated
		 */
		EClass HW_SENSOR = eINSTANCE.getHWSensor();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwPeripheralImpl <em>Hw Peripheral</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwPeripheralImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDevicePackageImpl#getHwPeripheral()
		 * @generated
		 */
		EClass HW_PERIPHERAL = eINSTANCE.getHwPeripheral();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PERIPHERAL__IMPLEMENTS = eINSTANCE.getHwPeripheral_Implements();

		/**
		 * The meta object literal for the '<em><b>Operationimpls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PERIPHERAL__OPERATIONIMPLS = eINSTANCE.getHwPeripheral_Operationimpls();

		/**
		 * The meta object literal for the '<em><b>Refsfr</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PERIPHERAL__REFSFR = eINSTANCE.getHwPeripheral_Refsfr();

		/**
		 * The meta object literal for the '<em><b>Refports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PERIPHERAL__REFPORTS = eINSTANCE.getHwPeripheral_Refports();

		/**
		 * The meta object literal for the '<em><b>Peripheral Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PERIPHERAL__PERIPHERAL_ACTIVITIES = eINSTANCE.getHwPeripheral_PeripheralActivities();

	}

} //HwDevicePackage
