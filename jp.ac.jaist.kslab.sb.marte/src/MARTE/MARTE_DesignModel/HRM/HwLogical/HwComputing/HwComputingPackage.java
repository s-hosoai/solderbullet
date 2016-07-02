/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingFactory
 * @model kind="package"
 * @generated
 */
public interface HwComputingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HwComputing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///MARTE/MARTE_DesignModel/HRM/HwLogical/HwComputing.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwComputingPackage eINSTANCE = MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl.init();

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.PLD_OrganizationImpl <em>PLD Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.PLD_OrganizationImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl#getPLD_Organization()
	 * @generated
	 */
	int PLD_ORGANIZATION = 0;

	/**
	 * The feature id for the '<em><b>Nb Rows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLD_ORGANIZATION__NB_ROWS = 0;

	/**
	 * The feature id for the '<em><b>Nb Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLD_ORGANIZATION__NB_COLUMNS = 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLD_ORGANIZATION__CLASS = 2;

	/**
	 * The number of structural features of the '<em>PLD Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLD_ORGANIZATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingResourceImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl#getHwComputingResource()
	 * @generated
	 */
	int HW_COMPUTING_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPUTING_RESOURCE__RES_MULT = HwGeneralPackage.HW_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPUTING_RESOURCE__IS_PROTECTED = HwGeneralPackage.HW_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPUTING_RESOURCE__BASE_PROPERTY = HwGeneralPackage.HW_RESOURCE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPUTING_RESOURCE__BASE_INSTANCE_SPECIFICATION = HwGeneralPackage.HW_RESOURCE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPUTING_RESOURCE__BASE_CLASSIFIER = HwGeneralPackage.HW_RESOURCE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPUTING_RESOURCE__BASE_LIFELINE = HwGeneralPackage.HW_RESOURCE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPUTING_RESOURCE__BASE_CONNECTABLE_ELEMENT = HwGeneralPackage.HW_RESOURCE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPUTING_RESOURCE__DESCRIPTION = HwGeneralPackage.HW_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPUTING_RESOURCE__PHW_SERVICES = HwGeneralPackage.HW_RESOURCE__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPUTING_RESOURCE__RHW_SERVICES = HwGeneralPackage.HW_RESOURCE__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPUTING_RESOURCE__OWNED_HW = HwGeneralPackage.HW_RESOURCE__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPUTING_RESOURCE__END_POINTS = HwGeneralPackage.HW_RESOURCE__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPUTING_RESOURCE__FREQUENCY = HwGeneralPackage.HW_RESOURCE__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPUTING_RESOURCE__OPERATIONS = HwGeneralPackage.HW_RESOURCE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPUTING_RESOURCE__ACTIVITIES = HwGeneralPackage.HW_RESOURCE__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPUTING_RESOURCE__NAME = HwGeneralPackage.HW_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPUTING_RESOURCE__SPEED_FACTOR = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPUTING_RESOURCE__MAIN_SCHEDULER = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Op Frequencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPUTING_RESOURCE__OP_FREQUENCIES = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPUTING_RESOURCE_FEATURE_COUNT = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwProcessorImpl <em>Hw Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwProcessorImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl#getHwProcessor()
	 * @generated
	 */
	int HW_PROCESSOR = 1;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__RES_MULT = HW_COMPUTING_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__IS_PROTECTED = HW_COMPUTING_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__BASE_PROPERTY = HW_COMPUTING_RESOURCE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__BASE_INSTANCE_SPECIFICATION = HW_COMPUTING_RESOURCE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__BASE_CLASSIFIER = HW_COMPUTING_RESOURCE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__BASE_LIFELINE = HW_COMPUTING_RESOURCE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__BASE_CONNECTABLE_ELEMENT = HW_COMPUTING_RESOURCE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__DESCRIPTION = HW_COMPUTING_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__PHW_SERVICES = HW_COMPUTING_RESOURCE__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__RHW_SERVICES = HW_COMPUTING_RESOURCE__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__OWNED_HW = HW_COMPUTING_RESOURCE__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__END_POINTS = HW_COMPUTING_RESOURCE__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__FREQUENCY = HW_COMPUTING_RESOURCE__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__OPERATIONS = HW_COMPUTING_RESOURCE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__ACTIVITIES = HW_COMPUTING_RESOURCE__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__NAME = HW_COMPUTING_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__SPEED_FACTOR = HW_COMPUTING_RESOURCE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__MAIN_SCHEDULER = HW_COMPUTING_RESOURCE__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Op Frequencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__OP_FREQUENCIES = HW_COMPUTING_RESOURCE__OP_FREQUENCIES;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__ARCHITECTURE = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mips</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__MIPS = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ipc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__IPC = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nb Cores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__NB_CORES = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nb Pipelines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__NB_PIPELINES = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nb Stages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__NB_STAGES = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Nb AL Us</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__NB_AL_US = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Nb FP Us</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__NB_FP_US = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owned IS As</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__OWNED_IS_AS = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Predictors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__PREDICTORS = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Caches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__CACHES = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Owned MM Us</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR__OWNED_MM_US = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Hw Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PROCESSOR_FEATURE_COUNT = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwISAImpl <em>Hw ISA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwISAImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl#getHwISA()
	 * @generated
	 */
	int HW_ISA = 3;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ISA__RES_MULT = HwGeneralPackage.HW_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ISA__IS_PROTECTED = HwGeneralPackage.HW_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ISA__BASE_PROPERTY = HwGeneralPackage.HW_RESOURCE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ISA__BASE_INSTANCE_SPECIFICATION = HwGeneralPackage.HW_RESOURCE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ISA__BASE_CLASSIFIER = HwGeneralPackage.HW_RESOURCE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ISA__BASE_LIFELINE = HwGeneralPackage.HW_RESOURCE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ISA__BASE_CONNECTABLE_ELEMENT = HwGeneralPackage.HW_RESOURCE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ISA__DESCRIPTION = HwGeneralPackage.HW_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ISA__PHW_SERVICES = HwGeneralPackage.HW_RESOURCE__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ISA__RHW_SERVICES = HwGeneralPackage.HW_RESOURCE__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ISA__OWNED_HW = HwGeneralPackage.HW_RESOURCE__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ISA__END_POINTS = HwGeneralPackage.HW_RESOURCE__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ISA__FREQUENCY = HwGeneralPackage.HW_RESOURCE__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ISA__OPERATIONS = HwGeneralPackage.HW_RESOURCE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ISA__ACTIVITIES = HwGeneralPackage.HW_RESOURCE__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ISA__NAME = HwGeneralPackage.HW_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Family</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ISA__FAMILY = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inst Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ISA__INST_WIDTH = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ISA__TYPE = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hw ISA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ISA_FEATURE_COUNT = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwBranchPredictorImpl <em>Hw Branch Predictor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwBranchPredictorImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl#getHwBranchPredictor()
	 * @generated
	 */
	int HW_BRANCH_PREDICTOR = 4;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRANCH_PREDICTOR__RES_MULT = HwGeneralPackage.HW_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRANCH_PREDICTOR__IS_PROTECTED = HwGeneralPackage.HW_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRANCH_PREDICTOR__BASE_PROPERTY = HwGeneralPackage.HW_RESOURCE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRANCH_PREDICTOR__BASE_INSTANCE_SPECIFICATION = HwGeneralPackage.HW_RESOURCE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRANCH_PREDICTOR__BASE_CLASSIFIER = HwGeneralPackage.HW_RESOURCE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRANCH_PREDICTOR__BASE_LIFELINE = HwGeneralPackage.HW_RESOURCE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRANCH_PREDICTOR__BASE_CONNECTABLE_ELEMENT = HwGeneralPackage.HW_RESOURCE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRANCH_PREDICTOR__DESCRIPTION = HwGeneralPackage.HW_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRANCH_PREDICTOR__PHW_SERVICES = HwGeneralPackage.HW_RESOURCE__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRANCH_PREDICTOR__RHW_SERVICES = HwGeneralPackage.HW_RESOURCE__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRANCH_PREDICTOR__OWNED_HW = HwGeneralPackage.HW_RESOURCE__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRANCH_PREDICTOR__END_POINTS = HwGeneralPackage.HW_RESOURCE__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRANCH_PREDICTOR__FREQUENCY = HwGeneralPackage.HW_RESOURCE__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRANCH_PREDICTOR__OPERATIONS = HwGeneralPackage.HW_RESOURCE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRANCH_PREDICTOR__ACTIVITIES = HwGeneralPackage.HW_RESOURCE__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRANCH_PREDICTOR__NAME = HwGeneralPackage.HW_RESOURCE__NAME;

	/**
	 * The number of structural features of the '<em>Hw Branch Predictor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_BRANCH_PREDICTOR_FEATURE_COUNT = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwASICImpl <em>Hw ASIC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwASICImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl#getHwASIC()
	 * @generated
	 */
	int HW_ASIC = 5;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ASIC__RES_MULT = HW_COMPUTING_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ASIC__IS_PROTECTED = HW_COMPUTING_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ASIC__BASE_PROPERTY = HW_COMPUTING_RESOURCE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ASIC__BASE_INSTANCE_SPECIFICATION = HW_COMPUTING_RESOURCE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ASIC__BASE_CLASSIFIER = HW_COMPUTING_RESOURCE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ASIC__BASE_LIFELINE = HW_COMPUTING_RESOURCE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ASIC__BASE_CONNECTABLE_ELEMENT = HW_COMPUTING_RESOURCE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ASIC__DESCRIPTION = HW_COMPUTING_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ASIC__PHW_SERVICES = HW_COMPUTING_RESOURCE__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ASIC__RHW_SERVICES = HW_COMPUTING_RESOURCE__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ASIC__OWNED_HW = HW_COMPUTING_RESOURCE__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ASIC__END_POINTS = HW_COMPUTING_RESOURCE__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ASIC__FREQUENCY = HW_COMPUTING_RESOURCE__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ASIC__OPERATIONS = HW_COMPUTING_RESOURCE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ASIC__ACTIVITIES = HW_COMPUTING_RESOURCE__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ASIC__NAME = HW_COMPUTING_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ASIC__SPEED_FACTOR = HW_COMPUTING_RESOURCE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ASIC__MAIN_SCHEDULER = HW_COMPUTING_RESOURCE__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Op Frequencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ASIC__OP_FREQUENCIES = HW_COMPUTING_RESOURCE__OP_FREQUENCIES;

	/**
	 * The number of structural features of the '<em>Hw ASIC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ASIC_FEATURE_COUNT = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwPLDImpl <em>Hw PLD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwPLDImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl#getHwPLD()
	 * @generated
	 */
	int HW_PLD = 6;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__RES_MULT = HW_COMPUTING_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__IS_PROTECTED = HW_COMPUTING_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__BASE_PROPERTY = HW_COMPUTING_RESOURCE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__BASE_INSTANCE_SPECIFICATION = HW_COMPUTING_RESOURCE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__BASE_CLASSIFIER = HW_COMPUTING_RESOURCE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__BASE_LIFELINE = HW_COMPUTING_RESOURCE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__BASE_CONNECTABLE_ELEMENT = HW_COMPUTING_RESOURCE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__DESCRIPTION = HW_COMPUTING_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__PHW_SERVICES = HW_COMPUTING_RESOURCE__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__RHW_SERVICES = HW_COMPUTING_RESOURCE__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__OWNED_HW = HW_COMPUTING_RESOURCE__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__END_POINTS = HW_COMPUTING_RESOURCE__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__FREQUENCY = HW_COMPUTING_RESOURCE__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__OPERATIONS = HW_COMPUTING_RESOURCE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__ACTIVITIES = HW_COMPUTING_RESOURCE__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__NAME = HW_COMPUTING_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__SPEED_FACTOR = HW_COMPUTING_RESOURCE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__MAIN_SCHEDULER = HW_COMPUTING_RESOURCE__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Op Frequencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__OP_FREQUENCIES = HW_COMPUTING_RESOURCE__OP_FREQUENCIES;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__TECHNOLOGY = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__ORGANIZATION = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nb LU Ts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__NB_LU_TS = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nd LUT Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__ND_LUT_INPUTS = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nb Flip Flops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__NB_FLIP_FLOPS = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Blocks RAM</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__BLOCKS_RAM = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Blocks Computing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD__BLOCKS_COMPUTING = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Hw PLD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PLD_FEATURE_COUNT = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwMCUImpl <em>Hw MCU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwMCUImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl#getHwMCU()
	 * @generated
	 */
	int HW_MCU = 7;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__RES_MULT = HW_COMPUTING_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__IS_PROTECTED = HW_COMPUTING_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__BASE_PROPERTY = HW_COMPUTING_RESOURCE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__BASE_INSTANCE_SPECIFICATION = HW_COMPUTING_RESOURCE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__BASE_CLASSIFIER = HW_COMPUTING_RESOURCE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__BASE_LIFELINE = HW_COMPUTING_RESOURCE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__BASE_CONNECTABLE_ELEMENT = HW_COMPUTING_RESOURCE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__DESCRIPTION = HW_COMPUTING_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__PHW_SERVICES = HW_COMPUTING_RESOURCE__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__RHW_SERVICES = HW_COMPUTING_RESOURCE__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__OWNED_HW = HW_COMPUTING_RESOURCE__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__END_POINTS = HW_COMPUTING_RESOURCE__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__FREQUENCY = HW_COMPUTING_RESOURCE__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__OPERATIONS = HW_COMPUTING_RESOURCE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__ACTIVITIES = HW_COMPUTING_RESOURCE__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__NAME = HW_COMPUTING_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__SPEED_FACTOR = HW_COMPUTING_RESOURCE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__MAIN_SCHEDULER = HW_COMPUTING_RESOURCE__MAIN_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Op Frequencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__OP_FREQUENCIES = HW_COMPUTING_RESOURCE__OP_FREQUENCIES;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__PROCESSOR = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Peripherals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__PERIPHERALS = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sfr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__SFR = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__PACKAGES = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__PINS = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU__PORTS = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Hw MCU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MCU_FEATURE_COUNT = HW_COMPUTING_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.ISA_Type <em>ISA Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.ISA_Type
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl#getISA_Type()
	 * @generated
	 */
	int ISA_TYPE = 8;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Technology <em>PLD Technology</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Technology
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl#getPLD_Technology()
	 * @generated
	 */
	int PLD_TECHNOLOGY = 9;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Class <em>PLD Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Class
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl#getPLD_Class()
	 * @generated
	 */
	int PLD_CLASS = 10;


	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Organization <em>PLD Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PLD Organization</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Organization
	 * @generated
	 */
	EClass getPLD_Organization();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Organization#getNbRows <em>Nb Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nb Rows</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Organization#getNbRows()
	 * @see #getPLD_Organization()
	 * @generated
	 */
	EReference getPLD_Organization_NbRows();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Organization#getNbColumns <em>Nb Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nb Columns</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Organization#getNbColumns()
	 * @see #getPLD_Organization()
	 * @generated
	 */
	EReference getPLD_Organization_NbColumns();

	/**
	 * Returns the meta object for the attribute '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Organization#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Organization#getClass_()
	 * @see #getPLD_Organization()
	 * @generated
	 */
	EAttribute getPLD_Organization_Class();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor <em>Hw Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Processor</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor
	 * @generated
	 */
	EClass getHwProcessor();

	/**
	 * Returns the meta object for the reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Architecture</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getArchitecture()
	 * @see #getHwProcessor()
	 * @generated
	 */
	EReference getHwProcessor_Architecture();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getMips <em>Mips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mips</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getMips()
	 * @see #getHwProcessor()
	 * @generated
	 */
	EReference getHwProcessor_Mips();

	/**
	 * Returns the meta object for the reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getIpc <em>Ipc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ipc</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getIpc()
	 * @see #getHwProcessor()
	 * @generated
	 */
	EReference getHwProcessor_Ipc();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getNbCores <em>Nb Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nb Cores</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getNbCores()
	 * @see #getHwProcessor()
	 * @generated
	 */
	EReference getHwProcessor_NbCores();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getNbPipelines <em>Nb Pipelines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nb Pipelines</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getNbPipelines()
	 * @see #getHwProcessor()
	 * @generated
	 */
	EReference getHwProcessor_NbPipelines();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getNbStages <em>Nb Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nb Stages</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getNbStages()
	 * @see #getHwProcessor()
	 * @generated
	 */
	EReference getHwProcessor_NbStages();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getNbALUs <em>Nb AL Us</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nb AL Us</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getNbALUs()
	 * @see #getHwProcessor()
	 * @generated
	 */
	EReference getHwProcessor_NbALUs();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getNbFPUs <em>Nb FP Us</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nb FP Us</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getNbFPUs()
	 * @see #getHwProcessor()
	 * @generated
	 */
	EReference getHwProcessor_NbFPUs();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getOwnedISAs <em>Owned IS As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned IS As</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getOwnedISAs()
	 * @see #getHwProcessor()
	 * @generated
	 */
	EReference getHwProcessor_OwnedISAs();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getPredictors <em>Predictors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predictors</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getPredictors()
	 * @see #getHwProcessor()
	 * @generated
	 */
	EReference getHwProcessor_Predictors();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getCaches <em>Caches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Caches</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getCaches()
	 * @see #getHwProcessor()
	 * @generated
	 */
	EReference getHwProcessor_Caches();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getOwnedMMUs <em>Owned MM Us</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned MM Us</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getOwnedMMUs()
	 * @see #getHwProcessor()
	 * @generated
	 */
	EReference getHwProcessor_OwnedMMUs();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingResource
	 * @generated
	 */
	EClass getHwComputingResource();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingResource#getOp_Frequencies <em>Op Frequencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op Frequencies</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingResource#getOp_Frequencies()
	 * @see #getHwComputingResource()
	 * @generated
	 */
	EReference getHwComputingResource_Op_Frequencies();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA <em>Hw ISA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw ISA</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA
	 * @generated
	 */
	EClass getHwISA();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Family</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA#getFamily()
	 * @see #getHwISA()
	 * @generated
	 */
	EReference getHwISA_Family();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA#getInst_Width <em>Inst Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inst Width</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA#getInst_Width()
	 * @see #getHwISA()
	 * @generated
	 */
	EReference getHwISA_Inst_Width();

	/**
	 * Returns the meta object for the attribute '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA#getType()
	 * @see #getHwISA()
	 * @generated
	 */
	EAttribute getHwISA_Type();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwBranchPredictor <em>Hw Branch Predictor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Branch Predictor</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwBranchPredictor
	 * @generated
	 */
	EClass getHwBranchPredictor();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwASIC <em>Hw ASIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw ASIC</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwASIC
	 * @generated
	 */
	EClass getHwASIC();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD <em>Hw PLD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw PLD</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD
	 * @generated
	 */
	EClass getHwPLD();

	/**
	 * Returns the meta object for the attribute '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technology</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getTechnology()
	 * @see #getHwPLD()
	 * @generated
	 */
	EAttribute getHwPLD_Technology();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getOrganization()
	 * @see #getHwPLD()
	 * @generated
	 */
	EReference getHwPLD_Organization();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getNbLUTs <em>Nb LU Ts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nb LU Ts</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getNbLUTs()
	 * @see #getHwPLD()
	 * @generated
	 */
	EReference getHwPLD_NbLUTs();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getNdLUT_Inputs <em>Nd LUT Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nd LUT Inputs</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getNdLUT_Inputs()
	 * @see #getHwPLD()
	 * @generated
	 */
	EReference getHwPLD_NdLUT_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getNbFlipFlops <em>Nb Flip Flops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nb Flip Flops</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getNbFlipFlops()
	 * @see #getHwPLD()
	 * @generated
	 */
	EReference getHwPLD_NbFlipFlops();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getBlocksRAM <em>Blocks RAM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks RAM</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getBlocksRAM()
	 * @see #getHwPLD()
	 * @generated
	 */
	EReference getHwPLD_BlocksRAM();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getBlocksComputing <em>Blocks Computing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks Computing</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getBlocksComputing()
	 * @see #getHwPLD()
	 * @generated
	 */
	EReference getHwPLD_BlocksComputing();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU <em>Hw MCU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw MCU</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU
	 * @generated
	 */
	EClass getHwMCU();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processor</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU#getProcessor()
	 * @see #getHwMCU()
	 * @generated
	 */
	EReference getHwMCU_Processor();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU#getPeripherals <em>Peripherals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Peripherals</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU#getPeripherals()
	 * @see #getHwMCU()
	 * @generated
	 */
	EReference getHwMCU_Peripherals();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU#getSfr <em>Sfr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sfr</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU#getSfr()
	 * @see #getHwMCU()
	 * @generated
	 */
	EReference getHwMCU_Sfr();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU#getPackages()
	 * @see #getHwMCU()
	 * @generated
	 */
	EReference getHwMCU_Packages();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pins</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU#getPins()
	 * @see #getHwMCU()
	 * @generated
	 */
	EReference getHwMCU_Pins();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU#getPorts()
	 * @see #getHwMCU()
	 * @generated
	 */
	EReference getHwMCU_Ports();

	/**
	 * Returns the meta object for enum '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.ISA_Type <em>ISA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ISA Type</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.ISA_Type
	 * @generated
	 */
	EEnum getISA_Type();

	/**
	 * Returns the meta object for enum '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Technology <em>PLD Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PLD Technology</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Technology
	 * @generated
	 */
	EEnum getPLD_Technology();

	/**
	 * Returns the meta object for enum '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Class <em>PLD Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PLD Class</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Class
	 * @generated
	 */
	EEnum getPLD_Class();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HwComputingFactory getHwComputingFactory();

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
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.PLD_OrganizationImpl <em>PLD Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.PLD_OrganizationImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl#getPLD_Organization()
		 * @generated
		 */
		EClass PLD_ORGANIZATION = eINSTANCE.getPLD_Organization();

		/**
		 * The meta object literal for the '<em><b>Nb Rows</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLD_ORGANIZATION__NB_ROWS = eINSTANCE.getPLD_Organization_NbRows();

		/**
		 * The meta object literal for the '<em><b>Nb Columns</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLD_ORGANIZATION__NB_COLUMNS = eINSTANCE.getPLD_Organization_NbColumns();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLD_ORGANIZATION__CLASS = eINSTANCE.getPLD_Organization_Class();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwProcessorImpl <em>Hw Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwProcessorImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl#getHwProcessor()
		 * @generated
		 */
		EClass HW_PROCESSOR = eINSTANCE.getHwProcessor();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PROCESSOR__ARCHITECTURE = eINSTANCE.getHwProcessor_Architecture();

		/**
		 * The meta object literal for the '<em><b>Mips</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PROCESSOR__MIPS = eINSTANCE.getHwProcessor_Mips();

		/**
		 * The meta object literal for the '<em><b>Ipc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PROCESSOR__IPC = eINSTANCE.getHwProcessor_Ipc();

		/**
		 * The meta object literal for the '<em><b>Nb Cores</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PROCESSOR__NB_CORES = eINSTANCE.getHwProcessor_NbCores();

		/**
		 * The meta object literal for the '<em><b>Nb Pipelines</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PROCESSOR__NB_PIPELINES = eINSTANCE.getHwProcessor_NbPipelines();

		/**
		 * The meta object literal for the '<em><b>Nb Stages</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PROCESSOR__NB_STAGES = eINSTANCE.getHwProcessor_NbStages();

		/**
		 * The meta object literal for the '<em><b>Nb AL Us</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PROCESSOR__NB_AL_US = eINSTANCE.getHwProcessor_NbALUs();

		/**
		 * The meta object literal for the '<em><b>Nb FP Us</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PROCESSOR__NB_FP_US = eINSTANCE.getHwProcessor_NbFPUs();

		/**
		 * The meta object literal for the '<em><b>Owned IS As</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PROCESSOR__OWNED_IS_AS = eINSTANCE.getHwProcessor_OwnedISAs();

		/**
		 * The meta object literal for the '<em><b>Predictors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PROCESSOR__PREDICTORS = eINSTANCE.getHwProcessor_Predictors();

		/**
		 * The meta object literal for the '<em><b>Caches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PROCESSOR__CACHES = eINSTANCE.getHwProcessor_Caches();

		/**
		 * The meta object literal for the '<em><b>Owned MM Us</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PROCESSOR__OWNED_MM_US = eINSTANCE.getHwProcessor_OwnedMMUs();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingResourceImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl#getHwComputingResource()
		 * @generated
		 */
		EClass HW_COMPUTING_RESOURCE = eINSTANCE.getHwComputingResource();

		/**
		 * The meta object literal for the '<em><b>Op Frequencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_COMPUTING_RESOURCE__OP_FREQUENCIES = eINSTANCE.getHwComputingResource_Op_Frequencies();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwISAImpl <em>Hw ISA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwISAImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl#getHwISA()
		 * @generated
		 */
		EClass HW_ISA = eINSTANCE.getHwISA();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_ISA__FAMILY = eINSTANCE.getHwISA_Family();

		/**
		 * The meta object literal for the '<em><b>Inst Width</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_ISA__INST_WIDTH = eINSTANCE.getHwISA_Inst_Width();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_ISA__TYPE = eINSTANCE.getHwISA_Type();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwBranchPredictorImpl <em>Hw Branch Predictor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwBranchPredictorImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl#getHwBranchPredictor()
		 * @generated
		 */
		EClass HW_BRANCH_PREDICTOR = eINSTANCE.getHwBranchPredictor();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwASICImpl <em>Hw ASIC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwASICImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl#getHwASIC()
		 * @generated
		 */
		EClass HW_ASIC = eINSTANCE.getHwASIC();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwPLDImpl <em>Hw PLD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwPLDImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl#getHwPLD()
		 * @generated
		 */
		EClass HW_PLD = eINSTANCE.getHwPLD();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_PLD__TECHNOLOGY = eINSTANCE.getHwPLD_Technology();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLD__ORGANIZATION = eINSTANCE.getHwPLD_Organization();

		/**
		 * The meta object literal for the '<em><b>Nb LU Ts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLD__NB_LU_TS = eINSTANCE.getHwPLD_NbLUTs();

		/**
		 * The meta object literal for the '<em><b>Nd LUT Inputs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLD__ND_LUT_INPUTS = eINSTANCE.getHwPLD_NdLUT_Inputs();

		/**
		 * The meta object literal for the '<em><b>Nb Flip Flops</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLD__NB_FLIP_FLOPS = eINSTANCE.getHwPLD_NbFlipFlops();

		/**
		 * The meta object literal for the '<em><b>Blocks RAM</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLD__BLOCKS_RAM = eINSTANCE.getHwPLD_BlocksRAM();

		/**
		 * The meta object literal for the '<em><b>Blocks Computing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_PLD__BLOCKS_COMPUTING = eINSTANCE.getHwPLD_BlocksComputing();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwMCUImpl <em>Hw MCU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwMCUImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl#getHwMCU()
		 * @generated
		 */
		EClass HW_MCU = eINSTANCE.getHwMCU();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_MCU__PROCESSOR = eINSTANCE.getHwMCU_Processor();

		/**
		 * The meta object literal for the '<em><b>Peripherals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_MCU__PERIPHERALS = eINSTANCE.getHwMCU_Peripherals();

		/**
		 * The meta object literal for the '<em><b>Sfr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_MCU__SFR = eINSTANCE.getHwMCU_Sfr();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_MCU__PACKAGES = eINSTANCE.getHwMCU_Packages();

		/**
		 * The meta object literal for the '<em><b>Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_MCU__PINS = eINSTANCE.getHwMCU_Pins();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_MCU__PORTS = eINSTANCE.getHwMCU_Ports();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.ISA_Type <em>ISA Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.ISA_Type
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl#getISA_Type()
		 * @generated
		 */
		EEnum ISA_TYPE = eINSTANCE.getISA_Type();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Technology <em>PLD Technology</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Technology
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl#getPLD_Technology()
		 * @generated
		 */
		EEnum PLD_TECHNOLOGY = eINSTANCE.getPLD_Technology();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Class <em>PLD Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Class
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl#getPLD_Class()
		 * @generated
		 */
		EEnum PLD_CLASS = eINSTANCE.getPLD_Class();

	}

} //HwComputingPackage
