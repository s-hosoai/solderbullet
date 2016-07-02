/**
 */
package MARTE.MARTE_Foundations.Alloc.impl;

import MARTE.MARTE_Foundations.Alloc.AllocPackage;
import MARTE.MARTE_Foundations.Alloc.Allocated;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocated</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.Alloc.impl.AllocatedImpl#getBase_NamedElement <em>Base Named Element</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Alloc.impl.AllocatedImpl#getAllocatedTo <em>Allocated To</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Alloc.impl.AllocatedImpl#getAllocatedFrom <em>Allocated From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocatedImpl extends EObjectImpl implements Allocated {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocatedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AllocPackage.Literals.ALLOCATED;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocPackage.ALLOCATED__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AllocPackage.ALLOCATED__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllocatedTo() {
		// TODO: implement this method to return the 'Allocated To' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllocatedFrom() {
		// TODO: implement this method to return the 'Allocated From' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AllocPackage.ALLOCATED__BASE_NAMED_ELEMENT:
				if (resolve) return getBase_NamedElement();
				return basicGetBase_NamedElement();
			case AllocPackage.ALLOCATED__ALLOCATED_TO:
				return getAllocatedTo();
			case AllocPackage.ALLOCATED__ALLOCATED_FROM:
				return getAllocatedFrom();
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
			case AllocPackage.ALLOCATED__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)newValue);
				return;
			case AllocPackage.ALLOCATED__ALLOCATED_TO:
				getAllocatedTo().clear();
				getAllocatedTo().addAll((Collection)newValue);
				return;
			case AllocPackage.ALLOCATED__ALLOCATED_FROM:
				getAllocatedFrom().clear();
				getAllocatedFrom().addAll((Collection)newValue);
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
			case AllocPackage.ALLOCATED__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)null);
				return;
			case AllocPackage.ALLOCATED__ALLOCATED_TO:
				getAllocatedTo().clear();
				return;
			case AllocPackage.ALLOCATED__ALLOCATED_FROM:
				getAllocatedFrom().clear();
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
			case AllocPackage.ALLOCATED__BASE_NAMED_ELEMENT:
				return base_NamedElement != null;
			case AllocPackage.ALLOCATED__ALLOCATED_TO:
				return !getAllocatedTo().isEmpty();
			case AllocPackage.ALLOCATED__ALLOCATED_FROM:
				return !getAllocatedFrom().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AllocatedImpl
