/**
 */
package MARTE_Library.BasicNFP_Types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrival Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.ArrivalPattern#getPeriodic <em>Periodic</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.ArrivalPattern#getAperiodic <em>Aperiodic</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.ArrivalPattern#getBurst <em>Burst</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.ArrivalPattern#getIrregular <em>Irregular</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.ArrivalPattern#getClosed <em>Closed</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.ArrivalPattern#getSporadic <em>Sporadic</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.ArrivalPattern#getOpen <em>Open</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getArrivalPattern()
 * @model
 * @generated
 */
public interface ArrivalPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Periodic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Periodic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periodic</em>' containment reference.
	 * @see #setPeriodic(PeriodicPattern)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getArrivalPattern_Periodic()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PeriodicPattern getPeriodic();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.ArrivalPattern#getPeriodic <em>Periodic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodic</em>' containment reference.
	 * @see #getPeriodic()
	 * @generated
	 */
	void setPeriodic(PeriodicPattern value);

	/**
	 * Returns the value of the '<em><b>Aperiodic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aperiodic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aperiodic</em>' containment reference.
	 * @see #setAperiodic(AperiodicPattern)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getArrivalPattern_Aperiodic()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	AperiodicPattern getAperiodic();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.ArrivalPattern#getAperiodic <em>Aperiodic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aperiodic</em>' containment reference.
	 * @see #getAperiodic()
	 * @generated
	 */
	void setAperiodic(AperiodicPattern value);

	/**
	 * Returns the value of the '<em><b>Burst</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Burst</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Burst</em>' containment reference.
	 * @see #setBurst(BurstPattern)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getArrivalPattern_Burst()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	BurstPattern getBurst();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.ArrivalPattern#getBurst <em>Burst</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Burst</em>' containment reference.
	 * @see #getBurst()
	 * @generated
	 */
	void setBurst(BurstPattern value);

	/**
	 * Returns the value of the '<em><b>Irregular</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Irregular</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Irregular</em>' containment reference.
	 * @see #setIrregular(IrregularPattern)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getArrivalPattern_Irregular()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	IrregularPattern getIrregular();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.ArrivalPattern#getIrregular <em>Irregular</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Irregular</em>' containment reference.
	 * @see #getIrregular()
	 * @generated
	 */
	void setIrregular(IrregularPattern value);

	/**
	 * Returns the value of the '<em><b>Closed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed</em>' containment reference.
	 * @see #setClosed(ClosedPattern)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getArrivalPattern_Closed()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ClosedPattern getClosed();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.ArrivalPattern#getClosed <em>Closed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed</em>' containment reference.
	 * @see #getClosed()
	 * @generated
	 */
	void setClosed(ClosedPattern value);

	/**
	 * Returns the value of the '<em><b>Sporadic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sporadic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sporadic</em>' containment reference.
	 * @see #setSporadic(SporadicPattern)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getArrivalPattern_Sporadic()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	SporadicPattern getSporadic();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.ArrivalPattern#getSporadic <em>Sporadic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sporadic</em>' containment reference.
	 * @see #getSporadic()
	 * @generated
	 */
	void setSporadic(SporadicPattern value);

	/**
	 * Returns the value of the '<em><b>Open</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open</em>' containment reference.
	 * @see #setOpen(OpenPattern)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getArrivalPattern_Open()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	OpenPattern getOpen();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.ArrivalPattern#getOpen <em>Open</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open</em>' containment reference.
	 * @see #getOpen()
	 * @generated
	 */
	void setOpen(OpenPattern value);

} // ArrivalPattern
