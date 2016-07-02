/**
 */
package MARTE.MARTE_AnalysisModel.PAM;

import MARTE.MARTE_Foundations.GRM.Resource;

import MARTE_Library.BasicNFP_Types.NFP_Frequency;
import MARTE_Library.BasicNFP_Types.NFP_Integer;
import MARTE_Library.BasicNFP_Types.NFP_Real;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pa Logical Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.PaLogicalResource#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.PaLogicalResource#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.PaLogicalResource#getPoolSize <em>Pool Size</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.PAM.PAMPackage#getPaLogicalResource()
 * @model
 * @generated
 */
public interface PaLogicalResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Utilization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilization</em>' containment reference.
	 * @see #setUtilization(NFP_Real)
	 * @see MARTE.MARTE_AnalysisModel.PAM.PAMPackage#getPaLogicalResource_Utilization()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Real getUtilization();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.PAM.PaLogicalResource#getUtilization <em>Utilization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilization</em>' containment reference.
	 * @see #getUtilization()
	 * @generated
	 */
	void setUtilization(NFP_Real value);

	/**
	 * Returns the value of the '<em><b>Throughput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throughput</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput</em>' containment reference.
	 * @see #setThroughput(NFP_Frequency)
	 * @see MARTE.MARTE_AnalysisModel.PAM.PAMPackage#getPaLogicalResource_Throughput()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Frequency getThroughput();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.PAM.PaLogicalResource#getThroughput <em>Throughput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput</em>' containment reference.
	 * @see #getThroughput()
	 * @generated
	 */
	void setThroughput(NFP_Frequency value);

	/**
	 * Returns the value of the '<em><b>Pool Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pool Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool Size</em>' containment reference.
	 * @see #setPoolSize(NFP_Integer)
	 * @see MARTE.MARTE_AnalysisModel.PAM.PAMPackage#getPaLogicalResource_PoolSize()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	NFP_Integer getPoolSize();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.PAM.PaLogicalResource#getPoolSize <em>Pool Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool Size</em>' containment reference.
	 * @see #getPoolSize()
	 * @generated
	 */
	void setPoolSize(NFP_Integer value);

} // PaLogicalResource
