/**
 */
package MARTE.MARTE_Foundations.GRM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.ResourceUsage#getExecTime <em>Exec Time</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.ResourceUsage#getAllocatedMemory <em>Allocated Memory</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.ResourceUsage#getUsedMemory <em>Used Memory</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.ResourceUsage#getPowerPeak <em>Power Peak</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.ResourceUsage#getEnergy <em>Energy</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.ResourceUsage#getBase_NamedElement <em>Base Named Element</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.ResourceUsage#getSubUsage <em>Sub Usage</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.ResourceUsage#getUsedResources <em>Used Resources</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.ResourceUsage#getMsgSize <em>Msg Size</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getResourceUsage()
 * @model
 * @generated
 */
public interface ResourceUsage extends EObject {
	/**
	 * Returns the value of the '<em><b>Exec Time</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exec Time</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exec Time</em>' containment reference list.
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getResourceUsage_ExecTime()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Duration" containment="true"
	 * @generated
	 */
	EList getExecTime();

	/**
	 * Returns the value of the '<em><b>Allocated Memory</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_DataSize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Memory</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Memory</em>' containment reference list.
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getResourceUsage_AllocatedMemory()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_DataSize" containment="true"
	 * @generated
	 */
	EList getAllocatedMemory();

	/**
	 * Returns the value of the '<em><b>Used Memory</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_DataSize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Memory</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Memory</em>' containment reference list.
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getResourceUsage_UsedMemory()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_DataSize" containment="true"
	 * @generated
	 */
	EList getUsedMemory();

	/**
	 * Returns the value of the '<em><b>Power Peak</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Power}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Peak</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Peak</em>' containment reference list.
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getResourceUsage_PowerPeak()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Power" containment="true"
	 * @generated
	 */
	EList getPowerPeak();

	/**
	 * Returns the value of the '<em><b>Energy</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Energy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy</em>' containment reference list.
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getResourceUsage_Energy()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Energy" containment="true"
	 * @generated
	 */
	EList getEnergy();

	/**
	 * Returns the value of the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Named Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Named Element</em>' reference.
	 * @see #setBase_NamedElement(NamedElement)
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getResourceUsage_Base_NamedElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NamedElement getBase_NamedElement();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.GRM.ResourceUsage#getBase_NamedElement <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Named Element</em>' reference.
	 * @see #getBase_NamedElement()
	 * @generated
	 */
	void setBase_NamedElement(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Sub Usage</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_Foundations.GRM.ResourceUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Usage</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Usage</em>' reference list.
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getResourceUsage_SubUsage()
	 * @model type="MARTE.MARTE_Foundations.GRM.ResourceUsage" ordered="false"
	 * @generated
	 */
	EList getSubUsage();

	/**
	 * Returns the value of the '<em><b>Used Resources</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_Foundations.GRM.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Resources</em>' reference list.
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getResourceUsage_UsedResources()
	 * @model type="MARTE.MARTE_Foundations.GRM.Resource"
	 * @generated
	 */
	EList getUsedResources();

	/**
	 * Returns the value of the '<em><b>Msg Size</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_DataSize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg Size</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Size</em>' containment reference list.
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getResourceUsage_MsgSize()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_DataSize" containment="true"
	 * @generated
	 */
	EList getMsgSize();

} // ResourceUsage
