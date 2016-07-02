/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.impl;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.*;

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
public class HwRegisterFactoryImpl extends EFactoryImpl implements HwRegisterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HwRegisterFactory init() {
		try {
			HwRegisterFactory theHwRegisterFactory = (HwRegisterFactory)EPackage.Registry.INSTANCE.getEFactory(HwRegisterPackage.eNS_URI);
			if (theHwRegisterFactory != null) {
				return theHwRegisterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HwRegisterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwRegisterFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HwRegisterPackage.HW_REGISTER: return createHwRegister();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwRegister createHwRegister() {
		HwRegisterImpl hwRegister = new HwRegisterImpl();
		return hwRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwRegisterPackage getHwRegisterPackage() {
		return (HwRegisterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static HwRegisterPackage getPackage() {
		return HwRegisterPackage.eINSTANCE;
	}

} //HwRegisterFactoryImpl
