/**
 */
package MARTE_Library.TimeLibrary;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.TimeLibrary.TimedValueType#getUnit <em>Unit</em>}</li>
 *   <li>{@link MARTE_Library.TimeLibrary.TimedValueType#getValue <em>Value</em>}</li>
 *   <li>{@link MARTE_Library.TimeLibrary.TimedValueType#getExpr <em>Expr</em>}</li>
 *   <li>{@link MARTE_Library.TimeLibrary.TimedValueType#getOnClock <em>On Clock</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.TimeLibrary.TimeLibraryPackage#getTimedValueType()
 * @model
 * @generated
 */
public interface TimedValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE_Library.TimeLibrary.TUK}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see MARTE_Library.TimeLibrary.TUK
	 * @see #setUnit(TUK)
	 * @see MARTE_Library.TimeLibrary.TimeLibraryPackage#getTimedValueType_Unit()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	TUK getUnit();

	/**
	 * Sets the value of the '{@link MARTE_Library.TimeLibrary.TimedValueType#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see MARTE_Library.TimeLibrary.TUK
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TUK value);

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
	 * @see MARTE_Library.TimeLibrary.TimeLibraryPackage#getTimedValueType_Value()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Real" ordered="false"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link MARTE_Library.TimeLibrary.TimedValueType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' attribute.
	 * @see #setExpr(Object)
	 * @see MARTE_Library.TimeLibrary.TimeLibraryPackage#getTimedValueType_Expr()
	 * @model unique="false" dataType="MARTE_Library.TimeLibrary.ClockedValueSpecification" ordered="false"
	 * @generated
	 */
	Object getExpr();

	/**
	 * Sets the value of the '{@link MARTE_Library.TimeLibrary.TimedValueType#getExpr <em>Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' attribute.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Object value);

	/**
	 * Returns the value of the '<em><b>On Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Clock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Clock</em>' attribute.
	 * @see #setOnClock(String)
	 * @see MARTE_Library.TimeLibrary.TimeLibraryPackage#getTimedValueType_OnClock()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.String" ordered="false"
	 * @generated
	 */
	Object getOnClock();

	/**
	 * Sets the value of the '{@link MARTE_Library.TimeLibrary.TimedValueType#getOnClock <em>On Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Clock</em>' attribute.
	 * @see #getOnClock()
	 * @generated
	 */
	void setOnClock(Object value);

} // TimedValueType
