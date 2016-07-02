/**
 */
package MARTE.MARTE_Annexes.RSM.impl;

import MARTE.MARTE_Annexes.RSM.RSMPackage;
import MARTE.MARTE_Annexes.RSM.Reshape;

import MARTE_Library.RS_Library.ShapeSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reshape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.impl.ReshapeImpl#getPatternShape <em>Pattern Shape</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.impl.ReshapeImpl#getRepetitonShape <em>Repetiton Shape</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReshapeImpl extends LinkTopologyImpl implements Reshape {
	/**
	 * The cached value of the '{@link #getPatternShape() <em>Pattern Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternShape()
	 * @generated
	 * @ordered
	 */
	protected ShapeSpecification patternShape;

	/**
	 * The cached value of the '{@link #getRepetitonShape() <em>Repetiton Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitonShape()
	 * @generated
	 * @ordered
	 */
	protected ShapeSpecification repetitonShape;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReshapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RSMPackage.Literals.RESHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeSpecification getPatternShape() {
		return patternShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternShape(ShapeSpecification newPatternShape, NotificationChain msgs) {
		ShapeSpecification oldPatternShape = patternShape;
		patternShape = newPatternShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSMPackage.RESHAPE__PATTERN_SHAPE, oldPatternShape, newPatternShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternShape(ShapeSpecification newPatternShape) {
		if (newPatternShape != patternShape) {
			NotificationChain msgs = null;
			if (patternShape != null)
				msgs = ((InternalEObject)patternShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSMPackage.RESHAPE__PATTERN_SHAPE, null, msgs);
			if (newPatternShape != null)
				msgs = ((InternalEObject)newPatternShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSMPackage.RESHAPE__PATTERN_SHAPE, null, msgs);
			msgs = basicSetPatternShape(newPatternShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSMPackage.RESHAPE__PATTERN_SHAPE, newPatternShape, newPatternShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeSpecification getRepetitonShape() {
		return repetitonShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepetitonShape(ShapeSpecification newRepetitonShape, NotificationChain msgs) {
		ShapeSpecification oldRepetitonShape = repetitonShape;
		repetitonShape = newRepetitonShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSMPackage.RESHAPE__REPETITON_SHAPE, oldRepetitonShape, newRepetitonShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepetitonShape(ShapeSpecification newRepetitonShape) {
		if (newRepetitonShape != repetitonShape) {
			NotificationChain msgs = null;
			if (repetitonShape != null)
				msgs = ((InternalEObject)repetitonShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSMPackage.RESHAPE__REPETITON_SHAPE, null, msgs);
			if (newRepetitonShape != null)
				msgs = ((InternalEObject)newRepetitonShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSMPackage.RESHAPE__REPETITON_SHAPE, null, msgs);
			msgs = basicSetRepetitonShape(newRepetitonShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSMPackage.RESHAPE__REPETITON_SHAPE, newRepetitonShape, newRepetitonShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RSMPackage.RESHAPE__PATTERN_SHAPE:
				return basicSetPatternShape(null, msgs);
			case RSMPackage.RESHAPE__REPETITON_SHAPE:
				return basicSetRepetitonShape(null, msgs);
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
			case RSMPackage.RESHAPE__PATTERN_SHAPE:
				return getPatternShape();
			case RSMPackage.RESHAPE__REPETITON_SHAPE:
				return getRepetitonShape();
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
			case RSMPackage.RESHAPE__PATTERN_SHAPE:
				setPatternShape((ShapeSpecification)newValue);
				return;
			case RSMPackage.RESHAPE__REPETITON_SHAPE:
				setRepetitonShape((ShapeSpecification)newValue);
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
			case RSMPackage.RESHAPE__PATTERN_SHAPE:
				setPatternShape((ShapeSpecification)null);
				return;
			case RSMPackage.RESHAPE__REPETITON_SHAPE:
				setRepetitonShape((ShapeSpecification)null);
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
			case RSMPackage.RESHAPE__PATTERN_SHAPE:
				return patternShape != null;
			case RSMPackage.RESHAPE__REPETITON_SHAPE:
				return repetitonShape != null;
		}
		return super.eIsSet(featureID);
	}

} //ReshapeImpl
