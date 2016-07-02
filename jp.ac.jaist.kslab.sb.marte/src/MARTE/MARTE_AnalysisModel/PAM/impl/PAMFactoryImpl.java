/**
 */
package MARTE.MARTE_AnalysisModel.PAM.impl;

import MARTE.MARTE_AnalysisModel.PAM.*;

import org.eclipse.emf.ecore.EClass;
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
public class PAMFactoryImpl extends EFactoryImpl implements PAMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PAMFactory init() {
		try {
			PAMFactory thePAMFactory = (PAMFactory)EPackage.Registry.INSTANCE.getEFactory(PAMPackage.eNS_URI);
			if (thePAMFactory != null) {
				return thePAMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PAMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PAMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PAMPackage.PA_STEP: return createPaStep();
			case PAMPackage.PA_REQUESTED_STEP: return createPaRequestedStep();
			case PAMPackage.PA_COMM_STEP: return createPaCommStep();
			case PAMPackage.PA_RES_PASS_STEP: return createPaResPassStep();
			case PAMPackage.PA_LOGICAL_RESOURCE: return createPaLogicalResource();
			case PAMPackage.PA_RUN_TINSTANCE: return createPaRunTInstance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaStep createPaStep() {
		PaStepImpl paStep = new PaStepImpl();
		return paStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaRequestedStep createPaRequestedStep() {
		PaRequestedStepImpl paRequestedStep = new PaRequestedStepImpl();
		return paRequestedStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaCommStep createPaCommStep() {
		PaCommStepImpl paCommStep = new PaCommStepImpl();
		return paCommStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaResPassStep createPaResPassStep() {
		PaResPassStepImpl paResPassStep = new PaResPassStepImpl();
		return paResPassStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaLogicalResource createPaLogicalResource() {
		PaLogicalResourceImpl paLogicalResource = new PaLogicalResourceImpl();
		return paLogicalResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaRunTInstance createPaRunTInstance() {
		PaRunTInstanceImpl paRunTInstance = new PaRunTInstanceImpl();
		return paRunTInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PAMPackage getPAMPackage() {
		return (PAMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static PAMPackage getPackage() {
		return PAMPackage.eINSTANCE;
	}

} //PAMFactoryImpl
