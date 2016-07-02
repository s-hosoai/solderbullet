/**
 */
package MARTE.MARTE_AnalysisModel.SAM;

import MARTE.MARTE_AnalysisModel.GQAM.GaExecHost;

import MARTE_Library.BasicNFP_Types.NFP_Boolean;
import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Real;

import MARTE_Library.MARTE_DataTypes.IntegerInterval;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sa Exec Host</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaExecHost#getIsSched <em>Is Sched</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaExecHost#getSchSlack <em>Sch Slack</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaExecHost#getSchedUtiliz <em>Sched Utiliz</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaExecHost#getISRswitchT <em>IS Rswitch T</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaExecHost#getISRprioRange <em>IS Rprio Range</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaExecHost()
 * @model
 * @generated
 */
public interface SaExecHost extends GaExecHost {
	/**
	 * Returns the value of the '<em><b>Is Sched</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Sched</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Sched</em>' containment reference.
	 * @see #setIsSched(NFP_Boolean)
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaExecHost_IsSched()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Boolean getIsSched();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaExecHost#getIsSched <em>Is Sched</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sched</em>' containment reference.
	 * @see #getIsSched()
	 * @generated
	 */
	void setIsSched(NFP_Boolean value);

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
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaExecHost_SchSlack()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Real getSchSlack();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaExecHost#getSchSlack <em>Sch Slack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sch Slack</em>' containment reference.
	 * @see #getSchSlack()
	 * @generated
	 */
	void setSchSlack(NFP_Real value);

	/**
	 * Returns the value of the '<em><b>Sched Utiliz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sched Utiliz</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sched Utiliz</em>' containment reference.
	 * @see #setSchedUtiliz(NFP_Real)
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaExecHost_SchedUtiliz()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Real getSchedUtiliz();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaExecHost#getSchedUtiliz <em>Sched Utiliz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sched Utiliz</em>' containment reference.
	 * @see #getSchedUtiliz()
	 * @generated
	 */
	void setSchedUtiliz(NFP_Real value);

	/**
	 * Returns the value of the '<em><b>IS Rswitch T</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IS Rswitch T</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IS Rswitch T</em>' containment reference.
	 * @see #setISRswitchT(NFP_Duration)
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaExecHost_ISRswitchT()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getISRswitchT();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaExecHost#getISRswitchT <em>IS Rswitch T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IS Rswitch T</em>' containment reference.
	 * @see #getISRswitchT()
	 * @generated
	 */
	void setISRswitchT(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>IS Rprio Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IS Rprio Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IS Rprio Range</em>' containment reference.
	 * @see #setISRprioRange(IntegerInterval)
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaExecHost_ISRprioRange()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	IntegerInterval getISRprioRange();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaExecHost#getISRprioRange <em>IS Rprio Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IS Rprio Range</em>' containment reference.
	 * @see #getISRprioRange()
	 * @generated
	 */
	void setISRprioRange(IntegerInterval value);

} // SaExecHost
