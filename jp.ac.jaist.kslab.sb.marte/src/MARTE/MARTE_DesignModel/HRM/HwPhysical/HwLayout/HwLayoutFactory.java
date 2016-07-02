/**
 */
package MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage
 * @generated
 */
public interface HwLayoutFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwLayoutFactory eINSTANCE = MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.HwLayoutFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hw Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw Component</em>'.
	 * @generated
	 */
	HwComponent createHwComponent();

	/**
	 * Returns a new object of class '<em>Env Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Env Condition</em>'.
	 * @generated
	 */
	Env_Condition createEnv_Condition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HwLayoutPackage getHwLayoutPackage();

} //HwLayoutFactory
