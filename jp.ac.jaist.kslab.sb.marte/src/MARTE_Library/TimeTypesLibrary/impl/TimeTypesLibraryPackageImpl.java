/**
 */
package MARTE_Library.TimeTypesLibrary.impl;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;

import MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl;

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

import MARTE_Library.TimeTypesLibrary.EventKind;
import MARTE_Library.TimeTypesLibrary.TimeInterpretationKind;
import MARTE_Library.TimeTypesLibrary.TimeNatureKind;
import MARTE_Library.TimeTypesLibrary.TimeStandardKind;
import MARTE_Library.TimeTypesLibrary.TimeTypesLibraryFactory;
import MARTE_Library.TimeTypesLibrary.TimeTypesLibraryPackage;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeTypesLibraryPackageImpl extends EPackageImpl implements TimeTypesLibraryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeNatureKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeInterpretationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeStandardKindEEnum = null;

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
	 * @see MARTE_Library.TimeTypesLibrary.TimeTypesLibraryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TimeTypesLibraryPackageImpl() {
		super(eNS_URI, TimeTypesLibraryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TimeTypesLibraryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TimeTypesLibraryPackage init() {
		if (isInited) return (TimeTypesLibraryPackage)EPackage.Registry.INSTANCE.getEPackage(TimeTypesLibraryPackage.eNS_URI);

		// Obtain or create and register package
		TimeTypesLibraryPackageImpl theTimeTypesLibraryPackage = (TimeTypesLibraryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TimeTypesLibraryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TimeTypesLibraryPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MeasurementUnitsPackageImpl theMeasurementUnitsPackage = (MeasurementUnitsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasurementUnitsPackage.eNS_URI) instanceof MeasurementUnitsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasurementUnitsPackage.eNS_URI) : MeasurementUnitsPackage.eINSTANCE);
		GRM_BasicTypesPackageImpl theGRM_BasicTypesPackage = (GRM_BasicTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GRM_BasicTypesPackage.eNS_URI) instanceof GRM_BasicTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GRM_BasicTypesPackage.eNS_URI) : GRM_BasicTypesPackage.eINSTANCE);
		BasicNFP_TypesPackageImpl theBasicNFP_TypesPackage = (BasicNFP_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI) instanceof BasicNFP_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI) : BasicNFP_TypesPackage.eINSTANCE);
		MARTE_DataTypesPackageImpl theMARTE_DataTypesPackage = (MARTE_DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MARTE_DataTypesPackage.eNS_URI) instanceof MARTE_DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MARTE_DataTypesPackage.eNS_URI) : MARTE_DataTypesPackage.eINSTANCE);
		TimeLibraryPackageImpl theTimeLibraryPackage = (TimeLibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimeLibraryPackage.eNS_URI) instanceof TimeLibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimeLibraryPackage.eNS_URI) : TimeLibraryPackage.eINSTANCE);
		RS_LibraryPackageImpl theRS_LibraryPackage = (RS_LibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RS_LibraryPackage.eNS_URI) instanceof RS_LibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RS_LibraryPackage.eNS_URI) : RS_LibraryPackage.eINSTANCE);
		MARTE_PrimitivesTypesPackageImpl theMARTE_PrimitivesTypesPackage = (MARTE_PrimitivesTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MARTE_PrimitivesTypesPackage.eNS_URI) instanceof MARTE_PrimitivesTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MARTE_PrimitivesTypesPackage.eNS_URI) : MARTE_PrimitivesTypesPackage.eINSTANCE);

		// Create package meta-data objects
		theTimeTypesLibraryPackage.createPackageContents();
		theMeasurementUnitsPackage.createPackageContents();
		theGRM_BasicTypesPackage.createPackageContents();
		theBasicNFP_TypesPackage.createPackageContents();
		theMARTE_DataTypesPackage.createPackageContents();
		theTimeLibraryPackage.createPackageContents();
		theRS_LibraryPackage.createPackageContents();
		theMARTE_PrimitivesTypesPackage.createPackageContents();

		// Initialize created meta-data
		theTimeTypesLibraryPackage.initializePackageContents();
		theMeasurementUnitsPackage.initializePackageContents();
		theGRM_BasicTypesPackage.initializePackageContents();
		theBasicNFP_TypesPackage.initializePackageContents();
		theMARTE_DataTypesPackage.initializePackageContents();
		theTimeLibraryPackage.initializePackageContents();
		theRS_LibraryPackage.initializePackageContents();
		theMARTE_PrimitivesTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTimeTypesLibraryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TimeTypesLibraryPackage.eNS_URI, theTimeTypesLibraryPackage);
		return theTimeTypesLibraryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeNatureKind() {
		return timeNatureKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeInterpretationKind() {
		return timeInterpretationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventKind() {
		return eventKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeStandardKind() {
		return timeStandardKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTypesLibraryFactory getTimeTypesLibraryFactory() {
		return (TimeTypesLibraryFactory)getEFactoryInstance();
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
		timeNatureKindEEnum = createEEnum(TIME_NATURE_KIND);
		timeInterpretationKindEEnum = createEEnum(TIME_INTERPRETATION_KIND);
		eventKindEEnum = createEEnum(EVENT_KIND);
		timeStandardKindEEnum = createEEnum(TIME_STANDARD_KIND);
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
		initEEnum(timeNatureKindEEnum, TimeNatureKind.class, "TimeNatureKind");
		addEEnumLiteral(timeNatureKindEEnum, TimeNatureKind.DISCRETE);
		addEEnumLiteral(timeNatureKindEEnum, TimeNatureKind.DENSE);

		initEEnum(timeInterpretationKindEEnum, TimeInterpretationKind.class, "TimeInterpretationKind");
		addEEnumLiteral(timeInterpretationKindEEnum, TimeInterpretationKind.DURATION);
		addEEnumLiteral(timeInterpretationKindEEnum, TimeInterpretationKind.INSTANT);

		initEEnum(eventKindEEnum, EventKind.class, "EventKind");
		addEEnumLiteral(eventKindEEnum, EventKind.START);
		addEEnumLiteral(eventKindEEnum, EventKind.FINISH);
		addEEnumLiteral(eventKindEEnum, EventKind.SEND);
		addEEnumLiteral(eventKindEEnum, EventKind.RECEIVE);
		addEEnumLiteral(eventKindEEnum, EventKind.CONSUME);

		initEEnum(timeStandardKindEEnum, TimeStandardKind.class, "TimeStandardKind");
		addEEnumLiteral(timeStandardKindEEnum, TimeStandardKind.TAI);
		addEEnumLiteral(timeStandardKindEEnum, TimeStandardKind.UT0);
		addEEnumLiteral(timeStandardKindEEnum, TimeStandardKind.UT1);
		addEEnumLiteral(timeStandardKindEEnum, TimeStandardKind.UTC);
		addEEnumLiteral(timeStandardKindEEnum, TimeStandardKind.LOCAL);
		addEEnumLiteral(timeStandardKindEEnum, TimeStandardKind.TT);
		addEEnumLiteral(timeStandardKindEEnum, TimeStandardKind.TBD);
		addEEnumLiteral(timeStandardKindEEnum, TimeStandardKind.TCG);
		addEEnumLiteral(timeStandardKindEEnum, TimeStandardKind.TCB);
		addEEnumLiteral(timeStandardKindEEnum, TimeStandardKind.SIDEREAL);
		addEEnumLiteral(timeStandardKindEEnum, TimeStandardKind.GPS);

		// Create resource
		createResource(eNS_URI);
	}

} //TimeTypesLibraryPackageImpl
