/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDatasheet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Datasheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDatasheet.HwDatasheet#getComponents <em>Components</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDatasheet.HwDatasheet#getRevision <em>Revision</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDatasheet.HwDatasheet#getName <em>Name</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDatasheet.HwDatasheet#getProtocols <em>Protocols</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDatasheet.HwDatasheetPackage#getHwDatasheet()
 * @model
 * @generated
 */
public interface HwDatasheet extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDatasheet.HwDatasheetPackage#getHwDatasheet_Components()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource" containment="true"
	 * @generated
	 */
	EList getComponents();

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #setRevision(String)
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDatasheet.HwDatasheetPackage#getHwDatasheet_Revision()
	 * @model
	 * @generated
	 */
	String getRevision();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDatasheet.HwDatasheet#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDatasheet.HwDatasheetPackage#getHwDatasheet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDatasheet.HwDatasheet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Protocols</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocols</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocols</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDatasheet.HwDatasheetPackage#getHwDatasheet_Protocols()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocol" containment="true"
	 * @generated
	 */
	EList getProtocols();

} // HwDatasheet
