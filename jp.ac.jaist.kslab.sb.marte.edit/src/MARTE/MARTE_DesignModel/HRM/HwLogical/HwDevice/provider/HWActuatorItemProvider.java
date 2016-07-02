/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.provider;


import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HWActuator;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage;

import MARTE.MARTE_Foundations.GRM.GRMPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

/**
 * This is the item provider adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HWActuator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HWActuatorItemProvider extends HwI_OItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWActuatorItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns HWActuator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HWActuator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((HWActuator)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HWActuator_type") :
			getString("_UI_HWActuator_type") + " " + label;
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
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__DESCRIPTION ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__OWNED_HW ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__END_POINTS ||
			childFeature == HwDevicePackage.Literals.HW_DEVICE__PORTS ||
			childFeature == HwDevicePackage.Literals.HW_DEVICE__PINS ||
			childFeature == HwDevicePackage.Literals.HW_DEVICE__REGISTERS ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__FREQUENCY ||
			childFeature == GRMPackage.Literals.PROCESSING_RESOURCE__SPEED_FACTOR ||
			childFeature == HwGeneralPackage.Literals.HW_RESOURCE__OPERATIONS ||
			childFeature == HwDevicePackage.Literals.HW_DEVICE__FUNCTIONS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
