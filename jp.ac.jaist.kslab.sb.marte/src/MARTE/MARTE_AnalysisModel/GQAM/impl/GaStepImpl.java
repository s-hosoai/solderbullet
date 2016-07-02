/**
 */
package MARTE.MARTE_AnalysisModel.GQAM.impl;

import MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;
import MARTE.MARTE_AnalysisModel.GQAM.GaExecHost;
import MARTE.MARTE_AnalysisModel.GQAM.GaRequestedService;
import MARTE.MARTE_AnalysisModel.GQAM.GaScenario;
import MARTE.MARTE_AnalysisModel.GQAM.GaStep;

import MARTE.MARTE_Foundations.GRM.SchedulableResource;

import MARTE_Library.BasicNFP_Types.NFP_Boolean;
import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Integer;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ga Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaStepImpl#getIsAtomic <em>Is Atomic</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaStepImpl#getBlockT <em>Block T</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaStepImpl#getRep <em>Rep</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaStepImpl#getProb <em>Prob</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaStepImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaStepImpl#getConcurRes <em>Concur Res</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaStepImpl#getHost <em>Host</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaStepImpl#getServDemand <em>Serv Demand</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaStepImpl#getServCount <em>Serv Count</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaStepImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaStepImpl#getSelfDelay <em>Self Delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GaStepImpl extends GaScenarioImpl implements GaStep {
	/**
	 * The cached value of the '{@link #getIsAtomic() <em>Is Atomic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAtomic()
	 * @generated
	 * @ordered
	 */
	protected NFP_Boolean isAtomic;

	/**
	 * The cached value of the '{@link #getBlockT() <em>Block T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockT()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration blockT;

	/**
	 * The cached value of the '{@link #getRep() <em>Rep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRep()
	 * @generated
	 * @ordered
	 */
	protected NFP_Real rep;

	/**
	 * The cached value of the '{@link #getProb() <em>Prob</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProb()
	 * @generated
	 * @ordered
	 */
	protected NFP_Real prob;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected NFP_Integer priority;

	/**
	 * The cached value of the '{@link #getConcurRes() <em>Concur Res</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurRes()
	 * @generated
	 * @ordered
	 */
	protected SchedulableResource concurRes;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected GaExecHost host;

	/**
	 * The cached value of the '{@link #getServDemand() <em>Serv Demand</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServDemand()
	 * @generated
	 * @ordered
	 */
	protected EList servDemand;

	/**
	 * The cached value of the '{@link #getServCount() <em>Serv Count</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServCount()
	 * @generated
	 * @ordered
	 */
	protected EList servCount;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected GaScenario behavior;

	/**
	 * The cached value of the '{@link #getSelfDelay() <em>Self Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfDelay()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration selfDelay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GaStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GQAMPackage.Literals.GA_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Boolean getIsAtomic() {
		return isAtomic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsAtomic(NFP_Boolean newIsAtomic, NotificationChain msgs) {
		NFP_Boolean oldIsAtomic = isAtomic;
		isAtomic = newIsAtomic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_STEP__IS_ATOMIC, oldIsAtomic, newIsAtomic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAtomic(NFP_Boolean newIsAtomic) {
		if (newIsAtomic != isAtomic) {
			NotificationChain msgs = null;
			if (isAtomic != null)
				msgs = ((InternalEObject)isAtomic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_STEP__IS_ATOMIC, null, msgs);
			if (newIsAtomic != null)
				msgs = ((InternalEObject)newIsAtomic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_STEP__IS_ATOMIC, null, msgs);
			msgs = basicSetIsAtomic(newIsAtomic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_STEP__IS_ATOMIC, newIsAtomic, newIsAtomic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getBlockT() {
		return blockT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlockT(NFP_Duration newBlockT, NotificationChain msgs) {
		NFP_Duration oldBlockT = blockT;
		blockT = newBlockT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_STEP__BLOCK_T, oldBlockT, newBlockT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockT(NFP_Duration newBlockT) {
		if (newBlockT != blockT) {
			NotificationChain msgs = null;
			if (blockT != null)
				msgs = ((InternalEObject)blockT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_STEP__BLOCK_T, null, msgs);
			if (newBlockT != null)
				msgs = ((InternalEObject)newBlockT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_STEP__BLOCK_T, null, msgs);
			msgs = basicSetBlockT(newBlockT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_STEP__BLOCK_T, newBlockT, newBlockT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Real getRep() {
		return rep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRep(NFP_Real newRep, NotificationChain msgs) {
		NFP_Real oldRep = rep;
		rep = newRep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_STEP__REP, oldRep, newRep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRep(NFP_Real newRep) {
		if (newRep != rep) {
			NotificationChain msgs = null;
			if (rep != null)
				msgs = ((InternalEObject)rep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_STEP__REP, null, msgs);
			if (newRep != null)
				msgs = ((InternalEObject)newRep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_STEP__REP, null, msgs);
			msgs = basicSetRep(newRep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_STEP__REP, newRep, newRep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Real getProb() {
		return prob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProb(NFP_Real newProb, NotificationChain msgs) {
		NFP_Real oldProb = prob;
		prob = newProb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_STEP__PROB, oldProb, newProb);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProb(NFP_Real newProb) {
		if (newProb != prob) {
			NotificationChain msgs = null;
			if (prob != null)
				msgs = ((InternalEObject)prob).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_STEP__PROB, null, msgs);
			if (newProb != null)
				msgs = ((InternalEObject)newProb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_STEP__PROB, null, msgs);
			msgs = basicSetProb(newProb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_STEP__PROB, newProb, newProb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Integer getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(NFP_Integer newPriority, NotificationChain msgs) {
		NFP_Integer oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_STEP__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(NFP_Integer newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_STEP__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_STEP__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_STEP__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulableResource getConcurRes() {
		if (concurRes != null && concurRes.eIsProxy()) {
			InternalEObject oldConcurRes = (InternalEObject)concurRes;
			concurRes = (SchedulableResource)eResolveProxy(oldConcurRes);
			if (concurRes != oldConcurRes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GQAMPackage.GA_STEP__CONCUR_RES, oldConcurRes, concurRes));
			}
		}
		return concurRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulableResource basicGetConcurRes() {
		return concurRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurRes(SchedulableResource newConcurRes) {
		SchedulableResource oldConcurRes = concurRes;
		concurRes = newConcurRes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_STEP__CONCUR_RES, oldConcurRes, concurRes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaExecHost getHost() {
		if (host != null && host.eIsProxy()) {
			InternalEObject oldHost = (InternalEObject)host;
			host = (GaExecHost)eResolveProxy(oldHost);
			if (host != oldHost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GQAMPackage.GA_STEP__HOST, oldHost, host));
			}
		}
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaExecHost basicGetHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(GaExecHost newHost) {
		GaExecHost oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_STEP__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getServDemand() {
		if (servDemand == null) {
			servDemand = new EObjectResolvingEList(GaRequestedService.class, this, GQAMPackage.GA_STEP__SERV_DEMAND);
		}
		return servDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getServCount() {
		if (servCount == null) {
			servCount = new EObjectContainmentEList(NFP_Real.class, this, GQAMPackage.GA_STEP__SERV_COUNT);
		}
		return servCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaScenario getBehavior() {
		if (behavior != null && behavior.eIsProxy()) {
			InternalEObject oldBehavior = (InternalEObject)behavior;
			behavior = (GaScenario)eResolveProxy(oldBehavior);
			if (behavior != oldBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GQAMPackage.GA_STEP__BEHAVIOR, oldBehavior, behavior));
			}
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaScenario basicGetBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(GaScenario newBehavior) {
		GaScenario oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_STEP__BEHAVIOR, oldBehavior, behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getSelfDelay() {
		return selfDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelfDelay(NFP_Duration newSelfDelay, NotificationChain msgs) {
		NFP_Duration oldSelfDelay = selfDelay;
		selfDelay = newSelfDelay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_STEP__SELF_DELAY, oldSelfDelay, newSelfDelay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfDelay(NFP_Duration newSelfDelay) {
		if (newSelfDelay != selfDelay) {
			NotificationChain msgs = null;
			if (selfDelay != null)
				msgs = ((InternalEObject)selfDelay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_STEP__SELF_DELAY, null, msgs);
			if (newSelfDelay != null)
				msgs = ((InternalEObject)newSelfDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_STEP__SELF_DELAY, null, msgs);
			msgs = basicSetSelfDelay(newSelfDelay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_STEP__SELF_DELAY, newSelfDelay, newSelfDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GQAMPackage.GA_STEP__IS_ATOMIC:
				return basicSetIsAtomic(null, msgs);
			case GQAMPackage.GA_STEP__BLOCK_T:
				return basicSetBlockT(null, msgs);
			case GQAMPackage.GA_STEP__REP:
				return basicSetRep(null, msgs);
			case GQAMPackage.GA_STEP__PROB:
				return basicSetProb(null, msgs);
			case GQAMPackage.GA_STEP__PRIORITY:
				return basicSetPriority(null, msgs);
			case GQAMPackage.GA_STEP__SERV_COUNT:
				return ((InternalEList)getServCount()).basicRemove(otherEnd, msgs);
			case GQAMPackage.GA_STEP__SELF_DELAY:
				return basicSetSelfDelay(null, msgs);
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
			case GQAMPackage.GA_STEP__IS_ATOMIC:
				return getIsAtomic();
			case GQAMPackage.GA_STEP__BLOCK_T:
				return getBlockT();
			case GQAMPackage.GA_STEP__REP:
				return getRep();
			case GQAMPackage.GA_STEP__PROB:
				return getProb();
			case GQAMPackage.GA_STEP__PRIORITY:
				return getPriority();
			case GQAMPackage.GA_STEP__CONCUR_RES:
				if (resolve) return getConcurRes();
				return basicGetConcurRes();
			case GQAMPackage.GA_STEP__HOST:
				if (resolve) return getHost();
				return basicGetHost();
			case GQAMPackage.GA_STEP__SERV_DEMAND:
				return getServDemand();
			case GQAMPackage.GA_STEP__SERV_COUNT:
				return getServCount();
			case GQAMPackage.GA_STEP__BEHAVIOR:
				if (resolve) return getBehavior();
				return basicGetBehavior();
			case GQAMPackage.GA_STEP__SELF_DELAY:
				return getSelfDelay();
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
			case GQAMPackage.GA_STEP__IS_ATOMIC:
				setIsAtomic((NFP_Boolean)newValue);
				return;
			case GQAMPackage.GA_STEP__BLOCK_T:
				setBlockT((NFP_Duration)newValue);
				return;
			case GQAMPackage.GA_STEP__REP:
				setRep((NFP_Real)newValue);
				return;
			case GQAMPackage.GA_STEP__PROB:
				setProb((NFP_Real)newValue);
				return;
			case GQAMPackage.GA_STEP__PRIORITY:
				setPriority((NFP_Integer)newValue);
				return;
			case GQAMPackage.GA_STEP__CONCUR_RES:
				setConcurRes((SchedulableResource)newValue);
				return;
			case GQAMPackage.GA_STEP__HOST:
				setHost((GaExecHost)newValue);
				return;
			case GQAMPackage.GA_STEP__SERV_DEMAND:
				getServDemand().clear();
				getServDemand().addAll((Collection)newValue);
				return;
			case GQAMPackage.GA_STEP__SERV_COUNT:
				getServCount().clear();
				getServCount().addAll((Collection)newValue);
				return;
			case GQAMPackage.GA_STEP__BEHAVIOR:
				setBehavior((GaScenario)newValue);
				return;
			case GQAMPackage.GA_STEP__SELF_DELAY:
				setSelfDelay((NFP_Duration)newValue);
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
			case GQAMPackage.GA_STEP__IS_ATOMIC:
				setIsAtomic((NFP_Boolean)null);
				return;
			case GQAMPackage.GA_STEP__BLOCK_T:
				setBlockT((NFP_Duration)null);
				return;
			case GQAMPackage.GA_STEP__REP:
				setRep((NFP_Real)null);
				return;
			case GQAMPackage.GA_STEP__PROB:
				setProb((NFP_Real)null);
				return;
			case GQAMPackage.GA_STEP__PRIORITY:
				setPriority((NFP_Integer)null);
				return;
			case GQAMPackage.GA_STEP__CONCUR_RES:
				setConcurRes((SchedulableResource)null);
				return;
			case GQAMPackage.GA_STEP__HOST:
				setHost((GaExecHost)null);
				return;
			case GQAMPackage.GA_STEP__SERV_DEMAND:
				getServDemand().clear();
				return;
			case GQAMPackage.GA_STEP__SERV_COUNT:
				getServCount().clear();
				return;
			case GQAMPackage.GA_STEP__BEHAVIOR:
				setBehavior((GaScenario)null);
				return;
			case GQAMPackage.GA_STEP__SELF_DELAY:
				setSelfDelay((NFP_Duration)null);
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
			case GQAMPackage.GA_STEP__IS_ATOMIC:
				return isAtomic != null;
			case GQAMPackage.GA_STEP__BLOCK_T:
				return blockT != null;
			case GQAMPackage.GA_STEP__REP:
				return rep != null;
			case GQAMPackage.GA_STEP__PROB:
				return prob != null;
			case GQAMPackage.GA_STEP__PRIORITY:
				return priority != null;
			case GQAMPackage.GA_STEP__CONCUR_RES:
				return concurRes != null;
			case GQAMPackage.GA_STEP__HOST:
				return host != null;
			case GQAMPackage.GA_STEP__SERV_DEMAND:
				return servDemand != null && !servDemand.isEmpty();
			case GQAMPackage.GA_STEP__SERV_COUNT:
				return servCount != null && !servCount.isEmpty();
			case GQAMPackage.GA_STEP__BEHAVIOR:
				return behavior != null;
			case GQAMPackage.GA_STEP__SELF_DELAY:
				return selfDelay != null;
		}
		return super.eIsSet(featureID);
	}

} //GaStepImpl
