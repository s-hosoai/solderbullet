/**
 */
package MARTE.MARTE_AnalysisModel.PAM.provider;


import MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;

import MARTE.MARTE_AnalysisModel.GQAM.provider.GaStepItemProvider;

import MARTE.MARTE_AnalysisModel.PAM.PAMPackage;
import MARTE.MARTE_AnalysisModel.PAM.PaResPassStep;

import MARTE.MARTE_Foundations.GRM.GRMPackage;

import MARTE.MARTE_Foundations.NFPs.provider.MARTE_sbEditPlugin;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link MARTE.MARTE_AnalysisModel.PAM.PaResPassStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PaResPassStepItemProvider extends GaStepItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaResPassStepItemProvider(AdapterFactory adapterFactory) {
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

			addResourcePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PaResPassStep_resource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PaResPassStep_resource_feature", "_UI_PaResPassStep_type"),
				 PAMPackage.Literals.PA_RES_PASS_STEP__RESOURCE,
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
			childrenFeatures.add(PAMPackage.Literals.PA_RES_PASS_STEP__RES_UNITS);
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
	 * This returns PaResPassStep.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PaResPassStep"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_PaResPassStep_type");
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

		switch (notification.getFeatureID(PaResPassStep.class)) {
			case PAMPackage.PA_RES_PASS_STEP__RES_UNITS:
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
				(PAMPackage.Literals.PA_RES_PASS_STEP__RES_UNITS,
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
			childFeature == GRMPackage.Literals.RESOURCE_USAGE__ALLOCATED_MEMORY ||
			childFeature == GRMPackage.Literals.RESOURCE_USAGE__USED_MEMORY ||
			childFeature == GRMPackage.Literals.RESOURCE_USAGE__MSG_SIZE ||
			childFeature == GRMPackage.Literals.RESOURCE_USAGE__POWER_PEAK ||
			childFeature == GRMPackage.Literals.RESOURCE_USAGE__ENERGY ||
			childFeature == GQAMPackage.Literals.GA_SCENARIO__THROUGHPUT ||
			childFeature == GQAMPackage.Literals.GA_STEP__IS_ATOMIC ||
			childFeature == GQAMPackage.Literals.GA_STEP__PRIORITY ||
			childFeature == PAMPackage.Literals.PA_RES_PASS_STEP__RES_UNITS;

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