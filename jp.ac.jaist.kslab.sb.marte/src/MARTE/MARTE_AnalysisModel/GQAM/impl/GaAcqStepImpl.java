/**
 */
package MARTE.MARTE_AnalysisModel.GQAM.impl;

import MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;
import MARTE.MARTE_AnalysisModel.GQAM.GaAcqStep;

import MARTE.MARTE_Foundations.GRM.Resource;

import MARTE_Library.BasicNFP_Types.NFP_Integer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ga Acq Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaAcqStepImpl#getAcqRes <em>Acq Res</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaAcqStepImpl#getResUnits <em>Res Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GaAcqStepImpl extends GaStepImpl implements GaAcqStep {
	/**
	 * The cached value of the '{@link #getAcqRes() <em>Acq Res</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcqRes()
	 * @generated
	 * @ordered
	 */
	protected Resource acqRes;

	/**
	 * The cached value of the '{@link #getResUnits() <em>Res Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResUnits()
	 * @generated
	 * @ordered
	 */
	protected NFP_Integer resUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GaAcqStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GQAMPackage.Literals.GA_ACQ_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getAcqRes() {
		if (acqRes != null && acqRes.eIsProxy()) {
			InternalEObject oldAcqRes = (InternalEObject)acqRes;
			acqRes = (Resource)eResolveProxy(oldAcqRes);
			if (acqRes != oldAcqRes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GQAMPackage.GA_ACQ_STEP__ACQ_RES, oldAcqRes, acqRes));
			}
		}
		return acqRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetAcqRes() {
		return acqRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcqRes(Resource newAcqRes) {
		Resource oldAcqRes = acqRes;
		acqRes = newAcqRes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_ACQ_STEP__ACQ_RES, oldAcqRes, acqRes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Integer getResUnits() {
		return resUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResUnits(NFP_Integer newResUnits, NotificationChain msgs) {
		NFP_Integer oldResUnits = resUnits;
		resUnits = newResUnits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_ACQ_STEP__RES_UNITS, oldResUnits, newResUnits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResUnits(NFP_Integer newResUnits) {
		if (newResUnits != resUnits) {
			NotificationChain msgs = null;
			if (resUnits != null)
				msgs = ((InternalEObject)resUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_ACQ_STEP__RES_UNITS, null, msgs);
			if (newResUnits != null)
				msgs = ((InternalEObject)newResUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_ACQ_STEP__RES_UNITS, null, msgs);
			msgs = basicSetResUnits(newResUnits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_ACQ_STEP__RES_UNITS, newResUnits, newResUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GQAMPackage.GA_ACQ_STEP__RES_UNITS:
				return basicSetResUnits(null, msgs);
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
			case GQAMPackage.GA_ACQ_STEP__ACQ_RES:
				if (resolve) return getAcqRes();
				return basicGetAcqRes();
			case GQAMPackage.GA_ACQ_STEP__RES_UNITS:
				return getResUnits();
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
			case GQAMPackage.GA_ACQ_STEP__ACQ_RES:
				setAcqRes((Resource)newValue);
				return;
			case GQAMPackage.GA_ACQ_STEP__RES_UNITS:
				setResUnits((NFP_Integer)newValue);
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
			case GQAMPackage.GA_ACQ_STEP__ACQ_RES:
				setAcqRes((Resource)null);
				return;
			case GQAMPackage.GA_ACQ_STEP__RES_UNITS:
				setResUnits((NFP_Integer)null);
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
			case GQAMPackage.GA_ACQ_STEP__ACQ_RES:
				return acqRes != null;
			case GQAMPackage.GA_ACQ_STEP__RES_UNITS:
				return resUnits != null;
		}
		return super.eIsSet(featureID);
	}

} //GaAcqStepImpl
