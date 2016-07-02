/**
 */
package MARTE_Library.BasicNFP_Types.provider;


import MARTE_Library.BasicNFP_Types.AperiodicPattern;
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
 * This is the item provider adapter for a {@link MARTE_Library.BasicNFP_Types.AperiodicPattern} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AperiodicPatternItemProvider 
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
	public AperiodicPatternItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BasicNFP_TypesPackage.Literals.APERIODIC_PATTERN__DISTRIBUTION);
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
	 * This returns AperiodicPattern.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AperiodicPattern"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_AperiodicPattern_type");
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

		switch (notification.getFeatureID(AperiodicPattern.class)) {
			case BasicNFP_TypesPackage.APERIODIC_PATTERN__DISTRIBUTION:
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
				(BasicNFP_TypesPackage.Literals.APERIODIC_PATTERN__DISTRIBUTION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_CommonType()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.APERIODIC_PATTERN__DISTRIBUTION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Real()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.APERIODIC_PATTERN__DISTRIBUTION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Frequency()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.APERIODIC_PATTERN__DISTRIBUTION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Natural()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.APERIODIC_PATTERN__DISTRIBUTION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Boolean()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.APERIODIC_PATTERN__DISTRIBUTION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_String()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.APERIODIC_PATTERN__DISTRIBUTION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Integer()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.APERIODIC_PATTERN__DISTRIBUTION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DateTime()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.APERIODIC_PATTERN__DISTRIBUTION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataTxRate()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.APERIODIC_PATTERN__DISTRIBUTION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Power()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.APERIODIC_PATTERN__DISTRIBUTION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataSize()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.APERIODIC_PATTERN__DISTRIBUTION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Energy()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.APERIODIC_PATTERN__DISTRIBUTION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Length()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.APERIODIC_PATTERN__DISTRIBUTION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Area()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.APERIODIC_PATTERN__DISTRIBUTION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Percentage()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.APERIODIC_PATTERN__DISTRIBUTION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Price()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.APERIODIC_PATTERN__DISTRIBUTION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Weight()));

		newChildDescriptors.add
			(createChildParameter
				(BasicNFP_TypesPackage.Literals.APERIODIC_PATTERN__DISTRIBUTION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));
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
