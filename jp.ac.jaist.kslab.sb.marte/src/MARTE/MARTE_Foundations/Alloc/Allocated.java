/**
 */
package MARTE.MARTE_Foundations.Alloc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocated</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.Alloc.Allocated#getBase_NamedElement <em>Base Named Element</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Alloc.Allocated#getAllocatedTo <em>Allocated To</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Alloc.Allocated#getAllocatedFrom <em>Allocated From</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.Alloc.AllocPackage#getAllocated()
 * @model
 * @generated
 */
public interface Allocated extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Named Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Named Element</em>' reference.
	 * @see #setBase_NamedElement(NamedElement)
	 * @see MARTE.MARTE_Foundations.Alloc.AllocPackage#getAllocated_Base_NamedElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NamedElement getBase_NamedElement();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Alloc.Allocated#getBase_NamedElement <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Named Element</em>' reference.
	 * @see #getBase_NamedElement()
	 * @generated
	 */
	void setBase_NamedElement(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Allocated To</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_Foundations.Alloc.Allocated}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated To</em>' reference list.
	 * @see MARTE.MARTE_Foundations.Alloc.AllocPackage#getAllocated_AllocatedTo()
	 * @model type="MARTE.MARTE_Foundations.Alloc.Allocated" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getAllocatedTo();

	/**
	 * Returns the value of the '<em><b>Allocated From</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_Foundations.Alloc.Allocated}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated From</em>' reference list.
	 * @see MARTE.MARTE_Foundations.Alloc.AllocPackage#getAllocated_AllocatedFrom()
	 * @model type="MARTE.MARTE_Foundations.Alloc.Allocated" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList getAllocatedFrom();

} // Allocated
