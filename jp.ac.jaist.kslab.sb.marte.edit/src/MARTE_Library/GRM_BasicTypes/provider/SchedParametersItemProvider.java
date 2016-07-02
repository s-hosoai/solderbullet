/**
 */
package MARTE_Library.GRM_BasicTypes.provider;


import MARTE_Library.GRM_BasicTypes.GRM_BasicTypesFactory;
import MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage;
import MARTE_Library.GRM_BasicTypes.SchedParameters;

import MARTE_Library.MeasurementUnits.provider.MARTE_LibraryEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link MARTE_Library.GRM_BasicTypes.SchedParameters} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SchedParametersItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedParametersItemProvider(AdapterFactory adapterFactory) {
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

			addTableEntryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Table Entry feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTableEntryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SchedParameters_tableEntry_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SchedParameters_tableEntry_feature", "_UI_SchedParameters_type"),
				 GRM_BasicTypesPackage.Literals.SCHED_PARAMETERS__TABLE_ENTRY,
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
			childrenFeatures.add(GRM_BasicTypesPackage.Literals.SCHED_PARAMETERS__EDF);
			childrenFeatures.add(GRM_BasicTypesPackage.Literals.SCHED_PARAMETERS__FP);
			childrenFeatures.add(GRM_BasicTypesPackage.Literals.SCHED_PARAMETERS__POOLING);
			childrenFeatures.add(GRM_BasicTypesPackage.Literals.SCHED_PARAMETERS__SERVER);
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
	 * This returns SchedParameters.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SchedParameters"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_SchedParameters_type");
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

		switch (notification.getFeatureID(SchedParameters.class)) {
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__TABLE_ENTRY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__EDF:
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__FP:
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__POOLING:
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__SERVER:
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
				(GRM_BasicTypesPackage.Literals.SCHED_PARAMETERS__EDF,
				 GRM_BasicTypesFactory.eINSTANCE.createEDF_Parameters()));

		newChildDescriptors.add
			(createChildParameter
				(GRM_BasicTypesPackage.Literals.SCHED_PARAMETERS__FP,
				 GRM_BasicTypesFactory.eINSTANCE.createFixedPriorityParameters()));

		newChildDescriptors.add
			(createChildParameter
				(GRM_BasicTypesPackage.Literals.SCHED_PARAMETERS__FP,
				 GRM_BasicTypesFactory.eINSTANCE.createPoolingParameters()));

		newChildDescriptors.add
			(createChildParameter
				(GRM_BasicTypesPackage.Literals.SCHED_PARAMETERS__FP,
				 GRM_BasicTypesFactory.eINSTANCE.createPeriodicServerParameters()));

		newChildDescriptors.add
			(createChildParameter
				(GRM_BasicTypesPackage.Literals.SCHED_PARAMETERS__POOLING,
				 GRM_BasicTypesFactory.eINSTANCE.createPoolingParameters()));

		newChildDescriptors.add
			(createChildParameter
				(GRM_BasicTypesPackage.Literals.SCHED_PARAMETERS__SERVER,
				 GRM_BasicTypesFactory.eINSTANCE.createPeriodicServerParameters()));
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
			childFeature == GRM_BasicTypesPackage.Literals.SCHED_PARAMETERS__FP ||
			childFeature == GRM_BasicTypesPackage.Literals.SCHED_PARAMETERS__POOLING ||
			childFeature == GRM_BasicTypesPackage.Literals.SCHED_PARAMETERS__SERVER;

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
	@Override
	public ResourceLocator getResourceLocator() {
		return MARTE_LibraryEditPlugin.INSTANCE;
	}

}
