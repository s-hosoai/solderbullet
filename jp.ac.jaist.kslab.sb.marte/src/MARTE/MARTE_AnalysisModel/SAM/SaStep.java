/**
 */
package MARTE.MARTE_AnalysisModel.SAM;

import MARTE.MARTE_AnalysisModel.GQAM.GaStep;

import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Integer;
import MARTE_Library.BasicNFP_Types.NFP_Real;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.BehavioralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sa Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaStep#getBase_BehavioralFeature <em>Base Behavioral Feature</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaStep#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaStep#getSpareCap <em>Spare Cap</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaStep#getSchSlack <em>Sch Slack</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaStep#getPreemptT <em>Preempt T</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaStep#getReadyT <em>Ready T</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaStep#getNonpreemptionBlocking <em>Nonpreemption Blocking</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaStep#getSharedRes <em>Shared Res</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaStep#getSelfSuspensionBlocking <em>Self Suspension Blocking</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaStep#getNumberSelfSuspensions <em>Number Self Suspensions</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaStep()
 * @model
 * @generated
 */
public interface SaStep extends GaStep {
	/**
	 * Returns the value of the '<em><b>Base Behavioral Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Behavioral Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Behavioral Feature</em>' reference.
	 * @see #setBase_BehavioralFeature(BehavioralFeature)
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaStep_Base_BehavioralFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BehavioralFeature getBase_BehavioralFeature();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaStep#getBase_BehavioralFeature <em>Base Behavioral Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Behavioral Feature</em>' reference.
	 * @see #getBase_BehavioralFeature()
	 * @generated
	 */
	void setBase_BehavioralFeature(BehavioralFeature value);

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' containment reference.
	 * @see #setDeadline(NFP_Duration)
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaStep_Deadline()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getDeadline();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaStep#getDeadline <em>Deadline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' containment reference.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Spare Cap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spare Cap</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spare Cap</em>' containment reference.
	 * @see #setSpareCap(NFP_Duration)
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaStep_SpareCap()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getSpareCap();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaStep#getSpareCap <em>Spare Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spare Cap</em>' containment reference.
	 * @see #getSpareCap()
	 * @generated
	 */
	void setSpareCap(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Sch Slack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sch Slack</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sch Slack</em>' containment reference.
	 * @see #setSchSlack(NFP_Real)
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaStep_SchSlack()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Real getSchSlack();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaStep#getSchSlack <em>Sch Slack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sch Slack</em>' containment reference.
	 * @see #getSchSlack()
	 * @generated
	 */
	void setSchSlack(NFP_Real value);

	/**
	 * Returns the value of the '<em><b>Preempt T</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preempt T</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preempt T</em>' containment reference.
	 * @see #setPreemptT(NFP_Duration)
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaStep_PreemptT()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getPreemptT();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaStep#getPreemptT <em>Preempt T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preempt T</em>' containment reference.
	 * @see #getPreemptT()
	 * @generated
	 */
	void setPreemptT(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Ready T</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ready T</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ready T</em>' containment reference.
	 * @see #setReadyT(NFP_Duration)
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaStep_ReadyT()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getReadyT();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaStep#getReadyT <em>Ready T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ready T</em>' containment reference.
	 * @see #getReadyT()
	 * @generated
	 */
	void setReadyT(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Nonpreemption Blocking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nonpreemption Blocking</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nonpreemption Blocking</em>' containment reference.
	 * @see #setNonpreemptionBlocking(NFP_Duration)
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaStep_NonpreemptionBlocking()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getNonpreemptionBlocking();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaStep#getNonpreemptionBlocking <em>Nonpreemption Blocking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nonpreemption Blocking</em>' containment reference.
	 * @see #getNonpreemptionBlocking()
	 * @generated
	 */
	void setNonpreemptionBlocking(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Shared Res</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_AnalysisModel.SAM.SaSharedResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Res</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Res</em>' reference list.
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaStep_SharedRes()
	 * @model type="MARTE.MARTE_AnalysisModel.SAM.SaSharedResource" ordered="false"
	 * @generated
	 */
	EList getSharedRes();

	/**
	 * Returns the value of the '<em><b>Self Suspension Blocking</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self Suspension Blocking</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Suspension Blocking</em>' containment reference.
	 * @see #setSelfSuspensionBlocking(NFP_Duration)
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaStep_SelfSuspensionBlocking()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getSelfSuspensionBlocking();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaStep#getSelfSuspensionBlocking <em>Self Suspension Blocking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Suspension Blocking</em>' containment reference.
	 * @see #getSelfSuspensionBlocking()
	 * @generated
	 */
	void setSelfSuspensionBlocking(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Number Self Suspensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Self Suspensions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Self Suspensions</em>' containment reference.
	 * @see #setNumberSelfSuspensions(NFP_Integer)
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaStep_NumberSelfSuspensions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Integer getNumberSelfSuspensions();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaStep#getNumberSelfSuspensions <em>Number Self Suspensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Self Suspensions</em>' containment reference.
	 * @see #getNumberSelfSuspensions()
	 * @generated
	 */
	void setNumberSelfSuspensions(NFP_Integer value);

} // SaStep
