/**
 */
package MARTE.MARTE_DesignModel.GCM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client Server Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.ClientServerPort#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.ClientServerPort#getSpecificationKind <em>Specification Kind</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.ClientServerPort#getIsConjugated <em>Is Conjugated</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.ClientServerPort#getProvInterface <em>Prov Interface</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.ClientServerPort#getReqInterface <em>Req Interface</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.ClientServerPort#getFeaturesSpec <em>Features Spec</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.ClientServerPort#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getClientServerPort()
 * @model
 * @generated
 */
public interface ClientServerPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Port</em>' reference.
	 * @see #setBase_Port(Port)
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getClientServerPort_Base_Port()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Port getBase_Port();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.GCM.ClientServerPort#getBase_Port <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Port</em>' reference.
	 * @see #getBase_Port()
	 * @generated
	 */
	void setBase_Port(Port value);

	/**
	 * Returns the value of the '<em><b>Specification Kind</b></em>' attribute.
	 * The default value is <code>"interfaceBased"</code>.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.GCM.PortSpecificationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Kind</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.GCM.PortSpecificationKind
	 * @see #setSpecificationKind(PortSpecificationKind)
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getClientServerPort_SpecificationKind()
	 * @model default="interfaceBased" unique="false" required="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	PortSpecificationKind getSpecificationKind();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.GCM.ClientServerPort#getSpecificationKind <em>Specification Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Kind</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.GCM.PortSpecificationKind
	 * @see #getSpecificationKind()
	 * @generated
	 */
	void setSpecificationKind(PortSpecificationKind value);

	/**
	 * Returns the value of the '<em><b>Is Conjugated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Conjugated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Conjugated</em>' attribute.
	 * @see #setIsConjugated(Boolean)
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getClientServerPort_IsConjugated()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getIsConjugated();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.GCM.ClientServerPort#getIsConjugated <em>Is Conjugated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Conjugated</em>' attribute.
	 * @see #getIsConjugated()
	 * @generated
	 */
	void setIsConjugated(Boolean value);

	/**
	 * Returns the value of the '<em><b>Prov Interface</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prov Interface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prov Interface</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getClientServerPort_ProvInterface()
	 * @model type="org.eclipse.uml2.uml.Interface" ordered="false"
	 * @generated
	 */
	EList getProvInterface();

	/**
	 * Returns the value of the '<em><b>Req Interface</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Interface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Interface</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getClientServerPort_ReqInterface()
	 * @model type="org.eclipse.uml2.uml.Interface" ordered="false"
	 * @generated
	 */
	EList getReqInterface();

	/**
	 * Returns the value of the '<em><b>Features Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features Spec</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features Spec</em>' reference.
	 * @see #setFeaturesSpec(ClientServerSpecification)
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getClientServerPort_FeaturesSpec()
	 * @model ordered="false"
	 * @generated
	 */
	ClientServerSpecification getFeaturesSpec();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.GCM.ClientServerPort#getFeaturesSpec <em>Features Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Features Spec</em>' reference.
	 * @see #getFeaturesSpec()
	 * @generated
	 */
	void setFeaturesSpec(ClientServerSpecification value);

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
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getClientServerPort_Kind()
	 * @model default="proreq" unique="false" required="true" ordered="false"
	 * @generated
	 */
	ClientServerKind getKind();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.GCM.ClientServerPort#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.GCM.ClientServerKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ClientServerKind value);

} // ClientServerPort
