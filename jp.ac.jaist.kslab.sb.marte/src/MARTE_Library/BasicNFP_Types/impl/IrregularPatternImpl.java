/**
 */
package MARTE_Library.BasicNFP_Types.impl;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;
import MARTE_Library.BasicNFP_Types.IrregularPattern;
import MARTE_Library.BasicNFP_Types.NFP_Duration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Irregular Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.IrregularPatternImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.IrregularPatternImpl#getInterarrivals <em>Interarrivals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IrregularPatternImpl extends AperiodicPatternImpl implements IrregularPattern {
	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration phase;

	/**
	 * The cached value of the '{@link #getInterarrivals() <em>Interarrivals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterarrivals()
	 * @generated
	 * @ordered
	 */
	protected EList<NFP_Duration> interarrivals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IrregularPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicNFP_TypesPackage.Literals.IRREGULAR_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhase(NFP_Duration newPhase, NotificationChain msgs) {
		NFP_Duration oldPhase = phase;
		phase = newPhase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.IRREGULAR_PATTERN__PHASE, oldPhase, newPhase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(NFP_Duration newPhase) {
		if (newPhase != phase) {
			NotificationChain msgs = null;
			if (phase != null)
				msgs = ((InternalEObject)phase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.IRREGULAR_PATTERN__PHASE, null, msgs);
			if (newPhase != null)
				msgs = ((InternalEObject)newPhase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.IRREGULAR_PATTERN__PHASE, null, msgs);
			msgs = basicSetPhase(newPhase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.IRREGULAR_PATTERN__PHASE, newPhase, newPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NFP_Duration> getInterarrivals() {
		if (interarrivals == null) {
			interarrivals = new EObjectContainmentEList<NFP_Duration>(NFP_Duration.class, this, BasicNFP_TypesPackage.IRREGULAR_PATTERN__INTERARRIVALS);
		}
		return interarrivals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicNFP_TypesPackage.IRREGULAR_PATTERN__PHASE:
				return basicSetPhase(null, msgs);
			case BasicNFP_TypesPackage.IRREGULAR_PATTERN__INTERARRIVALS:
				return ((InternalEList<?>)getInterarrivals()).basicRemove(otherEnd, msgs);
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
			case BasicNFP_TypesPackage.IRREGULAR_PATTERN__PHASE:
				return getPhase();
			case BasicNFP_TypesPackage.IRREGULAR_PATTERN__INTERARRIVALS:
				return getInterarrivals();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasicNFP_TypesPackage.IRREGULAR_PATTERN__PHASE:
				setPhase((NFP_Duration)newValue);
				return;
			case BasicNFP_TypesPackage.IRREGULAR_PATTERN__INTERARRIVALS:
				getInterarrivals().clear();
				getInterarrivals().addAll((Collection<? extends NFP_Duration>)newValue);
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
			case BasicNFP_TypesPackage.IRREGULAR_PATTERN__PHASE:
				setPhase((NFP_Duration)null);
				return;
			case BasicNFP_TypesPackage.IRREGULAR_PATTERN__INTERARRIVALS:
				getInterarrivals().clear();
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
			case BasicNFP_TypesPackage.IRREGULAR_PATTERN__PHASE:
				return phase != null;
			case BasicNFP_TypesPackage.IRREGULAR_PATTERN__INTERARRIVALS:
				return interarrivals != null && !interarrivals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IrregularPatternImpl
