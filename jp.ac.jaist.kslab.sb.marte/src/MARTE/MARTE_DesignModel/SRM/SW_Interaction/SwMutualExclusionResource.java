/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Interaction;

import MARTE.MARTE_Foundations.GRM.MutualExclusionResource;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sw Mutual Exclusion Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwMutualExclusionResource#getMechanism <em>Mechanism</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwMutualExclusionResource#getConcurrentAccessProtocol <em>Concurrent Access Protocol</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwMutualExclusionResource#getAccessTokenElements <em>Access Token Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwMutualExclusionResource#getReleaseServices <em>Release Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwMutualExclusionResource#getAcquireServices <em>Acquire Services</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage#getSwMutualExclusionResource()
 * @model
 * @generated
 */
public interface SwMutualExclusionResource extends SwSynchronizationResource, MutualExclusionResource {
	/**
	 * Returns the value of the '<em><b>Mechanism</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.MutualExclusionResourceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mechanism</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanism</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.MutualExclusionResourceKind
	 * @see #setMechanism(MutualExclusionResourceKind)
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage#getSwMutualExclusionResource_Mechanism()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	MutualExclusionResourceKind getMechanism();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwMutualExclusionResource#getMechanism <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mechanism</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.MutualExclusionResourceKind
	 * @see #getMechanism()
	 * @generated
	 */
	void setMechanism(MutualExclusionResourceKind value);

	/**
	 * Returns the value of the '<em><b>Concurrent Access Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.ConcurrentAccessProtocolKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concurrent Access Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrent Access Protocol</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.ConcurrentAccessProtocolKind
	 * @see #setConcurrentAccessProtocol(ConcurrentAccessProtocolKind)
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage#getSwMutualExclusionResource_ConcurrentAccessProtocol()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	ConcurrentAccessProtocolKind getConcurrentAccessProtocol();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwMutualExclusionResource#getConcurrentAccessProtocol <em>Concurrent Access Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrent Access Protocol</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.ConcurrentAccessProtocolKind
	 * @see #getConcurrentAccessProtocol()
	 * @generated
	 */
	void setConcurrentAccessProtocol(ConcurrentAccessProtocolKind value);

	/**
	 * Returns the value of the '<em><b>Access Token Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Token Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Token Elements</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage#getSwMutualExclusionResource_AccessTokenElements()
	 * @model type="org.eclipse.uml2.uml.TypedElement" ordered="false"
	 * @generated
	 */
	EList getAccessTokenElements();

	/**
	 * Returns the value of the '<em><b>Release Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage#getSwMutualExclusionResource_ReleaseServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getReleaseServices();

	/**
	 * Returns the value of the '<em><b>Acquire Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acquire Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acquire Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage#getSwMutualExclusionResource_AcquireServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getAcquireServices();

} // SwMutualExclusionResource
