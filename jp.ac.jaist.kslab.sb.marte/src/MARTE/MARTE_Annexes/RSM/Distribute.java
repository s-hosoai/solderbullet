/**
 */
package MARTE.MARTE_Annexes.RSM;

import MARTE.MARTE_Foundations.Alloc.Allocate;

import MARTE_Library.RS_Library.ShapeSpecification;
import MARTE_Library.RS_Library.TilerSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.Distribute#getPatternShape <em>Pattern Shape</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.Distribute#getRepetitionSpace <em>Repetition Space</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.Distribute#getFromTiler <em>From Tiler</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.Distribute#getToTiler <em>To Tiler</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Annexes.RSM.RSMPackage#getDistribute()
 * @model
 * @generated
 */
public interface Distribute extends Allocate {
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
	 * @see MARTE.MARTE_Annexes.RSM.RSMPackage#getDistribute_PatternShape()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ShapeSpecification getPatternShape();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Annexes.RSM.Distribute#getPatternShape <em>Pattern Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Shape</em>' containment reference.
	 * @see #getPatternShape()
	 * @generated
	 */
	void setPatternShape(ShapeSpecification value);

	/**
	 * Returns the value of the '<em><b>Repetition Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repetition Space</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repetition Space</em>' containment reference.
	 * @see #setRepetitionSpace(ShapeSpecification)
	 * @see MARTE.MARTE_Annexes.RSM.RSMPackage#getDistribute_RepetitionSpace()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ShapeSpecification getRepetitionSpace();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Annexes.RSM.Distribute#getRepetitionSpace <em>Repetition Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetition Space</em>' containment reference.
	 * @see #getRepetitionSpace()
	 * @generated
	 */
	void setRepetitionSpace(ShapeSpecification value);

	/**
	 * Returns the value of the '<em><b>From Tiler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Tiler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Tiler</em>' containment reference.
	 * @see #setFromTiler(TilerSpecification)
	 * @see MARTE.MARTE_Annexes.RSM.RSMPackage#getDistribute_FromTiler()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TilerSpecification getFromTiler();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Annexes.RSM.Distribute#getFromTiler <em>From Tiler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Tiler</em>' containment reference.
	 * @see #getFromTiler()
	 * @generated
	 */
	void setFromTiler(TilerSpecification value);

	/**
	 * Returns the value of the '<em><b>To Tiler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Tiler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Tiler</em>' containment reference.
	 * @see #setToTiler(TilerSpecification)
	 * @see MARTE.MARTE_Annexes.RSM.RSMPackage#getDistribute_ToTiler()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TilerSpecification getToTiler();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Annexes.RSM.Distribute#getToTiler <em>To Tiler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Tiler</em>' containment reference.
	 * @see #getToTiler()
	 * @generated
	 */
	void setToTiler(TilerSpecification value);

} // Distribute
