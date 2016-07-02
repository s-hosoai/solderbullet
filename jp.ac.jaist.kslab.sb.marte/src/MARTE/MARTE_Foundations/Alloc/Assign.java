/**
 */
package MARTE.MARTE_Foundations.Alloc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Comment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.Alloc.Assign#getImpliedConstraint <em>Implied Constraint</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Alloc.Assign#getFrom <em>From</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Alloc.Assign#getTo <em>To</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Alloc.Assign#getBase_Comment <em>Base Comment</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.Alloc.AllocPackage#getAssign()
 * @model
 * @generated
 */
public interface Assign extends EObject {
	/**
	 * Returns the value of the '<em><b>Implied Constraint</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_Foundations.NFPs.NfpConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implied Constraint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implied Constraint</em>' reference list.
	 * @see MARTE.MARTE_Foundations.Alloc.AllocPackage#getAssign_ImpliedConstraint()
	 * @model type="MARTE.MARTE_Foundations.NFPs.NfpConstraint" ordered="false"
	 * @generated
	 */
	EList getImpliedConstraint();

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference list.
	 * @see MARTE.MARTE_Foundations.Alloc.AllocPackage#getAssign_From()
	 * @model type="org.eclipse.uml2.uml.Element" required="true" ordered="false"
	 * @generated
	 */
	EList getFrom();

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference list.
	 * @see MARTE.MARTE_Foundations.Alloc.AllocPackage#getAssign_To()
	 * @model type="org.eclipse.uml2.uml.Element" required="true" ordered="false"
	 * @generated
	 */
	EList getTo();

	/**
	 * Returns the value of the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Comment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Comment</em>' reference.
	 * @see #setBase_Comment(Comment)
	 * @see MARTE.MARTE_Foundations.Alloc.AllocPackage#getAssign_Base_Comment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Comment getBase_Comment();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Alloc.Assign#getBase_Comment <em>Base Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Comment</em>' reference.
	 * @see #getBase_Comment()
	 * @generated
	 */
	void setBase_Comment(Comment value);

} // Assign
