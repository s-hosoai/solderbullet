/**
 */
package MARTE_Library.MeasurementUnits.impl;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;

import MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl;

import MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage;

import MARTE_Library.GRM_BasicTypes.impl.GRM_BasicTypesPackageImpl;

import MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage;

import MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl;

import MARTE_Library.MARTE_PrimitivesTypes.MARTE_PrimitivesTypesPackage;

import MARTE_Library.MARTE_PrimitivesTypes.impl.MARTE_PrimitivesTypesPackageImpl;

import MARTE_Library.MeasurementUnits.AreaUnitKind;
import MARTE_Library.MeasurementUnits.DataSizeUnitKind;
import MARTE_Library.MeasurementUnits.DataTxRateUnitKind;
import MARTE_Library.MeasurementUnits.EnergyUnitKind;
import MARTE_Library.MeasurementUnits.FrequencyUnitKind;
import MARTE_Library.MeasurementUnits.LengthUnitKind;
import MARTE_Library.MeasurementUnits.MeasurementUnitsFactory;
import MARTE_Library.MeasurementUnits.MeasurementUnitsPackage;
import MARTE_Library.MeasurementUnits.PowerUnitKind;
import MARTE_Library.MeasurementUnits.TimeUnitKind;
import MARTE_Library.MeasurementUnits.WeightUnitKind;

import MARTE_Library.RS_Library.RS_LibraryPackage;

import MARTE_Library.RS_Library.impl.RS_LibraryPackageImpl;

import MARTE_Library.TimeLibrary.TimeLibraryPackage;

import MARTE_Library.TimeLibrary.impl.TimeLibraryPackageImpl;

import MARTE_Library.TimeTypesLibrary.TimeTypesLibraryPackage;

