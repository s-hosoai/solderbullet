/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage;

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
 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwIOFactory
 * @model kind="package"
 * @generated
 */
public interface HwIOPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HwIO";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///MARTE/MARTE_DesignModel/HRM/HwSpecification/HwIO.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MARTE.MARTE_DesignModel.HRM.HwSpesification.HwIO";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwIOPackage eINSTANCE = MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.impl.HwIOPackageImpl.init();

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.impl.HwPinImpl <em>Hw Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.impl.HwPinImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.impl.HwIOPackageImpl#getHwPin()
	 * @generated
	 */
	int HW_PIN = 0;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PIN__RES_MULT = HwCommunicationPackage.HW_END_POINT__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PIN__IS_PROTECTED = HwCommunicationPackage.HW_END_POINT__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PIN__BASE_PROPERTY = HwCommunicationPackage.HW_END_POINT__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PIN__BASE_INSTANCE_SPECIFICATION = HwCommunicationPackage.HW_END_POINT__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PIN__BASE_CLASSIFIER = HwCommunicationPackage.HW_END_POINT__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PIN__BASE_LIFELINE = HwCommunicationPackage.HW_END_POINT__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PIN__BASE_CONNECTABLE_ELEMENT = HwCommunicationPackage.HW_END_POINT__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PIN__DESCRIPTION = HwCommunicationPackage.HW_END_POINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PIN__PHW_SERVICES = HwCommunicationPackage.HW_END_POINT__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PIN__RHW_SERVICES = HwCommunicationPackage.HW_END_POINT__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PIN__OWNED_HW = HwCommunicationPackage.HW_END_POINT__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PIN__END_POINTS = HwCommunicationPackage.HW_END_POINT__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PIN__FREQUENCY = HwCommunicationPackage.HW_END_POINT__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PIN__OPERATIONS = HwCommunicationPackage.HW_END_POINT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PIN__ACTIVITIES = HwCommunicationPackage.HW_END_POINT__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PIN__NAME = HwCommunicationPackage.HW_END_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Packet Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PIN__PACKET_SIZE = HwCommunicationPackage.HW_END_POINT__PACKET_SIZE;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PIN__CONNECTED_TO = HwCommunicationPackage.HW_END_POINT__CONNECTED_TO;

	/**
	 * The feature id for the '<em><b>Pkg Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PIN__PKG_PIN = HwCommunicationPackage.HW_END_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PIN__LINES = HwCommunicationPackage.HW_END_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hw Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PIN_FEATURE_COUNT = HwCommunicationPackage.HW_END_POINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.impl.HwLineImpl <em>Hw Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.impl.HwLineImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.impl.HwIOPackageImpl#getHwLine()
	 * @generated
	 */
	int HW_LINE = 1;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__RES_MULT = HwCommunicationPackage.HW_MEDIA__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__IS_PROTECTED = HwCommunicationPackage.HW_MEDIA__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__BASE_PROPERTY = HwCommunicationPackage.HW_MEDIA__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__BASE_INSTANCE_SPECIFICATION = HwCommunicationPackage.HW_MEDIA__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__BASE_CLASSIFIER = HwCommunicationPackage.HW_MEDIA__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__BASE_LIFELINE = HwCommunicationPackage.HW_MEDIA__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__BASE_CONNECTABLE_ELEMENT = HwCommunicationPackage.HW_MEDIA__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__SPEED_FACTOR = HwCommunicationPackage.HW_MEDIA__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__MAIN_SCHEDULER = HwCommunicationPackage.HW_MEDIA__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Element Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__ELEMENT_SIZE = HwCommunicationPackage.HW_MEDIA__ELEMENT_SIZE;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__BASE_CONNECTOR = HwCommunicationPackage.HW_MEDIA__BASE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Transm Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__TRANSM_MODE = HwCommunicationPackage.HW_MEDIA__TRANSM_MODE;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__BLOCK_T = HwCommunicationPackage.HW_MEDIA__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Packet T</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__PACKET_T = HwCommunicationPackage.HW_MEDIA__PACKET_T;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__CAPACITY = HwCommunicationPackage.HW_MEDIA__CAPACITY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__DESCRIPTION = HwCommunicationPackage.HW_MEDIA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__PHW_SERVICES = HwCommunicationPackage.HW_MEDIA__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__RHW_SERVICES = HwCommunicationPackage.HW_MEDIA__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__OWNED_HW = HwCommunicationPackage.HW_MEDIA__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__END_POINTS = HwCommunicationPackage.HW_MEDIA__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__FREQUENCY = HwCommunicationPackage.HW_MEDIA__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__OPERATIONS = HwCommunicationPackage.HW_MEDIA__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__ACTIVITIES = HwCommunicationPackage.HW_MEDIA__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__NAME = HwCommunicationPackage.HW_MEDIA__NAME;

	/**
	 * The feature id for the '<em><b>Band Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__BAND_WIDTH = HwCommunicationPackage.HW_MEDIA__BAND_WIDTH;

	/**
	 * The feature id for the '<em><b>Arbiters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE__ARBITERS = HwCommunicationPackage.HW_MEDIA__ARBITERS;

	/**
	 * The number of structural features of the '<em>Hw Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINE_FEATURE_COUNT = HwCommunicationPackage.HW_MEDIA_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin <em>Hw Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Pin</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin
	 * @generated
	 */
	EClass getHwPin();

	/**
	 * Returns the meta object for the reference '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin#getPkgPin <em>Pkg Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pkg Pin</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin#getPkgPin()
	 * @see #getHwPin()
	 * @generated
	 */
	EReference getHwPin_PkgPin();

	/**
	 * Returns the meta object for the reference list '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lines</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin#getLines()
	 * @see #getHwPin()
	 * @generated
	 */
	EReference getHwPin_Lines();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwLine <em>Hw Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Line</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwLine
	 * @generated
	 */
	EClass getHwLine();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HwIOFactory getHwIOFactory();

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
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.impl.HwPinImpl <em>Hw Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.impl.HwPinImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.impl.HwIOPackageImpl#getHwPin()
		 * @generated
		 */
		EClass HW_PIN = eINSTANCE.getHwPin();

		/**
		 * The meta object literal for the '<em><b>Pkg Pin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PIN__PKG_PIN = eINSTANCE.getHwPin_PkgPin();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PIN__LINES = eINSTANCE.getHwPin_Lines();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.impl.HwLineImpl <em>Hw Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.impl.HwLineImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.impl.HwIOPackageImpl#getHwLine()
		 * @generated
		 */
		EClass HW_LINE = eINSTANCE.getHwLine();

	}

} //HwIOPackage
