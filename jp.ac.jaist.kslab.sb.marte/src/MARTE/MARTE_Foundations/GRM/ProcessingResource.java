/**
 */
package MARTE.MARTE_Foundations.GRM;

import MARTE_Library.BasicNFP_Types.NFP_Real;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.ProcessingResource#getSpeedFactor <em>Speed Factor</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.ProcessingResource#getMainScheduler <em>Main Scheduler</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getProcessingResource()
 * @model
 * @generated
 */
public interface ProcessingResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Speed Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed Factor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Factor</em>' containment reference.
	 * @see #setSpeedFactor(NFP_Real)
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getProcessingResource_SpeedFactor()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Real getSpeedFactor();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.GRM.ProcessingResource#getSpeedFactor <em>Speed Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Factor</em>' containment reference.
	 * @see #getSpeedFactor()
	 * @generated
	 */
	void setSpeedFactor(NFP_Real value);

	/**
	 * Returns the value of the '<em><b>Main Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Scheduler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Scheduler</em>' reference.
	 * @see #setMainScheduler(Scheduler)
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getProcessingResource_MainScheduler()
	 * @model ordered="false"
	 * @generated
	 */
	Scheduler getMainScheduler();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.GRM.ProcessingResource#getMainScheduler <em>Main Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Scheduler</em>' reference.
	 * @see #getMainScheduler()
	 * @generated
	 */
	void setMainScheduler(Scheduler value);

} // ProcessingResource
