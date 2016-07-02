/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.MemoryOrganization;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Repl_Policy;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.WritePolicy;

import MARTE_Library.BasicNFP_Types.NFP_Boolean;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw RAM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwRAMImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwRAMImpl#getIsSynchronous <em>Is Synchronous</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwRAMImpl#getIsStatic <em>Is Static</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwRAMImpl#getIsNonVolatile <em>Is Non Volatile</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwRAMImpl#getRepl_Policy <em>Repl Policy</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwRAMImpl#getWritePolicy <em>Write Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwRAMImpl extends HwMemoryImpl implements HwRAM {
	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected MemoryOrganization organization;

	/**
	 * The cached value of the '{@link #getIsSynchronous() <em>Is Synchronous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSynchronous()
	 * @generated
	 * @ordered
	 */
	protected NFP_Boolean isSynchronous;

	/**
	 * The cached value of the '{@link #getIsStatic() <em>Is Static</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStatic()
	 * @generated
	 * @ordered
	 */
	protected NFP_Boolean isStatic;

	/**
	 * The cached value of the '{@link #getIsNonVolatile() <em>Is Non Volatile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNonVolatile()
	 * @generated
	 * @ordered
	 */
	protected NFP_Boolean isNonVolatile;

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
	protected HwRAMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwMemoryPackage.Literals.HW_RAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryOrganization getOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(MemoryOrganization newOrganization, NotificationChain msgs) {
		MemoryOrganization oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_RAM__ORGANIZATION, oldOrganization, newOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(MemoryOrganization newOrganization) {
		if (newOrganization != organization) {
			NotificationChain msgs = null;
			if (organization != null)
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_RAM__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_RAM__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_RAM__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Boolean getIsSynchronous() {
		return isSynchronous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsSynchronous(NFP_Boolean newIsSynchronous, NotificationChain msgs) {
		NFP_Boolean oldIsSynchronous = isSynchronous;
		isSynchronous = newIsSynchronous;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_RAM__IS_SYNCHRONOUS, oldIsSynchronous, newIsSynchronous);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSynchronous(NFP_Boolean newIsSynchronous) {
		if (newIsSynchronous != isSynchronous) {
			NotificationChain msgs = null;
			if (isSynchronous != null)
				msgs = ((InternalEObject)isSynchronous).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_RAM__IS_SYNCHRONOUS, null, msgs);
			if (newIsSynchronous != null)
				msgs = ((InternalEObject)newIsSynchronous).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_RAM__IS_SYNCHRONOUS, null, msgs);
			msgs = basicSetIsSynchronous(newIsSynchronous, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_RAM__IS_SYNCHRONOUS, newIsSynchronous, newIsSynchronous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Boolean getIsStatic() {
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsStatic(NFP_Boolean newIsStatic, NotificationChain msgs) {
		NFP_Boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_RAM__IS_STATIC, oldIsStatic, newIsStatic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(NFP_Boolean newIsStatic) {
		if (newIsStatic != isStatic) {
			NotificationChain msgs = null;
			if (isStatic != null)
				msgs = ((InternalEObject)isStatic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_RAM__IS_STATIC, null, msgs);
			if (newIsStatic != null)
				msgs = ((InternalEObject)newIsStatic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_RAM__IS_STATIC, null, msgs);
			msgs = basicSetIsStatic(newIsStatic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_RAM__IS_STATIC, newIsStatic, newIsStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Boolean getIsNonVolatile() {
		return isNonVolatile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsNonVolatile(NFP_Boolean newIsNonVolatile, NotificationChain msgs) {
		NFP_Boolean oldIsNonVolatile = isNonVolatile;
		isNonVolatile = newIsNonVolatile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_RAM__IS_NON_VOLATILE, oldIsNonVolatile, newIsNonVolatile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNonVolatile(NFP_Boolean newIsNonVolatile) {
		if (newIsNonVolatile != isNonVolatile) {
			NotificationChain msgs = null;
			if (isNonVolatile != null)
				msgs = ((InternalEObject)isNonVolatile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_RAM__IS_NON_VOLATILE, null, msgs);
			if (newIsNonVolatile != null)
				msgs = ((InternalEObject)newIsNonVolatile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_RAM__IS_NON_VOLATILE, null, msgs);
			msgs = basicSetIsNonVolatile(newIsNonVolatile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_RAM__IS_NON_VOLATILE, newIsNonVolatile, newIsNonVolatile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_RAM__REPL_POLICY, oldRepl_Policy, repl_Policy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_RAM__WRITE_POLICY, oldWritePolicy, writePolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwMemoryPackage.HW_RAM__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case HwMemoryPackage.HW_RAM__IS_SYNCHRONOUS:
				return basicSetIsSynchronous(null, msgs);
			case HwMemoryPackage.HW_RAM__IS_STATIC:
				return basicSetIsStatic(null, msgs);
			case HwMemoryPackage.HW_RAM__IS_NON_VOLATILE:
				return basicSetIsNonVolatile(null, msgs);
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
			case HwMemoryPackage.HW_RAM__ORGANIZATION:
				return getOrganization();
			case HwMemoryPackage.HW_RAM__IS_SYNCHRONOUS:
				return getIsSynchronous();
			case HwMemoryPackage.HW_RAM__IS_STATIC:
				return getIsStatic();
			case HwMemoryPackage.HW_RAM__IS_NON_VOLATILE:
				return getIsNonVolatile();
			case HwMemoryPackage.HW_RAM__REPL_POLICY:
				return getRepl_Policy();
			case HwMemoryPackage.HW_RAM__WRITE_POLICY:
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
			case HwMemoryPackage.HW_RAM__ORGANIZATION:
				setOrganization((MemoryOrganization)newValue);
				return;
			case HwMemoryPackage.HW_RAM__IS_SYNCHRONOUS:
				setIsSynchronous((NFP_Boolean)newValue);
				return;
			case HwMemoryPackage.HW_RAM__IS_STATIC:
				setIsStatic((NFP_Boolean)newValue);
				return;
			case HwMemoryPackage.HW_RAM__IS_NON_VOLATILE:
				setIsNonVolatile((NFP_Boolean)newValue);
				return;
			case HwMemoryPackage.HW_RAM__REPL_POLICY:
				setRepl_Policy((Repl_Policy)newValue);
				return;
			case HwMemoryPackage.HW_RAM__WRITE_POLICY:
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
			case HwMemoryPackage.HW_RAM__ORGANIZATION:
				setOrganization((MemoryOrganization)null);
				return;
			case HwMemoryPackage.HW_RAM__IS_SYNCHRONOUS:
				setIsSynchronous((NFP_Boolean)null);
				return;
			case HwMemoryPackage.HW_RAM__IS_STATIC:
				setIsStatic((NFP_Boolean)null);
				return;
			case HwMemoryPackage.HW_RAM__IS_NON_VOLATILE:
				setIsNonVolatile((NFP_Boolean)null);
				return;
			case HwMemoryPackage.HW_RAM__REPL_POLICY:
				setRepl_Policy(REPL_POLICY_EDEFAULT);
				return;
			case HwMemoryPackage.HW_RAM__WRITE_POLICY:
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
			case HwMemoryPackage.HW_RAM__ORGANIZATION:
				return organization != null;
			case HwMemoryPackage.HW_RAM__IS_SYNCHRONOUS:
				return isSynchronous != null;
			case HwMemoryPackage.HW_RAM__IS_STATIC:
				return isStatic != null;
			case HwMemoryPackage.HW_RAM__IS_NON_VOLATILE:
				return isNonVolatile != null;
			case HwMemoryPackage.HW_RAM__REPL_POLICY:
				return repl_Policy != REPL_POLICY_EDEFAULT;
			case HwMemoryPackage.HW_RAM__WRITE_POLICY:
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
		result.append(" (repl_Policy: ");
		result.append(repl_Policy);
		result.append(", writePolicy: ");
		result.append(writePolicy);
		result.append(')');
		return result.toString();
	}

} //HwRAMImpl
