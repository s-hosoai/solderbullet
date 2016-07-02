/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage;

import MARTE.MARTE_Foundations.GRM.GRMPackage;

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
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationFactory
 * @model kind="package"
 * @generated
 */
public interface HwCommunicationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HwCommunication";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///MARTE/MARTE_DesignModel/HRM/HwLogical/HwCommunication.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwCommunicationPackage eINSTANCE = MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwCommunicationPackageImpl.init();

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwCommunicationResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwCommunicationResourceImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwCommunicationPackageImpl#getHwCommunicationResource()
	 * @generated
	 */
	int HW_COMMUNICATION_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMMUNICATION_RESOURCE__RES_MULT = HwGeneralPackage.HW_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMMUNICATION_RESOURCE__IS_PROTECTED = HwGeneralPackage.HW_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMMUNICATION_RESOURCE__BASE_PROPERTY = HwGeneralPackage.HW_RESOURCE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMMUNICATION_RESOURCE__BASE_INSTANCE_SPECIFICATION = HwGeneralPackage.HW_RESOURCE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMMUNICATION_RESOURCE__BASE_CLASSIFIER = HwGeneralPackage.HW_RESOURCE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMMUNICATION_RESOURCE__BASE_LIFELINE = HwGeneralPackage.HW_RESOURCE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMMUNICATION_RESOURCE__BASE_CONNECTABLE_ELEMENT = HwGeneralPackage.HW_RESOURCE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMMUNICATION_RESOURCE__DESCRIPTION = HwGeneralPackage.HW_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMMUNICATION_RESOURCE__PHW_SERVICES = HwGeneralPackage.HW_RESOURCE__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMMUNICATION_RESOURCE__RHW_SERVICES = HwGeneralPackage.HW_RESOURCE__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMMUNICATION_RESOURCE__OWNED_HW = HwGeneralPackage.HW_RESOURCE__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMMUNICATION_RESOURCE__END_POINTS = HwGeneralPackage.HW_RESOURCE__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMMUNICATION_RESOURCE__FREQUENCY = HwGeneralPackage.HW_RESOURCE__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMMUNICATION_RESOURCE__OPERATIONS = HwGeneralPackage.HW_RESOURCE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMMUNICATION_RESOURCE__ACTIVITIES = HwGeneralPackage.HW_RESOURCE__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMMUNICATION_RESOURCE__NAME = HwGeneralPackage.HW_RESOURCE__NAME;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMMUNICATION_RESOURCE_FEATURE_COUNT = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwArbiterImpl <em>Hw Arbiter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwArbiterImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwCommunicationPackageImpl#getHwArbiter()
	 * @generated
	 */
	int HW_ARBITER = 1;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ARBITER__RES_MULT = HW_COMMUNICATION_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ARBITER__IS_PROTECTED = HW_COMMUNICATION_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ARBITER__BASE_PROPERTY = HW_COMMUNICATION_RESOURCE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ARBITER__BASE_INSTANCE_SPECIFICATION = HW_COMMUNICATION_RESOURCE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ARBITER__BASE_CLASSIFIER = HW_COMMUNICATION_RESOURCE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ARBITER__BASE_LIFELINE = HW_COMMUNICATION_RESOURCE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ARBITER__BASE_CONNECTABLE_ELEMENT = HW_COMMUNICATION_RESOURCE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ARBITER__DESCRIPTION = HW_COMMUNICATION_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ARBITER__PHW_SERVICES = HW_COMMUNICATION_RESOURCE__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ARBITER__RHW_SERVICES = HW_COMMUNICATION_RESOURCE__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ARBITER__OWNED_HW = HW_COMMUNICATION_RESOURCE__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ARBITER__END_POINTS = HW_COMMUNICATION_RESOURCE__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ARBITER__FREQUENCY = HW_COMMUNICATION_RESOURCE__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ARBITER__OPERATIONS = HW_COMMUNICATION_RESOURCE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ARBITER__ACTIVITIES = HW_COMMUNICATION_RESOURCE__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ARBITER__NAME = HW_COMMUNICATION_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Controlled Medias</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ARBITER__CONTROLLED_MEDIAS = HW_COMMUNICATION_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hw Arbiter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ARBITER_FEATURE_COUNT = HW_COMMUNICATION_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwMediaImpl <em>Hw Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwMediaImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwCommunicationPackageImpl#getHwMedia()
	 * @generated
	 */
	int HW_MEDIA = 2;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__RES_MULT = GRMPackage.COMMUNICATION_MEDIA__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__IS_PROTECTED = GRMPackage.COMMUNICATION_MEDIA__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__BASE_PROPERTY = GRMPackage.COMMUNICATION_MEDIA__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__BASE_INSTANCE_SPECIFICATION = GRMPackage.COMMUNICATION_MEDIA__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__BASE_CLASSIFIER = GRMPackage.COMMUNICATION_MEDIA__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__BASE_LIFELINE = GRMPackage.COMMUNICATION_MEDIA__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__BASE_CONNECTABLE_ELEMENT = GRMPackage.COMMUNICATION_MEDIA__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__SPEED_FACTOR = GRMPackage.COMMUNICATION_MEDIA__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__MAIN_SCHEDULER = GRMPackage.COMMUNICATION_MEDIA__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Element Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__ELEMENT_SIZE = GRMPackage.COMMUNICATION_MEDIA__ELEMENT_SIZE;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__BASE_CONNECTOR = GRMPackage.COMMUNICATION_MEDIA__BASE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Transm Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__TRANSM_MODE = GRMPackage.COMMUNICATION_MEDIA__TRANSM_MODE;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__BLOCK_T = GRMPackage.COMMUNICATION_MEDIA__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Packet T</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__PACKET_T = GRMPackage.COMMUNICATION_MEDIA__PACKET_T;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__CAPACITY = GRMPackage.COMMUNICATION_MEDIA__CAPACITY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__DESCRIPTION = GRMPackage.COMMUNICATION_MEDIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__PHW_SERVICES = GRMPackage.COMMUNICATION_MEDIA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__RHW_SERVICES = GRMPackage.COMMUNICATION_MEDIA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__OWNED_HW = GRMPackage.COMMUNICATION_MEDIA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__END_POINTS = GRMPackage.COMMUNICATION_MEDIA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__FREQUENCY = GRMPackage.COMMUNICATION_MEDIA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__OPERATIONS = GRMPackage.COMMUNICATION_MEDIA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__ACTIVITIES = GRMPackage.COMMUNICATION_MEDIA_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__NAME = GRMPackage.COMMUNICATION_MEDIA_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Band Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__BAND_WIDTH = GRMPackage.COMMUNICATION_MEDIA_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Arbiters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA__ARBITERS = GRMPackage.COMMUNICATION_MEDIA_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Hw Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEDIA_FEATURE_COUNT = GRMPackage.COMMUNICATION_MEDIA_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwBusImpl <em>Hw Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwBusImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwCommunicationPackageImpl#getHwBus()
	 * @generated
	 */
	int HW_BUS = 3;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__RES_MULT = HW_MEDIA__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__IS_PROTECTED = HW_MEDIA__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__BASE_PROPERTY = HW_MEDIA__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__BASE_INSTANCE_SPECIFICATION = HW_MEDIA__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__BASE_CLASSIFIER = HW_MEDIA__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__BASE_LIFELINE = HW_MEDIA__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__BASE_CONNECTABLE_ELEMENT = HW_MEDIA__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__SPEED_FACTOR = HW_MEDIA__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__MAIN_SCHEDULER = HW_MEDIA__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Element Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__ELEMENT_SIZE = HW_MEDIA__ELEMENT_SIZE;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__BASE_CONNECTOR = HW_MEDIA__BASE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Transm Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__TRANSM_MODE = HW_MEDIA__TRANSM_MODE;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__BLOCK_T = HW_MEDIA__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Packet T</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__PACKET_T = HW_MEDIA__PACKET_T;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__CAPACITY = HW_MEDIA__CAPACITY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__DESCRIPTION = HW_MEDIA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__PHW_SERVICES = HW_MEDIA__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__RHW_SERVICES = HW_MEDIA__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__OWNED_HW = HW_MEDIA__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__END_POINTS = HW_MEDIA__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__FREQUENCY = HW_MEDIA__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__OPERATIONS = HW_MEDIA__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__ACTIVITIES = HW_MEDIA__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__NAME = HW_MEDIA__NAME;

	/**
	 * The feature id for the '<em><b>Band Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__BAND_WIDTH = HW_MEDIA__BAND_WIDTH;

	/**
	 * The feature id for the '<em><b>Arbiters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__ARBITERS = HW_MEDIA__ARBITERS;

	/**
	 * The feature id for the '<em><b>Adress Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__ADRESS_WIDTH = HW_MEDIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Word Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__WORD_WIDTH = HW_MEDIA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Synchronous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__IS_SYNCHRONOUS = HW_MEDIA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Serial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS__IS_SERIAL = HW_MEDIA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Hw Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BUS_FEATURE_COUNT = HW_MEDIA_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwBridgeImpl <em>Hw Bridge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwBridgeImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwCommunicationPackageImpl#getHwBridge()
	 * @generated
	 */
	int HW_BRIDGE = 4;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__RES_MULT = HW_MEDIA__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__IS_PROTECTED = HW_MEDIA__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__BASE_PROPERTY = HW_MEDIA__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__BASE_INSTANCE_SPECIFICATION = HW_MEDIA__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__BASE_CLASSIFIER = HW_MEDIA__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__BASE_LIFELINE = HW_MEDIA__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__BASE_CONNECTABLE_ELEMENT = HW_MEDIA__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__SPEED_FACTOR = HW_MEDIA__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__MAIN_SCHEDULER = HW_MEDIA__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Element Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__ELEMENT_SIZE = HW_MEDIA__ELEMENT_SIZE;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__BASE_CONNECTOR = HW_MEDIA__BASE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Transm Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__TRANSM_MODE = HW_MEDIA__TRANSM_MODE;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__BLOCK_T = HW_MEDIA__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Packet T</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__PACKET_T = HW_MEDIA__PACKET_T;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__CAPACITY = HW_MEDIA__CAPACITY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__DESCRIPTION = HW_MEDIA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__PHW_SERVICES = HW_MEDIA__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__RHW_SERVICES = HW_MEDIA__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__OWNED_HW = HW_MEDIA__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__END_POINTS = HW_MEDIA__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__FREQUENCY = HW_MEDIA__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__OPERATIONS = HW_MEDIA__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__ACTIVITIES = HW_MEDIA__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__NAME = HW_MEDIA__NAME;

	/**
	 * The feature id for the '<em><b>Band Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__BAND_WIDTH = HW_MEDIA__BAND_WIDTH;

	/**
	 * The feature id for the '<em><b>Arbiters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__ARBITERS = HW_MEDIA__ARBITERS;

	/**
	 * The feature id for the '<em><b>Sides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE__SIDES = HW_MEDIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hw Bridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRIDGE_FEATURE_COUNT = HW_MEDIA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwEndPointImpl <em>Hw End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwEndPointImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwCommunicationPackageImpl#getHwEndPoint()
	 * @generated
	 */
	int HW_END_POINT = 5;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_END_POINT__RES_MULT = HW_COMMUNICATION_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_END_POINT__IS_PROTECTED = HW_COMMUNICATION_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_END_POINT__BASE_PROPERTY = HW_COMMUNICATION_RESOURCE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_END_POINT__BASE_INSTANCE_SPECIFICATION = HW_COMMUNICATION_RESOURCE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_END_POINT__BASE_CLASSIFIER = HW_COMMUNICATION_RESOURCE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_END_POINT__BASE_LIFELINE = HW_COMMUNICATION_RESOURCE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_END_POINT__BASE_CONNECTABLE_ELEMENT = HW_COMMUNICATION_RESOURCE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_END_POINT__DESCRIPTION = HW_COMMUNICATION_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_END_POINT__PHW_SERVICES = HW_COMMUNICATION_RESOURCE__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_END_POINT__RHW_SERVICES = HW_COMMUNICATION_RESOURCE__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_END_POINT__OWNED_HW = HW_COMMUNICATION_RESOURCE__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_END_POINT__END_POINTS = HW_COMMUNICATION_RESOURCE__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_END_POINT__FREQUENCY = HW_COMMUNICATION_RESOURCE__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_END_POINT__OPERATIONS = HW_COMMUNICATION_RESOURCE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_END_POINT__ACTIVITIES = HW_COMMUNICATION_RESOURCE__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_END_POINT__NAME = HW_COMMUNICATION_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Packet Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_END_POINT__PACKET_SIZE = HW_COMMUNICATION_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_END_POINT__CONNECTED_TO = HW_COMMUNICATION_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hw End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_END_POINT_FEATURE_COUNT = HW_COMMUNICATION_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwPortImpl <em>Hw Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwPortImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwCommunicationPackageImpl#getHwPort()
	 * @generated
	 */
	int HW_PORT = 6;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__RES_MULT = HW_END_POINT__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__IS_PROTECTED = HW_END_POINT__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__BASE_PROPERTY = HW_END_POINT__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__BASE_INSTANCE_SPECIFICATION = HW_END_POINT__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__BASE_CLASSIFIER = HW_END_POINT__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__BASE_LIFELINE = HW_END_POINT__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__BASE_CONNECTABLE_ELEMENT = HW_END_POINT__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__DESCRIPTION = HW_END_POINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__PHW_SERVICES = HW_END_POINT__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__RHW_SERVICES = HW_END_POINT__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__OWNED_HW = HW_END_POINT__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__END_POINTS = HW_END_POINT__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__FREQUENCY = HW_END_POINT__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__OPERATIONS = HW_END_POINT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__ACTIVITIES = HW_END_POINT__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__NAME = HW_END_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Packet Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__PACKET_SIZE = HW_END_POINT__PACKET_SIZE;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__CONNECTED_TO = HW_END_POINT__CONNECTED_TO;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT__PINS = HW_END_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hw Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORT_FEATURE_COUNT = HW_END_POINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwConnectionImpl <em>Hw Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwConnectionImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwCommunicationPackageImpl#getHwConnection()
	 * @generated
	 */
	int HW_CONNECTION = 7;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__RES_MULT = HW_MEDIA__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__IS_PROTECTED = HW_MEDIA__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__BASE_PROPERTY = HW_MEDIA__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__BASE_INSTANCE_SPECIFICATION = HW_MEDIA__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__BASE_CLASSIFIER = HW_MEDIA__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__BASE_LIFELINE = HW_MEDIA__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__BASE_CONNECTABLE_ELEMENT = HW_MEDIA__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__SPEED_FACTOR = HW_MEDIA__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__MAIN_SCHEDULER = HW_MEDIA__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Element Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__ELEMENT_SIZE = HW_MEDIA__ELEMENT_SIZE;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__BASE_CONNECTOR = HW_MEDIA__BASE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Transm Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__TRANSM_MODE = HW_MEDIA__TRANSM_MODE;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__BLOCK_T = HW_MEDIA__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Packet T</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__PACKET_T = HW_MEDIA__PACKET_T;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__CAPACITY = HW_MEDIA__CAPACITY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__DESCRIPTION = HW_MEDIA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__PHW_SERVICES = HW_MEDIA__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__RHW_SERVICES = HW_MEDIA__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__OWNED_HW = HW_MEDIA__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__END_POINTS = HW_MEDIA__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__FREQUENCY = HW_MEDIA__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__OPERATIONS = HW_MEDIA__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__ACTIVITIES = HW_MEDIA__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__NAME = HW_MEDIA__NAME;

	/**
	 * The feature id for the '<em><b>Band Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__BAND_WIDTH = HW_MEDIA__BAND_WIDTH;

	/**
	 * The feature id for the '<em><b>Arbiters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__ARBITERS = HW_MEDIA__ARBITERS;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION__PROTOCOLS = HW_MEDIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hw Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CONNECTION_FEATURE_COUNT = HW_MEDIA_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationResource
	 * @generated
	 */
	EClass getHwCommunicationResource();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwArbiter <em>Hw Arbiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Arbiter</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwArbiter
	 * @generated
	 */
	EClass getHwArbiter();

	/**
	 * Returns the meta object for the reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwArbiter#getControlledMedias <em>Controlled Medias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controlled Medias</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwArbiter#getControlledMedias()
	 * @see #getHwArbiter()
	 * @generated
	 */
	EReference getHwArbiter_ControlledMedias();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia <em>Hw Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Media</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia
	 * @generated
	 */
	EClass getHwMedia();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia#getBandWidth <em>Band Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Band Width</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia#getBandWidth()
	 * @see #getHwMedia()
	 * @generated
	 */
	EReference getHwMedia_BandWidth();

	/**
	 * Returns the meta object for the reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia#getArbiters <em>Arbiters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arbiters</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia#getArbiters()
	 * @see #getHwMedia()
	 * @generated
	 */
	EReference getHwMedia_Arbiters();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBus <em>Hw Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Bus</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBus
	 * @generated
	 */
	EClass getHwBus();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBus#getAdressWidth <em>Adress Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adress Width</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBus#getAdressWidth()
	 * @see #getHwBus()
	 * @generated
	 */
	EReference getHwBus_AdressWidth();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBus#getWordWidth <em>Word Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Word Width</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBus#getWordWidth()
	 * @see #getHwBus()
	 * @generated
	 */
	EReference getHwBus_WordWidth();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBus#getIsSynchronous <em>Is Synchronous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Synchronous</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBus#getIsSynchronous()
	 * @see #getHwBus()
	 * @generated
	 */
	EReference getHwBus_IsSynchronous();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBus#getIsSerial <em>Is Serial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Serial</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBus#getIsSerial()
	 * @see #getHwBus()
	 * @generated
	 */
	EReference getHwBus_IsSerial();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBridge <em>Hw Bridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Bridge</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBridge
	 * @generated
	 */
	EClass getHwBridge();

	/**
	 * Returns the meta object for the reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBridge#getSides <em>Sides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sides</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBridge#getSides()
	 * @see #getHwBridge()
	 * @generated
	 */
	EReference getHwBridge_Sides();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwEndPoint <em>Hw End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw End Point</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwEndPoint
	 * @generated
	 */
	EClass getHwEndPoint();

	/**
	 * Returns the meta object for the reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwEndPoint#getConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected To</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwEndPoint#getConnectedTo()
	 * @see #getHwEndPoint()
	 * @generated
	 */
	EReference getHwEndPoint_ConnectedTo();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwPort <em>Hw Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Port</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwPort
	 * @generated
	 */
	EClass getHwPort();

	/**
	 * Returns the meta object for the reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwPort#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pins</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwPort#getPins()
	 * @see #getHwPort()
	 * @generated
	 */
	EReference getHwPort_Pins();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwConnection <em>Hw Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Connection</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwConnection
	 * @generated
	 */
	EClass getHwConnection();

	/**
	 * Returns the meta object for the reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwConnection#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Protocols</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwConnection#getProtocols()
	 * @see #getHwConnection()
	 * @generated
	 */
	EReference getHwConnection_Protocols();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HwCommunicationFactory getHwCommunicationFactory();

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
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwCommunicationResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwCommunicationResourceImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwCommunicationPackageImpl#getHwCommunicationResource()
		 * @generated
		 */
		EClass HW_COMMUNICATION_RESOURCE = eINSTANCE.getHwCommunicationResource();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwArbiterImpl <em>Hw Arbiter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwArbiterImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwCommunicationPackageImpl#getHwArbiter()
		 * @generated
		 */
		EClass HW_ARBITER = eINSTANCE.getHwArbiter();

		/**
		 * The meta object literal for the '<em><b>Controlled Medias</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_ARBITER__CONTROLLED_MEDIAS = eINSTANCE.getHwArbiter_ControlledMedias();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwMediaImpl <em>Hw Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwMediaImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwCommunicationPackageImpl#getHwMedia()
		 * @generated
		 */
		EClass HW_MEDIA = eINSTANCE.getHwMedia();

		/**
		 * The meta object literal for the '<em><b>Band Width</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_MEDIA__BAND_WIDTH = eINSTANCE.getHwMedia_BandWidth();

		/**
		 * The meta object literal for the '<em><b>Arbiters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_MEDIA__ARBITERS = eINSTANCE.getHwMedia_Arbiters();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwBusImpl <em>Hw Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwBusImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwCommunicationPackageImpl#getHwBus()
		 * @generated
		 */
		EClass HW_BUS = eINSTANCE.getHwBus();

		/**
		 * The meta object literal for the '<em><b>Adress Width</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_BUS__ADRESS_WIDTH = eINSTANCE.getHwBus_AdressWidth();

		/**
		 * The meta object literal for the '<em><b>Word Width</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_BUS__WORD_WIDTH = eINSTANCE.getHwBus_WordWidth();

		/**
		 * The meta object literal for the '<em><b>Is Synchronous</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_BUS__IS_SYNCHRONOUS = eINSTANCE.getHwBus_IsSynchronous();

		/**
		 * The meta object literal for the '<em><b>Is Serial</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_BUS__IS_SERIAL = eINSTANCE.getHwBus_IsSerial();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwBridgeImpl <em>Hw Bridge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwBridgeImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwCommunicationPackageImpl#getHwBridge()
		 * @generated
		 */
		EClass HW_BRIDGE = eINSTANCE.getHwBridge();

		/**
		 * The meta object literal for the '<em><b>Sides</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_BRIDGE__SIDES = eINSTANCE.getHwBridge_Sides();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwEndPointImpl <em>Hw End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwEndPointImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwCommunicationPackageImpl#getHwEndPoint()
		 * @generated
		 */
		EClass HW_END_POINT = eINSTANCE.getHwEndPoint();

		/**
		 * The meta object literal for the '<em><b>Connected To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_END_POINT__CONNECTED_TO = eINSTANCE.getHwEndPoint_ConnectedTo();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwPortImpl <em>Hw Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwPortImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwCommunicationPackageImpl#getHwPort()
		 * @generated
		 */
		EClass HW_PORT = eINSTANCE.getHwPort();

		/**
		 * The meta object literal for the '<em><b>Pins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PORT__PINS = eINSTANCE.getHwPort_Pins();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwConnectionImpl <em>Hw Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwConnectionImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwCommunicationPackageImpl#getHwConnection()
		 * @generated
		 */
		EClass HW_CONNECTION = eINSTANCE.getHwConnection();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_CONNECTION__PROTOCOLS = eINSTANCE.getHwConnection_Protocols();

	}

} //HwCommunicationPackage
