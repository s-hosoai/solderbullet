/**
 */
package MARTE.MARTE_Annexes.RSM.impl;

import MARTE.MARTE_Annexes.RSM.Distribute;
import MARTE.MARTE_Annexes.RSM.RSMPackage;

import MARTE.MARTE_Foundations.Alloc.impl.AllocateImpl;

import MARTE_Library.RS_Library.ShapeSpecification;
import MARTE_Library.RS_Library.TilerSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.impl.DistributeImpl#getPatternShape <em>Pattern Shape</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.impl.DistributeImpl#getRepetitionSpace <em>Repetition Space</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.impl.DistributeImpl#getFromTiler <em>From Tiler</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.impl.DistributeImpl#getToTiler <em>To Tiler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistributeImpl extends AllocateImpl implements Distribute {
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
	 * The cached value of the '{@link #getRepetitionSpace() <em>Repetition Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitionSpace()
	 * @generated
	 * @ordered
	 */
	protected ShapeSpecification repetitionSpace;

	/**
	 * The cached value of the '{@link #getFromTiler() <em>From Tiler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTiler()
	 * @generated
	 * @ordered
	 */
	protected TilerSpecification fromTiler;

	/**
	 * The cached value of the '{@link #getToTiler() <em>To Tiler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTiler()
	 * @generated
	 * @ordered
	 */
	protected TilerSpecification toTiler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RSMPackage.Literals.DISTRIBUTE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSMPackage.DISTRIBUTE__PATTERN_SHAPE, oldPatternShape, newPatternShape);
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
				msgs = ((InternalEObject)patternShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSMPackage.DISTRIBUTE__PATTERN_SHAPE, null, msgs);
			if (newPatternShape != null)
				msgs = ((InternalEObject)newPatternShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSMPackage.DISTRIBUTE__PATTERN_SHAPE, null, msgs);
			msgs = basicSetPatternShape(newPatternShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSMPackage.DISTRIBUTE__PATTERN_SHAPE, newPatternShape, newPatternShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeSpecification getRepetitionSpace() {
		return repetitionSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepetitionSpace(ShapeSpecification newRepetitionSpace, NotificationChain msgs) {
		ShapeSpecification oldRepetitionSpace = repetitionSpace;
		repetitionSpace = newRepetitionSpace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSMPackage.DISTRIBUTE__REPETITION_SPACE, oldRepetitionSpace, newRepetitionSpace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepetitionSpace(ShapeSpecification newRepetitionSpace) {
		if (newRepetitionSpace != repetitionSpace) {
			NotificationChain msgs = null;
			if (repetitionSpace != null)
				msgs = ((InternalEObject)repetitionSpace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSMPackage.DISTRIBUTE__REPETITION_SPACE, null, msgs);
			if (newRepetitionSpace != null)
				msgs = ((InternalEObject)newRepetitionSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSMPackage.DISTRIBUTE__REPETITION_SPACE, null, msgs);
			msgs = basicSetRepetitionSpace(newRepetitionSpace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSMPackage.DISTRIBUTE__REPETITION_SPACE, newRepetitionSpace, newRepetitionSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TilerSpecification getFromTiler() {
		return fromTiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromTiler(TilerSpecification newFromTiler, NotificationChain msgs) {
		TilerSpecification oldFromTiler = fromTiler;
		fromTiler = newFromTiler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSMPackage.DISTRIBUTE__FROM_TILER, oldFromTiler, newFromTiler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromTiler(TilerSpecification newFromTiler) {
		if (newFromTiler != fromTiler) {
			NotificationChain msgs = null;
			if (fromTiler != null)
				msgs = ((InternalEObject)fromTiler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSMPackage.DISTRIBUTE__FROM_TILER, null, msgs);
			if (newFromTiler != null)
				msgs = ((InternalEObject)newFromTiler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSMPackage.DISTRIBUTE__FROM_TILER, null, msgs);
			msgs = basicSetFromTiler(newFromTiler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSMPackage.DISTRIBUTE__FROM_TILER, newFromTiler, newFromTiler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TilerSpecification getToTiler() {
		return toTiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToTiler(TilerSpecification newToTiler, NotificationChain msgs) {
		TilerSpecification oldToTiler = toTiler;
		toTiler = newToTiler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSMPackage.DISTRIBUTE__TO_TILER, oldToTiler, newToTiler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToTiler(TilerSpecification newToTiler) {
		if (newToTiler != toTiler) {
			NotificationChain msgs = null;
			if (toTiler != null)
				msgs = ((InternalEObject)toTiler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSMPackage.DISTRIBUTE__TO_TILER, null, msgs);
			if (newToTiler != null)
				msgs = ((InternalEObject)newToTiler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSMPackage.DISTRIBUTE__TO_TILER, null, msgs);
			msgs = basicSetToTiler(newToTiler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSMPackage.DISTRIBUTE__TO_TILER, newToTiler, newToTiler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RSMPackage.DISTRIBUTE__PATTERN_SHAPE:
				return basicSetPatternShape(null, msgs);
			case RSMPackage.DISTRIBUTE__REPETITION_SPACE:
				return basicSetRepetitionSpace(null, msgs);
			case RSMPackage.DISTRIBUTE__FROM_TILER:
				return basicSetFromTiler(null, msgs);
			case RSMPackage.DISTRIBUTE__TO_TILER:
				return basicSetToTiler(null, msgs);
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
			case RSMPackage.DISTRIBUTE__PATTERN_SHAPE:
				return getPatternShape();
			case RSMPackage.DISTRIBUTE__REPETITION_SPACE:
				return getRepetitionSpace();
			case RSMPackage.DISTRIBUTE__FROM_TILER:
				return getFromTiler();
			case RSMPackage.DISTRIBUTE__TO_TILER:
				return getToTiler();
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
			case RSMPackage.DISTRIBUTE__PATTERN_SHAPE:
				setPatternShape((ShapeSpecification)newValue);
				return;
			case RSMPackage.DISTRIBUTE__REPETITION_SPACE:
				setRepetitionSpace((ShapeSpecification)newValue);
				return;
			case RSMPackage.DISTRIBUTE__FROM_TILER:
				setFromTiler((TilerSpecification)newValue);
				return;
			case RSMPackage.DISTRIBUTE__TO_TILER:
				setToTiler((TilerSpecification)newValue);
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
			case RSMPackage.DISTRIBUTE__PATTERN_SHAPE:
				setPatternShape((ShapeSpecification)null);
				return;
			case RSMPackage.DISTRIBUTE__REPETITION_SPACE:
				setRepetitionSpace((ShapeSpecification)null);
				return;
			case RSMPackage.DISTRIBUTE__FROM_TILER:
				setFromTiler((TilerSpecification)null);
				return;
			case RSMPackage.DISTRIBUTE__TO_TILER:
				setToTiler((TilerSpecification)null);
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
			case RSMPackage.DISTRIBUTE__PATTERN_SHAPE:
				return patternShape != null;
			case RSMPackage.DISTRIBUTE__REPETITION_SPACE:
				return repetitionSpace != null;
			case RSMPackage.DISTRIBUTE__FROM_TILER:
				return fromTiler != null;
			case RSMPackage.DISTRIBUTE__TO_TILER:
				return toTiler != null;
		}
		return super.eIsSet(featureID);
	}

} //DistributeImpl
