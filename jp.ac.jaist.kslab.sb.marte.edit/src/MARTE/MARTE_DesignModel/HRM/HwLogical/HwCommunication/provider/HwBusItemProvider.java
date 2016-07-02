/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.provider;


import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBus;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage;

import MARTE.MARTE_Foundations.GRM.GRMPackage;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBus} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HwBusItemProvider extends HwMediaItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwBusItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(HwCommunicationPackage.Literals.HW_BUS__ADRESS_WIDTH);
			childrenFeatures.add(HwCommunicationPackage.Literals.HW_BUS__WORD_WIDTH);
			childrenFeatures.add(HwCommunicationPackage.Literals.HW_BUS__IS_SYNCHRONOUS);
			childrenFeatures.add(HwCommunicationPackage.Literals.HW_BUS__IS_SERIAL);
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
	 * This returns HwBus.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HwBus"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((HwBus)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HwBus_type") :
			getString("_UI_HwBus_type") + " " + label;
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

		switch (notification.getFeatureID(HwBus.class)) {
			case HwCommunicationPackage.HW_BUS__ADRESS_WIDTH:
			case HwCommunicationPackage.HW_BUS__WORD_WIDTH:
			case HwCommunicationPackage.HW_BUS__IS_SYNCHRONOUS:
			case HwCommunicationPackage.HW_BUS__IS_SERIAL:
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
				(HwCommunicationPackage.Literals.HW_BUS__ADRESS_WIDTH,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataSize()));

		newChildDescriptors.add
			(createChildParameter
				(HwCommunicationPackage.Literals.HW_BUS__WORD_WIDTH,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataSize()));

		newChildDescriptors.add
			(createChildParameter
				(HwCommunicationPackage.Literals.HW_BUS__IS_SYNCHRONOUS,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Boolean()));

		newChildDescriptors.add
			(createChildParameter
				(HwCommunicationPackage.Literals.HW_BUS__IS_SERIAL,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Boolean()));
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
			childFeature == HwCommunicationPackage.Literals.HW_BUS__ADRESS_WIDTH ||
			childFeature == HwCommunicationPackage.Literals.HW_BUS__WORD_WIDTH ||
			childFeature == GRMPackage.Literals.COMMUNICATION_MEDIA__BLOCK_T ||
			childFeature == GRMPackage.Literals.COMMUNICATION_MEDIA__PACKET_T ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__DESCRIPTION ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__END_POINTS ||
			childFeature == HwCommunicationPackage.Literals.HW_BUS__IS_SYNCHRONOUS ||
			childFeature == HwCommunicationPackage.Literals.HW_BUS__IS_SERIAL;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
