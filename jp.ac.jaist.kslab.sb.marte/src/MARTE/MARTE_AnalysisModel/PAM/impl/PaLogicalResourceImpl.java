/**
 */
package MARTE.MARTE_AnalysisModel.PAM.impl;

import MARTE.MARTE_AnalysisModel.PAM.PAMPackage;
import MARTE.MARTE_AnalysisModel.PAM.PaLogicalResource;

import MARTE.MARTE_Foundations.GRM.impl.ResourceImpl;

import MARTE_Library.BasicNFP_Types.NFP_Frequency;
import MARTE_Library.BasicNFP_Types.NFP_Integer;
import MARTE_Library.BasicNFP_Types.NFP_Real;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pa Logical Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.impl.PaLogicalResourceImpl#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.impl.PaLogicalResourceImpl#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.impl.PaLogicalResourceImpl#getPoolSize <em>Pool Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaLogicalResourceImpl extends ResourceImpl implements PaLogicalResource {
	/**
	 * The cached value of the '{@link #getUtilization() <em>Utilization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilization()
	 * @generated
	 * @ordered
	 */
	protected NFP_Real utilization;

	/**
	 * The cached value of the '{@link #getThroughput() <em>Throughput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected NFP_Frequency throughput;

	/**
	 * The cached value of the '{@link #getPoolSize() <em>Pool Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolSize()
	 * @generated
	 * @ordered
	 */
	protected NFP_Integer poolSize;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaLogicalResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PAMPackage.Literals.PA_LOGICAL_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Real getUtilization() {
		return utilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUtilization(NFP_Real newUtilization, NotificationChain msgs) {
		NFP_Real oldUtilization = utilization;
		utilization = newUtilization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PAMPackage.PA_LOGICAL_RESOURCE__UTILIZATION, oldUtilization, newUtilization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilization(NFP_Real newUtilization) {
		if (newUtilization != utilization) {
			NotificationChain msgs = null;
			if (utilization != null)
				msgs = ((InternalEObject)utilization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PAMPackage.PA_LOGICAL_RESOURCE__UTILIZATION, null, msgs);
			if (newUtilization != null)
				msgs = ((InternalEObject)newUtilization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PAMPackage.PA_LOGICAL_RESOURCE__UTILIZATION, null, msgs);
			msgs = basicSetUtilization(newUtilization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PAMPackage.PA_LOGICAL_RESOURCE__UTILIZATION, newUtilization, newUtilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Frequency getThroughput() {
		return throughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThroughput(NFP_Frequency newThroughput, NotificationChain msgs) {
		NFP_Frequency oldThroughput = throughput;
		throughput = newThroughput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PAMPackage.PA_LOGICAL_RESOURCE__THROUGHPUT, oldThroughput, newThroughput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughput(NFP_Frequency newThroughput) {
		if (newThroughput != throughput) {
			NotificationChain msgs = null;
			if (throughput != null)
				msgs = ((InternalEObject)throughput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PAMPackage.PA_LOGICAL_RESOURCE__THROUGHPUT, null, msgs);
			if (newThroughput != null)
				msgs = ((InternalEObject)newThroughput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PAMPackage.PA_LOGICAL_RESOURCE__THROUGHPUT, null, msgs);
			msgs = basicSetThroughput(newThroughput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PAMPackage.PA_LOGICAL_RESOURCE__THROUGHPUT, newThroughput, newThroughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Integer getPoolSize() {
		return poolSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoolSize(NFP_Integer newPoolSize, NotificationChain msgs) {
		NFP_Integer oldPoolSize = poolSize;
		poolSize = newPoolSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PAMPackage.PA_LOGICAL_RESOURCE__POOL_SIZE, oldPoolSize, newPoolSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoolSize(NFP_Integer newPoolSize) {
		if (newPoolSize != poolSize) {
			NotificationChain msgs = null;
			if (poolSize != null)
				msgs = ((InternalEObject)poolSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PAMPackage.PA_LOGICAL_RESOURCE__POOL_SIZE, null, msgs);
			if (newPoolSize != null)
				msgs = ((InternalEObject)newPoolSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PAMPackage.PA_LOGICAL_RESOURCE__POOL_SIZE, null, msgs);
			msgs = basicSetPoolSize(newPoolSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PAMPackage.PA_LOGICAL_RESOURCE__POOL_SIZE, newPoolSize, newPoolSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PAMPackage.PA_LOGICAL_RESOURCE__UTILIZATION:
				return basicSetUtilization(null, msgs);
			case PAMPackage.PA_LOGICAL_RESOURCE__THROUGHPUT:
				return basicSetThroughput(null, msgs);
			case PAMPackage.PA_LOGICAL_RESOURCE__POOL_SIZE:
				return basicSetPoolSize(null, msgs);
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
			case PAMPackage.PA_LOGICAL_RESOURCE__UTILIZATION:
				return getUtilization();
			case PAMPackage.PA_LOGICAL_RESOURCE__THROUGHPUT:
				return getThroughput();
			case PAMPackage.PA_LOGICAL_RESOURCE__POOL_SIZE:
				return getPoolSize();
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
			case PAMPackage.PA_LOGICAL_RESOURCE__UTILIZATION:
				setUtilization((NFP_Real)newValue);
				return;
			case PAMPackage.PA_LOGICAL_RESOURCE__THROUGHPUT:
				setThroughput((NFP_Frequency)newValue);
				return;
			case PAMPackage.PA_LOGICAL_RESOURCE__POOL_SIZE:
				setPoolSize((NFP_Integer)newValue);
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
			case PAMPackage.PA_LOGICAL_RESOURCE__UTILIZATION:
				setUtilization((NFP_Real)null);
				return;
			case PAMPackage.PA_LOGICAL_RESOURCE__THROUGHPUT:
				setThroughput((NFP_Frequency)null);
				return;
			case PAMPackage.PA_LOGICAL_RESOURCE__POOL_SIZE:
				setPoolSize((NFP_Integer)null);
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
			case PAMPackage.PA_LOGICAL_RESOURCE__UTILIZATION:
				return utilization != null;
			case PAMPackage.PA_LOGICAL_RESOURCE__THROUGHPUT:
				return throughput != null;
			case PAMPackage.PA_LOGICAL_RESOURCE__POOL_SIZE:
				return poolSize != null;
		}
		return super.eIsSet(featureID);
	}

} //PaLogicalResourceImpl
