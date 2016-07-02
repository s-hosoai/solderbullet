/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory;

import MARTE_Library.BasicNFP_Types.NFP_Natural;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Cache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache#getLevel <em>Level</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache#getType <em>Type</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache#getStructure <em>Structure</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache#getRepl_Policy <em>Repl Policy</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache#getWritePolicy <em>Write Policy</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwCache()
 * @model
 * @generated
 */
public interface HwCache extends HwMemory {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' containment reference.
	 * @see #setLevel(NFP_Natural)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwCache_Level()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Natural getLevel();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache#getLevel <em>Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' containment reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(NFP_Natural value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheType
	 * @see #setType(CacheType)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwCache_Type()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	CacheType getType();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheType
	 * @see #getType()
	 * @generated
	 */
	void setType(CacheType value);

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(CacheStructure)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwCache_Structure()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	CacheStructure getStructure();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(CacheStructure value);

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
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwCache_Repl_Policy()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	Repl_Policy getRepl_Policy();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache#getRepl_Policy <em>Repl Policy</em>}' attribute.
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
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwCache_WritePolicy()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	WritePolicy getWritePolicy();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache#getWritePolicy <em>Write Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Policy</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.WritePolicy
	 * @see #getWritePolicy()
	 * @generated
	 */
	void setWritePolicy(WritePolicy value);

} // HwCache
