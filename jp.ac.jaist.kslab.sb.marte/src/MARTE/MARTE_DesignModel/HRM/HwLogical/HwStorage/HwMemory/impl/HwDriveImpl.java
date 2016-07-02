/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwDrive;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Drive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwDriveImpl#getSectorSize <em>Sector Size</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwDriveImpl#getBuffer <em>Buffer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwDriveImpl extends HwMemoryImpl implements HwDrive {
	/**
	 * The cached value of the '{@link #getSectorSize() <em>Sector Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectorSize()
	 * @generated
	 * @ordered
	 */
	protected NFP_DataSize sectorSize;

	/**
	 * The cached value of the '{@link #getBuffer() <em>Buffer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffer()
	 * @generated
	 * @ordered
	 */
	protected HwRAM buffer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwDriveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwMemoryPackage.Literals.HW_DRIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataSize getSectorSize() {
		return sectorSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSectorSize(NFP_DataSize newSectorSize, NotificationChain msgs) {
		NFP_DataSize oldSectorSize = sectorSize;
		sectorSize = newSectorSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_DRIVE__SECTOR_SIZE, oldSectorSize, newSectorSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectorSize(NFP_DataSize newSectorSize) {
		if (newSectorSize != sectorSize) {
			NotificationChain msgs = null;
			if (sectorSize != null)
				msgs = ((InternalEObject)sectorSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_DRIVE__SECTOR_SIZE, null, msgs);
			if (newSectorSize != null)
				msgs = ((InternalEObject)newSectorSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_DRIVE__SECTOR_SIZE, null, msgs);
			msgs = basicSetSectorSize(newSectorSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_DRIVE__SECTOR_SIZE, newSectorSize, newSectorSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwRAM getBuffer() {
		return buffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuffer(HwRAM newBuffer, NotificationChain msgs) {
		HwRAM oldBuffer = buffer;
		buffer = newBuffer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_DRIVE__BUFFER, oldBuffer, newBuffer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuffer(HwRAM newBuffer) {
		if (newBuffer != buffer) {
			NotificationChain msgs = null;
			if (buffer != null)
				msgs = ((InternalEObject)buffer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_DRIVE__BUFFER, null, msgs);
			if (newBuffer != null)
				msgs = ((InternalEObject)newBuffer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_DRIVE__BUFFER, null, msgs);
			msgs = basicSetBuffer(newBuffer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_DRIVE__BUFFER, newBuffer, newBuffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwMemoryPackage.HW_DRIVE__SECTOR_SIZE:
				return basicSetSectorSize(null, msgs);
			case HwMemoryPackage.HW_DRIVE__BUFFER:
				return basicSetBuffer(null, msgs);
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
			case HwMemoryPackage.HW_DRIVE__SECTOR_SIZE:
				return getSectorSize();
			case HwMemoryPackage.HW_DRIVE__BUFFER:
				return getBuffer();
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
			case HwMemoryPackage.HW_DRIVE__SECTOR_SIZE:
				setSectorSize((NFP_DataSize)newValue);
				return;
			case HwMemoryPackage.HW_DRIVE__BUFFER:
				setBuffer((HwRAM)newValue);
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
			case HwMemoryPackage.HW_DRIVE__SECTOR_SIZE:
				setSectorSize((NFP_DataSize)null);
				return;
			case HwMemoryPackage.HW_DRIVE__BUFFER:
				setBuffer((HwRAM)null);
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
			case HwMemoryPackage.HW_DRIVE__SECTOR_SIZE:
				return sectorSize != null;
			case HwMemoryPackage.HW_DRIVE__BUFFER:
				return buffer != null;
		}
		return super.eIsSet(featureID);
	}

} //HwDriveImpl
