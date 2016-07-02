/**
 */
package MARTE.MARTE_DesignModel.HLAM.impl;

import MARTE.MARTE_DesignModel.HLAM.HLAMPackage;
import MARTE.MARTE_DesignModel.HLAM.RtAction;
import MARTE.MARTE_DesignModel.HLAM.SynchronizationKind;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;

import MARTE_Library.MARTE_PrimitivesTypes.MARTE_PrimitivesTypesFactory;
import MARTE_Library.MARTE_PrimitivesTypes.MARTE_PrimitivesTypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.InvocationAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rt Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtActionImpl#getIsAtomic <em>Is Atomic</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtActionImpl#getSynchKind <em>Synch Kind</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtActionImpl#getMsgSize <em>Msg Size</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtActionImpl#getBase_BehavioralFeature <em>Base Behavioral Feature</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtActionImpl#getBase_InvocationAction <em>Base Invocation Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RtActionImpl extends EObjectImpl implements RtAction {
	/**
	 * The default value of the '{@link #getIsAtomic() <em>Is Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAtomic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ATOMIC_EDEFAULT = (Boolean)MARTE_PrimitivesTypesFactory.eINSTANCE.createFromString(MARTE_PrimitivesTypesPackage.eINSTANCE.getBoolean(), "false");

	/**
	 * The cached value of the '{@link #getIsAtomic() <em>Is Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAtomic()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAtomic = IS_ATOMIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getSynchKind() <em>Synch Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchKind()
	 * @generated
	 * @ordered
	 */
	protected static final SynchronizationKind SYNCH_KIND_EDEFAULT = SynchronizationKind.SYNCHRONOUS_LITERAL;

	/**
	 * The cached value of the '{@link #getSynchKind() <em>Synch Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchKind()
	 * @generated
	 * @ordered
	 */
	protected SynchronizationKind synchKind = SYNCH_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMsgSize() <em>Msg Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgSize()
	 * @generated
	 * @ordered
	 */
	protected NFP_DataSize msgSize;

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
	 * The cached value of the '{@link #getBase_InvocationAction() <em>Base Invocation Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_InvocationAction()
	 * @generated
	 * @ordered
	 */
	protected InvocationAction base_InvocationAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HLAMPackage.Literals.RT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAtomic() {
		return isAtomic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAtomic(Boolean newIsAtomic) {
		Boolean oldIsAtomic = isAtomic;
		isAtomic = newIsAtomic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_ACTION__IS_ATOMIC, oldIsAtomic, isAtomic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationKind getSynchKind() {
		return synchKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchKind(SynchronizationKind newSynchKind) {
		SynchronizationKind oldSynchKind = synchKind;
		synchKind = newSynchKind == null ? SYNCH_KIND_EDEFAULT : newSynchKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_ACTION__SYNCH_KIND, oldSynchKind, synchKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataSize getMsgSize() {
		return msgSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsgSize(NFP_DataSize newMsgSize, NotificationChain msgs) {
		NFP_DataSize oldMsgSize = msgSize;
		msgSize = newMsgSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_ACTION__MSG_SIZE, oldMsgSize, newMsgSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsgSize(NFP_DataSize newMsgSize) {
		if (newMsgSize != msgSize) {
			NotificationChain msgs = null;
			if (msgSize != null)
				msgs = ((InternalEObject)msgSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_ACTION__MSG_SIZE, null, msgs);
			if (newMsgSize != null)
				msgs = ((InternalEObject)newMsgSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_ACTION__MSG_SIZE, null, msgs);
			msgs = basicSetMsgSize(newMsgSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_ACTION__MSG_SIZE, newMsgSize, newMsgSize));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HLAMPackage.RT_ACTION__BASE_BEHAVIORAL_FEATURE, oldBase_BehavioralFeature, base_BehavioralFeature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_ACTION__BASE_BEHAVIORAL_FEATURE, oldBase_BehavioralFeature, base_BehavioralFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationAction getBase_InvocationAction() {
		if (base_InvocationAction != null && base_InvocationAction.eIsProxy()) {
			InternalEObject oldBase_InvocationAction = (InternalEObject)base_InvocationAction;
			base_InvocationAction = (InvocationAction)eResolveProxy(oldBase_InvocationAction);
			if (base_InvocationAction != oldBase_InvocationAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HLAMPackage.RT_ACTION__BASE_INVOCATION_ACTION, oldBase_InvocationAction, base_InvocationAction));
			}
		}
		return base_InvocationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationAction basicGetBase_InvocationAction() {
		return base_InvocationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_InvocationAction(InvocationAction newBase_InvocationAction) {
		InvocationAction oldBase_InvocationAction = base_InvocationAction;
		base_InvocationAction = newBase_InvocationAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_ACTION__BASE_INVOCATION_ACTION, oldBase_InvocationAction, base_InvocationAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HLAMPackage.RT_ACTION__MSG_SIZE:
				return basicSetMsgSize(null, msgs);
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
			case HLAMPackage.RT_ACTION__IS_ATOMIC:
				return getIsAtomic();
			case HLAMPackage.RT_ACTION__SYNCH_KIND:
				return getSynchKind();
			case HLAMPackage.RT_ACTION__MSG_SIZE:
				return getMsgSize();
			case HLAMPackage.RT_ACTION__BASE_BEHAVIORAL_FEATURE:
				if (resolve) return getBase_BehavioralFeature();
				return basicGetBase_BehavioralFeature();
			case HLAMPackage.RT_ACTION__BASE_INVOCATION_ACTION:
				if (resolve) return getBase_InvocationAction();
				return basicGetBase_InvocationAction();
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
			case HLAMPackage.RT_ACTION__IS_ATOMIC:
				setIsAtomic((Boolean)newValue);
				return;
			case HLAMPackage.RT_ACTION__SYNCH_KIND:
				setSynchKind((SynchronizationKind)newValue);
				return;
			case HLAMPackage.RT_ACTION__MSG_SIZE:
				setMsgSize((NFP_DataSize)newValue);
				return;
			case HLAMPackage.RT_ACTION__BASE_BEHAVIORAL_FEATURE:
				setBase_BehavioralFeature((BehavioralFeature)newValue);
				return;
			case HLAMPackage.RT_ACTION__BASE_INVOCATION_ACTION:
				setBase_InvocationAction((InvocationAction)newValue);
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
			case HLAMPackage.RT_ACTION__IS_ATOMIC:
				setIsAtomic(IS_ATOMIC_EDEFAULT);
				return;
			case HLAMPackage.RT_ACTION__SYNCH_KIND:
				setSynchKind(SYNCH_KIND_EDEFAULT);
				return;
			case HLAMPackage.RT_ACTION__MSG_SIZE:
				setMsgSize((NFP_DataSize)null);
				return;
			case HLAMPackage.RT_ACTION__BASE_BEHAVIORAL_FEATURE:
				setBase_BehavioralFeature((BehavioralFeature)null);
				return;
			case HLAMPackage.RT_ACTION__BASE_INVOCATION_ACTION:
				setBase_InvocationAction((InvocationAction)null);
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
			case HLAMPackage.RT_ACTION__IS_ATOMIC:
				return IS_ATOMIC_EDEFAULT == null ? isAtomic != null : !IS_ATOMIC_EDEFAULT.equals(isAtomic);
			case HLAMPackage.RT_ACTION__SYNCH_KIND:
				return synchKind != SYNCH_KIND_EDEFAULT;
			case HLAMPackage.RT_ACTION__MSG_SIZE:
				return msgSize != null;
			case HLAMPackage.RT_ACTION__BASE_BEHAVIORAL_FEATURE:
				return base_BehavioralFeature != null;
			case HLAMPackage.RT_ACTION__BASE_INVOCATION_ACTION:
				return base_InvocationAction != null;
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
		result.append(" (isAtomic: ");
		result.append(isAtomic);
		result.append(", synchKind: ");
		result.append(synchKind);
		result.append(')');
		return result.toString();
	}

} //RtActionImpl
