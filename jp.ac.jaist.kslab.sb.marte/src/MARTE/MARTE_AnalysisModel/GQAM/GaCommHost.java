/**
 */
package MARTE.MARTE_AnalysisModel.GQAM;

import MARTE.MARTE_Foundations.GRM.CommunicationMedia;
import MARTE.MARTE_Foundations.GRM.Scheduler;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ga Comm Host</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaCommHost#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaCommHost#getUtilization <em>Utilization</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaCommHost()
 * @model
 * @generated
 */
public interface GaCommHost extends CommunicationMedia, Scheduler {
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
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaCommHost_Throughput()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Frequency" containment="true" ordered="false"
	 * @generated
	 */
	EList getThroughput();

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
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaCommHost_Utilization()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Real" containment="true" ordered="false"
	 * @generated
	 */
	EList getUtilization();

} // GaCommHost
