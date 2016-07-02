/**
 */
package MARTE_Library.MARTE_DataTypes.impl;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;

import MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl;

import MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage;

import MARTE_Library.GRM_BasicTypes.impl.GRM_BasicTypesPackageImpl;

import MARTE_Library.MARTE_DataTypes.Array;
import MARTE_Library.MARTE_DataTypes.IntegerInterval;
import MARTE_Library.MARTE_DataTypes.IntegerMatrix;
import MARTE_Library.MARTE_DataTypes.IntegerVector;
import MARTE_Library.MARTE_DataTypes.Interval;
import MARTE_Library.MARTE_DataTypes.MARTE_DataTypesFactory;
import MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage;
import MARTE_Library.MARTE_DataTypes.NFP_FrequencyInterval;
import MARTE_Library.MARTE_DataTypes.NFP_NaturalInterval;
import MARTE_Library.MARTE_DataTypes.RealMatrix;
import MARTE_Library.MARTE_DataTypes.RealVector;
import MARTE_Library.MARTE_DataTypes.Realnterval;
import MARTE_Library.MARTE_DataTypes.TransmModeKind;
import MARTE_Library.MARTE_DataTypes.UtilityType;

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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MARTE_DataTypesPackageImpl extends EPackageImpl implements MARTE_DataTypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerMatrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_FrequencyIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_NaturalIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realVectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realMatrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transmModeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vsL_ExpressionEDataType = null;

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
	 * @see MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MARTE_DataTypesPackageImpl() {
		super(eNS_URI, MARTE_DataTypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MARTE_DataTypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MARTE_DataTypesPackage init() {
		if (isInited) return (MARTE_DataTypesPackage)EPackage.Registry.INSTANCE.getEPackage(MARTE_DataTypesPackage.eNS_URI);

		// Obtain or create and register package
		MARTE_DataTypesPackageImpl theMARTE_DataTypesPackage = (MARTE_DataTypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MARTE_DataTypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MARTE_DataTypesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MeasurementUnitsPackageImpl theMeasurementUnitsPackage = (MeasurementUnitsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasurementUnitsPackage.eNS_URI) instanceof MeasurementUnitsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasurementUnitsPackage.eNS_URI) : MeasurementUnitsPackage.eINSTANCE);
		GRM_BasicTypesPackageImpl theGRM_BasicTypesPackage = (GRM_BasicTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GRM_BasicTypesPackage.eNS_URI) instanceof GRM_BasicTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GRM_BasicTypesPackage.eNS_URI) : GRM_BasicTypesPackage.eINSTANCE);
		BasicNFP_TypesPackageImpl theBasicNFP_TypesPackage = (BasicNFP_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI) instanceof BasicNFP_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI) : BasicNFP_TypesPackage.eINSTANCE);
		TimeTypesLibraryPackageImpl theTimeTypesLibraryPackage = (TimeTypesLibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimeTypesLibraryPackage.eNS_URI) instanceof TimeTypesLibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimeTypesLibraryPackage.eNS_URI) : TimeTypesLibraryPackage.eINSTANCE);
		TimeLibraryPackageImpl theTimeLibraryPackage = (TimeLibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimeLibraryPackage.eNS_URI) instanceof TimeLibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimeLibraryPackage.eNS_URI) : TimeLibraryPackage.eINSTANCE);
		RS_LibraryPackageImpl theRS_LibraryPackage = (RS_LibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RS_LibraryPackage.eNS_URI) instanceof RS_LibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RS_LibraryPackage.eNS_URI) : RS_LibraryPackage.eINSTANCE);
		MARTE_PrimitivesTypesPackageImpl theMARTE_PrimitivesTypesPackage = (MARTE_PrimitivesTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MARTE_PrimitivesTypesPackage.eNS_URI) instanceof MARTE_PrimitivesTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MARTE_PrimitivesTypesPackage.eNS_URI) : MARTE_PrimitivesTypesPackage.eINSTANCE);

		// Create package meta-data objects
		theMARTE_DataTypesPackage.createPackageContents();
		theMeasurementUnitsPackage.createPackageContents();
		theGRM_BasicTypesPackage.createPackageContents();
		theBasicNFP_TypesPackage.createPackageContents();
		theTimeTypesLibraryPackage.createPackageContents();
		theTimeLibraryPackage.createPackageContents();
		theRS_LibraryPackage.createPackageContents();
		theMARTE_PrimitivesTypesPackage.createPackageContents();

		// Initialize created meta-data
		theMARTE_DataTypesPackage.initializePackageContents();
		theMeasurementUnitsPackage.initializePackageContents();
		theGRM_BasicTypesPackage.initializePackageContents();
		theBasicNFP_TypesPackage.initializePackageContents();
		theTimeTypesLibraryPackage.initializePackageContents();
		theTimeLibraryPackage.initializePackageContents();
		theRS_LibraryPackage.initializePackageContents();
		theMARTE_PrimitivesTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMARTE_DataTypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MARTE_DataTypesPackage.eNS_URI, theMARTE_DataTypesPackage);
		return theMARTE_DataTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVector() {
		return integerVectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerVector_VectorElem() {
		return (EAttribute)integerVectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerMatrix() {
		return integerMatrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerMatrix_MatrixElem() {
		return (EReference)integerMatrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerInterval() {
		return integerIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerInterval_Bound() {
		return (EAttribute)integerIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUtilityType() {
		return utilityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArray() {
		return arrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_VectorElement() {
		return (EReference)arrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterval() {
		return intervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_Bound() {
		return (EReference)intervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealnterval() {
		return realntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealnterval_Bound() {
		return (EAttribute)realntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_FrequencyInterval() {
		return nfP_FrequencyIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNFP_FrequencyInterval_Bound() {
		return (EReference)nfP_FrequencyIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_NaturalInterval() {
		return nfP_NaturalIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNFP_NaturalInterval_Bound() {
		return (EReference)nfP_NaturalIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealVector() {
		return realVectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealVector_VectorElem() {
		return (EAttribute)realVectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealMatrix() {
		return realMatrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealMatrix_MatrixElem() {
		return (EAttribute)realMatrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransmModeKind() {
		return transmModeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVSL_Expression() {
		return vsL_ExpressionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MARTE_DataTypesFactory getMARTE_DataTypesFactory() {
		return (MARTE_DataTypesFactory)getEFactoryInstance();
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
		integerVectorEClass = createEClass(INTEGER_VECTOR);
		createEAttribute(integerVectorEClass, INTEGER_VECTOR__VECTOR_ELEM);

		integerMatrixEClass = createEClass(INTEGER_MATRIX);
		createEReference(integerMatrixEClass, INTEGER_MATRIX__MATRIX_ELEM);

		integerIntervalEClass = createEClass(INTEGER_INTERVAL);
		createEAttribute(integerIntervalEClass, INTEGER_INTERVAL__BOUND);

		utilityTypeEClass = createEClass(UTILITY_TYPE);

		arrayEClass = createEClass(ARRAY);
		createEReference(arrayEClass, ARRAY__VECTOR_ELEMENT);

		intervalEClass = createEClass(INTERVAL);
		createEReference(intervalEClass, INTERVAL__BOUND);

		realntervalEClass = createEClass(REALNTERVAL);
		createEAttribute(realntervalEClass, REALNTERVAL__BOUND);

		nfP_FrequencyIntervalEClass = createEClass(NFP_FREQUENCY_INTERVAL);
		createEReference(nfP_FrequencyIntervalEClass, NFP_FREQUENCY_INTERVAL__BOUND);

		nfP_NaturalIntervalEClass = createEClass(NFP_NATURAL_INTERVAL);
		createEReference(nfP_NaturalIntervalEClass, NFP_NATURAL_INTERVAL__BOUND);

		realVectorEClass = createEClass(REAL_VECTOR);
		createEAttribute(realVectorEClass, REAL_VECTOR__VECTOR_ELEM);

		realMatrixEClass = createEClass(REAL_MATRIX);
		createEAttribute(realMatrixEClass, REAL_MATRIX__MATRIX_ELEM);

		// Create enums
		transmModeKindEEnum = createEEnum(TRANSM_MODE_KIND);

		// Create data types
		vsL_ExpressionEDataType = createEDataType(VSL_EXPRESSION);
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
		MARTE_PrimitivesTypesPackage theMARTE_PrimitivesTypesPackage = (MARTE_PrimitivesTypesPackage)EPackage.Registry.INSTANCE.getEPackage(MARTE_PrimitivesTypesPackage.eNS_URI);
		BasicNFP_TypesPackage theBasicNFP_TypesPackage = (BasicNFP_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI);

		// Create type parameters
		ETypeParameter arrayEClass_T = addETypeParameter(arrayEClass, "T");
		addETypeParameter(intervalEClass, "T1");
		ETypeParameter intervalEClass_T2 = addETypeParameter(intervalEClass, "T2");

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(integerVectorEClass, IntegerVector.class, "IntegerVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerVector_VectorElem(), theMARTE_PrimitivesTypesPackage.getInteger(), "vectorElem", null, 0, -1, IntegerVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(integerVectorEClass, theMARTE_PrimitivesTypesPackage.getInteger(), "at", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theMARTE_PrimitivesTypesPackage.getInteger(), "i", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(integerMatrixEClass, IntegerMatrix.class, "IntegerMatrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerMatrix_MatrixElem(), this.getIntegerVector(), null, "matrixElem", null, 0, -1, IntegerMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(integerMatrixEClass, this.getIntegerVector(), "at", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "i", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(integerIntervalEClass, IntegerInterval.class, "IntegerInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerInterval_Bound(), theMARTE_PrimitivesTypesPackage.getInteger(), "bound", null, 2, 2, IntegerInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(utilityTypeEClass, UtilityType.class, "UtilityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(utilityTypeEClass, theMARTE_PrimitivesTypesPackage.getBoolean(), "eq", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUtilityType(), "u", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(utilityTypeEClass, theMARTE_PrimitivesTypesPackage.getBoolean(), "lt", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUtilityType(), "u", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(utilityTypeEClass, theMARTE_PrimitivesTypesPackage.getBoolean(), "gt", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUtilityType(), "u", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(utilityTypeEClass, theMARTE_PrimitivesTypesPackage.getBoolean(), "le", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUtilityType(), "u", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(utilityTypeEClass, theMARTE_PrimitivesTypesPackage.getBoolean(), "ge", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUtilityType(), "u", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(utilityTypeEClass, theMARTE_PrimitivesTypesPackage.getBoolean(), "ne", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUtilityType(), "u", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(arrayEClass, Array.class, "Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		EGenericType g1 = createEGenericType(arrayEClass_T);
		initEReference(getArray_VectorElement(), g1, null, "vectorElement", null, 0, -1, Array.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(arrayEClass, null, "at", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "i", 1, 1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(arrayEClass_T);
		initEOperation(op, g1);

		initEClass(intervalEClass, Interval.class, "Interval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(intervalEClass_T2);
		initEReference(getInterval_Bound(), g1, null, "bound", null, 2, 2, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(realntervalEClass, Realnterval.class, "Realnterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealnterval_Bound(), theMARTE_PrimitivesTypesPackage.getReal(), "bound", null, 2, 2, Realnterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nfP_FrequencyIntervalEClass, NFP_FrequencyInterval.class, "NFP_FrequencyInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNFP_FrequencyInterval_Bound(), theBasicNFP_TypesPackage.getNFP_Frequency(), null, "bound", null, 2, 2, NFP_FrequencyInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nfP_NaturalIntervalEClass, NFP_NaturalInterval.class, "NFP_NaturalInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNFP_NaturalInterval_Bound(), theBasicNFP_TypesPackage.getNFP_Natural(), null, "bound", null, 2, 2, NFP_NaturalInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(realVectorEClass, RealVector.class, "RealVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealVector_VectorElem(), theMARTE_PrimitivesTypesPackage.getReal(), "vectorElem", null, 0, -1, RealVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(realVectorEClass, theMARTE_PrimitivesTypesPackage.getReal(), "at", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "i", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(realMatrixEClass, RealMatrix.class, "RealMatrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealMatrix_MatrixElem(), theMARTE_PrimitivesTypesPackage.getReal(), "matrixElem", null, 0, -1, RealMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(realMatrixEClass, null, "at", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "i", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRealVector(), "p", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(transmModeKindEEnum, TransmModeKind.class, "TransmModeKind");
		addEEnumLiteral(transmModeKindEEnum, TransmModeKind.SIMPLEX);
		addEEnumLiteral(transmModeKindEEnum, TransmModeKind.HALF_DUPLEX);
		addEEnumLiteral(transmModeKindEEnum, TransmModeKind.FULL_DUPLEX);

		// Initialize data types
		initEDataType(vsL_ExpressionEDataType, Object.class, "VSL_Expression", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MARTE_DataTypesPackageImpl
