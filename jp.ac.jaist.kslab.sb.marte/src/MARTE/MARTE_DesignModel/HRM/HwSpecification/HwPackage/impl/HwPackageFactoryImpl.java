/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.*;

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
public class HwPackageFactoryImpl extends EFactoryImpl implements HwPackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HwPackageFactory init() {
		try {
			HwPackageFactory theHwPackageFactory = (HwPackageFactory)EPackage.Registry.INSTANCE.getEFactory(HwPackagePackage.eNS_URI);
			if (theHwPackageFactory != null) {
				return theHwPackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HwPackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPackageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HwPackagePackage.HW_PACKAGE: return createHwPackage();
			case HwPackagePackage.HW_PACKAGE_PIN: return createHwPackagePin();
			case HwPackagePackage.HW_WIRE: return createHwWire();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPackage createHwPackage() {
		HwPackageImpl hwPackage = new HwPackageImpl();
		return hwPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPackagePin createHwPackagePin() {
		HwPackagePinImpl hwPackagePin = new HwPackagePinImpl();
		return hwPackagePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwWire createHwWire() {
		HwWireImpl hwWire = new HwWireImpl();
		return hwWire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPackagePackage getHwPackagePackage() {
		return (HwPackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static HwPackagePackage getPackage() {
		return HwPackagePackage.eINSTANCE;
	}

} //HwPackageFactoryImpl
