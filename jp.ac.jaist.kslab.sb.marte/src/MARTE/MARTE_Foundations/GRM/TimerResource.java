/**
 */
package MARTE.MARTE_Foundations.GRM;

import MARTE_Library.BasicNFP_Types.NFP_Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.TimerResource#getDuration <em>Duration</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.TimerResource#getIsPeriodic <em>Is Periodic</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getTimerResource()
 * @model
 * @generated
 */
public interface TimerResource extends TimingResource {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(NFP_Duration)
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getTimerResource_Duration()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getDuration();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.GRM.TimerResource#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Is Periodic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Periodic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Periodic</em>' attribute.
	 * @see #setIsPeriodic(Boolean)
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getTimerResource_IsPeriodic()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getIsPeriodic();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.GRM.TimerResource#getIsPeriodic <em>Is Periodic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Periodic</em>' attribute.
	 * @see #getIsPeriodic()
	 * @generated
	 */
	void setIsPeriodic(Boolean value);

} // TimerResource
