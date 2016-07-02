/**
 */
package MARTE.MARTE_Foundations.GRM.util;

import MARTE.MARTE_Foundations.GRM.*;

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
 * @see MARTE.MARTE_Foundations.GRM.GRMPackage
 * @generated
 */
public class GRMSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GRMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRMSwitch() {
		if (modelPackage == null) {
			modelPackage = GRMPackage.eINSTANCE;
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
			case GRMPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				Object result = caseResource(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRMPackage.STORAGE_RESOURCE: {
				StorageResource storageResource = (StorageResource)theEObject;
				Object result = caseStorageResource(storageResource);
				if (result == null) result = caseResource(storageResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRMPackage.COMMUNICATION_END_POINT: {
				CommunicationEndPoint communicationEndPoint = (CommunicationEndPoint)theEObject;
				Object result = caseCommunicationEndPoint(communicationEndPoint);
				if (result == null) result = caseResource(communicationEndPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRMPackage.SYNCHRONIZATION_RESOURCE: {
				SynchronizationResource synchronizationResource = (SynchronizationResource)theEObject;
				Object result = caseSynchronizationResource(synchronizationResource);
				if (result == null) result = caseResource(synchronizationResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRMPackage.CONCURRENCY_RESOURCE: {
				ConcurrencyResource concurrencyResource = (ConcurrencyResource)theEObject;
				Object result = caseConcurrencyResource(concurrencyResource);
				if (result == null) result = caseResource(concurrencyResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRMPackage.SCHEDULER: {
				Scheduler scheduler = (Scheduler)theEObject;
				Object result = caseScheduler(scheduler);
				if (result == null) result = caseResource(scheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRMPackage.PROCESSING_RESOURCE: {
				ProcessingResource processingResource = (ProcessingResource)theEObject;
				Object result = caseProcessingResource(processingResource);
				if (result == null) result = caseResource(processingResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRMPackage.COMPUTING_RESOURCE: {
				ComputingResource computingResource = (ComputingResource)theEObject;
				Object result = caseComputingResource(computingResource);
				if (result == null) result = caseProcessingResource(computingResource);
				if (result == null) result = caseResource(computingResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRMPackage.MUTUAL_EXCLUSION_RESOURCE: {
				MutualExclusionResource mutualExclusionResource = (MutualExclusionResource)theEObject;
				Object result = caseMutualExclusionResource(mutualExclusionResource);
				if (result == null) result = caseResource(mutualExclusionResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRMPackage.SCHEDULABLE_RESOURCE: {
				SchedulableResource schedulableResource = (SchedulableResource)theEObject;
				Object result = caseSchedulableResource(schedulableResource);
				if (result == null) result = caseResource(schedulableResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRMPackage.SECONDARY_SCHEDULER: {
				SecondaryScheduler secondaryScheduler = (SecondaryScheduler)theEObject;
				Object result = caseSecondaryScheduler(secondaryScheduler);
				if (result == null) result = caseScheduler(secondaryScheduler);
				if (result == null) result = caseResource(secondaryScheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRMPackage.COMMUNICATION_MEDIA: {
				CommunicationMedia communicationMedia = (CommunicationMedia)theEObject;
				Object result = caseCommunicationMedia(communicationMedia);
				if (result == null) result = caseProcessingResource(communicationMedia);
				if (result == null) result = caseResource(communicationMedia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRMPackage.DEVICE_RESOURCE: {
				DeviceResource deviceResource = (DeviceResource)theEObject;
				Object result = caseDeviceResource(deviceResource);
				if (result == null) result = caseProcessingResource(deviceResource);
				if (result == null) result = caseResource(deviceResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRMPackage.TIMING_RESOURCE: {
				TimingResource timingResource = (TimingResource)theEObject;
				Object result = caseTimingResource(timingResource);
				if (result == null) result = caseResource(timingResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRMPackage.CLOCK_RESOURCE: {
				ClockResource clockResource = (ClockResource)theEObject;
				Object result = caseClockResource(clockResource);
				if (result == null) result = caseTimingResource(clockResource);
				if (result == null) result = caseResource(clockResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRMPackage.TIMER_RESOURCE: {
				TimerResource timerResource = (TimerResource)theEObject;
				Object result = caseTimerResource(timerResource);
				if (result == null) result = caseTimingResource(timerResource);
				if (result == null) result = caseResource(timerResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRMPackage.GR_SERVICE: {
				GrService grService = (GrService)theEObject;
				Object result = caseGrService(grService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRMPackage.RELEASE: {
				Release release = (Release)theEObject;
				Object result = caseRelease(release);
				if (result == null) result = caseGrService(release);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRMPackage.ACQUIRE: {
				Acquire acquire = (Acquire)theEObject;
				Object result = caseAcquire(acquire);
				if (result == null) result = caseGrService(acquire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRMPackage.RESOURCE_USAGE: {
				ResourceUsage resourceUsage = (ResourceUsage)theEObject;
				Object result = caseResourceUsage(resourceUsage);
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
	public Object caseResource(Resource object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSynchronizationResource(SynchronizationResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concurrency Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concurrency Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConcurrencyResource(ConcurrencyResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseScheduler(Scheduler object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Computing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computing Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComputingResource(ComputingResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mutual Exclusion Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mutual Exclusion Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMutualExclusionResource(MutualExclusionResource object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Secondary Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secondary Scheduler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSecondaryScheduler(SecondaryScheduler object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Clock Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClockResource(ClockResource object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Gr Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gr Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGrService(GrService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRelease(Release object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acquire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acquire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAcquire(Acquire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResourceUsage(ResourceUsage object) {
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

} //GRMSwitch
