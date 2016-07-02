/**
 */
package MARTE.MARTE_Foundations.Time.impl;

import MARTE.MARTE_Foundations.Time.*;

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
public class TimeFactoryImpl extends EFactoryImpl implements TimeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimeFactory init() {
		try {
			TimeFactory theTimeFactory = (TimeFactory)EPackage.Registry.INSTANCE.getEFactory(TimePackage.eNS_URI);
			if (theTimeFactory != null) {
				return theTimeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TimeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TimePackage.TIMED_DOMAIN: return createTimedDomain();
			case TimePackage.CLOCK: return createClock();
			case TimePackage.CLOCK_TYPE: return createClockType();
			case TimePackage.TIMED_VALUE_SPECIFICATION: return createTimedValueSpecification();
			case TimePackage.TIMED_CONSTRAINT: return createTimedConstraint();
			case TimePackage.CLOCK_CONSTRAINT: return createClockConstraint();
			case TimePackage.TIMED_INSTANT_OBSERVATION: return createTimedInstantObservation();
			case TimePackage.TIMED_DURATION_OBSERVATION: return createTimedDurationObservation();
			case TimePackage.TIMED_EVENT: return createTimedEvent();
			case TimePackage.TIMED_PROCESSING: return createTimedProcessing();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedDomain createTimedDomain() {
		TimedDomainImpl timedDomain = new TimedDomainImpl();
		return timedDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock createClock() {
		ClockImpl clock = new ClockImpl();
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockType createClockType() {
		ClockTypeImpl clockType = new ClockTypeImpl();
		return clockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedValueSpecification createTimedValueSpecification() {
		TimedValueSpecificationImpl timedValueSpecification = new TimedValueSpecificationImpl();
		return timedValueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedConstraint createTimedConstraint() {
		TimedConstraintImpl timedConstraint = new TimedConstraintImpl();
		return timedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockConstraint createClockConstraint() {
		ClockConstraintImpl clockConstraint = new ClockConstraintImpl();
		return clockConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedInstantObservation createTimedInstantObservation() {
		TimedInstantObservationImpl timedInstantObservation = new TimedInstantObservationImpl();
		return timedInstantObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedDurationObservation createTimedDurationObservation() {
		TimedDurationObservationImpl timedDurationObservation = new TimedDurationObservationImpl();
		return timedDurationObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedEvent createTimedEvent() {
		TimedEventImpl timedEvent = new TimedEventImpl();
		return timedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedProcessing createTimedProcessing() {
		TimedProcessingImpl timedProcessing = new TimedProcessingImpl();
		return timedProcessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePackage getTimePackage() {
		return (TimePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static TimePackage getPackage() {
		return TimePackage.eINSTANCE;
	}

} //TimeFactoryImpl
