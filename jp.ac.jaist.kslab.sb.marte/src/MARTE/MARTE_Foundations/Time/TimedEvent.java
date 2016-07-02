/**
 */
package MARTE.MARTE_Foundations.Time;

import org.eclipse.uml2.uml.TimeEvent;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.Time.TimedEvent#getRepetition <em>Repetition</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Time.TimedEvent#getBase_TimeEvent <em>Base Time Event</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Time.TimedEvent#getEvery <em>Every</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.Time.TimePackage#getTimedEvent()
 * @model
 * @generated
 */
public interface TimedEvent extends TimedElement {
	/**
	 * Returns the value of the '<em><b>Repetition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repetition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repetition</em>' attribute.
	 * @see #setRepetition(Integer)
	 * @see MARTE.MARTE_Foundations.Time.TimePackage#getTimedEvent_Repetition()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Integer" ordered="false"
	 * @generated
	 */
	Integer getRepetition();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Time.TimedEvent#getRepetition <em>Repetition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetition</em>' attribute.
	 * @see #getRepetition()
	 * @generated
	 */
	void setRepetition(Integer value);

	/**
	 * Returns the value of the '<em><b>Base Time Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Time Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Time Event</em>' reference.
	 * @see #setBase_TimeEvent(TimeEvent)
	 * @see MARTE.MARTE_Foundations.Time.TimePackage#getTimedEvent_Base_TimeEvent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TimeEvent getBase_TimeEvent();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Time.TimedEvent#getBase_TimeEvent <em>Base Time Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Time Event</em>' reference.
	 * @see #getBase_TimeEvent()
	 * @generated
	 */
	void setBase_TimeEvent(TimeEvent value);

	/**
	 * Returns the value of the '<em><b>Every</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Every</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Every</em>' containment reference.
	 * @see #setEvery(ValueSpecification)
	 * @see MARTE.MARTE_Foundations.Time.TimePackage#getTimedEvent_Every()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getEvery();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Time.TimedEvent#getEvery <em>Every</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Every</em>' containment reference.
	 * @see #getEvery()
	 * @generated
	 */
	void setEvery(ValueSpecification value);

} // TimedEvent
