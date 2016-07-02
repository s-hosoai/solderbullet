/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheStructure;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheType;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Repl_Policy;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.WritePolicy;

import MARTE_Library.BasicNFP_Types.NFP_Natural;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Cache</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwCacheImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwCacheImpl#getType <em>Type</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwCacheImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwCacheImpl#getRepl_Policy <em>Repl Policy</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwCacheImpl#getWritePolicy <em>Write Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwCacheImpl extends HwMemoryImpl implements HwCache {
	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected NFP_Natural level;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CacheType TYPE_EDEFAULT = CacheType.DATA_LITERAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CacheType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected CacheStructure structure;

	/**
	 * The default value of the '{@link #getRepl_Policy() <em>Repl Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepl_Policy()
	 * @generated
	 * @ordered
	 */
	protected static final Repl_Policy REPL_POLICY_EDEFAULT = Repl_Policy.LRU_LITERAL;

	/**
	 * The cached value of the '{@link #getRepl_Policy() <em>Repl Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepl_Policy()
	 * @generated
	 * @ordered
	 */
	protected Repl_Policy repl_Policy = REPL_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWritePolicy() <em>Write Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritePolicy()
	 * @generated
	 * @ordered
	 */
	protected static final WritePolicy WRITE_POLICY_EDEFAULT = WritePolicy.WRITE_BACK_LITERAL;

	/**
	 * The cached value of the '{@link #getWritePolicy() <em>Write Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritePolicy()
	 * @generated
	 * @ordered
	 */
	protected WritePolicy writePolicy = WRITE_POLICY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwCacheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwMemoryPackage.Literals.HW_CACHE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Natural getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel(NFP_Natural newLevel, NotificationChain msgs) {
		NFP_Natural oldLevel = level;
		level = newLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_CACHE__LEVEL, oldLevel, newLevel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(NFP_Natural newLevel) {
		if (newLevel != level) {
			NotificationChain msgs = null;
			if (level != null)
				msgs = ((InternalEObject)level).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_CACHE__LEVEL, null, msgs);
			if (newLevel != null)
				msgs = ((InternalEObject)newLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_CACHE__LEVEL, null, msgs);
			msgs = basicSetLevel(newLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_CACHE__LEVEL, newLevel, newLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CacheType newType) {
		CacheType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_CACHE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheStructure getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructure(CacheStructure newStructure, NotificationChain msgs) {
		CacheStructure oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_CACHE__STRUCTURE, oldStructure, newStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructure(CacheStructure newStructure) {
		if (newStructure != structure) {
			NotificationChain msgs = null;
			if (structure != null)
				msgs = ((InternalEObject)structure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_CACHE__STRUCTURE, null, msgs);
			if (newStructure != null)
				msgs = ((InternalEObject)newStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_CACHE__STRUCTURE, null, msgs);
			msgs = basicSetStructure(newStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_CACHE__STRUCTURE, newStructure, newStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repl_Policy getRepl_Policy() {
		return repl_Policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepl_Policy(Repl_Policy newRepl_Policy) {
		Repl_Policy oldRepl_Policy = repl_Policy;
		repl_Policy = newRepl_Policy == null ? REPL_POLICY_EDEFAULT : newRepl_Policy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_CACHE__REPL_POLICY, oldRepl_Policy, repl_Policy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritePolicy getWritePolicy() {
		return writePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWritePolicy(WritePolicy newWritePolicy) {
		WritePolicy oldWritePolicy = writePolicy;
		writePolicy = newWritePolicy == null ? WRITE_POLICY_EDEFAULT : newWritePolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_CACHE__WRITE_POLICY, oldWritePolicy, writePolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwMemoryPackage.HW_CACHE__LEVEL:
				return basicSetLevel(null, msgs);
			case HwMemoryPackage.HW_CACHE__STRUCTURE:
				return basicSetStructure(null, msgs);
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
			case HwMemoryPackage.HW_CACHE__LEVEL:
				return getLevel();
			case HwMemoryPackage.HW_CACHE__TYPE:
				return getType();
			case HwMemoryPackage.HW_CACHE__STRUCTURE:
				return getStructure();
			case HwMemoryPackage.HW_CACHE__REPL_POLICY:
				return getRepl_Policy();
			case HwMemoryPackage.HW_CACHE__WRITE_POLICY:
				return getWritePolicy();
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
			case HwMemoryPackage.HW_CACHE__LEVEL:
				setLevel((NFP_Natural)newValue);
				return;
			case HwMemoryPackage.HW_CACHE__TYPE:
				setType((CacheType)newValue);
				return;
			case HwMemoryPackage.HW_CACHE__STRUCTURE:
				setStructure((CacheStructure)newValue);
				return;
			case HwMemoryPackage.HW_CACHE__REPL_POLICY:
				setRepl_Policy((Repl_Policy)newValue);
				return;
			case HwMemoryPackage.HW_CACHE__WRITE_POLICY:
				setWritePolicy((WritePolicy)newValue);
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
			case HwMemoryPackage.HW_CACHE__LEVEL:
				setLevel((NFP_Natural)null);
				return;
			case HwMemoryPackage.HW_CACHE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case HwMemoryPackage.HW_CACHE__STRUCTURE:
				setStructure((CacheStructure)null);
				return;
			case HwMemoryPackage.HW_CACHE__REPL_POLICY:
				setRepl_Policy(REPL_POLICY_EDEFAULT);
				return;
			case HwMemoryPackage.HW_CACHE__WRITE_POLICY:
				setWritePolicy(WRITE_POLICY_EDEFAULT);
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
			case HwMemoryPackage.HW_CACHE__LEVEL:
				return level != null;
			case HwMemoryPackage.HW_CACHE__TYPE:
				return type != TYPE_EDEFAULT;
			case HwMemoryPackage.HW_CACHE__STRUCTURE:
				return structure != null;
			case HwMemoryPackage.HW_CACHE__REPL_POLICY:
				return repl_Policy != REPL_POLICY_EDEFAULT;
			case HwMemoryPackage.HW_CACHE__WRITE_POLICY:
				return writePolicy != WRITE_POLICY_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", repl_Policy: ");
		result.append(repl_Policy);
		result.append(", writePolicy: ");
		result.append(writePolicy);
		result.append(')');
		return result.toString();
	}

} //HwCacheImpl
