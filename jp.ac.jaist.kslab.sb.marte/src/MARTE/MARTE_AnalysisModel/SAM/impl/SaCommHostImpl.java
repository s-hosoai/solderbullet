/**
 */
package MARTE.MARTE_AnalysisModel.SAM.impl;

import MARTE.MARTE_AnalysisModel.GQAM.impl.GaCommHostImpl;

import MARTE.MARTE_AnalysisModel.SAM.SAMPackage;
import MARTE.MARTE_AnalysisModel.SAM.SaCommHost;

import MARTE_Library.BasicNFP_Types.NFP_Boolean;
import MARTE_Library.BasicNFP_Types.NFP_Real;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sa Comm Host</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaCommHostImpl#getIsSched <em>Is Sched</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaCommHostImpl#getSchSlack <em>Sch Slack</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SaCommHostImpl extends GaCommHostImpl implements SaCommHost {
	/**
	 * The cached value of the '{@link #getIsSched() <em>Is Sched</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSched()
	 * @generated
	 * @ordered
	 */
	protected NFP_Boolean isSched;

	/**
	 * The cached value of the '{@link #getSchSlack() <em>Sch Slack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchSlack()
	 * @generated
	 * @ordered
	 */
	protected NFP_Real schSlack;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaCommHostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SAMPackage.Literals.SA_COMM_HOST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Boolean getIsSched() {
		return isSched;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsSched(NFP_Boolean newIsSched, NotificationChain msgs) {
		NFP_Boolean oldIsSched = isSched;
		isSched = newIsSched;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_COMM_HOST__IS_SCHED, oldIsSched, newIsSched);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSched(NFP_Boolean newIsSched) {
		if (newIsSched != isSched) {
			NotificationChain msgs = null;
			if (isSched != null)
				msgs = ((InternalEObject)isSched).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_COMM_HOST__IS_SCHED, null, msgs);
			if (newIsSched != null)
				msgs = ((InternalEObject)newIsSched).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_COMM_HOST__IS_SCHED, null, msgs);
			msgs = basicSetIsSched(newIsSched, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_COMM_HOST__IS_SCHED, newIsSched, newIsSched));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Real getSchSlack() {
		return schSlack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchSlack(NFP_Real newSchSlack, NotificationChain msgs) {
		NFP_Real oldSchSlack = schSlack;
		schSlack = newSchSlack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_COMM_HOST__SCH_SLACK, oldSchSlack, newSchSlack);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchSlack(NFP_Real newSchSlack) {
		if (newSchSlack != schSlack) {
			NotificationChain msgs = null;
			if (schSlack != null)
				msgs = ((InternalEObject)schSlack).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_COMM_HOST__SCH_SLACK, null, msgs);
			if (newSchSlack != null)
				msgs = ((InternalEObject)newSchSlack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_COMM_HOST__SCH_SLACK, null, msgs);
			msgs = basicSetSchSlack(newSchSlack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_COMM_HOST__SCH_SLACK, newSchSlack, newSchSlack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SAMPackage.SA_COMM_HOST__IS_SCHED:
				return basicSetIsSched(null, msgs);
			case SAMPackage.SA_COMM_HOST__SCH_SLACK:
				return basicSetSchSlack(null, msgs);
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
			case SAMPackage.SA_COMM_HOST__IS_SCHED:
				return getIsSched();
			case SAMPackage.SA_COMM_HOST__SCH_SLACK:
				return getSchSlack();
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
			case SAMPackage.SA_COMM_HOST__IS_SCHED:
				setIsSched((NFP_Boolean)newValue);
				return;
			case SAMPackage.SA_COMM_HOST__SCH_SLACK:
				setSchSlack((NFP_Real)newValue);
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
			case SAMPackage.SA_COMM_HOST__IS_SCHED:
				setIsSched((NFP_Boolean)null);
				return;
			case SAMPackage.SA_COMM_HOST__SCH_SLACK:
				setSchSlack((NFP_Real)null);
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
			case SAMPackage.SA_COMM_HOST__IS_SCHED:
				return isSched != null;
			case SAMPackage.SA_COMM_HOST__SCH_SLACK:
				return schSlack != null;
		}
		return super.eIsSet(featureID);
	}

} //SaCommHostImpl
