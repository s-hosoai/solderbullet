/**
 */
package MARTE.MARTE_AnalysisModel.GQAM.impl;

import MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;
import MARTE.MARTE_AnalysisModel.GQAM.GaScenario;
import MARTE.MARTE_AnalysisModel.GQAM.GaStep;
import MARTE.MARTE_AnalysisModel.GQAM.GaTimedObs;
import MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent;

import MARTE.MARTE_Foundations.GRM.impl.ResourceUsageImpl;

import MARTE.MARTE_Foundations.Time.Clock;
import MARTE.MARTE_Foundations.Time.TimePackage;
import MARTE.MARTE_Foundations.Time.TimedElement;
import MARTE.MARTE_Foundations.Time.TimedProcessing;

import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Frequency;
import MARTE_Library.BasicNFP_Types.NFP_Real;

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

import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ga Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaScenarioImpl#getOn <em>On</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaScenarioImpl#getBase_Action <em>Base Action</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaScenarioImpl#getBase_Behavior <em>Base Behavior</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaScenarioImpl#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaScenarioImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaScenarioImpl#getStart <em>Start</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaScenarioImpl#getFinish <em>Finish</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaScenarioImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaScenarioImpl#getHostDemand <em>Host Demand</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaScenarioImpl#getHostDemandOps <em>Host Demand Ops</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaScenarioImpl#getInterOccT <em>Inter Occ T</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaScenarioImpl#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaScenarioImpl#getRespT <em>Resp T</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaScenarioImpl#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaScenarioImpl#getUtilizationOnHost <em>Utilization On Host</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaScenarioImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaScenarioImpl#getTiming <em>Timing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GaScenarioImpl extends ResourceUsageImpl implements GaScenario {
	/**
	 * The cached value of the '{@link #getOn() <em>On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn()
	 * @generated
	 * @ordered
	 */
	protected EList on;

	/**
	 * The cached value of the '{@link #getBase_Action() <em>Base Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Action()
	 * @generated
	 * @ordered
	 */
	protected Action base_Action;

	/**
	 * The cached value of the '{@link #getBase_Behavior() <em>Base Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Behavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior base_Behavior;

	/**
	 * The cached value of the '{@link #getBase_Message() <em>Base Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Message()
	 * @generated
	 * @ordered
	 */
	protected Message base_Message;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification duration;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Event start;

	/**
	 * The cached value of the '{@link #getFinish() <em>Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinish()
	 * @generated
	 * @ordered
	 */
	protected Event finish;

	/**
	 * The cached value of the '{@link #getCause() <em>Cause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected GaWorkloadEvent cause;

	/**
	 * The cached value of the '{@link #getHostDemand() <em>Host Demand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostDemand()
	 * @generated
	 * @ordered
	 */
	protected EList hostDemand;

	/**
	 * The cached value of the '{@link #getHostDemandOps() <em>Host Demand Ops</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostDemandOps()
	 * @generated
	 * @ordered
	 */
	protected EList hostDemandOps;

	/**
	 * The cached value of the '{@link #getInterOccT() <em>Inter Occ T</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterOccT()
	 * @generated
	 * @ordered
	 */
	protected EList interOccT;

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
	 * The cached value of the '{@link #getRespT() <em>Resp T</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespT()
	 * @generated
	 * @ordered
	 */
	protected EList respT;

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
	 * The cached value of the '{@link #getUtilizationOnHost() <em>Utilization On Host</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilizationOnHost()
	 * @generated
	 * @ordered
	 */
	protected EList utilizationOnHost;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected GaStep root;

	/**
	 * The cached value of the '{@link #getTiming() <em>Timing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiming()
	 * @generated
	 * @ordered
	 */
	protected EList timing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GaScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GQAMPackage.Literals.GA_SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOn() {
		if (on == null) {
			on = new EObjectResolvingEList(Clock.class, this, GQAMPackage.GA_SCENARIO__ON);
		}
		return on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getBase_Action() {
		if (base_Action != null && base_Action.eIsProxy()) {
			InternalEObject oldBase_Action = (InternalEObject)base_Action;
			base_Action = (Action)eResolveProxy(oldBase_Action);
			if (base_Action != oldBase_Action) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GQAMPackage.GA_SCENARIO__BASE_ACTION, oldBase_Action, base_Action));
			}
		}
		return base_Action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetBase_Action() {
		return base_Action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Action(Action newBase_Action) {
		Action oldBase_Action = base_Action;
		base_Action = newBase_Action;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_SCENARIO__BASE_ACTION, oldBase_Action, base_Action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBase_Behavior() {
		if (base_Behavior != null && base_Behavior.eIsProxy()) {
			InternalEObject oldBase_Behavior = (InternalEObject)base_Behavior;
			base_Behavior = (Behavior)eResolveProxy(oldBase_Behavior);
			if (base_Behavior != oldBase_Behavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GQAMPackage.GA_SCENARIO__BASE_BEHAVIOR, oldBase_Behavior, base_Behavior));
			}
		}
		return base_Behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetBase_Behavior() {
		return base_Behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Behavior(Behavior newBase_Behavior) {
		Behavior oldBase_Behavior = base_Behavior;
		base_Behavior = newBase_Behavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_SCENARIO__BASE_BEHAVIOR, oldBase_Behavior, base_Behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getBase_Message() {
		if (base_Message != null && base_Message.eIsProxy()) {
			InternalEObject oldBase_Message = (InternalEObject)base_Message;
			base_Message = (Message)eResolveProxy(oldBase_Message);
			if (base_Message != oldBase_Message) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GQAMPackage.GA_SCENARIO__BASE_MESSAGE, oldBase_Message, base_Message));
			}
		}
		return base_Message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetBase_Message() {
		return base_Message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Message(Message newBase_Message) {
		Message oldBase_Message = base_Message;
		base_Message = newBase_Message;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_SCENARIO__BASE_MESSAGE, oldBase_Message, base_Message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(ValueSpecification newDuration, NotificationChain msgs) {
		ValueSpecification oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_SCENARIO__DURATION, oldDuration, newDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(ValueSpecification newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_SCENARIO__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_SCENARIO__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_SCENARIO__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (Event)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GQAMPackage.GA_SCENARIO__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Event newStart) {
		Event oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_SCENARIO__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getFinish() {
		if (finish != null && finish.eIsProxy()) {
			InternalEObject oldFinish = (InternalEObject)finish;
			finish = (Event)eResolveProxy(oldFinish);
			if (finish != oldFinish) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GQAMPackage.GA_SCENARIO__FINISH, oldFinish, finish));
			}
		}
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetFinish() {
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinish(Event newFinish) {
		Event oldFinish = finish;
		finish = newFinish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_SCENARIO__FINISH, oldFinish, finish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaWorkloadEvent getCause() {
		if (cause != null && cause.eIsProxy()) {
			InternalEObject oldCause = (InternalEObject)cause;
			cause = (GaWorkloadEvent)eResolveProxy(oldCause);
			if (cause != oldCause) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GQAMPackage.GA_SCENARIO__CAUSE, oldCause, cause));
			}
		}
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaWorkloadEvent basicGetCause() {
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCause(GaWorkloadEvent newCause) {
		GaWorkloadEvent oldCause = cause;
		cause = newCause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_SCENARIO__CAUSE, oldCause, cause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getHostDemand() {
		if (hostDemand == null) {
			hostDemand = new EObjectContainmentEList(NFP_Duration.class, this, GQAMPackage.GA_SCENARIO__HOST_DEMAND);
		}
		return hostDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getHostDemandOps() {
		if (hostDemandOps == null) {
			hostDemandOps = new EObjectContainmentEList(NFP_Real.class, this, GQAMPackage.GA_SCENARIO__HOST_DEMAND_OPS);
		}
		return hostDemandOps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInterOccT() {
		if (interOccT == null) {
			interOccT = new EObjectContainmentEList(NFP_Duration.class, this, GQAMPackage.GA_SCENARIO__INTER_OCC_T);
		}
		return interOccT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getThroughput() {
		if (throughput == null) {
			throughput = new EObjectContainmentEList(NFP_Frequency.class, this, GQAMPackage.GA_SCENARIO__THROUGHPUT);
		}
		return throughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRespT() {
		if (respT == null) {
			respT = new EObjectContainmentEList(NFP_Duration.class, this, GQAMPackage.GA_SCENARIO__RESP_T);
		}
		return respT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUtilization() {
		if (utilization == null) {
			utilization = new EObjectContainmentEList(NFP_Real.class, this, GQAMPackage.GA_SCENARIO__UTILIZATION);
		}
		return utilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUtilizationOnHost() {
		if (utilizationOnHost == null) {
			utilizationOnHost = new EObjectContainmentEList(NFP_Real.class, this, GQAMPackage.GA_SCENARIO__UTILIZATION_ON_HOST);
		}
		return utilizationOnHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaStep getRoot() {
		if (root != null && root.eIsProxy()) {
			InternalEObject oldRoot = (InternalEObject)root;
			root = (GaStep)eResolveProxy(oldRoot);
			if (root != oldRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GQAMPackage.GA_SCENARIO__ROOT, oldRoot, root));
			}
		}
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaStep basicGetRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(GaStep newRoot) {
		GaStep oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_SCENARIO__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTiming() {
		if (timing == null) {
			timing = new EObjectResolvingEList(GaTimedObs.class, this, GQAMPackage.GA_SCENARIO__TIMING);
		}
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GQAMPackage.GA_SCENARIO__DURATION:
				return basicSetDuration(null, msgs);
			case GQAMPackage.GA_SCENARIO__HOST_DEMAND:
				return ((InternalEList)getHostDemand()).basicRemove(otherEnd, msgs);
			case GQAMPackage.GA_SCENARIO__HOST_DEMAND_OPS:
				return ((InternalEList)getHostDemandOps()).basicRemove(otherEnd, msgs);
			case GQAMPackage.GA_SCENARIO__INTER_OCC_T:
				return ((InternalEList)getInterOccT()).basicRemove(otherEnd, msgs);
			case GQAMPackage.GA_SCENARIO__THROUGHPUT:
				return ((InternalEList)getThroughput()).basicRemove(otherEnd, msgs);
			case GQAMPackage.GA_SCENARIO__RESP_T:
				return ((InternalEList)getRespT()).basicRemove(otherEnd, msgs);
			case GQAMPackage.GA_SCENARIO__UTILIZATION:
				return ((InternalEList)getUtilization()).basicRemove(otherEnd, msgs);
			case GQAMPackage.GA_SCENARIO__UTILIZATION_ON_HOST:
				return ((InternalEList)getUtilizationOnHost()).basicRemove(otherEnd, msgs);
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
			case GQAMPackage.GA_SCENARIO__ON:
				return getOn();
			case GQAMPackage.GA_SCENARIO__BASE_ACTION:
				if (resolve) return getBase_Action();
				return basicGetBase_Action();
			case GQAMPackage.GA_SCENARIO__BASE_BEHAVIOR:
				if (resolve) return getBase_Behavior();
				return basicGetBase_Behavior();
			case GQAMPackage.GA_SCENARIO__BASE_MESSAGE:
				if (resolve) return getBase_Message();
				return basicGetBase_Message();
			case GQAMPackage.GA_SCENARIO__DURATION:
				return getDuration();
			case GQAMPackage.GA_SCENARIO__START:
				if (resolve) return getStart();
				return basicGetStart();
			case GQAMPackage.GA_SCENARIO__FINISH:
				if (resolve) return getFinish();
				return basicGetFinish();
			case GQAMPackage.GA_SCENARIO__CAUSE:
				if (resolve) return getCause();
				return basicGetCause();
			case GQAMPackage.GA_SCENARIO__HOST_DEMAND:
				return getHostDemand();
			case GQAMPackage.GA_SCENARIO__HOST_DEMAND_OPS:
				return getHostDemandOps();
			case GQAMPackage.GA_SCENARIO__INTER_OCC_T:
				return getInterOccT();
			case GQAMPackage.GA_SCENARIO__THROUGHPUT:
				return getThroughput();
			case GQAMPackage.GA_SCENARIO__RESP_T:
				return getRespT();
			case GQAMPackage.GA_SCENARIO__UTILIZATION:
				return getUtilization();
			case GQAMPackage.GA_SCENARIO__UTILIZATION_ON_HOST:
				return getUtilizationOnHost();
			case GQAMPackage.GA_SCENARIO__ROOT:
				if (resolve) return getRoot();
				return basicGetRoot();
			case GQAMPackage.GA_SCENARIO__TIMING:
				return getTiming();
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
			case GQAMPackage.GA_SCENARIO__ON:
				getOn().clear();
				getOn().addAll((Collection)newValue);
				return;
			case GQAMPackage.GA_SCENARIO__BASE_ACTION:
				setBase_Action((Action)newValue);
				return;
			case GQAMPackage.GA_SCENARIO__BASE_BEHAVIOR:
				setBase_Behavior((Behavior)newValue);
				return;
			case GQAMPackage.GA_SCENARIO__BASE_MESSAGE:
				setBase_Message((Message)newValue);
				return;
			case GQAMPackage.GA_SCENARIO__DURATION:
				setDuration((ValueSpecification)newValue);
				return;
			case GQAMPackage.GA_SCENARIO__START:
				setStart((Event)newValue);
				return;
			case GQAMPackage.GA_SCENARIO__FINISH:
				setFinish((Event)newValue);
				return;
			case GQAMPackage.GA_SCENARIO__CAUSE:
				setCause((GaWorkloadEvent)newValue);
				return;
			case GQAMPackage.GA_SCENARIO__HOST_DEMAND:
				getHostDemand().clear();
				getHostDemand().addAll((Collection)newValue);
				return;
			case GQAMPackage.GA_SCENARIO__HOST_DEMAND_OPS:
				getHostDemandOps().clear();
				getHostDemandOps().addAll((Collection)newValue);
				return;
			case GQAMPackage.GA_SCENARIO__INTER_OCC_T:
				getInterOccT().clear();
				getInterOccT().addAll((Collection)newValue);
				return;
			case GQAMPackage.GA_SCENARIO__THROUGHPUT:
				getThroughput().clear();
				getThroughput().addAll((Collection)newValue);
				return;
			case GQAMPackage.GA_SCENARIO__RESP_T:
				getRespT().clear();
				getRespT().addAll((Collection)newValue);
				return;
			case GQAMPackage.GA_SCENARIO__UTILIZATION:
				getUtilization().clear();
				getUtilization().addAll((Collection)newValue);
				return;
			case GQAMPackage.GA_SCENARIO__UTILIZATION_ON_HOST:
				getUtilizationOnHost().clear();
				getUtilizationOnHost().addAll((Collection)newValue);
				return;
			case GQAMPackage.GA_SCENARIO__ROOT:
				setRoot((GaStep)newValue);
				return;
			case GQAMPackage.GA_SCENARIO__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection)newValue);
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
			case GQAMPackage.GA_SCENARIO__ON:
				getOn().clear();
				return;
			case GQAMPackage.GA_SCENARIO__BASE_ACTION:
				setBase_Action((Action)null);
				return;
			case GQAMPackage.GA_SCENARIO__BASE_BEHAVIOR:
				setBase_Behavior((Behavior)null);
				return;
			case GQAMPackage.GA_SCENARIO__BASE_MESSAGE:
				setBase_Message((Message)null);
				return;
			case GQAMPackage.GA_SCENARIO__DURATION:
				setDuration((ValueSpecification)null);
				return;
			case GQAMPackage.GA_SCENARIO__START:
				setStart((Event)null);
				return;
			case GQAMPackage.GA_SCENARIO__FINISH:
				setFinish((Event)null);
				return;
			case GQAMPackage.GA_SCENARIO__CAUSE:
				setCause((GaWorkloadEvent)null);
				return;
			case GQAMPackage.GA_SCENARIO__HOST_DEMAND:
				getHostDemand().clear();
				return;
			case GQAMPackage.GA_SCENARIO__HOST_DEMAND_OPS:
				getHostDemandOps().clear();
				return;
			case GQAMPackage.GA_SCENARIO__INTER_OCC_T:
				getInterOccT().clear();
				return;
			case GQAMPackage.GA_SCENARIO__THROUGHPUT:
				getThroughput().clear();
				return;
			case GQAMPackage.GA_SCENARIO__RESP_T:
				getRespT().clear();
				return;
			case GQAMPackage.GA_SCENARIO__UTILIZATION:
				getUtilization().clear();
				return;
			case GQAMPackage.GA_SCENARIO__UTILIZATION_ON_HOST:
				getUtilizationOnHost().clear();
				return;
			case GQAMPackage.GA_SCENARIO__ROOT:
				setRoot((GaStep)null);
				return;
			case GQAMPackage.GA_SCENARIO__TIMING:
				getTiming().clear();
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
			case GQAMPackage.GA_SCENARIO__ON:
				return on != null && !on.isEmpty();
			case GQAMPackage.GA_SCENARIO__BASE_ACTION:
				return base_Action != null;
			case GQAMPackage.GA_SCENARIO__BASE_BEHAVIOR:
				return base_Behavior != null;
			case GQAMPackage.GA_SCENARIO__BASE_MESSAGE:
				return base_Message != null;
			case GQAMPackage.GA_SCENARIO__DURATION:
				return duration != null;
			case GQAMPackage.GA_SCENARIO__START:
				return start != null;
			case GQAMPackage.GA_SCENARIO__FINISH:
				return finish != null;
			case GQAMPackage.GA_SCENARIO__CAUSE:
				return cause != null;
			case GQAMPackage.GA_SCENARIO__HOST_DEMAND:
				return hostDemand != null && !hostDemand.isEmpty();
			case GQAMPackage.GA_SCENARIO__HOST_DEMAND_OPS:
				return hostDemandOps != null && !hostDemandOps.isEmpty();
			case GQAMPackage.GA_SCENARIO__INTER_OCC_T:
				return interOccT != null && !interOccT.isEmpty();
			case GQAMPackage.GA_SCENARIO__THROUGHPUT:
				return throughput != null && !throughput.isEmpty();
			case GQAMPackage.GA_SCENARIO__RESP_T:
				return respT != null && !respT.isEmpty();
			case GQAMPackage.GA_SCENARIO__UTILIZATION:
				return utilization != null && !utilization.isEmpty();
			case GQAMPackage.GA_SCENARIO__UTILIZATION_ON_HOST:
				return utilizationOnHost != null && !utilizationOnHost.isEmpty();
			case GQAMPackage.GA_SCENARIO__ROOT:
				return root != null;
			case GQAMPackage.GA_SCENARIO__TIMING:
				return timing != null && !timing.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == TimedElement.class) {
			switch (derivedFeatureID) {
				case GQAMPackage.GA_SCENARIO__ON: return TimePackage.TIMED_ELEMENT__ON;
				default: return -1;
			}
		}
		if (baseClass == TimedProcessing.class) {
			switch (derivedFeatureID) {
				case GQAMPackage.GA_SCENARIO__BASE_ACTION: return TimePackage.TIMED_PROCESSING__BASE_ACTION;
				case GQAMPackage.GA_SCENARIO__BASE_BEHAVIOR: return TimePackage.TIMED_PROCESSING__BASE_BEHAVIOR;
				case GQAMPackage.GA_SCENARIO__BASE_MESSAGE: return TimePackage.TIMED_PROCESSING__BASE_MESSAGE;
				case GQAMPackage.GA_SCENARIO__DURATION: return TimePackage.TIMED_PROCESSING__DURATION;
				case GQAMPackage.GA_SCENARIO__START: return TimePackage.TIMED_PROCESSING__START;
				case GQAMPackage.GA_SCENARIO__FINISH: return TimePackage.TIMED_PROCESSING__FINISH;
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
		if (baseClass == TimedElement.class) {
			switch (baseFeatureID) {
				case TimePackage.TIMED_ELEMENT__ON: return GQAMPackage.GA_SCENARIO__ON;
				default: return -1;
			}
		}
		if (baseClass == TimedProcessing.class) {
			switch (baseFeatureID) {
				case TimePackage.TIMED_PROCESSING__BASE_ACTION: return GQAMPackage.GA_SCENARIO__BASE_ACTION;
				case TimePackage.TIMED_PROCESSING__BASE_BEHAVIOR: return GQAMPackage.GA_SCENARIO__BASE_BEHAVIOR;
				case TimePackage.TIMED_PROCESSING__BASE_MESSAGE: return GQAMPackage.GA_SCENARIO__BASE_MESSAGE;
				case TimePackage.TIMED_PROCESSING__DURATION: return GQAMPackage.GA_SCENARIO__DURATION;
				case TimePackage.TIMED_PROCESSING__START: return GQAMPackage.GA_SCENARIO__START;
				case TimePackage.TIMED_PROCESSING__FINISH: return GQAMPackage.GA_SCENARIO__FINISH;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //GaScenarioImpl
