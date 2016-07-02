/**
 */
package MARTE.MARTE_Foundations.Time.util;

import MARTE.MARTE_Foundations.NFPs.NfpConstraint;

import MARTE.MARTE_Foundations.Time.*;

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
 * @see MARTE.MARTE_Foundations.Time.TimePackage
 * @generated
 */
public class TimeSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TimePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSwitch() {
		if (modelPackage == null) {
			modelPackage = TimePackage.eINSTANCE;
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
			case TimePackage.TIMED_DOMAIN: {
				TimedDomain timedDomain = (TimedDomain)theEObject;
				Object result = caseTimedDomain(timedDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimePackage.CLOCK: {
				Clock clock = (Clock)theEObject;
				Object result = caseClock(clock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimePackage.CLOCK_TYPE: {
				ClockType clockType = (ClockType)theEObject;
				Object result = caseClockType(clockType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimePackage.TIMED_ELEMENT: {
				TimedElement timedElement = (TimedElement)theEObject;
				Object result = caseTimedElement(timedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimePackage.TIMED_VALUE_SPECIFICATION: {
				TimedValueSpecification timedValueSpecification = (TimedValueSpecification)theEObject;
				Object result = caseTimedValueSpecification(timedValueSpecification);
				if (result == null) result = caseTimedElement(timedValueSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimePackage.TIMED_CONSTRAINT: {
				TimedConstraint timedConstraint = (TimedConstraint)theEObject;
				Object result = caseTimedConstraint(timedConstraint);
				if (result == null) result = caseNfpConstraint(timedConstraint);
				if (result == null) result = caseTimedElement(timedConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimePackage.CLOCK_CONSTRAINT: {
				ClockConstraint clockConstraint = (ClockConstraint)theEObject;
				Object result = caseClockConstraint(clockConstraint);
				if (result == null) result = caseNfpConstraint(clockConstraint);
				if (result == null) result = caseTimedElement(clockConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimePackage.TIMED_OBSERVATION: {
				TimedObservation timedObservation = (TimedObservation)theEObject;
				Object result = caseTimedObservation(timedObservation);
				if (result == null) result = caseTimedElement(timedObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimePackage.TIMED_INSTANT_OBSERVATION: {
				TimedInstantObservation timedInstantObservation = (TimedInstantObservation)theEObject;
				Object result = caseTimedInstantObservation(timedInstantObservation);
				if (result == null) result = caseTimedObservation(timedInstantObservation);
				if (result == null) result = caseTimedElement(timedInstantObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimePackage.TIMED_DURATION_OBSERVATION: {
				TimedDurationObservation timedDurationObservation = (TimedDurationObservation)theEObject;
				Object result = caseTimedDurationObservation(timedDurationObservation);
				if (result == null) result = caseTimedObservation(timedDurationObservation);
				if (result == null) result = caseTimedElement(timedDurationObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimePackage.TIMED_EVENT: {
				TimedEvent timedEvent = (TimedEvent)theEObject;
				Object result = caseTimedEvent(timedEvent);
				if (result == null) result = caseTimedElement(timedEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimePackage.TIMED_PROCESSING: {
				TimedProcessing timedProcessing = (TimedProcessing)theEObject;
				Object result = caseTimedProcessing(timedProcessing);
				if (result == null) result = caseTimedElement(timedProcessing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimedDomain(TimedDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClock(Clock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClockType(ClockType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimedElement(TimedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Value Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimedValueSpecification(TimedValueSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimedConstraint(TimedConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClockConstraint(ClockConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimedObservation(TimedObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Instant Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Instant Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimedInstantObservation(TimedInstantObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Duration Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Duration Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimedDurationObservation(TimedDurationObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimedEvent(TimedEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Processing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Processing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimedProcessing(TimedProcessing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nfp Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nfp Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNfpConstraint(NfpConstraint object) {
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

} //TimeSwitch
