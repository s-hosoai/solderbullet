/**
 */
package MARTE_Library.MARTE_DataTypes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.MARTE_DataTypes.Interval#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage#getInterval()
 * @model
 * @generated
 */
public interface Interval<T1, T2> extends EObject {
	/**
	 * Returns the value of the '<em><b>Bound</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' containment reference list.
	 * @see MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage#getInterval_Bound()
	 * @model kind="reference" containment="true" lower="2" upper="2" ordered="false"
	 * @generated
	 */
	EList<T2> getBound();

} // Interval
