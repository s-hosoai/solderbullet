/**
 */
package MARTE.MARTE_DesignModel.GCM;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.FlowPort#getIsAtomic <em>Is Atomic</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.FlowPort#getIsConjugated <em>Is Conjugated</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.FlowPort#getDirection <em>Direction</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.FlowPort#getBase_Port <em>Base Port</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getFlowPort()
 * @model
 * @generated
 */
public interface FlowPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Atomic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Atomic</em>' attribute.
	 * @see #setIsAtomic(Boolean)
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getFlowPort_IsAtomic()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Boolean" required="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Boolean getIsAtomic();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.GCM.FlowPort#getIsAtomic <em>Is Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Atomic</em>' attribute.
	 * @see #getIsAtomic()
	 * @generated
	 */
	void setIsAtomic(Boolean value);

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
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getFlowPort_IsConjugated()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getIsConjugated();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.GCM.FlowPort#getIsConjugated <em>Is Conjugated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Conjugated</em>' attribute.
	 * @see #getIsConjugated()
	 * @generated
	 */
	void setIsConjugated(Boolean value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"inout"</code>.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.GCM.FlowDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.GCM.FlowDirectionKind
	 * @see #setDirection(FlowDirectionKind)
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getFlowPort_Direction()
	 * @model default="inout" unique="false" required="true" ordered="false"
	 * @generated
	 */
	FlowDirectionKind getDirection();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.GCM.FlowPort#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.GCM.FlowDirectionKind
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(FlowDirectionKind value);

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
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getFlowPort_Base_Port()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Port getBase_Port();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.GCM.FlowPort#getBase_Port <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Port</em>' reference.
	 * @see #getBase_Port()
	 * @generated
	 */
	void setBase_Port(Port value);

} // FlowPort
