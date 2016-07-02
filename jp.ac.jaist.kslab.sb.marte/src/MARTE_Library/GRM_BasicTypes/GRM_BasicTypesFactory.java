/**
 */
package MARTE_Library.GRM_BasicTypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage
 * @generated
 */
public interface GRM_BasicTypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GRM_BasicTypesFactory eINSTANCE = MARTE_Library.GRM_BasicTypes.impl.GRM_BasicTypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EDF Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDF Parameters</em>'.
	 * @generated
	 */
	EDF_Parameters createEDF_Parameters();

	/**
	 * Returns a new object of class '<em>Sched Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sched Parameters</em>'.
	 * @generated
	 */
	SchedParameters createSchedParameters();

	/**
	 * Returns a new object of class '<em>Fixed Priority Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Priority Parameters</em>'.
	 * @generated
	 */
	FixedPriorityParameters createFixedPriorityParameters();

	/**
	 * Returns a new object of class '<em>Pooling Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pooling Parameters</em>'.
	 * @generated
	 */
	PoolingParameters createPoolingParameters();

	/**
	 * Returns a new object of class '<em>Periodic Server Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic Server Parameters</em>'.
	 * @generated
	 */
	PeriodicServerParameters createPeriodicServerParameters();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GRM_BasicTypesPackage getGRM_BasicTypesPackage();

} //GRM_BasicTypesFactory
