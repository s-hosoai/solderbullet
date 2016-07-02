/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.*;

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
public class HwCommunicationFactoryImpl extends EFactoryImpl implements HwCommunicationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HwCommunicationFactory init() {
		try {
			HwCommunicationFactory theHwCommunicationFactory = (HwCommunicationFactory)EPackage.Registry.INSTANCE.getEFactory(HwCommunicationPackage.eNS_URI);
			if (theHwCommunicationFactory != null) {
				return theHwCommunicationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HwCommunicationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwCommunicationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HwCommunicationPackage.HW_COMMUNICATION_RESOURCE: return createHwCommunicationResource();
			case HwCommunicationPackage.HW_ARBITER: return createHwArbiter();
			case HwCommunicationPackage.HW_MEDIA: return createHwMedia();
			case HwCommunicationPackage.HW_BUS: return createHwBus();
			case HwCommunicationPackage.HW_BRIDGE: return createHwBridge();
			case HwCommunicationPackage.HW_END_POINT: return createHwEndPoint();
			case HwCommunicationPackage.HW_PORT: return createHwPort();
			case HwCommunicationPackage.HW_CONNECTION: return createHwConnection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwCommunicationResource createHwCommunicationResource() {
		HwCommunicationResourceImpl hwCommunicationResource = new HwCommunicationResourceImpl();
		return hwCommunicationResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwArbiter createHwArbiter() {
		HwArbiterImpl hwArbiter = new HwArbiterImpl();
		return hwArbiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwMedia createHwMedia() {
		HwMediaImpl hwMedia = new HwMediaImpl();
		return hwMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwBus createHwBus() {
		HwBusImpl hwBus = new HwBusImpl();
		return hwBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwBridge createHwBridge() {
		HwBridgeImpl hwBridge = new HwBridgeImpl();
		return hwBridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwEndPoint createHwEndPoint() {
		HwEndPointImpl hwEndPoint = new HwEndPointImpl();
		return hwEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPort createHwPort() {
		HwPortImpl hwPort = new HwPortImpl();
		return hwPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwConnection createHwConnection() {
		HwConnectionImpl hwConnection = new HwConnectionImpl();
		return hwConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwCommunicationPackage getHwCommunicationPackage() {
		return (HwCommunicationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static HwCommunicationPackage getPackage() {
		return HwCommunicationPackage.eINSTANCE;
	}

} //HwCommunicationFactoryImpl
