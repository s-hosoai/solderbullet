/**
 */
package MARTE_Library.BasicNFP_Types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFP Price</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.NFP_Price#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_Price()
 * @model
 * @generated
 */
public interface NFP_Price extends NFP_Real {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The default value is <code>"$US"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_Price_Unit()
	 * @model default="$US" unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.String" ordered="false"
	 * @generated
	 */
	Object getUnit();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.NFP_Price#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Object value);

} // NFP_Price
