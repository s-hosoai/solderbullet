/**
 */
package MARTE.MARTE_DesignModel.GCM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage
 * @generated
 */
public interface GCMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GCMFactory eINSTANCE = MARTE.MARTE_DesignModel.GCM.impl.GCMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Flow Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Property</em>'.
	 * @generated
	 */
	FlowProperty createFlowProperty();

	/**
	 * Returns a new object of class '<em>Flow Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Port</em>'.
	 * @generated
	 */
	FlowPort createFlowPort();

	/**
	 * Returns a new object of class '<em>Client Server Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client Server Port</em>'.
	 * @generated
	 */
	ClientServerPort createClientServerPort();

	/**
	 * Returns a new object of class '<em>Client Server Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client Server Specification</em>'.
	 * @generated
	 */
	ClientServerSpecification createClientServerSpecification();

	/**
	 * Returns a new object of class '<em>Flow Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Specification</em>'.
	 * @generated
	 */
	FlowSpecification createFlowSpecification();

	/**
	 * Returns a new object of class '<em>Client Server Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client Server Feature</em>'.
	 * @generated
	 */
	ClientServerFeature createClientServerFeature();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	GCMTrigger createGCMTrigger();

	/**
	 * Returns a new object of class '<em>Invocation Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invocation Action</em>'.
	 * @generated
	 */
	GCMInvocationAction createGCMInvocationAction();

	/**
	 * Returns a new object of class '<em>Data Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Event</em>'.
	 * @generated
	 */
	DataEvent createDataEvent();

	/**
	 * Returns a new object of class '<em>Data Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Pool</em>'.
	 * @generated
	 */
	DataPool createDataPool();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GCMPackage getGCMPackage();

} //GCMFactory
