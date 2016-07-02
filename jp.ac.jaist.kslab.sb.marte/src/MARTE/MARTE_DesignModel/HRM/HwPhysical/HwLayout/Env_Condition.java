/**
 */
package MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout;

import MARTE_Library.BasicNFP_Types.NFP_String;

import MARTE_Library.MARTE_DataTypes.Realnterval;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Env Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition#getType <em>Type</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition#getStatus <em>Status</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition#getDescription <em>Description</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage#getEnv_Condition()
 * @model
 * @generated
 */
public interface Env_Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ConditionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ConditionType
	 * @see #setType(ConditionType)
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage#getEnv_Condition_Type()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	ConditionType getType();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ConditionType
	 * @see #getType()
	 * @generated
	 */
	void setType(ConditionType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentState
	 * @see #setStatus(ComponentState)
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage#getEnv_Condition_Status()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	ComponentState getStatus();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentState
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ComponentState value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(NFP_String)
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage#getEnv_Condition_Description()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_String getDescription();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(NFP_String value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(Realnterval)
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage#getEnv_Condition_Range()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Realnterval getRange();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Realnterval value);

} // Env_Condition
