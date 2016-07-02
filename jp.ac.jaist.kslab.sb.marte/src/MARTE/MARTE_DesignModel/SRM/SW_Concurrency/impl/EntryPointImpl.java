/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl;

import MARTE.MARTE_DesignModel.SRM.SW_Concurrency.EntryPoint;
import MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage;

import MARTE.MARTE_Foundations.Alloc.impl.AllocateImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.BehavioralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.EntryPointImpl#getIsReentrant <em>Is Reentrant</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.EntryPointImpl#getRoutine <em>Routine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryPointImpl extends AllocateImpl implements EntryPoint {
	/**
	 * The default value of the '{@link #getIsReentrant() <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReentrant()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_REENTRANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsReentrant() <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReentrant()
	 * @generated
	 * @ordered
	 */
	protected Boolean isReentrant = IS_REENTRANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoutine() <em>Routine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutine()
	 * @generated
	 * @ordered
	 */
	protected BehavioralFeature routine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SW_ConcurrencyPackage.Literals.ENTRY_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsReentrant() {
		return isReentrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReentrant(Boolean newIsReentrant) {
		Boolean oldIsReentrant = isReentrant;
		isReentrant = newIsReentrant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_ConcurrencyPackage.ENTRY_POINT__IS_REENTRANT, oldIsReentrant, isReentrant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeature getRoutine() {
		if (routine != null && routine.eIsProxy()) {
			InternalEObject oldRoutine = (InternalEObject)routine;
			routine = (BehavioralFeature)eResolveProxy(oldRoutine);
			if (routine != oldRoutine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SW_ConcurrencyPackage.ENTRY_POINT__ROUTINE, oldRoutine, routine));
			}
		}
		return routine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeature basicGetRoutine() {
		return routine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutine(BehavioralFeature newRoutine) {
		BehavioralFeature oldRoutine = routine;
		routine = newRoutine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_ConcurrencyPackage.ENTRY_POINT__ROUTINE, oldRoutine, routine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SW_ConcurrencyPackage.ENTRY_POINT__IS_REENTRANT:
				return getIsReentrant();
			case SW_ConcurrencyPackage.ENTRY_POINT__ROUTINE:
				if (resolve) return getRoutine();
				return basicGetRoutine();
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
			case SW_ConcurrencyPackage.ENTRY_POINT__IS_REENTRANT:
				setIsReentrant((Boolean)newValue);
				return;
			case SW_ConcurrencyPackage.ENTRY_POINT__ROUTINE:
				setRoutine((BehavioralFeature)newValue);
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
			case SW_ConcurrencyPackage.ENTRY_POINT__IS_REENTRANT:
				setIsReentrant(IS_REENTRANT_EDEFAULT);
				return;
			case SW_ConcurrencyPackage.ENTRY_POINT__ROUTINE:
				setRoutine((BehavioralFeature)null);
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
			case SW_ConcurrencyPackage.ENTRY_POINT__IS_REENTRANT:
				return IS_REENTRANT_EDEFAULT == null ? isReentrant != null : !IS_REENTRANT_EDEFAULT.equals(isReentrant);
			case SW_ConcurrencyPackage.ENTRY_POINT__ROUTINE:
				return routine != null;
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
		result.append(" (isReentrant: ");
		result.append(isReentrant);
		result.append(')');
		return result.toString();
	}

} //EntryPointImpl
