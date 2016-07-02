/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Brokering.impl;

import MARTE.MARTE_DesignModel.SRM.SW_Brokering.AccessPolicyKind;
import MARTE.MARTE_DesignModel.SRM.SW_Brokering.DeviceBroker;
import MARTE.MARTE_DesignModel.SRM.SW_Brokering.SW_BrokeringPackage;

import MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.impl.SwResourceImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Broker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.impl.DeviceBrokerImpl#getAccessPolicy <em>Access Policy</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.impl.DeviceBrokerImpl#getIsBuffered <em>Is Buffered</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.impl.DeviceBrokerImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.impl.DeviceBrokerImpl#getCloseServices <em>Close Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.impl.DeviceBrokerImpl#getControlServices <em>Control Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.impl.DeviceBrokerImpl#getOpenServices <em>Open Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.impl.DeviceBrokerImpl#getReadServices <em>Read Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.impl.DeviceBrokerImpl#getWriteServices <em>Write Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.impl.DeviceBrokerImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.impl.DeviceBrokerImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.impl.DeviceBrokerImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceBrokerImpl extends SwResourceImpl implements DeviceBroker {
	/**
	 * The default value of the '{@link #getAccessPolicy() <em>Access Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final AccessPolicyKind ACCESS_POLICY_EDEFAULT = AccessPolicyKind.READ_LITERAL;

	/**
	 * The cached value of the '{@link #getAccessPolicy() <em>Access Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPolicy()
	 * @generated
	 * @ordered
	 */
	protected AccessPolicyKind accessPolicy = ACCESS_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsBuffered() <em>Is Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBuffered()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_BUFFERED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsBuffered() <em>Is Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBuffered()
	 * @generated
	 * @ordered
	 */
	protected Boolean isBuffered = IS_BUFFERED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList devices;

	/**
	 * The cached value of the '{@link #getCloseServices() <em>Close Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloseServices()
	 * @generated
	 * @ordered
	 */
	protected EList closeServices;

	/**
	 * The cached value of the '{@link #getControlServices() <em>Control Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlServices()
	 * @generated
	 * @ordered
	 */
	protected EList controlServices;

	/**
	 * The cached value of the '{@link #getOpenServices() <em>Open Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenServices()
	 * @generated
	 * @ordered
	 */
	protected EList openServices;

	/**
	 * The cached value of the '{@link #getReadServices() <em>Read Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadServices()
	 * @generated
	 * @ordered
	 */
	protected EList readServices;

	/**
	 * The cached value of the '{@link #getWriteServices() <em>Write Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteServices()
	 * @generated
	 * @ordered
	 */
	protected EList writeServices;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList operations;

	/**
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected EList activities;

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
	protected DeviceBrokerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SW_BrokeringPackage.Literals.DEVICE_BROKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessPolicyKind getAccessPolicy() {
		return accessPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessPolicy(AccessPolicyKind newAccessPolicy) {
		AccessPolicyKind oldAccessPolicy = accessPolicy;
		accessPolicy = newAccessPolicy == null ? ACCESS_POLICY_EDEFAULT : newAccessPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_BrokeringPackage.DEVICE_BROKER__ACCESS_POLICY, oldAccessPolicy, accessPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsBuffered() {
		return isBuffered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBuffered(Boolean newIsBuffered) {
		Boolean oldIsBuffered = isBuffered;
		isBuffered = newIsBuffered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_BrokeringPackage.DEVICE_BROKER__IS_BUFFERED, oldIsBuffered, isBuffered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDevices() {
		if (devices == null) {
			devices = new EObjectResolvingEList(TypedElement.class, this, SW_BrokeringPackage.DEVICE_BROKER__DEVICES);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCloseServices() {
		if (closeServices == null) {
			closeServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_BrokeringPackage.DEVICE_BROKER__CLOSE_SERVICES);
		}
		return closeServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getControlServices() {
		if (controlServices == null) {
			controlServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_BrokeringPackage.DEVICE_BROKER__CONTROL_SERVICES);
		}
		return controlServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOpenServices() {
		if (openServices == null) {
			openServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_BrokeringPackage.DEVICE_BROKER__OPEN_SERVICES);
		}
		return openServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReadServices() {
		if (readServices == null) {
			readServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_BrokeringPackage.DEVICE_BROKER__READ_SERVICES);
		}
		return readServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWriteServices() {
		if (writeServices == null) {
			writeServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_BrokeringPackage.DEVICE_BROKER__WRITE_SERVICES);
		}
		return writeServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList(Operation.class, this, SW_BrokeringPackage.DEVICE_BROKER__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getActivities() {
		if (activities == null) {
			activities = new EObjectContainmentEList(Activity.class, this, SW_BrokeringPackage.DEVICE_BROKER__ACTIVITIES);
		}
		return activities;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SW_BrokeringPackage.DEVICE_BROKER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SW_BrokeringPackage.DEVICE_BROKER__OPERATIONS:
				return ((InternalEList)getOperations()).basicRemove(otherEnd, msgs);
			case SW_BrokeringPackage.DEVICE_BROKER__ACTIVITIES:
				return ((InternalEList)getActivities()).basicRemove(otherEnd, msgs);
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
			case SW_BrokeringPackage.DEVICE_BROKER__ACCESS_POLICY:
				return getAccessPolicy();
			case SW_BrokeringPackage.DEVICE_BROKER__IS_BUFFERED:
				return getIsBuffered();
			case SW_BrokeringPackage.DEVICE_BROKER__DEVICES:
				return getDevices();
			case SW_BrokeringPackage.DEVICE_BROKER__CLOSE_SERVICES:
				return getCloseServices();
			case SW_BrokeringPackage.DEVICE_BROKER__CONTROL_SERVICES:
				return getControlServices();
			case SW_BrokeringPackage.DEVICE_BROKER__OPEN_SERVICES:
				return getOpenServices();
			case SW_BrokeringPackage.DEVICE_BROKER__READ_SERVICES:
				return getReadServices();
			case SW_BrokeringPackage.DEVICE_BROKER__WRITE_SERVICES:
				return getWriteServices();
			case SW_BrokeringPackage.DEVICE_BROKER__OPERATIONS:
				return getOperations();
			case SW_BrokeringPackage.DEVICE_BROKER__ACTIVITIES:
				return getActivities();
			case SW_BrokeringPackage.DEVICE_BROKER__NAME:
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
			case SW_BrokeringPackage.DEVICE_BROKER__ACCESS_POLICY:
				setAccessPolicy((AccessPolicyKind)newValue);
				return;
			case SW_BrokeringPackage.DEVICE_BROKER__IS_BUFFERED:
				setIsBuffered((Boolean)newValue);
				return;
			case SW_BrokeringPackage.DEVICE_BROKER__DEVICES:
				getDevices().clear();
				getDevices().addAll((Collection)newValue);
				return;
			case SW_BrokeringPackage.DEVICE_BROKER__CLOSE_SERVICES:
				getCloseServices().clear();
				getCloseServices().addAll((Collection)newValue);
				return;
			case SW_BrokeringPackage.DEVICE_BROKER__CONTROL_SERVICES:
				getControlServices().clear();
				getControlServices().addAll((Collection)newValue);
				return;
			case SW_BrokeringPackage.DEVICE_BROKER__OPEN_SERVICES:
				getOpenServices().clear();
				getOpenServices().addAll((Collection)newValue);
				return;
			case SW_BrokeringPackage.DEVICE_BROKER__READ_SERVICES:
				getReadServices().clear();
				getReadServices().addAll((Collection)newValue);
				return;
			case SW_BrokeringPackage.DEVICE_BROKER__WRITE_SERVICES:
				getWriteServices().clear();
				getWriteServices().addAll((Collection)newValue);
				return;
			case SW_BrokeringPackage.DEVICE_BROKER__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection)newValue);
				return;
			case SW_BrokeringPackage.DEVICE_BROKER__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection)newValue);
				return;
			case SW_BrokeringPackage.DEVICE_BROKER__NAME:
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
			case SW_BrokeringPackage.DEVICE_BROKER__ACCESS_POLICY:
				setAccessPolicy(ACCESS_POLICY_EDEFAULT);
				return;
			case SW_BrokeringPackage.DEVICE_BROKER__IS_BUFFERED:
				setIsBuffered(IS_BUFFERED_EDEFAULT);
				return;
			case SW_BrokeringPackage.DEVICE_BROKER__DEVICES:
				getDevices().clear();
				return;
			case SW_BrokeringPackage.DEVICE_BROKER__CLOSE_SERVICES:
				getCloseServices().clear();
				return;
			case SW_BrokeringPackage.DEVICE_BROKER__CONTROL_SERVICES:
				getControlServices().clear();
				return;
			case SW_BrokeringPackage.DEVICE_BROKER__OPEN_SERVICES:
				getOpenServices().clear();
				return;
			case SW_BrokeringPackage.DEVICE_BROKER__READ_SERVICES:
				getReadServices().clear();
				return;
			case SW_BrokeringPackage.DEVICE_BROKER__WRITE_SERVICES:
				getWriteServices().clear();
				return;
			case SW_BrokeringPackage.DEVICE_BROKER__OPERATIONS:
				getOperations().clear();
				return;
			case SW_BrokeringPackage.DEVICE_BROKER__ACTIVITIES:
				getActivities().clear();
				return;
			case SW_BrokeringPackage.DEVICE_BROKER__NAME:
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
			case SW_BrokeringPackage.DEVICE_BROKER__ACCESS_POLICY:
				return accessPolicy != ACCESS_POLICY_EDEFAULT;
			case SW_BrokeringPackage.DEVICE_BROKER__IS_BUFFERED:
				return IS_BUFFERED_EDEFAULT == null ? isBuffered != null : !IS_BUFFERED_EDEFAULT.equals(isBuffered);
			case SW_BrokeringPackage.DEVICE_BROKER__DEVICES:
				return devices != null && !devices.isEmpty();
			case SW_BrokeringPackage.DEVICE_BROKER__CLOSE_SERVICES:
				return closeServices != null && !closeServices.isEmpty();
			case SW_BrokeringPackage.DEVICE_BROKER__CONTROL_SERVICES:
				return controlServices != null && !controlServices.isEmpty();
			case SW_BrokeringPackage.DEVICE_BROKER__OPEN_SERVICES:
				return openServices != null && !openServices.isEmpty();
			case SW_BrokeringPackage.DEVICE_BROKER__READ_SERVICES:
				return readServices != null && !readServices.isEmpty();
			case SW_BrokeringPackage.DEVICE_BROKER__WRITE_SERVICES:
				return writeServices != null && !writeServices.isEmpty();
			case SW_BrokeringPackage.DEVICE_BROKER__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case SW_BrokeringPackage.DEVICE_BROKER__ACTIVITIES:
				return activities != null && !activities.isEmpty();
			case SW_BrokeringPackage.DEVICE_BROKER__NAME:
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
		result.append(" (accessPolicy: ");
		result.append(accessPolicy);
		result.append(", isBuffered: ");
		result.append(isBuffered);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DeviceBrokerImpl
