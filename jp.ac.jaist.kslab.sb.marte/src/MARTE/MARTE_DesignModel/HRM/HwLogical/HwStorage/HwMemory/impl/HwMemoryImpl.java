/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.impl.HwResourceImpl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Timing;

import MARTE.MARTE_Foundations.GRM.GRMPackage;
import MARTE.MARTE_Foundations.GRM.StorageResource;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;
import MARTE_Library.BasicNFP_Types.NFP_DataTxRate;
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
 * An implementation of the model object '<em><b>Hw Memory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryImpl#getElementSize <em>Element Size</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryImpl#getMemorySize <em>Memory Size</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryImpl#getAdressSize <em>Adress Size</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryImpl#getTimings <em>Timings</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.impl.HwMemoryImpl#getThroughput <em>Throughput</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwMemoryImpl extends HwResourceImpl implements HwMemory {
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
	 * The cached value of the '{@link #getMemorySize() <em>Memory Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySize()
	 * @generated
	 * @ordered
	 */
	protected NFP_DataSize memorySize;

	/**
	 * The cached value of the '{@link #getAdressSize() <em>Adress Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdressSize()
	 * @generated
	 * @ordered
	 */
	protected NFP_DataSize adressSize;

	/**
	 * The cached value of the '{@link #getTimings() <em>Timings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimings()
	 * @generated
	 * @ordered
	 */
	protected EList timings;

	/**
	 * The cached value of the '{@link #getThroughput() <em>Throughput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected NFP_DataTxRate throughput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwMemoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwMemoryPackage.Literals.HW_MEMORY;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_MEMORY__ELEMENT_SIZE, oldElementSize, newElementSize);
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
				msgs = ((InternalEObject)elementSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_MEMORY__ELEMENT_SIZE, null, msgs);
			if (newElementSize != null)
				msgs = ((InternalEObject)newElementSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_MEMORY__ELEMENT_SIZE, null, msgs);
			msgs = basicSetElementSize(newElementSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_MEMORY__ELEMENT_SIZE, newElementSize, newElementSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataSize getMemorySize() {
		return memorySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemorySize(NFP_DataSize newMemorySize, NotificationChain msgs) {
		NFP_DataSize oldMemorySize = memorySize;
		memorySize = newMemorySize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_MEMORY__MEMORY_SIZE, oldMemorySize, newMemorySize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemorySize(NFP_DataSize newMemorySize) {
		if (newMemorySize != memorySize) {
			NotificationChain msgs = null;
			if (memorySize != null)
				msgs = ((InternalEObject)memorySize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_MEMORY__MEMORY_SIZE, null, msgs);
			if (newMemorySize != null)
				msgs = ((InternalEObject)newMemorySize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_MEMORY__MEMORY_SIZE, null, msgs);
			msgs = basicSetMemorySize(newMemorySize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_MEMORY__MEMORY_SIZE, newMemorySize, newMemorySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataSize getAdressSize() {
		return adressSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdressSize(NFP_DataSize newAdressSize, NotificationChain msgs) {
		NFP_DataSize oldAdressSize = adressSize;
		adressSize = newAdressSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_MEMORY__ADRESS_SIZE, oldAdressSize, newAdressSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdressSize(NFP_DataSize newAdressSize) {
		if (newAdressSize != adressSize) {
			NotificationChain msgs = null;
			if (adressSize != null)
				msgs = ((InternalEObject)adressSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_MEMORY__ADRESS_SIZE, null, msgs);
			if (newAdressSize != null)
				msgs = ((InternalEObject)newAdressSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_MEMORY__ADRESS_SIZE, null, msgs);
			msgs = basicSetAdressSize(newAdressSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_MEMORY__ADRESS_SIZE, newAdressSize, newAdressSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTimings() {
		if (timings == null) {
			timings = new EObjectContainmentEList(Timing.class, this, HwMemoryPackage.HW_MEMORY__TIMINGS);
		}
		return timings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataTxRate getThroughput() {
		return throughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThroughput(NFP_DataTxRate newThroughput, NotificationChain msgs) {
		NFP_DataTxRate oldThroughput = throughput;
		throughput = newThroughput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_MEMORY__THROUGHPUT, oldThroughput, newThroughput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughput(NFP_DataTxRate newThroughput) {
		if (newThroughput != throughput) {
			NotificationChain msgs = null;
			if (throughput != null)
				msgs = ((InternalEObject)throughput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_MEMORY__THROUGHPUT, null, msgs);
			if (newThroughput != null)
				msgs = ((InternalEObject)newThroughput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwMemoryPackage.HW_MEMORY__THROUGHPUT, null, msgs);
			msgs = basicSetThroughput(newThroughput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwMemoryPackage.HW_MEMORY__THROUGHPUT, newThroughput, newThroughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwMemoryPackage.HW_MEMORY__ELEMENT_SIZE:
				return basicSetElementSize(null, msgs);
			case HwMemoryPackage.HW_MEMORY__MEMORY_SIZE:
				return basicSetMemorySize(null, msgs);
			case HwMemoryPackage.HW_MEMORY__ADRESS_SIZE:
				return basicSetAdressSize(null, msgs);
			case HwMemoryPackage.HW_MEMORY__TIMINGS:
				return ((InternalEList)getTimings()).basicRemove(otherEnd, msgs);
			case HwMemoryPackage.HW_MEMORY__THROUGHPUT:
				return basicSetThroughput(null, msgs);
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
			case HwMemoryPackage.HW_MEMORY__ELEMENT_SIZE:
				return getElementSize();
			case HwMemoryPackage.HW_MEMORY__MEMORY_SIZE:
				return getMemorySize();
			case HwMemoryPackage.HW_MEMORY__ADRESS_SIZE:
				return getAdressSize();
			case HwMemoryPackage.HW_MEMORY__TIMINGS:
				return getTimings();
			case HwMemoryPackage.HW_MEMORY__THROUGHPUT:
				return getThroughput();
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
			case HwMemoryPackage.HW_MEMORY__ELEMENT_SIZE:
				setElementSize((NFP_Integer)newValue);
				return;
			case HwMemoryPackage.HW_MEMORY__MEMORY_SIZE:
				setMemorySize((NFP_DataSize)newValue);
				return;
			case HwMemoryPackage.HW_MEMORY__ADRESS_SIZE:
				setAdressSize((NFP_DataSize)newValue);
				return;
			case HwMemoryPackage.HW_MEMORY__TIMINGS:
				getTimings().clear();
				getTimings().addAll((Collection)newValue);
				return;
			case HwMemoryPackage.HW_MEMORY__THROUGHPUT:
				setThroughput((NFP_DataTxRate)newValue);
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
			case HwMemoryPackage.HW_MEMORY__ELEMENT_SIZE:
				setElementSize((NFP_Integer)null);
				return;
			case HwMemoryPackage.HW_MEMORY__MEMORY_SIZE:
				setMemorySize((NFP_DataSize)null);
				return;
			case HwMemoryPackage.HW_MEMORY__ADRESS_SIZE:
				setAdressSize((NFP_DataSize)null);
				return;
			case HwMemoryPackage.HW_MEMORY__TIMINGS:
				getTimings().clear();
				return;
			case HwMemoryPackage.HW_MEMORY__THROUGHPUT:
				setThroughput((NFP_DataTxRate)null);
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
			case HwMemoryPackage.HW_MEMORY__ELEMENT_SIZE:
				return elementSize != null;
			case HwMemoryPackage.HW_MEMORY__MEMORY_SIZE:
				return memorySize != null;
			case HwMemoryPackage.HW_MEMORY__ADRESS_SIZE:
				return adressSize != null;
			case HwMemoryPackage.HW_MEMORY__TIMINGS:
				return timings != null && !timings.isEmpty();
			case HwMemoryPackage.HW_MEMORY__THROUGHPUT:
				return throughput != null;
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
				case HwMemoryPackage.HW_MEMORY__ELEMENT_SIZE: return GRMPackage.STORAGE_RESOURCE__ELEMENT_SIZE;
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
				case GRMPackage.STORAGE_RESOURCE__ELEMENT_SIZE: return HwMemoryPackage.HW_MEMORY__ELEMENT_SIZE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //HwMemoryImpl
