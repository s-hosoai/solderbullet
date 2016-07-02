/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory;

import MARTE_Library.BasicNFP_Types.NFP_Boolean;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw RAM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getOrganization <em>Organization</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getIsSynchronous <em>Is Synchronous</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getIsStatic <em>Is Static</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getIsNonVolatile <em>Is Non Volatile</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getRepl_Policy <em>Repl Policy</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getWritePolicy <em>Write Policy</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwRAM()
 * @model
 * @generated
 */
public interface HwRAM extends HwMemory {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(MemoryOrganization)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwRAM_Organization()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	MemoryOrganization getOrganization();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(MemoryOrganization value);

	/**
	 * Returns the value of the '<em><b>Is Synchronous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Synchronous</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Synchronous</em>' containment reference.
	 * @see #setIsSynchronous(NFP_Boolean)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwRAM_IsSynchronous()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Boolean getIsSynchronous();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getIsSynchronous <em>Is Synchronous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Synchronous</em>' containment reference.
	 * @see #getIsSynchronous()
	 * @generated
	 */
	void setIsSynchronous(NFP_Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' containment reference.
	 * @see #setIsStatic(NFP_Boolean)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwRAM_IsStatic()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Boolean getIsStatic();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getIsStatic <em>Is Static</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' containment reference.
	 * @see #getIsStatic()
	 * @generated
	 */
	void setIsStatic(NFP_Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Non Volatile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Non Volatile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Non Volatile</em>' containment reference.
	 * @see #setIsNonVolatile(NFP_Boolean)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwRAM_IsNonVolatile()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Boolean getIsNonVolatile();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getIsNonVolatile <em>Is Non Volatile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Non Volatile</em>' containment reference.
	 * @see #getIsNonVolatile()
	 * @generated
	 */
	void setIsNonVolatile(NFP_Boolean value);

	/**
	 * Returns the value of the '<em><b>Repl Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Repl_Policy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repl Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repl Policy</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Repl_Policy
	 * @see #setRepl_Policy(Repl_Policy)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwRAM_Repl_Policy()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	Repl_Policy getRepl_Policy();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getRepl_Policy <em>Repl Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repl Policy</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Repl_Policy
	 * @see #getRepl_Policy()
	 * @generated
	 */
	void setRepl_Policy(Repl_Policy value);

	/**
	 * Returns the value of the '<em><b>Write Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.WritePolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Policy</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.WritePolicy
	 * @see #setWritePolicy(WritePolicy)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwRAM_WritePolicy()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	WritePolicy getWritePolicy();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM#getWritePolicy <em>Write Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Policy</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.WritePolicy
	 * @see #getWritePolicy()
	 * @generated
	 */
	void setWritePolicy(WritePolicy value);

} // HwRAM
