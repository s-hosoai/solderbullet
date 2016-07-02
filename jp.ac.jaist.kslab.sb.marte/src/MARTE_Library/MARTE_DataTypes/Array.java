/**
 */
package MARTE_Library.MARTE_DataTypes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.MARTE_DataTypes.Array#getVectorElement <em>Vector Element</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage#getArray()
 * @model
 * @generated
 */
public interface Array<T> extends EObject {
	/**
	 * Returns the value of the '<em><b>Vector Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector Element</em>' containment reference list.
	 * @see MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage#getArray_VectorElement()
	 * @model kind="reference" containment="true" ordered="false"
	 * @generated
	 */
	EList<T> getVectorElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" iRequired="true" iOrdered="false"
	 * @generated
	 */
	T at(int i);

} // Array
