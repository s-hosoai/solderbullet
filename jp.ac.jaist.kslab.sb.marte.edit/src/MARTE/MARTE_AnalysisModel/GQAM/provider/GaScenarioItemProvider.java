/**
 */
package MARTE.MARTE_AnalysisModel.GQAM.provider;


import MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;
import MARTE.MARTE_AnalysisModel.GQAM.GaScenario;

import MARTE.MARTE_Foundations.GRM.GRMPackage;

import MARTE.MARTE_Foundations.GRM.provider.ResourceUsageItemProvider;

import MARTE.MARTE_Foundations.NFPs.provider.MARTE_sbEditPlugin;

import MARTE.MARTE_Foundations.Time.TimePackage;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.UMLFactory;

/**
 * This is the item provider adapter for a {@link MARTE.MARTE_AnalysisModel.GQAM.GaScenario} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GaScenarioItemProvider extends ResourceUsageItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaScenarioItemProvider(AdapterFactory adapterFactory) {
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

			addOnPropertyDescriptor(object);
			addBase_ActionPropertyDescriptor(object);
			addBase_BehaviorPropertyDescriptor(object);
			addBase_MessagePropertyDescriptor(object);
			addStartPropertyDescriptor(object);
			addFinishPropertyDescriptor(object);
			addCausePropertyDescriptor(object);
			addRootPropertyDescriptor(object);
			addTimingPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimedElement_on_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimedElement_on_feature", "_UI_TimedElement_type"),
				 TimePackage.Literals.TIMED_ELEMENT__ON,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBase_ActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimedProcessing_base_Action_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimedProcessing_base_Action_feature", "_UI_TimedProcessing_type"),
				 TimePackage.Literals.TIMED_PROCESSING__BASE_ACTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBase_BehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimedProcessing_base_Behavior_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimedProcessing_base_Behavior_feature", "_UI_TimedProcessing_type"),
				 TimePackage.Literals.TIMED_PROCESSING__BASE_BEHAVIOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBase_MessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimedProcessing_base_Message_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimedProcessing_base_Message_feature", "_UI_TimedProcessing_type"),
				 TimePackage.Literals.TIMED_PROCESSING__BASE_MESSAGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimedProcessing_start_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimedProcessing_start_feature", "_UI_TimedProcessing_type"),
				 TimePackage.Literals.TIMED_PROCESSING__START,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Finish feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinishPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimedProcessing_finish_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimedProcessing_finish_feature", "_UI_TimedProcessing_type"),
				 TimePackage.Literals.TIMED_PROCESSING__FINISH,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cause feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCausePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GaScenario_cause_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GaScenario_cause_feature", "_UI_GaScenario_type"),
				 GQAMPackage.Literals.GA_SCENARIO__CAUSE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Root feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GaScenario_root_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GaScenario_root_feature", "_UI_GaScenario_type"),
				 GQAMPackage.Literals.GA_SCENARIO__ROOT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GaScenario_timing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GaScenario_timing_feature", "_UI_GaScenario_type"),
				 GQAMPackage.Literals.GA_SCENARIO__TIMING,
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
			childrenFeatures.add(TimePackage.Literals.TIMED_PROCESSING__DURATION);
			childrenFeatures.add(GQAMPackage.Literals.GA_SCENARIO__HOST_DEMAND);
			childrenFeatures.add(GQAMPackage.Literals.GA_SCENARIO__HOST_DEMAND_OPS);
			childrenFeatures.add(GQAMPackage.Literals.GA_SCENARIO__INTER_OCC_T);
			childrenFeatures.add(GQAMPackage.Literals.GA_SCENARIO__THROUGHPUT);
			childrenFeatures.add(GQAMPackage.Literals.GA_SCENARIO__RESP_T);
			childrenFeatures.add(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION);
			childrenFeatures.add(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION_ON_HOST);
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
	 * This returns GaScenario.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GaScenario"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_GaScenario_type");
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

		switch (notification.getFeatureID(GaScenario.class)) {
			case GQAMPackage.GA_SCENARIO__DURATION:
			case GQAMPackage.GA_SCENARIO__HOST_DEMAND:
			case GQAMPackage.GA_SCENARIO__HOST_DEMAND_OPS:
			case GQAMPackage.GA_SCENARIO__INTER_OCC_T:
			case GQAMPackage.GA_SCENARIO__THROUGHPUT:
			case GQAMPackage.GA_SCENARIO__RESP_T:
			case GQAMPackage.GA_SCENARIO__UTILIZATION:
			case GQAMPackage.GA_SCENARIO__UTILIZATION_ON_HOST:
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
				(TimePackage.Literals.TIMED_PROCESSING__DURATION,
				 UMLFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TimePackage.Literals.TIMED_PROCESSING__DURATION,
				 UMLFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TimePackage.Literals.TIMED_PROCESSING__DURATION,
				 UMLFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TimePackage.Literals.TIMED_PROCESSING__DURATION,
				 UMLFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(TimePackage.Literals.TIMED_PROCESSING__DURATION,
				 UMLFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TimePackage.Literals.TIMED_PROCESSING__DURATION,
				 UMLFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(TimePackage.Literals.TIMED_PROCESSING__DURATION,
				 UMLFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(TimePackage.Literals.TIMED_PROCESSING__DURATION,
				 UMLFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(TimePackage.Literals.TIMED_PROCESSING__DURATION,
				 UMLFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(TimePackage.Literals.TIMED_PROCESSING__DURATION,
				 UMLFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(TimePackage.Literals.TIMED_PROCESSING__DURATION,
				 UMLFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(TimePackage.Literals.TIMED_PROCESSING__DURATION,
				 UMLFactory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add
			(createChildParameter
				(TimePackage.Literals.TIMED_PROCESSING__DURATION,
				 UMLFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(TimePackage.Literals.TIMED_PROCESSING__DURATION,
				 UMLFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(TimePackage.Literals.TIMED_PROCESSING__DURATION,
				 UMLFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__HOST_DEMAND,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__HOST_DEMAND_OPS,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Real()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__HOST_DEMAND_OPS,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Frequency()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__HOST_DEMAND_OPS,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataTxRate()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__HOST_DEMAND_OPS,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Power()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__HOST_DEMAND_OPS,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataSize()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__HOST_DEMAND_OPS,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Energy()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__HOST_DEMAND_OPS,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Length()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__HOST_DEMAND_OPS,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Area()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__HOST_DEMAND_OPS,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Percentage()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__HOST_DEMAND_OPS,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Price()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__HOST_DEMAND_OPS,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Weight()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__HOST_DEMAND_OPS,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__INTER_OCC_T,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__THROUGHPUT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Frequency()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__RESP_T,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Real()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Frequency()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataTxRate()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Power()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataSize()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Energy()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Length()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Area()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Percentage()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Price()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Weight()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION_ON_HOST,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Real()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION_ON_HOST,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Frequency()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION_ON_HOST,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataTxRate()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION_ON_HOST,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Power()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION_ON_HOST,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataSize()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION_ON_HOST,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Energy()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION_ON_HOST,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Length()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION_ON_HOST,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Area()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION_ON_HOST,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Percentage()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION_ON_HOST,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Price()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION_ON_HOST,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Weight()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_SCENARIO__UTILIZATION_ON_HOST,
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
			childFeature == GRMPackage.Literals.RESOURCE_USAGE__ALLOCATED_MEMORY ||
			childFeature == GRMPackage.Literals.RESOURCE_USAGE__USED_MEMORY ||
			childFeature == GRMPackage.Literals.RESOURCE_USAGE__MSG_SIZE ||
			childFeature == GRMPackage.Literals.RESOURCE_USAGE__POWER_PEAK ||
			childFeature == GRMPackage.Literals.RESOURCE_USAGE__ENERGY ||
			childFeature == GQAMPackage.Literals.GA_SCENARIO__THROUGHPUT;

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
