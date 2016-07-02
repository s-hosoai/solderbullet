/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.HwPeripheralPackage
 * @generated
 */
public interface HwPeripheralFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwPeripheralFactory eINSTANCE = MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.impl.HwPeripheralFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Operation Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Impl</em>'.
	 * @generated
	 */
	OperationImpl createOperationImpl();

	/**
	 * Returns a new object of class '<em>Write Register Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Write Register Action</em>'.
	 * @generated
	 */
	WriteRegisterAction createWriteRegisterAction();

	/**
	 * Returns a new object of class '<em>Read Register Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Register Action</em>'.
	 * @generated
	 */
	ReadRegisterAction createReadRegisterAction();

	/**
	 * Returns a new object of class '<em>Peripheral Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Peripheral Activity</em>'.
	 * @generated
	 */
	PeripheralActivity createPeripheralActivity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HwPeripheralPackage getHwPeripheralPackage();

} //HwPeripheralFactory
