/**
 */
package MARTE.MARTE_DesignModel.HRM.HwGeneral;

import MARTE.MARTE_Foundations.GRM.GRMPackage;

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
 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralFactory
 * @model kind="package"
 * @generated
 */
public interface HwGeneralPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HwGeneral";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///MARTE/MARTE_DesignModel/HRM/HwGeneral.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MARTE.MARTE_DesignModel.HRM.HwGeneral";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwGeneralPackage eINSTANCE = MARTE.MARTE_DesignModel.HRM.HwGeneral.impl.HwGeneralPackageImpl.init();

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.impl.HwResourceServiceImpl <em>Hw Resource Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.impl.HwResourceServiceImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.impl.HwGeneralPackageImpl#getHwResourceService()
	 * @generated
	 */
	int HW_RESOURCE_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE_SERVICE__OWNER = GRMPackage.GR_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Base Execution Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE_SERVICE__BASE_EXECUTION_SPECIFICATION = GRMPackage.GR_SERVICE__BASE_EXECUTION_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Behavioral Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE_SERVICE__BASE_BEHAVIORAL_FEATURE = GRMPackage.GR_SERVICE__BASE_BEHAVIORAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE_SERVICE__BASE_BEHAVIOR = GRMPackage.GR_SERVICE__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Collaboration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE_SERVICE__BASE_COLLABORATION = GRMPackage.GR_SERVICE__BASE_COLLABORATION;

	/**
	 * The feature id for the '<em><b>Base Collaboration Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE_SERVICE__BASE_COLLABORATION_USE = GRMPackage.GR_SERVICE__BASE_COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>Consumption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE_SERVICE__CONSUMPTION = GRMPackage.GR_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dissipation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE_SERVICE__DISSIPATION = GRMPackage.GR_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hw Resource Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE_SERVICE_FEATURE_COUNT = GRMPackage.GR_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.impl.HwResourceImpl <em>Hw Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.impl.HwResourceImpl
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.impl.HwGeneralPackageImpl#getHwResource()
	 * @generated
	 */
	int HW_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE__RES_MULT = GRMPackage.RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE__IS_PROTECTED = GRMPackage.RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE__BASE_PROPERTY = GRMPackage.RESOURCE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE__BASE_INSTANCE_SPECIFICATION = GRMPackage.RESOURCE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE__BASE_CLASSIFIER = GRMPackage.RESOURCE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE__BASE_LIFELINE = GRMPackage.RESOURCE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE__BASE_CONNECTABLE_ELEMENT = GRMPackage.RESOURCE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE__DESCRIPTION = GRMPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>PHW Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE__PHW_SERVICES = GRMPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>RHW Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE__RHW_SERVICES = GRMPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned HW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE__OWNED_HW = GRMPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE__END_POINTS = GRMPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE__FREQUENCY = GRMPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE__OPERATIONS = GRMPackage.RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE__ACTIVITIES = GRMPackage.RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE__NAME = GRMPackage.RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Hw Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_RESOURCE_FEATURE_COUNT = GRMPackage.RESOURCE_FEATURE_COUNT + 9;


	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResourceService <em>Hw Resource Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Resource Service</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResourceService
	 * @generated
	 */
	EClass getHwResourceService();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResourceService#getConsumption <em>Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consumption</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResourceService#getConsumption()
	 * @see #getHwResourceService()
	 * @generated
	 */
	EReference getHwResourceService_Consumption();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResourceService#getDissipation <em>Dissipation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dissipation</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResourceService#getDissipation()
	 * @see #getHwResourceService()
	 * @generated
	 */
	EReference getHwResourceService_Dissipation();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource <em>Hw Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw Resource</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource
	 * @generated
	 */
	EClass getHwResource();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getDescription()
	 * @see #getHwResource()
	 * @generated
	 */
	EReference getHwResource_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getP_HW_Services <em>PHW Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>PHW Services</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getP_HW_Services()
	 * @see #getHwResource()
	 * @generated
	 */
	EReference getHwResource_P_HW_Services();

	/**
	 * Returns the meta object for the reference list '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getR_HW_Services <em>RHW Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RHW Services</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getR_HW_Services()
	 * @see #getHwResource()
	 * @generated
	 */
	EReference getHwResource_R_HW_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getOwnedHW <em>Owned HW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned HW</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getOwnedHW()
	 * @see #getHwResource()
	 * @generated
	 */
	EReference getHwResource_OwnedHW();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getEndPoints <em>End Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End Points</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getEndPoints()
	 * @see #getHwResource()
	 * @generated
	 */
	EReference getHwResource_EndPoints();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frequency</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getFrequency()
	 * @see #getHwResource()
	 * @generated
	 */
	EReference getHwResource_Frequency();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getOperations()
	 * @see #getHwResource()
	 * @generated
	 */
	EReference getHwResource_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getActivities()
	 * @see #getHwResource()
	 * @generated
	 */
	EReference getHwResource_Activities();

	/**
	 * Returns the meta object for the attribute '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getName()
	 * @see #getHwResource()
	 * @generated
	 */
	EAttribute getHwResource_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HwGeneralFactory getHwGeneralFactory();

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
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.impl.HwResourceServiceImpl <em>Hw Resource Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.impl.HwResourceServiceImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.impl.HwGeneralPackageImpl#getHwResourceService()
		 * @generated
		 */
		EClass HW_RESOURCE_SERVICE = eINSTANCE.getHwResourceService();

		/**
		 * The meta object literal for the '<em><b>Consumption</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_RESOURCE_SERVICE__CONSUMPTION = eINSTANCE.getHwResourceService_Consumption();

		/**
		 * The meta object literal for the '<em><b>Dissipation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_RESOURCE_SERVICE__DISSIPATION = eINSTANCE.getHwResourceService_Dissipation();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.impl.HwResourceImpl <em>Hw Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.impl.HwResourceImpl
		 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.impl.HwGeneralPackageImpl#getHwResource()
		 * @generated
		 */
		EClass HW_RESOURCE = eINSTANCE.getHwResource();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_RESOURCE__DESCRIPTION = eINSTANCE.getHwResource_Description();

		/**
		 * The meta object literal for the '<em><b>PHW Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_RESOURCE__PHW_SERVICES = eINSTANCE.getHwResource_P_HW_Services();

		/**
		 * The meta object literal for the '<em><b>RHW Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_RESOURCE__RHW_SERVICES = eINSTANCE.getHwResource_R_HW_Services();

		/**
		 * The meta object literal for the '<em><b>Owned HW</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_RESOURCE__OWNED_HW = eINSTANCE.getHwResource_OwnedHW();

		/**
		 * The meta object literal for the '<em><b>End Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_RESOURCE__END_POINTS = eINSTANCE.getHwResource_EndPoints();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_RESOURCE__FREQUENCY = eINSTANCE.getHwResource_Frequency();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_RESOURCE__OPERATIONS = eINSTANCE.getHwResource_Operations();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_RESOURCE__ACTIVITIES = eINSTANCE.getHwResource_Activities();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_RESOURCE__NAME = eINSTANCE.getHwResource_Name();

	}

} //HwGeneralPackage
