/**
 */
package MARTE_Library.MARTE_DataTypes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.MARTE_DataTypes.IntegerMatrix#getMatrixElem <em>Matrix Elem</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage#getIntegerMatrix()
 * @model
 * @generated
 */
public interface IntegerMatrix extends EObject {
	/**
	 * Returns the value of the '<em><b>Matrix Elem</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.MARTE_DataTypes.IntegerVector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matrix Elem</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix Elem</em>' containment reference list.
	 * @see MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage#getIntegerMatrix_MatrixElem()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<IntegerVector> getMatrixElem();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" iRequired="true" iOrdered="false"
	 * @generated
	 */
	IntegerVector at(int i);

} // IntegerMatrix
