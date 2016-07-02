/**
 */
package MARTE.MARTE_DesignModel.HLAM.util;

import MARTE.MARTE_DesignModel.HLAM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage
 * @generated
 */
public class HLAMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HLAMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HLAMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HLAMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HLAMSwitch modelSwitch =
		new HLAMSwitch() {
			public Object caseRtUnit(RtUnit object) {
				return createRtUnitAdapter();
			}
			public Object casePpUnit(PpUnit object) {
				return createPpUnitAdapter();
			}
			public Object caseRtFeature(RtFeature object) {
				return createRtFeatureAdapter();
			}
			public Object caseRtSpecification(RtSpecification object) {
				return createRtSpecificationAdapter();
			}
			public Object caseRtAction(RtAction object) {
				return createRtActionAdapter();
			}
			public Object caseRtService(RtService object) {
				return createRtServiceAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.HLAM.RtUnit <em>Rt Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.HLAM.RtUnit
	 * @generated
	 */
	public Adapter createRtUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.HLAM.PpUnit <em>Pp Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.HLAM.PpUnit
	 * @generated
	 */
	public Adapter createPpUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.HLAM.RtFeature <em>Rt Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.HLAM.RtFeature
	 * @generated
	 */
	public Adapter createRtFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.HLAM.RtSpecification <em>Rt Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.HLAM.RtSpecification
	 * @generated
	 */
	public Adapter createRtSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.HLAM.RtAction <em>Rt Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.HLAM.RtAction
	 * @generated
	 */
	public Adapter createRtActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.HLAM.RtService <em>Rt Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.HLAM.RtService
	 * @generated
	 */
	public Adapter createRtServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HLAMAdapterFactory
