/**
 */
package MARTE_Library.MARTE_DataTypes.util;

import MARTE_Library.MARTE_DataTypes.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage
 * @generated
 */
public class MARTE_DataTypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MARTE_DataTypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MARTE_DataTypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MARTE_DataTypesPackage.eINSTANCE;
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
	protected MARTE_DataTypesSwitch<Adapter> modelSwitch =
		new MARTE_DataTypesSwitch<Adapter>() {
			@Override
			public Adapter caseIntegerVector(IntegerVector object) {
				return createIntegerVectorAdapter();
			}
			@Override
			public Adapter caseIntegerMatrix(IntegerMatrix object) {
				return createIntegerMatrixAdapter();
			}
			@Override
			public Adapter caseIntegerInterval(IntegerInterval object) {
				return createIntegerIntervalAdapter();
			}
			@Override
			public Adapter caseUtilityType(UtilityType object) {
				return createUtilityTypeAdapter();
			}
			@Override
			public <T> Adapter caseArray(Array<T> object) {
				return createArrayAdapter();
			}
			@Override
			public <T1, T2> Adapter caseInterval(Interval<T1, T2> object) {
				return createIntervalAdapter();
			}
			@Override
			public Adapter caseRealnterval(Realnterval object) {
				return createRealntervalAdapter();
			}
			@Override
			public Adapter caseNFP_FrequencyInterval(NFP_FrequencyInterval object) {
				return createNFP_FrequencyIntervalAdapter();
			}
			@Override
			public Adapter caseNFP_NaturalInterval(NFP_NaturalInterval object) {
				return createNFP_NaturalIntervalAdapter();
			}
			@Override
			public Adapter caseRealVector(RealVector object) {
				return createRealVectorAdapter();
			}
			@Override
			public Adapter caseRealMatrix(RealMatrix object) {
				return createRealMatrixAdapter();
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
	 * Creates a new adapter for an object of class '{@link MARTE_Library.MARTE_DataTypes.IntegerVector <em>Integer Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.MARTE_DataTypes.IntegerVector
	 * @generated
	 */
	public Adapter createIntegerVectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.MARTE_DataTypes.IntegerMatrix <em>Integer Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.MARTE_DataTypes.IntegerMatrix
	 * @generated
	 */
	public Adapter createIntegerMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.MARTE_DataTypes.IntegerInterval <em>Integer Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.MARTE_DataTypes.IntegerInterval
	 * @generated
	 */
	public Adapter createIntegerIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.MARTE_DataTypes.UtilityType <em>Utility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.MARTE_DataTypes.UtilityType
	 * @generated
	 */
	public Adapter createUtilityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.MARTE_DataTypes.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.MARTE_DataTypes.Array
	 * @generated
	 */
	public Adapter createArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.MARTE_DataTypes.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.MARTE_DataTypes.Interval
	 * @generated
	 */
	public Adapter createIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.MARTE_DataTypes.Realnterval <em>Realnterval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.MARTE_DataTypes.Realnterval
	 * @generated
	 */
	public Adapter createRealntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.MARTE_DataTypes.NFP_FrequencyInterval <em>NFP Frequency Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.MARTE_DataTypes.NFP_FrequencyInterval
	 * @generated
	 */
	public Adapter createNFP_FrequencyIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.MARTE_DataTypes.NFP_NaturalInterval <em>NFP Natural Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.MARTE_DataTypes.NFP_NaturalInterval
	 * @generated
	 */
	public Adapter createNFP_NaturalIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.MARTE_DataTypes.RealVector <em>Real Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.MARTE_DataTypes.RealVector
	 * @generated
	 */
	public Adapter createRealVectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.MARTE_DataTypes.RealMatrix <em>Real Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.MARTE_DataTypes.RealMatrix
	 * @generated
	 */
	public Adapter createRealMatrixAdapter() {
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

} //MARTE_DataTypesAdapterFactory
