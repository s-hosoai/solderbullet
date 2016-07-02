/**
 */
package MARTE.MARTE_DesignModel.HRM.HwProtocol;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocolPackage
 * @generated
 */
public interface HwProtocolFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwProtocolFactory eINSTANCE = MARTE.MARTE_DesignModel.HRM.HwProtocol.impl.HwProtocolFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hw Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw Protocol</em>'.
	 * @generated
	 */
	HwProtocol createHwProtocol();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HwProtocolPackage getHwProtocolPackage();

} //HwProtocolFactory
