/**
 */
package MARTE.MARTE_AnalysisModel.SAM.impl;

import MARTE.MARTE_AnalysisModel.GQAM.impl.GaCommStepImpl;

import MARTE.MARTE_AnalysisModel.SAM.SAMPackage;
import MARTE.MARTE_AnalysisModel.SAM.SaCommStep;

import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Real;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.BehavioralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sa Comm Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaCommStepImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaCommStepImpl#getSpareCap <em>Spare Cap</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaCommStepImpl#getSchSlack <em>Sch Slack</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaCommStepImpl#getBase_BehavioralFeature <em>Base Behavioral Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SaCommStepImpl extends GaCommStepImpl implements SaCommStep {
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
	 * The cached value of the '{@link #getBase_BehavioralFeature() <em>Base Behavioral Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_BehavioralFeature()
	 * @generated
	 * @ordered
	 */
	protected BehavioralFeature base_BehavioralFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaCommStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SAMPackage.Literals.SA_COMM_STEP;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_COMM_STEP__DEADLINE, oldDeadline, newDeadline);
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
				msgs = ((InternalEObject)deadline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_COMM_STEP__DEADLINE, null, msgs);
			if (newDeadline != null)
				msgs = ((InternalEObject)newDeadline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_COMM_STEP__DEADLINE, null, msgs);
			msgs = basicSetDeadline(newDeadline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_COMM_STEP__DEADLINE, newDeadline, newDeadline));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_COMM_STEP__SPARE_CAP, oldSpareCap, newSpareCap);
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
				msgs = ((InternalEObject)spareCap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_COMM_STEP__SPARE_CAP, null, msgs);
			if (newSpareCap != null)
				msgs = ((InternalEObject)newSpareCap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_COMM_STEP__SPARE_CAP, null, msgs);
			msgs = basicSetSpareCap(newSpareCap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_COMM_STEP__SPARE_CAP, newSpareCap, newSpareCap));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_COMM_STEP__SCH_SLACK, oldSchSlack, newSchSlack);
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
				msgs = ((InternalEObject)schSlack).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_COMM_STEP__SCH_SLACK, null, msgs);
			if (newSchSlack != null)
				msgs = ((InternalEObject)newSchSlack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_COMM_STEP__SCH_SLACK, null, msgs);
			msgs = basicSetSchSlack(newSchSlack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_COMM_STEP__SCH_SLACK, newSchSlack, newSchSlack));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SAMPackage.SA_COMM_STEP__BASE_BEHAVIORAL_FEATURE, oldBase_BehavioralFeature, base_BehavioralFeature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_COMM_STEP__BASE_BEHAVIORAL_FEATURE, oldBase_BehavioralFeature, base_BehavioralFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SAMPackage.SA_COMM_STEP__DEADLINE:
				return basicSetDeadline(null, msgs);
			case SAMPackage.SA_COMM_STEP__SPARE_CAP:
				return basicSetSpareCap(null, msgs);
			case SAMPackage.SA_COMM_STEP__SCH_SLACK:
				return basicSetSchSlack(null, msgs);
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
			case SAMPackage.SA_COMM_STEP__DEADLINE:
				return getDeadline();
			case SAMPackage.SA_COMM_STEP__SPARE_CAP:
				return getSpareCap();
			case SAMPackage.SA_COMM_STEP__SCH_SLACK:
				return getSchSlack();
			case SAMPackage.SA_COMM_STEP__BASE_BEHAVIORAL_FEATURE:
				if (resolve) return getBase_BehavioralFeature();
				return basicGetBase_BehavioralFeature();
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
			case SAMPackage.SA_COMM_STEP__DEADLINE:
				setDeadline((NFP_Duration)newValue);
				return;
			case SAMPackage.SA_COMM_STEP__SPARE_CAP:
				setSpareCap((NFP_Duration)newValue);
				return;
			case SAMPackage.SA_COMM_STEP__SCH_SLACK:
				setSchSlack((NFP_Real)newValue);
				return;
			case SAMPackage.SA_COMM_STEP__BASE_BEHAVIORAL_FEATURE:
				setBase_BehavioralFeature((BehavioralFeature)newValue);
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
			case SAMPackage.SA_COMM_STEP__DEADLINE:
				setDeadline((NFP_Duration)null);
				return;
			case SAMPackage.SA_COMM_STEP__SPARE_CAP:
				setSpareCap((NFP_Duration)null);
				return;
			case SAMPackage.SA_COMM_STEP__SCH_SLACK:
				setSchSlack((NFP_Real)null);
				return;
			case SAMPackage.SA_COMM_STEP__BASE_BEHAVIORAL_FEATURE:
				setBase_BehavioralFeature((BehavioralFeature)null);
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
			case SAMPackage.SA_COMM_STEP__DEADLINE:
				return deadline != null;
			case SAMPackage.SA_COMM_STEP__SPARE_CAP:
				return spareCap != null;
			case SAMPackage.SA_COMM_STEP__SCH_SLACK:
				return schSlack != null;
			case SAMPackage.SA_COMM_STEP__BASE_BEHAVIORAL_FEATURE:
				return base_BehavioralFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //SaCommStepImpl
