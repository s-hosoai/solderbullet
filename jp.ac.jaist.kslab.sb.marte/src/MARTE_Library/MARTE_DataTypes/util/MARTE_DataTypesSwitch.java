/**
 */
package MARTE_Library.MARTE_DataTypes.util;

import MARTE_Library.MARTE_DataTypes.*;

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
 * @see MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage
 * @generated
 */
public class MARTE_DataTypesSwitch<T3> extends Switch<T3> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MARTE_DataTypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MARTE_DataTypesSwitch() {
		if (modelPackage == null) {
			modelPackage = MARTE_DataTypesPackage.eINSTANCE;
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
	protected T3 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MARTE_DataTypesPackage.INTEGER_VECTOR: {
				IntegerVector integerVector = (IntegerVector)theEObject;
				T3 result = caseIntegerVector(integerVector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MARTE_DataTypesPackage.INTEGER_MATRIX: {
				IntegerMatrix integerMatrix = (IntegerMatrix)theEObject;
				T3 result = caseIntegerMatrix(integerMatrix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MARTE_DataTypesPackage.INTEGER_INTERVAL: {
				IntegerInterval integerInterval = (IntegerInterval)theEObject;
				T3 result = caseIntegerInterval(integerInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MARTE_DataTypesPackage.UTILITY_TYPE: {
				UtilityType utilityType = (UtilityType)theEObject;
				T3 result = caseUtilityType(utilityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MARTE_DataTypesPackage.ARRAY: {
				Array<?> array = (Array<?>)theEObject;
				T3 result = caseArray(array);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MARTE_DataTypesPackage.INTERVAL: {
				Interval<?, ?> interval = (Interval<?, ?>)theEObject;
				T3 result = caseInterval(interval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MARTE_DataTypesPackage.REALNTERVAL: {
				Realnterval realnterval = (Realnterval)theEObject;
				T3 result = caseRealnterval(realnterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MARTE_DataTypesPackage.NFP_FREQUENCY_INTERVAL: {
				NFP_FrequencyInterval nfP_FrequencyInterval = (NFP_FrequencyInterval)theEObject;
				T3 result = caseNFP_FrequencyInterval(nfP_FrequencyInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MARTE_DataTypesPackage.NFP_NATURAL_INTERVAL: {
				NFP_NaturalInterval nfP_NaturalInterval = (NFP_NaturalInterval)theEObject;
				T3 result = caseNFP_NaturalInterval(nfP_NaturalInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MARTE_DataTypesPackage.REAL_VECTOR: {
				RealVector realVector = (RealVector)theEObject;
				T3 result = caseRealVector(realVector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MARTE_DataTypesPackage.REAL_MATRIX: {
				RealMatrix realMatrix = (RealMatrix)theEObject;
				T3 result = caseRealMatrix(realMatrix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Vector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Vector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T3 caseIntegerVector(IntegerVector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Matrix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T3 caseIntegerMatrix(IntegerMatrix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T3 caseIntegerInterval(IntegerInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Utility Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Utility Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T3 caseUtilityType(UtilityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T3 caseArray(Array<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T1, T2> T3 caseInterval(Interval<T1, T2> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realnterval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realnterval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T3 caseRealnterval(Realnterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Frequency Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Frequency Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T3 caseNFP_FrequencyInterval(NFP_FrequencyInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Natural Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Natural Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T3 caseNFP_NaturalInterval(NFP_NaturalInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Vector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Vector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T3 caseRealVector(RealVector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Matrix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T3 caseRealMatrix(RealMatrix object) {
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
	public T3 defaultCase(EObject object) {
		return null;
	}

} //MARTE_DataTypesSwitch
