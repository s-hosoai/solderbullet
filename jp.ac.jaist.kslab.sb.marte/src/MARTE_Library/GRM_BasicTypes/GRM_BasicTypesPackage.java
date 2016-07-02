/**
 */
package MARTE_Library.GRM_BasicTypes;

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
 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesFactory
 * @model kind="package"
 * @generated
 */
public interface GRM_BasicTypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GRM_BasicTypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///MARTE_Library/GRM_BasicTypes.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MARTE_Library.GRM_BasicTypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GRM_BasicTypesPackage eINSTANCE = MARTE_Library.GRM_BasicTypes.impl.GRM_BasicTypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link MARTE_Library.GRM_BasicTypes.impl.EDF_ParametersImpl <em>EDF Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.GRM_BasicTypes.impl.EDF_ParametersImpl
	 * @see MARTE_Library.GRM_BasicTypes.impl.GRM_BasicTypesPackageImpl#getEDF_Parameters()
	 * @generated
	 */
	int EDF_PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDF_PARAMETERS__DEADLINE = 0;

	/**
	 * The number of structural features of the '<em>EDF Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDF_PARAMETERS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link MARTE_Library.GRM_BasicTypes.impl.SchedParametersImpl <em>Sched Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.GRM_BasicTypes.impl.SchedParametersImpl
	 * @see MARTE_Library.GRM_BasicTypes.impl.GRM_BasicTypesPackageImpl#getSchedParameters()
	 * @generated
	 */
	int SCHED_PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Edf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHED_PARAMETERS__EDF = 0;

	/**
	 * The feature id for the '<em><b>Fp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHED_PARAMETERS__FP = 1;

	/**
	 * The feature id for the '<em><b>Pooling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHED_PARAMETERS__POOLING = 2;

	/**
	 * The feature id for the '<em><b>Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHED_PARAMETERS__SERVER = 3;

	/**
	 * The feature id for the '<em><b>Table Entry</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHED_PARAMETERS__TABLE_ENTRY = 4;

	/**
	 * The number of structural features of the '<em>Sched Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHED_PARAMETERS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link MARTE_Library.GRM_BasicTypes.impl.FixedPriorityParametersImpl <em>Fixed Priority Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.GRM_BasicTypes.impl.FixedPriorityParametersImpl
	 * @see MARTE_Library.GRM_BasicTypes.impl.GRM_BasicTypesPackageImpl#getFixedPriorityParameters()
	 * @generated
	 */
	int FIXED_PRIORITY_PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PRIORITY_PARAMETERS__PRIORITY = 0;

	/**
	 * The number of structural features of the '<em>Fixed Priority Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PRIORITY_PARAMETERS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link MARTE_Library.GRM_BasicTypes.impl.PoolingParametersImpl <em>Pooling Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.GRM_BasicTypes.impl.PoolingParametersImpl
	 * @see MARTE_Library.GRM_BasicTypes.impl.GRM_BasicTypesPackageImpl#getPoolingParameters()
	 * @generated
	 */
	int POOLING_PARAMETERS = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLING_PARAMETERS__PRIORITY = FIXED_PRIORITY_PARAMETERS__PRIORITY;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLING_PARAMETERS__PERIOD = FIXED_PRIORITY_PARAMETERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Overhead</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLING_PARAMETERS__OVERHEAD = FIXED_PRIORITY_PARAMETERS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pooling Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOLING_PARAMETERS_FEATURE_COUNT = FIXED_PRIORITY_PARAMETERS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link MARTE_Library.GRM_BasicTypes.impl.PeriodicServerParametersImpl <em>Periodic Server Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.GRM_BasicTypes.impl.PeriodicServerParametersImpl
	 * @see MARTE_Library.GRM_BasicTypes.impl.GRM_BasicTypesPackageImpl#getPeriodicServerParameters()
	 * @generated
	 */
	int PERIODIC_SERVER_PARAMETERS = 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_SERVER_PARAMETERS__PRIORITY = FIXED_PRIORITY_PARAMETERS__PRIORITY;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_SERVER_PARAMETERS__KIND = FIXED_PRIORITY_PARAMETERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Background Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_SERVER_PARAMETERS__BACKGROUND_PRIORITY = FIXED_PRIORITY_PARAMETERS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial Budget</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_SERVER_PARAMETERS__INITIAL_BUDGET = FIXED_PRIORITY_PARAMETERS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Replenish Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_SERVER_PARAMETERS__REPLENISH_PERIOD = FIXED_PRIORITY_PARAMETERS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Pending Replenish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_SERVER_PARAMETERS__MAX_PENDING_REPLENISH = FIXED_PRIORITY_PARAMETERS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Periodic Server Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_SERVER_PARAMETERS_FEATURE_COUNT = FIXED_PRIORITY_PARAMETERS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link MARTE_Library.GRM_BasicTypes.SchedPolicyKind <em>Sched Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.GRM_BasicTypes.SchedPolicyKind
	 * @see MARTE_Library.GRM_BasicTypes.impl.GRM_BasicTypesPackageImpl#getSchedPolicyKind()
	 * @generated
	 */
	int SCHED_POLICY_KIND = 5;

	/**
	 * The meta object id for the '{@link MARTE_Library.GRM_BasicTypes.ProtectProtocolKind <em>Protect Protocol Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.GRM_BasicTypes.ProtectProtocolKind
	 * @see MARTE_Library.GRM_BasicTypes.impl.GRM_BasicTypesPackageImpl#getProtectProtocolKind()
	 * @generated
	 */
	int PROTECT_PROTOCOL_KIND = 6;

	/**
	 * The meta object id for the '{@link MARTE_Library.GRM_BasicTypes.PeriodicServerKind <em>Periodic Server Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.GRM_BasicTypes.PeriodicServerKind
	 * @see MARTE_Library.GRM_BasicTypes.impl.GRM_BasicTypesPackageImpl#getPeriodicServerKind()
	 * @generated
	 */
	int PERIODIC_SERVER_KIND = 7;


	/**
	 * Returns the meta object for class '{@link MARTE_Library.GRM_BasicTypes.EDF_Parameters <em>EDF Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDF Parameters</em>'.
	 * @see MARTE_Library.GRM_BasicTypes.EDF_Parameters
	 * @generated
	 */
	EClass getEDF_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.GRM_BasicTypes.EDF_Parameters#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deadline</em>'.
	 * @see MARTE_Library.GRM_BasicTypes.EDF_Parameters#getDeadline()
	 * @see #getEDF_Parameters()
	 * @generated
	 */
	EReference getEDF_Parameters_Deadline();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.GRM_BasicTypes.SchedParameters <em>Sched Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sched Parameters</em>'.
	 * @see MARTE_Library.GRM_BasicTypes.SchedParameters
	 * @generated
	 */
	EClass getSchedParameters();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.GRM_BasicTypes.SchedParameters#getEdf <em>Edf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Edf</em>'.
	 * @see MARTE_Library.GRM_BasicTypes.SchedParameters#getEdf()
	 * @see #getSchedParameters()
	 * @generated
	 */
	EReference getSchedParameters_Edf();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.GRM_BasicTypes.SchedParameters#getFp <em>Fp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fp</em>'.
	 * @see MARTE_Library.GRM_BasicTypes.SchedParameters#getFp()
	 * @see #getSchedParameters()
	 * @generated
	 */
	EReference getSchedParameters_Fp();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.GRM_BasicTypes.SchedParameters#getPooling <em>Pooling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pooling</em>'.
	 * @see MARTE_Library.GRM_BasicTypes.SchedParameters#getPooling()
	 * @see #getSchedParameters()
	 * @generated
	 */
	EReference getSchedParameters_Pooling();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.GRM_BasicTypes.SchedParameters#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Server</em>'.
	 * @see MARTE_Library.GRM_BasicTypes.SchedParameters#getServer()
	 * @see #getSchedParameters()
	 * @generated
	 */
	EReference getSchedParameters_Server();

	/**
	 * Returns the meta object for the attribute list '{@link MARTE_Library.GRM_BasicTypes.SchedParameters#getTableEntry <em>Table Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Table Entry</em>'.
	 * @see MARTE_Library.GRM_BasicTypes.SchedParameters#getTableEntry()
	 * @see #getSchedParameters()
	 * @generated
	 */
	EAttribute getSchedParameters_TableEntry();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.GRM_BasicTypes.FixedPriorityParameters <em>Fixed Priority Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Priority Parameters</em>'.
	 * @see MARTE_Library.GRM_BasicTypes.FixedPriorityParameters
	 * @generated
	 */
	EClass getFixedPriorityParameters();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.GRM_BasicTypes.FixedPriorityParameters#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Priority</em>'.
	 * @see MARTE_Library.GRM_BasicTypes.FixedPriorityParameters#getPriority()
	 * @see #getFixedPriorityParameters()
	 * @generated
	 */
	EReference getFixedPriorityParameters_Priority();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.GRM_BasicTypes.PoolingParameters <em>Pooling Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pooling Parameters</em>'.
	 * @see MARTE_Library.GRM_BasicTypes.PoolingParameters
	 * @generated
	 */
	EClass getPoolingParameters();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.GRM_BasicTypes.PoolingParameters#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see MARTE_Library.GRM_BasicTypes.PoolingParameters#getPeriod()
	 * @see #getPoolingParameters()
	 * @generated
	 */
	EReference getPoolingParameters_Period();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE_Library.GRM_BasicTypes.PoolingParameters#getOverhead <em>Overhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Overhead</em>'.
	 * @see MARTE_Library.GRM_BasicTypes.PoolingParameters#getOverhead()
	 * @see #getPoolingParameters()
	 * @generated
	 */
	EReference getPoolingParameters_Overhead();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.GRM_BasicTypes.PeriodicServerParameters <em>Periodic Server Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Server Parameters</em>'.
	 * @see MARTE_Library.GRM_BasicTypes.PeriodicServerParameters
	 * @generated
	 */
	EClass getPeriodicServerParameters();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.GRM_BasicTypes.PeriodicServerParameters#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see MARTE_Library.GRM_BasicTypes.PeriodicServerParameters#getKind()
	 * @see #getPeriodicServerParameters()
	 * @generated
	 */
	EAttribute getPeriodicServerParameters_Kind();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.GRM_BasicTypes.PeriodicServerParameters#getBackgroundPriority <em>Background Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Priority</em>'.
	 * @see MARTE_Library.GRM_BasicTypes.PeriodicServerParameters#getBackgroundPriority()
	 * @see #getPeriodicServerParameters()
	 * @generated
	 */
	EAttribute getPeriodicServerParameters_BackgroundPriority();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.GRM_BasicTypes.PeriodicServerParameters#getInitialBudget <em>Initial Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Budget</em>'.
	 * @see MARTE_Library.GRM_BasicTypes.PeriodicServerParameters#getInitialBudget()
	 * @see #getPeriodicServerParameters()
	 * @generated
	 */
	EReference getPeriodicServerParameters_InitialBudget();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.GRM_BasicTypes.PeriodicServerParameters#getReplenishPeriod <em>Replenish Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Replenish Period</em>'.
	 * @see MARTE_Library.GRM_BasicTypes.PeriodicServerParameters#getReplenishPeriod()
	 * @see #getPeriodicServerParameters()
	 * @generated
	 */
	EReference getPeriodicServerParameters_ReplenishPeriod();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.GRM_BasicTypes.PeriodicServerParameters#getMaxPendingReplenish <em>Max Pending Replenish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Pending Replenish</em>'.
	 * @see MARTE_Library.GRM_BasicTypes.PeriodicServerParameters#getMaxPendingReplenish()
	 * @see #getPeriodicServerParameters()
	 * @generated
	 */
	EReference getPeriodicServerParameters_MaxPendingReplenish();

	/**
	 * Returns the meta object for enum '{@link MARTE_Library.GRM_BasicTypes.SchedPolicyKind <em>Sched Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sched Policy Kind</em>'.
	 * @see MARTE_Library.GRM_BasicTypes.SchedPolicyKind
	 * @generated
	 */
	EEnum getSchedPolicyKind();

	/**
	 * Returns the meta object for enum '{@link MARTE_Library.GRM_BasicTypes.ProtectProtocolKind <em>Protect Protocol Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protect Protocol Kind</em>'.
	 * @see MARTE_Library.GRM_BasicTypes.ProtectProtocolKind
	 * @generated
	 */
	EEnum getProtectProtocolKind();

	/**
	 * Returns the meta object for enum '{@link MARTE_Library.GRM_BasicTypes.PeriodicServerKind <em>Periodic Server Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Periodic Server Kind</em>'.
	 * @see MARTE_Library.GRM_BasicTypes.PeriodicServerKind
	 * @generated
	 */
	EEnum getPeriodicServerKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GRM_BasicTypesFactory getGRM_BasicTypesFactory();

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
		 * The meta object literal for the '{@link MARTE_Library.GRM_BasicTypes.impl.EDF_ParametersImpl <em>EDF Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.GRM_BasicTypes.impl.EDF_ParametersImpl
		 * @see MARTE_Library.GRM_BasicTypes.impl.GRM_BasicTypesPackageImpl#getEDF_Parameters()
		 * @generated
		 */
		EClass EDF_PARAMETERS = eINSTANCE.getEDF_Parameters();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDF_PARAMETERS__DEADLINE = eINSTANCE.getEDF_Parameters_Deadline();

		/**
		 * The meta object literal for the '{@link MARTE_Library.GRM_BasicTypes.impl.SchedParametersImpl <em>Sched Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.GRM_BasicTypes.impl.SchedParametersImpl
		 * @see MARTE_Library.GRM_BasicTypes.impl.GRM_BasicTypesPackageImpl#getSchedParameters()
		 * @generated
		 */
		EClass SCHED_PARAMETERS = eINSTANCE.getSchedParameters();

		/**
		 * The meta object literal for the '<em><b>Edf</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHED_PARAMETERS__EDF = eINSTANCE.getSchedParameters_Edf();

		/**
		 * The meta object literal for the '<em><b>Fp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHED_PARAMETERS__FP = eINSTANCE.getSchedParameters_Fp();

		/**
		 * The meta object literal for the '<em><b>Pooling</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHED_PARAMETERS__POOLING = eINSTANCE.getSchedParameters_Pooling();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHED_PARAMETERS__SERVER = eINSTANCE.getSchedParameters_Server();

		/**
		 * The meta object literal for the '<em><b>Table Entry</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHED_PARAMETERS__TABLE_ENTRY = eINSTANCE.getSchedParameters_TableEntry();

		/**
		 * The meta object literal for the '{@link MARTE_Library.GRM_BasicTypes.impl.FixedPriorityParametersImpl <em>Fixed Priority Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.GRM_BasicTypes.impl.FixedPriorityParametersImpl
		 * @see MARTE_Library.GRM_BasicTypes.impl.GRM_BasicTypesPackageImpl#getFixedPriorityParameters()
		 * @generated
		 */
		EClass FIXED_PRIORITY_PARAMETERS = eINSTANCE.getFixedPriorityParameters();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_PRIORITY_PARAMETERS__PRIORITY = eINSTANCE.getFixedPriorityParameters_Priority();

		/**
		 * The meta object literal for the '{@link MARTE_Library.GRM_BasicTypes.impl.PoolingParametersImpl <em>Pooling Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.GRM_BasicTypes.impl.PoolingParametersImpl
		 * @see MARTE_Library.GRM_BasicTypes.impl.GRM_BasicTypesPackageImpl#getPoolingParameters()
		 * @generated
		 */
		EClass POOLING_PARAMETERS = eINSTANCE.getPoolingParameters();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POOLING_PARAMETERS__PERIOD = eINSTANCE.getPoolingParameters_Period();

		/**
		 * The meta object literal for the '<em><b>Overhead</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POOLING_PARAMETERS__OVERHEAD = eINSTANCE.getPoolingParameters_Overhead();

		/**
		 * The meta object literal for the '{@link MARTE_Library.GRM_BasicTypes.impl.PeriodicServerParametersImpl <em>Periodic Server Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.GRM_BasicTypes.impl.PeriodicServerParametersImpl
		 * @see MARTE_Library.GRM_BasicTypes.impl.GRM_BasicTypesPackageImpl#getPeriodicServerParameters()
		 * @generated
		 */
		EClass PERIODIC_SERVER_PARAMETERS = eINSTANCE.getPeriodicServerParameters();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_SERVER_PARAMETERS__KIND = eINSTANCE.getPeriodicServerParameters_Kind();

		/**
		 * The meta object literal for the '<em><b>Background Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_SERVER_PARAMETERS__BACKGROUND_PRIORITY = eINSTANCE.getPeriodicServerParameters_BackgroundPriority();

		/**
		 * The meta object literal for the '<em><b>Initial Budget</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_SERVER_PARAMETERS__INITIAL_BUDGET = eINSTANCE.getPeriodicServerParameters_InitialBudget();

		/**
		 * The meta object literal for the '<em><b>Replenish Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_SERVER_PARAMETERS__REPLENISH_PERIOD = eINSTANCE.getPeriodicServerParameters_ReplenishPeriod();

		/**
		 * The meta object literal for the '<em><b>Max Pending Replenish</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_SERVER_PARAMETERS__MAX_PENDING_REPLENISH = eINSTANCE.getPeriodicServerParameters_MaxPendingReplenish();

		/**
		 * The meta object literal for the '{@link MARTE_Library.GRM_BasicTypes.SchedPolicyKind <em>Sched Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.GRM_BasicTypes.SchedPolicyKind
		 * @see MARTE_Library.GRM_BasicTypes.impl.GRM_BasicTypesPackageImpl#getSchedPolicyKind()
		 * @generated
		 */
		EEnum SCHED_POLICY_KIND = eINSTANCE.getSchedPolicyKind();

		/**
		 * The meta object literal for the '{@link MARTE_Library.GRM_BasicTypes.ProtectProtocolKind <em>Protect Protocol Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.GRM_BasicTypes.ProtectProtocolKind
		 * @see MARTE_Library.GRM_BasicTypes.impl.GRM_BasicTypesPackageImpl#getProtectProtocolKind()
		 * @generated
		 */
		EEnum PROTECT_PROTOCOL_KIND = eINSTANCE.getProtectProtocolKind();

		/**
		 * The meta object literal for the '{@link MARTE_Library.GRM_BasicTypes.PeriodicServerKind <em>Periodic Server Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.GRM_BasicTypes.PeriodicServerKind
		 * @see MARTE_Library.GRM_BasicTypes.impl.GRM_BasicTypesPackageImpl#getPeriodicServerKind()
		 * @generated
		 */
		EEnum PERIODIC_SERVER_KIND = eINSTANCE.getPeriodicServerKind();

	}

} //GRM_BasicTypesPackage
