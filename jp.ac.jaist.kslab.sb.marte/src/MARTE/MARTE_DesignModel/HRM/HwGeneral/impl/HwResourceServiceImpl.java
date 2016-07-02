/**
 */
package MARTE.MARTE_DesignModel.HRM.HwGeneral.impl;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage;
import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResourceService;

import MARTE.MARTE_Foundations.GRM.impl.GrServiceImpl;

import MARTE_Library.BasicNFP_Types.NFP_Power;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Resource Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.impl.HwResourceServiceImpl#getConsumption <em>Consumption</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.impl.HwResourceServiceImpl#getDissipation <em>Dissipation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwResourceServiceImpl extends GrServiceImpl implements HwResourceService {
	/**
	 * The cached value of the '{@link #getConsumption() <em>Consumption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumption()
	 * @generated
	 * @ordered
	 */
	protected NFP_Power consumption;

	/**
	 * The cached value of the '{@link #getDissipation() <em>Dissipation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDissipation()
	 * @generated
	 * @ordered
	 */
	protected NFP_Power dissipation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwResourceServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwGeneralPackage.Literals.HW_RESOURCE_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Power getConsumption() {
		return consumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsumption(NFP_Power newConsumption, NotificationChain msgs) {
		NFP_Power oldConsumption = consumption;
		consumption = newConsumption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwGeneralPackage.HW_RESOURCE_SERVICE__CONSUMPTION, oldConsumption, newConsumption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumption(NFP_Power newConsumption) {
		if (newConsumption != consumption) {
			NotificationChain msgs = null;
			if (consumption != null)
				msgs = ((InternalEObject)consumption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwGeneralPackage.HW_RESOURCE_SERVICE__CONSUMPTION, null, msgs);
			if (newConsumption != null)
				msgs = ((InternalEObject)newConsumption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwGeneralPackage.HW_RESOURCE_SERVICE__CONSUMPTION, null, msgs);
			msgs = basicSetConsumption(newConsumption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwGeneralPackage.HW_RESOURCE_SERVICE__CONSUMPTION, newConsumption, newConsumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Power getDissipation() {
		return dissipation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDissipation(NFP_Power newDissipation, NotificationChain msgs) {
		NFP_Power oldDissipation = dissipation;
		dissipation = newDissipation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwGeneralPackage.HW_RESOURCE_SERVICE__DISSIPATION, oldDissipation, newDissipation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDissipation(NFP_Power newDissipation) {
		if (newDissipation != dissipation) {
			NotificationChain msgs = null;
			if (dissipation != null)
				msgs = ((InternalEObject)dissipation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwGeneralPackage.HW_RESOURCE_SERVICE__DISSIPATION, null, msgs);
			if (newDissipation != null)
				msgs = ((InternalEObject)newDissipation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwGeneralPackage.HW_RESOURCE_SERVICE__DISSIPATION, null, msgs);
			msgs = basicSetDissipation(newDissipation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwGeneralPackage.HW_RESOURCE_SERVICE__DISSIPATION, newDissipation, newDissipation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwGeneralPackage.HW_RESOURCE_SERVICE__CONSUMPTION:
				return basicSetConsumption(null, msgs);
			case HwGeneralPackage.HW_RESOURCE_SERVICE__DISSIPATION:
				return basicSetDissipation(null, msgs);
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
			case HwGeneralPackage.HW_RESOURCE_SERVICE__CONSUMPTION:
				return getConsumption();
			case HwGeneralPackage.HW_RESOURCE_SERVICE__DISSIPATION:
				return getDissipation();
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
			case HwGeneralPackage.HW_RESOURCE_SERVICE__CONSUMPTION:
				setConsumption((NFP_Power)newValue);
				return;
			case HwGeneralPackage.HW_RESOURCE_SERVICE__DISSIPATION:
				setDissipation((NFP_Power)newValue);
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
			case HwGeneralPackage.HW_RESOURCE_SERVICE__CONSUMPTION:
				setConsumption((NFP_Power)null);
				return;
			case HwGeneralPackage.HW_RESOURCE_SERVICE__DISSIPATION:
				setDissipation((NFP_Power)null);
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
			case HwGeneralPackage.HW_RESOURCE_SERVICE__CONSUMPTION:
				return consumption != null;
			case HwGeneralPackage.HW_RESOURCE_SERVICE__DISSIPATION:
				return dissipation != null;
		}
		return super.eIsSet(featureID);
	}

} //HwResourceServiceImpl
