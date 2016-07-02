/**
 */
package MARTE_Library.MARTE_DataTypes;

import MARTE_Library.BasicNFP_Types.NFP_Frequency;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFP Frequency Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.MARTE_DataTypes.NFP_FrequencyInterval#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage#getNFP_FrequencyInterval()
 * @model
 * @generated
 */
public interface NFP_FrequencyInterval extends EObject {
	/**
	 * Returns the value of the '<em><b>Bound</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Frequency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' containment reference list.
	 * @see MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage#getNFP_FrequencyInterval_Bound()
	 * @model containment="true" lower="2" upper="2" ordered="false"
	 * @generated
	 */
	EList<NFP_Frequency> getBound();

} // NFP_FrequencyInterval
