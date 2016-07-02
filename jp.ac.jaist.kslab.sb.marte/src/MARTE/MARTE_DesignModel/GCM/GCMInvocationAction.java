/**
 */
package MARTE.MARTE_DesignModel.GCM;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.InvocationAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.GCMInvocationAction#getBase_InvocationAction <em>Base Invocation Action</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.GCMInvocationAction#getOnFeature <em>On Feature</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getGCMInvocationAction()
 * @model
 * @generated
 */
public interface GCMInvocationAction extends EObject {
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
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getGCMInvocationAction_Base_InvocationAction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InvocationAction getBase_InvocationAction();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.GCM.GCMInvocationAction#getBase_InvocationAction <em>Base Invocation Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Invocation Action</em>' reference.
	 * @see #getBase_InvocationAction()
	 * @generated
	 */
	void setBase_InvocationAction(InvocationAction value);

	/**
	 * Returns the value of the '<em><b>On Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Feature</em>' reference.
	 * @see #setOnFeature(Feature)
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getGCMInvocationAction_OnFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Feature getOnFeature();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.GCM.GCMInvocationAction#getOnFeature <em>On Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Feature</em>' reference.
	 * @see #getOnFeature()
	 * @generated
	 */
	void setOnFeature(Feature value);

} // GCMInvocationAction
