/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.impl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwMMU;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerPackage;

import MARTE_Library.BasicNFP_Types.NFP_Boolean;
import MARTE_Library.BasicNFP_Types.NFP_DataSize;
import MARTE_Library.BasicNFP_Types.NFP_Natural;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw MMU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.impl.HwMMUImpl#getVirtualAddrSpace <em>Virtual Addr Space</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.impl.HwMMUImpl#getPhysicalAddrSpace <em>Physical Addr Space</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.impl.HwMMUImpl#getMemoryProtection <em>Memory Protection</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.impl.HwMMUImpl#getNbEntries <em>Nb Entries</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.impl.HwMMUImpl#getOwnedTLBs <em>Owned TL Bs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwMMUImpl extends HwStorageManagerImpl implements HwMMU {
	/**
	 * The cached value of the '{@link #getVirtualAddrSpace() <em>Virtual Addr Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualAddrSpace()
	 * @generated
	 * @ordered
	 */
	protected NFP_DataSize virtualAddrSpace;

	/**
	 * The cached value of the '{@link #getPhysicalAddrSpace() <em>Physical Addr Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalAddrSpace()
	 * @generated
	 * @ordered
	 */
	protected NFP_DataSize physicalAddrSpace;

	/**
	 * The cached value of the '{@link #getMemoryProtection() <em>Memory Protection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryProtection()
	 * @generated
	 * @ordered
	 */
	protected NFP_Boolean memoryProtection;

	/**
	 * The cached value of the '{@link #getOwnedTLBs() <em>Owned TL Bs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTLBs()
	 * @generated
	 * @ordered
	 */
	protected EList ownedTLBs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwMMUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwStorageManagerPackage.Literals.HW_MMU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataSize getVirtualAddrSpace() {
		return virtualAddrSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVirtualAddrSpace(NFP_DataSize newVirtualAddrSpace, NotificationChain msgs) {
		NFP_DataSize oldVirtualAddrSpace = virtualAddrSpace;
		virtualAddrSpace = newVirtualAddrSpace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwStorageManagerPackage.HW_MMU__VIRTUAL_ADDR_SPACE, oldVirtualAddrSpace, newVirtualAddrSpace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualAddrSpace(NFP_DataSize newVirtualAddrSpace) {
		if (newVirtualAddrSpace != virtualAddrSpace) {
			NotificationChain msgs = null;
			if (virtualAddrSpace != null)
				msgs = ((InternalEObject)virtualAddrSpace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwStorageManagerPackage.HW_MMU__VIRTUAL_ADDR_SPACE, null, msgs);
			if (newVirtualAddrSpace != null)
				msgs = ((InternalEObject)newVirtualAddrSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwStorageManagerPackage.HW_MMU__VIRTUAL_ADDR_SPACE, null, msgs);
			msgs = basicSetVirtualAddrSpace(newVirtualAddrSpace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwStorageManagerPackage.HW_MMU__VIRTUAL_ADDR_SPACE, newVirtualAddrSpace, newVirtualAddrSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataSize getPhysicalAddrSpace() {
		return physicalAddrSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalAddrSpace(NFP_DataSize newPhysicalAddrSpace, NotificationChain msgs) {
		NFP_DataSize oldPhysicalAddrSpace = physicalAddrSpace;
		physicalAddrSpace = newPhysicalAddrSpace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwStorageManagerPackage.HW_MMU__PHYSICAL_ADDR_SPACE, oldPhysicalAddrSpace, newPhysicalAddrSpace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalAddrSpace(NFP_DataSize newPhysicalAddrSpace) {
		if (newPhysicalAddrSpace != physicalAddrSpace) {
			NotificationChain msgs = null;
			if (physicalAddrSpace != null)
				msgs = ((InternalEObject)physicalAddrSpace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwStorageManagerPackage.HW_MMU__PHYSICAL_ADDR_SPACE, null, msgs);
			if (newPhysicalAddrSpace != null)
				msgs = ((InternalEObject)newPhysicalAddrSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwStorageManagerPackage.HW_MMU__PHYSICAL_ADDR_SPACE, null, msgs);
			msgs = basicSetPhysicalAddrSpace(newPhysicalAddrSpace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwStorageManagerPackage.HW_MMU__PHYSICAL_ADDR_SPACE, newPhysicalAddrSpace, newPhysicalAddrSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Boolean getMemoryProtection() {
		return memoryProtection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemoryProtection(NFP_Boolean newMemoryProtection, NotificationChain msgs) {
		NFP_Boolean oldMemoryProtection = memoryProtection;
		memoryProtection = newMemoryProtection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwStorageManagerPackage.HW_MMU__MEMORY_PROTECTION, oldMemoryProtection, newMemoryProtection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryProtection(NFP_Boolean newMemoryProtection) {
		if (newMemoryProtection != memoryProtection) {
			NotificationChain msgs = null;
			if (memoryProtection != null)
				msgs = ((InternalEObject)memoryProtection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwStorageManagerPackage.HW_MMU__MEMORY_PROTECTION, null, msgs);
			if (newMemoryProtection != null)
				msgs = ((InternalEObject)newMemoryProtection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwStorageManagerPackage.HW_MMU__MEMORY_PROTECTION, null, msgs);
			msgs = basicSetMemoryProtection(newMemoryProtection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwStorageManagerPackage.HW_MMU__MEMORY_PROTECTION, newMemoryProtection, newMemoryProtection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Natural getNbEntries() {
		NFP_Natural nbEntries = basicGetNbEntries();
		return nbEntries != null && nbEntries.eIsProxy() ? (NFP_Natural)eResolveProxy((InternalEObject)nbEntries) : nbEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Natural basicGetNbEntries() {
		// TODO: implement this method to return the 'Nb Entries' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbEntries(NFP_Natural newNbEntries) {
		// TODO: implement this method to set the 'Nb Entries' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedTLBs() {
		if (ownedTLBs == null) {
			ownedTLBs = new EObjectContainmentEList(HwCache.class, this, HwStorageManagerPackage.HW_MMU__OWNED_TL_BS);
		}
		return ownedTLBs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwStorageManagerPackage.HW_MMU__VIRTUAL_ADDR_SPACE:
				return basicSetVirtualAddrSpace(null, msgs);
			case HwStorageManagerPackage.HW_MMU__PHYSICAL_ADDR_SPACE:
				return basicSetPhysicalAddrSpace(null, msgs);
			case HwStorageManagerPackage.HW_MMU__MEMORY_PROTECTION:
				return basicSetMemoryProtection(null, msgs);
			case HwStorageManagerPackage.HW_MMU__OWNED_TL_BS:
				return ((InternalEList)getOwnedTLBs()).basicRemove(otherEnd, msgs);
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
			case HwStorageManagerPackage.HW_MMU__VIRTUAL_ADDR_SPACE:
				return getVirtualAddrSpace();
			case HwStorageManagerPackage.HW_MMU__PHYSICAL_ADDR_SPACE:
				return getPhysicalAddrSpace();
			case HwStorageManagerPackage.HW_MMU__MEMORY_PROTECTION:
				return getMemoryProtection();
			case HwStorageManagerPackage.HW_MMU__NB_ENTRIES:
				if (resolve) return getNbEntries();
				return basicGetNbEntries();
			case HwStorageManagerPackage.HW_MMU__OWNED_TL_BS:
				return getOwnedTLBs();
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
			case HwStorageManagerPackage.HW_MMU__VIRTUAL_ADDR_SPACE:
				setVirtualAddrSpace((NFP_DataSize)newValue);
				return;
			case HwStorageManagerPackage.HW_MMU__PHYSICAL_ADDR_SPACE:
				setPhysicalAddrSpace((NFP_DataSize)newValue);
				return;
			case HwStorageManagerPackage.HW_MMU__MEMORY_PROTECTION:
				setMemoryProtection((NFP_Boolean)newValue);
				return;
			case HwStorageManagerPackage.HW_MMU__NB_ENTRIES:
				setNbEntries((NFP_Natural)newValue);
				return;
			case HwStorageManagerPackage.HW_MMU__OWNED_TL_BS:
				getOwnedTLBs().clear();
				getOwnedTLBs().addAll((Collection)newValue);
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
			case HwStorageManagerPackage.HW_MMU__VIRTUAL_ADDR_SPACE:
				setVirtualAddrSpace((NFP_DataSize)null);
				return;
			case HwStorageManagerPackage.HW_MMU__PHYSICAL_ADDR_SPACE:
				setPhysicalAddrSpace((NFP_DataSize)null);
				return;
			case HwStorageManagerPackage.HW_MMU__MEMORY_PROTECTION:
				setMemoryProtection((NFP_Boolean)null);
				return;
			case HwStorageManagerPackage.HW_MMU__NB_ENTRIES:
				setNbEntries((NFP_Natural)null);
				return;
			case HwStorageManagerPackage.HW_MMU__OWNED_TL_BS:
				getOwnedTLBs().clear();
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
			case HwStorageManagerPackage.HW_MMU__VIRTUAL_ADDR_SPACE:
				return virtualAddrSpace != null;
			case HwStorageManagerPackage.HW_MMU__PHYSICAL_ADDR_SPACE:
				return physicalAddrSpace != null;
			case HwStorageManagerPackage.HW_MMU__MEMORY_PROTECTION:
				return memoryProtection != null;
			case HwStorageManagerPackage.HW_MMU__NB_ENTRIES:
				return basicGetNbEntries() != null;
			case HwStorageManagerPackage.HW_MMU__OWNED_TL_BS:
				return ownedTLBs != null && !ownedTLBs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HwMMUImpl
