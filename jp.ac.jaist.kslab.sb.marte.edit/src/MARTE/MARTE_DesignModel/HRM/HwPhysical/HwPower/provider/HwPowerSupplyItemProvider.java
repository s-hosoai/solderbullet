/**
 */
package MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.provider;


import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.provider.HwComponentItemProvider;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerPackage;
import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerSupply;

import MARTE.MARTE_Foundations.GRM.GRMPackage;
import MARTE.MARTE_Foundations.NFPs.provider.MARTE_sbEditPlugin;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerSupply} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HwPowerSupplyItemProvider extends HwComponentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPowerSupplyItemProvider(AdapterFactory adapterFactory) {
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
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(HwPowerPackage.Literals.HW_POWER_SUPPLY__SUPPLIED_POWER);
			childrenFeatures.add(HwPowerPackage.Literals.HW_POWER_SUPPLY__CAPACITY);
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
	 * This returns HwPowerSupply.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HwPowerSupply"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((HwPowerSupply)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HwPowerSupply_type") :
			getString("_UI_HwPowerSupply_type") + " " + label;
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

		switch (notification.getFeatureID(HwPowerSupply.class)) {
			case HwPowerPackage.HW_POWER_SUPPLY__SUPPLIED_POWER:
			case HwPowerPackage.HW_POWER_SUPPLY__CAPACITY:
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
				(HwPowerPackage.Literals.HW_POWER_SUPPLY__SUPPLIED_POWER,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Power()));

		newChildDescriptors.add
			(createChildParameter
				(HwPowerPackage.Literals.HW_POWER_SUPPLY__CAPACITY,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Energy()));
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
			childFeature == HwPowerPackage.Literals.HW_POWER_SUPPLY__SUPPLIED_POWER ||
			childFeature == HwPowerPackage.Literals.HW_POWER_SUPPLY__CAPACITY ||
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
