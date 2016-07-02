/**
 */
package MARTE_Library.BasicNFP_Types.impl;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;
import MARTE_Library.BasicNFP_Types.BurstPattern;
import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Integer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Burst Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.BurstPatternImpl#getMinInterarrival <em>Min Interarrival</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.BurstPatternImpl#getMaxInterarrival <em>Max Interarrival</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.BurstPatternImpl#getMinEventInterval <em>Min Event Interval</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.BurstPatternImpl#getMaxEventInterval <em>Max Event Interval</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.BurstPatternImpl#getBurstSize <em>Burst Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BurstPatternImpl extends AperiodicPatternImpl implements BurstPattern {
	/**
	 * The cached value of the '{@link #getMinInterarrival() <em>Min Interarrival</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInterarrival()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration minInterarrival;

	/**
	 * The cached value of the '{@link #getMaxInterarrival() <em>Max Interarrival</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInterarrival()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration maxInterarrival;

	/**
	 * The cached value of the '{@link #getMinEventInterval() <em>Min Event Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinEventInterval()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration minEventInterval;

	/**
	 * The cached value of the '{@link #getMaxEventInterval() <em>Max Event Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEventInterval()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration maxEventInterval;

	/**
	 * The cached value of the '{@link #getBurstSize() <em>Burst Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBurstSize()
	 * @generated
	 * @ordered
	 */
	protected NFP_Integer burstSize;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BurstPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicNFP_TypesPackage.Literals.BURST_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getMinInterarrival() {
		return minInterarrival;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinInterarrival(NFP_Duration newMinInterarrival, NotificationChain msgs) {
		NFP_Duration oldMinInterarrival = minInterarrival;
		minInterarrival = newMinInterarrival;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.BURST_PATTERN__MIN_INTERARRIVAL, oldMinInterarrival, newMinInterarrival);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInterarrival(NFP_Duration newMinInterarrival) {
		if (newMinInterarrival != minInterarrival) {
			NotificationChain msgs = null;
			if (minInterarrival != null)
				msgs = ((InternalEObject)minInterarrival).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.BURST_PATTERN__MIN_INTERARRIVAL, null, msgs);
			if (newMinInterarrival != null)
				msgs = ((InternalEObject)newMinInterarrival).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.BURST_PATTERN__MIN_INTERARRIVAL, null, msgs);
			msgs = basicSetMinInterarrival(newMinInterarrival, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.BURST_PATTERN__MIN_INTERARRIVAL, newMinInterarrival, newMinInterarrival));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getMaxInterarrival() {
		return maxInterarrival;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxInterarrival(NFP_Duration newMaxInterarrival, NotificationChain msgs) {
		NFP_Duration oldMaxInterarrival = maxInterarrival;
		maxInterarrival = newMaxInterarrival;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.BURST_PATTERN__MAX_INTERARRIVAL, oldMaxInterarrival, newMaxInterarrival);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInterarrival(NFP_Duration newMaxInterarrival) {
		if (newMaxInterarrival != maxInterarrival) {
			NotificationChain msgs = null;
			if (maxInterarrival != null)
				msgs = ((InternalEObject)maxInterarrival).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.BURST_PATTERN__MAX_INTERARRIVAL, null, msgs);
			if (newMaxInterarrival != null)
				msgs = ((InternalEObject)newMaxInterarrival).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.BURST_PATTERN__MAX_INTERARRIVAL, null, msgs);
			msgs = basicSetMaxInterarrival(newMaxInterarrival, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.BURST_PATTERN__MAX_INTERARRIVAL, newMaxInterarrival, newMaxInterarrival));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getMinEventInterval() {
		return minEventInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinEventInterval(NFP_Duration newMinEventInterval, NotificationChain msgs) {
		NFP_Duration oldMinEventInterval = minEventInterval;
		minEventInterval = newMinEventInterval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.BURST_PATTERN__MIN_EVENT_INTERVAL, oldMinEventInterval, newMinEventInterval);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinEventInterval(NFP_Duration newMinEventInterval) {
		if (newMinEventInterval != minEventInterval) {
			NotificationChain msgs = null;
			if (minEventInterval != null)
				msgs = ((InternalEObject)minEventInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.BURST_PATTERN__MIN_EVENT_INTERVAL, null, msgs);
			if (newMinEventInterval != null)
				msgs = ((InternalEObject)newMinEventInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.BURST_PATTERN__MIN_EVENT_INTERVAL, null, msgs);
			msgs = basicSetMinEventInterval(newMinEventInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.BURST_PATTERN__MIN_EVENT_INTERVAL, newMinEventInterval, newMinEventInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getMaxEventInterval() {
		return maxEventInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxEventInterval(NFP_Duration newMaxEventInterval, NotificationChain msgs) {
		NFP_Duration oldMaxEventInterval = maxEventInterval;
		maxEventInterval = newMaxEventInterval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.BURST_PATTERN__MAX_EVENT_INTERVAL, oldMaxEventInterval, newMaxEventInterval);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxEventInterval(NFP_Duration newMaxEventInterval) {
		if (newMaxEventInterval != maxEventInterval) {
			NotificationChain msgs = null;
			if (maxEventInterval != null)
				msgs = ((InternalEObject)maxEventInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.BURST_PATTERN__MAX_EVENT_INTERVAL, null, msgs);
			if (newMaxEventInterval != null)
				msgs = ((InternalEObject)newMaxEventInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.BURST_PATTERN__MAX_EVENT_INTERVAL, null, msgs);
			msgs = basicSetMaxEventInterval(newMaxEventInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.BURST_PATTERN__MAX_EVENT_INTERVAL, newMaxEventInterval, newMaxEventInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Integer getBurstSize() {
		return burstSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBurstSize(NFP_Integer newBurstSize, NotificationChain msgs) {
		NFP_Integer oldBurstSize = burstSize;
		burstSize = newBurstSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.BURST_PATTERN__BURST_SIZE, oldBurstSize, newBurstSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBurstSize(NFP_Integer newBurstSize) {
		if (newBurstSize != burstSize) {
			NotificationChain msgs = null;
			if (burstSize != null)
				msgs = ((InternalEObject)burstSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.BURST_PATTERN__BURST_SIZE, null, msgs);
			if (newBurstSize != null)
				msgs = ((InternalEObject)newBurstSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.BURST_PATTERN__BURST_SIZE, null, msgs);
			msgs = basicSetBurstSize(newBurstSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.BURST_PATTERN__BURST_SIZE, newBurstSize, newBurstSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicNFP_TypesPackage.BURST_PATTERN__MIN_INTERARRIVAL:
				return basicSetMinInterarrival(null, msgs);
			case BasicNFP_TypesPackage.BURST_PATTERN__MAX_INTERARRIVAL:
				return basicSetMaxInterarrival(null, msgs);
			case BasicNFP_TypesPackage.BURST_PATTERN__MIN_EVENT_INTERVAL:
				return basicSetMinEventInterval(null, msgs);
			case BasicNFP_TypesPackage.BURST_PATTERN__MAX_EVENT_INTERVAL:
				return basicSetMaxEventInterval(null, msgs);
			case BasicNFP_TypesPackage.BURST_PATTERN__BURST_SIZE:
				return basicSetBurstSize(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicNFP_TypesPackage.BURST_PATTERN__MIN_INTERARRIVAL:
				return getMinInterarrival();
			case BasicNFP_TypesPackage.BURST_PATTERN__MAX_INTERARRIVAL:
				return getMaxInterarrival();
			case BasicNFP_TypesPackage.BURST_PATTERN__MIN_EVENT_INTERVAL:
				return getMinEventInterval();
			case BasicNFP_TypesPackage.BURST_PATTERN__MAX_EVENT_INTERVAL:
				return getMaxEventInterval();
			case BasicNFP_TypesPackage.BURST_PATTERN__BURST_SIZE:
				return getBurstSize();
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
			case BasicNFP_TypesPackage.BURST_PATTERN__MIN_INTERARRIVAL:
				setMinInterarrival((NFP_Duration)newValue);
				return;
			case BasicNFP_TypesPackage.BURST_PATTERN__MAX_INTERARRIVAL:
				setMaxInterarrival((NFP_Duration)newValue);
				return;
			case BasicNFP_TypesPackage.BURST_PATTERN__MIN_EVENT_INTERVAL:
				setMinEventInterval((NFP_Duration)newValue);
				return;
			case BasicNFP_TypesPackage.BURST_PATTERN__MAX_EVENT_INTERVAL:
				setMaxEventInterval((NFP_Duration)newValue);
				return;
			case BasicNFP_TypesPackage.BURST_PATTERN__BURST_SIZE:
				setBurstSize((NFP_Integer)newValue);
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
			case BasicNFP_TypesPackage.BURST_PATTERN__MIN_INTERARRIVAL:
				setMinInterarrival((NFP_Duration)null);
				return;
			case BasicNFP_TypesPackage.BURST_PATTERN__MAX_INTERARRIVAL:
				setMaxInterarrival((NFP_Duration)null);
				return;
			case BasicNFP_TypesPackage.BURST_PATTERN__MIN_EVENT_INTERVAL:
				setMinEventInterval((NFP_Duration)null);
				return;
			case BasicNFP_TypesPackage.BURST_PATTERN__MAX_EVENT_INTERVAL:
				setMaxEventInterval((NFP_Duration)null);
				return;
			case BasicNFP_TypesPackage.BURST_PATTERN__BURST_SIZE:
				setBurstSize((NFP_Integer)null);
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
			case BasicNFP_TypesPackage.BURST_PATTERN__MIN_INTERARRIVAL:
				return minInterarrival != null;
			case BasicNFP_TypesPackage.BURST_PATTERN__MAX_INTERARRIVAL:
				return maxInterarrival != null;
			case BasicNFP_TypesPackage.BURST_PATTERN__MIN_EVENT_INTERVAL:
				return minEventInterval != null;
			case BasicNFP_TypesPackage.BURST_PATTERN__MAX_EVENT_INTERVAL:
				return maxEventInterval != null;
			case BasicNFP_TypesPackage.BURST_PATTERN__BURST_SIZE:
				return burstSize != null;
		}
		return super.eIsSet(featureID);
	}

} //BurstPatternImpl
