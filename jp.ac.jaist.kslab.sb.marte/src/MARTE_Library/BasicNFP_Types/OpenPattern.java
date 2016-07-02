/**
 */
package MARTE_Library.BasicNFP_Types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.OpenPattern#getInterArrivalTime <em>Inter Arrival Time</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.OpenPattern#getArrivalRate <em>Arrival Rate</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.OpenPattern#getArrivalProcess <em>Arrival Process</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getOpenPattern()
 * @model
 * @generated
 */
public interface OpenPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Inter Arrival Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inter Arrival Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inter Arrival Time</em>' containment reference.
	 * @see #setInterArrivalTime(NFP_Duration)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getOpenPattern_InterArrivalTime()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getInterArrivalTime();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.OpenPattern#getInterArrivalTime <em>Inter Arrival Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inter Arrival Time</em>' containment reference.
	 * @see #getInterArrivalTime()
	 * @generated
	 */
	void setInterArrivalTime(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Arrival Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrival Rate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Rate</em>' containment reference.
	 * @see #setArrivalRate(NFP_Frequency)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getOpenPattern_ArrivalRate()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Frequency getArrivalRate();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.OpenPattern#getArrivalRate <em>Arrival Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Rate</em>' containment reference.
	 * @see #getArrivalRate()
	 * @generated
	 */
	void setArrivalRate(NFP_Frequency value);

	/**
	 * Returns the value of the '<em><b>Arrival Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrival Process</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Process</em>' attribute.
	 * @see #setArrivalProcess(String)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getOpenPattern_ArrivalProcess()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getArrivalProcess();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.OpenPattern#getArrivalProcess <em>Arrival Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Process</em>' attribute.
	 * @see #getArrivalProcess()
	 * @generated
	 */
	void setArrivalProcess(String value);

} // OpenPattern
