/**
 */
package MARTE.MARTE_AnalysisModel.SAM.impl;

import MARTE.MARTE_AnalysisModel.GQAM.impl.GaTimedObsImpl;

import MARTE.MARTE_AnalysisModel.SAM.SAMPackage;
import MARTE.MARTE_AnalysisModel.SAM.SaSchedObs;

import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Integer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sa Sched Obs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaSchedObsImpl#getSuspentions <em>Suspentions</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaSchedObsImpl#getBlockT <em>Block T</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaSchedObsImpl#getOverlaps <em>Overlaps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SaSchedObsImpl extends GaTimedObsImpl implements SaSchedObs {
	/**
	 * The cached value of the '{@link #getSuspentions() <em>Suspentions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspentions()
	 * @generated
	 * @ordered
	 */
	protected EList suspentions;

	/**
	 * The cached value of the '{@link #getBlockT() <em>Block T</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockT()
	 * @generated
	 * @ordered
	 */
	protected EList blockT;

	/**
	 * The cached value of the '{@link #getOverlaps() <em>Overlaps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlaps()
	 * @generated
	 * @ordered
	 */
	protected EList overlaps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaSchedObsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SAMPackage.Literals.SA_SCHED_OBS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSuspentions() {
		if (suspentions == null) {
			suspentions = new EObjectContainmentEList(NFP_Integer.class, this, SAMPackage.SA_SCHED_OBS__SUSPENTIONS);
		}
		return suspentions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBlockT() {
		if (blockT == null) {
			blockT = new EObjectContainmentEList(NFP_Duration.class, this, SAMPackage.SA_SCHED_OBS__BLOCK_T);
		}
		return blockT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOverlaps() {
		if (overlaps == null) {
			overlaps = new EObjectContainmentEList(NFP_Integer.class, this, SAMPackage.SA_SCHED_OBS__OVERLAPS);
		}
		return overlaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SAMPackage.SA_SCHED_OBS__SUSPENTIONS:
				return ((InternalEList)getSuspentions()).basicRemove(otherEnd, msgs);
			case SAMPackage.SA_SCHED_OBS__BLOCK_T:
				return ((InternalEList)getBlockT()).basicRemove(otherEnd, msgs);
			case SAMPackage.SA_SCHED_OBS__OVERLAPS:
				return ((InternalEList)getOverlaps()).basicRemove(otherEnd, msgs);
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
			case SAMPackage.SA_SCHED_OBS__SUSPENTIONS:
				return getSuspentions();
			case SAMPackage.SA_SCHED_OBS__BLOCK_T:
				return getBlockT();
			case SAMPackage.SA_SCHED_OBS__OVERLAPS:
				return getOverlaps();
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
			case SAMPackage.SA_SCHED_OBS__SUSPENTIONS:
				getSuspentions().clear();
				getSuspentions().addAll((Collection)newValue);
				return;
			case SAMPackage.SA_SCHED_OBS__BLOCK_T:
				getBlockT().clear();
				getBlockT().addAll((Collection)newValue);
				return;
			case SAMPackage.SA_SCHED_OBS__OVERLAPS:
				getOverlaps().clear();
				getOverlaps().addAll((Collection)newValue);
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
			case SAMPackage.SA_SCHED_OBS__SUSPENTIONS:
				getSuspentions().clear();
				return;
			case SAMPackage.SA_SCHED_OBS__BLOCK_T:
				getBlockT().clear();
				return;
			case SAMPackage.SA_SCHED_OBS__OVERLAPS:
				getOverlaps().clear();
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
			case SAMPackage.SA_SCHED_OBS__SUSPENTIONS:
				return suspentions != null && !suspentions.isEmpty();
			case SAMPackage.SA_SCHED_OBS__BLOCK_T:
				return blockT != null && !blockT.isEmpty();
			case SAMPackage.SA_SCHED_OBS__OVERLAPS:
				return overlaps != null && !overlaps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SaSchedObsImpl
