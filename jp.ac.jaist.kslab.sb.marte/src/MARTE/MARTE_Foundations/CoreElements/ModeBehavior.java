/**
 */
package MARTE.MARTE_Foundations.CoreElements;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.StateMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.CoreElements.ModeBehavior#getBase_StateMachine <em>Base State Machine</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.CoreElements.CoreElementsPackage#getModeBehavior()
 * @model
 * @generated
 */
public interface ModeBehavior extends EObject {
	/**
	 * Returns the value of the '<em><b>Base State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base State Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base State Machine</em>' reference.
	 * @see #setBase_StateMachine(StateMachine)
	 * @see MARTE.MARTE_Foundations.CoreElements.CoreElementsPackage#getModeBehavior_Base_StateMachine()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StateMachine getBase_StateMachine();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.CoreElements.ModeBehavior#getBase_StateMachine <em>Base State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base State Machine</em>' reference.
	 * @see #getBase_StateMachine()
	 * @generated
	 */
	void setBase_StateMachine(StateMachine value);

} // ModeBehavior
