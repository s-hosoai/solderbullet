/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.provider;


import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationFactory;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingFactory;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDeviceFactory;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwIOFactory;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackageFactory;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegisterFactory;

import MARTE.MARTE_Foundations.GRM.GRMPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HwMCUItemProvider extends HwComputingResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwMCUItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(HwComputingPackage.Literals.HW_MCU__PROCESSOR);
			childrenFeatures.add(HwComputingPackage.Literals.HW_MCU__PERIPHERALS);
			childrenFeatures.add(HwComputingPackage.Literals.HW_MCU__SFR);
			childrenFeatures.add(HwComputingPackage.Literals.HW_MCU__PACKAGES);
			childrenFeatures.add(HwComputingPackage.Literals.HW_MCU__PINS);
			childrenFeatures.add(HwComputingPackage.Literals.HW_MCU__PORTS);
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
	 * This returns HwMCU.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HwMCU"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((HwMCU)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HwMCU_type") :
			getString("_UI_HwMCU_type") + " " + label;
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

		switch (notification.getFeatureID(HwMCU.class)) {
			case HwComputingPackage.HW_MCU__PROCESSOR:
			case HwComputingPackage.HW_MCU__PERIPHERALS:
			case HwComputingPackage.HW_MCU__SFR:
			case HwComputingPackage.HW_MCU__PACKAGES:
			case HwComputingPackage.HW_MCU__PINS:
			case HwComputingPackage.HW_MCU__PORTS:
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
				(HwComputingPackage.Literals.HW_MCU__PROCESSOR,
				 HwComputingFactory.eINSTANCE.createHwProcessor()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_MCU__PERIPHERALS,
				 HwDeviceFactory.eINSTANCE.createHwPeripheral()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_MCU__SFR,
				 HwRegisterFactory.eINSTANCE.createHwRegister()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_MCU__PACKAGES,
				 HwPackageFactory.eINSTANCE.createHwPackage()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_MCU__PINS,
				 HwIOFactory.eINSTANCE.createHwPin()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_MCU__PORTS,
				 HwCommunicationFactory.eINSTANCE.createHwPort()));
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
			childFeature == HwComputingPackage.Literals.HW_MCU__PROCESSOR ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__END_POINTS ||
			childFeature == HwComputingPackage.Literals.HW_MCU__PORTS ||
			childFeature == HwComputingPackage.Literals.HW_MCU__PERIPHERALS ||
			childFeature == HwComputingPackage.Literals.HW_MCU__PINS ||
			childFeature == HwComputingPackage.Literals.HW_MCU__SFR ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__FREQUENCY ||
			childFeature == GRMPackage.Literals.PROCESSING_RESOURCE__SPEED_FACTOR ||
			childFeature == HwComputingPackage.Literals.HW_COMPUTING_RESOURCE__OP_FREQUENCIES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
