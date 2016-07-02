/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.impl;

import MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SW_ResourceCorePackage;
import MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwResource;

import MARTE.MARTE_Foundations.GRM.impl.ResourceImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sw Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.impl.SwResourceImpl#getIdentifierElements <em>Identifier Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.impl.SwResourceImpl#getStateElements <em>State Elements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.impl.SwResourceImpl#getMemorySizeFootprint <em>Memory Size Footprint</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.impl.SwResourceImpl#getCreateServices <em>Create Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.impl.SwResourceImpl#getDeleteServices <em>Delete Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.impl.SwResourceImpl#getInitializeServices <em>Initialize Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SwResourceImpl extends ResourceImpl implements SwResource {
	/**
	 * The cached value of the '{@link #getIdentifierElements() <em>Identifier Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifierElements()
	 * @generated
	 * @ordered
	 */
	protected EList identifierElements;

	/**
	 * The cached value of the '{@link #getStateElements() <em>State Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateElements()
	 * @generated
	 * @ordered
	 */
	protected EList stateElements;

	/**
	 * The cached value of the '{@link #getMemorySizeFootprint() <em>Memory Size Footprint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySizeFootprint()
	 * @generated
	 * @ordered
	 */
	protected TypedElement memorySizeFootprint;

	/**
	 * The cached value of the '{@link #getCreateServices() <em>Create Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateServices()
	 * @generated
	 * @ordered
	 */
	protected EList createServices;

	/**
	 * The cached value of the '{@link #getDeleteServices() <em>Delete Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteServices()
	 * @generated
	 * @ordered
	 */
	protected EList deleteServices;

	/**
	 * The cached value of the '{@link #getInitializeServices() <em>Initialize Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializeServices()
	 * @generated
	 * @ordered
	 */
	protected EList initializeServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SW_ResourceCorePackage.Literals.SW_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIdentifierElements() {
		if (identifierElements == null) {
			identifierElements = new EObjectResolvingEList(TypedElement.class, this, SW_ResourceCorePackage.SW_RESOURCE__IDENTIFIER_ELEMENTS);
		}
		return identifierElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStateElements() {
		if (stateElements == null) {
			stateElements = new EObjectResolvingEList(TypedElement.class, this, SW_ResourceCorePackage.SW_RESOURCE__STATE_ELEMENTS);
		}
		return stateElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedElement getMemorySizeFootprint() {
		if (memorySizeFootprint != null && memorySizeFootprint.eIsProxy()) {
			InternalEObject oldMemorySizeFootprint = (InternalEObject)memorySizeFootprint;
			memorySizeFootprint = (TypedElement)eResolveProxy(oldMemorySizeFootprint);
			if (memorySizeFootprint != oldMemorySizeFootprint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SW_ResourceCorePackage.SW_RESOURCE__MEMORY_SIZE_FOOTPRINT, oldMemorySizeFootprint, memorySizeFootprint));
			}
		}
		return memorySizeFootprint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedElement basicGetMemorySizeFootprint() {
		return memorySizeFootprint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemorySizeFootprint(TypedElement newMemorySizeFootprint) {
		TypedElement oldMemorySizeFootprint = memorySizeFootprint;
		memorySizeFootprint = newMemorySizeFootprint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_ResourceCorePackage.SW_RESOURCE__MEMORY_SIZE_FOOTPRINT, oldMemorySizeFootprint, memorySizeFootprint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCreateServices() {
		if (createServices == null) {
			createServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_ResourceCorePackage.SW_RESOURCE__CREATE_SERVICES);
		}
		return createServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDeleteServices() {
		if (deleteServices == null) {
			deleteServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_ResourceCorePackage.SW_RESOURCE__DELETE_SERVICES);
		}
		return deleteServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInitializeServices() {
		if (initializeServices == null) {
			initializeServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_ResourceCorePackage.SW_RESOURCE__INITIALIZE_SERVICES);
		}
		return initializeServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SW_ResourceCorePackage.SW_RESOURCE__IDENTIFIER_ELEMENTS:
				return getIdentifierElements();
			case SW_ResourceCorePackage.SW_RESOURCE__STATE_ELEMENTS:
				return getStateElements();
			case SW_ResourceCorePackage.SW_RESOURCE__MEMORY_SIZE_FOOTPRINT:
				if (resolve) return getMemorySizeFootprint();
				return basicGetMemorySizeFootprint();
			case SW_ResourceCorePackage.SW_RESOURCE__CREATE_SERVICES:
				return getCreateServices();
			case SW_ResourceCorePackage.SW_RESOURCE__DELETE_SERVICES:
				return getDeleteServices();
			case SW_ResourceCorePackage.SW_RESOURCE__INITIALIZE_SERVICES:
				return getInitializeServices();
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
			case SW_ResourceCorePackage.SW_RESOURCE__IDENTIFIER_ELEMENTS:
				getIdentifierElements().clear();
				getIdentifierElements().addAll((Collection)newValue);
				return;
			case SW_ResourceCorePackage.SW_RESOURCE__STATE_ELEMENTS:
				getStateElements().clear();
				getStateElements().addAll((Collection)newValue);
				return;
			case SW_ResourceCorePackage.SW_RESOURCE__MEMORY_SIZE_FOOTPRINT:
				setMemorySizeFootprint((TypedElement)newValue);
				return;
			case SW_ResourceCorePackage.SW_RESOURCE__CREATE_SERVICES:
				getCreateServices().clear();
				getCreateServices().addAll((Collection)newValue);
				return;
			case SW_ResourceCorePackage.SW_RESOURCE__DELETE_SERVICES:
				getDeleteServices().clear();
				getDeleteServices().addAll((Collection)newValue);
				return;
			case SW_ResourceCorePackage.SW_RESOURCE__INITIALIZE_SERVICES:
				getInitializeServices().clear();
				getInitializeServices().addAll((Collection)newValue);
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
			case SW_ResourceCorePackage.SW_RESOURCE__IDENTIFIER_ELEMENTS:
				getIdentifierElements().clear();
				return;
			case SW_ResourceCorePackage.SW_RESOURCE__STATE_ELEMENTS:
				getStateElements().clear();
				return;
			case SW_ResourceCorePackage.SW_RESOURCE__MEMORY_SIZE_FOOTPRINT:
				setMemorySizeFootprint((TypedElement)null);
				return;
			case SW_ResourceCorePackage.SW_RESOURCE__CREATE_SERVICES:
				getCreateServices().clear();
				return;
			case SW_ResourceCorePackage.SW_RESOURCE__DELETE_SERVICES:
				getDeleteServices().clear();
				return;
			case SW_ResourceCorePackage.SW_RESOURCE__INITIALIZE_SERVICES:
				getInitializeServices().clear();
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
			case SW_ResourceCorePackage.SW_RESOURCE__IDENTIFIER_ELEMENTS:
				return identifierElements != null && !identifierElements.isEmpty();
			case SW_ResourceCorePackage.SW_RESOURCE__STATE_ELEMENTS:
				return stateElements != null && !stateElements.isEmpty();
			case SW_ResourceCorePackage.SW_RESOURCE__MEMORY_SIZE_FOOTPRINT:
				return memorySizeFootprint != null;
			case SW_ResourceCorePackage.SW_RESOURCE__CREATE_SERVICES:
				return createServices != null && !createServices.isEmpty();
			case SW_ResourceCorePackage.SW_RESOURCE__DELETE_SERVICES:
				return deleteServices != null && !deleteServices.isEmpty();
			case SW_ResourceCorePackage.SW_RESOURCE__INITIALIZE_SERVICES:
				return initializeServices != null && !initializeServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SwResourceImpl
