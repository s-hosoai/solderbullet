/**
 */
package MARTE_Library.BasicNFP_Types.impl;

import MARTE_Library.BasicNFP_Types.AperiodicPattern;
import MARTE_Library.BasicNFP_Types.ArrivalPattern;
import MARTE_Library.BasicNFP_Types.BasicNFP_TypesFactory;
import MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;
import MARTE_Library.BasicNFP_Types.BurstPattern;
import MARTE_Library.BasicNFP_Types.ClosedPattern;
import MARTE_Library.BasicNFP_Types.DirectionKind;
import MARTE_Library.BasicNFP_Types.IrregularPattern;
import MARTE_Library.BasicNFP_Types.NFP_Area;
import MARTE_Library.BasicNFP_Types.NFP_Boolean;
import MARTE_Library.BasicNFP_Types.NFP_CommonType;
import MARTE_Library.BasicNFP_Types.NFP_DataSize;
import MARTE_Library.BasicNFP_Types.NFP_DataTxRate;
import MARTE_Library.BasicNFP_Types.NFP_DateTime;
import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Energy;
import MARTE_Library.BasicNFP_Types.NFP_Frequency;
import MARTE_Library.BasicNFP_Types.NFP_Integer;
import MARTE_Library.BasicNFP_Types.NFP_Length;
import MARTE_Library.BasicNFP_Types.NFP_Natural;
import MARTE_Library.BasicNFP_Types.NFP_Percentage;
import MARTE_Library.BasicNFP_Types.NFP_Power;
import MARTE_Library.BasicNFP_Types.NFP_Price;
import MARTE_Library.BasicNFP_Types.NFP_Real;
import MARTE_Library.BasicNFP_Types.NFP_String;
import MARTE_Library.BasicNFP_Types.NFP_Weight;
import MARTE_Library.BasicNFP_Types.OpenPattern;
import MARTE_Library.BasicNFP_Types.PeriodicPattern;
import MARTE_Library.BasicNFP_Types.SourceKind;
import MARTE_Library.BasicNFP_Types.SporadicPattern;
import MARTE_Library.BasicNFP_Types.StatisticalQualifierKind;

import MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage;

import MARTE_Library.GRM_BasicTypes.impl.GRM_BasicTypesPackageImpl;

import MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage;

import MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl;

import MARTE_Library.MARTE_PrimitivesTypes.MARTE_PrimitivesTypesPackage;

import MARTE_Library.MARTE_PrimitivesTypes.impl.MARTE_PrimitivesTypesPackageImpl;

import MARTE_Library.MeasurementUnits.MeasurementUnitsPackage;

import MARTE_Library.MeasurementUnits.impl.MeasurementUnitsPackageImpl;

import MARTE_Library.RS_Library.RS_LibraryPackage;

import MARTE_Library.RS_Library.impl.RS_LibraryPackageImpl;

import MARTE_Library.TimeLibrary.TimeLibraryPackage;

import MARTE_Library.TimeLibrary.impl.TimeLibraryPackageImpl;

import MARTE_Library.TimeTypesLibrary.TimeTypesLibraryPackage;

