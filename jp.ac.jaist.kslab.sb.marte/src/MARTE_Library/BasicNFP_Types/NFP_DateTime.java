/**
 */
package MARTE_Library.BasicNFP_Types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFP Date Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.NFP_DateTime#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_DateTime()
 * @model
 * @generated
 */
public interface NFP_DateTime extends NFP_CommonType {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_DateTime_Value()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.DateTime" ordered="false"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.NFP_DateTime#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

} // NFP_DateTime
