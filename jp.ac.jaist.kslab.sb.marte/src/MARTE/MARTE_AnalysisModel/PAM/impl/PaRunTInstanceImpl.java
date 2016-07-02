/**
 */
package MARTE.MARTE_AnalysisModel.PAM.impl;

import MARTE.MARTE_AnalysisModel.GQAM.GaExecHost;

import MARTE.MARTE_AnalysisModel.PAM.PAMPackage;
import MARTE.MARTE_AnalysisModel.PAM.PaRunTInstance;

import MARTE.MARTE_Foundations.GRM.SchedulableResource;

import MARTE_Library.BasicNFP_Types.NFP_Frequency;
import MARTE_Library.BasicNFP_Types.NFP_Integer;
import MARTE_Library.BasicNFP_Types.NFP_Real;

import MARTE_Library.MARTE_PrimitivesTypes.MARTE_PrimitivesTypesFactory;
import MARTE_Library.MARTE_PrimitivesTypes.MARTE_PrimitivesTypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pa Run TInstance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.impl.PaRunTInstanceImpl#getPoolSize <em>Pool Size</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.impl.PaRunTInstanceImpl#getUnbddPool <em>Unbdd Pool</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.impl.PaRunTInstanceImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.impl.PaRunTInstanceImpl#getHost <em>Host</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.impl.PaRunTInstanceImpl#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.impl.PaRunTInstanceImpl#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.impl.PaRunTInstanceImpl#getBase_NamedElement <em>Base Named Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaRunTInstanceImpl extends EObjectImpl implements PaRunTInstance {
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
	 * The default value of the '{@link #getUnbddPool() <em>Unbdd Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnbddPool()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean UNBDD_POOL_EDEFAULT = (Boolean)MARTE_PrimitivesTypesFactory.eINSTANCE.createFromString(MARTE_PrimitivesTypesPackage.eINSTANCE.getBoolean(), "false");

	/**
	 * The cached value of the '{@link #getUnbddPool() <em>Unbdd Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnbddPool()
	 * @generated
	 * @ordered
	 */
	protected Boolean unbddPool = UNBDD_POOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected SchedulableResource instance;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected GaExecHost host;

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
	 * The cached value of the '{@link #getBase_NamedElement() <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_NamedElement()
	 * @generated
	 * @ordered
	 */
	protected NamedElement base_NamedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaRunTInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PAMPackage.Literals.PA_RUN_TINSTANCE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PAMPackage.PA_RUN_TINSTANCE__POOL_SIZE, oldPoolSize, newPoolSize);
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
				msgs = ((InternalEObject)poolSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PAMPackage.PA_RUN_TINSTANCE__POOL_SIZE, null, msgs);
			if (newPoolSize != null)
				msgs = ((InternalEObject)newPoolSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PAMPackage.PA_RUN_TINSTANCE__POOL_SIZE, null, msgs);
			msgs = basicSetPoolSize(newPoolSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PAMPackage.PA_RUN_TINSTANCE__POOL_SIZE, newPoolSize, newPoolSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getUnbddPool() {
		return unbddPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnbddPool(Boolean newUnbddPool) {
		Boolean oldUnbddPool = unbddPool;
		unbddPool = newUnbddPool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PAMPackage.PA_RUN_TINSTANCE__UNBDD_POOL, oldUnbddPool, unbddPool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulableResource getInstance() {
		if (instance != null && instance.eIsProxy()) {
			InternalEObject oldInstance = (InternalEObject)instance;
			instance = (SchedulableResource)eResolveProxy(oldInstance);
			if (instance != oldInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PAMPackage.PA_RUN_TINSTANCE__INSTANCE, oldInstance, instance));
			}
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulableResource basicGetInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(SchedulableResource newInstance) {
		SchedulableResource oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PAMPackage.PA_RUN_TINSTANCE__INSTANCE, oldInstance, instance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaExecHost getHost() {
		if (host != null && host.eIsProxy()) {
			InternalEObject oldHost = (InternalEObject)host;
			host = (GaExecHost)eResolveProxy(oldHost);
			if (host != oldHost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PAMPackage.PA_RUN_TINSTANCE__HOST, oldHost, host));
			}
		}
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaExecHost basicGetHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(GaExecHost newHost) {
		GaExecHost oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PAMPackage.PA_RUN_TINSTANCE__HOST, oldHost, host));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PAMPackage.PA_RUN_TINSTANCE__UTILIZATION, oldUtilization, newUtilization);
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
				msgs = ((InternalEObject)utilization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PAMPackage.PA_RUN_TINSTANCE__UTILIZATION, null, msgs);
			if (newUtilization != null)
				msgs = ((InternalEObject)newUtilization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PAMPackage.PA_RUN_TINSTANCE__UTILIZATION, null, msgs);
			msgs = basicSetUtilization(newUtilization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PAMPackage.PA_RUN_TINSTANCE__UTILIZATION, newUtilization, newUtilization));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PAMPackage.PA_RUN_TINSTANCE__THROUGHPUT, oldThroughput, newThroughput);
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
				msgs = ((InternalEObject)throughput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PAMPackage.PA_RUN_TINSTANCE__THROUGHPUT, null, msgs);
			if (newThroughput != null)
				msgs = ((InternalEObject)newThroughput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PAMPackage.PA_RUN_TINSTANCE__THROUGHPUT, null, msgs);
			msgs = basicSetThroughput(newThroughput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PAMPackage.PA_RUN_TINSTANCE__THROUGHPUT, newThroughput, newThroughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getBase_NamedElement() {
		if (base_NamedElement != null && base_NamedElement.eIsProxy()) {
			InternalEObject oldBase_NamedElement = (InternalEObject)base_NamedElement;
			base_NamedElement = (NamedElement)eResolveProxy(oldBase_NamedElement);
			if (base_NamedElement != oldBase_NamedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PAMPackage.PA_RUN_TINSTANCE__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
			}
		}
		return base_NamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetBase_NamedElement() {
		return base_NamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_NamedElement(NamedElement newBase_NamedElement) {
		NamedElement oldBase_NamedElement = base_NamedElement;
		base_NamedElement = newBase_NamedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PAMPackage.PA_RUN_TINSTANCE__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PAMPackage.PA_RUN_TINSTANCE__POOL_SIZE:
				return basicSetPoolSize(null, msgs);
			case PAMPackage.PA_RUN_TINSTANCE__UTILIZATION:
				return basicSetUtilization(null, msgs);
			case PAMPackage.PA_RUN_TINSTANCE__THROUGHPUT:
				return basicSetThroughput(null, msgs);
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
			case PAMPackage.PA_RUN_TINSTANCE__POOL_SIZE:
				return getPoolSize();
			case PAMPackage.PA_RUN_TINSTANCE__UNBDD_POOL:
				return getUnbddPool();
			case PAMPackage.PA_RUN_TINSTANCE__INSTANCE:
				if (resolve) return getInstance();
				return basicGetInstance();
			case PAMPackage.PA_RUN_TINSTANCE__HOST:
				if (resolve) return getHost();
				return basicGetHost();
			case PAMPackage.PA_RUN_TINSTANCE__UTILIZATION:
				return getUtilization();
			case PAMPackage.PA_RUN_TINSTANCE__THROUGHPUT:
				return getThroughput();
			case PAMPackage.PA_RUN_TINSTANCE__BASE_NAMED_ELEMENT:
				if (resolve) return getBase_NamedElement();
				return basicGetBase_NamedElement();
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
			case PAMPackage.PA_RUN_TINSTANCE__POOL_SIZE:
				setPoolSize((NFP_Integer)newValue);
				return;
			case PAMPackage.PA_RUN_TINSTANCE__UNBDD_POOL:
				setUnbddPool((Boolean)newValue);
				return;
			case PAMPackage.PA_RUN_TINSTANCE__INSTANCE:
				setInstance((SchedulableResource)newValue);
				return;
			case PAMPackage.PA_RUN_TINSTANCE__HOST:
				setHost((GaExecHost)newValue);
				return;
			case PAMPackage.PA_RUN_TINSTANCE__UTILIZATION:
				setUtilization((NFP_Real)newValue);
				return;
			case PAMPackage.PA_RUN_TINSTANCE__THROUGHPUT:
				setThroughput((NFP_Frequency)newValue);
				return;
			case PAMPackage.PA_RUN_TINSTANCE__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)newValue);
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
			case PAMPackage.PA_RUN_TINSTANCE__POOL_SIZE:
				setPoolSize((NFP_Integer)null);
				return;
			case PAMPackage.PA_RUN_TINSTANCE__UNBDD_POOL:
				setUnbddPool(UNBDD_POOL_EDEFAULT);
				return;
			case PAMPackage.PA_RUN_TINSTANCE__INSTANCE:
				setInstance((SchedulableResource)null);
				return;
			case PAMPackage.PA_RUN_TINSTANCE__HOST:
				setHost((GaExecHost)null);
				return;
			case PAMPackage.PA_RUN_TINSTANCE__UTILIZATION:
				setUtilization((NFP_Real)null);
				return;
			case PAMPackage.PA_RUN_TINSTANCE__THROUGHPUT:
				setThroughput((NFP_Frequency)null);
				return;
			case PAMPackage.PA_RUN_TINSTANCE__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)null);
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
			case PAMPackage.PA_RUN_TINSTANCE__POOL_SIZE:
				return poolSize != null;
			case PAMPackage.PA_RUN_TINSTANCE__UNBDD_POOL:
				return UNBDD_POOL_EDEFAULT == null ? unbddPool != null : !UNBDD_POOL_EDEFAULT.equals(unbddPool);
			case PAMPackage.PA_RUN_TINSTANCE__INSTANCE:
				return instance != null;
			case PAMPackage.PA_RUN_TINSTANCE__HOST:
				return host != null;
			case PAMPackage.PA_RUN_TINSTANCE__UTILIZATION:
				return utilization != null;
			case PAMPackage.PA_RUN_TINSTANCE__THROUGHPUT:
				return throughput != null;
			case PAMPackage.PA_RUN_TINSTANCE__BASE_NAMED_ELEMENT:
				return base_NamedElement != null;
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
		result.append(" (unbddPool: ");
		result.append(unbddPool);
		result.append(')');
		return result.toString();
	}

} //PaRunTInstanceImpl
