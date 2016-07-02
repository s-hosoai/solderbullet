/**
 */
package MARTE.MARTE_Foundations.NFPs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Enumeration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.NFPs.Dimension#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.NFPs.Dimension#getBaseDimension <em>Base Dimension</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.NFPs.Dimension#getBaseExponent <em>Base Exponent</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.NFPs.Dimension#getBase_Enumeration <em>Base Enumeration</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.NFPs.NFPsPackage#getDimension()
 * @model
 * @generated
 */
public interface Dimension extends EObject {
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see MARTE.MARTE_Foundations.NFPs.NFPsPackage#getDimension_Symbol()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.NFPs.Dimension#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Base Dimension</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_Foundations.NFPs.Dimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Dimension</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Dimension</em>' reference list.
	 * @see MARTE.MARTE_Foundations.NFPs.NFPsPackage#getDimension_BaseDimension()
	 * @model type="MARTE.MARTE_Foundations.NFPs.Dimension"
	 * @generated
	 */
	EList getBaseDimension();

	/**
	 * Returns the value of the '<em><b>Base Exponent</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Exponent</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Exponent</em>' attribute list.
	 * @see MARTE.MARTE_Foundations.NFPs.NFPsPackage#getDimension_BaseExponent()
	 * @model unique="false"
	 * @generated
	 */
	EList getBaseExponent();

	/**
	 * Returns the value of the '<em><b>Base Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Enumeration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Enumeration</em>' reference.
	 * @see #setBase_Enumeration(Enumeration)
	 * @see MARTE.MARTE_Foundations.NFPs.NFPsPackage#getDimension_Base_Enumeration()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Enumeration getBase_Enumeration();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.NFPs.Dimension#getBase_Enumeration <em>Base Enumeration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Enumeration</em>' reference.
	 * @see #getBase_Enumeration()
	 * @generated
	 */
	void setBase_Enumeration(Enumeration value);

} // Dimension
