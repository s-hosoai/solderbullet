/**
 */
package MARTE.MARTE_Foundations.Time.impl;

import MARTE.MARTE_Foundations.NFPs.impl.NfpConstraintImpl;

import MARTE.MARTE_Foundations.Time.Clock;
import MARTE.MARTE_Foundations.Time.TimePackage;
import MARTE.MARTE_Foundations.Time.TimedConstraint;
import MARTE.MARTE_Foundations.Time.TimedElement;

import MARTE_Library.TimeTypesLibrary.TimeInterpretationKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.Time.impl.TimedConstraintImpl#getOn <em>On</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Time.impl.TimedConstraintImpl#getInterpretation <em>Interpretation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimedConstraintImpl extends NfpConstraintImpl implements TimedConstraint {
	/**
	 * The cached value of the '{@link #getOn() <em>On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn()
	 * @generated
	 * @ordered
	 */
	protected EList on;

	/**
	 * The default value of the '{@link #getInterpretation() <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretation()
	 * @generated
	 * @ordered
	 */
	protected static final TimeInterpretationKind INTERPRETATION_EDEFAULT = TimeInterpretationKind.DURATION;

	/**
	 * The cached value of the '{@link #getInterpretation() <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretation()
	 * @generated
	 * @ordered
	 */
	protected TimeInterpretationKind interpretation = INTERPRETATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TimePackage.Literals.TIMED_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOn() {
		if (on == null) {
			on = new EObjectResolvingEList(Clock.class, this, TimePackage.TIMED_CONSTRAINT__ON);
		}
		return on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterpretationKind getInterpretation() {
		return interpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpretation(TimeInterpretationKind newInterpretation) {
		TimeInterpretationKind oldInterpretation = interpretation;
		interpretation = newInterpretation == null ? INTERPRETATION_EDEFAULT : newInterpretation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.TIMED_CONSTRAINT__INTERPRETATION, oldInterpretation, interpretation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimePackage.TIMED_CONSTRAINT__ON:
				return getOn();
			case TimePackage.TIMED_CONSTRAINT__INTERPRETATION:
				return getInterpretation();
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
			case TimePackage.TIMED_CONSTRAINT__ON:
				getOn().clear();
				getOn().addAll((Collection)newValue);
				return;
			case TimePackage.TIMED_CONSTRAINT__INTERPRETATION:
				setInterpretation((TimeInterpretationKind)newValue);
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
			case TimePackage.TIMED_CONSTRAINT__ON:
				getOn().clear();
				return;
			case TimePackage.TIMED_CONSTRAINT__INTERPRETATION:
				setInterpretation(INTERPRETATION_EDEFAULT);
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
			case TimePackage.TIMED_CONSTRAINT__ON:
				return on != null && !on.isEmpty();
			case TimePackage.TIMED_CONSTRAINT__INTERPRETATION:
				return interpretation != INTERPRETATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == TimedElement.class) {
			switch (derivedFeatureID) {
				case TimePackage.TIMED_CONSTRAINT__ON: return TimePackage.TIMED_ELEMENT__ON;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == TimedElement.class) {
			switch (baseFeatureID) {
				case TimePackage.TIMED_ELEMENT__ON: return TimePackage.TIMED_CONSTRAINT__ON;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (interpretation: ");
		result.append(interpretation);
		result.append(')');
		return result.toString();
	}

} //TimedConstraintImpl
