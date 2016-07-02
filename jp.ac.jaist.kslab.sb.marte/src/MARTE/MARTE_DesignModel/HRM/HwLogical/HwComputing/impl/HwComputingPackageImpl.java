/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl;

import MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;

import MARTE.MARTE_AnalysisModel.GQAM.impl.GQAMPackageImpl;

import MARTE.MARTE_AnalysisModel.PAM.PAMPackage;

import MARTE.MARTE_AnalysisModel.PAM.impl.PAMPackageImpl;

import MARTE.MARTE_AnalysisModel.SAM.SAMPackage;

import MARTE.MARTE_AnalysisModel.SAM.impl.SAMPackageImpl;

import MARTE.MARTE_Annexes.RSM.RSMPackage;

import MARTE.MARTE_Annexes.RSM.impl.RSMPackageImpl;

import MARTE.MARTE_Annexes.VSL.DataTypes.DataTypesPackage;

import MARTE.MARTE_Annexes.VSL.DataTypes.impl.DataTypesPackageImpl;

import MARTE.MARTE_Annexes.VSL.Variables.VariablesPackage;

import MARTE.MARTE_Annexes.VSL.Variables.impl.VariablesPackageImpl;

import MARTE.MARTE_DesignModel.GCM.GCMPackage;

import MARTE.MARTE_DesignModel.GCM.impl.GCMPackageImpl;

import MARTE.MARTE_DesignModel.HLAM.HLAMPackage;

import MARTE.MARTE_DesignModel.HLAM.impl.HLAMPackageImpl;

import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage;

import MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwDiagramPackageImpl;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.impl.HwGeneralPackageImpl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwCommunicationPackageImpl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwASIC;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwBranchPredictor;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingFactory;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingResource;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.ISA_Type;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Class;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Organization;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Technology;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDevicePackageImpl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryPackageImpl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerPackage;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.impl.HwStorageManagerPackageImpl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwTimingPackage;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.impl.HwTimingPackageImpl;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwLayoutPackageImpl;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerPackage;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.impl.HwPowerPackageImpl;

import MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocolPackage;

import MARTE.MARTE_DesignModel.HRM.HwProtocol.impl.HwProtocolPackageImpl;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDatasheet.HwDatasheetPackage;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDatasheet.impl.HwDatasheetPackageImpl;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDeviceFunction.HwDeviceFunctionPackage;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDeviceFunction.impl.HwDeviceFunctionPackageImpl;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwIOPackage;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.impl.HwIOPackageImpl;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePackage;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackagePackageImpl;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.HwPeripheralPackage;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.impl.HwPeripheralPackageImpl;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegisterPackage;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.impl.HwRegisterPackageImpl;

import MARTE.MARTE_DesignModel.SRM.SW_Brokering.SW_BrokeringPackage;

import MARTE.MARTE_DesignModel.SRM.SW_Brokering.impl.SW_BrokeringPackageImpl;

import MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage;

import MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SW_ConcurrencyPackageImpl;

import MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage;

import MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.SW_InteractionPackageImpl;

import MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SW_ResourceCorePackage;

import MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.impl.SW_ResourceCorePackageImpl;

import MARTE.MARTE_Foundations.Alloc.AllocPackage;

import MARTE.MARTE_Foundations.Alloc.impl.AllocPackageImpl;

import MARTE.MARTE_Foundations.CoreElements.CoreElementsPackage;

import MARTE.MARTE_Foundations.CoreElements.impl.CoreElementsPackageImpl;

import MARTE.MARTE_Foundations.GRM.GRMPackage;

import MARTE.MARTE_Foundations.GRM.impl.GRMPackageImpl;

import MARTE.MARTE_Foundations.NFPs.NFPsPackage;

import MARTE.MARTE_Foundations.NFPs.impl.NFPsPackageImpl;

import MARTE.MARTE_Foundations.Time.TimePackage;

import MARTE.MARTE_Foundations.Time.impl.TimePackageImpl;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;

import MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage;

import MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage;

import MARTE_Library.MARTE_PrimitivesTypes.MARTE_PrimitivesTypesPackage;

