/**
 */
package MARTE_Library.BasicNFP_Types.impl;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;
import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Integer;
import MARTE_Library.BasicNFP_Types.PeriodicPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Periodic Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.PeriodicPatternImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.PeriodicPatternImpl#getJitter <em>Jitter</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.PeriodicPatternImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.PeriodicPatternImpl#getOccurrences <em>Occurrences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeriodicPatternImpl extends EObjectImpl implements PeriodicPattern {
	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration period;

	/**
	 * The cached value of the '{@link #getJitter() <em>Jitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJitter()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration jitter;

	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration phase;

	/**
	 * The cached value of the '{@link #getOccurrences() <em>Occurrences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrences()
	 * @generated
	 * @ordered
	 */
	protected NFP_Integer occurrences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicNFP_TypesPackage.Literals.PERIODIC_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(NFP_Duration newPeriod, NotificationChain msgs) {
		NFP_Duration oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.PERIODIC_PATTERN__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(NFP_Duration newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.PERIODIC_PATTERN__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.PERIODIC_PATTERN__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.PERIODIC_PATTERN__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getJitter() {
		return jitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJitter(NFP_Duration newJitter, NotificationChain msgs) {
		NFP_Duration oldJitter = jitter;
		jitter = newJitter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.PERIODIC_PATTERN__JITTER, oldJitter, newJitter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJitter(NFP_Duration newJitter) {
		if (newJitter != jitter) {
			NotificationChain msgs = null;
			if (jitter != null)
				msgs = ((InternalEObject)jitter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.PERIODIC_PATTERN__JITTER, null, msgs);
			if (newJitter != null)
				msgs = ((InternalEObject)newJitter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.PERIODIC_PATTERN__JITTER, null, msgs);
			msgs = basicSetJitter(newJitter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.PERIODIC_PATTERN__JITTER, newJitter, newJitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhase(NFP_Duration newPhase, NotificationChain msgs) {
		NFP_Duration oldPhase = phase;
		phase = newPhase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.PERIODIC_PATTERN__PHASE, oldPhase, newPhase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(NFP_Duration newPhase) {
		if (newPhase != phase) {
			NotificationChain msgs = null;
			if (phase != null)
				msgs = ((InternalEObject)phase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.PERIODIC_PATTERN__PHASE, null, msgs);
			if (newPhase != null)
				msgs = ((InternalEObject)newPhase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.PERIODIC_PATTERN__PHASE, null, msgs);
			msgs = basicSetPhase(newPhase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.PERIODIC_PATTERN__PHASE, newPhase, newPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Integer getOccurrences() {
		return occurrences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrences(NFP_Integer newOccurrences, NotificationChain msgs) {
		NFP_Integer oldOccurrences = occurrences;
		occurrences = newOccurrences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.PERIODIC_PATTERN__OCCURRENCES, oldOccurrences, newOccurrences);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrences(NFP_Integer newOccurrences) {
		if (newOccurrences != occurrences) {
			NotificationChain msgs = null;
			if (occurrences != null)
				msgs = ((InternalEObject)occurrences).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.PERIODIC_PATTERN__OCCURRENCES, null, msgs);
			if (newOccurrences != null)
				msgs = ((InternalEObject)newOccurrences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.PERIODIC_PATTERN__OCCURRENCES, null, msgs);
			msgs = basicSetOccurrences(newOccurrences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.PERIODIC_PATTERN__OCCURRENCES, newOccurrences, newOccurrences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicNFP_TypesPackage.PERIODIC_PATTERN__PERIOD:
				return basicSetPeriod(null, msgs);
			case BasicNFP_TypesPackage.PERIODIC_PATTERN__JITTER:
				return basicSetJitter(null, msgs);
			case BasicNFP_TypesPackage.PERIODIC_PATTERN__PHASE:
				return basicSetPhase(null, msgs);
			case BasicNFP_TypesPackage.PERIODIC_PATTERN__OCCURRENCES:
				return basicSetOccurrences(null, msgs);
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
			case BasicNFP_TypesPackage.PERIODIC_PATTERN__PERIOD:
				return getPeriod();
			case BasicNFP_TypesPackage.PERIODIC_PATTERN__JITTER:
				return getJitter();
			case BasicNFP_TypesPackage.PERIODIC_PATTERN__PHASE:
				return getPhase();
			case BasicNFP_TypesPackage.PERIODIC_PATTERN__OCCURRENCES:
				return getOccurrences();
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
			case BasicNFP_TypesPackage.PERIODIC_PATTERN__PERIOD:
				setPeriod((NFP_Duration)newValue);
				return;
			case BasicNFP_TypesPackage.PERIODIC_PATTERN__JITTER:
				setJitter((NFP_Duration)newValue);
				return;
			case BasicNFP_TypesPackage.PERIODIC_PATTERN__PHASE:
				setPhase((NFP_Duration)newValue);
				return;
			case BasicNFP_TypesPackage.PERIODIC_PATTERN__OCCURRENCES:
				setOccurrences((NFP_Integer)newValue);
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
			case BasicNFP_TypesPackage.PERIODIC_PATTERN__PERIOD:
				setPeriod((NFP_Duration)null);
				return;
			case BasicNFP_TypesPackage.PERIODIC_PATTERN__JITTER:
				setJitter((NFP_Duration)null);
				return;
			case BasicNFP_TypesPackage.PERIODIC_PATTERN__PHASE:
				setPhase((NFP_Duration)null);
				return;
			case BasicNFP_TypesPackage.PERIODIC_PATTERN__OCCURRENCES:
				setOccurrences((NFP_Integer)null);
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
			case BasicNFP_TypesPackage.PERIODIC_PATTERN__PERIOD:
				return period != null;
			case BasicNFP_TypesPackage.PERIODIC_PATTERN__JITTER:
				return jitter != null;
			case BasicNFP_TypesPackage.PERIODIC_PATTERN__PHASE:
				return phase != null;
			case BasicNFP_TypesPackage.PERIODIC_PATTERN__OCCURRENCES:
				return occurrences != null;
		}
		return super.eIsSet(featureID);
	}

} //PeriodicPatternImpl
