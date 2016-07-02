/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.impl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.*;

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
public class HwStorageManagerFactoryImpl extends EFactoryImpl implements HwStorageManagerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HwStorageManagerFactory init() {
		try {
			HwStorageManagerFactory theHwStorageManagerFactory = (HwStorageManagerFactory)EPackage.Registry.INSTANCE.getEFactory(HwStorageManagerPackage.eNS_URI);
			if (theHwStorageManagerFactory != null) {
				return theHwStorageManagerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HwStorageManagerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwStorageManagerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HwStorageManagerPackage.HW_STORAGE_MANAGER: return createHwStorageManager();
			case HwStorageManagerPackage.HW_DMA: return createHwDMA();
			case HwStorageManagerPackage.HW_MMU: return createHwMMU();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwStorageManager createHwStorageManager() {
		HwStorageManagerImpl hwStorageManager = new HwStorageManagerImpl();
		return hwStorageManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwDMA createHwDMA() {
		HwDMAImpl hwDMA = new HwDMAImpl();
		return hwDMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwMMU createHwMMU() {
		HwMMUImpl hwMMU = new HwMMUImpl();
		return hwMMU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwStorageManagerPackage getHwStorageManagerPackage() {
		return (HwStorageManagerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static HwStorageManagerPackage getPackage() {
		return HwStorageManagerPackage.eINSTANCE;
	}

} //HwStorageManagerFactoryImpl
