/**
 */
package MARTE.MARTE_AnalysisModel.SAM.impl;

import MARTE.MARTE_AnalysisModel.GQAM.impl.GaExecHostImpl;

import MARTE.MARTE_AnalysisModel.SAM.SAMPackage;
import MARTE.MARTE_AnalysisModel.SAM.SaExecHost;

import MARTE_Library.BasicNFP_Types.NFP_Boolean;
import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Real;

import MARTE_Library.MARTE_DataTypes.IntegerInterval;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sa Exec Host</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaExecHostImpl#getIsSched <em>Is Sched</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaExecHostImpl#getSchSlack <em>Sch Slack</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaExecHostImpl#getSchedUtiliz <em>Sched Utiliz</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaExecHostImpl#getISRswitchT <em>IS Rswitch T</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaExecHostImpl#getISRprioRange <em>IS Rprio Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SaExecHostImpl extends GaExecHostImpl implements SaExecHost {
	/**
	 * The cached value of the '{@link #getIsSched() <em>Is Sched</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSched()
	 * @generated
	 * @ordered
	 */
	protected NFP_Boolean isSched;

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
	 * The cached value of the '{@link #getSchedUtiliz() <em>Sched Utiliz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedUtiliz()
	 * @generated
	 * @ordered
	 */
	protected NFP_Real schedUtiliz;

	/**
	 * The cached value of the '{@link #getISRswitchT() <em>IS Rswitch T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISRswitchT()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration isRswitchT;

	/**
	 * The cached value of the '{@link #getISRprioRange() <em>IS Rprio Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISRprioRange()
	 * @generated
	 * @ordered
	 */
	protected IntegerInterval isRprioRange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaExecHostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SAMPackage.Literals.SA_EXEC_HOST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Boolean getIsSched() {
		return isSched;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsSched(NFP_Boolean newIsSched, NotificationChain msgs) {
		NFP_Boolean oldIsSched = isSched;
		isSched = newIsSched;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_EXEC_HOST__IS_SCHED, oldIsSched, newIsSched);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSched(NFP_Boolean newIsSched) {
		if (newIsSched != isSched) {
			NotificationChain msgs = null;
			if (isSched != null)
				msgs = ((InternalEObject)isSched).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_EXEC_HOST__IS_SCHED, null, msgs);
			if (newIsSched != null)
				msgs = ((InternalEObject)newIsSched).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_EXEC_HOST__IS_SCHED, null, msgs);
			msgs = basicSetIsSched(newIsSched, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_EXEC_HOST__IS_SCHED, newIsSched, newIsSched));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_EXEC_HOST__SCH_SLACK, oldSchSlack, newSchSlack);
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
				msgs = ((InternalEObject)schSlack).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_EXEC_HOST__SCH_SLACK, null, msgs);
			if (newSchSlack != null)
				msgs = ((InternalEObject)newSchSlack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_EXEC_HOST__SCH_SLACK, null, msgs);
			msgs = basicSetSchSlack(newSchSlack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_EXEC_HOST__SCH_SLACK, newSchSlack, newSchSlack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Real getSchedUtiliz() {
		return schedUtiliz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedUtiliz(NFP_Real newSchedUtiliz, NotificationChain msgs) {
		NFP_Real oldSchedUtiliz = schedUtiliz;
		schedUtiliz = newSchedUtiliz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_EXEC_HOST__SCHED_UTILIZ, oldSchedUtiliz, newSchedUtiliz);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedUtiliz(NFP_Real newSchedUtiliz) {
		if (newSchedUtiliz != schedUtiliz) {
			NotificationChain msgs = null;
			if (schedUtiliz != null)
				msgs = ((InternalEObject)schedUtiliz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_EXEC_HOST__SCHED_UTILIZ, null, msgs);
			if (newSchedUtiliz != null)
				msgs = ((InternalEObject)newSchedUtiliz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_EXEC_HOST__SCHED_UTILIZ, null, msgs);
			msgs = basicSetSchedUtiliz(newSchedUtiliz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_EXEC_HOST__SCHED_UTILIZ, newSchedUtiliz, newSchedUtiliz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getISRswitchT() {
		return isRswitchT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetISRswitchT(NFP_Duration newISRswitchT, NotificationChain msgs) {
		NFP_Duration oldISRswitchT = isRswitchT;
		isRswitchT = newISRswitchT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_EXEC_HOST__IS_RSWITCH_T, oldISRswitchT, newISRswitchT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setISRswitchT(NFP_Duration newISRswitchT) {
		if (newISRswitchT != isRswitchT) {
			NotificationChain msgs = null;
			if (isRswitchT != null)
				msgs = ((InternalEObject)isRswitchT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_EXEC_HOST__IS_RSWITCH_T, null, msgs);
			if (newISRswitchT != null)
				msgs = ((InternalEObject)newISRswitchT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_EXEC_HOST__IS_RSWITCH_T, null, msgs);
			msgs = basicSetISRswitchT(newISRswitchT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_EXEC_HOST__IS_RSWITCH_T, newISRswitchT, newISRswitchT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerInterval getISRprioRange() {
		return isRprioRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetISRprioRange(IntegerInterval newISRprioRange, NotificationChain msgs) {
		IntegerInterval oldISRprioRange = isRprioRange;
		isRprioRange = newISRprioRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_EXEC_HOST__IS_RPRIO_RANGE, oldISRprioRange, newISRprioRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setISRprioRange(IntegerInterval newISRprioRange) {
		if (newISRprioRange != isRprioRange) {
			NotificationChain msgs = null;
			if (isRprioRange != null)
				msgs = ((InternalEObject)isRprioRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_EXEC_HOST__IS_RPRIO_RANGE, null, msgs);
			if (newISRprioRange != null)
				msgs = ((InternalEObject)newISRprioRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_EXEC_HOST__IS_RPRIO_RANGE, null, msgs);
			msgs = basicSetISRprioRange(newISRprioRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_EXEC_HOST__IS_RPRIO_RANGE, newISRprioRange, newISRprioRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SAMPackage.SA_EXEC_HOST__IS_SCHED:
				return basicSetIsSched(null, msgs);
			case SAMPackage.SA_EXEC_HOST__SCH_SLACK:
				return basicSetSchSlack(null, msgs);
			case SAMPackage.SA_EXEC_HOST__SCHED_UTILIZ:
				return basicSetSchedUtiliz(null, msgs);
			case SAMPackage.SA_EXEC_HOST__IS_RSWITCH_T:
				return basicSetISRswitchT(null, msgs);
			case SAMPackage.SA_EXEC_HOST__IS_RPRIO_RANGE:
				return basicSetISRprioRange(null, msgs);
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
			case SAMPackage.SA_EXEC_HOST__IS_SCHED:
				return getIsSched();
			case SAMPackage.SA_EXEC_HOST__SCH_SLACK:
				return getSchSlack();
			case SAMPackage.SA_EXEC_HOST__SCHED_UTILIZ:
				return getSchedUtiliz();
			case SAMPackage.SA_EXEC_HOST__IS_RSWITCH_T:
				return getISRswitchT();
			case SAMPackage.SA_EXEC_HOST__IS_RPRIO_RANGE:
				return getISRprioRange();
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
			case SAMPackage.SA_EXEC_HOST__IS_SCHED:
				setIsSched((NFP_Boolean)newValue);
				return;
			case SAMPackage.SA_EXEC_HOST__SCH_SLACK:
				setSchSlack((NFP_Real)newValue);
				return;
			case SAMPackage.SA_EXEC_HOST__SCHED_UTILIZ:
				setSchedUtiliz((NFP_Real)newValue);
				return;
			case SAMPackage.SA_EXEC_HOST__IS_RSWITCH_T:
				setISRswitchT((NFP_Duration)newValue);
				return;
			case SAMPackage.SA_EXEC_HOST__IS_RPRIO_RANGE:
				setISRprioRange((IntegerInterval)newValue);
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
			case SAMPackage.SA_EXEC_HOST__IS_SCHED:
				setIsSched((NFP_Boolean)null);
				return;
			case SAMPackage.SA_EXEC_HOST__SCH_SLACK:
				setSchSlack((NFP_Real)null);
				return;
			case SAMPackage.SA_EXEC_HOST__SCHED_UTILIZ:
				setSchedUtiliz((NFP_Real)null);
				return;
			case SAMPackage.SA_EXEC_HOST__IS_RSWITCH_T:
				setISRswitchT((NFP_Duration)null);
				return;
			case SAMPackage.SA_EXEC_HOST__IS_RPRIO_RANGE:
				setISRprioRange((IntegerInterval)null);
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
			case SAMPackage.SA_EXEC_HOST__IS_SCHED:
				return isSched != null;
			case SAMPackage.SA_EXEC_HOST__SCH_SLACK:
				return schSlack != null;
			case SAMPackage.SA_EXEC_HOST__SCHED_UTILIZ:
				return schedUtiliz != null;
			case SAMPackage.SA_EXEC_HOST__IS_RSWITCH_T:
				return isRswitchT != null;
			case SAMPackage.SA_EXEC_HOST__IS_RPRIO_RANGE:
				return isRprioRange != null;
		}
		return super.eIsSet(featureID);
	}

} //SaExecHostImpl
