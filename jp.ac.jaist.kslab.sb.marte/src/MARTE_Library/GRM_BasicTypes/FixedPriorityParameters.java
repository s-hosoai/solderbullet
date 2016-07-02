/**
 */
package MARTE_Library.GRM_BasicTypes;

import MARTE_Library.BasicNFP_Types.NFP_Integer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Priority Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.FixedPriorityParameters#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage#getFixedPriorityParameters()
 * @model
 * @generated
 */
public interface FixedPriorityParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(NFP_Integer)
	 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage#getFixedPriorityParameters_Priority()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Integer getPriority();

	/**
	 * Sets the value of the '{@link MARTE_Library.GRM_BasicTypes.FixedPriorityParameters#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(NFP_Integer value);

} // FixedPriorityParameters
