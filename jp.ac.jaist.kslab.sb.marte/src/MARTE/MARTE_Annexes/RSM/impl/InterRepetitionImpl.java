/**
 */
package MARTE.MARTE_Annexes.RSM.impl;

import MARTE.MARTE_Annexes.RSM.InterRepetition;
import MARTE.MARTE_Annexes.RSM.RSMPackage;

import MARTE_Library.MARTE_DataTypes.IntegerVector;

import MARTE_Library.MARTE_PrimitivesTypes.MARTE_PrimitivesTypesFactory;
import MARTE_Library.MARTE_PrimitivesTypes.MARTE_PrimitivesTypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inter Repetition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.impl.InterRepetitionImpl#getRepetitionShapeDependence <em>Repetition Shape Dependence</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.impl.InterRepetitionImpl#getIsModulo <em>Is Modulo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterRepetitionImpl extends LinkTopologyImpl implements InterRepetition {
	/**
	 * The cached value of the '{@link #getRepetitionShapeDependence() <em>Repetition Shape Dependence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitionShapeDependence()
	 * @generated
	 * @ordered
	 */
	protected IntegerVector repetitionShapeDependence;

	/**
	 * The default value of the '{@link #getIsModulo() <em>Is Modulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsModulo()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_MODULO_EDEFAULT = (Boolean)MARTE_PrimitivesTypesFactory.eINSTANCE.createFromString(MARTE_PrimitivesTypesPackage.eINSTANCE.getBoolean(), "false");

	/**
	 * The cached value of the '{@link #getIsModulo() <em>Is Modulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsModulo()
	 * @generated
	 * @ordered
	 */
	protected Boolean isModulo = IS_MODULO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterRepetitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RSMPackage.Literals.INTER_REPETITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVector getRepetitionShapeDependence() {
		return repetitionShapeDependence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepetitionShapeDependence(IntegerVector newRepetitionShapeDependence, NotificationChain msgs) {
		IntegerVector oldRepetitionShapeDependence = repetitionShapeDependence;
		repetitionShapeDependence = newRepetitionShapeDependence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSMPackage.INTER_REPETITION__REPETITION_SHAPE_DEPENDENCE, oldRepetitionShapeDependence, newRepetitionShapeDependence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepetitionShapeDependence(IntegerVector newRepetitionShapeDependence) {
		if (newRepetitionShapeDependence != repetitionShapeDependence) {
			NotificationChain msgs = null;
			if (repetitionShapeDependence != null)
				msgs = ((InternalEObject)repetitionShapeDependence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSMPackage.INTER_REPETITION__REPETITION_SHAPE_DEPENDENCE, null, msgs);
			if (newRepetitionShapeDependence != null)
				msgs = ((InternalEObject)newRepetitionShapeDependence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSMPackage.INTER_REPETITION__REPETITION_SHAPE_DEPENDENCE, null, msgs);
			msgs = basicSetRepetitionShapeDependence(newRepetitionShapeDependence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSMPackage.INTER_REPETITION__REPETITION_SHAPE_DEPENDENCE, newRepetitionShapeDependence, newRepetitionShapeDependence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsModulo() {
		return isModulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsModulo(Boolean newIsModulo) {
		Boolean oldIsModulo = isModulo;
		isModulo = newIsModulo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSMPackage.INTER_REPETITION__IS_MODULO, oldIsModulo, isModulo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RSMPackage.INTER_REPETITION__REPETITION_SHAPE_DEPENDENCE:
				return basicSetRepetitionShapeDependence(null, msgs);
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
			case RSMPackage.INTER_REPETITION__REPETITION_SHAPE_DEPENDENCE:
				return getRepetitionShapeDependence();
			case RSMPackage.INTER_REPETITION__IS_MODULO:
				return getIsModulo();
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
			case RSMPackage.INTER_REPETITION__REPETITION_SHAPE_DEPENDENCE:
				setRepetitionShapeDependence((IntegerVector)newValue);
				return;
			case RSMPackage.INTER_REPETITION__IS_MODULO:
				setIsModulo((Boolean)newValue);
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
			case RSMPackage.INTER_REPETITION__REPETITION_SHAPE_DEPENDENCE:
				setRepetitionShapeDependence((IntegerVector)null);
				return;
			case RSMPackage.INTER_REPETITION__IS_MODULO:
				setIsModulo(IS_MODULO_EDEFAULT);
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
			case RSMPackage.INTER_REPETITION__REPETITION_SHAPE_DEPENDENCE:
				return repetitionShapeDependence != null;
			case RSMPackage.INTER_REPETITION__IS_MODULO:
				return IS_MODULO_EDEFAULT == null ? isModulo != null : !IS_MODULO_EDEFAULT.equals(isModulo);
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
		result.append(" (isModulo: ");
		result.append(isModulo);
		result.append(')');
		return result.toString();
	}

} //InterRepetitionImpl
