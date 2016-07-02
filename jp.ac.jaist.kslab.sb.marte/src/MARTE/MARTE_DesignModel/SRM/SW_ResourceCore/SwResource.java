/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_ResourceCore;

import MARTE.MARTE_Foundations.GRM.Resource;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sw Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwResource#getIdentifierElements <em>Identifier Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwResource#getStateElements <em>State Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwResource#getMemorySizeFootprint <em>Memory Size Footprint</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwResource#getCreateServices <em>Create Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwResource#getDeleteServices <em>Delete Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwResource#getInitializeServices <em>Initialize Services</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SW_ResourceCorePackage#getSwResource()
 * @model abstract="true"
 * @generated
 */
public interface SwResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Identifier Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier Elements</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SW_ResourceCorePackage#getSwResource_IdentifierElements()
	 * @model type="org.eclipse.uml2.uml.TypedElement" ordered="false"
	 * @generated
	 */
	EList getIdentifierElements();

	/**
	 * Returns the value of the '<em><b>State Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Elements</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SW_ResourceCorePackage#getSwResource_StateElements()
	 * @model type="org.eclipse.uml2.uml.TypedElement" ordered="false"
	 * @generated
	 */
	EList getStateElements();

	/**
	 * Returns the value of the '<em><b>Memory Size Footprint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Size Footprint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Size Footprint</em>' reference.
	 * @see #setMemorySizeFootprint(TypedElement)
	 * @see MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SW_ResourceCorePackage#getSwResource_MemorySizeFootprint()
	 * @model ordered="false"
	 * @generated
	 */
	TypedElement getMemorySizeFootprint();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwResource#getMemorySizeFootprint <em>Memory Size Footprint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Size Footprint</em>' reference.
	 * @see #getMemorySizeFootprint()
	 * @generated
	 */
	void setMemorySizeFootprint(TypedElement value);

	/**
	 * Returns the value of the '<em><b>Create Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SW_ResourceCorePackage#getSwResource_CreateServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getCreateServices();

	/**
	 * Returns the value of the '<em><b>Delete Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SW_ResourceCorePackage#getSwResource_DeleteServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getDeleteServices();

	/**
	 * Returns the value of the '<em><b>Initialize Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialize Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialize Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SW_ResourceCorePackage#getSwResource_InitializeServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getInitializeServices();

} // SwResource
