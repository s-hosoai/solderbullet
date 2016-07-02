/**
 */
package MARTE.MARTE_Foundations.GRM;

import MARTE_Library.BasicNFP_Types.NFP_Integer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.StorageResource#getElementSize <em>Element Size</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getStorageResource()
 * @model
 * @generated
 */
public interface StorageResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Element Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Size</em>' containment reference.
	 * @see #setElementSize(NFP_Integer)
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getStorageResource_ElementSize()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Integer getElementSize();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.GRM.StorageResource#getElementSize <em>Element Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Size</em>' containment reference.
	 * @see #getElementSize()
	 * @generated
	 */
	void setElementSize(NFP_Integer value);

} // StorageResource
