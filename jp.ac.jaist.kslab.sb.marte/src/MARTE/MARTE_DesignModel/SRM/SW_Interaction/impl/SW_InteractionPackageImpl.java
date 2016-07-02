/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl;

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

import MARTE.MARTE_DesignModel.SRM.SW_Interaction.ConcurrentAccessProtocolKind;
import MARTE.MARTE_DesignModel.SRM.SW_Interaction.MessageComResource;
import MARTE.MARTE_DesignModel.SRM.SW_Interaction.MessageResourceKind;
import MARTE.MARTE_DesignModel.SRM.SW_Interaction.MutualExclusionResourceKind;
import MARTE.MARTE_DesignModel.SRM.SW_Interaction.NotificationKind;
import MARTE.MARTE_DesignModel.SRM.SW_Interaction.NotificationResource;
import MARTE.MARTE_DesignModel.SRM.SW_Interaction.NotificationResourceKind;
import MARTE.MARTE_DesignModel.SRM.SW_Interaction.QueuePolicyKind;
import MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionFactory;
import MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage;
import MARTE.MARTE_DesignModel.SRM.SW_Interaction.SharedDataComResource;
import MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwCommunicationResource;
import MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwInteractionResource;
import MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwMutualExclusionResource;
import MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwSynchronizationResource;

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
public class SW_InteractionPackageImpl extends EPackageImpl implements SW_InteractionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swInteractionResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swCommunicationResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swSynchronizationResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedDataComResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageComResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swMutualExclusionResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum queuePolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageResourceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum notificationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum notificationResourceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mutualExclusionResourceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum concurrentAccessProtocolKindEEnum = null;

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
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SW_InteractionPackageImpl() {
		super(eNS_URI, SW_InteractionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SW_InteractionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SW_InteractionPackage init() {
		if (isInited) return (SW_InteractionPackage)EPackage.Registry.INSTANCE.getEPackage(SW_InteractionPackage.eNS_URI);

		// Obtain or create and register package
		SW_InteractionPackageImpl theSW_InteractionPackage = (SW_InteractionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SW_InteractionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SW_InteractionPackageImpl());

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
		GCMPackageImpl theGCMPackage = (GCMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GCMPackage.eNS_URI) instanceof GCMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GCMPackage.eNS_URI) : GCMPackage.eINSTANCE);
		GQAMPackageImpl theGQAMPackage = (GQAMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GQAMPackage.eNS_URI) instanceof GQAMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GQAMPackage.eNS_URI) : GQAMPackage.eINSTANCE);
		SAMPackageImpl theSAMPackage = (SAMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SAMPackage.eNS_URI) instanceof SAMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SAMPackage.eNS_URI) : SAMPackage.eINSTANCE);
		PAMPackageImpl thePAMPackage = (PAMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PAMPackage.eNS_URI) instanceof PAMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PAMPackage.eNS_URI) : PAMPackage.eINSTANCE);

		// Create package meta-data objects
		theSW_InteractionPackage.createPackageContents();
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
		theGCMPackage.createPackageContents();
		theGQAMPackage.createPackageContents();
		theSAMPackage.createPackageContents();
		thePAMPackage.createPackageContents();

		// Initialize created meta-data
		theSW_InteractionPackage.initializePackageContents();
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
		theGCMPackage.initializePackageContents();
		theGQAMPackage.initializePackageContents();
		theSAMPackage.initializePackageContents();
		thePAMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSW_InteractionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SW_InteractionPackage.eNS_URI, theSW_InteractionPackage);
		return theSW_InteractionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwInteractionResource() {
		return swInteractionResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwInteractionResource_IsIntraMemoryPartitionInteraction() {
		return (EAttribute)swInteractionResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwInteractionResource_WaitingQueuePolicy() {
		return (EAttribute)swInteractionResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwInteractionResource_WaitingQueueCapacity() {
		return (EAttribute)swInteractionResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwInteractionResource_WaitingPolicyElements() {
		return (EReference)swInteractionResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwCommunicationResource() {
		return swCommunicationResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwSynchronizationResource() {
		return swSynchronizationResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedDataComResource() {
		return sharedDataComResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedDataComResource_ReadServices() {
		return (EReference)sharedDataComResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedDataComResource_WriteServices() {
		return (EReference)sharedDataComResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageComResource() {
		return messageComResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageComResource_IsFixedMessageSize() {
		return (EAttribute)messageComResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageComResource_Mechanism() {
		return (EAttribute)messageComResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageComResource_MessageSizeElements() {
		return (EReference)messageComResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageComResource_MessageQueueCapacityElements() {
		return (EReference)messageComResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageComResource_MessageQueuePolicy() {
		return (EAttribute)messageComResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageComResource_SendServices() {
		return (EReference)messageComResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageComResource_ReceiveServices() {
		return (EReference)messageComResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotificationResource() {
		return notificationResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationResource_Occurence() {
		return (EAttribute)notificationResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationResource_Mechanism() {
		return (EAttribute)notificationResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotificationResource_OccurenceCountElements() {
		return (EReference)notificationResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotificationResource_MaskElements() {
		return (EReference)notificationResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotificationResource_FlushServices() {
		return (EReference)notificationResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotificationResource_SignalServices() {
		return (EReference)notificationResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotificationResource_WaitServices() {
		return (EReference)notificationResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotificationResource_ClearServices() {
		return (EReference)notificationResourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwMutualExclusionResource() {
		return swMutualExclusionResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwMutualExclusionResource_Mechanism() {
		return (EAttribute)swMutualExclusionResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwMutualExclusionResource_ConcurrentAccessProtocol() {
		return (EAttribute)swMutualExclusionResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwMutualExclusionResource_AccessTokenElements() {
		return (EReference)swMutualExclusionResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwMutualExclusionResource_ReleaseServices() {
		return (EReference)swMutualExclusionResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwMutualExclusionResource_AcquireServices() {
		return (EReference)swMutualExclusionResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQueuePolicyKind() {
		return queuePolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageResourceKind() {
		return messageResourceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNotificationKind() {
		return notificationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNotificationResourceKind() {
		return notificationResourceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMutualExclusionResourceKind() {
		return mutualExclusionResourceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConcurrentAccessProtocolKind() {
		return concurrentAccessProtocolKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SW_InteractionFactory getSW_InteractionFactory() {
		return (SW_InteractionFactory)getEFactoryInstance();
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
		swInteractionResourceEClass = createEClass(SW_INTERACTION_RESOURCE);
		createEAttribute(swInteractionResourceEClass, SW_INTERACTION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION);
		createEAttribute(swInteractionResourceEClass, SW_INTERACTION_RESOURCE__WAITING_QUEUE_POLICY);
		createEAttribute(swInteractionResourceEClass, SW_INTERACTION_RESOURCE__WAITING_QUEUE_CAPACITY);
		createEReference(swInteractionResourceEClass, SW_INTERACTION_RESOURCE__WAITING_POLICY_ELEMENTS);

		swCommunicationResourceEClass = createEClass(SW_COMMUNICATION_RESOURCE);

		swSynchronizationResourceEClass = createEClass(SW_SYNCHRONIZATION_RESOURCE);

		sharedDataComResourceEClass = createEClass(SHARED_DATA_COM_RESOURCE);
		createEReference(sharedDataComResourceEClass, SHARED_DATA_COM_RESOURCE__READ_SERVICES);
		createEReference(sharedDataComResourceEClass, SHARED_DATA_COM_RESOURCE__WRITE_SERVICES);

		messageComResourceEClass = createEClass(MESSAGE_COM_RESOURCE);
		createEAttribute(messageComResourceEClass, MESSAGE_COM_RESOURCE__IS_FIXED_MESSAGE_SIZE);
		createEAttribute(messageComResourceEClass, MESSAGE_COM_RESOURCE__MECHANISM);
		createEReference(messageComResourceEClass, MESSAGE_COM_RESOURCE__MESSAGE_SIZE_ELEMENTS);
		createEReference(messageComResourceEClass, MESSAGE_COM_RESOURCE__MESSAGE_QUEUE_CAPACITY_ELEMENTS);
		createEAttribute(messageComResourceEClass, MESSAGE_COM_RESOURCE__MESSAGE_QUEUE_POLICY);
		createEReference(messageComResourceEClass, MESSAGE_COM_RESOURCE__SEND_SERVICES);
		createEReference(messageComResourceEClass, MESSAGE_COM_RESOURCE__RECEIVE_SERVICES);

		notificationResourceEClass = createEClass(NOTIFICATION_RESOURCE);
		createEAttribute(notificationResourceEClass, NOTIFICATION_RESOURCE__OCCURENCE);
		createEAttribute(notificationResourceEClass, NOTIFICATION_RESOURCE__MECHANISM);
		createEReference(notificationResourceEClass, NOTIFICATION_RESOURCE__OCCURENCE_COUNT_ELEMENTS);
		createEReference(notificationResourceEClass, NOTIFICATION_RESOURCE__MASK_ELEMENTS);
		createEReference(notificationResourceEClass, NOTIFICATION_RESOURCE__FLUSH_SERVICES);
		createEReference(notificationResourceEClass, NOTIFICATION_RESOURCE__SIGNAL_SERVICES);
		createEReference(notificationResourceEClass, NOTIFICATION_RESOURCE__WAIT_SERVICES);
		createEReference(notificationResourceEClass, NOTIFICATION_RESOURCE__CLEAR_SERVICES);

		swMutualExclusionResourceEClass = createEClass(SW_MUTUAL_EXCLUSION_RESOURCE);
		createEAttribute(swMutualExclusionResourceEClass, SW_MUTUAL_EXCLUSION_RESOURCE__MECHANISM);
		createEAttribute(swMutualExclusionResourceEClass, SW_MUTUAL_EXCLUSION_RESOURCE__CONCURRENT_ACCESS_PROTOCOL);
		createEReference(swMutualExclusionResourceEClass, SW_MUTUAL_EXCLUSION_RESOURCE__ACCESS_TOKEN_ELEMENTS);
		createEReference(swMutualExclusionResourceEClass, SW_MUTUAL_EXCLUSION_RESOURCE__RELEASE_SERVICES);
		createEReference(swMutualExclusionResourceEClass, SW_MUTUAL_EXCLUSION_RESOURCE__ACQUIRE_SERVICES);

		// Create enums
		queuePolicyKindEEnum = createEEnum(QUEUE_POLICY_KIND);
		messageResourceKindEEnum = createEEnum(MESSAGE_RESOURCE_KIND);
		notificationKindEEnum = createEEnum(NOTIFICATION_KIND);
		notificationResourceKindEEnum = createEEnum(NOTIFICATION_RESOURCE_KIND);
		mutualExclusionResourceKindEEnum = createEEnum(MUTUAL_EXCLUSION_RESOURCE_KIND);
		concurrentAccessProtocolKindEEnum = createEEnum(CONCURRENT_ACCESS_PROTOCOL_KIND);
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
		SW_ResourceCorePackage theSW_ResourceCorePackage = (SW_ResourceCorePackage)EPackage.Registry.INSTANCE.getEPackage(SW_ResourceCorePackage.eNS_URI);
		MARTE_PrimitivesTypesPackage theMARTE_PrimitivesTypesPackage = (MARTE_PrimitivesTypesPackage)EPackage.Registry.INSTANCE.getEPackage(MARTE_PrimitivesTypesPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		GRMPackage theGRMPackage = (GRMPackage)EPackage.Registry.INSTANCE.getEPackage(GRMPackage.eNS_URI);

		// Add supertypes to classes
		swInteractionResourceEClass.getESuperTypes().add(theSW_ResourceCorePackage.getSwResource());
		swCommunicationResourceEClass.getESuperTypes().add(this.getSwInteractionResource());
		swCommunicationResourceEClass.getESuperTypes().add(theGRMPackage.getCommunicationMedia());
		swSynchronizationResourceEClass.getESuperTypes().add(this.getSwInteractionResource());
		swSynchronizationResourceEClass.getESuperTypes().add(theGRMPackage.getSynchronizationResource());
		sharedDataComResourceEClass.getESuperTypes().add(this.getSwCommunicationResource());
		messageComResourceEClass.getESuperTypes().add(this.getSwCommunicationResource());
		notificationResourceEClass.getESuperTypes().add(this.getSwSynchronizationResource());
		swMutualExclusionResourceEClass.getESuperTypes().add(this.getSwSynchronizationResource());
		swMutualExclusionResourceEClass.getESuperTypes().add(theGRMPackage.getMutualExclusionResource());

		// Initialize classes and features; add operations and parameters
		initEClass(swInteractionResourceEClass, SwInteractionResource.class, "SwInteractionResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwInteractionResource_IsIntraMemoryPartitionInteraction(), ecorePackage.getEBoolean(), "isIntraMemoryPartitionInteraction", null, 0, 1, SwInteractionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwInteractionResource_WaitingQueuePolicy(), this.getQueuePolicyKind(), "waitingQueuePolicy", null, 0, 1, SwInteractionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwInteractionResource_WaitingQueueCapacity(), theMARTE_PrimitivesTypesPackage.getInteger(), "waitingQueueCapacity", null, 0, 1, SwInteractionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSwInteractionResource_WaitingPolicyElements(), theUMLPackage.getTypedElement(), null, "waitingPolicyElements", null, 0, -1, SwInteractionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(swCommunicationResourceEClass, SwCommunicationResource.class, "SwCommunicationResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(swSynchronizationResourceEClass, SwSynchronizationResource.class, "SwSynchronizationResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sharedDataComResourceEClass, SharedDataComResource.class, "SharedDataComResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSharedDataComResource_ReadServices(), theUMLPackage.getBehavioralFeature(), null, "readServices", null, 0, -1, SharedDataComResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSharedDataComResource_WriteServices(), theUMLPackage.getBehavioralFeature(), null, "writeServices", null, 0, -1, SharedDataComResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(messageComResourceEClass, MessageComResource.class, "MessageComResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageComResource_IsFixedMessageSize(), theMARTE_PrimitivesTypesPackage.getBoolean(), "isFixedMessageSize", null, 0, 1, MessageComResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMessageComResource_Mechanism(), this.getMessageResourceKind(), "mechanism", null, 0, 1, MessageComResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessageComResource_MessageSizeElements(), theUMLPackage.getTypedElement(), null, "messageSizeElements", null, 0, -1, MessageComResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessageComResource_MessageQueueCapacityElements(), theUMLPackage.getTypedElement(), null, "messageQueueCapacityElements", null, 0, -1, MessageComResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMessageComResource_MessageQueuePolicy(), this.getQueuePolicyKind(), "messageQueuePolicy", null, 0, 1, MessageComResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessageComResource_SendServices(), theUMLPackage.getBehavioralFeature(), null, "sendServices", null, 0, -1, MessageComResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessageComResource_ReceiveServices(), theUMLPackage.getBehavioralFeature(), null, "receiveServices", null, 0, -1, MessageComResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(notificationResourceEClass, NotificationResource.class, "NotificationResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotificationResource_Occurence(), this.getNotificationKind(), "occurence", null, 0, 1, NotificationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNotificationResource_Mechanism(), this.getNotificationResourceKind(), "mechanism", null, 0, 1, NotificationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNotificationResource_OccurenceCountElements(), theUMLPackage.getTypedElement(), null, "occurenceCountElements", null, 0, -1, NotificationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNotificationResource_MaskElements(), theUMLPackage.getTypedElement(), null, "maskElements", null, 0, -1, NotificationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNotificationResource_FlushServices(), theUMLPackage.getBehavioralFeature(), null, "flushServices", null, 0, -1, NotificationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNotificationResource_SignalServices(), theUMLPackage.getBehavioralFeature(), null, "signalServices", null, 0, -1, NotificationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNotificationResource_WaitServices(), theUMLPackage.getBehavioralFeature(), null, "waitServices", null, 0, -1, NotificationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNotificationResource_ClearServices(), theUMLPackage.getBehavioralFeature(), null, "clearServices", null, 0, -1, NotificationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(swMutualExclusionResourceEClass, SwMutualExclusionResource.class, "SwMutualExclusionResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwMutualExclusionResource_Mechanism(), this.getMutualExclusionResourceKind(), "mechanism", null, 0, 1, SwMutualExclusionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSwMutualExclusionResource_ConcurrentAccessProtocol(), this.getConcurrentAccessProtocolKind(), "concurrentAccessProtocol", null, 0, 1, SwMutualExclusionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSwMutualExclusionResource_AccessTokenElements(), theUMLPackage.getTypedElement(), null, "accessTokenElements", null, 0, -1, SwMutualExclusionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSwMutualExclusionResource_ReleaseServices(), theUMLPackage.getBehavioralFeature(), null, "releaseServices", null, 0, -1, SwMutualExclusionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSwMutualExclusionResource_AcquireServices(), theUMLPackage.getBehavioralFeature(), null, "acquireServices", null, 0, -1, SwMutualExclusionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(queuePolicyKindEEnum, QueuePolicyKind.class, "QueuePolicyKind");
		addEEnumLiteral(queuePolicyKindEEnum, QueuePolicyKind.FIFO_LITERAL);
		addEEnumLiteral(queuePolicyKindEEnum, QueuePolicyKind.LIFO_LITERAL);
		addEEnumLiteral(queuePolicyKindEEnum, QueuePolicyKind.PRIORITY_LITERAL);
		addEEnumLiteral(queuePolicyKindEEnum, QueuePolicyKind.UNDEF_LITERAL);
		addEEnumLiteral(queuePolicyKindEEnum, QueuePolicyKind.OTHER_LITERAL);

		initEEnum(messageResourceKindEEnum, MessageResourceKind.class, "MessageResourceKind");
		addEEnumLiteral(messageResourceKindEEnum, MessageResourceKind.MESSAGE_QUEUE_LITERAL);
		addEEnumLiteral(messageResourceKindEEnum, MessageResourceKind.PIPE_LITERAL);
		addEEnumLiteral(messageResourceKindEEnum, MessageResourceKind.BLACKBOARD_LITERAL);
		addEEnumLiteral(messageResourceKindEEnum, MessageResourceKind.UNDEF_LITERAL);
		addEEnumLiteral(messageResourceKindEEnum, MessageResourceKind.OTHER_LITERAL);

		initEEnum(notificationKindEEnum, NotificationKind.class, "NotificationKind");
		addEEnumLiteral(notificationKindEEnum, NotificationKind.MEMORIZED_LITERAL);
		addEEnumLiteral(notificationKindEEnum, NotificationKind.BOUNDED_LITERAL);
		addEEnumLiteral(notificationKindEEnum, NotificationKind.MEMORYLESS_LITERAL);
		addEEnumLiteral(notificationKindEEnum, NotificationKind.UNDEF_LITERAL);
		addEEnumLiteral(notificationKindEEnum, NotificationKind.OTHER_LITERAL);

		initEEnum(notificationResourceKindEEnum, NotificationResourceKind.class, "NotificationResourceKind");
		addEEnumLiteral(notificationResourceKindEEnum, NotificationResourceKind.EVENT_LITERAL);
		addEEnumLiteral(notificationResourceKindEEnum, NotificationResourceKind.BARRIER_LITERAL);
		addEEnumLiteral(notificationResourceKindEEnum, NotificationResourceKind.UNDEF_LITERAL);
		addEEnumLiteral(notificationResourceKindEEnum, NotificationResourceKind.OTHER_LITERAL);

		initEEnum(mutualExclusionResourceKindEEnum, MutualExclusionResourceKind.class, "MutualExclusionResourceKind");
		addEEnumLiteral(mutualExclusionResourceKindEEnum, MutualExclusionResourceKind.BOOLEAN_SEMAPHORE_LITERAL);
		addEEnumLiteral(mutualExclusionResourceKindEEnum, MutualExclusionResourceKind.COUNT_SEMAPHORE_LITERAL);
		addEEnumLiteral(mutualExclusionResourceKindEEnum, MutualExclusionResourceKind.MUTEX_LITERAL);
		addEEnumLiteral(mutualExclusionResourceKindEEnum, MutualExclusionResourceKind.UNDEF_LITERAL);
		addEEnumLiteral(mutualExclusionResourceKindEEnum, MutualExclusionResourceKind.OTHER_LITERAL);

		initEEnum(concurrentAccessProtocolKindEEnum, ConcurrentAccessProtocolKind.class, "ConcurrentAccessProtocolKind");
		addEEnumLiteral(concurrentAccessProtocolKindEEnum, ConcurrentAccessProtocolKind.PIP_LITERAL);
		addEEnumLiteral(concurrentAccessProtocolKindEEnum, ConcurrentAccessProtocolKind.PCP_LITERAL);
		addEEnumLiteral(concurrentAccessProtocolKindEEnum, ConcurrentAccessProtocolKind.NO_PREEMPTION_LITERAL);
		addEEnumLiteral(concurrentAccessProtocolKindEEnum, ConcurrentAccessProtocolKind.UNDEF_LITERAL);
		addEEnumLiteral(concurrentAccessProtocolKindEEnum, ConcurrentAccessProtocolKind.OTHER_LITERAL);

		// Create resource
		createResource(eNS_URI);
	}

} //SW_InteractionPackageImpl