import MARTE_Library.TimeTypesLibrary.impl.TimeTypesLibraryPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicNFP_TypesPackageImpl extends EPackageImpl implements BasicNFP_TypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_CommonTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_FrequencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_RealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_NaturalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_BooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_StringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_IntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_DateTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_DataTxRateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_PowerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_DataSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_EnergyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_LengthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_AreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrivalPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aperiodicPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass burstPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass irregularPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closedPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sporadicPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_PercentageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_PriceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_WeightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_DurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sourceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statisticalQualifierKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasicNFP_TypesPackageImpl() {
		super(eNS_URI, BasicNFP_TypesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BasicNFP_TypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasicNFP_TypesPackage init() {
		if (isInited) return (BasicNFP_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI);

		// Obtain or create and register package
		BasicNFP_TypesPackageImpl theBasicNFP_TypesPackage = (BasicNFP_TypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BasicNFP_TypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BasicNFP_TypesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MeasurementUnitsPackageImpl theMeasurementUnitsPackage = (MeasurementUnitsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasurementUnitsPackage.eNS_URI) instanceof MeasurementUnitsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasurementUnitsPackage.eNS_URI) : MeasurementUnitsPackage.eINSTANCE);
		GRM_BasicTypesPackageImpl theGRM_BasicTypesPackage = (GRM_BasicTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GRM_BasicTypesPackage.eNS_URI) instanceof GRM_BasicTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GRM_BasicTypesPackage.eNS_URI) : GRM_BasicTypesPackage.eINSTANCE);
		MARTE_DataTypesPackageImpl theMARTE_DataTypesPackage = (MARTE_DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MARTE_DataTypesPackage.eNS_URI) instanceof MARTE_DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MARTE_DataTypesPackage.eNS_URI) : MARTE_DataTypesPackage.eINSTANCE);
		TimeTypesLibraryPackageImpl theTimeTypesLibraryPackage = (TimeTypesLibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimeTypesLibraryPackage.eNS_URI) instanceof TimeTypesLibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimeTypesLibraryPackage.eNS_URI) : TimeTypesLibraryPackage.eINSTANCE);
		TimeLibraryPackageImpl theTimeLibraryPackage = (TimeLibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimeLibraryPackage.eNS_URI) instanceof TimeLibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimeLibraryPackage.eNS_URI) : TimeLibraryPackage.eINSTANCE);
		RS_LibraryPackageImpl theRS_LibraryPackage = (RS_LibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RS_LibraryPackage.eNS_URI) instanceof RS_LibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RS_LibraryPackage.eNS_URI) : RS_LibraryPackage.eINSTANCE);
		MARTE_PrimitivesTypesPackageImpl theMARTE_PrimitivesTypesPackage = (MARTE_PrimitivesTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MARTE_PrimitivesTypesPackage.eNS_URI) instanceof MARTE_PrimitivesTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MARTE_PrimitivesTypesPackage.eNS_URI) : MARTE_PrimitivesTypesPackage.eINSTANCE);

		// Create package meta-data objects
		theBasicNFP_TypesPackage.createPackageContents();
		theMeasurementUnitsPackage.createPackageContents();
		theGRM_BasicTypesPackage.createPackageContents();
		theMARTE_DataTypesPackage.createPackageContents();
		theTimeTypesLibraryPackage.createPackageContents();
		theTimeLibraryPackage.createPackageContents();
		theRS_LibraryPackage.createPackageContents();
		theMARTE_PrimitivesTypesPackage.createPackageContents();

		// Initialize created meta-data
		theBasicNFP_TypesPackage.initializePackageContents();
		theMeasurementUnitsPackage.initializePackageContents();
		theGRM_BasicTypesPackage.initializePackageContents();
		theMARTE_DataTypesPackage.initializePackageContents();
		theTimeTypesLibraryPackage.initializePackageContents();
		theTimeLibraryPackage.initializePackageContents();
		theRS_LibraryPackage.initializePackageContents();
		theMARTE_PrimitivesTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasicNFP_TypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasicNFP_TypesPackage.eNS_URI, theBasicNFP_TypesPackage);
		return theBasicNFP_TypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_CommonType() {
		return nfP_CommonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_CommonType_Expr() {
		return (EAttribute)nfP_CommonTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_CommonType_Source() {
		return (EAttribute)nfP_CommonTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_CommonType_StatQ() {
		return (EAttribute)nfP_CommonTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_CommonType_Dir() {
		return (EAttribute)nfP_CommonTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_CommonType_Mode() {
		return (EAttribute)nfP_CommonTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_Frequency() {
		return nfP_FrequencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Frequency_Unit() {
		return (EAttribute)nfP_FrequencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Frequency_Precision() {
		return (EAttribute)nfP_FrequencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_Real() {
		return nfP_RealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Real_Value() {
		return (EAttribute)nfP_RealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_Natural() {
		return nfP_NaturalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Natural_Value() {
		return (EAttribute)nfP_NaturalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_Boolean() {
		return nfP_BooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Boolean_Value() {
		return (EAttribute)nfP_BooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_String() {
		return nfP_StringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_String_Value() {
		return (EAttribute)nfP_StringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_Integer() {
		return nfP_IntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Integer_Value() {
		return (EAttribute)nfP_IntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_DateTime() {
		return nfP_DateTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_DateTime_Value() {
		return (EAttribute)nfP_DateTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_DataTxRate() {
		return nfP_DataTxRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_DataTxRate_Unit() {
		return (EAttribute)nfP_DataTxRateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_DataTxRate_Precision() {
		return (EAttribute)nfP_DataTxRateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_Power() {
		return nfP_PowerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Power_Unit() {
		return (EAttribute)nfP_PowerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Power_Precision() {
		return (EAttribute)nfP_PowerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_DataSize() {
		return nfP_DataSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_DataSize_Unit() {
		return (EAttribute)nfP_DataSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_DataSize_Precision() {
		return (EAttribute)nfP_DataSizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_Energy() {
		return nfP_EnergyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Energy_Unit() {
		return (EAttribute)nfP_EnergyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Energy_Precision() {
		return (EAttribute)nfP_EnergyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_Length() {
		return nfP_LengthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Length_Unit() {
		return (EAttribute)nfP_LengthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Length_Precision() {
		return (EAttribute)nfP_LengthEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_Area() {
		return nfP_AreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Area_Unit() {
		return (EAttribute)nfP_AreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Area_Precision() {
		return (EAttribute)nfP_AreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrivalPattern() {
		return arrivalPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrivalPattern_Periodic() {
		return (EReference)arrivalPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrivalPattern_Aperiodic() {
		return (EReference)arrivalPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrivalPattern_Burst() {
		return (EReference)arrivalPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrivalPattern_Irregular() {
		return (EReference)arrivalPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrivalPattern_Closed() {
		return (EReference)arrivalPatternEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrivalPattern_Sporadic() {
		return (EReference)arrivalPatternEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrivalPattern_Open() {
		return (EReference)arrivalPatternEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicPattern() {
		return periodicPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicPattern_Period() {
		return (EReference)periodicPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicPattern_Jitter() {
		return (EReference)periodicPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicPattern_Phase() {
		return (EReference)periodicPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicPattern_Occurrences() {
		return (EReference)periodicPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAperiodicPattern() {
		return aperiodicPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAperiodicPattern_Distribution() {
		return (EReference)aperiodicPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBurstPattern() {
		return burstPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBurstPattern_MinInterarrival() {
		return (EReference)burstPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBurstPattern_MaxInterarrival() {
		return (EReference)burstPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBurstPattern_MinEventInterval() {
		return (EReference)burstPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBurstPattern_MaxEventInterval() {
		return (EReference)burstPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBurstPattern_BurstSize() {
		return (EReference)burstPatternEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIrregularPattern() {
		return irregularPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIrregularPattern_Phase() {
		return (EReference)irregularPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIrregularPattern_Interarrivals() {
		return (EReference)irregularPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClosedPattern() {
		return closedPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClosedPattern_Population() {
		return (EReference)closedPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClosedPattern_ExtDelay() {
		return (EReference)closedPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSporadicPattern() {
		return sporadicPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSporadicPattern_MinInterarrival() {
		return (EReference)sporadicPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSporadicPattern_MaxInterarrival() {
		return (EReference)sporadicPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSporadicPattern_Jitter() {
		return (EReference)sporadicPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenPattern() {
		return openPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenPattern_InterArrivalTime() {
		return (EReference)openPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenPattern_ArrivalRate() {
		return (EReference)openPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenPattern_ArrivalProcess() {
		return (EAttribute)openPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_Percentage() {
		return nfP_PercentageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Percentage_Unit() {
		return (EAttribute)nfP_PercentageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_Price() {
		return nfP_PriceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Price_Unit() {
		return (EAttribute)nfP_PriceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_Weight() {
		return nfP_WeightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Weight_Unit() {
		return (EAttribute)nfP_WeightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Weight_Precision() {
		return (EAttribute)nfP_WeightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_Duration() {
		return nfP_DurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Duration_Unit() {
		return (EAttribute)nfP_DurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Duration_Clock() {
		return (EAttribute)nfP_DurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Duration_Precision() {
		return (EAttribute)nfP_DurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Duration_Worst() {
		return (EAttribute)nfP_DurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Duration_Best() {
		return (EAttribute)nfP_DurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSourceKind() {
		return sourceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirectionKind() {
		return directionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatisticalQualifierKind() {
		return statisticalQualifierKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicNFP_TypesFactory getBasicNFP_TypesFactory() {
		return (BasicNFP_TypesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		nfP_CommonTypeEClass = createEClass(NFP_COMMON_TYPE);
		createEAttribute(nfP_CommonTypeEClass, NFP_COMMON_TYPE__EXPR);
		createEAttribute(nfP_CommonTypeEClass, NFP_COMMON_TYPE__SOURCE);
		createEAttribute(nfP_CommonTypeEClass, NFP_COMMON_TYPE__STAT_Q);
		createEAttribute(nfP_CommonTypeEClass, NFP_COMMON_TYPE__DIR);
		createEAttribute(nfP_CommonTypeEClass, NFP_COMMON_TYPE__MODE);

		nfP_FrequencyEClass = createEClass(NFP_FREQUENCY);
		createEAttribute(nfP_FrequencyEClass, NFP_FREQUENCY__UNIT);
		createEAttribute(nfP_FrequencyEClass, NFP_FREQUENCY__PRECISION);

		nfP_RealEClass = createEClass(NFP_REAL);
		createEAttribute(nfP_RealEClass, NFP_REAL__VALUE);

		nfP_NaturalEClass = createEClass(NFP_NATURAL);
		createEAttribute(nfP_NaturalEClass, NFP_NATURAL__VALUE);

		nfP_BooleanEClass = createEClass(NFP_BOOLEAN);
		createEAttribute(nfP_BooleanEClass, NFP_BOOLEAN__VALUE);

		nfP_StringEClass = createEClass(NFP_STRING);
		createEAttribute(nfP_StringEClass, NFP_STRING__VALUE);

		nfP_IntegerEClass = createEClass(NFP_INTEGER);
		createEAttribute(nfP_IntegerEClass, NFP_INTEGER__VALUE);

		nfP_DateTimeEClass = createEClass(NFP_DATE_TIME);
		createEAttribute(nfP_DateTimeEClass, NFP_DATE_TIME__VALUE);

		nfP_DataTxRateEClass = createEClass(NFP_DATA_TX_RATE);
		createEAttribute(nfP_DataTxRateEClass, NFP_DATA_TX_RATE__UNIT);
		createEAttribute(nfP_DataTxRateEClass, NFP_DATA_TX_RATE__PRECISION);

		nfP_PowerEClass = createEClass(NFP_POWER);
		createEAttribute(nfP_PowerEClass, NFP_POWER__UNIT);
		createEAttribute(nfP_PowerEClass, NFP_POWER__PRECISION);

		nfP_DataSizeEClass = createEClass(NFP_DATA_SIZE);
		createEAttribute(nfP_DataSizeEClass, NFP_DATA_SIZE__UNIT);
		createEAttribute(nfP_DataSizeEClass, NFP_DATA_SIZE__PRECISION);

		nfP_EnergyEClass = createEClass(NFP_ENERGY);
		createEAttribute(nfP_EnergyEClass, NFP_ENERGY__UNIT);
		createEAttribute(nfP_EnergyEClass, NFP_ENERGY__PRECISION);

		nfP_LengthEClass = createEClass(NFP_LENGTH);
		createEAttribute(nfP_LengthEClass, NFP_LENGTH__UNIT);
		createEAttribute(nfP_LengthEClass, NFP_LENGTH__PRECISION);

		nfP_AreaEClass = createEClass(NFP_AREA);
		createEAttribute(nfP_AreaEClass, NFP_AREA__UNIT);
		createEAttribute(nfP_AreaEClass, NFP_AREA__PRECISION);

		arrivalPatternEClass = createEClass(ARRIVAL_PATTERN);
		createEReference(arrivalPatternEClass, ARRIVAL_PATTERN__PERIODIC);
		createEReference(arrivalPatternEClass, ARRIVAL_PATTERN__APERIODIC);
		createEReference(arrivalPatternEClass, ARRIVAL_PATTERN__BURST);
		createEReference(arrivalPatternEClass, ARRIVAL_PATTERN__IRREGULAR);
		createEReference(arrivalPatternEClass, ARRIVAL_PATTERN__CLOSED);
		createEReference(arrivalPatternEClass, ARRIVAL_PATTERN__SPORADIC);
		createEReference(arrivalPatternEClass, ARRIVAL_PATTERN__OPEN);

		periodicPatternEClass = createEClass(PERIODIC_PATTERN);
		createEReference(periodicPatternEClass, PERIODIC_PATTERN__PERIOD);
		createEReference(periodicPatternEClass, PERIODIC_PATTERN__JITTER);
		createEReference(periodicPatternEClass, PERIODIC_PATTERN__PHASE);
		createEReference(periodicPatternEClass, PERIODIC_PATTERN__OCCURRENCES);

		aperiodicPatternEClass = createEClass(APERIODIC_PATTERN);
		createEReference(aperiodicPatternEClass, APERIODIC_PATTERN__DISTRIBUTION);

		burstPatternEClass = createEClass(BURST_PATTERN);
		createEReference(burstPatternEClass, BURST_PATTERN__MIN_INTERARRIVAL);
		createEReference(burstPatternEClass, BURST_PATTERN__MAX_INTERARRIVAL);
		createEReference(burstPatternEClass, BURST_PATTERN__MIN_EVENT_INTERVAL);
		createEReference(burstPatternEClass, BURST_PATTERN__MAX_EVENT_INTERVAL);
		createEReference(burstPatternEClass, BURST_PATTERN__BURST_SIZE);

		irregularPatternEClass = createEClass(IRREGULAR_PATTERN);
		createEReference(irregularPatternEClass, IRREGULAR_PATTERN__PHASE);
		createEReference(irregularPatternEClass, IRREGULAR_PATTERN__INTERARRIVALS);

		closedPatternEClass = createEClass(CLOSED_PATTERN);
		createEReference(closedPatternEClass, CLOSED_PATTERN__POPULATION);
		createEReference(closedPatternEClass, CLOSED_PATTERN__EXT_DELAY);

		sporadicPatternEClass = createEClass(SPORADIC_PATTERN);
		createEReference(sporadicPatternEClass, SPORADIC_PATTERN__MIN_INTERARRIVAL);
		createEReference(sporadicPatternEClass, SPORADIC_PATTERN__MAX_INTERARRIVAL);
		createEReference(sporadicPatternEClass, SPORADIC_PATTERN__JITTER);

		openPatternEClass = createEClass(OPEN_PATTERN);
		createEReference(openPatternEClass, OPEN_PATTERN__INTER_ARRIVAL_TIME);
		createEReference(openPatternEClass, OPEN_PATTERN__ARRIVAL_RATE);
		createEAttribute(openPatternEClass, OPEN_PATTERN__ARRIVAL_PROCESS);

		nfP_PercentageEClass = createEClass(NFP_PERCENTAGE);
		createEAttribute(nfP_PercentageEClass, NFP_PERCENTAGE__UNIT);

		nfP_PriceEClass = createEClass(NFP_PRICE);
		createEAttribute(nfP_PriceEClass, NFP_PRICE__UNIT);

		nfP_WeightEClass = createEClass(NFP_WEIGHT);
		createEAttribute(nfP_WeightEClass, NFP_WEIGHT__UNIT);
		createEAttribute(nfP_WeightEClass, NFP_WEIGHT__PRECISION);

		nfP_DurationEClass = createEClass(NFP_DURATION);
		createEAttribute(nfP_DurationEClass, NFP_DURATION__UNIT);
		createEAttribute(nfP_DurationEClass, NFP_DURATION__CLOCK);
		createEAttribute(nfP_DurationEClass, NFP_DURATION__PRECISION);
		createEAttribute(nfP_DurationEClass, NFP_DURATION__WORST);
		createEAttribute(nfP_DurationEClass, NFP_DURATION__BEST);

		// Create enums
		sourceKindEEnum = createEEnum(SOURCE_KIND);
		directionKindEEnum = createEEnum(DIRECTION_KIND);
		statisticalQualifierKindEEnum = createEEnum(STATISTICAL_QUALIFIER_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MARTE_DataTypesPackage theMARTE_DataTypesPackage = (MARTE_DataTypesPackage)EPackage.Registry.INSTANCE.getEPackage(MARTE_DataTypesPackage.eNS_URI);
		MARTE_PrimitivesTypesPackage theMARTE_PrimitivesTypesPackage = (MARTE_PrimitivesTypesPackage)EPackage.Registry.INSTANCE.getEPackage(MARTE_PrimitivesTypesPackage.eNS_URI);
		MeasurementUnitsPackage theMeasurementUnitsPackage = (MeasurementUnitsPackage)EPackage.Registry.INSTANCE.getEPackage(MeasurementUnitsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nfP_FrequencyEClass.getESuperTypes().add(this.getNFP_Real());
		nfP_RealEClass.getESuperTypes().add(this.getNFP_CommonType());
		nfP_NaturalEClass.getESuperTypes().add(this.getNFP_CommonType());
		nfP_BooleanEClass.getESuperTypes().add(this.getNFP_CommonType());
		nfP_StringEClass.getESuperTypes().add(this.getNFP_CommonType());
		nfP_IntegerEClass.getESuperTypes().add(this.getNFP_CommonType());
		nfP_DateTimeEClass.getESuperTypes().add(this.getNFP_CommonType());
		nfP_DataTxRateEClass.getESuperTypes().add(this.getNFP_Real());
		nfP_PowerEClass.getESuperTypes().add(this.getNFP_Real());
		nfP_DataSizeEClass.getESuperTypes().add(this.getNFP_Real());
		nfP_EnergyEClass.getESuperTypes().add(this.getNFP_Real());
		nfP_LengthEClass.getESuperTypes().add(this.getNFP_Real());
		nfP_AreaEClass.getESuperTypes().add(this.getNFP_Real());
		burstPatternEClass.getESuperTypes().add(this.getAperiodicPattern());
		irregularPatternEClass.getESuperTypes().add(this.getAperiodicPattern());
		sporadicPatternEClass.getESuperTypes().add(this.getAperiodicPattern());
		nfP_PercentageEClass.getESuperTypes().add(this.getNFP_Real());
		nfP_PriceEClass.getESuperTypes().add(this.getNFP_Real());
		nfP_WeightEClass.getESuperTypes().add(this.getNFP_Real());
		nfP_DurationEClass.getESuperTypes().add(this.getNFP_Real());

		// Initialize classes and features; add operations and parameters
		initEClass(nfP_CommonTypeEClass, NFP_CommonType.class, "NFP_CommonType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_CommonType_Expr(), theMARTE_DataTypesPackage.getVSL_Expression(), "expr", null, 0, 1, NFP_CommonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNFP_CommonType_Source(), this.getSourceKind(), "source", null, 0, 1, NFP_CommonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNFP_CommonType_StatQ(), this.getStatisticalQualifierKind(), "statQ", null, 0, 1, NFP_CommonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNFP_CommonType_Dir(), this.getDirectionKind(), "dir", null, 0, 1, NFP_CommonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNFP_CommonType_Mode(), ecorePackage.getEString(), "mode", null, 0, -1, NFP_CommonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(nfP_CommonTypeEClass, null, "bernoulli", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theMARTE_PrimitivesTypesPackage.getReal(), "prob", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(nfP_CommonTypeEClass, null, "binomial", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theMARTE_PrimitivesTypesPackage.getReal(), "prob", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theMARTE_PrimitivesTypesPackage.getInteger(), "trials", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(nfP_CommonTypeEClass, null, "exp", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theMARTE_PrimitivesTypesPackage.getReal(), "mean", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(nfP_CommonTypeEClass, null, "gamma", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theMARTE_PrimitivesTypesPackage.getInteger(), "k", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theMARTE_PrimitivesTypesPackage.getReal(), "mean", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(nfP_CommonTypeEClass, null, "normal", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theMARTE_PrimitivesTypesPackage.getReal(), "mean", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theMARTE_PrimitivesTypesPackage.getReal(), "standDev", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(nfP_CommonTypeEClass, null, "poisson", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theMARTE_PrimitivesTypesPackage.getReal(), "mean", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(nfP_CommonTypeEClass, null, "uniform", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theMARTE_PrimitivesTypesPackage.getReal(), "min", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theMARTE_PrimitivesTypesPackage.getReal(), "max", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(nfP_CommonTypeEClass, null, "gamma", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "k", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theMARTE_PrimitivesTypesPackage.getReal(), "mean", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(nfP_CommonTypeEClass, null, "geometric", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theMARTE_PrimitivesTypesPackage.getReal(), "p", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(nfP_CommonTypeEClass, null, "triangular", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theMARTE_PrimitivesTypesPackage.getReal(), "min", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theMARTE_PrimitivesTypesPackage.getReal(), "max", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theMARTE_PrimitivesTypesPackage.getReal(), "mode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(nfP_CommonTypeEClass, null, "logarithmic", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theMARTE_PrimitivesTypesPackage.getReal(), "theta", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(nfP_FrequencyEClass, NFP_Frequency.class, "NFP_Frequency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_Frequency_Unit(), theMeasurementUnitsPackage.getFrequencyUnitKind(), "unit", null, 0, 1, NFP_Frequency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNFP_Frequency_Precision(), theMARTE_PrimitivesTypesPackage.getReal(), "precision", null, 0, 1, NFP_Frequency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nfP_RealEClass, NFP_Real.class, "NFP_Real", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_Real_Value(), theMARTE_PrimitivesTypesPackage.getReal(), "value", null, 0, 1, NFP_Real.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nfP_NaturalEClass, NFP_Natural.class, "NFP_Natural", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_Natural_Value(), theMARTE_PrimitivesTypesPackage.getUnlimitedNatural(), "value", null, 0, 1, NFP_Natural.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nfP_BooleanEClass, NFP_Boolean.class, "NFP_Boolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_Boolean_Value(), theMARTE_PrimitivesTypesPackage.getBoolean(), "value", null, 0, 1, NFP_Boolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nfP_StringEClass, NFP_String.class, "NFP_String", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_String_Value(), theMARTE_PrimitivesTypesPackage.getString(), "value", null, 0, 1, NFP_String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nfP_IntegerEClass, NFP_Integer.class, "NFP_Integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_Integer_Value(), theMARTE_PrimitivesTypesPackage.getInteger(), "value", null, 0, 1, NFP_Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nfP_DateTimeEClass, NFP_DateTime.class, "NFP_DateTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_DateTime_Value(), theMARTE_PrimitivesTypesPackage.getDateTime(), "value", null, 0, 1, NFP_DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nfP_DataTxRateEClass, NFP_DataTxRate.class, "NFP_DataTxRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_DataTxRate_Unit(), theMeasurementUnitsPackage.getDataTxRateUnitKind(), "unit", null, 0, 1, NFP_DataTxRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNFP_DataTxRate_Precision(), theMARTE_PrimitivesTypesPackage.getReal(), "precision", null, 0, 1, NFP_DataTxRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nfP_PowerEClass, NFP_Power.class, "NFP_Power", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_Power_Unit(), theMeasurementUnitsPackage.getPowerUnitKind(), "unit", null, 0, 1, NFP_Power.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNFP_Power_Precision(), theMARTE_PrimitivesTypesPackage.getReal(), "precision", null, 0, 1, NFP_Power.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nfP_DataSizeEClass, NFP_DataSize.class, "NFP_DataSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_DataSize_Unit(), theMeasurementUnitsPackage.getDataSizeUnitKind(), "unit", null, 0, 1, NFP_DataSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNFP_DataSize_Precision(), theMARTE_PrimitivesTypesPackage.getReal(), "precision", null, 0, 1, NFP_DataSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nfP_EnergyEClass, NFP_Energy.class, "NFP_Energy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_Energy_Unit(), theMeasurementUnitsPackage.getEnergyUnitKind(), "unit", null, 0, 1, NFP_Energy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNFP_Energy_Precision(), theMARTE_PrimitivesTypesPackage.getReal(), "precision", null, 0, 1, NFP_Energy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nfP_LengthEClass, NFP_Length.class, "NFP_Length", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_Length_Unit(), theMeasurementUnitsPackage.getLengthUnitKind(), "unit", null, 0, 1, NFP_Length.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNFP_Length_Precision(), theMARTE_PrimitivesTypesPackage.getReal(), "precision", null, 0, 1, NFP_Length.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nfP_AreaEClass, NFP_Area.class, "NFP_Area", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_Area_Unit(), theMeasurementUnitsPackage.getAreaUnitKind(), "unit", null, 0, 1, NFP_Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNFP_Area_Precision(), theMARTE_PrimitivesTypesPackage.getReal(), "precision", null, 0, 1, NFP_Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(arrivalPatternEClass, ArrivalPattern.class, "ArrivalPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrivalPattern_Periodic(), this.getPeriodicPattern(), null, "periodic", null, 0, 1, ArrivalPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArrivalPattern_Aperiodic(), this.getAperiodicPattern(), null, "aperiodic", null, 0, 1, ArrivalPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArrivalPattern_Burst(), this.getBurstPattern(), null, "burst", null, 0, 1, ArrivalPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArrivalPattern_Irregular(), this.getIrregularPattern(), null, "irregular", null, 0, 1, ArrivalPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArrivalPattern_Closed(), this.getClosedPattern(), null, "closed", null, 0, 1, ArrivalPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArrivalPattern_Sporadic(), this.getSporadicPattern(), null, "sporadic", null, 0, 1, ArrivalPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArrivalPattern_Open(), this.getOpenPattern(), null, "open", null, 0, 1, ArrivalPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(periodicPatternEClass, PeriodicPattern.class, "PeriodicPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPeriodicPattern_Period(), this.getNFP_Duration(), null, "period", null, 0, 1, PeriodicPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPeriodicPattern_Jitter(), this.getNFP_Duration(), null, "jitter", null, 0, 1, PeriodicPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPeriodicPattern_Phase(), this.getNFP_Duration(), null, "phase", null, 0, 1, PeriodicPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPeriodicPattern_Occurrences(), this.getNFP_Integer(), null, "occurrences", null, 0, 1, PeriodicPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(aperiodicPatternEClass, AperiodicPattern.class, "AperiodicPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAperiodicPattern_Distribution(), this.getNFP_CommonType(), null, "distribution", null, 0, 1, AperiodicPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(burstPatternEClass, BurstPattern.class, "BurstPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBurstPattern_MinInterarrival(), this.getNFP_Duration(), null, "minInterarrival", null, 0, 1, BurstPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBurstPattern_MaxInterarrival(), this.getNFP_Duration(), null, "maxInterarrival", null, 0, 1, BurstPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBurstPattern_MinEventInterval(), this.getNFP_Duration(), null, "minEventInterval", null, 0, 1, BurstPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBurstPattern_MaxEventInterval(), this.getNFP_Duration(), null, "maxEventInterval", null, 0, 1, BurstPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBurstPattern_BurstSize(), this.getNFP_Integer(), null, "burstSize", null, 0, 1, BurstPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(irregularPatternEClass, IrregularPattern.class, "IrregularPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIrregularPattern_Phase(), this.getNFP_Duration(), null, "phase", null, 0, 1, IrregularPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIrregularPattern_Interarrivals(), this.getNFP_Duration(), null, "interarrivals", null, 0, -1, IrregularPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(closedPatternEClass, ClosedPattern.class, "ClosedPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClosedPattern_Population(), this.getNFP_Integer(), null, "population", null, 0, 1, ClosedPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClosedPattern_ExtDelay(), this.getNFP_Duration(), null, "extDelay", null, 0, 1, ClosedPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sporadicPatternEClass, SporadicPattern.class, "SporadicPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSporadicPattern_MinInterarrival(), this.getNFP_Duration(), null, "minInterarrival", null, 0, 1, SporadicPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSporadicPattern_MaxInterarrival(), this.getNFP_Duration(), null, "maxInterarrival", null, 0, 1, SporadicPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSporadicPattern_Jitter(), this.getNFP_Duration(), null, "jitter", null, 0, 1, SporadicPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(openPatternEClass, OpenPattern.class, "OpenPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpenPattern_InterArrivalTime(), this.getNFP_Duration(), null, "interArrivalTime", null, 0, 1, OpenPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOpenPattern_ArrivalRate(), this.getNFP_Frequency(), null, "arrivalRate", null, 0, 1, OpenPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOpenPattern_ArrivalProcess(), ecorePackage.getEString(), "arrivalProcess", null, 0, 1, OpenPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nfP_PercentageEClass, NFP_Percentage.class, "NFP_Percentage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_Percentage_Unit(), theMARTE_PrimitivesTypesPackage.getString(), "unit", "%", 0, 1, NFP_Percentage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nfP_PriceEClass, NFP_Price.class, "NFP_Price", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_Price_Unit(), theMARTE_PrimitivesTypesPackage.getString(), "unit", "$US", 0, 1, NFP_Price.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nfP_WeightEClass, NFP_Weight.class, "NFP_Weight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_Weight_Unit(), theMeasurementUnitsPackage.getWeightUnitKind(), "unit", null, 0, 1, NFP_Weight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNFP_Weight_Precision(), theMARTE_PrimitivesTypesPackage.getReal(), "precision", null, 0, 1, NFP_Weight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nfP_DurationEClass, NFP_Duration.class, "NFP_Duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_Duration_Unit(), theMeasurementUnitsPackage.getTimeUnitKind(), "unit", null, 0, 1, NFP_Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNFP_Duration_Clock(), theMARTE_PrimitivesTypesPackage.getString(), "clock", null, 0, 1, NFP_Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNFP_Duration_Precision(), theMARTE_PrimitivesTypesPackage.getReal(), "precision", null, 0, 1, NFP_Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNFP_Duration_Worst(), theMARTE_PrimitivesTypesPackage.getReal(), "worst", null, 0, 1, NFP_Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNFP_Duration_Best(), theMARTE_PrimitivesTypesPackage.getReal(), "best", null, 0, 1, NFP_Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(sourceKindEEnum, SourceKind.class, "SourceKind");
		addEEnumLiteral(sourceKindEEnum, SourceKind.EST);
		addEEnumLiteral(sourceKindEEnum, SourceKind.MEAS);
		addEEnumLiteral(sourceKindEEnum, SourceKind.CALC);
		addEEnumLiteral(sourceKindEEnum, SourceKind.REQ);

		initEEnum(directionKindEEnum, DirectionKind.class, "DirectionKind");
		addEEnumLiteral(directionKindEEnum, DirectionKind.INCR);
		addEEnumLiteral(directionKindEEnum, DirectionKind.DECR);

		initEEnum(statisticalQualifierKindEEnum, StatisticalQualifierKind.class, "StatisticalQualifierKind");
		addEEnumLiteral(statisticalQualifierKindEEnum, StatisticalQualifierKind.MAX);
		addEEnumLiteral(statisticalQualifierKindEEnum, StatisticalQualifierKind.MIN);
		addEEnumLiteral(statisticalQualifierKindEEnum, StatisticalQualifierKind.MEAN);
		addEEnumLiteral(statisticalQualifierKindEEnum, StatisticalQualifierKind.RANGE);
		addEEnumLiteral(statisticalQualifierKindEEnum, StatisticalQualifierKind.PERCENT);
		addEEnumLiteral(statisticalQualifierKindEEnum, StatisticalQualifierKind.DISTRIB);
		addEEnumLiteral(statisticalQualifierKindEEnum, StatisticalQualifierKind.DETERM);
		addEEnumLiteral(statisticalQualifierKindEEnum, StatisticalQualifierKind.OTHER);
		addEEnumLiteral(statisticalQualifierKindEEnum, StatisticalQualifierKind.VARIANCE);

		// Create resource
		createResource(eNS_URI);
	}

} //BasicNFP_TypesPackageImpl
