/**
 */
package MARTE.MARTE_Annexes.RSM.util;

import MARTE.MARTE_Annexes.RSM.*;

import MARTE.MARTE_Foundations.Alloc.Allocate;

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
 * @see MARTE.MARTE_Annexes.RSM.RSMPackage
 * @generated
 */
public class RSMSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RSMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSMSwitch() {
		if (modelPackage == null) {
			modelPackage = RSMPackage.eINSTANCE;
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
			case RSMPackage.LINK_TOPOLOGY: {
				LinkTopology linkTopology = (LinkTopology)theEObject;
				Object result = caseLinkTopology(linkTopology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RSMPackage.DEFAULT_LINK: {
				DefaultLink defaultLink = (DefaultLink)theEObject;
				Object result = caseDefaultLink(defaultLink);
				if (result == null) result = caseLinkTopology(defaultLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RSMPackage.INTER_REPETITION: {
				InterRepetition interRepetition = (InterRepetition)theEObject;
				Object result = caseInterRepetition(interRepetition);
				if (result == null) result = caseLinkTopology(interRepetition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RSMPackage.DISTRIBUTE: {
				Distribute distribute = (Distribute)theEObject;
				Object result = caseDistribute(distribute);
				if (result == null) result = caseAllocate(distribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RSMPackage.RESHAPE: {
				Reshape reshape = (Reshape)theEObject;
				Object result = caseReshape(reshape);
				if (result == null) result = caseLinkTopology(reshape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RSMPackage.TILER: {
				Tiler tiler = (Tiler)theEObject;
				Object result = caseTiler(tiler);
				if (result == null) result = caseLinkTopology(tiler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RSMPackage.SHAPED: {
				Shaped shaped = (Shaped)theEObject;
				Object result = caseShaped(shaped);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Topology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Topology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLinkTopology(LinkTopology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDefaultLink(DefaultLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inter Repetition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inter Repetition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInterRepetition(InterRepetition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDistribute(Distribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reshape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reshape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReshape(Reshape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tiler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tiler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTiler(Tiler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shaped</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shaped</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseShaped(Shaped object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAllocate(Allocate object) {
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

} //RSMSwitch
