/**
 */
package MARTE_Library.BasicNFP_Types;

import MARTE_Library.MeasurementUnits.WeightUnitKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFP Weight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.NFP_Weight#getUnit <em>Unit</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.NFP_Weight#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_Weight()
 * @model
 * @generated
 */
public interface NFP_Weight extends NFP_Real {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE_Library.MeasurementUnits.WeightUnitKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see MARTE_Library.MeasurementUnits.WeightUnitKind
	 * @see #setUnit(WeightUnitKind)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_Weight_Unit()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	WeightUnitKind getUnit();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.NFP_Weight#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see MARTE_Library.MeasurementUnits.WeightUnitKind
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(WeightUnitKind value);

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
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_Weight_Precision()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Real" ordered="false"
	 * @generated
	 */
	Object getPrecision();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.NFP_Weight#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(Object value);

} // NFP_Weight
