/**
 */
package MARTE.MARTE_DesignModel.HRM.HwDiagram.provider;


import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage;
import MARTE.MARTE_DesignModel.HRM.HwDiagram.SRMDiagram;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralFactory;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationFactory;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingFactory;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDeviceFactory;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryFactory;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerFactory;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwTimingFactory;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutFactory;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerFactory;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwIOFactory;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackageFactory;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegisterFactory;

import MARTE.MARTE_DesignModel.SRM.SW_Brokering.SW_BrokeringFactory;

import MARTE.MARTE_Foundations.NFPs.provider.MARTE_sbEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwDiagram.SRMDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SRMDiagramItemProvider 
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
	public SRMDiagramItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(HwDiagramPackage.Literals.SRM_DIAGRAM__DEVICES);
			childrenFeatures.add(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS);
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
	 * This returns SRMDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SRMDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_SRMDiagram_type");
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

		switch (notification.getFeatureID(SRMDiagram.class)) {
			case HwDiagramPackage.SRM_DIAGRAM__DEVICES:
			case HwDiagramPackage.SRM_DIAGRAM__HWCOMPONENTS:
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
				(HwDiagramPackage.Literals.SRM_DIAGRAM__DEVICES,
				 SW_BrokeringFactory.eINSTANCE.createDeviceBroker()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwComputingFactory.eINSTANCE.createHwComputingResource()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwComputingFactory.eINSTANCE.createHwProcessor()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwComputingFactory.eINSTANCE.createHwISA()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwComputingFactory.eINSTANCE.createHwBranchPredictor()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwComputingFactory.eINSTANCE.createHwASIC()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwComputingFactory.eINSTANCE.createHwPLD()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwComputingFactory.eINSTANCE.createHwMCU()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwCommunicationFactory.eINSTANCE.createHwCommunicationResource()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwCommunicationFactory.eINSTANCE.createHwArbiter()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwCommunicationFactory.eINSTANCE.createHwMedia()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwCommunicationFactory.eINSTANCE.createHwBus()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwCommunicationFactory.eINSTANCE.createHwBridge()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwCommunicationFactory.eINSTANCE.createHwEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwCommunicationFactory.eINSTANCE.createHwPort()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwCommunicationFactory.eINSTANCE.createHwConnection()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwStorageManagerFactory.eINSTANCE.createHwStorageManager()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwStorageManagerFactory.eINSTANCE.createHwDMA()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwStorageManagerFactory.eINSTANCE.createHwMMU()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwMemoryFactory.eINSTANCE.createHwMemory()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwMemoryFactory.eINSTANCE.createHwRAM()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwMemoryFactory.eINSTANCE.createHwROM()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwMemoryFactory.eINSTANCE.createHwDrive()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwMemoryFactory.eINSTANCE.createHwCache()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwTimingFactory.eINSTANCE.createHwTimingResource()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwTimingFactory.eINSTANCE.createHwClock()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwTimingFactory.eINSTANCE.createHwTimer()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwDeviceFactory.eINSTANCE.createHwDevice()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwDeviceFactory.eINSTANCE.createHwI_O()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwDeviceFactory.eINSTANCE.createHwSupport()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwDeviceFactory.eINSTANCE.createHWActuator()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwDeviceFactory.eINSTANCE.createHWSensor()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwDeviceFactory.eINSTANCE.createHwPeripheral()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwGeneralFactory.eINSTANCE.createHwResource()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwLayoutFactory.eINSTANCE.createHwComponent()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwPowerFactory.eINSTANCE.createHwPowerSupply()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwPowerFactory.eINSTANCE.createHwCoolingSupply()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwIOFactory.eINSTANCE.createHwPin()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwIOFactory.eINSTANCE.createHwLine()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwRegisterFactory.eINSTANCE.createHwRegister()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwPackageFactory.eINSTANCE.createHwPackagePin()));

		newChildDescriptors.add
			(createChildParameter
				(HwDiagramPackage.Literals.SRM_DIAGRAM__HWCOMPONENTS,
				 HwPackageFactory.eINSTANCE.createHwWire()));
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
