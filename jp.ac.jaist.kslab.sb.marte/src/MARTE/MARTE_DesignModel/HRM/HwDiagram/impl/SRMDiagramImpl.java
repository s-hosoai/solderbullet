/**
 */
package MARTE.MARTE_DesignModel.HRM.HwDiagram.impl;

import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage;
import MARTE.MARTE_DesignModel.HRM.HwDiagram.SRMDiagram;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource;

import MARTE.MARTE_DesignModel.SRM.SW_Brokering.DeviceBroker;

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
 * An implementation of the model object '<em><b>SRM Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.SRMDiagramImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.SRMDiagramImpl#getHwcomponents <em>Hwcomponents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SRMDiagramImpl extends EObjectImpl implements SRMDiagram {
	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList devices;

	/**
	 * The cached value of the '{@link #getHwcomponents() <em>Hwcomponents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwcomponents()
	 * @generated
	 * @ordered
	 */
	protected EList hwcomponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SRMDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwDiagramPackage.Literals.SRM_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDevices() {
		if (devices == null) {
			devices = new EObjectContainmentEList(DeviceBroker.class, this, HwDiagramPackage.SRM_DIAGRAM__DEVICES);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getHwcomponents() {
		if (hwcomponents == null) {
			hwcomponents = new EObjectContainmentEList(HwResource.class, this, HwDiagramPackage.SRM_DIAGRAM__HWCOMPONENTS);
		}
		return hwcomponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwDiagramPackage.SRM_DIAGRAM__DEVICES:
				return ((InternalEList)getDevices()).basicRemove(otherEnd, msgs);
			case HwDiagramPackage.SRM_DIAGRAM__HWCOMPONENTS:
				return ((InternalEList)getHwcomponents()).basicRemove(otherEnd, msgs);
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
			case HwDiagramPackage.SRM_DIAGRAM__DEVICES:
				return getDevices();
			case HwDiagramPackage.SRM_DIAGRAM__HWCOMPONENTS:
				return getHwcomponents();
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
			case HwDiagramPackage.SRM_DIAGRAM__DEVICES:
				getDevices().clear();
				getDevices().addAll((Collection)newValue);
				return;
			case HwDiagramPackage.SRM_DIAGRAM__HWCOMPONENTS:
				getHwcomponents().clear();
				getHwcomponents().addAll((Collection)newValue);
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
			case HwDiagramPackage.SRM_DIAGRAM__DEVICES:
				getDevices().clear();
				return;
			case HwDiagramPackage.SRM_DIAGRAM__HWCOMPONENTS:
				getHwcomponents().clear();
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
			case HwDiagramPackage.SRM_DIAGRAM__DEVICES:
				return devices != null && !devices.isEmpty();
			case HwDiagramPackage.SRM_DIAGRAM__HWCOMPONENTS:
				return hwcomponents != null && !hwcomponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SRMDiagramImpl
