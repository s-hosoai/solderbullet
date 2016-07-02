/**
 */
package MARTE.MARTE_Foundations.Time;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.DurationObservation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Duration Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.Time.TimedDurationObservation#getObsKind <em>Obs Kind</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Time.TimedDurationObservation#getBase_DurationObservation <em>Base Duration Observation</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.Time.TimePackage#getTimedDurationObservation()
 * @model
 * @generated
 */
public interface TimedDurationObservation extends TimedObservation {
	/**
	 * Returns the value of the '<em><b>Obs Kind</b></em>' attribute list.
	 * The list contents are of type {@link MARTE_Library.TimeTypesLibrary.EventKind}.
	 * The literals are from the enumeration {@link MARTE_Library.TimeTypesLibrary.EventKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obs Kind</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obs Kind</em>' attribute list.
	 * @see MARTE_Library.TimeTypesLibrary.EventKind
	 * @see MARTE.MARTE_Foundations.Time.TimePackage#getTimedDurationObservation_ObsKind()
	 * @model unique="false" dataType="MARTE_Library.TimeTypesLibrary.EventKind" upper="2" ordered="false"
	 * @generated
	 */
	EList getObsKind();

	/**
	 * Returns the value of the '<em><b>Base Duration Observation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Duration Observation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Duration Observation</em>' reference.
	 * @see #setBase_DurationObservation(DurationObservation)
	 * @see MARTE.MARTE_Foundations.Time.TimePackage#getTimedDurationObservation_Base_DurationObservation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DurationObservation getBase_DurationObservation();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Time.TimedDurationObservation#getBase_DurationObservation <em>Base Duration Observation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Duration Observation</em>' reference.
	 * @see #getBase_DurationObservation()
	 * @generated
	 */
	void setBase_DurationObservation(DurationObservation value);

} // TimedDurationObservation
