/**
 */
package MARTE.MARTE_DesignModel.GCM.impl;

import MARTE.MARTE_DesignModel.GCM.ClientServerKind;
import MARTE.MARTE_DesignModel.GCM.ClientServerPort;
import MARTE.MARTE_DesignModel.GCM.ClientServerSpecification;
import MARTE.MARTE_DesignModel.GCM.GCMPackage;
import MARTE.MARTE_DesignModel.GCM.PortSpecificationKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client Server Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.impl.ClientServerPortImpl#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.impl.ClientServerPortImpl#getSpecificationKind <em>Specification Kind</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.impl.ClientServerPortImpl#getIsConjugated <em>Is Conjugated</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.impl.ClientServerPortImpl#getProvInterface <em>Prov Interface</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.impl.ClientServerPortImpl#getReqInterface <em>Req Interface</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.impl.ClientServerPortImpl#getFeaturesSpec <em>Features Spec</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.impl.ClientServerPortImpl#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientServerPortImpl extends EObjectImpl implements ClientServerPort {
	/**
	 * The cached value of the '{@link #getBase_Port() <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Port()
	 * @generated
	 * @ordered
	 */
	protected Port base_Port;

	/**
	 * The default value of the '{@link #getSpecificationKind() <em>Specification Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationKind()
	 * @generated
	 * @ordered
	 */
	protected static final PortSpecificationKind SPECIFICATION_KIND_EDEFAULT = PortSpecificationKind.INTERFACE_BASED_LITERAL;

	/**
	 * The default value of the '{@link #getIsConjugated() <em>Is Conjugated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConjugated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CONJUGATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsConjugated() <em>Is Conjugated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConjugated()
	 * @generated
	 * @ordered
	 */
	protected Boolean isConjugated = IS_CONJUGATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProvInterface() <em>Prov Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvInterface()
	 * @generated
	 * @ordered
	 */
	protected EList provInterface;

	/**
	 * The cached value of the '{@link #getReqInterface() <em>Req Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqInterface()
	 * @generated
	 * @ordered
	 */
	protected EList reqInterface;

	/**
	 * The cached value of the '{@link #getFeaturesSpec() <em>Features Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturesSpec()
	 * @generated
	 * @ordered
	 */
	protected ClientServerSpecification featuresSpec;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ClientServerKind KIND_EDEFAULT = ClientServerKind.PROREQ_LITERAL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ClientServerKind kind = KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientServerPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GCMPackage.Literals.CLIENT_SERVER_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getBase_Port() {
		if (base_Port != null && base_Port.eIsProxy()) {
			InternalEObject oldBase_Port = (InternalEObject)base_Port;
			base_Port = (Port)eResolveProxy(oldBase_Port);
			if (base_Port != oldBase_Port) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GCMPackage.CLIENT_SERVER_PORT__BASE_PORT, oldBase_Port, base_Port));
			}
		}
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetBase_Port() {
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Port(Port newBase_Port) {
		Port oldBase_Port = base_Port;
		base_Port = newBase_Port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCMPackage.CLIENT_SERVER_PORT__BASE_PORT, oldBase_Port, base_Port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortSpecificationKind getSpecificationKind() {
		// TODO: implement this method to return the 'Specification Kind' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificationKind(PortSpecificationKind newSpecificationKind) {
		// TODO: implement this method to set the 'Specification Kind' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsConjugated() {
		return isConjugated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConjugated(Boolean newIsConjugated) {
		Boolean oldIsConjugated = isConjugated;
		isConjugated = newIsConjugated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCMPackage.CLIENT_SERVER_PORT__IS_CONJUGATED, oldIsConjugated, isConjugated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProvInterface() {
		if (provInterface == null) {
			provInterface = new EObjectResolvingEList(Interface.class, this, GCMPackage.CLIENT_SERVER_PORT__PROV_INTERFACE);
		}
		return provInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReqInterface() {
		if (reqInterface == null) {
			reqInterface = new EObjectResolvingEList(Interface.class, this, GCMPackage.CLIENT_SERVER_PORT__REQ_INTERFACE);
		}
		return reqInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientServerSpecification getFeaturesSpec() {
		if (featuresSpec != null && featuresSpec.eIsProxy()) {
			InternalEObject oldFeaturesSpec = (InternalEObject)featuresSpec;
			featuresSpec = (ClientServerSpecification)eResolveProxy(oldFeaturesSpec);
			if (featuresSpec != oldFeaturesSpec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GCMPackage.CLIENT_SERVER_PORT__FEATURES_SPEC, oldFeaturesSpec, featuresSpec));
			}
		}
		return featuresSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientServerSpecification basicGetFeaturesSpec() {
		return featuresSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeaturesSpec(ClientServerSpecification newFeaturesSpec) {
		ClientServerSpecification oldFeaturesSpec = featuresSpec;
		featuresSpec = newFeaturesSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCMPackage.CLIENT_SERVER_PORT__FEATURES_SPEC, oldFeaturesSpec, featuresSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientServerKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ClientServerKind newKind) {
		ClientServerKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCMPackage.CLIENT_SERVER_PORT__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GCMPackage.CLIENT_SERVER_PORT__BASE_PORT:
				if (resolve) return getBase_Port();
				return basicGetBase_Port();
			case GCMPackage.CLIENT_SERVER_PORT__SPECIFICATION_KIND:
				return getSpecificationKind();
			case GCMPackage.CLIENT_SERVER_PORT__IS_CONJUGATED:
				return getIsConjugated();
			case GCMPackage.CLIENT_SERVER_PORT__PROV_INTERFACE:
				return getProvInterface();
			case GCMPackage.CLIENT_SERVER_PORT__REQ_INTERFACE:
				return getReqInterface();
			case GCMPackage.CLIENT_SERVER_PORT__FEATURES_SPEC:
				if (resolve) return getFeaturesSpec();
				return basicGetFeaturesSpec();
			case GCMPackage.CLIENT_SERVER_PORT__KIND:
				return getKind();
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
			case GCMPackage.CLIENT_SERVER_PORT__BASE_PORT:
				setBase_Port((Port)newValue);
				return;
			case GCMPackage.CLIENT_SERVER_PORT__SPECIFICATION_KIND:
				setSpecificationKind((PortSpecificationKind)newValue);
				return;
			case GCMPackage.CLIENT_SERVER_PORT__IS_CONJUGATED:
				setIsConjugated((Boolean)newValue);
				return;
			case GCMPackage.CLIENT_SERVER_PORT__PROV_INTERFACE:
				getProvInterface().clear();
				getProvInterface().addAll((Collection)newValue);
				return;
			case GCMPackage.CLIENT_SERVER_PORT__REQ_INTERFACE:
				getReqInterface().clear();
				getReqInterface().addAll((Collection)newValue);
				return;
			case GCMPackage.CLIENT_SERVER_PORT__FEATURES_SPEC:
				setFeaturesSpec((ClientServerSpecification)newValue);
				return;
			case GCMPackage.CLIENT_SERVER_PORT__KIND:
				setKind((ClientServerKind)newValue);
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
			case GCMPackage.CLIENT_SERVER_PORT__BASE_PORT:
				setBase_Port((Port)null);
				return;
			case GCMPackage.CLIENT_SERVER_PORT__SPECIFICATION_KIND:
				setSpecificationKind(SPECIFICATION_KIND_EDEFAULT);
				return;
			case GCMPackage.CLIENT_SERVER_PORT__IS_CONJUGATED:
				setIsConjugated(IS_CONJUGATED_EDEFAULT);
				return;
			case GCMPackage.CLIENT_SERVER_PORT__PROV_INTERFACE:
				getProvInterface().clear();
				return;
			case GCMPackage.CLIENT_SERVER_PORT__REQ_INTERFACE:
				getReqInterface().clear();
				return;
			case GCMPackage.CLIENT_SERVER_PORT__FEATURES_SPEC:
				setFeaturesSpec((ClientServerSpecification)null);
				return;
			case GCMPackage.CLIENT_SERVER_PORT__KIND:
				setKind(KIND_EDEFAULT);
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
			case GCMPackage.CLIENT_SERVER_PORT__BASE_PORT:
				return base_Port != null;
			case GCMPackage.CLIENT_SERVER_PORT__SPECIFICATION_KIND:
				return getSpecificationKind() != SPECIFICATION_KIND_EDEFAULT;
			case GCMPackage.CLIENT_SERVER_PORT__IS_CONJUGATED:
				return IS_CONJUGATED_EDEFAULT == null ? isConjugated != null : !IS_CONJUGATED_EDEFAULT.equals(isConjugated);
			case GCMPackage.CLIENT_SERVER_PORT__PROV_INTERFACE:
				return provInterface != null && !provInterface.isEmpty();
			case GCMPackage.CLIENT_SERVER_PORT__REQ_INTERFACE:
				return reqInterface != null && !reqInterface.isEmpty();
			case GCMPackage.CLIENT_SERVER_PORT__FEATURES_SPEC:
				return featuresSpec != null;
			case GCMPackage.CLIENT_SERVER_PORT__KIND:
				return kind != KIND_EDEFAULT;
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
		result.append(" (isConjugated: ");
		result.append(isConjugated);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //ClientServerPortImpl
