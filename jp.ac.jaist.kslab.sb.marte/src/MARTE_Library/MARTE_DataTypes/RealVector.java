/**
 */
package MARTE_Library.MARTE_DataTypes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.MARTE_DataTypes.RealVector#getVectorElem <em>Vector Elem</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage#getRealVector()
 * @model
 * @generated
 */
public interface RealVector extends EObject {
	/**
	 * Returns the value of the '<em><b>Vector Elem</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector Elem</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector Elem</em>' attribute list.
	 * @see MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage#getRealVector_VectorElem()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Real" ordered="false"
	 * @generated
	 */
	EList<Object> getVectorElem();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="MARTE_Library.MARTE_PrimitivesTypes.Real" required="true" ordered="false" iRequired="true" iOrdered="false"
	 * @generated
	 */
	Object at(int i);

} // RealVector
