/**
 */
package MARTE_Library.GRM_BasicTypes.impl;

import MARTE_Library.BasicNFP_Types.NFP_Duration;

import MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage;
import MARTE_Library.GRM_BasicTypes.PoolingParameters;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pooling Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.impl.PoolingParametersImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.impl.PoolingParametersImpl#getOverhead <em>Overhead</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PoolingParametersImpl extends FixedPriorityParametersImpl implements PoolingParameters {
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
	 * The cached value of the '{@link #getOverhead() <em>Overhead</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverhead()
	 * @generated
	 * @ordered
	 */
	protected EList<NFP_Duration> overhead;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoolingParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GRM_BasicTypesPackage.Literals.POOLING_PARAMETERS;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRM_BasicTypesPackage.POOLING_PARAMETERS__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GRM_BasicTypesPackage.POOLING_PARAMETERS__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GRM_BasicTypesPackage.POOLING_PARAMETERS__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRM_BasicTypesPackage.POOLING_PARAMETERS__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NFP_Duration> getOverhead() {
		if (overhead == null) {
			overhead = new EObjectContainmentEList<NFP_Duration>(NFP_Duration.class, this, GRM_BasicTypesPackage.POOLING_PARAMETERS__OVERHEAD);
		}
		return overhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRM_BasicTypesPackage.POOLING_PARAMETERS__PERIOD:
				return basicSetPeriod(null, msgs);
			case GRM_BasicTypesPackage.POOLING_PARAMETERS__OVERHEAD:
				return ((InternalEList<?>)getOverhead()).basicRemove(otherEnd, msgs);
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
			case GRM_BasicTypesPackage.POOLING_PARAMETERS__PERIOD:
				return getPeriod();
			case GRM_BasicTypesPackage.POOLING_PARAMETERS__OVERHEAD:
				return getOverhead();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GRM_BasicTypesPackage.POOLING_PARAMETERS__PERIOD:
				setPeriod((NFP_Duration)newValue);
				return;
			case GRM_BasicTypesPackage.POOLING_PARAMETERS__OVERHEAD:
				getOverhead().clear();
				getOverhead().addAll((Collection<? extends NFP_Duration>)newValue);
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
			case GRM_BasicTypesPackage.POOLING_PARAMETERS__PERIOD:
				setPeriod((NFP_Duration)null);
				return;
			case GRM_BasicTypesPackage.POOLING_PARAMETERS__OVERHEAD:
				getOverhead().clear();
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
			case GRM_BasicTypesPackage.POOLING_PARAMETERS__PERIOD:
				return period != null;
			case GRM_BasicTypesPackage.POOLING_PARAMETERS__OVERHEAD:
				return overhead != null && !overhead.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PoolingParametersImpl
