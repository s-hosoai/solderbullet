/**
 */
package MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent;

import MARTE_Library.BasicNFP_Types.NFP_Energy;
import MARTE_Library.BasicNFP_Types.NFP_Power;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerSupply#getSuppliedPower <em>Supplied Power</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerSupply#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerPackage#getHwPowerSupply()
 * @model
 * @generated
 */
public interface HwPowerSupply extends HwComponent {
	/**
	 * Returns the value of the '<em><b>Supplied Power</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplied Power</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplied Power</em>' containment reference.
	 * @see #setSuppliedPower(NFP_Power)
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerPackage#getHwPowerSupply_SuppliedPower()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Power getSuppliedPower();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerSupply#getSuppliedPower <em>Supplied Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplied Power</em>' containment reference.
	 * @see #getSuppliedPower()
	 * @generated
	 */
	void setSuppliedPower(NFP_Power value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' containment reference.
	 * @see #setCapacity(NFP_Energy)
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerPackage#getHwPowerSupply_Capacity()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Energy getCapacity();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerSupply#getCapacity <em>Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' containment reference.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(NFP_Energy value);

} // HwPowerSupply
