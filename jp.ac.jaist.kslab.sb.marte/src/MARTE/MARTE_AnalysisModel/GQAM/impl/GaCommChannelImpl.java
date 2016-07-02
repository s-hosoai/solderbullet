/**
 */
package MARTE.MARTE_AnalysisModel.GQAM.impl;

import MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;
import MARTE.MARTE_AnalysisModel.GQAM.GaCommChannel;

import MARTE.MARTE_Foundations.GRM.impl.SchedulableResourceImpl;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;
import MARTE_Library.BasicNFP_Types.NFP_Real;

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
 * An implementation of the model object '<em><b>Ga Comm Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaCommChannelImpl#getPacketSize <em>Packet Size</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaCommChannelImpl#getUtlization <em>Utlization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GaCommChannelImpl extends SchedulableResourceImpl implements GaCommChannel {
	/**
	 * The cached value of the '{@link #getPacketSize() <em>Packet Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketSize()
	 * @generated
	 * @ordered
	 */
	protected NFP_DataSize packetSize;

	/**
	 * The cached value of the '{@link #getUtlization() <em>Utlization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtlization()
	 * @generated
	 * @ordered
	 */
	protected EList utlization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GaCommChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GQAMPackage.Literals.GA_COMM_CHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataSize getPacketSize() {
		return packetSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPacketSize(NFP_DataSize newPacketSize, NotificationChain msgs) {
		NFP_DataSize oldPacketSize = packetSize;
		packetSize = newPacketSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_COMM_CHANNEL__PACKET_SIZE, oldPacketSize, newPacketSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacketSize(NFP_DataSize newPacketSize) {
		if (newPacketSize != packetSize) {
			NotificationChain msgs = null;
			if (packetSize != null)
				msgs = ((InternalEObject)packetSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_COMM_CHANNEL__PACKET_SIZE, null, msgs);
			if (newPacketSize != null)
				msgs = ((InternalEObject)newPacketSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_COMM_CHANNEL__PACKET_SIZE, null, msgs);
			msgs = basicSetPacketSize(newPacketSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_COMM_CHANNEL__PACKET_SIZE, newPacketSize, newPacketSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUtlization() {
		if (utlization == null) {
			utlization = new EObjectContainmentEList(NFP_Real.class, this, GQAMPackage.GA_COMM_CHANNEL__UTLIZATION);
		}
		return utlization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GQAMPackage.GA_COMM_CHANNEL__PACKET_SIZE:
				return basicSetPacketSize(null, msgs);
			case GQAMPackage.GA_COMM_CHANNEL__UTLIZATION:
				return ((InternalEList)getUtlization()).basicRemove(otherEnd, msgs);
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
			case GQAMPackage.GA_COMM_CHANNEL__PACKET_SIZE:
				return getPacketSize();
			case GQAMPackage.GA_COMM_CHANNEL__UTLIZATION:
				return getUtlization();
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
			case GQAMPackage.GA_COMM_CHANNEL__PACKET_SIZE:
				setPacketSize((NFP_DataSize)newValue);
				return;
			case GQAMPackage.GA_COMM_CHANNEL__UTLIZATION:
				getUtlization().clear();
				getUtlization().addAll((Collection)newValue);
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
			case GQAMPackage.GA_COMM_CHANNEL__PACKET_SIZE:
				setPacketSize((NFP_DataSize)null);
				return;
			case GQAMPackage.GA_COMM_CHANNEL__UTLIZATION:
				getUtlization().clear();
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
			case GQAMPackage.GA_COMM_CHANNEL__PACKET_SIZE:
				return packetSize != null;
			case GQAMPackage.GA_COMM_CHANNEL__UTLIZATION:
				return utlization != null && !utlization.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GaCommChannelImpl
