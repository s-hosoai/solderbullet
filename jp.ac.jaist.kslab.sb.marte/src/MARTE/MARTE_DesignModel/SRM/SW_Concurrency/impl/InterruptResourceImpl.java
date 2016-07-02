/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl;

import MARTE.MARTE_DesignModel.SRM.SW_Concurrency.InterruptKind;
import MARTE.MARTE_DesignModel.SRM.SW_Concurrency.InterruptResource;
import MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interrupt Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.InterruptResourceImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.InterruptResourceImpl#getIsMaskable <em>Is Maskable</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.InterruptResourceImpl#getVectorElements <em>Vector Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.InterruptResourceImpl#getMaskElements <em>Mask Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.InterruptResourceImpl#getRoutineConnectServices <em>Routine Connect Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.InterruptResourceImpl#getRoutineDisconnectServices <em>Routine Disconnect Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterruptResourceImpl extends SwConcurrentResourceImpl implements InterruptResource {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final InterruptKind KIND_EDEFAULT = InterruptKind.HARDWARE_INTERRUPTION_LITERAL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected InterruptKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsMaskable() <em>Is Maskable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMaskable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_MASKABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsMaskable() <em>Is Maskable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMaskable()
	 * @generated
	 * @ordered
	 */
	protected Boolean isMaskable = IS_MASKABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVectorElements() <em>Vector Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorElements()
	 * @generated
	 * @ordered
	 */
	protected EList vectorElements;

	/**
	 * The cached value of the '{@link #getMaskElements() <em>Mask Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskElements()
	 * @generated
	 * @ordered
	 */
	protected EList maskElements;

	/**
	 * The cached value of the '{@link #getRoutineConnectServices() <em>Routine Connect Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutineConnectServices()
	 * @generated
	 * @ordered
	 */
	protected EList routineConnectServices;

	/**
	 * The cached value of the '{@link #getRoutineDisconnectServices() <em>Routine Disconnect Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutineDisconnectServices()
	 * @generated
	 * @ordered
	 */
	protected EList routineDisconnectServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterruptResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SW_ConcurrencyPackage.Literals.INTERRUPT_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(InterruptKind newKind) {
		InterruptKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_ConcurrencyPackage.INTERRUPT_RESOURCE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsMaskable() {
		return isMaskable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMaskable(Boolean newIsMaskable) {
		Boolean oldIsMaskable = isMaskable;
		isMaskable = newIsMaskable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_ConcurrencyPackage.INTERRUPT_RESOURCE__IS_MASKABLE, oldIsMaskable, isMaskable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getVectorElements() {
		if (vectorElements == null) {
			vectorElements = new EObjectResolvingEList(TypedElement.class, this, SW_ConcurrencyPackage.INTERRUPT_RESOURCE__VECTOR_ELEMENTS);
		}
		return vectorElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMaskElements() {
		if (maskElements == null) {
			maskElements = new EObjectResolvingEList(TypedElement.class, this, SW_ConcurrencyPackage.INTERRUPT_RESOURCE__MASK_ELEMENTS);
		}
		return maskElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRoutineConnectServices() {
		if (routineConnectServices == null) {
			routineConnectServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_ConcurrencyPackage.INTERRUPT_RESOURCE__ROUTINE_CONNECT_SERVICES);
		}
		return routineConnectServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRoutineDisconnectServices() {
		if (routineDisconnectServices == null) {
			routineDisconnectServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_ConcurrencyPackage.INTERRUPT_RESOURCE__ROUTINE_DISCONNECT_SERVICES);
		}
		return routineDisconnectServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__KIND:
				return getKind();
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__IS_MASKABLE:
				return getIsMaskable();
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__VECTOR_ELEMENTS:
				return getVectorElements();
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__MASK_ELEMENTS:
				return getMaskElements();
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__ROUTINE_CONNECT_SERVICES:
				return getRoutineConnectServices();
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__ROUTINE_DISCONNECT_SERVICES:
				return getRoutineDisconnectServices();
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
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__KIND:
				setKind((InterruptKind)newValue);
				return;
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__IS_MASKABLE:
				setIsMaskable((Boolean)newValue);
				return;
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__VECTOR_ELEMENTS:
				getVectorElements().clear();
				getVectorElements().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__MASK_ELEMENTS:
				getMaskElements().clear();
				getMaskElements().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__ROUTINE_CONNECT_SERVICES:
				getRoutineConnectServices().clear();
				getRoutineConnectServices().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__ROUTINE_DISCONNECT_SERVICES:
				getRoutineDisconnectServices().clear();
				getRoutineDisconnectServices().addAll((Collection)newValue);
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
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__IS_MASKABLE:
				setIsMaskable(IS_MASKABLE_EDEFAULT);
				return;
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__VECTOR_ELEMENTS:
				getVectorElements().clear();
				return;
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__MASK_ELEMENTS:
				getMaskElements().clear();
				return;
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__ROUTINE_CONNECT_SERVICES:
				getRoutineConnectServices().clear();
				return;
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__ROUTINE_DISCONNECT_SERVICES:
				getRoutineDisconnectServices().clear();
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
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__KIND:
				return kind != KIND_EDEFAULT;
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__IS_MASKABLE:
				return IS_MASKABLE_EDEFAULT == null ? isMaskable != null : !IS_MASKABLE_EDEFAULT.equals(isMaskable);
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__VECTOR_ELEMENTS:
				return vectorElements != null && !vectorElements.isEmpty();
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__MASK_ELEMENTS:
				return maskElements != null && !maskElements.isEmpty();
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__ROUTINE_CONNECT_SERVICES:
				return routineConnectServices != null && !routineConnectServices.isEmpty();
			case SW_ConcurrencyPackage.INTERRUPT_RESOURCE__ROUTINE_DISCONNECT_SERVICES:
				return routineDisconnectServices != null && !routineDisconnectServices.isEmpty();
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", isMaskable: ");
		result.append(isMaskable);
		result.append(')');
		return result.toString();
	}

} //InterruptResourceImpl
