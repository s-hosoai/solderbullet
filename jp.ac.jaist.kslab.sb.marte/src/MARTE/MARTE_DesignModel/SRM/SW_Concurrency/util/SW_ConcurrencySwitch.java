/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Concurrency.util;

import MARTE.MARTE_DesignModel.SRM.SW_Concurrency.*;

import MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwResource;

import MARTE.MARTE_Foundations.Alloc.Allocate;

import MARTE.MARTE_Foundations.GRM.Resource;
import MARTE.MARTE_Foundations.GRM.SchedulableResource;
import MARTE.MARTE_Foundations.GRM.TimerResource;
import MARTE.MARTE_Foundations.GRM.TimingResource;

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
 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage
 * @generated
 */
public class SW_ConcurrencySwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SW_ConcurrencyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SW_ConcurrencySwitch() {
		if (modelPackage == null) {
			modelPackage = SW_ConcurrencyPackage.eINSTANCE;
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
			case SW_ConcurrencyPackage.ENTRY_POINT: {
				EntryPoint entryPoint = (EntryPoint)theEObject;
				Object result = caseEntryPoint(entryPoint);
				if (result == null) result = caseAllocate(entryPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE: {
				SwConcurrentResource swConcurrentResource = (SwConcurrentResource)theEObject;
				Object result = caseSwConcurrentResource(swConcurrentResource);
				if (result == null) result = caseSwResource(swConcurrentResource);
				if (result == null) result = caseResource(swConcurrentResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE: {
				InterruptResource interruptResource = (InterruptResource)theEObject;
				Object result = caseInterruptResource(interruptResource);
				if (result == null) result = caseSwConcurrentResource(interruptResource);
				if (result == null) result = caseSwResource(interruptResource);
				if (result == null) result = caseResource(interruptResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE: {
				SwSchedulableResource swSchedulableResource = (SwSchedulableResource)theEObject;
				Object result = caseSwSchedulableResource(swSchedulableResource);
				if (result == null) result = caseSwConcurrentResource(swSchedulableResource);
				if (result == null) result = caseSchedulableResource(swSchedulableResource);
				if (result == null) result = caseSwResource(swSchedulableResource);
				if (result == null) result = caseResource(swSchedulableResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SW_ConcurrencyPackage.SW_TIMER_RESOURCE: {
				SwTimerResource swTimerResource = (SwTimerResource)theEObject;
				Object result = caseSwTimerResource(swTimerResource);
				if (result == null) result = caseTimerResource(swTimerResource);
				if (result == null) result = caseTimingResource(swTimerResource);
				if (result == null) result = caseResource(swTimerResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SW_ConcurrencyPackage.MEMORY_PARTITION: {
				MemoryPartition memoryPartition = (MemoryPartition)theEObject;
				Object result = caseMemoryPartition(memoryPartition);
				if (result == null) result = caseSwResource(memoryPartition);
				if (result == null) result = caseResource(memoryPartition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SW_ConcurrencyPackage.ALARM: {
				Alarm alarm = (Alarm)theEObject;
				Object result = caseAlarm(alarm);
				if (result == null) result = caseInterruptResource(alarm);
				if (result == null) result = caseSwConcurrentResource(alarm);
				if (result == null) result = caseSwResource(alarm);
				if (result == null) result = caseResource(alarm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEntryPoint(EntryPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sw Concurrent Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sw Concurrent Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSwConcurrentResource(SwConcurrentResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interrupt Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interrupt Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInterruptResource(InterruptResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sw Schedulable Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sw Schedulable Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSwSchedulableResource(SwSchedulableResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sw Timer Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sw Timer Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSwTimerResource(SwTimerResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Partition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Partition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMemoryPartition(MemoryPartition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alarm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAlarm(Alarm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAllocate(Allocate object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Sw Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sw Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSwResource(SwResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedulable Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedulable Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSchedulableResource(SchedulableResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimingResource(TimingResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timer Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timer Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimerResource(TimerResource object) {
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

} //SW_ConcurrencySwitch
