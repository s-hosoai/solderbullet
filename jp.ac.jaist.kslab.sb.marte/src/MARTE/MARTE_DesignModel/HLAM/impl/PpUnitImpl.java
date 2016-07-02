/**
 */
package MARTE.MARTE_DesignModel.HLAM.impl;

import MARTE.MARTE_DesignModel.HLAM.CallConcurrencyKind;
import MARTE.MARTE_DesignModel.HLAM.HLAMPackage;
import MARTE.MARTE_DesignModel.HLAM.PpUnit;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.BehavioredClassifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pp Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.PpUnitImpl#getConcPolicy <em>Conc Policy</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.PpUnitImpl#getMemorySize <em>Memory Size</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.impl.PpUnitImpl#getBase_BehavioredClassifier <em>Base Behaviored Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PpUnitImpl extends EObjectImpl implements PpUnit {
	/**
	 * The default value of the '{@link #getConcPolicy() <em>Conc Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final CallConcurrencyKind CONC_POLICY_EDEFAULT = CallConcurrencyKind.SEQUENTIAL_LITERAL;

	/**
	 * The cached value of the '{@link #getConcPolicy() <em>Conc Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcPolicy()
	 * @generated
	 * @ordered
	 */
	protected CallConcurrencyKind concPolicy = CONC_POLICY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMemorySize() <em>Memory Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySize()
	 * @generated
	 * @ordered
	 */
	protected NFP_DataSize memorySize;

	/**
	 * The cached value of the '{@link #getBase_BehavioredClassifier() <em>Base Behaviored Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_BehavioredClassifier()
	 * @generated
	 * @ordered
	 */
	protected BehavioredClassifier base_BehavioredClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PpUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HLAMPackage.Literals.PP_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallConcurrencyKind getConcPolicy() {
		return concPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcPolicy(CallConcurrencyKind newConcPolicy) {
		CallConcurrencyKind oldConcPolicy = concPolicy;
		concPolicy = newConcPolicy == null ? CONC_POLICY_EDEFAULT : newConcPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.PP_UNIT__CONC_POLICY, oldConcPolicy, concPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataSize getMemorySize() {
		return memorySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemorySize(NFP_DataSize newMemorySize, NotificationChain msgs) {
		NFP_DataSize oldMemorySize = memorySize;
		memorySize = newMemorySize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HLAMPackage.PP_UNIT__MEMORY_SIZE, oldMemorySize, newMemorySize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemorySize(NFP_DataSize newMemorySize) {
		if (newMemorySize != memorySize) {
			NotificationChain msgs = null;
			if (memorySize != null)
				msgs = ((InternalEObject)memorySize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.PP_UNIT__MEMORY_SIZE, null, msgs);
			if (newMemorySize != null)
				msgs = ((InternalEObject)newMemorySize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HLAMPackage.PP_UNIT__MEMORY_SIZE, null, msgs);
			msgs = basicSetMemorySize(newMemorySize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.PP_UNIT__MEMORY_SIZE, newMemorySize, newMemorySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier getBase_BehavioredClassifier() {
		if (base_BehavioredClassifier != null && base_BehavioredClassifier.eIsProxy()) {
			InternalEObject oldBase_BehavioredClassifier = (InternalEObject)base_BehavioredClassifier;
			base_BehavioredClassifier = (BehavioredClassifier)eResolveProxy(oldBase_BehavioredClassifier);
			if (base_BehavioredClassifier != oldBase_BehavioredClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HLAMPackage.PP_UNIT__BASE_BEHAVIORED_CLASSIFIER, oldBase_BehavioredClassifier, base_BehavioredClassifier));
			}
		}
		return base_BehavioredClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier basicGetBase_BehavioredClassifier() {
		return base_BehavioredClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_BehavioredClassifier(BehavioredClassifier newBase_BehavioredClassifier) {
		BehavioredClassifier oldBase_BehavioredClassifier = base_BehavioredClassifier;
		base_BehavioredClassifier = newBase_BehavioredClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLAMPackage.PP_UNIT__BASE_BEHAVIORED_CLASSIFIER, oldBase_BehavioredClassifier, base_BehavioredClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HLAMPackage.PP_UNIT__MEMORY_SIZE:
				return basicSetMemorySize(null, msgs);
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
			case HLAMPackage.PP_UNIT__CONC_POLICY:
				return getConcPolicy();
			case HLAMPackage.PP_UNIT__MEMORY_SIZE:
				return getMemorySize();
			case HLAMPackage.PP_UNIT__BASE_BEHAVIORED_CLASSIFIER:
				if (resolve) return getBase_BehavioredClassifier();
				return basicGetBase_BehavioredClassifier();
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
			case HLAMPackage.PP_UNIT__CONC_POLICY:
				setConcPolicy((CallConcurrencyKind)newValue);
				return;
			case HLAMPackage.PP_UNIT__MEMORY_SIZE:
				setMemorySize((NFP_DataSize)newValue);
				return;
			case HLAMPackage.PP_UNIT__BASE_BEHAVIORED_CLASSIFIER:
				setBase_BehavioredClassifier((BehavioredClassifier)newValue);
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
			case HLAMPackage.PP_UNIT__CONC_POLICY:
				setConcPolicy(CONC_POLICY_EDEFAULT);
				return;
			case HLAMPackage.PP_UNIT__MEMORY_SIZE:
				setMemorySize((NFP_DataSize)null);
				return;
			case HLAMPackage.PP_UNIT__BASE_BEHAVIORED_CLASSIFIER:
				setBase_BehavioredClassifier((BehavioredClassifier)null);
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
			case HLAMPackage.PP_UNIT__CONC_POLICY:
				return concPolicy != CONC_POLICY_EDEFAULT;
			case HLAMPackage.PP_UNIT__MEMORY_SIZE:
				return memorySize != null;
			case HLAMPackage.PP_UNIT__BASE_BEHAVIORED_CLASSIFIER:
				return base_BehavioredClassifier != null;
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
		result.append(" (concPolicy: ");
		result.append(concPolicy);
		result.append(')');
		return result.toString();
	}

} //PpUnitImpl
