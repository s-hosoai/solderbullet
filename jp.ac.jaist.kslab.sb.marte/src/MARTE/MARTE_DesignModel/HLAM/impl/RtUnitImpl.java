/**
 */
package MARTE.MARTE_DesignModel.HLAM.impl;

import MARTE.MARTE_DesignModel.HLAM.HLAMPackage;
import MARTE.MARTE_DesignModel.HLAM.PoolMgtPolicyKind;
import MARTE.MARTE_DesignModel.HLAM.RtUnit;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;
import MARTE_Library.BasicNFP_Types.NFP_Duration;

import MARTE_Library.GRM_BasicTypes.SchedPolicyKind;

import MARTE_Library.MARTE_PrimitivesTypes.MARTE_PrimitivesTypesFactory;
import MARTE_Library.MARTE_PrimitivesTypes.MARTE_PrimitivesTypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rt Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtUnitImpl#getIsDynamic <em>Is Dynamic</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtUnitImpl#getIsMain <em>Is Main</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtUnitImpl#getSrPoolSize <em>Sr Pool Size</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtUnitImpl#getSrPoolPolicy <em>Sr Pool Policy</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtUnitImpl#getSrPoolWaitingTime <em>Sr Pool Waiting Time</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtUnitImpl#getOperationalMode <em>Operational Mode</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtUnitImpl#getMain <em>Main</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtUnitImpl#getMemorySize <em>Memory Size</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtUnitImpl#getBase_BehavioredClassifier <em>Base Behaviored Classifier</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtUnitImpl#getQueueSchedPolicy <em>Queue Sched Policy</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtUnitImpl#getQueueSize <em>Queue Size</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtUnitImpl#getMsgMaxSize <em>Msg Max Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RtUnitImpl extends EObjectImpl implements RtUnit {
	/**
	 * The default value of the '{@link #getIsDynamic() <em>Is Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDynamic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DYNAMIC_EDEFAULT = (Boolean)MARTE_PrimitivesTypesFactory.eINSTANCE.createFromString(MARTE_PrimitivesTypesPackage.eINSTANCE.getBoolean(), "true");

	/**
	 * The cached value of the '{@link #getIsDynamic() <em>Is Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDynamic()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDynamic = IS_DYNAMIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsMain() <em>Is Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMain()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_MAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsMain() <em>Is Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMain()
	 * @generated
	 * @ordered
	 */
	protected Boolean isMain = IS_MAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrPoolSize() <em>Sr Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrPoolSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SR_POOL_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrPoolSize() <em>Sr Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrPoolSize()
	 * @generated
	 * @ordered
	 */
	protected Integer srPoolSize = SR_POOL_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrPoolPolicy() <em>Sr Pool Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrPoolPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final PoolMgtPolicyKind SR_POOL_POLICY_EDEFAULT = PoolMgtPolicyKind.INFINITE_WAIT_LITERAL;

	/**
	 * The cached value of the '{@link #getSrPoolPolicy() <em>Sr Pool Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrPoolPolicy()
	 * @generated
	 * @ordered
	 */
	protected PoolMgtPolicyKind srPoolPolicy = SR_POOL_POLICY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSrPoolWaitingTime() <em>Sr Pool Waiting Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrPoolWaitingTime()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration srPoolWaitingTime;

	/**
	 * The cached value of the '{@link #getOperationalMode() <em>Operational Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalMode()
	 * @generated
	 * @ordered
	 */
	protected Behavior operationalMode;

	/**
	 * The cached value of the '{@link #getMain() <em>Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMain()
	 * @generated
	 * @ordered
	 */
	protected Operation main;

	/**
	 * The cached value of the '{@link #getMemorySize() <em>Memory Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySize()
	 * @generated
	 * @ordered
	 */
	protected NFP_DataSize memorySize;

	/**
	 * The cached value of the '{@link #getBase_BehavioredClassifier() <em>Base Behaviored Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_BehavioredClassifier()
	 * @generated
	 * @ordered
	 */
	protected BehavioredClassifier base_BehavioredClassifier;

	/**
	 * The default value of the '{@link #getQueueSchedPolicy() <em>Queue Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueSchedPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final SchedPolicyKind QUEUE_SCHED_POLICY_EDEFAULT = SchedPolicyKind.EARLIEST_DEADLINE_FIRST;

	/**
	 * The cached value of the '{@link #getQueueSchedPolicy() <em>Queue Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueSchedPolicy()
	 * @generated
	 * @ordered
	 */
	protected SchedPolicyKind queueSchedPolicy = QUEUE_SCHED_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueueSize() <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer QUEUE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueueSize() <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueSize()
	 * @generated
	 * @ordered
	 */
	protected Integer queueSize = QUEUE_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMsgMaxSize() <em>Msg Max Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgMaxSize()
	 * @generated
	 * @ordered
	 */
	protected NFP_DataSize msgMaxSize;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HLAMPackage.Literals.RT_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDynamic() {
		return isDynamic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDynamic(Boolean newIsDynamic) {
		Boolean oldIsDynamic = isDynamic;
		isDynamic = newIsDynamic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_UNIT__IS_DYNAMIC, oldIsDynamic, isDynamic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsMain() {
		return isMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMain(Boolean newIsMain) {
		Boolean oldIsMain = isMain;
		isMain = newIsMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_UNIT__IS_MAIN, oldIsMain, isMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSrPoolSize() {
		return srPoolSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrPoolSize(Integer newSrPoolSize) {
		Integer oldSrPoolSize = srPoolSize;
		srPoolSize = newSrPoolSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_UNIT__SR_POOL_SIZE, oldSrPoolSize, srPoolSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoolMgtPolicyKind getSrPoolPolicy() {
		return srPoolPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrPoolPolicy(PoolMgtPolicyKind newSrPoolPolicy) {
		PoolMgtPolicyKind oldSrPoolPolicy = srPoolPolicy;
		srPoolPolicy = newSrPoolPolicy == null ? SR_POOL_POLICY_EDEFAULT : newSrPoolPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_UNIT__SR_POOL_POLICY, oldSrPoolPolicy, srPoolPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getSrPoolWaitingTime() {
		return srPoolWaitingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrPoolWaitingTime(NFP_Duration newSrPoolWaitingTime, NotificationChain msgs) {
		NFP_Duration oldSrPoolWaitingTime = srPoolWaitingTime;
		srPoolWaitingTime = newSrPoolWaitingTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_UNIT__SR_POOL_WAITING_TIME, oldSrPoolWaitingTime, newSrPoolWaitingTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrPoolWaitingTime(NFP_Duration newSrPoolWaitingTime) {
		if (newSrPoolWaitingTime != srPoolWaitingTime) {
			NotificationChain msgs = null;
			if (srPoolWaitingTime != null)
				msgs = ((InternalEObject)srPoolWaitingTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_UNIT__SR_POOL_WAITING_TIME, null, msgs);
			if (newSrPoolWaitingTime != null)
				msgs = ((InternalEObject)newSrPoolWaitingTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_UNIT__SR_POOL_WAITING_TIME, null, msgs);
			msgs = basicSetSrPoolWaitingTime(newSrPoolWaitingTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_UNIT__SR_POOL_WAITING_TIME, newSrPoolWaitingTime, newSrPoolWaitingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getOperationalMode() {
		if (operationalMode != null && operationalMode.eIsProxy()) {
			InternalEObject oldOperationalMode = (InternalEObject)operationalMode;
			operationalMode = (Behavior)eResolveProxy(oldOperationalMode);
			if (operationalMode != oldOperationalMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HLAMPackage.RT_UNIT__OPERATIONAL_MODE, oldOperationalMode, operationalMode));
			}
		}
		return operationalMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetOperationalMode() {
		return operationalMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationalMode(Behavior newOperationalMode) {
		Behavior oldOperationalMode = operationalMode;
		operationalMode = newOperationalMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_UNIT__OPERATIONAL_MODE, oldOperationalMode, operationalMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getMain() {
		if (main != null && main.eIsProxy()) {
			InternalEObject oldMain = (InternalEObject)main;
			main = (Operation)eResolveProxy(oldMain);
			if (main != oldMain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HLAMPackage.RT_UNIT__MAIN, oldMain, main));
			}
		}
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetMain() {
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMain(Operation newMain) {
		Operation oldMain = main;
		main = newMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_UNIT__MAIN, oldMain, main));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataSize getMemorySize() {
		return memorySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemorySize(NFP_DataSize newMemorySize, NotificationChain msgs) {
		NFP_DataSize oldMemorySize = memorySize;
		memorySize = newMemorySize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_UNIT__MEMORY_SIZE, oldMemorySize, newMemorySize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemorySize(NFP_DataSize newMemorySize) {
		if (newMemorySize != memorySize) {
			NotificationChain msgs = null;
			if (memorySize != null)
				msgs = ((InternalEObject)memorySize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_UNIT__MEMORY_SIZE, null, msgs);
			if (newMemorySize != null)
				msgs = ((InternalEObject)newMemorySize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_UNIT__MEMORY_SIZE, null, msgs);
			msgs = basicSetMemorySize(newMemorySize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_UNIT__MEMORY_SIZE, newMemorySize, newMemorySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier getBase_BehavioredClassifier() {
		if (base_BehavioredClassifier != null && base_BehavioredClassifier.eIsProxy()) {
			InternalEObject oldBase_BehavioredClassifier = (InternalEObject)base_BehavioredClassifier;
			base_BehavioredClassifier = (BehavioredClassifier)eResolveProxy(oldBase_BehavioredClassifier);
			if (base_BehavioredClassifier != oldBase_BehavioredClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HLAMPackage.RT_UNIT__BASE_BEHAVIORED_CLASSIFIER, oldBase_BehavioredClassifier, base_BehavioredClassifier));
			}
		}
		return base_BehavioredClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier basicGetBase_BehavioredClassifier() {
		return base_BehavioredClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_BehavioredClassifier(BehavioredClassifier newBase_BehavioredClassifier) {
		BehavioredClassifier oldBase_BehavioredClassifier = base_BehavioredClassifier;
		base_BehavioredClassifier = newBase_BehavioredClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_UNIT__BASE_BEHAVIORED_CLASSIFIER, oldBase_BehavioredClassifier, base_BehavioredClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedPolicyKind getQueueSchedPolicy() {
		return queueSchedPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueSchedPolicy(SchedPolicyKind newQueueSchedPolicy) {
		SchedPolicyKind oldQueueSchedPolicy = queueSchedPolicy;
		queueSchedPolicy = newQueueSchedPolicy == null ? QUEUE_SCHED_POLICY_EDEFAULT : newQueueSchedPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_UNIT__QUEUE_SCHED_POLICY, oldQueueSchedPolicy, queueSchedPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getQueueSize() {
		return queueSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueSize(Integer newQueueSize) {
		Integer oldQueueSize = queueSize;
		queueSize = newQueueSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_UNIT__QUEUE_SIZE, oldQueueSize, queueSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataSize getMsgMaxSize() {
		return msgMaxSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsgMaxSize(NFP_DataSize newMsgMaxSize, NotificationChain msgs) {
		NFP_DataSize oldMsgMaxSize = msgMaxSize;
		msgMaxSize = newMsgMaxSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_UNIT__MSG_MAX_SIZE, oldMsgMaxSize, newMsgMaxSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsgMaxSize(NFP_DataSize newMsgMaxSize) {
		if (newMsgMaxSize != msgMaxSize) {
			NotificationChain msgs = null;
			if (msgMaxSize != null)
				msgs = ((InternalEObject)msgMaxSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_UNIT__MSG_MAX_SIZE, null, msgs);
			if (newMsgMaxSize != null)
				msgs = ((InternalEObject)newMsgMaxSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_UNIT__MSG_MAX_SIZE, null, msgs);
			msgs = basicSetMsgMaxSize(newMsgMaxSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_UNIT__MSG_MAX_SIZE, newMsgMaxSize, newMsgMaxSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HLAMPackage.RT_UNIT__SR_POOL_WAITING_TIME:
				return basicSetSrPoolWaitingTime(null, msgs);
			case HLAMPackage.RT_UNIT__MEMORY_SIZE:
				return basicSetMemorySize(null, msgs);
			case HLAMPackage.RT_UNIT__MSG_MAX_SIZE:
				return basicSetMsgMaxSize(null, msgs);
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
			case HLAMPackage.RT_UNIT__IS_DYNAMIC:
				return getIsDynamic();
			case HLAMPackage.RT_UNIT__IS_MAIN:
				return getIsMain();
			case HLAMPackage.RT_UNIT__SR_POOL_SIZE:
				return getSrPoolSize();
			case HLAMPackage.RT_UNIT__SR_POOL_POLICY:
				return getSrPoolPolicy();
			case HLAMPackage.RT_UNIT__SR_POOL_WAITING_TIME:
				return getSrPoolWaitingTime();
			case HLAMPackage.RT_UNIT__OPERATIONAL_MODE:
				if (resolve) return getOperationalMode();
				return basicGetOperationalMode();
			case HLAMPackage.RT_UNIT__MAIN:
				if (resolve) return getMain();
				return basicGetMain();
			case HLAMPackage.RT_UNIT__MEMORY_SIZE:
				return getMemorySize();
			case HLAMPackage.RT_UNIT__BASE_BEHAVIORED_CLASSIFIER:
				if (resolve) return getBase_BehavioredClassifier();
				return basicGetBase_BehavioredClassifier();
			case HLAMPackage.RT_UNIT__QUEUE_SCHED_POLICY:
				return getQueueSchedPolicy();
			case HLAMPackage.RT_UNIT__QUEUE_SIZE:
				return getQueueSize();
			case HLAMPackage.RT_UNIT__MSG_MAX_SIZE:
				return getMsgMaxSize();
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
			case HLAMPackage.RT_UNIT__IS_DYNAMIC:
				setIsDynamic((Boolean)newValue);
				return;
			case HLAMPackage.RT_UNIT__IS_MAIN:
				setIsMain((Boolean)newValue);
				return;
			case HLAMPackage.RT_UNIT__SR_POOL_SIZE:
				setSrPoolSize((Integer)newValue);
				return;
			case HLAMPackage.RT_UNIT__SR_POOL_POLICY:
				setSrPoolPolicy((PoolMgtPolicyKind)newValue);
				return;
			case HLAMPackage.RT_UNIT__SR_POOL_WAITING_TIME:
				setSrPoolWaitingTime((NFP_Duration)newValue);
				return;
			case HLAMPackage.RT_UNIT__OPERATIONAL_MODE:
				setOperationalMode((Behavior)newValue);
				return;
			case HLAMPackage.RT_UNIT__MAIN:
				setMain((Operation)newValue);
				return;
			case HLAMPackage.RT_UNIT__MEMORY_SIZE:
				setMemorySize((NFP_DataSize)newValue);
				return;
			case HLAMPackage.RT_UNIT__BASE_BEHAVIORED_CLASSIFIER:
				setBase_BehavioredClassifier((BehavioredClassifier)newValue);
				return;
			case HLAMPackage.RT_UNIT__QUEUE_SCHED_POLICY:
				setQueueSchedPolicy((SchedPolicyKind)newValue);
				return;
			case HLAMPackage.RT_UNIT__QUEUE_SIZE:
				setQueueSize((Integer)newValue);
				return;
			case HLAMPackage.RT_UNIT__MSG_MAX_SIZE:
				setMsgMaxSize((NFP_DataSize)newValue);
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
			case HLAMPackage.RT_UNIT__IS_DYNAMIC:
				setIsDynamic(IS_DYNAMIC_EDEFAULT);
				return;
			case HLAMPackage.RT_UNIT__IS_MAIN:
				setIsMain(IS_MAIN_EDEFAULT);
				return;
			case HLAMPackage.RT_UNIT__SR_POOL_SIZE:
				setSrPoolSize(SR_POOL_SIZE_EDEFAULT);
				return;
			case HLAMPackage.RT_UNIT__SR_POOL_POLICY:
				setSrPoolPolicy(SR_POOL_POLICY_EDEFAULT);
				return;
			case HLAMPackage.RT_UNIT__SR_POOL_WAITING_TIME:
				setSrPoolWaitingTime((NFP_Duration)null);
				return;
			case HLAMPackage.RT_UNIT__OPERATIONAL_MODE:
				setOperationalMode((Behavior)null);
				return;
			case HLAMPackage.RT_UNIT__MAIN:
				setMain((Operation)null);
				return;
			case HLAMPackage.RT_UNIT__MEMORY_SIZE:
				setMemorySize((NFP_DataSize)null);
				return;
			case HLAMPackage.RT_UNIT__BASE_BEHAVIORED_CLASSIFIER:
				setBase_BehavioredClassifier((BehavioredClassifier)null);
				return;
			case HLAMPackage.RT_UNIT__QUEUE_SCHED_POLICY:
				setQueueSchedPolicy(QUEUE_SCHED_POLICY_EDEFAULT);
				return;
			case HLAMPackage.RT_UNIT__QUEUE_SIZE:
				setQueueSize(QUEUE_SIZE_EDEFAULT);
				return;
			case HLAMPackage.RT_UNIT__MSG_MAX_SIZE:
				setMsgMaxSize((NFP_DataSize)null);
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
			case HLAMPackage.RT_UNIT__IS_DYNAMIC:
				return IS_DYNAMIC_EDEFAULT == null ? isDynamic != null : !IS_DYNAMIC_EDEFAULT.equals(isDynamic);
			case HLAMPackage.RT_UNIT__IS_MAIN:
				return IS_MAIN_EDEFAULT == null ? isMain != null : !IS_MAIN_EDEFAULT.equals(isMain);
			case HLAMPackage.RT_UNIT__SR_POOL_SIZE:
				return SR_POOL_SIZE_EDEFAULT == null ? srPoolSize != null : !SR_POOL_SIZE_EDEFAULT.equals(srPoolSize);
			case HLAMPackage.RT_UNIT__SR_POOL_POLICY:
				return srPoolPolicy != SR_POOL_POLICY_EDEFAULT;
			case HLAMPackage.RT_UNIT__SR_POOL_WAITING_TIME:
				return srPoolWaitingTime != null;
			case HLAMPackage.RT_UNIT__OPERATIONAL_MODE:
				return operationalMode != null;
			case HLAMPackage.RT_UNIT__MAIN:
				return main != null;
			case HLAMPackage.RT_UNIT__MEMORY_SIZE:
				return memorySize != null;
			case HLAMPackage.RT_UNIT__BASE_BEHAVIORED_CLASSIFIER:
				return base_BehavioredClassifier != null;
			case HLAMPackage.RT_UNIT__QUEUE_SCHED_POLICY:
				return queueSchedPolicy != QUEUE_SCHED_POLICY_EDEFAULT;
			case HLAMPackage.RT_UNIT__QUEUE_SIZE:
				return QUEUE_SIZE_EDEFAULT == null ? queueSize != null : !QUEUE_SIZE_EDEFAULT.equals(queueSize);
			case HLAMPackage.RT_UNIT__MSG_MAX_SIZE:
				return msgMaxSize != null;
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
		result.append(" (isDynamic: ");
		result.append(isDynamic);
		result.append(", isMain: ");
		result.append(isMain);
		result.append(", srPoolSize: ");
		result.append(srPoolSize);
		result.append(", srPoolPolicy: ");
		result.append(srPoolPolicy);
		result.append(", queueSchedPolicy: ");
		result.append(queueSchedPolicy);
		result.append(", queueSize: ");
		result.append(queueSize);
		result.append(')');
		return result.toString();
	}

} //RtUnitImpl
