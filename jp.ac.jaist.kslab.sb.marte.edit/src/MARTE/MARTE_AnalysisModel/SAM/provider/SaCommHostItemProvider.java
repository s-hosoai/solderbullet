/**
 */
package MARTE.MARTE_AnalysisModel.SAM.provider;


import MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;

import MARTE.MARTE_AnalysisModel.GQAM.provider.GaCommHostItemProvider;

import MARTE.MARTE_AnalysisModel.SAM.SAMPackage;
import MARTE.MARTE_AnalysisModel.SAM.SaCommHost;

import MARTE.MARTE_Foundations.GRM.GRMPackage;

import MARTE.MARTE_Foundations.NFPs.provider.MARTE_sbEditPlugin;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link MARTE.MARTE_AnalysisModel.SAM.SaCommHost} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SaCommHostItemProvider extends GaCommHostItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaCommHostItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(SAMPackage.Literals.SA_COMM_HOST__IS_SCHED);
			childrenFeatures.add(SAMPackage.Literals.SA_COMM_HOST__SCH_SLACK);
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
	 * This returns SaCommHost.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SaCommHost"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		Boolean labelValue = ((SaCommHost)object).getIsProtected();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_SaCommHost_type") :
			getString("_UI_SaCommHost_type") + " " + label;
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

		switch (notification.getFeatureID(SaCommHost.class)) {
			case SAMPackage.SA_COMM_HOST__IS_SCHED:
			case SAMPackage.SA_COMM_HOST__SCH_SLACK:
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
				(SAMPackage.Literals.SA_COMM_HOST__IS_SCHED,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Boolean()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_HOST__SCH_SLACK,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Real()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_HOST__SCH_SLACK,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Frequency()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_HOST__SCH_SLACK,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataTxRate()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_HOST__SCH_SLACK,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Power()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_HOST__SCH_SLACK,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_DataSize()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_HOST__SCH_SLACK,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Energy()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_HOST__SCH_SLACK,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Length()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_HOST__SCH_SLACK,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Area()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_HOST__SCH_SLACK,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Percentage()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_HOST__SCH_SLACK,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Price()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_HOST__SCH_SLACK,
				 BasicNFP_TypesFactory.eINSTANCE.createNFP_Weight()));

		newChildDescriptors.add
			(createChildParameter
				(SAMPackage.Literals.SA_COMM_HOST__SCH_SLACK,
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
			childFeature == GRMPackage.Literals.RESOURCE__RES_MULT ||
			childFeature == GRMPackage.Literals.COMMUNICATION_MEDIA__ELEMENT_SIZE ||
			childFeature == GRMPackage.Literals.PROCESSING_RESOURCE__SPEED_FACTOR ||
			childFeature == GQAMPackage.Literals.GA_COMM_HOST__UTILIZATION ||
			childFeature == SAMPackage.Literals.SA_COMM_HOST__SCH_SLACK ||
			childFeature == GQAMPackage.Literals.GA_COMM_HOST__THROUGHPUT ||
			childFeature == GRMPackage.Literals.COMMUNICATION_MEDIA__CAPACITY ||
			childFeature == GRMPackage.Literals.COMMUNICATION_MEDIA__BLOCK_T ||
			childFeature == GRMPackage.Literals.COMMUNICATION_MEDIA__PACKET_T ||
			childFeature == SAMPackage.Literals.SA_COMM_HOST__IS_SCHED;

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
