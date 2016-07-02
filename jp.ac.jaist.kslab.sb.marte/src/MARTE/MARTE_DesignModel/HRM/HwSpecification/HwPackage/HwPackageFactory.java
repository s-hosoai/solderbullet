/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePackage
 * @generated
 */
public interface HwPackageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwPackageFactory eINSTANCE = MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.impl.HwPackageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hw Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw Package</em>'.
	 * @generated
	 */
	HwPackage createHwPackage();

	/**
	 * Returns a new object of class '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pin</em>'.
	 * @generated
	 */
	HwPackagePin createHwPackagePin();

	/**
	 * Returns a new object of class '<em>Hw Wire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw Wire</em>'.
	 * @generated
	 */
	HwWire createHwWire();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HwPackagePackage getHwPackagePackage();

} //HwPackageFactory
