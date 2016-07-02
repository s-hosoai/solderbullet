/**
 */
package MARTE.MARTE_AnalysisModel.GQAM.impl;

import MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;
import MARTE.MARTE_AnalysisModel.GQAM.GaLatencyObs;

import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Real;

import MARTE_Library.MARTE_DataTypes.UtilityType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ga Latency Obs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaLatencyObsImpl#getLatency <em>Latency</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaLatencyObsImpl#getMiss <em>Miss</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaLatencyObsImpl#getUtility <em>Utility</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaLatencyObsImpl#getMaxJitter <em>Max Jitter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GaLatencyObsImpl extends GaTimedObsImpl implements GaLatencyObs {
	/**
	 * The cached value of the '{@link #getLatency() <em>Latency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected EList latency;

	/**
	 * The cached value of the '{@link #getMiss() <em>Miss</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiss()
	 * @generated
	 * @ordered
	 */
	protected EList miss;

	/**
	 * The cached value of the '{@link #getUtility() <em>Utility</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtility()
	 * @generated
	 * @ordered
	 */
	protected EList utility;

	/**
	 * The cached value of the '{@link #getMaxJitter() <em>Max Jitter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxJitter()
	 * @generated
	 * @ordered
	 */
	protected EList maxJitter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GaLatencyObsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GQAMPackage.Literals.GA_LATENCY_OBS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLatency() {
		if (latency == null) {
			latency = new EObjectContainmentEList(NFP_Duration.class, this, GQAMPackage.GA_LATENCY_OBS__LATENCY);
		}
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMiss() {
		if (miss == null) {
			miss = new EObjectContainmentEList(NFP_Real.class, this, GQAMPackage.GA_LATENCY_OBS__MISS);
		}
		return miss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUtility() {
		if (utility == null) {
			utility = new EObjectContainmentEList(UtilityType.class, this, GQAMPackage.GA_LATENCY_OBS__UTILITY);
		}
		return utility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMaxJitter() {
		if (maxJitter == null) {
			maxJitter = new EObjectContainmentEList(NFP_Duration.class, this, GQAMPackage.GA_LATENCY_OBS__MAX_JITTER);
		}
		return maxJitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GQAMPackage.GA_LATENCY_OBS__LATENCY:
				return ((InternalEList)getLatency()).basicRemove(otherEnd, msgs);
			case GQAMPackage.GA_LATENCY_OBS__MISS:
				return ((InternalEList)getMiss()).basicRemove(otherEnd, msgs);
			case GQAMPackage.GA_LATENCY_OBS__UTILITY:
				return ((InternalEList)getUtility()).basicRemove(otherEnd, msgs);
			case GQAMPackage.GA_LATENCY_OBS__MAX_JITTER:
				return ((InternalEList)getMaxJitter()).basicRemove(otherEnd, msgs);
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
			case GQAMPackage.GA_LATENCY_OBS__LATENCY:
				return getLatency();
			case GQAMPackage.GA_LATENCY_OBS__MISS:
				return getMiss();
			case GQAMPackage.GA_LATENCY_OBS__UTILITY:
				return getUtility();
			case GQAMPackage.GA_LATENCY_OBS__MAX_JITTER:
				return getMaxJitter();
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
			case GQAMPackage.GA_LATENCY_OBS__LATENCY:
				getLatency().clear();
				getLatency().addAll((Collection)newValue);
				return;
			case GQAMPackage.GA_LATENCY_OBS__MISS:
				getMiss().clear();
				getMiss().addAll((Collection)newValue);
				return;
			case GQAMPackage.GA_LATENCY_OBS__UTILITY:
				getUtility().clear();
				getUtility().addAll((Collection)newValue);
				return;
			case GQAMPackage.GA_LATENCY_OBS__MAX_JITTER:
				getMaxJitter().clear();
				getMaxJitter().addAll((Collection)newValue);
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
			case GQAMPackage.GA_LATENCY_OBS__LATENCY:
				getLatency().clear();
				return;
			case GQAMPackage.GA_LATENCY_OBS__MISS:
				getMiss().clear();
				return;
			case GQAMPackage.GA_LATENCY_OBS__UTILITY:
				getUtility().clear();
				return;
			case GQAMPackage.GA_LATENCY_OBS__MAX_JITTER:
				getMaxJitter().clear();
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
			case GQAMPackage.GA_LATENCY_OBS__LATENCY:
				return latency != null && !latency.isEmpty();
			case GQAMPackage.GA_LATENCY_OBS__MISS:
				return miss != null && !miss.isEmpty();
			case GQAMPackage.GA_LATENCY_OBS__UTILITY:
				return utility != null && !utility.isEmpty();
			case GQAMPackage.GA_LATENCY_OBS__MAX_JITTER:
				return maxJitter != null && !maxJitter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GaLatencyObsImpl
