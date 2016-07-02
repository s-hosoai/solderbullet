/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.util;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.*;

import MARTE.MARTE_Foundations.GRM.Resource;
import MARTE.MARTE_Foundations.GRM.StorageResource;

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
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage
 * @generated
 */
public class HwMemorySwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HwMemoryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwMemorySwitch() {
		if (modelPackage == null) {
			modelPackage = HwMemoryPackage.eINSTANCE;
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
			case HwMemoryPackage.HW_MEMORY: {
				HwMemory hwMemory = (HwMemory)theEObject;
				Object result = caseHwMemory(hwMemory);
				if (result == null) result = caseHwResource(hwMemory);
				if (result == null) result = caseStorageResource(hwMemory);
				if (result == null) result = caseResource(hwMemory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwMemoryPackage.TIMING: {
				Timing timing = (Timing)theEObject;
				Object result = caseTiming(timing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwMemoryPackage.CACHE_STRUCTURE: {
				CacheStructure cacheStructure = (CacheStructure)theEObject;
				Object result = caseCacheStructure(cacheStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwMemoryPackage.MEMORY_ORGANIZATION: {
				MemoryOrganization memoryOrganization = (MemoryOrganization)theEObject;
				Object result = caseMemoryOrganization(memoryOrganization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwMemoryPackage.HW_RAM: {
				HwRAM hwRAM = (HwRAM)theEObject;
				Object result = caseHwRAM(hwRAM);
				if (result == null) result = caseHwMemory(hwRAM);
				if (result == null) result = caseHwResource(hwRAM);
				if (result == null) result = caseStorageResource(hwRAM);
				if (result == null) result = caseResource(hwRAM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwMemoryPackage.HW_ROM: {
				HwROM hwROM = (HwROM)theEObject;
				Object result = caseHwROM(hwROM);
				if (result == null) result = caseHwMemory(hwROM);
				if (result == null) result = caseHwResource(hwROM);
				if (result == null) result = caseStorageResource(hwROM);
				if (result == null) result = caseResource(hwROM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwMemoryPackage.HW_DRIVE: {
				HwDrive hwDrive = (HwDrive)theEObject;
				Object result = caseHwDrive(hwDrive);
				if (result == null) result = caseHwMemory(hwDrive);
				if (result == null) result = caseHwResource(hwDrive);
				if (result == null) result = caseStorageResource(hwDrive);
				if (result == null) result = caseResource(hwDrive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwMemoryPackage.HW_CACHE: {
				HwCache hwCache = (HwCache)theEObject;
				Object result = caseHwCache(hwCache);
				if (result == null) result = caseHwMemory(hwCache);
				if (result == null) result = caseHwResource(hwCache);
				if (result == null) result = caseStorageResource(hwCache);
				if (result == null) result = caseResource(hwCache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwMemory(HwMemory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTiming(Timing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cache Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cache Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCacheStructure(CacheStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMemoryOrganization(MemoryOrganization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw RAM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw RAM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwRAM(HwRAM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw ROM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw ROM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwROM(HwROM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Drive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Drive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwDrive(HwDrive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwCache(HwCache object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Storage Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStorageResource(StorageResource object) {
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

} //HwMemorySwitch
