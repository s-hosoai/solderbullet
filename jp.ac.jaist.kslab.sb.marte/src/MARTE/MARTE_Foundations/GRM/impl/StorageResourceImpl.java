/**
 */
package MARTE.MARTE_Foundations.GRM.impl;

import MARTE.MARTE_Foundations.GRM.GRMPackage;
import MARTE.MARTE_Foundations.GRM.StorageResource;

import MARTE_Library.BasicNFP_Types.NFP_Integer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.StorageResourceImpl#getElementSize <em>Element Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageResourceImpl extends ResourceImpl implements StorageResource {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GRMPackage.Literals.STORAGE_RESOURCE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRMPackage.STORAGE_RESOURCE__ELEMENT_SIZE, oldElementSize, newElementSize);
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
				msgs = ((InternalEObject)elementSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GRMPackage.STORAGE_RESOURCE__ELEMENT_SIZE, null, msgs);
			if (newElementSize != null)
				msgs = ((InternalEObject)newElementSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GRMPackage.STORAGE_RESOURCE__ELEMENT_SIZE, null, msgs);
			msgs = basicSetElementSize(newElementSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRMPackage.STORAGE_RESOURCE__ELEMENT_SIZE, newElementSize, newElementSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRMPackage.STORAGE_RESOURCE__ELEMENT_SIZE:
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
			case GRMPackage.STORAGE_RESOURCE__ELEMENT_SIZE:
				return getElementSize();
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
			case GRMPackage.STORAGE_RESOURCE__ELEMENT_SIZE:
				setElementSize((NFP_Integer)newValue);
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
			case GRMPackage.STORAGE_RESOURCE__ELEMENT_SIZE:
				setElementSize((NFP_Integer)null);
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
			case GRMPackage.STORAGE_RESOURCE__ELEMENT_SIZE:
				return elementSize != null;
		}
		return super.eIsSet(featureID);
	}

} //StorageResourceImpl
