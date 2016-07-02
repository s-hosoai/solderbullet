/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.impl;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.HwPeripheralPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Operation;

import org.eclipse.uml2.uml.internal.impl.OperationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.impl.OperationImplImpl#getOverride <em>Override</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImplImpl extends OperationImpl implements MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.OperationImpl {
	/**
	 * The cached value of the '{@link #getOverride() <em>Override</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverride()
	 * @generated
	 * @ordered
	 */
	protected Operation override;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwPeripheralPackage.Literals.OPERATION_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOverride() {
		if (override != null && override.eIsProxy()) {
			InternalEObject oldOverride = (InternalEObject)override;
			override = (Operation)eResolveProxy(oldOverride);
			if (override != oldOverride) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwPeripheralPackage.OPERATION_IMPL__OVERRIDE, oldOverride, override));
			}
		}
		return override;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOverride() {
		return override;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverride(Operation newOverride) {
		Operation oldOverride = override;
		override = newOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwPeripheralPackage.OPERATION_IMPL__OVERRIDE, oldOverride, override));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HwPeripheralPackage.OPERATION_IMPL__OVERRIDE:
				if (resolve) return getOverride();
				return basicGetOverride();
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
			case HwPeripheralPackage.OPERATION_IMPL__OVERRIDE:
				setOverride((Operation)newValue);
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
			case HwPeripheralPackage.OPERATION_IMPL__OVERRIDE:
				setOverride((Operation)null);
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
			case HwPeripheralPackage.OPERATION_IMPL__OVERRIDE:
				return override != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationImplImpl
