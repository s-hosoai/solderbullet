/**
 */
package MARTE.MARTE_AnalysisModel.SAM;

import MARTE.MARTE_AnalysisModel.GQAM.GaTimedObs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sa Sched Obs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaSchedObs#getSuspentions <em>Suspentions</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaSchedObs#getBlockT <em>Block T</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaSchedObs#getOverlaps <em>Overlaps</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaSchedObs()
 * @model
 * @generated
 */
public interface SaSchedObs extends GaTimedObs {
	/**
	 * Returns the value of the '<em><b>Suspentions</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suspentions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspentions</em>' containment reference list.
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaSchedObs_Suspentions()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Integer" containment="true" ordered="false"
	 * @generated
	 */
	EList getSuspentions();

	/**
	 * Returns the value of the '<em><b>Block T</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block T</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block T</em>' containment reference list.
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaSchedObs_BlockT()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Duration" containment="true" ordered="false"
	 * @generated
	 */
	EList getBlockT();

	/**
	 * Returns the value of the '<em><b>Overlaps</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overlaps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlaps</em>' containment reference list.
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaSchedObs_Overlaps()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Integer" containment="true" ordered="false"
	 * @generated
	 */
	EList getOverlaps();

} // SaSchedObs
