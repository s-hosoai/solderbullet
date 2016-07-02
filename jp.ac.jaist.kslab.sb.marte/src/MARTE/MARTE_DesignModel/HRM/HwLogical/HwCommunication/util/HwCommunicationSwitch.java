/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.util;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.*;

import MARTE.MARTE_Foundations.GRM.CommunicationEndPoint;
import MARTE.MARTE_Foundations.GRM.CommunicationMedia;
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
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage
 * @generated
 */
public class HwCommunicationSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HwCommunicationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwCommunicationSwitch() {
		if (modelPackage == null) {
			modelPackage = HwCommunicationPackage.eINSTANCE;
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
			case HwCommunicationPackage.HW_COMMUNICATION_RESOURCE: {
				HwCommunicationResource hwCommunicationResource = (HwCommunicationResource)theEObject;
				Object result = caseHwCommunicationResource(hwCommunicationResource);
				if (result == null) result = caseHwResource(hwCommunicationResource);
				if (result == null) result = caseResource(hwCommunicationResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwCommunicationPackage.HW_ARBITER: {
				HwArbiter hwArbiter = (HwArbiter)theEObject;
				Object result = caseHwArbiter(hwArbiter);
				if (result == null) result = caseHwCommunicationResource(hwArbiter);
				if (result == null) result = caseHwResource(hwArbiter);
				if (result == null) result = caseResource(hwArbiter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwCommunicationPackage.HW_MEDIA: {
				HwMedia hwMedia = (HwMedia)theEObject;
				Object result = caseHwMedia(hwMedia);
				if (result == null) result = caseCommunicationMedia(hwMedia);
				if (result == null) result = caseHwCommunicationResource(hwMedia);
				if (result == null) result = caseProcessingResource(hwMedia);
				if (result == null) result = caseHwResource(hwMedia);
				if (result == null) result = caseResource(hwMedia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwCommunicationPackage.HW_BUS: {
				HwBus hwBus = (HwBus)theEObject;
				Object result = caseHwBus(hwBus);
				if (result == null) result = caseHwMedia(hwBus);
				if (result == null) result = caseCommunicationMedia(hwBus);
				if (result == null) result = caseHwCommunicationResource(hwBus);
				if (result == null) result = caseProcessingResource(hwBus);
				if (result == null) result = caseHwResource(hwBus);
				if (result == null) result = caseResource(hwBus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwCommunicationPackage.HW_BRIDGE: {
				HwBridge hwBridge = (HwBridge)theEObject;
				Object result = caseHwBridge(hwBridge);
				if (result == null) result = caseHwMedia(hwBridge);
				if (result == null) result = caseCommunicationMedia(hwBridge);
				if (result == null) result = caseHwCommunicationResource(hwBridge);
				if (result == null) result = caseProcessingResource(hwBridge);
				if (result == null) result = caseHwResource(hwBridge);
				if (result == null) result = caseResource(hwBridge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwCommunicationPackage.HW_END_POINT: {
				HwEndPoint hwEndPoint = (HwEndPoint)theEObject;
				Object result = caseHwEndPoint(hwEndPoint);
				if (result == null) result = caseHwCommunicationResource(hwEndPoint);
				if (result == null) result = caseCommunicationEndPoint(hwEndPoint);
				if (result == null) result = caseHwResource(hwEndPoint);
				if (result == null) result = caseResource(hwEndPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwCommunicationPackage.HW_PORT: {
				HwPort hwPort = (HwPort)theEObject;
				Object result = caseHwPort(hwPort);
				if (result == null) result = caseHwEndPoint(hwPort);
				if (result == null) result = caseHwCommunicationResource(hwPort);
				if (result == null) result = caseCommunicationEndPoint(hwPort);
				if (result == null) result = caseHwResource(hwPort);
				if (result == null) result = caseResource(hwPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwCommunicationPackage.HW_CONNECTION: {
				HwConnection hwConnection = (HwConnection)theEObject;
				Object result = caseHwConnection(hwConnection);
				if (result == null) result = caseHwMedia(hwConnection);
				if (result == null) result = caseCommunicationMedia(hwConnection);
				if (result == null) result = caseHwCommunicationResource(hwConnection);
				if (result == null) result = caseProcessingResource(hwConnection);
				if (result == null) result = caseHwResource(hwConnection);
				if (result == null) result = caseResource(hwConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public Object caseHwCommunicationResource(HwCommunicationResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Arbiter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Arbiter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwArbiter(HwArbiter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Media</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Media</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwMedia(HwMedia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Bus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Bus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwBus(HwBus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Bridge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Bridge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwBridge(HwBridge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw End Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw End Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwEndPoint(HwEndPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwPort(HwPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwConnection(HwConnection object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Communication Media</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Media</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCommunicationMedia(CommunicationMedia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication End Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication End Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCommunicationEndPoint(CommunicationEndPoint object) {
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

} //HwCommunicationSwitch
