/**
 */
package MARTE.MARTE_AnalysisModel.GQAM.impl;

import MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;
import MARTE.MARTE_AnalysisModel.GQAM.GaRelStep;

import MARTE.MARTE_Foundations.GRM.Resource;

import MARTE_Library.BasicNFP_Types.NFP_Integer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ga Rel Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaRelStepImpl#getRelRes <em>Rel Res</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaRelStepImpl#getResUnits <em>Res Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GaRelStepImpl extends GaStepImpl implements GaRelStep {
	/**
	 * The cached value of the '{@link #getRelRes() <em>Rel Res</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelRes()
	 * @generated
	 * @ordered
	 */
	protected Resource relRes;

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
	protected GaRelStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GQAMPackage.Literals.GA_REL_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getRelRes() {
		if (relRes != null && relRes.eIsProxy()) {
			InternalEObject oldRelRes = (InternalEObject)relRes;
			relRes = (Resource)eResolveProxy(oldRelRes);
			if (relRes != oldRelRes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GQAMPackage.GA_REL_STEP__REL_RES, oldRelRes, relRes));
			}
		}
		return relRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetRelRes() {
		return relRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelRes(Resource newRelRes) {
		Resource oldRelRes = relRes;
		relRes = newRelRes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_REL_STEP__REL_RES, oldRelRes, relRes));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_REL_STEP__RES_UNITS, oldResUnits, newResUnits);
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
				msgs = ((InternalEObject)resUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_REL_STEP__RES_UNITS, null, msgs);
			if (newResUnits != null)
				msgs = ((InternalEObject)newResUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_REL_STEP__RES_UNITS, null, msgs);
			msgs = basicSetResUnits(newResUnits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_REL_STEP__RES_UNITS, newResUnits, newResUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GQAMPackage.GA_REL_STEP__RES_UNITS:
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
			case GQAMPackage.GA_REL_STEP__REL_RES:
				if (resolve) return getRelRes();
				return basicGetRelRes();
			case GQAMPackage.GA_REL_STEP__RES_UNITS:
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
			case GQAMPackage.GA_REL_STEP__REL_RES:
				setRelRes((Resource)newValue);
				return;
			case GQAMPackage.GA_REL_STEP__RES_UNITS:
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
			case GQAMPackage.GA_REL_STEP__REL_RES:
				setRelRes((Resource)null);
				return;
			case GQAMPackage.GA_REL_STEP__RES_UNITS:
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
			case GQAMPackage.GA_REL_STEP__REL_RES:
				return relRes != null;
			case GQAMPackage.GA_REL_STEP__RES_UNITS:
				return resUnits != null;
		}
		return super.eIsSet(featureID);
	}

} //GaRelStepImpl
