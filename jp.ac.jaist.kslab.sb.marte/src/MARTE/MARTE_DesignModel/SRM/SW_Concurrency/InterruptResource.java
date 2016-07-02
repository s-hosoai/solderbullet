/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Concurrency;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interrupt Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.InterruptResource#getKind <em>Kind</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.InterruptResource#getIsMaskable <em>Is Maskable</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.InterruptResource#getVectorElements <em>Vector Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.InterruptResource#getMaskElements <em>Mask Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.InterruptResource#getRoutineConnectServices <em>Routine Connect Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.InterruptResource#getRoutineDisconnectServices <em>Routine Disconnect Services</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getInterruptResource()
 * @model
 * @generated
 */
public interface InterruptResource extends SwConcurrentResource {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.InterruptKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.InterruptKind
	 * @see #setKind(InterruptKind)
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getInterruptResource_Kind()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	InterruptKind getKind();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.InterruptResource#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.InterruptKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(InterruptKind value);

	/**
	 * Returns the value of the '<em><b>Is Maskable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Maskable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Maskable</em>' attribute.
	 * @see #setIsMaskable(Boolean)
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getInterruptResource_IsMaskable()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getIsMaskable();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.InterruptResource#getIsMaskable <em>Is Maskable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Maskable</em>' attribute.
	 * @see #getIsMaskable()
	 * @generated
	 */
	void setIsMaskable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Vector Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector Elements</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getInterruptResource_VectorElements()
	 * @model type="org.eclipse.uml2.uml.TypedElement" ordered="false"
	 * @generated
	 */
	EList getVectorElements();

	/**
	 * Returns the value of the '<em><b>Mask Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask Elements</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getInterruptResource_MaskElements()
	 * @model type="org.eclipse.uml2.uml.TypedElement" ordered="false"
	 * @generated
	 */
	EList getMaskElements();

	/**
	 * Returns the value of the '<em><b>Routine Connect Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routine Connect Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routine Connect Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getInterruptResource_RoutineConnectServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getRoutineConnectServices();

	/**
	 * Returns the value of the '<em><b>Routine Disconnect Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routine Disconnect Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routine Disconnect Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getInterruptResource_RoutineDisconnectServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getRoutineDisconnectServices();

} // InterruptResource
