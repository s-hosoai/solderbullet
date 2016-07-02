/**
 */
package MARTE.MARTE_Foundations.GRM;

import MARTE_Library.GRM_BasicTypes.SchedPolicyKind;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.OpaqueExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.Scheduler#getIsPreemptible <em>Is Preemptible</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.Scheduler#getSchedPolicy <em>Sched Policy</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.Scheduler#getOtherSchedPolicy <em>Other Sched Policy</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.Scheduler#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.Scheduler#getProcessingUnits <em>Processing Units</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.Scheduler#getHost <em>Host</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.Scheduler#getProtectedSharedRsources <em>Protected Shared Rsources</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.Scheduler#getSchedulableResources <em>Schedulable Resources</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getScheduler()
 * @model
 * @generated
 */
public interface Scheduler extends Resource {
	/**
	 * Returns the value of the '<em><b>Is Preemptible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Preemptible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Preemptible</em>' attribute.
	 * @see #setIsPreemptible(Boolean)
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getScheduler_IsPreemptible()
	 * @model default="true" unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getIsPreemptible();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.GRM.Scheduler#getIsPreemptible <em>Is Preemptible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Preemptible</em>' attribute.
	 * @see #getIsPreemptible()
	 * @generated
	 */
	void setIsPreemptible(Boolean value);

	/**
	 * Returns the value of the '<em><b>Sched Policy</b></em>' attribute.
	 * The default value is <code>"FixedPriority"</code>.
	 * The literals are from the enumeration {@link MARTE_Library.GRM_BasicTypes.SchedPolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sched Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sched Policy</em>' attribute.
	 * @see MARTE_Library.GRM_BasicTypes.SchedPolicyKind
	 * @see #setSchedPolicy(SchedPolicyKind)
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getScheduler_SchedPolicy()
	 * @model default="FixedPriority" unique="false" ordered="false"
	 * @generated
	 */
	SchedPolicyKind getSchedPolicy();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.GRM.Scheduler#getSchedPolicy <em>Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sched Policy</em>' attribute.
	 * @see MARTE_Library.GRM_BasicTypes.SchedPolicyKind
	 * @see #getSchedPolicy()
	 * @generated
	 */
	void setSchedPolicy(SchedPolicyKind value);

	/**
	 * Returns the value of the '<em><b>Other Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Sched Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Sched Policy</em>' attribute.
	 * @see #setOtherSchedPolicy(String)
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getScheduler_OtherSchedPolicy()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.String" ordered="false"
	 * @generated
	 */
	String getOtherSchedPolicy();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.GRM.Scheduler#getOtherSchedPolicy <em>Other Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Sched Policy</em>' attribute.
	 * @see #getOtherSchedPolicy()
	 * @generated
	 */
	void setOtherSchedPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' reference.
	 * @see #setSchedule(OpaqueExpression)
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getScheduler_Schedule()
	 * @model ordered="false"
	 * @generated
	 */
	OpaqueExpression getSchedule();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.GRM.Scheduler#getSchedule <em>Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' reference.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(OpaqueExpression value);

	/**
	 * Returns the value of the '<em><b>Processing Units</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_Foundations.GRM.ProcessingResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Units</em>' reference list.
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getScheduler_ProcessingUnits()
	 * @model type="MARTE.MARTE_Foundations.GRM.ProcessingResource" ordered="false"
	 * @generated
	 */
	EList getProcessingUnits();

	/**
	 * Returns the value of the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' reference.
	 * @see #setHost(ComputingResource)
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getScheduler_Host()
	 * @model ordered="false"
	 * @generated
	 */
	ComputingResource getHost();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.GRM.Scheduler#getHost <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(ComputingResource value);

	/**
	 * Returns the value of the '<em><b>Protected Shared Rsources</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_Foundations.GRM.MutualExclusionResource}.
	 * It is bidirectional and its opposite is '{@link MARTE.MARTE_Foundations.GRM.MutualExclusionResource#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protected Shared Rsources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protected Shared Rsources</em>' reference list.
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getScheduler_ProtectedSharedRsources()
	 * @see MARTE.MARTE_Foundations.GRM.MutualExclusionResource#getScheduler
	 * @model type="MARTE.MARTE_Foundations.GRM.MutualExclusionResource" opposite="scheduler" ordered="false"
	 * @generated
	 */
	EList getProtectedSharedRsources();

	/**
	 * Returns the value of the '<em><b>Schedulable Resources</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_Foundations.GRM.SchedulableResource}.
	 * It is bidirectional and its opposite is '{@link MARTE.MARTE_Foundations.GRM.SchedulableResource#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedulable Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedulable Resources</em>' reference list.
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getScheduler_SchedulableResources()
	 * @see MARTE.MARTE_Foundations.GRM.SchedulableResource#getHost
	 * @model type="MARTE.MARTE_Foundations.GRM.SchedulableResource" opposite="host" ordered="false"
	 * @generated
	 */
	EList getSchedulableResources();

} // Scheduler
