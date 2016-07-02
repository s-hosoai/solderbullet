/**
 */
package MARTE.MARTE_AnalysisModel.GQAM;

import MARTE.MARTE_Foundations.GRM.ResourceUsage;

import MARTE.MARTE_Foundations.Time.TimedProcessing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ga Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaScenario#getCause <em>Cause</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaScenario#getHostDemand <em>Host Demand</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaScenario#getHostDemandOps <em>Host Demand Ops</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaScenario#getInterOccT <em>Inter Occ T</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaScenario#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaScenario#getRespT <em>Resp T</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaScenario#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaScenario#getUtilizationOnHost <em>Utilization On Host</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaScenario#getRoot <em>Root</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaScenario#getTiming <em>Timing</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaScenario()
 * @model
 * @generated
 */
public interface GaScenario extends ResourceUsage, TimedProcessing {
	/**
	 * Returns the value of the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cause</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause</em>' reference.
	 * @see #setCause(GaWorkloadEvent)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaScenario_Cause()
	 * @model ordered="false"
	 * @generated
	 */
	GaWorkloadEvent getCause();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaScenario#getCause <em>Cause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause</em>' reference.
	 * @see #getCause()
	 * @generated
	 */
	void setCause(GaWorkloadEvent value);

	/**
	 * Returns the value of the '<em><b>Host Demand</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Demand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Demand</em>' containment reference list.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaScenario_HostDemand()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Duration" containment="true" ordered="false"
	 * @generated
	 */
	EList getHostDemand();

	/**
	 * Returns the value of the '<em><b>Host Demand Ops</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Real}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Demand Ops</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Demand Ops</em>' containment reference list.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaScenario_HostDemandOps()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Real" containment="true" ordered="false"
	 * @generated
	 */
	EList getHostDemandOps();

	/**
	 * Returns the value of the '<em><b>Inter Occ T</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inter Occ T</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inter Occ T</em>' containment reference list.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaScenario_InterOccT()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Duration" containment="true" ordered="false"
	 * @generated
	 */
	EList getInterOccT();

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
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaScenario_Throughput()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Frequency" containment="true" ordered="false"
	 * @generated
	 */
	EList getThroughput();

	/**
	 * Returns the value of the '<em><b>Resp T</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resp T</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resp T</em>' containment reference list.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaScenario_RespT()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Duration" containment="true" ordered="false"
	 * @generated
	 */
	EList getRespT();

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
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaScenario_Utilization()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Real" containment="true" ordered="false"
	 * @generated
	 */
	EList getUtilization();

	/**
	 * Returns the value of the '<em><b>Utilization On Host</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Real}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilization On Host</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilization On Host</em>' containment reference list.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaScenario_UtilizationOnHost()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Real" containment="true" ordered="false"
	 * @generated
	 */
	EList getUtilizationOnHost();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(GaStep)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaScenario_Root()
	 * @model ordered="false"
	 * @generated
	 */
	GaStep getRoot();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaScenario#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(GaStep value);

	/**
	 * Returns the value of the '<em><b>Timing</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_AnalysisModel.GQAM.GaTimedObs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing</em>' reference list.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaScenario_Timing()
	 * @model type="MARTE.MARTE_AnalysisModel.GQAM.GaTimedObs" ordered="false"
	 * @generated
	 */
	EList getTiming();

} // GaScenario
