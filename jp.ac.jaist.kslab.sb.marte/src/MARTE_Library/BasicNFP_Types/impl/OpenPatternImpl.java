/**
 */
package MARTE_Library.BasicNFP_Types.impl;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;
import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Frequency;
import MARTE_Library.BasicNFP_Types.OpenPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.OpenPatternImpl#getInterArrivalTime <em>Inter Arrival Time</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.OpenPatternImpl#getArrivalRate <em>Arrival Rate</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.OpenPatternImpl#getArrivalProcess <em>Arrival Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpenPatternImpl extends EObjectImpl implements OpenPattern {
	/**
	 * The cached value of the '{@link #getInterArrivalTime() <em>Inter Arrival Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration interArrivalTime;

	/**
	 * The cached value of the '{@link #getArrivalRate() <em>Arrival Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalRate()
	 * @generated
	 * @ordered
	 */
	protected NFP_Frequency arrivalRate;

	/**
	 * The default value of the '{@link #getArrivalProcess() <em>Arrival Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalProcess()
	 * @generated
	 * @ordered
	 */
	protected static final String ARRIVAL_PROCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArrivalProcess() <em>Arrival Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalProcess()
	 * @generated
	 * @ordered
	 */
	protected String arrivalProcess = ARRIVAL_PROCESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicNFP_TypesPackage.Literals.OPEN_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getInterArrivalTime() {
		return interArrivalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterArrivalTime(NFP_Duration newInterArrivalTime, NotificationChain msgs) {
		NFP_Duration oldInterArrivalTime = interArrivalTime;
		interArrivalTime = newInterArrivalTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.OPEN_PATTERN__INTER_ARRIVAL_TIME, oldInterArrivalTime, newInterArrivalTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterArrivalTime(NFP_Duration newInterArrivalTime) {
		if (newInterArrivalTime != interArrivalTime) {
			NotificationChain msgs = null;
			if (interArrivalTime != null)
				msgs = ((InternalEObject)interArrivalTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.OPEN_PATTERN__INTER_ARRIVAL_TIME, null, msgs);
			if (newInterArrivalTime != null)
				msgs = ((InternalEObject)newInterArrivalTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.OPEN_PATTERN__INTER_ARRIVAL_TIME, null, msgs);
			msgs = basicSetInterArrivalTime(newInterArrivalTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.OPEN_PATTERN__INTER_ARRIVAL_TIME, newInterArrivalTime, newInterArrivalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Frequency getArrivalRate() {
		return arrivalRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrivalRate(NFP_Frequency newArrivalRate, NotificationChain msgs) {
		NFP_Frequency oldArrivalRate = arrivalRate;
		arrivalRate = newArrivalRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.OPEN_PATTERN__ARRIVAL_RATE, oldArrivalRate, newArrivalRate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrivalRate(NFP_Frequency newArrivalRate) {
		if (newArrivalRate != arrivalRate) {
			NotificationChain msgs = null;
			if (arrivalRate != null)
				msgs = ((InternalEObject)arrivalRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.OPEN_PATTERN__ARRIVAL_RATE, null, msgs);
			if (newArrivalRate != null)
				msgs = ((InternalEObject)newArrivalRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.OPEN_PATTERN__ARRIVAL_RATE, null, msgs);
			msgs = basicSetArrivalRate(newArrivalRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.OPEN_PATTERN__ARRIVAL_RATE, newArrivalRate, newArrivalRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArrivalProcess() {
		return arrivalProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrivalProcess(String newArrivalProcess) {
		String oldArrivalProcess = arrivalProcess;
		arrivalProcess = newArrivalProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.OPEN_PATTERN__ARRIVAL_PROCESS, oldArrivalProcess, arrivalProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicNFP_TypesPackage.OPEN_PATTERN__INTER_ARRIVAL_TIME:
				return basicSetInterArrivalTime(null, msgs);
			case BasicNFP_TypesPackage.OPEN_PATTERN__ARRIVAL_RATE:
				return basicSetArrivalRate(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicNFP_TypesPackage.OPEN_PATTERN__INTER_ARRIVAL_TIME:
				return getInterArrivalTime();
			case BasicNFP_TypesPackage.OPEN_PATTERN__ARRIVAL_RATE:
				return getArrivalRate();
			case BasicNFP_TypesPackage.OPEN_PATTERN__ARRIVAL_PROCESS:
				return getArrivalProcess();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasicNFP_TypesPackage.OPEN_PATTERN__INTER_ARRIVAL_TIME:
				setInterArrivalTime((NFP_Duration)newValue);
				return;
			case BasicNFP_TypesPackage.OPEN_PATTERN__ARRIVAL_RATE:
				setArrivalRate((NFP_Frequency)newValue);
				return;
			case BasicNFP_TypesPackage.OPEN_PATTERN__ARRIVAL_PROCESS:
				setArrivalProcess((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BasicNFP_TypesPackage.OPEN_PATTERN__INTER_ARRIVAL_TIME:
				setInterArrivalTime((NFP_Duration)null);
				return;
			case BasicNFP_TypesPackage.OPEN_PATTERN__ARRIVAL_RATE:
				setArrivalRate((NFP_Frequency)null);
				return;
			case BasicNFP_TypesPackage.OPEN_PATTERN__ARRIVAL_PROCESS:
				setArrivalProcess(ARRIVAL_PROCESS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BasicNFP_TypesPackage.OPEN_PATTERN__INTER_ARRIVAL_TIME:
				return interArrivalTime != null;
			case BasicNFP_TypesPackage.OPEN_PATTERN__ARRIVAL_RATE:
				return arrivalRate != null;
			case BasicNFP_TypesPackage.OPEN_PATTERN__ARRIVAL_PROCESS:
				return ARRIVAL_PROCESS_EDEFAULT == null ? arrivalProcess != null : !ARRIVAL_PROCESS_EDEFAULT.equals(arrivalProcess);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (arrivalProcess: ");
		result.append(arrivalProcess);
		result.append(')');
		return result.toString();
	}

} //OpenPatternImpl
