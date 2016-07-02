/**
 */
package MARTE.MARTE_AnalysisModel.PAM.provider;


import MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;

import MARTE.MARTE_AnalysisModel.PAM.PAMPackage;

import MARTE.MARTE_Foundations.GRM.GRMPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;

/**
 * This is the item provider adapter for a {@link MARTE.MARTE_AnalysisModel.PAM.PaRequestedStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PaRequestedStepItemProvider extends PaStepItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaRequestedStepItemProvider(AdapterFactory adapterFactory) {
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

			addBase_OperationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Base Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBase_OperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GaRequestedService_base_Operation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GaRequestedService_base_Operation_feature", "_UI_GaRequestedService_type"),
				 GQAMPackage.Literals.GA_REQUESTED_SERVICE__BASE_OPERATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns PaRequestedStep.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PaRequestedStep"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_PaRequestedStep_type");
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
			childFeature == GRMPackage.Literals.RESOURCE_USAGE__EXEC_TIME ||
			childFeature == GQAMPackage.Literals.GA_SCENARIO__HOST_DEMAND ||
			childFeature == GQAMPackage.Literals.GA_SCENARIO__HOST_DEMAND_OPS ||
			childFeature == GQAMPackage.Literals.GA_SCENARIO__INTER_OCC_T ||
			childFeature == GQAMPackage.Literals.GA_SCENARIO__RESP_T ||
			childFeature == GQAMPackage.Literals.GA_SCENARIO__UTILIZATION ||
			childFeature == GQAMPackage.Literals.GA_SCENARIO__UTILIZATION_ON_HOST ||
			childFeature == GQAMPackage.Literals.GA_STEP__BLOCK_T ||
			childFeature == GQAMPackage.Literals.GA_STEP__REP ||
			childFeature == GQAMPackage.Literals.GA_STEP__PROB ||
			childFeature == GQAMPackage.Literals.GA_STEP__SERV_COUNT ||
			childFeature == GQAMPackage.Literals.GA_STEP__SELF_DELAY ||
			childFeature == PAMPackage.Literals.PA_STEP__EXT_OP_COUNT ||
			childFeature == PAMPackage.Literals.PA_STEP__BEHAV_COUNT ||
			childFeature == GRMPackage.Literals.RESOURCE_USAGE__ALLOCATED_MEMORY ||
			childFeature == GRMPackage.Literals.RESOURCE_USAGE__USED_MEMORY ||
			childFeature == GRMPackage.Literals.RESOURCE_USAGE__MSG_SIZE ||
			childFeature == GRMPackage.Literals.RESOURCE_USAGE__POWER_PEAK ||
			childFeature == GRMPackage.Literals.RESOURCE_USAGE__ENERGY ||
			childFeature == GQAMPackage.Literals.GA_SCENARIO__THROUGHPUT ||
			childFeature == GQAMPackage.Literals.GA_STEP__IS_ATOMIC ||
			childFeature == PAMPackage.Literals.PA_STEP__NO_SYNC ||
			childFeature == GQAMPackage.Literals.GA_STEP__PRIORITY;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
