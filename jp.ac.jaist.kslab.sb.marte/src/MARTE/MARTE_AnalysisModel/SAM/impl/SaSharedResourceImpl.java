/**
 */
package MARTE.MARTE_AnalysisModel.SAM.impl;

import MARTE.MARTE_AnalysisModel.SAM.SAMPackage;
import MARTE.MARTE_AnalysisModel.SAM.SaSharedResource;

import MARTE.MARTE_Foundations.GRM.impl.MutualExclusionResourceImpl;

import MARTE_Library.BasicNFP_Types.NFP_Boolean;
import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Integer;

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
 * An implementation of the model object '<em><b>Sa Shared Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaSharedResourceImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaSharedResourceImpl#getIsPreemp <em>Is Preemp</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaSharedResourceImpl#getIsConsum <em>Is Consum</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaSharedResourceImpl#getAcquisT <em>Acquis T</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaSharedResourceImpl#getReleaseT <em>Release T</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SaSharedResourceImpl extends MutualExclusionResourceImpl implements SaSharedResource {
	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected NFP_Integer capacity;

	/**
	 * The cached value of the '{@link #getIsPreemp() <em>Is Preemp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPreemp()
	 * @generated
	 * @ordered
	 */
	protected NFP_Boolean isPreemp;

	/**
	 * The cached value of the '{@link #getIsConsum() <em>Is Consum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConsum()
	 * @generated
	 * @ordered
	 */
	protected NFP_Boolean isConsum;

	/**
	 * The cached value of the '{@link #getAcquisT() <em>Acquis T</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcquisT()
	 * @generated
	 * @ordered
	 */
	protected EList acquisT;

	/**
	 * The cached value of the '{@link #getReleaseT() <em>Release T</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseT()
	 * @generated
	 * @ordered
	 */
	protected EList releaseT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaSharedResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SAMPackage.Literals.SA_SHARED_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Integer getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapacity(NFP_Integer newCapacity, NotificationChain msgs) {
		NFP_Integer oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_SHARED_RESOURCE__CAPACITY, oldCapacity, newCapacity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(NFP_Integer newCapacity) {
		if (newCapacity != capacity) {
			NotificationChain msgs = null;
			if (capacity != null)
				msgs = ((InternalEObject)capacity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_SHARED_RESOURCE__CAPACITY, null, msgs);
			if (newCapacity != null)
				msgs = ((InternalEObject)newCapacity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_SHARED_RESOURCE__CAPACITY, null, msgs);
			msgs = basicSetCapacity(newCapacity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_SHARED_RESOURCE__CAPACITY, newCapacity, newCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Boolean getIsPreemp() {
		return isPreemp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsPreemp(NFP_Boolean newIsPreemp, NotificationChain msgs) {
		NFP_Boolean oldIsPreemp = isPreemp;
		isPreemp = newIsPreemp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_SHARED_RESOURCE__IS_PREEMP, oldIsPreemp, newIsPreemp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPreemp(NFP_Boolean newIsPreemp) {
		if (newIsPreemp != isPreemp) {
			NotificationChain msgs = null;
			if (isPreemp != null)
				msgs = ((InternalEObject)isPreemp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_SHARED_RESOURCE__IS_PREEMP, null, msgs);
			if (newIsPreemp != null)
				msgs = ((InternalEObject)newIsPreemp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_SHARED_RESOURCE__IS_PREEMP, null, msgs);
			msgs = basicSetIsPreemp(newIsPreemp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_SHARED_RESOURCE__IS_PREEMP, newIsPreemp, newIsPreemp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Boolean getIsConsum() {
		return isConsum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsConsum(NFP_Boolean newIsConsum, NotificationChain msgs) {
		NFP_Boolean oldIsConsum = isConsum;
		isConsum = newIsConsum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_SHARED_RESOURCE__IS_CONSUM, oldIsConsum, newIsConsum);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConsum(NFP_Boolean newIsConsum) {
		if (newIsConsum != isConsum) {
			NotificationChain msgs = null;
			if (isConsum != null)
				msgs = ((InternalEObject)isConsum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_SHARED_RESOURCE__IS_CONSUM, null, msgs);
			if (newIsConsum != null)
				msgs = ((InternalEObject)newIsConsum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_SHARED_RESOURCE__IS_CONSUM, null, msgs);
			msgs = basicSetIsConsum(newIsConsum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_SHARED_RESOURCE__IS_CONSUM, newIsConsum, newIsConsum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAcquisT() {
		if (acquisT == null) {
			acquisT = new EObjectContainmentEList(NFP_Duration.class, this, SAMPackage.SA_SHARED_RESOURCE__ACQUIS_T);
		}
		return acquisT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReleaseT() {
		if (releaseT == null) {
			releaseT = new EObjectContainmentEList(NFP_Duration.class, this, SAMPackage.SA_SHARED_RESOURCE__RELEASE_T);
		}
		return releaseT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SAMPackage.SA_SHARED_RESOURCE__CAPACITY:
				return basicSetCapacity(null, msgs);
			case SAMPackage.SA_SHARED_RESOURCE__IS_PREEMP:
				return basicSetIsPreemp(null, msgs);
			case SAMPackage.SA_SHARED_RESOURCE__IS_CONSUM:
				return basicSetIsConsum(null, msgs);
			case SAMPackage.SA_SHARED_RESOURCE__ACQUIS_T:
				return ((InternalEList)getAcquisT()).basicRemove(otherEnd, msgs);
			case SAMPackage.SA_SHARED_RESOURCE__RELEASE_T:
				return ((InternalEList)getReleaseT()).basicRemove(otherEnd, msgs);
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
			case SAMPackage.SA_SHARED_RESOURCE__CAPACITY:
				return getCapacity();
			case SAMPackage.SA_SHARED_RESOURCE__IS_PREEMP:
				return getIsPreemp();
			case SAMPackage.SA_SHARED_RESOURCE__IS_CONSUM:
				return getIsConsum();
			case SAMPackage.SA_SHARED_RESOURCE__ACQUIS_T:
				return getAcquisT();
			case SAMPackage.SA_SHARED_RESOURCE__RELEASE_T:
				return getReleaseT();
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
			case SAMPackage.SA_SHARED_RESOURCE__CAPACITY:
				setCapacity((NFP_Integer)newValue);
				return;
			case SAMPackage.SA_SHARED_RESOURCE__IS_PREEMP:
				setIsPreemp((NFP_Boolean)newValue);
				return;
			case SAMPackage.SA_SHARED_RESOURCE__IS_CONSUM:
				setIsConsum((NFP_Boolean)newValue);
				return;
			case SAMPackage.SA_SHARED_RESOURCE__ACQUIS_T:
				getAcquisT().clear();
				getAcquisT().addAll((Collection)newValue);
				return;
			case SAMPackage.SA_SHARED_RESOURCE__RELEASE_T:
				getReleaseT().clear();
				getReleaseT().addAll((Collection)newValue);
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
			case SAMPackage.SA_SHARED_RESOURCE__CAPACITY:
				setCapacity((NFP_Integer)null);
				return;
			case SAMPackage.SA_SHARED_RESOURCE__IS_PREEMP:
				setIsPreemp((NFP_Boolean)null);
				return;
			case SAMPackage.SA_SHARED_RESOURCE__IS_CONSUM:
				setIsConsum((NFP_Boolean)null);
				return;
			case SAMPackage.SA_SHARED_RESOURCE__ACQUIS_T:
				getAcquisT().clear();
				return;
			case SAMPackage.SA_SHARED_RESOURCE__RELEASE_T:
				getReleaseT().clear();
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
			case SAMPackage.SA_SHARED_RESOURCE__CAPACITY:
				return capacity != null;
			case SAMPackage.SA_SHARED_RESOURCE__IS_PREEMP:
				return isPreemp != null;
			case SAMPackage.SA_SHARED_RESOURCE__IS_CONSUM:
				return isConsum != null;
			case SAMPackage.SA_SHARED_RESOURCE__ACQUIS_T:
				return acquisT != null && !acquisT.isEmpty();
			case SAMPackage.SA_SHARED_RESOURCE__RELEASE_T:
				return releaseT != null && !releaseT.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SaSharedResourceImpl
