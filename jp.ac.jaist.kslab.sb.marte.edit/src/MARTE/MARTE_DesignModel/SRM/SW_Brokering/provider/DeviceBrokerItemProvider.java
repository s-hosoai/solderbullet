/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Brokering.provider;


import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDeviceFunction.HwDeviceFunctionFactory;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.HwPeripheralFactory;

import MARTE.MARTE_DesignModel.SRM.SW_Brokering.DeviceBroker;
import MARTE.MARTE_DesignModel.SRM.SW_Brokering.SW_BrokeringPackage;

import MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.provider.SwResourceItemProvider;

import MARTE.MARTE_Foundations.GRM.GRMPackage;
import MARTE.MARTE_Foundations.NFPs.provider.MARTE_sbEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.UMLFactory;

/**
 * This is the item provider adapter for a {@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.DeviceBroker} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeviceBrokerItemProvider extends SwResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceBrokerItemProvider(AdapterFactory adapterFactory) {
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

			addAccessPolicyPropertyDescriptor(object);
			addIsBufferedPropertyDescriptor(object);
			addDevicesPropertyDescriptor(object);
			addCloseServicesPropertyDescriptor(object);
			addControlServicesPropertyDescriptor(object);
			addOpenServicesPropertyDescriptor(object);
			addReadServicesPropertyDescriptor(object);
			addWriteServicesPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Access Policy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessPolicyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceBroker_accessPolicy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceBroker_accessPolicy_feature", "_UI_DeviceBroker_type"),
				 SW_BrokeringPackage.Literals.DEVICE_BROKER__ACCESS_POLICY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Buffered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsBufferedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceBroker_isBuffered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceBroker_isBuffered_feature", "_UI_DeviceBroker_type"),
				 SW_BrokeringPackage.Literals.DEVICE_BROKER__IS_BUFFERED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Devices feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDevicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceBroker_devices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceBroker_devices_feature", "_UI_DeviceBroker_type"),
				 SW_BrokeringPackage.Literals.DEVICE_BROKER__DEVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Close Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloseServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceBroker_closeServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceBroker_closeServices_feature", "_UI_DeviceBroker_type"),
				 SW_BrokeringPackage.Literals.DEVICE_BROKER__CLOSE_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Control Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControlServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceBroker_controlServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceBroker_controlServices_feature", "_UI_DeviceBroker_type"),
				 SW_BrokeringPackage.Literals.DEVICE_BROKER__CONTROL_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Open Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOpenServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceBroker_openServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceBroker_openServices_feature", "_UI_DeviceBroker_type"),
				 SW_BrokeringPackage.Literals.DEVICE_BROKER__OPEN_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Read Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceBroker_readServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceBroker_readServices_feature", "_UI_DeviceBroker_type"),
				 SW_BrokeringPackage.Literals.DEVICE_BROKER__READ_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Write Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWriteServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceBroker_writeServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceBroker_writeServices_feature", "_UI_DeviceBroker_type"),
				 SW_BrokeringPackage.Literals.DEVICE_BROKER__WRITE_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceBroker_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceBroker_name_feature", "_UI_DeviceBroker_type"),
				 SW_BrokeringPackage.Literals.DEVICE_BROKER__NAME,
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
			childrenFeatures.add(SW_BrokeringPackage.Literals.DEVICE_BROKER__OPERATIONS);
			childrenFeatures.add(SW_BrokeringPackage.Literals.DEVICE_BROKER__ACTIVITIES);
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
	 * This returns DeviceBroker.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DeviceBroker"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((DeviceBroker)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DeviceBroker_type") :
			getString("_UI_DeviceBroker_type") + " " + label;
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

		switch (notification.getFeatureID(DeviceBroker.class)) {
			case SW_BrokeringPackage.DEVICE_BROKER__ACCESS_POLICY:
			case SW_BrokeringPackage.DEVICE_BROKER__IS_BUFFERED:
			case SW_BrokeringPackage.DEVICE_BROKER__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SW_BrokeringPackage.DEVICE_BROKER__OPERATIONS:
			case SW_BrokeringPackage.DEVICE_BROKER__ACTIVITIES:
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
				(SW_BrokeringPackage.Literals.DEVICE_BROKER__OPERATIONS,
				 HwPeripheralFactory.eINSTANCE.createOperationImpl()));

		newChildDescriptors.add
			(createChildParameter
				(SW_BrokeringPackage.Literals.DEVICE_BROKER__OPERATIONS,
				 HwDeviceFunctionFactory.eINSTANCE.createHwDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(SW_BrokeringPackage.Literals.DEVICE_BROKER__OPERATIONS,
				 UMLFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(SW_BrokeringPackage.Literals.DEVICE_BROKER__ACTIVITIES,
				 HwPeripheralFactory.eINSTANCE.createPeripheralActivity()));

		newChildDescriptors.add
			(createChildParameter
				(SW_BrokeringPackage.Literals.DEVICE_BROKER__ACTIVITIES,
				 UMLFactory.eINSTANCE.createActivity()));
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
			childFeature == GRMPackage.Literals.RESOURCE__RES_MULT;

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
