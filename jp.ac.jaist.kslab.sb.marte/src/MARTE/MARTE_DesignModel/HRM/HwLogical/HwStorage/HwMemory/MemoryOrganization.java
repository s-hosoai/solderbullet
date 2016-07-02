/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;
import MARTE_Library.BasicNFP_Types.NFP_Natural;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.MemoryOrganization#getNbRows <em>Nb Rows</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.MemoryOrganization#getNbColumns <em>Nb Columns</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.MemoryOrganization#getNbBanks <em>Nb Banks</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.MemoryOrganization#getWordSize <em>Word Size</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getMemoryOrganization()
 * @model
 * @generated
 */
public interface MemoryOrganization extends EObject {
	/**
	 * Returns the value of the '<em><b>Nb Rows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Rows</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Rows</em>' containment reference.
	 * @see #setNbRows(NFP_Natural)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getMemoryOrganization_NbRows()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Natural getNbRows();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.MemoryOrganization#getNbRows <em>Nb Rows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Rows</em>' containment reference.
	 * @see #getNbRows()
	 * @generated
	 */
	void setNbRows(NFP_Natural value);

	/**
	 * Returns the value of the '<em><b>Nb Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Columns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Columns</em>' containment reference.
	 * @see #setNbColumns(NFP_Natural)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getMemoryOrganization_NbColumns()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Natural getNbColumns();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.MemoryOrganization#getNbColumns <em>Nb Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Columns</em>' containment reference.
	 * @see #getNbColumns()
	 * @generated
	 */
	void setNbColumns(NFP_Natural value);

	/**
	 * Returns the value of the '<em><b>Nb Banks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Banks</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Banks</em>' containment reference.
	 * @see #setNbBanks(NFP_Natural)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getMemoryOrganization_NbBanks()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Natural getNbBanks();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.MemoryOrganization#getNbBanks <em>Nb Banks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Banks</em>' containment reference.
	 * @see #getNbBanks()
	 * @generated
	 */
	void setNbBanks(NFP_Natural value);

	/**
	 * Returns the value of the '<em><b>Word Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Word Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Word Size</em>' containment reference.
	 * @see #setWordSize(NFP_DataSize)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getMemoryOrganization_WordSize()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_DataSize getWordSize();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.MemoryOrganization#getWordSize <em>Word Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Word Size</em>' containment reference.
	 * @see #getWordSize()
	 * @generated
	 */
	void setWordSize(NFP_DataSize value);

} // MemoryOrganization
