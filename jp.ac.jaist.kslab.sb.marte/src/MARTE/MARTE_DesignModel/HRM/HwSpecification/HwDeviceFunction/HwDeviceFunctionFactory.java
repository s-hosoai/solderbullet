/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDeviceFunction;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDeviceFunction.HwDeviceFunctionPackage
 * @generated
 */
public interface HwDeviceFunctionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwDeviceFunctionFactory eINSTANCE = MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDeviceFunction.impl.HwDeviceFunctionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hw Device Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw Device Function</em>'.
	 * @generated
	 */
	HwDeviceFunction createHwDeviceFunction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HwDeviceFunctionPackage getHwDeviceFunctionPackage();

} //HwDeviceFunctionFactory
