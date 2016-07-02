/**
 */
package MARTE_Library.GRM_BasicTypes.util;

import MARTE_Library.GRM_BasicTypes.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage
 * @generated
 */
public class GRM_BasicTypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GRM_BasicTypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRM_BasicTypesSwitch() {
		if (modelPackage == null) {
			modelPackage = GRM_BasicTypesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GRM_BasicTypesPackage.EDF_PARAMETERS: {
				EDF_Parameters edF_Parameters = (EDF_Parameters)theEObject;
				T result = caseEDF_Parameters(edF_Parameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRM_BasicTypesPackage.SCHED_PARAMETERS: {
				SchedParameters schedParameters = (SchedParameters)theEObject;
				T result = caseSchedParameters(schedParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRM_BasicTypesPackage.FIXED_PRIORITY_PARAMETERS: {
				FixedPriorityParameters fixedPriorityParameters = (FixedPriorityParameters)theEObject;
				T result = caseFixedPriorityParameters(fixedPriorityParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRM_BasicTypesPackage.POOLING_PARAMETERS: {
				PoolingParameters poolingParameters = (PoolingParameters)theEObject;
				T result = casePoolingParameters(poolingParameters);
				if (result == null) result = caseFixedPriorityParameters(poolingParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS: {
				PeriodicServerParameters periodicServerParameters = (PeriodicServerParameters)theEObject;
				T result = casePeriodicServerParameters(periodicServerParameters);
				if (result == null) result = caseFixedPriorityParameters(periodicServerParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDF Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDF Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDF_Parameters(EDF_Parameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sched Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sched Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedParameters(SchedParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Priority Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Priority Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedPriorityParameters(FixedPriorityParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pooling Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pooling Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoolingParameters(PoolingParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Server Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Server Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodicServerParameters(PeriodicServerParameters object) {
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
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GRM_BasicTypesSwitch
