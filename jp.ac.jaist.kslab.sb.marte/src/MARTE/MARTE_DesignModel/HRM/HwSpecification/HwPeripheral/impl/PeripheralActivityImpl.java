/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.impl;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.HwPeripheralPackage;
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.PeripheralActivity;
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.RegisterAction;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.internal.impl.ActivityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Peripheral Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.impl.PeripheralActivityImpl#getRegisterActions <em>Register Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeripheralActivityImpl extends ActivityImpl implements PeripheralActivity {
	/**
	 * The cached value of the '{@link #getRegisterActions() <em>Register Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterActions()
	 * @generated
	 * @ordered
	 */
	protected EList registerActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeripheralActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwPeripheralPackage.Literals.PERIPHERAL_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRegisterActions() {
		if (registerActions == null) {
			registerActions = new EObjectContainmentEList(RegisterAction.class, this, HwPeripheralPackage.PERIPHERAL_ACTIVITY__REGISTER_ACTIONS);
		}
		return registerActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwPeripheralPackage.PERIPHERAL_ACTIVITY__REGISTER_ACTIONS:
				return ((InternalEList)getRegisterActions()).basicRemove(otherEnd, msgs);
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
			case HwPeripheralPackage.PERIPHERAL_ACTIVITY__REGISTER_ACTIONS:
				return getRegisterActions();
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
			case HwPeripheralPackage.PERIPHERAL_ACTIVITY__REGISTER_ACTIONS:
				getRegisterActions().clear();
				getRegisterActions().addAll((Collection)newValue);
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
			case HwPeripheralPackage.PERIPHERAL_ACTIVITY__REGISTER_ACTIONS:
				getRegisterActions().clear();
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
			case HwPeripheralPackage.PERIPHERAL_ACTIVITY__REGISTER_ACTIONS:
				return registerActions != null && !registerActions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PeripheralActivityImpl
