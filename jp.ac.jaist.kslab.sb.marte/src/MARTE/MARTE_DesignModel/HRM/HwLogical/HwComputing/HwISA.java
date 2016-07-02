/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;
import MARTE_Library.BasicNFP_Types.NFP_String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw ISA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA#getFamily <em>Family</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA#getInst_Width <em>Inst Width</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwISA()
 * @model
 * @generated
 */
public interface HwISA extends HwResource {
	/**
	 * Returns the value of the '<em><b>Family</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' containment reference.
	 * @see #setFamily(NFP_String)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwISA_Family()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_String getFamily();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA#getFamily <em>Family</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' containment reference.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(NFP_String value);

	/**
	 * Returns the value of the '<em><b>Inst Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inst Width</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inst Width</em>' containment reference.
	 * @see #setInst_Width(NFP_DataSize)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwISA_Inst_Width()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_DataSize getInst_Width();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA#getInst_Width <em>Inst Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inst Width</em>' containment reference.
	 * @see #getInst_Width()
	 * @generated
	 */
	void setInst_Width(NFP_DataSize value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.ISA_Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.ISA_Type
	 * @see #setType(ISA_Type)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwISA_Type()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	ISA_Type getType();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.ISA_Type
	 * @see #getType()
	 * @generated
	 */
	void setType(ISA_Type value);

} // HwISA
