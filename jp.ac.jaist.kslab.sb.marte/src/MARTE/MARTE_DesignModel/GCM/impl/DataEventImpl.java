/**
 */
package MARTE.MARTE_DesignModel.GCM.impl;

import MARTE.MARTE_DesignModel.GCM.DataEvent;
import MARTE.MARTE_DesignModel.GCM.GCMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.AnyReceiveEvent;
import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.impl.DataEventImpl#getBase_AnyReceiveEvent <em>Base Any Receive Event</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.impl.DataEventImpl#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataEventImpl extends EObjectImpl implements DataEvent {
	/**
	 * The cached value of the '{@link #getBase_AnyReceiveEvent() <em>Base Any Receive Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_AnyReceiveEvent()
	 * @generated
	 * @ordered
	 */
	protected AnyReceiveEvent base_AnyReceiveEvent;

	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected Classifier classifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GCMPackage.Literals.DATA_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyReceiveEvent getBase_AnyReceiveEvent() {
		if (base_AnyReceiveEvent != null && base_AnyReceiveEvent.eIsProxy()) {
			InternalEObject oldBase_AnyReceiveEvent = (InternalEObject)base_AnyReceiveEvent;
			base_AnyReceiveEvent = (AnyReceiveEvent)eResolveProxy(oldBase_AnyReceiveEvent);
			if (base_AnyReceiveEvent != oldBase_AnyReceiveEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GCMPackage.DATA_EVENT__BASE_ANY_RECEIVE_EVENT, oldBase_AnyReceiveEvent, base_AnyReceiveEvent));
			}
		}
		return base_AnyReceiveEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyReceiveEvent basicGetBase_AnyReceiveEvent() {
		return base_AnyReceiveEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_AnyReceiveEvent(AnyReceiveEvent newBase_AnyReceiveEvent) {
		AnyReceiveEvent oldBase_AnyReceiveEvent = base_AnyReceiveEvent;
		base_AnyReceiveEvent = newBase_AnyReceiveEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCMPackage.DATA_EVENT__BASE_ANY_RECEIVE_EVENT, oldBase_AnyReceiveEvent, base_AnyReceiveEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getClassifier() {
		if (classifier != null && classifier.eIsProxy()) {
			InternalEObject oldClassifier = (InternalEObject)classifier;
			classifier = (Classifier)eResolveProxy(oldClassifier);
			if (classifier != oldClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GCMPackage.DATA_EVENT__CLASSIFIER, oldClassifier, classifier));
			}
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetClassifier() {
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier(Classifier newClassifier) {
		Classifier oldClassifier = classifier;
		classifier = newClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCMPackage.DATA_EVENT__CLASSIFIER, oldClassifier, classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GCMPackage.DATA_EVENT__BASE_ANY_RECEIVE_EVENT:
				if (resolve) return getBase_AnyReceiveEvent();
				return basicGetBase_AnyReceiveEvent();
			case GCMPackage.DATA_EVENT__CLASSIFIER:
				if (resolve) return getClassifier();
				return basicGetClassifier();
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
			case GCMPackage.DATA_EVENT__BASE_ANY_RECEIVE_EVENT:
				setBase_AnyReceiveEvent((AnyReceiveEvent)newValue);
				return;
			case GCMPackage.DATA_EVENT__CLASSIFIER:
				setClassifier((Classifier)newValue);
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
			case GCMPackage.DATA_EVENT__BASE_ANY_RECEIVE_EVENT:
				setBase_AnyReceiveEvent((AnyReceiveEvent)null);
				return;
			case GCMPackage.DATA_EVENT__CLASSIFIER:
				setClassifier((Classifier)null);
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
			case GCMPackage.DATA_EVENT__BASE_ANY_RECEIVE_EVENT:
				return base_AnyReceiveEvent != null;
			case GCMPackage.DATA_EVENT__CLASSIFIER:
				return classifier != null;
		}
		return super.eIsSet(featureID);
	}

} //DataEventImpl
