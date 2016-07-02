/**
 */
package MARTE.MARTE_Foundations.Alloc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_Foundations.Alloc.AllocPackage
 * @generated
 */
public interface AllocFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AllocFactory eINSTANCE = MARTE.MARTE_Foundations.Alloc.impl.AllocFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Allocated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocated</em>'.
	 * @generated
	 */
	Allocated createAllocated();

	/**
	 * Returns a new object of class '<em>Allocate Activity Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocate Activity Group</em>'.
	 * @generated
	 */
	AllocateActivityGroup createAllocateActivityGroup();

	/**
	 * Returns a new object of class '<em>Nfp Refine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nfp Refine</em>'.
	 * @generated
	 */
	NfpRefine createNfpRefine();

	/**
	 * Returns a new object of class '<em>Assign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assign</em>'.
	 * @generated
	 */
	Assign createAssign();

	/**
	 * Returns a new object of class '<em>Allocate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocate</em>'.
	 * @generated
	 */
	Allocate createAllocate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AllocPackage getAllocPackage();

} //AllocFactory
