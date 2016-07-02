/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Concurrency;

import MARTE.MARTE_Foundations.GRM.TimerResource;

import org.eclipse.uml2.uml.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sw Timer Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwTimerResource#getDurationElements <em>Duration Elements</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwTimerResource()
 * @model
 * @generated
 */
public interface SwTimerResource extends TimerResource {
	/**
	 * Returns the value of the '<em><b>Duration Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Elements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Elements</em>' reference.
	 * @see #setDurationElements(TypedElement)
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getSwTimerResource_DurationElements()
	 * @model ordered="false"
	 * @generated
	 */
	TypedElement getDurationElements();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwTimerResource#getDurationElements <em>Duration Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Elements</em>' reference.
	 * @see #getDurationElements()
	 * @generated
	 */
	void setDurationElements(TypedElement value);

} // SwTimerResource
