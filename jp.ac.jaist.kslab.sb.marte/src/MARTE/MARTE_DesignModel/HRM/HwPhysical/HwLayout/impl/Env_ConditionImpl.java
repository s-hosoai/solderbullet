/**
 */
package MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl;

import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentState;
import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ConditionType;
import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition;
import MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage;

import MARTE_Library.BasicNFP_Types.NFP_String;

import MARTE_Library.MARTE_DataTypes.Realnterval;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Env Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.Env_ConditionImpl#getType <em>Type</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.Env_ConditionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.Env_ConditionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.impl.Env_ConditionImpl#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Env_ConditionImpl extends EObjectImpl implements Env_Condition {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ConditionType TYPE_EDEFAULT = ConditionType.TEMPERATURE_LITERAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ConditionType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentState STATUS_EDEFAULT = ComponentState.OPERATING_LITERAL;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ComponentState status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected NFP_String description;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected Realnterval range;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Env_ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwLayoutPackage.Literals.ENV_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ConditionType newType) {
		ConditionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwLayoutPackage.ENV_CONDITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentState getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ComponentState newStatus) {
		ComponentState oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwLayoutPackage.ENV_CONDITION__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(NFP_String newDescription, NotificationChain msgs) {
		NFP_String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwLayoutPackage.ENV_CONDITION__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(NFP_String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwLayoutPackage.ENV_CONDITION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwLayoutPackage.ENV_CONDITION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwLayoutPackage.ENV_CONDITION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realnterval getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(Realnterval newRange, NotificationChain msgs) {
		Realnterval oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwLayoutPackage.ENV_CONDITION__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(Realnterval newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwLayoutPackage.ENV_CONDITION__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwLayoutPackage.ENV_CONDITION__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwLayoutPackage.ENV_CONDITION__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwLayoutPackage.ENV_CONDITION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case HwLayoutPackage.ENV_CONDITION__RANGE:
				return basicSetRange(null, msgs);
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
			case HwLayoutPackage.ENV_CONDITION__TYPE:
				return getType();
			case HwLayoutPackage.ENV_CONDITION__STATUS:
				return getStatus();
			case HwLayoutPackage.ENV_CONDITION__DESCRIPTION:
				return getDescription();
			case HwLayoutPackage.ENV_CONDITION__RANGE:
				return getRange();
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
			case HwLayoutPackage.ENV_CONDITION__TYPE:
				setType((ConditionType)newValue);
				return;
			case HwLayoutPackage.ENV_CONDITION__STATUS:
				setStatus((ComponentState)newValue);
				return;
			case HwLayoutPackage.ENV_CONDITION__DESCRIPTION:
				setDescription((NFP_String)newValue);
				return;
			case HwLayoutPackage.ENV_CONDITION__RANGE:
				setRange((Realnterval)newValue);
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
			case HwLayoutPackage.ENV_CONDITION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case HwLayoutPackage.ENV_CONDITION__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case HwLayoutPackage.ENV_CONDITION__DESCRIPTION:
				setDescription((NFP_String)null);
				return;
			case HwLayoutPackage.ENV_CONDITION__RANGE:
				setRange((Realnterval)null);
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
			case HwLayoutPackage.ENV_CONDITION__TYPE:
				return type != TYPE_EDEFAULT;
			case HwLayoutPackage.ENV_CONDITION__STATUS:
				return status != STATUS_EDEFAULT;
			case HwLayoutPackage.ENV_CONDITION__DESCRIPTION:
				return description != null;
			case HwLayoutPackage.ENV_CONDITION__RANGE:
				return range != null;
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
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //Env_ConditionImpl
