/**
 */
package MARTE.MARTE_AnalysisModel.GQAM.impl;

import MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;
import MARTE.MARTE_AnalysisModel.GQAM.GaAnalysisContext;
import MARTE.MARTE_AnalysisModel.GQAM.GaResourcesPlatform;
import MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadBehavior;

import MARTE.MARTE_Annexes.VSL.Variables.ExpressionContext;
import MARTE.MARTE_Annexes.VSL.Variables.VariablesPackage;

import MARTE.MARTE_Foundations.CoreElements.impl.ConfigurationImpl;

import MARTE_Library.BasicNFP_Types.NFP_String;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ga Analysis Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaAnalysisContextImpl#getBase_NamedElement <em>Base Named Element</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaAnalysisContextImpl#getContext <em>Context</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaAnalysisContextImpl#getWorkload <em>Workload</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.impl.GaAnalysisContextImpl#getPlatform <em>Platform</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GaAnalysisContextImpl extends ConfigurationImpl implements GaAnalysisContext {
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
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EList context;

	/**
	 * The cached value of the '{@link #getWorkload() <em>Workload</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkload()
	 * @generated
	 * @ordered
	 */
	protected EList workload;

	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected EList platform;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GaAnalysisContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GQAMPackage.Literals.GA_ANALYSIS_CONTEXT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GQAMPackage.GA_ANALYSIS_CONTEXT__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GQAMPackage.GA_ANALYSIS_CONTEXT__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContext() {
		if (context == null) {
			context = new EObjectContainmentEList(NFP_String.class, this, GQAMPackage.GA_ANALYSIS_CONTEXT__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWorkload() {
		if (workload == null) {
			workload = new EObjectResolvingEList(GaWorkloadBehavior.class, this, GQAMPackage.GA_ANALYSIS_CONTEXT__WORKLOAD);
		}
		return workload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPlatform() {
		if (platform == null) {
			platform = new EObjectResolvingEList(GaResourcesPlatform.class, this, GQAMPackage.GA_ANALYSIS_CONTEXT__PLATFORM);
		}
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GQAMPackage.GA_ANALYSIS_CONTEXT__CONTEXT:
				return ((InternalEList)getContext()).basicRemove(otherEnd, msgs);
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
			case GQAMPackage.GA_ANALYSIS_CONTEXT__BASE_NAMED_ELEMENT:
				if (resolve) return getBase_NamedElement();
				return basicGetBase_NamedElement();
			case GQAMPackage.GA_ANALYSIS_CONTEXT__CONTEXT:
				return getContext();
			case GQAMPackage.GA_ANALYSIS_CONTEXT__WORKLOAD:
				return getWorkload();
			case GQAMPackage.GA_ANALYSIS_CONTEXT__PLATFORM:
				return getPlatform();
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
			case GQAMPackage.GA_ANALYSIS_CONTEXT__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)newValue);
				return;
			case GQAMPackage.GA_ANALYSIS_CONTEXT__CONTEXT:
				getContext().clear();
				getContext().addAll((Collection)newValue);
				return;
			case GQAMPackage.GA_ANALYSIS_CONTEXT__WORKLOAD:
				getWorkload().clear();
				getWorkload().addAll((Collection)newValue);
				return;
			case GQAMPackage.GA_ANALYSIS_CONTEXT__PLATFORM:
				getPlatform().clear();
				getPlatform().addAll((Collection)newValue);
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
			case GQAMPackage.GA_ANALYSIS_CONTEXT__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)null);
				return;
			case GQAMPackage.GA_ANALYSIS_CONTEXT__CONTEXT:
				getContext().clear();
				return;
			case GQAMPackage.GA_ANALYSIS_CONTEXT__WORKLOAD:
				getWorkload().clear();
				return;
			case GQAMPackage.GA_ANALYSIS_CONTEXT__PLATFORM:
				getPlatform().clear();
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
			case GQAMPackage.GA_ANALYSIS_CONTEXT__BASE_NAMED_ELEMENT:
				return base_NamedElement != null;
			case GQAMPackage.GA_ANALYSIS_CONTEXT__CONTEXT:
				return context != null && !context.isEmpty();
			case GQAMPackage.GA_ANALYSIS_CONTEXT__WORKLOAD:
				return workload != null && !workload.isEmpty();
			case GQAMPackage.GA_ANALYSIS_CONTEXT__PLATFORM:
				return platform != null && !platform.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ExpressionContext.class) {
			switch (derivedFeatureID) {
				case GQAMPackage.GA_ANALYSIS_CONTEXT__BASE_NAMED_ELEMENT: return VariablesPackage.EXPRESSION_CONTEXT__BASE_NAMED_ELEMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == ExpressionContext.class) {
			switch (baseFeatureID) {
				case VariablesPackage.EXPRESSION_CONTEXT__BASE_NAMED_ELEMENT: return GQAMPackage.GA_ANALYSIS_CONTEXT__BASE_NAMED_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //GaAnalysisContextImpl
