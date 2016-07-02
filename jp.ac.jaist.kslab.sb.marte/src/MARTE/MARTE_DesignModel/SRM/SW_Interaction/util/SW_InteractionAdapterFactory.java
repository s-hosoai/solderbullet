/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Interaction.util;

import MARTE.MARTE_DesignModel.SRM.SW_Interaction.*;

import MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwResource;

import MARTE.MARTE_Foundations.GRM.CommunicationMedia;
import MARTE.MARTE_Foundations.GRM.MutualExclusionResource;
import MARTE.MARTE_Foundations.GRM.ProcessingResource;
import MARTE.MARTE_Foundations.GRM.Resource;
import MARTE.MARTE_Foundations.GRM.SynchronizationResource;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage
 * @generated
 */
public class SW_InteractionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SW_InteractionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SW_InteractionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SW_InteractionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SW_InteractionSwitch modelSwitch =
		new SW_InteractionSwitch() {
			public Object caseSwInteractionResource(SwInteractionResource object) {
				return createSwInteractionResourceAdapter();
			}
			public Object caseSwCommunicationResource(SwCommunicationResource object) {
				return createSwCommunicationResourceAdapter();
			}
			public Object caseSwSynchronizationResource(SwSynchronizationResource object) {
				return createSwSynchronizationResourceAdapter();
			}
			public Object caseSharedDataComResource(SharedDataComResource object) {
				return createSharedDataComResourceAdapter();
			}
			public Object caseMessageComResource(MessageComResource object) {
				return createMessageComResourceAdapter();
			}
			public Object caseNotificationResource(NotificationResource object) {
				return createNotificationResourceAdapter();
			}
			public Object caseSwMutualExclusionResource(SwMutualExclusionResource object) {
				return createSwMutualExclusionResourceAdapter();
			}
			public Object caseResource(Resource object) {
				return createResourceAdapter();
			}
			public Object caseSwResource(SwResource object) {
				return createSwResourceAdapter();
			}
			public Object caseProcessingResource(ProcessingResource object) {
				return createProcessingResourceAdapter();
			}
			public Object caseCommunicationMedia(CommunicationMedia object) {
				return createCommunicationMediaAdapter();
			}
			public Object caseSynchronizationResource(SynchronizationResource object) {
				return createSynchronizationResourceAdapter();
			}
			public Object caseMutualExclusionResource(MutualExclusionResource object) {
				return createMutualExclusionResourceAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwInteractionResource <em>Sw Interaction Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwInteractionResource
	 * @generated
	 */
	public Adapter createSwInteractionResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwCommunicationResource <em>Sw Communication Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwCommunicationResource
	 * @generated
	 */
	public Adapter createSwCommunicationResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwSynchronizationResource <em>Sw Synchronization Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwSynchronizationResource
	 * @generated
	 */
	public Adapter createSwSynchronizationResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.SharedDataComResource <em>Shared Data Com Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SharedDataComResource
	 * @generated
	 */
	public Adapter createSharedDataComResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.MessageComResource <em>Message Com Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.MessageComResource
	 * @generated
	 */
	public Adapter createMessageComResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.NotificationResource <em>Notification Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.NotificationResource
	 * @generated
	 */
	public Adapter createNotificationResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwMutualExclusionResource <em>Sw Mutual Exclusion Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwMutualExclusionResource
	 * @generated
	 */
	public Adapter createSwMutualExclusionResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Foundations.GRM.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Foundations.GRM.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwResource <em>Sw Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwResource
	 * @generated
	 */
	public Adapter createSwResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Foundations.GRM.ProcessingResource <em>Processing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Foundations.GRM.ProcessingResource
	 * @generated
	 */
	public Adapter createProcessingResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Foundations.GRM.CommunicationMedia <em>Communication Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Foundations.GRM.CommunicationMedia
	 * @generated
	 */
	public Adapter createCommunicationMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Foundations.GRM.SynchronizationResource <em>Synchronization Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Foundations.GRM.SynchronizationResource
	 * @generated
	 */
	public Adapter createSynchronizationResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Foundations.GRM.MutualExclusionResource <em>Mutual Exclusion Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Foundations.GRM.MutualExclusionResource
	 * @generated
	 */
	public Adapter createMutualExclusionResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SW_InteractionAdapterFactory
