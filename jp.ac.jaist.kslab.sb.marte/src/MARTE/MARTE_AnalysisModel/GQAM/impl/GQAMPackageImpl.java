/**
 */
package MARTE.MARTE_AnalysisModel.GQAM.impl;

import MARTE.MARTE_AnalysisModel.GQAM.GQAMFactory;
import MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;
import MARTE.MARTE_AnalysisModel.GQAM.GaAcqStep;
import MARTE.MARTE_AnalysisModel.GQAM.GaAnalysisContext;
import MARTE.MARTE_AnalysisModel.GQAM.GaCommChannel;
import MARTE.MARTE_AnalysisModel.GQAM.GaCommHost;
import MARTE.MARTE_AnalysisModel.GQAM.GaCommStep;
import MARTE.MARTE_AnalysisModel.GQAM.GaEventTrace;
import MARTE.MARTE_AnalysisModel.GQAM.GaExecHost;
import MARTE.MARTE_AnalysisModel.GQAM.GaLatencyObs;
import MARTE.MARTE_AnalysisModel.GQAM.GaRelStep;
import MARTE.MARTE_AnalysisModel.GQAM.GaRequestedService;
import MARTE.MARTE_AnalysisModel.GQAM.GaResourcesPlatform;
import MARTE.MARTE_AnalysisModel.GQAM.GaScenario;
import MARTE.MARTE_AnalysisModel.GQAM.GaStep;
import MARTE.MARTE_AnalysisModel.GQAM.GaTimedObs;
import MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadBehavior;
import MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent;
import MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadGenerator;
import MARTE.MARTE_AnalysisModel.GQAM.LaxityKind;

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
public class GQAMPackageImpl extends EPackageImpl implements GQAMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaWorkloadGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaEventTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaWorkloadEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaScenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaExecHostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaRequestedServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaTimedObsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaCommStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaAcqStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaRelStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaLatencyObsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaCommHostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaCommChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaWorkloadBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaAnalysisContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaResourcesPlatformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum laxityKindEEnum = null;

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
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GQAMPackageImpl() {
		super(eNS_URI, GQAMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GQAMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GQAMPackage init() {
		if (isInited) return (GQAMPackage)EPackage.Registry.INSTANCE.getEPackage(GQAMPackage.eNS_URI);

		// Obtain or create and register package
		GQAMPackageImpl theGQAMPackage = (GQAMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GQAMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GQAMPackageImpl());

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
		SAMPackageImpl theSAMPackage = (SAMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SAMPackage.eNS_URI) instanceof SAMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SAMPackage.eNS_URI) : SAMPackage.eINSTANCE);
		PAMPackageImpl thePAMPackage = (PAMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PAMPackage.eNS_URI) instanceof PAMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PAMPackage.eNS_URI) : PAMPackage.eINSTANCE);

		// Create package meta-data objects
		theGQAMPackage.createPackageContents();
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
		theSAMPackage.createPackageContents();
		thePAMPackage.createPackageContents();

		// Initialize created meta-data
		theGQAMPackage.initializePackageContents();
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
		theSAMPackage.initializePackageContents();
		thePAMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGQAMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GQAMPackage.eNS_URI, theGQAMPackage);
		return theGQAMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGaWorkloadGenerator() {
		return gaWorkloadGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaWorkloadGenerator_Pop() {
		return (EReference)gaWorkloadGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaWorkloadGenerator_Base_Behavior() {
		return (EReference)gaWorkloadGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGaEventTrace() {
		return gaEventTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGaEventTrace_Content() {
		return (EAttribute)gaEventTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGaEventTrace_Format() {
		return (EAttribute)gaEventTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGaEventTrace_Location() {
		return (EAttribute)gaEventTraceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaEventTrace_Base_NamedElement() {
		return (EReference)gaEventTraceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGaWorkloadEvent() {
		return gaWorkloadEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaWorkloadEvent_Pattern() {
		return (EReference)gaWorkloadEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaWorkloadEvent_Generator() {
		return (EReference)gaWorkloadEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaWorkloadEvent_Trace() {
		return (EReference)gaWorkloadEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaWorkloadEvent_Effect() {
		return (EReference)gaWorkloadEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaWorkloadEvent_TimedEvent() {
		return (EReference)gaWorkloadEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaWorkloadEvent_Base_NamedElement() {
		return (EReference)gaWorkloadEventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGaScenario() {
		return gaScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaScenario_Cause() {
		return (EReference)gaScenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaScenario_HostDemand() {
		return (EReference)gaScenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaScenario_HostDemandOps() {
		return (EReference)gaScenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaScenario_InterOccT() {
		return (EReference)gaScenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaScenario_Throughput() {
		return (EReference)gaScenarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaScenario_RespT() {
		return (EReference)gaScenarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaScenario_Utilization() {
		return (EReference)gaScenarioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaScenario_UtilizationOnHost() {
		return (EReference)gaScenarioEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaScenario_Root() {
		return (EReference)gaScenarioEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaScenario_Timing() {
		return (EReference)gaScenarioEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGaStep() {
		return gaStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaStep_IsAtomic() {
		return (EReference)gaStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaStep_BlockT() {
		return (EReference)gaStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaStep_Rep() {
		return (EReference)gaStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaStep_Prob() {
		return (EReference)gaStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaStep_Priority() {
		return (EReference)gaStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaStep_ConcurRes() {
		return (EReference)gaStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaStep_Host() {
		return (EReference)gaStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaStep_ServDemand() {
		return (EReference)gaStepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaStep_ServCount() {
		return (EReference)gaStepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaStep_Behavior() {
		return (EReference)gaStepEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaStep_SelfDelay() {
		return (EReference)gaStepEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGaExecHost() {
		return gaExecHostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaExecHost_CommTxOvh() {
		return (EReference)gaExecHostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaExecHost_CommRcvOvh() {
		return (EReference)gaExecHostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaExecHost_CntxtSwT() {
		return (EReference)gaExecHostEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaExecHost_ClockOvh() {
		return (EReference)gaExecHostEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaExecHost_SchedPriRange() {
		return (EReference)gaExecHostEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaExecHost_MemSize() {
		return (EReference)gaExecHostEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaExecHost_Utilization() {
		return (EReference)gaExecHostEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaExecHost_Throughput() {
		return (EReference)gaExecHostEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGaRequestedService() {
		return gaRequestedServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaRequestedService_Base_Operation() {
		return (EReference)gaRequestedServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGaTimedObs() {
		return gaTimedObsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGaTimedObs_Laxity() {
		return (EAttribute)gaTimedObsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaTimedObs_StartObs() {
		return (EReference)gaTimedObsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaTimedObs_EndObs() {
		return (EReference)gaTimedObsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGaCommStep() {
		return gaCommStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGaAcqStep() {
		return gaAcqStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaAcqStep_AcqRes() {
		return (EReference)gaAcqStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaAcqStep_ResUnits() {
		return (EReference)gaAcqStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGaRelStep() {
		return gaRelStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaRelStep_RelRes() {
		return (EReference)gaRelStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaRelStep_ResUnits() {
		return (EReference)gaRelStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGaLatencyObs() {
		return gaLatencyObsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaLatencyObs_Latency() {
		return (EReference)gaLatencyObsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaLatencyObs_Miss() {
		return (EReference)gaLatencyObsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaLatencyObs_Utility() {
		return (EReference)gaLatencyObsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaLatencyObs_MaxJitter() {
		return (EReference)gaLatencyObsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGaCommHost() {
		return gaCommHostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaCommHost_Throughput() {
		return (EReference)gaCommHostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaCommHost_Utilization() {
		return (EReference)gaCommHostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGaCommChannel() {
		return gaCommChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaCommChannel_PacketSize() {
		return (EReference)gaCommChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaCommChannel_Utlization() {
		return (EReference)gaCommChannelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGaWorkloadBehavior() {
		return gaWorkloadBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaWorkloadBehavior_Behavior() {
		return (EReference)gaWorkloadBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaWorkloadBehavior_Demand() {
		return (EReference)gaWorkloadBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaWorkloadBehavior_Base_NamedElement() {
		return (EReference)gaWorkloadBehaviorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGaAnalysisContext() {
		return gaAnalysisContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaAnalysisContext_Context() {
		return (EReference)gaAnalysisContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaAnalysisContext_Workload() {
		return (EReference)gaAnalysisContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaAnalysisContext_Platform() {
		return (EReference)gaAnalysisContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGaResourcesPlatform() {
		return gaResourcesPlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaResourcesPlatform_Resources() {
		return (EReference)gaResourcesPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGaResourcesPlatform_Base_Classifier() {
		return (EReference)gaResourcesPlatformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLaxityKind() {
		return laxityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GQAMFactory getGQAMFactory() {
		return (GQAMFactory)getEFactoryInstance();
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
		gaWorkloadGeneratorEClass = createEClass(GA_WORKLOAD_GENERATOR);
		createEReference(gaWorkloadGeneratorEClass, GA_WORKLOAD_GENERATOR__POP);
		createEReference(gaWorkloadGeneratorEClass, GA_WORKLOAD_GENERATOR__BASE_BEHAVIOR);

		gaEventTraceEClass = createEClass(GA_EVENT_TRACE);
		createEAttribute(gaEventTraceEClass, GA_EVENT_TRACE__CONTENT);
		createEAttribute(gaEventTraceEClass, GA_EVENT_TRACE__FORMAT);
		createEAttribute(gaEventTraceEClass, GA_EVENT_TRACE__LOCATION);
		createEReference(gaEventTraceEClass, GA_EVENT_TRACE__BASE_NAMED_ELEMENT);

		gaWorkloadEventEClass = createEClass(GA_WORKLOAD_EVENT);
		createEReference(gaWorkloadEventEClass, GA_WORKLOAD_EVENT__PATTERN);
		createEReference(gaWorkloadEventEClass, GA_WORKLOAD_EVENT__GENERATOR);
		createEReference(gaWorkloadEventEClass, GA_WORKLOAD_EVENT__TRACE);
		createEReference(gaWorkloadEventEClass, GA_WORKLOAD_EVENT__EFFECT);
		createEReference(gaWorkloadEventEClass, GA_WORKLOAD_EVENT__TIMED_EVENT);
		createEReference(gaWorkloadEventEClass, GA_WORKLOAD_EVENT__BASE_NAMED_ELEMENT);

		gaScenarioEClass = createEClass(GA_SCENARIO);
		createEReference(gaScenarioEClass, GA_SCENARIO__CAUSE);
		createEReference(gaScenarioEClass, GA_SCENARIO__HOST_DEMAND);
		createEReference(gaScenarioEClass, GA_SCENARIO__HOST_DEMAND_OPS);
		createEReference(gaScenarioEClass, GA_SCENARIO__INTER_OCC_T);
		createEReference(gaScenarioEClass, GA_SCENARIO__THROUGHPUT);
		createEReference(gaScenarioEClass, GA_SCENARIO__RESP_T);
		createEReference(gaScenarioEClass, GA_SCENARIO__UTILIZATION);
		createEReference(gaScenarioEClass, GA_SCENARIO__UTILIZATION_ON_HOST);
		createEReference(gaScenarioEClass, GA_SCENARIO__ROOT);
		createEReference(gaScenarioEClass, GA_SCENARIO__TIMING);

		gaStepEClass = createEClass(GA_STEP);
		createEReference(gaStepEClass, GA_STEP__IS_ATOMIC);
		createEReference(gaStepEClass, GA_STEP__BLOCK_T);
		createEReference(gaStepEClass, GA_STEP__REP);
		createEReference(gaStepEClass, GA_STEP__PROB);
		createEReference(gaStepEClass, GA_STEP__PRIORITY);
		createEReference(gaStepEClass, GA_STEP__CONCUR_RES);
		createEReference(gaStepEClass, GA_STEP__HOST);
		createEReference(gaStepEClass, GA_STEP__SERV_DEMAND);
		createEReference(gaStepEClass, GA_STEP__SERV_COUNT);
		createEReference(gaStepEClass, GA_STEP__BEHAVIOR);
		createEReference(gaStepEClass, GA_STEP__SELF_DELAY);

		gaExecHostEClass = createEClass(GA_EXEC_HOST);
		createEReference(gaExecHostEClass, GA_EXEC_HOST__COMM_TX_OVH);
		createEReference(gaExecHostEClass, GA_EXEC_HOST__COMM_RCV_OVH);
		createEReference(gaExecHostEClass, GA_EXEC_HOST__CNTXT_SW_T);
		createEReference(gaExecHostEClass, GA_EXEC_HOST__CLOCK_OVH);
		createEReference(gaExecHostEClass, GA_EXEC_HOST__SCHED_PRI_RANGE);
		createEReference(gaExecHostEClass, GA_EXEC_HOST__MEM_SIZE);
		createEReference(gaExecHostEClass, GA_EXEC_HOST__UTILIZATION);
		createEReference(gaExecHostEClass, GA_EXEC_HOST__THROUGHPUT);

		gaRequestedServiceEClass = createEClass(GA_REQUESTED_SERVICE);
		createEReference(gaRequestedServiceEClass, GA_REQUESTED_SERVICE__BASE_OPERATION);

		gaTimedObsEClass = createEClass(GA_TIMED_OBS);
		createEAttribute(gaTimedObsEClass, GA_TIMED_OBS__LAXITY);
		createEReference(gaTimedObsEClass, GA_TIMED_OBS__START_OBS);
		createEReference(gaTimedObsEClass, GA_TIMED_OBS__END_OBS);

		gaCommStepEClass = createEClass(GA_COMM_STEP);

		gaAcqStepEClass = createEClass(GA_ACQ_STEP);
		createEReference(gaAcqStepEClass, GA_ACQ_STEP__ACQ_RES);
		createEReference(gaAcqStepEClass, GA_ACQ_STEP__RES_UNITS);

		gaRelStepEClass = createEClass(GA_REL_STEP);
		createEReference(gaRelStepEClass, GA_REL_STEP__REL_RES);
		createEReference(gaRelStepEClass, GA_REL_STEP__RES_UNITS);

		gaLatencyObsEClass = createEClass(GA_LATENCY_OBS);
		createEReference(gaLatencyObsEClass, GA_LATENCY_OBS__LATENCY);
		createEReference(gaLatencyObsEClass, GA_LATENCY_OBS__MISS);
		createEReference(gaLatencyObsEClass, GA_LATENCY_OBS__UTILITY);
		createEReference(gaLatencyObsEClass, GA_LATENCY_OBS__MAX_JITTER);

		gaCommHostEClass = createEClass(GA_COMM_HOST);
		createEReference(gaCommHostEClass, GA_COMM_HOST__THROUGHPUT);
		createEReference(gaCommHostEClass, GA_COMM_HOST__UTILIZATION);

		gaCommChannelEClass = createEClass(GA_COMM_CHANNEL);
		createEReference(gaCommChannelEClass, GA_COMM_CHANNEL__PACKET_SIZE);
		createEReference(gaCommChannelEClass, GA_COMM_CHANNEL__UTLIZATION);

		gaWorkloadBehaviorEClass = createEClass(GA_WORKLOAD_BEHAVIOR);
		createEReference(gaWorkloadBehaviorEClass, GA_WORKLOAD_BEHAVIOR__BEHAVIOR);
		createEReference(gaWorkloadBehaviorEClass, GA_WORKLOAD_BEHAVIOR__DEMAND);
		createEReference(gaWorkloadBehaviorEClass, GA_WORKLOAD_BEHAVIOR__BASE_NAMED_ELEMENT);

		gaAnalysisContextEClass = createEClass(GA_ANALYSIS_CONTEXT);
		createEReference(gaAnalysisContextEClass, GA_ANALYSIS_CONTEXT__CONTEXT);
		createEReference(gaAnalysisContextEClass, GA_ANALYSIS_CONTEXT__WORKLOAD);
		createEReference(gaAnalysisContextEClass, GA_ANALYSIS_CONTEXT__PLATFORM);

		gaResourcesPlatformEClass = createEClass(GA_RESOURCES_PLATFORM);
		createEReference(gaResourcesPlatformEClass, GA_RESOURCES_PLATFORM__RESOURCES);
		createEReference(gaResourcesPlatformEClass, GA_RESOURCES_PLATFORM__BASE_CLASSIFIER);

		// Create enums
		laxityKindEEnum = createEEnum(LAXITY_KIND);
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
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		MARTE_PrimitivesTypesPackage theMARTE_PrimitivesTypesPackage = (MARTE_PrimitivesTypesPackage)EPackage.Registry.INSTANCE.getEPackage(MARTE_PrimitivesTypesPackage.eNS_URI);
		GRMPackage theGRMPackage = (GRMPackage)EPackage.Registry.INSTANCE.getEPackage(GRMPackage.eNS_URI);
		TimePackage theTimePackage = (TimePackage)EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI);
		MARTE_DataTypesPackage theMARTE_DataTypesPackage = (MARTE_DataTypesPackage)EPackage.Registry.INSTANCE.getEPackage(MARTE_DataTypesPackage.eNS_URI);
		NFPsPackage theNFPsPackage = (NFPsPackage)EPackage.Registry.INSTANCE.getEPackage(NFPsPackage.eNS_URI);
		CoreElementsPackage theCoreElementsPackage = (CoreElementsPackage)EPackage.Registry.INSTANCE.getEPackage(CoreElementsPackage.eNS_URI);
		VariablesPackage theVariablesPackage = (VariablesPackage)EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);

		// Add supertypes to classes
		gaScenarioEClass.getESuperTypes().add(theGRMPackage.getResourceUsage());
		gaScenarioEClass.getESuperTypes().add(theTimePackage.getTimedProcessing());
		gaStepEClass.getESuperTypes().add(this.getGaScenario());
		gaExecHostEClass.getESuperTypes().add(theGRMPackage.getScheduler());
		gaExecHostEClass.getESuperTypes().add(theGRMPackage.getComputingResource());
		gaRequestedServiceEClass.getESuperTypes().add(this.getGaStep());
		gaTimedObsEClass.getESuperTypes().add(theNFPsPackage.getNfpConstraint());
		gaCommStepEClass.getESuperTypes().add(this.getGaStep());
		gaAcqStepEClass.getESuperTypes().add(this.getGaStep());
		gaRelStepEClass.getESuperTypes().add(this.getGaStep());
		gaLatencyObsEClass.getESuperTypes().add(this.getGaTimedObs());
		gaCommHostEClass.getESuperTypes().add(theGRMPackage.getCommunicationMedia());
		gaCommHostEClass.getESuperTypes().add(theGRMPackage.getScheduler());
		gaCommChannelEClass.getESuperTypes().add(theGRMPackage.getSchedulableResource());
		gaAnalysisContextEClass.getESuperTypes().add(theCoreElementsPackage.getConfiguration());
		gaAnalysisContextEClass.getESuperTypes().add(theVariablesPackage.getExpressionContext());

		// Initialize classes and features; add operations and parameters
		initEClass(gaWorkloadGeneratorEClass, GaWorkloadGenerator.class, "GaWorkloadGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGaWorkloadGenerator_Pop(), theBasicNFP_TypesPackage.getNFP_Integer(), null, "pop", null, 0, 1, GaWorkloadGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaWorkloadGenerator_Base_Behavior(), theUMLPackage.getBehavior(), null, "base_Behavior", null, 1, 1, GaWorkloadGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gaEventTraceEClass, GaEventTrace.class, "GaEventTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGaEventTrace_Content(), theMARTE_PrimitivesTypesPackage.getString(), "content", null, 0, 1, GaEventTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGaEventTrace_Format(), theMARTE_PrimitivesTypesPackage.getString(), "format", null, 0, 1, GaEventTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGaEventTrace_Location(), theMARTE_PrimitivesTypesPackage.getString(), "location", null, 0, 1, GaEventTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaEventTrace_Base_NamedElement(), theUMLPackage.getNamedElement(), null, "base_NamedElement", null, 1, 1, GaEventTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gaWorkloadEventEClass, GaWorkloadEvent.class, "GaWorkloadEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGaWorkloadEvent_Pattern(), theBasicNFP_TypesPackage.getArrivalPattern(), null, "pattern", null, 0, 1, GaWorkloadEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaWorkloadEvent_Generator(), this.getGaWorkloadGenerator(), null, "generator", null, 0, 1, GaWorkloadEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaWorkloadEvent_Trace(), this.getGaEventTrace(), null, "trace", null, 0, 1, GaWorkloadEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaWorkloadEvent_Effect(), this.getGaScenario(), null, "effect", null, 0, 1, GaWorkloadEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaWorkloadEvent_TimedEvent(), theUMLPackage.getTimeEvent(), null, "timedEvent", null, 0, 1, GaWorkloadEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaWorkloadEvent_Base_NamedElement(), theUMLPackage.getNamedElement(), null, "base_NamedElement", null, 1, 1, GaWorkloadEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gaScenarioEClass, GaScenario.class, "GaScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGaScenario_Cause(), this.getGaWorkloadEvent(), null, "cause", null, 0, 1, GaScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaScenario_HostDemand(), theBasicNFP_TypesPackage.getNFP_Duration(), null, "hostDemand", null, 0, -1, GaScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaScenario_HostDemandOps(), theBasicNFP_TypesPackage.getNFP_Real(), null, "hostDemandOps", null, 0, -1, GaScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaScenario_InterOccT(), theBasicNFP_TypesPackage.getNFP_Duration(), null, "interOccT", null, 0, -1, GaScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaScenario_Throughput(), theBasicNFP_TypesPackage.getNFP_Frequency(), null, "throughput", null, 0, -1, GaScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaScenario_RespT(), theBasicNFP_TypesPackage.getNFP_Duration(), null, "respT", null, 0, -1, GaScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaScenario_Utilization(), theBasicNFP_TypesPackage.getNFP_Real(), null, "utilization", null, 0, -1, GaScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaScenario_UtilizationOnHost(), theBasicNFP_TypesPackage.getNFP_Real(), null, "utilizationOnHost", null, 0, -1, GaScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaScenario_Root(), this.getGaStep(), null, "root", null, 0, 1, GaScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaScenario_Timing(), this.getGaTimedObs(), null, "timing", null, 0, -1, GaScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gaStepEClass, GaStep.class, "GaStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGaStep_IsAtomic(), theBasicNFP_TypesPackage.getNFP_Boolean(), null, "isAtomic", null, 0, 1, GaStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaStep_BlockT(), theBasicNFP_TypesPackage.getNFP_Duration(), null, "blockT", null, 0, 1, GaStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaStep_Rep(), theBasicNFP_TypesPackage.getNFP_Real(), null, "rep", null, 0, 1, GaStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaStep_Prob(), theBasicNFP_TypesPackage.getNFP_Real(), null, "prob", null, 0, 1, GaStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaStep_Priority(), theBasicNFP_TypesPackage.getNFP_Integer(), null, "priority", null, 0, 1, GaStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaStep_ConcurRes(), theGRMPackage.getSchedulableResource(), null, "concurRes", null, 0, 1, GaStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaStep_Host(), this.getGaExecHost(), null, "host", null, 0, 1, GaStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaStep_ServDemand(), this.getGaRequestedService(), null, "servDemand", null, 0, -1, GaStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGaStep_ServCount(), theBasicNFP_TypesPackage.getNFP_Real(), null, "servCount", null, 0, -1, GaStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGaStep_Behavior(), this.getGaScenario(), null, "behavior", null, 0, 1, GaStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaStep_SelfDelay(), theBasicNFP_TypesPackage.getNFP_Duration(), null, "selfDelay", null, 0, 1, GaStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gaExecHostEClass, GaExecHost.class, "GaExecHost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGaExecHost_CommTxOvh(), theBasicNFP_TypesPackage.getNFP_Duration(), null, "commTxOvh", null, 0, 1, GaExecHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaExecHost_CommRcvOvh(), theBasicNFP_TypesPackage.getNFP_Duration(), null, "commRcvOvh", null, 0, 1, GaExecHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaExecHost_CntxtSwT(), theBasicNFP_TypesPackage.getNFP_Duration(), null, "cntxtSwT", null, 0, 1, GaExecHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaExecHost_ClockOvh(), theBasicNFP_TypesPackage.getNFP_Duration(), null, "clockOvh", null, 0, 1, GaExecHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaExecHost_SchedPriRange(), theMARTE_DataTypesPackage.getIntegerInterval(), null, "schedPriRange", null, 0, 1, GaExecHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaExecHost_MemSize(), theBasicNFP_TypesPackage.getNFP_DataSize(), null, "memSize", null, 0, 1, GaExecHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaExecHost_Utilization(), theBasicNFP_TypesPackage.getNFP_Real(), null, "utilization", null, 0, -1, GaExecHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaExecHost_Throughput(), theBasicNFP_TypesPackage.getNFP_Frequency(), null, "throughput", null, 0, -1, GaExecHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gaRequestedServiceEClass, GaRequestedService.class, "GaRequestedService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGaRequestedService_Base_Operation(), theUMLPackage.getOperation(), null, "base_Operation", null, 1, 1, GaRequestedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gaTimedObsEClass, GaTimedObs.class, "GaTimedObs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGaTimedObs_Laxity(), this.getLaxityKind(), "laxity", null, 0, 1, GaTimedObs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaTimedObs_StartObs(), theUMLPackage.getTimeObservation(), null, "startObs", null, 0, -1, GaTimedObs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaTimedObs_EndObs(), theUMLPackage.getTimeObservation(), null, "endObs", null, 0, -1, GaTimedObs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gaCommStepEClass, GaCommStep.class, "GaCommStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gaAcqStepEClass, GaAcqStep.class, "GaAcqStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGaAcqStep_AcqRes(), theGRMPackage.getResource(), null, "acqRes", null, 0, 1, GaAcqStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaAcqStep_ResUnits(), theBasicNFP_TypesPackage.getNFP_Integer(), null, "resUnits", null, 0, 1, GaAcqStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gaRelStepEClass, GaRelStep.class, "GaRelStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGaRelStep_RelRes(), theGRMPackage.getResource(), null, "relRes", null, 0, 1, GaRelStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaRelStep_ResUnits(), theBasicNFP_TypesPackage.getNFP_Integer(), null, "resUnits", null, 0, 1, GaRelStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gaLatencyObsEClass, GaLatencyObs.class, "GaLatencyObs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGaLatencyObs_Latency(), theBasicNFP_TypesPackage.getNFP_Duration(), null, "latency", null, 0, -1, GaLatencyObs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaLatencyObs_Miss(), theBasicNFP_TypesPackage.getNFP_Real(), null, "miss", null, 0, -1, GaLatencyObs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaLatencyObs_Utility(), theMARTE_DataTypesPackage.getUtilityType(), null, "utility", null, 0, -1, GaLatencyObs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaLatencyObs_MaxJitter(), theBasicNFP_TypesPackage.getNFP_Duration(), null, "maxJitter", null, 0, -1, GaLatencyObs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gaCommHostEClass, GaCommHost.class, "GaCommHost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGaCommHost_Throughput(), theBasicNFP_TypesPackage.getNFP_Frequency(), null, "throughput", null, 0, -1, GaCommHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaCommHost_Utilization(), theBasicNFP_TypesPackage.getNFP_Real(), null, "utilization", null, 0, -1, GaCommHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gaCommChannelEClass, GaCommChannel.class, "GaCommChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGaCommChannel_PacketSize(), theBasicNFP_TypesPackage.getNFP_DataSize(), null, "packetSize", null, 0, 1, GaCommChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaCommChannel_Utlization(), theBasicNFP_TypesPackage.getNFP_Real(), null, "utlization", null, 0, -1, GaCommChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gaWorkloadBehaviorEClass, GaWorkloadBehavior.class, "GaWorkloadBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGaWorkloadBehavior_Behavior(), this.getGaScenario(), null, "behavior", null, 0, -1, GaWorkloadBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaWorkloadBehavior_Demand(), this.getGaWorkloadEvent(), null, "demand", null, 0, -1, GaWorkloadBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaWorkloadBehavior_Base_NamedElement(), theUMLPackage.getNamedElement(), null, "base_NamedElement", null, 1, 1, GaWorkloadBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gaAnalysisContextEClass, GaAnalysisContext.class, "GaAnalysisContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGaAnalysisContext_Context(), theBasicNFP_TypesPackage.getNFP_String(), null, "context", null, 0, -1, GaAnalysisContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaAnalysisContext_Workload(), this.getGaWorkloadBehavior(), null, "workload", null, 1, -1, GaAnalysisContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaAnalysisContext_Platform(), this.getGaResourcesPlatform(), null, "platform", null, 1, -1, GaAnalysisContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gaResourcesPlatformEClass, GaResourcesPlatform.class, "GaResourcesPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGaResourcesPlatform_Resources(), theGRMPackage.getResource(), null, "resources", null, 0, -1, GaResourcesPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGaResourcesPlatform_Base_Classifier(), theUMLPackage.getClassifier(), null, "base_Classifier", null, 1, 1, GaResourcesPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(laxityKindEEnum, LaxityKind.class, "LaxityKind");
		addEEnumLiteral(laxityKindEEnum, LaxityKind.HARD_LITERAL);
		addEEnumLiteral(laxityKindEEnum, LaxityKind.SOFT_LITERAL);
		addEEnumLiteral(laxityKindEEnum, LaxityKind.OTHER_LITERAL);

		// Create resource
		createResource(eNS_URI);
	}

} //GQAMPackageImpl
