/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Interaction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Com Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.MessageComResource#getIsFixedMessageSize <em>Is Fixed Message Size</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.MessageComResource#getMechanism <em>Mechanism</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.MessageComResource#getMessageSizeElements <em>Message Size Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.MessageComResource#getMessageQueueCapacityElements <em>Message Queue Capacity Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.MessageComResource#getMessageQueuePolicy <em>Message Queue Policy</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.MessageComResource#getSendServices <em>Send Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.MessageComResource#getReceiveServices <em>Receive Services</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage#getMessageComResource()
 * @model
 * @generated
 */
public interface MessageComResource extends SwCommunicationResource {
	/**
	 * Returns the value of the '<em><b>Is Fixed Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Fixed Message Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Fixed Message Size</em>' attribute.
	 * @see #setIsFixedMessageSize(Boolean)
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage#getMessageComResource_IsFixedMessageSize()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getIsFixedMessageSize();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.MessageComResource#getIsFixedMessageSize <em>Is Fixed Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Fixed Message Size</em>' attribute.
	 * @see #getIsFixedMessageSize()
	 * @generated
	 */
	void setIsFixedMessageSize(Boolean value);

	/**
	 * Returns the value of the '<em><b>Mechanism</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.MessageResourceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mechanism</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanism</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.MessageResourceKind
	 * @see #setMechanism(MessageResourceKind)
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage#getMessageComResource_Mechanism()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	MessageResourceKind getMechanism();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.MessageComResource#getMechanism <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mechanism</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.MessageResourceKind
	 * @see #getMechanism()
	 * @generated
	 */
	void setMechanism(MessageResourceKind value);

	/**
	 * Returns the value of the '<em><b>Message Size Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Size Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Size Elements</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage#getMessageComResource_MessageSizeElements()
	 * @model type="org.eclipse.uml2.uml.TypedElement" ordered="false"
	 * @generated
	 */
	EList getMessageSizeElements();

	/**
	 * Returns the value of the '<em><b>Message Queue Capacity Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Queue Capacity Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Queue Capacity Elements</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage#getMessageComResource_MessageQueueCapacityElements()
	 * @model type="org.eclipse.uml2.uml.TypedElement" ordered="false"
	 * @generated
	 */
	EList getMessageQueueCapacityElements();

	/**
	 * Returns the value of the '<em><b>Message Queue Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.QueuePolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Queue Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Queue Policy</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.QueuePolicyKind
	 * @see #setMessageQueuePolicy(QueuePolicyKind)
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage#getMessageComResource_MessageQueuePolicy()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	QueuePolicyKind getMessageQueuePolicy();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.MessageComResource#getMessageQueuePolicy <em>Message Queue Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Queue Policy</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.QueuePolicyKind
	 * @see #getMessageQueuePolicy()
	 * @generated
	 */
	void setMessageQueuePolicy(QueuePolicyKind value);

	/**
	 * Returns the value of the '<em><b>Send Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage#getMessageComResource_SendServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getSendServices();

	/**
	 * Returns the value of the '<em><b>Receive Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage#getMessageComResource_ReceiveServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getReceiveServices();

} // MessageComResource
