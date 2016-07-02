/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDeviceFunction.impl;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDeviceFunction.*;

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
public class HwDeviceFunctionFactoryImpl extends EFactoryImpl implements HwDeviceFunctionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HwDeviceFunctionFactory init() {
		try {
			HwDeviceFunctionFactory theHwDeviceFunctionFactory = (HwDeviceFunctionFactory)EPackage.Registry.INSTANCE.getEFactory(HwDeviceFunctionPackage.eNS_URI);
			if (theHwDeviceFunctionFactory != null) {
				return theHwDeviceFunctionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HwDeviceFunctionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwDeviceFunctionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HwDeviceFunctionPackage.HW_DEVICE_FUNCTION: return createHwDeviceFunction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwDeviceFunction createHwDeviceFunction() {
		HwDeviceFunctionImpl hwDeviceFunction = new HwDeviceFunctionImpl();
		return hwDeviceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwDeviceFunctionPackage getHwDeviceFunctionPackage() {
		return (HwDeviceFunctionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static HwDeviceFunctionPackage getPackage() {
		return HwDeviceFunctionPackage.eINSTANCE;
	}

} //HwDeviceFunctionFactoryImpl
