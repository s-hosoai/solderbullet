/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwIOPackage
 * @generated
 */
public interface HwIOFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwIOFactory eINSTANCE = MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.impl.HwIOFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hw Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw Pin</em>'.
	 * @generated
	 */
	HwPin createHwPin();

	/**
	 * Returns a new object of class '<em>Hw Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw Line</em>'.
	 * @generated
	 */
	HwLine createHwLine();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HwIOPackage getHwIOPackage();

} //HwIOFactory
