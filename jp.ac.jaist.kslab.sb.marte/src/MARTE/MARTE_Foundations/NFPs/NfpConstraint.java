/**
 */
package MARTE.MARTE_Foundations.NFPs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nfp Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.NFPs.NfpConstraint#getKind <em>Kind</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.NFPs.NfpConstraint#getBase_Constraint <em>Base Constraint</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.NFPs.NfpConstraint#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.NFPs.NFPsPackage#getNfpConstraint()
 * @model
 * @generated
 */
public interface NfpConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_Foundations.NFPs.ConstraintKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see MARTE.MARTE_Foundations.NFPs.ConstraintKind
	 * @see #setKind(ConstraintKind)
	 * @see MARTE.MARTE_Foundations.NFPs.NFPsPackage#getNfpConstraint_Kind()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	ConstraintKind getKind();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.NFPs.NfpConstraint#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see MARTE.MARTE_Foundations.NFPs.ConstraintKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ConstraintKind value);

	/**
	 * Returns the value of the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Constraint</em>' reference.
	 * @see #setBase_Constraint(Constraint)
	 * @see MARTE.MARTE_Foundations.NFPs.NFPsPackage#getNfpConstraint_Base_Constraint()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Constraint getBase_Constraint();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.NFPs.NfpConstraint#getBase_Constraint <em>Base Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Constraint</em>' reference.
	 * @see #getBase_Constraint()
	 * @generated
	 */
	void setBase_Constraint(Constraint value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_Foundations.CoreElements.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' reference list.
	 * @see MARTE.MARTE_Foundations.NFPs.NFPsPackage#getNfpConstraint_Mode()
	 * @model type="MARTE.MARTE_Foundations.CoreElements.Mode" ordered="false"
	 * @generated
	 */
	EList getMode();

} // NfpConstraint
