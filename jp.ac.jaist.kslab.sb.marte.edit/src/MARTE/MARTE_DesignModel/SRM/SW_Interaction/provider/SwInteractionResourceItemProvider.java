/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Interaction.provider;


import MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage;
import MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwInteractionResource;

import MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.provider.SwResourceItemProvider;

import MARTE.MARTE_Foundations.GRM.GRMPackage;
import MARTE.MARTE_Foundations.NFPs.provider.MARTE_sbEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwInteractionResource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SwInteractionResourceItemProvider extends SwResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwInteractionResourceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIsIntraMemoryPartitionInteractionPropertyDescriptor(object);
			addWaitingQueuePolicyPropertyDescriptor(object);
			addWaitingQueueCapacityPropertyDescriptor(object);
			addWaitingPolicyElementsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Intra Memory Partition Interaction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsIntraMemoryPartitionInteractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwInteractionResource_isIntraMemoryPartitionInteraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwInteractionResource_isIntraMemoryPartitionInteraction_feature", "_UI_SwInteractionResource_type"),
				 SW_InteractionPackage.Literals.SW_INTERACTION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Waiting Queue Policy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWaitingQueuePolicyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwInteractionResource_waitingQueuePolicy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwInteractionResource_waitingQueuePolicy_feature", "_UI_SwInteractionResource_type"),
				 SW_InteractionPackage.Literals.SW_INTERACTION_RESOURCE__WAITING_QUEUE_POLICY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Waiting Queue Capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWaitingQueueCapacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwInteractionResource_waitingQueueCapacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwInteractionResource_waitingQueueCapacity_feature", "_UI_SwInteractionResource_type"),
				 SW_InteractionPackage.Literals.SW_INTERACTION_RESOURCE__WAITING_QUEUE_CAPACITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Waiting Policy Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWaitingPolicyElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwInteractionResource_waitingPolicyElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwInteractionResource_waitingPolicyElements_feature", "_UI_SwInteractionResource_type"),
				 SW_InteractionPackage.Literals.SW_INTERACTION_RESOURCE__WAITING_POLICY_ELEMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		Boolean labelValue = ((SwInteractionResource)object).getIsProtected();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_SwInteractionResource_type") :
			getString("_UI_SwInteractionResource_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SwInteractionResource.class)) {
			case SW_InteractionPackage.SW_INTERACTION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION:
			case SW_InteractionPackage.SW_INTERACTION_RESOURCE__WAITING_QUEUE_POLICY:
			case SW_InteractionPackage.SW_INTERACTION_RESOURCE__WAITING_QUEUE_CAPACITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature, Object child, Collection selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == GRMPackage.Literals.RESOURCE__RES_MULT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return MARTE_sbEditPlugin.INSTANCE;
	}

}
