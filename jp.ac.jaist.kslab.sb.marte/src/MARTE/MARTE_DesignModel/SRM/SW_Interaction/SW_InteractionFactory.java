/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Interaction;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage
 * @generated
 */
public interface SW_InteractionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SW_InteractionFactory eINSTANCE = MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.SW_InteractionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Shared Data Com Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Data Com Resource</em>'.
	 * @generated
	 */
	SharedDataComResource createSharedDataComResource();

	/**
	 * Returns a new object of class '<em>Message Com Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Com Resource</em>'.
	 * @generated
	 */
	MessageComResource createMessageComResource();

	/**
	 * Returns a new object of class '<em>Notification Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notification Resource</em>'.
	 * @generated
	 */
	NotificationResource createNotificationResource();

	/**
	 * Returns a new object of class '<em>Sw Mutual Exclusion Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sw Mutual Exclusion Resource</em>'.
	 * @generated
	 */
	SwMutualExclusionResource createSwMutualExclusionResource();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SW_InteractionPackage getSW_InteractionPackage();

} //SW_InteractionFactory
