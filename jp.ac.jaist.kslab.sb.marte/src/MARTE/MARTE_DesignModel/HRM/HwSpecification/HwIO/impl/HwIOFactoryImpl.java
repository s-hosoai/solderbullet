/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.impl;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.*;

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
public class HwIOFactoryImpl extends EFactoryImpl implements HwIOFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HwIOFactory init() {
		try {
			HwIOFactory theHwIOFactory = (HwIOFactory)EPackage.Registry.INSTANCE.getEFactory(HwIOPackage.eNS_URI);
			if (theHwIOFactory != null) {
				return theHwIOFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HwIOFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwIOFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HwIOPackage.HW_PIN: return createHwPin();
			case HwIOPackage.HW_LINE: return createHwLine();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPin createHwPin() {
		HwPinImpl hwPin = new HwPinImpl();
		return hwPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwLine createHwLine() {
		HwLineImpl hwLine = new HwLineImpl();
		return hwLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwIOPackage getHwIOPackage() {
		return (HwIOPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static HwIOPackage getPackage() {
		return HwIOPackage.eINSTANCE;
	}

} //HwIOFactoryImpl
