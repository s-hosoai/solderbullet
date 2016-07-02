/**
 */
package MARTE.MARTE_DesignModel.HRM.HwDiagram.impl;

import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwCircuitDiagram;
import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage;
import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwWire;

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
 * An implementation of the model object '<em><b>Hw Circuit Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwCircuitDiagramImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwCircuitDiagramImpl#getWires <em>Wires</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.impl.HwCircuitDiagramImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwCircuitDiagramImpl extends EObjectImpl implements HwCircuitDiagram {
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
	 * The cached value of the '{@link #getWires() <em>Wires</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWires()
	 * @generated
	 * @ordered
	 */
	protected EList wires;

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
	protected HwCircuitDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwDiagramPackage.Literals.HW_CIRCUIT_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList(HwPackage.class, this, HwDiagramPackage.HW_CIRCUIT_DIAGRAM__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWires() {
		if (wires == null) {
			wires = new EObjectContainmentEList(HwWire.class, this, HwDiagramPackage.HW_CIRCUIT_DIAGRAM__WIRES);
		}
		return wires;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HwDiagramPackage.HW_CIRCUIT_DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwDiagramPackage.HW_CIRCUIT_DIAGRAM__COMPONENTS:
				return ((InternalEList)getComponents()).basicRemove(otherEnd, msgs);
			case HwDiagramPackage.HW_CIRCUIT_DIAGRAM__WIRES:
				return ((InternalEList)getWires()).basicRemove(otherEnd, msgs);
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
			case HwDiagramPackage.HW_CIRCUIT_DIAGRAM__COMPONENTS:
				return getComponents();
			case HwDiagramPackage.HW_CIRCUIT_DIAGRAM__WIRES:
				return getWires();
			case HwDiagramPackage.HW_CIRCUIT_DIAGRAM__NAME:
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
			case HwDiagramPackage.HW_CIRCUIT_DIAGRAM__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection)newValue);
				return;
			case HwDiagramPackage.HW_CIRCUIT_DIAGRAM__WIRES:
				getWires().clear();
				getWires().addAll((Collection)newValue);
				return;
			case HwDiagramPackage.HW_CIRCUIT_DIAGRAM__NAME:
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
			case HwDiagramPackage.HW_CIRCUIT_DIAGRAM__COMPONENTS:
				getComponents().clear();
				return;
			case HwDiagramPackage.HW_CIRCUIT_DIAGRAM__WIRES:
				getWires().clear();
				return;
			case HwDiagramPackage.HW_CIRCUIT_DIAGRAM__NAME:
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
			case HwDiagramPackage.HW_CIRCUIT_DIAGRAM__COMPONENTS:
				return components != null && !components.isEmpty();
			case HwDiagramPackage.HW_CIRCUIT_DIAGRAM__WIRES:
				return wires != null && !wires.isEmpty();
			case HwDiagramPackage.HW_CIRCUIT_DIAGRAM__NAME:
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

} //HwCircuitDiagramImpl
