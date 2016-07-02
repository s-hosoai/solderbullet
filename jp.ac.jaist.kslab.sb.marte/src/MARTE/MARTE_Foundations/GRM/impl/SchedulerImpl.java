/**
 */
package MARTE.MARTE_Foundations.GRM.impl;

import MARTE.MARTE_Foundations.GRM.ComputingResource;
import MARTE.MARTE_Foundations.GRM.GRMPackage;
import MARTE.MARTE_Foundations.GRM.MutualExclusionResource;
import MARTE.MARTE_Foundations.GRM.ProcessingResource;
import MARTE.MARTE_Foundations.GRM.SchedulableResource;
import MARTE.MARTE_Foundations.GRM.Scheduler;

import MARTE_Library.GRM_BasicTypes.SchedPolicyKind;

import MARTE_Library.MARTE_PrimitivesTypes.MARTE_PrimitivesTypesFactory;
import MARTE_Library.MARTE_PrimitivesTypes.MARTE_PrimitivesTypesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.OpaqueExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.SchedulerImpl#getIsPreemptible <em>Is Preemptible</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.SchedulerImpl#getSchedPolicy <em>Sched Policy</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.SchedulerImpl#getOtherSchedPolicy <em>Other Sched Policy</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.SchedulerImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.SchedulerImpl#getProcessingUnits <em>Processing Units</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.SchedulerImpl#getHost <em>Host</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.SchedulerImpl#getProtectedSharedRsources <em>Protected Shared Rsources</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.SchedulerImpl#getSchedulableResources <em>Schedulable Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchedulerImpl extends ResourceImpl implements Scheduler {
	/**
	 * The default value of the '{@link #getIsPreemptible() <em>Is Preemptible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPreemptible()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PREEMPTIBLE_EDEFAULT = (Boolean)MARTE_PrimitivesTypesFactory.eINSTANCE.createFromString(MARTE_PrimitivesTypesPackage.eINSTANCE.getBoolean(), "true");

	/**
	 * The cached value of the '{@link #getIsPreemptible() <em>Is Preemptible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPreemptible()
	 * @generated
	 * @ordered
	 */
	protected Boolean isPreemptible = IS_PREEMPTIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchedPolicy() <em>Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final SchedPolicyKind SCHED_POLICY_EDEFAULT = SchedPolicyKind.FIXED_PRIORITY;

	/**
	 * The cached value of the '{@link #getSchedPolicy() <em>Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedPolicy()
	 * @generated
	 * @ordered
	 */
	protected SchedPolicyKind schedPolicy = SCHED_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherSchedPolicy() <em>Other Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSchedPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_SCHED_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherSchedPolicy() <em>Other Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSchedPolicy()
	 * @generated
	 * @ordered
	 */
	protected String otherSchedPolicy = OTHER_SCHED_POLICY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected OpaqueExpression schedule;

	/**
	 * The cached value of the '{@link #getProcessingUnits() <em>Processing Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingUnits()
	 * @generated
	 * @ordered
	 */
	protected EList processingUnits;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected ComputingResource host;

	/**
	 * The cached value of the '{@link #getProtectedSharedRsources() <em>Protected Shared Rsources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectedSharedRsources()
	 * @generated
	 * @ordered
	 */
	protected EList protectedSharedRsources;

	/**
	 * The cached value of the '{@link #getSchedulableResources() <em>Schedulable Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulableResources()
	 * @generated
	 * @ordered
	 */
	protected EList schedulableResources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GRMPackage.Literals.SCHEDULER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsPreemptible() {
		return isPreemptible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPreemptible(Boolean newIsPreemptible) {
		Boolean oldIsPreemptible = isPreemptible;
		isPreemptible = newIsPreemptible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRMPackage.SCHEDULER__IS_PREEMPTIBLE, oldIsPreemptible, isPreemptible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedPolicyKind getSchedPolicy() {
		return schedPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedPolicy(SchedPolicyKind newSchedPolicy) {
		SchedPolicyKind oldSchedPolicy = schedPolicy;
		schedPolicy = newSchedPolicy == null ? SCHED_POLICY_EDEFAULT : newSchedPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRMPackage.SCHEDULER__SCHED_POLICY, oldSchedPolicy, schedPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherSchedPolicy() {
		return otherSchedPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherSchedPolicy(String newOtherSchedPolicy) {
		String oldOtherSchedPolicy = otherSchedPolicy;
		otherSchedPolicy = newOtherSchedPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRMPackage.SCHEDULER__OTHER_SCHED_POLICY, oldOtherSchedPolicy, otherSchedPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueExpression getSchedule() {
		if (schedule != null && schedule.eIsProxy()) {
			InternalEObject oldSchedule = (InternalEObject)schedule;
			schedule = (OpaqueExpression)eResolveProxy(oldSchedule);
			if (schedule != oldSchedule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRMPackage.SCHEDULER__SCHEDULE, oldSchedule, schedule));
			}
		}
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueExpression basicGetSchedule() {
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule(OpaqueExpression newSchedule) {
		OpaqueExpression oldSchedule = schedule;
		schedule = newSchedule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRMPackage.SCHEDULER__SCHEDULE, oldSchedule, schedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProcessingUnits() {
		if (processingUnits == null) {
			processingUnits = new EObjectResolvingEList(ProcessingResource.class, this, GRMPackage.SCHEDULER__PROCESSING_UNITS);
		}
		return processingUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputingResource getHost() {
		if (host != null && host.eIsProxy()) {
			InternalEObject oldHost = (InternalEObject)host;
			host = (ComputingResource)eResolveProxy(oldHost);
			if (host != oldHost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRMPackage.SCHEDULER__HOST, oldHost, host));
			}
		}
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputingResource basicGetHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(ComputingResource newHost) {
		ComputingResource oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRMPackage.SCHEDULER__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProtectedSharedRsources() {
		if (protectedSharedRsources == null) {
			protectedSharedRsources = new EObjectWithInverseResolvingEList(MutualExclusionResource.class, this, GRMPackage.SCHEDULER__PROTECTED_SHARED_RSOURCES, GRMPackage.MUTUAL_EXCLUSION_RESOURCE__SCHEDULER);
		}
		return protectedSharedRsources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSchedulableResources() {
		if (schedulableResources == null) {
			schedulableResources = new EObjectWithInverseResolvingEList(SchedulableResource.class, this, GRMPackage.SCHEDULER__SCHEDULABLE_RESOURCES, GRMPackage.SCHEDULABLE_RESOURCE__HOST);
		}
		return schedulableResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRMPackage.SCHEDULER__PROTECTED_SHARED_RSOURCES:
				return ((InternalEList)getProtectedSharedRsources()).basicAdd(otherEnd, msgs);
			case GRMPackage.SCHEDULER__SCHEDULABLE_RESOURCES:
				return ((InternalEList)getSchedulableResources()).basicAdd(otherEnd, msgs);
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
			case GRMPackage.SCHEDULER__PROTECTED_SHARED_RSOURCES:
				return ((InternalEList)getProtectedSharedRsources()).basicRemove(otherEnd, msgs);
			case GRMPackage.SCHEDULER__SCHEDULABLE_RESOURCES:
				return ((InternalEList)getSchedulableResources()).basicRemove(otherEnd, msgs);
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
			case GRMPackage.SCHEDULER__IS_PREEMPTIBLE:
				return getIsPreemptible();
			case GRMPackage.SCHEDULER__SCHED_POLICY:
				return getSchedPolicy();
			case GRMPackage.SCHEDULER__OTHER_SCHED_POLICY:
				return getOtherSchedPolicy();
			case GRMPackage.SCHEDULER__SCHEDULE:
				if (resolve) return getSchedule();
				return basicGetSchedule();
			case GRMPackage.SCHEDULER__PROCESSING_UNITS:
				return getProcessingUnits();
			case GRMPackage.SCHEDULER__HOST:
				if (resolve) return getHost();
				return basicGetHost();
			case GRMPackage.SCHEDULER__PROTECTED_SHARED_RSOURCES:
				return getProtectedSharedRsources();
			case GRMPackage.SCHEDULER__SCHEDULABLE_RESOURCES:
				return getSchedulableResources();
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
			case GRMPackage.SCHEDULER__IS_PREEMPTIBLE:
				setIsPreemptible((Boolean)newValue);
				return;
			case GRMPackage.SCHEDULER__SCHED_POLICY:
				setSchedPolicy((SchedPolicyKind)newValue);
				return;
			case GRMPackage.SCHEDULER__OTHER_SCHED_POLICY:
				setOtherSchedPolicy((String)newValue);
				return;
			case GRMPackage.SCHEDULER__SCHEDULE:
				setSchedule((OpaqueExpression)newValue);
				return;
			case GRMPackage.SCHEDULER__PROCESSING_UNITS:
				getProcessingUnits().clear();
				getProcessingUnits().addAll((Collection)newValue);
				return;
			case GRMPackage.SCHEDULER__HOST:
				setHost((ComputingResource)newValue);
				return;
			case GRMPackage.SCHEDULER__PROTECTED_SHARED_RSOURCES:
				getProtectedSharedRsources().clear();
				getProtectedSharedRsources().addAll((Collection)newValue);
				return;
			case GRMPackage.SCHEDULER__SCHEDULABLE_RESOURCES:
				getSchedulableResources().clear();
				getSchedulableResources().addAll((Collection)newValue);
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
			case GRMPackage.SCHEDULER__IS_PREEMPTIBLE:
				setIsPreemptible(IS_PREEMPTIBLE_EDEFAULT);
				return;
			case GRMPackage.SCHEDULER__SCHED_POLICY:
				setSchedPolicy(SCHED_POLICY_EDEFAULT);
				return;
			case GRMPackage.SCHEDULER__OTHER_SCHED_POLICY:
				setOtherSchedPolicy(OTHER_SCHED_POLICY_EDEFAULT);
				return;
			case GRMPackage.SCHEDULER__SCHEDULE:
				setSchedule((OpaqueExpression)null);
				return;
			case GRMPackage.SCHEDULER__PROCESSING_UNITS:
				getProcessingUnits().clear();
				return;
			case GRMPackage.SCHEDULER__HOST:
				setHost((ComputingResource)null);
				return;
			case GRMPackage.SCHEDULER__PROTECTED_SHARED_RSOURCES:
				getProtectedSharedRsources().clear();
				return;
			case GRMPackage.SCHEDULER__SCHEDULABLE_RESOURCES:
				getSchedulableResources().clear();
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
			case GRMPackage.SCHEDULER__IS_PREEMPTIBLE:
				return IS_PREEMPTIBLE_EDEFAULT == null ? isPreemptible != null : !IS_PREEMPTIBLE_EDEFAULT.equals(isPreemptible);
			case GRMPackage.SCHEDULER__SCHED_POLICY:
				return schedPolicy != SCHED_POLICY_EDEFAULT;
			case GRMPackage.SCHEDULER__OTHER_SCHED_POLICY:
				return OTHER_SCHED_POLICY_EDEFAULT == null ? otherSchedPolicy != null : !OTHER_SCHED_POLICY_EDEFAULT.equals(otherSchedPolicy);
			case GRMPackage.SCHEDULER__SCHEDULE:
				return schedule != null;
			case GRMPackage.SCHEDULER__PROCESSING_UNITS:
				return processingUnits != null && !processingUnits.isEmpty();
			case GRMPackage.SCHEDULER__HOST:
				return host != null;
			case GRMPackage.SCHEDULER__PROTECTED_SHARED_RSOURCES:
				return protectedSharedRsources != null && !protectedSharedRsources.isEmpty();
			case GRMPackage.SCHEDULER__SCHEDULABLE_RESOURCES:
				return schedulableResources != null && !schedulableResources.isEmpty();
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
		result.append(" (isPreemptible: ");
		result.append(isPreemptible);
		result.append(", schedPolicy: ");
		result.append(schedPolicy);
		result.append(", otherSchedPolicy: ");
		result.append(otherSchedPolicy);
		result.append(')');
		return result.toString();
	}

} //SchedulerImpl
