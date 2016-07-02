/**
 */
package MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout;

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
 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutFactory
 * @model kind="package"
 * @generated
 */
public interface HwLayoutPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HwLayout";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///MARTE/MARTE_DesignModel/HRM/HwPhysical/HwLayout.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwLayoutPackage eINSTANCE = MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwLayoutPackageImpl.init();

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwComponentImpl <em>Hw Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwComponentImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwLayoutPackageImpl#getHwComponent()
	 * @generated
	 */
	int HW_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__RES_MULT = HwGeneralPackage.HW_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__IS_PROTECTED = HwGeneralPackage.HW_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__BASE_PROPERTY = HwGeneralPackage.HW_RESOURCE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__BASE_INSTANCE_SPECIFICATION = HwGeneralPackage.HW_RESOURCE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__BASE_CLASSIFIER = HwGeneralPackage.HW_RESOURCE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__BASE_LIFELINE = HwGeneralPackage.HW_RESOURCE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__BASE_CONNECTABLE_ELEMENT = HwGeneralPackage.HW_RESOURCE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__DESCRIPTION = HwGeneralPackage.HW_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__PHW_SERVICES = HwGeneralPackage.HW_RESOURCE__PHW_SERVICES;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__RHW_SERVICES = HwGeneralPackage.HW_RESOURCE__RHW_SERVICES;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__OWNED_HW = HwGeneralPackage.HW_RESOURCE__OWNED_HW;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__END_POINTS = HwGeneralPackage.HW_RESOURCE__END_POINTS;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__FREQUENCY = HwGeneralPackage.HW_RESOURCE__FREQUENCY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__OPERATIONS = HwGeneralPackage.HW_RESOURCE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__ACTIVITIES = HwGeneralPackage.HW_RESOURCE__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__NAME = HwGeneralPackage.HW_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__KIND = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__DIMENSIONS = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__AREA = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__POSITION = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__GRID = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nb Pins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__NB_PINS = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__WEIGHT = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__PRICE = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>RConditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__RCONDITIONS = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Powered Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__POWERED_SERVICES = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Static Consumption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__STATIC_CONSUMPTION = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Static Dissipation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__STATIC_DISSIPATION = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Sub Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT__SUB_COMPONENTS = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Hw Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_COMPONENT_FEATURE_COUNT = HwGeneralPackage.HW_RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.Env_ConditionImpl <em>Env Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.Env_ConditionImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwLayoutPackageImpl#getEnv_Condition()
	 * @generated
	 */
	int ENV_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_CONDITION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_CONDITION__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_CONDITION__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_CONDITION__RANGE = 3;

	/**
	 * The number of structural features of the '<em>Env Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_CONDITION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentKind <em>Component Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentKind
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwLayoutPackageImpl#getComponentKind()
	 * @generated
	 */
	int COMPONENT_KIND = 2;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ConditionType <em>Condition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ConditionType
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwLayoutPackageImpl#getConditionType()
	 * @generated
	 */
	int CONDITION_TYPE = 3;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentState <em>Component State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentState
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwLayoutPackageImpl#getComponentState()
	 * @generated
	 */
	int COMPONENT_STATE = 4;


	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent <em>Hw Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Component</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent
	 * @generated
	 */
	EClass getHwComponent();

	/**
	 * Returns the meta object for the attribute '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getKind()
	 * @see #getHwComponent()
	 * @generated
	 */
	EAttribute getHwComponent_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimensions</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getDimensions()
	 * @see #getHwComponent()
	 * @generated
	 */
	EReference getHwComponent_Dimensions();

	/**
	 * Returns the meta object for the reference '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Area</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getArea()
	 * @see #getHwComponent()
	 * @generated
	 */
	EReference getHwComponent_Area();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Position</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getPosition()
	 * @see #getHwComponent()
	 * @generated
	 */
	EReference getHwComponent_Position();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grid</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getGrid()
	 * @see #getHwComponent()
	 * @generated
	 */
	EReference getHwComponent_Grid();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getNbPins <em>Nb Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nb Pins</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getNbPins()
	 * @see #getHwComponent()
	 * @generated
	 */
	EReference getHwComponent_NbPins();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Weight</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getWeight()
	 * @see #getHwComponent()
	 * @generated
	 */
	EReference getHwComponent_Weight();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Price</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getPrice()
	 * @see #getHwComponent()
	 * @generated
	 */
	EReference getHwComponent_Price();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getR_Conditions <em>RConditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RConditions</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getR_Conditions()
	 * @see #getHwComponent()
	 * @generated
	 */
	EReference getHwComponent_R_Conditions();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getPoweredServices <em>Powered Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Powered Services</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getPoweredServices()
	 * @see #getHwComponent()
	 * @generated
	 */
	EReference getHwComponent_PoweredServices();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getStaticConsumption <em>Static Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Static Consumption</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getStaticConsumption()
	 * @see #getHwComponent()
	 * @generated
	 */
	EReference getHwComponent_StaticConsumption();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getStaticDissipation <em>Static Dissipation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Static Dissipation</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getStaticDissipation()
	 * @see #getHwComponent()
	 * @generated
	 */
	EReference getHwComponent_StaticDissipation();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getSubComponents <em>Sub Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Components</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getSubComponents()
	 * @see #getHwComponent()
	 * @generated
	 */
	EReference getHwComponent_SubComponents();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition <em>Env Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Condition</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition
	 * @generated
	 */
	EClass getEnv_Condition();

	/**
	 * Returns the meta object for the attribute '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition#getType()
	 * @see #getEnv_Condition()
	 * @generated
	 */
	EAttribute getEnv_Condition_Type();

	/**
	 * Returns the meta object for the attribute '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition#getStatus()
	 * @see #getEnv_Condition()
	 * @generated
	 */
	EAttribute getEnv_Condition_Status();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition#getDescription()
	 * @see #getEnv_Condition()
	 * @generated
	 */
	EReference getEnv_Condition_Description();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition#getRange()
	 * @see #getEnv_Condition()
	 * @generated
	 */
	EReference getEnv_Condition_Range();

	/**
	 * Returns the meta object for enum '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentKind <em>Component Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Kind</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentKind
	 * @generated
	 */
	EEnum getComponentKind();

	/**
	 * Returns the meta object for enum '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Type</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ConditionType
	 * @generated
	 */
	EEnum getConditionType();

	/**
	 * Returns the meta object for enum '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentState <em>Component State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component State</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentState
	 * @generated
	 */
	EEnum getComponentState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HwLayoutFactory getHwLayoutFactory();

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
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwComponentImpl <em>Hw Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwComponentImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwLayoutPackageImpl#getHwComponent()
		 * @generated
		 */
		EClass HW_COMPONENT = eINSTANCE.getHwComponent();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_COMPONENT__KIND = eINSTANCE.getHwComponent_Kind();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_COMPONENT__DIMENSIONS = eINSTANCE.getHwComponent_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_COMPONENT__AREA = eINSTANCE.getHwComponent_Area();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_COMPONENT__POSITION = eINSTANCE.getHwComponent_Position();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_COMPONENT__GRID = eINSTANCE.getHwComponent_Grid();

		/**
		 * The meta object literal for the '<em><b>Nb Pins</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_COMPONENT__NB_PINS = eINSTANCE.getHwComponent_NbPins();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_COMPONENT__WEIGHT = eINSTANCE.getHwComponent_Weight();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_COMPONENT__PRICE = eINSTANCE.getHwComponent_Price();

		/**
		 * The meta object literal for the '<em><b>RConditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_COMPONENT__RCONDITIONS = eINSTANCE.getHwComponent_R_Conditions();

		/**
		 * The meta object literal for the '<em><b>Powered Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_COMPONENT__POWERED_SERVICES = eINSTANCE.getHwComponent_PoweredServices();

		/**
		 * The meta object literal for the '<em><b>Static Consumption</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_COMPONENT__STATIC_CONSUMPTION = eINSTANCE.getHwComponent_StaticConsumption();

		/**
		 * The meta object literal for the '<em><b>Static Dissipation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_COMPONENT__STATIC_DISSIPATION = eINSTANCE.getHwComponent_StaticDissipation();

		/**
		 * The meta object literal for the '<em><b>Sub Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_COMPONENT__SUB_COMPONENTS = eINSTANCE.getHwComponent_SubComponents();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.Env_ConditionImpl <em>Env Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.Env_ConditionImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwLayoutPackageImpl#getEnv_Condition()
		 * @generated
		 */
		EClass ENV_CONDITION = eINSTANCE.getEnv_Condition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_CONDITION__TYPE = eINSTANCE.getEnv_Condition_Type();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_CONDITION__STATUS = eINSTANCE.getEnv_Condition_Status();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENV_CONDITION__DESCRIPTION = eINSTANCE.getEnv_Condition_Description();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENV_CONDITION__RANGE = eINSTANCE.getEnv_Condition_Range();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentKind <em>Component Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentKind
		 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwLayoutPackageImpl#getComponentKind()
		 * @generated
		 */
		EEnum COMPONENT_KIND = eINSTANCE.getComponentKind();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ConditionType <em>Condition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ConditionType
		 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwLayoutPackageImpl#getConditionType()
		 * @generated
		 */
		EEnum CONDITION_TYPE = eINSTANCE.getConditionType();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentState <em>Component State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentState
		 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwLayoutPackageImpl#getComponentState()
		 * @generated
		 */
		EEnum COMPONENT_STATE = eINSTANCE.getComponentState();

	}

} //HwLayoutPackage
