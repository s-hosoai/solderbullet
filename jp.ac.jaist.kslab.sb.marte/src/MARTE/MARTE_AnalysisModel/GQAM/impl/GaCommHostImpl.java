/**
 */
package MARTE.MARTE_AnalysisModel.GQAM.impl;

import MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;
import MARTE.MARTE_AnalysisModel.GQAM.GaCommHost;

import MARTE.MARTE_Foundations.GRM.ComputingResource;
import MARTE.MARTE_Foundations.GRM.GRMPackage;
import MARTE.MARTE_Foundations.GRM.MutualExclusionResource;
import MARTE.MARTE_Foundations.GRM.ProcessingResource;
import MARTE.MARTE_Foundations.GRM.SchedulableResource;
import MARTE.MARTE_Foundations.GRM.Scheduler;

import MARTE.MARTE_Foundations.GRM.impl.CommunicationMediaImpl;

import MARTE_Library.BasicNFP_Types.NFP_Frequency;
import MARTE_Library.BasicNFP_Types.NFP_Real;

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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.OpaqueExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ga Comm Host</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaCommHostImpl#getIsPreemptible <em>Is Preemptible</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaCommHostImpl#getSchedPolicy <em>Sched Policy</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaCommHostImpl#getOtherSchedPolicy <em>Other Sched Policy</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaCommHostImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaCommHostImpl#getProcessingUnits <em>Processing Units</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaCommHostImpl#getHost <em>Host</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaCommHostImpl#getProtectedSharedRsources <em>Protected Shared Rsources</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaCommHostImpl#getSchedulableResources <em>Schedulable Resources</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaCommHostImpl#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaCommHostImpl#getUtilization <em>Utilization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GaCommHostImpl extends CommunicationMediaImpl implements GaCommHost {
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
	 * The cached value of the '{@link #getThroughput() <em>Throughput</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected EList throughput;

	/**
	 * The cached value of the '{@link #getUtilization() <em>Utilization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilization()
	 * @generated
	 * @ordered
	 */
	protected EList utilization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GaCommHostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GQAMPackage.Literals.GA_COMM_HOST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_COMM_HOST__IS_PREEMPTIBLE, oldIsPreemptible, isPreemptible));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_COMM_HOST__SCHED_POLICY, oldSchedPolicy, schedPolicy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_COMM_HOST__OTHER_SCHED_POLICY, oldOtherSchedPolicy, otherSchedPolicy));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GQAMPackage.GA_COMM_HOST__SCHEDULE, oldSchedule, schedule));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_COMM_HOST__SCHEDULE, oldSchedule, schedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProcessingUnits() {
		if (processingUnits == null) {
			processingUnits = new EObjectResolvingEList(ProcessingResource.class, this, GQAMPackage.GA_COMM_HOST__PROCESSING_UNITS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GQAMPackage.GA_COMM_HOST__HOST, oldHost, host));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_COMM_HOST__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProtectedSharedRsources() {
		if (protectedSharedRsources == null) {
			protectedSharedRsources = new EObjectWithInverseResolvingEList(MutualExclusionResource.class, this, GQAMPackage.GA_COMM_HOST__PROTECTED_SHARED_RSOURCES, GRMPackage.MUTUAL_EXCLUSION_RESOURCE__SCHEDULER);
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
			schedulableResources = new EObjectWithInverseResolvingEList(SchedulableResource.class, this, GQAMPackage.GA_COMM_HOST__SCHEDULABLE_RESOURCES, GRMPackage.SCHEDULABLE_RESOURCE__HOST);
		}
		return schedulableResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getThroughput() {
		if (throughput == null) {
			throughput = new EObjectContainmentEList(NFP_Frequency.class, this, GQAMPackage.GA_COMM_HOST__THROUGHPUT);
		}
		return throughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUtilization() {
		if (utilization == null) {
			utilization = new EObjectContainmentEList(NFP_Real.class, this, GQAMPackage.GA_COMM_HOST__UTILIZATION);
		}
		return utilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GQAMPackage.GA_COMM_HOST__PROTECTED_SHARED_RSOURCES:
				return ((InternalEList)getProtectedSharedRsources()).basicAdd(otherEnd, msgs);
			case GQAMPackage.GA_COMM_HOST__SCHEDULABLE_RESOURCES:
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
			case GQAMPackage.GA_COMM_HOST__PROTECTED_SHARED_RSOURCES:
				return ((InternalEList)getProtectedSharedRsources()).basicRemove(otherEnd, msgs);
			case GQAMPackage.GA_COMM_HOST__SCHEDULABLE_RESOURCES:
				return ((InternalEList)getSchedulableResources()).basicRemove(otherEnd, msgs);
			case GQAMPackage.GA_COMM_HOST__THROUGHPUT:
				return ((InternalEList)getThroughput()).basicRemove(otherEnd, msgs);
			case GQAMPackage.GA_COMM_HOST__UTILIZATION:
				return ((InternalEList)getUtilization()).basicRemove(otherEnd, msgs);
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
			case GQAMPackage.GA_COMM_HOST__IS_PREEMPTIBLE:
				return getIsPreemptible();
			case GQAMPackage.GA_COMM_HOST__SCHED_POLICY:
				return getSchedPolicy();
			case GQAMPackage.GA_COMM_HOST__OTHER_SCHED_POLICY:
				return getOtherSchedPolicy();
			case GQAMPackage.GA_COMM_HOST__SCHEDULE:
				if (resolve) return getSchedule();
				return basicGetSchedule();
			case GQAMPackage.GA_COMM_HOST__PROCESSING_UNITS:
				return getProcessingUnits();
			case GQAMPackage.GA_COMM_HOST__HOST:
				if (resolve) return getHost();
				return basicGetHost();
			case GQAMPackage.GA_COMM_HOST__PROTECTED_SHARED_RSOURCES:
				return getProtectedSharedRsources();
			case GQAMPackage.GA_COMM_HOST__SCHEDULABLE_RESOURCES:
				return getSchedulableResources();
			case GQAMPackage.GA_COMM_HOST__THROUGHPUT:
				return getThroughput();
			case GQAMPackage.GA_COMM_HOST__UTILIZATION:
				return getUtilization();
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
			case GQAMPackage.GA_COMM_HOST__IS_PREEMPTIBLE:
				setIsPreemptible((Boolean)newValue);
				return;
			case GQAMPackage.GA_COMM_HOST__SCHED_POLICY:
				setSchedPolicy((SchedPolicyKind)newValue);
				return;
			case GQAMPackage.GA_COMM_HOST__OTHER_SCHED_POLICY:
				setOtherSchedPolicy((String)newValue);
				return;
			case GQAMPackage.GA_COMM_HOST__SCHEDULE:
				setSchedule((OpaqueExpression)newValue);
				return;
			case GQAMPackage.GA_COMM_HOST__PROCESSING_UNITS:
				getProcessingUnits().clear();
				getProcessingUnits().addAll((Collection)newValue);
				return;
			case GQAMPackage.GA_COMM_HOST__HOST:
				setHost((ComputingResource)newValue);
				return;
			case GQAMPackage.GA_COMM_HOST__PROTECTED_SHARED_RSOURCES:
				getProtectedSharedRsources().clear();
				getProtectedSharedRsources().addAll((Collection)newValue);
				return;
			case GQAMPackage.GA_COMM_HOST__SCHEDULABLE_RESOURCES:
				getSchedulableResources().clear();
				getSchedulableResources().addAll((Collection)newValue);
				return;
			case GQAMPackage.GA_COMM_HOST__THROUGHPUT:
				getThroughput().clear();
				getThroughput().addAll((Collection)newValue);
				return;
			case GQAMPackage.GA_COMM_HOST__UTILIZATION:
				getUtilization().clear();
				getUtilization().addAll((Collection)newValue);
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
			case GQAMPackage.GA_COMM_HOST__IS_PREEMPTIBLE:
				setIsPreemptible(IS_PREEMPTIBLE_EDEFAULT);
				return;
			case GQAMPackage.GA_COMM_HOST__SCHED_POLICY:
				setSchedPolicy(SCHED_POLICY_EDEFAULT);
				return;
			case GQAMPackage.GA_COMM_HOST__OTHER_SCHED_POLICY:
				setOtherSchedPolicy(OTHER_SCHED_POLICY_EDEFAULT);
				return;
			case GQAMPackage.GA_COMM_HOST__SCHEDULE:
				setSchedule((OpaqueExpression)null);
				return;
			case GQAMPackage.GA_COMM_HOST__PROCESSING_UNITS:
				getProcessingUnits().clear();
				return;
			case GQAMPackage.GA_COMM_HOST__HOST:
				setHost((ComputingResource)null);
				return;
			case GQAMPackage.GA_COMM_HOST__PROTECTED_SHARED_RSOURCES:
				getProtectedSharedRsources().clear();
				return;
			case GQAMPackage.GA_COMM_HOST__SCHEDULABLE_RESOURCES:
				getSchedulableResources().clear();
				return;
			case GQAMPackage.GA_COMM_HOST__THROUGHPUT:
				getThroughput().clear();
				return;
			case GQAMPackage.GA_COMM_HOST__UTILIZATION:
				getUtilization().clear();
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
			case GQAMPackage.GA_COMM_HOST__IS_PREEMPTIBLE:
				return IS_PREEMPTIBLE_EDEFAULT == null ? isPreemptible != null : !IS_PREEMPTIBLE_EDEFAULT.equals(isPreemptible);
			case GQAMPackage.GA_COMM_HOST__SCHED_POLICY:
				return schedPolicy != SCHED_POLICY_EDEFAULT;
			case GQAMPackage.GA_COMM_HOST__OTHER_SCHED_POLICY:
				return OTHER_SCHED_POLICY_EDEFAULT == null ? otherSchedPolicy != null : !OTHER_SCHED_POLICY_EDEFAULT.equals(otherSchedPolicy);
			case GQAMPackage.GA_COMM_HOST__SCHEDULE:
				return schedule != null;
			case GQAMPackage.GA_COMM_HOST__PROCESSING_UNITS:
				return processingUnits != null && !processingUnits.isEmpty();
			case GQAMPackage.GA_COMM_HOST__HOST:
				return host != null;
			case GQAMPackage.GA_COMM_HOST__PROTECTED_SHARED_RSOURCES:
				return protectedSharedRsources != null && !protectedSharedRsources.isEmpty();
			case GQAMPackage.GA_COMM_HOST__SCHEDULABLE_RESOURCES:
				return schedulableResources != null && !schedulableResources.isEmpty();
			case GQAMPackage.GA_COMM_HOST__THROUGHPUT:
				return throughput != null && !throughput.isEmpty();
			case GQAMPackage.GA_COMM_HOST__UTILIZATION:
				return utilization != null && !utilization.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Scheduler.class) {
			switch (derivedFeatureID) {
				case GQAMPackage.GA_COMM_HOST__IS_PREEMPTIBLE: return GRMPackage.SCHEDULER__IS_PREEMPTIBLE;
				case GQAMPackage.GA_COMM_HOST__SCHED_POLICY: return GRMPackage.SCHEDULER__SCHED_POLICY;
				case GQAMPackage.GA_COMM_HOST__OTHER_SCHED_POLICY: return GRMPackage.SCHEDULER__OTHER_SCHED_POLICY;
				case GQAMPackage.GA_COMM_HOST__SCHEDULE: return GRMPackage.SCHEDULER__SCHEDULE;
				case GQAMPackage.GA_COMM_HOST__PROCESSING_UNITS: return GRMPackage.SCHEDULER__PROCESSING_UNITS;
				case GQAMPackage.GA_COMM_HOST__HOST: return GRMPackage.SCHEDULER__HOST;
				case GQAMPackage.GA_COMM_HOST__PROTECTED_SHARED_RSOURCES: return GRMPackage.SCHEDULER__PROTECTED_SHARED_RSOURCES;
				case GQAMPackage.GA_COMM_HOST__SCHEDULABLE_RESOURCES: return GRMPackage.SCHEDULER__SCHEDULABLE_RESOURCES;
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
		if (baseClass == Scheduler.class) {
			switch (baseFeatureID) {
				case GRMPackage.SCHEDULER__IS_PREEMPTIBLE: return GQAMPackage.GA_COMM_HOST__IS_PREEMPTIBLE;
				case GRMPackage.SCHEDULER__SCHED_POLICY: return GQAMPackage.GA_COMM_HOST__SCHED_POLICY;
				case GRMPackage.SCHEDULER__OTHER_SCHED_POLICY: return GQAMPackage.GA_COMM_HOST__OTHER_SCHED_POLICY;
				case GRMPackage.SCHEDULER__SCHEDULE: return GQAMPackage.GA_COMM_HOST__SCHEDULE;
				case GRMPackage.SCHEDULER__PROCESSING_UNITS: return GQAMPackage.GA_COMM_HOST__PROCESSING_UNITS;
				case GRMPackage.SCHEDULER__HOST: return GQAMPackage.GA_COMM_HOST__HOST;
				case GRMPackage.SCHEDULER__PROTECTED_SHARED_RSOURCES: return GQAMPackage.GA_COMM_HOST__PROTECTED_SHARED_RSOURCES;
				case GRMPackage.SCHEDULER__SCHEDULABLE_RESOURCES: return GQAMPackage.GA_COMM_HOST__SCHEDULABLE_RESOURCES;
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
		result.append(" (isPreemptible: ");
		result.append(isPreemptible);
		result.append(", schedPolicy: ");
		result.append(schedPolicy);
		result.append(", otherSchedPolicy: ");
		result.append(otherSchedPolicy);
		result.append(')');
		return result.toString();
	}

} //GaCommHostImpl
