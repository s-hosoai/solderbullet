/**
 */
package MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent;

import MARTE_Library.BasicNFP_Types.NFP_Power;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Cooling Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwCoolingSupply#getCoolingPower <em>Cooling Power</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerPackage#getHwCoolingSupply()
 * @model
 * @generated
 */
public interface HwCoolingSupply extends HwComponent {
	/**
	 * Returns the value of the '<em><b>Cooling Power</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cooling Power</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cooling Power</em>' containment reference.
	 * @see #setCoolingPower(NFP_Power)
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerPackage#getHwCoolingSupply_CoolingPower()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Power getCoolingPower();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwCoolingSupply#getCoolingPower <em>Cooling Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooling Power</em>' containment reference.
	 * @see #getCoolingPower()
	 * @generated
	 */
	void setCoolingPower(NFP_Power value);

} // HwCoolingSupply
