/**
 */
package MARTE.MARTE_Annexes.VSL.DataTypes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Annexes.VSL.DataTypes.TupleType#getTupleAttrib <em>Tuple Attrib</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.VSL.DataTypes.TupleType#getBase_DataType <em>Base Data Type</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Annexes.VSL.DataTypes.DataTypesPackage#getTupleType()
 * @model
 * @generated
 */
public interface TupleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Tuple Attrib</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuple Attrib</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuple Attrib</em>' reference list.
	 * @see MARTE.MARTE_Annexes.VSL.DataTypes.DataTypesPackage#getTupleType_TupleAttrib()
	 * @model type="org.eclipse.uml2.uml.Property" ordered="false"
	 * @generated
	 */
	EList getTupleAttrib();

	/**
	 * Returns the value of the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Data Type</em>' reference.
	 * @see #setBase_DataType(DataType)
	 * @see MARTE.MARTE_Annexes.VSL.DataTypes.DataTypesPackage#getTupleType_Base_DataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getBase_DataType();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Annexes.VSL.DataTypes.TupleType#getBase_DataType <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Data Type</em>' reference.
	 * @see #getBase_DataType()
	 * @generated
	 */
	void setBase_DataType(DataType value);

} // TupleType
