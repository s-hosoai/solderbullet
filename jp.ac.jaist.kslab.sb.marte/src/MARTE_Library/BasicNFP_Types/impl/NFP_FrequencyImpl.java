/**
 */
package MARTE_Library.BasicNFP_Types.impl;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;
import MARTE_Library.BasicNFP_Types.NFP_Frequency;

import MARTE_Library.MeasurementUnits.FrequencyUnitKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NFP Frequency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.NFP_FrequencyImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.NFP_FrequencyImpl#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NFP_FrequencyImpl extends NFP_RealImpl implements NFP_Frequency {
	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final FrequencyUnitKind UNIT_EDEFAULT = FrequencyUnitKind.HZ;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected FrequencyUnitKind unit = UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected Object precision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NFP_FrequencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicNFP_TypesPackage.Literals.NFP_FREQUENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyUnitKind getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(FrequencyUnitKind newUnit) {
		FrequencyUnitKind oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.NFP_FREQUENCY__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(Object newPrecision) {
		Object oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.NFP_FREQUENCY__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicNFP_TypesPackage.NFP_FREQUENCY__UNIT:
				return getUnit();
			case BasicNFP_TypesPackage.NFP_FREQUENCY__PRECISION:
				return getPrecision();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasicNFP_TypesPackage.NFP_FREQUENCY__UNIT:
				setUnit((FrequencyUnitKind)newValue);
				return;
			case BasicNFP_TypesPackage.NFP_FREQUENCY__PRECISION:
				setPrecision(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BasicNFP_TypesPackage.NFP_FREQUENCY__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case BasicNFP_TypesPackage.NFP_FREQUENCY__PRECISION:
				setPrecision((Object)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BasicNFP_TypesPackage.NFP_FREQUENCY__UNIT:
				return unit != UNIT_EDEFAULT;
			case BasicNFP_TypesPackage.NFP_FREQUENCY__PRECISION:
				return precision != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (unit: ");
		result.append(unit);
		result.append(", precision: ");
		result.append(precision);
		result.append(')');
		return result.toString();
	}

} //NFP_FrequencyImpl
