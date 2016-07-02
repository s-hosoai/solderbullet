/**
 */
package MARTE.MARTE_AnalysisModel.PAM.impl;

import MARTE.MARTE_AnalysisModel.GQAM.GaScenario;

import MARTE.MARTE_AnalysisModel.GQAM.impl.GaStepImpl;

import MARTE.MARTE_AnalysisModel.PAM.PAMPackage;
import MARTE.MARTE_AnalysisModel.PAM.PaStep;

import MARTE_Library.BasicNFP_Types.NFP_Boolean;
import MARTE_Library.BasicNFP_Types.NFP_Real;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pa Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.impl.PaStepImpl#getNoSync <em>No Sync</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.impl.PaStepImpl#getExtOpDemand <em>Ext Op Demand</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.impl.PaStepImpl#getExtOpCount <em>Ext Op Count</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.impl.PaStepImpl#getBehavDemand <em>Behav Demand</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.impl.PaStepImpl#getBehavCount <em>Behav Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaStepImpl extends GaStepImpl implements PaStep {
	/**
	 * The cached value of the '{@link #getNoSync() <em>No Sync</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoSync()
	 * @generated
	 * @ordered
	 */
	protected NFP_Boolean noSync;

	/**
	 * The cached value of the '{@link #getExtOpDemand() <em>Ext Op Demand</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtOpDemand()
	 * @generated
	 * @ordered
	 */
	protected EList extOpDemand;

	/**
	 * The cached value of the '{@link #getExtOpCount() <em>Ext Op Count</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtOpCount()
	 * @generated
	 * @ordered
	 */
	protected EList extOpCount;

	/**
	 * The cached value of the '{@link #getBehavDemand() <em>Behav Demand</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavDemand()
	 * @generated
	 * @ordered
	 */
	protected EList behavDemand;

	/**
	 * The cached value of the '{@link #getBehavCount() <em>Behav Count</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavCount()
	 * @generated
	 * @ordered
	 */
	protected EList behavCount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PAMPackage.Literals.PA_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Boolean getNoSync() {
		return noSync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoSync(NFP_Boolean newNoSync, NotificationChain msgs) {
		NFP_Boolean oldNoSync = noSync;
		noSync = newNoSync;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PAMPackage.PA_STEP__NO_SYNC, oldNoSync, newNoSync);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoSync(NFP_Boolean newNoSync) {
		if (newNoSync != noSync) {
			NotificationChain msgs = null;
			if (noSync != null)
				msgs = ((InternalEObject)noSync).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PAMPackage.PA_STEP__NO_SYNC, null, msgs);
			if (newNoSync != null)
				msgs = ((InternalEObject)newNoSync).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PAMPackage.PA_STEP__NO_SYNC, null, msgs);
			msgs = basicSetNoSync(newNoSync, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PAMPackage.PA_STEP__NO_SYNC, newNoSync, newNoSync));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExtOpDemand() {
		if (extOpDemand == null) {
			extOpDemand = new EDataTypeEList(String.class, this, PAMPackage.PA_STEP__EXT_OP_DEMAND);
		}
		return extOpDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExtOpCount() {
		if (extOpCount == null) {
			extOpCount = new EObjectContainmentEList(NFP_Real.class, this, PAMPackage.PA_STEP__EXT_OP_COUNT);
		}
		return extOpCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBehavDemand() {
		if (behavDemand == null) {
			behavDemand = new EObjectResolvingEList(GaScenario.class, this, PAMPackage.PA_STEP__BEHAV_DEMAND);
		}
		return behavDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBehavCount() {
		if (behavCount == null) {
			behavCount = new EObjectContainmentEList(NFP_Real.class, this, PAMPackage.PA_STEP__BEHAV_COUNT);
		}
		return behavCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PAMPackage.PA_STEP__NO_SYNC:
				return basicSetNoSync(null, msgs);
			case PAMPackage.PA_STEP__EXT_OP_COUNT:
				return ((InternalEList)getExtOpCount()).basicRemove(otherEnd, msgs);
			case PAMPackage.PA_STEP__BEHAV_COUNT:
				return ((InternalEList)getBehavCount()).basicRemove(otherEnd, msgs);
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
			case PAMPackage.PA_STEP__NO_SYNC:
				return getNoSync();
			case PAMPackage.PA_STEP__EXT_OP_DEMAND:
				return getExtOpDemand();
			case PAMPackage.PA_STEP__EXT_OP_COUNT:
				return getExtOpCount();
			case PAMPackage.PA_STEP__BEHAV_DEMAND:
				return getBehavDemand();
			case PAMPackage.PA_STEP__BEHAV_COUNT:
				return getBehavCount();
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
			case PAMPackage.PA_STEP__NO_SYNC:
				setNoSync((NFP_Boolean)newValue);
				return;
			case PAMPackage.PA_STEP__EXT_OP_DEMAND:
				getExtOpDemand().clear();
				getExtOpDemand().addAll((Collection)newValue);
				return;
			case PAMPackage.PA_STEP__EXT_OP_COUNT:
				getExtOpCount().clear();
				getExtOpCount().addAll((Collection)newValue);
				return;
			case PAMPackage.PA_STEP__BEHAV_DEMAND:
				getBehavDemand().clear();
				getBehavDemand().addAll((Collection)newValue);
				return;
			case PAMPackage.PA_STEP__BEHAV_COUNT:
				getBehavCount().clear();
				getBehavCount().addAll((Collection)newValue);
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
			case PAMPackage.PA_STEP__NO_SYNC:
				setNoSync((NFP_Boolean)null);
				return;
			case PAMPackage.PA_STEP__EXT_OP_DEMAND:
				getExtOpDemand().clear();
				return;
			case PAMPackage.PA_STEP__EXT_OP_COUNT:
				getExtOpCount().clear();
				return;
			case PAMPackage.PA_STEP__BEHAV_DEMAND:
				getBehavDemand().clear();
				return;
			case PAMPackage.PA_STEP__BEHAV_COUNT:
				getBehavCount().clear();
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
			case PAMPackage.PA_STEP__NO_SYNC:
				return noSync != null;
			case PAMPackage.PA_STEP__EXT_OP_DEMAND:
				return extOpDemand != null && !extOpDemand.isEmpty();
			case PAMPackage.PA_STEP__EXT_OP_COUNT:
				return extOpCount != null && !extOpCount.isEmpty();
			case PAMPackage.PA_STEP__BEHAV_DEMAND:
				return behavDemand != null && !behavDemand.isEmpty();
			case PAMPackage.PA_STEP__BEHAV_COUNT:
				return behavCount != null && !behavCount.isEmpty();
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
		result.append(" (extOpDemand: ");
		result.append(extOpDemand);
		result.append(')');
		return result.toString();
	}

} //PaStepImpl
