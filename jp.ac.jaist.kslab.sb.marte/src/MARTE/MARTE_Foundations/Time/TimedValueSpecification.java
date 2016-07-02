/**
 */
package MARTE.MARTE_Foundations.Time;

import MARTE_Library.TimeTypesLibrary.TimeInterpretationKind;

import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Value Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.Time.TimedValueSpecification#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Time.TimedValueSpecification#getBase_ValueSpecification <em>Base Value Specification</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.Time.TimePackage#getTimedValueSpecification()
 * @model
 * @generated
 */
public interface TimedValueSpecification extends TimedElement {
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
	 * @see MARTE.MARTE_Foundations.Time.TimePackage#getTimedValueSpecification_Interpretation()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	TimeInterpretationKind getInterpretation();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Time.TimedValueSpecification#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see MARTE_Library.TimeTypesLibrary.TimeInterpretationKind
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(TimeInterpretationKind value);

	/**
	 * Returns the value of the '<em><b>Base Value Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Value Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Value Specification</em>' reference.
	 * @see #setBase_ValueSpecification(ValueSpecification)
	 * @see MARTE.MARTE_Foundations.Time.TimePackage#getTimedValueSpecification_Base_ValueSpecification()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getBase_ValueSpecification();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Time.TimedValueSpecification#getBase_ValueSpecification <em>Base Value Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Value Specification</em>' reference.
	 * @see #getBase_ValueSpecification()
	 * @generated
	 */
	void setBase_ValueSpecification(ValueSpecification value);

} // TimedValueSpecification
