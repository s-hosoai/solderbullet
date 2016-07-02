/**
 */
package MARTE.MARTE_DesignModel.HLAM.provider;


import MARTE.MARTE_DesignModel.HLAM.HLAMPackage;
import MARTE.MARTE_DesignModel.HLAM.RtSpecification;

import MARTE.MARTE_Foundations.NFPs.provider.MARTE_sbEditPlugin;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesFactory;

import MARTE_Library.MARTE_DataTypes.MARTE_DataTypesFactory;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link MARTE.MARTE_DesignModel.HLAM.RtSpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RtSpecificationItemProvider 
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
	public RtSpecificationItemProvider(AdapterFactory adapterFactory) {
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

			addTRefPropertyDescriptor(object);
			addBase_CommentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the TRef feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RtSpecification_tRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RtSpecification_tRef_feature", "_UI_RtSpecification_type"),
				 HLAMPackage.Literals.RT_SPECIFICATION__TREF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBase_CommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RtSpecification_base_Comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RtSpecification_base_Comment_feature", "_UI_RtSpecification_type"),
				 HLAMPackage.Literals.RT_SPECIFICATION__BASE_COMMENT,
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
			childrenFeatures.add(HLAMPackage.Literals.RT_SPECIFICATION__UTILITY);
			childrenFeatures.add(HLAMPackage.Literals.RT_SPECIFICATION__OCC_KIND);
			childrenFeatures.add(HLAMPackage.Literals.RT_SPECIFICATION__REL_DL);
			childrenFeatures.add(HLAMPackage.Literals.RT_SPECIFICATION__ABS_DL);
			childrenFeatures.add(HLAMPackage.Literals.RT_SPECIFICATION__BOUND_DL);
			childrenFeatures.add(HLAMPackage.Literals.RT_SPECIFICATION__RD_TIME);
			childrenFeatures.add(HLAMPackage.Literals.RT_SPECIFICATION__MISS);
			childrenFeatures.add(HLAMPackage.Literals.RT_SPECIFICATION__PRIORITY);
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
	 * This returns RtSpecification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RtSpecification"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_RtSpecification_type");
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

		switch (notification.getFeatureID(RtSpecification.class)) {
			case HLAMPackage.RT_SPECIFICATION__UTILITY:
			case HLAMPackage.RT_SPECIFICATION__OCC_KIND:
			case HLAMPackage.RT_SPECIFICATION__REL_DL:
			case HLAMPackage.RT_SPECIFICATION__ABS_DL:
			case HLAMPackage.RT_SPECIFICATION__BOUND_DL:
			case HLAMPackage.RT_SPECIFICATION__RD_TIME:
			case HLAMPackage.RT_SPECIFICATION__MISS:
			case HLAMPackage.RT_SPECIFICATION__PRIORITY:
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
				(HLAMPackage.Literals.RT_SPECIFICATION__UTILITY,
				 MARTE_DataTypesFactory.eINSTANCE.createUtilityType()));

		newChildDescriptors.add
			(createChildParameter
				(HLAMPackage.Literals.RT_SPECIFICATION__OCC_KIND,
				 BasicNFP_TypesFactory.eINSTANCE.createArrivalPattern()));

		newChildDescriptors.add
			(createChildParameter
				(HLAMPackage.Literals.RT_SPECIFICATION__REL_DL,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(HLAMPackage.Literals.RT_SPECIFICATION__ABS_DL,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DateTime()));

		newChildDescriptors.add
			(createChildParameter
				(HLAMPackage.Literals.RT_SPECIFICATION__BOUND_DL,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(HLAMPackage.Literals.RT_SPECIFICATION__RD_TIME,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(HLAMPackage.Literals.RT_SPECIFICATION__MISS,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Percentage()));

		newChildDescriptors.add
			(createChildParameter
				(HLAMPackage.Literals.RT_SPECIFICATION__PRIORITY,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Integer()));
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
			childFeature == HLAMPackage.Literals.RT_SPECIFICATION__UTILITY ||
			childFeature == HLAMPackage.Literals.RT_SPECIFICATION__OCC_KIND ||
			childFeature == HLAMPackage.Literals.RT_SPECIFICATION__REL_DL ||
			childFeature == HLAMPackage.Literals.RT_SPECIFICATION__BOUND_DL ||
			childFeature == HLAMPackage.Literals.RT_SPECIFICATION__RD_TIME ||
			childFeature == HLAMPackage.Literals.RT_SPECIFICATION__ABS_DL ||
			childFeature == HLAMPackage.Literals.RT_SPECIFICATION__MISS ||
			childFeature == HLAMPackage.Literals.RT_SPECIFICATION__PRIORITY;

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
