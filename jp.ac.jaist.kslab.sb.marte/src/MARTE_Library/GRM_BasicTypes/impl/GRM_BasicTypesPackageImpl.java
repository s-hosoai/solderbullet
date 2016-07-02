/**
 */
package MARTE_Library.GRM_BasicTypes.impl;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;

import MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl;

import MARTE_Library.GRM_BasicTypes.EDF_Parameters;
import MARTE_Library.GRM_BasicTypes.FixedPriorityParameters;
import MARTE_Library.GRM_BasicTypes.GRM_BasicTypesFactory;
import MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage;
import MARTE_Library.GRM_BasicTypes.PeriodicServerKind;
import MARTE_Library.GRM_BasicTypes.PeriodicServerParameters;
import MARTE_Library.GRM_BasicTypes.PoolingParameters;
import MARTE_Library.GRM_BasicTypes.ProtectProtocolKind;
import MARTE_Library.GRM_BasicTypes.SchedParameters;
import MARTE_Library.GRM_BasicTypes.SchedPolicyKind;

import MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage;

import MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl;

import MARTE_Library.MARTE_PrimitivesTypes.MARTE_PrimitivesTypesPackage;

import MARTE_Library.MARTE_PrimitivesTypes.impl.MARTE_PrimitivesTypesPackageImpl;

import MARTE_Library.MeasurementUnits.MeasurementUnitsPackage;

import MARTE_Library.MeasurementUnits.impl.MeasurementUnitsPackageImpl;

import MARTE_Library.RS_Library.RS_LibraryPackage;

import MARTE_Library.RS_Library.impl.RS_LibraryPackageImpl;

import MARTE_Library.TimeLibrary.TimeLibraryPackage;

import MARTE_Library.TimeLibrary.impl.TimeLibraryPackageImpl;

import MARTE_Library.TimeTypesLibrary.TimeTypesLibraryPackage;

