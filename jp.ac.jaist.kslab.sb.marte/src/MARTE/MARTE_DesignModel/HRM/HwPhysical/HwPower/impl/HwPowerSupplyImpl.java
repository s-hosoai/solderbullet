/**
 */
package MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.impl;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwComponentImpl;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerPackage;
import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerSupply;

import MARTE_Library.BasicNFP_Types.NFP_Energy;
import MARTE_Library.BasicNFP_Types.NFP_Power;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.impl.HwPowerSupplyImpl#getSuppliedPower <em>Supplied Power</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.impl.HwPowerSupplyImpl#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwPowerSupplyImpl extends HwComponentImpl implements HwPowerSupply {
	/**
	 * The cached value of the '{@link #getSuppliedPower() <em>Supplied Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppliedPower()
	 * @generated
	 * @ordered
	 */
	protected NFP_Power suppliedPower;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected NFP_Energy capacity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwPowerSupplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwPowerPackage.Literals.HW_POWER_SUPPLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Power getSuppliedPower() {
		return suppliedPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuppliedPower(NFP_Power newSuppliedPower, NotificationChain msgs) {
		NFP_Power oldSuppliedPower = suppliedPower;
		suppliedPower = newSuppliedPower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwPowerPackage.HW_POWER_SUPPLY__SUPPLIED_POWER, oldSuppliedPower, newSuppliedPower);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuppliedPower(NFP_Power newSuppliedPower) {
		if (newSuppliedPower != suppliedPower) {
			NotificationChain msgs = null;
			if (suppliedPower != null)
				msgs = ((InternalEObject)suppliedPower).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwPowerPackage.HW_POWER_SUPPLY__SUPPLIED_POWER, null, msgs);
			if (newSuppliedPower != null)
				msgs = ((InternalEObject)newSuppliedPower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwPowerPackage.HW_POWER_SUPPLY__SUPPLIED_POWER, null, msgs);
			msgs = basicSetSuppliedPower(newSuppliedPower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwPowerPackage.HW_POWER_SUPPLY__SUPPLIED_POWER, newSuppliedPower, newSuppliedPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Energy getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapacity(NFP_Energy newCapacity, NotificationChain msgs) {
		NFP_Energy oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwPowerPackage.HW_POWER_SUPPLY__CAPACITY, oldCapacity, newCapacity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(NFP_Energy newCapacity) {
		if (newCapacity != capacity) {
			NotificationChain msgs = null;
			if (capacity != null)
				msgs = ((InternalEObject)capacity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwPowerPackage.HW_POWER_SUPPLY__CAPACITY, null, msgs);
			if (newCapacity != null)
				msgs = ((InternalEObject)newCapacity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwPowerPackage.HW_POWER_SUPPLY__CAPACITY, null, msgs);
			msgs = basicSetCapacity(newCapacity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwPowerPackage.HW_POWER_SUPPLY__CAPACITY, newCapacity, newCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwPowerPackage.HW_POWER_SUPPLY__SUPPLIED_POWER:
				return basicSetSuppliedPower(null, msgs);
			case HwPowerPackage.HW_POWER_SUPPLY__CAPACITY:
				return basicSetCapacity(null, msgs);
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
			case HwPowerPackage.HW_POWER_SUPPLY__SUPPLIED_POWER:
				return getSuppliedPower();
			case HwPowerPackage.HW_POWER_SUPPLY__CAPACITY:
				return getCapacity();
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
			case HwPowerPackage.HW_POWER_SUPPLY__SUPPLIED_POWER:
				setSuppliedPower((NFP_Power)newValue);
				return;
			case HwPowerPackage.HW_POWER_SUPPLY__CAPACITY:
				setCapacity((NFP_Energy)newValue);
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
			case HwPowerPackage.HW_POWER_SUPPLY__SUPPLIED_POWER:
				setSuppliedPower((NFP_Power)null);
				return;
			case HwPowerPackage.HW_POWER_SUPPLY__CAPACITY:
				setCapacity((NFP_Energy)null);
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
			case HwPowerPackage.HW_POWER_SUPPLY__SUPPLIED_POWER:
				return suppliedPower != null;
			case HwPowerPackage.HW_POWER_SUPPLY__CAPACITY:
				return capacity != null;
		}
		return super.eIsSet(featureID);
	}

} //HwPowerSupplyImpl
