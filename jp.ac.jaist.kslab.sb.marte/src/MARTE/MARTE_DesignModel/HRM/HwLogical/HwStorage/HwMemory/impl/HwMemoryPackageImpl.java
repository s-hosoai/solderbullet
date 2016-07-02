/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl;

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

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingPackageImpl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDevicePackageImpl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheStructure;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheType;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwDrive;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryFactory;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwROM;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.MemoryOrganization;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.ROM_Type;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Repl_Policy;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Timing;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.WritePolicy;

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
public class HwMemoryPackageImpl extends EPackageImpl implements HwMemoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwMemoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cacheStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryOrganizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwRAMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwROMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwDriveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwCacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum repl_PolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum writePolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cacheTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roM_TypeEEnum = null;

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
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HwMemoryPackageImpl() {
		super(eNS_URI, HwMemoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HwMemoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HwMemoryPackage init() {
		if (isInited) return (HwMemoryPackage)EPackage.Registry.INSTANCE.getEPackage(HwMemoryPackage.eNS_URI);

		// Obtain or create and register package
		HwMemoryPackageImpl theHwMemoryPackage = (HwMemoryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HwMemoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HwMemoryPackageImpl());

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
		HwComputingPackageImpl theHwComputingPackage = (HwComputingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwComputingPackage.eNS_URI) instanceof HwComputingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwComputingPackage.eNS_URI) : HwComputingPackage.eINSTANCE);
		HwCommunicationPackageImpl theHwCommunicationPackage = (HwCommunicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwCommunicationPackage.eNS_URI) instanceof HwCommunicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwCommunicationPackage.eNS_URI) : HwCommunicationPackage.eINSTANCE);
		HwStorageManagerPackageImpl theHwStorageManagerPackage = (HwStorageManagerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HwStorageManagerPackage.eNS_URI) instanceof HwStorageManagerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HwStorageManagerPackage.eNS_URI) : HwStorageManagerPackage.eINSTANCE);
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
		theHwMemoryPackage.createPackageContents();
		theNFPsPackage.createPackageContents();
		theCoreElementsPackage.createPackageContents();
		theAllocPackage.createPackageContents();
		theTimePackage.createPackageContents();
		theGRMPackage.createPackageContents();
		theRSMPackage.createPackageContents();
		theVariablesPackage.createPackageContents();
		theDataTypesPackage.createPackageContents();
		theHLAMPackage.createPackageContents();
		theHwComputingPackage.createPackageContents();
		theHwCommunicationPackage.createPackageContents();
		theHwStorageManagerPackage.createPackageContents();
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
		theHwMemoryPackage.initializePackageContents();
		theNFPsPackage.initializePackageContents();
		theCoreElementsPackage.initializePackageContents();
		theAllocPackage.initializePackageContents();
		theTimePackage.initializePackageContents();
		theGRMPackage.initializePackageContents();
		theRSMPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();
		theDataTypesPackage.initializePackageContents();
		theHLAMPackage.initializePackageContents();
		theHwComputingPackage.initializePackageContents();
		theHwCommunicationPackage.initializePackageContents();
		theHwStorageManagerPackage.initializePackageContents();
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
		theHwMemoryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HwMemoryPackage.eNS_URI, theHwMemoryPackage);
		return theHwMemoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwMemory() {
		return hwMemoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwMemory_MemorySize() {
		return (EReference)hwMemoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwMemory_AdressSize() {
		return (EReference)hwMemoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwMemory_Timings() {
		return (EReference)hwMemoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwMemory_Throughput() {
		return (EReference)hwMemoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTiming() {
		return timingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiming_Notation() {
		return (EReference)timingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiming_Description() {
		return (EReference)timingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiming_Value() {
		return (EReference)timingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCacheStructure() {
		return cacheStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCacheStructure_NbSets() {
		return (EReference)cacheStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCacheStructure_BlockSize() {
		return (EReference)cacheStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCacheStructure_Associativity() {
		return (EReference)cacheStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryOrganization() {
		return memoryOrganizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryOrganization_NbRows() {
		return (EReference)memoryOrganizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryOrganization_NbColumns() {
		return (EReference)memoryOrganizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryOrganization_NbBanks() {
		return (EReference)memoryOrganizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryOrganization_WordSize() {
		return (EReference)memoryOrganizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwRAM() {
		return hwRAMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwRAM_Organization() {
		return (EReference)hwRAMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwRAM_IsSynchronous() {
		return (EReference)hwRAMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwRAM_IsStatic() {
		return (EReference)hwRAMEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwRAM_IsNonVolatile() {
		return (EReference)hwRAMEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwRAM_Repl_Policy() {
		return (EAttribute)hwRAMEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwRAM_WritePolicy() {
		return (EAttribute)hwRAMEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwROM() {
		return hwROMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwROM_Type() {
		return (EAttribute)hwROMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwROM_Organization() {
		return (EReference)hwROMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwDrive() {
		return hwDriveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwDrive_SectorSize() {
		return (EReference)hwDriveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwDrive_Buffer() {
		return (EReference)hwDriveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwCache() {
		return hwCacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwCache_Level() {
		return (EReference)hwCacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwCache_Type() {
		return (EAttribute)hwCacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwCache_Structure() {
		return (EReference)hwCacheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwCache_Repl_Policy() {
		return (EAttribute)hwCacheEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwCache_WritePolicy() {
		return (EAttribute)hwCacheEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRepl_Policy() {
		return repl_PolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWritePolicy() {
		return writePolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCacheType() {
		return cacheTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getROM_Type() {
		return roM_TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwMemoryFactory getHwMemoryFactory() {
		return (HwMemoryFactory)getEFactoryInstance();
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
		hwMemoryEClass = createEClass(HW_MEMORY);
		createEReference(hwMemoryEClass, HW_MEMORY__MEMORY_SIZE);
		createEReference(hwMemoryEClass, HW_MEMORY__ADRESS_SIZE);
		createEReference(hwMemoryEClass, HW_MEMORY__TIMINGS);
		createEReference(hwMemoryEClass, HW_MEMORY__THROUGHPUT);

		timingEClass = createEClass(TIMING);
		createEReference(timingEClass, TIMING__NOTATION);
		createEReference(timingEClass, TIMING__DESCRIPTION);
		createEReference(timingEClass, TIMING__VALUE);

		cacheStructureEClass = createEClass(CACHE_STRUCTURE);
		createEReference(cacheStructureEClass, CACHE_STRUCTURE__NB_SETS);
		createEReference(cacheStructureEClass, CACHE_STRUCTURE__BLOCK_SIZE);
		createEReference(cacheStructureEClass, CACHE_STRUCTURE__ASSOCIATIVITY);

		memoryOrganizationEClass = createEClass(MEMORY_ORGANIZATION);
		createEReference(memoryOrganizationEClass, MEMORY_ORGANIZATION__NB_ROWS);
		createEReference(memoryOrganizationEClass, MEMORY_ORGANIZATION__NB_COLUMNS);
		createEReference(memoryOrganizationEClass, MEMORY_ORGANIZATION__NB_BANKS);
		createEReference(memoryOrganizationEClass, MEMORY_ORGANIZATION__WORD_SIZE);

		hwRAMEClass = createEClass(HW_RAM);
		createEReference(hwRAMEClass, HW_RAM__ORGANIZATION);
		createEReference(hwRAMEClass, HW_RAM__IS_SYNCHRONOUS);
		createEReference(hwRAMEClass, HW_RAM__IS_STATIC);
		createEReference(hwRAMEClass, HW_RAM__IS_NON_VOLATILE);
		createEAttribute(hwRAMEClass, HW_RAM__REPL_POLICY);
		createEAttribute(hwRAMEClass, HW_RAM__WRITE_POLICY);

		hwROMEClass = createEClass(HW_ROM);
		createEAttribute(hwROMEClass, HW_ROM__TYPE);
		createEReference(hwROMEClass, HW_ROM__ORGANIZATION);

		hwDriveEClass = createEClass(HW_DRIVE);
		createEReference(hwDriveEClass, HW_DRIVE__SECTOR_SIZE);
		createEReference(hwDriveEClass, HW_DRIVE__BUFFER);

		hwCacheEClass = createEClass(HW_CACHE);
		createEReference(hwCacheEClass, HW_CACHE__LEVEL);
		createEAttribute(hwCacheEClass, HW_CACHE__TYPE);
		createEReference(hwCacheEClass, HW_CACHE__STRUCTURE);
		createEAttribute(hwCacheEClass, HW_CACHE__REPL_POLICY);
		createEAttribute(hwCacheEClass, HW_CACHE__WRITE_POLICY);

		// Create enums
		repl_PolicyEEnum = createEEnum(REPL_POLICY);
		writePolicyEEnum = createEEnum(WRITE_POLICY);
		cacheTypeEEnum = createEEnum(CACHE_TYPE);
		roM_TypeEEnum = createEEnum(ROM_TYPE);
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
		HwGeneralPackage theHwGeneralPackage = (HwGeneralPackage)EPackage.Registry.INSTANCE.getEPackage(HwGeneralPackage.eNS_URI);
		GRMPackage theGRMPackage = (GRMPackage)EPackage.Registry.INSTANCE.getEPackage(GRMPackage.eNS_URI);
		BasicNFP_TypesPackage theBasicNFP_TypesPackage = (BasicNFP_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI);

		// Add supertypes to classes
		hwMemoryEClass.getESuperTypes().add(theHwGeneralPackage.getHwResource());
		hwMemoryEClass.getESuperTypes().add(theGRMPackage.getStorageResource());
		hwRAMEClass.getESuperTypes().add(this.getHwMemory());
		hwROMEClass.getESuperTypes().add(this.getHwMemory());
		hwDriveEClass.getESuperTypes().add(this.getHwMemory());
		hwCacheEClass.getESuperTypes().add(this.getHwMemory());

		// Initialize classes and features; add operations and parameters
		initEClass(hwMemoryEClass, HwMemory.class, "HwMemory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwMemory_MemorySize(), theBasicNFP_TypesPackage.getNFP_DataSize(), null, "memorySize", null, 0, 1, HwMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwMemory_AdressSize(), theBasicNFP_TypesPackage.getNFP_DataSize(), null, "adressSize", null, 0, 1, HwMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwMemory_Timings(), this.getTiming(), null, "timings", null, 0, -1, HwMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwMemory_Throughput(), theBasicNFP_TypesPackage.getNFP_DataTxRate(), null, "throughput", null, 0, 1, HwMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(timingEClass, Timing.class, "Timing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTiming_Notation(), theBasicNFP_TypesPackage.getNFP_String(), null, "notation", null, 0, 1, Timing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTiming_Description(), theBasicNFP_TypesPackage.getNFP_String(), null, "description", null, 0, 1, Timing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTiming_Value(), theBasicNFP_TypesPackage.getNFP_Duration(), null, "value", null, 0, 1, Timing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cacheStructureEClass, CacheStructure.class, "CacheStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCacheStructure_NbSets(), theBasicNFP_TypesPackage.getNFP_Natural(), null, "nbSets", null, 0, 1, CacheStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCacheStructure_BlockSize(), theBasicNFP_TypesPackage.getNFP_DataSize(), null, "blockSize", null, 0, 1, CacheStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCacheStructure_Associativity(), theBasicNFP_TypesPackage.getNFP_Natural(), null, "associativity", null, 0, 1, CacheStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(memoryOrganizationEClass, MemoryOrganization.class, "MemoryOrganization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemoryOrganization_NbRows(), theBasicNFP_TypesPackage.getNFP_Natural(), null, "nbRows", null, 0, 1, MemoryOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMemoryOrganization_NbColumns(), theBasicNFP_TypesPackage.getNFP_Natural(), null, "nbColumns", null, 0, 1, MemoryOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMemoryOrganization_NbBanks(), theBasicNFP_TypesPackage.getNFP_Natural(), null, "nbBanks", null, 0, 1, MemoryOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMemoryOrganization_WordSize(), theBasicNFP_TypesPackage.getNFP_DataSize(), null, "wordSize", null, 0, 1, MemoryOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hwRAMEClass, HwRAM.class, "HwRAM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwRAM_Organization(), this.getMemoryOrganization(), null, "organization", null, 0, 1, HwRAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwRAM_IsSynchronous(), theBasicNFP_TypesPackage.getNFP_Boolean(), null, "isSynchronous", null, 0, 1, HwRAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwRAM_IsStatic(), theBasicNFP_TypesPackage.getNFP_Boolean(), null, "isStatic", null, 0, 1, HwRAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwRAM_IsNonVolatile(), theBasicNFP_TypesPackage.getNFP_Boolean(), null, "isNonVolatile", null, 0, 1, HwRAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHwRAM_Repl_Policy(), this.getRepl_Policy(), "repl_Policy", null, 0, 1, HwRAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHwRAM_WritePolicy(), this.getWritePolicy(), "writePolicy", null, 0, 1, HwRAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hwROMEClass, HwROM.class, "HwROM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHwROM_Type(), this.getROM_Type(), "type", null, 0, 1, HwROM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwROM_Organization(), this.getMemoryOrganization(), null, "organization", null, 0, 1, HwROM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hwDriveEClass, HwDrive.class, "HwDrive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwDrive_SectorSize(), theBasicNFP_TypesPackage.getNFP_DataSize(), null, "sectorSize", null, 0, 1, HwDrive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwDrive_Buffer(), this.getHwRAM(), null, "buffer", null, 0, 1, HwDrive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hwCacheEClass, HwCache.class, "HwCache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwCache_Level(), theBasicNFP_TypesPackage.getNFP_Natural(), null, "level", null, 0, 1, HwCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHwCache_Type(), this.getCacheType(), "type", null, 0, 1, HwCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwCache_Structure(), this.getCacheStructure(), null, "structure", null, 0, 1, HwCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHwCache_Repl_Policy(), this.getRepl_Policy(), "repl_Policy", null, 0, 1, HwCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHwCache_WritePolicy(), this.getWritePolicy(), "writePolicy", null, 0, 1, HwCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(repl_PolicyEEnum, Repl_Policy.class, "Repl_Policy");
		addEEnumLiteral(repl_PolicyEEnum, Repl_Policy.LRU_LITERAL);
		addEEnumLiteral(repl_PolicyEEnum, Repl_Policy.NFU_LITERAL);
		addEEnumLiteral(repl_PolicyEEnum, Repl_Policy.FIFO_LITERAL);
		addEEnumLiteral(repl_PolicyEEnum, Repl_Policy.RANDOM_LITERAL);
		addEEnumLiteral(repl_PolicyEEnum, Repl_Policy.OTHER_LITERAL);
		addEEnumLiteral(repl_PolicyEEnum, Repl_Policy.UNDEF_LITERAL);

		initEEnum(writePolicyEEnum, WritePolicy.class, "WritePolicy");
		addEEnumLiteral(writePolicyEEnum, WritePolicy.WRITE_BACK_LITERAL);
		addEEnumLiteral(writePolicyEEnum, WritePolicy.WRITE_THROUGH_LITERAL);
		addEEnumLiteral(writePolicyEEnum, WritePolicy.OTHER_LITERAL);
		addEEnumLiteral(writePolicyEEnum, WritePolicy.UNDEF_LITERAL);

		initEEnum(cacheTypeEEnum, CacheType.class, "CacheType");
		addEEnumLiteral(cacheTypeEEnum, CacheType.DATA_LITERAL);
		addEEnumLiteral(cacheTypeEEnum, CacheType.INSTRUCTION_LITERAL);
		addEEnumLiteral(cacheTypeEEnum, CacheType.UNIFIED_LITERAL);
		addEEnumLiteral(cacheTypeEEnum, CacheType.OTHER_LITERAL);
		addEEnumLiteral(cacheTypeEEnum, CacheType.UNDEF_LITERAL);

		initEEnum(roM_TypeEEnum, ROM_Type.class, "ROM_Type");
		addEEnumLiteral(roM_TypeEEnum, ROM_Type.MASKED_ROM_LITERAL);
		addEEnumLiteral(roM_TypeEEnum, ROM_Type.EPROM_LITERAL);
		addEEnumLiteral(roM_TypeEEnum, ROM_Type.OTP_EPROM_LITERAL);
		addEEnumLiteral(roM_TypeEEnum, ROM_Type.EEPROM_LITERAL);
		addEEnumLiteral(roM_TypeEEnum, ROM_Type.FLASH_LITERAL);
		addEEnumLiteral(roM_TypeEEnum, ROM_Type.OTHER_LITERAL);
		addEEnumLiteral(roM_TypeEEnum, ROM_Type.UNDEF_LITERAL);

		// Create resource
		createResource(eNS_URI);
	}

} //HwMemoryPackageImpl
