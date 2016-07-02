/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegisterPackage
 * @generated
 */
public interface HwRegisterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwRegisterFactory eINSTANCE = MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.impl.HwRegisterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hw Register</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw Register</em>'.
	 * @generated
	 */
	HwRegister createHwRegister();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HwRegisterPackage getHwRegisterPackage();

} //HwRegisterFactory
