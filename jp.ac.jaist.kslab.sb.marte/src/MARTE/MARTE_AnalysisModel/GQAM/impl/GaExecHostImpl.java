/**
 */
package MARTE.MARTE_AnalysisModel.GQAM.impl;

import MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;
import MARTE.MARTE_AnalysisModel.GQAM.GaExecHost;

import MARTE.MARTE_Foundations.GRM.ComputingResource;
import MARTE.MARTE_Foundations.GRM.GRMPackage;
import MARTE.MARTE_Foundations.GRM.ProcessingResource;
import MARTE.MARTE_Foundations.GRM.Scheduler;

import MARTE.MARTE_Foundations.GRM.impl.SchedulerImpl;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;
import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Frequency;
import MARTE_Library.BasicNFP_Types.NFP_Real;

import MARTE_Library.MARTE_DataTypes.IntegerInterval;

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
 * An implementation of the model object '<em><b>Ga Exec Host</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaExecHostImpl#getSpeedFactor <em>Speed Factor</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaExecHostImpl#getMainScheduler <em>Main Scheduler</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaExecHostImpl#getCommTxOvh <em>Comm Tx Ovh</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaExecHostImpl#getCommRcvOvh <em>Comm Rcv Ovh</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaExecHostImpl#getCntxtSwT <em>Cntxt Sw T</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaExecHostImpl#getClockOvh <em>Clock Ovh</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaExecHostImpl#getSchedPriRange <em>Sched Pri Range</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaExecHostImpl#getMemSize <em>Mem Size</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaExecHostImpl#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaExecHostImpl#getThroughput <em>Throughput</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GaExecHostImpl extends SchedulerImpl implements GaExecHost {
	/**
	 * The cached value of the '{@link #getSpeedFactor() <em>Speed Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected NFP_Real speedFactor;

	/**
	 * The cached value of the '{@link #getMainScheduler() <em>Main Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainScheduler()
	 * @generated
	 * @ordered
	 */
	protected Scheduler mainScheduler;

	/**
	 * The cached value of the '{@link #getCommTxOvh() <em>Comm Tx Ovh</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommTxOvh()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration commTxOvh;

	/**
	 * The cached value of the '{@link #getCommRcvOvh() <em>Comm Rcv Ovh</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommRcvOvh()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration commRcvOvh;

	/**
	 * The cached value of the '{@link #getCntxtSwT() <em>Cntxt Sw T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCntxtSwT()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration cntxtSwT;

	/**
	 * The cached value of the '{@link #getClockOvh() <em>Clock Ovh</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockOvh()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration clockOvh;

	/**
	 * The cached value of the '{@link #getSchedPriRange() <em>Sched Pri Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedPriRange()
	 * @generated
	 * @ordered
	 */
	protected IntegerInterval schedPriRange;

	/**
	 * The cached value of the '{@link #getMemSize() <em>Mem Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemSize()
	 * @generated
	 * @ordered
	 */
	protected NFP_DataSize memSize;

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
	 * The cached value of the '{@link #getThroughput() <em>Throughput</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected EList throughput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GaExecHostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GQAMPackage.Literals.GA_EXEC_HOST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Real getSpeedFactor() {
		return speedFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeedFactor(NFP_Real newSpeedFactor, NotificationChain msgs) {
		NFP_Real oldSpeedFactor = speedFactor;
		speedFactor = newSpeedFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_EXEC_HOST__SPEED_FACTOR, oldSpeedFactor, newSpeedFactor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeedFactor(NFP_Real newSpeedFactor) {
		if (newSpeedFactor != speedFactor) {
			NotificationChain msgs = null;
			if (speedFactor != null)
				msgs = ((InternalEObject)speedFactor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_EXEC_HOST__SPEED_FACTOR, null, msgs);
			if (newSpeedFactor != null)
				msgs = ((InternalEObject)newSpeedFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_EXEC_HOST__SPEED_FACTOR, null, msgs);
			msgs = basicSetSpeedFactor(newSpeedFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_EXEC_HOST__SPEED_FACTOR, newSpeedFactor, newSpeedFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler getMainScheduler() {
		if (mainScheduler != null && mainScheduler.eIsProxy()) {
			InternalEObject oldMainScheduler = (InternalEObject)mainScheduler;
			mainScheduler = (Scheduler)eResolveProxy(oldMainScheduler);
			if (mainScheduler != oldMainScheduler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GQAMPackage.GA_EXEC_HOST__MAIN_SCHEDULER, oldMainScheduler, mainScheduler));
			}
		}
		return mainScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler basicGetMainScheduler() {
		return mainScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainScheduler(Scheduler newMainScheduler) {
		Scheduler oldMainScheduler = mainScheduler;
		mainScheduler = newMainScheduler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_EXEC_HOST__MAIN_SCHEDULER, oldMainScheduler, mainScheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getCommTxOvh() {
		return commTxOvh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommTxOvh(NFP_Duration newCommTxOvh, NotificationChain msgs) {
		NFP_Duration oldCommTxOvh = commTxOvh;
		commTxOvh = newCommTxOvh;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_EXEC_HOST__COMM_TX_OVH, oldCommTxOvh, newCommTxOvh);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommTxOvh(NFP_Duration newCommTxOvh) {
		if (newCommTxOvh != commTxOvh) {
			NotificationChain msgs = null;
			if (commTxOvh != null)
				msgs = ((InternalEObject)commTxOvh).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_EXEC_HOST__COMM_TX_OVH, null, msgs);
			if (newCommTxOvh != null)
				msgs = ((InternalEObject)newCommTxOvh).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_EXEC_HOST__COMM_TX_OVH, null, msgs);
			msgs = basicSetCommTxOvh(newCommTxOvh, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_EXEC_HOST__COMM_TX_OVH, newCommTxOvh, newCommTxOvh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getCommRcvOvh() {
		return commRcvOvh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommRcvOvh(NFP_Duration newCommRcvOvh, NotificationChain msgs) {
		NFP_Duration oldCommRcvOvh = commRcvOvh;
		commRcvOvh = newCommRcvOvh;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_EXEC_HOST__COMM_RCV_OVH, oldCommRcvOvh, newCommRcvOvh);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommRcvOvh(NFP_Duration newCommRcvOvh) {
		if (newCommRcvOvh != commRcvOvh) {
			NotificationChain msgs = null;
			if (commRcvOvh != null)
				msgs = ((InternalEObject)commRcvOvh).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_EXEC_HOST__COMM_RCV_OVH, null, msgs);
			if (newCommRcvOvh != null)
				msgs = ((InternalEObject)newCommRcvOvh).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_EXEC_HOST__COMM_RCV_OVH, null, msgs);
			msgs = basicSetCommRcvOvh(newCommRcvOvh, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_EXEC_HOST__COMM_RCV_OVH, newCommRcvOvh, newCommRcvOvh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getCntxtSwT() {
		return cntxtSwT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCntxtSwT(NFP_Duration newCntxtSwT, NotificationChain msgs) {
		NFP_Duration oldCntxtSwT = cntxtSwT;
		cntxtSwT = newCntxtSwT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_EXEC_HOST__CNTXT_SW_T, oldCntxtSwT, newCntxtSwT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCntxtSwT(NFP_Duration newCntxtSwT) {
		if (newCntxtSwT != cntxtSwT) {
			NotificationChain msgs = null;
			if (cntxtSwT != null)
				msgs = ((InternalEObject)cntxtSwT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_EXEC_HOST__CNTXT_SW_T, null, msgs);
			if (newCntxtSwT != null)
				msgs = ((InternalEObject)newCntxtSwT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_EXEC_HOST__CNTXT_SW_T, null, msgs);
			msgs = basicSetCntxtSwT(newCntxtSwT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_EXEC_HOST__CNTXT_SW_T, newCntxtSwT, newCntxtSwT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getClockOvh() {
		return clockOvh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClockOvh(NFP_Duration newClockOvh, NotificationChain msgs) {
		NFP_Duration oldClockOvh = clockOvh;
		clockOvh = newClockOvh;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_EXEC_HOST__CLOCK_OVH, oldClockOvh, newClockOvh);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockOvh(NFP_Duration newClockOvh) {
		if (newClockOvh != clockOvh) {
			NotificationChain msgs = null;
			if (clockOvh != null)
				msgs = ((InternalEObject)clockOvh).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_EXEC_HOST__CLOCK_OVH, null, msgs);
			if (newClockOvh != null)
				msgs = ((InternalEObject)newClockOvh).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_EXEC_HOST__CLOCK_OVH, null, msgs);
			msgs = basicSetClockOvh(newClockOvh, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_EXEC_HOST__CLOCK_OVH, newClockOvh, newClockOvh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerInterval getSchedPriRange() {
		return schedPriRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedPriRange(IntegerInterval newSchedPriRange, NotificationChain msgs) {
		IntegerInterval oldSchedPriRange = schedPriRange;
		schedPriRange = newSchedPriRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_EXEC_HOST__SCHED_PRI_RANGE, oldSchedPriRange, newSchedPriRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedPriRange(IntegerInterval newSchedPriRange) {
		if (newSchedPriRange != schedPriRange) {
			NotificationChain msgs = null;
			if (schedPriRange != null)
				msgs = ((InternalEObject)schedPriRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_EXEC_HOST__SCHED_PRI_RANGE, null, msgs);
			if (newSchedPriRange != null)
				msgs = ((InternalEObject)newSchedPriRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_EXEC_HOST__SCHED_PRI_RANGE, null, msgs);
			msgs = basicSetSchedPriRange(newSchedPriRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_EXEC_HOST__SCHED_PRI_RANGE, newSchedPriRange, newSchedPriRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataSize getMemSize() {
		return memSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemSize(NFP_DataSize newMemSize, NotificationChain msgs) {
		NFP_DataSize oldMemSize = memSize;
		memSize = newMemSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_EXEC_HOST__MEM_SIZE, oldMemSize, newMemSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemSize(NFP_DataSize newMemSize) {
		if (newMemSize != memSize) {
			NotificationChain msgs = null;
			if (memSize != null)
				msgs = ((InternalEObject)memSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_EXEC_HOST__MEM_SIZE, null, msgs);
			if (newMemSize != null)
				msgs = ((InternalEObject)newMemSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_EXEC_HOST__MEM_SIZE, null, msgs);
			msgs = basicSetMemSize(newMemSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_EXEC_HOST__MEM_SIZE, newMemSize, newMemSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUtilization() {
		if (utilization == null) {
			utilization = new EObjectContainmentEList(NFP_Real.class, this, GQAMPackage.GA_EXEC_HOST__UTILIZATION);
		}
		return utilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getThroughput() {
		if (throughput == null) {
			throughput = new EObjectContainmentEList(NFP_Frequency.class, this, GQAMPackage.GA_EXEC_HOST__THROUGHPUT);
		}
		return throughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GQAMPackage.GA_EXEC_HOST__SPEED_FACTOR:
				return basicSetSpeedFactor(null, msgs);
			case GQAMPackage.GA_EXEC_HOST__COMM_TX_OVH:
				return basicSetCommTxOvh(null, msgs);
			case GQAMPackage.GA_EXEC_HOST__COMM_RCV_OVH:
				return basicSetCommRcvOvh(null, msgs);
			case GQAMPackage.GA_EXEC_HOST__CNTXT_SW_T:
				return basicSetCntxtSwT(null, msgs);
			case GQAMPackage.GA_EXEC_HOST__CLOCK_OVH:
				return basicSetClockOvh(null, msgs);
			case GQAMPackage.GA_EXEC_HOST__SCHED_PRI_RANGE:
				return basicSetSchedPriRange(null, msgs);
			case GQAMPackage.GA_EXEC_HOST__MEM_SIZE:
				return basicSetMemSize(null, msgs);
			case GQAMPackage.GA_EXEC_HOST__UTILIZATION:
				return ((InternalEList)getUtilization()).basicRemove(otherEnd, msgs);
			case GQAMPackage.GA_EXEC_HOST__THROUGHPUT:
				return ((InternalEList)getThroughput()).basicRemove(otherEnd, msgs);
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
			case GQAMPackage.GA_EXEC_HOST__SPEED_FACTOR:
				return getSpeedFactor();
			case GQAMPackage.GA_EXEC_HOST__MAIN_SCHEDULER:
				if (resolve) return getMainScheduler();
				return basicGetMainScheduler();
			case GQAMPackage.GA_EXEC_HOST__COMM_TX_OVH:
				return getCommTxOvh();
			case GQAMPackage.GA_EXEC_HOST__COMM_RCV_OVH:
				return getCommRcvOvh();
			case GQAMPackage.GA_EXEC_HOST__CNTXT_SW_T:
				return getCntxtSwT();
			case GQAMPackage.GA_EXEC_HOST__CLOCK_OVH:
				return getClockOvh();
			case GQAMPackage.GA_EXEC_HOST__SCHED_PRI_RANGE:
				return getSchedPriRange();
			case GQAMPackage.GA_EXEC_HOST__MEM_SIZE:
				return getMemSize();
			case GQAMPackage.GA_EXEC_HOST__UTILIZATION:
				return getUtilization();
			case GQAMPackage.GA_EXEC_HOST__THROUGHPUT:
				return getThroughput();
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
			case GQAMPackage.GA_EXEC_HOST__SPEED_FACTOR:
				setSpeedFactor((NFP_Real)newValue);
				return;
			case GQAMPackage.GA_EXEC_HOST__MAIN_SCHEDULER:
				setMainScheduler((Scheduler)newValue);
				return;
			case GQAMPackage.GA_EXEC_HOST__COMM_TX_OVH:
				setCommTxOvh((NFP_Duration)newValue);
				return;
			case GQAMPackage.GA_EXEC_HOST__COMM_RCV_OVH:
				setCommRcvOvh((NFP_Duration)newValue);
				return;
			case GQAMPackage.GA_EXEC_HOST__CNTXT_SW_T:
				setCntxtSwT((NFP_Duration)newValue);
				return;
			case GQAMPackage.GA_EXEC_HOST__CLOCK_OVH:
				setClockOvh((NFP_Duration)newValue);
				return;
			case GQAMPackage.GA_EXEC_HOST__SCHED_PRI_RANGE:
				setSchedPriRange((IntegerInterval)newValue);
				return;
			case GQAMPackage.GA_EXEC_HOST__MEM_SIZE:
				setMemSize((NFP_DataSize)newValue);
				return;
			case GQAMPackage.GA_EXEC_HOST__UTILIZATION:
				getUtilization().clear();
				getUtilization().addAll((Collection)newValue);
				return;
			case GQAMPackage.GA_EXEC_HOST__THROUGHPUT:
				getThroughput().clear();
				getThroughput().addAll((Collection)newValue);
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
			case GQAMPackage.GA_EXEC_HOST__SPEED_FACTOR:
				setSpeedFactor((NFP_Real)null);
				return;
			case GQAMPackage.GA_EXEC_HOST__MAIN_SCHEDULER:
				setMainScheduler((Scheduler)null);
				return;
			case GQAMPackage.GA_EXEC_HOST__COMM_TX_OVH:
				setCommTxOvh((NFP_Duration)null);
				return;
			case GQAMPackage.GA_EXEC_HOST__COMM_RCV_OVH:
				setCommRcvOvh((NFP_Duration)null);
				return;
			case GQAMPackage.GA_EXEC_HOST__CNTXT_SW_T:
				setCntxtSwT((NFP_Duration)null);
				return;
			case GQAMPackage.GA_EXEC_HOST__CLOCK_OVH:
				setClockOvh((NFP_Duration)null);
				return;
			case GQAMPackage.GA_EXEC_HOST__SCHED_PRI_RANGE:
				setSchedPriRange((IntegerInterval)null);
				return;
			case GQAMPackage.GA_EXEC_HOST__MEM_SIZE:
				setMemSize((NFP_DataSize)null);
				return;
			case GQAMPackage.GA_EXEC_HOST__UTILIZATION:
				getUtilization().clear();
				return;
			case GQAMPackage.GA_EXEC_HOST__THROUGHPUT:
				getThroughput().clear();
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
			case GQAMPackage.GA_EXEC_HOST__SPEED_FACTOR:
				return speedFactor != null;
			case GQAMPackage.GA_EXEC_HOST__MAIN_SCHEDULER:
				return mainScheduler != null;
			case GQAMPackage.GA_EXEC_HOST__COMM_TX_OVH:
				return commTxOvh != null;
			case GQAMPackage.GA_EXEC_HOST__COMM_RCV_OVH:
				return commRcvOvh != null;
			case GQAMPackage.GA_EXEC_HOST__CNTXT_SW_T:
				return cntxtSwT != null;
			case GQAMPackage.GA_EXEC_HOST__CLOCK_OVH:
				return clockOvh != null;
			case GQAMPackage.GA_EXEC_HOST__SCHED_PRI_RANGE:
				return schedPriRange != null;
			case GQAMPackage.GA_EXEC_HOST__MEM_SIZE:
				return memSize != null;
			case GQAMPackage.GA_EXEC_HOST__UTILIZATION:
				return utilization != null && !utilization.isEmpty();
			case GQAMPackage.GA_EXEC_HOST__THROUGHPUT:
				return throughput != null && !throughput.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ProcessingResource.class) {
			switch (derivedFeatureID) {
				case GQAMPackage.GA_EXEC_HOST__SPEED_FACTOR: return GRMPackage.PROCESSING_RESOURCE__SPEED_FACTOR;
				case GQAMPackage.GA_EXEC_HOST__MAIN_SCHEDULER: return GRMPackage.PROCESSING_RESOURCE__MAIN_SCHEDULER;
				default: return -1;
			}
		}
		if (baseClass == ComputingResource.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == ProcessingResource.class) {
			switch (baseFeatureID) {
				case GRMPackage.PROCESSING_RESOURCE__SPEED_FACTOR: return GQAMPackage.GA_EXEC_HOST__SPEED_FACTOR;
				case GRMPackage.PROCESSING_RESOURCE__MAIN_SCHEDULER: return GQAMPackage.GA_EXEC_HOST__MAIN_SCHEDULER;
				default: return -1;
			}
		}
		if (baseClass == ComputingResource.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //GaExecHostImpl
