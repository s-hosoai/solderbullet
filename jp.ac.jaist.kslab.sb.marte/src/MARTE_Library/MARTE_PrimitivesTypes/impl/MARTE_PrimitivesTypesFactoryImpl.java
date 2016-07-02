/**
 */
package MARTE_Library.MARTE_PrimitivesTypes.impl;

import MARTE_Library.MARTE_PrimitivesTypes.*;

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
public class MARTE_PrimitivesTypesFactoryImpl extends EFactoryImpl implements MARTE_PrimitivesTypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MARTE_PrimitivesTypesFactory init() {
		try {
			MARTE_PrimitivesTypesFactory theMARTE_PrimitivesTypesFactory = (MARTE_PrimitivesTypesFactory)EPackage.Registry.INSTANCE.getEFactory(MARTE_PrimitivesTypesPackage.eNS_URI);
			if (theMARTE_PrimitivesTypesFactory != null) {
				return theMARTE_PrimitivesTypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MARTE_PrimitivesTypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MARTE_PrimitivesTypesFactoryImpl() {
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
			case MARTE_PrimitivesTypesPackage.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			case MARTE_PrimitivesTypesPackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case MARTE_PrimitivesTypesPackage.UNLIMITED_NATURAL:
				return createUnlimitedNaturalFromString(eDataType, initialValue);
			case MARTE_PrimitivesTypesPackage.STRING:
				return createStringFromString(eDataType, initialValue);
			case MARTE_PrimitivesTypesPackage.DATE_TIME:
				return createDateTimeFromString(eDataType, initialValue);
			case MARTE_PrimitivesTypesPackage.REAL:
				return createRealFromString(eDataType, initialValue);
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
			case MARTE_PrimitivesTypesPackage.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			case MARTE_PrimitivesTypesPackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case MARTE_PrimitivesTypesPackage.UNLIMITED_NATURAL:
				return convertUnlimitedNaturalToString(eDataType, instanceValue);
			case MARTE_PrimitivesTypesPackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			case MARTE_PrimitivesTypesPackage.DATE_TIME:
				return convertDateTimeToString(eDataType, instanceValue);
			case MARTE_PrimitivesTypesPackage.REAL:
				return convertRealToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createIntegerFromString(EDataType eDataType, String initialValue) {
		return (Object)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Object)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createUnlimitedNaturalFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnlimitedNaturalToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createStringFromString(EDataType eDataType, String initialValue) {
		return (Object)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createDateTimeFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createRealFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRealToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MARTE_PrimitivesTypesPackage getMARTE_PrimitivesTypesPackage() {
		return (MARTE_PrimitivesTypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MARTE_PrimitivesTypesPackage getPackage() {
		return MARTE_PrimitivesTypesPackage.eINSTANCE;
	}

} //MARTE_PrimitivesTypesFactoryImpl
