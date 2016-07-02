/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl;

import MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage;
import MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource;

import MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.impl.SwResourceImpl;

import MARTE_Library.BasicNFP_Types.ArrivalPattern;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sw Concurrent Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwConcurrentResourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwConcurrentResourceImpl#getActivationCapacity <em>Activation Capacity</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwConcurrentResourceImpl#getEntryPoints <em>Entry Points</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwConcurrentResourceImpl#getAdressSpace <em>Adress Space</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwConcurrentResourceImpl#getPeriodElements <em>Period Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwConcurrentResourceImpl#getPriorityElements <em>Priority Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwConcurrentResourceImpl#getStackSizeElements <em>Stack Size Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwConcurrentResourceImpl#getActivateServices <em>Activate Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwConcurrentResourceImpl#getEnableConcurrencyServices <em>Enable Concurrency Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwConcurrentResourceImpl#getResumeServices <em>Resume Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwConcurrentResourceImpl#getSuspendServices <em>Suspend Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwConcurrentResourceImpl#getTerminateServices <em>Terminate Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwConcurrentResourceImpl#getDisableConcurrencyServices <em>Disable Concurrency Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwConcurrentResourceImpl#getShareDataResources <em>Share Data Resources</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwConcurrentResourceImpl#getMessageResources <em>Message Resources</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwConcurrentResourceImpl#getMutualExclusionResources <em>Mutual Exclusion Resources</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwConcurrentResourceImpl#getNotificationResources <em>Notification Resources</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwConcurrentResourceImpl#getHeapSizeElements <em>Heap Size Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SwConcurrentResourceImpl extends SwResourceImpl implements SwConcurrentResource {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ArrivalPattern type;

	/**
	 * The default value of the '{@link #getActivationCapacity() <em>Activation Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACTIVATION_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivationCapacity() <em>Activation Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationCapacity()
	 * @generated
	 * @ordered
	 */
	protected Integer activationCapacity = ACTIVATION_CAPACITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntryPoints() <em>Entry Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoints()
	 * @generated
	 * @ordered
	 */
	protected EList entryPoints;

	/**
	 * The cached value of the '{@link #getAdressSpace() <em>Adress Space</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdressSpace()
	 * @generated
	 * @ordered
	 */
	protected EList adressSpace;

	/**
	 * The cached value of the '{@link #getPeriodElements() <em>Period Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodElements()
	 * @generated
	 * @ordered
	 */
	protected EList periodElements;

	/**
	 * The cached value of the '{@link #getPriorityElements() <em>Priority Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityElements()
	 * @generated
	 * @ordered
	 */
	protected EList priorityElements;

	/**
	 * The cached value of the '{@link #getStackSizeElements() <em>Stack Size Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackSizeElements()
	 * @generated
	 * @ordered
	 */
	protected EList stackSizeElements;

	/**
	 * The cached value of the '{@link #getActivateServices() <em>Activate Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivateServices()
	 * @generated
	 * @ordered
	 */
	protected EList activateServices;

	/**
	 * The cached value of the '{@link #getEnableConcurrencyServices() <em>Enable Concurrency Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableConcurrencyServices()
	 * @generated
	 * @ordered
	 */
	protected EList enableConcurrencyServices;

	/**
	 * The cached value of the '{@link #getResumeServices() <em>Resume Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResumeServices()
	 * @generated
	 * @ordered
	 */
	protected EList resumeServices;

	/**
	 * The cached value of the '{@link #getSuspendServices() <em>Suspend Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspendServices()
	 * @generated
	 * @ordered
	 */
	protected EList suspendServices;

	/**
	 * The cached value of the '{@link #getTerminateServices() <em>Terminate Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminateServices()
	 * @generated
	 * @ordered
	 */
	protected EList terminateServices;

	/**
	 * The cached value of the '{@link #getDisableConcurrencyServices() <em>Disable Concurrency Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisableConcurrencyServices()
	 * @generated
	 * @ordered
	 */
	protected EList disableConcurrencyServices;

	/**
	 * The cached value of the '{@link #getShareDataResources() <em>Share Data Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShareDataResources()
	 * @generated
	 * @ordered
	 */
	protected EList shareDataResources;

	/**
	 * The cached value of the '{@link #getMessageResources() <em>Message Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageResources()
	 * @generated
	 * @ordered
	 */
	protected EList messageResources;

	/**
	 * The cached value of the '{@link #getMutualExclusionResources() <em>Mutual Exclusion Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutualExclusionResources()
	 * @generated
	 * @ordered
	 */
	protected EList mutualExclusionResources;

	/**
	 * The cached value of the '{@link #getNotificationResources() <em>Notification Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationResources()
	 * @generated
	 * @ordered
	 */
	protected EList notificationResources;

	/**
	 * The cached value of the '{@link #getHeapSizeElements() <em>Heap Size Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeapSizeElements()
	 * @generated
	 * @ordered
	 */
	protected EList heapSizeElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwConcurrentResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SW_ConcurrencyPackage.Literals.SW_CONCURRENT_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrivalPattern getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ArrivalPattern newType, NotificationChain msgs) {
		ArrivalPattern oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ArrivalPattern newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getActivationCapacity() {
		return activationCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationCapacity(Integer newActivationCapacity) {
		Integer oldActivationCapacity = activationCapacity;
		activationCapacity = newActivationCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ACTIVATION_CAPACITY, oldActivationCapacity, activationCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEntryPoints() {
		if (entryPoints == null) {
			entryPoints = new EObjectResolvingEList(Element.class, this, SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ENTRY_POINTS);
		}
		return entryPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAdressSpace() {
		if (adressSpace == null) {
			adressSpace = new EObjectResolvingEList(TypedElement.class, this, SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ADRESS_SPACE);
		}
		return adressSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPeriodElements() {
		if (periodElements == null) {
			periodElements = new EObjectResolvingEList(TypedElement.class, this, SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__PERIOD_ELEMENTS);
		}
		return periodElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPriorityElements() {
		if (priorityElements == null) {
			priorityElements = new EObjectResolvingEList(TypedElement.class, this, SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__PRIORITY_ELEMENTS);
		}
		return priorityElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStackSizeElements() {
		if (stackSizeElements == null) {
			stackSizeElements = new EObjectResolvingEList(TypedElement.class, this, SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__STACK_SIZE_ELEMENTS);
		}
		return stackSizeElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getActivateServices() {
		if (activateServices == null) {
			activateServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ACTIVATE_SERVICES);
		}
		return activateServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEnableConcurrencyServices() {
		if (enableConcurrencyServices == null) {
			enableConcurrencyServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ENABLE_CONCURRENCY_SERVICES);
		}
		return enableConcurrencyServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResumeServices() {
		if (resumeServices == null) {
			resumeServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__RESUME_SERVICES);
		}
		return resumeServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSuspendServices() {
		if (suspendServices == null) {
			suspendServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__SUSPEND_SERVICES);
		}
		return suspendServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTerminateServices() {
		if (terminateServices == null) {
			terminateServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__TERMINATE_SERVICES);
		}
		return terminateServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDisableConcurrencyServices() {
		if (disableConcurrencyServices == null) {
			disableConcurrencyServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__DISABLE_CONCURRENCY_SERVICES);
		}
		return disableConcurrencyServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getShareDataResources() {
		if (shareDataResources == null) {
			shareDataResources = new EObjectResolvingEList(TypedElement.class, this, SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__SHARE_DATA_RESOURCES);
		}
		return shareDataResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMessageResources() {
		if (messageResources == null) {
			messageResources = new EObjectResolvingEList(TypedElement.class, this, SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__MESSAGE_RESOURCES);
		}
		return messageResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMutualExclusionResources() {
		if (mutualExclusionResources == null) {
			mutualExclusionResources = new EObjectResolvingEList(TypedElement.class, this, SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__MUTUAL_EXCLUSION_RESOURCES);
		}
		return mutualExclusionResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNotificationResources() {
		if (notificationResources == null) {
			notificationResources = new EObjectResolvingEList(TypedElement.class, this, SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__NOTIFICATION_RESOURCES);
		}
		return notificationResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getHeapSizeElements() {
		if (heapSizeElements == null) {
			heapSizeElements = new EObjectResolvingEList(TypedElement.class, this, SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__HEAP_SIZE_ELEMENTS);
		}
		return heapSizeElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__TYPE:
				return basicSetType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__TYPE:
				return getType();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ACTIVATION_CAPACITY:
				return getActivationCapacity();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ENTRY_POINTS:
				return getEntryPoints();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ADRESS_SPACE:
				return getAdressSpace();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__PERIOD_ELEMENTS:
				return getPeriodElements();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__PRIORITY_ELEMENTS:
				return getPriorityElements();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__STACK_SIZE_ELEMENTS:
				return getStackSizeElements();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ACTIVATE_SERVICES:
				return getActivateServices();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ENABLE_CONCURRENCY_SERVICES:
				return getEnableConcurrencyServices();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__RESUME_SERVICES:
				return getResumeServices();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__SUSPEND_SERVICES:
				return getSuspendServices();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__TERMINATE_SERVICES:
				return getTerminateServices();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__DISABLE_CONCURRENCY_SERVICES:
				return getDisableConcurrencyServices();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__SHARE_DATA_RESOURCES:
				return getShareDataResources();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__MESSAGE_RESOURCES:
				return getMessageResources();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__MUTUAL_EXCLUSION_RESOURCES:
				return getMutualExclusionResources();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__NOTIFICATION_RESOURCES:
				return getNotificationResources();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__HEAP_SIZE_ELEMENTS:
				return getHeapSizeElements();
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
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__TYPE:
				setType((ArrivalPattern)newValue);
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ACTIVATION_CAPACITY:
				setActivationCapacity((Integer)newValue);
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ENTRY_POINTS:
				getEntryPoints().clear();
				getEntryPoints().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ADRESS_SPACE:
				getAdressSpace().clear();
				getAdressSpace().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__PERIOD_ELEMENTS:
				getPeriodElements().clear();
				getPeriodElements().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__PRIORITY_ELEMENTS:
				getPriorityElements().clear();
				getPriorityElements().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__STACK_SIZE_ELEMENTS:
				getStackSizeElements().clear();
				getStackSizeElements().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ACTIVATE_SERVICES:
				getActivateServices().clear();
				getActivateServices().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ENABLE_CONCURRENCY_SERVICES:
				getEnableConcurrencyServices().clear();
				getEnableConcurrencyServices().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__RESUME_SERVICES:
				getResumeServices().clear();
				getResumeServices().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__SUSPEND_SERVICES:
				getSuspendServices().clear();
				getSuspendServices().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__TERMINATE_SERVICES:
				getTerminateServices().clear();
				getTerminateServices().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__DISABLE_CONCURRENCY_SERVICES:
				getDisableConcurrencyServices().clear();
				getDisableConcurrencyServices().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__SHARE_DATA_RESOURCES:
				getShareDataResources().clear();
				getShareDataResources().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__MESSAGE_RESOURCES:
				getMessageResources().clear();
				getMessageResources().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__MUTUAL_EXCLUSION_RESOURCES:
				getMutualExclusionResources().clear();
				getMutualExclusionResources().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__NOTIFICATION_RESOURCES:
				getNotificationResources().clear();
				getNotificationResources().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__HEAP_SIZE_ELEMENTS:
				getHeapSizeElements().clear();
				getHeapSizeElements().addAll((Collection)newValue);
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
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__TYPE:
				setType((ArrivalPattern)null);
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ACTIVATION_CAPACITY:
				setActivationCapacity(ACTIVATION_CAPACITY_EDEFAULT);
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ENTRY_POINTS:
				getEntryPoints().clear();
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ADRESS_SPACE:
				getAdressSpace().clear();
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__PERIOD_ELEMENTS:
				getPeriodElements().clear();
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__PRIORITY_ELEMENTS:
				getPriorityElements().clear();
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__STACK_SIZE_ELEMENTS:
				getStackSizeElements().clear();
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ACTIVATE_SERVICES:
				getActivateServices().clear();
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ENABLE_CONCURRENCY_SERVICES:
				getEnableConcurrencyServices().clear();
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__RESUME_SERVICES:
				getResumeServices().clear();
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__SUSPEND_SERVICES:
				getSuspendServices().clear();
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__TERMINATE_SERVICES:
				getTerminateServices().clear();
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__DISABLE_CONCURRENCY_SERVICES:
				getDisableConcurrencyServices().clear();
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__SHARE_DATA_RESOURCES:
				getShareDataResources().clear();
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__MESSAGE_RESOURCES:
				getMessageResources().clear();
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__MUTUAL_EXCLUSION_RESOURCES:
				getMutualExclusionResources().clear();
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__NOTIFICATION_RESOURCES:
				getNotificationResources().clear();
				return;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__HEAP_SIZE_ELEMENTS:
				getHeapSizeElements().clear();
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
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__TYPE:
				return type != null;
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ACTIVATION_CAPACITY:
				return ACTIVATION_CAPACITY_EDEFAULT == null ? activationCapacity != null : !ACTIVATION_CAPACITY_EDEFAULT.equals(activationCapacity);
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ENTRY_POINTS:
				return entryPoints != null && !entryPoints.isEmpty();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ADRESS_SPACE:
				return adressSpace != null && !adressSpace.isEmpty();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__PERIOD_ELEMENTS:
				return periodElements != null && !periodElements.isEmpty();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__PRIORITY_ELEMENTS:
				return priorityElements != null && !priorityElements.isEmpty();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__STACK_SIZE_ELEMENTS:
				return stackSizeElements != null && !stackSizeElements.isEmpty();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ACTIVATE_SERVICES:
				return activateServices != null && !activateServices.isEmpty();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__ENABLE_CONCURRENCY_SERVICES:
				return enableConcurrencyServices != null && !enableConcurrencyServices.isEmpty();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__RESUME_SERVICES:
				return resumeServices != null && !resumeServices.isEmpty();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__SUSPEND_SERVICES:
				return suspendServices != null && !suspendServices.isEmpty();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__TERMINATE_SERVICES:
				return terminateServices != null && !terminateServices.isEmpty();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__DISABLE_CONCURRENCY_SERVICES:
				return disableConcurrencyServices != null && !disableConcurrencyServices.isEmpty();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__SHARE_DATA_RESOURCES:
				return shareDataResources != null && !shareDataResources.isEmpty();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__MESSAGE_RESOURCES:
				return messageResources != null && !messageResources.isEmpty();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__MUTUAL_EXCLUSION_RESOURCES:
				return mutualExclusionResources != null && !mutualExclusionResources.isEmpty();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__NOTIFICATION_RESOURCES:
				return notificationResources != null && !notificationResources.isEmpty();
			case SW_ConcurrencyPackage.SW_CONCURRENT_RESOURCE__HEAP_SIZE_ELEMENTS:
				return heapSizeElements != null && !heapSizeElements.isEmpty();
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
		result.append(" (activationCapacity: ");
		result.append(activationCapacity);
		result.append(')');
		return result.toString();
	}

} //SwConcurrentResourceImpl
