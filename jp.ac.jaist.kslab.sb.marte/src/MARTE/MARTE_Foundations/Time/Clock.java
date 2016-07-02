/**
 */
package MARTE.MARTE_Foundations.Time;

import MARTE.MARTE_Foundations.NFPs.Unit;

import MARTE_Library.TimeTypesLibrary.TimeStandardKind;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.Time.Clock#getStandard <em>Standard</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Time.Clock#getBase_InstanceSpecification <em>Base Instance Specification</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Time.Clock#getType <em>Type</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Time.Clock#getUnit <em>Unit</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Time.Clock#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.Time.TimePackage#getClock()
 * @model
 * @generated
 */
public interface Clock extends EObject {
	/**
	 * Returns the value of the '<em><b>Standard</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE_Library.TimeTypesLibrary.TimeStandardKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard</em>' attribute.
	 * @see MARTE_Library.TimeTypesLibrary.TimeStandardKind
	 * @see #setStandard(TimeStandardKind)
	 * @see MARTE.MARTE_Foundations.Time.TimePackage#getClock_Standard()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	TimeStandardKind getStandard();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Time.Clock#getStandard <em>Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard</em>' attribute.
	 * @see MARTE_Library.TimeTypesLibrary.TimeStandardKind
	 * @see #getStandard()
	 * @generated
	 */
	void setStandard(TimeStandardKind value);

	/**
	 * Returns the value of the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Instance Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Instance Specification</em>' reference.
	 * @see #setBase_InstanceSpecification(InstanceSpecification)
	 * @see MARTE.MARTE_Foundations.Time.TimePackage#getClock_Base_InstanceSpecification()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InstanceSpecification getBase_InstanceSpecification();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Time.Clock#getBase_InstanceSpecification <em>Base Instance Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Instance Specification</em>' reference.
	 * @see #getBase_InstanceSpecification()
	 * @generated
	 */
	void setBase_InstanceSpecification(InstanceSpecification value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ClockType)
	 * @see MARTE.MARTE_Foundations.Time.TimePackage#getClock_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ClockType getType();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Time.Clock#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ClockType value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(Unit)
	 * @see MARTE.MARTE_Foundations.Time.TimePackage#getClock_Unit()
	 * @model ordered="false"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Time.Clock#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see MARTE.MARTE_Foundations.Time.TimePackage#getClock_Base_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Time.Clock#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

} // Clock
