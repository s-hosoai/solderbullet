/**
 */
package MARTE_Library.MARTE_DataTypes;

import MARTE_Library.BasicNFP_Types.NFP_Natural;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFP Natural Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.MARTE_DataTypes.NFP_NaturalInterval#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage#getNFP_NaturalInterval()
 * @model
 * @generated
 */
public interface NFP_NaturalInterval extends EObject {
	/**
	 * Returns the value of the '<em><b>Bound</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Natural}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' containment reference list.
	 * @see MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage#getNFP_NaturalInterval_Bound()
	 * @model containment="true" lower="2" upper="2" ordered="false"
	 * @generated
	 */
	EList<NFP_Natural> getBound();

} // NFP_NaturalInterval
