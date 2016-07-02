/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerPackage
 * @generated
 */
public interface HwStorageManagerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwStorageManagerFactory eINSTANCE = MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.impl.HwStorageManagerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hw Storage Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw Storage Manager</em>'.
	 * @generated
	 */
	HwStorageManager createHwStorageManager();

	/**
	 * Returns a new object of class '<em>Hw DMA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw DMA</em>'.
	 * @generated
	 */
	HwDMA createHwDMA();

	/**
	 * Returns a new object of class '<em>Hw MMU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw MMU</em>'.
	 * @generated
	 */
	HwMMU createHwMMU();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HwStorageManagerPackage getHwStorageManagerPackage();

} //HwStorageManagerFactory
