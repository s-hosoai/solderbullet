/**
 */
package MARTE.MARTE_DesignModel.HRM.HwDiagram.provider;


import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwBlockDiagram;
import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralFactory;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationFactory;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingFactory;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDeviceFactory;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryFactory;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerFactory;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwTimingFactory;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutFactory;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerFactory;

import MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocolFactory;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwIOFactory;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackageFactory;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegisterFactory;

import MARTE.MARTE_Foundations.NFPs.provider.MARTE_sbEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwBlockDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HwBlockDiagramItemProvider 
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
	public HwBlockDiagramItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_HwBlockDiagram_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HwBlockDiagram_name_feature", "_UI_HwBlockDiagram_type"),
				 HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__NAME,
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
			childrenFeatures.add(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__PROTOCOLS);
			childrenFeatures.add(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__CONNECTIONS);
			childrenFeatures.add(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS);
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
	 * This returns HwBlockDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HwBlockDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((HwBlockDiagram)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HwBlockDiagram_type") :
			getString("_UI_HwBlockDiagram_type") + " " + label;
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

		switch (notification.getFeatureID(HwBlockDiagram.class)) {
			case HwDiagramPackage.HW_BLOCK_DIAGRAM__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case HwDiagramPackage.HW_BLOCK_DIAGRAM__PROTOCOLS:
			case HwDiagramPackage.HW_BLOCK_DIAGRAM__CONNECTIONS:
			case HwDiagramPackage.HW_BLOCK_DIAGRAM__COMPONENTS:
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
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__PROTOCOLS,
				 HwProtocolFactory.eINSTANCE.createHwProtocol()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__CONNECTIONS,
				 HwCommunicationFactory.eINSTANCE.createHwConnection()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwComputingFactory.eINSTANCE.createHwComputingResource()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwComputingFactory.eINSTANCE.createHwProcessor()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwComputingFactory.eINSTANCE.createHwISA()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwComputingFactory.eINSTANCE.createHwBranchPredictor()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwComputingFactory.eINSTANCE.createHwASIC()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwComputingFactory.eINSTANCE.createHwPLD()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwComputingFactory.eINSTANCE.createHwMCU()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwCommunicationFactory.eINSTANCE.createHwCommunicationResource()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwCommunicationFactory.eINSTANCE.createHwArbiter()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwCommunicationFactory.eINSTANCE.createHwMedia()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwCommunicationFactory.eINSTANCE.createHwBus()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwCommunicationFactory.eINSTANCE.createHwBridge()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwCommunicationFactory.eINSTANCE.createHwEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwCommunicationFactory.eINSTANCE.createHwPort()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwCommunicationFactory.eINSTANCE.createHwConnection()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwStorageManagerFactory.eINSTANCE.createHwStorageManager()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwStorageManagerFactory.eINSTANCE.createHwDMA()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwStorageManagerFactory.eINSTANCE.createHwMMU()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwMemoryFactory.eINSTANCE.createHwMemory()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwMemoryFactory.eINSTANCE.createHwRAM()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwMemoryFactory.eINSTANCE.createHwROM()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwMemoryFactory.eINSTANCE.createHwDrive()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwMemoryFactory.eINSTANCE.createHwCache()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwTimingFactory.eINSTANCE.createHwTimingResource()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwTimingFactory.eINSTANCE.createHwClock()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwTimingFactory.eINSTANCE.createHwTimer()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwDeviceFactory.eINSTANCE.createHwDevice()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwDeviceFactory.eINSTANCE.createHwI_O()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwDeviceFactory.eINSTANCE.createHwSupport()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwDeviceFactory.eINSTANCE.createHWActuator()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwDeviceFactory.eINSTANCE.createHWSensor()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwDeviceFactory.eINSTANCE.createHwPeripheral()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwGeneralFactory.eINSTANCE.createHwResource()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwLayoutFactory.eINSTANCE.createHwComponent()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwPowerFactory.eINSTANCE.createHwPowerSupply()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwPowerFactory.eINSTANCE.createHwCoolingSupply()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwIOFactory.eINSTANCE.createHwPin()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwIOFactory.eINSTANCE.createHwLine()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwRegisterFactory.eINSTANCE.createHwRegister()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwPackageFactory.eINSTANCE.createHwPackagePin()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS,
				 HwPackageFactory.eINSTANCE.createHwWire()));
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
			childFeature == HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__CONNECTIONS ||
			childFeature == HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM__COMPONENTS;

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
