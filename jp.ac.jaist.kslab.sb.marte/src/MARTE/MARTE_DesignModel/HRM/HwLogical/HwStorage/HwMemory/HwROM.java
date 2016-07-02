/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw ROM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwROM#getType <em>Type</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwROM#getOrganization <em>Organization</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwROM()
 * @model
 * @generated
 */
public interface HwROM extends HwMemory {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.ROM_Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.ROM_Type
	 * @see #setType(ROM_Type)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwROM_Type()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	ROM_Type getType();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwROM#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.ROM_Type
	 * @see #getType()
	 * @generated
	 */
	void setType(ROM_Type value);

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
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getHwROM_Organization()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	MemoryOrganization getOrganization();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwROM#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(MemoryOrganization value);

} // HwROM
