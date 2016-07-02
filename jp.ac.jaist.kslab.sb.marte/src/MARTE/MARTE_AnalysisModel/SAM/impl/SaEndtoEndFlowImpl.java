/**
 */
package MARTE.MARTE_AnalysisModel.SAM.impl;

import MARTE.MARTE_AnalysisModel.GQAM.GaTimedObs;

import MARTE.MARTE_AnalysisModel.SAM.SAMPackage;
import MARTE.MARTE_AnalysisModel.SAM.SaEndtoEndFlow;

import MARTE_Library.BasicNFP_Types.NFP_Boolean;
import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Real;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sa Endto End Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaEndtoEndFlowImpl#getIsSched <em>Is Sched</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaEndtoEndFlowImpl#getSchSlack <em>Sch Slack</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaEndtoEndFlowImpl#getEnd2EndT <em>End2 End T</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaEndtoEndFlowImpl#getEnd2EndD <em>End2 End D</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaEndtoEndFlowImpl#getTiming <em>Timing</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.impl.SaEndtoEndFlowImpl#getBase_NamedElement <em>Base Named Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SaEndtoEndFlowImpl extends EObjectImpl implements SaEndtoEndFlow {
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
	 * The cached value of the '{@link #getEnd2EndT() <em>End2 End T</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd2EndT()
	 * @generated
	 * @ordered
	 */
	protected EList end2EndT;

	/**
	 * The cached value of the '{@link #getEnd2EndD() <em>End2 End D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd2EndD()
	 * @generated
	 * @ordered
	 */
	protected EList end2EndD;

	/**
	 * The cached value of the '{@link #getTiming() <em>Timing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiming()
	 * @generated
	 * @ordered
	 */
	protected EList timing;

	/**
	 * The cached value of the '{@link #getBase_NamedElement() <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_NamedElement()
	 * @generated
	 * @ordered
	 */
	protected NamedElement base_NamedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaEndtoEndFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SAMPackage.Literals.SA_ENDTO_END_FLOW;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_ENDTO_END_FLOW__IS_SCHED, oldIsSched, newIsSched);
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
				msgs = ((InternalEObject)isSched).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_ENDTO_END_FLOW__IS_SCHED, null, msgs);
			if (newIsSched != null)
				msgs = ((InternalEObject)newIsSched).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_ENDTO_END_FLOW__IS_SCHED, null, msgs);
			msgs = basicSetIsSched(newIsSched, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_ENDTO_END_FLOW__IS_SCHED, newIsSched, newIsSched));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SAMPackage.SA_ENDTO_END_FLOW__SCH_SLACK, oldSchSlack, newSchSlack);
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
				msgs = ((InternalEObject)schSlack).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_ENDTO_END_FLOW__SCH_SLACK, null, msgs);
			if (newSchSlack != null)
				msgs = ((InternalEObject)newSchSlack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SAMPackage.SA_ENDTO_END_FLOW__SCH_SLACK, null, msgs);
			msgs = basicSetSchSlack(newSchSlack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_ENDTO_END_FLOW__SCH_SLACK, newSchSlack, newSchSlack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEnd2EndT() {
		if (end2EndT == null) {
			end2EndT = new EObjectContainmentEList(NFP_Duration.class, this, SAMPackage.SA_ENDTO_END_FLOW__END2_END_T);
		}
		return end2EndT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEnd2EndD() {
		if (end2EndD == null) {
			end2EndD = new EObjectContainmentEList(NFP_Duration.class, this, SAMPackage.SA_ENDTO_END_FLOW__END2_END_D);
		}
		return end2EndD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTiming() {
		if (timing == null) {
			timing = new EObjectResolvingEList(GaTimedObs.class, this, SAMPackage.SA_ENDTO_END_FLOW__TIMING);
		}
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getBase_NamedElement() {
		if (base_NamedElement != null && base_NamedElement.eIsProxy()) {
			InternalEObject oldBase_NamedElement = (InternalEObject)base_NamedElement;
			base_NamedElement = (NamedElement)eResolveProxy(oldBase_NamedElement);
			if (base_NamedElement != oldBase_NamedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SAMPackage.SA_ENDTO_END_FLOW__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
			}
		}
		return base_NamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetBase_NamedElement() {
		return base_NamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_NamedElement(NamedElement newBase_NamedElement) {
		NamedElement oldBase_NamedElement = base_NamedElement;
		base_NamedElement = newBase_NamedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SAMPackage.SA_ENDTO_END_FLOW__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SAMPackage.SA_ENDTO_END_FLOW__IS_SCHED:
				return basicSetIsSched(null, msgs);
			case SAMPackage.SA_ENDTO_END_FLOW__SCH_SLACK:
				return basicSetSchSlack(null, msgs);
			case SAMPackage.SA_ENDTO_END_FLOW__END2_END_T:
				return ((InternalEList)getEnd2EndT()).basicRemove(otherEnd, msgs);
			case SAMPackage.SA_ENDTO_END_FLOW__END2_END_D:
				return ((InternalEList)getEnd2EndD()).basicRemove(otherEnd, msgs);
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
			case SAMPackage.SA_ENDTO_END_FLOW__IS_SCHED:
				return getIsSched();
			case SAMPackage.SA_ENDTO_END_FLOW__SCH_SLACK:
				return getSchSlack();
			case SAMPackage.SA_ENDTO_END_FLOW__END2_END_T:
				return getEnd2EndT();
			case SAMPackage.SA_ENDTO_END_FLOW__END2_END_D:
				return getEnd2EndD();
			case SAMPackage.SA_ENDTO_END_FLOW__TIMING:
				return getTiming();
			case SAMPackage.SA_ENDTO_END_FLOW__BASE_NAMED_ELEMENT:
				if (resolve) return getBase_NamedElement();
				return basicGetBase_NamedElement();
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
			case SAMPackage.SA_ENDTO_END_FLOW__IS_SCHED:
				setIsSched((NFP_Boolean)newValue);
				return;
			case SAMPackage.SA_ENDTO_END_FLOW__SCH_SLACK:
				setSchSlack((NFP_Real)newValue);
				return;
			case SAMPackage.SA_ENDTO_END_FLOW__END2_END_T:
				getEnd2EndT().clear();
				getEnd2EndT().addAll((Collection)newValue);
				return;
			case SAMPackage.SA_ENDTO_END_FLOW__END2_END_D:
				getEnd2EndD().clear();
				getEnd2EndD().addAll((Collection)newValue);
				return;
			case SAMPackage.SA_ENDTO_END_FLOW__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection)newValue);
				return;
			case SAMPackage.SA_ENDTO_END_FLOW__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)newValue);
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
			case SAMPackage.SA_ENDTO_END_FLOW__IS_SCHED:
				setIsSched((NFP_Boolean)null);
				return;
			case SAMPackage.SA_ENDTO_END_FLOW__SCH_SLACK:
				setSchSlack((NFP_Real)null);
				return;
			case SAMPackage.SA_ENDTO_END_FLOW__END2_END_T:
				getEnd2EndT().clear();
				return;
			case SAMPackage.SA_ENDTO_END_FLOW__END2_END_D:
				getEnd2EndD().clear();
				return;
			case SAMPackage.SA_ENDTO_END_FLOW__TIMING:
				getTiming().clear();
				return;
			case SAMPackage.SA_ENDTO_END_FLOW__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)null);
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
			case SAMPackage.SA_ENDTO_END_FLOW__IS_SCHED:
				return isSched != null;
			case SAMPackage.SA_ENDTO_END_FLOW__SCH_SLACK:
				return schSlack != null;
			case SAMPackage.SA_ENDTO_END_FLOW__END2_END_T:
				return end2EndT != null && !end2EndT.isEmpty();
			case SAMPackage.SA_ENDTO_END_FLOW__END2_END_D:
				return end2EndD != null && !end2EndD.isEmpty();
			case SAMPackage.SA_ENDTO_END_FLOW__TIMING:
				return timing != null && !timing.isEmpty();
			case SAMPackage.SA_ENDTO_END_FLOW__BASE_NAMED_ELEMENT:
				return base_NamedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //SaEndtoEndFlowImpl
