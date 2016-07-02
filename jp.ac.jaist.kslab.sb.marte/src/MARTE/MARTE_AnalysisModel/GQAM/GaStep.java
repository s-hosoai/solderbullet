/**
 */
package MARTE.MARTE_AnalysisModel.GQAM;

import MARTE.MARTE_Foundations.GRM.SchedulableResource;

import MARTE_Library.BasicNFP_Types.NFP_Boolean;
import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Integer;
import MARTE_Library.BasicNFP_Types.NFP_Real;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ga Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaStep#getIsAtomic <em>Is Atomic</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaStep#getBlockT <em>Block T</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaStep#getRep <em>Rep</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaStep#getProb <em>Prob</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaStep#getPriority <em>Priority</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaStep#getConcurRes <em>Concur Res</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaStep#getHost <em>Host</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaStep#getServDemand <em>Serv Demand</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaStep#getServCount <em>Serv Count</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaStep#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaStep#getSelfDelay <em>Self Delay</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaStep()
 * @model
 * @generated
 */
public interface GaStep extends GaScenario {
	/**
	 * Returns the value of the '<em><b>Is Atomic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Atomic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Atomic</em>' containment reference.
	 * @see #setIsAtomic(NFP_Boolean)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaStep_IsAtomic()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Boolean getIsAtomic();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaStep#getIsAtomic <em>Is Atomic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Atomic</em>' containment reference.
	 * @see #getIsAtomic()
	 * @generated
	 */
	void setIsAtomic(NFP_Boolean value);

	/**
	 * Returns the value of the '<em><b>Block T</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block T</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block T</em>' containment reference.
	 * @see #setBlockT(NFP_Duration)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaStep_BlockT()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getBlockT();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaStep#getBlockT <em>Block T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block T</em>' containment reference.
	 * @see #getBlockT()
	 * @generated
	 */
	void setBlockT(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Rep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rep</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rep</em>' containment reference.
	 * @see #setRep(NFP_Real)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaStep_Rep()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Real getRep();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaStep#getRep <em>Rep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rep</em>' containment reference.
	 * @see #getRep()
	 * @generated
	 */
	void setRep(NFP_Real value);

	/**
	 * Returns the value of the '<em><b>Prob</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prob</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prob</em>' containment reference.
	 * @see #setProb(NFP_Real)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaStep_Prob()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Real getProb();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaStep#getProb <em>Prob</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prob</em>' containment reference.
	 * @see #getProb()
	 * @generated
	 */
	void setProb(NFP_Real value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(NFP_Integer)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaStep_Priority()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Integer getPriority();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaStep#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(NFP_Integer value);

	/**
	 * Returns the value of the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concur Res</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concur Res</em>' reference.
	 * @see #setConcurRes(SchedulableResource)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaStep_ConcurRes()
	 * @model ordered="false"
	 * @generated
	 */
	SchedulableResource getConcurRes();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaStep#getConcurRes <em>Concur Res</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concur Res</em>' reference.
	 * @see #getConcurRes()
	 * @generated
	 */
	void setConcurRes(SchedulableResource value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' reference.
	 * @see #setHost(GaExecHost)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaStep_Host()
	 * @model ordered="false"
	 * @generated
	 */
	GaExecHost getHost();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaStep#getHost <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(GaExecHost value);

	/**
	 * Returns the value of the '<em><b>Serv Demand</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_AnalysisModel.GQAM.GaRequestedService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serv Demand</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serv Demand</em>' reference list.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaStep_ServDemand()
	 * @model type="MARTE.MARTE_AnalysisModel.GQAM.GaRequestedService"
	 * @generated
	 */
	EList getServDemand();

	/**
	 * Returns the value of the '<em><b>Serv Count</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Real}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serv Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serv Count</em>' containment reference list.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaStep_ServCount()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Real" containment="true"
	 * @generated
	 */
	EList getServCount();

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(GaScenario)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaStep_Behavior()
	 * @model ordered="false"
	 * @generated
	 */
	GaScenario getBehavior();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaStep#getBehavior <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(GaScenario value);

	/**
	 * Returns the value of the '<em><b>Self Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self Delay</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Delay</em>' containment reference.
	 * @see #setSelfDelay(NFP_Duration)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaStep_SelfDelay()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getSelfDelay();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaStep#getSelfDelay <em>Self Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Delay</em>' containment reference.
	 * @see #getSelfDelay()
	 * @generated
	 */
	void setSelfDelay(NFP_Duration value);

} // GaStep
