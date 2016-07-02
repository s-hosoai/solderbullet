/**
 */
package MARTE.MARTE_Foundations.GRM.impl;

import MARTE.MARTE_Foundations.GRM.CommunicationEndPoint;
import MARTE.MARTE_Foundations.GRM.GRMPackage;

import MARTE_Library.BasicNFP_Types.NFP_Integer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication End Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.CommunicationEndPointImpl#getPacketSize <em>Packet Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationEndPointImpl extends ResourceImpl implements CommunicationEndPoint {
	/**
	 * The cached value of the '{@link #getPacketSize() <em>Packet Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketSize()
	 * @generated
	 * @ordered
	 */
	protected NFP_Integer packetSize;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationEndPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GRMPackage.Literals.COMMUNICATION_END_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Integer getPacketSize() {
		return packetSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPacketSize(NFP_Integer newPacketSize, NotificationChain msgs) {
		NFP_Integer oldPacketSize = packetSize;
		packetSize = newPacketSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRMPackage.COMMUNICATION_END_POINT__PACKET_SIZE, oldPacketSize, newPacketSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacketSize(NFP_Integer newPacketSize) {
		if (newPacketSize != packetSize) {
			NotificationChain msgs = null;
			if (packetSize != null)
				msgs = ((InternalEObject)packetSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GRMPackage.COMMUNICATION_END_POINT__PACKET_SIZE, null, msgs);
			if (newPacketSize != null)
				msgs = ((InternalEObject)newPacketSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GRMPackage.COMMUNICATION_END_POINT__PACKET_SIZE, null, msgs);
			msgs = basicSetPacketSize(newPacketSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRMPackage.COMMUNICATION_END_POINT__PACKET_SIZE, newPacketSize, newPacketSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRMPackage.COMMUNICATION_END_POINT__PACKET_SIZE:
				return basicSetPacketSize(null, msgs);
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
			case GRMPackage.COMMUNICATION_END_POINT__PACKET_SIZE:
				return getPacketSize();
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
			case GRMPackage.COMMUNICATION_END_POINT__PACKET_SIZE:
				setPacketSize((NFP_Integer)newValue);
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
			case GRMPackage.COMMUNICATION_END_POINT__PACKET_SIZE:
				setPacketSize((NFP_Integer)null);
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
			case GRMPackage.COMMUNICATION_END_POINT__PACKET_SIZE:
				return packetSize != null;
		}
		return super.eIsSet(featureID);
	}

} //CommunicationEndPointImpl
