/**
 */
package MARTE_Library.BasicNFP_Types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periodic Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.PeriodicPattern#getPeriod <em>Period</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.PeriodicPattern#getJitter <em>Jitter</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.PeriodicPattern#getPhase <em>Phase</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.PeriodicPattern#getOccurrences <em>Occurrences</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getPeriodicPattern()
 * @model
 * @generated
 */
public interface PeriodicPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(NFP_Duration)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getPeriodicPattern_Period()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getPeriod();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.PeriodicPattern#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(NFP_Duration value);

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
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getPeriodicPattern_Jitter()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getJitter();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.PeriodicPattern#getJitter <em>Jitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jitter</em>' containment reference.
	 * @see #getJitter()
	 * @generated
	 */
	void setJitter(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' containment reference.
	 * @see #setPhase(NFP_Duration)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getPeriodicPattern_Phase()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getPhase();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.PeriodicPattern#getPhase <em>Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' containment reference.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Occurrences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrences</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrences</em>' containment reference.
	 * @see #setOccurrences(NFP_Integer)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getPeriodicPattern_Occurrences()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Integer getOccurrences();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.PeriodicPattern#getOccurrences <em>Occurrences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrences</em>' containment reference.
	 * @see #getOccurrences()
	 * @generated
	 */
	void setOccurrences(NFP_Integer value);

} // PeriodicPattern
