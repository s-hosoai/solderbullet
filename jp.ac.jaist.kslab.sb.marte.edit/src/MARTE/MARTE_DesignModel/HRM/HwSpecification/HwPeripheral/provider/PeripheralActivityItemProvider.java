/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.provider;


import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDeviceFunction.HwDeviceFunctionFactory;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.HwPeripheralFactory;
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.HwPeripheralPackage;
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.PeripheralActivity;

import MARTE.MARTE_Foundations.NFPs.provider.MARTE_sbEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.providers.ActivityItemProvider;

/**
 * This is the item provider adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.PeripheralActivity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PeripheralActivityItemProvider extends ActivityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeripheralActivityItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(HwPeripheralPackage.Literals.PERIPHERAL_ACTIVITY__REGISTER_ACTIONS);
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
	 * This returns PeripheralActivity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PeripheralActivity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((PeripheralActivity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PeripheralActivity_type") :
			getString("_UI_PeripheralActivity_type") + " " + label;
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

		switch (notification.getFeatureID(PeripheralActivity.class)) {
			case HwPeripheralPackage.PERIPHERAL_ACTIVITY__REGISTER_ACTIONS:
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
				(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
				 HwPeripheralFactory.eINSTANCE.createPeripheralActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
				 HwPeripheralFactory.eINSTANCE.createPeripheralActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__OWNED_OPERATION,
				 HwPeripheralFactory.eINSTANCE.createOperationImpl()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__OWNED_OPERATION,
				 HwDeviceFunctionFactory.eINSTANCE.createHwDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 HwPeripheralFactory.eINSTANCE.createPeripheralActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ACTIVITY__OWNED_NODE,
				 HwPeripheralFactory.eINSTANCE.createWriteRegisterAction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ACTIVITY__OWNED_NODE,
				 HwPeripheralFactory.eINSTANCE.createReadRegisterAction()));

		newChildDescriptors.add
			(createChildParameter
				(HwPeripheralPackage.Literals.PERIPHERAL_ACTIVITY__REGISTER_ACTIONS,
				 HwPeripheralFactory.eINSTANCE.createWriteRegisterAction()));

		newChildDescriptors.add
			(createChildParameter
				(HwPeripheralPackage.Literals.PERIPHERAL_ACTIVITY__REGISTER_ACTIONS,
				 HwPeripheralFactory.eINSTANCE.createReadRegisterAction()));
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
			childFeature == UMLPackage.Literals.NAMESPACE__OWNED_RULE ||
			childFeature == UMLPackage.Literals.BEHAVIOR__POSTCONDITION ||
			childFeature == UMLPackage.Literals.BEHAVIOR__PRECONDITION ||
			childFeature == UMLPackage.Literals.CLASSIFIER__COLLABORATION_USE ||
			childFeature == UMLPackage.Literals.CLASSIFIER__REPRESENTATION ||
			childFeature == UMLPackage.Literals.CLASSIFIER__OWNED_USE_CASE ||
			childFeature == UMLPackage.Literals.CLASS__NESTED_CLASSIFIER ||
			childFeature == UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE ||
			childFeature == UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT ||
			childFeature == UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR ||
			childFeature == UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR ||
			childFeature == UMLPackage.Literals.ACTIVITY__OWNED_GROUP ||
			childFeature == UMLPackage.Literals.ACTIVITY__PARTITION ||
			childFeature == UMLPackage.Literals.ACTIVITY__OWNED_NODE ||
			childFeature == UMLPackage.Literals.ACTIVITY__STRUCTURED_NODE ||
			childFeature == HwPeripheralPackage.Literals.PERIPHERAL_ACTIVITY__REGISTER_ACTIONS;

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
