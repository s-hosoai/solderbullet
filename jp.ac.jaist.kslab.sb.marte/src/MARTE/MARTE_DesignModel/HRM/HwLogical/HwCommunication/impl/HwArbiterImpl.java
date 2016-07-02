/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwArbiter;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Arbiter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwArbiterImpl#getControlledMedias <em>Controlled Medias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwArbiterImpl extends HwCommunicationResourceImpl implements HwArbiter {
	/**
	 * The cached value of the '{@link #getControlledMedias() <em>Controlled Medias</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlledMedias()
	 * @generated
	 * @ordered
	 */
	protected EList controlledMedias;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwArbiterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwCommunicationPackage.Literals.HW_ARBITER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getControlledMedias() {
		if (controlledMedias == null) {
			controlledMedias = new EObjectWithInverseResolvingEList.ManyInverse(HwMedia.class, this, HwCommunicationPackage.HW_ARBITER__CONTROLLED_MEDIAS, HwCommunicationPackage.HW_MEDIA__ARBITERS);
		}
		return controlledMedias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwCommunicationPackage.HW_ARBITER__CONTROLLED_MEDIAS:
				return ((InternalEList)getControlledMedias()).basicAdd(otherEnd, msgs);
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
			case HwCommunicationPackage.HW_ARBITER__CONTROLLED_MEDIAS:
				return ((InternalEList)getControlledMedias()).basicRemove(otherEnd, msgs);
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
			case HwCommunicationPackage.HW_ARBITER__CONTROLLED_MEDIAS:
				return getControlledMedias();
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
			case HwCommunicationPackage.HW_ARBITER__CONTROLLED_MEDIAS:
				getControlledMedias().clear();
				getControlledMedias().addAll((Collection)newValue);
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
			case HwCommunicationPackage.HW_ARBITER__CONTROLLED_MEDIAS:
				getControlledMedias().clear();
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
			case HwCommunicationPackage.HW_ARBITER__CONTROLLED_MEDIAS:
				return controlledMedias != null && !controlledMedias.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HwArbiterImpl
