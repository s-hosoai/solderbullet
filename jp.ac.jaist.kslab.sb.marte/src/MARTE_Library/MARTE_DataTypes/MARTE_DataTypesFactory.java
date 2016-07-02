/**
 */
package MARTE_Library.MARTE_DataTypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage
 * @generated
 */
public interface MARTE_DataTypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MARTE_DataTypesFactory eINSTANCE = MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Integer Vector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Vector</em>'.
	 * @generated
	 */
	IntegerVector createIntegerVector();

	/**
	 * Returns a new object of class '<em>Integer Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Matrix</em>'.
	 * @generated
	 */
	IntegerMatrix createIntegerMatrix();

	/**
	 * Returns a new object of class '<em>Integer Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Interval</em>'.
	 * @generated
	 */
	IntegerInterval createIntegerInterval();

	/**
	 * Returns a new object of class '<em>Utility Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Utility Type</em>'.
	 * @generated
	 */
	UtilityType createUtilityType();

	/**
	 * Returns a new object of class '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array</em>'.
	 * @generated
	 */
	<T> Array<T> createArray();

	/**
	 * Returns a new object of class '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interval</em>'.
	 * @generated
	 */
	<T1, T2> Interval<T1, T2> createInterval();

	/**
	 * Returns a new object of class '<em>Realnterval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Realnterval</em>'.
	 * @generated
	 */
	Realnterval createRealnterval();

	/**
	 * Returns a new object of class '<em>NFP Frequency Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NFP Frequency Interval</em>'.
	 * @generated
	 */
	NFP_FrequencyInterval createNFP_FrequencyInterval();

	/**
	 * Returns a new object of class '<em>NFP Natural Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NFP Natural Interval</em>'.
	 * @generated
	 */
	NFP_NaturalInterval createNFP_NaturalInterval();

	/**
	 * Returns a new object of class '<em>Real Vector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Vector</em>'.
	 * @generated
	 */
	RealVector createRealVector();

	/**
	 * Returns a new object of class '<em>Real Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Matrix</em>'.
	 * @generated
	 */
	RealMatrix createRealMatrix();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MARTE_DataTypesPackage getMARTE_DataTypesPackage();

} //MARTE_DataTypesFactory
