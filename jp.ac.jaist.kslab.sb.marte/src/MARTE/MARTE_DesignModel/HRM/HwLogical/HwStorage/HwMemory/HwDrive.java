/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Drive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwDrive#getSectorSize <em>Sector Size</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwDrive#getBuffer <em>Buffer</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwDrive()
 * @model
 * @generated
 */
public interface HwDrive extends HwMemory {
	/**
	 * Returns the value of the '<em><b>Sector Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sector Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sector Size</em>' containment reference.
	 * @see #setSectorSize(NFP_DataSize)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwDrive_SectorSize()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_DataSize getSectorSize();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwDrive#getSectorSize <em>Sector Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sector Size</em>' containment reference.
	 * @see #getSectorSize()
	 * @generated
	 */
	void setSectorSize(NFP_DataSize value);

	/**
	 * Returns the value of the '<em><b>Buffer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer</em>' containment reference.
	 * @see #setBuffer(HwRAM)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwDrive_Buffer()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	HwRAM getBuffer();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwDrive#getBuffer <em>Buffer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer</em>' containment reference.
	 * @see #getBuffer()
	 * @generated
	 */
	void setBuffer(HwRAM value);

} // HwDrive
