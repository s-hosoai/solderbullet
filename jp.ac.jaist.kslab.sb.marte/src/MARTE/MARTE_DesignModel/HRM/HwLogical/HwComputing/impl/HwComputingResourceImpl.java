/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.impl.HwResourceImpl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingResource;

import MARTE.MARTE_Foundations.GRM.ComputingResource;
import MARTE.MARTE_Foundations.GRM.GRMPackage;
import MARTE.MARTE_Foundations.GRM.ProcessingResource;
import MARTE.MARTE_Foundations.GRM.Scheduler;

import MARTE_Library.BasicNFP_Types.NFP_Real;

import MARTE_Library.MARTE_DataTypes.NFP_FrequencyInterval;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingResourceImpl#getSpeedFactor <em>Speed Factor</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingResourceImpl#getMainScheduler <em>Main Scheduler</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwComputingResourceImpl#getOp_Frequencies <em>Op Frequencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwComputingResourceImpl extends HwResourceImpl implements HwComputingResource {
	/**
	 * The cached value of the '{@link #getSpeedFactor() <em>Speed Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected NFP_Real speedFactor;

	/**
	 * The cached value of the '{@link #getMainScheduler() <em>Main Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainScheduler()
	 * @generated
	 * @ordered
	 */
	protected Scheduler mainScheduler;

	/**
	 * The cached value of the '{@link #getOp_Frequencies() <em>Op Frequencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp_Frequencies()
	 * @generated
	 * @ordered
	 */
	protected NFP_FrequencyInterval op_Frequencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwComputingResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwComputingPackage.Literals.HW_COMPUTING_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Real getSpeedFactor() {
		return speedFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeedFactor(NFP_Real newSpeedFactor, NotificationChain msgs) {
		NFP_Real oldSpeedFactor = speedFactor;
		speedFactor = newSpeedFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_COMPUTING_RESOURCE__SPEED_FACTOR, oldSpeedFactor, newSpeedFactor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeedFactor(NFP_Real newSpeedFactor) {
		if (newSpeedFactor != speedFactor) {
			NotificationChain msgs = null;
			if (speedFactor != null)
				msgs = ((InternalEObject)speedFactor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_COMPUTING_RESOURCE__SPEED_FACTOR, null, msgs);
			if (newSpeedFactor != null)
				msgs = ((InternalEObject)newSpeedFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_COMPUTING_RESOURCE__SPEED_FACTOR, null, msgs);
			msgs = basicSetSpeedFactor(newSpeedFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_COMPUTING_RESOURCE__SPEED_FACTOR, newSpeedFactor, newSpeedFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler getMainScheduler() {
		if (mainScheduler != null && mainScheduler.eIsProxy()) {
			InternalEObject oldMainScheduler = (InternalEObject)mainScheduler;
			mainScheduler = (Scheduler)eResolveProxy(oldMainScheduler);
			if (mainScheduler != oldMainScheduler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwComputingPackage.HW_COMPUTING_RESOURCE__MAIN_SCHEDULER, oldMainScheduler, mainScheduler));
			}
		}
		return mainScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler basicGetMainScheduler() {
		return mainScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainScheduler(Scheduler newMainScheduler) {
		Scheduler oldMainScheduler = mainScheduler;
		mainScheduler = newMainScheduler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_COMPUTING_RESOURCE__MAIN_SCHEDULER, oldMainScheduler, mainScheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_FrequencyInterval getOp_Frequencies() {
		return op_Frequencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOp_Frequencies(NFP_FrequencyInterval newOp_Frequencies, NotificationChain msgs) {
		NFP_FrequencyInterval oldOp_Frequencies = op_Frequencies;
		op_Frequencies = newOp_Frequencies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_COMPUTING_RESOURCE__OP_FREQUENCIES, oldOp_Frequencies, newOp_Frequencies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp_Frequencies(NFP_FrequencyInterval newOp_Frequencies) {
		if (newOp_Frequencies != op_Frequencies) {
			NotificationChain msgs = null;
			if (op_Frequencies != null)
				msgs = ((InternalEObject)op_Frequencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_COMPUTING_RESOURCE__OP_FREQUENCIES, null, msgs);
			if (newOp_Frequencies != null)
				msgs = ((InternalEObject)newOp_Frequencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_COMPUTING_RESOURCE__OP_FREQUENCIES, null, msgs);
			msgs = basicSetOp_Frequencies(newOp_Frequencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_COMPUTING_RESOURCE__OP_FREQUENCIES, newOp_Frequencies, newOp_Frequencies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwComputingPackage.HW_COMPUTING_RESOURCE__SPEED_FACTOR:
				return basicSetSpeedFactor(null, msgs);
			case HwComputingPackage.HW_COMPUTING_RESOURCE__OP_FREQUENCIES:
				return basicSetOp_Frequencies(null, msgs);
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
			case HwComputingPackage.HW_COMPUTING_RESOURCE__SPEED_FACTOR:
				return getSpeedFactor();
			case HwComputingPackage.HW_COMPUTING_RESOURCE__MAIN_SCHEDULER:
				if (resolve) return getMainScheduler();
				return basicGetMainScheduler();
			case HwComputingPackage.HW_COMPUTING_RESOURCE__OP_FREQUENCIES:
				return getOp_Frequencies();
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
			case HwComputingPackage.HW_COMPUTING_RESOURCE__SPEED_FACTOR:
				setSpeedFactor((NFP_Real)newValue);
				return;
			case HwComputingPackage.HW_COMPUTING_RESOURCE__MAIN_SCHEDULER:
				setMainScheduler((Scheduler)newValue);
				return;
			case HwComputingPackage.HW_COMPUTING_RESOURCE__OP_FREQUENCIES:
				setOp_Frequencies((NFP_FrequencyInterval)newValue);
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
			case HwComputingPackage.HW_COMPUTING_RESOURCE__SPEED_FACTOR:
				setSpeedFactor((NFP_Real)null);
				return;
			case HwComputingPackage.HW_COMPUTING_RESOURCE__MAIN_SCHEDULER:
				setMainScheduler((Scheduler)null);
				return;
			case HwComputingPackage.HW_COMPUTING_RESOURCE__OP_FREQUENCIES:
				setOp_Frequencies((NFP_FrequencyInterval)null);
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
			case HwComputingPackage.HW_COMPUTING_RESOURCE__SPEED_FACTOR:
				return speedFactor != null;
			case HwComputingPackage.HW_COMPUTING_RESOURCE__MAIN_SCHEDULER:
				return mainScheduler != null;
			case HwComputingPackage.HW_COMPUTING_RESOURCE__OP_FREQUENCIES:
				return op_Frequencies != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ProcessingResource.class) {
			switch (derivedFeatureID) {
				case HwComputingPackage.HW_COMPUTING_RESOURCE__SPEED_FACTOR: return GRMPackage.PROCESSING_RESOURCE__SPEED_FACTOR;
				case HwComputingPackage.HW_COMPUTING_RESOURCE__MAIN_SCHEDULER: return GRMPackage.PROCESSING_RESOURCE__MAIN_SCHEDULER;
				default: return -1;
			}
		}
		if (baseClass == ComputingResource.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == ProcessingResource.class) {
			switch (baseFeatureID) {
				case GRMPackage.PROCESSING_RESOURCE__SPEED_FACTOR: return HwComputingPackage.HW_COMPUTING_RESOURCE__SPEED_FACTOR;
				case GRMPackage.PROCESSING_RESOURCE__MAIN_SCHEDULER: return HwComputingPackage.HW_COMPUTING_RESOURCE__MAIN_SCHEDULER;
				default: return -1;
			}
		}
		if (baseClass == ComputingResource.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //HwComputingResourceImpl
