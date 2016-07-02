/**
 */
package MARTE.MARTE_AnalysisModel.PAM;

import MARTE.MARTE_AnalysisModel.GQAM.GaExecHost;

import MARTE.MARTE_Foundations.GRM.SchedulableResource;

import MARTE_Library.BasicNFP_Types.NFP_Frequency;
import MARTE_Library.BasicNFP_Types.NFP_Integer;
import MARTE_Library.BasicNFP_Types.NFP_Real;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pa Run TInstance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.PaRunTInstance#getPoolSize <em>Pool Size</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.PaRunTInstance#getUnbddPool <em>Unbdd Pool</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.PaRunTInstance#getInstance <em>Instance</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.PaRunTInstance#getHost <em>Host</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.PaRunTInstance#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.PaRunTInstance#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.PAM.PaRunTInstance#getBase_NamedElement <em>Base Named Element</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.PAM.PAMPackage#getPaRunTInstance()
 * @model
 * @generated
 */
public interface PaRunTInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Pool Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pool Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool Size</em>' containment reference.
	 * @see #setPoolSize(NFP_Integer)
	 * @see MARTE.MARTE_AnalysisModel.PAM.PAMPackage#getPaRunTInstance_PoolSize()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Integer getPoolSize();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.PAM.PaRunTInstance#getPoolSize <em>Pool Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool Size</em>' containment reference.
	 * @see #getPoolSize()
	 * @generated
	 */
	void setPoolSize(NFP_Integer value);

	/**
	 * Returns the value of the '<em><b>Unbdd Pool</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unbdd Pool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unbdd Pool</em>' attribute.
	 * @see #setUnbddPool(Boolean)
	 * @see MARTE.MARTE_AnalysisModel.PAM.PAMPackage#getPaRunTInstance_UnbddPool()
	 * @model default="false" unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getUnbddPool();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.PAM.PaRunTInstance#getUnbddPool <em>Unbdd Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unbdd Pool</em>' attribute.
	 * @see #getUnbddPool()
	 * @generated
	 */
	void setUnbddPool(Boolean value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #setInstance(SchedulableResource)
	 * @see MARTE.MARTE_AnalysisModel.PAM.PAMPackage#getPaRunTInstance_Instance()
	 * @model ordered="false"
	 * @generated
	 */
	SchedulableResource getInstance();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.PAM.PaRunTInstance#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(SchedulableResource value);

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
	 * @see MARTE.MARTE_AnalysisModel.PAM.PAMPackage#getPaRunTInstance_Host()
	 * @model ordered="false"
	 * @generated
	 */
	GaExecHost getHost();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.PAM.PaRunTInstance#getHost <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(GaExecHost value);

	/**
	 * Returns the value of the '<em><b>Utilization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilization</em>' containment reference.
	 * @see #setUtilization(NFP_Real)
	 * @see MARTE.MARTE_AnalysisModel.PAM.PAMPackage#getPaRunTInstance_Utilization()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Real getUtilization();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.PAM.PaRunTInstance#getUtilization <em>Utilization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilization</em>' containment reference.
	 * @see #getUtilization()
	 * @generated
	 */
	void setUtilization(NFP_Real value);

	/**
	 * Returns the value of the '<em><b>Throughput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throughput</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput</em>' containment reference.
	 * @see #setThroughput(NFP_Frequency)
	 * @see MARTE.MARTE_AnalysisModel.PAM.PAMPackage#getPaRunTInstance_Throughput()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Frequency getThroughput();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.PAM.PaRunTInstance#getThroughput <em>Throughput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput</em>' containment reference.
	 * @see #getThroughput()
	 * @generated
	 */
	void setThroughput(NFP_Frequency value);

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
	 * @see MARTE.MARTE_AnalysisModel.PAM.PAMPackage#getPaRunTInstance_Base_NamedElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NamedElement getBase_NamedElement();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.PAM.PaRunTInstance#getBase_NamedElement <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Named Element</em>' reference.
	 * @see #getBase_NamedElement()
	 * @generated
	 */
	void setBase_NamedElement(NamedElement value);

} // PaRunTInstance
