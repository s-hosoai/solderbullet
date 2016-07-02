/**
 */
package MARTE.MARTE_Annexes.VSL.Variables;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Annexes.VSL.Variables.Var#getDir <em>Dir</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.VSL.Variables.Var#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Annexes.VSL.Variables.VariablesPackage#getVar()
 * @model
 * @generated
 */
public interface Var extends EObject {
	/**
	 * Returns the value of the '<em><b>Dir</b></em>' attribute.
	 * The default value is <code>"inout"</code>.
	 * The literals are from the enumeration {@link MARTE.MARTE_Annexes.VSL.Variables.VariableDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir</em>' attribute.
	 * @see MARTE.MARTE_Annexes.VSL.Variables.VariableDirectionKind
	 * @see #setDir(VariableDirectionKind)
	 * @see MARTE.MARTE_Annexes.VSL.Variables.VariablesPackage#getVar_Dir()
	 * @model default="inout" unique="false" ordered="false"
	 * @generated
	 */
	VariableDirectionKind getDir();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Annexes.VSL.Variables.Var#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' attribute.
	 * @see MARTE.MARTE_Annexes.VSL.Variables.VariableDirectionKind
	 * @see #getDir()
	 * @generated
	 */
	void setDir(VariableDirectionKind value);

	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see MARTE.MARTE_Annexes.VSL.Variables.VariablesPackage#getVar_Base_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Annexes.VSL.Variables.Var#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

} // Var
