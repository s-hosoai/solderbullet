/**
 */
package MARTE.MARTE_Foundations.NFPs;

import MARTE.MARTE_Annexes.VSL.DataTypes.TupleType;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nfp Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.NFPs.NfpType#getValueAttrib <em>Value Attrib</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.NFPs.NfpType#getUnitAttrib <em>Unit Attrib</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.NFPs.NfpType#getExprAttrib <em>Expr Attrib</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.NFPs.NFPsPackage#getNfpType()
 * @model
 * @generated
 */
public interface NfpType extends TupleType {
	/**
	 * Returns the value of the '<em><b>Value Attrib</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Attrib</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Attrib</em>' reference.
	 * @see #setValueAttrib(Property)
	 * @see MARTE.MARTE_Foundations.NFPs.NFPsPackage#getNfpType_ValueAttrib()
	 * @model ordered="false"
	 * @generated
	 */
	Property getValueAttrib();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.NFPs.NfpType#getValueAttrib <em>Value Attrib</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Attrib</em>' reference.
	 * @see #getValueAttrib()
	 * @generated
	 */
	void setValueAttrib(Property value);

	/**
	 * Returns the value of the '<em><b>Unit Attrib</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Attrib</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Attrib</em>' reference.
	 * @see #setUnitAttrib(Property)
	 * @see MARTE.MARTE_Foundations.NFPs.NFPsPackage#getNfpType_UnitAttrib()
	 * @model ordered="false"
	 * @generated
	 */
	Property getUnitAttrib();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.NFPs.NfpType#getUnitAttrib <em>Unit Attrib</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Attrib</em>' reference.
	 * @see #getUnitAttrib()
	 * @generated
	 */
	void setUnitAttrib(Property value);

	/**
	 * Returns the value of the '<em><b>Expr Attrib</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr Attrib</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr Attrib</em>' reference.
	 * @see #setExprAttrib(Property)
	 * @see MARTE.MARTE_Foundations.NFPs.NFPsPackage#getNfpType_ExprAttrib()
	 * @model ordered="false"
	 * @generated
	 */
	Property getExprAttrib();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.NFPs.NfpType#getExprAttrib <em>Expr Attrib</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr Attrib</em>' reference.
	 * @see #getExprAttrib()
	 * @generated
	 */
	void setExprAttrib(Property value);

} // NfpType
