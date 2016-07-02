/**
 */
package MARTE.MARTE_DesignModel.GCM.impl;

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

import MARTE.MARTE_DesignModel.GCM.ClientServerFeature;
import MARTE.MARTE_DesignModel.GCM.ClientServerKind;
import MARTE.MARTE_DesignModel.GCM.ClientServerPort;
import MARTE.MARTE_DesignModel.GCM.ClientServerSpecification;
import MARTE.MARTE_DesignModel.GCM.DataEvent;
import MARTE.MARTE_DesignModel.GCM.DataPool;
import MARTE.MARTE_DesignModel.GCM.DataPoolOrderingKind;
import MARTE.MARTE_DesignModel.GCM.FlowDirectionKind;
import MARTE.MARTE_DesignModel.GCM.FlowPort;
import MARTE.MARTE_DesignModel.GCM.FlowProperty;
import MARTE.MARTE_DesignModel.GCM.FlowSpecification;
import MARTE.MARTE_DesignModel.GCM.GCMFactory;
import MARTE.MARTE_DesignModel.GCM.GCMInvocationAction;
import MARTE.MARTE_DesignModel.GCM.GCMPackage;
import MARTE.MARTE_DesignModel.GCM.GCMTrigger;
import MARTE.MARTE_DesignModel.GCM.PortSpecificationKind;

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
public class GCMPackageImpl extends EPackageImpl implements GCMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientServerPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientServerSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientServerFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gcmTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gcmInvocationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPoolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flowDirectionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portSpecificationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clientServerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataPoolOrderingKindEEnum = null;

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
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GCMPackageImpl() {
		super(eNS_URI, GCMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GCMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GCMPackage init() {
		if (isInited) return (GCMPackage)EPackage.Registry.INSTANCE.getEPackage(GCMPackage.eNS_URI);

		// Obtain or create and register package
		GCMPackageImpl theGCMPackage = (GCMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GCMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GCMPackageImpl());

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
		GQAMPackageImpl theGQAMPackage = (GQAMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GQAMPackage.eNS_URI) instanceof GQAMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GQAMPackage.eNS_URI) : GQAMPackage.eINSTANCE);
		SAMPackageImpl theSAMPackage = (SAMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SAMPackage.eNS_URI) instanceof SAMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SAMPackage.eNS_URI) : SAMPackage.eINSTANCE);
		PAMPackageImpl thePAMPackage = (PAMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PAMPackage.eNS_URI) instanceof PAMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PAMPackage.eNS_URI) : PAMPackage.eINSTANCE);

		// Create package meta-data objects
		theGCMPackage.createPackageContents();
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
		theGQAMPackage.createPackageContents();
		theSAMPackage.createPackageContents();
		thePAMPackage.createPackageContents();

		// Initialize created meta-data
		theGCMPackage.initializePackageContents();
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
		theGQAMPackage.initializePackageContents();
		theSAMPackage.initializePackageContents();
		thePAMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGCMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GCMPackage.eNS_URI, theGCMPackage);
		return theGCMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowProperty() {
		return flowPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowProperty_Direction() {
		return (EAttribute)flowPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowProperty_Base_Property() {
		return (EReference)flowPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowPort() {
		return flowPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowPort_IsAtomic() {
		return (EAttribute)flowPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowPort_IsConjugated() {
		return (EAttribute)flowPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowPort_Direction() {
		return (EAttribute)flowPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowPort_Base_Port() {
		return (EReference)flowPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClientServerPort() {
		return clientServerPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClientServerPort_Base_Port() {
		return (EReference)clientServerPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientServerPort_SpecificationKind() {
		return (EAttribute)clientServerPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientServerPort_IsConjugated() {
		return (EAttribute)clientServerPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClientServerPort_ProvInterface() {
		return (EReference)clientServerPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClientServerPort_ReqInterface() {
		return (EReference)clientServerPortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClientServerPort_FeaturesSpec() {
		return (EReference)clientServerPortEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientServerPort_Kind() {
		return (EAttribute)clientServerPortEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClientServerSpecification() {
		return clientServerSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClientServerSpecification_Base_Interface() {
		return (EReference)clientServerSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowSpecification() {
		return flowSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowSpecification_Base_Interface() {
		return (EReference)flowSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClientServerFeature() {
		return clientServerFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientServerFeature_Kind() {
		return (EAttribute)clientServerFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClientServerFeature_Base_BehavioralFeature() {
		return (EReference)clientServerFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGCMTrigger() {
		return gcmTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGCMTrigger_Base_Trigger() {
		return (EReference)gcmTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGCMTrigger_Feature() {
		return (EReference)gcmTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGCMInvocationAction() {
		return gcmInvocationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGCMInvocationAction_Base_InvocationAction() {
		return (EReference)gcmInvocationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGCMInvocationAction_OnFeature() {
		return (EReference)gcmInvocationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataEvent() {
		return dataEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataEvent_Base_AnyReceiveEvent() {
		return (EReference)dataEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataEvent_Classifier() {
		return (EReference)dataEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPool() {
		return dataPoolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPool_Ordering() {
		return (EAttribute)dataPoolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPool_Base_Property() {
		return (EReference)dataPoolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPool_Insertion() {
		return (EReference)dataPoolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPool_Selection() {
		return (EReference)dataPoolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlowDirectionKind() {
		return flowDirectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPortSpecificationKind() {
		return portSpecificationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClientServerKind() {
		return clientServerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataPoolOrderingKind() {
		return dataPoolOrderingKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCMFactory getGCMFactory() {
		return (GCMFactory)getEFactoryInstance();
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
		flowPropertyEClass = createEClass(FLOW_PROPERTY);
		createEAttribute(flowPropertyEClass, FLOW_PROPERTY__DIRECTION);
		createEReference(flowPropertyEClass, FLOW_PROPERTY__BASE_PROPERTY);

		flowPortEClass = createEClass(FLOW_PORT);
		createEAttribute(flowPortEClass, FLOW_PORT__IS_ATOMIC);
		createEAttribute(flowPortEClass, FLOW_PORT__IS_CONJUGATED);
		createEAttribute(flowPortEClass, FLOW_PORT__DIRECTION);
		createEReference(flowPortEClass, FLOW_PORT__BASE_PORT);

		clientServerPortEClass = createEClass(CLIENT_SERVER_PORT);
		createEReference(clientServerPortEClass, CLIENT_SERVER_PORT__BASE_PORT);
		createEAttribute(clientServerPortEClass, CLIENT_SERVER_PORT__SPECIFICATION_KIND);
		createEAttribute(clientServerPortEClass, CLIENT_SERVER_PORT__IS_CONJUGATED);
		createEReference(clientServerPortEClass, CLIENT_SERVER_PORT__PROV_INTERFACE);
		createEReference(clientServerPortEClass, CLIENT_SERVER_PORT__REQ_INTERFACE);
		createEReference(clientServerPortEClass, CLIENT_SERVER_PORT__FEATURES_SPEC);
		createEAttribute(clientServerPortEClass, CLIENT_SERVER_PORT__KIND);

		clientServerSpecificationEClass = createEClass(CLIENT_SERVER_SPECIFICATION);
		createEReference(clientServerSpecificationEClass, CLIENT_SERVER_SPECIFICATION__BASE_INTERFACE);

		flowSpecificationEClass = createEClass(FLOW_SPECIFICATION);
		createEReference(flowSpecificationEClass, FLOW_SPECIFICATION__BASE_INTERFACE);

		clientServerFeatureEClass = createEClass(CLIENT_SERVER_FEATURE);
		createEAttribute(clientServerFeatureEClass, CLIENT_SERVER_FEATURE__KIND);
		createEReference(clientServerFeatureEClass, CLIENT_SERVER_FEATURE__BASE_BEHAVIORAL_FEATURE);

		gcmTriggerEClass = createEClass(GCM_TRIGGER);
		createEReference(gcmTriggerEClass, GCM_TRIGGER__BASE_TRIGGER);
		createEReference(gcmTriggerEClass, GCM_TRIGGER__FEATURE);

		gcmInvocationActionEClass = createEClass(GCM_INVOCATION_ACTION);
		createEReference(gcmInvocationActionEClass, GCM_INVOCATION_ACTION__BASE_INVOCATION_ACTION);
		createEReference(gcmInvocationActionEClass, GCM_INVOCATION_ACTION__ON_FEATURE);

		dataEventEClass = createEClass(DATA_EVENT);
		createEReference(dataEventEClass, DATA_EVENT__BASE_ANY_RECEIVE_EVENT);
		createEReference(dataEventEClass, DATA_EVENT__CLASSIFIER);

		dataPoolEClass = createEClass(DATA_POOL);
		createEAttribute(dataPoolEClass, DATA_POOL__ORDERING);
		createEReference(dataPoolEClass, DATA_POOL__BASE_PROPERTY);
		createEReference(dataPoolEClass, DATA_POOL__INSERTION);
		createEReference(dataPoolEClass, DATA_POOL__SELECTION);

		// Create enums
		flowDirectionKindEEnum = createEEnum(FLOW_DIRECTION_KIND);
		portSpecificationKindEEnum = createEEnum(PORT_SPECIFICATION_KIND);
		clientServerKindEEnum = createEEnum(CLIENT_SERVER_KIND);
		dataPoolOrderingKindEEnum = createEEnum(DATA_POOL_ORDERING_KIND);
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
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		MARTE_PrimitivesTypesPackage theMARTE_PrimitivesTypesPackage = (MARTE_PrimitivesTypesPackage)EPackage.Registry.INSTANCE.getEPackage(MARTE_PrimitivesTypesPackage.eNS_URI);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(flowPropertyEClass, FlowProperty.class, "FlowProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlowProperty_Direction(), this.getFlowDirectionKind(), "direction", "inout", 1, 1, FlowProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFlowProperty_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, FlowProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(flowPortEClass, FlowPort.class, "FlowPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlowPort_IsAtomic(), theMARTE_PrimitivesTypesPackage.getBoolean(), "isAtomic", null, 1, 1, FlowPort.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFlowPort_IsConjugated(), theMARTE_PrimitivesTypesPackage.getBoolean(), "isConjugated", null, 0, 1, FlowPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFlowPort_Direction(), this.getFlowDirectionKind(), "direction", "inout", 1, 1, FlowPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFlowPort_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 1, 1, FlowPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(clientServerPortEClass, ClientServerPort.class, "ClientServerPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClientServerPort_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 1, 1, ClientServerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getClientServerPort_SpecificationKind(), this.getPortSpecificationKind(), "specificationKind", "interfaceBased", 1, 1, ClientServerPort.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getClientServerPort_IsConjugated(), theMARTE_PrimitivesTypesPackage.getBoolean(), "isConjugated", null, 0, 1, ClientServerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClientServerPort_ProvInterface(), theUMLPackage.getInterface(), null, "provInterface", null, 0, -1, ClientServerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClientServerPort_ReqInterface(), theUMLPackage.getInterface(), null, "reqInterface", null, 0, -1, ClientServerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClientServerPort_FeaturesSpec(), this.getClientServerSpecification(), null, "featuresSpec", null, 0, 1, ClientServerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getClientServerPort_Kind(), this.getClientServerKind(), "kind", "proreq", 1, 1, ClientServerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(clientServerSpecificationEClass, ClientServerSpecification.class, "ClientServerSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClientServerSpecification_Base_Interface(), theUMLPackage.getInterface(), null, "base_Interface", null, 1, 1, ClientServerSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(flowSpecificationEClass, FlowSpecification.class, "FlowSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowSpecification_Base_Interface(), theUMLPackage.getInterface(), null, "base_Interface", null, 1, 1, FlowSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(clientServerFeatureEClass, ClientServerFeature.class, "ClientServerFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClientServerFeature_Kind(), this.getClientServerKind(), "kind", "proreq", 1, 1, ClientServerFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClientServerFeature_Base_BehavioralFeature(), theUMLPackage.getBehavioralFeature(), null, "base_BehavioralFeature", null, 1, 1, ClientServerFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gcmTriggerEClass, GCMTrigger.class, "GCMTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGCMTrigger_Base_Trigger(), theUMLPackage.getTrigger(), null, "base_Trigger", null, 1, 1, GCMTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGCMTrigger_Feature(), theUMLPackage.getFeature(), null, "feature", null, 1, 1, GCMTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gcmInvocationActionEClass, GCMInvocationAction.class, "GCMInvocationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGCMInvocationAction_Base_InvocationAction(), theUMLPackage.getInvocationAction(), null, "base_InvocationAction", null, 1, 1, GCMInvocationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGCMInvocationAction_OnFeature(), theUMLPackage.getFeature(), null, "onFeature", null, 1, 1, GCMInvocationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataEventEClass, DataEvent.class, "DataEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataEvent_Base_AnyReceiveEvent(), theUMLPackage.getAnyReceiveEvent(), null, "base_AnyReceiveEvent", null, 1, 1, DataEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataEvent_Classifier(), theUMLPackage.getClassifier(), null, "classifier", null, 1, 1, DataEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataPoolEClass, DataPool.class, "DataPool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataPool_Ordering(), this.getDataPoolOrderingKind(), "ordering", "FIFO", 1, 1, DataPool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataPool_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, DataPool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataPool_Insertion(), theUMLPackage.getBehavior(), null, "insertion", null, 0, 1, DataPool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataPool_Selection(), theUMLPackage.getBehavior(), null, "selection", null, 0, 1, DataPool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(flowDirectionKindEEnum, FlowDirectionKind.class, "FlowDirectionKind");
		addEEnumLiteral(flowDirectionKindEEnum, FlowDirectionKind.IN_LITERAL);
		addEEnumLiteral(flowDirectionKindEEnum, FlowDirectionKind.OUT_LITERAL);
		addEEnumLiteral(flowDirectionKindEEnum, FlowDirectionKind.INOUT_LITERAL);

		initEEnum(portSpecificationKindEEnum, PortSpecificationKind.class, "PortSpecificationKind");
		addEEnumLiteral(portSpecificationKindEEnum, PortSpecificationKind.ATOMIC_LITERAL);
		addEEnumLiteral(portSpecificationKindEEnum, PortSpecificationKind.INTERFACE_BASED_LITERAL);
		addEEnumLiteral(portSpecificationKindEEnum, PortSpecificationKind.FEATURE_BASED_LITERAL);

		initEEnum(clientServerKindEEnum, ClientServerKind.class, "ClientServerKind");
		addEEnumLiteral(clientServerKindEEnum, ClientServerKind.REQUIRED_LITERAL);
		addEEnumLiteral(clientServerKindEEnum, ClientServerKind.PROVIDED_LITERAL);
		addEEnumLiteral(clientServerKindEEnum, ClientServerKind.PROREQ_LITERAL);

		initEEnum(dataPoolOrderingKindEEnum, DataPoolOrderingKind.class, "DataPoolOrderingKind");
		addEEnumLiteral(dataPoolOrderingKindEEnum, DataPoolOrderingKind.FIFO_LITERAL);
		addEEnumLiteral(dataPoolOrderingKindEEnum, DataPoolOrderingKind.LIFO_LITERAL);
		addEEnumLiteral(dataPoolOrderingKindEEnum, DataPoolOrderingKind.USER_DEFINED_LITERAL);

		// Create resource
		createResource(eNS_URI);
	}

} //GCMPackageImpl
