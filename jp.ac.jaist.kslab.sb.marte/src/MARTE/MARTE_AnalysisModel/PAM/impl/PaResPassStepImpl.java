/**
 */
package MARTE.MARTE_AnalysisModel.PAM.impl;

import MARTE.MARTE_AnalysisModel.GQAM.impl.GaStepImpl;

import MARTE.MARTE_AnalysisModel.PAM.PAMPackage;
import MARTE.MARTE_AnalysisModel.PAM.PaResPassStep;

import MARTE.MARTE_Foundations.GRM.Resource;

import MARTE_Library.BasicNFP_Types.NFP_Integer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pa Res Pass Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.impl.PaResPassStepImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.impl.PaResPassStepImpl#getResUnits <em>Res Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaResPassStepImpl extends GaStepImpl implements PaResPassStep {
	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource;

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
	protected PaResPassStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PAMPackage.Literals.PA_RES_PASS_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Resource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PAMPackage.PA_RES_PASS_STEP__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PAMPackage.PA_RES_PASS_STEP__RESOURCE, oldResource, resource));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PAMPackage.PA_RES_PASS_STEP__RES_UNITS, oldResUnits, newResUnits);
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
				msgs = ((InternalEObject)resUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PAMPackage.PA_RES_PASS_STEP__RES_UNITS, null, msgs);
			if (newResUnits != null)
				msgs = ((InternalEObject)newResUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PAMPackage.PA_RES_PASS_STEP__RES_UNITS, null, msgs);
			msgs = basicSetResUnits(newResUnits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PAMPackage.PA_RES_PASS_STEP__RES_UNITS, newResUnits, newResUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PAMPackage.PA_RES_PASS_STEP__RES_UNITS:
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
			case PAMPackage.PA_RES_PASS_STEP__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case PAMPackage.PA_RES_PASS_STEP__RES_UNITS:
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
			case PAMPackage.PA_RES_PASS_STEP__RESOURCE:
				setResource((Resource)newValue);
				return;
			case PAMPackage.PA_RES_PASS_STEP__RES_UNITS:
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
			case PAMPackage.PA_RES_PASS_STEP__RESOURCE:
				setResource((Resource)null);
				return;
			case PAMPackage.PA_RES_PASS_STEP__RES_UNITS:
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
			case PAMPackage.PA_RES_PASS_STEP__RESOURCE:
				return resource != null;
			case PAMPackage.PA_RES_PASS_STEP__RES_UNITS:
				return resUnits != null;
		}
		return super.eIsSet(featureID);
	}

} //PaResPassStepImpl
