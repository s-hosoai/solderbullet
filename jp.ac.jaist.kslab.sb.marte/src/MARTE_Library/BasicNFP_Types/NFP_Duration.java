/**
 */
package MARTE_Library.BasicNFP_Types;

import MARTE_Library.MeasurementUnits.TimeUnitKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFP Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.NFP_Duration#getUnit <em>Unit</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.NFP_Duration#getClock <em>Clock</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.NFP_Duration#getPrecision <em>Precision</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.NFP_Duration#getWorst <em>Worst</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.NFP_Duration#getBest <em>Best</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_Duration()
 * @model
 * @generated
 */
public interface NFP_Duration extends NFP_Real {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE_Library.MeasurementUnits.TimeUnitKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see MARTE_Library.MeasurementUnits.TimeUnitKind
	 * @see #setUnit(TimeUnitKind)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_Duration_Unit()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	TimeUnitKind getUnit();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.NFP_Duration#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see MARTE_Library.MeasurementUnits.TimeUnitKind
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TimeUnitKind value);

	/**
	 * Returns the value of the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' attribute.
	 * @see #setClock(String)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_Duration_Clock()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.String" ordered="false"
	 * @generated
	 */
	Object getClock();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.NFP_Duration#getClock <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' attribute.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(Object value);

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
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_Duration_Precision()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Real" ordered="false"
	 * @generated
	 */
	Object getPrecision();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.NFP_Duration#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(Object value);

	/**
	 * Returns the value of the '<em><b>Worst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worst</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worst</em>' attribute.
	 * @see #setWorst(Object)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_Duration_Worst()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Real" ordered="false"
	 * @generated
	 */
	Object getWorst();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.NFP_Duration#getWorst <em>Worst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worst</em>' attribute.
	 * @see #getWorst()
	 * @generated
	 */
	void setWorst(Object value);

	/**
	 * Returns the value of the '<em><b>Best</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Best</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Best</em>' attribute.
	 * @see #setBest(Object)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_Duration_Best()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Real" ordered="false"
	 * @generated
	 */
	Object getBest();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.NFP_Duration#getBest <em>Best</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Best</em>' attribute.
	 * @see #getBest()
	 * @generated
	 */
	void setBest(Object value);

} // NFP_Duration
