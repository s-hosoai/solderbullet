/**
 */
package MARTE.MARTE_Foundations.GRM.impl;

import MARTE.MARTE_Foundations.GRM.Acquire;
import MARTE.MARTE_Foundations.GRM.GRMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acquire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.AcquireImpl#getIsBlocking <em>Is Blocking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcquireImpl extends GrServiceImpl implements Acquire {
	/**
	 * The default value of the '{@link #getIsBlocking() <em>Is Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBlocking()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_BLOCKING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsBlocking() <em>Is Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBlocking()
	 * @generated
	 * @ordered
	 */
	protected Boolean isBlocking = IS_BLOCKING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcquireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GRMPackage.Literals.ACQUIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsBlocking() {
		return isBlocking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBlocking(Boolean newIsBlocking) {
		Boolean oldIsBlocking = isBlocking;
		isBlocking = newIsBlocking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRMPackage.ACQUIRE__IS_BLOCKING, oldIsBlocking, isBlocking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GRMPackage.ACQUIRE__IS_BLOCKING:
				return getIsBlocking();
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
			case GRMPackage.ACQUIRE__IS_BLOCKING:
				setIsBlocking((Boolean)newValue);
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
			case GRMPackage.ACQUIRE__IS_BLOCKING:
				setIsBlocking(IS_BLOCKING_EDEFAULT);
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
			case GRMPackage.ACQUIRE__IS_BLOCKING:
				return IS_BLOCKING_EDEFAULT == null ? isBlocking != null : !IS_BLOCKING_EDEFAULT.equals(isBlocking);
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
		result.append(" (isBlocking: ");
		result.append(isBlocking);
		result.append(')');
		return result.toString();
	}

} //AcquireImpl
