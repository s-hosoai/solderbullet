/**
 */
package MARTE.MARTE_Foundations.GRM.impl;

import MARTE.MARTE_Foundations.GRM.GRMPackage;
import MARTE.MARTE_Foundations.GRM.ProcessingResource;
import MARTE.MARTE_Foundations.GRM.Scheduler;

import MARTE_Library.BasicNFP_Types.NFP_Real;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.ProcessingResourceImpl#getSpeedFactor <em>Speed Factor</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.ProcessingResourceImpl#getMainScheduler <em>Main Scheduler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessingResourceImpl extends ResourceImpl implements ProcessingResource {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GRMPackage.Literals.PROCESSING_RESOURCE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRMPackage.PROCESSING_RESOURCE__SPEED_FACTOR, oldSpeedFactor, newSpeedFactor);
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
				msgs = ((InternalEObject)speedFactor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GRMPackage.PROCESSING_RESOURCE__SPEED_FACTOR, null, msgs);
			if (newSpeedFactor != null)
				msgs = ((InternalEObject)newSpeedFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GRMPackage.PROCESSING_RESOURCE__SPEED_FACTOR, null, msgs);
			msgs = basicSetSpeedFactor(newSpeedFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRMPackage.PROCESSING_RESOURCE__SPEED_FACTOR, newSpeedFactor, newSpeedFactor));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRMPackage.PROCESSING_RESOURCE__MAIN_SCHEDULER, oldMainScheduler, mainScheduler));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GRMPackage.PROCESSING_RESOURCE__MAIN_SCHEDULER, oldMainScheduler, mainScheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRMPackage.PROCESSING_RESOURCE__SPEED_FACTOR:
				return basicSetSpeedFactor(null, msgs);
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
			case GRMPackage.PROCESSING_RESOURCE__SPEED_FACTOR:
				return getSpeedFactor();
			case GRMPackage.PROCESSING_RESOURCE__MAIN_SCHEDULER:
				if (resolve) return getMainScheduler();
				return basicGetMainScheduler();
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
			case GRMPackage.PROCESSING_RESOURCE__SPEED_FACTOR:
				setSpeedFactor((NFP_Real)newValue);
				return;
			case GRMPackage.PROCESSING_RESOURCE__MAIN_SCHEDULER:
				setMainScheduler((Scheduler)newValue);
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
			case GRMPackage.PROCESSING_RESOURCE__SPEED_FACTOR:
				setSpeedFactor((NFP_Real)null);
				return;
			case GRMPackage.PROCESSING_RESOURCE__MAIN_SCHEDULER:
				setMainScheduler((Scheduler)null);
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
			case GRMPackage.PROCESSING_RESOURCE__SPEED_FACTOR:
				return speedFactor != null;
			case GRMPackage.PROCESSING_RESOURCE__MAIN_SCHEDULER:
				return mainScheduler != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessingResourceImpl
