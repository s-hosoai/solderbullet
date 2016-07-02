/**
 */
package MARTE_Library.MARTE_DataTypes.provider;


import MARTE_Library.BasicNFP_Types.BasicNFP_TypesFactory;

import MARTE_Library.GRM_BasicTypes.GRM_BasicTypesFactory;

import MARTE_Library.MARTE_DataTypes.Interval;
import MARTE_Library.MARTE_DataTypes.MARTE_DataTypesFactory;
import MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage;

import MARTE_Library.MeasurementUnits.provider.MARTE_LibraryEditPlugin;

import MARTE_Library.RS_Library.RS_LibraryFactory;

import MARTE_Library.TimeLibrary.TimeLibraryFactory;

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
 * This is the item provider adapter for a {@link MARTE_Library.MARTE_DataTypes.Interval} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IntervalItemProvider 
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
	public IntervalItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND);
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
	 * This returns Interval.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Interval"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Interval_type");
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

		switch (notification.getFeatureID(Interval.class)) {
			case MARTE_DataTypesPackage.INTERVAL__BOUND:
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
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 MARTE_DataTypesFactory.eINSTANCE.createIntegerVector()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 MARTE_DataTypesFactory.eINSTANCE.createIntegerMatrix()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 MARTE_DataTypesFactory.eINSTANCE.createIntegerInterval()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 MARTE_DataTypesFactory.eINSTANCE.createUtilityType()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 MARTE_DataTypesFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 MARTE_DataTypesFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 MARTE_DataTypesFactory.eINSTANCE.createRealnterval()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 MARTE_DataTypesFactory.eINSTANCE.createNFP_FrequencyInterval()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 MARTE_DataTypesFactory.eINSTANCE.createNFP_NaturalInterval()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 MARTE_DataTypesFactory.eINSTANCE.createRealVector()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 MARTE_DataTypesFactory.eINSTANCE.createRealMatrix()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 GRM_BasicTypesFactory.eINSTANCE.createEDF_Parameters()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 GRM_BasicTypesFactory.eINSTANCE.createSchedParameters()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 GRM_BasicTypesFactory.eINSTANCE.createFixedPriorityParameters()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 GRM_BasicTypesFactory.eINSTANCE.createPoolingParameters()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 GRM_BasicTypesFactory.eINSTANCE.createPeriodicServerParameters()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_CommonType()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Real()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Frequency()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Natural()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Boolean()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_String()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Integer()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DateTime()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataTxRate()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Power()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataSize()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Energy()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Length()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Area()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createArrivalPattern()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createPeriodicPattern()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createAperiodicPattern()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createBurstPattern()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createIrregularPattern()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createClosedPattern()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createSporadicPattern()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createOpenPattern()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Percentage()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Price()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Weight()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 TimeLibraryFactory.eINSTANCE.createTimedValueType()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 TimeLibraryFactory.eINSTANCE.createIdealClock()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 RS_LibraryFactory.eINSTANCE.createTilerSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(MARTE_DataTypesPackage.Literals.INTERVAL__BOUND,
				 RS_LibraryFactory.eINSTANCE.createShapeSpecification()));
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
