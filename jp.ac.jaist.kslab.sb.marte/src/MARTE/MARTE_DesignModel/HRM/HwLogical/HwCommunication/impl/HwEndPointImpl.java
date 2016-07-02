/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwEndPoint;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia;

import MARTE.MARTE_Foundations.GRM.CommunicationEndPoint;
import MARTE.MARTE_Foundations.GRM.GRMPackage;

import MARTE_Library.BasicNFP_Types.NFP_Integer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw End Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwEndPointImpl#getPacketSize <em>Packet Size</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.impl.HwEndPointImpl#getConnectedTo <em>Connected To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwEndPointImpl extends HwCommunicationResourceImpl implements HwEndPoint {
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
	 * The cached value of the '{@link #getConnectedTo() <em>Connected To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedTo()
	 * @generated
	 * @ordered
	 */
	protected EList connectedTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwEndPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwCommunicationPackage.Literals.HW_END_POINT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwCommunicationPackage.HW_END_POINT__PACKET_SIZE, oldPacketSize, newPacketSize);
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
				msgs = ((InternalEObject)packetSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwCommunicationPackage.HW_END_POINT__PACKET_SIZE, null, msgs);
			if (newPacketSize != null)
				msgs = ((InternalEObject)newPacketSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwCommunicationPackage.HW_END_POINT__PACKET_SIZE, null, msgs);
			msgs = basicSetPacketSize(newPacketSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwCommunicationPackage.HW_END_POINT__PACKET_SIZE, newPacketSize, newPacketSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConnectedTo() {
		if (connectedTo == null) {
			connectedTo = new EObjectResolvingEList(HwMedia.class, this, HwCommunicationPackage.HW_END_POINT__CONNECTED_TO);
		}
		return connectedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwCommunicationPackage.HW_END_POINT__PACKET_SIZE:
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
			case HwCommunicationPackage.HW_END_POINT__PACKET_SIZE:
				return getPacketSize();
			case HwCommunicationPackage.HW_END_POINT__CONNECTED_TO:
				return getConnectedTo();
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
			case HwCommunicationPackage.HW_END_POINT__PACKET_SIZE:
				setPacketSize((NFP_Integer)newValue);
				return;
			case HwCommunicationPackage.HW_END_POINT__CONNECTED_TO:
				getConnectedTo().clear();
				getConnectedTo().addAll((Collection)newValue);
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
			case HwCommunicationPackage.HW_END_POINT__PACKET_SIZE:
				setPacketSize((NFP_Integer)null);
				return;
			case HwCommunicationPackage.HW_END_POINT__CONNECTED_TO:
				getConnectedTo().clear();
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
			case HwCommunicationPackage.HW_END_POINT__PACKET_SIZE:
				return packetSize != null;
			case HwCommunicationPackage.HW_END_POINT__CONNECTED_TO:
				return connectedTo != null && !connectedTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == CommunicationEndPoint.class) {
			switch (derivedFeatureID) {
				case HwCommunicationPackage.HW_END_POINT__PACKET_SIZE: return GRMPackage.COMMUNICATION_END_POINT__PACKET_SIZE;
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
		if (baseClass == CommunicationEndPoint.class) {
			switch (baseFeatureID) {
				case GRMPackage.COMMUNICATION_END_POINT__PACKET_SIZE: return HwCommunicationPackage.HW_END_POINT__PACKET_SIZE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //HwEndPointImpl
