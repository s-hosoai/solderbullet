/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.provider;


import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryFactory;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage;

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
 * This is the item provider adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HwCacheItemProvider extends HwMemoryItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwCacheItemProvider(AdapterFactory adapterFactory) {
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
			addRepl_PolicyPropertyDescriptor(object);
			addWritePolicyPropertyDescriptor(object);
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
				 getString("_UI_HwCache_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HwCache_type_feature", "_UI_HwCache_type"),
				 HwMemoryPackage.Literals.HW_CACHE__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Repl Policy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepl_PolicyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HwCache_repl_Policy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HwCache_repl_Policy_feature", "_UI_HwCache_type"),
				 HwMemoryPackage.Literals.HW_CACHE__REPL_POLICY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Write Policy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWritePolicyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HwCache_writePolicy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HwCache_writePolicy_feature", "_UI_HwCache_type"),
				 HwMemoryPackage.Literals.HW_CACHE__WRITE_POLICY,
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
			childrenFeatures.add(HwMemoryPackage.Literals.HW_CACHE__LEVEL);
			childrenFeatures.add(HwMemoryPackage.Literals.HW_CACHE__STRUCTURE);
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
	 * This returns HwCache.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HwCache"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((HwCache)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HwCache_type") :
			getString("_UI_HwCache_type") + " " + label;
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

		switch (notification.getFeatureID(HwCache.class)) {
			case HwMemoryPackage.HW_CACHE__TYPE:
			case HwMemoryPackage.HW_CACHE__REPL_POLICY:
			case HwMemoryPackage.HW_CACHE__WRITE_POLICY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case HwMemoryPackage.HW_CACHE__LEVEL:
			case HwMemoryPackage.HW_CACHE__STRUCTURE:
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
				(HwMemoryPackage.Literals.HW_CACHE__LEVEL,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Natural()));

		newChildDescriptors.add
			(createChildParameter
				(HwMemoryPackage.Literals.HW_CACHE__STRUCTURE,
				 HwMemoryFactory.eINSTANCE.createCacheStructure()));
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
			childFeature == GRMPackage.Literals.STORAGE_RESOURCE__ELEMENT_SIZE ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__DESCRIPTION ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__END_POINTS ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__FREQUENCY ||
			childFeature == HwMemoryPackage.Literals.HW_MEMORY__MEMORY_SIZE ||
			childFeature == HwMemoryPackage.Literals.HW_MEMORY__ADRESS_SIZE ||
			childFeature == HwMemoryPackage.Literals.HW_MEMORY__THROUGHPUT ||
			childFeature == HwMemoryPackage.Literals.HW_CACHE__LEVEL;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
