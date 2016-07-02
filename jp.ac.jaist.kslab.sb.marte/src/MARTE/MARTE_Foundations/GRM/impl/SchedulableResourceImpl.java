/**
 */
package MARTE.MARTE_Foundations.GRM.impl;

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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedulable Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.SchedulableResourceImpl#getSchedParams <em>Sched Params</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.SchedulableResourceImpl#getDependentScheduler <em>Dependent Scheduler</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.SchedulableResourceImpl#getHost <em>Host</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchedulableResourceImpl extends ResourceImpl implements SchedulableResource {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulableResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GRMPackage.Literals.SCHEDULABLE_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSchedParams() {
		if (schedParams == null) {
			schedParams = new EObjectContainmentEList(SchedParameters.class, this, GRMPackage.SCHEDULABLE_RESOURCE__SCHED_PARAMS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRMPackage.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER, oldDependentScheduler, dependentScheduler));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRMPackage.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER, oldDependentScheduler, newDependentScheduler);
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
			eNotify(new ENotificationImpl(this, Notification.SET, GRMPackage.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER, newDependentScheduler, newDependentScheduler));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRMPackage.SCHEDULABLE_RESOURCE__HOST, oldHost, host));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRMPackage.SCHEDULABLE_RESOURCE__HOST, oldHost, newHost);
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
			eNotify(new ENotificationImpl(this, Notification.SET, GRMPackage.SCHEDULABLE_RESOURCE__HOST, newHost, newHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRMPackage.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER:
				if (dependentScheduler != null)
					msgs = ((InternalEObject)dependentScheduler).eInverseRemove(this, GRMPackage.SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNITS, SecondaryScheduler.class, msgs);
				return basicSetDependentScheduler((SecondaryScheduler)otherEnd, msgs);
			case GRMPackage.SCHEDULABLE_RESOURCE__HOST:
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
			case GRMPackage.SCHEDULABLE_RESOURCE__SCHED_PARAMS:
				return ((InternalEList)getSchedParams()).basicRemove(otherEnd, msgs);
			case GRMPackage.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER:
				return basicSetDependentScheduler(null, msgs);
			case GRMPackage.SCHEDULABLE_RESOURCE__HOST:
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
			case GRMPackage.SCHEDULABLE_RESOURCE__SCHED_PARAMS:
				return getSchedParams();
			case GRMPackage.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER:
				if (resolve) return getDependentScheduler();
				return basicGetDependentScheduler();
			case GRMPackage.SCHEDULABLE_RESOURCE__HOST:
				if (resolve) return getHost();
				return basicGetHost();
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
			case GRMPackage.SCHEDULABLE_RESOURCE__SCHED_PARAMS:
				getSchedParams().clear();
				getSchedParams().addAll((Collection)newValue);
				return;
			case GRMPackage.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER:
				setDependentScheduler((SecondaryScheduler)newValue);
				return;
			case GRMPackage.SCHEDULABLE_RESOURCE__HOST:
				setHost((Scheduler)newValue);
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
			case GRMPackage.SCHEDULABLE_RESOURCE__SCHED_PARAMS:
				getSchedParams().clear();
				return;
			case GRMPackage.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER:
				setDependentScheduler((SecondaryScheduler)null);
				return;
			case GRMPackage.SCHEDULABLE_RESOURCE__HOST:
				setHost((Scheduler)null);
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
			case GRMPackage.SCHEDULABLE_RESOURCE__SCHED_PARAMS:
				return schedParams != null && !schedParams.isEmpty();
			case GRMPackage.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER:
				return dependentScheduler != null;
			case GRMPackage.SCHEDULABLE_RESOURCE__HOST:
				return host != null;
		}
		return super.eIsSet(featureID);
	}

} //SchedulableResourceImpl
