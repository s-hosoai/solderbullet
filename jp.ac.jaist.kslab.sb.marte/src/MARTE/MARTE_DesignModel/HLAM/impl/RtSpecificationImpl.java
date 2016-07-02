/**
 */
package MARTE.MARTE_DesignModel.HLAM.impl;

import MARTE.MARTE_DesignModel.HLAM.HLAMPackage;
import MARTE.MARTE_DesignModel.HLAM.RtSpecification;

import MARTE.MARTE_Foundations.Time.TimedInstantObservation;

import MARTE_Library.BasicNFP_Types.ArrivalPattern;
import MARTE_Library.BasicNFP_Types.NFP_DateTime;
import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Integer;
import MARTE_Library.BasicNFP_Types.NFP_Percentage;

import MARTE_Library.MARTE_DataTypes.UtilityType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.Comment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rt Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtSpecificationImpl#getUtility <em>Utility</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtSpecificationImpl#getOccKind <em>Occ Kind</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtSpecificationImpl#getTRef <em>TRef</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtSpecificationImpl#getRelDl <em>Rel Dl</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtSpecificationImpl#getAbsDl <em>Abs Dl</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtSpecificationImpl#getBoundDl <em>Bound Dl</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtSpecificationImpl#getRdTime <em>Rd Time</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtSpecificationImpl#getMiss <em>Miss</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtSpecificationImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.RtSpecificationImpl#getBase_Comment <em>Base Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RtSpecificationImpl extends EObjectImpl implements RtSpecification {
	/**
	 * The cached value of the '{@link #getUtility() <em>Utility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtility()
	 * @generated
	 * @ordered
	 */
	protected UtilityType utility;

	/**
	 * The cached value of the '{@link #getOccKind() <em>Occ Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccKind()
	 * @generated
	 * @ordered
	 */
	protected ArrivalPattern occKind;

	/**
	 * The cached value of the '{@link #getTRef() <em>TRef</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTRef()
	 * @generated
	 * @ordered
	 */
	protected TimedInstantObservation tRef;

	/**
	 * The cached value of the '{@link #getRelDl() <em>Rel Dl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelDl()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration relDl;

	/**
	 * The cached value of the '{@link #getAbsDl() <em>Abs Dl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsDl()
	 * @generated
	 * @ordered
	 */
	protected NFP_DateTime absDl;

	/**
	 * The cached value of the '{@link #getBoundDl() <em>Bound Dl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundDl()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration boundDl;

	/**
	 * The cached value of the '{@link #getRdTime() <em>Rd Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdTime()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration rdTime;

	/**
	 * The cached value of the '{@link #getMiss() <em>Miss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiss()
	 * @generated
	 * @ordered
	 */
	protected NFP_Percentage miss;

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
	 * The cached value of the '{@link #getBase_Comment() <em>Base Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Comment()
	 * @generated
	 * @ordered
	 */
	protected Comment base_Comment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HLAMPackage.Literals.RT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilityType getUtility() {
		return utility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUtility(UtilityType newUtility, NotificationChain msgs) {
		UtilityType oldUtility = utility;
		utility = newUtility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_SPECIFICATION__UTILITY, oldUtility, newUtility);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtility(UtilityType newUtility) {
		if (newUtility != utility) {
			NotificationChain msgs = null;
			if (utility != null)
				msgs = ((InternalEObject)utility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_SPECIFICATION__UTILITY, null, msgs);
			if (newUtility != null)
				msgs = ((InternalEObject)newUtility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_SPECIFICATION__UTILITY, null, msgs);
			msgs = basicSetUtility(newUtility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_SPECIFICATION__UTILITY, newUtility, newUtility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrivalPattern getOccKind() {
		return occKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccKind(ArrivalPattern newOccKind, NotificationChain msgs) {
		ArrivalPattern oldOccKind = occKind;
		occKind = newOccKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_SPECIFICATION__OCC_KIND, oldOccKind, newOccKind);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccKind(ArrivalPattern newOccKind) {
		if (newOccKind != occKind) {
			NotificationChain msgs = null;
			if (occKind != null)
				msgs = ((InternalEObject)occKind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_SPECIFICATION__OCC_KIND, null, msgs);
			if (newOccKind != null)
				msgs = ((InternalEObject)newOccKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_SPECIFICATION__OCC_KIND, null, msgs);
			msgs = basicSetOccKind(newOccKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_SPECIFICATION__OCC_KIND, newOccKind, newOccKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedInstantObservation getTRef() {
		if (tRef != null && tRef.eIsProxy()) {
			InternalEObject oldTRef = (InternalEObject)tRef;
			tRef = (TimedInstantObservation)eResolveProxy(oldTRef);
			if (tRef != oldTRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HLAMPackage.RT_SPECIFICATION__TREF, oldTRef, tRef));
			}
		}
		return tRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedInstantObservation basicGetTRef() {
		return tRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTRef(TimedInstantObservation newTRef) {
		TimedInstantObservation oldTRef = tRef;
		tRef = newTRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_SPECIFICATION__TREF, oldTRef, tRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getRelDl() {
		return relDl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelDl(NFP_Duration newRelDl, NotificationChain msgs) {
		NFP_Duration oldRelDl = relDl;
		relDl = newRelDl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_SPECIFICATION__REL_DL, oldRelDl, newRelDl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelDl(NFP_Duration newRelDl) {
		if (newRelDl != relDl) {
			NotificationChain msgs = null;
			if (relDl != null)
				msgs = ((InternalEObject)relDl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_SPECIFICATION__REL_DL, null, msgs);
			if (newRelDl != null)
				msgs = ((InternalEObject)newRelDl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_SPECIFICATION__REL_DL, null, msgs);
			msgs = basicSetRelDl(newRelDl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_SPECIFICATION__REL_DL, newRelDl, newRelDl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DateTime getAbsDl() {
		return absDl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbsDl(NFP_DateTime newAbsDl, NotificationChain msgs) {
		NFP_DateTime oldAbsDl = absDl;
		absDl = newAbsDl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_SPECIFICATION__ABS_DL, oldAbsDl, newAbsDl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsDl(NFP_DateTime newAbsDl) {
		if (newAbsDl != absDl) {
			NotificationChain msgs = null;
			if (absDl != null)
				msgs = ((InternalEObject)absDl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_SPECIFICATION__ABS_DL, null, msgs);
			if (newAbsDl != null)
				msgs = ((InternalEObject)newAbsDl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_SPECIFICATION__ABS_DL, null, msgs);
			msgs = basicSetAbsDl(newAbsDl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_SPECIFICATION__ABS_DL, newAbsDl, newAbsDl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getBoundDl() {
		return boundDl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundDl(NFP_Duration newBoundDl, NotificationChain msgs) {
		NFP_Duration oldBoundDl = boundDl;
		boundDl = newBoundDl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_SPECIFICATION__BOUND_DL, oldBoundDl, newBoundDl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundDl(NFP_Duration newBoundDl) {
		if (newBoundDl != boundDl) {
			NotificationChain msgs = null;
			if (boundDl != null)
				msgs = ((InternalEObject)boundDl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_SPECIFICATION__BOUND_DL, null, msgs);
			if (newBoundDl != null)
				msgs = ((InternalEObject)newBoundDl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_SPECIFICATION__BOUND_DL, null, msgs);
			msgs = basicSetBoundDl(newBoundDl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_SPECIFICATION__BOUND_DL, newBoundDl, newBoundDl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getRdTime() {
		return rdTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdTime(NFP_Duration newRdTime, NotificationChain msgs) {
		NFP_Duration oldRdTime = rdTime;
		rdTime = newRdTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_SPECIFICATION__RD_TIME, oldRdTime, newRdTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRdTime(NFP_Duration newRdTime) {
		if (newRdTime != rdTime) {
			NotificationChain msgs = null;
			if (rdTime != null)
				msgs = ((InternalEObject)rdTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_SPECIFICATION__RD_TIME, null, msgs);
			if (newRdTime != null)
				msgs = ((InternalEObject)newRdTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_SPECIFICATION__RD_TIME, null, msgs);
			msgs = basicSetRdTime(newRdTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_SPECIFICATION__RD_TIME, newRdTime, newRdTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Percentage getMiss() {
		return miss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMiss(NFP_Percentage newMiss, NotificationChain msgs) {
		NFP_Percentage oldMiss = miss;
		miss = newMiss;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_SPECIFICATION__MISS, oldMiss, newMiss);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiss(NFP_Percentage newMiss) {
		if (newMiss != miss) {
			NotificationChain msgs = null;
			if (miss != null)
				msgs = ((InternalEObject)miss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_SPECIFICATION__MISS, null, msgs);
			if (newMiss != null)
				msgs = ((InternalEObject)newMiss).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_SPECIFICATION__MISS, null, msgs);
			msgs = basicSetMiss(newMiss, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_SPECIFICATION__MISS, newMiss, newMiss));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_SPECIFICATION__PRIORITY, oldPriority, newPriority);
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
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_SPECIFICATION__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.RT_SPECIFICATION__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_SPECIFICATION__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getBase_Comment() {
		if (base_Comment != null && base_Comment.eIsProxy()) {
			InternalEObject oldBase_Comment = (InternalEObject)base_Comment;
			base_Comment = (Comment)eResolveProxy(oldBase_Comment);
			if (base_Comment != oldBase_Comment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HLAMPackage.RT_SPECIFICATION__BASE_COMMENT, oldBase_Comment, base_Comment));
			}
		}
		return base_Comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment basicGetBase_Comment() {
		return base_Comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Comment(Comment newBase_Comment) {
		Comment oldBase_Comment = base_Comment;
		base_Comment = newBase_Comment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.RT_SPECIFICATION__BASE_COMMENT, oldBase_Comment, base_Comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HLAMPackage.RT_SPECIFICATION__UTILITY:
				return basicSetUtility(null, msgs);
			case HLAMPackage.RT_SPECIFICATION__OCC_KIND:
				return basicSetOccKind(null, msgs);
			case HLAMPackage.RT_SPECIFICATION__REL_DL:
				return basicSetRelDl(null, msgs);
			case HLAMPackage.RT_SPECIFICATION__ABS_DL:
				return basicSetAbsDl(null, msgs);
			case HLAMPackage.RT_SPECIFICATION__BOUND_DL:
				return basicSetBoundDl(null, msgs);
			case HLAMPackage.RT_SPECIFICATION__RD_TIME:
				return basicSetRdTime(null, msgs);
			case HLAMPackage.RT_SPECIFICATION__MISS:
				return basicSetMiss(null, msgs);
			case HLAMPackage.RT_SPECIFICATION__PRIORITY:
				return basicSetPriority(null, msgs);
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
			case HLAMPackage.RT_SPECIFICATION__UTILITY:
				return getUtility();
			case HLAMPackage.RT_SPECIFICATION__OCC_KIND:
				return getOccKind();
			case HLAMPackage.RT_SPECIFICATION__TREF:
				if (resolve) return getTRef();
				return basicGetTRef();
			case HLAMPackage.RT_SPECIFICATION__REL_DL:
				return getRelDl();
			case HLAMPackage.RT_SPECIFICATION__ABS_DL:
				return getAbsDl();
			case HLAMPackage.RT_SPECIFICATION__BOUND_DL:
				return getBoundDl();
			case HLAMPackage.RT_SPECIFICATION__RD_TIME:
				return getRdTime();
			case HLAMPackage.RT_SPECIFICATION__MISS:
				return getMiss();
			case HLAMPackage.RT_SPECIFICATION__PRIORITY:
				return getPriority();
			case HLAMPackage.RT_SPECIFICATION__BASE_COMMENT:
				if (resolve) return getBase_Comment();
				return basicGetBase_Comment();
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
			case HLAMPackage.RT_SPECIFICATION__UTILITY:
				setUtility((UtilityType)newValue);
				return;
			case HLAMPackage.RT_SPECIFICATION__OCC_KIND:
				setOccKind((ArrivalPattern)newValue);
				return;
			case HLAMPackage.RT_SPECIFICATION__TREF:
				setTRef((TimedInstantObservation)newValue);
				return;
			case HLAMPackage.RT_SPECIFICATION__REL_DL:
				setRelDl((NFP_Duration)newValue);
				return;
			case HLAMPackage.RT_SPECIFICATION__ABS_DL:
				setAbsDl((NFP_DateTime)newValue);
				return;
			case HLAMPackage.RT_SPECIFICATION__BOUND_DL:
				setBoundDl((NFP_Duration)newValue);
				return;
			case HLAMPackage.RT_SPECIFICATION__RD_TIME:
				setRdTime((NFP_Duration)newValue);
				return;
			case HLAMPackage.RT_SPECIFICATION__MISS:
				setMiss((NFP_Percentage)newValue);
				return;
			case HLAMPackage.RT_SPECIFICATION__PRIORITY:
				setPriority((NFP_Integer)newValue);
				return;
			case HLAMPackage.RT_SPECIFICATION__BASE_COMMENT:
				setBase_Comment((Comment)newValue);
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
			case HLAMPackage.RT_SPECIFICATION__UTILITY:
				setUtility((UtilityType)null);
				return;
			case HLAMPackage.RT_SPECIFICATION__OCC_KIND:
				setOccKind((ArrivalPattern)null);
				return;
			case HLAMPackage.RT_SPECIFICATION__TREF:
				setTRef((TimedInstantObservation)null);
				return;
			case HLAMPackage.RT_SPECIFICATION__REL_DL:
				setRelDl((NFP_Duration)null);
				return;
			case HLAMPackage.RT_SPECIFICATION__ABS_DL:
				setAbsDl((NFP_DateTime)null);
				return;
			case HLAMPackage.RT_SPECIFICATION__BOUND_DL:
				setBoundDl((NFP_Duration)null);
				return;
			case HLAMPackage.RT_SPECIFICATION__RD_TIME:
				setRdTime((NFP_Duration)null);
				return;
			case HLAMPackage.RT_SPECIFICATION__MISS:
				setMiss((NFP_Percentage)null);
				return;
			case HLAMPackage.RT_SPECIFICATION__PRIORITY:
				setPriority((NFP_Integer)null);
				return;
			case HLAMPackage.RT_SPECIFICATION__BASE_COMMENT:
				setBase_Comment((Comment)null);
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
			case HLAMPackage.RT_SPECIFICATION__UTILITY:
				return utility != null;
			case HLAMPackage.RT_SPECIFICATION__OCC_KIND:
				return occKind != null;
			case HLAMPackage.RT_SPECIFICATION__TREF:
				return tRef != null;
			case HLAMPackage.RT_SPECIFICATION__REL_DL:
				return relDl != null;
			case HLAMPackage.RT_SPECIFICATION__ABS_DL:
				return absDl != null;
			case HLAMPackage.RT_SPECIFICATION__BOUND_DL:
				return boundDl != null;
			case HLAMPackage.RT_SPECIFICATION__RD_TIME:
				return rdTime != null;
			case HLAMPackage.RT_SPECIFICATION__MISS:
				return miss != null;
			case HLAMPackage.RT_SPECIFICATION__PRIORITY:
				return priority != null;
			case HLAMPackage.RT_SPECIFICATION__BASE_COMMENT:
				return base_Comment != null;
		}
		return super.eIsSet(featureID);
	}

} //RtSpecificationImpl
