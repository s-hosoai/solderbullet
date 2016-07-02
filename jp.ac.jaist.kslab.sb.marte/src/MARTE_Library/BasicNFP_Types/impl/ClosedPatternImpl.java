/**
 */
package MARTE_Library.BasicNFP_Types.impl;

import MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;
import MARTE_Library.BasicNFP_Types.ClosedPattern;
import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Integer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Closed Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.ClosedPatternImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.impl.ClosedPatternImpl#getExtDelay <em>Ext Delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClosedPatternImpl extends EObjectImpl implements ClosedPattern {
	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected NFP_Integer population;

	/**
	 * The cached value of the '{@link #getExtDelay() <em>Ext Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtDelay()
	 * @generated
	 * @ordered
	 */
	protected NFP_Duration extDelay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClosedPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicNFP_TypesPackage.Literals.CLOSED_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Integer getPopulation() {
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPopulation(NFP_Integer newPopulation, NotificationChain msgs) {
		NFP_Integer oldPopulation = population;
		population = newPopulation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.CLOSED_PATTERN__POPULATION, oldPopulation, newPopulation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulation(NFP_Integer newPopulation) {
		if (newPopulation != population) {
			NotificationChain msgs = null;
			if (population != null)
				msgs = ((InternalEObject)population).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.CLOSED_PATTERN__POPULATION, null, msgs);
			if (newPopulation != null)
				msgs = ((InternalEObject)newPopulation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.CLOSED_PATTERN__POPULATION, null, msgs);
			msgs = basicSetPopulation(newPopulation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.CLOSED_PATTERN__POPULATION, newPopulation, newPopulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Duration getExtDelay() {
		return extDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtDelay(NFP_Duration newExtDelay, NotificationChain msgs) {
		NFP_Duration oldExtDelay = extDelay;
		extDelay = newExtDelay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.CLOSED_PATTERN__EXT_DELAY, oldExtDelay, newExtDelay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtDelay(NFP_Duration newExtDelay) {
		if (newExtDelay != extDelay) {
			NotificationChain msgs = null;
			if (extDelay != null)
				msgs = ((InternalEObject)extDelay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.CLOSED_PATTERN__EXT_DELAY, null, msgs);
			if (newExtDelay != null)
				msgs = ((InternalEObject)newExtDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicNFP_TypesPackage.CLOSED_PATTERN__EXT_DELAY, null, msgs);
			msgs = basicSetExtDelay(newExtDelay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicNFP_TypesPackage.CLOSED_PATTERN__EXT_DELAY, newExtDelay, newExtDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicNFP_TypesPackage.CLOSED_PATTERN__POPULATION:
				return basicSetPopulation(null, msgs);
			case BasicNFP_TypesPackage.CLOSED_PATTERN__EXT_DELAY:
				return basicSetExtDelay(null, msgs);
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
			case BasicNFP_TypesPackage.CLOSED_PATTERN__POPULATION:
				return getPopulation();
			case BasicNFP_TypesPackage.CLOSED_PATTERN__EXT_DELAY:
				return getExtDelay();
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
			case BasicNFP_TypesPackage.CLOSED_PATTERN__POPULATION:
				setPopulation((NFP_Integer)newValue);
				return;
			case BasicNFP_TypesPackage.CLOSED_PATTERN__EXT_DELAY:
				setExtDelay((NFP_Duration)newValue);
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
			case BasicNFP_TypesPackage.CLOSED_PATTERN__POPULATION:
				setPopulation((NFP_Integer)null);
				return;
			case BasicNFP_TypesPackage.CLOSED_PATTERN__EXT_DELAY:
				setExtDelay((NFP_Duration)null);
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
			case BasicNFP_TypesPackage.CLOSED_PATTERN__POPULATION:
				return population != null;
			case BasicNFP_TypesPackage.CLOSED_PATTERN__EXT_DELAY:
				return extDelay != null;
		}
		return super.eIsSet(featureID);
	}

} //ClosedPatternImpl
