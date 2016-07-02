/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing;

import MARTE_Library.BasicNFP_Types.NFP_Natural;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw PLD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getTechnology <em>Technology</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getOrganization <em>Organization</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getNbLUTs <em>Nb LU Ts</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getNdLUT_Inputs <em>Nd LUT Inputs</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getNbFlipFlops <em>Nb Flip Flops</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getBlocksRAM <em>Blocks RAM</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getBlocksComputing <em>Blocks Computing</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwPLD()
 * @model
 * @generated
 */
public interface HwPLD extends HwComputingResource {
	/**
	 * Returns the value of the '<em><b>Technology</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Technology}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Technology
	 * @see #setTechnology(PLD_Technology)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwPLD_Technology()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	PLD_Technology getTechnology();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getTechnology <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Technology
	 * @see #getTechnology()
	 * @generated
	 */
	void setTechnology(PLD_Technology value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(PLD_Organization)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwPLD_Organization()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PLD_Organization getOrganization();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(PLD_Organization value);

	/**
	 * Returns the value of the '<em><b>Nb LU Ts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb LU Ts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb LU Ts</em>' containment reference.
	 * @see #setNbLUTs(NFP_Natural)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwPLD_NbLUTs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Natural getNbLUTs();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getNbLUTs <em>Nb LU Ts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb LU Ts</em>' containment reference.
	 * @see #getNbLUTs()
	 * @generated
	 */
	void setNbLUTs(NFP_Natural value);

	/**
	 * Returns the value of the '<em><b>Nd LUT Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nd LUT Inputs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nd LUT Inputs</em>' containment reference.
	 * @see #setNdLUT_Inputs(NFP_Natural)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwPLD_NdLUT_Inputs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Natural getNdLUT_Inputs();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getNdLUT_Inputs <em>Nd LUT Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nd LUT Inputs</em>' containment reference.
	 * @see #getNdLUT_Inputs()
	 * @generated
	 */
	void setNdLUT_Inputs(NFP_Natural value);

	/**
	 * Returns the value of the '<em><b>Nb Flip Flops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Flip Flops</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Flip Flops</em>' containment reference.
	 * @see #setNbFlipFlops(NFP_Natural)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwPLD_NbFlipFlops()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Natural getNbFlipFlops();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD#getNbFlipFlops <em>Nb Flip Flops</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Flip Flops</em>' containment reference.
	 * @see #getNbFlipFlops()
	 * @generated
	 */
	void setNbFlipFlops(NFP_Natural value);

	/**
	 * Returns the value of the '<em><b>Blocks RAM</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks RAM</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks RAM</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwPLD_BlocksRAM()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM" containment="true" ordered="false"
	 * @generated
	 */
	EList getBlocksRAM();

	/**
	 * Returns the value of the '<em><b>Blocks Computing</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks Computing</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks Computing</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwPLD_BlocksComputing()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingResource" containment="true" ordered="false"
	 * @generated
	 */
	EList getBlocksComputing();

} // HwPLD
