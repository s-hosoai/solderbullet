/**
 */
package MARTE.MARTE_AnalysisModel.SAM.impl;

import MARTE.MARTE_AnalysisModel.GQAM.impl.GaStepImpl;

import MARTE.MARTE_AnalysisModel.SAM.SAMPackage;
import MARTE.MARTE_AnalysisModel.SAM.SaSharedResource;
import MARTE.MARTE_AnalysisModel.SAM.SaStep;

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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.BehavioralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sa Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaStepImpl#getBase_BehavioralFeature <em>Base Behavioral Feature</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaStepImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaStepImpl#getSpareCap <em>Spare Cap</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaStepImpl#getSchSlack <em>Sch Slack</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaStepImpl#getPreemptT <em>Preempt T</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaStepImpl#getReadyT <em>Ready T</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaStepImpl#getNonpreemptionBlocking <em>Nonpreemption Blocking</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaStepImpl#getSharedRes <em>Shared Res</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaStepImpl#getSelfSuspensionBlocking <em>Self Suspension Blocking</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaStepImpl#getNumberSelfSuspensions <em>Number Self Suspensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SaStepImpl extends GaStepImpl implements SaStep {
	/**
	 * The cached value of the '{@link #getBase_BehavioralFeature() <em>Base Behavioral Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_BehavioralFeature()
	 * @generated
	 * @ordered
	 */
	protected BehavioralFeature base_BehavioralFeature;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration deadline;

	/**
	 * The cached value of the '{@link #getSpareCap() <em>Spare Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpareCap()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration spareCap;

	/**
	 * The cached value of the '{@link #getSchSlack() <em>Sch Slack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchSlack()
	 * @generated
	 * @ordered
	 */
	protected NFP_Real schSlack;

	/**
	 * The cached value of the '{@link #getPreemptT() <em>Preempt T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreemptT()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration preemptT;

	/**
	 * The cached value of the '{@link #getReadyT() <em>Ready T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadyT()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration readyT;

	/**
	 * The cached value of the '{@link #getNonpreemptionBlocking() <em>Nonpreemption Blocking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonpreemptionBlocking()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration nonpreemptionBlocking;

	/**
	 * The cached value of the '{@link #getSharedRes() <em>Shared Res</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedRes()
	 * @generated
	 * @ordered
	 */
	protected EList sharedRes;

	/**
	 * The cached value of the '{@link #getSelfSuspensionBlocking() <em>Self Suspension Blocking</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfSuspensionBlocking()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration selfSuspensionBlocking;

	/**
	 * The cached value of the '{@link #getNumberSelfSuspensions() <em>Number Self Suspensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberSelfSuspensions()
	 * @generated
	 * @ordered
	 */
	protected NFP_Integer numberSelfSuspensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SAMPackage.Literals.SA_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeature getBase_BehavioralFeature() {
		if (base_BehavioralFeature != null && base_BehavioralFeature.eIsProxy()) {
			InternalEObject oldBase_BehavioralFeature = (InternalEObject)base_BehavioralFeature;
			base_BehavioralFeature = (BehavioralFeature)eResolveProxy(oldBase_BehavioralFeature);
			if (base_BehavioralFeature != oldBase_BehavioralFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SAMPackage.SA_STEP__BASE_BEHAVIORAL_FEATURE, oldBase_BehavioralFeature, base_BehavioralFeature));
			}
		}
		return base_BehavioralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeature basicGetBase_BehavioralFeature() {
		return base_BehavioralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_BehavioralFeature(BehavioralFeature newBase_BehavioralFeature) {
		BehavioralFeature oldBase_BehavioralFeature = base_BehavioralFeature;
		base_BehavioralFeature = newBase_BehavioralFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_STEP__BASE_BEHAVIORAL_FEATURE, oldBase_BehavioralFeature, base_BehavioralFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeadline(NFP_Duration newDeadline, NotificationChain msgs) {
		NFP_Duration oldDeadline = deadline;
		deadline = newDeadline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_STEP__DEADLINE, oldDeadline, newDeadline);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(NFP_Duration newDeadline) {
		if (newDeadline != deadline) {
			NotificationChain msgs = null;
			if (deadline != null)
				msgs = ((InternalEObject)deadline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_STEP__DEADLINE, null, msgs);
			if (newDeadline != null)
				msgs = ((InternalEObject)newDeadline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_STEP__DEADLINE, null, msgs);
			msgs = basicSetDeadline(newDeadline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_STEP__DEADLINE, newDeadline, newDeadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getSpareCap() {
		return spareCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpareCap(NFP_Duration newSpareCap, NotificationChain msgs) {
		NFP_Duration oldSpareCap = spareCap;
		spareCap = newSpareCap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_STEP__SPARE_CAP, oldSpareCap, newSpareCap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpareCap(NFP_Duration newSpareCap) {
		if (newSpareCap != spareCap) {
			NotificationChain msgs = null;
			if (spareCap != null)
				msgs = ((InternalEObject)spareCap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_STEP__SPARE_CAP, null, msgs);
			if (newSpareCap != null)
				msgs = ((InternalEObject)newSpareCap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_STEP__SPARE_CAP, null, msgs);
			msgs = basicSetSpareCap(newSpareCap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_STEP__SPARE_CAP, newSpareCap, newSpareCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Real getSchSlack() {
		return schSlack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchSlack(NFP_Real newSchSlack, NotificationChain msgs) {
		NFP_Real oldSchSlack = schSlack;
		schSlack = newSchSlack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_STEP__SCH_SLACK, oldSchSlack, newSchSlack);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchSlack(NFP_Real newSchSlack) {
		if (newSchSlack != schSlack) {
			NotificationChain msgs = null;
			if (schSlack != null)
				msgs = ((InternalEObject)schSlack).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_STEP__SCH_SLACK, null, msgs);
			if (newSchSlack != null)
				msgs = ((InternalEObject)newSchSlack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_STEP__SCH_SLACK, null, msgs);
			msgs = basicSetSchSlack(newSchSlack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_STEP__SCH_SLACK, newSchSlack, newSchSlack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getPreemptT() {
		return preemptT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreemptT(NFP_Duration newPreemptT, NotificationChain msgs) {
		NFP_Duration oldPreemptT = preemptT;
		preemptT = newPreemptT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_STEP__PREEMPT_T, oldPreemptT, newPreemptT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreemptT(NFP_Duration newPreemptT) {
		if (newPreemptT != preemptT) {
			NotificationChain msgs = null;
			if (preemptT != null)
				msgs = ((InternalEObject)preemptT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_STEP__PREEMPT_T, null, msgs);
			if (newPreemptT != null)
				msgs = ((InternalEObject)newPreemptT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_STEP__PREEMPT_T, null, msgs);
			msgs = basicSetPreemptT(newPreemptT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_STEP__PREEMPT_T, newPreemptT, newPreemptT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getReadyT() {
		return readyT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadyT(NFP_Duration newReadyT, NotificationChain msgs) {
		NFP_Duration oldReadyT = readyT;
		readyT = newReadyT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_STEP__READY_T, oldReadyT, newReadyT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadyT(NFP_Duration newReadyT) {
		if (newReadyT != readyT) {
			NotificationChain msgs = null;
			if (readyT != null)
				msgs = ((InternalEObject)readyT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_STEP__READY_T, null, msgs);
			if (newReadyT != null)
				msgs = ((InternalEObject)newReadyT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_STEP__READY_T, null, msgs);
			msgs = basicSetReadyT(newReadyT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_STEP__READY_T, newReadyT, newReadyT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getNonpreemptionBlocking() {
		return nonpreemptionBlocking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNonpreemptionBlocking(NFP_Duration newNonpreemptionBlocking, NotificationChain msgs) {
		NFP_Duration oldNonpreemptionBlocking = nonpreemptionBlocking;
		nonpreemptionBlocking = newNonpreemptionBlocking;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_STEP__NONPREEMPTION_BLOCKING, oldNonpreemptionBlocking, newNonpreemptionBlocking);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonpreemptionBlocking(NFP_Duration newNonpreemptionBlocking) {
		if (newNonpreemptionBlocking != nonpreemptionBlocking) {
			NotificationChain msgs = null;
			if (nonpreemptionBlocking != null)
				msgs = ((InternalEObject)nonpreemptionBlocking).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_STEP__NONPREEMPTION_BLOCKING, null, msgs);
			if (newNonpreemptionBlocking != null)
				msgs = ((InternalEObject)newNonpreemptionBlocking).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_STEP__NONPREEMPTION_BLOCKING, null, msgs);
			msgs = basicSetNonpreemptionBlocking(newNonpreemptionBlocking, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_STEP__NONPREEMPTION_BLOCKING, newNonpreemptionBlocking, newNonpreemptionBlocking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSharedRes() {
		if (sharedRes == null) {
			sharedRes = new EObjectResolvingEList(SaSharedResource.class, this, SAMPackage.SA_STEP__SHARED_RES);
		}
		return sharedRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getSelfSuspensionBlocking() {
		return selfSuspensionBlocking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelfSuspensionBlocking(NFP_Duration newSelfSuspensionBlocking, NotificationChain msgs) {
		NFP_Duration oldSelfSuspensionBlocking = selfSuspensionBlocking;
		selfSuspensionBlocking = newSelfSuspensionBlocking;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_STEP__SELF_SUSPENSION_BLOCKING, oldSelfSuspensionBlocking, newSelfSuspensionBlocking);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfSuspensionBlocking(NFP_Duration newSelfSuspensionBlocking) {
		if (newSelfSuspensionBlocking != selfSuspensionBlocking) {
			NotificationChain msgs = null;
			if (selfSuspensionBlocking != null)
				msgs = ((InternalEObject)selfSuspensionBlocking).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_STEP__SELF_SUSPENSION_BLOCKING, null, msgs);
			if (newSelfSuspensionBlocking != null)
				msgs = ((InternalEObject)newSelfSuspensionBlocking).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_STEP__SELF_SUSPENSION_BLOCKING, null, msgs);
			msgs = basicSetSelfSuspensionBlocking(newSelfSuspensionBlocking, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_STEP__SELF_SUSPENSION_BLOCKING, newSelfSuspensionBlocking, newSelfSuspensionBlocking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Integer getNumberSelfSuspensions() {
		return numberSelfSuspensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberSelfSuspensions(NFP_Integer newNumberSelfSuspensions, NotificationChain msgs) {
		NFP_Integer oldNumberSelfSuspensions = numberSelfSuspensions;
		numberSelfSuspensions = newNumberSelfSuspensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_STEP__NUMBER_SELF_SUSPENSIONS, oldNumberSelfSuspensions, newNumberSelfSuspensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberSelfSuspensions(NFP_Integer newNumberSelfSuspensions) {
		if (newNumberSelfSuspensions != numberSelfSuspensions) {
			NotificationChain msgs = null;
			if (numberSelfSuspensions != null)
				msgs = ((InternalEObject)numberSelfSuspensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_STEP__NUMBER_SELF_SUSPENSIONS, null, msgs);
			if (newNumberSelfSuspensions != null)
				msgs = ((InternalEObject)newNumberSelfSuspensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_STEP__NUMBER_SELF_SUSPENSIONS, null, msgs);
			msgs = basicSetNumberSelfSuspensions(newNumberSelfSuspensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_STEP__NUMBER_SELF_SUSPENSIONS, newNumberSelfSuspensions, newNumberSelfSuspensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SAMPackage.SA_STEP__DEADLINE:
				return basicSetDeadline(null, msgs);
			case SAMPackage.SA_STEP__SPARE_CAP:
				return basicSetSpareCap(null, msgs);
			case SAMPackage.SA_STEP__SCH_SLACK:
				return basicSetSchSlack(null, msgs);
			case SAMPackage.SA_STEP__PREEMPT_T:
				return basicSetPreemptT(null, msgs);
			case SAMPackage.SA_STEP__READY_T:
				return basicSetReadyT(null, msgs);
			case SAMPackage.SA_STEP__NONPREEMPTION_BLOCKING:
				return basicSetNonpreemptionBlocking(null, msgs);
			case SAMPackage.SA_STEP__SELF_SUSPENSION_BLOCKING:
				return basicSetSelfSuspensionBlocking(null, msgs);
			case SAMPackage.SA_STEP__NUMBER_SELF_SUSPENSIONS:
				return basicSetNumberSelfSuspensions(null, msgs);
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
			case SAMPackage.SA_STEP__BASE_BEHAVIORAL_FEATURE:
				if (resolve) return getBase_BehavioralFeature();
				return basicGetBase_BehavioralFeature();
			case SAMPackage.SA_STEP__DEADLINE:
				return getDeadline();
			case SAMPackage.SA_STEP__SPARE_CAP:
				return getSpareCap();
			case SAMPackage.SA_STEP__SCH_SLACK:
				return getSchSlack();
			case SAMPackage.SA_STEP__PREEMPT_T:
				return getPreemptT();
			case SAMPackage.SA_STEP__READY_T:
				return getReadyT();
			case SAMPackage.SA_STEP__NONPREEMPTION_BLOCKING:
				return getNonpreemptionBlocking();
			case SAMPackage.SA_STEP__SHARED_RES:
				return getSharedRes();
			case SAMPackage.SA_STEP__SELF_SUSPENSION_BLOCKING:
				return getSelfSuspensionBlocking();
			case SAMPackage.SA_STEP__NUMBER_SELF_SUSPENSIONS:
				return getNumberSelfSuspensions();
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
			case SAMPackage.SA_STEP__BASE_BEHAVIORAL_FEATURE:
				setBase_BehavioralFeature((BehavioralFeature)newValue);
				return;
			case SAMPackage.SA_STEP__DEADLINE:
				setDeadline((NFP_Duration)newValue);
				return;
			case SAMPackage.SA_STEP__SPARE_CAP:
				setSpareCap((NFP_Duration)newValue);
				return;
			case SAMPackage.SA_STEP__SCH_SLACK:
				setSchSlack((NFP_Real)newValue);
				return;
			case SAMPackage.SA_STEP__PREEMPT_T:
				setPreemptT((NFP_Duration)newValue);
				return;
			case SAMPackage.SA_STEP__READY_T:
				setReadyT((NFP_Duration)newValue);
				return;
			case SAMPackage.SA_STEP__NONPREEMPTION_BLOCKING:
				setNonpreemptionBlocking((NFP_Duration)newValue);
				return;
			case SAMPackage.SA_STEP__SHARED_RES:
				getSharedRes().clear();
				getSharedRes().addAll((Collection)newValue);
				return;
			case SAMPackage.SA_STEP__SELF_SUSPENSION_BLOCKING:
				setSelfSuspensionBlocking((NFP_Duration)newValue);
				return;
			case SAMPackage.SA_STEP__NUMBER_SELF_SUSPENSIONS:
				setNumberSelfSuspensions((NFP_Integer)newValue);
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
			case SAMPackage.SA_STEP__BASE_BEHAVIORAL_FEATURE:
				setBase_BehavioralFeature((BehavioralFeature)null);
				return;
			case SAMPackage.SA_STEP__DEADLINE:
				setDeadline((NFP_Duration)null);
				return;
			case SAMPackage.SA_STEP__SPARE_CAP:
				setSpareCap((NFP_Duration)null);
				return;
			case SAMPackage.SA_STEP__SCH_SLACK:
				setSchSlack((NFP_Real)null);
				return;
			case SAMPackage.SA_STEP__PREEMPT_T:
				setPreemptT((NFP_Duration)null);
				return;
			case SAMPackage.SA_STEP__READY_T:
				setReadyT((NFP_Duration)null);
				return;
			case SAMPackage.SA_STEP__NONPREEMPTION_BLOCKING:
				setNonpreemptionBlocking((NFP_Duration)null);
				return;
			case SAMPackage.SA_STEP__SHARED_RES:
				getSharedRes().clear();
				return;
			case SAMPackage.SA_STEP__SELF_SUSPENSION_BLOCKING:
				setSelfSuspensionBlocking((NFP_Duration)null);
				return;
			case SAMPackage.SA_STEP__NUMBER_SELF_SUSPENSIONS:
				setNumberSelfSuspensions((NFP_Integer)null);
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
			case SAMPackage.SA_STEP__BASE_BEHAVIORAL_FEATURE:
				return base_BehavioralFeature != null;
			case SAMPackage.SA_STEP__DEADLINE:
				return deadline != null;
			case SAMPackage.SA_STEP__SPARE_CAP:
				return spareCap != null;
			case SAMPackage.SA_STEP__SCH_SLACK:
				return schSlack != null;
			case SAMPackage.SA_STEP__PREEMPT_T:
				return preemptT != null;
			case SAMPackage.SA_STEP__READY_T:
				return readyT != null;
			case SAMPackage.SA_STEP__NONPREEMPTION_BLOCKING:
				return nonpreemptionBlocking != null;
			case SAMPackage.SA_STEP__SHARED_RES:
				return sharedRes != null && !sharedRes.isEmpty();
			case SAMPackage.SA_STEP__SELF_SUSPENSION_BLOCKING:
				return selfSuspensionBlocking != null;
			case SAMPackage.SA_STEP__NUMBER_SELF_SUSPENSIONS:
				return numberSelfSuspensions != null;
		}
		return super.eIsSet(featureID);
	}

} //SaStepImpl
