/**
 */
package MARTE_Library.MARTE_DataTypes.impl;

import MARTE_Library.MARTE_DataTypes.*;

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
public class MARTE_DataTypesFactoryImpl extends EFactoryImpl implements MARTE_DataTypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MARTE_DataTypesFactory init() {
		try {
			MARTE_DataTypesFactory theMARTE_DataTypesFactory = (MARTE_DataTypesFactory)EPackage.Registry.INSTANCE.getEFactory(MARTE_DataTypesPackage.eNS_URI);
			if (theMARTE_DataTypesFactory != null) {
				return theMARTE_DataTypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MARTE_DataTypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MARTE_DataTypesFactoryImpl() {
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
			case MARTE_DataTypesPackage.INTEGER_VECTOR: return createIntegerVector();
			case MARTE_DataTypesPackage.INTEGER_MATRIX: return createIntegerMatrix();
			case MARTE_DataTypesPackage.INTEGER_INTERVAL: return createIntegerInterval();
			case MARTE_DataTypesPackage.UTILITY_TYPE: return createUtilityType();
			case MARTE_DataTypesPackage.ARRAY: return createArray();
			case MARTE_DataTypesPackage.INTERVAL: return createInterval();
			case MARTE_DataTypesPackage.REALNTERVAL: return createRealnterval();
			case MARTE_DataTypesPackage.NFP_FREQUENCY_INTERVAL: return createNFP_FrequencyInterval();
			case MARTE_DataTypesPackage.NFP_NATURAL_INTERVAL: return createNFP_NaturalInterval();
			case MARTE_DataTypesPackage.REAL_VECTOR: return createRealVector();
			case MARTE_DataTypesPackage.REAL_MATRIX: return createRealMatrix();
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
			case MARTE_DataTypesPackage.TRANSM_MODE_KIND:
				return createTransmModeKindFromString(eDataType, initialValue);
			case MARTE_DataTypesPackage.VSL_EXPRESSION:
				return createVSL_ExpressionFromString(eDataType, initialValue);
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
			case MARTE_DataTypesPackage.TRANSM_MODE_KIND:
				return convertTransmModeKindToString(eDataType, instanceValue);
			case MARTE_DataTypesPackage.VSL_EXPRESSION:
				return convertVSL_ExpressionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVector createIntegerVector() {
		IntegerVectorImpl integerVector = new IntegerVectorImpl();
		return integerVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerMatrix createIntegerMatrix() {
		IntegerMatrixImpl integerMatrix = new IntegerMatrixImpl();
		return integerMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerInterval createIntegerInterval() {
		IntegerIntervalImpl integerInterval = new IntegerIntervalImpl();
		return integerInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilityType createUtilityType() {
		UtilityTypeImpl utilityType = new UtilityTypeImpl();
		return utilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> Array<T> createArray() {
		ArrayImpl<T> array = new ArrayImpl<T>();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T1, T2> Interval<T1, T2> createInterval() {
		IntervalImpl<T1, T2> interval = new IntervalImpl<T1, T2>();
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realnterval createRealnterval() {
		RealntervalImpl realnterval = new RealntervalImpl();
		return realnterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_FrequencyInterval createNFP_FrequencyInterval() {
		NFP_FrequencyIntervalImpl nfP_FrequencyInterval = new NFP_FrequencyIntervalImpl();
		return nfP_FrequencyInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_NaturalInterval createNFP_NaturalInterval() {
		NFP_NaturalIntervalImpl nfP_NaturalInterval = new NFP_NaturalIntervalImpl();
		return nfP_NaturalInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealVector createRealVector() {
		RealVectorImpl realVector = new RealVectorImpl();
		return realVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealMatrix createRealMatrix() {
		RealMatrixImpl realMatrix = new RealMatrixImpl();
		return realMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmModeKind createTransmModeKindFromString(EDataType eDataType, String initialValue) {
		TransmModeKind result = TransmModeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransmModeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createVSL_ExpressionFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVSL_ExpressionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MARTE_DataTypesPackage getMARTE_DataTypesPackage() {
		return (MARTE_DataTypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MARTE_DataTypesPackage getPackage() {
		return MARTE_DataTypesPackage.eINSTANCE;
	}

} //MARTE_DataTypesFactoryImpl
