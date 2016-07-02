/**
 */
package MARTE.MARTE_Foundations.Alloc.impl;

import MARTE.MARTE_Foundations.Alloc.AllocPackage;
import MARTE.MARTE_Foundations.Alloc.Assign;

import MARTE.MARTE_Foundations.NFPs.NfpConstraint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.Alloc.impl.AssignImpl#getImpliedConstraint <em>Implied Constraint</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Alloc.impl.AssignImpl#getFrom <em>From</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Alloc.impl.AssignImpl#getTo <em>To</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.Alloc.impl.AssignImpl#getBase_Comment <em>Base Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignImpl extends EObjectImpl implements Assign {
	/**
	 * The cached value of the '{@link #getImpliedConstraint() <em>Implied Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpliedConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList impliedConstraint;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected EList from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected EList to;

	/**
	 * The cached value of the '{@link #getBase_Comment() <em>Base Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Comment()
	 * @generated
	 * @ordered
	 */
	protected Comment base_Comment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AllocPackage.Literals.ASSIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getImpliedConstraint() {
		if (impliedConstraint == null) {
			impliedConstraint = new EObjectResolvingEList(NfpConstraint.class, this, AllocPackage.ASSIGN__IMPLIED_CONSTRAINT);
		}
		return impliedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFrom() {
		if (from == null) {
			from = new EObjectResolvingEList(Element.class, this, AllocPackage.ASSIGN__FROM);
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTo() {
		if (to == null) {
			to = new EObjectResolvingEList(Element.class, this, AllocPackage.ASSIGN__TO);
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getBase_Comment() {
		if (base_Comment != null && base_Comment.eIsProxy()) {
			InternalEObject oldBase_Comment = (InternalEObject)base_Comment;
			base_Comment = (Comment)eResolveProxy(oldBase_Comment);
			if (base_Comment != oldBase_Comment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocPackage.ASSIGN__BASE_COMMENT, oldBase_Comment, base_Comment));
			}
		}
		return base_Comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment basicGetBase_Comment() {
		return base_Comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Comment(Comment newBase_Comment) {
		Comment oldBase_Comment = base_Comment;
		base_Comment = newBase_Comment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocPackage.ASSIGN__BASE_COMMENT, oldBase_Comment, base_Comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AllocPackage.ASSIGN__IMPLIED_CONSTRAINT:
				return getImpliedConstraint();
			case AllocPackage.ASSIGN__FROM:
				return getFrom();
			case AllocPackage.ASSIGN__TO:
				return getTo();
			case AllocPackage.ASSIGN__BASE_COMMENT:
				if (resolve) return getBase_Comment();
				return basicGetBase_Comment();
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
			case AllocPackage.ASSIGN__IMPLIED_CONSTRAINT:
				getImpliedConstraint().clear();
				getImpliedConstraint().addAll((Collection)newValue);
				return;
			case AllocPackage.ASSIGN__FROM:
				getFrom().clear();
				getFrom().addAll((Collection)newValue);
				return;
			case AllocPackage.ASSIGN__TO:
				getTo().clear();
				getTo().addAll((Collection)newValue);
				return;
			case AllocPackage.ASSIGN__BASE_COMMENT:
				setBase_Comment((Comment)newValue);
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
			case AllocPackage.ASSIGN__IMPLIED_CONSTRAINT:
				getImpliedConstraint().clear();
				return;
			case AllocPackage.ASSIGN__FROM:
				getFrom().clear();
				return;
			case AllocPackage.ASSIGN__TO:
				getTo().clear();
				return;
			case AllocPackage.ASSIGN__BASE_COMMENT:
				setBase_Comment((Comment)null);
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
			case AllocPackage.ASSIGN__IMPLIED_CONSTRAINT:
				return impliedConstraint != null && !impliedConstraint.isEmpty();
			case AllocPackage.ASSIGN__FROM:
				return from != null && !from.isEmpty();
			case AllocPackage.ASSIGN__TO:
				return to != null && !to.isEmpty();
			case AllocPackage.ASSIGN__BASE_COMMENT:
				return base_Comment != null;
		}
		return super.eIsSet(featureID);
	}

} //AssignImpl
