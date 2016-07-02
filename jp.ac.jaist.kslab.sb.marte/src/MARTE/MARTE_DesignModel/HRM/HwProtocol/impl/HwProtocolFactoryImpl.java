/**
 */
package MARTE.MARTE_DesignModel.HRM.HwProtocol.impl;

import MARTE.MARTE_DesignModel.HRM.HwProtocol.*;

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
public class HwProtocolFactoryImpl extends EFactoryImpl implements HwProtocolFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HwProtocolFactory init() {
		try {
			HwProtocolFactory theHwProtocolFactory = (HwProtocolFactory)EPackage.Registry.INSTANCE.getEFactory(HwProtocolPackage.eNS_URI);
			if (theHwProtocolFactory != null) {
				return theHwProtocolFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HwProtocolFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwProtocolFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HwProtocolPackage.HW_PROTOCOL: return createHwProtocol();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwProtocol createHwProtocol() {
		HwProtocolImpl hwProtocol = new HwProtocolImpl();
		return hwProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwProtocolPackage getHwProtocolPackage() {
		return (HwProtocolPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static HwProtocolPackage getPackage() {
		return HwProtocolPackage.eINSTANCE;
	}

} //HwProtocolFactoryImpl
