/**
 */
package MARTE.MARTE_AnalysisModel.PAM;

import MARTE.MARTE_AnalysisModel.GQAM.GaStep;

import MARTE.MARTE_Foundations.GRM.Resource;

import MARTE_Library.BasicNFP_Types.NFP_Integer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pa Res Pass Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.PaResPassStep#getResource <em>Resource</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.PaResPassStep#getResUnits <em>Res Units</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.PAM.PAMPackage#getPaResPassStep()
 * @model
 * @generated
 */
public interface PaResPassStep extends GaStep {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Resource)
	 * @see MARTE.MARTE_AnalysisModel.PAM.PAMPackage#getPaResPassStep_Resource()
	 * @model ordered="false"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.PAM.PaResPassStep#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

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
	 * @see MARTE.MARTE_AnalysisModel.PAM.PAMPackage#getPaResPassStep_ResUnits()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Integer getResUnits();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.PAM.PaResPassStep#getResUnits <em>Res Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Units</em>' containment reference.
	 * @see #getResUnits()
	 * @generated
	 */
	void setResUnits(NFP_Integer value);

} // PaResPassStep
