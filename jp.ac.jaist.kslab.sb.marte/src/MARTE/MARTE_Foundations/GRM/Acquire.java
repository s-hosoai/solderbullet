/**
 */
package MARTE.MARTE_Foundations.GRM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acquire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.Acquire#getIsBlocking <em>Is Blocking</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getAcquire()
 * @model
 * @generated
 */
public interface Acquire extends GrService {
	/**
	 * Returns the value of the '<em><b>Is Blocking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Blocking</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Blocking</em>' attribute.
	 * @see #setIsBlocking(Boolean)
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getAcquire_IsBlocking()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getIsBlocking();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.GRM.Acquire#getIsBlocking <em>Is Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Blocking</em>' attribute.
	 * @see #getIsBlocking()
	 * @generated
	 */
	void setIsBlocking(Boolean value);

} // Acquire
