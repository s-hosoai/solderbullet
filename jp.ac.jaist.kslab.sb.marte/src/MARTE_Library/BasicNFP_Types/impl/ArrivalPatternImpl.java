/**
 */
package MARTE_Library.BasicNFP_Types.impl;

import MARTE_Library.BasicNFP_Types.AperiodicPattern;
import MARTE_Library.BasicNFP_Types.ArrivalPattern;
import MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;
import MARTE_Library.BasicNFP_Types.BurstPattern;
import MARTE_Library.BasicNFP_Types.ClosedPattern;
import MARTE_Library.BasicNFP_Types.IrregularPattern;
import MARTE_Library.BasicNFP_Types.OpenPattern;
import MARTE_Library.BasicNFP_Types.PeriodicPattern;
import MARTE_Library.BasicNFP_Types.SporadicPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arrival Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.ArrivalPatternImpl#getPeriodic <em>Periodic</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.ArrivalPatternImpl#getAperiodic <em>Aperiodic</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.ArrivalPatternImpl#getBurst <em>Burst</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.ArrivalPatternImpl#getIrregular <em>Irregular</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.ArrivalPatternImpl#getClosed <em>Closed</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.ArrivalPatternImpl#getSporadic <em>Sporadic</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.ArrivalPatternImpl#getOpen <em>Open</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrivalPatternImpl extends EObjectImpl implements ArrivalPattern {
	/**
	 * The cached value of the '{@link #getPeriodic() <em>Periodic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodic()
	 * @generated
	 * @ordered
	 */
	protected PeriodicPattern periodic;

	/**
	 * The cached value of the '{@link #getAperiodic() <em>Aperiodic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAperiodic()
	 * @generated
	 * @ordered
	 */
	protected AperiodicPattern aperiodic;

	/**
	 * The cached value of the '{@link #getBurst() <em>Burst</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBurst()
	 * @generated
	 * @ordered
	 */
	protected BurstPattern burst;

	/**
	 * The cached value of the '{@link #getIrregular() <em>Irregular</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIrregular()
	 * @generated
	 * @ordered
	 */
	protected IrregularPattern irregular;

	/**
	 * The cached value of the '{@link #getClosed() <em>Closed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosed()
	 * @generated
	 * @ordered
	 */
	protected ClosedPattern closed;

	/**
	 * The cached value of the '{@link #getSporadic() <em>Sporadic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSporadic()
	 * @generated
	 * @ordered
	 */
	protected SporadicPattern sporadic;

	/**
	 * The cached value of the '{@link #getOpen() <em>Open</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpen()
	 * @generated
	 * @ordered
	 */
	protected OpenPattern open;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrivalPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicNFP_TypesPackage.Literals.ARRIVAL_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicPattern getPeriodic() {
		return periodic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodic(PeriodicPattern newPeriodic, NotificationChain msgs) {
		PeriodicPattern oldPeriodic = periodic;
		periodic = newPeriodic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.ARRIVAL_PATTERN__PERIODIC, oldPeriodic, newPeriodic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodic(PeriodicPattern newPeriodic) {
		if (newPeriodic != periodic) {
			NotificationChain msgs = null;
			if (periodic != null)
				msgs = ((InternalEObject)periodic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.ARRIVAL_PATTERN__PERIODIC, null, msgs);
			if (newPeriodic != null)
				msgs = ((InternalEObject)newPeriodic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.ARRIVAL_PATTERN__PERIODIC, null, msgs);
			msgs = basicSetPeriodic(newPeriodic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.ARRIVAL_PATTERN__PERIODIC, newPeriodic, newPeriodic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AperiodicPattern getAperiodic() {
		return aperiodic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAperiodic(AperiodicPattern newAperiodic, NotificationChain msgs) {
		AperiodicPattern oldAperiodic = aperiodic;
		aperiodic = newAperiodic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.ARRIVAL_PATTERN__APERIODIC, oldAperiodic, newAperiodic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAperiodic(AperiodicPattern newAperiodic) {
		if (newAperiodic != aperiodic) {
			NotificationChain msgs = null;
			if (aperiodic != null)
				msgs = ((InternalEObject)aperiodic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.ARRIVAL_PATTERN__APERIODIC, null, msgs);
			if (newAperiodic != null)
				msgs = ((InternalEObject)newAperiodic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.ARRIVAL_PATTERN__APERIODIC, null, msgs);
			msgs = basicSetAperiodic(newAperiodic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.ARRIVAL_PATTERN__APERIODIC, newAperiodic, newAperiodic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BurstPattern getBurst() {
		return burst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBurst(BurstPattern newBurst, NotificationChain msgs) {
		BurstPattern oldBurst = burst;
		burst = newBurst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.ARRIVAL_PATTERN__BURST, oldBurst, newBurst);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBurst(BurstPattern newBurst) {
		if (newBurst != burst) {
			NotificationChain msgs = null;
			if (burst != null)
				msgs = ((InternalEObject)burst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.ARRIVAL_PATTERN__BURST, null, msgs);
			if (newBurst != null)
				msgs = ((InternalEObject)newBurst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.ARRIVAL_PATTERN__BURST, null, msgs);
			msgs = basicSetBurst(newBurst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.ARRIVAL_PATTERN__BURST, newBurst, newBurst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IrregularPattern getIrregular() {
		return irregular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIrregular(IrregularPattern newIrregular, NotificationChain msgs) {
		IrregularPattern oldIrregular = irregular;
		irregular = newIrregular;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.ARRIVAL_PATTERN__IRREGULAR, oldIrregular, newIrregular);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIrregular(IrregularPattern newIrregular) {
		if (newIrregular != irregular) {
			NotificationChain msgs = null;
			if (irregular != null)
				msgs = ((InternalEObject)irregular).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.ARRIVAL_PATTERN__IRREGULAR, null, msgs);
			if (newIrregular != null)
				msgs = ((InternalEObject)newIrregular).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.ARRIVAL_PATTERN__IRREGULAR, null, msgs);
			msgs = basicSetIrregular(newIrregular, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.ARRIVAL_PATTERN__IRREGULAR, newIrregular, newIrregular));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosedPattern getClosed() {
		return closed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClosed(ClosedPattern newClosed, NotificationChain msgs) {
		ClosedPattern oldClosed = closed;
		closed = newClosed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.ARRIVAL_PATTERN__CLOSED, oldClosed, newClosed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosed(ClosedPattern newClosed) {
		if (newClosed != closed) {
			NotificationChain msgs = null;
			if (closed != null)
				msgs = ((InternalEObject)closed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.ARRIVAL_PATTERN__CLOSED, null, msgs);
			if (newClosed != null)
				msgs = ((InternalEObject)newClosed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.ARRIVAL_PATTERN__CLOSED, null, msgs);
			msgs = basicSetClosed(newClosed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.ARRIVAL_PATTERN__CLOSED, newClosed, newClosed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SporadicPattern getSporadic() {
		return sporadic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSporadic(SporadicPattern newSporadic, NotificationChain msgs) {
		SporadicPattern oldSporadic = sporadic;
		sporadic = newSporadic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.ARRIVAL_PATTERN__SPORADIC, oldSporadic, newSporadic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSporadic(SporadicPattern newSporadic) {
		if (newSporadic != sporadic) {
			NotificationChain msgs = null;
			if (sporadic != null)
				msgs = ((InternalEObject)sporadic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.ARRIVAL_PATTERN__SPORADIC, null, msgs);
			if (newSporadic != null)
				msgs = ((InternalEObject)newSporadic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.ARRIVAL_PATTERN__SPORADIC, null, msgs);
			msgs = basicSetSporadic(newSporadic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.ARRIVAL_PATTERN__SPORADIC, newSporadic, newSporadic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenPattern getOpen() {
		return open;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpen(OpenPattern newOpen, NotificationChain msgs) {
		OpenPattern oldOpen = open;
		open = newOpen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.ARRIVAL_PATTERN__OPEN, oldOpen, newOpen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpen(OpenPattern newOpen) {
		if (newOpen != open) {
			NotificationChain msgs = null;
			if (open != null)
				msgs = ((InternalEObject)open).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.ARRIVAL_PATTERN__OPEN, null, msgs);
			if (newOpen != null)
				msgs = ((InternalEObject)newOpen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.ARRIVAL_PATTERN__OPEN, null, msgs);
			msgs = basicSetOpen(newOpen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.ARRIVAL_PATTERN__OPEN, newOpen, newOpen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__PERIODIC:
				return basicSetPeriodic(null, msgs);
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__APERIODIC:
				return basicSetAperiodic(null, msgs);
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__BURST:
				return basicSetBurst(null, msgs);
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__IRREGULAR:
				return basicSetIrregular(null, msgs);
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__CLOSED:
				return basicSetClosed(null, msgs);
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__SPORADIC:
				return basicSetSporadic(null, msgs);
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__OPEN:
				return basicSetOpen(null, msgs);
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
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__PERIODIC:
				return getPeriodic();
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__APERIODIC:
				return getAperiodic();
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__BURST:
				return getBurst();
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__IRREGULAR:
				return getIrregular();
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__CLOSED:
				return getClosed();
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__SPORADIC:
				return getSporadic();
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__OPEN:
				return getOpen();
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
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__PERIODIC:
				setPeriodic((PeriodicPattern)newValue);
				return;
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__APERIODIC:
				setAperiodic((AperiodicPattern)newValue);
				return;
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__BURST:
				setBurst((BurstPattern)newValue);
				return;
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__IRREGULAR:
				setIrregular((IrregularPattern)newValue);
				return;
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__CLOSED:
				setClosed((ClosedPattern)newValue);
				return;
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__SPORADIC:
				setSporadic((SporadicPattern)newValue);
				return;
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__OPEN:
				setOpen((OpenPattern)newValue);
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
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__PERIODIC:
				setPeriodic((PeriodicPattern)null);
				return;
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__APERIODIC:
				setAperiodic((AperiodicPattern)null);
				return;
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__BURST:
				setBurst((BurstPattern)null);
				return;
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__IRREGULAR:
				setIrregular((IrregularPattern)null);
				return;
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__CLOSED:
				setClosed((ClosedPattern)null);
				return;
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__SPORADIC:
				setSporadic((SporadicPattern)null);
				return;
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__OPEN:
				setOpen((OpenPattern)null);
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
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__PERIODIC:
				return periodic != null;
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__APERIODIC:
				return aperiodic != null;
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__BURST:
				return burst != null;
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__IRREGULAR:
				return irregular != null;
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__CLOSED:
				return closed != null;
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__SPORADIC:
				return sporadic != null;
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__OPEN:
				return open != null;
		}
		return super.eIsSet(featureID);
	}

} //ArrivalPatternImpl
