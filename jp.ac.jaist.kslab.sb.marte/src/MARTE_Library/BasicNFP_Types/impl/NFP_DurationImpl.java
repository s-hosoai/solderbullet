/**
 */
package MARTE_Library.BasicNFP_Types.impl;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;
import MARTE_Library.BasicNFP_Types.NFP_Duration;

import MARTE_Library.MeasurementUnits.TimeUnitKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NFP Duration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.NFP_DurationImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.NFP_DurationImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.NFP_DurationImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.NFP_DurationImpl#getWorst <em>Worst</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.NFP_DurationImpl#getBest <em>Best</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NFP_DurationImpl extends NFP_RealImpl implements NFP_Duration {
	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnitKind UNIT_EDEFAULT = TimeUnitKind.S;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnitKind unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getClock() <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected static final Object CLOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClock() <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected Object clock = CLOCK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected Object precision;

	/**
	 * The cached value of the '{@link #getWorst() <em>Worst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorst()
	 * @generated
	 * @ordered
	 */
	protected Object worst;

	/**
	 * The cached value of the '{@link #getBest() <em>Best</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBest()
	 * @generated
	 * @ordered
	 */
	protected Object best;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NFP_DurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicNFP_TypesPackage.Literals.NFP_DURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnitKind getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(TimeUnitKind newUnit) {
		TimeUnitKind oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.NFP_DURATION__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getClock() {
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClock(Object newClock) {
		Object oldClock = clock;
		clock = newClock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.NFP_DURATION__CLOCK, oldClock, clock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(Object newPrecision) {
		Object oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.NFP_DURATION__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getWorst() {
		return worst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorst(Object newWorst) {
		Object oldWorst = worst;
		worst = newWorst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.NFP_DURATION__WORST, oldWorst, worst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBest() {
		return best;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBest(Object newBest) {
		Object oldBest = best;
		best = newBest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.NFP_DURATION__BEST, oldBest, best));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicNFP_TypesPackage.NFP_DURATION__UNIT:
				return getUnit();
			case BasicNFP_TypesPackage.NFP_DURATION__CLOCK:
				return getClock();
			case BasicNFP_TypesPackage.NFP_DURATION__PRECISION:
				return getPrecision();
			case BasicNFP_TypesPackage.NFP_DURATION__WORST:
				return getWorst();
			case BasicNFP_TypesPackage.NFP_DURATION__BEST:
				return getBest();
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
			case BasicNFP_TypesPackage.NFP_DURATION__UNIT:
				setUnit((TimeUnitKind)newValue);
				return;
			case BasicNFP_TypesPackage.NFP_DURATION__CLOCK:
				setClock((Object)newValue);
				return;
			case BasicNFP_TypesPackage.NFP_DURATION__PRECISION:
				setPrecision(newValue);
				return;
			case BasicNFP_TypesPackage.NFP_DURATION__WORST:
				setWorst(newValue);
				return;
			case BasicNFP_TypesPackage.NFP_DURATION__BEST:
				setBest(newValue);
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
			case BasicNFP_TypesPackage.NFP_DURATION__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case BasicNFP_TypesPackage.NFP_DURATION__CLOCK:
				setClock(CLOCK_EDEFAULT);
				return;
			case BasicNFP_TypesPackage.NFP_DURATION__PRECISION:
				setPrecision((Object)null);
				return;
			case BasicNFP_TypesPackage.NFP_DURATION__WORST:
				setWorst((Object)null);
				return;
			case BasicNFP_TypesPackage.NFP_DURATION__BEST:
				setBest((Object)null);
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
			case BasicNFP_TypesPackage.NFP_DURATION__UNIT:
				return unit != UNIT_EDEFAULT;
			case BasicNFP_TypesPackage.NFP_DURATION__CLOCK:
				return CLOCK_EDEFAULT == null ? clock != null : !CLOCK_EDEFAULT.equals(clock);
			case BasicNFP_TypesPackage.NFP_DURATION__PRECISION:
				return precision != null;
			case BasicNFP_TypesPackage.NFP_DURATION__WORST:
				return worst != null;
			case BasicNFP_TypesPackage.NFP_DURATION__BEST:
				return best != null;
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
		result.append(", clock: ");
		result.append(clock);
		result.append(", precision: ");
		result.append(precision);
		result.append(", worst: ");
		result.append(worst);
		result.append(", best: ");
		result.append(best);
		result.append(')');
		return result.toString();
	}

} //NFP_DurationImpl
