/**
 */
package MARTE.MARTE_Annexes.RSM;

import MARTE_Library.RS_Library.ShapeSpecification;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.MultiplicityElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shaped</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.Shaped#getShape <em>Shape</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.Shaped#getBase_MultiplicityElement <em>Base Multiplicity Element</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Annexes.RSM.RSMPackage#getShaped()
 * @model
 * @generated
 */
public interface Shaped extends EObject {
	/**
	 * Returns the value of the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' containment reference.
	 * @see #setShape(ShapeSpecification)
	 * @see MARTE.MARTE_Annexes.RSM.RSMPackage#getShaped_Shape()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ShapeSpecification getShape();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Annexes.RSM.Shaped#getShape <em>Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' containment reference.
	 * @see #getShape()
	 * @generated
	 */
	void setShape(ShapeSpecification value);

	/**
	 * Returns the value of the '<em><b>Base Multiplicity Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Multiplicity Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Multiplicity Element</em>' reference.
	 * @see #setBase_MultiplicityElement(MultiplicityElement)
	 * @see MARTE.MARTE_Annexes.RSM.RSMPackage#getShaped_Base_MultiplicityElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MultiplicityElement getBase_MultiplicityElement();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Annexes.RSM.Shaped#getBase_MultiplicityElement <em>Base Multiplicity Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Multiplicity Element</em>' reference.
	 * @see #getBase_MultiplicityElement()
	 * @generated
	 */
	void setBase_MultiplicityElement(MultiplicityElement value);

} // Shaped
