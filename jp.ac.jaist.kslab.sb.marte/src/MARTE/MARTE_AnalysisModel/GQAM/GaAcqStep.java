/**
 */
package MARTE.MARTE_AnalysisModel.GQAM;

import MARTE.MARTE_Foundations.GRM.Resource;

import MARTE_Library.BasicNFP_Types.NFP_Integer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ga Acq Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaAcqStep#getAcqRes <em>Acq Res</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaAcqStep#getResUnits <em>Res Units</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaAcqStep()
 * @model
 * @generated
 */
public interface GaAcqStep extends GaStep {
	/**
	 * Returns the value of the '<em><b>Acq Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acq Res</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acq Res</em>' reference.
	 * @see #setAcqRes(Resource)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaAcqStep_AcqRes()
	 * @model ordered="false"
	 * @generated
	 */
	Resource getAcqRes();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaAcqStep#getAcqRes <em>Acq Res</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acq Res</em>' reference.
	 * @see #getAcqRes()
	 * @generated
	 */
	void setAcqRes(Resource value);

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
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaAcqStep_ResUnits()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Integer getResUnits();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaAcqStep#getResUnits <em>Res Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Units</em>' containment reference.
	 * @see #getResUnits()
	 * @generated
	 */
	void setResUnits(NFP_Integer value);

} // GaAcqStep
