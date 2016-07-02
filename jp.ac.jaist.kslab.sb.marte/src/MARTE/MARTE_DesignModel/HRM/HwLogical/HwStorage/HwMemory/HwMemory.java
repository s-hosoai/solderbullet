/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource;

import MARTE.MARTE_Foundations.GRM.StorageResource;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;
import MARTE_Library.BasicNFP_Types.NFP_DataTxRate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory#getMemorySize <em>Memory Size</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory#getAdressSize <em>Adress Size</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory#getTimings <em>Timings</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory#getThroughput <em>Throughput</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwMemory()
 * @model
 * @generated
 */
public interface HwMemory extends HwResource, StorageResource {
	/**
	 * Returns the value of the '<em><b>Memory Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Size</em>' containment reference.
	 * @see #setMemorySize(NFP_DataSize)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwMemory_MemorySize()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_DataSize getMemorySize();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory#getMemorySize <em>Memory Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Size</em>' containment reference.
	 * @see #getMemorySize()
	 * @generated
	 */
	void setMemorySize(NFP_DataSize value);

	/**
	 * Returns the value of the '<em><b>Adress Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adress Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adress Size</em>' containment reference.
	 * @see #setAdressSize(NFP_DataSize)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwMemory_AdressSize()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_DataSize getAdressSize();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory#getAdressSize <em>Adress Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adress Size</em>' containment reference.
	 * @see #getAdressSize()
	 * @generated
	 */
	void setAdressSize(NFP_DataSize value);

	/**
	 * Returns the value of the '<em><b>Timings</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Timing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timings</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwMemory_Timings()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Timing" containment="true" ordered="false"
	 * @generated
	 */
	EList getTimings();

	/**
	 * Returns the value of the '<em><b>Throughput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throughput</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput</em>' containment reference.
	 * @see #setThroughput(NFP_DataTxRate)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwMemory_Throughput()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_DataTxRate getThroughput();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory#getThroughput <em>Throughput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput</em>' containment reference.
	 * @see #getThroughput()
	 * @generated
	 */
	void setThroughput(NFP_DataTxRate value);

} // HwMemory
