/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Interaction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shared Data Com Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.SharedDataComResource#getReadServices <em>Read Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.SharedDataComResource#getWriteServices <em>Write Services</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage#getSharedDataComResource()
 * @model
 * @generated
 */
public interface SharedDataComResource extends SwCommunicationResource {
	/**
	 * Returns the value of the '<em><b>Read Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage#getSharedDataComResource_ReadServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getReadServices();

	/**
	 * Returns the value of the '<em><b>Write Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage#getSharedDataComResource_WriteServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getWriteServices();

} // SharedDataComResource
