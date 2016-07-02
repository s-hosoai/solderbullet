/**
 */
package MARTE.MARTE_Foundations.GRM.impl;

import MARTE.MARTE_Foundations.GRM.GRMPackage;
import MARTE.MARTE_Foundations.GRM.Resource;

import MARTE_Library.BasicNFP_Types.NFP_Integer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.ResourceImpl#getResMult <em>Res Mult</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.ResourceImpl#getIsProtected <em>Is Protected</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.ResourceImpl#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.ResourceImpl#getBase_InstanceSpecification <em>Base Instance Specification</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.ResourceImpl#getBase_Classifier <em>Base Classifier</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.ResourceImpl#getBase_Lifeline <em>Base Lifeline</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.impl.ResourceImpl#getBase_ConnectableElement <em>Base Connectable Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends EObjectImpl implements Resource {
	/**
	 * The cached value of the '{@link #getResMult() <em>Res Mult</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResMult()
	 * @generated
	 * @ordered
	 */
	protected NFP_Integer resMult;

	/**
	 * The default value of the '{@link #getIsProtected() <em>Is Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsProtected()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PROTECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsProtected() <em>Is Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsProtected()
	 * @generated
	 * @ordered
	 */
	protected Boolean isProtected = IS_PROTECTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Property()
	 * @generated
	 * @ordered
	 */
	protected Property base_Property;

	/**
	 * The cached value of the '{@link #getBase_InstanceSpecification() <em>Base Instance Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_InstanceSpecification()
	 * @generated
	 * @ordered
	 */
	protected InstanceSpecification base_InstanceSpecification;

	/**
	 * The cached value of the '{@link #getBase_Classifier() <em>Base Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Classifier()
	 * @generated
	 * @ordered
	 */
	protected Classifier base_Classifier;

	/**
	 * The cached value of the '{@link #getBase_Lifeline() <em>Base Lifeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Lifeline()
	 * @generated
	 * @ordered
	 */
	protected Lifeline base_Lifeline;

	/**
	 * The cached value of the '{@link #getBase_ConnectableElement() <em>Base Connectable Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ConnectableElement()
	 * @generated
	 * @ordered
	 */
	protected ConnectableElement base_ConnectableElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GRMPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Integer getResMult() {
		return resMult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResMult(NFP_Integer newResMult, NotificationChain msgs) {
		NFP_Integer oldResMult = resMult;
		resMult = newResMult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GRMPackage.RESOURCE__RES_MULT, oldResMult, newResMult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResMult(NFP_Integer newResMult) {
		if (newResMult != resMult) {
			NotificationChain msgs = null;
			if (resMult != null)
				msgs = ((InternalEObject)resMult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GRMPackage.RESOURCE__RES_MULT, null, msgs);
			if (newResMult != null)
				msgs = ((InternalEObject)newResMult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GRMPackage.RESOURCE__RES_MULT, null, msgs);
			msgs = basicSetResMult(newResMult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRMPackage.RESOURCE__RES_MULT, newResMult, newResMult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsProtected() {
		return isProtected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsProtected(Boolean newIsProtected) {
		Boolean oldIsProtected = isProtected;
		isProtected = newIsProtected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRMPackage.RESOURCE__IS_PROTECTED, oldIsProtected, isProtected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getBase_Property() {
		if (base_Property != null && base_Property.eIsProxy()) {
			InternalEObject oldBase_Property = (InternalEObject)base_Property;
			base_Property = (Property)eResolveProxy(oldBase_Property);
			if (base_Property != oldBase_Property) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRMPackage.RESOURCE__BASE_PROPERTY, oldBase_Property, base_Property));
			}
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetBase_Property() {
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Property(Property newBase_Property) {
		Property oldBase_Property = base_Property;
		base_Property = newBase_Property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRMPackage.RESOURCE__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification getBase_InstanceSpecification() {
		if (base_InstanceSpecification != null && base_InstanceSpecification.eIsProxy()) {
			InternalEObject oldBase_InstanceSpecification = (InternalEObject)base_InstanceSpecification;
			base_InstanceSpecification = (InstanceSpecification)eResolveProxy(oldBase_InstanceSpecification);
			if (base_InstanceSpecification != oldBase_InstanceSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRMPackage.RESOURCE__BASE_INSTANCE_SPECIFICATION, oldBase_InstanceSpecification, base_InstanceSpecification));
			}
		}
		return base_InstanceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification basicGetBase_InstanceSpecification() {
		return base_InstanceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_InstanceSpecification(InstanceSpecification newBase_InstanceSpecification) {
		InstanceSpecification oldBase_InstanceSpecification = base_InstanceSpecification;
		base_InstanceSpecification = newBase_InstanceSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRMPackage.RESOURCE__BASE_INSTANCE_SPECIFICATION, oldBase_InstanceSpecification, base_InstanceSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getBase_Classifier() {
		if (base_Classifier != null && base_Classifier.eIsProxy()) {
			InternalEObject oldBase_Classifier = (InternalEObject)base_Classifier;
			base_Classifier = (Classifier)eResolveProxy(oldBase_Classifier);
			if (base_Classifier != oldBase_Classifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRMPackage.RESOURCE__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
			}
		}
		return base_Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetBase_Classifier() {
		return base_Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Classifier(Classifier newBase_Classifier) {
		Classifier oldBase_Classifier = base_Classifier;
		base_Classifier = newBase_Classifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRMPackage.RESOURCE__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline getBase_Lifeline() {
		if (base_Lifeline != null && base_Lifeline.eIsProxy()) {
			InternalEObject oldBase_Lifeline = (InternalEObject)base_Lifeline;
			base_Lifeline = (Lifeline)eResolveProxy(oldBase_Lifeline);
			if (base_Lifeline != oldBase_Lifeline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRMPackage.RESOURCE__BASE_LIFELINE, oldBase_Lifeline, base_Lifeline));
			}
		}
		return base_Lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline basicGetBase_Lifeline() {
		return base_Lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Lifeline(Lifeline newBase_Lifeline) {
		Lifeline oldBase_Lifeline = base_Lifeline;
		base_Lifeline = newBase_Lifeline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRMPackage.RESOURCE__BASE_LIFELINE, oldBase_Lifeline, base_Lifeline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement getBase_ConnectableElement() {
		if (base_ConnectableElement != null && base_ConnectableElement.eIsProxy()) {
			InternalEObject oldBase_ConnectableElement = (InternalEObject)base_ConnectableElement;
			base_ConnectableElement = (ConnectableElement)eResolveProxy(oldBase_ConnectableElement);
			if (base_ConnectableElement != oldBase_ConnectableElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GRMPackage.RESOURCE__BASE_CONNECTABLE_ELEMENT, oldBase_ConnectableElement, base_ConnectableElement));
			}
		}
		return base_ConnectableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement basicGetBase_ConnectableElement() {
		return base_ConnectableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ConnectableElement(ConnectableElement newBase_ConnectableElement) {
		ConnectableElement oldBase_ConnectableElement = base_ConnectableElement;
		base_ConnectableElement = newBase_ConnectableElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GRMPackage.RESOURCE__BASE_CONNECTABLE_ELEMENT, oldBase_ConnectableElement, base_ConnectableElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GRMPackage.RESOURCE__RES_MULT:
				return basicSetResMult(null, msgs);
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
			case GRMPackage.RESOURCE__RES_MULT:
				return getResMult();
			case GRMPackage.RESOURCE__IS_PROTECTED:
				return getIsProtected();
			case GRMPackage.RESOURCE__BASE_PROPERTY:
				if (resolve) return getBase_Property();
				return basicGetBase_Property();
			case GRMPackage.RESOURCE__BASE_INSTANCE_SPECIFICATION:
				if (resolve) return getBase_InstanceSpecification();
				return basicGetBase_InstanceSpecification();
			case GRMPackage.RESOURCE__BASE_CLASSIFIER:
				if (resolve) return getBase_Classifier();
				return basicGetBase_Classifier();
			case GRMPackage.RESOURCE__BASE_LIFELINE:
				if (resolve) return getBase_Lifeline();
				return basicGetBase_Lifeline();
			case GRMPackage.RESOURCE__BASE_CONNECTABLE_ELEMENT:
				if (resolve) return getBase_ConnectableElement();
				return basicGetBase_ConnectableElement();
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
			case GRMPackage.RESOURCE__RES_MULT:
				setResMult((NFP_Integer)newValue);
				return;
			case GRMPackage.RESOURCE__IS_PROTECTED:
				setIsProtected((Boolean)newValue);
				return;
			case GRMPackage.RESOURCE__BASE_PROPERTY:
				setBase_Property((Property)newValue);
				return;
			case GRMPackage.RESOURCE__BASE_INSTANCE_SPECIFICATION:
				setBase_InstanceSpecification((InstanceSpecification)newValue);
				return;
			case GRMPackage.RESOURCE__BASE_CLASSIFIER:
				setBase_Classifier((Classifier)newValue);
				return;
			case GRMPackage.RESOURCE__BASE_LIFELINE:
				setBase_Lifeline((Lifeline)newValue);
				return;
			case GRMPackage.RESOURCE__BASE_CONNECTABLE_ELEMENT:
				setBase_ConnectableElement((ConnectableElement)newValue);
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
			case GRMPackage.RESOURCE__RES_MULT:
				setResMult((NFP_Integer)null);
				return;
			case GRMPackage.RESOURCE__IS_PROTECTED:
				setIsProtected(IS_PROTECTED_EDEFAULT);
				return;
			case GRMPackage.RESOURCE__BASE_PROPERTY:
				setBase_Property((Property)null);
				return;
			case GRMPackage.RESOURCE__BASE_INSTANCE_SPECIFICATION:
				setBase_InstanceSpecification((InstanceSpecification)null);
				return;
			case GRMPackage.RESOURCE__BASE_CLASSIFIER:
				setBase_Classifier((Classifier)null);
				return;
			case GRMPackage.RESOURCE__BASE_LIFELINE:
				setBase_Lifeline((Lifeline)null);
				return;
			case GRMPackage.RESOURCE__BASE_CONNECTABLE_ELEMENT:
				setBase_ConnectableElement((ConnectableElement)null);
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
			case GRMPackage.RESOURCE__RES_MULT:
				return resMult != null;
			case GRMPackage.RESOURCE__IS_PROTECTED:
				return IS_PROTECTED_EDEFAULT == null ? isProtected != null : !IS_PROTECTED_EDEFAULT.equals(isProtected);
			case GRMPackage.RESOURCE__BASE_PROPERTY:
				return base_Property != null;
			case GRMPackage.RESOURCE__BASE_INSTANCE_SPECIFICATION:
				return base_InstanceSpecification != null;
			case GRMPackage.RESOURCE__BASE_CLASSIFIER:
				return base_Classifier != null;
			case GRMPackage.RESOURCE__BASE_LIFELINE:
				return base_Lifeline != null;
			case GRMPackage.RESOURCE__BASE_CONNECTABLE_ELEMENT:
				return base_ConnectableElement != null;
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
		result.append(" (isProtected: ");
		result.append(isProtected);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
