/**
 */
package MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.impl;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.*;

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
public class HwPowerFactoryImpl extends EFactoryImpl implements HwPowerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HwPowerFactory init() {
		try {
			HwPowerFactory theHwPowerFactory = (HwPowerFactory)EPackage.Registry.INSTANCE.getEFactory(HwPowerPackage.eNS_URI);
			if (theHwPowerFactory != null) {
				return theHwPowerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HwPowerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPowerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HwPowerPackage.HW_POWER_SUPPLY: return createHwPowerSupply();
			case HwPowerPackage.HW_COOLING_SUPPLY: return createHwCoolingSupply();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPowerSupply createHwPowerSupply() {
		HwPowerSupplyImpl hwPowerSupply = new HwPowerSupplyImpl();
		return hwPowerSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwCoolingSupply createHwCoolingSupply() {
		HwCoolingSupplyImpl hwCoolingSupply = new HwCoolingSupplyImpl();
		return hwCoolingSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPowerPackage getHwPowerPackage() {
		return (HwPowerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static HwPowerPackage getPackage() {
		return HwPowerPackage.eINSTANCE;
	}

} //HwPowerFactoryImpl
