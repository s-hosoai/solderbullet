/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Concurrency;

import MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwResource;

import MARTE_Library.BasicNFP_Types.ArrivalPattern;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sw Concurrent Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource#getType <em>Type</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource#getActivationCapacity <em>Activation Capacity</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource#getEntryPoints <em>Entry Points</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource#getAdressSpace <em>Adress Space</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource#getPeriodElements <em>Period Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource#getPriorityElements <em>Priority Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource#getStackSizeElements <em>Stack Size Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource#getActivateServices <em>Activate Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource#getEnableConcurrencyServices <em>Enable Concurrency Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource#getResumeServices <em>Resume Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource#getSuspendServices <em>Suspend Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource#getTerminateServices <em>Terminate Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource#getDisableConcurrencyServices <em>Disable Concurrency Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource#getShareDataResources <em>Share Data Resources</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource#getMessageResources <em>Message Resources</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource#getMutualExclusionResources <em>Mutual Exclusion Resources</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource#getNotificationResources <em>Notification Resources</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource#getHeapSizeElements <em>Heap Size Elements</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwConcurrentResource()
 * @model abstract="true"
 * @generated
 */
public interface SwConcurrentResource extends SwResource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ArrivalPattern)
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwConcurrentResource_Type()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ArrivalPattern getType();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ArrivalPattern value);

	/**
	 * Returns the value of the '<em><b>Activation Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Capacity</em>' attribute.
	 * @see #setActivationCapacity(Integer)
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwConcurrentResource_ActivationCapacity()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Integer" ordered="false"
	 * @generated
	 */
	Integer getActivationCapacity();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource#getActivationCapacity <em>Activation Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Capacity</em>' attribute.
	 * @see #getActivationCapacity()
	 * @generated
	 */
	void setActivationCapacity(Integer value);

	/**
	 * Returns the value of the '<em><b>Entry Points</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Points</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwConcurrentResource_EntryPoints()
	 * @model type="org.eclipse.uml2.uml.Element" ordered="false"
	 * @generated
	 */
	EList getEntryPoints();

	/**
	 * Returns the value of the '<em><b>Adress Space</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adress Space</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adress Space</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwConcurrentResource_AdressSpace()
	 * @model type="org.eclipse.uml2.uml.TypedElement" ordered="false"
	 * @generated
	 */
	EList getAdressSpace();

	/**
	 * Returns the value of the '<em><b>Period Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Elements</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwConcurrentResource_PeriodElements()
	 * @model type="org.eclipse.uml2.uml.TypedElement" ordered="false"
	 * @generated
	 */
	EList getPeriodElements();

	/**
	 * Returns the value of the '<em><b>Priority Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority Elements</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwConcurrentResource_PriorityElements()
	 * @model type="org.eclipse.uml2.uml.TypedElement" ordered="false"
	 * @generated
	 */
	EList getPriorityElements();

	/**
	 * Returns the value of the '<em><b>Stack Size Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stack Size Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack Size Elements</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwConcurrentResource_StackSizeElements()
	 * @model type="org.eclipse.uml2.uml.TypedElement" ordered="false"
	 * @generated
	 */
	EList getStackSizeElements();

	/**
	 * Returns the value of the '<em><b>Activate Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activate Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activate Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwConcurrentResource_ActivateServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getActivateServices();

	/**
	 * Returns the value of the '<em><b>Enable Concurrency Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Concurrency Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Concurrency Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwConcurrentResource_EnableConcurrencyServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getEnableConcurrencyServices();

	/**
	 * Returns the value of the '<em><b>Resume Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resume Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resume Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwConcurrentResource_ResumeServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getResumeServices();

	/**
	 * Returns the value of the '<em><b>Suspend Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suspend Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspend Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwConcurrentResource_SuspendServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getSuspendServices();

	/**
	 * Returns the value of the '<em><b>Terminate Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminate Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminate Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwConcurrentResource_TerminateServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getTerminateServices();

	/**
	 * Returns the value of the '<em><b>Disable Concurrency Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable Concurrency Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable Concurrency Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwConcurrentResource_DisableConcurrencyServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getDisableConcurrencyServices();

	/**
	 * Returns the value of the '<em><b>Share Data Resources</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Share Data Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Share Data Resources</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwConcurrentResource_ShareDataResources()
	 * @model type="org.eclipse.uml2.uml.TypedElement" ordered="false"
	 * @generated
	 */
	EList getShareDataResources();

	/**
	 * Returns the value of the '<em><b>Message Resources</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Resources</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwConcurrentResource_MessageResources()
	 * @model type="org.eclipse.uml2.uml.TypedElement" ordered="false"
	 * @generated
	 */
	EList getMessageResources();

	/**
	 * Returns the value of the '<em><b>Mutual Exclusion Resources</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mutual Exclusion Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutual Exclusion Resources</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwConcurrentResource_MutualExclusionResources()
	 * @model type="org.eclipse.uml2.uml.TypedElement" ordered="false"
	 * @generated
	 */
	EList getMutualExclusionResources();

	/**
	 * Returns the value of the '<em><b>Notification Resources</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Resources</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwConcurrentResource_NotificationResources()
	 * @model type="org.eclipse.uml2.uml.TypedElement" ordered="false"
	 * @generated
	 */
	EList getNotificationResources();

	/**
	 * Returns the value of the '<em><b>Heap Size Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heap Size Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heap Size Elements</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwConcurrentResource_HeapSizeElements()
	 * @model type="org.eclipse.uml2.uml.TypedElement" ordered="false"
	 * @generated
	 */
	EList getHeapSizeElements();

} // SwConcurrentResource
