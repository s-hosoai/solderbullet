/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.impl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HwTimingFactoryImpl extends EFactoryImpl implements HwTimingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HwTimingFactory init() {
		try {
			HwTimingFactory theHwTimingFactory = (HwTimingFactory)EPackage.Registry.INSTANCE.getEFactory(HwTimingPackage.eNS_URI);
			if (theHwTimingFactory != null) {
				return theHwTimingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HwTimingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwTimingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HwTimingPackage.HW_TIMING_RESOURCE: return createHwTimingResource();
			case HwTimingPackage.HW_CLOCK: return createHwClock();
			case HwTimingPackage.HW_TIMER: return createHwTimer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwTimingResource createHwTimingResource() {
		HwTimingResourceImpl hwTimingResource = new HwTimingResourceImpl();
		return hwTimingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwClock createHwClock() {
		HwClockImpl hwClock = new HwClockImpl();
		return hwClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwTimer createHwTimer() {
		HwTimerImpl hwTimer = new HwTimerImpl();
		return hwTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwTimingPackage getHwTimingPackage() {
		return (HwTimingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static HwTimingPackage getPackage() {
		return HwTimingPackage.eINSTANCE;
	}

} //HwTimingFactoryImpl
