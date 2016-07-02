/**
 */
package MARTE_Library.TimeLibrary;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MARTE_Library.TimeLibrary.TimeLibraryPackage
 * @generated
 */
public interface TimeLibraryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimeLibraryFactory eINSTANCE = MARTE_Library.TimeLibrary.impl.TimeLibraryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Timed Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Value Type</em>'.
	 * @generated
	 */
	TimedValueType createTimedValueType();

	/**
	 * Returns a new object of class '<em>Ideal Clock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ideal Clock</em>'.
	 * @generated
	 */
	IdealClock createIdealClock();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TimeLibraryPackage getTimeLibraryPackage();

} //TimeLibraryFactory
