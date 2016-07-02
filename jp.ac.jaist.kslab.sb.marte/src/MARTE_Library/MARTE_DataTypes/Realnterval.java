/**
 */
package MARTE_Library.MARTE_DataTypes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realnterval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.MARTE_DataTypes.Realnterval#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage#getRealnterval()
 * @model
 * @generated
 */
public interface Realnterval extends EObject {
	/**
	 * Returns the value of the '<em><b>Bound</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' attribute list.
	 * @see MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage#getRealnterval_Bound()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Real" lower="2" upper="2" ordered="false"
	 * @generated
	 */
	EList<Object> getBound();

} // Realnterval
