/**
 */
package MARTE_Library.GRM_BasicTypes.provider;


import MARTE_Library.BasicNFP_Types.BasicNFP_TypesFactory;

import MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage;
import MARTE_Library.GRM_BasicTypes.PeriodicServerKind;
import MARTE_Library.GRM_BasicTypes.PeriodicServerParameters;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link MARTE_Library.GRM_BasicTypes.PeriodicServerParameters} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PeriodicServerParametersItemProvider extends FixedPriorityParametersItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicServerParametersItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addKindPropertyDescriptor(object);
			addBackgroundPriorityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PeriodicServerParameters_kind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PeriodicServerParameters_kind_feature", "_UI_PeriodicServerParameters_type"),
				 GRM_BasicTypesPackage.Literals.PERIODIC_SERVER_PARAMETERS__KIND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Background Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackgroundPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PeriodicServerParameters_backgroundPriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PeriodicServerParameters_backgroundPriority_feature", "_UI_PeriodicServerParameters_type"),
				 GRM_BasicTypesPackage.Literals.PERIODIC_SERVER_PARAMETERS__BACKGROUND_PRIORITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GRM_BasicTypesPackage.Literals.PERIODIC_SERVER_PARAMETERS__INITIAL_BUDGET);
			childrenFeatures.add(GRM_BasicTypesPackage.Literals.PERIODIC_SERVER_PARAMETERS__REPLENISH_PERIOD);
			childrenFeatures.add(GRM_BasicTypesPackage.Literals.PERIODIC_SERVER_PARAMETERS__MAX_PENDING_REPLENISH);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns PeriodicServerParameters.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PeriodicServerParameters"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		PeriodicServerKind labelValue = ((PeriodicServerParameters)object).getKind();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_PeriodicServerParameters_type") :
			getString("_UI_PeriodicServerParameters_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PeriodicServerParameters.class)) {
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__KIND:
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__BACKGROUND_PRIORITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__INITIAL_BUDGET:
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__REPLENISH_PERIOD:
			case GRM_BasicTypesPackage.PERIODIC_SERVER_PARAMETERS__MAX_PENDING_REPLENISH:
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
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GRM_BasicTypesPackage.Literals.PERIODIC_SERVER_PARAMETERS__INITIAL_BUDGET,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(GRM_BasicTypesPackage.Literals.PERIODIC_SERVER_PARAMETERS__REPLENISH_PERIOD,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(GRM_BasicTypesPackage.Literals.PERIODIC_SERVER_PARAMETERS__MAX_PENDING_REPLENISH,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Integer()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == GRM_BasicTypesPackage.Literals.FIXED_PRIORITY_PARAMETERS__PRIORITY ||
			childFeature == GRM_BasicTypesPackage.Literals.PERIODIC_SERVER_PARAMETERS__MAX_PENDING_REPLENISH ||
			childFeature == GRM_BasicTypesPackage.Literals.PERIODIC_SERVER_PARAMETERS__INITIAL_BUDGET ||
			childFeature == GRM_BasicTypesPackage.Literals.PERIODIC_SERVER_PARAMETERS__REPLENISH_PERIOD;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
