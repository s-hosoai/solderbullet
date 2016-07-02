/**
 */
package MARTE_Library.BasicNFP_Types.util;

import MARTE_Library.BasicNFP_Types.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage
 * @generated
 */
public class BasicNFP_TypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasicNFP_TypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicNFP_TypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BasicNFP_TypesPackage.eINSTANCE;
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
	protected BasicNFP_TypesSwitch<Adapter> modelSwitch =
		new BasicNFP_TypesSwitch<Adapter>() {
			@Override
			public Adapter caseNFP_CommonType(NFP_CommonType object) {
				return createNFP_CommonTypeAdapter();
			}
			@Override
			public Adapter caseNFP_Frequency(NFP_Frequency object) {
				return createNFP_FrequencyAdapter();
			}
			@Override
			public Adapter caseNFP_Real(NFP_Real object) {
				return createNFP_RealAdapter();
			}
			@Override
			public Adapter caseNFP_Natural(NFP_Natural object) {
				return createNFP_NaturalAdapter();
			}
			@Override
			public Adapter caseNFP_Boolean(NFP_Boolean object) {
				return createNFP_BooleanAdapter();
			}
			@Override
			public Adapter caseNFP_String(NFP_String object) {
				return createNFP_StringAdapter();
			}
			@Override
			public Adapter caseNFP_Integer(NFP_Integer object) {
				return createNFP_IntegerAdapter();
			}
			@Override
			public Adapter caseNFP_DateTime(NFP_DateTime object) {
				return createNFP_DateTimeAdapter();
			}
			@Override
			public Adapter caseNFP_DataTxRate(NFP_DataTxRate object) {
				return createNFP_DataTxRateAdapter();
			}
			@Override
			public Adapter caseNFP_Power(NFP_Power object) {
				return createNFP_PowerAdapter();
			}
			@Override
			public Adapter caseNFP_DataSize(NFP_DataSize object) {
				return createNFP_DataSizeAdapter();
			}
			@Override
			public Adapter caseNFP_Energy(NFP_Energy object) {
				return createNFP_EnergyAdapter();
			}
			@Override
			public Adapter caseNFP_Length(NFP_Length object) {
				return createNFP_LengthAdapter();
			}
			@Override
			public Adapter caseNFP_Area(NFP_Area object) {
				return createNFP_AreaAdapter();
			}
			@Override
			public Adapter caseArrivalPattern(ArrivalPattern object) {
				return createArrivalPatternAdapter();
			}
			@Override
			public Adapter casePeriodicPattern(PeriodicPattern object) {
				return createPeriodicPatternAdapter();
			}
			@Override
			public Adapter caseAperiodicPattern(AperiodicPattern object) {
				return createAperiodicPatternAdapter();
			}
			@Override
			public Adapter caseBurstPattern(BurstPattern object) {
				return createBurstPatternAdapter();
			}
			@Override
			public Adapter caseIrregularPattern(IrregularPattern object) {
				return createIrregularPatternAdapter();
			}
			@Override
			public Adapter caseClosedPattern(ClosedPattern object) {
				return createClosedPatternAdapter();
			}
			@Override
			public Adapter caseSporadicPattern(SporadicPattern object) {
				return createSporadicPatternAdapter();
			}
			@Override
			public Adapter caseOpenPattern(OpenPattern object) {
				return createOpenPatternAdapter();
			}
			@Override
			public Adapter caseNFP_Percentage(NFP_Percentage object) {
				return createNFP_PercentageAdapter();
			}
			@Override
			public Adapter caseNFP_Price(NFP_Price object) {
				return createNFP_PriceAdapter();
			}
			@Override
			public Adapter caseNFP_Weight(NFP_Weight object) {
				return createNFP_WeightAdapter();
			}
			@Override
			public Adapter caseNFP_Duration(NFP_Duration object) {
				return createNFP_DurationAdapter();
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
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.NFP_CommonType <em>NFP Common Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.NFP_CommonType
	 * @generated
	 */
	public Adapter createNFP_CommonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.NFP_Frequency <em>NFP Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Frequency
	 * @generated
	 */
	public Adapter createNFP_FrequencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.NFP_Real <em>NFP Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Real
	 * @generated
	 */
	public Adapter createNFP_RealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.NFP_Natural <em>NFP Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Natural
	 * @generated
	 */
	public Adapter createNFP_NaturalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.NFP_Boolean <em>NFP Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Boolean
	 * @generated
	 */
	public Adapter createNFP_BooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.NFP_String <em>NFP String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.NFP_String
	 * @generated
	 */
	public Adapter createNFP_StringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.NFP_Integer <em>NFP Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Integer
	 * @generated
	 */
	public Adapter createNFP_IntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.NFP_DateTime <em>NFP Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.NFP_DateTime
	 * @generated
	 */
	public Adapter createNFP_DateTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.NFP_DataTxRate <em>NFP Data Tx Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.NFP_DataTxRate
	 * @generated
	 */
	public Adapter createNFP_DataTxRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.NFP_Power <em>NFP Power</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Power
	 * @generated
	 */
	public Adapter createNFP_PowerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.NFP_DataSize <em>NFP Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.NFP_DataSize
	 * @generated
	 */
	public Adapter createNFP_DataSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.NFP_Energy <em>NFP Energy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Energy
	 * @generated
	 */
	public Adapter createNFP_EnergyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.NFP_Length <em>NFP Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Length
	 * @generated
	 */
	public Adapter createNFP_LengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.NFP_Area <em>NFP Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Area
	 * @generated
	 */
	public Adapter createNFP_AreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.ArrivalPattern <em>Arrival Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.ArrivalPattern
	 * @generated
	 */
	public Adapter createArrivalPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.PeriodicPattern <em>Periodic Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.PeriodicPattern
	 * @generated
	 */
	public Adapter createPeriodicPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.AperiodicPattern <em>Aperiodic Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.AperiodicPattern
	 * @generated
	 */
	public Adapter createAperiodicPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.BurstPattern <em>Burst Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.BurstPattern
	 * @generated
	 */
	public Adapter createBurstPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.IrregularPattern <em>Irregular Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.IrregularPattern
	 * @generated
	 */
	public Adapter createIrregularPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.ClosedPattern <em>Closed Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.ClosedPattern
	 * @generated
	 */
	public Adapter createClosedPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.SporadicPattern <em>Sporadic Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.SporadicPattern
	 * @generated
	 */
	public Adapter createSporadicPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.OpenPattern <em>Open Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.OpenPattern
	 * @generated
	 */
	public Adapter createOpenPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.NFP_Percentage <em>NFP Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Percentage
	 * @generated
	 */
	public Adapter createNFP_PercentageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.NFP_Price <em>NFP Price</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Price
	 * @generated
	 */
	public Adapter createNFP_PriceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.NFP_Weight <em>NFP Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Weight
	 * @generated
	 */
	public Adapter createNFP_WeightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE_Library.BasicNFP_Types.NFP_Duration <em>NFP Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Duration
	 * @generated
	 */
	public Adapter createNFP_DurationAdapter() {
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

} //BasicNFP_TypesAdapterFactory
