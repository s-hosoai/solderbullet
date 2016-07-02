/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingResource;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Organization;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Technology;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM;

import MARTE_Library.BasicNFP_Types.NFP_Natural;

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
 * An implementation of the model object '<em><b>Hw PLD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwPLDImpl#getTechnology <em>Technology</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwPLDImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwPLDImpl#getNbLUTs <em>Nb LU Ts</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwPLDImpl#getNdLUT_Inputs <em>Nd LUT Inputs</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwPLDImpl#getNbFlipFlops <em>Nb Flip Flops</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwPLDImpl#getBlocksRAM <em>Blocks RAM</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwPLDImpl#getBlocksComputing <em>Blocks Computing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwPLDImpl extends HwComputingResourceImpl implements HwPLD {
	/**
	 * The default value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final PLD_Technology TECHNOLOGY_EDEFAULT = PLD_Technology.SRAM_LITERAL;

	/**
	 * The cached value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected PLD_Technology technology = TECHNOLOGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected PLD_Organization organization;

	/**
	 * The cached value of the '{@link #getNbLUTs() <em>Nb LU Ts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbLUTs()
	 * @generated
	 * @ordered
	 */
	protected NFP_Natural nbLUTs;

	/**
	 * The cached value of the '{@link #getNdLUT_Inputs() <em>Nd LUT Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNdLUT_Inputs()
	 * @generated
	 * @ordered
	 */
	protected NFP_Natural ndLUT_Inputs;

	/**
	 * The cached value of the '{@link #getNbFlipFlops() <em>Nb Flip Flops</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbFlipFlops()
	 * @generated
	 * @ordered
	 */
	protected NFP_Natural nbFlipFlops;

	/**
	 * The cached value of the '{@link #getBlocksRAM() <em>Blocks RAM</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocksRAM()
	 * @generated
	 * @ordered
	 */
	protected EList blocksRAM;

	/**
	 * The cached value of the '{@link #getBlocksComputing() <em>Blocks Computing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocksComputing()
	 * @generated
	 * @ordered
	 */
	protected EList blocksComputing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwPLDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwComputingPackage.Literals.HW_PLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLD_Technology getTechnology() {
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnology(PLD_Technology newTechnology) {
		PLD_Technology oldTechnology = technology;
		technology = newTechnology == null ? TECHNOLOGY_EDEFAULT : newTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_PLD__TECHNOLOGY, oldTechnology, technology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLD_Organization getOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(PLD_Organization newOrganization, NotificationChain msgs) {
		PLD_Organization oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_PLD__ORGANIZATION, oldOrganization, newOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(PLD_Organization newOrganization) {
		if (newOrganization != organization) {
			NotificationChain msgs = null;
			if (organization != null)
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_PLD__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_PLD__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_PLD__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Natural getNbLUTs() {
		return nbLUTs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNbLUTs(NFP_Natural newNbLUTs, NotificationChain msgs) {
		NFP_Natural oldNbLUTs = nbLUTs;
		nbLUTs = newNbLUTs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_PLD__NB_LU_TS, oldNbLUTs, newNbLUTs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbLUTs(NFP_Natural newNbLUTs) {
		if (newNbLUTs != nbLUTs) {
			NotificationChain msgs = null;
			if (nbLUTs != null)
				msgs = ((InternalEObject)nbLUTs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_PLD__NB_LU_TS, null, msgs);
			if (newNbLUTs != null)
				msgs = ((InternalEObject)newNbLUTs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_PLD__NB_LU_TS, null, msgs);
			msgs = basicSetNbLUTs(newNbLUTs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_PLD__NB_LU_TS, newNbLUTs, newNbLUTs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Natural getNdLUT_Inputs() {
		return ndLUT_Inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNdLUT_Inputs(NFP_Natural newNdLUT_Inputs, NotificationChain msgs) {
		NFP_Natural oldNdLUT_Inputs = ndLUT_Inputs;
		ndLUT_Inputs = newNdLUT_Inputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_PLD__ND_LUT_INPUTS, oldNdLUT_Inputs, newNdLUT_Inputs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNdLUT_Inputs(NFP_Natural newNdLUT_Inputs) {
		if (newNdLUT_Inputs != ndLUT_Inputs) {
			NotificationChain msgs = null;
			if (ndLUT_Inputs != null)
				msgs = ((InternalEObject)ndLUT_Inputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_PLD__ND_LUT_INPUTS, null, msgs);
			if (newNdLUT_Inputs != null)
				msgs = ((InternalEObject)newNdLUT_Inputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_PLD__ND_LUT_INPUTS, null, msgs);
			msgs = basicSetNdLUT_Inputs(newNdLUT_Inputs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_PLD__ND_LUT_INPUTS, newNdLUT_Inputs, newNdLUT_Inputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Natural getNbFlipFlops() {
		return nbFlipFlops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNbFlipFlops(NFP_Natural newNbFlipFlops, NotificationChain msgs) {
		NFP_Natural oldNbFlipFlops = nbFlipFlops;
		nbFlipFlops = newNbFlipFlops;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_PLD__NB_FLIP_FLOPS, oldNbFlipFlops, newNbFlipFlops);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbFlipFlops(NFP_Natural newNbFlipFlops) {
		if (newNbFlipFlops != nbFlipFlops) {
			NotificationChain msgs = null;
			if (nbFlipFlops != null)
				msgs = ((InternalEObject)nbFlipFlops).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_PLD__NB_FLIP_FLOPS, null, msgs);
			if (newNbFlipFlops != null)
				msgs = ((InternalEObject)newNbFlipFlops).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_PLD__NB_FLIP_FLOPS, null, msgs);
			msgs = basicSetNbFlipFlops(newNbFlipFlops, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_PLD__NB_FLIP_FLOPS, newNbFlipFlops, newNbFlipFlops));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBlocksRAM() {
		if (blocksRAM == null) {
			blocksRAM = new EObjectContainmentEList(HwRAM.class, this, HwComputingPackage.HW_PLD__BLOCKS_RAM);
		}
		return blocksRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBlocksComputing() {
		if (blocksComputing == null) {
			blocksComputing = new EObjectContainmentEList(HwComputingResource.class, this, HwComputingPackage.HW_PLD__BLOCKS_COMPUTING);
		}
		return blocksComputing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwComputingPackage.HW_PLD__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case HwComputingPackage.HW_PLD__NB_LU_TS:
				return basicSetNbLUTs(null, msgs);
			case HwComputingPackage.HW_PLD__ND_LUT_INPUTS:
				return basicSetNdLUT_Inputs(null, msgs);
			case HwComputingPackage.HW_PLD__NB_FLIP_FLOPS:
				return basicSetNbFlipFlops(null, msgs);
			case HwComputingPackage.HW_PLD__BLOCKS_RAM:
				return ((InternalEList)getBlocksRAM()).basicRemove(otherEnd, msgs);
			case HwComputingPackage.HW_PLD__BLOCKS_COMPUTING:
				return ((InternalEList)getBlocksComputing()).basicRemove(otherEnd, msgs);
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
			case HwComputingPackage.HW_PLD__TECHNOLOGY:
				return getTechnology();
			case HwComputingPackage.HW_PLD__ORGANIZATION:
				return getOrganization();
			case HwComputingPackage.HW_PLD__NB_LU_TS:
				return getNbLUTs();
			case HwComputingPackage.HW_PLD__ND_LUT_INPUTS:
				return getNdLUT_Inputs();
			case HwComputingPackage.HW_PLD__NB_FLIP_FLOPS:
				return getNbFlipFlops();
			case HwComputingPackage.HW_PLD__BLOCKS_RAM:
				return getBlocksRAM();
			case HwComputingPackage.HW_PLD__BLOCKS_COMPUTING:
				return getBlocksComputing();
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
			case HwComputingPackage.HW_PLD__TECHNOLOGY:
				setTechnology((PLD_Technology)newValue);
				return;
			case HwComputingPackage.HW_PLD__ORGANIZATION:
				setOrganization((PLD_Organization)newValue);
				return;
			case HwComputingPackage.HW_PLD__NB_LU_TS:
				setNbLUTs((NFP_Natural)newValue);
				return;
			case HwComputingPackage.HW_PLD__ND_LUT_INPUTS:
				setNdLUT_Inputs((NFP_Natural)newValue);
				return;
			case HwComputingPackage.HW_PLD__NB_FLIP_FLOPS:
				setNbFlipFlops((NFP_Natural)newValue);
				return;
			case HwComputingPackage.HW_PLD__BLOCKS_RAM:
				getBlocksRAM().clear();
				getBlocksRAM().addAll((Collection)newValue);
				return;
			case HwComputingPackage.HW_PLD__BLOCKS_COMPUTING:
				getBlocksComputing().clear();
				getBlocksComputing().addAll((Collection)newValue);
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
			case HwComputingPackage.HW_PLD__TECHNOLOGY:
				setTechnology(TECHNOLOGY_EDEFAULT);
				return;
			case HwComputingPackage.HW_PLD__ORGANIZATION:
				setOrganization((PLD_Organization)null);
				return;
			case HwComputingPackage.HW_PLD__NB_LU_TS:
				setNbLUTs((NFP_Natural)null);
				return;
			case HwComputingPackage.HW_PLD__ND_LUT_INPUTS:
				setNdLUT_Inputs((NFP_Natural)null);
				return;
			case HwComputingPackage.HW_PLD__NB_FLIP_FLOPS:
				setNbFlipFlops((NFP_Natural)null);
				return;
			case HwComputingPackage.HW_PLD__BLOCKS_RAM:
				getBlocksRAM().clear();
				return;
			case HwComputingPackage.HW_PLD__BLOCKS_COMPUTING:
				getBlocksComputing().clear();
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
			case HwComputingPackage.HW_PLD__TECHNOLOGY:
				return technology != TECHNOLOGY_EDEFAULT;
			case HwComputingPackage.HW_PLD__ORGANIZATION:
				return organization != null;
			case HwComputingPackage.HW_PLD__NB_LU_TS:
				return nbLUTs != null;
			case HwComputingPackage.HW_PLD__ND_LUT_INPUTS:
				return ndLUT_Inputs != null;
			case HwComputingPackage.HW_PLD__NB_FLIP_FLOPS:
				return nbFlipFlops != null;
			case HwComputingPackage.HW_PLD__BLOCKS_RAM:
				return blocksRAM != null && !blocksRAM.isEmpty();
			case HwComputingPackage.HW_PLD__BLOCKS_COMPUTING:
				return blocksComputing != null && !blocksComputing.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (technology: ");
		result.append(technology);
		result.append(')');
		return result.toString();
	}

} //HwPLDImpl
