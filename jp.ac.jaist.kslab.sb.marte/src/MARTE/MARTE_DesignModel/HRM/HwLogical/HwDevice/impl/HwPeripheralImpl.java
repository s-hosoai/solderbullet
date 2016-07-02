/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwPort;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral;

import MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocol;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.OperationImpl;
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.PeripheralActivity;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegister;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Peripheral</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwPeripheralImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwPeripheralImpl#getOperationimpls <em>Operationimpls</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwPeripheralImpl#getRefsfr <em>Refsfr</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwPeripheralImpl#getRefports <em>Refports</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwPeripheralImpl#getPeripheralActivities <em>Peripheral Activities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwPeripheralImpl extends HwDeviceImpl implements HwPeripheral {
	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected EList implements_;

	/**
	 * The cached value of the '{@link #getOperationimpls() <em>Operationimpls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationimpls()
	 * @generated
	 * @ordered
	 */
	protected EList operationimpls;

	/**
	 * The cached value of the '{@link #getRefsfr() <em>Refsfr</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefsfr()
	 * @generated
	 * @ordered
	 */
	protected EList refsfr;

	/**
	 * The cached value of the '{@link #getRefports() <em>Refports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefports()
	 * @generated
	 * @ordered
	 */
	protected EList refports;

	/**
	 * The cached value of the '{@link #getPeripheralActivities() <em>Peripheral Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeripheralActivities()
	 * @generated
	 * @ordered
	 */
	protected EList peripheralActivities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwPeripheralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwDevicePackage.Literals.HW_PERIPHERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getImplements() {
		if (implements_ == null) {
			implements_ = new EObjectResolvingEList(HwProtocol.class, this, HwDevicePackage.HW_PERIPHERAL__IMPLEMENTS);
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOperationimpls() {
		if (operationimpls == null) {
			operationimpls = new EObjectContainmentEList(OperationImpl.class, this, HwDevicePackage.HW_PERIPHERAL__OPERATIONIMPLS);
		}
		return operationimpls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRefsfr() {
		if (refsfr == null) {
			refsfr = new EObjectResolvingEList(HwRegister.class, this, HwDevicePackage.HW_PERIPHERAL__REFSFR);
		}
		return refsfr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRefports() {
		if (refports == null) {
			refports = new EObjectResolvingEList(HwPort.class, this, HwDevicePackage.HW_PERIPHERAL__REFPORTS);
		}
		return refports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPeripheralActivities() {
		if (peripheralActivities == null) {
			peripheralActivities = new EObjectContainmentEList(PeripheralActivity.class, this, HwDevicePackage.HW_PERIPHERAL__PERIPHERAL_ACTIVITIES);
		}
		return peripheralActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwDevicePackage.HW_PERIPHERAL__OPERATIONIMPLS:
				return ((InternalEList)getOperationimpls()).basicRemove(otherEnd, msgs);
			case HwDevicePackage.HW_PERIPHERAL__PERIPHERAL_ACTIVITIES:
				return ((InternalEList)getPeripheralActivities()).basicRemove(otherEnd, msgs);
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
			case HwDevicePackage.HW_PERIPHERAL__IMPLEMENTS:
				return getImplements();
			case HwDevicePackage.HW_PERIPHERAL__OPERATIONIMPLS:
				return getOperationimpls();
			case HwDevicePackage.HW_PERIPHERAL__REFSFR:
				return getRefsfr();
			case HwDevicePackage.HW_PERIPHERAL__REFPORTS:
				return getRefports();
			case HwDevicePackage.HW_PERIPHERAL__PERIPHERAL_ACTIVITIES:
				return getPeripheralActivities();
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
			case HwDevicePackage.HW_PERIPHERAL__IMPLEMENTS:
				getImplements().clear();
				getImplements().addAll((Collection)newValue);
				return;
			case HwDevicePackage.HW_PERIPHERAL__OPERATIONIMPLS:
				getOperationimpls().clear();
				getOperationimpls().addAll((Collection)newValue);
				return;
			case HwDevicePackage.HW_PERIPHERAL__REFSFR:
				getRefsfr().clear();
				getRefsfr().addAll((Collection)newValue);
				return;
			case HwDevicePackage.HW_PERIPHERAL__REFPORTS:
				getRefports().clear();
				getRefports().addAll((Collection)newValue);
				return;
			case HwDevicePackage.HW_PERIPHERAL__PERIPHERAL_ACTIVITIES:
				getPeripheralActivities().clear();
				getPeripheralActivities().addAll((Collection)newValue);
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
			case HwDevicePackage.HW_PERIPHERAL__IMPLEMENTS:
				getImplements().clear();
				return;
			case HwDevicePackage.HW_PERIPHERAL__OPERATIONIMPLS:
				getOperationimpls().clear();
				return;
			case HwDevicePackage.HW_PERIPHERAL__REFSFR:
				getRefsfr().clear();
				return;
			case HwDevicePackage.HW_PERIPHERAL__REFPORTS:
				getRefports().clear();
				return;
			case HwDevicePackage.HW_PERIPHERAL__PERIPHERAL_ACTIVITIES:
				getPeripheralActivities().clear();
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
			case HwDevicePackage.HW_PERIPHERAL__IMPLEMENTS:
				return implements_ != null && !implements_.isEmpty();
			case HwDevicePackage.HW_PERIPHERAL__OPERATIONIMPLS:
				return operationimpls != null && !operationimpls.isEmpty();
			case HwDevicePackage.HW_PERIPHERAL__REFSFR:
				return refsfr != null && !refsfr.isEmpty();
			case HwDevicePackage.HW_PERIPHERAL__REFPORTS:
				return refports != null && !refports.isEmpty();
			case HwDevicePackage.HW_PERIPHERAL__PERIPHERAL_ACTIVITIES:
				return peripheralActivities != null && !peripheralActivities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HwPeripheralImpl
