/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.provider;


import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.provider.HwEndPointItemProvider;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwIOPackage;
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin;

import MARTE.MARTE_Foundations.GRM.GRMPackage;

import MARTE.MARTE_Foundations.NFPs.provider.MARTE_sbEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;

/**
 * This is the item provider adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HwPinItemProvider extends HwEndPointItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPinItemProvider(AdapterFactory adapterFactory) {
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

			addPkgPinPropertyDescriptor(object);
			addLinesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Pkg Pin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPkgPinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HwPin_pkgPin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HwPin_pkgPin_feature", "_UI_HwPin_type"),
				 HwIOPackage.Literals.HW_PIN__PKG_PIN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lines feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HwPin_lines_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HwPin_lines_feature", "_UI_HwPin_type"),
				 HwIOPackage.Literals.HW_PIN__LINES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns HwPin.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HwPin"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((HwPin)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HwPin_type") :
			getString("_UI_HwPin_type") + " " + label;
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
			childFeature == GRMPackage.Literals.COMMUNICATION_END_POINT__PACKET_SIZE ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__DESCRIPTION ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__END_POINTS ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__FREQUENCY;

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
