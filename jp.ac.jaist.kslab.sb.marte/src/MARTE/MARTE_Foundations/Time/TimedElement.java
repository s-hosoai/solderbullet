/**
 */
package MARTE.MARTE_Foundations.Time;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.Time.TimedElement#getOn <em>On</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.Time.TimePackage#getTimedElement()
 * @model abstract="true"
 * @generated
 */
public interface TimedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>On</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_Foundations.Time.Clock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' reference list.
	 * @see MARTE.MARTE_Foundations.Time.TimePackage#getTimedElement_On()
	 * @model type="MARTE.MARTE_Foundations.Time.Clock" required="true" ordered="false"
	 * @generated
	 */
	EList getOn();

} // TimedElement
