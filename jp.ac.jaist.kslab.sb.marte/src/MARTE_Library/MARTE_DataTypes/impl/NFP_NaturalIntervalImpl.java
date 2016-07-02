/**
 */
package MARTE_Library.MARTE_DataTypes.impl;

import MARTE_Library.BasicNFP_Types.NFP_Natural;

import MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage;
import MARTE_Library.MARTE_DataTypes.NFP_NaturalInterval;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NFP Natural Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.MARTE_DataTypes.impl.NFP_NaturalIntervalImpl#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NFP_NaturalIntervalImpl extends EObjectImpl implements NFP_NaturalInterval {
	/**
	 * The cached value of the '{@link #getBound() <em>Bound</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound()
	 * @generated
	 * @ordered
	 */
	protected EList<NFP_Natural> bound;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NFP_NaturalIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MARTE_DataTypesPackage.Literals.NFP_NATURAL_INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NFP_Natural> getBound() {
		if (bound == null) {
			bound = new EObjectContainmentEList<NFP_Natural>(NFP_Natural.class, this, MARTE_DataTypesPackage.NFP_NATURAL_INTERVAL__BOUND);
		}
		return bound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MARTE_DataTypesPackage.NFP_NATURAL_INTERVAL__BOUND:
				return ((InternalEList<?>)getBound()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MARTE_DataTypesPackage.NFP_NATURAL_INTERVAL__BOUND:
				return getBound();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MARTE_DataTypesPackage.NFP_NATURAL_INTERVAL__BOUND:
				getBound().clear();
				getBound().addAll((Collection<? extends NFP_Natural>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MARTE_DataTypesPackage.NFP_NATURAL_INTERVAL__BOUND:
				getBound().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MARTE_DataTypesPackage.NFP_NATURAL_INTERVAL__BOUND:
				return bound != null && !bound.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NFP_NaturalIntervalImpl