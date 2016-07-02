/**
 */
package MARTE.MARTE_AnalysisModel.GQAM;

import MARTE.MARTE_Annexes.VSL.Variables.ExpressionContext;

import MARTE.MARTE_Foundations.CoreElements.Configuration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ga Analysis Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaAnalysisContext#getContext <em>Context</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaAnalysisContext#getWorkload <em>Workload</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaAnalysisContext#getPlatform <em>Platform</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaAnalysisContext()
 * @model
 * @generated
 */
public interface GaAnalysisContext extends Configuration, ExpressionContext {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference list.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaAnalysisContext_Context()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_String" containment="true" ordered="false"
	 * @generated
	 */
	EList getContext();

	/**
	 * Returns the value of the '<em><b>Workload</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadBehavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workload</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workload</em>' reference list.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaAnalysisContext_Workload()
	 * @model type="MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadBehavior" required="true" ordered="false"
	 * @generated
	 */
	EList getWorkload();

	/**
	 * Returns the value of the '<em><b>Platform</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_AnalysisModel.GQAM.GaResourcesPlatform}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' reference list.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaAnalysisContext_Platform()
	 * @model type="MARTE.MARTE_AnalysisModel.GQAM.GaResourcesPlatform" required="true" ordered="false"
	 * @generated
	 */
	EList getPlatform();

} // GaAnalysisContext
