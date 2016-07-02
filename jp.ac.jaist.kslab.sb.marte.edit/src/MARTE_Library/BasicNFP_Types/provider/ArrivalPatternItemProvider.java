/**
 */
package MARTE_Library.BasicNFP_Types.provider;


import MARTE_Library.BasicNFP_Types.ArrivalPattern;
import MARTE_Library.BasicNFP_Types.BasicNFP_TypesFactory;
import MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;

import MARTE_Library.MeasurementUnits.provider.MARTE_LibraryEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link MARTE_Library.BasicNFP_Types.ArrivalPattern} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArrivalPatternItemProvider 
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
	public ArrivalPatternItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(BasicNFP_TypesPackage.Literals.ARRIVAL_PATTERN__PERIODIC);
			childrenFeatures.add(BasicNFP_TypesPackage.Literals.ARRIVAL_PATTERN__APERIODIC);
			childrenFeatures.add(BasicNFP_TypesPackage.Literals.ARRIVAL_PATTERN__BURST);
			childrenFeatures.add(BasicNFP_TypesPackage.Literals.ARRIVAL_PATTERN__IRREGULAR);
			childrenFeatures.add(BasicNFP_TypesPackage.Literals.ARRIVAL_PATTERN__CLOSED);
			childrenFeatures.add(BasicNFP_TypesPackage.Literals.ARRIVAL_PATTERN__SPORADIC);
			childrenFeatures.add(BasicNFP_TypesPackage.Literals.ARRIVAL_PATTERN__OPEN);
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
	 * This returns ArrivalPattern.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ArrivalPattern"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ArrivalPattern_type");
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

		switch (notification.getFeatureID(ArrivalPattern.class)) {
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__PERIODIC:
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__APERIODIC:
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__BURST:
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__IRREGULAR:
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__CLOSED:
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__SPORADIC:
			case BasicNFP_TypesPackage.ARRIVAL_PATTERN__OPEN:
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
				(BasicNFP_TypesPackage.Literals.ARRIVAL_PATTERN__PERIODIC,
				 BasicNFP_TypesFactory.eINSTANCE.createPeriodicPattern()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.ARRIVAL_PATTERN__APERIODIC,
				 BasicNFP_TypesFactory.eINSTANCE.createAperiodicPattern()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.ARRIVAL_PATTERN__APERIODIC,
				 BasicNFP_TypesFactory.eINSTANCE.createBurstPattern()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.ARRIVAL_PATTERN__APERIODIC,
				 BasicNFP_TypesFactory.eINSTANCE.createIrregularPattern()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.ARRIVAL_PATTERN__APERIODIC,
				 BasicNFP_TypesFactory.eINSTANCE.createSporadicPattern()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.ARRIVAL_PATTERN__BURST,
				 BasicNFP_TypesFactory.eINSTANCE.createBurstPattern()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.ARRIVAL_PATTERN__IRREGULAR,
				 BasicNFP_TypesFactory.eINSTANCE.createIrregularPattern()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.ARRIVAL_PATTERN__CLOSED,
				 BasicNFP_TypesFactory.eINSTANCE.createClosedPattern()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.ARRIVAL_PATTERN__SPORADIC,
				 BasicNFP_TypesFactory.eINSTANCE.createSporadicPattern()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.ARRIVAL_PATTERN__OPEN,
				 BasicNFP_TypesFactory.eINSTANCE.createOpenPattern()));
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
			childFeature == BasicNFP_TypesPackage.Literals.ARRIVAL_PATTERN__APERIODIC ||
			childFeature == BasicNFP_TypesPackage.Literals.ARRIVAL_PATTERN__BURST ||
			childFeature == BasicNFP_TypesPackage.Literals.ARRIVAL_PATTERN__IRREGULAR ||
			childFeature == BasicNFP_TypesPackage.Literals.ARRIVAL_PATTERN__SPORADIC;

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
