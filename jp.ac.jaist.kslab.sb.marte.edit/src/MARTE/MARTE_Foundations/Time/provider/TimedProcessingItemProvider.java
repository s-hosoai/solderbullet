/**
 */
package MARTE.MARTE_Foundations.Time.provider;


import MARTE.MARTE_Foundations.Time.TimePackage;
import MARTE.MARTE_Foundations.Time.TimedProcessing;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.UMLFactory;

/**
 * This is the item provider adapter for a {@link MARTE.MARTE_Foundations.Time.TimedProcessing} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TimedProcessingItemProvider extends TimedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedProcessingItemProvider(AdapterFactory adapterFactory) {
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

			addBase_ActionPropertyDescriptor(object);
			addBase_BehaviorPropertyDescriptor(object);
			addBase_MessagePropertyDescriptor(object);
			addStartPropertyDescriptor(object);
			addFinishPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
	 * This returns TimedProcessing.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TimedProcessing"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_TimedProcessing_type");
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

		switch (notification.getFeatureID(TimedProcessing.class)) {
			case TimePackage.TIMED_PROCESSING__DURATION:
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
	}

}
