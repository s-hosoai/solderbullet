/**
 */
package MARTE.MARTE_Foundations.Time;

import MARTE.MARTE_Foundations.NFPs.NfpConstraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.Time.ClockConstraint#getIsCoincidenceBased <em>Is Coincidence Based</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Time.ClockConstraint#isIsPrecedenceBased <em>Is Precedence Based</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Time.ClockConstraint#getIsChronometricBased <em>Is Chronometric Based</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.Time.TimePackage#getClockConstraint()
 * @model
 * @generated
 */
public interface ClockConstraint extends NfpConstraint, TimedElement {
	/**
	 * Returns the value of the '<em><b>Is Coincidence Based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Coincidence Based</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Coincidence Based</em>' attribute.
	 * @see #setIsCoincidenceBased(Boolean)
	 * @see MARTE.MARTE_Foundations.Time.TimePackage#getClockConstraint_IsCoincidenceBased()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsCoincidenceBased();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Time.ClockConstraint#getIsCoincidenceBased <em>Is Coincidence Based</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Coincidence Based</em>' attribute.
	 * @see #getIsCoincidenceBased()
	 * @generated
	 */
	void setIsCoincidenceBased(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Precedence Based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Precedence Based</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Precedence Based</em>' attribute.
	 * @see #setIsPrecedenceBased(boolean)
	 * @see MARTE.MARTE_Foundations.Time.TimePackage#getClockConstraint_IsPrecedenceBased()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsPrecedenceBased();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Time.ClockConstraint#isIsPrecedenceBased <em>Is Precedence Based</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Precedence Based</em>' attribute.
	 * @see #isIsPrecedenceBased()
	 * @generated
	 */
	void setIsPrecedenceBased(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Chronometric Based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Chronometric Based</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Chronometric Based</em>' attribute.
	 * @see #setIsChronometricBased(Boolean)
	 * @see MARTE.MARTE_Foundations.Time.TimePackage#getClockConstraint_IsChronometricBased()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsChronometricBased();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Time.ClockConstraint#getIsChronometricBased <em>Is Chronometric Based</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Chronometric Based</em>' attribute.
	 * @see #getIsChronometricBased()
	 * @generated
	 */
	void setIsChronometricBased(Boolean value);

} // ClockConstraint
