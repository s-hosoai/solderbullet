/**
 */
package MARTE.MARTE_Annexes.RSM.provider;


import MARTE.MARTE_Annexes.RSM.Distribute;
import MARTE.MARTE_Annexes.RSM.RSMPackage;

import MARTE.MARTE_Foundations.Alloc.AllocationKind;

import MARTE.MARTE_Foundations.Alloc.provider.AllocateItemProvider;

import MARTE.MARTE_Foundations.NFPs.provider.MARTE_sbEditPlugin;

import MARTE_Library.RS_Library.RS_LibraryFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link MARTE.MARTE_Annexes.RSM.Distribute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DistributeItemProvider extends AllocateItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(RSMPackage.Literals.DISTRIBUTE__PATTERN_SHAPE);
			childrenFeatures.add(RSMPackage.Literals.DISTRIBUTE__REPETITION_SPACE);
			childrenFeatures.add(RSMPackage.Literals.DISTRIBUTE__FROM_TILER);
			childrenFeatures.add(RSMPackage.Literals.DISTRIBUTE__TO_TILER);
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
	 * This returns Distribute.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Distribute"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		AllocationKind labelValue = ((Distribute)object).getKind();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Distribute_type") :
			getString("_UI_Distribute_type") + " " + label;
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

		switch (notification.getFeatureID(Distribute.class)) {
			case RSMPackage.DISTRIBUTE__PATTERN_SHAPE:
			case RSMPackage.DISTRIBUTE__REPETITION_SPACE:
			case RSMPackage.DISTRIBUTE__FROM_TILER:
			case RSMPackage.DISTRIBUTE__TO_TILER:
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
				(RSMPackage.Literals.DISTRIBUTE__PATTERN_SHAPE,
				 RS_LibraryFactory.eINSTANCE.createShapeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(RSMPackage.Literals.DISTRIBUTE__REPETITION_SPACE,
				 RS_LibraryFactory.eINSTANCE.createShapeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(RSMPackage.Literals.DISTRIBUTE__FROM_TILER,
				 RS_LibraryFactory.eINSTANCE.createTilerSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(RSMPackage.Literals.DISTRIBUTE__TO_TILER,
				 RS_LibraryFactory.eINSTANCE.createTilerSpecification()));
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
			childFeature == RSMPackage.Literals.DISTRIBUTE__PATTERN_SHAPE ||
			childFeature == RSMPackage.Literals.DISTRIBUTE__REPETITION_SPACE ||
			childFeature == RSMPackage.Literals.DISTRIBUTE__FROM_TILER ||
			childFeature == RSMPackage.Literals.DISTRIBUTE__TO_TILER;

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
