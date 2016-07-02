/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.MemoryOrganization;

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
 * An implementation of the model object '<em><b>Memory Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.MemoryOrganizationImpl#getNbRows <em>Nb Rows</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.MemoryOrganizationImpl#getNbColumns <em>Nb Columns</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.MemoryOrganizationImpl#getNbBanks <em>Nb Banks</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.MemoryOrganizationImpl#getWordSize <em>Word Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryOrganizationImpl extends EObjectImpl implements MemoryOrganization {
	/**
	 * The cached value of the '{@link #getNbRows() <em>Nb Rows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbRows()
	 * @generated
	 * @ordered
	 */
	protected NFP_Natural nbRows;

	/**
	 * The cached value of the '{@link #getNbColumns() <em>Nb Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbColumns()
	 * @generated
	 * @ordered
	 */
	protected NFP_Natural nbColumns;

	/**
	 * The cached value of the '{@link #getNbBanks() <em>Nb Banks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbBanks()
	 * @generated
	 * @ordered
	 */
	protected NFP_Natural nbBanks;

	/**
	 * The cached value of the '{@link #getWordSize() <em>Word Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordSize()
	 * @generated
	 * @ordered
	 */
	protected NFP_DataSize wordSize;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryOrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwMemoryPackage.Literals.MEMORY_ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Natural getNbRows() {
		return nbRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNbRows(NFP_Natural newNbRows, NotificationChain msgs) {
		NFP_Natural oldNbRows = nbRows;
		nbRows = newNbRows;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwMemoryPackage.MEMORY_ORGANIZATION__NB_ROWS, oldNbRows, newNbRows);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbRows(NFP_Natural newNbRows) {
		if (newNbRows != nbRows) {
			NotificationChain msgs = null;
			if (nbRows != null)
				msgs = ((InternalEObject)nbRows).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.MEMORY_ORGANIZATION__NB_ROWS, null, msgs);
			if (newNbRows != null)
				msgs = ((InternalEObject)newNbRows).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.MEMORY_ORGANIZATION__NB_ROWS, null, msgs);
			msgs = basicSetNbRows(newNbRows, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.MEMORY_ORGANIZATION__NB_ROWS, newNbRows, newNbRows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Natural getNbColumns() {
		return nbColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNbColumns(NFP_Natural newNbColumns, NotificationChain msgs) {
		NFP_Natural oldNbColumns = nbColumns;
		nbColumns = newNbColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwMemoryPackage.MEMORY_ORGANIZATION__NB_COLUMNS, oldNbColumns, newNbColumns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbColumns(NFP_Natural newNbColumns) {
		if (newNbColumns != nbColumns) {
			NotificationChain msgs = null;
			if (nbColumns != null)
				msgs = ((InternalEObject)nbColumns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.MEMORY_ORGANIZATION__NB_COLUMNS, null, msgs);
			if (newNbColumns != null)
				msgs = ((InternalEObject)newNbColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.MEMORY_ORGANIZATION__NB_COLUMNS, null, msgs);
			msgs = basicSetNbColumns(newNbColumns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.MEMORY_ORGANIZATION__NB_COLUMNS, newNbColumns, newNbColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Natural getNbBanks() {
		return nbBanks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNbBanks(NFP_Natural newNbBanks, NotificationChain msgs) {
		NFP_Natural oldNbBanks = nbBanks;
		nbBanks = newNbBanks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwMemoryPackage.MEMORY_ORGANIZATION__NB_BANKS, oldNbBanks, newNbBanks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbBanks(NFP_Natural newNbBanks) {
		if (newNbBanks != nbBanks) {
			NotificationChain msgs = null;
			if (nbBanks != null)
				msgs = ((InternalEObject)nbBanks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.MEMORY_ORGANIZATION__NB_BANKS, null, msgs);
			if (newNbBanks != null)
				msgs = ((InternalEObject)newNbBanks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.MEMORY_ORGANIZATION__NB_BANKS, null, msgs);
			msgs = basicSetNbBanks(newNbBanks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.MEMORY_ORGANIZATION__NB_BANKS, newNbBanks, newNbBanks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataSize getWordSize() {
		return wordSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWordSize(NFP_DataSize newWordSize, NotificationChain msgs) {
		NFP_DataSize oldWordSize = wordSize;
		wordSize = newWordSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwMemoryPackage.MEMORY_ORGANIZATION__WORD_SIZE, oldWordSize, newWordSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWordSize(NFP_DataSize newWordSize) {
		if (newWordSize != wordSize) {
			NotificationChain msgs = null;
			if (wordSize != null)
				msgs = ((InternalEObject)wordSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.MEMORY_ORGANIZATION__WORD_SIZE, null, msgs);
			if (newWordSize != null)
				msgs = ((InternalEObject)newWordSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.MEMORY_ORGANIZATION__WORD_SIZE, null, msgs);
			msgs = basicSetWordSize(newWordSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.MEMORY_ORGANIZATION__WORD_SIZE, newWordSize, newWordSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwMemoryPackage.MEMORY_ORGANIZATION__NB_ROWS:
				return basicSetNbRows(null, msgs);
			case HwMemoryPackage.MEMORY_ORGANIZATION__NB_COLUMNS:
				return basicSetNbColumns(null, msgs);
			case HwMemoryPackage.MEMORY_ORGANIZATION__NB_BANKS:
				return basicSetNbBanks(null, msgs);
			case HwMemoryPackage.MEMORY_ORGANIZATION__WORD_SIZE:
				return basicSetWordSize(null, msgs);
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
			case HwMemoryPackage.MEMORY_ORGANIZATION__NB_ROWS:
				return getNbRows();
			case HwMemoryPackage.MEMORY_ORGANIZATION__NB_COLUMNS:
				return getNbColumns();
			case HwMemoryPackage.MEMORY_ORGANIZATION__NB_BANKS:
				return getNbBanks();
			case HwMemoryPackage.MEMORY_ORGANIZATION__WORD_SIZE:
				return getWordSize();
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
			case HwMemoryPackage.MEMORY_ORGANIZATION__NB_ROWS:
				setNbRows((NFP_Natural)newValue);
				return;
			case HwMemoryPackage.MEMORY_ORGANIZATION__NB_COLUMNS:
				setNbColumns((NFP_Natural)newValue);
				return;
			case HwMemoryPackage.MEMORY_ORGANIZATION__NB_BANKS:
				setNbBanks((NFP_Natural)newValue);
				return;
			case HwMemoryPackage.MEMORY_ORGANIZATION__WORD_SIZE:
				setWordSize((NFP_DataSize)newValue);
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
			case HwMemoryPackage.MEMORY_ORGANIZATION__NB_ROWS:
				setNbRows((NFP_Natural)null);
				return;
			case HwMemoryPackage.MEMORY_ORGANIZATION__NB_COLUMNS:
				setNbColumns((NFP_Natural)null);
				return;
			case HwMemoryPackage.MEMORY_ORGANIZATION__NB_BANKS:
				setNbBanks((NFP_Natural)null);
				return;
			case HwMemoryPackage.MEMORY_ORGANIZATION__WORD_SIZE:
				setWordSize((NFP_DataSize)null);
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
			case HwMemoryPackage.MEMORY_ORGANIZATION__NB_ROWS:
				return nbRows != null;
			case HwMemoryPackage.MEMORY_ORGANIZATION__NB_COLUMNS:
				return nbColumns != null;
			case HwMemoryPackage.MEMORY_ORGANIZATION__NB_BANKS:
				return nbBanks != null;
			case HwMemoryPackage.MEMORY_ORGANIZATION__WORD_SIZE:
				return wordSize != null;
		}
		return super.eIsSet(featureID);
	}

} //MemoryOrganizationImpl
