/**
 */
package MARTE.MARTE_Annexes.RSM.impl;

import MARTE.MARTE_Annexes.RSM.RSMPackage;
import MARTE.MARTE_Annexes.RSM.Tiler;

import MARTE_Library.MARTE_DataTypes.IntegerMatrix;
import MARTE_Library.MARTE_DataTypes.IntegerVector;

import MARTE_Library.RS_Library.TilerSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.ConnectorEnd;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tiler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.impl.TilerImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.impl.TilerImpl#getPaving <em>Paving</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.impl.TilerImpl#getFitting <em>Fitting</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.impl.TilerImpl#getTiler <em>Tiler</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.impl.TilerImpl#getBase_ConnectorEnd <em>Base Connector End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TilerImpl extends LinkTopologyImpl implements Tiler {
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
	protected IntegerMatrix fitting;

	/**
	 * The cached value of the '{@link #getTiler() <em>Tiler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiler()
	 * @generated
	 * @ordered
	 */
	protected TilerSpecification tiler;

	/**
	 * The cached value of the '{@link #getBase_ConnectorEnd() <em>Base Connector End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ConnectorEnd()
	 * @generated
	 * @ordered
	 */
	protected ConnectorEnd base_ConnectorEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TilerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return RSMPackage.Literals.TILER;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSMPackage.TILER__ORIGIN, oldOrigin, newOrigin);
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
				msgs = ((InternalEObject)origin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSMPackage.TILER__ORIGIN, null, msgs);
			if (newOrigin != null)
				msgs = ((InternalEObject)newOrigin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSMPackage.TILER__ORIGIN, null, msgs);
			msgs = basicSetOrigin(newOrigin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSMPackage.TILER__ORIGIN, newOrigin, newOrigin));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSMPackage.TILER__PAVING, oldPaving, newPaving);
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
				msgs = ((InternalEObject)paving).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSMPackage.TILER__PAVING, null, msgs);
			if (newPaving != null)
				msgs = ((InternalEObject)newPaving).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSMPackage.TILER__PAVING, null, msgs);
			msgs = basicSetPaving(newPaving, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSMPackage.TILER__PAVING, newPaving, newPaving));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerMatrix getFitting() {
		return fitting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFitting(IntegerMatrix newFitting, NotificationChain msgs) {
		IntegerMatrix oldFitting = fitting;
		fitting = newFitting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSMPackage.TILER__FITTING, oldFitting, newFitting);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFitting(IntegerMatrix newFitting) {
		if (newFitting != fitting) {
			NotificationChain msgs = null;
			if (fitting != null)
				msgs = ((InternalEObject)fitting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSMPackage.TILER__FITTING, null, msgs);
			if (newFitting != null)
				msgs = ((InternalEObject)newFitting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSMPackage.TILER__FITTING, null, msgs);
			msgs = basicSetFitting(newFitting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSMPackage.TILER__FITTING, newFitting, newFitting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TilerSpecification getTiler() {
		return tiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTiler(TilerSpecification newTiler, NotificationChain msgs) {
		TilerSpecification oldTiler = tiler;
		tiler = newTiler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RSMPackage.TILER__TILER, oldTiler, newTiler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTiler(TilerSpecification newTiler) {
		if (newTiler != tiler) {
			NotificationChain msgs = null;
			if (tiler != null)
				msgs = ((InternalEObject)tiler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RSMPackage.TILER__TILER, null, msgs);
			if (newTiler != null)
				msgs = ((InternalEObject)newTiler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RSMPackage.TILER__TILER, null, msgs);
			msgs = basicSetTiler(newTiler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSMPackage.TILER__TILER, newTiler, newTiler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEnd getBase_ConnectorEnd() {
		if (base_ConnectorEnd != null && base_ConnectorEnd.eIsProxy()) {
			InternalEObject oldBase_ConnectorEnd = (InternalEObject)base_ConnectorEnd;
			base_ConnectorEnd = (ConnectorEnd)eResolveProxy(oldBase_ConnectorEnd);
			if (base_ConnectorEnd != oldBase_ConnectorEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RSMPackage.TILER__BASE_CONNECTOR_END, oldBase_ConnectorEnd, base_ConnectorEnd));
			}
		}
		return base_ConnectorEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEnd basicGetBase_ConnectorEnd() {
		return base_ConnectorEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ConnectorEnd(ConnectorEnd newBase_ConnectorEnd) {
		ConnectorEnd oldBase_ConnectorEnd = base_ConnectorEnd;
		base_ConnectorEnd = newBase_ConnectorEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSMPackage.TILER__BASE_CONNECTOR_END, oldBase_ConnectorEnd, base_ConnectorEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RSMPackage.TILER__ORIGIN:
				return basicSetOrigin(null, msgs);
			case RSMPackage.TILER__PAVING:
				return basicSetPaving(null, msgs);
			case RSMPackage.TILER__FITTING:
				return basicSetFitting(null, msgs);
			case RSMPackage.TILER__TILER:
				return basicSetTiler(null, msgs);
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
			case RSMPackage.TILER__ORIGIN:
				return getOrigin();
			case RSMPackage.TILER__PAVING:
				return getPaving();
			case RSMPackage.TILER__FITTING:
				return getFitting();
			case RSMPackage.TILER__TILER:
				return getTiler();
			case RSMPackage.TILER__BASE_CONNECTOR_END:
				if (resolve) return getBase_ConnectorEnd();
				return basicGetBase_ConnectorEnd();
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
			case RSMPackage.TILER__ORIGIN:
				setOrigin((IntegerVector)newValue);
				return;
			case RSMPackage.TILER__PAVING:
				setPaving((IntegerMatrix)newValue);
				return;
			case RSMPackage.TILER__FITTING:
				setFitting((IntegerMatrix)newValue);
				return;
			case RSMPackage.TILER__TILER:
				setTiler((TilerSpecification)newValue);
				return;
			case RSMPackage.TILER__BASE_CONNECTOR_END:
				setBase_ConnectorEnd((ConnectorEnd)newValue);
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
			case RSMPackage.TILER__ORIGIN:
				setOrigin((IntegerVector)null);
				return;
			case RSMPackage.TILER__PAVING:
				setPaving((IntegerMatrix)null);
				return;
			case RSMPackage.TILER__FITTING:
				setFitting((IntegerMatrix)null);
				return;
			case RSMPackage.TILER__TILER:
				setTiler((TilerSpecification)null);
				return;
			case RSMPackage.TILER__BASE_CONNECTOR_END:
				setBase_ConnectorEnd((ConnectorEnd)null);
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
			case RSMPackage.TILER__ORIGIN:
				return origin != null;
			case RSMPackage.TILER__PAVING:
				return paving != null;
			case RSMPackage.TILER__FITTING:
				return fitting != null;
			case RSMPackage.TILER__TILER:
				return tiler != null;
			case RSMPackage.TILER__BASE_CONNECTOR_END:
				return base_ConnectorEnd != null;
		}
		return super.eIsSet(featureID);
	}

} //TilerImpl
