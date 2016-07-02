/**
 */
package MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.impl;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwComponentImpl;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwCoolingSupply;
import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerPackage;

import MARTE_Library.BasicNFP_Types.NFP_Power;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Cooling Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.impl.HwCoolingSupplyImpl#getCoolingPower <em>Cooling Power</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwCoolingSupplyImpl extends HwComponentImpl implements HwCoolingSupply {
	/**
	 * The cached value of the '{@link #getCoolingPower() <em>Cooling Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolingPower()
	 * @generated
	 * @ordered
	 */
	protected NFP_Power coolingPower;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwCoolingSupplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwPowerPackage.Literals.HW_COOLING_SUPPLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Power getCoolingPower() {
		return coolingPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoolingPower(NFP_Power newCoolingPower, NotificationChain msgs) {
		NFP_Power oldCoolingPower = coolingPower;
		coolingPower = newCoolingPower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwPowerPackage.HW_COOLING_SUPPLY__COOLING_POWER, oldCoolingPower, newCoolingPower);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoolingPower(NFP_Power newCoolingPower) {
		if (newCoolingPower != coolingPower) {
			NotificationChain msgs = null;
			if (coolingPower != null)
				msgs = ((InternalEObject)coolingPower).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwPowerPackage.HW_COOLING_SUPPLY__COOLING_POWER, null, msgs);
			if (newCoolingPower != null)
				msgs = ((InternalEObject)newCoolingPower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwPowerPackage.HW_COOLING_SUPPLY__COOLING_POWER, null, msgs);
			msgs = basicSetCoolingPower(newCoolingPower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwPowerPackage.HW_COOLING_SUPPLY__COOLING_POWER, newCoolingPower, newCoolingPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwPowerPackage.HW_COOLING_SUPPLY__COOLING_POWER:
				return basicSetCoolingPower(null, msgs);
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
			case HwPowerPackage.HW_COOLING_SUPPLY__COOLING_POWER:
				return getCoolingPower();
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
			case HwPowerPackage.HW_COOLING_SUPPLY__COOLING_POWER:
				setCoolingPower((NFP_Power)newValue);
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
			case HwPowerPackage.HW_COOLING_SUPPLY__COOLING_POWER:
				setCoolingPower((NFP_Power)null);
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
			case HwPowerPackage.HW_COOLING_SUPPLY__COOLING_POWER:
				return coolingPower != null;
		}
		return super.eIsSet(featureID);
	}

} //HwCoolingSupplyImpl
