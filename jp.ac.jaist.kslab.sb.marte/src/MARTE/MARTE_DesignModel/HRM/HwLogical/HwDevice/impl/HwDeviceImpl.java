/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.impl.HwResourceImpl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwPort;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage;

import MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocol;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDeviceFunction.HwDeviceFunction;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegister;

import MARTE.MARTE_Foundations.GRM.DeviceResource;
import MARTE.MARTE_Foundations.GRM.GRMPackage;
import MARTE.MARTE_Foundations.GRM.ProcessingResource;
import MARTE.MARTE_Foundations.GRM.Scheduler;

import MARTE_Library.BasicNFP_Types.NFP_Real;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDeviceImpl#getSpeedFactor <em>Speed Factor</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDeviceImpl#getMainScheduler <em>Main Scheduler</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDeviceImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDeviceImpl#getCompliant <em>Compliant</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDeviceImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDeviceImpl#getPins <em>Pins</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDeviceImpl#getRegisters <em>Registers</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDeviceImpl#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwDeviceImpl extends HwResourceImpl implements HwDevice {
	/**
	 * The cached value of the '{@link #getSpeedFactor() <em>Speed Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected NFP_Real speedFactor;

	/**
	 * The cached value of the '{@link #getMainScheduler() <em>Main Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainScheduler()
	 * @generated
	 * @ordered
	 */
	protected Scheduler mainScheduler;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList functions;

	/**
	 * The cached value of the '{@link #getCompliant() <em>Compliant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompliant()
	 * @generated
	 * @ordered
	 */
	protected EList compliant;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList packages;

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
	 * The cached value of the '{@link #getRegisters() <em>Registers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisters()
	 * @generated
	 * @ordered
	 */
	protected EList registers;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList ports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwDevicePackage.Literals.HW_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Real getSpeedFactor() {
		return speedFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeedFactor(NFP_Real newSpeedFactor, NotificationChain msgs) {
		NFP_Real oldSpeedFactor = speedFactor;
		speedFactor = newSpeedFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwDevicePackage.HW_DEVICE__SPEED_FACTOR, oldSpeedFactor, newSpeedFactor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeedFactor(NFP_Real newSpeedFactor) {
		if (newSpeedFactor != speedFactor) {
			NotificationChain msgs = null;
			if (speedFactor != null)
				msgs = ((InternalEObject)speedFactor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwDevicePackage.HW_DEVICE__SPEED_FACTOR, null, msgs);
			if (newSpeedFactor != null)
				msgs = ((InternalEObject)newSpeedFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwDevicePackage.HW_DEVICE__SPEED_FACTOR, null, msgs);
			msgs = basicSetSpeedFactor(newSpeedFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwDevicePackage.HW_DEVICE__SPEED_FACTOR, newSpeedFactor, newSpeedFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler getMainScheduler() {
		if (mainScheduler != null && mainScheduler.eIsProxy()) {
			InternalEObject oldMainScheduler = (InternalEObject)mainScheduler;
			mainScheduler = (Scheduler)eResolveProxy(oldMainScheduler);
			if (mainScheduler != oldMainScheduler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwDevicePackage.HW_DEVICE__MAIN_SCHEDULER, oldMainScheduler, mainScheduler));
			}
		}
		return mainScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler basicGetMainScheduler() {
		return mainScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainScheduler(Scheduler newMainScheduler) {
		Scheduler oldMainScheduler = mainScheduler;
		mainScheduler = newMainScheduler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwDevicePackage.HW_DEVICE__MAIN_SCHEDULER, oldMainScheduler, mainScheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList(HwDeviceFunction.class, this, HwDevicePackage.HW_DEVICE__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCompliant() {
		if (compliant == null) {
			compliant = new EObjectResolvingEList(HwProtocol.class, this, HwDevicePackage.HW_DEVICE__COMPLIANT);
		}
		return compliant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList(HwPackage.class, this, HwDevicePackage.HW_DEVICE__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPins() {
		if (pins == null) {
			pins = new EObjectContainmentEList(HwPin.class, this, HwDevicePackage.HW_DEVICE__PINS);
		}
		return pins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRegisters() {
		if (registers == null) {
			registers = new EObjectContainmentEList(HwRegister.class, this, HwDevicePackage.HW_DEVICE__REGISTERS);
		}
		return registers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList(HwPort.class, this, HwDevicePackage.HW_DEVICE__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwDevicePackage.HW_DEVICE__SPEED_FACTOR:
				return basicSetSpeedFactor(null, msgs);
			case HwDevicePackage.HW_DEVICE__FUNCTIONS:
				return ((InternalEList)getFunctions()).basicRemove(otherEnd, msgs);
			case HwDevicePackage.HW_DEVICE__PACKAGES:
				return ((InternalEList)getPackages()).basicRemove(otherEnd, msgs);
			case HwDevicePackage.HW_DEVICE__PINS:
				return ((InternalEList)getPins()).basicRemove(otherEnd, msgs);
			case HwDevicePackage.HW_DEVICE__REGISTERS:
				return ((InternalEList)getRegisters()).basicRemove(otherEnd, msgs);
			case HwDevicePackage.HW_DEVICE__PORTS:
				return ((InternalEList)getPorts()).basicRemove(otherEnd, msgs);
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
			case HwDevicePackage.HW_DEVICE__SPEED_FACTOR:
				return getSpeedFactor();
			case HwDevicePackage.HW_DEVICE__MAIN_SCHEDULER:
				if (resolve) return getMainScheduler();
				return basicGetMainScheduler();
			case HwDevicePackage.HW_DEVICE__FUNCTIONS:
				return getFunctions();
			case HwDevicePackage.HW_DEVICE__COMPLIANT:
				return getCompliant();
			case HwDevicePackage.HW_DEVICE__PACKAGES:
				return getPackages();
			case HwDevicePackage.HW_DEVICE__PINS:
				return getPins();
			case HwDevicePackage.HW_DEVICE__REGISTERS:
				return getRegisters();
			case HwDevicePackage.HW_DEVICE__PORTS:
				return getPorts();
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
			case HwDevicePackage.HW_DEVICE__SPEED_FACTOR:
				setSpeedFactor((NFP_Real)newValue);
				return;
			case HwDevicePackage.HW_DEVICE__MAIN_SCHEDULER:
				setMainScheduler((Scheduler)newValue);
				return;
			case HwDevicePackage.HW_DEVICE__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection)newValue);
				return;
			case HwDevicePackage.HW_DEVICE__COMPLIANT:
				getCompliant().clear();
				getCompliant().addAll((Collection)newValue);
				return;
			case HwDevicePackage.HW_DEVICE__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection)newValue);
				return;
			case HwDevicePackage.HW_DEVICE__PINS:
				getPins().clear();
				getPins().addAll((Collection)newValue);
				return;
			case HwDevicePackage.HW_DEVICE__REGISTERS:
				getRegisters().clear();
				getRegisters().addAll((Collection)newValue);
				return;
			case HwDevicePackage.HW_DEVICE__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection)newValue);
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
			case HwDevicePackage.HW_DEVICE__SPEED_FACTOR:
				setSpeedFactor((NFP_Real)null);
				return;
			case HwDevicePackage.HW_DEVICE__MAIN_SCHEDULER:
				setMainScheduler((Scheduler)null);
				return;
			case HwDevicePackage.HW_DEVICE__FUNCTIONS:
				getFunctions().clear();
				return;
			case HwDevicePackage.HW_DEVICE__COMPLIANT:
				getCompliant().clear();
				return;
			case HwDevicePackage.HW_DEVICE__PACKAGES:
				getPackages().clear();
				return;
			case HwDevicePackage.HW_DEVICE__PINS:
				getPins().clear();
				return;
			case HwDevicePackage.HW_DEVICE__REGISTERS:
				getRegisters().clear();
				return;
			case HwDevicePackage.HW_DEVICE__PORTS:
				getPorts().clear();
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
			case HwDevicePackage.HW_DEVICE__SPEED_FACTOR:
				return speedFactor != null;
			case HwDevicePackage.HW_DEVICE__MAIN_SCHEDULER:
				return mainScheduler != null;
			case HwDevicePackage.HW_DEVICE__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case HwDevicePackage.HW_DEVICE__COMPLIANT:
				return compliant != null && !compliant.isEmpty();
			case HwDevicePackage.HW_DEVICE__PACKAGES:
				return packages != null && !packages.isEmpty();
			case HwDevicePackage.HW_DEVICE__PINS:
				return pins != null && !pins.isEmpty();
			case HwDevicePackage.HW_DEVICE__REGISTERS:
				return registers != null && !registers.isEmpty();
			case HwDevicePackage.HW_DEVICE__PORTS:
				return ports != null && !ports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ProcessingResource.class) {
			switch (derivedFeatureID) {
				case HwDevicePackage.HW_DEVICE__SPEED_FACTOR: return GRMPackage.PROCESSING_RESOURCE__SPEED_FACTOR;
				case HwDevicePackage.HW_DEVICE__MAIN_SCHEDULER: return GRMPackage.PROCESSING_RESOURCE__MAIN_SCHEDULER;
				default: return -1;
			}
		}
		if (baseClass == DeviceResource.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == ProcessingResource.class) {
			switch (baseFeatureID) {
				case GRMPackage.PROCESSING_RESOURCE__SPEED_FACTOR: return HwDevicePackage.HW_DEVICE__SPEED_FACTOR;
				case GRMPackage.PROCESSING_RESOURCE__MAIN_SCHEDULER: return HwDevicePackage.HW_DEVICE__MAIN_SCHEDULER;
				default: return -1;
			}
		}
		if (baseClass == DeviceResource.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //HwDeviceImpl
