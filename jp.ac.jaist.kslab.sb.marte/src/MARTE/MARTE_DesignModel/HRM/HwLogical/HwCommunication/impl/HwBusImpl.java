/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBus;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage;

import MARTE_Library.BasicNFP_Types.NFP_Boolean;
import MARTE_Library.BasicNFP_Types.NFP_DataSize;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwBusImpl#getAdressWidth <em>Adress Width</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwBusImpl#getWordWidth <em>Word Width</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwBusImpl#getIsSynchronous <em>Is Synchronous</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwBusImpl#getIsSerial <em>Is Serial</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwBusImpl extends HwMediaImpl implements HwBus {
	/**
	 * The cached value of the '{@link #getAdressWidth() <em>Adress Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdressWidth()
	 * @generated
	 * @ordered
	 */
	protected NFP_DataSize adressWidth;

	/**
	 * The cached value of the '{@link #getWordWidth() <em>Word Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordWidth()
	 * @generated
	 * @ordered
	 */
	protected NFP_DataSize wordWidth;

	/**
	 * The cached value of the '{@link #getIsSynchronous() <em>Is Synchronous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSynchronous()
	 * @generated
	 * @ordered
	 */
	protected NFP_Boolean isSynchronous;

	/**
	 * The cached value of the '{@link #getIsSerial() <em>Is Serial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSerial()
	 * @generated
	 * @ordered
	 */
	protected NFP_Boolean isSerial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwBusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwCommunicationPackage.Literals.HW_BUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataSize getAdressWidth() {
		return adressWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdressWidth(NFP_DataSize newAdressWidth, NotificationChain msgs) {
		NFP_DataSize oldAdressWidth = adressWidth;
		adressWidth = newAdressWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwCommunicationPackage.HW_BUS__ADRESS_WIDTH, oldAdressWidth, newAdressWidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdressWidth(NFP_DataSize newAdressWidth) {
		if (newAdressWidth != adressWidth) {
			NotificationChain msgs = null;
			if (adressWidth != null)
				msgs = ((InternalEObject)adressWidth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwCommunicationPackage.HW_BUS__ADRESS_WIDTH, null, msgs);
			if (newAdressWidth != null)
				msgs = ((InternalEObject)newAdressWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwCommunicationPackage.HW_BUS__ADRESS_WIDTH, null, msgs);
			msgs = basicSetAdressWidth(newAdressWidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwCommunicationPackage.HW_BUS__ADRESS_WIDTH, newAdressWidth, newAdressWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataSize getWordWidth() {
		return wordWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWordWidth(NFP_DataSize newWordWidth, NotificationChain msgs) {
		NFP_DataSize oldWordWidth = wordWidth;
		wordWidth = newWordWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwCommunicationPackage.HW_BUS__WORD_WIDTH, oldWordWidth, newWordWidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWordWidth(NFP_DataSize newWordWidth) {
		if (newWordWidth != wordWidth) {
			NotificationChain msgs = null;
			if (wordWidth != null)
				msgs = ((InternalEObject)wordWidth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwCommunicationPackage.HW_BUS__WORD_WIDTH, null, msgs);
			if (newWordWidth != null)
				msgs = ((InternalEObject)newWordWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwCommunicationPackage.HW_BUS__WORD_WIDTH, null, msgs);
			msgs = basicSetWordWidth(newWordWidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwCommunicationPackage.HW_BUS__WORD_WIDTH, newWordWidth, newWordWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Boolean getIsSynchronous() {
		return isSynchronous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsSynchronous(NFP_Boolean newIsSynchronous, NotificationChain msgs) {
		NFP_Boolean oldIsSynchronous = isSynchronous;
		isSynchronous = newIsSynchronous;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwCommunicationPackage.HW_BUS__IS_SYNCHRONOUS, oldIsSynchronous, newIsSynchronous);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSynchronous(NFP_Boolean newIsSynchronous) {
		if (newIsSynchronous != isSynchronous) {
			NotificationChain msgs = null;
			if (isSynchronous != null)
				msgs = ((InternalEObject)isSynchronous).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwCommunicationPackage.HW_BUS__IS_SYNCHRONOUS, null, msgs);
			if (newIsSynchronous != null)
				msgs = ((InternalEObject)newIsSynchronous).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwCommunicationPackage.HW_BUS__IS_SYNCHRONOUS, null, msgs);
			msgs = basicSetIsSynchronous(newIsSynchronous, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwCommunicationPackage.HW_BUS__IS_SYNCHRONOUS, newIsSynchronous, newIsSynchronous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Boolean getIsSerial() {
		return isSerial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsSerial(NFP_Boolean newIsSerial, NotificationChain msgs) {
		NFP_Boolean oldIsSerial = isSerial;
		isSerial = newIsSerial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwCommunicationPackage.HW_BUS__IS_SERIAL, oldIsSerial, newIsSerial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSerial(NFP_Boolean newIsSerial) {
		if (newIsSerial != isSerial) {
			NotificationChain msgs = null;
			if (isSerial != null)
				msgs = ((InternalEObject)isSerial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwCommunicationPackage.HW_BUS__IS_SERIAL, null, msgs);
			if (newIsSerial != null)
				msgs = ((InternalEObject)newIsSerial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwCommunicationPackage.HW_BUS__IS_SERIAL, null, msgs);
			msgs = basicSetIsSerial(newIsSerial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwCommunicationPackage.HW_BUS__IS_SERIAL, newIsSerial, newIsSerial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwCommunicationPackage.HW_BUS__ADRESS_WIDTH:
				return basicSetAdressWidth(null, msgs);
			case HwCommunicationPackage.HW_BUS__WORD_WIDTH:
				return basicSetWordWidth(null, msgs);
			case HwCommunicationPackage.HW_BUS__IS_SYNCHRONOUS:
				return basicSetIsSynchronous(null, msgs);
			case HwCommunicationPackage.HW_BUS__IS_SERIAL:
				return basicSetIsSerial(null, msgs);
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
			case HwCommunicationPackage.HW_BUS__ADRESS_WIDTH:
				return getAdressWidth();
			case HwCommunicationPackage.HW_BUS__WORD_WIDTH:
				return getWordWidth();
			case HwCommunicationPackage.HW_BUS__IS_SYNCHRONOUS:
				return getIsSynchronous();
			case HwCommunicationPackage.HW_BUS__IS_SERIAL:
				return getIsSerial();
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
			case HwCommunicationPackage.HW_BUS__ADRESS_WIDTH:
				setAdressWidth((NFP_DataSize)newValue);
				return;
			case HwCommunicationPackage.HW_BUS__WORD_WIDTH:
				setWordWidth((NFP_DataSize)newValue);
				return;
			case HwCommunicationPackage.HW_BUS__IS_SYNCHRONOUS:
				setIsSynchronous((NFP_Boolean)newValue);
				return;
			case HwCommunicationPackage.HW_BUS__IS_SERIAL:
				setIsSerial((NFP_Boolean)newValue);
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
			case HwCommunicationPackage.HW_BUS__ADRESS_WIDTH:
				setAdressWidth((NFP_DataSize)null);
				return;
			case HwCommunicationPackage.HW_BUS__WORD_WIDTH:
				setWordWidth((NFP_DataSize)null);
				return;
			case HwCommunicationPackage.HW_BUS__IS_SYNCHRONOUS:
				setIsSynchronous((NFP_Boolean)null);
				return;
			case HwCommunicationPackage.HW_BUS__IS_SERIAL:
				setIsSerial((NFP_Boolean)null);
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
			case HwCommunicationPackage.HW_BUS__ADRESS_WIDTH:
				return adressWidth != null;
			case HwCommunicationPackage.HW_BUS__WORD_WIDTH:
				return wordWidth != null;
			case HwCommunicationPackage.HW_BUS__IS_SYNCHRONOUS:
				return isSynchronous != null;
			case HwCommunicationPackage.HW_BUS__IS_SERIAL:
				return isSerial != null;
		}
		return super.eIsSet(featureID);
	}

} //HwBusImpl