import MARTE_Library.MeasurementUnits.MeasurementUnitsPackage;

import MARTE_Library.RS_Library.RS_LibraryPackage;

import MARTE_Library.TimeLibrary.TimeLibraryPackage;

import MARTE_Library.TimeTypesLibrary.TimeTypesLibraryPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HwComputingPackageImpl extends EPackageImpl implements HwComputingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plD_OrganizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwProcessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwComputingResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwISAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwBranchPredictorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwASICEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwPLDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwMCUEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum isA_TypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum plD_TechnologyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum plD_ClassEEnum = null;

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
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HwComputingPackageImpl() {
		super(eNS_URI, HwComputingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HwComputingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HwComputingPackage init() {
		if (isInited) return (HwComputingPackage)EPackage.Registry.INSTANCE.getEPackage(HwComputingPackage.eNS_URI);

		// Obtain or create and register package
		HwComputingPackageImpl theHwComputingPackage = (HwComputingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HwComputingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HwComputingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MeasurementUnitsPackage.eINSTANCE.eClass();
		GRM_BasicTypesPackage.eINSTANCE.eClass();
		BasicNFP_TypesPackage.eINSTANCE.eClass();
		MARTE_DataTypesPackage.eINSTANCE.eClass();
		TimeTypesLibraryPackage.eINSTANCE.eClass();
		TimeLibraryPackage.eINSTANCE.eClass();
		RS_LibraryPackage.eINSTANCE.eClass();
		MARTE_PrimitivesTypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();
		BasicNFP_TypesPackage.eINSTANCE.eClass();
		GRM_BasicTypesPackage.eINSTANCE.eClass();
		MARTE_DataTypesPackage.eINSTANCE.eClass();
		RS_LibraryPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		NFPsPackageImpl theNFPsPackage = (NFPsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NFPsPackage.eNS_URI) instanceof NFPsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NFPsPackage.eNS_URI) : NFPsPackage.eINSTANCE);
		CoreElementsPackageImpl theCoreElementsPackage = (CoreElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CoreElementsPackage.eNS_URI) instanceof CoreElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CoreElementsPackage.eNS_URI) : CoreElementsPackage.eINSTANCE);
		AllocPackageImpl theAllocPackage = (AllocPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AllocPackage.eNS_URI) instanceof AllocPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AllocPackage.eNS_URI) : AllocPackage.eINSTANCE);
		TimePackageImpl theTimePackage = (TimePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI) instanceof TimePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI) : TimePackage.eINSTANCE);
		GRMPackageImpl theGRMPackage = (GRMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GRMPackage.eNS_URI) instanceof GRMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GRMPackage.eNS_URI) : GRMPackage.eINSTANCE);
		RSMPackageImpl theRSMPackage = (RSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RSMPackage.eNS_URI) instanceof RSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RSMPackage.eNS_URI) : RSMPackage.eINSTANCE);
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) instanceof VariablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) : VariablesPackage.eINSTANCE);
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) instanceof DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) : DataTypesPackage.eINSTANCE);
		HLAMPackageImpl theHLAMPackage = (HLAMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HLAMPackage.eNS_URI) instanceof HLAMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HLAMPackage.eNS_URI) : HLAMPackage.eINSTANCE);
		HwCommunicationPackageImpl theHwCommunicationPackage = (HwCommunicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwCommunicationPackage.eNS_URI) instanceof HwCommunicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwCommunicationPackage.eNS_URI) : HwCommunicationPackage.eINSTANCE);
		HwStorageManagerPackageImpl theHwStorageManagerPackage = (HwStorageManagerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwStorageManagerPackage.eNS_URI) instanceof HwStorageManagerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwStorageManagerPackage.eNS_URI) : HwStorageManagerPackage.eINSTANCE);
		HwMemoryPackageImpl theHwMemoryPackage = (HwMemoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwMemoryPackage.eNS_URI) instanceof HwMemoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwMemoryPackage.eNS_URI) : HwMemoryPackage.eINSTANCE);
		HwTimingPackageImpl theHwTimingPackage = (HwTimingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwTimingPackage.eNS_URI) instanceof HwTimingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwTimingPackage.eNS_URI) : HwTimingPackage.eINSTANCE);
		HwDevicePackageImpl theHwDevicePackage = (HwDevicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwDevicePackage.eNS_URI) instanceof HwDevicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwDevicePackage.eNS_URI) : HwDevicePackage.eINSTANCE);
		HwGeneralPackageImpl theHwGeneralPackage = (HwGeneralPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwGeneralPackage.eNS_URI) instanceof HwGeneralPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwGeneralPackage.eNS_URI) : HwGeneralPackage.eINSTANCE);
		HwLayoutPackageImpl theHwLayoutPackage = (HwLayoutPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwLayoutPackage.eNS_URI) instanceof HwLayoutPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwLayoutPackage.eNS_URI) : HwLayoutPackage.eINSTANCE);
		HwPowerPackageImpl theHwPowerPackage = (HwPowerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwPowerPackage.eNS_URI) instanceof HwPowerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwPowerPackage.eNS_URI) : HwPowerPackage.eINSTANCE);
		HwPeripheralPackageImpl theHwPeripheralPackage = (HwPeripheralPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwPeripheralPackage.eNS_URI) instanceof HwPeripheralPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwPeripheralPackage.eNS_URI) : HwPeripheralPackage.eINSTANCE);
		HwDeviceFunctionPackageImpl theHwDeviceFunctionPackage = (HwDeviceFunctionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwDeviceFunctionPackage.eNS_URI) instanceof HwDeviceFunctionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwDeviceFunctionPackage.eNS_URI) : HwDeviceFunctionPackage.eINSTANCE);
		HwIOPackageImpl theHwIOPackage = (HwIOPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwIOPackage.eNS_URI) instanceof HwIOPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwIOPackage.eNS_URI) : HwIOPackage.eINSTANCE);
		HwRegisterPackageImpl theHwRegisterPackage = (HwRegisterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwRegisterPackage.eNS_URI) instanceof HwRegisterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwRegisterPackage.eNS_URI) : HwRegisterPackage.eINSTANCE);
		HwDatasheetPackageImpl theHwDatasheetPackage = (HwDatasheetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwDatasheetPackage.eNS_URI) instanceof HwDatasheetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwDatasheetPackage.eNS_URI) : HwDatasheetPackage.eINSTANCE);
		HwPackagePackageImpl theHwPackagePackage = (HwPackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwPackagePackage.eNS_URI) instanceof HwPackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwPackagePackage.eNS_URI) : HwPackagePackage.eINSTANCE);
		HwProtocolPackageImpl theHwProtocolPackage = (HwProtocolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwProtocolPackage.eNS_URI) instanceof HwProtocolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwProtocolPackage.eNS_URI) : HwProtocolPackage.eINSTANCE);
		HwDiagramPackageImpl theHwDiagramPackage = (HwDiagramPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwDiagramPackage.eNS_URI) instanceof HwDiagramPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwDiagramPackage.eNS_URI) : HwDiagramPackage.eINSTANCE);
		SW_ResourceCorePackageImpl theSW_ResourceCorePackage = (SW_ResourceCorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SW_ResourceCorePackage.eNS_URI) instanceof SW_ResourceCorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SW_ResourceCorePackage.eNS_URI) : SW_ResourceCorePackage.eINSTANCE);
		SW_ConcurrencyPackageImpl theSW_ConcurrencyPackage = (SW_ConcurrencyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SW_ConcurrencyPackage.eNS_URI) instanceof SW_ConcurrencyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SW_ConcurrencyPackage.eNS_URI) : SW_ConcurrencyPackage.eINSTANCE);
		SW_BrokeringPackageImpl theSW_BrokeringPackage = (SW_BrokeringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SW_BrokeringPackage.eNS_URI) instanceof SW_BrokeringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SW_BrokeringPackage.eNS_URI) : SW_BrokeringPackage.eINSTANCE);
		SW_InteractionPackageImpl theSW_InteractionPackage = (SW_InteractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SW_InteractionPackage.eNS_URI) instanceof SW_InteractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SW_InteractionPackage.eNS_URI) : SW_InteractionPackage.eINSTANCE);
		GCMPackageImpl theGCMPackage = (GCMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GCMPackage.eNS_URI) instanceof GCMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GCMPackage.eNS_URI) : GCMPackage.eINSTANCE);
		GQAMPackageImpl theGQAMPackage = (GQAMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GQAMPackage.eNS_URI) instanceof GQAMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GQAMPackage.eNS_URI) : GQAMPackage.eINSTANCE);
		SAMPackageImpl theSAMPackage = (SAMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SAMPackage.eNS_URI) instanceof SAMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SAMPackage.eNS_URI) : SAMPackage.eINSTANCE);
		PAMPackageImpl thePAMPackage = (PAMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PAMPackage.eNS_URI) instanceof PAMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PAMPackage.eNS_URI) : PAMPackage.eINSTANCE);

		// Create package meta-data objects
		theHwComputingPackage.createPackageContents();
		theNFPsPackage.createPackageContents();
		theCoreElementsPackage.createPackageContents();
		theAllocPackage.createPackageContents();
		theTimePackage.createPackageContents();
		theGRMPackage.createPackageContents();
		theRSMPackage.createPackageContents();
		theVariablesPackage.createPackageContents();
		theDataTypesPackage.createPackageContents();
		theHLAMPackage.createPackageContents();
		theHwCommunicationPackage.createPackageContents();
		theHwStorageManagerPackage.createPackageContents();
		theHwMemoryPackage.createPackageContents();
		theHwTimingPackage.createPackageContents();
		theHwDevicePackage.createPackageContents();
		theHwGeneralPackage.createPackageContents();
		theHwLayoutPackage.createPackageContents();
		theHwPowerPackage.createPackageContents();
		theHwPeripheralPackage.createPackageContents();
		theHwDeviceFunctionPackage.createPackageContents();
		theHwIOPackage.createPackageContents();
		theHwRegisterPackage.createPackageContents();
		theHwDatasheetPackage.createPackageContents();
		theHwPackagePackage.createPackageContents();
		theHwProtocolPackage.createPackageContents();
		theHwDiagramPackage.createPackageContents();
		theSW_ResourceCorePackage.createPackageContents();
		theSW_ConcurrencyPackage.createPackageContents();
		theSW_BrokeringPackage.createPackageContents();
		theSW_InteractionPackage.createPackageContents();
		theGCMPackage.createPackageContents();
		theGQAMPackage.createPackageContents();
		theSAMPackage.createPackageContents();
		thePAMPackage.createPackageContents();

		// Initialize created meta-data
		theHwComputingPackage.initializePackageContents();
		theNFPsPackage.initializePackageContents();
		theCoreElementsPackage.initializePackageContents();
		theAllocPackage.initializePackageContents();
		theTimePackage.initializePackageContents();
		theGRMPackage.initializePackageContents();
		theRSMPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();
		theDataTypesPackage.initializePackageContents();
		theHLAMPackage.initializePackageContents();
		theHwCommunicationPackage.initializePackageContents();
		theHwStorageManagerPackage.initializePackageContents();
		theHwMemoryPackage.initializePackageContents();
		theHwTimingPackage.initializePackageContents();
		theHwDevicePackage.initializePackageContents();
		theHwGeneralPackage.initializePackageContents();
		theHwLayoutPackage.initializePackageContents();
		theHwPowerPackage.initializePackageContents();
		theHwPeripheralPackage.initializePackageContents();
		theHwDeviceFunctionPackage.initializePackageContents();
		theHwIOPackage.initializePackageContents();
		theHwRegisterPackage.initializePackageContents();
		theHwDatasheetPackage.initializePackageContents();
		theHwPackagePackage.initializePackageContents();
		theHwProtocolPackage.initializePackageContents();
		theHwDiagramPackage.initializePackageContents();
		theSW_ResourceCorePackage.initializePackageContents();
		theSW_ConcurrencyPackage.initializePackageContents();
		theSW_BrokeringPackage.initializePackageContents();
		theSW_InteractionPackage.initializePackageContents();
		theGCMPackage.initializePackageContents();
		theGQAMPackage.initializePackageContents();
		theSAMPackage.initializePackageContents();
		thePAMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHwComputingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HwComputingPackage.eNS_URI, theHwComputingPackage);
		return theHwComputingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPLD_Organization() {
		return plD_OrganizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPLD_Organization_NbRows() {
		return (EReference)plD_OrganizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPLD_Organization_NbColumns() {
		return (EReference)plD_OrganizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPLD_Organization_Class() {
		return (EAttribute)plD_OrganizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwProcessor() {
		return hwProcessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwProcessor_Architecture() {
		return (EReference)hwProcessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwProcessor_Mips() {
		return (EReference)hwProcessorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwProcessor_Ipc() {
		return (EReference)hwProcessorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwProcessor_NbCores() {
		return (EReference)hwProcessorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwProcessor_NbPipelines() {
		return (EReference)hwProcessorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwProcessor_NbStages() {
		return (EReference)hwProcessorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwProcessor_NbALUs() {
		return (EReference)hwProcessorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwProcessor_NbFPUs() {
		return (EReference)hwProcessorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwProcessor_OwnedISAs() {
		return (EReference)hwProcessorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwProcessor_Predictors() {
		return (EReference)hwProcessorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwProcessor_Caches() {
		return (EReference)hwProcessorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwProcessor_OwnedMMUs() {
		return (EReference)hwProcessorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwComputingResource() {
		return hwComputingResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwComputingResource_Op_Frequencies() {
		return (EReference)hwComputingResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwISA() {
		return hwISAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwISA_Family() {
		return (EReference)hwISAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwISA_Inst_Width() {
		return (EReference)hwISAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwISA_Type() {
		return (EAttribute)hwISAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwBranchPredictor() {
		return hwBranchPredictorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwASIC() {
		return hwASICEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwPLD() {
		return hwPLDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwPLD_Technology() {
		return (EAttribute)hwPLDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwPLD_Organization() {
		return (EReference)hwPLDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwPLD_NbLUTs() {
		return (EReference)hwPLDEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwPLD_NdLUT_Inputs() {
		return (EReference)hwPLDEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwPLD_NbFlipFlops() {
		return (EReference)hwPLDEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwPLD_BlocksRAM() {
		return (EReference)hwPLDEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwPLD_BlocksComputing() {
		return (EReference)hwPLDEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwMCU() {
		return hwMCUEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwMCU_Processor() {
		return (EReference)hwMCUEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwMCU_Peripherals() {
		return (EReference)hwMCUEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwMCU_Sfr() {
		return (EReference)hwMCUEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwMCU_Packages() {
		return (EReference)hwMCUEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwMCU_Pins() {
		return (EReference)hwMCUEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwMCU_Ports() {
		return (EReference)hwMCUEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getISA_Type() {
		return isA_TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPLD_Technology() {
		return plD_TechnologyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPLD_Class() {
		return plD_ClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwComputingFactory getHwComputingFactory() {
		return (HwComputingFactory)getEFactoryInstance();
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
		plD_OrganizationEClass = createEClass(PLD_ORGANIZATION);
		createEReference(plD_OrganizationEClass, PLD_ORGANIZATION__NB_ROWS);
		createEReference(plD_OrganizationEClass, PLD_ORGANIZATION__NB_COLUMNS);
		createEAttribute(plD_OrganizationEClass, PLD_ORGANIZATION__CLASS);

		hwProcessorEClass = createEClass(HW_PROCESSOR);
		createEReference(hwProcessorEClass, HW_PROCESSOR__ARCHITECTURE);
		createEReference(hwProcessorEClass, HW_PROCESSOR__MIPS);
		createEReference(hwProcessorEClass, HW_PROCESSOR__IPC);
		createEReference(hwProcessorEClass, HW_PROCESSOR__NB_CORES);
		createEReference(hwProcessorEClass, HW_PROCESSOR__NB_PIPELINES);
		createEReference(hwProcessorEClass, HW_PROCESSOR__NB_STAGES);
		createEReference(hwProcessorEClass, HW_PROCESSOR__NB_AL_US);
		createEReference(hwProcessorEClass, HW_PROCESSOR__NB_FP_US);
		createEReference(hwProcessorEClass, HW_PROCESSOR__OWNED_IS_AS);
		createEReference(hwProcessorEClass, HW_PROCESSOR__PREDICTORS);
		createEReference(hwProcessorEClass, HW_PROCESSOR__CACHES);
		createEReference(hwProcessorEClass, HW_PROCESSOR__OWNED_MM_US);

		hwComputingResourceEClass = createEClass(HW_COMPUTING_RESOURCE);
		createEReference(hwComputingResourceEClass, HW_COMPUTING_RESOURCE__OP_FREQUENCIES);

		hwISAEClass = createEClass(HW_ISA);
		createEReference(hwISAEClass, HW_ISA__FAMILY);
		createEReference(hwISAEClass, HW_ISA__INST_WIDTH);
		createEAttribute(hwISAEClass, HW_ISA__TYPE);

		hwBranchPredictorEClass = createEClass(HW_BRANCH_PREDICTOR);

		hwASICEClass = createEClass(HW_ASIC);

		hwPLDEClass = createEClass(HW_PLD);
		createEAttribute(hwPLDEClass, HW_PLD__TECHNOLOGY);
		createEReference(hwPLDEClass, HW_PLD__ORGANIZATION);
		createEReference(hwPLDEClass, HW_PLD__NB_LU_TS);
		createEReference(hwPLDEClass, HW_PLD__ND_LUT_INPUTS);
		createEReference(hwPLDEClass, HW_PLD__NB_FLIP_FLOPS);
		createEReference(hwPLDEClass, HW_PLD__BLOCKS_RAM);
		createEReference(hwPLDEClass, HW_PLD__BLOCKS_COMPUTING);

		hwMCUEClass = createEClass(HW_MCU);
		createEReference(hwMCUEClass, HW_MCU__PROCESSOR);
		createEReference(hwMCUEClass, HW_MCU__PERIPHERALS);
		createEReference(hwMCUEClass, HW_MCU__SFR);
		createEReference(hwMCUEClass, HW_MCU__PACKAGES);
		createEReference(hwMCUEClass, HW_MCU__PINS);
		createEReference(hwMCUEClass, HW_MCU__PORTS);

		// Create enums
		isA_TypeEEnum = createEEnum(ISA_TYPE);
		plD_TechnologyEEnum = createEEnum(PLD_TECHNOLOGY);
		plD_ClassEEnum = createEEnum(PLD_CLASS);
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
		BasicNFP_TypesPackage theBasicNFP_TypesPackage = (BasicNFP_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI);
		HwMemoryPackage theHwMemoryPackage = (HwMemoryPackage)EPackage.Registry.INSTANCE.getEPackage(HwMemoryPackage.eNS_URI);
		HwStorageManagerPackage theHwStorageManagerPackage = (HwStorageManagerPackage)EPackage.Registry.INSTANCE.getEPackage(HwStorageManagerPackage.eNS_URI);
		HwGeneralPackage theHwGeneralPackage = (HwGeneralPackage)EPackage.Registry.INSTANCE.getEPackage(HwGeneralPackage.eNS_URI);
		GRMPackage theGRMPackage = (GRMPackage)EPackage.Registry.INSTANCE.getEPackage(GRMPackage.eNS_URI);
		MARTE_DataTypesPackage theMARTE_DataTypesPackage = (MARTE_DataTypesPackage)EPackage.Registry.INSTANCE.getEPackage(MARTE_DataTypesPackage.eNS_URI);
		HwDevicePackage theHwDevicePackage = (HwDevicePackage)EPackage.Registry.INSTANCE.getEPackage(HwDevicePackage.eNS_URI);
		HwRegisterPackage theHwRegisterPackage = (HwRegisterPackage)EPackage.Registry.INSTANCE.getEPackage(HwRegisterPackage.eNS_URI);
		HwPackagePackage theHwPackagePackage = (HwPackagePackage)EPackage.Registry.INSTANCE.getEPackage(HwPackagePackage.eNS_URI);
		HwIOPackage theHwIOPackage = (HwIOPackage)EPackage.Registry.INSTANCE.getEPackage(HwIOPackage.eNS_URI);
		HwCommunicationPackage theHwCommunicationPackage = (HwCommunicationPackage)EPackage.Registry.INSTANCE.getEPackage(HwCommunicationPackage.eNS_URI);

		// Add supertypes to classes
		hwProcessorEClass.getESuperTypes().add(this.getHwComputingResource());
		hwComputingResourceEClass.getESuperTypes().add(theHwGeneralPackage.getHwResource());
		hwComputingResourceEClass.getESuperTypes().add(theGRMPackage.getComputingResource());
		hwISAEClass.getESuperTypes().add(theHwGeneralPackage.getHwResource());
		hwBranchPredictorEClass.getESuperTypes().add(theHwGeneralPackage.getHwResource());
		hwASICEClass.getESuperTypes().add(this.getHwComputingResource());
		hwPLDEClass.getESuperTypes().add(this.getHwComputingResource());
		hwMCUEClass.getESuperTypes().add(this.getHwComputingResource());

		// Initialize classes and features; add operations and parameters
		initEClass(plD_OrganizationEClass, PLD_Organization.class, "PLD_Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPLD_Organization_NbRows(), theBasicNFP_TypesPackage.getNFP_Integer(), null, "nbRows", null, 0, 1, PLD_Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPLD_Organization_NbColumns(), theBasicNFP_TypesPackage.getNFP_Natural(), null, "nbColumns", null, 0, 1, PLD_Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPLD_Organization_Class(), this.getPLD_Class(), "class", null, 0, 1, PLD_Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hwProcessorEClass, HwProcessor.class, "HwProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwProcessor_Architecture(), theBasicNFP_TypesPackage.getNFP_DataSize(), null, "architecture", null, 0, 1, HwProcessor.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getHwProcessor_Mips(), theBasicNFP_TypesPackage.getNFP_Natural(), null, "mips", null, 0, 1, HwProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwProcessor_Ipc(), theBasicNFP_TypesPackage.getNFP_Real(), null, "ipc", null, 0, 1, HwProcessor.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getHwProcessor_NbCores(), theBasicNFP_TypesPackage.getNFP_Natural(), null, "nbCores", null, 0, 1, HwProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwProcessor_NbPipelines(), theBasicNFP_TypesPackage.getNFP_Natural(), null, "nbPipelines", null, 0, 1, HwProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwProcessor_NbStages(), theBasicNFP_TypesPackage.getNFP_Natural(), null, "nbStages", null, 0, 1, HwProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwProcessor_NbALUs(), theBasicNFP_TypesPackage.getNFP_Natural(), null, "nbALUs", null, 0, 1, HwProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwProcessor_NbFPUs(), theBasicNFP_TypesPackage.getNFP_Natural(), null, "nbFPUs", null, 0, 1, HwProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwProcessor_OwnedISAs(), this.getHwISA(), null, "ownedISAs", null, 0, -1, HwProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwProcessor_Predictors(), this.getHwBranchPredictor(), null, "predictors", null, 0, -1, HwProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwProcessor_Caches(), theHwMemoryPackage.getHwCache(), null, "caches", null, 0, -1, HwProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwProcessor_OwnedMMUs(), theHwStorageManagerPackage.getHwMMU(), null, "ownedMMUs", null, 0, -1, HwProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hwComputingResourceEClass, HwComputingResource.class, "HwComputingResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwComputingResource_Op_Frequencies(), theMARTE_DataTypesPackage.getNFP_FrequencyInterval(), null, "op_Frequencies", null, 0, 1, HwComputingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hwISAEClass, HwISA.class, "HwISA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwISA_Family(), theBasicNFP_TypesPackage.getNFP_String(), null, "family", null, 0, 1, HwISA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwISA_Inst_Width(), theBasicNFP_TypesPackage.getNFP_DataSize(), null, "inst_Width", null, 0, 1, HwISA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHwISA_Type(), this.getISA_Type(), "type", null, 0, 1, HwISA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hwBranchPredictorEClass, HwBranchPredictor.class, "HwBranchPredictor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hwASICEClass, HwASIC.class, "HwASIC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hwPLDEClass, HwPLD.class, "HwPLD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHwPLD_Technology(), this.getPLD_Technology(), "technology", null, 0, 1, HwPLD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwPLD_Organization(), this.getPLD_Organization(), null, "organization", null, 0, 1, HwPLD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwPLD_NbLUTs(), theBasicNFP_TypesPackage.getNFP_Natural(), null, "nbLUTs", null, 0, 1, HwPLD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwPLD_NdLUT_Inputs(), theBasicNFP_TypesPackage.getNFP_Natural(), null, "ndLUT_Inputs", null, 0, 1, HwPLD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwPLD_NbFlipFlops(), theBasicNFP_TypesPackage.getNFP_Natural(), null, "nbFlipFlops", null, 0, 1, HwPLD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwPLD_BlocksRAM(), theHwMemoryPackage.getHwRAM(), null, "blocksRAM", null, 0, -1, HwPLD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwPLD_BlocksComputing(), this.getHwComputingResource(), null, "blocksComputing", null, 0, -1, HwPLD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hwMCUEClass, HwMCU.class, "HwMCU", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwMCU_Processor(), this.getHwProcessor(), null, "processor", null, 0, -1, HwMCU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwMCU_Peripherals(), theHwDevicePackage.getHwPeripheral(), null, "peripherals", null, 0, -1, HwMCU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwMCU_Sfr(), theHwRegisterPackage.getHwRegister(), null, "sfr", null, 0, -1, HwMCU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwMCU_Packages(), theHwPackagePackage.getHwPackage(), null, "packages", null, 0, -1, HwMCU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwMCU_Pins(), theHwIOPackage.getHwPin(), null, "pins", null, 0, -1, HwMCU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwMCU_Ports(), theHwCommunicationPackage.getHwPort(), null, "ports", null, 0, -1, HwMCU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(isA_TypeEEnum, ISA_Type.class, "ISA_Type");
		addEEnumLiteral(isA_TypeEEnum, ISA_Type.RISC_LITERAL);
		addEEnumLiteral(isA_TypeEEnum, ISA_Type.CISC_LITERAL);
		addEEnumLiteral(isA_TypeEEnum, ISA_Type.VLIW_LITERAL);
		addEEnumLiteral(isA_TypeEEnum, ISA_Type.SIMD_LITERAL);
		addEEnumLiteral(isA_TypeEEnum, ISA_Type.OTHER_LITERAL);
		addEEnumLiteral(isA_TypeEEnum, ISA_Type.UNDEF_LITERAL);

		initEEnum(plD_TechnologyEEnum, PLD_Technology.class, "PLD_Technology");
		addEEnumLiteral(plD_TechnologyEEnum, PLD_Technology.SRAM_LITERAL);
		addEEnumLiteral(plD_TechnologyEEnum, PLD_Technology.ANTIFUSE_LITERAL);
		addEEnumLiteral(plD_TechnologyEEnum, PLD_Technology.FLASH_LITERAL);
		addEEnumLiteral(plD_TechnologyEEnum, PLD_Technology.OTHER_LITERAL);
		addEEnumLiteral(plD_TechnologyEEnum, PLD_Technology.UNDEF_LITERAL);

		initEEnum(plD_ClassEEnum, PLD_Class.class, "PLD_Class");
		addEEnumLiteral(plD_ClassEEnum, PLD_Class.SYMETRICAL_ARRAY_LITERAL);
		addEEnumLiteral(plD_ClassEEnum, PLD_Class.ROW_BASED_LITERAL);
		addEEnumLiteral(plD_ClassEEnum, PLD_Class.SEA_OF_GATES_LITERAL);
		addEEnumLiteral(plD_ClassEEnum, PLD_Class.HIERARCHICAL_PLD_LITERAL);
		addEEnumLiteral(plD_ClassEEnum, PLD_Class.OTHER_LITERAL);
		addEEnumLiteral(plD_ClassEEnum, PLD_Class.UNDEF_LITERAL);

		// Create resource
		createResource(eNS_URI);
	}

} //HwComputingPackageImpl
