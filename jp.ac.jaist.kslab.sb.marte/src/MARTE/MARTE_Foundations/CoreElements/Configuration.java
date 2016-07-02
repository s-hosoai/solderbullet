/**
 */
package MARTE.MARTE_Foundations.CoreElements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.StructuredClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.CoreElements.Configuration#getBase_StructuredClassifier <em>Base Structured Classifier</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.CoreElements.Configuration#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.CoreElements.Configuration#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.CoreElements.CoreElementsPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Structured Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Structured Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Structured Classifier</em>' reference.
	 * @see #setBase_StructuredClassifier(StructuredClassifier)
	 * @see MARTE.MARTE_Foundations.CoreElements.CoreElementsPackage#getConfiguration_Base_StructuredClassifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StructuredClassifier getBase_StructuredClassifier();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.CoreElements.Configuration#getBase_StructuredClassifier <em>Base Structured Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Structured Classifier</em>' reference.
	 * @see #getBase_StructuredClassifier()
	 * @generated
	 */
	void setBase_StructuredClassifier(StructuredClassifier value);

	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' reference.
	 * @see #setBase_Package(org.eclipse.uml2.uml.Package)
	 * @see MARTE.MARTE_Foundations.CoreElements.CoreElementsPackage#getConfiguration_Base_Package()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getBase_Package();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.CoreElements.Configuration#getBase_Package <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' reference.
	 * @see #getBase_Package()
	 * @generated
	 */
	void setBase_Package(org.eclipse.uml2.uml.Package value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_Foundations.CoreElements.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' reference list.
	 * @see MARTE.MARTE_Foundations.CoreElements.CoreElementsPackage#getConfiguration_Mode()
	 * @model type="MARTE.MARTE_Foundations.CoreElements.Mode" ordered="false"
	 * @generated
	 */
	EList getMode();

} // Configuration
