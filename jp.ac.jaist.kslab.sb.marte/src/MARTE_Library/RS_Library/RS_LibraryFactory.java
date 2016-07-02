/**
 */
package MARTE_Library.RS_Library;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MARTE_Library.RS_Library.RS_LibraryPackage
 * @generated
 */
public interface RS_LibraryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RS_LibraryFactory eINSTANCE = MARTE_Library.RS_Library.impl.RS_LibraryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tiler Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tiler Specification</em>'.
	 * @generated
	 */
	TilerSpecification createTilerSpecification();

	/**
	 * Returns a new object of class '<em>Shape Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shape Specification</em>'.
	 * @generated
	 */
	ShapeSpecification createShapeSpecification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RS_LibraryPackage getRS_LibraryPackage();

} //RS_LibraryFactory
