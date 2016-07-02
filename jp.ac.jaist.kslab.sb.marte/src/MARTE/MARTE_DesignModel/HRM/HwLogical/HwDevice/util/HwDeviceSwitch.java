/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.util;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.*;

import MARTE.MARTE_Foundations.GRM.DeviceResource;
import MARTE.MARTE_Foundations.GRM.ProcessingResource;
import MARTE.MARTE_Foundations.GRM.Resource;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage
 * @generated
 */
public class HwDeviceSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HwDevicePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwDeviceSwitch() {
		if (modelPackage == null) {
			modelPackage = HwDevicePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case HwDevicePackage.HW_DEVICE: {
				HwDevice hwDevice = (HwDevice)theEObject;
				Object result = caseHwDevice(hwDevice);
				if (result == null) result = caseHwResource(hwDevice);
				if (result == null) result = caseDeviceResource(hwDevice);
				if (result == null) result = caseProcessingResource(hwDevice);
				if (result == null) result = caseResource(hwDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwDevicePackage.HW_IO: {
				HwI_O hwI_O = (HwI_O)theEObject;
				Object result = caseHwI_O(hwI_O);
				if (result == null) result = caseHwDevice(hwI_O);
				if (result == null) result = caseHwResource(hwI_O);
				if (result == null) result = caseDeviceResource(hwI_O);
				if (result == null) result = caseProcessingResource(hwI_O);
				if (result == null) result = caseResource(hwI_O);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwDevicePackage.HW_SUPPORT: {
				HwSupport hwSupport = (HwSupport)theEObject;
				Object result = caseHwSupport(hwSupport);
				if (result == null) result = caseHwDevice(hwSupport);
				if (result == null) result = caseHwResource(hwSupport);
				if (result == null) result = caseDeviceResource(hwSupport);
				if (result == null) result = caseProcessingResource(hwSupport);
				if (result == null) result = caseResource(hwSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwDevicePackage.HW_ACTUATOR: {
				HWActuator hwActuator = (HWActuator)theEObject;
				Object result = caseHWActuator(hwActuator);
				if (result == null) result = caseHwI_O(hwActuator);
				if (result == null) result = caseHwDevice(hwActuator);
				if (result == null) result = caseHwResource(hwActuator);
				if (result == null) result = caseDeviceResource(hwActuator);
				if (result == null) result = caseProcessingResource(hwActuator);
				if (result == null) result = caseResource(hwActuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwDevicePackage.HW_SENSOR: {
				HWSensor hwSensor = (HWSensor)theEObject;
				Object result = caseHWSensor(hwSensor);
				if (result == null) result = caseHwI_O(hwSensor);
				if (result == null) result = caseHwDevice(hwSensor);
				if (result == null) result = caseHwResource(hwSensor);
				if (result == null) result = caseDeviceResource(hwSensor);
				if (result == null) result = caseProcessingResource(hwSensor);
				if (result == null) result = caseResource(hwSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwDevicePackage.HW_PERIPHERAL: {
				HwPeripheral hwPeripheral = (HwPeripheral)theEObject;
				Object result = caseHwPeripheral(hwPeripheral);
				if (result == null) result = caseHwDevice(hwPeripheral);
				if (result == null) result = caseHwResource(hwPeripheral);
				if (result == null) result = caseDeviceResource(hwPeripheral);
				if (result == null) result = caseProcessingResource(hwPeripheral);
				if (result == null) result = caseResource(hwPeripheral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwDevice(HwDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw IO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw IO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwI_O(HwI_O object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwSupport(HwSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HW Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HW Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHWActuator(HWActuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HW Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HW Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHWSensor(HWSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Peripheral</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Peripheral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwPeripheral(HwPeripheral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwResource(HwResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProcessingResource(ProcessingResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeviceResource(DeviceResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //HwDeviceSwitch
