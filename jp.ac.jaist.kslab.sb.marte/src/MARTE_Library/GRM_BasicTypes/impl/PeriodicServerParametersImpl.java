/**
 */
package MARTE_Library.GRM_BasicTypes.impl;

import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Integer;

import MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage;
import MARTE_Library.GRM_BasicTypes.PeriodicServerKind;
import MARTE_Library.GRM_BasicTypes.PeriodicServerParameters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Periodic Server Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.impl.PeriodicServerParametersImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.impl.PeriodicServerParametersImpl#getBackgroundPriority <em>Background Priority</em>}</li>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.impl.PeriodicServerParametersImpl#getInitialBudget <em>Initial Budget</em>}</li>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.impl.PeriodicServerParametersImpl#getReplenishPeriod <em>Replenish Period</em>}</li>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.impl.PeriodicServerParametersImpl#getMaxPendingReplenish <em>Max Pending Replenish</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeriodicServerParametersImpl extends FixedPriorityParametersImpl implements PeriodicServerParameters {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final PeriodicServerKind KIND_EDEFAULT = PeriodicServerKind.SPORADIC;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected PeriodicServerKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundPriority() <em>Background Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Object BACKGROUND_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundPriority() <em>Background Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundPriority()
	 * @generated
	 * @ordered
	 */
	protected Object backgroundPriority = BACKGROUND_PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitialBudget() <em>Initial Budget</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialBudget()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration initialBudget;

	/**
	 * The cached value of the '{@link #getReplenishPeriod() <em>Replenish Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplenishPeriod()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration replenishPeriod;

	/**
	 * The cached value of the '{@link #getMaxPendingReplenish() <em>Max Pending Replenish</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPendingReplenish()
	 * @generated
	 * @ordered
	 */
	protected NFP_Integer maxPendingReplenish;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicServerParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GRM_BasicTypesPackage.Literals.PERIODIC_SERVER_PARAMETERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicServerKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(PeriodicServerKind newKind) {
		PeriodicServerKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBackgroundPriority() {
		return backgroundPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundPriority(Object newBackgroundPriority) {
		Object oldBackgroundPriority = backgroundPriority;
		backgroundPriority = newBackgroundPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__BACKGROUND_PRIORITY, oldBackgroundPriority, backgroundPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getInitialBudget() {
		return initialBudget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialBudget(NFP_Duration newInitialBudget, NotificationChain msgs) {
		NFP_Duration oldInitialBudget = initialBudget;
		initialBudget = newInitialBudget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__INITIAL_BUDGET, oldInitialBudget, newInitialBudget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialBudget(NFP_Duration newInitialBudget) {
		if (newInitialBudget != initialBudget) {
			NotificationChain msgs = null;
			if (initialBudget != null)
				msgs = ((InternalEObject)initialBudget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__INITIAL_BUDGET, null, msgs);
			if (newInitialBudget != null)
				msgs = ((InternalEObject)newInitialBudget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__INITIAL_BUDGET, null, msgs);
			msgs = basicSetInitialBudget(newInitialBudget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__INITIAL_BUDGET, newInitialBudget, newInitialBudget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getReplenishPeriod() {
		return replenishPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplenishPeriod(NFP_Duration newReplenishPeriod, NotificationChain msgs) {
		NFP_Duration oldReplenishPeriod = replenishPeriod;
		replenishPeriod = newReplenishPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__REPLENISH_PERIOD, oldReplenishPeriod, newReplenishPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplenishPeriod(NFP_Duration newReplenishPeriod) {
		if (newReplenishPeriod != replenishPeriod) {
			NotificationChain msgs = null;
			if (replenishPeriod != null)
				msgs = ((InternalEObject)replenishPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__REPLENISH_PERIOD, null, msgs);
			if (newReplenishPeriod != null)
				msgs = ((InternalEObject)newReplenishPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__REPLENISH_PERIOD, null, msgs);
			msgs = basicSetReplenishPeriod(newReplenishPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__REPLENISH_PERIOD, newReplenishPeriod, newReplenishPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Integer getMaxPendingReplenish() {
		return maxPendingReplenish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxPendingReplenish(NFP_Integer newMaxPendingReplenish, NotificationChain msgs) {
		NFP_Integer oldMaxPendingReplenish = maxPendingReplenish;
		maxPendingReplenish = newMaxPendingReplenish;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__MAX_PENDING_REPLENISH, oldMaxPendingReplenish, newMaxPendingReplenish);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxPendingReplenish(NFP_Integer newMaxPendingReplenish) {
		if (newMaxPendingReplenish != maxPendingReplenish) {
			NotificationChain msgs = null;
			if (maxPendingReplenish != null)
				msgs = ((InternalEObject)maxPendingReplenish).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__MAX_PENDING_REPLENISH, null, msgs);
			if (newMaxPendingReplenish != null)
				msgs = ((InternalEObject)newMaxPendingReplenish).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__MAX_PENDING_REPLENISH, null, msgs);
			msgs = basicSetMaxPendingReplenish(newMaxPendingReplenish, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__MAX_PENDING_REPLENISH, newMaxPendingReplenish, newMaxPendingReplenish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__INITIAL_BUDGET:
				return basicSetInitialBudget(null, msgs);
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__REPLENISH_PERIOD:
				return basicSetReplenishPeriod(null, msgs);
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__MAX_PENDING_REPLENISH:
				return basicSetMaxPendingReplenish(null, msgs);
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
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__KIND:
				return getKind();
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__BACKGROUND_PRIORITY:
				return getBackgroundPriority();
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__INITIAL_BUDGET:
				return getInitialBudget();
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__REPLENISH_PERIOD:
				return getReplenishPeriod();
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__MAX_PENDING_REPLENISH:
				return getMaxPendingReplenish();
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
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__KIND:
				setKind((PeriodicServerKind)newValue);
				return;
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__BACKGROUND_PRIORITY:
				setBackgroundPriority((Object)newValue);
				return;
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__INITIAL_BUDGET:
				setInitialBudget((NFP_Duration)newValue);
				return;
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__REPLENISH_PERIOD:
				setReplenishPeriod((NFP_Duration)newValue);
				return;
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__MAX_PENDING_REPLENISH:
				setMaxPendingReplenish((NFP_Integer)newValue);
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
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__BACKGROUND_PRIORITY:
				setBackgroundPriority(BACKGROUND_PRIORITY_EDEFAULT);
				return;
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__INITIAL_BUDGET:
				setInitialBudget((NFP_Duration)null);
				return;
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__REPLENISH_PERIOD:
				setReplenishPeriod((NFP_Duration)null);
				return;
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__MAX_PENDING_REPLENISH:
				setMaxPendingReplenish((NFP_Integer)null);
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
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__KIND:
				return kind != KIND_EDEFAULT;
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__BACKGROUND_PRIORITY:
				return BACKGROUND_PRIORITY_EDEFAULT == null ? backgroundPriority != null : !BACKGROUND_PRIORITY_EDEFAULT.equals(backgroundPriority);
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__INITIAL_BUDGET:
				return initialBudget != null;
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__REPLENISH_PERIOD:
				return replenishPeriod != null;
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__MAX_PENDING_REPLENISH:
				return maxPendingReplenish != null;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", backgroundPriority: ");
		result.append(backgroundPriority);
		result.append(')');
		return result.toString();
	}

} //PeriodicServerParametersImpl
