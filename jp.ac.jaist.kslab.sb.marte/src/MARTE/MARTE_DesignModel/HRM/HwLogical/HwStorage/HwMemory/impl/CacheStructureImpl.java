/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheStructure;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;
import MARTE_Library.BasicNFP_Types.NFP_Natural;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cache Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.CacheStructureImpl#getNbSets <em>Nb Sets</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.CacheStructureImpl#getBlockSize <em>Block Size</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.CacheStructureImpl#getAssociativity <em>Associativity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CacheStructureImpl extends EObjectImpl implements CacheStructure {
	/**
	 * The cached value of the '{@link #getNbSets() <em>Nb Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbSets()
	 * @generated
	 * @ordered
	 */
	protected NFP_Natural nbSets;

	/**
	 * The cached value of the '{@link #getBlockSize() <em>Block Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockSize()
	 * @generated
	 * @ordered
	 */
	protected NFP_DataSize blockSize;

	/**
	 * The cached value of the '{@link #getAssociativity() <em>Associativity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociativity()
	 * @generated
	 * @ordered
	 */
	protected NFP_Natural associativity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CacheStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwMemoryPackage.Literals.CACHE_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Natural getNbSets() {
		return nbSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNbSets(NFP_Natural newNbSets, NotificationChain msgs) {
		NFP_Natural oldNbSets = nbSets;
		nbSets = newNbSets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwMemoryPackage.CACHE_STRUCTURE__NB_SETS, oldNbSets, newNbSets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbSets(NFP_Natural newNbSets) {
		if (newNbSets != nbSets) {
			NotificationChain msgs = null;
			if (nbSets != null)
				msgs = ((InternalEObject)nbSets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.CACHE_STRUCTURE__NB_SETS, null, msgs);
			if (newNbSets != null)
				msgs = ((InternalEObject)newNbSets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.CACHE_STRUCTURE__NB_SETS, null, msgs);
			msgs = basicSetNbSets(newNbSets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.CACHE_STRUCTURE__NB_SETS, newNbSets, newNbSets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataSize getBlockSize() {
		return blockSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlockSize(NFP_DataSize newBlockSize, NotificationChain msgs) {
		NFP_DataSize oldBlockSize = blockSize;
		blockSize = newBlockSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwMemoryPackage.CACHE_STRUCTURE__BLOCK_SIZE, oldBlockSize, newBlockSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockSize(NFP_DataSize newBlockSize) {
		if (newBlockSize != blockSize) {
			NotificationChain msgs = null;
			if (blockSize != null)
				msgs = ((InternalEObject)blockSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.CACHE_STRUCTURE__BLOCK_SIZE, null, msgs);
			if (newBlockSize != null)
				msgs = ((InternalEObject)newBlockSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.CACHE_STRUCTURE__BLOCK_SIZE, null, msgs);
			msgs = basicSetBlockSize(newBlockSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.CACHE_STRUCTURE__BLOCK_SIZE, newBlockSize, newBlockSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Natural getAssociativity() {
		return associativity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociativity(NFP_Natural newAssociativity, NotificationChain msgs) {
		NFP_Natural oldAssociativity = associativity;
		associativity = newAssociativity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwMemoryPackage.CACHE_STRUCTURE__ASSOCIATIVITY, oldAssociativity, newAssociativity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociativity(NFP_Natural newAssociativity) {
		if (newAssociativity != associativity) {
			NotificationChain msgs = null;
			if (associativity != null)
				msgs = ((InternalEObject)associativity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.CACHE_STRUCTURE__ASSOCIATIVITY, null, msgs);
			if (newAssociativity != null)
				msgs = ((InternalEObject)newAssociativity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.CACHE_STRUCTURE__ASSOCIATIVITY, null, msgs);
			msgs = basicSetAssociativity(newAssociativity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.CACHE_STRUCTURE__ASSOCIATIVITY, newAssociativity, newAssociativity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwMemoryPackage.CACHE_STRUCTURE__NB_SETS:
				return basicSetNbSets(null, msgs);
			case HwMemoryPackage.CACHE_STRUCTURE__BLOCK_SIZE:
				return basicSetBlockSize(null, msgs);
			case HwMemoryPackage.CACHE_STRUCTURE__ASSOCIATIVITY:
				return basicSetAssociativity(null, msgs);
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
			case HwMemoryPackage.CACHE_STRUCTURE__NB_SETS:
				return getNbSets();
			case HwMemoryPackage.CACHE_STRUCTURE__BLOCK_SIZE:
				return getBlockSize();
			case HwMemoryPackage.CACHE_STRUCTURE__ASSOCIATIVITY:
				return getAssociativity();
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
			case HwMemoryPackage.CACHE_STRUCTURE__NB_SETS:
				setNbSets((NFP_Natural)newValue);
				return;
			case HwMemoryPackage.CACHE_STRUCTURE__BLOCK_SIZE:
				setBlockSize((NFP_DataSize)newValue);
				return;
			case HwMemoryPackage.CACHE_STRUCTURE__ASSOCIATIVITY:
				setAssociativity((NFP_Natural)newValue);
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
			case HwMemoryPackage.CACHE_STRUCTURE__NB_SETS:
				setNbSets((NFP_Natural)null);
				return;
			case HwMemoryPackage.CACHE_STRUCTURE__BLOCK_SIZE:
				setBlockSize((NFP_DataSize)null);
				return;
			case HwMemoryPackage.CACHE_STRUCTURE__ASSOCIATIVITY:
				setAssociativity((NFP_Natural)null);
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
			case HwMemoryPackage.CACHE_STRUCTURE__NB_SETS:
				return nbSets != null;
			case HwMemoryPackage.CACHE_STRUCTURE__BLOCK_SIZE:
				return blockSize != null;
			case HwMemoryPackage.CACHE_STRUCTURE__ASSOCIATIVITY:
				return associativity != null;
		}
		return super.eIsSet(featureID);
	}

} //CacheStructureImpl
