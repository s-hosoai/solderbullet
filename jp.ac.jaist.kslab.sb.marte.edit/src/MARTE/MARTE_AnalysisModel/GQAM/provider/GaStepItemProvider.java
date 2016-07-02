/**
 */
package MARTE.MARTE_AnalysisModel.GQAM.provider;


import MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;
import MARTE.MARTE_AnalysisModel.GQAM.GaStep;

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
 * This is the item provider adapter for a {@link MARTE.MARTE_AnalysisModel.GQAM.GaStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GaStepItemProvider extends GaScenarioItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaStepItemProvider(AdapterFactory adapterFactory) {
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

			addConcurResPropertyDescriptor(object);
			addHostPropertyDescriptor(object);
			addServDemandPropertyDescriptor(object);
			addBehaviorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Concur Res feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConcurResPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GaStep_concurRes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GaStep_concurRes_feature", "_UI_GaStep_type"),
				 GQAMPackage.Literals.GA_STEP__CONCUR_RES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GaStep_host_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GaStep_host_feature", "_UI_GaStep_type"),
				 GQAMPackage.Literals.GA_STEP__HOST,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Serv Demand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServDemandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GaStep_servDemand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GaStep_servDemand_feature", "_UI_GaStep_type"),
				 GQAMPackage.Literals.GA_STEP__SERV_DEMAND,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GaStep_behavior_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GaStep_behavior_feature", "_UI_GaStep_type"),
				 GQAMPackage.Literals.GA_STEP__BEHAVIOR,
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
			childrenFeatures.add(GQAMPackage.Literals.GA_STEP__IS_ATOMIC);
			childrenFeatures.add(GQAMPackage.Literals.GA_STEP__BLOCK_T);
			childrenFeatures.add(GQAMPackage.Literals.GA_STEP__REP);
			childrenFeatures.add(GQAMPackage.Literals.GA_STEP__PROB);
			childrenFeatures.add(GQAMPackage.Literals.GA_STEP__PRIORITY);
			childrenFeatures.add(GQAMPackage.Literals.GA_STEP__SERV_COUNT);
			childrenFeatures.add(GQAMPackage.Literals.GA_STEP__SELF_DELAY);
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
	 * This returns GaStep.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GaStep"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_GaStep_type");
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

		switch (notification.getFeatureID(GaStep.class)) {
			case GQAMPackage.GA_STEP__IS_ATOMIC:
			case GQAMPackage.GA_STEP__BLOCK_T:
			case GQAMPackage.GA_STEP__REP:
			case GQAMPackage.GA_STEP__PROB:
			case GQAMPackage.GA_STEP__PRIORITY:
			case GQAMPackage.GA_STEP__SERV_COUNT:
			case GQAMPackage.GA_STEP__SELF_DELAY:
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
				(GQAMPackage.Literals.GA_STEP__IS_ATOMIC,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Boolean()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__BLOCK_T,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__REP,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Real()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__REP,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Frequency()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__REP,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataTxRate()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__REP,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Power()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__REP,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataSize()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__REP,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Energy()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__REP,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Length()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__REP,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Area()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__REP,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Percentage()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__REP,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Price()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__REP,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Weight()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__REP,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__PROB,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Real()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__PROB,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Frequency()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__PROB,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataTxRate()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__PROB,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Power()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__PROB,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataSize()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__PROB,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Energy()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__PROB,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Length()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__PROB,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Area()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__PROB,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Percentage()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__PROB,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Price()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__PROB,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Weight()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__PROB,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__PRIORITY,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Integer()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__SERV_COUNT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Real()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__SERV_COUNT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Frequency()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__SERV_COUNT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataTxRate()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__SERV_COUNT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Power()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__SERV_COUNT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataSize()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__SERV_COUNT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Energy()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__SERV_COUNT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Length()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__SERV_COUNT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Area()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__SERV_COUNT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Percentage()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__SERV_COUNT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Price()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__SERV_COUNT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Weight()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__SERV_COUNT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_STEP__SELF_DELAY,
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

}
