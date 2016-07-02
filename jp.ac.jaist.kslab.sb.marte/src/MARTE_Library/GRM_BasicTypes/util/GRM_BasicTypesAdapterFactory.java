/**
 */
package MARTE_Library.GRM_BasicTypes.util;

import MARTE_Library.GRM_BasicTypes.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage
 * @generated
 */
public class GRM_BasicTypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GRM_BasicTypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRM_BasicTypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GRM_BasicTypesPackage.eINSTANCE;
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
	@Override
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
	protected GRM_BasicTypesSwitch<Adapter> modelSwitch =
		new GRM_BasicTypesSwitch<Adapter>() {
			@Override
			public Adapter caseEDF_Parameters(EDF_Parameters object) {
				return createEDF_ParametersAdapter();
			}
			@Override
			public Adapter caseSchedParameters(SchedParameters object) {
				return createSchedParametersAdapter();
			}
			@Override
			public Adapter caseFixedPriorityParameters(FixedPriorityParameters object) {
				return createFixedPriorityParametersAdapter();
			}
			@Override
			public Adapter casePoolingParameters(PoolingParameters object) {
				return createPoolingParametersAdapter();
			}
			@Override
			public Adapter casePeriodicServerParameters(PeriodicServerParameters object) {
				return createPeriodicServerParametersAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.GRM_BasicTypes.EDF_Parameters <em>EDF Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.GRM_BasicTypes.EDF_Parameters
	 * @generated
	 */
	public Adapter createEDF_ParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.GRM_BasicTypes.SchedParameters <em>Sched Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.GRM_BasicTypes.SchedParameters
	 * @generated
	 */
	public Adapter createSchedParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.GRM_BasicTypes.FixedPriorityParameters <em>Fixed Priority Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.GRM_BasicTypes.FixedPriorityParameters
	 * @generated
	 */
	public Adapter createFixedPriorityParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.GRM_BasicTypes.PoolingParameters <em>Pooling Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.GRM_BasicTypes.PoolingParameters
	 * @generated
	 */
	public Adapter createPoolingParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.GRM_BasicTypes.PeriodicServerParameters <em>Periodic Server Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.GRM_BasicTypes.PeriodicServerParameters
	 * @generated
	 */
	public Adapter createPeriodicServerParametersAdapter() {
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

} //GRM_BasicTypesAdapterFactory
