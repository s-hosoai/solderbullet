/**
 */
package MARTE.MARTE_AnalysisModel.SAM;

import MARTE_Library.BasicNFP_Types.NFP_Boolean;
import MARTE_Library.BasicNFP_Types.NFP_Real;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sa Endto End Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaEndtoEndFlow#getIsSched <em>Is Sched</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaEndtoEndFlow#getSchSlack <em>Sch Slack</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaEndtoEndFlow#getEnd2EndT <em>End2 End T</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaEndtoEndFlow#getEnd2EndD <em>End2 End D</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaEndtoEndFlow#getTiming <em>Timing</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaEndtoEndFlow#getBase_NamedElement <em>Base Named Element</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaEndtoEndFlow()
 * @model
 * @generated
 */
public interface SaEndtoEndFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Sched</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Sched</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Sched</em>' containment reference.
	 * @see #setIsSched(NFP_Boolean)
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaEndtoEndFlow_IsSched()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Boolean getIsSched();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaEndtoEndFlow#getIsSched <em>Is Sched</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sched</em>' containment reference.
	 * @see #getIsSched()
	 * @generated
	 */
	void setIsSched(NFP_Boolean value);

	/**
	 * Returns the value of the '<em><b>Sch Slack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sch Slack</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sch Slack</em>' containment reference.
	 * @see #setSchSlack(NFP_Real)
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaEndtoEndFlow_SchSlack()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Real getSchSlack();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaEndtoEndFlow#getSchSlack <em>Sch Slack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sch Slack</em>' containment reference.
	 * @see #getSchSlack()
	 * @generated
	 */
	void setSchSlack(NFP_Real value);

	/**
	 * Returns the value of the '<em><b>End2 End T</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End2 End T</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End2 End T</em>' containment reference list.
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaEndtoEndFlow_End2EndT()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Duration" containment="true" ordered="false"
	 * @generated
	 */
	EList getEnd2EndT();

	/**
	 * Returns the value of the '<em><b>End2 End D</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End2 End D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End2 End D</em>' containment reference list.
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaEndtoEndFlow_End2EndD()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Duration" containment="true" ordered="false"
	 * @generated
	 */
	EList getEnd2EndD();

	/**
	 * Returns the value of the '<em><b>Timing</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_AnalysisModel.GQAM.GaTimedObs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing</em>' reference list.
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaEndtoEndFlow_Timing()
	 * @model type="MARTE.MARTE_AnalysisModel.GQAM.GaTimedObs"
	 * @generated
	 */
	EList getTiming();

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
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaEndtoEndFlow_Base_NamedElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NamedElement getBase_NamedElement();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaEndtoEndFlow#getBase_NamedElement <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Named Element</em>' reference.
	 * @see #getBase_NamedElement()
	 * @generated
	 */
	void setBase_NamedElement(NamedElement value);

} // SaEndtoEndFlow
