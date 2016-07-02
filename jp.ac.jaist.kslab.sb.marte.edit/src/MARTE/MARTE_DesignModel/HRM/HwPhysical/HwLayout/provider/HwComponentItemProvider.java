/**
 */
package MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.provider;


import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralFactory;
import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.provider.HwResourceItemProvider;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent;
import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutFactory;
import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerFactory;

import MARTE.MARTE_Foundations.GRM.GRMPackage;
import MARTE.MARTE_Foundations.NFPs.provider.MARTE_sbEditPlugin;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesFactory;

import MARTE_Library.MARTE_DataTypes.MARTE_DataTypesFactory;

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
 * This is the item provider adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HwComponentItemProvider extends HwResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwComponentItemProvider(AdapterFactory adapterFactory) {
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

			addKindPropertyDescriptor(object);
			addAreaPropertyDescriptor(object);
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
				 getString("_UI_HwComponent_kind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HwComponent_kind_feature", "_UI_HwComponent_type"),
				 HwLayoutPackage.Literals.HW_COMPONENT__KIND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Area feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAreaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HwComponent_area_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HwComponent_area_feature", "_UI_HwComponent_type"),
				 HwLayoutPackage.Literals.HW_COMPONENT__AREA,
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
			childrenFeatures.add(HwLayoutPackage.Literals.HW_COMPONENT__DIMENSIONS);
			childrenFeatures.add(HwLayoutPackage.Literals.HW_COMPONENT__POSITION);
			childrenFeatures.add(HwLayoutPackage.Literals.HW_COMPONENT__GRID);
			childrenFeatures.add(HwLayoutPackage.Literals.HW_COMPONENT__NB_PINS);
			childrenFeatures.add(HwLayoutPackage.Literals.HW_COMPONENT__WEIGHT);
			childrenFeatures.add(HwLayoutPackage.Literals.HW_COMPONENT__PRICE);
			childrenFeatures.add(HwLayoutPackage.Literals.HW_COMPONENT__RCONDITIONS);
			childrenFeatures.add(HwLayoutPackage.Literals.HW_COMPONENT__POWERED_SERVICES);
			childrenFeatures.add(HwLayoutPackage.Literals.HW_COMPONENT__STATIC_CONSUMPTION);
			childrenFeatures.add(HwLayoutPackage.Literals.HW_COMPONENT__STATIC_DISSIPATION);
			childrenFeatures.add(HwLayoutPackage.Literals.HW_COMPONENT__SUB_COMPONENTS);
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
	 * This returns HwComponent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HwComponent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((HwComponent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HwComponent_type") :
			getString("_UI_HwComponent_type") + " " + label;
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

		switch (notification.getFeatureID(HwComponent.class)) {
			case HwLayoutPackage.HW_COMPONENT__KIND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case HwLayoutPackage.HW_COMPONENT__DIMENSIONS:
			case HwLayoutPackage.HW_COMPONENT__POSITION:
			case HwLayoutPackage.HW_COMPONENT__GRID:
			case HwLayoutPackage.HW_COMPONENT__NB_PINS:
			case HwLayoutPackage.HW_COMPONENT__WEIGHT:
			case HwLayoutPackage.HW_COMPONENT__PRICE:
			case HwLayoutPackage.HW_COMPONENT__RCONDITIONS:
			case HwLayoutPackage.HW_COMPONENT__POWERED_SERVICES:
			case HwLayoutPackage.HW_COMPONENT__STATIC_CONSUMPTION:
			case HwLayoutPackage.HW_COMPONENT__STATIC_DISSIPATION:
			case HwLayoutPackage.HW_COMPONENT__SUB_COMPONENTS:
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
				(HwLayoutPackage.Literals.HW_COMPONENT__DIMENSIONS,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Length()));

		newChildDescriptors.add
			(createChildParameter
				(HwLayoutPackage.Literals.HW_COMPONENT__POSITION,
				 MARTE_DataTypesFactory.eINSTANCE.createNFP_NaturalInterval()));

		newChildDescriptors.add
			(createChildParameter
				(HwLayoutPackage.Literals.HW_COMPONENT__GRID,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Natural()));

		newChildDescriptors.add
			(createChildParameter
				(HwLayoutPackage.Literals.HW_COMPONENT__NB_PINS,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Natural()));

		newChildDescriptors.add
			(createChildParameter
				(HwLayoutPackage.Literals.HW_COMPONENT__WEIGHT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Real()));

		newChildDescriptors.add
			(createChildParameter
				(HwLayoutPackage.Literals.HW_COMPONENT__WEIGHT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Frequency()));

		newChildDescriptors.add
			(createChildParameter
				(HwLayoutPackage.Literals.HW_COMPONENT__WEIGHT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataTxRate()));

		newChildDescriptors.add
			(createChildParameter
				(HwLayoutPackage.Literals.HW_COMPONENT__WEIGHT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Power()));

		newChildDescriptors.add
			(createChildParameter
				(HwLayoutPackage.Literals.HW_COMPONENT__WEIGHT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataSize()));

		newChildDescriptors.add
			(createChildParameter
				(HwLayoutPackage.Literals.HW_COMPONENT__WEIGHT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Energy()));

		newChildDescriptors.add
			(createChildParameter
				(HwLayoutPackage.Literals.HW_COMPONENT__WEIGHT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Length()));

		newChildDescriptors.add
			(createChildParameter
				(HwLayoutPackage.Literals.HW_COMPONENT__WEIGHT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Area()));

		newChildDescriptors.add
			(createChildParameter
				(HwLayoutPackage.Literals.HW_COMPONENT__WEIGHT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Percentage()));

		newChildDescriptors.add
			(createChildParameter
				(HwLayoutPackage.Literals.HW_COMPONENT__WEIGHT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Price()));

		newChildDescriptors.add
			(createChildParameter
				(HwLayoutPackage.Literals.HW_COMPONENT__WEIGHT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Weight()));

		newChildDescriptors.add
			(createChildParameter
				(HwLayoutPackage.Literals.HW_COMPONENT__WEIGHT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(HwLayoutPackage.Literals.HW_COMPONENT__PRICE,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Price()));

		newChildDescriptors.add
			(createChildParameter
				(HwLayoutPackage.Literals.HW_COMPONENT__RCONDITIONS,
				 HwLayoutFactory.eINSTANCE.createEnv_Condition()));

		newChildDescriptors.add
			(createChildParameter
				(HwLayoutPackage.Literals.HW_COMPONENT__POWERED_SERVICES,
				 HwGeneralFactory.eINSTANCE.createHwResourceService()));

		newChildDescriptors.add
			(createChildParameter
				(HwLayoutPackage.Literals.HW_COMPONENT__STATIC_CONSUMPTION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Power()));

		newChildDescriptors.add
			(createChildParameter
				(HwLayoutPackage.Literals.HW_COMPONENT__STATIC_DISSIPATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Power()));

		newChildDescriptors.add
			(createChildParameter
				(HwLayoutPackage.Literals.HW_COMPONENT__SUB_COMPONENTS,
				 HwLayoutFactory.eINSTANCE.createHwComponent()));

		newChildDescriptors.add
			(createChildParameter
				(HwLayoutPackage.Literals.HW_COMPONENT__SUB_COMPONENTS,
				 HwPowerFactory.eINSTANCE.createHwPowerSupply()));

		newChildDescriptors.add
			(createChildParameter
				(HwLayoutPackage.Literals.HW_COMPONENT__SUB_COMPONENTS,
				 HwPowerFactory.eINSTANCE.createHwCoolingSupply()));
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
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__DESCRIPTION ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__PHW_SERVICES ||
			childFeature == HwLayoutPackage.Literals.HW_COMPONENT__POWERED_SERVICES ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW ||
			childFeature == HwLayoutPackage.Literals.HW_COMPONENT__SUB_COMPONENTS ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__END_POINTS ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__FREQUENCY ||
			childFeature == HwLayoutPackage.Literals.HW_COMPONENT__WEIGHT ||
			childFeature == HwLayoutPackage.Literals.HW_COMPONENT__DIMENSIONS ||
			childFeature == HwLayoutPackage.Literals.HW_COMPONENT__POSITION ||
			childFeature == HwLayoutPackage.Literals.HW_COMPONENT__GRID ||
			childFeature == HwLayoutPackage.Literals.HW_COMPONENT__NB_PINS ||
			childFeature == HwLayoutPackage.Literals.HW_COMPONENT__STATIC_CONSUMPTION ||
			childFeature == HwLayoutPackage.Literals.HW_COMPONENT__STATIC_DISSIPATION ||
			childFeature == HwLayoutPackage.Literals.HW_COMPONENT__PRICE;

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
