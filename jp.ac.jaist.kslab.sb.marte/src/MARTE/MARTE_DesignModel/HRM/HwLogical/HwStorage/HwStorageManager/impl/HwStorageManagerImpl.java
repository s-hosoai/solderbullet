/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.impl;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.impl.HwResourceImpl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManager;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerPackage;

import MARTE.MARTE_Foundations.GRM.GRMPackage;
import MARTE.MARTE_Foundations.GRM.StorageResource;

import MARTE_Library.BasicNFP_Types.NFP_Integer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Storage Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.impl.HwStorageManagerImpl#getElementSize <em>Element Size</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.impl.HwStorageManagerImpl#getManagedMemories <em>Managed Memories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwStorageManagerImpl extends HwResourceImpl implements HwStorageManager {
	/**
	 * The cached value of the '{@link #getElementSize() <em>Element Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementSize()
	 * @generated
	 * @ordered
	 */
	protected NFP_Integer elementSize;

	/**
	 * The cached value of the '{@link #getManagedMemories() <em>Managed Memories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedMemories()
	 * @generated
	 * @ordered
	 */
	protected EList managedMemories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwStorageManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwStorageManagerPackage.Literals.HW_STORAGE_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Integer getElementSize() {
		return elementSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementSize(NFP_Integer newElementSize, NotificationChain msgs) {
		NFP_Integer oldElementSize = elementSize;
		elementSize = newElementSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwStorageManagerPackage.HW_STORAGE_MANAGER__ELEMENT_SIZE, oldElementSize, newElementSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementSize(NFP_Integer newElementSize) {
		if (newElementSize != elementSize) {
			NotificationChain msgs = null;
			if (elementSize != null)
				msgs = ((InternalEObject)elementSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwStorageManagerPackage.HW_STORAGE_MANAGER__ELEMENT_SIZE, null, msgs);
			if (newElementSize != null)
				msgs = ((InternalEObject)newElementSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwStorageManagerPackage.HW_STORAGE_MANAGER__ELEMENT_SIZE, null, msgs);
			msgs = basicSetElementSize(newElementSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwStorageManagerPackage.HW_STORAGE_MANAGER__ELEMENT_SIZE, newElementSize, newElementSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getManagedMemories() {
		if (managedMemories == null) {
			managedMemories = new EObjectResolvingEList(HwMemory.class, this, HwStorageManagerPackage.HW_STORAGE_MANAGER__MANAGED_MEMORIES);
		}
		return managedMemories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwStorageManagerPackage.HW_STORAGE_MANAGER__ELEMENT_SIZE:
				return basicSetElementSize(null, msgs);
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
			case HwStorageManagerPackage.HW_STORAGE_MANAGER__ELEMENT_SIZE:
				return getElementSize();
			case HwStorageManagerPackage.HW_STORAGE_MANAGER__MANAGED_MEMORIES:
				return getManagedMemories();
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
			case HwStorageManagerPackage.HW_STORAGE_MANAGER__ELEMENT_SIZE:
				setElementSize((NFP_Integer)newValue);
				return;
			case HwStorageManagerPackage.HW_STORAGE_MANAGER__MANAGED_MEMORIES:
				getManagedMemories().clear();
				getManagedMemories().addAll((Collection)newValue);
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
			case HwStorageManagerPackage.HW_STORAGE_MANAGER__ELEMENT_SIZE:
				setElementSize((NFP_Integer)null);
				return;
			case HwStorageManagerPackage.HW_STORAGE_MANAGER__MANAGED_MEMORIES:
				getManagedMemories().clear();
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
			case HwStorageManagerPackage.HW_STORAGE_MANAGER__ELEMENT_SIZE:
				return elementSize != null;
			case HwStorageManagerPackage.HW_STORAGE_MANAGER__MANAGED_MEMORIES:
				return managedMemories != null && !managedMemories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == StorageResource.class) {
			switch (derivedFeatureID) {
				case HwStorageManagerPackage.HW_STORAGE_MANAGER__ELEMENT_SIZE: return GRMPackage.STORAGE_RESOURCE__ELEMENT_SIZE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == StorageResource.class) {
			switch (baseFeatureID) {
				case GRMPackage.STORAGE_RESOURCE__ELEMENT_SIZE: return HwStorageManagerPackage.HW_STORAGE_MANAGER__ELEMENT_SIZE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //HwStorageManagerImpl
