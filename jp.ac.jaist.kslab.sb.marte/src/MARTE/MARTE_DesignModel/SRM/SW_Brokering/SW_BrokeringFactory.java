/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Brokering;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.SRM.SW_Brokering.SW_BrokeringPackage
 * @generated
 */
public interface SW_BrokeringFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SW_BrokeringFactory eINSTANCE = MARTE.MARTE_DesignModel.SRM.SW_Brokering.impl.SW_BrokeringFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Device Broker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Broker</em>'.
	 * @generated
	 */
	DeviceBroker createDeviceBroker();

	/**
	 * Returns a new object of class '<em>Memory Broker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Broker</em>'.
	 * @generated
	 */
	MemoryBroker createMemoryBroker();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SW_BrokeringPackage getSW_BrokeringPackage();

} //SW_BrokeringFactory
