/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwBranchPredictor;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwMMU;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;
import MARTE_Library.BasicNFP_Types.NFP_Natural;
import MARTE_Library.BasicNFP_Types.NFP_Real;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwProcessorImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwProcessorImpl#getMips <em>Mips</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwProcessorImpl#getIpc <em>Ipc</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwProcessorImpl#getNbCores <em>Nb Cores</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwProcessorImpl#getNbPipelines <em>Nb Pipelines</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwProcessorImpl#getNbStages <em>Nb Stages</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwProcessorImpl#getNbALUs <em>Nb AL Us</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwProcessorImpl#getNbFPUs <em>Nb FP Us</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwProcessorImpl#getOwnedISAs <em>Owned IS As</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwProcessorImpl#getPredictors <em>Predictors</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwProcessorImpl#getCaches <em>Caches</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwProcessorImpl#getOwnedMMUs <em>Owned MM Us</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwProcessorImpl extends HwComputingResourceImpl implements HwProcessor {
	/**
	 * The cached value of the '{@link #getMips() <em>Mips</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMips()
	 * @generated
	 * @ordered
	 */
	protected NFP_Natural mips;

	/**
	 * The cached value of the '{@link #getNbCores() <em>Nb Cores</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbCores()
	 * @generated
	 * @ordered
	 */
	protected NFP_Natural nbCores;

	/**
	 * The cached value of the '{@link #getNbPipelines() <em>Nb Pipelines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbPipelines()
	 * @generated
	 * @ordered
	 */
	protected NFP_Natural nbPipelines;

	/**
	 * The cached value of the '{@link #getNbStages() <em>Nb Stages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbStages()
	 * @generated
	 * @ordered
	 */
	protected NFP_Natural nbStages;

	/**
	 * The cached value of the '{@link #getNbALUs() <em>Nb AL Us</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbALUs()
	 * @generated
	 * @ordered
	 */
	protected NFP_Natural nbALUs;

	/**
	 * The cached value of the '{@link #getNbFPUs() <em>Nb FP Us</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbFPUs()
	 * @generated
	 * @ordered
	 */
	protected NFP_Natural nbFPUs;

	/**
	 * The cached value of the '{@link #getOwnedISAs() <em>Owned IS As</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedISAs()
	 * @generated
	 * @ordered
	 */
	protected EList ownedISAs;

	/**
	 * The cached value of the '{@link #getPredictors() <em>Predictors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredictors()
	 * @generated
	 * @ordered
	 */
	protected EList predictors;

	/**
	 * The cached value of the '{@link #getCaches() <em>Caches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaches()
	 * @generated
	 * @ordered
	 */
	protected EList caches;

	/**
	 * The cached value of the '{@link #getOwnedMMUs() <em>Owned MM Us</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMMUs()
	 * @generated
	 * @ordered
	 */
	protected EList ownedMMUs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwComputingPackage.Literals.HW_PROCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataSize getArchitecture() {
		NFP_DataSize architecture = basicGetArchitecture();
		return architecture != null && architecture.eIsProxy() ? (NFP_DataSize)eResolveProxy((InternalEObject)architecture) : architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataSize basicGetArchitecture() {
		// TODO: implement this method to return the 'Architecture' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecture(NFP_DataSize newArchitecture) {
		// TODO: implement this method to set the 'Architecture' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Natural getMips() {
		return mips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMips(NFP_Natural newMips, NotificationChain msgs) {
		NFP_Natural oldMips = mips;
		mips = newMips;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_PROCESSOR__MIPS, oldMips, newMips);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMips(NFP_Natural newMips) {
		if (newMips != mips) {
			NotificationChain msgs = null;
			if (mips != null)
				msgs = ((InternalEObject)mips).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_PROCESSOR__MIPS, null, msgs);
			if (newMips != null)
				msgs = ((InternalEObject)newMips).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_PROCESSOR__MIPS, null, msgs);
			msgs = basicSetMips(newMips, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_PROCESSOR__MIPS, newMips, newMips));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Real getIpc() {
		NFP_Real ipc = basicGetIpc();
		return ipc != null && ipc.eIsProxy() ? (NFP_Real)eResolveProxy((InternalEObject)ipc) : ipc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Real basicGetIpc() {
		// TODO: implement this method to return the 'Ipc' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpc(NFP_Real newIpc) {
		// TODO: implement this method to set the 'Ipc' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Natural getNbCores() {
		return nbCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNbCores(NFP_Natural newNbCores, NotificationChain msgs) {
		NFP_Natural oldNbCores = nbCores;
		nbCores = newNbCores;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_PROCESSOR__NB_CORES, oldNbCores, newNbCores);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbCores(NFP_Natural newNbCores) {
		if (newNbCores != nbCores) {
			NotificationChain msgs = null;
			if (nbCores != null)
				msgs = ((InternalEObject)nbCores).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_PROCESSOR__NB_CORES, null, msgs);
			if (newNbCores != null)
				msgs = ((InternalEObject)newNbCores).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_PROCESSOR__NB_CORES, null, msgs);
			msgs = basicSetNbCores(newNbCores, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_PROCESSOR__NB_CORES, newNbCores, newNbCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Natural getNbPipelines() {
		return nbPipelines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNbPipelines(NFP_Natural newNbPipelines, NotificationChain msgs) {
		NFP_Natural oldNbPipelines = nbPipelines;
		nbPipelines = newNbPipelines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_PROCESSOR__NB_PIPELINES, oldNbPipelines, newNbPipelines);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbPipelines(NFP_Natural newNbPipelines) {
		if (newNbPipelines != nbPipelines) {
			NotificationChain msgs = null;
			if (nbPipelines != null)
				msgs = ((InternalEObject)nbPipelines).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_PROCESSOR__NB_PIPELINES, null, msgs);
			if (newNbPipelines != null)
				msgs = ((InternalEObject)newNbPipelines).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_PROCESSOR__NB_PIPELINES, null, msgs);
			msgs = basicSetNbPipelines(newNbPipelines, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_PROCESSOR__NB_PIPELINES, newNbPipelines, newNbPipelines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Natural getNbStages() {
		return nbStages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNbStages(NFP_Natural newNbStages, NotificationChain msgs) {
		NFP_Natural oldNbStages = nbStages;
		nbStages = newNbStages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_PROCESSOR__NB_STAGES, oldNbStages, newNbStages);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbStages(NFP_Natural newNbStages) {
		if (newNbStages != nbStages) {
			NotificationChain msgs = null;
			if (nbStages != null)
				msgs = ((InternalEObject)nbStages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_PROCESSOR__NB_STAGES, null, msgs);
			if (newNbStages != null)
				msgs = ((InternalEObject)newNbStages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_PROCESSOR__NB_STAGES, null, msgs);
			msgs = basicSetNbStages(newNbStages, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_PROCESSOR__NB_STAGES, newNbStages, newNbStages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Natural getNbALUs() {
		return nbALUs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNbALUs(NFP_Natural newNbALUs, NotificationChain msgs) {
		NFP_Natural oldNbALUs = nbALUs;
		nbALUs = newNbALUs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_PROCESSOR__NB_AL_US, oldNbALUs, newNbALUs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbALUs(NFP_Natural newNbALUs) {
		if (newNbALUs != nbALUs) {
			NotificationChain msgs = null;
			if (nbALUs != null)
				msgs = ((InternalEObject)nbALUs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_PROCESSOR__NB_AL_US, null, msgs);
			if (newNbALUs != null)
				msgs = ((InternalEObject)newNbALUs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_PROCESSOR__NB_AL_US, null, msgs);
			msgs = basicSetNbALUs(newNbALUs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_PROCESSOR__NB_AL_US, newNbALUs, newNbALUs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Natural getNbFPUs() {
		return nbFPUs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNbFPUs(NFP_Natural newNbFPUs, NotificationChain msgs) {
		NFP_Natural oldNbFPUs = nbFPUs;
		nbFPUs = newNbFPUs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_PROCESSOR__NB_FP_US, oldNbFPUs, newNbFPUs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbFPUs(NFP_Natural newNbFPUs) {
		if (newNbFPUs != nbFPUs) {
			NotificationChain msgs = null;
			if (nbFPUs != null)
				msgs = ((InternalEObject)nbFPUs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_PROCESSOR__NB_FP_US, null, msgs);
			if (newNbFPUs != null)
				msgs = ((InternalEObject)newNbFPUs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_PROCESSOR__NB_FP_US, null, msgs);
			msgs = basicSetNbFPUs(newNbFPUs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_PROCESSOR__NB_FP_US, newNbFPUs, newNbFPUs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedISAs() {
		if (ownedISAs == null) {
			ownedISAs = new EObjectContainmentEList(HwISA.class, this, HwComputingPackage.HW_PROCESSOR__OWNED_IS_AS);
		}
		return ownedISAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPredictors() {
		if (predictors == null) {
			predictors = new EObjectContainmentEList(HwBranchPredictor.class, this, HwComputingPackage.HW_PROCESSOR__PREDICTORS);
		}
		return predictors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCaches() {
		if (caches == null) {
			caches = new EObjectContainmentEList(HwCache.class, this, HwComputingPackage.HW_PROCESSOR__CACHES);
		}
		return caches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMMUs() {
		if (ownedMMUs == null) {
			ownedMMUs = new EObjectContainmentEList(HwMMU.class, this, HwComputingPackage.HW_PROCESSOR__OWNED_MM_US);
		}
		return ownedMMUs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwComputingPackage.HW_PROCESSOR__MIPS:
				return basicSetMips(null, msgs);
			case HwComputingPackage.HW_PROCESSOR__NB_CORES:
				return basicSetNbCores(null, msgs);
			case HwComputingPackage.HW_PROCESSOR__NB_PIPELINES:
				return basicSetNbPipelines(null, msgs);
			case HwComputingPackage.HW_PROCESSOR__NB_STAGES:
				return basicSetNbStages(null, msgs);
			case HwComputingPackage.HW_PROCESSOR__NB_AL_US:
				return basicSetNbALUs(null, msgs);
			case HwComputingPackage.HW_PROCESSOR__NB_FP_US:
				return basicSetNbFPUs(null, msgs);
			case HwComputingPackage.HW_PROCESSOR__OWNED_IS_AS:
				return ((InternalEList)getOwnedISAs()).basicRemove(otherEnd, msgs);
			case HwComputingPackage.HW_PROCESSOR__PREDICTORS:
				return ((InternalEList)getPredictors()).basicRemove(otherEnd, msgs);
			case HwComputingPackage.HW_PROCESSOR__CACHES:
				return ((InternalEList)getCaches()).basicRemove(otherEnd, msgs);
			case HwComputingPackage.HW_PROCESSOR__OWNED_MM_US:
				return ((InternalEList)getOwnedMMUs()).basicRemove(otherEnd, msgs);
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
			case HwComputingPackage.HW_PROCESSOR__ARCHITECTURE:
				if (resolve) return getArchitecture();
				return basicGetArchitecture();
			case HwComputingPackage.HW_PROCESSOR__MIPS:
				return getMips();
			case HwComputingPackage.HW_PROCESSOR__IPC:
				if (resolve) return getIpc();
				return basicGetIpc();
			case HwComputingPackage.HW_PROCESSOR__NB_CORES:
				return getNbCores();
			case HwComputingPackage.HW_PROCESSOR__NB_PIPELINES:
				return getNbPipelines();
			case HwComputingPackage.HW_PROCESSOR__NB_STAGES:
				return getNbStages();
			case HwComputingPackage.HW_PROCESSOR__NB_AL_US:
				return getNbALUs();
			case HwComputingPackage.HW_PROCESSOR__NB_FP_US:
				return getNbFPUs();
			case HwComputingPackage.HW_PROCESSOR__OWNED_IS_AS:
				return getOwnedISAs();
			case HwComputingPackage.HW_PROCESSOR__PREDICTORS:
				return getPredictors();
			case HwComputingPackage.HW_PROCESSOR__CACHES:
				return getCaches();
			case HwComputingPackage.HW_PROCESSOR__OWNED_MM_US:
				return getOwnedMMUs();
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
			case HwComputingPackage.HW_PROCESSOR__ARCHITECTURE:
				setArchitecture((NFP_DataSize)newValue);
				return;
			case HwComputingPackage.HW_PROCESSOR__MIPS:
				setMips((NFP_Natural)newValue);
				return;
			case HwComputingPackage.HW_PROCESSOR__IPC:
				setIpc((NFP_Real)newValue);
				return;
			case HwComputingPackage.HW_PROCESSOR__NB_CORES:
				setNbCores((NFP_Natural)newValue);
				return;
			case HwComputingPackage.HW_PROCESSOR__NB_PIPELINES:
				setNbPipelines((NFP_Natural)newValue);
				return;
			case HwComputingPackage.HW_PROCESSOR__NB_STAGES:
				setNbStages((NFP_Natural)newValue);
				return;
			case HwComputingPackage.HW_PROCESSOR__NB_AL_US:
				setNbALUs((NFP_Natural)newValue);
				return;
			case HwComputingPackage.HW_PROCESSOR__NB_FP_US:
				setNbFPUs((NFP_Natural)newValue);
				return;
			case HwComputingPackage.HW_PROCESSOR__OWNED_IS_AS:
				getOwnedISAs().clear();
				getOwnedISAs().addAll((Collection)newValue);
				return;
			case HwComputingPackage.HW_PROCESSOR__PREDICTORS:
				getPredictors().clear();
				getPredictors().addAll((Collection)newValue);
				return;
			case HwComputingPackage.HW_PROCESSOR__CACHES:
				getCaches().clear();
				getCaches().addAll((Collection)newValue);
				return;
			case HwComputingPackage.HW_PROCESSOR__OWNED_MM_US:
				getOwnedMMUs().clear();
				getOwnedMMUs().addAll((Collection)newValue);
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
			case HwComputingPackage.HW_PROCESSOR__ARCHITECTURE:
				setArchitecture((NFP_DataSize)null);
				return;
			case HwComputingPackage.HW_PROCESSOR__MIPS:
				setMips((NFP_Natural)null);
				return;
			case HwComputingPackage.HW_PROCESSOR__IPC:
				setIpc((NFP_Real)null);
				return;
			case HwComputingPackage.HW_PROCESSOR__NB_CORES:
				setNbCores((NFP_Natural)null);
				return;
			case HwComputingPackage.HW_PROCESSOR__NB_PIPELINES:
				setNbPipelines((NFP_Natural)null);
				return;
			case HwComputingPackage.HW_PROCESSOR__NB_STAGES:
				setNbStages((NFP_Natural)null);
				return;
			case HwComputingPackage.HW_PROCESSOR__NB_AL_US:
				setNbALUs((NFP_Natural)null);
				return;
			case HwComputingPackage.HW_PROCESSOR__NB_FP_US:
				setNbFPUs((NFP_Natural)null);
				return;
			case HwComputingPackage.HW_PROCESSOR__OWNED_IS_AS:
				getOwnedISAs().clear();
				return;
			case HwComputingPackage.HW_PROCESSOR__PREDICTORS:
				getPredictors().clear();
				return;
			case HwComputingPackage.HW_PROCESSOR__CACHES:
				getCaches().clear();
				return;
			case HwComputingPackage.HW_PROCESSOR__OWNED_MM_US:
				getOwnedMMUs().clear();
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
			case HwComputingPackage.HW_PROCESSOR__ARCHITECTURE:
				return basicGetArchitecture() != null;
			case HwComputingPackage.HW_PROCESSOR__MIPS:
				return mips != null;
			case HwComputingPackage.HW_PROCESSOR__IPC:
				return basicGetIpc() != null;
			case HwComputingPackage.HW_PROCESSOR__NB_CORES:
				return nbCores != null;
			case HwComputingPackage.HW_PROCESSOR__NB_PIPELINES:
				return nbPipelines != null;
			case HwComputingPackage.HW_PROCESSOR__NB_STAGES:
				return nbStages != null;
			case HwComputingPackage.HW_PROCESSOR__NB_AL_US:
				return nbALUs != null;
			case HwComputingPackage.HW_PROCESSOR__NB_FP_US:
				return nbFPUs != null;
			case HwComputingPackage.HW_PROCESSOR__OWNED_IS_AS:
				return ownedISAs != null && !ownedISAs.isEmpty();
			case HwComputingPackage.HW_PROCESSOR__PREDICTORS:
				return predictors != null && !predictors.isEmpty();
			case HwComputingPackage.HW_PROCESSOR__CACHES:
				return caches != null && !caches.isEmpty();
			case HwComputingPackage.HW_PROCESSOR__OWNED_MM_US:
				return ownedMMUs != null && !ownedMMUs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HwProcessorImpl
