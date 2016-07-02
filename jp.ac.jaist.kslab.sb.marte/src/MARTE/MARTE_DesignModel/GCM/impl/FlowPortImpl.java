/**
 */
package MARTE.MARTE_DesignModel.GCM.impl;

import MARTE.MARTE_DesignModel.GCM.FlowDirectionKind;
import MARTE.MARTE_DesignModel.GCM.FlowPort;
import MARTE.MARTE_DesignModel.GCM.GCMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.impl.FlowPortImpl#getIsAtomic <em>Is Atomic</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.impl.FlowPortImpl#getIsConjugated <em>Is Conjugated</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.impl.FlowPortImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.impl.FlowPortImpl#getBase_Port <em>Base Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowPortImpl extends EObjectImpl implements FlowPort {
	/**
	 * The default value of the '{@link #getIsAtomic() <em>Is Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAtomic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ATOMIC_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIsConjugated() <em>Is Conjugated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConjugated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CONJUGATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsConjugated() <em>Is Conjugated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConjugated()
	 * @generated
	 * @ordered
	 */
	protected Boolean isConjugated = IS_CONJUGATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final FlowDirectionKind DIRECTION_EDEFAULT = FlowDirectionKind.INOUT_LITERAL;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected FlowDirectionKind direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Port() <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Port()
	 * @generated
	 * @ordered
	 */
	protected Port base_Port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GCMPackage.Literals.FLOW_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAtomic() {
		// TODO: implement this method to return the 'Is Atomic' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAtomic(Boolean newIsAtomic) {
		// TODO: implement this method to set the 'Is Atomic' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsConjugated() {
		return isConjugated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConjugated(Boolean newIsConjugated) {
		Boolean oldIsConjugated = isConjugated;
		isConjugated = newIsConjugated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCMPackage.FLOW_PORT__IS_CONJUGATED, oldIsConjugated, isConjugated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowDirectionKind getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(FlowDirectionKind newDirection) {
		FlowDirectionKind oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCMPackage.FLOW_PORT__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getBase_Port() {
		if (base_Port != null && base_Port.eIsProxy()) {
			InternalEObject oldBase_Port = (InternalEObject)base_Port;
			base_Port = (Port)eResolveProxy(oldBase_Port);
			if (base_Port != oldBase_Port) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GCMPackage.FLOW_PORT__BASE_PORT, oldBase_Port, base_Port));
			}
		}
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetBase_Port() {
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Port(Port newBase_Port) {
		Port oldBase_Port = base_Port;
		base_Port = newBase_Port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCMPackage.FLOW_PORT__BASE_PORT, oldBase_Port, base_Port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GCMPackage.FLOW_PORT__IS_ATOMIC:
				return getIsAtomic();
			case GCMPackage.FLOW_PORT__IS_CONJUGATED:
				return getIsConjugated();
			case GCMPackage.FLOW_PORT__DIRECTION:
				return getDirection();
			case GCMPackage.FLOW_PORT__BASE_PORT:
				if (resolve) return getBase_Port();
				return basicGetBase_Port();
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
			case GCMPackage.FLOW_PORT__IS_ATOMIC:
				setIsAtomic((Boolean)newValue);
				return;
			case GCMPackage.FLOW_PORT__IS_CONJUGATED:
				setIsConjugated((Boolean)newValue);
				return;
			case GCMPackage.FLOW_PORT__DIRECTION:
				setDirection((FlowDirectionKind)newValue);
				return;
			case GCMPackage.FLOW_PORT__BASE_PORT:
				setBase_Port((Port)newValue);
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
			case GCMPackage.FLOW_PORT__IS_ATOMIC:
				setIsAtomic(IS_ATOMIC_EDEFAULT);
				return;
			case GCMPackage.FLOW_PORT__IS_CONJUGATED:
				setIsConjugated(IS_CONJUGATED_EDEFAULT);
				return;
			case GCMPackage.FLOW_PORT__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case GCMPackage.FLOW_PORT__BASE_PORT:
				setBase_Port((Port)null);
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
			case GCMPackage.FLOW_PORT__IS_ATOMIC:
				return IS_ATOMIC_EDEFAULT == null ? getIsAtomic() != null : !IS_ATOMIC_EDEFAULT.equals(getIsAtomic());
			case GCMPackage.FLOW_PORT__IS_CONJUGATED:
				return IS_CONJUGATED_EDEFAULT == null ? isConjugated != null : !IS_CONJUGATED_EDEFAULT.equals(isConjugated);
			case GCMPackage.FLOW_PORT__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case GCMPackage.FLOW_PORT__BASE_PORT:
				return base_Port != null;
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
		result.append(" (isConjugated: ");
		result.append(isConjugated);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //FlowPortImpl
