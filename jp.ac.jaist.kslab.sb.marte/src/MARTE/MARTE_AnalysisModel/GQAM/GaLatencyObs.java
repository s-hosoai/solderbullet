/**
 */
package MARTE.MARTE_AnalysisModel.GQAM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ga Latency Obs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaLatencyObs#getLatency <em>Latency</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaLatencyObs#getMiss <em>Miss</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaLatencyObs#getUtility <em>Utility</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaLatencyObs#getMaxJitter <em>Max Jitter</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaLatencyObs()
 * @model
 * @generated
 */
public interface GaLatencyObs extends GaTimedObs {
	/**
	 * Returns the value of the '<em><b>Latency</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latency</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency</em>' containment reference list.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaLatencyObs_Latency()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Duration" containment="true" ordered="false"
	 * @generated
	 */
	EList getLatency();

	/**
	 * Returns the value of the '<em><b>Miss</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Real}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Miss</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Miss</em>' containment reference list.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaLatencyObs_Miss()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Real" containment="true" ordered="false"
	 * @generated
	 */
	EList getMiss();

	/**
	 * Returns the value of the '<em><b>Utility</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.MARTE_DataTypes.UtilityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utility</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utility</em>' containment reference list.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaLatencyObs_Utility()
	 * @model type="MARTE_Library.MARTE_DataTypes.UtilityType" containment="true" ordered="false"
	 * @generated
	 */
	EList getUtility();

	/**
	 * Returns the value of the '<em><b>Max Jitter</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Jitter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Jitter</em>' containment reference list.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaLatencyObs_MaxJitter()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Duration" containment="true" ordered="false"
	 * @generated
	 */
	EList getMaxJitter();

} // GaLatencyObs