import MARTE_Library.TimeTypesLibrary.impl.TimeTypesLibraryPackageImpl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasurementUnitsPackageImpl extends EPackageImpl implements MeasurementUnitsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeUnitKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum powerUnitKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum frequencyUnitKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataSizeUnitKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTxRateUnitKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum energyUnitKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lengthUnitKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum areaUnitKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum weightUnitKindEEnum = null;

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
	 * @see MARTE_Library.MeasurementUnits.MeasurementUnitsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MeasurementUnitsPackageImpl() {
		super(eNS_URI, MeasurementUnitsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MeasurementUnitsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MeasurementUnitsPackage init() {
		if (isInited) return (MeasurementUnitsPackage)EPackage.Registry.INSTANCE.getEPackage(MeasurementUnitsPackage.eNS_URI);

		// Obtain or create and register package
		MeasurementUnitsPackageImpl theMeasurementUnitsPackage = (MeasurementUnitsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MeasurementUnitsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MeasurementUnitsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GRM_BasicTypesPackageImpl theGRM_BasicTypesPackage = (GRM_BasicTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GRM_BasicTypesPackage.eNS_URI) instanceof GRM_BasicTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GRM_BasicTypesPackage.eNS_URI) : GRM_BasicTypesPackage.eINSTANCE);
		BasicNFP_TypesPackageImpl theBasicNFP_TypesPackage = (BasicNFP_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI) instanceof BasicNFP_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI) : BasicNFP_TypesPackage.eINSTANCE);
		MARTE_DataTypesPackageImpl theMARTE_DataTypesPackage = (MARTE_DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MARTE_DataTypesPackage.eNS_URI) instanceof MARTE_DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MARTE_DataTypesPackage.eNS_URI) : MARTE_DataTypesPackage.eINSTANCE);
		TimeTypesLibraryPackageImpl theTimeTypesLibraryPackage = (TimeTypesLibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimeTypesLibraryPackage.eNS_URI) instanceof TimeTypesLibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimeTypesLibraryPackage.eNS_URI) : TimeTypesLibraryPackage.eINSTANCE);
		TimeLibraryPackageImpl theTimeLibraryPackage = (TimeLibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimeLibraryPackage.eNS_URI) instanceof TimeLibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimeLibraryPackage.eNS_URI) : TimeLibraryPackage.eINSTANCE);
		RS_LibraryPackageImpl theRS_LibraryPackage = (RS_LibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RS_LibraryPackage.eNS_URI) instanceof RS_LibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RS_LibraryPackage.eNS_URI) : RS_LibraryPackage.eINSTANCE);
		MARTE_PrimitivesTypesPackageImpl theMARTE_PrimitivesTypesPackage = (MARTE_PrimitivesTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MARTE_PrimitivesTypesPackage.eNS_URI) instanceof MARTE_PrimitivesTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MARTE_PrimitivesTypesPackage.eNS_URI) : MARTE_PrimitivesTypesPackage.eINSTANCE);

		// Create package meta-data objects
		theMeasurementUnitsPackage.createPackageContents();
		theGRM_BasicTypesPackage.createPackageContents();
		theBasicNFP_TypesPackage.createPackageContents();
		theMARTE_DataTypesPackage.createPackageContents();
		theTimeTypesLibraryPackage.createPackageContents();
		theTimeLibraryPackage.createPackageContents();
		theRS_LibraryPackage.createPackageContents();
		theMARTE_PrimitivesTypesPackage.createPackageContents();

		// Initialize created meta-data
		theMeasurementUnitsPackage.initializePackageContents();
		theGRM_BasicTypesPackage.initializePackageContents();
		theBasicNFP_TypesPackage.initializePackageContents();
		theMARTE_DataTypesPackage.initializePackageContents();
		theTimeTypesLibraryPackage.initializePackageContents();
		theTimeLibraryPackage.initializePackageContents();
		theRS_LibraryPackage.initializePackageContents();
		theMARTE_PrimitivesTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMeasurementUnitsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MeasurementUnitsPackage.eNS_URI, theMeasurementUnitsPackage);
		return theMeasurementUnitsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeUnitKind() {
		return timeUnitKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPowerUnitKind() {
		return powerUnitKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFrequencyUnitKind() {
		return frequencyUnitKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataSizeUnitKind() {
		return dataSizeUnitKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataTxRateUnitKind() {
		return dataTxRateUnitKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnergyUnitKind() {
		return energyUnitKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLengthUnitKind() {
		return lengthUnitKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAreaUnitKind() {
		return areaUnitKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWeightUnitKind() {
		return weightUnitKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementUnitsFactory getMeasurementUnitsFactory() {
		return (MeasurementUnitsFactory)getEFactoryInstance();
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

		// Create enums
		timeUnitKindEEnum = createEEnum(TIME_UNIT_KIND);
		powerUnitKindEEnum = createEEnum(POWER_UNIT_KIND);
		frequencyUnitKindEEnum = createEEnum(FREQUENCY_UNIT_KIND);
		dataSizeUnitKindEEnum = createEEnum(DATA_SIZE_UNIT_KIND);
		dataTxRateUnitKindEEnum = createEEnum(DATA_TX_RATE_UNIT_KIND);
		energyUnitKindEEnum = createEEnum(ENERGY_UNIT_KIND);
		lengthUnitKindEEnum = createEEnum(LENGTH_UNIT_KIND);
		areaUnitKindEEnum = createEEnum(AREA_UNIT_KIND);
		weightUnitKindEEnum = createEEnum(WEIGHT_UNIT_KIND);
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

		// Initialize enums and add enum literals
		initEEnum(timeUnitKindEEnum, TimeUnitKind.class, "TimeUnitKind");
		addEEnumLiteral(timeUnitKindEEnum, TimeUnitKind.S);
		addEEnumLiteral(timeUnitKindEEnum, TimeUnitKind.TICK);
		addEEnumLiteral(timeUnitKindEEnum, TimeUnitKind.MS);
		addEEnumLiteral(timeUnitKindEEnum, TimeUnitKind.US);
		addEEnumLiteral(timeUnitKindEEnum, TimeUnitKind.MIN);
		addEEnumLiteral(timeUnitKindEEnum, TimeUnitKind.HRS);
		addEEnumLiteral(timeUnitKindEEnum, TimeUnitKind.DAY);

		initEEnum(powerUnitKindEEnum, PowerUnitKind.class, "PowerUnitKind");
		addEEnumLiteral(powerUnitKindEEnum, PowerUnitKind.W);
		addEEnumLiteral(powerUnitKindEEnum, PowerUnitKind.MW);
		addEEnumLiteral(powerUnitKindEEnum, PowerUnitKind.KW);

		initEEnum(frequencyUnitKindEEnum, FrequencyUnitKind.class, "FrequencyUnitKind");
		addEEnumLiteral(frequencyUnitKindEEnum, FrequencyUnitKind.HZ);
		addEEnumLiteral(frequencyUnitKindEEnum, FrequencyUnitKind.KHZ);
		addEEnumLiteral(frequencyUnitKindEEnum, FrequencyUnitKind.MHZ);
		addEEnumLiteral(frequencyUnitKindEEnum, FrequencyUnitKind.GHZ);
		addEEnumLiteral(frequencyUnitKindEEnum, FrequencyUnitKind.RPM);

		initEEnum(dataSizeUnitKindEEnum, DataSizeUnitKind.class, "DataSizeUnitKind");
		addEEnumLiteral(dataSizeUnitKindEEnum, DataSizeUnitKind.BIT);
		addEEnumLiteral(dataSizeUnitKindEEnum, DataSizeUnitKind.BYTE);
		addEEnumLiteral(dataSizeUnitKindEEnum, DataSizeUnitKind.KB);
		addEEnumLiteral(dataSizeUnitKindEEnum, DataSizeUnitKind.MB);
		addEEnumLiteral(dataSizeUnitKindEEnum, DataSizeUnitKind.GB);

		initEEnum(dataTxRateUnitKindEEnum, DataTxRateUnitKind.class, "DataTxRateUnitKind");
		addEEnumLiteral(dataTxRateUnitKindEEnum, DataTxRateUnitKind.BPER_S);
		addEEnumLiteral(dataTxRateUnitKindEEnum, DataTxRateUnitKind.KB_PER_S);
		addEEnumLiteral(dataTxRateUnitKindEEnum, DataTxRateUnitKind.MB_PER_S);

		initEEnum(energyUnitKindEEnum, EnergyUnitKind.class, "EnergyUnitKind");
		addEEnumLiteral(energyUnitKindEEnum, EnergyUnitKind.J);
		addEEnumLiteral(energyUnitKindEEnum, EnergyUnitKind.KJ);
		addEEnumLiteral(energyUnitKindEEnum, EnergyUnitKind.WH);
		addEEnumLiteral(energyUnitKindEEnum, EnergyUnitKind.KWH);
		addEEnumLiteral(energyUnitKindEEnum, EnergyUnitKind.MWH);

		initEEnum(lengthUnitKindEEnum, LengthUnitKind.class, "LengthUnitKind");
		addEEnumLiteral(lengthUnitKindEEnum, LengthUnitKind.M);
		addEEnumLiteral(lengthUnitKindEEnum, LengthUnitKind.CM);
		addEEnumLiteral(lengthUnitKindEEnum, LengthUnitKind.MM);

		initEEnum(areaUnitKindEEnum, AreaUnitKind.class, "AreaUnitKind");
		addEEnumLiteral(areaUnitKindEEnum, AreaUnitKind.MM2);
		addEEnumLiteral(areaUnitKindEEnum, AreaUnitKind.UM2);

		initEEnum(weightUnitKindEEnum, WeightUnitKind.class, "WeightUnitKind");
		addEEnumLiteral(weightUnitKindEEnum, WeightUnitKind.G);
		addEEnumLiteral(weightUnitKindEEnum, WeightUnitKind.MG);
		addEEnumLiteral(weightUnitKindEEnum, WeightUnitKind.KG);

		// Create resource
		createResource(eNS_URI);
	}

} //MeasurementUnitsPackageImpl
