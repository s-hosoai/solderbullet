/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.provider;


import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.provider.HwResourceItemProvider;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA;

import MARTE.MARTE_Foundations.GRM.GRMPackage;
import MARTE.MARTE_Foundations.NFPs.provider.MARTE_sbEditPlugin;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesFactory;

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
 * This is the item provider adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HwISAItemProvider extends HwResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwISAItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HwISA_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HwISA_type_feature", "_UI_HwISA_type"),
				 HwComputingPackage.Literals.HW_ISA__TYPE,
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
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(HwComputingPackage.Literals.HW_ISA__FAMILY);
			childrenFeatures.add(HwComputingPackage.Literals.HW_ISA__INST_WIDTH);
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
	 * This returns HwISA.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HwISA"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((HwISA)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HwISA_type") :
			getString("_UI_HwISA_type") + " " + label;
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

		switch (notification.getFeatureID(HwISA.class)) {
			case HwComputingPackage.HW_ISA__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case HwComputingPackage.HW_ISA__FAMILY:
			case HwComputingPackage.HW_ISA__INST_WIDTH:
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
				(HwComputingPackage.Literals.HW_ISA__FAMILY,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_String()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_ISA__INST_WIDTH,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataSize()));
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
			childFeature == HwComputingPackage.Literals.HW_ISA__FAMILY ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__END_POINTS ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__FREQUENCY ||
			childFeature == HwComputingPackage.Literals.HW_ISA__INST_WIDTH;

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