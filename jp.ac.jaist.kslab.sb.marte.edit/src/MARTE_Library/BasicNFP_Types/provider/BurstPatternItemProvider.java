/**
 */
package MARTE_Library.BasicNFP_Types.provider;


import MARTE_Library.BasicNFP_Types.BasicNFP_TypesFactory;
import MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;
import MARTE_Library.BasicNFP_Types.BurstPattern;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link MARTE_Library.BasicNFP_Types.BurstPattern} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BurstPatternItemProvider extends AperiodicPatternItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BurstPatternItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BasicNFP_TypesPackage.Literals.BURST_PATTERN__MIN_INTERARRIVAL);
			childrenFeatures.add(BasicNFP_TypesPackage.Literals.BURST_PATTERN__MAX_INTERARRIVAL);
			childrenFeatures.add(BasicNFP_TypesPackage.Literals.BURST_PATTERN__MIN_EVENT_INTERVAL);
			childrenFeatures.add(BasicNFP_TypesPackage.Literals.BURST_PATTERN__MAX_EVENT_INTERVAL);
			childrenFeatures.add(BasicNFP_TypesPackage.Literals.BURST_PATTERN__BURST_SIZE);
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
	 * This returns BurstPattern.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BurstPattern"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BurstPattern_type");
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

		switch (notification.getFeatureID(BurstPattern.class)) {
			case BasicNFP_TypesPackage.BURST_PATTERN__MIN_INTERARRIVAL:
			case BasicNFP_TypesPackage.BURST_PATTERN__MAX_INTERARRIVAL:
			case BasicNFP_TypesPackage.BURST_PATTERN__MIN_EVENT_INTERVAL:
			case BasicNFP_TypesPackage.BURST_PATTERN__MAX_EVENT_INTERVAL:
			case BasicNFP_TypesPackage.BURST_PATTERN__BURST_SIZE:
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
				(BasicNFP_TypesPackage.Literals.BURST_PATTERN__MIN_INTERARRIVAL,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.BURST_PATTERN__MAX_INTERARRIVAL,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.BURST_PATTERN__MIN_EVENT_INTERVAL,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.BURST_PATTERN__MAX_EVENT_INTERVAL,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.BURST_PATTERN__BURST_SIZE,
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
			childFeature == BasicNFP_TypesPackage.Literals.APERIODIC_PATTERN__DISTRIBUTION ||
			childFeature == BasicNFP_TypesPackage.Literals.BURST_PATTERN__BURST_SIZE ||
			childFeature == BasicNFP_TypesPackage.Literals.BURST_PATTERN__MIN_INTERARRIVAL ||
			childFeature == BasicNFP_TypesPackage.Literals.BURST_PATTERN__MAX_INTERARRIVAL ||
			childFeature == BasicNFP_TypesPackage.Literals.BURST_PATTERN__MIN_EVENT_INTERVAL ||
			childFeature == BasicNFP_TypesPackage.Literals.BURST_PATTERN__MAX_EVENT_INTERVAL;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
