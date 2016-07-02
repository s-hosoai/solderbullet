/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource;

import MARTE.MARTE_Foundations.GRM.StorageResource;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Storage Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManager#getManagedMemories <em>Managed Memories</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerPackage#getHwStorageManager()
 * @model
 * @generated
 */
public interface HwStorageManager extends HwResource, StorageResource {
	/**
	 * Returns the value of the '<em><b>Managed Memories</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managed Memories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managed Memories</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerPackage#getHwStorageManager_ManagedMemories()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory" ordered="false"
	 * @generated
	 */
	EList getManagedMemories();

} // HwStorageManager
