/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage
 * @generated
 */
public interface HwDeviceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwDeviceFactory eINSTANCE = MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.impl.HwDeviceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hw Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw Device</em>'.
	 * @generated
	 */
	HwDevice createHwDevice();

	/**
	 * Returns a new object of class '<em>Hw IO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw IO</em>'.
	 * @generated
	 */
	HwI_O createHwI_O();

	/**
	 * Returns a new object of class '<em>Hw Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw Support</em>'.
	 * @generated
	 */
	HwSupport createHwSupport();

	/**
	 * Returns a new object of class '<em>HW Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HW Actuator</em>'.
	 * @generated
	 */
	HWActuator createHWActuator();

	/**
	 * Returns a new object of class '<em>HW Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HW Sensor</em>'.
	 * @generated
	 */
	HWSensor createHWSensor();

	/**
	 * Returns a new object of class '<em>Hw Peripheral</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw Peripheral</em>'.
	 * @generated
	 */
	HwPeripheral createHwPeripheral();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HwDevicePackage getHwDevicePackage();

} //HwDeviceFactory
