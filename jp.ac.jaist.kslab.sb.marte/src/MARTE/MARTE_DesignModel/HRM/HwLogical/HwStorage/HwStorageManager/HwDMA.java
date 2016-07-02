/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwArbiter;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;
import MARTE_Library.BasicNFP_Types.NFP_Natural;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw DMA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwDMA#getNbChannels <em>Nb Channels</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwDMA#getTransferWidth <em>Transfer Width</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwDMA#getDrivenBy <em>Driven By</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerPackage#getHwDMA()
 * @model
 * @generated
 */
public interface HwDMA extends HwStorageManager, HwArbiter {
	/**
	 * Returns the value of the '<em><b>Nb Channels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Channels</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Channels</em>' containment reference.
	 * @see #setNbChannels(NFP_Natural)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerPackage#getHwDMA_NbChannels()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Natural getNbChannels();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwDMA#getNbChannels <em>Nb Channels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Channels</em>' containment reference.
	 * @see #getNbChannels()
	 * @generated
	 */
	void setNbChannels(NFP_Natural value);

	/**
	 * Returns the value of the '<em><b>Transfer Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfer Width</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Width</em>' containment reference.
	 * @see #setTransferWidth(NFP_DataSize)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerPackage#getHwDMA_TransferWidth()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_DataSize getTransferWidth();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwDMA#getTransferWidth <em>Transfer Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer Width</em>' containment reference.
	 * @see #getTransferWidth()
	 * @generated
	 */
	void setTransferWidth(NFP_DataSize value);

	/**
	 * Returns the value of the '<em><b>Driven By</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driven By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driven By</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerPackage#getHwDMA_DrivenBy()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor" ordered="false"
	 * @generated
	 */
	EList getDrivenBy();

} // HwDMA
