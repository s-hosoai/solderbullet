/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwPort;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegister;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw MCU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwMCUImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwMCUImpl#getPeripherals <em>Peripherals</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwMCUImpl#getSfr <em>Sfr</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwMCUImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwMCUImpl#getPins <em>Pins</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwMCUImpl#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwMCUImpl extends HwComputingResourceImpl implements HwMCU {
	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected EList processor;

	/**
	 * The cached value of the '{@link #getPeripherals() <em>Peripherals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeripherals()
	 * @generated
	 * @ordered
	 */
	protected EList peripherals;

	/**
	 * The cached value of the '{@link #getSfr() <em>Sfr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfr()
	 * @generated
	 * @ordered
	 */
	protected EList sfr;

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
	protected HwMCUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwComputingPackage.Literals.HW_MCU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProcessor() {
		if (processor == null) {
			processor = new EObjectContainmentEList(HwProcessor.class, this, HwComputingPackage.HW_MCU__PROCESSOR);
		}
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPeripherals() {
		if (peripherals == null) {
			peripherals = new EObjectContainmentEList(HwPeripheral.class, this, HwComputingPackage.HW_MCU__PERIPHERALS);
		}
		return peripherals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSfr() {
		if (sfr == null) {
			sfr = new EObjectContainmentEList(HwRegister.class, this, HwComputingPackage.HW_MCU__SFR);
		}
		return sfr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList(HwPackage.class, this, HwComputingPackage.HW_MCU__PACKAGES);
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
			pins = new EObjectContainmentEList(HwPin.class, this, HwComputingPackage.HW_MCU__PINS);
		}
		return pins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList(HwPort.class, this, HwComputingPackage.HW_MCU__PORTS);
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
			case HwComputingPackage.HW_MCU__PROCESSOR:
				return ((InternalEList)getProcessor()).basicRemove(otherEnd, msgs);
			case HwComputingPackage.HW_MCU__PERIPHERALS:
				return ((InternalEList)getPeripherals()).basicRemove(otherEnd, msgs);
			case HwComputingPackage.HW_MCU__SFR:
				return ((InternalEList)getSfr()).basicRemove(otherEnd, msgs);
			case HwComputingPackage.HW_MCU__PACKAGES:
				return ((InternalEList)getPackages()).basicRemove(otherEnd, msgs);
			case HwComputingPackage.HW_MCU__PINS:
				return ((InternalEList)getPins()).basicRemove(otherEnd, msgs);
			case HwComputingPackage.HW_MCU__PORTS:
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
			case HwComputingPackage.HW_MCU__PROCESSOR:
				return getProcessor();
			case HwComputingPackage.HW_MCU__PERIPHERALS:
				return getPeripherals();
			case HwComputingPackage.HW_MCU__SFR:
				return getSfr();
			case HwComputingPackage.HW_MCU__PACKAGES:
				return getPackages();
			case HwComputingPackage.HW_MCU__PINS:
				return getPins();
			case HwComputingPackage.HW_MCU__PORTS:
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
			case HwComputingPackage.HW_MCU__PROCESSOR:
				getProcessor().clear();
				getProcessor().addAll((Collection)newValue);
				return;
			case HwComputingPackage.HW_MCU__PERIPHERALS:
				getPeripherals().clear();
				getPeripherals().addAll((Collection)newValue);
				return;
			case HwComputingPackage.HW_MCU__SFR:
				getSfr().clear();
				getSfr().addAll((Collection)newValue);
				return;
			case HwComputingPackage.HW_MCU__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection)newValue);
				return;
			case HwComputingPackage.HW_MCU__PINS:
				getPins().clear();
				getPins().addAll((Collection)newValue);
				return;
			case HwComputingPackage.HW_MCU__PORTS:
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
			case HwComputingPackage.HW_MCU__PROCESSOR:
				getProcessor().clear();
				return;
			case HwComputingPackage.HW_MCU__PERIPHERALS:
				getPeripherals().clear();
				return;
			case HwComputingPackage.HW_MCU__SFR:
				getSfr().clear();
				return;
			case HwComputingPackage.HW_MCU__PACKAGES:
				getPackages().clear();
				return;
			case HwComputingPackage.HW_MCU__PINS:
				getPins().clear();
				return;
			case HwComputingPackage.HW_MCU__PORTS:
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
			case HwComputingPackage.HW_MCU__PROCESSOR:
				return processor != null && !processor.isEmpty();
			case HwComputingPackage.HW_MCU__PERIPHERALS:
				return peripherals != null && !peripherals.isEmpty();
			case HwComputingPackage.HW_MCU__SFR:
				return sfr != null && !sfr.isEmpty();
			case HwComputingPackage.HW_MCU__PACKAGES:
				return packages != null && !packages.isEmpty();
			case HwComputingPackage.HW_MCU__PINS:
				return pins != null && !pins.isEmpty();
			case HwComputingPackage.HW_MCU__PORTS:
				return ports != null && !ports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HwMCUImpl
