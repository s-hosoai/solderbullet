/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl;

import MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage;
import MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwCommunicationResource;

import MARTE.MARTE_Foundations.GRM.CommunicationMedia;
import MARTE.MARTE_Foundations.GRM.GRMPackage;
import MARTE.MARTE_Foundations.GRM.ProcessingResource;
import MARTE.MARTE_Foundations.GRM.Scheduler;

import MARTE_Library.BasicNFP_Types.NFP_DataTxRate;
import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Integer;
import MARTE_Library.BasicNFP_Types.NFP_Real;

import MARTE_Library.MARTE_DataTypes.TransmModeKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Connector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sw Communication Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.SwCommunicationResourceImpl#getSpeedFactor <em>Speed Factor</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.SwCommunicationResourceImpl#getMainScheduler <em>Main Scheduler</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.SwCommunicationResourceImpl#getElementSize <em>Element Size</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.SwCommunicationResourceImpl#getBase_Connector <em>Base Connector</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.SwCommunicationResourceImpl#getTransmMode <em>Transm Mode</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.SwCommunicationResourceImpl#getBlockT <em>Block T</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.SwCommunicationResourceImpl#getPacketT <em>Packet T</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.SwCommunicationResourceImpl#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SwCommunicationResourceImpl extends SwInteractionResourceImpl implements SwCommunicationResource {
	/**
	 * The cached value of the '{@link #getSpeedFactor() <em>Speed Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected NFP_Real speedFactor;

	/**
	 * The cached value of the '{@link #getMainScheduler() <em>Main Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainScheduler()
	 * @generated
	 * @ordered
	 */
	protected Scheduler mainScheduler;

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
	 * The cached value of the '{@link #getBase_Connector() <em>Base Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Connector()
	 * @generated
	 * @ordered
	 */
	protected Connector base_Connector;

	/**
	 * The default value of the '{@link #getTransmMode() <em>Transm Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmMode()
	 * @generated
	 * @ordered
	 */
	protected static final TransmModeKind TRANSM_MODE_EDEFAULT = TransmModeKind.SIMPLEX;

	/**
	 * The cached value of the '{@link #getTransmMode() <em>Transm Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmMode()
	 * @generated
	 * @ordered
	 */
	protected TransmModeKind transmMode = TRANSM_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBlockT() <em>Block T</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockT()
	 * @generated
	 * @ordered
	 */
	protected EList blockT;

	/**
	 * The cached value of the '{@link #getPacketT() <em>Packet T</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketT()
	 * @generated
	 * @ordered
	 */
	protected EList packetT;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected EList capacity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwCommunicationResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SW_InteractionPackage.Literals.SW_COMMUNICATION_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Real getSpeedFactor() {
		return speedFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeedFactor(NFP_Real newSpeedFactor, NotificationChain msgs) {
		NFP_Real oldSpeedFactor = speedFactor;
		speedFactor = newSpeedFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__SPEED_FACTOR, oldSpeedFactor, newSpeedFactor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeedFactor(NFP_Real newSpeedFactor) {
		if (newSpeedFactor != speedFactor) {
			NotificationChain msgs = null;
			if (speedFactor != null)
				msgs = ((InternalEObject)speedFactor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__SPEED_FACTOR, null, msgs);
			if (newSpeedFactor != null)
				msgs = ((InternalEObject)newSpeedFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__SPEED_FACTOR, null, msgs);
			msgs = basicSetSpeedFactor(newSpeedFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__SPEED_FACTOR, newSpeedFactor, newSpeedFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler getMainScheduler() {
		if (mainScheduler != null && mainScheduler.eIsProxy()) {
			InternalEObject oldMainScheduler = (InternalEObject)mainScheduler;
			mainScheduler = (Scheduler)eResolveProxy(oldMainScheduler);
			if (mainScheduler != oldMainScheduler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__MAIN_SCHEDULER, oldMainScheduler, mainScheduler));
			}
		}
		return mainScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler basicGetMainScheduler() {
		return mainScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainScheduler(Scheduler newMainScheduler) {
		Scheduler oldMainScheduler = mainScheduler;
		mainScheduler = newMainScheduler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__MAIN_SCHEDULER, oldMainScheduler, mainScheduler));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__ELEMENT_SIZE, oldElementSize, newElementSize);
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
				msgs = ((InternalEObject)elementSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__ELEMENT_SIZE, null, msgs);
			if (newElementSize != null)
				msgs = ((InternalEObject)newElementSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__ELEMENT_SIZE, null, msgs);
			msgs = basicSetElementSize(newElementSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__ELEMENT_SIZE, newElementSize, newElementSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getBase_Connector() {
		if (base_Connector != null && base_Connector.eIsProxy()) {
			InternalEObject oldBase_Connector = (InternalEObject)base_Connector;
			base_Connector = (Connector)eResolveProxy(oldBase_Connector);
			if (base_Connector != oldBase_Connector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__BASE_CONNECTOR, oldBase_Connector, base_Connector));
			}
		}
		return base_Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetBase_Connector() {
		return base_Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Connector(Connector newBase_Connector) {
		Connector oldBase_Connector = base_Connector;
		base_Connector = newBase_Connector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__BASE_CONNECTOR, oldBase_Connector, base_Connector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmModeKind getTransmMode() {
		return transmMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmMode(TransmModeKind newTransmMode) {
		TransmModeKind oldTransmMode = transmMode;
		transmMode = newTransmMode == null ? TRANSM_MODE_EDEFAULT : newTransmMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__TRANSM_MODE, oldTransmMode, transmMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBlockT() {
		if (blockT == null) {
			blockT = new EObjectContainmentEList(NFP_Duration.class, this, SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__BLOCK_T);
		}
		return blockT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPacketT() {
		if (packetT == null) {
			packetT = new EObjectContainmentEList(NFP_Duration.class, this, SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__PACKET_T);
		}
		return packetT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCapacity() {
		if (capacity == null) {
			capacity = new EObjectContainmentEList(NFP_DataTxRate.class, this, SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__CAPACITY);
		}
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__SPEED_FACTOR:
				return basicSetSpeedFactor(null, msgs);
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__ELEMENT_SIZE:
				return basicSetElementSize(null, msgs);
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__BLOCK_T:
				return ((InternalEList)getBlockT()).basicRemove(otherEnd, msgs);
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__PACKET_T:
				return ((InternalEList)getPacketT()).basicRemove(otherEnd, msgs);
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__CAPACITY:
				return ((InternalEList)getCapacity()).basicRemove(otherEnd, msgs);
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
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__SPEED_FACTOR:
				return getSpeedFactor();
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__MAIN_SCHEDULER:
				if (resolve) return getMainScheduler();
				return basicGetMainScheduler();
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__ELEMENT_SIZE:
				return getElementSize();
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__BASE_CONNECTOR:
				if (resolve) return getBase_Connector();
				return basicGetBase_Connector();
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__TRANSM_MODE:
				return getTransmMode();
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__BLOCK_T:
				return getBlockT();
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__PACKET_T:
				return getPacketT();
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__CAPACITY:
				return getCapacity();
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
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__SPEED_FACTOR:
				setSpeedFactor((NFP_Real)newValue);
				return;
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__MAIN_SCHEDULER:
				setMainScheduler((Scheduler)newValue);
				return;
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__ELEMENT_SIZE:
				setElementSize((NFP_Integer)newValue);
				return;
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__BASE_CONNECTOR:
				setBase_Connector((Connector)newValue);
				return;
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__TRANSM_MODE:
				setTransmMode((TransmModeKind)newValue);
				return;
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__BLOCK_T:
				getBlockT().clear();
				getBlockT().addAll((Collection)newValue);
				return;
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__PACKET_T:
				getPacketT().clear();
				getPacketT().addAll((Collection)newValue);
				return;
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__CAPACITY:
				getCapacity().clear();
				getCapacity().addAll((Collection)newValue);
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
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__SPEED_FACTOR:
				setSpeedFactor((NFP_Real)null);
				return;
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__MAIN_SCHEDULER:
				setMainScheduler((Scheduler)null);
				return;
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__ELEMENT_SIZE:
				setElementSize((NFP_Integer)null);
				return;
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__BASE_CONNECTOR:
				setBase_Connector((Connector)null);
				return;
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__TRANSM_MODE:
				setTransmMode(TRANSM_MODE_EDEFAULT);
				return;
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__BLOCK_T:
				getBlockT().clear();
				return;
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__PACKET_T:
				getPacketT().clear();
				return;
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__CAPACITY:
				getCapacity().clear();
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
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__SPEED_FACTOR:
				return speedFactor != null;
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__MAIN_SCHEDULER:
				return mainScheduler != null;
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__ELEMENT_SIZE:
				return elementSize != null;
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__BASE_CONNECTOR:
				return base_Connector != null;
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__TRANSM_MODE:
				return transmMode != TRANSM_MODE_EDEFAULT;
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__BLOCK_T:
				return blockT != null && !blockT.isEmpty();
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__PACKET_T:
				return packetT != null && !packetT.isEmpty();
			case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__CAPACITY:
				return capacity != null && !capacity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ProcessingResource.class) {
			switch (derivedFeatureID) {
				case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__SPEED_FACTOR: return GRMPackage.PROCESSING_RESOURCE__SPEED_FACTOR;
				case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__MAIN_SCHEDULER: return GRMPackage.PROCESSING_RESOURCE__MAIN_SCHEDULER;
				default: return -1;
			}
		}
		if (baseClass == CommunicationMedia.class) {
			switch (derivedFeatureID) {
				case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__ELEMENT_SIZE: return GRMPackage.COMMUNICATION_MEDIA__ELEMENT_SIZE;
				case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__BASE_CONNECTOR: return GRMPackage.COMMUNICATION_MEDIA__BASE_CONNECTOR;
				case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__TRANSM_MODE: return GRMPackage.COMMUNICATION_MEDIA__TRANSM_MODE;
				case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__BLOCK_T: return GRMPackage.COMMUNICATION_MEDIA__BLOCK_T;
				case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__PACKET_T: return GRMPackage.COMMUNICATION_MEDIA__PACKET_T;
				case SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__CAPACITY: return GRMPackage.COMMUNICATION_MEDIA__CAPACITY;
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
		if (baseClass == ProcessingResource.class) {
			switch (baseFeatureID) {
				case GRMPackage.PROCESSING_RESOURCE__SPEED_FACTOR: return SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__SPEED_FACTOR;
				case GRMPackage.PROCESSING_RESOURCE__MAIN_SCHEDULER: return SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__MAIN_SCHEDULER;
				default: return -1;
			}
		}
		if (baseClass == CommunicationMedia.class) {
			switch (baseFeatureID) {
				case GRMPackage.COMMUNICATION_MEDIA__ELEMENT_SIZE: return SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__ELEMENT_SIZE;
				case GRMPackage.COMMUNICATION_MEDIA__BASE_CONNECTOR: return SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__BASE_CONNECTOR;
				case GRMPackage.COMMUNICATION_MEDIA__TRANSM_MODE: return SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__TRANSM_MODE;
				case GRMPackage.COMMUNICATION_MEDIA__BLOCK_T: return SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__BLOCK_T;
				case GRMPackage.COMMUNICATION_MEDIA__PACKET_T: return SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__PACKET_T;
				case GRMPackage.COMMUNICATION_MEDIA__CAPACITY: return SW_InteractionPackage.SW_COMMUNICATION_RESOURCE__CAPACITY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (transmMode: ");
		result.append(transmMode);
		result.append(')');
		return result.toString();
	}

} //SwCommunicationResourceImpl
