/**
 */
package MARTE_Library.BasicNFP_Types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Closed Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.ClosedPattern#getPopulation <em>Population</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.ClosedPattern#getExtDelay <em>Ext Delay</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getClosedPattern()
 * @model
 * @generated
 */
public interface ClosedPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Population</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population</em>' containment reference.
	 * @see #setPopulation(NFP_Integer)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getClosedPattern_Population()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Integer getPopulation();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.ClosedPattern#getPopulation <em>Population</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population</em>' containment reference.
	 * @see #getPopulation()
	 * @generated
	 */
	void setPopulation(NFP_Integer value);

	/**
	 * Returns the value of the '<em><b>Ext Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext Delay</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext Delay</em>' containment reference.
	 * @see #setExtDelay(NFP_Duration)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getClosedPattern_ExtDelay()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getExtDelay();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.ClosedPattern#getExtDelay <em>Ext Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext Delay</em>' containment reference.
	 * @see #getExtDelay()
	 * @generated
	 */
	void setExtDelay(NFP_Duration value);

} // ClosedPattern
