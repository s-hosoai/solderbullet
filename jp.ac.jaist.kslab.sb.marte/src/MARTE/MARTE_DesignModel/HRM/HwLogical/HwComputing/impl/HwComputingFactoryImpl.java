/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.*;

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
public class HwComputingFactoryImpl extends EFactoryImpl implements HwComputingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HwComputingFactory init() {
		try {
			HwComputingFactory theHwComputingFactory = (HwComputingFactory)EPackage.Registry.INSTANCE.getEFactory(HwComputingPackage.eNS_URI);
			if (theHwComputingFactory != null) {
				return theHwComputingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HwComputingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwComputingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HwComputingPackage.PLD_ORGANIZATION: return createPLD_Organization();
			case HwComputingPackage.HW_PROCESSOR: return createHwProcessor();
			case HwComputingPackage.HW_COMPUTING_RESOURCE: return createHwComputingResource();
			case HwComputingPackage.HW_ISA: return createHwISA();
			case HwComputingPackage.HW_BRANCH_PREDICTOR: return createHwBranchPredictor();
			case HwComputingPackage.HW_ASIC: return createHwASIC();
			case HwComputingPackage.HW_PLD: return createHwPLD();
			case HwComputingPackage.HW_MCU: return createHwMCU();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case HwComputingPackage.ISA_TYPE:
				return createISA_TypeFromString(eDataType, initialValue);
			case HwComputingPackage.PLD_TECHNOLOGY:
				return createPLD_TechnologyFromString(eDataType, initialValue);
			case HwComputingPackage.PLD_CLASS:
				return createPLD_ClassFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case HwComputingPackage.ISA_TYPE:
				return convertISA_TypeToString(eDataType, instanceValue);
			case HwComputingPackage.PLD_TECHNOLOGY:
				return convertPLD_TechnologyToString(eDataType, instanceValue);
			case HwComputingPackage.PLD_CLASS:
				return convertPLD_ClassToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLD_Organization createPLD_Organization() {
		PLD_OrganizationImpl plD_Organization = new PLD_OrganizationImpl();
		return plD_Organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwProcessor createHwProcessor() {
		HwProcessorImpl hwProcessor = new HwProcessorImpl();
		return hwProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwComputingResource createHwComputingResource() {
		HwComputingResourceImpl hwComputingResource = new HwComputingResourceImpl();
		return hwComputingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwISA createHwISA() {
		HwISAImpl hwISA = new HwISAImpl();
		return hwISA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwBranchPredictor createHwBranchPredictor() {
		HwBranchPredictorImpl hwBranchPredictor = new HwBranchPredictorImpl();
		return hwBranchPredictor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwASIC createHwASIC() {
		HwASICImpl hwASIC = new HwASICImpl();
		return hwASIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPLD createHwPLD() {
		HwPLDImpl hwPLD = new HwPLDImpl();
		return hwPLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwMCU createHwMCU() {
		HwMCUImpl hwMCU = new HwMCUImpl();
		return hwMCU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISA_Type createISA_TypeFromString(EDataType eDataType, String initialValue) {
		ISA_Type result = ISA_Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertISA_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLD_Technology createPLD_TechnologyFromString(EDataType eDataType, String initialValue) {
		PLD_Technology result = PLD_Technology.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPLD_TechnologyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLD_Class createPLD_ClassFromString(EDataType eDataType, String initialValue) {
		PLD_Class result = PLD_Class.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPLD_ClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwComputingPackage getHwComputingPackage() {
		return (HwComputingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static HwComputingPackage getPackage() {
		return HwComputingPackage.eINSTANCE;
	}

} //HwComputingFactoryImpl
