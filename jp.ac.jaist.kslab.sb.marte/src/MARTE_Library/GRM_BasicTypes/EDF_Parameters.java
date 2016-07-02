/**
 */
package MARTE_Library.GRM_BasicTypes;

import MARTE_Library.BasicNFP_Types.NFP_Duration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDF Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.EDF_Parameters#getDeadline <em>Deadline</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage#getEDF_Parameters()
 * @model
 * @generated
 */
public interface EDF_Parameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' containment reference.
	 * @see #setDeadline(NFP_Duration)
	 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage#getEDF_Parameters_Deadline()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getDeadline();

	/**
	 * Sets the value of the '{@link MARTE_Library.GRM_BasicTypes.EDF_Parameters#getDeadline <em>Deadline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' containment reference.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(NFP_Duration value);

} // EDF_Parameters
