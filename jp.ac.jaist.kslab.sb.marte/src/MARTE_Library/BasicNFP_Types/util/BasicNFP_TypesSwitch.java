/**
 */
package MARTE_Library.BasicNFP_Types.util;

import MARTE_Library.BasicNFP_Types.*;

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
 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage
 * @generated
 */
public class BasicNFP_TypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasicNFP_TypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicNFP_TypesSwitch() {
		if (modelPackage == null) {
			modelPackage = BasicNFP_TypesPackage.eINSTANCE;
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
			case BasicNFP_TypesPackage.NFP_COMMON_TYPE: {
				NFP_CommonType nfP_CommonType = (NFP_CommonType)theEObject;
				T result = caseNFP_CommonType(nfP_CommonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.NFP_FREQUENCY: {
				NFP_Frequency nfP_Frequency = (NFP_Frequency)theEObject;
				T result = caseNFP_Frequency(nfP_Frequency);
				if (result == null) result = caseNFP_Real(nfP_Frequency);
				if (result == null) result = caseNFP_CommonType(nfP_Frequency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.NFP_REAL: {
				NFP_Real nfP_Real = (NFP_Real)theEObject;
				T result = caseNFP_Real(nfP_Real);
				if (result == null) result = caseNFP_CommonType(nfP_Real);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.NFP_NATURAL: {
				NFP_Natural nfP_Natural = (NFP_Natural)theEObject;
				T result = caseNFP_Natural(nfP_Natural);
				if (result == null) result = caseNFP_CommonType(nfP_Natural);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.NFP_BOOLEAN: {
				NFP_Boolean nfP_Boolean = (NFP_Boolean)theEObject;
				T result = caseNFP_Boolean(nfP_Boolean);
				if (result == null) result = caseNFP_CommonType(nfP_Boolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.NFP_STRING: {
				NFP_String nfP_String = (NFP_String)theEObject;
				T result = caseNFP_String(nfP_String);
				if (result == null) result = caseNFP_CommonType(nfP_String);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.NFP_INTEGER: {
				NFP_Integer nfP_Integer = (NFP_Integer)theEObject;
				T result = caseNFP_Integer(nfP_Integer);
				if (result == null) result = caseNFP_CommonType(nfP_Integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.NFP_DATE_TIME: {
				NFP_DateTime nfP_DateTime = (NFP_DateTime)theEObject;
				T result = caseNFP_DateTime(nfP_DateTime);
				if (result == null) result = caseNFP_CommonType(nfP_DateTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.NFP_DATA_TX_RATE: {
				NFP_DataTxRate nfP_DataTxRate = (NFP_DataTxRate)theEObject;
				T result = caseNFP_DataTxRate(nfP_DataTxRate);
				if (result == null) result = caseNFP_Real(nfP_DataTxRate);
				if (result == null) result = caseNFP_CommonType(nfP_DataTxRate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.NFP_POWER: {
				NFP_Power nfP_Power = (NFP_Power)theEObject;
				T result = caseNFP_Power(nfP_Power);
				if (result == null) result = caseNFP_Real(nfP_Power);
				if (result == null) result = caseNFP_CommonType(nfP_Power);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.NFP_DATA_SIZE: {
				NFP_DataSize nfP_DataSize = (NFP_DataSize)theEObject;
				T result = caseNFP_DataSize(nfP_DataSize);
				if (result == null) result = caseNFP_Real(nfP_DataSize);
				if (result == null) result = caseNFP_CommonType(nfP_DataSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.NFP_ENERGY: {
				NFP_Energy nfP_Energy = (NFP_Energy)theEObject;
				T result = caseNFP_Energy(nfP_Energy);
				if (result == null) result = caseNFP_Real(nfP_Energy);
				if (result == null) result = caseNFP_CommonType(nfP_Energy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.NFP_LENGTH: {
				NFP_Length nfP_Length = (NFP_Length)theEObject;
				T result = caseNFP_Length(nfP_Length);
				if (result == null) result = caseNFP_Real(nfP_Length);
				if (result == null) result = caseNFP_CommonType(nfP_Length);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.NFP_AREA: {
				NFP_Area nfP_Area = (NFP_Area)theEObject;
				T result = caseNFP_Area(nfP_Area);
				if (result == null) result = caseNFP_Real(nfP_Area);
				if (result == null) result = caseNFP_CommonType(nfP_Area);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN: {
				ArrivalPattern arrivalPattern = (ArrivalPattern)theEObject;
				T result = caseArrivalPattern(arrivalPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.PERIODIC_PATTERN: {
				PeriodicPattern periodicPattern = (PeriodicPattern)theEObject;
				T result = casePeriodicPattern(periodicPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.APERIODIC_PATTERN: {
				AperiodicPattern aperiodicPattern = (AperiodicPattern)theEObject;
				T result = caseAperiodicPattern(aperiodicPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.BURST_PATTERN: {
				BurstPattern burstPattern = (BurstPattern)theEObject;
				T result = caseBurstPattern(burstPattern);
				if (result == null) result = caseAperiodicPattern(burstPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.IRREGULAR_PATTERN: {
				IrregularPattern irregularPattern = (IrregularPattern)theEObject;
				T result = caseIrregularPattern(irregularPattern);
				if (result == null) result = caseAperiodicPattern(irregularPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.CLOSED_PATTERN: {
				ClosedPattern closedPattern = (ClosedPattern)theEObject;
				T result = caseClosedPattern(closedPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.SPORADIC_PATTERN: {
				SporadicPattern sporadicPattern = (SporadicPattern)theEObject;
				T result = caseSporadicPattern(sporadicPattern);
				if (result == null) result = caseAperiodicPattern(sporadicPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.OPEN_PATTERN: {
				OpenPattern openPattern = (OpenPattern)theEObject;
				T result = caseOpenPattern(openPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.NFP_PERCENTAGE: {
				NFP_Percentage nfP_Percentage = (NFP_Percentage)theEObject;
				T result = caseNFP_Percentage(nfP_Percentage);
				if (result == null) result = caseNFP_Real(nfP_Percentage);
				if (result == null) result = caseNFP_CommonType(nfP_Percentage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.NFP_PRICE: {
				NFP_Price nfP_Price = (NFP_Price)theEObject;
				T result = caseNFP_Price(nfP_Price);
				if (result == null) result = caseNFP_Real(nfP_Price);
				if (result == null) result = caseNFP_CommonType(nfP_Price);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.NFP_WEIGHT: {
				NFP_Weight nfP_Weight = (NFP_Weight)theEObject;
				T result = caseNFP_Weight(nfP_Weight);
				if (result == null) result = caseNFP_Real(nfP_Weight);
				if (result == null) result = caseNFP_CommonType(nfP_Weight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicNFP_TypesPackage.NFP_DURATION: {
				NFP_Duration nfP_Duration = (NFP_Duration)theEObject;
				T result = caseNFP_Duration(nfP_Duration);
				if (result == null) result = caseNFP_Real(nfP_Duration);
				if (result == null) result = caseNFP_CommonType(nfP_Duration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Common Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Common Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_CommonType(NFP_CommonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Frequency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Frequency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_Frequency(NFP_Frequency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_Real(NFP_Real object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Natural</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Natural</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_Natural(NFP_Natural object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_Boolean(NFP_Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_String(NFP_String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_Integer(NFP_Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Date Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_DateTime(NFP_DateTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Data Tx Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Data Tx Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_DataTxRate(NFP_DataTxRate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Power</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Power</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_Power(NFP_Power object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Data Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Data Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_DataSize(NFP_DataSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Energy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Energy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_Energy(NFP_Energy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Length</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Length</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_Length(NFP_Length object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_Area(NFP_Area object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arrival Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arrival Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrivalPattern(ArrivalPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodicPattern(PeriodicPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aperiodic Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aperiodic Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAperiodicPattern(AperiodicPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Burst Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Burst Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBurstPattern(BurstPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Irregular Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Irregular Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIrregularPattern(IrregularPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Closed Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Closed Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClosedPattern(ClosedPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sporadic Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sporadic Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSporadicPattern(SporadicPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenPattern(OpenPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Percentage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Percentage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_Percentage(NFP_Percentage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Price</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Price</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_Price(NFP_Price object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Weight</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Weight</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_Weight(NFP_Weight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_Duration(NFP_Duration object) {
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

} //BasicNFP_TypesSwitch
