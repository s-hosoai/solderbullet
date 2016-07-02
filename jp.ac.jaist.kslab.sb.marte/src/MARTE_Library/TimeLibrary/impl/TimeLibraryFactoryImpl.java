/**
 */
package MARTE_Library.TimeLibrary.impl;

import MARTE_Library.TimeLibrary.*;

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
public class TimeLibraryFactoryImpl extends EFactoryImpl implements TimeLibraryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimeLibraryFactory init() {
		try {
			TimeLibraryFactory theTimeLibraryFactory = (TimeLibraryFactory)EPackage.Registry.INSTANCE.getEFactory(TimeLibraryPackage.eNS_URI);
			if (theTimeLibraryFactory != null) {
				return theTimeLibraryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TimeLibraryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLibraryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TimeLibraryPackage.TIMED_VALUE_TYPE: return createTimedValueType();
			case TimeLibraryPackage.IDEAL_CLOCK: return createIdealClock();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TimeLibraryPackage.TUK:
				return createTUKFromString(eDataType, initialValue);
			case TimeLibraryPackage.TIME_UNIT_KIND:
				return createTimeUnitKindFromString(eDataType, initialValue);
			case TimeLibraryPackage.LOGICAL_TIME_UNIT:
				return createLogicalTimeUnitFromString(eDataType, initialValue);
			case TimeLibraryPackage.CLOCKED_VALUE_SPECIFICATION:
				return createClockedValueSpecificationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TimeLibraryPackage.TUK:
				return convertTUKToString(eDataType, instanceValue);
			case TimeLibraryPackage.TIME_UNIT_KIND:
				return convertTimeUnitKindToString(eDataType, instanceValue);
			case TimeLibraryPackage.LOGICAL_TIME_UNIT:
				return convertLogicalTimeUnitToString(eDataType, instanceValue);
			case TimeLibraryPackage.CLOCKED_VALUE_SPECIFICATION:
				return convertClockedValueSpecificationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedValueType createTimedValueType() {
		TimedValueTypeImpl timedValueType = new TimedValueTypeImpl();
		return timedValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdealClock createIdealClock() {
		IdealClockImpl idealClock = new IdealClockImpl();
		return idealClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TUK createTUKFromString(EDataType eDataType, String initialValue) {
		TUK result = TUK.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTUKToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnitKind createTimeUnitKindFromString(EDataType eDataType, String initialValue) {
		TimeUnitKind result = TimeUnitKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalTimeUnit createLogicalTimeUnitFromString(EDataType eDataType, String initialValue) {
		LogicalTimeUnit result = LogicalTimeUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalTimeUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createClockedValueSpecificationFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClockedValueSpecificationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLibraryPackage getTimeLibraryPackage() {
		return (TimeLibraryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TimeLibraryPackage getPackage() {
		return TimeLibraryPackage.eINSTANCE;
	}

} //TimeLibraryFactoryImpl
