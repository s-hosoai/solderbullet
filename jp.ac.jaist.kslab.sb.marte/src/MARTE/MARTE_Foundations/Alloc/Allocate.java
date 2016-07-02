/**
 */
package MARTE.MARTE_Foundations.Alloc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Abstraction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.Alloc.Allocate#getKind <em>Kind</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Alloc.Allocate#getNature <em>Nature</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Alloc.Allocate#getBase_Abstraction <em>Base Abstraction</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Alloc.Allocate#getImpliedConstraint <em>Implied Constraint</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.Alloc.AllocPackage#getAllocate()
 * @model
 * @generated
 */
public interface Allocate extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_Foundations.Alloc.AllocationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see MARTE.MARTE_Foundations.Alloc.AllocationKind
	 * @see #setKind(AllocationKind)
	 * @see MARTE.MARTE_Foundations.Alloc.AllocPackage#getAllocate_Kind()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	AllocationKind getKind();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Alloc.Allocate#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see MARTE.MARTE_Foundations.Alloc.AllocationKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(AllocationKind value);

	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_Foundations.Alloc.AllocationNature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see MARTE.MARTE_Foundations.Alloc.AllocationNature
	 * @see #setNature(AllocationNature)
	 * @see MARTE.MARTE_Foundations.Alloc.AllocPackage#getAllocate_Nature()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	AllocationNature getNature();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Alloc.Allocate#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see MARTE.MARTE_Foundations.Alloc.AllocationNature
	 * @see #getNature()
	 * @generated
	 */
	void setNature(AllocationNature value);

	/**
	 * Returns the value of the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Abstraction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Abstraction</em>' reference.
	 * @see #setBase_Abstraction(Abstraction)
	 * @see MARTE.MARTE_Foundations.Alloc.AllocPackage#getAllocate_Base_Abstraction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Abstraction getBase_Abstraction();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Alloc.Allocate#getBase_Abstraction <em>Base Abstraction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Abstraction</em>' reference.
	 * @see #getBase_Abstraction()
	 * @generated
	 */
	void setBase_Abstraction(Abstraction value);

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
	 * @see MARTE.MARTE_Foundations.Alloc.AllocPackage#getAllocate_ImpliedConstraint()
	 * @model type="MARTE.MARTE_Foundations.NFPs.NfpConstraint" ordered="false"
	 * @generated
	 */
	EList getImpliedConstraint();

} // Allocate
