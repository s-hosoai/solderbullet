/**
 */
package MARTE.MARTE_Foundations.Time;

import MARTE.MARTE_Foundations.NFPs.NfpConstraint;

import MARTE_Library.TimeTypesLibrary.TimeInterpretationKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.Time.TimedConstraint#getInterpretation <em>Interpretation</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.Time.TimePackage#getTimedConstraint()
 * @model
 * @generated
 */
public interface TimedConstraint extends NfpConstraint, TimedElement {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE_Library.TimeTypesLibrary.TimeInterpretationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpretation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see MARTE_Library.TimeTypesLibrary.TimeInterpretationKind
	 * @see #setInterpretation(TimeInterpretationKind)
	 * @see MARTE.MARTE_Foundations.Time.TimePackage#getTimedConstraint_Interpretation()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	TimeInterpretationKind getInterpretation();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Time.TimedConstraint#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see MARTE_Library.TimeTypesLibrary.TimeInterpretationKind
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(TimeInterpretationKind value);

} // TimedConstraint
