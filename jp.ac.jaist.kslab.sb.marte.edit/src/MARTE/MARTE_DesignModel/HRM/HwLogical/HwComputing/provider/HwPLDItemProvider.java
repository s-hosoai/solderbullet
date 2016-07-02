/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.provider;


import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingFactory;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryFactory;

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
 * This is the item provider adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HwPLDItemProvider extends HwComputingResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPLDItemProvider(AdapterFactory adapterFactory) {
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

			addTechnologyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HwPLD_technology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HwPLD_technology_feature", "_UI_HwPLD_type"),
				 HwComputingPackage.Literals.HW_PLD__TECHNOLOGY,
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
			childrenFeatures.add(HwComputingPackage.Literals.HW_PLD__ORGANIZATION);
			childrenFeatures.add(HwComputingPackage.Literals.HW_PLD__NB_LU_TS);
			childrenFeatures.add(HwComputingPackage.Literals.HW_PLD__ND_LUT_INPUTS);
			childrenFeatures.add(HwComputingPackage.Literals.HW_PLD__NB_FLIP_FLOPS);
			childrenFeatures.add(HwComputingPackage.Literals.HW_PLD__BLOCKS_RAM);
			childrenFeatures.add(HwComputingPackage.Literals.HW_PLD__BLOCKS_COMPUTING);
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
	 * This returns HwPLD.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HwPLD"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((HwPLD)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HwPLD_type") :
			getString("_UI_HwPLD_type") + " " + label;
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

		switch (notification.getFeatureID(HwPLD.class)) {
			case HwComputingPackage.HW_PLD__TECHNOLOGY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case HwComputingPackage.HW_PLD__ORGANIZATION:
			case HwComputingPackage.HW_PLD__NB_LU_TS:
			case HwComputingPackage.HW_PLD__ND_LUT_INPUTS:
			case HwComputingPackage.HW_PLD__NB_FLIP_FLOPS:
			case HwComputingPackage.HW_PLD__BLOCKS_RAM:
			case HwComputingPackage.HW_PLD__BLOCKS_COMPUTING:
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
				(HwComputingPackage.Literals.HW_PLD__ORGANIZATION,
				 HwComputingFactory.eINSTANCE.createPLD_Organization()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_PLD__NB_LU_TS,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Natural()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_PLD__ND_LUT_INPUTS,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Natural()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_PLD__NB_FLIP_FLOPS,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Natural()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_PLD__BLOCKS_RAM,
				 HwMemoryFactory.eINSTANCE.createHwRAM()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_PLD__BLOCKS_COMPUTING,
				 HwComputingFactory.eINSTANCE.createHwComputingResource()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_PLD__BLOCKS_COMPUTING,
				 HwComputingFactory.eINSTANCE.createHwProcessor()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_PLD__BLOCKS_COMPUTING,
				 HwComputingFactory.eINSTANCE.createHwASIC()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_PLD__BLOCKS_COMPUTING,
				 HwComputingFactory.eINSTANCE.createHwPLD()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_PLD__BLOCKS_COMPUTING,
				 HwComputingFactory.eINSTANCE.createHwMCU()));
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
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW ||
			childFeature == HwComputingPackage.Literals.HW_PLD__BLOCKS_COMPUTING ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__END_POINTS ||
			childFeature == HwComputingPackage.Literals.HW_PLD__BLOCKS_RAM ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__FREQUENCY ||
			childFeature == GRMPackage.Literals.PROCESSING_RESOURCE__SPEED_FACTOR ||
			childFeature == HwComputingPackage.Literals.HW_COMPUTING_RESOURCE__OP_FREQUENCIES ||
			childFeature == HwComputingPackage.Literals.HW_PLD__NB_LU_TS ||
			childFeature == HwComputingPackage.Literals.HW_PLD__ND_LUT_INPUTS ||
			childFeature == HwComputingPackage.Literals.HW_PLD__NB_FLIP_FLOPS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
