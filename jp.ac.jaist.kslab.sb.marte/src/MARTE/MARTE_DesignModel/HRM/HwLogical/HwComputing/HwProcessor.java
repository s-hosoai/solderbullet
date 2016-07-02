/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;
import MARTE_Library.BasicNFP_Types.NFP_Natural;
import MARTE_Library.BasicNFP_Types.NFP_Real;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getMips <em>Mips</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getIpc <em>Ipc</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getNbCores <em>Nb Cores</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getNbPipelines <em>Nb Pipelines</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getNbStages <em>Nb Stages</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getNbALUs <em>Nb AL Us</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getNbFPUs <em>Nb FP Us</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getOwnedISAs <em>Owned IS As</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getPredictors <em>Predictors</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getCaches <em>Caches</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getOwnedMMUs <em>Owned MM Us</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwProcessor()
 * @model
 * @generated
 */
public interface HwProcessor extends HwComputingResource {
	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' reference.
	 * @see #setArchitecture(NFP_DataSize)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwProcessor_Architecture()
	 * @model volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	NFP_DataSize getArchitecture();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getArchitecture <em>Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' reference.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(NFP_DataSize value);

	/**
	 * Returns the value of the '<em><b>Mips</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mips</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mips</em>' containment reference.
	 * @see #setMips(NFP_Natural)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwProcessor_Mips()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Natural getMips();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getMips <em>Mips</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mips</em>' containment reference.
	 * @see #getMips()
	 * @generated
	 */
	void setMips(NFP_Natural value);

	/**
	 * Returns the value of the '<em><b>Ipc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ipc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ipc</em>' reference.
	 * @see #setIpc(NFP_Real)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwProcessor_Ipc()
	 * @model volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	NFP_Real getIpc();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getIpc <em>Ipc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ipc</em>' reference.
	 * @see #getIpc()
	 * @generated
	 */
	void setIpc(NFP_Real value);

	/**
	 * Returns the value of the '<em><b>Nb Cores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Cores</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Cores</em>' containment reference.
	 * @see #setNbCores(NFP_Natural)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwProcessor_NbCores()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Natural getNbCores();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getNbCores <em>Nb Cores</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Cores</em>' containment reference.
	 * @see #getNbCores()
	 * @generated
	 */
	void setNbCores(NFP_Natural value);

	/**
	 * Returns the value of the '<em><b>Nb Pipelines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Pipelines</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Pipelines</em>' containment reference.
	 * @see #setNbPipelines(NFP_Natural)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwProcessor_NbPipelines()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Natural getNbPipelines();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getNbPipelines <em>Nb Pipelines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Pipelines</em>' containment reference.
	 * @see #getNbPipelines()
	 * @generated
	 */
	void setNbPipelines(NFP_Natural value);

	/**
	 * Returns the value of the '<em><b>Nb Stages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Stages</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Stages</em>' containment reference.
	 * @see #setNbStages(NFP_Natural)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwProcessor_NbStages()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Natural getNbStages();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getNbStages <em>Nb Stages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Stages</em>' containment reference.
	 * @see #getNbStages()
	 * @generated
	 */
	void setNbStages(NFP_Natural value);

	/**
	 * Returns the value of the '<em><b>Nb AL Us</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb AL Us</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb AL Us</em>' containment reference.
	 * @see #setNbALUs(NFP_Natural)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwProcessor_NbALUs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Natural getNbALUs();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getNbALUs <em>Nb AL Us</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb AL Us</em>' containment reference.
	 * @see #getNbALUs()
	 * @generated
	 */
	void setNbALUs(NFP_Natural value);

	/**
	 * Returns the value of the '<em><b>Nb FP Us</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb FP Us</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb FP Us</em>' containment reference.
	 * @see #setNbFPUs(NFP_Natural)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwProcessor_NbFPUs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Natural getNbFPUs();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor#getNbFPUs <em>Nb FP Us</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb FP Us</em>' containment reference.
	 * @see #getNbFPUs()
	 * @generated
	 */
	void setNbFPUs(NFP_Natural value);

	/**
	 * Returns the value of the '<em><b>Owned IS As</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned IS As</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned IS As</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwProcessor_OwnedISAs()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA" containment="true" ordered="false"
	 * @generated
	 */
	EList getOwnedISAs();

	/**
	 * Returns the value of the '<em><b>Predictors</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwBranchPredictor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predictors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predictors</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwProcessor_Predictors()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwBranchPredictor" containment="true" ordered="false"
	 * @generated
	 */
	EList getPredictors();

	/**
	 * Returns the value of the '<em><b>Caches</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caches</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwProcessor_Caches()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache" containment="true" ordered="false"
	 * @generated
	 */
	EList getCaches();

	/**
	 * Returns the value of the '<em><b>Owned MM Us</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwMMU}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned MM Us</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned MM Us</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwProcessor_OwnedMMUs()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwMMU" containment="true" ordered="false"
	 * @generated
	 */
	EList getOwnedMMUs();

} // HwProcessor
