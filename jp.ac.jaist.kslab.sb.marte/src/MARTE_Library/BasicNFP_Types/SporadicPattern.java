/**
 */
package MARTE_Library.BasicNFP_Types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sporadic Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.SporadicPattern#getMinInterarrival <em>Min Interarrival</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.SporadicPattern#getMaxInterarrival <em>Max Interarrival</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.SporadicPattern#getJitter <em>Jitter</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getSporadicPattern()
 * @model
 * @generated
 */
public interface SporadicPattern extends AperiodicPattern {
	/**
	 * Returns the value of the '<em><b>Min Interarrival</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Interarrival</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Interarrival</em>' containment reference.
	 * @see #setMinInterarrival(NFP_Duration)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getSporadicPattern_MinInterarrival()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getMinInterarrival();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.SporadicPattern#getMinInterarrival <em>Min Interarrival</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Interarrival</em>' containment reference.
	 * @see #getMinInterarrival()
	 * @generated
	 */
	void setMinInterarrival(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Max Interarrival</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Interarrival</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Interarrival</em>' containment reference.
	 * @see #setMaxInterarrival(NFP_Duration)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getSporadicPattern_MaxInterarrival()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getMaxInterarrival();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.SporadicPattern#getMaxInterarrival <em>Max Interarrival</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Interarrival</em>' containment reference.
	 * @see #getMaxInterarrival()
	 * @generated
	 */
	void setMaxInterarrival(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jitter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jitter</em>' containment reference.
	 * @see #setJitter(NFP_Duration)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getSporadicPattern_Jitter()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getJitter();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.SporadicPattern#getJitter <em>Jitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jitter</em>' containment reference.
	 * @see #getJitter()
	 * @generated
	 */
	void setJitter(NFP_Duration value);

} // SporadicPattern
