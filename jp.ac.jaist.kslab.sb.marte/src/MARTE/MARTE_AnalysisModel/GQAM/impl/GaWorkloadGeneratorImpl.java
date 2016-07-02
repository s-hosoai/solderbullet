/**
 */
package MARTE.MARTE_AnalysisModel.GQAM.impl;

import MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;
import MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadGenerator;

import MARTE_Library.BasicNFP_Types.NFP_Integer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.Behavior;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ga Workload Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaWorkloadGeneratorImpl#getPop <em>Pop</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaWorkloadGeneratorImpl#getBase_Behavior <em>Base Behavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GaWorkloadGeneratorImpl extends EObjectImpl implements GaWorkloadGenerator {
	/**
	 * The cached value of the '{@link #getPop() <em>Pop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPop()
	 * @generated
	 * @ordered
	 */
	protected NFP_Integer pop;

	/**
	 * The cached value of the '{@link #getBase_Behavior() <em>Base Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Behavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior base_Behavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GaWorkloadGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GQAMPackage.Literals.GA_WORKLOAD_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Integer getPop() {
		return pop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPop(NFP_Integer newPop, NotificationChain msgs) {
		NFP_Integer oldPop = pop;
		pop = newPop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_WORKLOAD_GENERATOR__POP, oldPop, newPop);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPop(NFP_Integer newPop) {
		if (newPop != pop) {
			NotificationChain msgs = null;
			if (pop != null)
				msgs = ((InternalEObject)pop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_WORKLOAD_GENERATOR__POP, null, msgs);
			if (newPop != null)
				msgs = ((InternalEObject)newPop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GQAMPackage.GA_WORKLOAD_GENERATOR__POP, null, msgs);
			msgs = basicSetPop(newPop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_WORKLOAD_GENERATOR__POP, newPop, newPop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBase_Behavior() {
		if (base_Behavior != null && base_Behavior.eIsProxy()) {
			InternalEObject oldBase_Behavior = (InternalEObject)base_Behavior;
			base_Behavior = (Behavior)eResolveProxy(oldBase_Behavior);
			if (base_Behavior != oldBase_Behavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GQAMPackage.GA_WORKLOAD_GENERATOR__BASE_BEHAVIOR, oldBase_Behavior, base_Behavior));
			}
		}
		return base_Behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetBase_Behavior() {
		return base_Behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Behavior(Behavior newBase_Behavior) {
		Behavior oldBase_Behavior = base_Behavior;
		base_Behavior = newBase_Behavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_WORKLOAD_GENERATOR__BASE_BEHAVIOR, oldBase_Behavior, base_Behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GQAMPackage.GA_WORKLOAD_GENERATOR__POP:
				return basicSetPop(null, msgs);
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
			case GQAMPackage.GA_WORKLOAD_GENERATOR__POP:
				return getPop();
			case GQAMPackage.GA_WORKLOAD_GENERATOR__BASE_BEHAVIOR:
				if (resolve) return getBase_Behavior();
				return basicGetBase_Behavior();
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
			case GQAMPackage.GA_WORKLOAD_GENERATOR__POP:
				setPop((NFP_Integer)newValue);
				return;
			case GQAMPackage.GA_WORKLOAD_GENERATOR__BASE_BEHAVIOR:
				setBase_Behavior((Behavior)newValue);
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
			case GQAMPackage.GA_WORKLOAD_GENERATOR__POP:
				setPop((NFP_Integer)null);
				return;
			case GQAMPackage.GA_WORKLOAD_GENERATOR__BASE_BEHAVIOR:
				setBase_Behavior((Behavior)null);
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
			case GQAMPackage.GA_WORKLOAD_GENERATOR__POP:
				return pop != null;
			case GQAMPackage.GA_WORKLOAD_GENERATOR__BASE_BEHAVIOR:
				return base_Behavior != null;
		}
		return super.eIsSet(featureID);
	}

} //GaWorkloadGeneratorImpl
