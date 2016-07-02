/**
 */
package MARTE.MARTE_Annexes.RSM.impl;

import MARTE.MARTE_Annexes.RSM.RSMPackage;
import MARTE.MARTE_Annexes.RSM.Shaped;

import MARTE_Library.RS_Library.ShapeSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.MultiplicityElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shaped</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.impl.ShapedImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.impl.ShapedImpl#getBase_MultiplicityElement <em>Base Multiplicity Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShapedImpl extends EObjectImpl implements Shaped {
	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected ShapeSpecification shape;

	/**
	 * The cached value of the '{@link #getBase_MultiplicityElement() <em>Base Multiplicity Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_MultiplicityElement()
	 * @generated
	 * @ordered
	 */
	protected MultiplicityElement base_MultiplicityElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RSMPackage.Literals.SHAPED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeSpecification getShape() {
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShape(ShapeSpecification newShape, NotificationChain msgs) {
		ShapeSpecification oldShape = shape;
		shape = newShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSMPackage.SHAPED__SHAPE, oldShape, newShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShape(ShapeSpecification newShape) {
		if (newShape != shape) {
			NotificationChain msgs = null;
			if (shape != null)
				msgs = ((InternalEObject)shape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSMPackage.SHAPED__SHAPE, null, msgs);
			if (newShape != null)
				msgs = ((InternalEObject)newShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSMPackage.SHAPED__SHAPE, null, msgs);
			msgs = basicSetShape(newShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSMPackage.SHAPED__SHAPE, newShape, newShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityElement getBase_MultiplicityElement() {
		if (base_MultiplicityElement != null && base_MultiplicityElement.eIsProxy()) {
			InternalEObject oldBase_MultiplicityElement = (InternalEObject)base_MultiplicityElement;
			base_MultiplicityElement = (MultiplicityElement)eResolveProxy(oldBase_MultiplicityElement);
			if (base_MultiplicityElement != oldBase_MultiplicityElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSMPackage.SHAPED__BASE_MULTIPLICITY_ELEMENT, oldBase_MultiplicityElement, base_MultiplicityElement));
			}
		}
		return base_MultiplicityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityElement basicGetBase_MultiplicityElement() {
		return base_MultiplicityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_MultiplicityElement(MultiplicityElement newBase_MultiplicityElement) {
		MultiplicityElement oldBase_MultiplicityElement = base_MultiplicityElement;
		base_MultiplicityElement = newBase_MultiplicityElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSMPackage.SHAPED__BASE_MULTIPLICITY_ELEMENT, oldBase_MultiplicityElement, base_MultiplicityElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RSMPackage.SHAPED__SHAPE:
				return basicSetShape(null, msgs);
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
			case RSMPackage.SHAPED__SHAPE:
				return getShape();
			case RSMPackage.SHAPED__BASE_MULTIPLICITY_ELEMENT:
				if (resolve) return getBase_MultiplicityElement();
				return basicGetBase_MultiplicityElement();
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
			case RSMPackage.SHAPED__SHAPE:
				setShape((ShapeSpecification)newValue);
				return;
			case RSMPackage.SHAPED__BASE_MULTIPLICITY_ELEMENT:
				setBase_MultiplicityElement((MultiplicityElement)newValue);
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
			case RSMPackage.SHAPED__SHAPE:
				setShape((ShapeSpecification)null);
				return;
			case RSMPackage.SHAPED__BASE_MULTIPLICITY_ELEMENT:
				setBase_MultiplicityElement((MultiplicityElement)null);
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
			case RSMPackage.SHAPED__SHAPE:
				return shape != null;
			case RSMPackage.SHAPED__BASE_MULTIPLICITY_ELEMENT:
				return base_MultiplicityElement != null;
		}
		return super.eIsSet(featureID);
	}

} //ShapedImpl
