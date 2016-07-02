/**
 */
package MARTE_Library.BasicNFP_Types.impl;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;
import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.SporadicPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sporadic Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.SporadicPatternImpl#getMinInterarrival <em>Min Interarrival</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.SporadicPatternImpl#getMaxInterarrival <em>Max Interarrival</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.SporadicPatternImpl#getJitter <em>Jitter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SporadicPatternImpl extends AperiodicPatternImpl implements SporadicPattern {
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
	 * The cached value of the '{@link #getJitter() <em>Jitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJitter()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration jitter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SporadicPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicNFP_TypesPackage.Literals.SPORADIC_PATTERN;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.SPORADIC_PATTERN__MIN_INTERARRIVAL, oldMinInterarrival, newMinInterarrival);
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
				msgs = ((InternalEObject)minInterarrival).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.SPORADIC_PATTERN__MIN_INTERARRIVAL, null, msgs);
			if (newMinInterarrival != null)
				msgs = ((InternalEObject)newMinInterarrival).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.SPORADIC_PATTERN__MIN_INTERARRIVAL, null, msgs);
			msgs = basicSetMinInterarrival(newMinInterarrival, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.SPORADIC_PATTERN__MIN_INTERARRIVAL, newMinInterarrival, newMinInterarrival));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.SPORADIC_PATTERN__MAX_INTERARRIVAL, oldMaxInterarrival, newMaxInterarrival);
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
				msgs = ((InternalEObject)maxInterarrival).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.SPORADIC_PATTERN__MAX_INTERARRIVAL, null, msgs);
			if (newMaxInterarrival != null)
				msgs = ((InternalEObject)newMaxInterarrival).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.SPORADIC_PATTERN__MAX_INTERARRIVAL, null, msgs);
			msgs = basicSetMaxInterarrival(newMaxInterarrival, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.SPORADIC_PATTERN__MAX_INTERARRIVAL, newMaxInterarrival, newMaxInterarrival));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.SPORADIC_PATTERN__JITTER, oldJitter, newJitter);
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
				msgs = ((InternalEObject)jitter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.SPORADIC_PATTERN__JITTER, null, msgs);
			if (newJitter != null)
				msgs = ((InternalEObject)newJitter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.SPORADIC_PATTERN__JITTER, null, msgs);
			msgs = basicSetJitter(newJitter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.SPORADIC_PATTERN__JITTER, newJitter, newJitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicNFP_TypesPackage.SPORADIC_PATTERN__MIN_INTERARRIVAL:
				return basicSetMinInterarrival(null, msgs);
			case BasicNFP_TypesPackage.SPORADIC_PATTERN__MAX_INTERARRIVAL:
				return basicSetMaxInterarrival(null, msgs);
			case BasicNFP_TypesPackage.SPORADIC_PATTERN__JITTER:
				return basicSetJitter(null, msgs);
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
			case BasicNFP_TypesPackage.SPORADIC_PATTERN__MIN_INTERARRIVAL:
				return getMinInterarrival();
			case BasicNFP_TypesPackage.SPORADIC_PATTERN__MAX_INTERARRIVAL:
				return getMaxInterarrival();
			case BasicNFP_TypesPackage.SPORADIC_PATTERN__JITTER:
				return getJitter();
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
			case BasicNFP_TypesPackage.SPORADIC_PATTERN__MIN_INTERARRIVAL:
				setMinInterarrival((NFP_Duration)newValue);
				return;
			case BasicNFP_TypesPackage.SPORADIC_PATTERN__MAX_INTERARRIVAL:
				setMaxInterarrival((NFP_Duration)newValue);
				return;
			case BasicNFP_TypesPackage.SPORADIC_PATTERN__JITTER:
				setJitter((NFP_Duration)newValue);
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
			case BasicNFP_TypesPackage.SPORADIC_PATTERN__MIN_INTERARRIVAL:
				setMinInterarrival((NFP_Duration)null);
				return;
			case BasicNFP_TypesPackage.SPORADIC_PATTERN__MAX_INTERARRIVAL:
				setMaxInterarrival((NFP_Duration)null);
				return;
			case BasicNFP_TypesPackage.SPORADIC_PATTERN__JITTER:
				setJitter((NFP_Duration)null);
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
			case BasicNFP_TypesPackage.SPORADIC_PATTERN__MIN_INTERARRIVAL:
				return minInterarrival != null;
			case BasicNFP_TypesPackage.SPORADIC_PATTERN__MAX_INTERARRIVAL:
				return maxInterarrival != null;
			case BasicNFP_TypesPackage.SPORADIC_PATTERN__JITTER:
				return jitter != null;
		}
		return super.eIsSet(featureID);
	}

} //SporadicPatternImpl
