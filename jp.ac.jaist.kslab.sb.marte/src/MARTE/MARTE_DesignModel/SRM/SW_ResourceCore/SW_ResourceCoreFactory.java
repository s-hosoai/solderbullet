/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_ResourceCore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SW_ResourceCorePackage
 * @generated
 */
public interface SW_ResourceCoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SW_ResourceCoreFactory eINSTANCE = MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.impl.SW_ResourceCoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sw Access Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sw Access Service</em>'.
	 * @generated
	 */
	SwAccessService createSwAccessService();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SW_ResourceCorePackage getSW_ResourceCorePackage();

} //SW_ResourceCoreFactory
