/**
 */
package MARTE_Library.TimeLibrary.impl;

import MARTE_Library.TimeLibrary.TUK;
import MARTE_Library.TimeLibrary.TimeLibraryPackage;
import MARTE_Library.TimeLibrary.TimedValueType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.TimeLibrary.impl.TimedValueTypeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link MARTE_Library.TimeLibrary.impl.TimedValueTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link MARTE_Library.TimeLibrary.impl.TimedValueTypeImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link MARTE_Library.TimeLibrary.impl.TimedValueTypeImpl#getOnClock <em>On Clock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimedValueTypeImpl extends EObjectImpl implements TimedValueType {
	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TUK UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected TUK unit = UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Object value;

	/**
	 * The cached value of the '{@link #getExpr() <em>Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpr()
	 * @generated
	 * @ordered
	 */
	protected Object expr;

	/**
	 * The default value of the '{@link #getOnClock() <em>On Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnClock()
	 * @generated
	 * @ordered
	 */
	protected static final Object ON_CLOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnClock() <em>On Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnClock()
	 * @generated
	 * @ordered
	 */
	protected Object onClock = ON_CLOCK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimeLibraryPackage.Literals.TIMED_VALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TUK getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(TUK newUnit) {
		TUK oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeLibraryPackage.TIMED_VALUE_TYPE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Object newValue) {
		Object oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeLibraryPackage.TIMED_VALUE_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getExpr() {
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpr(Object newExpr) {
		Object oldExpr = expr;
		expr = newExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeLibraryPackage.TIMED_VALUE_TYPE__EXPR, oldExpr, expr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getOnClock() {
		return onClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnClock(Object newOnClock) {
		Object oldOnClock = onClock;
		onClock = newOnClock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimeLibraryPackage.TIMED_VALUE_TYPE__ON_CLOCK, oldOnClock, onClock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimeLibraryPackage.TIMED_VALUE_TYPE__UNIT:
				return getUnit();
			case TimeLibraryPackage.TIMED_VALUE_TYPE__VALUE:
				return getValue();
			case TimeLibraryPackage.TIMED_VALUE_TYPE__EXPR:
				return getExpr();
			case TimeLibraryPackage.TIMED_VALUE_TYPE__ON_CLOCK:
				return getOnClock();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TimeLibraryPackage.TIMED_VALUE_TYPE__UNIT:
				setUnit((TUK)newValue);
				return;
			case TimeLibraryPackage.TIMED_VALUE_TYPE__VALUE:
				setValue(newValue);
				return;
			case TimeLibraryPackage.TIMED_VALUE_TYPE__EXPR:
				setExpr(newValue);
				return;
			case TimeLibraryPackage.TIMED_VALUE_TYPE__ON_CLOCK:
				setOnClock((Object)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TimeLibraryPackage.TIMED_VALUE_TYPE__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case TimeLibraryPackage.TIMED_VALUE_TYPE__VALUE:
				setValue((Object)null);
				return;
			case TimeLibraryPackage.TIMED_VALUE_TYPE__EXPR:
				setExpr((Object)null);
				return;
			case TimeLibraryPackage.TIMED_VALUE_TYPE__ON_CLOCK:
				setOnClock(ON_CLOCK_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TimeLibraryPackage.TIMED_VALUE_TYPE__UNIT:
				return unit != UNIT_EDEFAULT;
			case TimeLibraryPackage.TIMED_VALUE_TYPE__VALUE:
				return value != null;
			case TimeLibraryPackage.TIMED_VALUE_TYPE__EXPR:
				return expr != null;
			case TimeLibraryPackage.TIMED_VALUE_TYPE__ON_CLOCK:
				return ON_CLOCK_EDEFAULT == null ? onClock != null : !ON_CLOCK_EDEFAULT.equals(onClock);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (unit: ");
		result.append(unit);
		result.append(", value: ");
		result.append(value);
		result.append(", expr: ");
		result.append(expr);
		result.append(", onClock: ");
		result.append(onClock);
		result.append(')');
		return result.toString();
	}

} //TimedValueTypeImpl
