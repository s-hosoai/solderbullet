/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.provider;


import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralFactory;
import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationFactory;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingFactory;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDeviceFactory;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryFactory;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerFactory;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwTimingFactory;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutFactory;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerFactory;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDeviceFunction.HwDeviceFunctionFactory;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwIOFactory;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackageFactory;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.HwPeripheralFactory;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegisterFactory;

import MARTE.MARTE_Foundations.GRM.GRMPackage;

import MARTE.MARTE_Foundations.GRM.provider.CommunicationMediaItemProvider;

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

import org.eclipse.uml2.uml.UMLFactory;

/**
 * This is the item provider adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HwMediaItemProvider extends CommunicationMediaItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwMediaItemProvider(AdapterFactory adapterFactory) {
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

			addR_HW_ServicesPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addArbitersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the RHW Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addR_HW_ServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HwResource_r_HW_Services_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HwResource_r_HW_Services_feature", "_UI_HwResource_type"),
				 HwGeneralPackage.Literals.HW_RESOURCE__RHW_SERVICES,
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
				 getString("_UI_HwResource_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HwResource_name_feature", "_UI_HwResource_type"),
				 HwGeneralPackage.Literals.HW_RESOURCE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Arbiters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArbitersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HwMedia_arbiters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HwMedia_arbiters_feature", "_UI_HwMedia_type"),
				 HwCommunicationPackage.Literals.HW_MEDIA__ARBITERS,
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
			childrenFeatures.add(HwGeneralPackage.Literals.HW_RESOURCE__DESCRIPTION);
			childrenFeatures.add(HwGeneralPackage.Literals.HW_RESOURCE__PHW_SERVICES);
			childrenFeatures.add(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW);
			childrenFeatures.add(HwGeneralPackage.Literals.HW_RESOURCE__END_POINTS);
			childrenFeatures.add(HwGeneralPackage.Literals.HW_RESOURCE__FREQUENCY);
			childrenFeatures.add(HwGeneralPackage.Literals.HW_RESOURCE__OPERATIONS);
			childrenFeatures.add(HwGeneralPackage.Literals.HW_RESOURCE__ACTIVITIES);
			childrenFeatures.add(HwCommunicationPackage.Literals.HW_MEDIA__BAND_WIDTH);
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
	 * This returns HwMedia.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HwMedia"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((HwMedia)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HwMedia_type") :
			getString("_UI_HwMedia_type") + " " + label;
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

		switch (notification.getFeatureID(HwMedia.class)) {
			case HwCommunicationPackage.HW_MEDIA__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case HwCommunicationPackage.HW_MEDIA__DESCRIPTION:
			case HwCommunicationPackage.HW_MEDIA__PHW_SERVICES:
			case HwCommunicationPackage.HW_MEDIA__OWNED_HW:
			case HwCommunicationPackage.HW_MEDIA__END_POINTS:
			case HwCommunicationPackage.HW_MEDIA__FREQUENCY:
			case HwCommunicationPackage.HW_MEDIA__OPERATIONS:
			case HwCommunicationPackage.HW_MEDIA__ACTIVITIES:
			case HwCommunicationPackage.HW_MEDIA__BAND_WIDTH:
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
				(HwGeneralPackage.Literals.HW_RESOURCE__DESCRIPTION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_String()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__PHW_SERVICES,
				 HwGeneralFactory.eINSTANCE.createHwResourceService()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwCommunicationFactory.eINSTANCE.createHwCommunicationResource()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwCommunicationFactory.eINSTANCE.createHwArbiter()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwCommunicationFactory.eINSTANCE.createHwMedia()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwCommunicationFactory.eINSTANCE.createHwBus()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwCommunicationFactory.eINSTANCE.createHwBridge()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwCommunicationFactory.eINSTANCE.createHwEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwCommunicationFactory.eINSTANCE.createHwPort()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwCommunicationFactory.eINSTANCE.createHwConnection()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwComputingFactory.eINSTANCE.createHwComputingResource()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwComputingFactory.eINSTANCE.createHwProcessor()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwComputingFactory.eINSTANCE.createHwISA()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwComputingFactory.eINSTANCE.createHwBranchPredictor()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwComputingFactory.eINSTANCE.createHwASIC()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwComputingFactory.eINSTANCE.createHwPLD()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwComputingFactory.eINSTANCE.createHwMCU()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwStorageManagerFactory.eINSTANCE.createHwStorageManager()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwStorageManagerFactory.eINSTANCE.createHwDMA()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwStorageManagerFactory.eINSTANCE.createHwMMU()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwMemoryFactory.eINSTANCE.createHwMemory()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwMemoryFactory.eINSTANCE.createHwRAM()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwMemoryFactory.eINSTANCE.createHwROM()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwMemoryFactory.eINSTANCE.createHwDrive()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwMemoryFactory.eINSTANCE.createHwCache()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwTimingFactory.eINSTANCE.createHwTimingResource()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwTimingFactory.eINSTANCE.createHwClock()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwTimingFactory.eINSTANCE.createHwTimer()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwDeviceFactory.eINSTANCE.createHwDevice()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwDeviceFactory.eINSTANCE.createHwI_O()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwDeviceFactory.eINSTANCE.createHwSupport()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwDeviceFactory.eINSTANCE.createHWActuator()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwDeviceFactory.eINSTANCE.createHWSensor()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwDeviceFactory.eINSTANCE.createHwPeripheral()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwGeneralFactory.eINSTANCE.createHwResource()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwLayoutFactory.eINSTANCE.createHwComponent()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwPowerFactory.eINSTANCE.createHwPowerSupply()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwPowerFactory.eINSTANCE.createHwCoolingSupply()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwIOFactory.eINSTANCE.createHwPin()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwIOFactory.eINSTANCE.createHwLine()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwRegisterFactory.eINSTANCE.createHwRegister()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwPackageFactory.eINSTANCE.createHwPackagePin()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW,
				 HwPackageFactory.eINSTANCE.createHwWire()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__END_POINTS,
				 HwCommunicationFactory.eINSTANCE.createHwEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__END_POINTS,
				 HwCommunicationFactory.eINSTANCE.createHwPort()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__END_POINTS,
				 HwIOFactory.eINSTANCE.createHwPin()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__END_POINTS,
				 HwPackageFactory.eINSTANCE.createHwPackagePin()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__FREQUENCY,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Frequency()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OPERATIONS,
				 HwPeripheralFactory.eINSTANCE.createOperationImpl()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OPERATIONS,
				 HwDeviceFunctionFactory.eINSTANCE.createHwDeviceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__OPERATIONS,
				 UMLFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__ACTIVITIES,
				 HwPeripheralFactory.eINSTANCE.createPeripheralActivity()));

		newChildDescriptors.add
			(createChildParameter
				(HwGeneralPackage.Literals.HW_RESOURCE__ACTIVITIES,
				 UMLFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(HwCommunicationPackage.Literals.HW_MEDIA__BAND_WIDTH,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataTxRate()));
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
			childFeature == GRMPackage.Literals.COMMUNICATION_MEDIA__ELEMENT_SIZE ||
			childFeature == GRMPackage.Literals.PROCESSING_RESOURCE__SPEED_FACTOR ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__FREQUENCY ||
			childFeature == GRMPackage.Literals.COMMUNICATION_MEDIA__CAPACITY ||
			childFeature == HwCommunicationPackage.Literals.HW_MEDIA__BAND_WIDTH ||
			childFeature == GRMPackage.Literals.COMMUNICATION_MEDIA__BLOCK_T ||
			childFeature == GRMPackage.Literals.COMMUNICATION_MEDIA__PACKET_T ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__DESCRIPTION ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__END_POINTS;

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
