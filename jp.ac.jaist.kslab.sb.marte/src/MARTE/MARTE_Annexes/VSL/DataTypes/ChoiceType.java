/**
 */
package MARTE.MARTE_Annexes.VSL.DataTypes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Annexes.VSL.DataTypes.ChoiceType#getChoiceAttrib <em>Choice Attrib</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.VSL.DataTypes.ChoiceType#getDefaultAttrib <em>Default Attrib</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.VSL.DataTypes.ChoiceType#getBase_DataType <em>Base Data Type</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Annexes.VSL.DataTypes.DataTypesPackage#getChoiceType()
 * @model
 * @generated
 */
public interface ChoiceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Choice Attrib</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choice Attrib</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choice Attrib</em>' reference list.
	 * @see MARTE.MARTE_Annexes.VSL.DataTypes.DataTypesPackage#getChoiceType_ChoiceAttrib()
	 * @model type="org.eclipse.uml2.uml.Property" ordered="false"
	 * @generated
	 */
	EList getChoiceAttrib();

	/**
	 * Returns the value of the '<em><b>Default Attrib</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Attrib</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Attrib</em>' reference.
	 * @see #setDefaultAttrib(Property)
	 * @see MARTE.MARTE_Annexes.VSL.DataTypes.DataTypesPackage#getChoiceType_DefaultAttrib()
	 * @model ordered="false"
	 * @generated
	 */
	Property getDefaultAttrib();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Annexes.VSL.DataTypes.ChoiceType#getDefaultAttrib <em>Default Attrib</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Attrib</em>' reference.
	 * @see #getDefaultAttrib()
	 * @generated
	 */
	void setDefaultAttrib(Property value);

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
	 * @see MARTE.MARTE_Annexes.VSL.DataTypes.DataTypesPackage#getChoiceType_Base_DataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getBase_DataType();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Annexes.VSL.DataTypes.ChoiceType#getBase_DataType <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Data Type</em>' reference.
	 * @see #getBase_DataType()
	 * @generated
	 */
	void setBase_DataType(DataType value);

} // ChoiceType
