/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl;

import MARTE.MARTE_DesignModel.SRM.SW_Concurrency.Alarm;
import MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alarm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.AlarmImpl#getIsWatchdog <em>Is Watchdog</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.AlarmImpl#getTimers <em>Timers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlarmImpl extends InterruptResourceImpl implements Alarm {
	/**
	 * The default value of the '{@link #getIsWatchdog() <em>Is Watchdog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsWatchdog()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_WATCHDOG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsWatchdog() <em>Is Watchdog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsWatchdog()
	 * @generated
	 * @ordered
	 */
	protected Boolean isWatchdog = IS_WATCHDOG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimers() <em>Timers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimers()
	 * @generated
	 * @ordered
	 */
	protected EList timers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlarmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SW_ConcurrencyPackage.Literals.ALARM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsWatchdog() {
		return isWatchdog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsWatchdog(Boolean newIsWatchdog) {
		Boolean oldIsWatchdog = isWatchdog;
		isWatchdog = newIsWatchdog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_ConcurrencyPackage.ALARM__IS_WATCHDOG, oldIsWatchdog, isWatchdog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTimers() {
		if (timers == null) {
			timers = new EObjectResolvingEList(TypedElement.class, this, SW_ConcurrencyPackage.ALARM__TIMERS);
		}
		return timers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SW_ConcurrencyPackage.ALARM__IS_WATCHDOG:
				return getIsWatchdog();
			case SW_ConcurrencyPackage.ALARM__TIMERS:
				return getTimers();
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
			case SW_ConcurrencyPackage.ALARM__IS_WATCHDOG:
				setIsWatchdog((Boolean)newValue);
				return;
			case SW_ConcurrencyPackage.ALARM__TIMERS:
				getTimers().clear();
				getTimers().addAll((Collection)newValue);
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
			case SW_ConcurrencyPackage.ALARM__IS_WATCHDOG:
				setIsWatchdog(IS_WATCHDOG_EDEFAULT);
				return;
			case SW_ConcurrencyPackage.ALARM__TIMERS:
				getTimers().clear();
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
			case SW_ConcurrencyPackage.ALARM__IS_WATCHDOG:
				return IS_WATCHDOG_EDEFAULT == null ? isWatchdog != null : !IS_WATCHDOG_EDEFAULT.equals(isWatchdog);
			case SW_ConcurrencyPackage.ALARM__TIMERS:
				return timers != null && !timers.isEmpty();
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
		result.append(" (isWatchdog: ");
		result.append(isWatchdog);
		result.append(')');
		return result.toString();
	}

} //AlarmImpl
