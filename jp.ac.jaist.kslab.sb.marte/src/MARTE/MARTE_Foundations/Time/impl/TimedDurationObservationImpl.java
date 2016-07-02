/**
 */
package MARTE.MARTE_Foundations.Time.impl;

import MARTE.MARTE_Foundations.Time.TimePackage;
import MARTE.MARTE_Foundations.Time.TimedDurationObservation;

import MARTE_Library.TimeTypesLibrary.EventKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.uml2.uml.DurationObservation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Duration Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.Time.impl.TimedDurationObservationImpl#getObsKind <em>Obs Kind</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Time.impl.TimedDurationObservationImpl#getBase_DurationObservation <em>Base Duration Observation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimedDurationObservationImpl extends TimedObservationImpl implements TimedDurationObservation {
	/**
	 * The cached value of the '{@link #getObsKind() <em>Obs Kind</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObsKind()
	 * @generated
	 * @ordered
	 */
	protected EList obsKind;

	/**
	 * The cached value of the '{@link #getBase_DurationObservation() <em>Base Duration Observation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_DurationObservation()
	 * @generated
	 * @ordered
	 */
	protected DurationObservation base_DurationObservation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedDurationObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TimePackage.Literals.TIMED_DURATION_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getObsKind() {
		if (obsKind == null) {
			obsKind = new EDataTypeEList(EventKind.class, this, TimePackage.TIMED_DURATION_OBSERVATION__OBS_KIND);
		}
		return obsKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationObservation getBase_DurationObservation() {
		if (base_DurationObservation != null && base_DurationObservation.eIsProxy()) {
			InternalEObject oldBase_DurationObservation = (InternalEObject)base_DurationObservation;
			base_DurationObservation = (DurationObservation)eResolveProxy(oldBase_DurationObservation);
			if (base_DurationObservation != oldBase_DurationObservation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimePackage.TIMED_DURATION_OBSERVATION__BASE_DURATION_OBSERVATION, oldBase_DurationObservation, base_DurationObservation));
			}
		}
		return base_DurationObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationObservation basicGetBase_DurationObservation() {
		return base_DurationObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_DurationObservation(DurationObservation newBase_DurationObservation) {
		DurationObservation oldBase_DurationObservation = base_DurationObservation;
		base_DurationObservation = newBase_DurationObservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimePackage.TIMED_DURATION_OBSERVATION__BASE_DURATION_OBSERVATION, oldBase_DurationObservation, base_DurationObservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimePackage.TIMED_DURATION_OBSERVATION__OBS_KIND:
				return getObsKind();
			case TimePackage.TIMED_DURATION_OBSERVATION__BASE_DURATION_OBSERVATION:
				if (resolve) return getBase_DurationObservation();
				return basicGetBase_DurationObservation();
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
			case TimePackage.TIMED_DURATION_OBSERVATION__OBS_KIND:
				getObsKind().clear();
				getObsKind().addAll((Collection)newValue);
				return;
			case TimePackage.TIMED_DURATION_OBSERVATION__BASE_DURATION_OBSERVATION:
				setBase_DurationObservation((DurationObservation)newValue);
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
			case TimePackage.TIMED_DURATION_OBSERVATION__OBS_KIND:
				getObsKind().clear();
				return;
			case TimePackage.TIMED_DURATION_OBSERVATION__BASE_DURATION_OBSERVATION:
				setBase_DurationObservation((DurationObservation)null);
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
			case TimePackage.TIMED_DURATION_OBSERVATION__OBS_KIND:
				return obsKind != null && !obsKind.isEmpty();
			case TimePackage.TIMED_DURATION_OBSERVATION__BASE_DURATION_OBSERVATION:
				return base_DurationObservation != null;
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
		result.append(" (obsKind: ");
		result.append(obsKind);
		result.append(')');
		return result.toString();
	}

} //TimedDurationObservationImpl
