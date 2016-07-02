/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.provider;


import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingFactory;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryFactory;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerFactory;

import MARTE.MARTE_Foundations.GRM.GRMPackage;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HwProcessorItemProvider extends HwComputingResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwProcessorItemProvider(AdapterFactory adapterFactory) {
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

			addArchitecturePropertyDescriptor(object);
			addIpcPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Architecture feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArchitecturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HwProcessor_architecture_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HwProcessor_architecture_feature", "_UI_HwProcessor_type"),
				 HwComputingPackage.Literals.HW_PROCESSOR__ARCHITECTURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ipc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIpcPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HwProcessor_ipc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HwProcessor_ipc_feature", "_UI_HwProcessor_type"),
				 HwComputingPackage.Literals.HW_PROCESSOR__IPC,
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
			childrenFeatures.add(HwComputingPackage.Literals.HW_PROCESSOR__MIPS);
			childrenFeatures.add(HwComputingPackage.Literals.HW_PROCESSOR__NB_CORES);
			childrenFeatures.add(HwComputingPackage.Literals.HW_PROCESSOR__NB_PIPELINES);
			childrenFeatures.add(HwComputingPackage.Literals.HW_PROCESSOR__NB_STAGES);
			childrenFeatures.add(HwComputingPackage.Literals.HW_PROCESSOR__NB_AL_US);
			childrenFeatures.add(HwComputingPackage.Literals.HW_PROCESSOR__NB_FP_US);
			childrenFeatures.add(HwComputingPackage.Literals.HW_PROCESSOR__OWNED_IS_AS);
			childrenFeatures.add(HwComputingPackage.Literals.HW_PROCESSOR__PREDICTORS);
			childrenFeatures.add(HwComputingPackage.Literals.HW_PROCESSOR__CACHES);
			childrenFeatures.add(HwComputingPackage.Literals.HW_PROCESSOR__OWNED_MM_US);
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
	 * This returns HwProcessor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HwProcessor"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((HwProcessor)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HwProcessor_type") :
			getString("_UI_HwProcessor_type") + " " + label;
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

		switch (notification.getFeatureID(HwProcessor.class)) {
			case HwComputingPackage.HW_PROCESSOR__MIPS:
			case HwComputingPackage.HW_PROCESSOR__NB_CORES:
			case HwComputingPackage.HW_PROCESSOR__NB_PIPELINES:
			case HwComputingPackage.HW_PROCESSOR__NB_STAGES:
			case HwComputingPackage.HW_PROCESSOR__NB_AL_US:
			case HwComputingPackage.HW_PROCESSOR__NB_FP_US:
			case HwComputingPackage.HW_PROCESSOR__OWNED_IS_AS:
			case HwComputingPackage.HW_PROCESSOR__PREDICTORS:
			case HwComputingPackage.HW_PROCESSOR__CACHES:
			case HwComputingPackage.HW_PROCESSOR__OWNED_MM_US:
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
				(HwComputingPackage.Literals.HW_PROCESSOR__MIPS,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Natural()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_PROCESSOR__NB_CORES,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Natural()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_PROCESSOR__NB_PIPELINES,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Natural()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_PROCESSOR__NB_STAGES,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Natural()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_PROCESSOR__NB_AL_US,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Natural()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_PROCESSOR__NB_FP_US,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Natural()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_PROCESSOR__OWNED_IS_AS,
				 HwComputingFactory.eINSTANCE.createHwISA()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_PROCESSOR__PREDICTORS,
				 HwComputingFactory.eINSTANCE.createHwBranchPredictor()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_PROCESSOR__CACHES,
				 HwMemoryFactory.eINSTANCE.createHwCache()));

		newChildDescriptors.add
			(createChildParameter
				(HwComputingPackage.Literals.HW_PROCESSOR__OWNED_MM_US,
				 HwStorageManagerFactory.eINSTANCE.createHwMMU()));
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
			childFeature == HwComputingPackage.Literals.HW_PROCESSOR__OWNED_IS_AS ||
			childFeature == HwComputingPackage.Literals.HW_PROCESSOR__PREDICTORS ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__END_POINTS ||
			childFeature == HwComputingPackage.Literals.HW_PROCESSOR__OWNED_MM_US ||
			childFeature == HwComputingPackage.Literals.HW_PROCESSOR__CACHES ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__FREQUENCY ||
			childFeature == GRMPackage.Literals.PROCESSING_RESOURCE__SPEED_FACTOR ||
			childFeature == HwComputingPackage.Literals.HW_COMPUTING_RESOURCE__OP_FREQUENCIES ||
			childFeature == HwComputingPackage.Literals.HW_PROCESSOR__MIPS ||
			childFeature == HwComputingPackage.Literals.HW_PROCESSOR__NB_CORES ||
			childFeature == HwComputingPackage.Literals.HW_PROCESSOR__NB_PIPELINES ||
			childFeature == HwComputingPackage.Literals.HW_PROCESSOR__NB_STAGES ||
			childFeature == HwComputingPackage.Literals.HW_PROCESSOR__NB_AL_US ||
			childFeature == HwComputingPackage.Literals.HW_PROCESSOR__NB_FP_US;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
