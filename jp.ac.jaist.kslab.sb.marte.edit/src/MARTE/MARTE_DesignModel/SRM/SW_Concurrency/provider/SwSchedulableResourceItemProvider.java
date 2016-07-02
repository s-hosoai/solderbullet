/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Concurrency.provider;


import MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage;
import MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource;

import MARTE.MARTE_Foundations.GRM.GRMPackage;

import MARTE_Library.GRM_BasicTypes.GRM_BasicTypesFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SwSchedulableResourceItemProvider extends SwConcurrentResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwSchedulableResourceItemProvider(AdapterFactory adapterFactory) {
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

			addDependentSchedulerPropertyDescriptor(object);
			addHostPropertyDescriptor(object);
			addIsStaticSchedulingFeaturePropertyDescriptor(object);
			addIsPreemptablePropertyDescriptor(object);
			addSchedulersPropertyDescriptor(object);
			addDeadlineElementsPropertyDescriptor(object);
			addDeadlineTypeElementsPropertyDescriptor(object);
			addTimeSliceElementsPropertyDescriptor(object);
			addDelayServicesPropertyDescriptor(object);
			addJoinServicesPropertyDescriptor(object);
			addYieldServicesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Dependent Scheduler feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependentSchedulerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SchedulableResource_dependentScheduler_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SchedulableResource_dependentScheduler_feature", "_UI_SchedulableResource_type"),
				 GRMPackage.Literals.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SchedulableResource_host_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SchedulableResource_host_feature", "_UI_SchedulableResource_type"),
				 GRMPackage.Literals.SCHEDULABLE_RESOURCE__HOST,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Static Scheduling Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsStaticSchedulingFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwSchedulableResource_isStaticSchedulingFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwSchedulableResource_isStaticSchedulingFeature_feature", "_UI_SwSchedulableResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_SCHEDULABLE_RESOURCE__IS_STATIC_SCHEDULING_FEATURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Preemptable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsPreemptablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwSchedulableResource_isPreemptable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwSchedulableResource_isPreemptable_feature", "_UI_SwSchedulableResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_SCHEDULABLE_RESOURCE__IS_PREEMPTABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schedulers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchedulersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwSchedulableResource_schedulers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwSchedulableResource_schedulers_feature", "_UI_SwSchedulableResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_SCHEDULABLE_RESOURCE__SCHEDULERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deadline Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeadlineElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwSchedulableResource_deadlineElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwSchedulableResource_deadlineElements_feature", "_UI_SwSchedulableResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_SCHEDULABLE_RESOURCE__DEADLINE_ELEMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deadline Type Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeadlineTypeElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwSchedulableResource_deadlineTypeElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwSchedulableResource_deadlineTypeElements_feature", "_UI_SwSchedulableResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_SCHEDULABLE_RESOURCE__DEADLINE_TYPE_ELEMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Slice Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeSliceElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwSchedulableResource_timeSliceElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwSchedulableResource_timeSliceElements_feature", "_UI_SwSchedulableResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_SCHEDULABLE_RESOURCE__TIME_SLICE_ELEMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delay Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDelayServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwSchedulableResource_delayServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwSchedulableResource_delayServices_feature", "_UI_SwSchedulableResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_SCHEDULABLE_RESOURCE__DELAY_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Join Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJoinServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwSchedulableResource_joinServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwSchedulableResource_joinServices_feature", "_UI_SwSchedulableResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_SCHEDULABLE_RESOURCE__JOIN_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Yield Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYieldServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwSchedulableResource_yieldServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwSchedulableResource_yieldServices_feature", "_UI_SwSchedulableResource_type"),
				 SW_ConcurrencyPackage.Literals.SW_SCHEDULABLE_RESOURCE__YIELD_SERVICES,
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
			childrenFeatures.add(GRMPackage.Literals.SCHEDULABLE_RESOURCE__SCHED_PARAMS);
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
	 * This returns SwSchedulableResource.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SwSchedulableResource"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		Boolean labelValue = ((SwSchedulableResource)object).getIsProtected();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_SwSchedulableResource_type") :
			getString("_UI_SwSchedulableResource_type") + " " + label;
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

		switch (notification.getFeatureID(SwSchedulableResource.class)) {
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__IS_STATIC_SCHEDULING_FEATURE:
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__IS_PREEMPTABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__SCHED_PARAMS:
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
				(GRMPackage.Literals.SCHEDULABLE_RESOURCE__SCHED_PARAMS,
				 GRM_BasicTypesFactory.eINSTANCE.createSchedParameters()));
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
			childFeature == SW_ConcurrencyPackage.Literals.SW_CONCURRENT_RESOURCE__TYPE ||
			childFeature == GRMPackage.Literals.SCHEDULABLE_RESOURCE__SCHED_PARAMS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
