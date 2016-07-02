/**
 */
package MARTE.MARTE_Foundations.GRM.impl;

import MARTE.MARTE_Foundations.GRM.GRMPackage;
import MARTE.MARTE_Foundations.GRM.Resource;
import MARTE.MARTE_Foundations.GRM.ResourceUsage;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;
import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Energy;
import MARTE_Library.BasicNFP_Types.NFP_Power;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.ResourceUsageImpl#getExecTime <em>Exec Time</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.ResourceUsageImpl#getAllocatedMemory <em>Allocated Memory</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.ResourceUsageImpl#getUsedMemory <em>Used Memory</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.ResourceUsageImpl#getPowerPeak <em>Power Peak</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.ResourceUsageImpl#getEnergy <em>Energy</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.ResourceUsageImpl#getBase_NamedElement <em>Base Named Element</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.ResourceUsageImpl#getSubUsage <em>Sub Usage</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.ResourceUsageImpl#getUsedResources <em>Used Resources</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.ResourceUsageImpl#getMsgSize <em>Msg Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceUsageImpl extends EObjectImpl implements ResourceUsage {
	/**
	 * The cached value of the '{@link #getExecTime() <em>Exec Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecTime()
	 * @generated
	 * @ordered
	 */
	protected EList execTime;

	/**
	 * The cached value of the '{@link #getAllocatedMemory() <em>Allocated Memory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedMemory()
	 * @generated
	 * @ordered
	 */
	protected EList allocatedMemory;

	/**
	 * The cached value of the '{@link #getUsedMemory() <em>Used Memory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedMemory()
	 * @generated
	 * @ordered
	 */
	protected EList usedMemory;

	/**
	 * The cached value of the '{@link #getPowerPeak() <em>Power Peak</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerPeak()
	 * @generated
	 * @ordered
	 */
	protected EList powerPeak;

	/**
	 * The cached value of the '{@link #getEnergy() <em>Energy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergy()
	 * @generated
	 * @ordered
	 */
	protected EList energy;

	/**
	 * The cached value of the '{@link #getBase_NamedElement() <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_NamedElement()
	 * @generated
	 * @ordered
	 */
	protected NamedElement base_NamedElement;

	/**
	 * The cached value of the '{@link #getSubUsage() <em>Sub Usage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubUsage()
	 * @generated
	 * @ordered
	 */
	protected EList subUsage;

	/**
	 * The cached value of the '{@link #getUsedResources() <em>Used Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedResources()
	 * @generated
	 * @ordered
	 */
	protected EList usedResources;

	/**
	 * The cached value of the '{@link #getMsgSize() <em>Msg Size</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgSize()
	 * @generated
	 * @ordered
	 */
	protected EList msgSize;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GRMPackage.Literals.RESOURCE_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExecTime() {
		if (execTime == null) {
			execTime = new EObjectContainmentEList(NFP_Duration.class, this, GRMPackage.RESOURCE_USAGE__EXEC_TIME);
		}
		return execTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllocatedMemory() {
		if (allocatedMemory == null) {
			allocatedMemory = new EObjectContainmentEList(NFP_DataSize.class, this, GRMPackage.RESOURCE_USAGE__ALLOCATED_MEMORY);
		}
		return allocatedMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUsedMemory() {
		if (usedMemory == null) {
			usedMemory = new EObjectContainmentEList(NFP_DataSize.class, this, GRMPackage.RESOURCE_USAGE__USED_MEMORY);
		}
		return usedMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPowerPeak() {
		if (powerPeak == null) {
			powerPeak = new EObjectContainmentEList(NFP_Power.class, this, GRMPackage.RESOURCE_USAGE__POWER_PEAK);
		}
		return powerPeak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEnergy() {
		if (energy == null) {
			energy = new EObjectContainmentEList(NFP_Energy.class, this, GRMPackage.RESOURCE_USAGE__ENERGY);
		}
		return energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getBase_NamedElement() {
		if (base_NamedElement != null && base_NamedElement.eIsProxy()) {
			InternalEObject oldBase_NamedElement = (InternalEObject)base_NamedElement;
			base_NamedElement = (NamedElement)eResolveProxy(oldBase_NamedElement);
			if (base_NamedElement != oldBase_NamedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRMPackage.RESOURCE_USAGE__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
			}
		}
		return base_NamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetBase_NamedElement() {
		return base_NamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_NamedElement(NamedElement newBase_NamedElement) {
		NamedElement oldBase_NamedElement = base_NamedElement;
		base_NamedElement = newBase_NamedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRMPackage.RESOURCE_USAGE__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubUsage() {
		if (subUsage == null) {
			subUsage = new EObjectResolvingEList(ResourceUsage.class, this, GRMPackage.RESOURCE_USAGE__SUB_USAGE);
		}
		return subUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUsedResources() {
		if (usedResources == null) {
			usedResources = new EObjectResolvingEList(Resource.class, this, GRMPackage.RESOURCE_USAGE__USED_RESOURCES);
		}
		return usedResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMsgSize() {
		if (msgSize == null) {
			msgSize = new EObjectContainmentEList(NFP_DataSize.class, this, GRMPackage.RESOURCE_USAGE__MSG_SIZE);
		}
		return msgSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRMPackage.RESOURCE_USAGE__EXEC_TIME:
				return ((InternalEList)getExecTime()).basicRemove(otherEnd, msgs);
			case GRMPackage.RESOURCE_USAGE__ALLOCATED_MEMORY:
				return ((InternalEList)getAllocatedMemory()).basicRemove(otherEnd, msgs);
			case GRMPackage.RESOURCE_USAGE__USED_MEMORY:
				return ((InternalEList)getUsedMemory()).basicRemove(otherEnd, msgs);
			case GRMPackage.RESOURCE_USAGE__POWER_PEAK:
				return ((InternalEList)getPowerPeak()).basicRemove(otherEnd, msgs);
			case GRMPackage.RESOURCE_USAGE__ENERGY:
				return ((InternalEList)getEnergy()).basicRemove(otherEnd, msgs);
			case GRMPackage.RESOURCE_USAGE__MSG_SIZE:
				return ((InternalEList)getMsgSize()).basicRemove(otherEnd, msgs);
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
			case GRMPackage.RESOURCE_USAGE__EXEC_TIME:
				return getExecTime();
			case GRMPackage.RESOURCE_USAGE__ALLOCATED_MEMORY:
				return getAllocatedMemory();
			case GRMPackage.RESOURCE_USAGE__USED_MEMORY:
				return getUsedMemory();
			case GRMPackage.RESOURCE_USAGE__POWER_PEAK:
				return getPowerPeak();
			case GRMPackage.RESOURCE_USAGE__ENERGY:
				return getEnergy();
			case GRMPackage.RESOURCE_USAGE__BASE_NAMED_ELEMENT:
				if (resolve) return getBase_NamedElement();
				return basicGetBase_NamedElement();
			case GRMPackage.RESOURCE_USAGE__SUB_USAGE:
				return getSubUsage();
			case GRMPackage.RESOURCE_USAGE__USED_RESOURCES:
				return getUsedResources();
			case GRMPackage.RESOURCE_USAGE__MSG_SIZE:
				return getMsgSize();
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
			case GRMPackage.RESOURCE_USAGE__EXEC_TIME:
				getExecTime().clear();
				getExecTime().addAll((Collection)newValue);
				return;
			case GRMPackage.RESOURCE_USAGE__ALLOCATED_MEMORY:
				getAllocatedMemory().clear();
				getAllocatedMemory().addAll((Collection)newValue);
				return;
			case GRMPackage.RESOURCE_USAGE__USED_MEMORY:
				getUsedMemory().clear();
				getUsedMemory().addAll((Collection)newValue);
				return;
			case GRMPackage.RESOURCE_USAGE__POWER_PEAK:
				getPowerPeak().clear();
				getPowerPeak().addAll((Collection)newValue);
				return;
			case GRMPackage.RESOURCE_USAGE__ENERGY:
				getEnergy().clear();
				getEnergy().addAll((Collection)newValue);
				return;
			case GRMPackage.RESOURCE_USAGE__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)newValue);
				return;
			case GRMPackage.RESOURCE_USAGE__SUB_USAGE:
				getSubUsage().clear();
				getSubUsage().addAll((Collection)newValue);
				return;
			case GRMPackage.RESOURCE_USAGE__USED_RESOURCES:
				getUsedResources().clear();
				getUsedResources().addAll((Collection)newValue);
				return;
			case GRMPackage.RESOURCE_USAGE__MSG_SIZE:
				getMsgSize().clear();
				getMsgSize().addAll((Collection)newValue);
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
			case GRMPackage.RESOURCE_USAGE__EXEC_TIME:
				getExecTime().clear();
				return;
			case GRMPackage.RESOURCE_USAGE__ALLOCATED_MEMORY:
				getAllocatedMemory().clear();
				return;
			case GRMPackage.RESOURCE_USAGE__USED_MEMORY:
				getUsedMemory().clear();
				return;
			case GRMPackage.RESOURCE_USAGE__POWER_PEAK:
				getPowerPeak().clear();
				return;
			case GRMPackage.RESOURCE_USAGE__ENERGY:
				getEnergy().clear();
				return;
			case GRMPackage.RESOURCE_USAGE__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)null);
				return;
			case GRMPackage.RESOURCE_USAGE__SUB_USAGE:
				getSubUsage().clear();
				return;
			case GRMPackage.RESOURCE_USAGE__USED_RESOURCES:
				getUsedResources().clear();
				return;
			case GRMPackage.RESOURCE_USAGE__MSG_SIZE:
				getMsgSize().clear();
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
			case GRMPackage.RESOURCE_USAGE__EXEC_TIME:
				return execTime != null && !execTime.isEmpty();
			case GRMPackage.RESOURCE_USAGE__ALLOCATED_MEMORY:
				return allocatedMemory != null && !allocatedMemory.isEmpty();
			case GRMPackage.RESOURCE_USAGE__USED_MEMORY:
				return usedMemory != null && !usedMemory.isEmpty();
			case GRMPackage.RESOURCE_USAGE__POWER_PEAK:
				return powerPeak != null && !powerPeak.isEmpty();
			case GRMPackage.RESOURCE_USAGE__ENERGY:
				return energy != null && !energy.isEmpty();
			case GRMPackage.RESOURCE_USAGE__BASE_NAMED_ELEMENT:
				return base_NamedElement != null;
			case GRMPackage.RESOURCE_USAGE__SUB_USAGE:
				return subUsage != null && !subUsage.isEmpty();
			case GRMPackage.RESOURCE_USAGE__USED_RESOURCES:
				return usedResources != null && !usedResources.isEmpty();
			case GRMPackage.RESOURCE_USAGE__MSG_SIZE:
				return msgSize != null && !msgSize.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceUsageImpl
