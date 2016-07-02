/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage;
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePackage;
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackageImpl#getPins <em>Pins</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackageImpl#getPinNum <em>Pin Num</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackageImpl#getPackageType <em>Package Type</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackageImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwPackageImpl extends EObjectImpl implements HwPackage {
	/**
	 * The cached value of the '{@link #getPins() <em>Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPins()
	 * @generated
	 * @ordered
	 */
	protected EList pins;

	/**
	 * The default value of the '{@link #getPinNum() <em>Pin Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinNum()
	 * @generated
	 * @ordered
	 */
	protected static final int PIN_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPinNum() <em>Pin Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinNum()
	 * @generated
	 * @ordered
	 */
	protected int pinNum = PIN_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageType() <em>Package Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageType()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageType() <em>Package Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageType()
	 * @generated
	 * @ordered
	 */
	protected String packageType = PACKAGE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwPackagePackage.Literals.HW_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPins() {
		if (pins == null) {
			pins = new EObjectContainmentEList(HwPackagePin.class, this, HwPackagePackage.HW_PACKAGE__PINS);
		}
		return pins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPinNum() {
		return pinNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinNum(int newPinNum) {
		int oldPinNum = pinNum;
		pinNum = newPinNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwPackagePackage.HW_PACKAGE__PIN_NUM, oldPinNum, pinNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageType() {
		return packageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageType(String newPackageType) {
		String oldPackageType = packageType;
		packageType = newPackageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwPackagePackage.HW_PACKAGE__PACKAGE_TYPE, oldPackageType, packageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwPackagePackage.HW_PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwPackagePackage.HW_PACKAGE__PINS:
				return ((InternalEList)getPins()).basicRemove(otherEnd, msgs);
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
			case HwPackagePackage.HW_PACKAGE__PINS:
				return getPins();
			case HwPackagePackage.HW_PACKAGE__PIN_NUM:
				return new Integer(getPinNum());
			case HwPackagePackage.HW_PACKAGE__PACKAGE_TYPE:
				return getPackageType();
			case HwPackagePackage.HW_PACKAGE__NAME:
				return getName();
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
			case HwPackagePackage.HW_PACKAGE__PINS:
				getPins().clear();
				getPins().addAll((Collection)newValue);
				return;
			case HwPackagePackage.HW_PACKAGE__PIN_NUM:
				setPinNum(((Integer)newValue).intValue());
				return;
			case HwPackagePackage.HW_PACKAGE__PACKAGE_TYPE:
				setPackageType((String)newValue);
				return;
			case HwPackagePackage.HW_PACKAGE__NAME:
				setName((String)newValue);
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
			case HwPackagePackage.HW_PACKAGE__PINS:
				getPins().clear();
				return;
			case HwPackagePackage.HW_PACKAGE__PIN_NUM:
				setPinNum(PIN_NUM_EDEFAULT);
				return;
			case HwPackagePackage.HW_PACKAGE__PACKAGE_TYPE:
				setPackageType(PACKAGE_TYPE_EDEFAULT);
				return;
			case HwPackagePackage.HW_PACKAGE__NAME:
				setName(NAME_EDEFAULT);
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
			case HwPackagePackage.HW_PACKAGE__PINS:
				return pins != null && !pins.isEmpty();
			case HwPackagePackage.HW_PACKAGE__PIN_NUM:
				return pinNum != PIN_NUM_EDEFAULT;
			case HwPackagePackage.HW_PACKAGE__PACKAGE_TYPE:
				return PACKAGE_TYPE_EDEFAULT == null ? packageType != null : !PACKAGE_TYPE_EDEFAULT.equals(packageType);
			case HwPackagePackage.HW_PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (pinNum: ");
		result.append(pinNum);
		result.append(", packageType: ");
		result.append(packageType);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //HwPackageImpl
