/**
 */
package MARTE.MARTE_AnalysisModel.GQAM;

import MARTE.MARTE_Foundations.GRM.ComputingResource;
import MARTE.MARTE_Foundations.GRM.Scheduler;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;
import MARTE_Library.BasicNFP_Types.NFP_Duration;

import MARTE_Library.MARTE_DataTypes.IntegerInterval;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ga Exec Host</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaExecHost#getCommTxOvh <em>Comm Tx Ovh</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaExecHost#getCommRcvOvh <em>Comm Rcv Ovh</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaExecHost#getCntxtSwT <em>Cntxt Sw T</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaExecHost#getClockOvh <em>Clock Ovh</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaExecHost#getSchedPriRange <em>Sched Pri Range</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaExecHost#getMemSize <em>Mem Size</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaExecHost#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaExecHost#getThroughput <em>Throughput</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaExecHost()
 * @model
 * @generated
 */
public interface GaExecHost extends Scheduler, ComputingResource {
	/**
	 * Returns the value of the '<em><b>Comm Tx Ovh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm Tx Ovh</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Tx Ovh</em>' containment reference.
	 * @see #setCommTxOvh(NFP_Duration)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaExecHost_CommTxOvh()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getCommTxOvh();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaExecHost#getCommTxOvh <em>Comm Tx Ovh</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comm Tx Ovh</em>' containment reference.
	 * @see #getCommTxOvh()
	 * @generated
	 */
	void setCommTxOvh(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Comm Rcv Ovh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm Rcv Ovh</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Rcv Ovh</em>' containment reference.
	 * @see #setCommRcvOvh(NFP_Duration)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaExecHost_CommRcvOvh()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getCommRcvOvh();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaExecHost#getCommRcvOvh <em>Comm Rcv Ovh</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comm Rcv Ovh</em>' containment reference.
	 * @see #getCommRcvOvh()
	 * @generated
	 */
	void setCommRcvOvh(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Cntxt Sw T</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cntxt Sw T</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cntxt Sw T</em>' containment reference.
	 * @see #setCntxtSwT(NFP_Duration)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaExecHost_CntxtSwT()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getCntxtSwT();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaExecHost#getCntxtSwT <em>Cntxt Sw T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cntxt Sw T</em>' containment reference.
	 * @see #getCntxtSwT()
	 * @generated
	 */
	void setCntxtSwT(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Clock Ovh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Ovh</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Ovh</em>' containment reference.
	 * @see #setClockOvh(NFP_Duration)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaExecHost_ClockOvh()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getClockOvh();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaExecHost#getClockOvh <em>Clock Ovh</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Ovh</em>' containment reference.
	 * @see #getClockOvh()
	 * @generated
	 */
	void setClockOvh(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Sched Pri Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sched Pri Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sched Pri Range</em>' containment reference.
	 * @see #setSchedPriRange(IntegerInterval)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaExecHost_SchedPriRange()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	IntegerInterval getSchedPriRange();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaExecHost#getSchedPriRange <em>Sched Pri Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sched Pri Range</em>' containment reference.
	 * @see #getSchedPriRange()
	 * @generated
	 */
	void setSchedPriRange(IntegerInterval value);

	/**
	 * Returns the value of the '<em><b>Mem Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mem Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem Size</em>' containment reference.
	 * @see #setMemSize(NFP_DataSize)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaExecHost_MemSize()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_DataSize getMemSize();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaExecHost#getMemSize <em>Mem Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mem Size</em>' containment reference.
	 * @see #getMemSize()
	 * @generated
	 */
	void setMemSize(NFP_DataSize value);

	/**
	 * Returns the value of the '<em><b>Utilization</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Real}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilization</em>' containment reference list.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaExecHost_Utilization()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Real" containment="true" ordered="false"
	 * @generated
	 */
	EList getUtilization();

	/**
	 * Returns the value of the '<em><b>Throughput</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Frequency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throughput</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput</em>' containment reference list.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaExecHost_Throughput()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Frequency" containment="true" ordered="false"
	 * @generated
	 */
	EList getThroughput();

} // GaExecHost
