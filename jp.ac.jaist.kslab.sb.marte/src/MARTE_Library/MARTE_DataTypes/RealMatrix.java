/**
 */
package MARTE_Library.MARTE_DataTypes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.MARTE_DataTypes.RealMatrix#getMatrixElem <em>Matrix Elem</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage#getRealMatrix()
 * @model
 * @generated
 */
public interface RealMatrix extends EObject {
	/**
	 * Returns the value of the '<em><b>Matrix Elem</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matrix Elem</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix Elem</em>' attribute list.
	 * @see MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage#getRealMatrix_MatrixElem()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Real" ordered="false"
	 * @generated
	 */
	EList<Object> getMatrixElem();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model iRequired="true" iOrdered="false" pRequired="true" pOrdered="false"
	 * @generated
	 */
	void at(int i, RealVector p);

} // RealMatrix
