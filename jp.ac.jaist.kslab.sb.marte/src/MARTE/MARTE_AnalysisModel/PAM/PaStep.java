/**
 */
package MARTE.MARTE_AnalysisModel.PAM;

import MARTE.MARTE_AnalysisModel.GQAM.GaStep;

import MARTE_Library.BasicNFP_Types.NFP_Boolean;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pa Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.PaStep#getNoSync <em>No Sync</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.PaStep#getExtOpDemand <em>Ext Op Demand</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.PaStep#getExtOpCount <em>Ext Op Count</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.PaStep#getBehavDemand <em>Behav Demand</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.PaStep#getBehavCount <em>Behav Count</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.PAM.PAMPackage#getPaStep()
 * @model
 * @generated
 */
public interface PaStep extends GaStep {
	/**
	 * Returns the value of the '<em><b>No Sync</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Sync</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Sync</em>' containment reference.
	 * @see #setNoSync(NFP_Boolean)
	 * @see MARTE.MARTE_AnalysisModel.PAM.PAMPackage#getPaStep_NoSync()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Boolean getNoSync();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.PAM.PaStep#getNoSync <em>No Sync</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Sync</em>' containment reference.
	 * @see #getNoSync()
	 * @generated
	 */
	void setNoSync(NFP_Boolean value);

	/**
	 * Returns the value of the '<em><b>Ext Op Demand</b></em>' attribute list.
	 * The list contents are of type {@link String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext Op Demand</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext Op Demand</em>' attribute list.
	 * @see MARTE.MARTE_AnalysisModel.PAM.PAMPackage#getPaStep_ExtOpDemand()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.String"
	 * @generated
	 */
	EList getExtOpDemand();

	/**
	 * Returns the value of the '<em><b>Ext Op Count</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Real}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext Op Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext Op Count</em>' containment reference list.
	 * @see MARTE.MARTE_AnalysisModel.PAM.PAMPackage#getPaStep_ExtOpCount()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Real" containment="true"
	 * @generated
	 */
	EList getExtOpCount();

	/**
	 * Returns the value of the '<em><b>Behav Demand</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_AnalysisModel.GQAM.GaScenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behav Demand</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behav Demand</em>' reference list.
	 * @see MARTE.MARTE_AnalysisModel.PAM.PAMPackage#getPaStep_BehavDemand()
	 * @model type="MARTE.MARTE_AnalysisModel.GQAM.GaScenario"
	 * @generated
	 */
	EList getBehavDemand();

	/**
	 * Returns the value of the '<em><b>Behav Count</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Real}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behav Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behav Count</em>' containment reference list.
	 * @see MARTE.MARTE_AnalysisModel.PAM.PAMPackage#getPaStep_BehavCount()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Real" containment="true"
	 * @generated
	 */
	EList getBehavCount();

} // PaStep
