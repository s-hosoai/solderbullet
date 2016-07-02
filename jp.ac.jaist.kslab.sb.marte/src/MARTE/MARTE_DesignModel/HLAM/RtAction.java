/**
 */
package MARTE.MARTE_DesignModel.HLAM;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.InvocationAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rt Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtAction#getIsAtomic <em>Is Atomic</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtAction#getSynchKind <em>Synch Kind</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtAction#getMsgSize <em>Msg Size</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtAction#getBase_BehavioralFeature <em>Base Behavioral Feature</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtAction#getBase_InvocationAction <em>Base Invocation Action</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtAction()
 * @model
 * @generated
 */
public interface RtAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Atomic</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Atomic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Atomic</em>' attribute.
	 * @see #setIsAtomic(Boolean)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtAction_IsAtomic()
	 * @model default="false" unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsAtomic();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtAction#getIsAtomic <em>Is Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Atomic</em>' attribute.
	 * @see #getIsAtomic()
	 * @generated
	 */
	void setIsAtomic(Boolean value);

	/**
	 * Returns the value of the '<em><b>Synch Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.HLAM.SynchronizationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synch Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synch Kind</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HLAM.SynchronizationKind
	 * @see #setSynchKind(SynchronizationKind)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtAction_SynchKind()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	SynchronizationKind getSynchKind();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtAction#getSynchKind <em>Synch Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synch Kind</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HLAM.SynchronizationKind
	 * @see #getSynchKind()
	 * @generated
	 */
	void setSynchKind(SynchronizationKind value);

	/**
	 * Returns the value of the '<em><b>Msg Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Size</em>' containment reference.
	 * @see #setMsgSize(NFP_DataSize)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtAction_MsgSize()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_DataSize getMsgSize();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtAction#getMsgSize <em>Msg Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg Size</em>' containment reference.
	 * @see #getMsgSize()
	 * @generated
	 */
	void setMsgSize(NFP_DataSize value);

	/**
	 * Returns the value of the '<em><b>Base Behavioral Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Behavioral Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Behavioral Feature</em>' reference.
	 * @see #setBase_BehavioralFeature(BehavioralFeature)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtAction_Base_BehavioralFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BehavioralFeature getBase_BehavioralFeature();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtAction#getBase_BehavioralFeature <em>Base Behavioral Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Behavioral Feature</em>' reference.
	 * @see #getBase_BehavioralFeature()
	 * @generated
	 */
	void setBase_BehavioralFeature(BehavioralFeature value);

	/**
	 * Returns the value of the '<em><b>Base Invocation Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Invocation Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Invocation Action</em>' reference.
	 * @see #setBase_InvocationAction(InvocationAction)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtAction_Base_InvocationAction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InvocationAction getBase_InvocationAction();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtAction#getBase_InvocationAction <em>Base Invocation Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Invocation Action</em>' reference.
	 * @see #getBase_InvocationAction()
	 * @generated
	 */
	void setBase_InvocationAction(InvocationAction value);

} // RtAction
