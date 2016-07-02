/**
 */
package MARTE_Library.GRM_BasicTypes.impl;

import MARTE_Library.GRM_BasicTypes.EDF_Parameters;
import MARTE_Library.GRM_BasicTypes.FixedPriorityParameters;
import MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage;
import MARTE_Library.GRM_BasicTypes.PeriodicServerParameters;
import MARTE_Library.GRM_BasicTypes.PoolingParameters;
import MARTE_Library.GRM_BasicTypes.SchedParameters;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sched Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.impl.SchedParametersImpl#getEdf <em>Edf</em>}</li>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.impl.SchedParametersImpl#getFp <em>Fp</em>}</li>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.impl.SchedParametersImpl#getPooling <em>Pooling</em>}</li>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.impl.SchedParametersImpl#getServer <em>Server</em>}</li>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.impl.SchedParametersImpl#getTableEntry <em>Table Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchedParametersImpl extends EObjectImpl implements SchedParameters {
	/**
	 * The cached value of the '{@link #getEdf() <em>Edf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdf()
	 * @generated
	 * @ordered
	 */
	protected EDF_Parameters edf;

	/**
	 * The cached value of the '{@link #getFp() <em>Fp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFp()
	 * @generated
	 * @ordered
	 */
	protected FixedPriorityParameters fp;

	/**
	 * The cached value of the '{@link #getPooling() <em>Pooling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPooling()
	 * @generated
	 * @ordered
	 */
	protected PoolingParameters pooling;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected PeriodicServerParameters server;

	/**
	 * The cached value of the '{@link #getTableEntry() <em>Table Entry</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> tableEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GRM_BasicTypesPackage.Literals.SCHED_PARAMETERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDF_Parameters getEdf() {
		return edf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdf(EDF_Parameters newEdf, NotificationChain msgs) {
		EDF_Parameters oldEdf = edf;
		edf = newEdf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRM_BasicTypesPackage.SCHED_PARAMETERS__EDF, oldEdf, newEdf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdf(EDF_Parameters newEdf) {
		if (newEdf != edf) {
			NotificationChain msgs = null;
			if (edf != null)
				msgs = ((InternalEObject)edf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GRM_BasicTypesPackage.SCHED_PARAMETERS__EDF, null, msgs);
			if (newEdf != null)
				msgs = ((InternalEObject)newEdf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GRM_BasicTypesPackage.SCHED_PARAMETERS__EDF, null, msgs);
			msgs = basicSetEdf(newEdf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRM_BasicTypesPackage.SCHED_PARAMETERS__EDF, newEdf, newEdf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedPriorityParameters getFp() {
		return fp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFp(FixedPriorityParameters newFp, NotificationChain msgs) {
		FixedPriorityParameters oldFp = fp;
		fp = newFp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRM_BasicTypesPackage.SCHED_PARAMETERS__FP, oldFp, newFp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFp(FixedPriorityParameters newFp) {
		if (newFp != fp) {
			NotificationChain msgs = null;
			if (fp != null)
				msgs = ((InternalEObject)fp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GRM_BasicTypesPackage.SCHED_PARAMETERS__FP, null, msgs);
			if (newFp != null)
				msgs = ((InternalEObject)newFp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GRM_BasicTypesPackage.SCHED_PARAMETERS__FP, null, msgs);
			msgs = basicSetFp(newFp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRM_BasicTypesPackage.SCHED_PARAMETERS__FP, newFp, newFp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoolingParameters getPooling() {
		return pooling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPooling(PoolingParameters newPooling, NotificationChain msgs) {
		PoolingParameters oldPooling = pooling;
		pooling = newPooling;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRM_BasicTypesPackage.SCHED_PARAMETERS__POOLING, oldPooling, newPooling);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPooling(PoolingParameters newPooling) {
		if (newPooling != pooling) {
			NotificationChain msgs = null;
			if (pooling != null)
				msgs = ((InternalEObject)pooling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GRM_BasicTypesPackage.SCHED_PARAMETERS__POOLING, null, msgs);
			if (newPooling != null)
				msgs = ((InternalEObject)newPooling).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GRM_BasicTypesPackage.SCHED_PARAMETERS__POOLING, null, msgs);
			msgs = basicSetPooling(newPooling, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRM_BasicTypesPackage.SCHED_PARAMETERS__POOLING, newPooling, newPooling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicServerParameters getServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServer(PeriodicServerParameters newServer, NotificationChain msgs) {
		PeriodicServerParameters oldServer = server;
		server = newServer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRM_BasicTypesPackage.SCHED_PARAMETERS__SERVER, oldServer, newServer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(PeriodicServerParameters newServer) {
		if (newServer != server) {
			NotificationChain msgs = null;
			if (server != null)
				msgs = ((InternalEObject)server).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GRM_BasicTypesPackage.SCHED_PARAMETERS__SERVER, null, msgs);
			if (newServer != null)
				msgs = ((InternalEObject)newServer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GRM_BasicTypesPackage.SCHED_PARAMETERS__SERVER, null, msgs);
			msgs = basicSetServer(newServer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRM_BasicTypesPackage.SCHED_PARAMETERS__SERVER, newServer, newServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getTableEntry() {
		if (tableEntry == null) {
			tableEntry = new EDataTypeEList<Object>(String.class, this, GRM_BasicTypesPackage.SCHED_PARAMETERS__TABLE_ENTRY);
		}
		return tableEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__EDF:
				return basicSetEdf(null, msgs);
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__FP:
				return basicSetFp(null, msgs);
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__POOLING:
				return basicSetPooling(null, msgs);
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__SERVER:
				return basicSetServer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__EDF:
				return getEdf();
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__FP:
				return getFp();
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__POOLING:
				return getPooling();
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__SERVER:
				return getServer();
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__TABLE_ENTRY:
				return getTableEntry();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__EDF:
				setEdf((EDF_Parameters)newValue);
				return;
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__FP:
				setFp((FixedPriorityParameters)newValue);
				return;
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__POOLING:
				setPooling((PoolingParameters)newValue);
				return;
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__SERVER:
				setServer((PeriodicServerParameters)newValue);
				return;
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__TABLE_ENTRY:
				getTableEntry().clear();
				getTableEntry().addAll((Collection<? extends Object>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__EDF:
				setEdf((EDF_Parameters)null);
				return;
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__FP:
				setFp((FixedPriorityParameters)null);
				return;
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__POOLING:
				setPooling((PoolingParameters)null);
				return;
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__SERVER:
				setServer((PeriodicServerParameters)null);
				return;
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__TABLE_ENTRY:
				getTableEntry().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__EDF:
				return edf != null;
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__FP:
				return fp != null;
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__POOLING:
				return pooling != null;
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__SERVER:
				return server != null;
			case GRM_BasicTypesPackage.SCHED_PARAMETERS__TABLE_ENTRY:
				return tableEntry != null && !tableEntry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tableEntry: ");
		result.append(tableEntry);
		result.append(')');
		return result.toString();
	}

} //SchedParametersImpl
