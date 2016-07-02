/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwEndPointImpl;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwIOPackage;
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePackage;
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin;
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwWire;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackagePinImpl#getRefpin <em>Refpin</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackagePinImpl#getWire <em>Wire</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackagePinImpl#getPinNo <em>Pin No</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackagePinImpl#getAltNames <em>Alt Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwPackagePinImpl extends HwEndPointImpl implements HwPackagePin {
	/**
	 * The cached value of the '{@link #getRefpin() <em>Refpin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefpin()
	 * @generated
	 * @ordered
	 */
	protected EList refpin;

	/**
	 * The cached value of the '{@link #getWire() <em>Wire</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWire()
	 * @generated
	 * @ordered
	 */
	protected EList wire;

	/**
	 * The default value of the '{@link #getPinNo() <em>Pin No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinNo()
	 * @generated
	 * @ordered
	 */
	protected static final String PIN_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPinNo() <em>Pin No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinNo()
	 * @generated
	 * @ordered
	 */
	protected String pinNo = PIN_NO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAltNames() <em>Alt Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltNames()
	 * @generated
	 * @ordered
	 */
	protected EList altNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwPackagePinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwPackagePackage.Literals.HW_PACKAGE_PIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRefpin() {
		if (refpin == null) {
			refpin = new EObjectWithInverseResolvingEList(HwPin.class, this, HwPackagePackage.HW_PACKAGE_PIN__REFPIN, HwIOPackage.HW_PIN__PKG_PIN);
		}
		return refpin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWire() {
		if (wire == null) {
			wire = new EObjectResolvingEList(HwWire.class, this, HwPackagePackage.HW_PACKAGE_PIN__WIRE);
		}
		return wire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPinNo() {
		return pinNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinNo(String newPinNo) {
		String oldPinNo = pinNo;
		pinNo = newPinNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwPackagePackage.HW_PACKAGE_PIN__PIN_NO, oldPinNo, pinNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAltNames() {
		if (altNames == null) {
			altNames = new EDataTypeUniqueEList(String.class, this, HwPackagePackage.HW_PACKAGE_PIN__ALT_NAMES);
		}
		return altNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwPackagePackage.HW_PACKAGE_PIN__REFPIN:
				return ((InternalEList)getRefpin()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwPackagePackage.HW_PACKAGE_PIN__REFPIN:
				return ((InternalEList)getRefpin()).basicRemove(otherEnd, msgs);
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
			case HwPackagePackage.HW_PACKAGE_PIN__REFPIN:
				return getRefpin();
			case HwPackagePackage.HW_PACKAGE_PIN__WIRE:
				return getWire();
			case HwPackagePackage.HW_PACKAGE_PIN__PIN_NO:
				return getPinNo();
			case HwPackagePackage.HW_PACKAGE_PIN__ALT_NAMES:
				return getAltNames();
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
			case HwPackagePackage.HW_PACKAGE_PIN__REFPIN:
				getRefpin().clear();
				getRefpin().addAll((Collection)newValue);
				return;
			case HwPackagePackage.HW_PACKAGE_PIN__WIRE:
				getWire().clear();
				getWire().addAll((Collection)newValue);
				return;
			case HwPackagePackage.HW_PACKAGE_PIN__PIN_NO:
				setPinNo((String)newValue);
				return;
			case HwPackagePackage.HW_PACKAGE_PIN__ALT_NAMES:
				getAltNames().clear();
				getAltNames().addAll((Collection)newValue);
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
			case HwPackagePackage.HW_PACKAGE_PIN__REFPIN:
				getRefpin().clear();
				return;
			case HwPackagePackage.HW_PACKAGE_PIN__WIRE:
				getWire().clear();
				return;
			case HwPackagePackage.HW_PACKAGE_PIN__PIN_NO:
				setPinNo(PIN_NO_EDEFAULT);
				return;
			case HwPackagePackage.HW_PACKAGE_PIN__ALT_NAMES:
				getAltNames().clear();
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
			case HwPackagePackage.HW_PACKAGE_PIN__REFPIN:
				return refpin != null && !refpin.isEmpty();
			case HwPackagePackage.HW_PACKAGE_PIN__WIRE:
				return wire != null && !wire.isEmpty();
			case HwPackagePackage.HW_PACKAGE_PIN__PIN_NO:
				return PIN_NO_EDEFAULT == null ? pinNo != null : !PIN_NO_EDEFAULT.equals(pinNo);
			case HwPackagePackage.HW_PACKAGE_PIN__ALT_NAMES:
				return altNames != null && !altNames.isEmpty();
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
		result.append(" (pinNo: ");
		result.append(pinNo);
		result.append(", altNames: ");
		result.append(altNames);
		result.append(')');
		return result.toString();
	}

} //HwPackagePinImpl
