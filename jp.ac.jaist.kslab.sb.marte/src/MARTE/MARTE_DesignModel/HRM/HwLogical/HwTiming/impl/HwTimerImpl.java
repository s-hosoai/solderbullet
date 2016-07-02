/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.impl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwClock;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwTimer;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwTimingPackage;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;
import MARTE_Library.BasicNFP_Types.NFP_Natural;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Timer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.impl.HwTimerImpl#getNbCounters <em>Nb Counters</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.impl.HwTimerImpl#getCounterWidth <em>Counter Width</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.impl.HwTimerImpl#getInputClock <em>Input Clock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwTimerImpl extends HwTimingResourceImpl implements HwTimer {
	/**
	 * The cached value of the '{@link #getNbCounters() <em>Nb Counters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbCounters()
	 * @generated
	 * @ordered
	 */
	protected NFP_Natural nbCounters;

	/**
	 * The cached value of the '{@link #getCounterWidth() <em>Counter Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterWidth()
	 * @generated
	 * @ordered
	 */
	protected NFP_DataSize counterWidth;

	/**
	 * The cached value of the '{@link #getInputClock() <em>Input Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputClock()
	 * @generated
	 * @ordered
	 */
	protected HwClock inputClock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwTimerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwTimingPackage.Literals.HW_TIMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Natural getNbCounters() {
		return nbCounters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNbCounters(NFP_Natural newNbCounters, NotificationChain msgs) {
		NFP_Natural oldNbCounters = nbCounters;
		nbCounters = newNbCounters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwTimingPackage.HW_TIMER__NB_COUNTERS, oldNbCounters, newNbCounters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbCounters(NFP_Natural newNbCounters) {
		if (newNbCounters != nbCounters) {
			NotificationChain msgs = null;
			if (nbCounters != null)
				msgs = ((InternalEObject)nbCounters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwTimingPackage.HW_TIMER__NB_COUNTERS, null, msgs);
			if (newNbCounters != null)
				msgs = ((InternalEObject)newNbCounters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwTimingPackage.HW_TIMER__NB_COUNTERS, null, msgs);
			msgs = basicSetNbCounters(newNbCounters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwTimingPackage.HW_TIMER__NB_COUNTERS, newNbCounters, newNbCounters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataSize getCounterWidth() {
		return counterWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCounterWidth(NFP_DataSize newCounterWidth, NotificationChain msgs) {
		NFP_DataSize oldCounterWidth = counterWidth;
		counterWidth = newCounterWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwTimingPackage.HW_TIMER__COUNTER_WIDTH, oldCounterWidth, newCounterWidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounterWidth(NFP_DataSize newCounterWidth) {
		if (newCounterWidth != counterWidth) {
			NotificationChain msgs = null;
			if (counterWidth != null)
				msgs = ((InternalEObject)counterWidth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwTimingPackage.HW_TIMER__COUNTER_WIDTH, null, msgs);
			if (newCounterWidth != null)
				msgs = ((InternalEObject)newCounterWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwTimingPackage.HW_TIMER__COUNTER_WIDTH, null, msgs);
			msgs = basicSetCounterWidth(newCounterWidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwTimingPackage.HW_TIMER__COUNTER_WIDTH, newCounterWidth, newCounterWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwClock getInputClock() {
		if (inputClock != null && inputClock.eIsProxy()) {
			InternalEObject oldInputClock = (InternalEObject)inputClock;
			inputClock = (HwClock)eResolveProxy(oldInputClock);
			if (inputClock != oldInputClock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwTimingPackage.HW_TIMER__INPUT_CLOCK, oldInputClock, inputClock));
			}
		}
		return inputClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwClock basicGetInputClock() {
		return inputClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputClock(HwClock newInputClock) {
		HwClock oldInputClock = inputClock;
		inputClock = newInputClock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwTimingPackage.HW_TIMER__INPUT_CLOCK, oldInputClock, inputClock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwTimingPackage.HW_TIMER__NB_COUNTERS:
				return basicSetNbCounters(null, msgs);
			case HwTimingPackage.HW_TIMER__COUNTER_WIDTH:
				return basicSetCounterWidth(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HwTimingPackage.HW_TIMER__NB_COUNTERS:
				return getNbCounters();
			case HwTimingPackage.HW_TIMER__COUNTER_WIDTH:
				return getCounterWidth();
			case HwTimingPackage.HW_TIMER__INPUT_CLOCK:
				if (resolve) return getInputClock();
				return basicGetInputClock();
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
			case HwTimingPackage.HW_TIMER__NB_COUNTERS:
				setNbCounters((NFP_Natural)newValue);
				return;
			case HwTimingPackage.HW_TIMER__COUNTER_WIDTH:
				setCounterWidth((NFP_DataSize)newValue);
				return;
			case HwTimingPackage.HW_TIMER__INPUT_CLOCK:
				setInputClock((HwClock)newValue);
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
			case HwTimingPackage.HW_TIMER__NB_COUNTERS:
				setNbCounters((NFP_Natural)null);
				return;
			case HwTimingPackage.HW_TIMER__COUNTER_WIDTH:
				setCounterWidth((NFP_DataSize)null);
				return;
			case HwTimingPackage.HW_TIMER__INPUT_CLOCK:
				setInputClock((HwClock)null);
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
			case HwTimingPackage.HW_TIMER__NB_COUNTERS:
				return nbCounters != null;
			case HwTimingPackage.HW_TIMER__COUNTER_WIDTH:
				return counterWidth != null;
			case HwTimingPackage.HW_TIMER__INPUT_CLOCK:
				return inputClock != null;
		}
		return super.eIsSet(featureID);
	}

} //HwTimerImpl
