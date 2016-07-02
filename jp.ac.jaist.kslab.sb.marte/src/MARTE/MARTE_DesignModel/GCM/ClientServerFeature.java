/**
 */
package MARTE.MARTE_DesignModel.GCM;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.BehavioralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client Server Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.ClientServerFeature#getKind <em>Kind</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.ClientServerFeature#getBase_BehavioralFeature <em>Base Behavioral Feature</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getClientServerFeature()
 * @model
 * @generated
 */
public interface ClientServerFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"proreq"</code>.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.GCM.ClientServerKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.GCM.ClientServerKind
	 * @see #setKind(ClientServerKind)
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getClientServerFeature_Kind()
	 * @model default="proreq" unique="false" required="true" ordered="false"
	 * @generated
	 */
	ClientServerKind getKind();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.GCM.ClientServerFeature#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.GCM.ClientServerKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ClientServerKind value);

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
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getClientServerFeature_Base_BehavioralFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BehavioralFeature getBase_BehavioralFeature();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.GCM.ClientServerFeature#getBase_BehavioralFeature <em>Base Behavioral Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Behavioral Feature</em>' reference.
	 * @see #getBase_BehavioralFeature()
	 * @generated
	 */
	void setBase_BehavioralFeature(BehavioralFeature value);

} // ClientServerFeature
