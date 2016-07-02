/**
 */
package MARTE.MARTE_Annexes.RSM;

import MARTE_Library.MARTE_DataTypes.IntegerMatrix;
import MARTE_Library.MARTE_DataTypes.IntegerVector;

import MARTE_Library.RS_Library.TilerSpecification;

import org.eclipse.uml2.uml.ConnectorEnd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tiler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.Tiler#getOrigin <em>Origin</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.Tiler#getPaving <em>Paving</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.Tiler#getFitting <em>Fitting</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.Tiler#getTiler <em>Tiler</em>}</li>
 *   <li>{@link MARTE.MARTE_Annexes.RSM.Tiler#getBase_ConnectorEnd <em>Base Connector End</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Annexes.RSM.RSMPackage#getTiler()
 * @model
 * @generated
 */
public interface Tiler extends LinkTopology {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference.
	 * @see #setOrigin(IntegerVector)
	 * @see MARTE.MARTE_Annexes.RSM.RSMPackage#getTiler_Origin()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	IntegerVector getOrigin();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Annexes.RSM.Tiler#getOrigin <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' containment reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(IntegerVector value);

	/**
	 * Returns the value of the '<em><b>Paving</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paving</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paving</em>' containment reference.
	 * @see #setPaving(IntegerMatrix)
	 * @see MARTE.MARTE_Annexes.RSM.RSMPackage#getTiler_Paving()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	IntegerMatrix getPaving();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Annexes.RSM.Tiler#getPaving <em>Paving</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paving</em>' containment reference.
	 * @see #getPaving()
	 * @generated
	 */
	void setPaving(IntegerMatrix value);

	/**
	 * Returns the value of the '<em><b>Fitting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fitting</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fitting</em>' containment reference.
	 * @see #setFitting(IntegerMatrix)
	 * @see MARTE.MARTE_Annexes.RSM.RSMPackage#getTiler_Fitting()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	IntegerMatrix getFitting();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Annexes.RSM.Tiler#getFitting <em>Fitting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fitting</em>' containment reference.
	 * @see #getFitting()
	 * @generated
	 */
	void setFitting(IntegerMatrix value);

	/**
	 * Returns the value of the '<em><b>Tiler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiler</em>' containment reference.
	 * @see #setTiler(TilerSpecification)
	 * @see MARTE.MARTE_Annexes.RSM.RSMPackage#getTiler_Tiler()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	TilerSpecification getTiler();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Annexes.RSM.Tiler#getTiler <em>Tiler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiler</em>' containment reference.
	 * @see #getTiler()
	 * @generated
	 */
	void setTiler(TilerSpecification value);

	/**
	 * Returns the value of the '<em><b>Base Connector End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Connector End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Connector End</em>' reference.
	 * @see #setBase_ConnectorEnd(ConnectorEnd)
	 * @see MARTE.MARTE_Annexes.RSM.RSMPackage#getTiler_Base_ConnectorEnd()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ConnectorEnd getBase_ConnectorEnd();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Annexes.RSM.Tiler#getBase_ConnectorEnd <em>Base Connector End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Connector End</em>' reference.
	 * @see #getBase_ConnectorEnd()
	 * @generated
	 */
	void setBase_ConnectorEnd(ConnectorEnd value);

} // Tiler
