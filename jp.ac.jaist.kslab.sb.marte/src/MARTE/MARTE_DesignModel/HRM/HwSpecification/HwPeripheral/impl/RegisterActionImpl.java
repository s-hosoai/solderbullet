/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.impl;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.HwPeripheralPackage;
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.RegisterAction;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegister;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.internal.impl.ActionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Register Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.impl.RegisterActionImpl#getRegister <em>Register</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RegisterActionImpl extends ActionImpl implements RegisterAction {
	/**
	 * The cached value of the '{@link #getRegister() <em>Register</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegister()
	 * @generated
	 * @ordered
	 */
	protected HwRegister register;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisterActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwPeripheralPackage.Literals.REGISTER_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwRegister getRegister() {
		if (register != null && register.eIsProxy()) {
			InternalEObject oldRegister = (InternalEObject)register;
			register = (HwRegister)eResolveProxy(oldRegister);
			if (register != oldRegister) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwPeripheralPackage.REGISTER_ACTION__REGISTER, oldRegister, register));
			}
		}
		return register;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwRegister basicGetRegister() {
		return register;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegister(HwRegister newRegister) {
		HwRegister oldRegister = register;
		register = newRegister;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwPeripheralPackage.REGISTER_ACTION__REGISTER, oldRegister, register));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HwPeripheralPackage.REGISTER_ACTION__REGISTER:
				if (resolve) return getRegister();
				return basicGetRegister();
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
			case HwPeripheralPackage.REGISTER_ACTION__REGISTER:
				setRegister((HwRegister)newValue);
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
			case HwPeripheralPackage.REGISTER_ACTION__REGISTER:
				setRegister((HwRegister)null);
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
			case HwPeripheralPackage.REGISTER_ACTION__REGISTER:
				return register != null;
		}
		return super.eIsSet(featureID);
	}

} //RegisterActionImpl
