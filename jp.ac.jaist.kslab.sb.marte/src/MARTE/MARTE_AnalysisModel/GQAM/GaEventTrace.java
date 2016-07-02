/**
 */
package MARTE.MARTE_AnalysisModel.GQAM;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ga Event Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaEventTrace#getContent <em>Content</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaEventTrace#getFormat <em>Format</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaEventTrace#getLocation <em>Location</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaEventTrace#getBase_NamedElement <em>Base Named Element</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaEventTrace()
 * @model
 * @generated
 */
public interface GaEventTrace extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaEventTrace_Content()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.String" ordered="false"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaEventTrace#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaEventTrace_Format()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.String" ordered="false"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaEventTrace#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaEventTrace_Location()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.String" ordered="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaEventTrace#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

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
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaEventTrace_Base_NamedElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NamedElement getBase_NamedElement();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaEventTrace#getBase_NamedElement <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Named Element</em>' reference.
	 * @see #getBase_NamedElement()
	 * @generated
	 */
	void setBase_NamedElement(NamedElement value);

} // GaEventTrace
