/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBridge;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Bridge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwBridgeImpl#getSides <em>Sides</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwBridgeImpl extends HwMediaImpl implements HwBridge {
	/**
	 * The cached value of the '{@link #getSides() <em>Sides</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSides()
	 * @generated
	 * @ordered
	 */
	protected EList sides;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwBridgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwCommunicationPackage.Literals.HW_BRIDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSides() {
		if (sides == null) {
			sides = new EObjectResolvingEList(HwMedia.class, this, HwCommunicationPackage.HW_BRIDGE__SIDES);
		}
		return sides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HwCommunicationPackage.HW_BRIDGE__SIDES:
				return getSides();
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
			case HwCommunicationPackage.HW_BRIDGE__SIDES:
				getSides().clear();
				getSides().addAll((Collection)newValue);
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
			case HwCommunicationPackage.HW_BRIDGE__SIDES:
				getSides().clear();
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
			case HwCommunicationPackage.HW_BRIDGE__SIDES:
				return sides != null && !sides.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HwBridgeImpl
