/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl;

import MARTE.MARTE_DesignModel.SRM.SW_Interaction.NotificationKind;
import MARTE.MARTE_DesignModel.SRM.SW_Interaction.NotificationResource;
import MARTE.MARTE_DesignModel.SRM.SW_Interaction.NotificationResourceKind;
import MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.NotificationResourceImpl#getOccurence <em>Occurence</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.NotificationResourceImpl#getMechanism <em>Mechanism</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.NotificationResourceImpl#getOccurenceCountElements <em>Occurence Count Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.NotificationResourceImpl#getMaskElements <em>Mask Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.NotificationResourceImpl#getFlushServices <em>Flush Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.NotificationResourceImpl#getSignalServices <em>Signal Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.NotificationResourceImpl#getWaitServices <em>Wait Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.NotificationResourceImpl#getClearServices <em>Clear Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotificationResourceImpl extends SwSynchronizationResourceImpl implements NotificationResource {
	/**
	 * The default value of the '{@link #getOccurence() <em>Occurence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurence()
	 * @generated
	 * @ordered
	 */
	protected static final NotificationKind OCCURENCE_EDEFAULT = NotificationKind.MEMORIZED_LITERAL;

	/**
	 * The cached value of the '{@link #getOccurence() <em>Occurence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurence()
	 * @generated
	 * @ordered
	 */
	protected NotificationKind occurence = OCCURENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMechanism() <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final NotificationResourceKind MECHANISM_EDEFAULT = NotificationResourceKind.EVENT_LITERAL;

	/**
	 * The cached value of the '{@link #getMechanism() <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanism()
	 * @generated
	 * @ordered
	 */
	protected NotificationResourceKind mechanism = MECHANISM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOccurenceCountElements() <em>Occurence Count Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurenceCountElements()
	 * @generated
	 * @ordered
	 */
	protected EList occurenceCountElements;

	/**
	 * The cached value of the '{@link #getMaskElements() <em>Mask Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskElements()
	 * @generated
	 * @ordered
	 */
	protected EList maskElements;

	/**
	 * The cached value of the '{@link #getFlushServices() <em>Flush Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlushServices()
	 * @generated
	 * @ordered
	 */
	protected EList flushServices;

	/**
	 * The cached value of the '{@link #getSignalServices() <em>Signal Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalServices()
	 * @generated
	 * @ordered
	 */
	protected EList signalServices;

	/**
	 * The cached value of the '{@link #getWaitServices() <em>Wait Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitServices()
	 * @generated
	 * @ordered
	 */
	protected EList waitServices;

	/**
	 * The cached value of the '{@link #getClearServices() <em>Clear Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearServices()
	 * @generated
	 * @ordered
	 */
	protected EList clearServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SW_InteractionPackage.Literals.NOTIFICATION_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationKind getOccurence() {
		return occurence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurence(NotificationKind newOccurence) {
		NotificationKind oldOccurence = occurence;
		occurence = newOccurence == null ? OCCURENCE_EDEFAULT : newOccurence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_InteractionPackage.NOTIFICATION_RESOURCE__OCCURENCE, oldOccurence, occurence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationResourceKind getMechanism() {
		return mechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMechanism(NotificationResourceKind newMechanism) {
		NotificationResourceKind oldMechanism = mechanism;
		mechanism = newMechanism == null ? MECHANISM_EDEFAULT : newMechanism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_InteractionPackage.NOTIFICATION_RESOURCE__MECHANISM, oldMechanism, mechanism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOccurenceCountElements() {
		if (occurenceCountElements == null) {
			occurenceCountElements = new EObjectResolvingEList(TypedElement.class, this, SW_InteractionPackage.NOTIFICATION_RESOURCE__OCCURENCE_COUNT_ELEMENTS);
		}
		return occurenceCountElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMaskElements() {
		if (maskElements == null) {
			maskElements = new EObjectResolvingEList(TypedElement.class, this, SW_InteractionPackage.NOTIFICATION_RESOURCE__MASK_ELEMENTS);
		}
		return maskElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFlushServices() {
		if (flushServices == null) {
			flushServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_InteractionPackage.NOTIFICATION_RESOURCE__FLUSH_SERVICES);
		}
		return flushServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSignalServices() {
		if (signalServices == null) {
			signalServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_InteractionPackage.NOTIFICATION_RESOURCE__SIGNAL_SERVICES);
		}
		return signalServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWaitServices() {
		if (waitServices == null) {
			waitServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_InteractionPackage.NOTIFICATION_RESOURCE__WAIT_SERVICES);
		}
		return waitServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClearServices() {
		if (clearServices == null) {
			clearServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_InteractionPackage.NOTIFICATION_RESOURCE__CLEAR_SERVICES);
		}
		return clearServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__OCCURENCE:
				return getOccurence();
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__MECHANISM:
				return getMechanism();
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__OCCURENCE_COUNT_ELEMENTS:
				return getOccurenceCountElements();
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__MASK_ELEMENTS:
				return getMaskElements();
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__FLUSH_SERVICES:
				return getFlushServices();
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__SIGNAL_SERVICES:
				return getSignalServices();
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__WAIT_SERVICES:
				return getWaitServices();
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__CLEAR_SERVICES:
				return getClearServices();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__OCCURENCE:
				setOccurence((NotificationKind)newValue);
				return;
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__MECHANISM:
				setMechanism((NotificationResourceKind)newValue);
				return;
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__OCCURENCE_COUNT_ELEMENTS:
				getOccurenceCountElements().clear();
				getOccurenceCountElements().addAll((Collection)newValue);
				return;
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__MASK_ELEMENTS:
				getMaskElements().clear();
				getMaskElements().addAll((Collection)newValue);
				return;
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__FLUSH_SERVICES:
				getFlushServices().clear();
				getFlushServices().addAll((Collection)newValue);
				return;
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__SIGNAL_SERVICES:
				getSignalServices().clear();
				getSignalServices().addAll((Collection)newValue);
				return;
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__WAIT_SERVICES:
				getWaitServices().clear();
				getWaitServices().addAll((Collection)newValue);
				return;
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__CLEAR_SERVICES:
				getClearServices().clear();
				getClearServices().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__OCCURENCE:
				setOccurence(OCCURENCE_EDEFAULT);
				return;
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__MECHANISM:
				setMechanism(MECHANISM_EDEFAULT);
				return;
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__OCCURENCE_COUNT_ELEMENTS:
				getOccurenceCountElements().clear();
				return;
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__MASK_ELEMENTS:
				getMaskElements().clear();
				return;
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__FLUSH_SERVICES:
				getFlushServices().clear();
				return;
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__SIGNAL_SERVICES:
				getSignalServices().clear();
				return;
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__WAIT_SERVICES:
				getWaitServices().clear();
				return;
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__CLEAR_SERVICES:
				getClearServices().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__OCCURENCE:
				return occurence != OCCURENCE_EDEFAULT;
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__MECHANISM:
				return mechanism != MECHANISM_EDEFAULT;
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__OCCURENCE_COUNT_ELEMENTS:
				return occurenceCountElements != null && !occurenceCountElements.isEmpty();
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__MASK_ELEMENTS:
				return maskElements != null && !maskElements.isEmpty();
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__FLUSH_SERVICES:
				return flushServices != null && !flushServices.isEmpty();
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__SIGNAL_SERVICES:
				return signalServices != null && !signalServices.isEmpty();
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__WAIT_SERVICES:
				return waitServices != null && !waitServices.isEmpty();
			case SW_InteractionPackage.NOTIFICATION_RESOURCE__CLEAR_SERVICES:
				return clearServices != null && !clearServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (occurence: ");
		result.append(occurence);
		result.append(", mechanism: ");
		result.append(mechanism);
		result.append(')');
		return result.toString();
	}

} //NotificationResourceImpl
