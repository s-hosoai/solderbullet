/**
 */
package MARTE_Library.RS_Library.impl;

import MARTE_Library.MARTE_DataTypes.IntegerMatrix;
import MARTE_Library.MARTE_DataTypes.IntegerVector;

import MARTE_Library.RS_Library.RS_LibraryPackage;
import MARTE_Library.RS_Library.TilerSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tiler Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.RS_Library.impl.TilerSpecificationImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link MARTE_Library.RS_Library.impl.TilerSpecificationImpl#getPaving <em>Paving</em>}</li>
 *   <li>{@link MARTE_Library.RS_Library.impl.TilerSpecificationImpl#getFitting <em>Fitting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TilerSpecificationImpl extends EObjectImpl implements TilerSpecification {
	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected IntegerVector origin;

	/**
	 * The cached value of the '{@link #getPaving() <em>Paving</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaving()
	 * @generated
	 * @ordered
	 */
	protected IntegerMatrix paving;

	/**
	 * The cached value of the '{@link #getFitting() <em>Fitting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFitting()
	 * @generated
	 * @ordered
	 */
	protected IntegerVector fitting;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TilerSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RS_LibraryPackage.Literals.TILER_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVector getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrigin(IntegerVector newOrigin, NotificationChain msgs) {
		IntegerVector oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RS_LibraryPackage.TILER_SPECIFICATION__ORIGIN, oldOrigin, newOrigin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(IntegerVector newOrigin) {
		if (newOrigin != origin) {
			NotificationChain msgs = null;
			if (origin != null)
				msgs = ((InternalEObject)origin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RS_LibraryPackage.TILER_SPECIFICATION__ORIGIN, null, msgs);
			if (newOrigin != null)
				msgs = ((InternalEObject)newOrigin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RS_LibraryPackage.TILER_SPECIFICATION__ORIGIN, null, msgs);
			msgs = basicSetOrigin(newOrigin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RS_LibraryPackage.TILER_SPECIFICATION__ORIGIN, newOrigin, newOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerMatrix getPaving() {
		return paving;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaving(IntegerMatrix newPaving, NotificationChain msgs) {
		IntegerMatrix oldPaving = paving;
		paving = newPaving;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RS_LibraryPackage.TILER_SPECIFICATION__PAVING, oldPaving, newPaving);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaving(IntegerMatrix newPaving) {
		if (newPaving != paving) {
			NotificationChain msgs = null;
			if (paving != null)
				msgs = ((InternalEObject)paving).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RS_LibraryPackage.TILER_SPECIFICATION__PAVING, null, msgs);
			if (newPaving != null)
				msgs = ((InternalEObject)newPaving).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RS_LibraryPackage.TILER_SPECIFICATION__PAVING, null, msgs);
			msgs = basicSetPaving(newPaving, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RS_LibraryPackage.TILER_SPECIFICATION__PAVING, newPaving, newPaving));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVector getFitting() {
		return fitting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFitting(IntegerVector newFitting, NotificationChain msgs) {
		IntegerVector oldFitting = fitting;
		fitting = newFitting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RS_LibraryPackage.TILER_SPECIFICATION__FITTING, oldFitting, newFitting);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFitting(IntegerVector newFitting) {
		if (newFitting != fitting) {
			NotificationChain msgs = null;
			if (fitting != null)
				msgs = ((InternalEObject)fitting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RS_LibraryPackage.TILER_SPECIFICATION__FITTING, null, msgs);
			if (newFitting != null)
				msgs = ((InternalEObject)newFitting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RS_LibraryPackage.TILER_SPECIFICATION__FITTING, null, msgs);
			msgs = basicSetFitting(newFitting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RS_LibraryPackage.TILER_SPECIFICATION__FITTING, newFitting, newFitting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RS_LibraryPackage.TILER_SPECIFICATION__ORIGIN:
				return basicSetOrigin(null, msgs);
			case RS_LibraryPackage.TILER_SPECIFICATION__PAVING:
				return basicSetPaving(null, msgs);
			case RS_LibraryPackage.TILER_SPECIFICATION__FITTING:
				return basicSetFitting(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RS_LibraryPackage.TILER_SPECIFICATION__ORIGIN:
				return getOrigin();
			case RS_LibraryPackage.TILER_SPECIFICATION__PAVING:
				return getPaving();
			case RS_LibraryPackage.TILER_SPECIFICATION__FITTING:
				return getFitting();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RS_LibraryPackage.TILER_SPECIFICATION__ORIGIN:
				setOrigin((IntegerVector)newValue);
				return;
			case RS_LibraryPackage.TILER_SPECIFICATION__PAVING:
				setPaving((IntegerMatrix)newValue);
				return;
			case RS_LibraryPackage.TILER_SPECIFICATION__FITTING:
				setFitting((IntegerVector)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RS_LibraryPackage.TILER_SPECIFICATION__ORIGIN:
				setOrigin((IntegerVector)null);
				return;
			case RS_LibraryPackage.TILER_SPECIFICATION__PAVING:
				setPaving((IntegerMatrix)null);
				return;
			case RS_LibraryPackage.TILER_SPECIFICATION__FITTING:
				setFitting((IntegerVector)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RS_LibraryPackage.TILER_SPECIFICATION__ORIGIN:
				return origin != null;
			case RS_LibraryPackage.TILER_SPECIFICATION__PAVING:
				return paving != null;
			case RS_LibraryPackage.TILER_SPECIFICATION__FITTING:
				return fitting != null;
		}
		return super.eIsSet(featureID);
	}

} //TilerSpecificationImpl
