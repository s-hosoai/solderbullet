/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl;

import MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage;
import MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource;

import MARTE.MARTE_Foundations.GRM.GRMPackage;
import MARTE.MARTE_Foundations.GRM.SchedulableResource;
import MARTE.MARTE_Foundations.GRM.Scheduler;
import MARTE.MARTE_Foundations.GRM.SecondaryScheduler;

import MARTE_Library.GRM_BasicTypes.SchedParameters;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sw Schedulable Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwSchedulableResourceImpl#getSchedParams <em>Sched Params</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwSchedulableResourceImpl#getDependentScheduler <em>Dependent Scheduler</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwSchedulableResourceImpl#getHost <em>Host</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwSchedulableResourceImpl#getIsStaticSchedulingFeature <em>Is Static Scheduling Feature</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwSchedulableResourceImpl#getIsPreemptable <em>Is Preemptable</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwSchedulableResourceImpl#getSchedulers <em>Schedulers</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwSchedulableResourceImpl#getDeadlineElements <em>Deadline Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwSchedulableResourceImpl#getDeadlineTypeElements <em>Deadline Type Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwSchedulableResourceImpl#getTimeSliceElements <em>Time Slice Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwSchedulableResourceImpl#getDelayServices <em>Delay Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwSchedulableResourceImpl#getJoinServices <em>Join Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwSchedulableResourceImpl#getYieldServices <em>Yield Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwSchedulableResourceImpl extends SwConcurrentResourceImpl implements SwSchedulableResource {
	/**
	 * The cached value of the '{@link #getSchedParams() <em>Sched Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedParams()
	 * @generated
	 * @ordered
	 */
	protected EList schedParams;

	/**
	 * The cached value of the '{@link #getDependentScheduler() <em>Dependent Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentScheduler()
	 * @generated
	 * @ordered
	 */
	protected SecondaryScheduler dependentScheduler;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected Scheduler host;

	/**
	 * The default value of the '{@link #getIsStaticSchedulingFeature() <em>Is Static Scheduling Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStaticSchedulingFeature()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_STATIC_SCHEDULING_FEATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsStaticSchedulingFeature() <em>Is Static Scheduling Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStaticSchedulingFeature()
	 * @generated
	 * @ordered
	 */
	protected Boolean isStaticSchedulingFeature = IS_STATIC_SCHEDULING_FEATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsPreemptable() <em>Is Preemptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPreemptable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PREEMPTABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsPreemptable() <em>Is Preemptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPreemptable()
	 * @generated
	 * @ordered
	 */
	protected Boolean isPreemptable = IS_PREEMPTABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSchedulers() <em>Schedulers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulers()
	 * @generated
	 * @ordered
	 */
	protected NamedElement schedulers;

	/**
	 * The cached value of the '{@link #getDeadlineElements() <em>Deadline Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadlineElements()
	 * @generated
	 * @ordered
	 */
	protected EList deadlineElements;

	/**
	 * The cached value of the '{@link #getDeadlineTypeElements() <em>Deadline Type Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadlineTypeElements()
	 * @generated
	 * @ordered
	 */
	protected EList deadlineTypeElements;

	/**
	 * The cached value of the '{@link #getTimeSliceElements() <em>Time Slice Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSliceElements()
	 * @generated
	 * @ordered
	 */
	protected EList timeSliceElements;

	/**
	 * The cached value of the '{@link #getDelayServices() <em>Delay Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayServices()
	 * @generated
	 * @ordered
	 */
	protected EList delayServices;

	/**
	 * The cached value of the '{@link #getJoinServices() <em>Join Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinServices()
	 * @generated
	 * @ordered
	 */
	protected EList joinServices;

	/**
	 * The cached value of the '{@link #getYieldServices() <em>Yield Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYieldServices()
	 * @generated
	 * @ordered
	 */
	protected EList yieldServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwSchedulableResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SW_ConcurrencyPackage.Literals.SW_SCHEDULABLE_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSchedParams() {
		if (schedParams == null) {
			schedParams = new EObjectContainmentEList(SchedParameters.class, this, SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__SCHED_PARAMS);
		}
		return schedParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondaryScheduler getDependentScheduler() {
		if (dependentScheduler != null && dependentScheduler.eIsProxy()) {
			InternalEObject oldDependentScheduler = (InternalEObject)dependentScheduler;
			dependentScheduler = (SecondaryScheduler)eResolveProxy(oldDependentScheduler);
			if (dependentScheduler != oldDependentScheduler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER, oldDependentScheduler, dependentScheduler));
			}
		}
		return dependentScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondaryScheduler basicGetDependentScheduler() {
		return dependentScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependentScheduler(SecondaryScheduler newDependentScheduler, NotificationChain msgs) {
		SecondaryScheduler oldDependentScheduler = dependentScheduler;
		dependentScheduler = newDependentScheduler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER, oldDependentScheduler, newDependentScheduler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependentScheduler(SecondaryScheduler newDependentScheduler) {
		if (newDependentScheduler != dependentScheduler) {
			NotificationChain msgs = null;
			if (dependentScheduler != null)
				msgs = ((InternalEObject)dependentScheduler).eInverseRemove(this, GRMPackage.SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNITS, SecondaryScheduler.class, msgs);
			if (newDependentScheduler != null)
				msgs = ((InternalEObject)newDependentScheduler).eInverseAdd(this, GRMPackage.SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNITS, SecondaryScheduler.class, msgs);
			msgs = basicSetDependentScheduler(newDependentScheduler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER, newDependentScheduler, newDependentScheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler getHost() {
		if (host != null && host.eIsProxy()) {
			InternalEObject oldHost = (InternalEObject)host;
			host = (Scheduler)eResolveProxy(oldHost);
			if (host != oldHost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__HOST, oldHost, host));
			}
		}
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler basicGetHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHost(Scheduler newHost, NotificationChain msgs) {
		Scheduler oldHost = host;
		host = newHost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__HOST, oldHost, newHost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(Scheduler newHost) {
		if (newHost != host) {
			NotificationChain msgs = null;
			if (host != null)
				msgs = ((InternalEObject)host).eInverseRemove(this, GRMPackage.SCHEDULER__SCHEDULABLE_RESOURCES, Scheduler.class, msgs);
			if (newHost != null)
				msgs = ((InternalEObject)newHost).eInverseAdd(this, GRMPackage.SCHEDULER__SCHEDULABLE_RESOURCES, Scheduler.class, msgs);
			msgs = basicSetHost(newHost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__HOST, newHost, newHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsStaticSchedulingFeature() {
		return isStaticSchedulingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStaticSchedulingFeature(Boolean newIsStaticSchedulingFeature) {
		Boolean oldIsStaticSchedulingFeature = isStaticSchedulingFeature;
		isStaticSchedulingFeature = newIsStaticSchedulingFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__IS_STATIC_SCHEDULING_FEATURE, oldIsStaticSchedulingFeature, isStaticSchedulingFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsPreemptable() {
		return isPreemptable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPreemptable(Boolean newIsPreemptable) {
		Boolean oldIsPreemptable = isPreemptable;
		isPreemptable = newIsPreemptable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__IS_PREEMPTABLE, oldIsPreemptable, isPreemptable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getSchedulers() {
		if (schedulers != null && schedulers.eIsProxy()) {
			InternalEObject oldSchedulers = (InternalEObject)schedulers;
			schedulers = (NamedElement)eResolveProxy(oldSchedulers);
			if (schedulers != oldSchedulers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__SCHEDULERS, oldSchedulers, schedulers));
			}
		}
		return schedulers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetSchedulers() {
		return schedulers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulers(NamedElement newSchedulers) {
		NamedElement oldSchedulers = schedulers;
		schedulers = newSchedulers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__SCHEDULERS, oldSchedulers, schedulers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDeadlineElements() {
		if (deadlineElements == null) {
			deadlineElements = new EObjectResolvingEList(TypedElement.class, this, SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DEADLINE_ELEMENTS);
		}
		return deadlineElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDeadlineTypeElements() {
		if (deadlineTypeElements == null) {
			deadlineTypeElements = new EObjectResolvingEList(TypedElement.class, this, SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DEADLINE_TYPE_ELEMENTS);
		}
		return deadlineTypeElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTimeSliceElements() {
		if (timeSliceElements == null) {
			timeSliceElements = new EObjectResolvingEList(TypedElement.class, this, SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__TIME_SLICE_ELEMENTS);
		}
		return timeSliceElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDelayServices() {
		if (delayServices == null) {
			delayServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DELAY_SERVICES);
		}
		return delayServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getJoinServices() {
		if (joinServices == null) {
			joinServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__JOIN_SERVICES);
		}
		return joinServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getYieldServices() {
		if (yieldServices == null) {
			yieldServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__YIELD_SERVICES);
		}
		return yieldServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER:
				if (dependentScheduler != null)
					msgs = ((InternalEObject)dependentScheduler).eInverseRemove(this, GRMPackage.SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNITS, SecondaryScheduler.class, msgs);
				return basicSetDependentScheduler((SecondaryScheduler)otherEnd, msgs);
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__HOST:
				if (host != null)
					msgs = ((InternalEObject)host).eInverseRemove(this, GRMPackage.SCHEDULER__SCHEDULABLE_RESOURCES, Scheduler.class, msgs);
				return basicSetHost((Scheduler)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__SCHED_PARAMS:
				return ((InternalEList)getSchedParams()).basicRemove(otherEnd, msgs);
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER:
				return basicSetDependentScheduler(null, msgs);
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__HOST:
				return basicSetHost(null, msgs);
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
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__SCHED_PARAMS:
				return getSchedParams();
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER:
				if (resolve) return getDependentScheduler();
				return basicGetDependentScheduler();
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__HOST:
				if (resolve) return getHost();
				return basicGetHost();
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__IS_STATIC_SCHEDULING_FEATURE:
				return getIsStaticSchedulingFeature();
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__IS_PREEMPTABLE:
				return getIsPreemptable();
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__SCHEDULERS:
				if (resolve) return getSchedulers();
				return basicGetSchedulers();
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DEADLINE_ELEMENTS:
				return getDeadlineElements();
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DEADLINE_TYPE_ELEMENTS:
				return getDeadlineTypeElements();
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__TIME_SLICE_ELEMENTS:
				return getTimeSliceElements();
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DELAY_SERVICES:
				return getDelayServices();
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__JOIN_SERVICES:
				return getJoinServices();
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__YIELD_SERVICES:
				return getYieldServices();
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
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__SCHED_PARAMS:
				getSchedParams().clear();
				getSchedParams().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER:
				setDependentScheduler((SecondaryScheduler)newValue);
				return;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__HOST:
				setHost((Scheduler)newValue);
				return;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__IS_STATIC_SCHEDULING_FEATURE:
				setIsStaticSchedulingFeature((Boolean)newValue);
				return;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__IS_PREEMPTABLE:
				setIsPreemptable((Boolean)newValue);
				return;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__SCHEDULERS:
				setSchedulers((NamedElement)newValue);
				return;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DEADLINE_ELEMENTS:
				getDeadlineElements().clear();
				getDeadlineElements().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DEADLINE_TYPE_ELEMENTS:
				getDeadlineTypeElements().clear();
				getDeadlineTypeElements().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__TIME_SLICE_ELEMENTS:
				getTimeSliceElements().clear();
				getTimeSliceElements().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DELAY_SERVICES:
				getDelayServices().clear();
				getDelayServices().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__JOIN_SERVICES:
				getJoinServices().clear();
				getJoinServices().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__YIELD_SERVICES:
				getYieldServices().clear();
				getYieldServices().addAll((Collection)newValue);
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
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__SCHED_PARAMS:
				getSchedParams().clear();
				return;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER:
				setDependentScheduler((SecondaryScheduler)null);
				return;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__HOST:
				setHost((Scheduler)null);
				return;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__IS_STATIC_SCHEDULING_FEATURE:
				setIsStaticSchedulingFeature(IS_STATIC_SCHEDULING_FEATURE_EDEFAULT);
				return;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__IS_PREEMPTABLE:
				setIsPreemptable(IS_PREEMPTABLE_EDEFAULT);
				return;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__SCHEDULERS:
				setSchedulers((NamedElement)null);
				return;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DEADLINE_ELEMENTS:
				getDeadlineElements().clear();
				return;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DEADLINE_TYPE_ELEMENTS:
				getDeadlineTypeElements().clear();
				return;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__TIME_SLICE_ELEMENTS:
				getTimeSliceElements().clear();
				return;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DELAY_SERVICES:
				getDelayServices().clear();
				return;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__JOIN_SERVICES:
				getJoinServices().clear();
				return;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__YIELD_SERVICES:
				getYieldServices().clear();
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
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__SCHED_PARAMS:
				return schedParams != null && !schedParams.isEmpty();
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER:
				return dependentScheduler != null;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__HOST:
				return host != null;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__IS_STATIC_SCHEDULING_FEATURE:
				return IS_STATIC_SCHEDULING_FEATURE_EDEFAULT == null ? isStaticSchedulingFeature != null : !IS_STATIC_SCHEDULING_FEATURE_EDEFAULT.equals(isStaticSchedulingFeature);
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__IS_PREEMPTABLE:
				return IS_PREEMPTABLE_EDEFAULT == null ? isPreemptable != null : !IS_PREEMPTABLE_EDEFAULT.equals(isPreemptable);
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__SCHEDULERS:
				return schedulers != null;
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DEADLINE_ELEMENTS:
				return deadlineElements != null && !deadlineElements.isEmpty();
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DEADLINE_TYPE_ELEMENTS:
				return deadlineTypeElements != null && !deadlineTypeElements.isEmpty();
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__TIME_SLICE_ELEMENTS:
				return timeSliceElements != null && !timeSliceElements.isEmpty();
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DELAY_SERVICES:
				return delayServices != null && !delayServices.isEmpty();
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__JOIN_SERVICES:
				return joinServices != null && !joinServices.isEmpty();
			case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__YIELD_SERVICES:
				return yieldServices != null && !yieldServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == SchedulableResource.class) {
			switch (derivedFeatureID) {
				case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__SCHED_PARAMS: return GRMPackage.SCHEDULABLE_RESOURCE__SCHED_PARAMS;
				case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER: return GRMPackage.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER;
				case SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__HOST: return GRMPackage.SCHEDULABLE_RESOURCE__HOST;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == SchedulableResource.class) {
			switch (baseFeatureID) {
				case GRMPackage.SCHEDULABLE_RESOURCE__SCHED_PARAMS: return SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__SCHED_PARAMS;
				case GRMPackage.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER: return SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER;
				case GRMPackage.SCHEDULABLE_RESOURCE__HOST: return SW_ConcurrencyPackage.SW_SCHEDULABLE_RESOURCE__HOST;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isStaticSchedulingFeature: ");
		result.append(isStaticSchedulingFeature);
		result.append(", isPreemptable: ");
		result.append(isPreemptable);
		result.append(')');
		return result.toString();
	}

} //SwSchedulableResourceImpl
