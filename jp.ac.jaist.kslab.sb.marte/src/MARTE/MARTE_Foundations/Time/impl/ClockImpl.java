/**
 */
package MARTE.MARTE_Foundations.Time.impl;

import MARTE.MARTE_Foundations.NFPs.Unit;

import MARTE.MARTE_Foundations.Time.Clock;
import MARTE.MARTE_Foundations.Time.ClockType;
import MARTE.MARTE_Foundations.Time.TimePackage;

import MARTE_Library.TimeTypesLibrary.TimeStandardKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.Time.impl.ClockImpl#getStandard <em>Standard</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Time.impl.ClockImpl#getBase_InstanceSpecification <em>Base Instance Specification</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Time.impl.ClockImpl#getType <em>Type</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Time.impl.ClockImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Time.impl.ClockImpl#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClockImpl extends EObjectImpl implements Clock {
	/**
	 * The default value of the '{@link #getStandard() <em>Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandard()
	 * @generated
	 * @ordered
	 */
	protected static final TimeStandardKind STANDARD_EDEFAULT = TimeStandardKind.TAI;

	/**
	 * The cached value of the '{@link #getStandard() <em>Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandard()
	 * @generated
	 * @ordered
	 */
	protected TimeStandardKind standard = STANDARD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_InstanceSpecification() <em>Base Instance Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_InstanceSpecification()
	 * @generated
	 * @ordered
	 */
	protected InstanceSpecification base_InstanceSpecification;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ClockType type;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit unit;

	/**
	 * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Property()
	 * @generated
	 * @ordered
	 */
	protected Property base_Property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TimePackage.Literals.CLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStandardKind getStandard() {
		return standard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandard(TimeStandardKind newStandard) {
		TimeStandardKind oldStandard = standard;
		standard = newStandard == null ? STANDARD_EDEFAULT : newStandard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.CLOCK__STANDARD, oldStandard, standard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification getBase_InstanceSpecification() {
		if (base_InstanceSpecification != null && base_InstanceSpecification.eIsProxy()) {
			InternalEObject oldBase_InstanceSpecification = (InternalEObject)base_InstanceSpecification;
			base_InstanceSpecification = (InstanceSpecification)eResolveProxy(oldBase_InstanceSpecification);
			if (base_InstanceSpecification != oldBase_InstanceSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimePackage.CLOCK__BASE_INSTANCE_SPECIFICATION, oldBase_InstanceSpecification, base_InstanceSpecification));
			}
		}
		return base_InstanceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification basicGetBase_InstanceSpecification() {
		return base_InstanceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_InstanceSpecification(InstanceSpecification newBase_InstanceSpecification) {
		InstanceSpecification oldBase_InstanceSpecification = base_InstanceSpecification;
		base_InstanceSpecification = newBase_InstanceSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.CLOCK__BASE_INSTANCE_SPECIFICATION, oldBase_InstanceSpecification, base_InstanceSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ClockType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimePackage.CLOCK__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ClockType newType) {
		ClockType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.CLOCK__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getUnit() {
		if (unit != null && unit.eIsProxy()) {
			InternalEObject oldUnit = (InternalEObject)unit;
			unit = (Unit)eResolveProxy(oldUnit);
			if (unit != oldUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimePackage.CLOCK__UNIT, oldUnit, unit));
			}
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(Unit newUnit) {
		Unit oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.CLOCK__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getBase_Property() {
		if (base_Property != null && base_Property.eIsProxy()) {
			InternalEObject oldBase_Property = (InternalEObject)base_Property;
			base_Property = (Property)eResolveProxy(oldBase_Property);
			if (base_Property != oldBase_Property) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimePackage.CLOCK__BASE_PROPERTY, oldBase_Property, base_Property));
			}
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetBase_Property() {
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Property(Property newBase_Property) {
		Property oldBase_Property = base_Property;
		base_Property = newBase_Property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.CLOCK__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimePackage.CLOCK__STANDARD:
				return getStandard();
			case TimePackage.CLOCK__BASE_INSTANCE_SPECIFICATION:
				if (resolve) return getBase_InstanceSpecification();
				return basicGetBase_InstanceSpecification();
			case TimePackage.CLOCK__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case TimePackage.CLOCK__UNIT:
				if (resolve) return getUnit();
				return basicGetUnit();
			case TimePackage.CLOCK__BASE_PROPERTY:
				if (resolve) return getBase_Property();
				return basicGetBase_Property();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TimePackage.CLOCK__STANDARD:
				setStandard((TimeStandardKind)newValue);
				return;
			case TimePackage.CLOCK__BASE_INSTANCE_SPECIFICATION:
				setBase_InstanceSpecification((InstanceSpecification)newValue);
				return;
			case TimePackage.CLOCK__TYPE:
				setType((ClockType)newValue);
				return;
			case TimePackage.CLOCK__UNIT:
				setUnit((Unit)newValue);
				return;
			case TimePackage.CLOCK__BASE_PROPERTY:
				setBase_Property((Property)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case TimePackage.CLOCK__STANDARD:
				setStandard(STANDARD_EDEFAULT);
				return;
			case TimePackage.CLOCK__BASE_INSTANCE_SPECIFICATION:
				setBase_InstanceSpecification((InstanceSpecification)null);
				return;
			case TimePackage.CLOCK__TYPE:
				setType((ClockType)null);
				return;
			case TimePackage.CLOCK__UNIT:
				setUnit((Unit)null);
				return;
			case TimePackage.CLOCK__BASE_PROPERTY:
				setBase_Property((Property)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TimePackage.CLOCK__STANDARD:
				return standard != STANDARD_EDEFAULT;
			case TimePackage.CLOCK__BASE_INSTANCE_SPECIFICATION:
				return base_InstanceSpecification != null;
			case TimePackage.CLOCK__TYPE:
				return type != null;
			case TimePackage.CLOCK__UNIT:
				return unit != null;
			case TimePackage.CLOCK__BASE_PROPERTY:
				return base_Property != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (standard: ");
		result.append(standard);
		result.append(')');
		return result.toString();
	}

} //ClockImpl
