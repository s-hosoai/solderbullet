/**
 */
package MARTE.MARTE_Foundations.GRM.impl;

import MARTE.MARTE_Foundations.GRM.GRMPackage;
import MARTE.MARTE_Foundations.GRM.SchedulableResource;
import MARTE.MARTE_Foundations.GRM.SecondaryScheduler;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secondary Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.SecondarySchedulerImpl#getVirtualProcessingUnits <em>Virtual Processing Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecondarySchedulerImpl extends SchedulerImpl implements SecondaryScheduler {
	/**
	 * The cached value of the '{@link #getVirtualProcessingUnits() <em>Virtual Processing Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualProcessingUnits()
	 * @generated
	 * @ordered
	 */
	protected EList virtualProcessingUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecondarySchedulerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GRMPackage.Literals.SECONDARY_SCHEDULER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getVirtualProcessingUnits() {
		if (virtualProcessingUnits == null) {
			virtualProcessingUnits = new EObjectWithInverseResolvingEList(SchedulableResource.class, this, GRMPackage.SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNITS, GRMPackage.SCHEDULABLE_RESOURCE__DEPENDENT_SCHEDULER);
		}
		return virtualProcessingUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRMPackage.SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNITS:
				return ((InternalEList)getVirtualProcessingUnits()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRMPackage.SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNITS:
				return ((InternalEList)getVirtualProcessingUnits()).basicRemove(otherEnd, msgs);
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
			case GRMPackage.SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNITS:
				return getVirtualProcessingUnits();
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
			case GRMPackage.SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNITS:
				getVirtualProcessingUnits().clear();
				getVirtualProcessingUnits().addAll((Collection)newValue);
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
			case GRMPackage.SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNITS:
				getVirtualProcessingUnits().clear();
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
			case GRMPackage.SECONDARY_SCHEDULER__VIRTUAL_PROCESSING_UNITS:
				return virtualProcessingUnits != null && !virtualProcessingUnits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SecondarySchedulerImpl
