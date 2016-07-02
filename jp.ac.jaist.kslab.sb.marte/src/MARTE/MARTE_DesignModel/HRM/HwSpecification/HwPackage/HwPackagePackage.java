/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage;

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
 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackageFactory
 * @model kind="package"
 * @generated
 */
public interface HwPackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HwPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///MARTE/MARTE_DesignModel/HRM/HwSpecification/HwPackage.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MARTE.MARTE_DesignModel.HRM.HwSpesification.HwPackage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwPackagePackage eINSTANCE = MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackageImpl <em>Hw Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackageImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackagePackageImpl#getHwPackage()
	 * @generated
	 */
	int HW_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE__PINS = 0;

	/**
	 * The feature id for the '<em><b>Pin Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE__PIN_NUM = 1;

	/**
	 * The feature id for the '<em><b>Package Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE__PACKAGE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Hw Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackagePinImpl <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackagePinImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackagePackageImpl#getHwPackagePin()
	 * @generated
	 */
	int HW_PACKAGE_PIN = 1;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_PIN__RES_MULT = HwCommunicationPackage.HW_END_POINT__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_PIN__IS_PROTECTED = HwCommunicationPackage.HW_END_POINT__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_PIN__BASE_PROPERTY = HwCommunicationPackage.HW_END_POINT__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_PIN__BASE_INSTANCE_SPECIFICATION = HwCommunicationPackage.HW_END_POINT__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_PIN__BASE_CLASSIFIER = HwCommunicationPackage.HW_END_POINT__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_PIN__BASE_LIFELINE = HwCommunicationPackage.HW_END_POINT__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_PIN__BASE_CONNECTABLE_ELEMENT = HwCommunicationPackage.HW_END_POINT__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_PIN__DESCRIPTION = HwCommunicationPackage.HW_END_POINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_PIN__PHW_SERVICES = HwCommunicationPackage.HW_END_POINT__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_PIN__RHW_SERVICES = HwCommunicationPackage.HW_END_POINT__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_PIN__OWNED_HW = HwCommunicationPackage.HW_END_POINT__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_PIN__END_POINTS = HwCommunicationPackage.HW_END_POINT__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_PIN__FREQUENCY = HwCommunicationPackage.HW_END_POINT__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_PIN__OPERATIONS = HwCommunicationPackage.HW_END_POINT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_PIN__ACTIVITIES = HwCommunicationPackage.HW_END_POINT__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_PIN__NAME = HwCommunicationPackage.HW_END_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Packet Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_PIN__PACKET_SIZE = HwCommunicationPackage.HW_END_POINT__PACKET_SIZE;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_PIN__CONNECTED_TO = HwCommunicationPackage.HW_END_POINT__CONNECTED_TO;

	/**
	 * The feature id for the '<em><b>Refpin</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_PIN__REFPIN = HwCommunicationPackage.HW_END_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wire</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_PIN__WIRE = HwCommunicationPackage.HW_END_POINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pin No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_PIN__PIN_NO = HwCommunicationPackage.HW_END_POINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alt Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_PIN__ALT_NAMES = HwCommunicationPackage.HW_END_POINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PACKAGE_PIN_FEATURE_COUNT = HwCommunicationPackage.HW_END_POINT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwWireImpl <em>Hw Wire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwWireImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackagePackageImpl#getHwWire()
	 * @generated
	 */
	int HW_WIRE = 2;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__RES_MULT = HwCommunicationPackage.HW_MEDIA__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__IS_PROTECTED = HwCommunicationPackage.HW_MEDIA__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__BASE_PROPERTY = HwCommunicationPackage.HW_MEDIA__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__BASE_INSTANCE_SPECIFICATION = HwCommunicationPackage.HW_MEDIA__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__BASE_CLASSIFIER = HwCommunicationPackage.HW_MEDIA__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__BASE_LIFELINE = HwCommunicationPackage.HW_MEDIA__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__BASE_CONNECTABLE_ELEMENT = HwCommunicationPackage.HW_MEDIA__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__SPEED_FACTOR = HwCommunicationPackage.HW_MEDIA__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__MAIN_SCHEDULER = HwCommunicationPackage.HW_MEDIA__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Element Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__ELEMENT_SIZE = HwCommunicationPackage.HW_MEDIA__ELEMENT_SIZE;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__BASE_CONNECTOR = HwCommunicationPackage.HW_MEDIA__BASE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Transm Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__TRANSM_MODE = HwCommunicationPackage.HW_MEDIA__TRANSM_MODE;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__BLOCK_T = HwCommunicationPackage.HW_MEDIA__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Packet T</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__PACKET_T = HwCommunicationPackage.HW_MEDIA__PACKET_T;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__CAPACITY = HwCommunicationPackage.HW_MEDIA__CAPACITY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__DESCRIPTION = HwCommunicationPackage.HW_MEDIA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__PHW_SERVICES = HwCommunicationPackage.HW_MEDIA__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__RHW_SERVICES = HwCommunicationPackage.HW_MEDIA__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__OWNED_HW = HwCommunicationPackage.HW_MEDIA__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__END_POINTS = HwCommunicationPackage.HW_MEDIA__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__FREQUENCY = HwCommunicationPackage.HW_MEDIA__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__OPERATIONS = HwCommunicationPackage.HW_MEDIA__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__ACTIVITIES = HwCommunicationPackage.HW_MEDIA__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__NAME = HwCommunicationPackage.HW_MEDIA__NAME;

	/**
	 * The feature id for the '<em><b>Band Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__BAND_WIDTH = HwCommunicationPackage.HW_MEDIA__BAND_WIDTH;

	/**
	 * The feature id for the '<em><b>Arbiters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE__ARBITERS = HwCommunicationPackage.HW_MEDIA__ARBITERS;

	/**
	 * The number of structural features of the '<em>Hw Wire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_WIRE_FEATURE_COUNT = HwCommunicationPackage.HW_MEDIA_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage <em>Hw Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Package</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage
	 * @generated
	 */
	EClass getHwPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pins</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage#getPins()
	 * @see #getHwPackage()
	 * @generated
	 */
	EReference getHwPackage_Pins();

	/**
	 * Returns the meta object for the attribute '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage#getPinNum <em>Pin Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Num</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage#getPinNum()
	 * @see #getHwPackage()
	 * @generated
	 */
	EAttribute getHwPackage_PinNum();

	/**
	 * Returns the meta object for the attribute '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage#getPackageType <em>Package Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Type</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage#getPackageType()
	 * @see #getHwPackage()
	 * @generated
	 */
	EAttribute getHwPackage_PackageType();

	/**
	 * Returns the meta object for the attribute '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage#getName()
	 * @see #getHwPackage()
	 * @generated
	 */
	EAttribute getHwPackage_Name();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin
	 * @generated
	 */
	EClass getHwPackagePin();

	/**
	 * Returns the meta object for the reference list '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin#getRefpin <em>Refpin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refpin</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin#getRefpin()
	 * @see #getHwPackagePin()
	 * @generated
	 */
	EReference getHwPackagePin_Refpin();

	/**
	 * Returns the meta object for the reference list '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin#getWire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Wire</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin#getWire()
	 * @see #getHwPackagePin()
	 * @generated
	 */
	EReference getHwPackagePin_Wire();

	/**
	 * Returns the meta object for the attribute '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin#getPinNo <em>Pin No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin No</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin#getPinNo()
	 * @see #getHwPackagePin()
	 * @generated
	 */
	EAttribute getHwPackagePin_PinNo();

	/**
	 * Returns the meta object for the attribute list '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin#getAltNames <em>Alt Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Alt Names</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin#getAltNames()
	 * @see #getHwPackagePin()
	 * @generated
	 */
	EAttribute getHwPackagePin_AltNames();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwWire <em>Hw Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Wire</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwWire
	 * @generated
	 */
	EClass getHwWire();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HwPackageFactory getHwPackageFactory();

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
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackageImpl <em>Hw Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackageImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackagePackageImpl#getHwPackage()
		 * @generated
		 */
		EClass HW_PACKAGE = eINSTANCE.getHwPackage();

		/**
		 * The meta object literal for the '<em><b>Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PACKAGE__PINS = eINSTANCE.getHwPackage_Pins();

		/**
		 * The meta object literal for the '<em><b>Pin Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_PACKAGE__PIN_NUM = eINSTANCE.getHwPackage_PinNum();

		/**
		 * The meta object literal for the '<em><b>Package Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_PACKAGE__PACKAGE_TYPE = eINSTANCE.getHwPackage_PackageType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_PACKAGE__NAME = eINSTANCE.getHwPackage_Name();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackagePinImpl <em>Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackagePinImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackagePackageImpl#getHwPackagePin()
		 * @generated
		 */
		EClass HW_PACKAGE_PIN = eINSTANCE.getHwPackagePin();

		/**
		 * The meta object literal for the '<em><b>Refpin</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PACKAGE_PIN__REFPIN = eINSTANCE.getHwPackagePin_Refpin();

		/**
		 * The meta object literal for the '<em><b>Wire</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PACKAGE_PIN__WIRE = eINSTANCE.getHwPackagePin_Wire();

		/**
		 * The meta object literal for the '<em><b>Pin No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_PACKAGE_PIN__PIN_NO = eINSTANCE.getHwPackagePin_PinNo();

		/**
		 * The meta object literal for the '<em><b>Alt Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_PACKAGE_PIN__ALT_NAMES = eINSTANCE.getHwPackagePin_AltNames();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwWireImpl <em>Hw Wire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwWireImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackagePackageImpl#getHwWire()
		 * @generated
		 */
		EClass HW_WIRE = eINSTANCE.getHwWire();

	}

} //HwPackagePackage
