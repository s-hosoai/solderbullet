/**
 */
package MARTE.MARTE_AnalysisModel.SAM;

import MARTE.MARTE_AnalysisModel.GQAM.GaCommHost;

import MARTE_Library.BasicNFP_Types.NFP_Boolean;
import MARTE_Library.BasicNFP_Types.NFP_Real;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sa Comm Host</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaCommHost#getIsSched <em>Is Sched</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaCommHost#getSchSlack <em>Sch Slack</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaCommHost()
 * @model
 * @generated
 */
public interface SaCommHost extends GaCommHost {
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
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaCommHost_IsSched()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Boolean getIsSched();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaCommHost#getIsSched <em>Is Sched</em>}' containment reference.
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
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaCommHost_SchSlack()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Real getSchSlack();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaCommHost#getSchSlack <em>Sch Slack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sch Slack</em>' containment reference.
	 * @see #getSchSlack()
	 * @generated
	 */
	void setSchSlack(NFP_Real value);

} // SaCommHost
