/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.util;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.*;

import MARTE.MARTE_Foundations.GRM.DeviceResource;
import MARTE.MARTE_Foundations.GRM.ProcessingResource;
import MARTE.MARTE_Foundations.GRM.Resource;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage
 * @generated
 */
public class HwDeviceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HwDevicePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwDeviceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HwDevicePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwDeviceSwitch modelSwitch =
		new HwDeviceSwitch() {
			public Object caseHwDevice(HwDevice object) {
				return createHwDeviceAdapter();
			}
			public Object caseHwI_O(HwI_O object) {
				return createHwI_OAdapter();
			}
			public Object caseHwSupport(HwSupport object) {
				return createHwSupportAdapter();
			}
			public Object caseHWActuator(HWActuator object) {
				return createHWActuatorAdapter();
			}
			public Object caseHWSensor(HWSensor object) {
				return createHWSensorAdapter();
			}
			public Object caseHwPeripheral(HwPeripheral object) {
				return createHwPeripheralAdapter();
			}
			public Object caseResource(Resource object) {
				return createResourceAdapter();
			}
			public Object caseHwResource(HwResource object) {
				return createHwResourceAdapter();
			}
			public Object caseProcessingResource(ProcessingResource object) {
				return createProcessingResourceAdapter();
			}
			public Object caseDeviceResource(DeviceResource object) {
				return createDeviceResourceAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice <em>Hw Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice
	 * @generated
	 */
	public Adapter createHwDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwI_O <em>Hw IO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwI_O
	 * @generated
	 */
	public Adapter createHwI_OAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwSupport <em>Hw Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwSupport
	 * @generated
	 */
	public Adapter createHwSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HWActuator <em>HW Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HWActuator
	 * @generated
	 */
	public Adapter createHWActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HWSensor <em>HW Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HWSensor
	 * @generated
	 */
	public Adapter createHWSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral <em>Hw Peripheral</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral
	 * @generated
	 */
	public Adapter createHwPeripheralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Foundations.GRM.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Foundations.GRM.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource <em>Hw Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource
	 * @generated
	 */
	public Adapter createHwResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Foundations.GRM.ProcessingResource <em>Processing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Foundations.GRM.ProcessingResource
	 * @generated
	 */
	public Adapter createProcessingResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Foundations.GRM.DeviceResource <em>Device Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Foundations.GRM.DeviceResource
	 * @generated
	 */
	public Adapter createDeviceResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HwDeviceAdapterFactory
