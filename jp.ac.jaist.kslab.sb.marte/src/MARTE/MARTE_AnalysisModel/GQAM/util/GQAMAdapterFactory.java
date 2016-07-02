/**
 */
package MARTE.MARTE_AnalysisModel.GQAM.util;

import MARTE.MARTE_AnalysisModel.GQAM.*;

import MARTE.MARTE_Annexes.VSL.Variables.ExpressionContext;

import MARTE.MARTE_Foundations.CoreElements.Configuration;

import MARTE.MARTE_Foundations.GRM.CommunicationMedia;
import MARTE.MARTE_Foundations.GRM.ComputingResource;
import MARTE.MARTE_Foundations.GRM.ProcessingResource;
import MARTE.MARTE_Foundations.GRM.Resource;
import MARTE.MARTE_Foundations.GRM.ResourceUsage;
import MARTE.MARTE_Foundations.GRM.SchedulableResource;
import MARTE.MARTE_Foundations.GRM.Scheduler;

import MARTE.MARTE_Foundations.NFPs.NfpConstraint;

import MARTE.MARTE_Foundations.Time.TimedElement;
import MARTE.MARTE_Foundations.Time.TimedProcessing;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage
 * @generated
 */
public class GQAMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GQAMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GQAMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GQAMPackage.eINSTANCE;
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
	protected GQAMSwitch modelSwitch =
		new GQAMSwitch() {
			public Object caseGaWorkloadGenerator(GaWorkloadGenerator object) {
				return createGaWorkloadGeneratorAdapter();
			}
			public Object caseGaEventTrace(GaEventTrace object) {
				return createGaEventTraceAdapter();
			}
			public Object caseGaWorkloadEvent(GaWorkloadEvent object) {
				return createGaWorkloadEventAdapter();
			}
			public Object caseGaScenario(GaScenario object) {
				return createGaScenarioAdapter();
			}
			public Object caseGaStep(GaStep object) {
				return createGaStepAdapter();
			}
			public Object caseGaExecHost(GaExecHost object) {
				return createGaExecHostAdapter();
			}
			public Object caseGaRequestedService(GaRequestedService object) {
				return createGaRequestedServiceAdapter();
			}
			public Object caseGaTimedObs(GaTimedObs object) {
				return createGaTimedObsAdapter();
			}
			public Object caseGaCommStep(GaCommStep object) {
				return createGaCommStepAdapter();
			}
			public Object caseGaAcqStep(GaAcqStep object) {
				return createGaAcqStepAdapter();
			}
			public Object caseGaRelStep(GaRelStep object) {
				return createGaRelStepAdapter();
			}
			public Object caseGaLatencyObs(GaLatencyObs object) {
				return createGaLatencyObsAdapter();
			}
			public Object caseGaCommHost(GaCommHost object) {
				return createGaCommHostAdapter();
			}
			public Object caseGaCommChannel(GaCommChannel object) {
				return createGaCommChannelAdapter();
			}
			public Object caseGaWorkloadBehavior(GaWorkloadBehavior object) {
				return createGaWorkloadBehaviorAdapter();
			}
			public Object caseGaAnalysisContext(GaAnalysisContext object) {
				return createGaAnalysisContextAdapter();
			}
			public Object caseGaResourcesPlatform(GaResourcesPlatform object) {
				return createGaResourcesPlatformAdapter();
			}
			public Object caseResourceUsage(ResourceUsage object) {
				return createResourceUsageAdapter();
			}
			public Object caseTimedElement(TimedElement object) {
				return createTimedElementAdapter();
			}
			public Object caseTimedProcessing(TimedProcessing object) {
				return createTimedProcessingAdapter();
			}
			public Object caseResource(Resource object) {
				return createResourceAdapter();
			}
			public Object caseScheduler(Scheduler object) {
				return createSchedulerAdapter();
			}
			public Object caseProcessingResource(ProcessingResource object) {
				return createProcessingResourceAdapter();
			}
			public Object caseComputingResource(ComputingResource object) {
				return createComputingResourceAdapter();
			}
			public Object caseNfpConstraint(NfpConstraint object) {
				return createNfpConstraintAdapter();
			}
			public Object caseCommunicationMedia(CommunicationMedia object) {
				return createCommunicationMediaAdapter();
			}
			public Object caseSchedulableResource(SchedulableResource object) {
				return createSchedulableResourceAdapter();
			}
			public Object caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			public Object caseExpressionContext(ExpressionContext object) {
				return createExpressionContextAdapter();
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
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadGenerator <em>Ga Workload Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadGenerator
	 * @generated
	 */
	public Adapter createGaWorkloadGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_AnalysisModel.GQAM.GaEventTrace <em>Ga Event Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GaEventTrace
	 * @generated
	 */
	public Adapter createGaEventTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent <em>Ga Workload Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent
	 * @generated
	 */
	public Adapter createGaWorkloadEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_AnalysisModel.GQAM.GaScenario <em>Ga Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GaScenario
	 * @generated
	 */
	public Adapter createGaScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_AnalysisModel.GQAM.GaStep <em>Ga Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GaStep
	 * @generated
	 */
	public Adapter createGaStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_AnalysisModel.GQAM.GaExecHost <em>Ga Exec Host</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GaExecHost
	 * @generated
	 */
	public Adapter createGaExecHostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_AnalysisModel.GQAM.GaRequestedService <em>Ga Requested Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GaRequestedService
	 * @generated
	 */
	public Adapter createGaRequestedServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_AnalysisModel.GQAM.GaTimedObs <em>Ga Timed Obs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GaTimedObs
	 * @generated
	 */
	public Adapter createGaTimedObsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_AnalysisModel.GQAM.GaCommStep <em>Ga Comm Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GaCommStep
	 * @generated
	 */
	public Adapter createGaCommStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_AnalysisModel.GQAM.GaAcqStep <em>Ga Acq Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GaAcqStep
	 * @generated
	 */
	public Adapter createGaAcqStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_AnalysisModel.GQAM.GaRelStep <em>Ga Rel Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GaRelStep
	 * @generated
	 */
	public Adapter createGaRelStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_AnalysisModel.GQAM.GaLatencyObs <em>Ga Latency Obs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GaLatencyObs
	 * @generated
	 */
	public Adapter createGaLatencyObsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_AnalysisModel.GQAM.GaCommHost <em>Ga Comm Host</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GaCommHost
	 * @generated
	 */
	public Adapter createGaCommHostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_AnalysisModel.GQAM.GaCommChannel <em>Ga Comm Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GaCommChannel
	 * @generated
	 */
	public Adapter createGaCommChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadBehavior <em>Ga Workload Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadBehavior
	 * @generated
	 */
	public Adapter createGaWorkloadBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_AnalysisModel.GQAM.GaAnalysisContext <em>Ga Analysis Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GaAnalysisContext
	 * @generated
	 */
	public Adapter createGaAnalysisContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_AnalysisModel.GQAM.GaResourcesPlatform <em>Ga Resources Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GaResourcesPlatform
	 * @generated
	 */
	public Adapter createGaResourcesPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Foundations.GRM.ResourceUsage <em>Resource Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Foundations.GRM.ResourceUsage
	 * @generated
	 */
	public Adapter createResourceUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Foundations.Time.TimedElement <em>Timed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Foundations.Time.TimedElement
	 * @generated
	 */
	public Adapter createTimedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Foundations.Time.TimedProcessing <em>Timed Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Foundations.Time.TimedProcessing
	 * @generated
	 */
	public Adapter createTimedProcessingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Foundations.GRM.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Foundations.GRM.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Foundations.GRM.Scheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Foundations.GRM.Scheduler
	 * @generated
	 */
	public Adapter createSchedulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Foundations.GRM.ProcessingResource <em>Processing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Foundations.GRM.ProcessingResource
	 * @generated
	 */
	public Adapter createProcessingResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Foundations.GRM.ComputingResource <em>Computing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Foundations.GRM.ComputingResource
	 * @generated
	 */
	public Adapter createComputingResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Foundations.NFPs.NfpConstraint <em>Nfp Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Foundations.NFPs.NfpConstraint
	 * @generated
	 */
	public Adapter createNfpConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Foundations.GRM.CommunicationMedia <em>Communication Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Foundations.GRM.CommunicationMedia
	 * @generated
	 */
	public Adapter createCommunicationMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Foundations.GRM.SchedulableResource <em>Schedulable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Foundations.GRM.SchedulableResource
	 * @generated
	 */
	public Adapter createSchedulableResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Foundations.CoreElements.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Foundations.CoreElements.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Annexes.VSL.Variables.ExpressionContext <em>Expression Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Annexes.VSL.Variables.ExpressionContext
	 * @generated
	 */
	public Adapter createExpressionContextAdapter() {
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

} //GQAMAdapterFactory
