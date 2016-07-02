/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl;

import MARTE.MARTE_DesignModel.SRM.SW_Interaction.QueuePolicyKind;
import MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage;
import MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwInteractionResource;

import MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.impl.SwResourceImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sw Interaction Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.SwInteractionResourceImpl#isIsIntraMemoryPartitionInteraction <em>Is Intra Memory Partition Interaction</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.SwInteractionResourceImpl#getWaitingQueuePolicy <em>Waiting Queue Policy</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.SwInteractionResourceImpl#getWaitingQueueCapacity <em>Waiting Queue Capacity</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.SwInteractionResourceImpl#getWaitingPolicyElements <em>Waiting Policy Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SwInteractionResourceImpl extends SwResourceImpl implements SwInteractionResource {
	/**
	 * The default value of the '{@link #isIsIntraMemoryPartitionInteraction() <em>Is Intra Memory Partition Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIntraMemoryPartitionInteraction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INTRA_MEMORY_PARTITION_INTERACTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsIntraMemoryPartitionInteraction() <em>Is Intra Memory Partition Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIntraMemoryPartitionInteraction()
	 * @generated
	 * @ordered
	 */
	protected boolean isIntraMemoryPartitionInteraction = IS_INTRA_MEMORY_PARTITION_INTERACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaitingQueuePolicy() <em>Waiting Queue Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingQueuePolicy()
	 * @generated
	 * @ordered
	 */
	protected static final QueuePolicyKind WAITING_QUEUE_POLICY_EDEFAULT = QueuePolicyKind.FIFO_LITERAL;

	/**
	 * The cached value of the '{@link #getWaitingQueuePolicy() <em>Waiting Queue Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingQueuePolicy()
	 * @generated
	 * @ordered
	 */
	protected QueuePolicyKind waitingQueuePolicy = WAITING_QUEUE_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaitingQueueCapacity() <em>Waiting Queue Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingQueueCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer WAITING_QUEUE_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaitingQueueCapacity() <em>Waiting Queue Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingQueueCapacity()
	 * @generated
	 * @ordered
	 */
	protected Integer waitingQueueCapacity = WAITING_QUEUE_CAPACITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWaitingPolicyElements() <em>Waiting Policy Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingPolicyElements()
	 * @generated
	 * @ordered
	 */
	protected EList waitingPolicyElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwInteractionResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SW_InteractionPackage.Literals.SW_INTERACTION_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsIntraMemoryPartitionInteraction() {
		return isIntraMemoryPartitionInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIntraMemoryPartitionInteraction(boolean newIsIntraMemoryPartitionInteraction) {
		boolean oldIsIntraMemoryPartitionInteraction = isIntraMemoryPartitionInteraction;
		isIntraMemoryPartitionInteraction = newIsIntraMemoryPartitionInteraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_InteractionPackage.SW_INTERACTION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION, oldIsIntraMemoryPartitionInteraction, isIntraMemoryPartitionInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueuePolicyKind getWaitingQueuePolicy() {
		return waitingQueuePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaitingQueuePolicy(QueuePolicyKind newWaitingQueuePolicy) {
		QueuePolicyKind oldWaitingQueuePolicy = waitingQueuePolicy;
		waitingQueuePolicy = newWaitingQueuePolicy == null ? WAITING_QUEUE_POLICY_EDEFAULT : newWaitingQueuePolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_InteractionPackage.SW_INTERACTION_RESOURCE__WAITING_QUEUE_POLICY, oldWaitingQueuePolicy, waitingQueuePolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getWaitingQueueCapacity() {
		return waitingQueueCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaitingQueueCapacity(Integer newWaitingQueueCapacity) {
		Integer oldWaitingQueueCapacity = waitingQueueCapacity;
		waitingQueueCapacity = newWaitingQueueCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_InteractionPackage.SW_INTERACTION_RESOURCE__WAITING_QUEUE_CAPACITY, oldWaitingQueueCapacity, waitingQueueCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWaitingPolicyElements() {
		if (waitingPolicyElements == null) {
			waitingPolicyElements = new EObjectResolvingEList(TypedElement.class, this, SW_InteractionPackage.SW_INTERACTION_RESOURCE__WAITING_POLICY_ELEMENTS);
		}
		return waitingPolicyElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SW_InteractionPackage.SW_INTERACTION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION:
				return isIsIntraMemoryPartitionInteraction() ? Boolean.TRUE : Boolean.FALSE;
			case SW_InteractionPackage.SW_INTERACTION_RESOURCE__WAITING_QUEUE_POLICY:
				return getWaitingQueuePolicy();
			case SW_InteractionPackage.SW_INTERACTION_RESOURCE__WAITING_QUEUE_CAPACITY:
				return getWaitingQueueCapacity();
			case SW_InteractionPackage.SW_INTERACTION_RESOURCE__WAITING_POLICY_ELEMENTS:
				return getWaitingPolicyElements();
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
			case SW_InteractionPackage.SW_INTERACTION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION:
				setIsIntraMemoryPartitionInteraction(((Boolean)newValue).booleanValue());
				return;
			case SW_InteractionPackage.SW_INTERACTION_RESOURCE__WAITING_QUEUE_POLICY:
				setWaitingQueuePolicy((QueuePolicyKind)newValue);
				return;
			case SW_InteractionPackage.SW_INTERACTION_RESOURCE__WAITING_QUEUE_CAPACITY:
				setWaitingQueueCapacity((Integer)newValue);
				return;
			case SW_InteractionPackage.SW_INTERACTION_RESOURCE__WAITING_POLICY_ELEMENTS:
				getWaitingPolicyElements().clear();
				getWaitingPolicyElements().addAll((Collection)newValue);
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
			case SW_InteractionPackage.SW_INTERACTION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION:
				setIsIntraMemoryPartitionInteraction(IS_INTRA_MEMORY_PARTITION_INTERACTION_EDEFAULT);
				return;
			case SW_InteractionPackage.SW_INTERACTION_RESOURCE__WAITING_QUEUE_POLICY:
				setWaitingQueuePolicy(WAITING_QUEUE_POLICY_EDEFAULT);
				return;
			case SW_InteractionPackage.SW_INTERACTION_RESOURCE__WAITING_QUEUE_CAPACITY:
				setWaitingQueueCapacity(WAITING_QUEUE_CAPACITY_EDEFAULT);
				return;
			case SW_InteractionPackage.SW_INTERACTION_RESOURCE__WAITING_POLICY_ELEMENTS:
				getWaitingPolicyElements().clear();
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
			case SW_InteractionPackage.SW_INTERACTION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION:
				return isIntraMemoryPartitionInteraction != IS_INTRA_MEMORY_PARTITION_INTERACTION_EDEFAULT;
			case SW_InteractionPackage.SW_INTERACTION_RESOURCE__WAITING_QUEUE_POLICY:
				return waitingQueuePolicy != WAITING_QUEUE_POLICY_EDEFAULT;
			case SW_InteractionPackage.SW_INTERACTION_RESOURCE__WAITING_QUEUE_CAPACITY:
				return WAITING_QUEUE_CAPACITY_EDEFAULT == null ? waitingQueueCapacity != null : !WAITING_QUEUE_CAPACITY_EDEFAULT.equals(waitingQueueCapacity);
			case SW_InteractionPackage.SW_INTERACTION_RESOURCE__WAITING_POLICY_ELEMENTS:
				return waitingPolicyElements != null && !waitingPolicyElements.isEmpty();
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
		result.append(" (isIntraMemoryPartitionInteraction: ");
		result.append(isIntraMemoryPartitionInteraction);
		result.append(", waitingQueuePolicy: ");
		result.append(waitingQueuePolicy);
		result.append(", waitingQueueCapacity: ");
		result.append(waitingQueueCapacity);
		result.append(')');
		return result.toString();
	}

} //SwInteractionResourceImpl
