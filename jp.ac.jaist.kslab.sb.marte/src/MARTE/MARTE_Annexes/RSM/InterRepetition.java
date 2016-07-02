/**
 */
package MARTE.MARTE_Annexes.RSM;

import MARTE_Library.MARTE_DataTypes.IntegerVector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inter Repetition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.InterRepetition#getRepetitionShapeDependence <em>Repetition Shape Dependence</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.InterRepetition#getIsModulo <em>Is Modulo</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Annexes.RSM.RSMPackage#getInterRepetition()
 * @model
 * @generated
 */
public interface InterRepetition extends LinkTopology {
	/**
	 * Returns the value of the '<em><b>Repetition Shape Dependence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repetition Shape Dependence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repetition Shape Dependence</em>' containment reference.
	 * @see #setRepetitionShapeDependence(IntegerVector)
	 * @see MARTE.MARTE_Annexes.RSM.RSMPackage#getInterRepetition_RepetitionShapeDependence()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	IntegerVector getRepetitionShapeDependence();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Annexes.RSM.InterRepetition#getRepetitionShapeDependence <em>Repetition Shape Dependence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetition Shape Dependence</em>' containment reference.
	 * @see #getRepetitionShapeDependence()
	 * @generated
	 */
	void setRepetitionShapeDependence(IntegerVector value);

	/**
	 * Returns the value of the '<em><b>Is Modulo</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Modulo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Modulo</em>' attribute.
	 * @see #setIsModulo(Boolean)
	 * @see MARTE.MARTE_Annexes.RSM.RSMPackage#getInterRepetition_IsModulo()
	 * @model default="false" unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getIsModulo();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Annexes.RSM.InterRepetition#getIsModulo <em>Is Modulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Modulo</em>' attribute.
	 * @see #getIsModulo()
	 * @generated
	 */
	void setIsModulo(Boolean value);

} // InterRepetition
