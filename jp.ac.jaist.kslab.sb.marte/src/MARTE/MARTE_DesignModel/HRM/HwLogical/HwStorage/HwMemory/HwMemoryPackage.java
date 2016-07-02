/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory;

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
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryFactory
 * @model kind="package"
 * @generated
 */
public interface HwMemoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HwMemory";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///MARTE/MARTE_DesignModel/HRM/HwLogical/HwStorage/HwMemory.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwMemoryPackage eINSTANCE = MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryImpl <em>Hw Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getHwMemory()
	 * @generated
	 */
	int HW_MEMORY = 0;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY__RES_MULT = HwGeneralPackage.HW_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY__IS_PROTECTED = HwGeneralPackage.HW_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY__BASE_PROPERTY = HwGeneralPackage.HW_RESOURCE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY__BASE_INSTANCE_SPECIFICATION = HwGeneralPackage.HW_RESOURCE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY__BASE_CLASSIFIER = HwGeneralPackage.HW_RESOURCE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY__BASE_LIFELINE = HwGeneralPackage.HW_RESOURCE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY__BASE_CONNECTABLE_ELEMENT = HwGeneralPackage.HW_RESOURCE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY__DESCRIPTION = HwGeneralPackage.HW_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY__PHW_SERVICES = HwGeneralPackage.HW_RESOURCE__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY__RHW_SERVICES = HwGeneralPackage.HW_RESOURCE__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY__OWNED_HW = HwGeneralPackage.HW_RESOURCE__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY__END_POINTS = HwGeneralPackage.HW_RESOURCE__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY__FREQUENCY = HwGeneralPackage.HW_RESOURCE__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY__OPERATIONS = HwGeneralPackage.HW_RESOURCE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY__ACTIVITIES = HwGeneralPackage.HW_RESOURCE__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY__NAME = HwGeneralPackage.HW_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Element Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY__ELEMENT_SIZE = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY__MEMORY_SIZE = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Adress Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY__ADRESS_SIZE = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY__TIMINGS = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY__THROUGHPUT = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Hw Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MEMORY_FEATURE_COUNT = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.TimingImpl <em>Timing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.TimingImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getTiming()
	 * @generated
	 */
	int TIMING = 1;

	/**
	 * The feature id for the '<em><b>Notation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__NOTATION = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Timing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.CacheStructureImpl <em>Cache Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.CacheStructureImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getCacheStructure()
	 * @generated
	 */
	int CACHE_STRUCTURE = 2;

	/**
	 * The feature id for the '<em><b>Nb Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_STRUCTURE__NB_SETS = 0;

	/**
	 * The feature id for the '<em><b>Block Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_STRUCTURE__BLOCK_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Associativity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_STRUCTURE__ASSOCIATIVITY = 2;

	/**
	 * The number of structural features of the '<em>Cache Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_STRUCTURE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.MemoryOrganizationImpl <em>Memory Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.MemoryOrganizationImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getMemoryOrganization()
	 * @generated
	 */
	int MEMORY_ORGANIZATION = 3;

	/**
	 * The feature id for the '<em><b>Nb Rows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_ORGANIZATION__NB_ROWS = 0;

	/**
	 * The feature id for the '<em><b>Nb Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_ORGANIZATION__NB_COLUMNS = 1;

	/**
	 * The feature id for the '<em><b>Nb Banks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_ORGANIZATION__NB_BANKS = 2;

	/**
	 * The feature id for the '<em><b>Word Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_ORGANIZATION__WORD_SIZE = 3;

	/**
	 * The number of structural features of the '<em>Memory Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_ORGANIZATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwRAMImpl <em>Hw RAM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwRAMImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getHwRAM()
	 * @generated
	 */
	int HW_RAM = 4;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__RES_MULT = HW_MEMORY__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__IS_PROTECTED = HW_MEMORY__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__BASE_PROPERTY = HW_MEMORY__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__BASE_INSTANCE_SPECIFICATION = HW_MEMORY__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__BASE_CLASSIFIER = HW_MEMORY__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__BASE_LIFELINE = HW_MEMORY__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__BASE_CONNECTABLE_ELEMENT = HW_MEMORY__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__DESCRIPTION = HW_MEMORY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__PHW_SERVICES = HW_MEMORY__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__RHW_SERVICES = HW_MEMORY__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__OWNED_HW = HW_MEMORY__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__END_POINTS = HW_MEMORY__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__FREQUENCY = HW_MEMORY__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__OPERATIONS = HW_MEMORY__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__ACTIVITIES = HW_MEMORY__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__NAME = HW_MEMORY__NAME;

	/**
	 * The feature id for the '<em><b>Element Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__ELEMENT_SIZE = HW_MEMORY__ELEMENT_SIZE;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__MEMORY_SIZE = HW_MEMORY__MEMORY_SIZE;

	/**
	 * The feature id for the '<em><b>Adress Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__ADRESS_SIZE = HW_MEMORY__ADRESS_SIZE;

	/**
	 * The feature id for the '<em><b>Timings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__TIMINGS = HW_MEMORY__TIMINGS;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__THROUGHPUT = HW_MEMORY__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__ORGANIZATION = HW_MEMORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Synchronous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__IS_SYNCHRONOUS = HW_MEMORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__IS_STATIC = HW_MEMORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Non Volatile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__IS_NON_VOLATILE = HW_MEMORY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Repl Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__REPL_POLICY = HW_MEMORY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Write Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM__WRITE_POLICY = HW_MEMORY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Hw RAM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RAM_FEATURE_COUNT = HW_MEMORY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwROMImpl <em>Hw ROM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwROMImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getHwROM()
	 * @generated
	 */
	int HW_ROM = 5;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM__RES_MULT = HW_MEMORY__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM__IS_PROTECTED = HW_MEMORY__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM__BASE_PROPERTY = HW_MEMORY__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM__BASE_INSTANCE_SPECIFICATION = HW_MEMORY__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM__BASE_CLASSIFIER = HW_MEMORY__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM__BASE_LIFELINE = HW_MEMORY__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM__BASE_CONNECTABLE_ELEMENT = HW_MEMORY__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM__DESCRIPTION = HW_MEMORY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM__PHW_SERVICES = HW_MEMORY__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM__RHW_SERVICES = HW_MEMORY__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM__OWNED_HW = HW_MEMORY__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM__END_POINTS = HW_MEMORY__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM__FREQUENCY = HW_MEMORY__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM__OPERATIONS = HW_MEMORY__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM__ACTIVITIES = HW_MEMORY__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM__NAME = HW_MEMORY__NAME;

	/**
	 * The feature id for the '<em><b>Element Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM__ELEMENT_SIZE = HW_MEMORY__ELEMENT_SIZE;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM__MEMORY_SIZE = HW_MEMORY__MEMORY_SIZE;

	/**
	 * The feature id for the '<em><b>Adress Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM__ADRESS_SIZE = HW_MEMORY__ADRESS_SIZE;

	/**
	 * The feature id for the '<em><b>Timings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM__TIMINGS = HW_MEMORY__TIMINGS;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM__THROUGHPUT = HW_MEMORY__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM__TYPE = HW_MEMORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM__ORGANIZATION = HW_MEMORY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hw ROM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_ROM_FEATURE_COUNT = HW_MEMORY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwDriveImpl <em>Hw Drive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwDriveImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getHwDrive()
	 * @generated
	 */
	int HW_DRIVE = 6;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE__RES_MULT = HW_MEMORY__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE__IS_PROTECTED = HW_MEMORY__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE__BASE_PROPERTY = HW_MEMORY__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE__BASE_INSTANCE_SPECIFICATION = HW_MEMORY__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE__BASE_CLASSIFIER = HW_MEMORY__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE__BASE_LIFELINE = HW_MEMORY__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE__BASE_CONNECTABLE_ELEMENT = HW_MEMORY__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE__DESCRIPTION = HW_MEMORY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE__PHW_SERVICES = HW_MEMORY__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE__RHW_SERVICES = HW_MEMORY__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE__OWNED_HW = HW_MEMORY__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE__END_POINTS = HW_MEMORY__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE__FREQUENCY = HW_MEMORY__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE__OPERATIONS = HW_MEMORY__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE__ACTIVITIES = HW_MEMORY__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE__NAME = HW_MEMORY__NAME;

	/**
	 * The feature id for the '<em><b>Element Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE__ELEMENT_SIZE = HW_MEMORY__ELEMENT_SIZE;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE__MEMORY_SIZE = HW_MEMORY__MEMORY_SIZE;

	/**
	 * The feature id for the '<em><b>Adress Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE__ADRESS_SIZE = HW_MEMORY__ADRESS_SIZE;

	/**
	 * The feature id for the '<em><b>Timings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE__TIMINGS = HW_MEMORY__TIMINGS;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE__THROUGHPUT = HW_MEMORY__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Sector Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE__SECTOR_SIZE = HW_MEMORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Buffer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE__BUFFER = HW_MEMORY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hw Drive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_DRIVE_FEATURE_COUNT = HW_MEMORY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwCacheImpl <em>Hw Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwCacheImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getHwCache()
	 * @generated
	 */
	int HW_CACHE = 7;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__RES_MULT = HW_MEMORY__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__IS_PROTECTED = HW_MEMORY__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__BASE_PROPERTY = HW_MEMORY__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__BASE_INSTANCE_SPECIFICATION = HW_MEMORY__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__BASE_CLASSIFIER = HW_MEMORY__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__BASE_LIFELINE = HW_MEMORY__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__BASE_CONNECTABLE_ELEMENT = HW_MEMORY__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__DESCRIPTION = HW_MEMORY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__PHW_SERVICES = HW_MEMORY__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__RHW_SERVICES = HW_MEMORY__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__OWNED_HW = HW_MEMORY__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__END_POINTS = HW_MEMORY__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__FREQUENCY = HW_MEMORY__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__OPERATIONS = HW_MEMORY__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__ACTIVITIES = HW_MEMORY__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__NAME = HW_MEMORY__NAME;

	/**
	 * The feature id for the '<em><b>Element Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__ELEMENT_SIZE = HW_MEMORY__ELEMENT_SIZE;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__MEMORY_SIZE = HW_MEMORY__MEMORY_SIZE;

	/**
	 * The feature id for the '<em><b>Adress Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__ADRESS_SIZE = HW_MEMORY__ADRESS_SIZE;

	/**
	 * The feature id for the '<em><b>Timings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__TIMINGS = HW_MEMORY__TIMINGS;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__THROUGHPUT = HW_MEMORY__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__LEVEL = HW_MEMORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__TYPE = HW_MEMORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__STRUCTURE = HW_MEMORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Repl Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__REPL_POLICY = HW_MEMORY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Write Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE__WRITE_POLICY = HW_MEMORY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Hw Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_CACHE_FEATURE_COUNT = HW_MEMORY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Repl_Policy <em>Repl Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Repl_Policy
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getRepl_Policy()
	 * @generated
	 */
	int REPL_POLICY = 8;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.WritePolicy <em>Write Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.WritePolicy
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getWritePolicy()
	 * @generated
	 */
	int WRITE_POLICY = 9;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheType <em>Cache Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheType
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getCacheType()
	 * @generated
	 */
	int CACHE_TYPE = 10;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.ROM_Type <em>ROM Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.ROM_Type
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getROM_Type()
	 * @generated
	 */
	int ROM_TYPE = 11;


	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory <em>Hw Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Memory</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory
	 * @generated
	 */
	EClass getHwMemory();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory#getMemorySize <em>Memory Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Memory Size</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory#getMemorySize()
	 * @see #getHwMemory()
	 * @generated
	 */
	EReference getHwMemory_MemorySize();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory#getAdressSize <em>Adress Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adress Size</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory#getAdressSize()
	 * @see #getHwMemory()
	 * @generated
	 */
	EReference getHwMemory_AdressSize();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory#getTimings <em>Timings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timings</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory#getTimings()
	 * @see #getHwMemory()
	 * @generated
	 */
	EReference getHwMemory_Timings();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throughput</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory#getThroughput()
	 * @see #getHwMemory()
	 * @generated
	 */
	EReference getHwMemory_Throughput();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Timing <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Timing
	 * @generated
	 */
	EClass getTiming();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Timing#getNotation <em>Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Notation</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Timing#getNotation()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Notation();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Timing#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Timing#getDescription()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Description();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Timing#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Timing#getValue()
	 * @see #getTiming()
	 * @generated
	 */
	EReference getTiming_Value();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheStructure <em>Cache Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache Structure</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheStructure
	 * @generated
	 */
	EClass getCacheStructure();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheStructure#getNbSets <em>Nb Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nb Sets</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheStructure#getNbSets()
	 * @see #getCacheStructure()
	 * @generated
	 */
	EReference getCacheStructure_NbSets();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheStructure#getBlockSize <em>Block Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block Size</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheStructure#getBlockSize()
	 * @see #getCacheStructure()
	 * @generated
	 */
	EReference getCacheStructure_BlockSize();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheStructure#getAssociativity <em>Associativity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Associativity</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheStructure#getAssociativity()
	 * @see #getCacheStructure()
	 * @generated
	 */
	EReference getCacheStructure_Associativity();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.MemoryOrganization <em>Memory Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Organization</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.MemoryOrganization
	 * @generated
	 */
	EClass getMemoryOrganization();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.MemoryOrganization#getNbRows <em>Nb Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nb Rows</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.MemoryOrganization#getNbRows()
	 * @see #getMemoryOrganization()
	 * @generated
	 */
	EReference getMemoryOrganization_NbRows();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.MemoryOrganization#getNbColumns <em>Nb Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nb Columns</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.MemoryOrganization#getNbColumns()
	 * @see #getMemoryOrganization()
	 * @generated
	 */
	EReference getMemoryOrganization_NbColumns();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.MemoryOrganization#getNbBanks <em>Nb Banks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nb Banks</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.MemoryOrganization#getNbBanks()
	 * @see #getMemoryOrganization()
	 * @generated
	 */
	EReference getMemoryOrganization_NbBanks();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.MemoryOrganization#getWordSize <em>Word Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Word Size</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.MemoryOrganization#getWordSize()
	 * @see #getMemoryOrganization()
	 * @generated
	 */
	EReference getMemoryOrganization_WordSize();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM <em>Hw RAM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw RAM</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM
	 * @generated
	 */
	EClass getHwRAM();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getOrganization()
	 * @see #getHwRAM()
	 * @generated
	 */
	EReference getHwRAM_Organization();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getIsSynchronous <em>Is Synchronous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Synchronous</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getIsSynchronous()
	 * @see #getHwRAM()
	 * @generated
	 */
	EReference getHwRAM_IsSynchronous();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Static</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getIsStatic()
	 * @see #getHwRAM()
	 * @generated
	 */
	EReference getHwRAM_IsStatic();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getIsNonVolatile <em>Is Non Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Non Volatile</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getIsNonVolatile()
	 * @see #getHwRAM()
	 * @generated
	 */
	EReference getHwRAM_IsNonVolatile();

	/**
	 * Returns the meta object for the attribute '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getRepl_Policy <em>Repl Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repl Policy</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getRepl_Policy()
	 * @see #getHwRAM()
	 * @generated
	 */
	EAttribute getHwRAM_Repl_Policy();

	/**
	 * Returns the meta object for the attribute '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getWritePolicy <em>Write Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Policy</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getWritePolicy()
	 * @see #getHwRAM()
	 * @generated
	 */
	EAttribute getHwRAM_WritePolicy();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwROM <em>Hw ROM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw ROM</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwROM
	 * @generated
	 */
	EClass getHwROM();

	/**
	 * Returns the meta object for the attribute '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwROM#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwROM#getType()
	 * @see #getHwROM()
	 * @generated
	 */
	EAttribute getHwROM_Type();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwROM#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwROM#getOrganization()
	 * @see #getHwROM()
	 * @generated
	 */
	EReference getHwROM_Organization();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwDrive <em>Hw Drive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Drive</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwDrive
	 * @generated
	 */
	EClass getHwDrive();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwDrive#getSectorSize <em>Sector Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sector Size</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwDrive#getSectorSize()
	 * @see #getHwDrive()
	 * @generated
	 */
	EReference getHwDrive_SectorSize();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwDrive#getBuffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Buffer</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwDrive#getBuffer()
	 * @see #getHwDrive()
	 * @generated
	 */
	EReference getHwDrive_Buffer();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache <em>Hw Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Cache</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache
	 * @generated
	 */
	EClass getHwCache();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache#getLevel()
	 * @see #getHwCache()
	 * @generated
	 */
	EReference getHwCache_Level();

	/**
	 * Returns the meta object for the attribute '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache#getType()
	 * @see #getHwCache()
	 * @generated
	 */
	EAttribute getHwCache_Type();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache#getStructure()
	 * @see #getHwCache()
	 * @generated
	 */
	EReference getHwCache_Structure();

	/**
	 * Returns the meta object for the attribute '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache#getRepl_Policy <em>Repl Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repl Policy</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache#getRepl_Policy()
	 * @see #getHwCache()
	 * @generated
	 */
	EAttribute getHwCache_Repl_Policy();

	/**
	 * Returns the meta object for the attribute '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache#getWritePolicy <em>Write Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Policy</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache#getWritePolicy()
	 * @see #getHwCache()
	 * @generated
	 */
	EAttribute getHwCache_WritePolicy();

	/**
	 * Returns the meta object for enum '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Repl_Policy <em>Repl Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Repl Policy</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Repl_Policy
	 * @generated
	 */
	EEnum getRepl_Policy();

	/**
	 * Returns the meta object for enum '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.WritePolicy <em>Write Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Write Policy</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.WritePolicy
	 * @generated
	 */
	EEnum getWritePolicy();

	/**
	 * Returns the meta object for enum '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheType <em>Cache Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Type</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheType
	 * @generated
	 */
	EEnum getCacheType();

	/**
	 * Returns the meta object for enum '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.ROM_Type <em>ROM Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ROM Type</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.ROM_Type
	 * @generated
	 */
	EEnum getROM_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HwMemoryFactory getHwMemoryFactory();

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
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryImpl <em>Hw Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getHwMemory()
		 * @generated
		 */
		EClass HW_MEMORY = eINSTANCE.getHwMemory();

		/**
		 * The meta object literal for the '<em><b>Memory Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_MEMORY__MEMORY_SIZE = eINSTANCE.getHwMemory_MemorySize();

		/**
		 * The meta object literal for the '<em><b>Adress Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_MEMORY__ADRESS_SIZE = eINSTANCE.getHwMemory_AdressSize();

		/**
		 * The meta object literal for the '<em><b>Timings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_MEMORY__TIMINGS = eINSTANCE.getHwMemory_Timings();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_MEMORY__THROUGHPUT = eINSTANCE.getHwMemory_Throughput();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.TimingImpl <em>Timing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.TimingImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getTiming()
		 * @generated
		 */
		EClass TIMING = eINSTANCE.getTiming();

		/**
		 * The meta object literal for the '<em><b>Notation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__NOTATION = eINSTANCE.getTiming_Notation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__DESCRIPTION = eINSTANCE.getTiming_Description();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING__VALUE = eINSTANCE.getTiming_Value();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.CacheStructureImpl <em>Cache Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.CacheStructureImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getCacheStructure()
		 * @generated
		 */
		EClass CACHE_STRUCTURE = eINSTANCE.getCacheStructure();

		/**
		 * The meta object literal for the '<em><b>Nb Sets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE_STRUCTURE__NB_SETS = eINSTANCE.getCacheStructure_NbSets();

		/**
		 * The meta object literal for the '<em><b>Block Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE_STRUCTURE__BLOCK_SIZE = eINSTANCE.getCacheStructure_BlockSize();

		/**
		 * The meta object literal for the '<em><b>Associativity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE_STRUCTURE__ASSOCIATIVITY = eINSTANCE.getCacheStructure_Associativity();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.MemoryOrganizationImpl <em>Memory Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.MemoryOrganizationImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getMemoryOrganization()
		 * @generated
		 */
		EClass MEMORY_ORGANIZATION = eINSTANCE.getMemoryOrganization();

		/**
		 * The meta object literal for the '<em><b>Nb Rows</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_ORGANIZATION__NB_ROWS = eINSTANCE.getMemoryOrganization_NbRows();

		/**
		 * The meta object literal for the '<em><b>Nb Columns</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_ORGANIZATION__NB_COLUMNS = eINSTANCE.getMemoryOrganization_NbColumns();

		/**
		 * The meta object literal for the '<em><b>Nb Banks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_ORGANIZATION__NB_BANKS = eINSTANCE.getMemoryOrganization_NbBanks();

		/**
		 * The meta object literal for the '<em><b>Word Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_ORGANIZATION__WORD_SIZE = eINSTANCE.getMemoryOrganization_WordSize();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwRAMImpl <em>Hw RAM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwRAMImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getHwRAM()
		 * @generated
		 */
		EClass HW_RAM = eINSTANCE.getHwRAM();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_RAM__ORGANIZATION = eINSTANCE.getHwRAM_Organization();

		/**
		 * The meta object literal for the '<em><b>Is Synchronous</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_RAM__IS_SYNCHRONOUS = eINSTANCE.getHwRAM_IsSynchronous();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_RAM__IS_STATIC = eINSTANCE.getHwRAM_IsStatic();

		/**
		 * The meta object literal for the '<em><b>Is Non Volatile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_RAM__IS_NON_VOLATILE = eINSTANCE.getHwRAM_IsNonVolatile();

		/**
		 * The meta object literal for the '<em><b>Repl Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_RAM__REPL_POLICY = eINSTANCE.getHwRAM_Repl_Policy();

		/**
		 * The meta object literal for the '<em><b>Write Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_RAM__WRITE_POLICY = eINSTANCE.getHwRAM_WritePolicy();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwROMImpl <em>Hw ROM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwROMImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getHwROM()
		 * @generated
		 */
		EClass HW_ROM = eINSTANCE.getHwROM();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_ROM__TYPE = eINSTANCE.getHwROM_Type();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_ROM__ORGANIZATION = eINSTANCE.getHwROM_Organization();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwDriveImpl <em>Hw Drive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwDriveImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getHwDrive()
		 * @generated
		 */
		EClass HW_DRIVE = eINSTANCE.getHwDrive();

		/**
		 * The meta object literal for the '<em><b>Sector Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_DRIVE__SECTOR_SIZE = eINSTANCE.getHwDrive_SectorSize();

		/**
		 * The meta object literal for the '<em><b>Buffer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_DRIVE__BUFFER = eINSTANCE.getHwDrive_Buffer();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwCacheImpl <em>Hw Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwCacheImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getHwCache()
		 * @generated
		 */
		EClass HW_CACHE = eINSTANCE.getHwCache();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_CACHE__LEVEL = eINSTANCE.getHwCache_Level();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_CACHE__TYPE = eINSTANCE.getHwCache_Type();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_CACHE__STRUCTURE = eINSTANCE.getHwCache_Structure();

		/**
		 * The meta object literal for the '<em><b>Repl Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_CACHE__REPL_POLICY = eINSTANCE.getHwCache_Repl_Policy();

		/**
		 * The meta object literal for the '<em><b>Write Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_CACHE__WRITE_POLICY = eINSTANCE.getHwCache_WritePolicy();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Repl_Policy <em>Repl Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Repl_Policy
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getRepl_Policy()
		 * @generated
		 */
		EEnum REPL_POLICY = eINSTANCE.getRepl_Policy();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.WritePolicy <em>Write Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.WritePolicy
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getWritePolicy()
		 * @generated
		 */
		EEnum WRITE_POLICY = eINSTANCE.getWritePolicy();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheType <em>Cache Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheType
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getCacheType()
		 * @generated
		 */
		EEnum CACHE_TYPE = eINSTANCE.getCacheType();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.ROM_Type <em>ROM Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.ROM_Type
		 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl#getROM_Type()
		 * @generated
		 */
		EEnum ROM_TYPE = eINSTANCE.getROM_Type();

	}

} //HwMemoryPackage
