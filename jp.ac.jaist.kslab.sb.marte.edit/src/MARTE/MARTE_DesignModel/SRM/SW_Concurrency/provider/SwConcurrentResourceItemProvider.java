/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Concurrency.provider;


import MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage;
import MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource;

import MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.provider.SwResourceItemProvider;

import MARTE.MARTE_Foundations.GRM.GRMPackage;
import MARTE.MARTE_Foundations.NFPs.provider.MARTE_sbEditPlugin;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SwConcurrentResourceItemProvider extends SwResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwConcurrentResourceItemProvider(AdapterFactory adapterFactory) {
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

			addActivationCapacityPropertyDescriptor(object);
			addEntryPointsPropertyDescriptor(object);
			addAdressSpacePropertyDescriptor(object);
			addPeriodElementsPropertyDescriptor(object);
			addPriorityElementsPropertyDescriptor(object);
			addStackSizeElementsPropertyDescriptor(object);
			addActivateServicesPropertyDescriptor(object);
			addEnableConcurrencyServicesPropertyDescriptor(object);
			addResumeServicesPropertyDescriptor(object);
			addSuspendServicesPropertyDescriptor(object);
			addTerminateServicesPropertyDescriptor(object);
			addDisableConcurrencyServicesPropertyDescriptor(object);
			addShareDataResourcesPropertyDescriptor(object);
			addMessageResourcesPropertyDescriptor(object);
			addMutualExclusionResourcesPropertyDescriptor(object);
			addNotificationResourcesPropertyDescriptor(object);
			addHeapSizeElementsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Activation Capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivationCapacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwConcurrentResource_activationCapacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwConcurrentResource_activationCapacity_feature", "_UI_SwConcurrentResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_CONCURRENT_RESOURCE__ACTIVATION_CAPACITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Entry Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEntryPointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwConcurrentResource_entryPoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwConcurrentResource_entryPoints_feature", "_UI_SwConcurrentResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_CONCURRENT_RESOURCE__ENTRY_POINTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Adress Space feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdressSpacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwConcurrentResource_adressSpace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwConcurrentResource_adressSpace_feature", "_UI_SwConcurrentResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_CONCURRENT_RESOURCE__ADRESS_SPACE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Period Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPeriodElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwConcurrentResource_periodElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwConcurrentResource_periodElements_feature", "_UI_SwConcurrentResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_CONCURRENT_RESOURCE__PERIOD_ELEMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Priority Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwConcurrentResource_priorityElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwConcurrentResource_priorityElements_feature", "_UI_SwConcurrentResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_CONCURRENT_RESOURCE__PRIORITY_ELEMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stack Size Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStackSizeElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwConcurrentResource_stackSizeElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwConcurrentResource_stackSizeElements_feature", "_UI_SwConcurrentResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_CONCURRENT_RESOURCE__STACK_SIZE_ELEMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Activate Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivateServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwConcurrentResource_activateServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwConcurrentResource_activateServices_feature", "_UI_SwConcurrentResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_CONCURRENT_RESOURCE__ACTIVATE_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Concurrency Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableConcurrencyServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwConcurrentResource_enableConcurrencyServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwConcurrentResource_enableConcurrencyServices_feature", "_UI_SwConcurrentResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_CONCURRENT_RESOURCE__ENABLE_CONCURRENCY_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resume Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResumeServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwConcurrentResource_resumeServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwConcurrentResource_resumeServices_feature", "_UI_SwConcurrentResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_CONCURRENT_RESOURCE__RESUME_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Suspend Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuspendServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwConcurrentResource_suspendServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwConcurrentResource_suspendServices_feature", "_UI_SwConcurrentResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_CONCURRENT_RESOURCE__SUSPEND_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Terminate Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTerminateServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwConcurrentResource_terminateServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwConcurrentResource_terminateServices_feature", "_UI_SwConcurrentResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_CONCURRENT_RESOURCE__TERMINATE_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disable Concurrency Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisableConcurrencyServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwConcurrentResource_disableConcurrencyServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwConcurrentResource_disableConcurrencyServices_feature", "_UI_SwConcurrentResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_CONCURRENT_RESOURCE__DISABLE_CONCURRENCY_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Share Data Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShareDataResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwConcurrentResource_shareDataResources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwConcurrentResource_shareDataResources_feature", "_UI_SwConcurrentResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_CONCURRENT_RESOURCE__SHARE_DATA_RESOURCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Message Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessageResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwConcurrentResource_messageResources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwConcurrentResource_messageResources_feature", "_UI_SwConcurrentResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_CONCURRENT_RESOURCE__MESSAGE_RESOURCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mutual Exclusion Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMutualExclusionResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwConcurrentResource_mutualExclusionResources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwConcurrentResource_mutualExclusionResources_feature", "_UI_SwConcurrentResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_CONCURRENT_RESOURCE__MUTUAL_EXCLUSION_RESOURCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Notification Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotificationResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwConcurrentResource_notificationResources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwConcurrentResource_notificationResources_feature", "_UI_SwConcurrentResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_CONCURRENT_RESOURCE__NOTIFICATION_RESOURCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Heap Size Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeapSizeElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwConcurrentResource_heapSizeElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwConcurrentResource_heapSizeElements_feature", "_UI_SwConcurrentResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_CONCURRENT_RESOURCE__HEAP_SIZE_ELEMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SW_ConcurrencyPackage.Literals.SW_CONCURRENT_RESOURCE__TYPE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		Boolean labelValue = ((SwConcurrentResource)object).getIsProtected();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_SwConcurrentResource_type") :
			getString("_UI_SwConcurrentResource_type") + " " + label;
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

		switch (notification.getFeatureID(SwConcurrentResource.class)) {
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ACTIVATION_CAPACITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(SW_ConcurrencyPackage.Literals.SW_CONCURRENT_RESOURCE__TYPE,
				 BasicNFP_TypesFactory.eINSTANCE.createArrivalPattern()));
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
			childFeature == GRMPackage.Literals.RESOURCE__RES_MULT ||
			childFeature == SW_ConcurrencyPackage.Literals.SW_CONCURRENT_RESOURCE__TYPE;

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
