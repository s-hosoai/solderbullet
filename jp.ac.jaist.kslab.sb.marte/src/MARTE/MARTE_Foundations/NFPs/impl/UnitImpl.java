/**
 */
package MARTE.MARTE_Foundations.NFPs.impl;

import MARTE.MARTE_Foundations.NFPs.NFPsPackage;
import MARTE.MARTE_Foundations.NFPs.Unit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.NFPs.impl.UnitImpl#getConvFactor <em>Conv Factor</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.NFPs.impl.UnitImpl#getOffsetFactor <em>Offset Factor</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.NFPs.impl.UnitImpl#getBaseUnit <em>Base Unit</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.NFPs.impl.UnitImpl#getBase_EnumerationLiteral <em>Base Enumeration Literal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitImpl extends EObjectImpl implements Unit {
	/**
	 * The default value of the '{@link #getConvFactor() <em>Conv Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvFactor()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONV_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConvFactor() <em>Conv Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvFactor()
	 * @generated
	 * @ordered
	 */
	protected Object convFactor = CONV_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffsetFactor() <em>Offset Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetFactor()
	 * @generated
	 * @ordered
	 */
	protected static final Object OFFSET_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffsetFactor() <em>Offset Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetFactor()
	 * @generated
	 * @ordered
	 */
	protected Object offsetFactor = OFFSET_FACTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBaseUnit() <em>Base Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit baseUnit;

	/**
	 * The cached value of the '{@link #getBase_EnumerationLiteral() <em>Base Enumeration Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_EnumerationLiteral()
	 * @generated
	 * @ordered
	 */
	protected EnumerationLiteral base_EnumerationLiteral;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NFPsPackage.Literals.UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getConvFactor() {
		return convFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConvFactor(Object newConvFactor) {
		Object oldConvFactor = convFactor;
		convFactor = newConvFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NFPsPackage.UNIT__CONV_FACTOR, oldConvFactor, convFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getOffsetFactor() {
		return offsetFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsetFactor(Object newOffsetFactor) {
		Object oldOffsetFactor = offsetFactor;
		offsetFactor = newOffsetFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NFPsPackage.UNIT__OFFSET_FACTOR, oldOffsetFactor, offsetFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getBaseUnit() {
		if (baseUnit != null && baseUnit.eIsProxy()) {
			InternalEObject oldBaseUnit = (InternalEObject)baseUnit;
			baseUnit = (Unit)eResolveProxy(oldBaseUnit);
			if (baseUnit != oldBaseUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NFPsPackage.UNIT__BASE_UNIT, oldBaseUnit, baseUnit));
			}
		}
		return baseUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetBaseUnit() {
		return baseUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseUnit(Unit newBaseUnit) {
		Unit oldBaseUnit = baseUnit;
		baseUnit = newBaseUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NFPsPackage.UNIT__BASE_UNIT, oldBaseUnit, baseUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getBase_EnumerationLiteral() {
		if (base_EnumerationLiteral != null && base_EnumerationLiteral.eIsProxy()) {
			InternalEObject oldBase_EnumerationLiteral = (InternalEObject)base_EnumerationLiteral;
			base_EnumerationLiteral = (EnumerationLiteral)eResolveProxy(oldBase_EnumerationLiteral);
			if (base_EnumerationLiteral != oldBase_EnumerationLiteral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NFPsPackage.UNIT__BASE_ENUMERATION_LITERAL, oldBase_EnumerationLiteral, base_EnumerationLiteral));
			}
		}
		return base_EnumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral basicGetBase_EnumerationLiteral() {
		return base_EnumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_EnumerationLiteral(EnumerationLiteral newBase_EnumerationLiteral) {
		EnumerationLiteral oldBase_EnumerationLiteral = base_EnumerationLiteral;
		base_EnumerationLiteral = newBase_EnumerationLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NFPsPackage.UNIT__BASE_ENUMERATION_LITERAL, oldBase_EnumerationLiteral, base_EnumerationLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NFPsPackage.UNIT__CONV_FACTOR:
				return getConvFactor();
			case NFPsPackage.UNIT__OFFSET_FACTOR:
				return getOffsetFactor();
			case NFPsPackage.UNIT__BASE_UNIT:
				if (resolve) return getBaseUnit();
				return basicGetBaseUnit();
			case NFPsPackage.UNIT__BASE_ENUMERATION_LITERAL:
				if (resolve) return getBase_EnumerationLiteral();
				return basicGetBase_EnumerationLiteral();
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
			case NFPsPackage.UNIT__CONV_FACTOR:
				setConvFactor(newValue);
				return;
			case NFPsPackage.UNIT__OFFSET_FACTOR:
				setOffsetFactor(newValue);
				return;
			case NFPsPackage.UNIT__BASE_UNIT:
				setBaseUnit((Unit)newValue);
				return;
			case NFPsPackage.UNIT__BASE_ENUMERATION_LITERAL:
				setBase_EnumerationLiteral((EnumerationLiteral)newValue);
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
			case NFPsPackage.UNIT__CONV_FACTOR:
				setConvFactor(CONV_FACTOR_EDEFAULT);
				return;
			case NFPsPackage.UNIT__OFFSET_FACTOR:
				setOffsetFactor(OFFSET_FACTOR_EDEFAULT);
				return;
			case NFPsPackage.UNIT__BASE_UNIT:
				setBaseUnit((Unit)null);
				return;
			case NFPsPackage.UNIT__BASE_ENUMERATION_LITERAL:
				setBase_EnumerationLiteral((EnumerationLiteral)null);
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
			case NFPsPackage.UNIT__CONV_FACTOR:
				return CONV_FACTOR_EDEFAULT == null ? convFactor != null : !CONV_FACTOR_EDEFAULT.equals(convFactor);
			case NFPsPackage.UNIT__OFFSET_FACTOR:
				return OFFSET_FACTOR_EDEFAULT == null ? offsetFactor != null : !OFFSET_FACTOR_EDEFAULT.equals(offsetFactor);
			case NFPsPackage.UNIT__BASE_UNIT:
				return baseUnit != null;
			case NFPsPackage.UNIT__BASE_ENUMERATION_LITERAL:
				return base_EnumerationLiteral != null;
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
		result.append(" (convFactor: ");
		result.append(convFactor);
		result.append(", offsetFactor: ");
		result.append(offsetFactor);
		result.append(')');
		return result.toString();
	}

} //UnitImpl
