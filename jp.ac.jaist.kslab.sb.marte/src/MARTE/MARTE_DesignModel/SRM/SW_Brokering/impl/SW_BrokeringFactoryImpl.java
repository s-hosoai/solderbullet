/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Brokering.impl;

import MARTE.MARTE_DesignModel.SRM.SW_Brokering.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class SW_BrokeringFactoryImpl extends EFactoryImpl implements SW_BrokeringFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SW_BrokeringFactory init() {
		try {
			SW_BrokeringFactory theSW_BrokeringFactory = (SW_BrokeringFactory)EPackage.Registry.INSTANCE.getEFactory(SW_BrokeringPackage.eNS_URI);
			if (theSW_BrokeringFactory != null) {
				return theSW_BrokeringFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SW_BrokeringFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SW_BrokeringFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SW_BrokeringPackage.DEVICE_BROKER: return createDeviceBroker();
			case SW_BrokeringPackage.MEMORY_BROKER: return createMemoryBroker();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SW_BrokeringPackage.ACCESS_POLICY_KIND:
				return createAccessPolicyKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SW_BrokeringPackage.ACCESS_POLICY_KIND:
				return convertAccessPolicyKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceBroker createDeviceBroker() {
		DeviceBrokerImpl deviceBroker = new DeviceBrokerImpl();
		return deviceBroker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryBroker createMemoryBroker() {
		MemoryBrokerImpl memoryBroker = new MemoryBrokerImpl();
		return memoryBroker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessPolicyKind createAccessPolicyKindFromString(EDataType eDataType, String initialValue) {
		AccessPolicyKind result = AccessPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessPolicyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SW_BrokeringPackage getSW_BrokeringPackage() {
		return (SW_BrokeringPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static SW_BrokeringPackage getPackage() {
		return SW_BrokeringPackage.eINSTANCE;
	}

} //SW_BrokeringFactoryImpl
