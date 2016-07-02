/**
 */
package MARTE.MARTE_AnalysisModel.SAM.impl;

import MARTE.MARTE_AnalysisModel.GQAM.impl.GaAnalysisContextImpl;

import MARTE.MARTE_AnalysisModel.SAM.OptimallityCriterionKind;
import MARTE.MARTE_AnalysisModel.SAM.SAMPackage;
import MARTE.MARTE_AnalysisModel.SAM.SaAnalysisContext;

import MARTE_Library.BasicNFP_Types.NFP_Boolean;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sa Analysis Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaAnalysisContextImpl#getIsSched <em>Is Sched</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaAnalysisContextImpl#getOptCriterion <em>Opt Criterion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SaAnalysisContextImpl extends GaAnalysisContextImpl implements SaAnalysisContext {
	/**
	 * The cached value of the '{@link #getIsSched() <em>Is Sched</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSched()
	 * @generated
	 * @ordered
	 */
	protected NFP_Boolean isSched;

	/**
	 * The default value of the '{@link #getOptCriterion() <em>Opt Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptCriterion()
	 * @generated
	 * @ordered
	 */
	protected static final OptimallityCriterionKind OPT_CRITERION_EDEFAULT = OptimallityCriterionKind.MEET_HARD_DEADLINES_LITERAL;

	/**
	 * The cached value of the '{@link #getOptCriterion() <em>Opt Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptCriterion()
	 * @generated
	 * @ordered
	 */
	protected OptimallityCriterionKind optCriterion = OPT_CRITERION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaAnalysisContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SAMPackage.Literals.SA_ANALYSIS_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Boolean getIsSched() {
		return isSched;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsSched(NFP_Boolean newIsSched, NotificationChain msgs) {
		NFP_Boolean oldIsSched = isSched;
		isSched = newIsSched;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_ANALYSIS_CONTEXT__IS_SCHED, oldIsSched, newIsSched);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSched(NFP_Boolean newIsSched) {
		if (newIsSched != isSched) {
			NotificationChain msgs = null;
			if (isSched != null)
				msgs = ((InternalEObject)isSched).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_ANALYSIS_CONTEXT__IS_SCHED, null, msgs);
			if (newIsSched != null)
				msgs = ((InternalEObject)newIsSched).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_ANALYSIS_CONTEXT__IS_SCHED, null, msgs);
			msgs = basicSetIsSched(newIsSched, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_ANALYSIS_CONTEXT__IS_SCHED, newIsSched, newIsSched));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimallityCriterionKind getOptCriterion() {
		return optCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptCriterion(OptimallityCriterionKind newOptCriterion) {
		OptimallityCriterionKind oldOptCriterion = optCriterion;
		optCriterion = newOptCriterion == null ? OPT_CRITERION_EDEFAULT : newOptCriterion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_ANALYSIS_CONTEXT__OPT_CRITERION, oldOptCriterion, optCriterion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SAMPackage.SA_ANALYSIS_CONTEXT__IS_SCHED:
				return basicSetIsSched(null, msgs);
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
			case SAMPackage.SA_ANALYSIS_CONTEXT__IS_SCHED:
				return getIsSched();
			case SAMPackage.SA_ANALYSIS_CONTEXT__OPT_CRITERION:
				return getOptCriterion();
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
			case SAMPackage.SA_ANALYSIS_CONTEXT__IS_SCHED:
				setIsSched((NFP_Boolean)newValue);
				return;
			case SAMPackage.SA_ANALYSIS_CONTEXT__OPT_CRITERION:
				setOptCriterion((OptimallityCriterionKind)newValue);
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
			case SAMPackage.SA_ANALYSIS_CONTEXT__IS_SCHED:
				setIsSched((NFP_Boolean)null);
				return;
			case SAMPackage.SA_ANALYSIS_CONTEXT__OPT_CRITERION:
				setOptCriterion(OPT_CRITERION_EDEFAULT);
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
			case SAMPackage.SA_ANALYSIS_CONTEXT__IS_SCHED:
				return isSched != null;
			case SAMPackage.SA_ANALYSIS_CONTEXT__OPT_CRITERION:
				return optCriterion != OPT_CRITERION_EDEFAULT;
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
		result.append(" (optCriterion: ");
		result.append(optCriterion);
		result.append(')');
		return result.toString();
	}

} //SaAnalysisContextImpl
