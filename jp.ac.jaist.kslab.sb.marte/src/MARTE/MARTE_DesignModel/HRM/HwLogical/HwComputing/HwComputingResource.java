/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource;

import MARTE.MARTE_Foundations.GRM.ComputingResource;

import MARTE_Library.MARTE_DataTypes.NFP_FrequencyInterval;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingResource#getOp_Frequencies <em>Op Frequencies</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwComputingResource()
 * @model
 * @generated
 */
public interface HwComputingResource extends HwResource, ComputingResource {
	/**
	 * Returns the value of the '<em><b>Op Frequencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Frequencies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Frequencies</em>' containment reference.
	 * @see #setOp_Frequencies(NFP_FrequencyInterval)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwComputingResource_Op_Frequencies()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_FrequencyInterval getOp_Frequencies();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingResource#getOp_Frequencies <em>Op Frequencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Frequencies</em>' containment reference.
	 * @see #getOp_Frequencies()
	 * @generated
	 */
	void setOp_Frequencies(NFP_FrequencyInterval value);

} // HwComputingResource
