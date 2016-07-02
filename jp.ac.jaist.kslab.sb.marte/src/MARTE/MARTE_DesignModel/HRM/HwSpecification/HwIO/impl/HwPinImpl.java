/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.impl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwEndPointImpl;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwIOPackage;
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwLine;
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePackage;
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.impl.HwPinImpl#getPkgPin <em>Pkg Pin</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.impl.HwPinImpl#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwPinImpl extends HwEndPointImpl implements HwPin {
	/**
	 * The cached value of the '{@link #getPkgPin() <em>Pkg Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPkgPin()
	 * @generated
	 * @ordered
	 */
	protected HwPackagePin pkgPin;

	/**
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected EList lines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwPinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwIOPackage.Literals.HW_PIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPackagePin getPkgPin() {
		if (pkgPin != null && pkgPin.eIsProxy()) {
			InternalEObject oldPkgPin = (InternalEObject)pkgPin;
			pkgPin = (HwPackagePin)eResolveProxy(oldPkgPin);
			if (pkgPin != oldPkgPin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwIOPackage.HW_PIN__PKG_PIN, oldPkgPin, pkgPin));
			}
		}
		return pkgPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPackagePin basicGetPkgPin() {
		return pkgPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPkgPin(HwPackagePin newPkgPin, NotificationChain msgs) {
		HwPackagePin oldPkgPin = pkgPin;
		pkgPin = newPkgPin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwIOPackage.HW_PIN__PKG_PIN, oldPkgPin, newPkgPin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPkgPin(HwPackagePin newPkgPin) {
		if (newPkgPin != pkgPin) {
			NotificationChain msgs = null;
			if (pkgPin != null)
				msgs = ((InternalEObject)pkgPin).eInverseRemove(this, HwPackagePackage.HW_PACKAGE_PIN__REFPIN, HwPackagePin.class, msgs);
			if (newPkgPin != null)
				msgs = ((InternalEObject)newPkgPin).eInverseAdd(this, HwPackagePackage.HW_PACKAGE_PIN__REFPIN, HwPackagePin.class, msgs);
			msgs = basicSetPkgPin(newPkgPin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwIOPackage.HW_PIN__PKG_PIN, newPkgPin, newPkgPin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLines() {
		if (lines == null) {
			lines = new EObjectResolvingEList(HwLine.class, this, HwIOPackage.HW_PIN__LINES);
		}
		return lines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwIOPackage.HW_PIN__PKG_PIN:
				if (pkgPin != null)
					msgs = ((InternalEObject)pkgPin).eInverseRemove(this, HwPackagePackage.HW_PACKAGE_PIN__REFPIN, HwPackagePin.class, msgs);
				return basicSetPkgPin((HwPackagePin)otherEnd, msgs);
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
			case HwIOPackage.HW_PIN__PKG_PIN:
				return basicSetPkgPin(null, msgs);
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
			case HwIOPackage.HW_PIN__PKG_PIN:
				if (resolve) return getPkgPin();
				return basicGetPkgPin();
			case HwIOPackage.HW_PIN__LINES:
				return getLines();
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
			case HwIOPackage.HW_PIN__PKG_PIN:
				setPkgPin((HwPackagePin)newValue);
				return;
			case HwIOPackage.HW_PIN__LINES:
				getLines().clear();
				getLines().addAll((Collection)newValue);
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
			case HwIOPackage.HW_PIN__PKG_PIN:
				setPkgPin((HwPackagePin)null);
				return;
			case HwIOPackage.HW_PIN__LINES:
				getLines().clear();
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
			case HwIOPackage.HW_PIN__PKG_PIN:
				return pkgPin != null;
			case HwIOPackage.HW_PIN__LINES:
				return lines != null && !lines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HwPinImpl
