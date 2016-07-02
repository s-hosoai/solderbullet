/**
 */
package MARTE_Library.BasicNFP_Types;

import MARTE_Library.MeasurementUnits.PowerUnitKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFP Power</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.NFP_Power#getUnit <em>Unit</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.NFP_Power#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_Power()
 * @model
 * @generated
 */
public interface NFP_Power extends NFP_Real {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE_Library.MeasurementUnits.PowerUnitKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see MARTE_Library.MeasurementUnits.PowerUnitKind
	 * @see #setUnit(PowerUnitKind)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_Power_Unit()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	PowerUnitKind getUnit();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.NFP_Power#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see MARTE_Library.MeasurementUnits.PowerUnitKind
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(PowerUnitKind value);

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
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_Power_Precision()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Real" ordered="false"
	 * @generated
	 */
	Object getPrecision();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.NFP_Power#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(Object value);

} // NFP_Power
