/**
 */
package MARTE_Library.BasicNFP_Types;

import MARTE_Library.MeasurementUnits.DataTxRateUnitKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFP Data Tx Rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.NFP_DataTxRate#getUnit <em>Unit</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.NFP_DataTxRate#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_DataTxRate()
 * @model
 * @generated
 */
public interface NFP_DataTxRate extends NFP_Real {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE_Library.MeasurementUnits.DataTxRateUnitKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see MARTE_Library.MeasurementUnits.DataTxRateUnitKind
	 * @see #setUnit(DataTxRateUnitKind)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_DataTxRate_Unit()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	DataTxRateUnitKind getUnit();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.NFP_DataTxRate#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see MARTE_Library.MeasurementUnits.DataTxRateUnitKind
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(DataTxRateUnitKind value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(Object)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_DataTxRate_Precision()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Real" ordered="false"
	 * @generated
	 */
	Object getPrecision();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.NFP_DataTxRate#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(Object value);

} // NFP_DataTxRate
