/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Concurrency;

import MARTE.MARTE_Foundations.GRM.SchedulableResource;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sw Schedulable Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource#getIsStaticSchedulingFeature <em>Is Static Scheduling Feature</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource#getIsPreemptable <em>Is Preemptable</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource#getSchedulers <em>Schedulers</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource#getDeadlineElements <em>Deadline Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource#getDeadlineTypeElements <em>Deadline Type Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource#getTimeSliceElements <em>Time Slice Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource#getDelayServices <em>Delay Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource#getJoinServices <em>Join Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource#getYieldServices <em>Yield Services</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwSchedulableResource()
 * @model
 * @generated
 */
public interface SwSchedulableResource extends SwConcurrentResource, SchedulableResource {
	/**
	 * Returns the value of the '<em><b>Is Static Scheduling Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static Scheduling Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static Scheduling Feature</em>' attribute.
	 * @see #setIsStaticSchedulingFeature(Boolean)
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwSchedulableResource_IsStaticSchedulingFeature()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getIsStaticSchedulingFeature();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource#getIsStaticSchedulingFeature <em>Is Static Scheduling Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static Scheduling Feature</em>' attribute.
	 * @see #getIsStaticSchedulingFeature()
	 * @generated
	 */
	void setIsStaticSchedulingFeature(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Preemptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Preemptable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Preemptable</em>' attribute.
	 * @see #setIsPreemptable(Boolean)
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwSchedulableResource_IsPreemptable()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getIsPreemptable();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource#getIsPreemptable <em>Is Preemptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Preemptable</em>' attribute.
	 * @see #getIsPreemptable()
	 * @generated
	 */
	void setIsPreemptable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Schedulers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedulers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedulers</em>' reference.
	 * @see #setSchedulers(NamedElement)
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwSchedulableResource_Schedulers()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NamedElement getSchedulers();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource#getSchedulers <em>Schedulers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedulers</em>' reference.
	 * @see #getSchedulers()
	 * @generated
	 */
	void setSchedulers(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Deadline Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline Elements</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwSchedulableResource_DeadlineElements()
	 * @model type="org.eclipse.uml2.uml.TypedElement" ordered="false"
	 * @generated
	 */
	EList getDeadlineElements();

	/**
	 * Returns the value of the '<em><b>Deadline Type Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline Type Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline Type Elements</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwSchedulableResource_DeadlineTypeElements()
	 * @model type="org.eclipse.uml2.uml.TypedElement" ordered="false"
	 * @generated
	 */
	EList getDeadlineTypeElements();

	/**
	 * Returns the value of the '<em><b>Time Slice Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Slice Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Slice Elements</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwSchedulableResource_TimeSliceElements()
	 * @model type="org.eclipse.uml2.uml.TypedElement" ordered="false"
	 * @generated
	 */
	EList getTimeSliceElements();

	/**
	 * Returns the value of the '<em><b>Delay Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwSchedulableResource_DelayServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getDelayServices();

	/**
	 * Returns the value of the '<em><b>Join Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwSchedulableResource_JoinServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getJoinServices();

	/**
	 * Returns the value of the '<em><b>Yield Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yield Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yield Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwSchedulableResource_YieldServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getYieldServices();

} // SwSchedulableResource
