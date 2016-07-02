/**
 */
package MARTE.MARTE_Foundations.Alloc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Dependency;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nfp Refine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.Alloc.NfpRefine#getBase_Dependency <em>Base Dependency</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Alloc.NfpRefine#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.Alloc.AllocPackage#getNfpRefine()
 * @model
 * @generated
 */
public interface NfpRefine extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Dependency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Dependency</em>' reference.
	 * @see #setBase_Dependency(Dependency)
	 * @see MARTE.MARTE_Foundations.Alloc.AllocPackage#getNfpRefine_Base_Dependency()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Dependency getBase_Dependency();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Alloc.NfpRefine#getBase_Dependency <em>Base Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Dependency</em>' reference.
	 * @see #getBase_Dependency()
	 * @generated
	 */
	void setBase_Dependency(Dependency value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_Foundations.NFPs.NfpConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' reference list.
	 * @see MARTE.MARTE_Foundations.Alloc.AllocPackage#getNfpRefine_Constraint()
	 * @model type="MARTE.MARTE_Foundations.NFPs.NfpConstraint" ordered="false"
	 * @generated
	 */
	EList getConstraint();

} // NfpRefine
