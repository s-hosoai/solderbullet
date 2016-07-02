/**
 */
package MARTE_Library.GRM_BasicTypes.impl;

import MARTE_Library.GRM_BasicTypes.*;

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
public class GRM_BasicTypesFactoryImpl extends EFactoryImpl implements GRM_BasicTypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GRM_BasicTypesFactory init() {
		try {
			GRM_BasicTypesFactory theGRM_BasicTypesFactory = (GRM_BasicTypesFactory)EPackage.Registry.INSTANCE.getEFactory(GRM_BasicTypesPackage.eNS_URI);
			if (theGRM_BasicTypesFactory != null) {
				return theGRM_BasicTypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GRM_BasicTypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRM_BasicTypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GRM_BasicTypesPackage.EDF_PARAMETERS: return createEDF_Parameters();
			case GRM_BasicTypesPackage.SCHED_PARAMETERS: return createSchedParameters();
			case GRM_BasicTypesPackage.FIXED_PRIORITY_PARAMETERS: return createFixedPriorityParameters();
			case GRM_BasicTypesPackage.POOLING_PARAMETERS: return createPoolingParameters();
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS: return createPeriodicServerParameters();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GRM_BasicTypesPackage.SCHED_POLICY_KIND:
				return createSchedPolicyKindFromString(eDataType, initialValue);
			case GRM_BasicTypesPackage.PROTECT_PROTOCOL_KIND:
				return createProtectProtocolKindFromString(eDataType, initialValue);
			case GRM_BasicTypesPackage.PERIODIC_SERVER_KIND:
				return createPeriodicServerKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GRM_BasicTypesPackage.SCHED_POLICY_KIND:
				return convertSchedPolicyKindToString(eDataType, instanceValue);
			case GRM_BasicTypesPackage.PROTECT_PROTOCOL_KIND:
				return convertProtectProtocolKindToString(eDataType, instanceValue);
			case GRM_BasicTypesPackage.PERIODIC_SERVER_KIND:
				return convertPeriodicServerKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDF_Parameters createEDF_Parameters() {
		EDF_ParametersImpl edF_Parameters = new EDF_ParametersImpl();
		return edF_Parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedParameters createSchedParameters() {
		SchedParametersImpl schedParameters = new SchedParametersImpl();
		return schedParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedPriorityParameters createFixedPriorityParameters() {
		FixedPriorityParametersImpl fixedPriorityParameters = new FixedPriorityParametersImpl();
		return fixedPriorityParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoolingParameters createPoolingParameters() {
		PoolingParametersImpl poolingParameters = new PoolingParametersImpl();
		return poolingParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicServerParameters createPeriodicServerParameters() {
		PeriodicServerParametersImpl periodicServerParameters = new PeriodicServerParametersImpl();
		return periodicServerParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedPolicyKind createSchedPolicyKindFromString(EDataType eDataType, String initialValue) {
		SchedPolicyKind result = SchedPolicyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchedPolicyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectProtocolKind createProtectProtocolKindFromString(EDataType eDataType, String initialValue) {
		ProtectProtocolKind result = ProtectProtocolKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtectProtocolKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicServerKind createPeriodicServerKindFromString(EDataType eDataType, String initialValue) {
		PeriodicServerKind result = PeriodicServerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPeriodicServerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRM_BasicTypesPackage getGRM_BasicTypesPackage() {
		return (GRM_BasicTypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GRM_BasicTypesPackage getPackage() {
		return GRM_BasicTypesPackage.eINSTANCE;
	}

} //GRM_BasicTypesFactoryImpl
