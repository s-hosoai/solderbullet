/**
 */
package MARTE.MARTE_AnalysisModel.SAM;

import MARTE.MARTE_AnalysisModel.GQAM.GaCommStep;

import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Real;

import org.eclipse.uml2.uml.BehavioralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sa Comm Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaCommStep#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaCommStep#getSpareCap <em>Spare Cap</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaCommStep#getSchSlack <em>Sch Slack</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaCommStep#getBase_BehavioralFeature <em>Base Behavioral Feature</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaCommStep()
 * @model
 * @generated
 */
public interface SaCommStep extends GaCommStep {
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
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaCommStep_Deadline()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getDeadline();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaCommStep#getDeadline <em>Deadline</em>}' containment reference.
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
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaCommStep_SpareCap()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getSpareCap();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaCommStep#getSpareCap <em>Spare Cap</em>}' containment reference.
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
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaCommStep_SchSlack()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Real getSchSlack();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaCommStep#getSchSlack <em>Sch Slack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sch Slack</em>' containment reference.
	 * @see #getSchSlack()
	 * @generated
	 */
	void setSchSlack(NFP_Real value);

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
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaCommStep_Base_BehavioralFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BehavioralFeature getBase_BehavioralFeature();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaCommStep#getBase_BehavioralFeature <em>Base Behavioral Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Behavioral Feature</em>' reference.
	 * @see #getBase_BehavioralFeature()
	 * @generated
	 */
	void setBase_BehavioralFeature(BehavioralFeature value);

} // SaCommStep
