/**
 */
package MARTE.MARTE_AnalysisModel.SAM.provider;


import MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;

import MARTE.MARTE_AnalysisModel.GQAM.provider.GaCommStepItemProvider;

import MARTE.MARTE_AnalysisModel.SAM.SAMPackage;
import MARTE.MARTE_AnalysisModel.SAM.SaCommStep;

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
 * This is the item provider adapter for a {@link MARTE.MARTE_AnalysisModel.SAM.SaCommStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SaCommStepItemProvider extends GaCommStepItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaCommStepItemProvider(AdapterFactory adapterFactory) {
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

			addBase_BehavioralFeaturePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Base Behavioral Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBase_BehavioralFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SaCommStep_base_BehavioralFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SaCommStep_base_BehavioralFeature_feature", "_UI_SaCommStep_type"),
				 SAMPackage.Literals.SA_COMM_STEP__BASE_BEHAVIORAL_FEATURE,
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
			childrenFeatures.add(SAMPackage.Literals.SA_COMM_STEP__DEADLINE);
			childrenFeatures.add(SAMPackage.Literals.SA_COMM_STEP__SPARE_CAP);
			childrenFeatures.add(SAMPackage.Literals.SA_COMM_STEP__SCH_SLACK);
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
	 * This returns SaCommStep.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SaCommStep"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_SaCommStep_type");
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

		switch (notification.getFeatureID(SaCommStep.class)) {
			case SAMPackage.SA_COMM_STEP__DEADLINE:
			case SAMPackage.SA_COMM_STEP__SPARE_CAP:
			case SAMPackage.SA_COMM_STEP__SCH_SLACK:
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
				(SAMPackage.Literals.SA_COMM_STEP__DEADLINE,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_STEP__SPARE_CAP,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_STEP__SCH_SLACK,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Real()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_STEP__SCH_SLACK,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Frequency()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_STEP__SCH_SLACK,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataTxRate()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_STEP__SCH_SLACK,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Power()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_STEP__SCH_SLACK,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataSize()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_STEP__SCH_SLACK,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Energy()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_STEP__SCH_SLACK,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Length()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_STEP__SCH_SLACK,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Area()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_STEP__SCH_SLACK,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Percentage()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_STEP__SCH_SLACK,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Price()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_STEP__SCH_SLACK,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Weight()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_STEP__SCH_SLACK,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));
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
			childFeature == SAMPackage.Literals.SA_COMM_STEP__DEADLINE ||
			childFeature == SAMPackage.Literals.SA_COMM_STEP__SPARE_CAP ||
			childFeature == SAMPackage.Literals.SA_COMM_STEP__SCH_SLACK ||
			childFeature == GRMPackage.Literals.RESOURCE_USAGE__ALLOCATED_MEMORY ||
			childFeature == GRMPackage.Literals.RESOURCE_USAGE__USED_MEMORY ||
			childFeature == GRMPackage.Literals.RESOURCE_USAGE__MSG_SIZE ||
			childFeature == GRMPackage.Literals.RESOURCE_USAGE__POWER_PEAK ||
			childFeature == GRMPackage.Literals.RESOURCE_USAGE__ENERGY ||
			childFeature == GQAMPackage.Literals.GA_SCENARIO__THROUGHPUT ||
			childFeature == GQAMPackage.Literals.GA_STEP__IS_ATOMIC ||
			childFeature == GQAMPackage.Literals.GA_STEP__PRIORITY;

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
