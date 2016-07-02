/**
 */
package MARTE.MARTE_Annexes.RSM;

import MARTE_Library.RS_Library.ShapeSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reshape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.Reshape#getPatternShape <em>Pattern Shape</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.Reshape#getRepetitonShape <em>Repetiton Shape</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Annexes.RSM.RSMPackage#getReshape()
 * @model
 * @generated
 */
public interface Reshape extends LinkTopology {
	/**
	 * Returns the value of the '<em><b>Pattern Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Shape</em>' containment reference.
	 * @see #setPatternShape(ShapeSpecification)
	 * @see MARTE.MARTE_Annexes.RSM.RSMPackage#getReshape_PatternShape()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ShapeSpecification getPatternShape();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Annexes.RSM.Reshape#getPatternShape <em>Pattern Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Shape</em>' containment reference.
	 * @see #getPatternShape()
	 * @generated
	 */
	void setPatternShape(ShapeSpecification value);

	/**
	 * Returns the value of the '<em><b>Repetiton Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repetiton Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repetiton Shape</em>' containment reference.
	 * @see #setRepetitonShape(ShapeSpecification)
	 * @see MARTE.MARTE_Annexes.RSM.RSMPackage#getReshape_RepetitonShape()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ShapeSpecification getRepetitonShape();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Annexes.RSM.Reshape#getRepetitonShape <em>Repetiton Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetiton Shape</em>' containment reference.
	 * @see #getRepetitonShape()
	 * @generated
	 */
	void setRepetitonShape(ShapeSpecification value);

} // Reshape
