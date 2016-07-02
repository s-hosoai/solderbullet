/**
 */
package MARTE.MARTE_Annexes.VSL.DataTypes;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Annexes.VSL.DataTypes.IntervalType#getIntervalAttrib <em>Interval Attrib</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.VSL.DataTypes.IntervalType#getBase_DataType <em>Base Data Type</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Annexes.VSL.DataTypes.DataTypesPackage#getIntervalType()
 * @model
 * @generated
 */
public interface IntervalType extends EObject {
	/**
	 * Returns the value of the '<em><b>Interval Attrib</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Attrib</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Attrib</em>' reference.
	 * @see #setIntervalAttrib(Property)
	 * @see MARTE.MARTE_Annexes.VSL.DataTypes.DataTypesPackage#getIntervalType_IntervalAttrib()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getIntervalAttrib();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Annexes.VSL.DataTypes.IntervalType#getIntervalAttrib <em>Interval Attrib</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Attrib</em>' reference.
	 * @see #getIntervalAttrib()
	 * @generated
	 */
	void setIntervalAttrib(Property value);

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
	 * @see MARTE.MARTE_Annexes.VSL.DataTypes.DataTypesPackage#getIntervalType_Base_DataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getBase_DataType();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Annexes.VSL.DataTypes.IntervalType#getBase_DataType <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Data Type</em>' reference.
	 * @see #getBase_DataType()
	 * @generated
	 */
	void setBase_DataType(DataType value);

} // IntervalType
