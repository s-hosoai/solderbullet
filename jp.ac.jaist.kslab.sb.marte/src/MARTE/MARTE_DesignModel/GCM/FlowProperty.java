/**
 */
package MARTE.MARTE_DesignModel.GCM;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.FlowProperty#getDirection <em>Direction</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.FlowProperty#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getFlowProperty()
 * @model
 * @generated
 */
public interface FlowProperty extends EObject {
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
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getFlowProperty_Direction()
	 * @model default="inout" unique="false" required="true" ordered="false"
	 * @generated
	 */
	FlowDirectionKind getDirection();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.GCM.FlowProperty#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.GCM.FlowDirectionKind
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(FlowDirectionKind value);

	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getFlowProperty_Base_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.GCM.FlowProperty#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

} // FlowProperty
