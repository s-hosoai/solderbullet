/**
 */
package MARTE.MARTE_Foundations.Time;

import MARTE_Library.TimeTypesLibrary.EventKind;

import org.eclipse.uml2.uml.TimeObservation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Instant Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.Time.TimedInstantObservation#getObsKind <em>Obs Kind</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Time.TimedInstantObservation#getBase_TimeObservation <em>Base Time Observation</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.Time.TimePackage#getTimedInstantObservation()
 * @model
 * @generated
 */
public interface TimedInstantObservation extends TimedObservation {
	/**
	 * Returns the value of the '<em><b>Obs Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE_Library.TimeTypesLibrary.EventKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obs Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obs Kind</em>' attribute.
	 * @see MARTE_Library.TimeTypesLibrary.EventKind
	 * @see #setObsKind(EventKind)
	 * @see MARTE.MARTE_Foundations.Time.TimePackage#getTimedInstantObservation_ObsKind()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EventKind getObsKind();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Time.TimedInstantObservation#getObsKind <em>Obs Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obs Kind</em>' attribute.
	 * @see MARTE_Library.TimeTypesLibrary.EventKind
	 * @see #getObsKind()
	 * @generated
	 */
	void setObsKind(EventKind value);

	/**
	 * Returns the value of the '<em><b>Base Time Observation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Time Observation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Time Observation</em>' reference.
	 * @see #setBase_TimeObservation(TimeObservation)
	 * @see MARTE.MARTE_Foundations.Time.TimePackage#getTimedInstantObservation_Base_TimeObservation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TimeObservation getBase_TimeObservation();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Time.TimedInstantObservation#getBase_TimeObservation <em>Base Time Observation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Time Observation</em>' reference.
	 * @see #getBase_TimeObservation()
	 * @generated
	 */
	void setBase_TimeObservation(TimeObservation value);

} // TimedInstantObservation
