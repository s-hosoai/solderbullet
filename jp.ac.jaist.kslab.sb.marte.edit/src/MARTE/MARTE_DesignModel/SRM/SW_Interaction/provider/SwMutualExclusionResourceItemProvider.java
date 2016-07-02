/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Interaction.provider;


import MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage;
import MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwMutualExclusionResource;

import MARTE.MARTE_Foundations.GRM.GRMPackage;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwMutualExclusionResource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SwMutualExclusionResourceItemProvider extends SwSynchronizationResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwMutualExclusionResourceItemProvider(AdapterFactory adapterFactory) {
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

			addProtectKindPropertyDescriptor(object);
			addOtherProtectProtocolPropertyDescriptor(object);
			addSchedulerPropertyDescriptor(object);
			addMechanismPropertyDescriptor(object);
			addConcurrentAccessProtocolPropertyDescriptor(object);
			addAccessTokenElementsPropertyDescriptor(object);
			addReleaseServicesPropertyDescriptor(object);
			addAcquireServicesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Protect Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtectKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MutualExclusionResource_protectKind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MutualExclusionResource_protectKind_feature", "_UI_MutualExclusionResource_type"),
				 GRMPackage.Literals.MUTUAL_EXCLUSION_RESOURCE__PROTECT_KIND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Protect Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherProtectProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MutualExclusionResource_otherProtectProtocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MutualExclusionResource_otherProtectProtocol_feature", "_UI_MutualExclusionResource_type"),
				 GRMPackage.Literals.MUTUAL_EXCLUSION_RESOURCE__OTHER_PROTECT_PROTOCOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scheduler feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchedulerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MutualExclusionResource_scheduler_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MutualExclusionResource_scheduler_feature", "_UI_MutualExclusionResource_type"),
				 GRMPackage.Literals.MUTUAL_EXCLUSION_RESOURCE__SCHEDULER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mechanism feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMechanismPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwMutualExclusionResource_mechanism_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwMutualExclusionResource_mechanism_feature", "_UI_SwMutualExclusionResource_type"),
				 SW_InteractionPackage.Literals.SW_MUTUAL_EXCLUSION_RESOURCE__MECHANISM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Concurrent Access Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConcurrentAccessProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwMutualExclusionResource_concurrentAccessProtocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwMutualExclusionResource_concurrentAccessProtocol_feature", "_UI_SwMutualExclusionResource_type"),
				 SW_InteractionPackage.Literals.SW_MUTUAL_EXCLUSION_RESOURCE__CONCURRENT_ACCESS_PROTOCOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Access Token Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessTokenElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwMutualExclusionResource_accessTokenElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwMutualExclusionResource_accessTokenElements_feature", "_UI_SwMutualExclusionResource_type"),
				 SW_InteractionPackage.Literals.SW_MUTUAL_EXCLUSION_RESOURCE__ACCESS_TOKEN_ELEMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Release Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReleaseServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwMutualExclusionResource_releaseServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwMutualExclusionResource_releaseServices_feature", "_UI_SwMutualExclusionResource_type"),
				 SW_InteractionPackage.Literals.SW_MUTUAL_EXCLUSION_RESOURCE__RELEASE_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Acquire Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAcquireServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwMutualExclusionResource_acquireServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwMutualExclusionResource_acquireServices_feature", "_UI_SwMutualExclusionResource_type"),
				 SW_InteractionPackage.Literals.SW_MUTUAL_EXCLUSION_RESOURCE__ACQUIRE_SERVICES,
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
			childrenFeatures.add(GRMPackage.Literals.MUTUAL_EXCLUSION_RESOURCE__CEILING);
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
	 * This returns SwMutualExclusionResource.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SwMutualExclusionResource"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		Boolean labelValue = ((SwMutualExclusionResource)object).getIsProtected();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_SwMutualExclusionResource_type") :
			getString("_UI_SwMutualExclusionResource_type") + " " + label;
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

		switch (notification.getFeatureID(SwMutualExclusionResource.class)) {
			case SW_InteractionPackage.SW_MUTUAL_EXCLUSION_RESOURCE__PROTECT_KIND:
			case SW_InteractionPackage.SW_MUTUAL_EXCLUSION_RESOURCE__OTHER_PROTECT_PROTOCOL:
			case SW_InteractionPackage.SW_MUTUAL_EXCLUSION_RESOURCE__MECHANISM:
			case SW_InteractionPackage.SW_MUTUAL_EXCLUSION_RESOURCE__CONCURRENT_ACCESS_PROTOCOL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SW_InteractionPackage.SW_MUTUAL_EXCLUSION_RESOURCE__CEILING:
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
				(GRMPackage.Literals.MUTUAL_EXCLUSION_RESOURCE__CEILING,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Integer()));
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
			childFeature == GRMPackage.Literals.MUTUAL_EXCLUSION_RESOURCE__CEILING;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
