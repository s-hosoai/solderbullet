/**
 */
package MARTE.MARTE_AnalysisModel.GQAM.provider;


import MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;
import MARTE.MARTE_AnalysisModel.GQAM.GaExecHost;

import MARTE.MARTE_Foundations.GRM.GRMPackage;

import MARTE.MARTE_Foundations.GRM.provider.SchedulerItemProvider;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link MARTE.MARTE_AnalysisModel.GQAM.GaExecHost} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GaExecHostItemProvider extends SchedulerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaExecHostItemProvider(AdapterFactory adapterFactory) {
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

			addMainSchedulerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Main Scheduler feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMainSchedulerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessingResource_mainScheduler_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessingResource_mainScheduler_feature", "_UI_ProcessingResource_type"),
				 GRMPackage.Literals.PROCESSING_RESOURCE__MAIN_SCHEDULER,
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
			childrenFeatures.add(GRMPackage.Literals.PROCESSING_RESOURCE__SPEED_FACTOR);
			childrenFeatures.add(GQAMPackage.Literals.GA_EXEC_HOST__COMM_TX_OVH);
			childrenFeatures.add(GQAMPackage.Literals.GA_EXEC_HOST__COMM_RCV_OVH);
			childrenFeatures.add(GQAMPackage.Literals.GA_EXEC_HOST__CNTXT_SW_T);
			childrenFeatures.add(GQAMPackage.Literals.GA_EXEC_HOST__CLOCK_OVH);
			childrenFeatures.add(GQAMPackage.Literals.GA_EXEC_HOST__SCHED_PRI_RANGE);
			childrenFeatures.add(GQAMPackage.Literals.GA_EXEC_HOST__MEM_SIZE);
			childrenFeatures.add(GQAMPackage.Literals.GA_EXEC_HOST__UTILIZATION);
			childrenFeatures.add(GQAMPackage.Literals.GA_EXEC_HOST__THROUGHPUT);
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
	 * This returns GaExecHost.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GaExecHost"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		Boolean labelValue = ((GaExecHost)object).getIsProtected();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_GaExecHost_type") :
			getString("_UI_GaExecHost_type") + " " + label;
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

		switch (notification.getFeatureID(GaExecHost.class)) {
			case GQAMPackage.GA_EXEC_HOST__SPEED_FACTOR:
			case GQAMPackage.GA_EXEC_HOST__COMM_TX_OVH:
			case GQAMPackage.GA_EXEC_HOST__COMM_RCV_OVH:
			case GQAMPackage.GA_EXEC_HOST__CNTXT_SW_T:
			case GQAMPackage.GA_EXEC_HOST__CLOCK_OVH:
			case GQAMPackage.GA_EXEC_HOST__SCHED_PRI_RANGE:
			case GQAMPackage.GA_EXEC_HOST__MEM_SIZE:
			case GQAMPackage.GA_EXEC_HOST__UTILIZATION:
			case GQAMPackage.GA_EXEC_HOST__THROUGHPUT:
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
				(GRMPackage.Literals.PROCESSING_RESOURCE__SPEED_FACTOR,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Real()));

		newChildDescriptors.add
			(createChildParameter
				(GRMPackage.Literals.PROCESSING_RESOURCE__SPEED_FACTOR,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Frequency()));

		newChildDescriptors.add
			(createChildParameter
				(GRMPackage.Literals.PROCESSING_RESOURCE__SPEED_FACTOR,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataTxRate()));

		newChildDescriptors.add
			(createChildParameter
				(GRMPackage.Literals.PROCESSING_RESOURCE__SPEED_FACTOR,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Power()));

		newChildDescriptors.add
			(createChildParameter
				(GRMPackage.Literals.PROCESSING_RESOURCE__SPEED_FACTOR,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataSize()));

		newChildDescriptors.add
			(createChildParameter
				(GRMPackage.Literals.PROCESSING_RESOURCE__SPEED_FACTOR,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Energy()));

		newChildDescriptors.add
			(createChildParameter
				(GRMPackage.Literals.PROCESSING_RESOURCE__SPEED_FACTOR,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Length()));

		newChildDescriptors.add
			(createChildParameter
				(GRMPackage.Literals.PROCESSING_RESOURCE__SPEED_FACTOR,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Area()));

		newChildDescriptors.add
			(createChildParameter
				(GRMPackage.Literals.PROCESSING_RESOURCE__SPEED_FACTOR,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Percentage()));

		newChildDescriptors.add
			(createChildParameter
				(GRMPackage.Literals.PROCESSING_RESOURCE__SPEED_FACTOR,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Price()));

		newChildDescriptors.add
			(createChildParameter
				(GRMPackage.Literals.PROCESSING_RESOURCE__SPEED_FACTOR,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Weight()));

		newChildDescriptors.add
			(createChildParameter
				(GRMPackage.Literals.PROCESSING_RESOURCE__SPEED_FACTOR,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_EXEC_HOST__COMM_TX_OVH,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_EXEC_HOST__COMM_RCV_OVH,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_EXEC_HOST__CNTXT_SW_T,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_EXEC_HOST__CLOCK_OVH,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_EXEC_HOST__SCHED_PRI_RANGE,
				 MARTE_DataTypesFactory.eINSTANCE.createIntegerInterval()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_EXEC_HOST__MEM_SIZE,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataSize()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_EXEC_HOST__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Real()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_EXEC_HOST__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Frequency()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_EXEC_HOST__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataTxRate()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_EXEC_HOST__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Power()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_EXEC_HOST__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataSize()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_EXEC_HOST__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Energy()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_EXEC_HOST__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Length()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_EXEC_HOST__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Area()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_EXEC_HOST__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Percentage()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_EXEC_HOST__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Price()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_EXEC_HOST__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Weight()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_EXEC_HOST__UTILIZATION,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Duration()));

		newChildDescriptors.add
			(createChildParameter
				(GQAMPackage.Literals.GA_EXEC_HOST__THROUGHPUT,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Frequency()));
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
			childFeature == GRMPackage.Literals.PROCESSING_RESOURCE__SPEED_FACTOR ||
			childFeature == GQAMPackage.Literals.GA_EXEC_HOST__UTILIZATION ||
			childFeature == GQAMPackage.Literals.GA_EXEC_HOST__THROUGHPUT ||
			childFeature == GQAMPackage.Literals.GA_EXEC_HOST__MEM_SIZE ||
			childFeature == GQAMPackage.Literals.GA_EXEC_HOST__COMM_TX_OVH ||
			childFeature == GQAMPackage.Literals.GA_EXEC_HOST__COMM_RCV_OVH ||
			childFeature == GQAMPackage.Literals.GA_EXEC_HOST__CNTXT_SW_T ||
			childFeature == GQAMPackage.Literals.GA_EXEC_HOST__CLOCK_OVH ||
			childFeature == GQAMPackage.Literals.GA_EXEC_HOST__SCHED_PRI_RANGE;

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
