/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl;

import MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage;
import MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwTimerResource;

import MARTE.MARTE_Foundations.GRM.impl.TimerResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sw Timer Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.SwTimerResourceImpl#getDurationElements <em>Duration Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwTimerResourceImpl extends TimerResourceImpl implements SwTimerResource {
	/**
	 * The cached value of the '{@link #getDurationElements() <em>Duration Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationElements()
	 * @generated
	 * @ordered
	 */
	protected TypedElement durationElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwTimerResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SW_ConcurrencyPackage.Literals.SW_TIMER_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedElement getDurationElements() {
		if (durationElements != null && durationElements.eIsProxy()) {
			InternalEObject oldDurationElements = (InternalEObject)durationElements;
			durationElements = (TypedElement)eResolveProxy(oldDurationElements);
			if (durationElements != oldDurationElements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SW_ConcurrencyPackage.SW_TIMER_RESOURCE__DURATION_ELEMENTS, oldDurationElements, durationElements));
			}
		}
		return durationElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedElement basicGetDurationElements() {
		return durationElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationElements(TypedElement newDurationElements) {
		TypedElement oldDurationElements = durationElements;
		durationElements = newDurationElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_ConcurrencyPackage.SW_TIMER_RESOURCE__DURATION_ELEMENTS, oldDurationElements, durationElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SW_ConcurrencyPackage.SW_TIMER_RESOURCE__DURATION_ELEMENTS:
				if (resolve) return getDurationElements();
				return basicGetDurationElements();
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
			case SW_ConcurrencyPackage.SW_TIMER_RESOURCE__DURATION_ELEMENTS:
				setDurationElements((TypedElement)newValue);
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
			case SW_ConcurrencyPackage.SW_TIMER_RESOURCE__DURATION_ELEMENTS:
				setDurationElements((TypedElement)null);
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
			case SW_ConcurrencyPackage.SW_TIMER_RESOURCE__DURATION_ELEMENTS:
				return durationElements != null;
		}
		return super.eIsSet(featureID);
	}

} //SwTimerResourceImpl
