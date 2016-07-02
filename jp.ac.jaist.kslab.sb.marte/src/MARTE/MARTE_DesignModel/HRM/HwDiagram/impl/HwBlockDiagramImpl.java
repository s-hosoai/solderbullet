/**
 */
package MARTE.MARTE_DesignModel.HRM.HwDiagram.impl;

import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwBlockDiagram;
import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwConnection;

import MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocol;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Block Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwBlockDiagramImpl#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwBlockDiagramImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwBlockDiagramImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwBlockDiagramImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwBlockDiagramImpl extends EObjectImpl implements HwBlockDiagram {
	/**
	 * The cached value of the '{@link #getProtocols() <em>Protocols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList protocols;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList connections;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList components;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwBlockDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwDiagramPackage.Literals.HW_BLOCK_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProtocols() {
		if (protocols == null) {
			protocols = new EObjectContainmentEList(HwProtocol.class, this, HwDiagramPackage.HW_BLOCK_DIAGRAM__PROTOCOLS);
		}
		return protocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList(HwConnection.class, this, HwDiagramPackage.HW_BLOCK_DIAGRAM__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList(HwResource.class, this, HwDiagramPackage.HW_BLOCK_DIAGRAM__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwDiagramPackage.HW_BLOCK_DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwDiagramPackage.HW_BLOCK_DIAGRAM__PROTOCOLS:
				return ((InternalEList)getProtocols()).basicRemove(otherEnd, msgs);
			case HwDiagramPackage.HW_BLOCK_DIAGRAM__CONNECTIONS:
				return ((InternalEList)getConnections()).basicRemove(otherEnd, msgs);
			case HwDiagramPackage.HW_BLOCK_DIAGRAM__COMPONENTS:
				return ((InternalEList)getComponents()).basicRemove(otherEnd, msgs);
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
			case HwDiagramPackage.HW_BLOCK_DIAGRAM__PROTOCOLS:
				return getProtocols();
			case HwDiagramPackage.HW_BLOCK_DIAGRAM__CONNECTIONS:
				return getConnections();
			case HwDiagramPackage.HW_BLOCK_DIAGRAM__COMPONENTS:
				return getComponents();
			case HwDiagramPackage.HW_BLOCK_DIAGRAM__NAME:
				return getName();
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
			case HwDiagramPackage.HW_BLOCK_DIAGRAM__PROTOCOLS:
				getProtocols().clear();
				getProtocols().addAll((Collection)newValue);
				return;
			case HwDiagramPackage.HW_BLOCK_DIAGRAM__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection)newValue);
				return;
			case HwDiagramPackage.HW_BLOCK_DIAGRAM__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection)newValue);
				return;
			case HwDiagramPackage.HW_BLOCK_DIAGRAM__NAME:
				setName((String)newValue);
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
			case HwDiagramPackage.HW_BLOCK_DIAGRAM__PROTOCOLS:
				getProtocols().clear();
				return;
			case HwDiagramPackage.HW_BLOCK_DIAGRAM__CONNECTIONS:
				getConnections().clear();
				return;
			case HwDiagramPackage.HW_BLOCK_DIAGRAM__COMPONENTS:
				getComponents().clear();
				return;
			case HwDiagramPackage.HW_BLOCK_DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
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
			case HwDiagramPackage.HW_BLOCK_DIAGRAM__PROTOCOLS:
				return protocols != null && !protocols.isEmpty();
			case HwDiagramPackage.HW_BLOCK_DIAGRAM__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case HwDiagramPackage.HW_BLOCK_DIAGRAM__COMPONENTS:
				return components != null && !components.isEmpty();
			case HwDiagramPackage.HW_BLOCK_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //HwBlockDiagramImpl
