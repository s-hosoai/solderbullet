/**
 */
package MARTE.MARTE_AnalysisModel.GQAM;

import MARTE_Library.BasicNFP_Types.NFP_Integer;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ga Workload Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadGenerator#getPop <em>Pop</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadGenerator#getBase_Behavior <em>Base Behavior</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaWorkloadGenerator()
 * @model
 * @generated
 */
public interface GaWorkloadGenerator extends EObject {
	/**
	 * Returns the value of the '<em><b>Pop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pop</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pop</em>' containment reference.
	 * @see #setPop(NFP_Integer)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaWorkloadGenerator_Pop()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Integer getPop();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadGenerator#getPop <em>Pop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pop</em>' containment reference.
	 * @see #getPop()
	 * @generated
	 */
	void setPop(NFP_Integer value);

	/**
	 * Returns the value of the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Behavior</em>' reference.
	 * @see #setBase_Behavior(Behavior)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaWorkloadGenerator_Base_Behavior()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Behavior getBase_Behavior();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadGenerator#getBase_Behavior <em>Base Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Behavior</em>' reference.
	 * @see #getBase_Behavior()
	 * @generated
	 */
	void setBase_Behavior(Behavior value);

} // GaWorkloadGenerator