import MARTE_Library.TimeTypesLibrary.impl.TimeTypesLibraryPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GRM_BasicTypesPackageImpl extends EPackageImpl implements GRM_BasicTypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edF_ParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedPriorityParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poolingParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicServerParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schedPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protectProtocolKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum periodicServerKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GRM_BasicTypesPackageImpl() {
		super(eNS_URI, GRM_BasicTypesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GRM_BasicTypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GRM_BasicTypesPackage init() {
		if (isInited) return (GRM_BasicTypesPackage)EPackage.Registry.INSTANCE.getEPackage(GRM_BasicTypesPackage.eNS_URI);

		// Obtain or create and register package
		GRM_BasicTypesPackageImpl theGRM_BasicTypesPackage = (GRM_BasicTypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GRM_BasicTypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GRM_BasicTypesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MeasurementUnitsPackageImpl theMeasurementUnitsPackage = (MeasurementUnitsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasurementUnitsPackage.eNS_URI) instanceof MeasurementUnitsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasurementUnitsPackage.eNS_URI) : MeasurementUnitsPackage.eINSTANCE);
		BasicNFP_TypesPackageImpl theBasicNFP_TypesPackage = (BasicNFP_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI) instanceof BasicNFP_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI) : BasicNFP_TypesPackage.eINSTANCE);
		MARTE_DataTypesPackageImpl theMARTE_DataTypesPackage = (MARTE_DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MARTE_DataTypesPackage.eNS_URI) instanceof MARTE_DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MARTE_DataTypesPackage.eNS_URI) : MARTE_DataTypesPackage.eINSTANCE);
		TimeTypesLibraryPackageImpl theTimeTypesLibraryPackage = (TimeTypesLibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimeTypesLibraryPackage.eNS_URI) instanceof TimeTypesLibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimeTypesLibraryPackage.eNS_URI) : TimeTypesLibraryPackage.eINSTANCE);
		TimeLibraryPackageImpl theTimeLibraryPackage = (TimeLibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimeLibraryPackage.eNS_URI) instanceof TimeLibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimeLibraryPackage.eNS_URI) : TimeLibraryPackage.eINSTANCE);
		RS_LibraryPackageImpl theRS_LibraryPackage = (RS_LibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RS_LibraryPackage.eNS_URI) instanceof RS_LibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RS_LibraryPackage.eNS_URI) : RS_LibraryPackage.eINSTANCE);
		MARTE_PrimitivesTypesPackageImpl theMARTE_PrimitivesTypesPackage = (MARTE_PrimitivesTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MARTE_PrimitivesTypesPackage.eNS_URI) instanceof MARTE_PrimitivesTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MARTE_PrimitivesTypesPackage.eNS_URI) : MARTE_PrimitivesTypesPackage.eINSTANCE);

		// Create package meta-data objects
		theGRM_BasicTypesPackage.createPackageContents();
		theMeasurementUnitsPackage.createPackageContents();
		theBasicNFP_TypesPackage.createPackageContents();
		theMARTE_DataTypesPackage.createPackageContents();
		theTimeTypesLibraryPackage.createPackageContents();
		theTimeLibraryPackage.createPackageContents();
		theRS_LibraryPackage.createPackageContents();
		theMARTE_PrimitivesTypesPackage.createPackageContents();

		// Initialize created meta-data
		theGRM_BasicTypesPackage.initializePackageContents();
		theMeasurementUnitsPackage.initializePackageContents();
		theBasicNFP_TypesPackage.initializePackageContents();
		theMARTE_DataTypesPackage.initializePackageContents();
		theTimeTypesLibraryPackage.initializePackageContents();
		theTimeLibraryPackage.initializePackageContents();
		theRS_LibraryPackage.initializePackageContents();
		theMARTE_PrimitivesTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGRM_BasicTypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GRM_BasicTypesPackage.eNS_URI, theGRM_BasicTypesPackage);
		return theGRM_BasicTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDF_Parameters() {
		return edF_ParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDF_Parameters_Deadline() {
		return (EReference)edF_ParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedParameters() {
		return schedParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedParameters_Edf() {
		return (EReference)schedParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedParameters_Fp() {
		return (EReference)schedParametersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedParameters_Pooling() {
		return (EReference)schedParametersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedParameters_Server() {
		return (EReference)schedParametersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedParameters_TableEntry() {
		return (EAttribute)schedParametersEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedPriorityParameters() {
		return fixedPriorityParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFixedPriorityParameters_Priority() {
		return (EReference)fixedPriorityParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoolingParameters() {
		return poolingParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPoolingParameters_Period() {
		return (EReference)poolingParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPoolingParameters_Overhead() {
		return (EReference)poolingParametersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicServerParameters() {
		return periodicServerParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicServerParameters_Kind() {
		return (EAttribute)periodicServerParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicServerParameters_BackgroundPriority() {
		return (EAttribute)periodicServerParametersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicServerParameters_InitialBudget() {
		return (EReference)periodicServerParametersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicServerParameters_ReplenishPeriod() {
		return (EReference)periodicServerParametersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicServerParameters_MaxPendingReplenish() {
		return (EReference)periodicServerParametersEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchedPolicyKind() {
		return schedPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProtectProtocolKind() {
		return protectProtocolKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPeriodicServerKind() {
		return periodicServerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRM_BasicTypesFactory getGRM_BasicTypesFactory() {
		return (GRM_BasicTypesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		edF_ParametersEClass = createEClass(EDF_PARAMETERS);
		createEReference(edF_ParametersEClass, EDF_PARAMETERS__DEADLINE);

		schedParametersEClass = createEClass(SCHED_PARAMETERS);
		createEReference(schedParametersEClass, SCHED_PARAMETERS__EDF);
		createEReference(schedParametersEClass, SCHED_PARAMETERS__FP);
		createEReference(schedParametersEClass, SCHED_PARAMETERS__POOLING);
		createEReference(schedParametersEClass, SCHED_PARAMETERS__SERVER);
		createEAttribute(schedParametersEClass, SCHED_PARAMETERS__TABLE_ENTRY);

		fixedPriorityParametersEClass = createEClass(FIXED_PRIORITY_PARAMETERS);
		createEReference(fixedPriorityParametersEClass, FIXED_PRIORITY_PARAMETERS__PRIORITY);

		poolingParametersEClass = createEClass(POOLING_PARAMETERS);
		createEReference(poolingParametersEClass, POOLING_PARAMETERS__PERIOD);
		createEReference(poolingParametersEClass, POOLING_PARAMETERS__OVERHEAD);

		periodicServerParametersEClass = createEClass(PERIODIC_SERVER_PARAMETERS);
		createEAttribute(periodicServerParametersEClass, PERIODIC_SERVER_PARAMETERS__KIND);
		createEAttribute(periodicServerParametersEClass, PERIODIC_SERVER_PARAMETERS__BACKGROUND_PRIORITY);
		createEReference(periodicServerParametersEClass, PERIODIC_SERVER_PARAMETERS__INITIAL_BUDGET);
		createEReference(periodicServerParametersEClass, PERIODIC_SERVER_PARAMETERS__REPLENISH_PERIOD);
		createEReference(periodicServerParametersEClass, PERIODIC_SERVER_PARAMETERS__MAX_PENDING_REPLENISH);

		// Create enums
		schedPolicyKindEEnum = createEEnum(SCHED_POLICY_KIND);
		protectProtocolKindEEnum = createEEnum(PROTECT_PROTOCOL_KIND);
		periodicServerKindEEnum = createEEnum(PERIODIC_SERVER_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasicNFP_TypesPackage theBasicNFP_TypesPackage = (BasicNFP_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI);
		MARTE_PrimitivesTypesPackage theMARTE_PrimitivesTypesPackage = (MARTE_PrimitivesTypesPackage)EPackage.Registry.INSTANCE.getEPackage(MARTE_PrimitivesTypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		poolingParametersEClass.getESuperTypes().add(this.getFixedPriorityParameters());
		periodicServerParametersEClass.getESuperTypes().add(this.getFixedPriorityParameters());

		// Initialize classes and features; add operations and parameters
		initEClass(edF_ParametersEClass, EDF_Parameters.class, "EDF_Parameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDF_Parameters_Deadline(), theBasicNFP_TypesPackage.getNFP_Duration(), null, "deadline", null, 0, 1, EDF_Parameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(schedParametersEClass, SchedParameters.class, "SchedParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchedParameters_Edf(), this.getEDF_Parameters(), null, "edf", null, 0, 1, SchedParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSchedParameters_Fp(), this.getFixedPriorityParameters(), null, "fp", null, 0, 1, SchedParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSchedParameters_Pooling(), this.getPoolingParameters(), null, "pooling", null, 0, 1, SchedParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSchedParameters_Server(), this.getPeriodicServerParameters(), null, "server", null, 0, 1, SchedParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSchedParameters_TableEntry(), theMARTE_PrimitivesTypesPackage.getString(), "tableEntry", null, 0, -1, SchedParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(fixedPriorityParametersEClass, FixedPriorityParameters.class, "FixedPriorityParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFixedPriorityParameters_Priority(), theBasicNFP_TypesPackage.getNFP_Integer(), null, "priority", null, 0, 1, FixedPriorityParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(poolingParametersEClass, PoolingParameters.class, "PoolingParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPoolingParameters_Period(), theBasicNFP_TypesPackage.getNFP_Duration(), null, "period", null, 0, 1, PoolingParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPoolingParameters_Overhead(), theBasicNFP_TypesPackage.getNFP_Duration(), null, "overhead", null, 0, -1, PoolingParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(periodicServerParametersEClass, PeriodicServerParameters.class, "PeriodicServerParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeriodicServerParameters_Kind(), this.getPeriodicServerKind(), "kind", null, 0, 1, PeriodicServerParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPeriodicServerParameters_BackgroundPriority(), theMARTE_PrimitivesTypesPackage.getInteger(), "backgroundPriority", null, 0, 1, PeriodicServerParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPeriodicServerParameters_InitialBudget(), theBasicNFP_TypesPackage.getNFP_Duration(), null, "initialBudget", null, 0, 1, PeriodicServerParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPeriodicServerParameters_ReplenishPeriod(), theBasicNFP_TypesPackage.getNFP_Duration(), null, "replenishPeriod", null, 0, 1, PeriodicServerParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPeriodicServerParameters_MaxPendingReplenish(), theBasicNFP_TypesPackage.getNFP_Integer(), null, "maxPendingReplenish", null, 0, 1, PeriodicServerParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(schedPolicyKindEEnum, SchedPolicyKind.class, "SchedPolicyKind");
		addEEnumLiteral(schedPolicyKindEEnum, SchedPolicyKind.EARLIEST_DEADLINE_FIRST);
		addEEnumLiteral(schedPolicyKindEEnum, SchedPolicyKind.FIFO);
		addEEnumLiteral(schedPolicyKindEEnum, SchedPolicyKind.FIXED_PRIORITY);
		addEEnumLiteral(schedPolicyKindEEnum, SchedPolicyKind.LEAST_LAXITY_FIRST);
		addEEnumLiteral(schedPolicyKindEEnum, SchedPolicyKind.ROUND_ROBIN);
		addEEnumLiteral(schedPolicyKindEEnum, SchedPolicyKind.TIME_TABLE_DRIVEN);
		addEEnumLiteral(schedPolicyKindEEnum, SchedPolicyKind.UNDEF);
		addEEnumLiteral(schedPolicyKindEEnum, SchedPolicyKind.OTHER);

		initEEnum(protectProtocolKindEEnum, ProtectProtocolKind.class, "ProtectProtocolKind");
		addEEnumLiteral(protectProtocolKindEEnum, ProtectProtocolKind.FIFO);
		addEEnumLiteral(protectProtocolKindEEnum, ProtectProtocolKind.NO_PREEMPTION);
		addEEnumLiteral(protectProtocolKindEEnum, ProtectProtocolKind.PRIORITY_CEILING);
		addEEnumLiteral(protectProtocolKindEEnum, ProtectProtocolKind.PRIORITY_INHERITANCE);
		addEEnumLiteral(protectProtocolKindEEnum, ProtectProtocolKind.STACK_BASED);
		addEEnumLiteral(protectProtocolKindEEnum, ProtectProtocolKind.UNDEF);
		addEEnumLiteral(protectProtocolKindEEnum, ProtectProtocolKind.OTHER);

		initEEnum(periodicServerKindEEnum, PeriodicServerKind.class, "PeriodicServerKind");
		addEEnumLiteral(periodicServerKindEEnum, PeriodicServerKind.SPORADIC);
		addEEnumLiteral(periodicServerKindEEnum, PeriodicServerKind.DEFERRABLE);
		addEEnumLiteral(periodicServerKindEEnum, PeriodicServerKind.UNDEF);
		addEEnumLiteral(periodicServerKindEEnum, PeriodicServerKind.OTHER);

		// Create resource
		createResource(eNS_URI);
	}

} //GRM_BasicTypesPackageImpl
