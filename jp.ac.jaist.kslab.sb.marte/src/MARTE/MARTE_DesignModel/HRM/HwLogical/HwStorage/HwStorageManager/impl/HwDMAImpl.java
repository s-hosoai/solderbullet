/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.impl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwArbiter;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationResource;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwDMA;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerPackage;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;
import MARTE_Library.BasicNFP_Types.NFP_Natural;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw DMA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.impl.HwDMAImpl#getControlledMedias <em>Controlled Medias</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.impl.HwDMAImpl#getNbChannels <em>Nb Channels</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.impl.HwDMAImpl#getTransferWidth <em>Transfer Width</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.impl.HwDMAImpl#getDrivenBy <em>Driven By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwDMAImpl extends HwStorageManagerImpl implements HwDMA {
	/**
	 * The cached value of the '{@link #getControlledMedias() <em>Controlled Medias</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlledMedias()
	 * @generated
	 * @ordered
	 */
	protected EList controlledMedias;

	/**
	 * The cached value of the '{@link #getNbChannels() <em>Nb Channels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbChannels()
	 * @generated
	 * @ordered
	 */
	protected NFP_Natural nbChannels;

	/**
	 * The cached value of the '{@link #getTransferWidth() <em>Transfer Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferWidth()
	 * @generated
	 * @ordered
	 */
	protected NFP_DataSize transferWidth;

	/**
	 * The cached value of the '{@link #getDrivenBy() <em>Driven By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivenBy()
	 * @generated
	 * @ordered
	 */
	protected EList drivenBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwDMAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwStorageManagerPackage.Literals.HW_DMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getControlledMedias() {
		if (controlledMedias == null) {
			controlledMedias = new EObjectWithInverseResolvingEList.ManyInverse(HwMedia.class, this, HwStorageManagerPackage.HW_DMA__CONTROLLED_MEDIAS, HwCommunicationPackage.HW_MEDIA__ARBITERS);
		}
		return controlledMedias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Natural getNbChannels() {
		return nbChannels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNbChannels(NFP_Natural newNbChannels, NotificationChain msgs) {
		NFP_Natural oldNbChannels = nbChannels;
		nbChannels = newNbChannels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwStorageManagerPackage.HW_DMA__NB_CHANNELS, oldNbChannels, newNbChannels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbChannels(NFP_Natural newNbChannels) {
		if (newNbChannels != nbChannels) {
			NotificationChain msgs = null;
			if (nbChannels != null)
				msgs = ((InternalEObject)nbChannels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwStorageManagerPackage.HW_DMA__NB_CHANNELS, null, msgs);
			if (newNbChannels != null)
				msgs = ((InternalEObject)newNbChannels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwStorageManagerPackage.HW_DMA__NB_CHANNELS, null, msgs);
			msgs = basicSetNbChannels(newNbChannels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwStorageManagerPackage.HW_DMA__NB_CHANNELS, newNbChannels, newNbChannels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataSize getTransferWidth() {
		return transferWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransferWidth(NFP_DataSize newTransferWidth, NotificationChain msgs) {
		NFP_DataSize oldTransferWidth = transferWidth;
		transferWidth = newTransferWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwStorageManagerPackage.HW_DMA__TRANSFER_WIDTH, oldTransferWidth, newTransferWidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferWidth(NFP_DataSize newTransferWidth) {
		if (newTransferWidth != transferWidth) {
			NotificationChain msgs = null;
			if (transferWidth != null)
				msgs = ((InternalEObject)transferWidth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwStorageManagerPackage.HW_DMA__TRANSFER_WIDTH, null, msgs);
			if (newTransferWidth != null)
				msgs = ((InternalEObject)newTransferWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwStorageManagerPackage.HW_DMA__TRANSFER_WIDTH, null, msgs);
			msgs = basicSetTransferWidth(newTransferWidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwStorageManagerPackage.HW_DMA__TRANSFER_WIDTH, newTransferWidth, newTransferWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDrivenBy() {
		if (drivenBy == null) {
			drivenBy = new EObjectResolvingEList(HwProcessor.class, this, HwStorageManagerPackage.HW_DMA__DRIVEN_BY);
		}
		return drivenBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwStorageManagerPackage.HW_DMA__CONTROLLED_MEDIAS:
				return ((InternalEList)getControlledMedias()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwStorageManagerPackage.HW_DMA__CONTROLLED_MEDIAS:
				return ((InternalEList)getControlledMedias()).basicRemove(otherEnd, msgs);
			case HwStorageManagerPackage.HW_DMA__NB_CHANNELS:
				return basicSetNbChannels(null, msgs);
			case HwStorageManagerPackage.HW_DMA__TRANSFER_WIDTH:
				return basicSetTransferWidth(null, msgs);
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
			case HwStorageManagerPackage.HW_DMA__CONTROLLED_MEDIAS:
				return getControlledMedias();
			case HwStorageManagerPackage.HW_DMA__NB_CHANNELS:
				return getNbChannels();
			case HwStorageManagerPackage.HW_DMA__TRANSFER_WIDTH:
				return getTransferWidth();
			case HwStorageManagerPackage.HW_DMA__DRIVEN_BY:
				return getDrivenBy();
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
			case HwStorageManagerPackage.HW_DMA__CONTROLLED_MEDIAS:
				getControlledMedias().clear();
				getControlledMedias().addAll((Collection)newValue);
				return;
			case HwStorageManagerPackage.HW_DMA__NB_CHANNELS:
				setNbChannels((NFP_Natural)newValue);
				return;
			case HwStorageManagerPackage.HW_DMA__TRANSFER_WIDTH:
				setTransferWidth((NFP_DataSize)newValue);
				return;
			case HwStorageManagerPackage.HW_DMA__DRIVEN_BY:
				getDrivenBy().clear();
				getDrivenBy().addAll((Collection)newValue);
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
			case HwStorageManagerPackage.HW_DMA__CONTROLLED_MEDIAS:
				getControlledMedias().clear();
				return;
			case HwStorageManagerPackage.HW_DMA__NB_CHANNELS:
				setNbChannels((NFP_Natural)null);
				return;
			case HwStorageManagerPackage.HW_DMA__TRANSFER_WIDTH:
				setTransferWidth((NFP_DataSize)null);
				return;
			case HwStorageManagerPackage.HW_DMA__DRIVEN_BY:
				getDrivenBy().clear();
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
			case HwStorageManagerPackage.HW_DMA__CONTROLLED_MEDIAS:
				return controlledMedias != null && !controlledMedias.isEmpty();
			case HwStorageManagerPackage.HW_DMA__NB_CHANNELS:
				return nbChannels != null;
			case HwStorageManagerPackage.HW_DMA__TRANSFER_WIDTH:
				return transferWidth != null;
			case HwStorageManagerPackage.HW_DMA__DRIVEN_BY:
				return drivenBy != null && !drivenBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == HwCommunicationResource.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == HwArbiter.class) {
			switch (derivedFeatureID) {
				case HwStorageManagerPackage.HW_DMA__CONTROLLED_MEDIAS: return HwCommunicationPackage.HW_ARBITER__CONTROLLED_MEDIAS;
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
		if (baseClass == HwCommunicationResource.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == HwArbiter.class) {
			switch (baseFeatureID) {
				case HwCommunicationPackage.HW_ARBITER__CONTROLLED_MEDIAS: return HwStorageManagerPackage.HW_DMA__CONTROLLED_MEDIAS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //HwDMAImpl
