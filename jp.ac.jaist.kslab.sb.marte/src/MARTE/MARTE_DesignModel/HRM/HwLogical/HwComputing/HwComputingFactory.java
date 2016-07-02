/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage
 * @generated
 */
public interface HwComputingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HwComputingFactory eINSTANCE = MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PLD Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PLD Organization</em>'.
	 * @generated
	 */
	PLD_Organization createPLD_Organization();

	/**
	 * Returns a new object of class '<em>Hw Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw Processor</em>'.
	 * @generated
	 */
	HwProcessor createHwProcessor();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	HwComputingResource createHwComputingResource();

	/**
	 * Returns a new object of class '<em>Hw ISA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw ISA</em>'.
	 * @generated
	 */
	HwISA createHwISA();

	/**
	 * Returns a new object of class '<em>Hw Branch Predictor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw Branch Predictor</em>'.
	 * @generated
	 */
	HwBranchPredictor createHwBranchPredictor();

	/**
	 * Returns a new object of class '<em>Hw ASIC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw ASIC</em>'.
	 * @generated
	 */
	HwASIC createHwASIC();

	/**
	 * Returns a new object of class '<em>Hw PLD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw PLD</em>'.
	 * @generated
	 */
	HwPLD createHwPLD();

	/**
	 * Returns a new object of class '<em>Hw MCU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw MCU</em>'.
	 * @generated
	 */
	HwMCU createHwMCU();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HwComputingPackage getHwComputingPackage();

} //HwComputingFactory
