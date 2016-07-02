/**
 */
package MARTE_Library.BasicNFP_Types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aperiodic Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.AperiodicPattern#getDistribution <em>Distribution</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getAperiodicPattern()
 * @model
 * @generated
 */
public interface AperiodicPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution</em>' containment reference.
	 * @see #setDistribution(NFP_CommonType)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getAperiodicPattern_Distribution()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_CommonType getDistribution();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.AperiodicPattern#getDistribution <em>Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution</em>' containment reference.
	 * @see #getDistribution()
	 * @generated
	 */
	void setDistribution(NFP_CommonType value);

} // AperiodicPattern
