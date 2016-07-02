/**
 */
package MARTE_Library.BasicNFP_Types;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Irregular Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.IrregularPattern#getPhase <em>Phase</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.IrregularPattern#getInterarrivals <em>Interarrivals</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getIrregularPattern()
 * @model
 * @generated
 */
public interface IrregularPattern extends AperiodicPattern {
	/**
	 * Returns the value of the '<em><b>Phase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' containment reference.
	 * @see #setPhase(NFP_Duration)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getIrregularPattern_Phase()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getPhase();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.IrregularPattern#getPhase <em>Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' containment reference.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Interarrivals</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interarrivals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interarrivals</em>' containment reference list.
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getIrregularPattern_Interarrivals()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<NFP_Duration> getInterarrivals();

} // IrregularPattern
