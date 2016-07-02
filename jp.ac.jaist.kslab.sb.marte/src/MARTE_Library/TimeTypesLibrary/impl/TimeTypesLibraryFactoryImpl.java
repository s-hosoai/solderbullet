/**
 */
package MARTE_Library.TimeTypesLibrary.impl;

import MARTE_Library.TimeTypesLibrary.*;

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
public class TimeTypesLibraryFactoryImpl extends EFactoryImpl implements TimeTypesLibraryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimeTypesLibraryFactory init() {
		try {
			TimeTypesLibraryFactory theTimeTypesLibraryFactory = (TimeTypesLibraryFactory)EPackage.Registry.INSTANCE.getEFactory(TimeTypesLibraryPackage.eNS_URI);
			if (theTimeTypesLibraryFactory != null) {
				return theTimeTypesLibraryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TimeTypesLibraryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTypesLibraryFactoryImpl() {
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
			case TimeTypesLibraryPackage.TIME_NATURE_KIND:
				return createTimeNatureKindFromString(eDataType, initialValue);
			case TimeTypesLibraryPackage.TIME_INTERPRETATION_KIND:
				return createTimeInterpretationKindFromString(eDataType, initialValue);
			case TimeTypesLibraryPackage.EVENT_KIND:
				return createEventKindFromString(eDataType, initialValue);
			case TimeTypesLibraryPackage.TIME_STANDARD_KIND:
				return createTimeStandardKindFromString(eDataType, initialValue);
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
			case TimeTypesLibraryPackage.TIME_NATURE_KIND:
				return convertTimeNatureKindToString(eDataType, instanceValue);
			case TimeTypesLibraryPackage.TIME_INTERPRETATION_KIND:
				return convertTimeInterpretationKindToString(eDataType, instanceValue);
			case TimeTypesLibraryPackage.EVENT_KIND:
				return convertEventKindToString(eDataType, instanceValue);
			case TimeTypesLibraryPackage.TIME_STANDARD_KIND:
				return convertTimeStandardKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeNatureKind createTimeNatureKindFromString(EDataType eDataType, String initialValue) {
		TimeNatureKind result = TimeNatureKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeNatureKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterpretationKind createTimeInterpretationKindFromString(EDataType eDataType, String initialValue) {
		TimeInterpretationKind result = TimeInterpretationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeInterpretationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventKind createEventKindFromString(EDataType eDataType, String initialValue) {
		EventKind result = EventKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStandardKind createTimeStandardKindFromString(EDataType eDataType, String initialValue) {
		TimeStandardKind result = TimeStandardKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeStandardKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTypesLibraryPackage getTimeTypesLibraryPackage() {
		return (TimeTypesLibraryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TimeTypesLibraryPackage getPackage() {
		return TimeTypesLibraryPackage.eINSTANCE;
	}

} //TimeTypesLibraryFactoryImpl
