/**
 */
package MARTE.MARTE_AnalysisModel.GQAM;

import MARTE.MARTE_Foundations.GRM.Resource;

import MARTE_Library.BasicNFP_Types.NFP_Integer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ga Rel Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaRelStep#getRelRes <em>Rel Res</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaRelStep#getResUnits <em>Res Units</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaRelStep()
 * @model
 * @generated
 */
public interface GaRelStep extends GaStep {
	/**
	 * Returns the value of the '<em><b>Rel Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rel Res</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel Res</em>' reference.
	 * @see #setRelRes(Resource)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaRelStep_RelRes()
	 * @model ordered="false"
	 * @generated
	 */
	Resource getRelRes();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaRelStep#getRelRes <em>Rel Res</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Res</em>' reference.
	 * @see #getRelRes()
	 * @generated
	 */
	void setRelRes(Resource value);

	/**
	 * Returns the value of the '<em><b>Res Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res Units</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Units</em>' containment reference.
	 * @see #setResUnits(NFP_Integer)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaRelStep_ResUnits()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Integer getResUnits();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaRelStep#getResUnits <em>Res Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Units</em>' containment reference.
	 * @see #getResUnits()
	 * @generated
	 */
	void setResUnits(NFP_Integer value);

} // GaRelStep
