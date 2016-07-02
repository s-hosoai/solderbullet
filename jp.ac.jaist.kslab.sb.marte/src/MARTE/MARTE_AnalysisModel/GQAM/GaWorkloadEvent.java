/**
 */
package MARTE.MARTE_AnalysisModel.GQAM;

import MARTE_Library.BasicNFP_Types.ArrivalPattern;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.TimeEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ga Workload Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent#getPattern <em>Pattern</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent#getGenerator <em>Generator</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent#getTrace <em>Trace</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent#getEffect <em>Effect</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent#getTimedEvent <em>Timed Event</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent#getBase_NamedElement <em>Base Named Element</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaWorkloadEvent()
 * @model
 * @generated
 */
public interface GaWorkloadEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(ArrivalPattern)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaWorkloadEvent_Pattern()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ArrivalPattern getPattern();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(ArrivalPattern value);

	/**
	 * Returns the value of the '<em><b>Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' reference.
	 * @see #setGenerator(GaWorkloadGenerator)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaWorkloadEvent_Generator()
	 * @model ordered="false"
	 * @generated
	 */
	GaWorkloadGenerator getGenerator();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent#getGenerator <em>Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' reference.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(GaWorkloadGenerator value);

	/**
	 * Returns the value of the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace</em>' reference.
	 * @see #setTrace(GaEventTrace)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaWorkloadEvent_Trace()
	 * @model ordered="false"
	 * @generated
	 */
	GaEventTrace getTrace();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent#getTrace <em>Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' reference.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(GaEventTrace value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' reference.
	 * @see #setEffect(GaScenario)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaWorkloadEvent_Effect()
	 * @model ordered="false"
	 * @generated
	 */
	GaScenario getEffect();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent#getEffect <em>Effect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(GaScenario value);

	/**
	 * Returns the value of the '<em><b>Timed Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timed Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timed Event</em>' reference.
	 * @see #setTimedEvent(TimeEvent)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaWorkloadEvent_TimedEvent()
	 * @model ordered="false"
	 * @generated
	 */
	TimeEvent getTimedEvent();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent#getTimedEvent <em>Timed Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timed Event</em>' reference.
	 * @see #getTimedEvent()
	 * @generated
	 */
	void setTimedEvent(TimeEvent value);

	/**
	 * Returns the value of the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Named Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Named Element</em>' reference.
	 * @see #setBase_NamedElement(NamedElement)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaWorkloadEvent_Base_NamedElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NamedElement getBase_NamedElement();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent#getBase_NamedElement <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Named Element</em>' reference.
	 * @see #getBase_NamedElement()
	 * @generated
	 */
	void setBase_NamedElement(NamedElement value);

} // GaWorkloadEvent
