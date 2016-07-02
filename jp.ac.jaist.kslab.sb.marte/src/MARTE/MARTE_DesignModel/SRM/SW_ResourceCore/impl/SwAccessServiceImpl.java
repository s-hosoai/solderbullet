/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.impl;

import MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SW_ResourceCorePackage;
import MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwAccessService;

import MARTE.MARTE_Foundations.GRM.impl.GrServiceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sw Access Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.impl.SwAccessServiceImpl#getIsModifier <em>Is Modifier</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.impl.SwAccessServiceImpl#getAccessedElement <em>Accessed Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwAccessServiceImpl extends GrServiceImpl implements SwAccessService {
	/**
	 * The default value of the '{@link #getIsModifier() <em>Is Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsModifier()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_MODIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsModifier() <em>Is Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsModifier()
	 * @generated
	 * @ordered
	 */
	protected Boolean isModifier = IS_MODIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccessedElement() <em>Accessed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessedElement()
	 * @generated
	 * @ordered
	 */
	protected Property accessedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwAccessServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SW_ResourceCorePackage.Literals.SW_ACCESS_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsModifier() {
		return isModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsModifier(Boolean newIsModifier) {
		Boolean oldIsModifier = isModifier;
		isModifier = newIsModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_ResourceCorePackage.SW_ACCESS_SERVICE__IS_MODIFIER, oldIsModifier, isModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getAccessedElement() {
		if (accessedElement != null && accessedElement.eIsProxy()) {
			InternalEObject oldAccessedElement = (InternalEObject)accessedElement;
			accessedElement = (Property)eResolveProxy(oldAccessedElement);
			if (accessedElement != oldAccessedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SW_ResourceCorePackage.SW_ACCESS_SERVICE__ACCESSED_ELEMENT, oldAccessedElement, accessedElement));
			}
		}
		return accessedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetAccessedElement() {
		return accessedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessedElement(Property newAccessedElement) {
		Property oldAccessedElement = accessedElement;
		accessedElement = newAccessedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_ResourceCorePackage.SW_ACCESS_SERVICE__ACCESSED_ELEMENT, oldAccessedElement, accessedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SW_ResourceCorePackage.SW_ACCESS_SERVICE__IS_MODIFIER:
				return getIsModifier();
			case SW_ResourceCorePackage.SW_ACCESS_SERVICE__ACCESSED_ELEMENT:
				if (resolve) return getAccessedElement();
				return basicGetAccessedElement();
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
			case SW_ResourceCorePackage.SW_ACCESS_SERVICE__IS_MODIFIER:
				setIsModifier((Boolean)newValue);
				return;
			case SW_ResourceCorePackage.SW_ACCESS_SERVICE__ACCESSED_ELEMENT:
				setAccessedElement((Property)newValue);
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
			case SW_ResourceCorePackage.SW_ACCESS_SERVICE__IS_MODIFIER:
				setIsModifier(IS_MODIFIER_EDEFAULT);
				return;
			case SW_ResourceCorePackage.SW_ACCESS_SERVICE__ACCESSED_ELEMENT:
				setAccessedElement((Property)null);
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
			case SW_ResourceCorePackage.SW_ACCESS_SERVICE__IS_MODIFIER:
				return IS_MODIFIER_EDEFAULT == null ? isModifier != null : !IS_MODIFIER_EDEFAULT.equals(isModifier);
			case SW_ResourceCorePackage.SW_ACCESS_SERVICE__ACCESSED_ELEMENT:
				return accessedElement != null;
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
		result.append(" (isModifier: ");
		result.append(isModifier);
		result.append(')');
		return result.toString();
	}

} //SwAccessServiceImpl
