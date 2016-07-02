/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager;

import MARTE_Library.BasicNFP_Types.NFP_Boolean;
import MARTE_Library.BasicNFP_Types.NFP_DataSize;
import MARTE_Library.BasicNFP_Types.NFP_Natural;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw MMU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwMMU#getVirtualAddrSpace <em>Virtual Addr Space</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwMMU#getPhysicalAddrSpace <em>Physical Addr Space</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwMMU#getMemoryProtection <em>Memory Protection</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwMMU#getNbEntries <em>Nb Entries</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwMMU#getOwnedTLBs <em>Owned TL Bs</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerPackage#getHwMMU()
 * @model
 * @generated
 */
public interface HwMMU extends HwStorageManager {
	/**
	 * Returns the value of the '<em><b>Virtual Addr Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Addr Space</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Addr Space</em>' containment reference.
	 * @see #setVirtualAddrSpace(NFP_DataSize)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerPackage#getHwMMU_VirtualAddrSpace()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_DataSize getVirtualAddrSpace();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwMMU#getVirtualAddrSpace <em>Virtual Addr Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Addr Space</em>' containment reference.
	 * @see #getVirtualAddrSpace()
	 * @generated
	 */
	void setVirtualAddrSpace(NFP_DataSize value);

	/**
	 * Returns the value of the '<em><b>Physical Addr Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Addr Space</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Addr Space</em>' containment reference.
	 * @see #setPhysicalAddrSpace(NFP_DataSize)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerPackage#getHwMMU_PhysicalAddrSpace()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_DataSize getPhysicalAddrSpace();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwMMU#getPhysicalAddrSpace <em>Physical Addr Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Addr Space</em>' containment reference.
	 * @see #getPhysicalAddrSpace()
	 * @generated
	 */
	void setPhysicalAddrSpace(NFP_DataSize value);

	/**
	 * Returns the value of the '<em><b>Memory Protection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Protection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Protection</em>' containment reference.
	 * @see #setMemoryProtection(NFP_Boolean)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerPackage#getHwMMU_MemoryProtection()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Boolean getMemoryProtection();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwMMU#getMemoryProtection <em>Memory Protection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Protection</em>' containment reference.
	 * @see #getMemoryProtection()
	 * @generated
	 */
	void setMemoryProtection(NFP_Boolean value);

	/**
	 * Returns the value of the '<em><b>Nb Entries</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Entries</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Entries</em>' reference.
	 * @see #setNbEntries(NFP_Natural)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerPackage#getHwMMU_NbEntries()
	 * @model volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	NFP_Natural getNbEntries();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwMMU#getNbEntries <em>Nb Entries</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Entries</em>' reference.
	 * @see #getNbEntries()
	 * @generated
	 */
	void setNbEntries(NFP_Natural value);

	/**
	 * Returns the value of the '<em><b>Owned TL Bs</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned TL Bs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned TL Bs</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerPackage#getHwMMU_OwnedTLBs()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache" containment="true" ordered="false"
	 * @generated
	 */
	EList getOwnedTLBs();

} // HwMMU
