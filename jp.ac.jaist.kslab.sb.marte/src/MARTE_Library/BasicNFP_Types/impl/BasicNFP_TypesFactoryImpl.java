/**
 */
package MARTE_Library.BasicNFP_Types.impl;

import MARTE_Library.BasicNFP_Types.*;

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
public class BasicNFP_TypesFactoryImpl extends EFactoryImpl implements BasicNFP_TypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasicNFP_TypesFactory init() {
		try {
			BasicNFP_TypesFactory theBasicNFP_TypesFactory = (BasicNFP_TypesFactory)EPackage.Registry.INSTANCE.getEFactory(BasicNFP_TypesPackage.eNS_URI);
			if (theBasicNFP_TypesFactory != null) {
				return theBasicNFP_TypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasicNFP_TypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicNFP_TypesFactoryImpl() {
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
			case BasicNFP_TypesPackage.NFP_COMMON_TYPE: return createNFP_CommonType();
			case BasicNFP_TypesPackage.NFP_FREQUENCY: return createNFP_Frequency();
			case BasicNFP_TypesPackage.NFP_REAL: return createNFP_Real();
			case BasicNFP_TypesPackage.NFP_NATURAL: return createNFP_Natural();
			case BasicNFP_TypesPackage.NFP_BOOLEAN: return createNFP_Boolean();
			case BasicNFP_TypesPackage.NFP_STRING: return createNFP_String();
			case BasicNFP_TypesPackage.NFP_INTEGER: return createNFP_Integer();
			case BasicNFP_TypesPackage.NFP_DATE_TIME: return createNFP_DateTime();
			case BasicNFP_TypesPackage.NFP_DATA_TX_RATE: return createNFP_DataTxRate();
			case BasicNFP_TypesPackage.NFP_POWER: return createNFP_Power();
			case BasicNFP_TypesPackage.NFP_DATA_SIZE: return createNFP_DataSize();
			case BasicNFP_TypesPackage.NFP_ENERGY: return createNFP_Energy();
			case BasicNFP_TypesPackage.NFP_LENGTH: return createNFP_Length();
			case BasicNFP_TypesPackage.NFP_AREA: return createNFP_Area();
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN: return createArrivalPattern();
			case BasicNFP_TypesPackage.PERIODIC_PATTERN: return createPeriodicPattern();
			case BasicNFP_TypesPackage.APERIODIC_PATTERN: return createAperiodicPattern();
			case BasicNFP_TypesPackage.BURST_PATTERN: return createBurstPattern();
			case BasicNFP_TypesPackage.IRREGULAR_PATTERN: return createIrregularPattern();
			case BasicNFP_TypesPackage.CLOSED_PATTERN: return createClosedPattern();
			case BasicNFP_TypesPackage.SPORADIC_PATTERN: return createSporadicPattern();
			case BasicNFP_TypesPackage.OPEN_PATTERN: return createOpenPattern();
			case BasicNFP_TypesPackage.NFP_PERCENTAGE: return createNFP_Percentage();
			case BasicNFP_TypesPackage.NFP_PRICE: return createNFP_Price();
			case BasicNFP_TypesPackage.NFP_WEIGHT: return createNFP_Weight();
			case BasicNFP_TypesPackage.NFP_DURATION: return createNFP_Duration();
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
			case BasicNFP_TypesPackage.SOURCE_KIND:
				return createSourceKindFromString(eDataType, initialValue);
			case BasicNFP_TypesPackage.DIRECTION_KIND:
				return createDirectionKindFromString(eDataType, initialValue);
			case BasicNFP_TypesPackage.STATISTICAL_QUALIFIER_KIND:
				return createStatisticalQualifierKindFromString(eDataType, initialValue);
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
			case BasicNFP_TypesPackage.SOURCE_KIND:
				return convertSourceKindToString(eDataType, instanceValue);
			case BasicNFP_TypesPackage.DIRECTION_KIND:
				return convertDirectionKindToString(eDataType, instanceValue);
			case BasicNFP_TypesPackage.STATISTICAL_QUALIFIER_KIND:
				return convertStatisticalQualifierKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_CommonType createNFP_CommonType() {
		NFP_CommonTypeImpl nfP_CommonType = new NFP_CommonTypeImpl();
		return nfP_CommonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Frequency createNFP_Frequency() {
		NFP_FrequencyImpl nfP_Frequency = new NFP_FrequencyImpl();
		return nfP_Frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Real createNFP_Real() {
		NFP_RealImpl nfP_Real = new NFP_RealImpl();
		return nfP_Real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Natural createNFP_Natural() {
		NFP_NaturalImpl nfP_Natural = new NFP_NaturalImpl();
		return nfP_Natural;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Boolean createNFP_Boolean() {
		NFP_BooleanImpl nfP_Boolean = new NFP_BooleanImpl();
		return nfP_Boolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_String createNFP_String() {
		NFP_StringImpl nfP_String = new NFP_StringImpl();
		return nfP_String;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Integer createNFP_Integer() {
		NFP_IntegerImpl nfP_Integer = new NFP_IntegerImpl();
		return nfP_Integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DateTime createNFP_DateTime() {
		NFP_DateTimeImpl nfP_DateTime = new NFP_DateTimeImpl();
		return nfP_DateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataTxRate createNFP_DataTxRate() {
		NFP_DataTxRateImpl nfP_DataTxRate = new NFP_DataTxRateImpl();
		return nfP_DataTxRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Power createNFP_Power() {
		NFP_PowerImpl nfP_Power = new NFP_PowerImpl();
		return nfP_Power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataSize createNFP_DataSize() {
		NFP_DataSizeImpl nfP_DataSize = new NFP_DataSizeImpl();
		return nfP_DataSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Energy createNFP_Energy() {
		NFP_EnergyImpl nfP_Energy = new NFP_EnergyImpl();
		return nfP_Energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Length createNFP_Length() {
		NFP_LengthImpl nfP_Length = new NFP_LengthImpl();
		return nfP_Length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Area createNFP_Area() {
		NFP_AreaImpl nfP_Area = new NFP_AreaImpl();
		return nfP_Area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrivalPattern createArrivalPattern() {
		ArrivalPatternImpl arrivalPattern = new ArrivalPatternImpl();
		return arrivalPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicPattern createPeriodicPattern() {
		PeriodicPatternImpl periodicPattern = new PeriodicPatternImpl();
		return periodicPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AperiodicPattern createAperiodicPattern() {
		AperiodicPatternImpl aperiodicPattern = new AperiodicPatternImpl();
		return aperiodicPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BurstPattern createBurstPattern() {
		BurstPatternImpl burstPattern = new BurstPatternImpl();
		return burstPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IrregularPattern createIrregularPattern() {
		IrregularPatternImpl irregularPattern = new IrregularPatternImpl();
		return irregularPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosedPattern createClosedPattern() {
		ClosedPatternImpl closedPattern = new ClosedPatternImpl();
		return closedPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SporadicPattern createSporadicPattern() {
		SporadicPatternImpl sporadicPattern = new SporadicPatternImpl();
		return sporadicPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenPattern createOpenPattern() {
		OpenPatternImpl openPattern = new OpenPatternImpl();
		return openPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Percentage createNFP_Percentage() {
		NFP_PercentageImpl nfP_Percentage = new NFP_PercentageImpl();
		return nfP_Percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Price createNFP_Price() {
		NFP_PriceImpl nfP_Price = new NFP_PriceImpl();
		return nfP_Price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Weight createNFP_Weight() {
		NFP_WeightImpl nfP_Weight = new NFP_WeightImpl();
		return nfP_Weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration createNFP_Duration() {
		NFP_DurationImpl nfP_Duration = new NFP_DurationImpl();
		return nfP_Duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceKind createSourceKindFromString(EDataType eDataType, String initialValue) {
		SourceKind result = SourceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSourceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionKind createDirectionKindFromString(EDataType eDataType, String initialValue) {
		DirectionKind result = DirectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticalQualifierKind createStatisticalQualifierKindFromString(EDataType eDataType, String initialValue) {
		StatisticalQualifierKind result = StatisticalQualifierKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatisticalQualifierKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicNFP_TypesPackage getBasicNFP_TypesPackage() {
		return (BasicNFP_TypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasicNFP_TypesPackage getPackage() {
		return BasicNFP_TypesPackage.eINSTANCE;
	}

} //BasicNFP_TypesFactoryImpl
