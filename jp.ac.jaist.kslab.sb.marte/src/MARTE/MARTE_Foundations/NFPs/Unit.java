/**
 */
package MARTE.MARTE_Foundations.NFPs;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.NFPs.Unit#getConvFactor <em>Conv Factor</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.NFPs.Unit#getOffsetFactor <em>Offset Factor</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.NFPs.Unit#getBaseUnit <em>Base Unit</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.NFPs.Unit#getBase_EnumerationLiteral <em>Base Enumeration Literal</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.NFPs.NFPsPackage#getUnit()
 * @model
 * @generated
 */
public interface Unit extends EObject {
	/**
	 * Returns the value of the '<em><b>Conv Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conv Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conv Factor</em>' attribute.
	 * @see #setConvFactor(Object)
	 * @see MARTE.MARTE_Foundations.NFPs.NFPsPackage#getUnit_ConvFactor()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Real" ordered="false"
	 * @generated
	 */
	Object getConvFactor();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.NFPs.Unit#getConvFactor <em>Conv Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conv Factor</em>' attribute.
	 * @see #getConvFactor()
	 * @generated
	 */
	void setConvFactor(Object value);

	/**
	 * Returns the value of the '<em><b>Offset Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset Factor</em>' attribute.
	 * @see #setOffsetFactor(Object)
	 * @see MARTE.MARTE_Foundations.NFPs.NFPsPackage#getUnit_OffsetFactor()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Real" ordered="false"
	 * @generated
	 */
	Object getOffsetFactor();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.NFPs.Unit#getOffsetFactor <em>Offset Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Factor</em>' attribute.
	 * @see #getOffsetFactor()
	 * @generated
	 */
	void setOffsetFactor(Object value);

	/**
	 * Returns the value of the '<em><b>Base Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Unit</em>' reference.
	 * @see #setBaseUnit(Unit)
	 * @see MARTE.MARTE_Foundations.NFPs.NFPsPackage#getUnit_BaseUnit()
	 * @model ordered="false"
	 * @generated
	 */
	Unit getBaseUnit();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.NFPs.Unit#getBaseUnit <em>Base Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Unit</em>' reference.
	 * @see #getBaseUnit()
	 * @generated
	 */
	void setBaseUnit(Unit value);

	/**
	 * Returns the value of the '<em><b>Base Enumeration Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Enumeration Literal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Enumeration Literal</em>' reference.
	 * @see #setBase_EnumerationLiteral(EnumerationLiteral)
	 * @see MARTE.MARTE_Foundations.NFPs.NFPsPackage#getUnit_Base_EnumerationLiteral()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EnumerationLiteral getBase_EnumerationLiteral();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.NFPs.Unit#getBase_EnumerationLiteral <em>Base Enumeration Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Enumeration Literal</em>' reference.
	 * @see #getBase_EnumerationLiteral()
	 * @generated
	 */
	void setBase_EnumerationLiteral(EnumerationLiteral value);

} // Unit
