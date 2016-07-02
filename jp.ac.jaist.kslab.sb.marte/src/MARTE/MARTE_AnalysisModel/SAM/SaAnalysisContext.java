/**
 */
package MARTE.MARTE_AnalysisModel.SAM;

import MARTE.MARTE_AnalysisModel.GQAM.GaAnalysisContext;

import MARTE_Library.BasicNFP_Types.NFP_Boolean;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sa Analysis Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaAnalysisContext#getIsSched <em>Is Sched</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaAnalysisContext#getOptCriterion <em>Opt Criterion</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaAnalysisContext()
 * @model
 * @generated
 */
public interface SaAnalysisContext extends GaAnalysisContext {
	/**
	 * Returns the value of the '<em><b>Is Sched</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Sched</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Sched</em>' containment reference.
	 * @see #setIsSched(NFP_Boolean)
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaAnalysisContext_IsSched()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Boolean getIsSched();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaAnalysisContext#getIsSched <em>Is Sched</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sched</em>' containment reference.
	 * @see #getIsSched()
	 * @generated
	 */
	void setIsSched(NFP_Boolean value);

	/**
	 * Returns the value of the '<em><b>Opt Criterion</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_AnalysisModel.SAM.OptimallityCriterionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opt Criterion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opt Criterion</em>' attribute.
	 * @see MARTE.MARTE_AnalysisModel.SAM.OptimallityCriterionKind
	 * @see #setOptCriterion(OptimallityCriterionKind)
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaAnalysisContext_OptCriterion()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	OptimallityCriterionKind getOptCriterion();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaAnalysisContext#getOptCriterion <em>Opt Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opt Criterion</em>' attribute.
	 * @see MARTE.MARTE_AnalysisModel.SAM.OptimallityCriterionKind
	 * @see #getOptCriterion()
	 * @generated
	 */
	void setOptCriterion(OptimallityCriterionKind value);

} // SaAnalysisContext
