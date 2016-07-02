/**
 */
package MARTE.MARTE_AnalysisModel.GQAM;

import MARTE.MARTE_Foundations.NFPs.NfpConstraint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ga Timed Obs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaTimedObs#getLaxity <em>Laxity</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaTimedObs#getStartObs <em>Start Obs</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaTimedObs#getEndObs <em>End Obs</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaTimedObs()
 * @model
 * @generated
 */
public interface GaTimedObs extends NfpConstraint {
	/**
	 * Returns the value of the '<em><b>Laxity</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_AnalysisModel.GQAM.LaxityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Laxity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Laxity</em>' attribute.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.LaxityKind
	 * @see #setLaxity(LaxityKind)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaTimedObs_Laxity()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	LaxityKind getLaxity();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaTimedObs#getLaxity <em>Laxity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Laxity</em>' attribute.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.LaxityKind
	 * @see #getLaxity()
	 * @generated
	 */
	void setLaxity(LaxityKind value);

	/**
	 * Returns the value of the '<em><b>Start Obs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TimeObservation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Obs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Obs</em>' reference list.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaTimedObs_StartObs()
	 * @model type="org.eclipse.uml2.uml.TimeObservation" ordered="false"
	 * @generated
	 */
	EList getStartObs();

	/**
	 * Returns the value of the '<em><b>End Obs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TimeObservation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Obs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Obs</em>' reference list.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaTimedObs_EndObs()
	 * @model type="org.eclipse.uml2.uml.TimeObservation" ordered="false"
	 * @generated
	 */
	EList getEndObs();

} // GaTimedObs
