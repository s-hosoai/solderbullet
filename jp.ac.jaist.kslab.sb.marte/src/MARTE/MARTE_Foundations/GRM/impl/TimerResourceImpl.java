/**
 */
package MARTE.MARTE_Foundations.GRM.impl;

import MARTE.MARTE_Foundations.GRM.GRMPackage;
import MARTE.MARTE_Foundations.GRM.TimerResource;

import MARTE_Library.BasicNFP_Types.NFP_Duration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timer Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.TimerResourceImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.TimerResourceImpl#getIsPeriodic <em>Is Periodic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimerResourceImpl extends TimingResourceImpl implements TimerResource {
	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration duration;

	/**
	 * The default value of the '{@link #getIsPeriodic() <em>Is Periodic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPeriodic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PERIODIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsPeriodic() <em>Is Periodic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPeriodic()
	 * @generated
	 * @ordered
	 */
	protected Boolean isPeriodic = IS_PERIODIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GRMPackage.Literals.TIMER_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(NFP_Duration newDuration, NotificationChain msgs) {
		NFP_Duration oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRMPackage.TIMER_RESOURCE__DURATION, oldDuration, newDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(NFP_Duration newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GRMPackage.TIMER_RESOURCE__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GRMPackage.TIMER_RESOURCE__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRMPackage.TIMER_RESOURCE__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsPeriodic() {
		return isPeriodic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPeriodic(Boolean newIsPeriodic) {
		Boolean oldIsPeriodic = isPeriodic;
		isPeriodic = newIsPeriodic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRMPackage.TIMER_RESOURCE__IS_PERIODIC, oldIsPeriodic, isPeriodic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRMPackage.TIMER_RESOURCE__DURATION:
				return basicSetDuration(null, msgs);
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
			case GRMPackage.TIMER_RESOURCE__DURATION:
				return getDuration();
			case GRMPackage.TIMER_RESOURCE__IS_PERIODIC:
				return getIsPeriodic();
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
			case GRMPackage.TIMER_RESOURCE__DURATION:
				setDuration((NFP_Duration)newValue);
				return;
			case GRMPackage.TIMER_RESOURCE__IS_PERIODIC:
				setIsPeriodic((Boolean)newValue);
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
			case GRMPackage.TIMER_RESOURCE__DURATION:
				setDuration((NFP_Duration)null);
				return;
			case GRMPackage.TIMER_RESOURCE__IS_PERIODIC:
				setIsPeriodic(IS_PERIODIC_EDEFAULT);
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
			case GRMPackage.TIMER_RESOURCE__DURATION:
				return duration != null;
			case GRMPackage.TIMER_RESOURCE__IS_PERIODIC:
				return IS_PERIODIC_EDEFAULT == null ? isPeriodic != null : !IS_PERIODIC_EDEFAULT.equals(isPeriodic);
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
		result.append(" (isPeriodic: ");
		result.append(isPeriodic);
		result.append(')');
		return result.toString();
	}

} //TimerResourceImpl
