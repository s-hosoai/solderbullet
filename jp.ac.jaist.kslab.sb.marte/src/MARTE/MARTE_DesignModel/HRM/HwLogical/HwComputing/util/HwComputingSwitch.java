/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.util;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.*;

import MARTE.MARTE_Foundations.GRM.ComputingResource;
import MARTE.MARTE_Foundations.GRM.ProcessingResource;
import MARTE.MARTE_Foundations.GRM.Resource;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage
 * @generated
 */
public class HwComputingSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HwComputingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwComputingSwitch() {
		if (modelPackage == null) {
			modelPackage = HwComputingPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case HwComputingPackage.PLD_ORGANIZATION: {
				PLD_Organization plD_Organization = (PLD_Organization)theEObject;
				Object result = casePLD_Organization(plD_Organization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwComputingPackage.HW_PROCESSOR: {
				HwProcessor hwProcessor = (HwProcessor)theEObject;
				Object result = caseHwProcessor(hwProcessor);
				if (result == null) result = caseHwComputingResource(hwProcessor);
				if (result == null) result = caseHwResource(hwProcessor);
				if (result == null) result = caseComputingResource(hwProcessor);
				if (result == null) result = caseProcessingResource(hwProcessor);
				if (result == null) result = caseResource(hwProcessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwComputingPackage.HW_COMPUTING_RESOURCE: {
				HwComputingResource hwComputingResource = (HwComputingResource)theEObject;
				Object result = caseHwComputingResource(hwComputingResource);
				if (result == null) result = caseHwResource(hwComputingResource);
				if (result == null) result = caseComputingResource(hwComputingResource);
				if (result == null) result = caseProcessingResource(hwComputingResource);
				if (result == null) result = caseResource(hwComputingResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwComputingPackage.HW_ISA: {
				HwISA hwISA = (HwISA)theEObject;
				Object result = caseHwISA(hwISA);
				if (result == null) result = caseHwResource(hwISA);
				if (result == null) result = caseResource(hwISA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwComputingPackage.HW_BRANCH_PREDICTOR: {
				HwBranchPredictor hwBranchPredictor = (HwBranchPredictor)theEObject;
				Object result = caseHwBranchPredictor(hwBranchPredictor);
				if (result == null) result = caseHwResource(hwBranchPredictor);
				if (result == null) result = caseResource(hwBranchPredictor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwComputingPackage.HW_ASIC: {
				HwASIC hwASIC = (HwASIC)theEObject;
				Object result = caseHwASIC(hwASIC);
				if (result == null) result = caseHwComputingResource(hwASIC);
				if (result == null) result = caseHwResource(hwASIC);
				if (result == null) result = caseComputingResource(hwASIC);
				if (result == null) result = caseProcessingResource(hwASIC);
				if (result == null) result = caseResource(hwASIC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwComputingPackage.HW_PLD: {
				HwPLD hwPLD = (HwPLD)theEObject;
				Object result = caseHwPLD(hwPLD);
				if (result == null) result = caseHwComputingResource(hwPLD);
				if (result == null) result = caseHwResource(hwPLD);
				if (result == null) result = caseComputingResource(hwPLD);
				if (result == null) result = caseProcessingResource(hwPLD);
				if (result == null) result = caseResource(hwPLD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HwComputingPackage.HW_MCU: {
				HwMCU hwMCU = (HwMCU)theEObject;
				Object result = caseHwMCU(hwMCU);
				if (result == null) result = caseHwComputingResource(hwMCU);
				if (result == null) result = caseHwResource(hwMCU);
				if (result == null) result = caseComputingResource(hwMCU);
				if (result == null) result = caseProcessingResource(hwMCU);
				if (result == null) result = caseResource(hwMCU);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PLD Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PLD Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePLD_Organization(PLD_Organization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwProcessor(HwProcessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwComputingResource(HwComputingResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw ISA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw ISA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwISA(HwISA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Branch Predictor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Branch Predictor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwBranchPredictor(HwBranchPredictor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw ASIC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw ASIC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwASIC(HwASIC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw PLD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw PLD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwPLD(HwPLD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw MCU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw MCU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwMCU(HwMCU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHwResource(HwResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProcessingResource(ProcessingResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computing Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computing Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComputingResource(ComputingResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //HwComputingSwitch
