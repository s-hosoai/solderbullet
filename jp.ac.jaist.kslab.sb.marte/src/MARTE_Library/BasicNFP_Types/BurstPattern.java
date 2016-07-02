/**
 */
package MARTE_Library.BasicNFP_Types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Burst Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.BurstPattern#getMinInterarrival <em>Min Interarrival</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.BurstPattern#getMaxInterarrival <em>Max Interarrival</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.BurstPattern#getMinEventInterval <em>Min Event Interval</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.BurstPattern#getMaxEventInterval <em>Max Event Interval</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.BurstPattern#getBurstSize <em>Burst Size</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getBurstPattern()
 * @model
 * @generated
 */
public interface BurstPattern extends AperiodicPattern {
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
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getBurstPattern_MinInterarrival()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getMinInterarrival();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.BurstPattern#getMinInterarrival <em>Min Interarrival</em>}' containment reference.
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
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getBurstPattern_MaxInterarrival()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getMaxInterarrival();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.BurstPattern#getMaxInterarrival <em>Max Interarrival</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Interarrival</em>' containment reference.
	 * @see #getMaxInterarrival()
	 * @generated
	 */
	void setMaxInterarrival(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Min Event Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Event Interval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Event Interval</em>' containment reference.
	 * @see #setMinEventInterval(NFP_Duration)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getBurstPattern_MinEventInterval()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getMinEventInterval();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.BurstPattern#getMinEventInterval <em>Min Event Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Event Interval</em>' containment reference.
	 * @see #getMinEventInterval()
	 * @generated
	 */
	void setMinEventInterval(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Max Event Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Event Interval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Event Interval</em>' containment reference.
	 * @see #setMaxEventInterval(NFP_Duration)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getBurstPattern_MaxEventInterval()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getMaxEventInterval();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.BurstPattern#getMaxEventInterval <em>Max Event Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Event Interval</em>' containment reference.
	 * @see #getMaxEventInterval()
	 * @generated
	 */
	void setMaxEventInterval(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Burst Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Burst Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Burst Size</em>' containment reference.
	 * @see #setBurstSize(NFP_Integer)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getBurstPattern_BurstSize()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Integer getBurstSize();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.BurstPattern#getBurstSize <em>Burst Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Burst Size</em>' containment reference.
	 * @see #getBurstSize()
	 * @generated
	 */
	void setBurstSize(NFP_Integer value);

} // BurstPattern
