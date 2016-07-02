/**
 */
package MARTE.MARTE_DesignModel.HRM.HwDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw HRM Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwHRMDiagram#getComponents <em>Components</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwHRMDiagram#getConnections <em>Connections</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwHRMDiagram#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwHRMDiagram#getName <em>Name</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwHRMDiagram#getDatatypes <em>Datatypes</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage#getHwHRMDiagram()
 * @model
 * @generated
 */
public interface HwHRMDiagram extends EObject {
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
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage#getHwHRMDiagram_Components()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource" containment="true"
	 * @generated
	 */
	EList getComponents();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage#getHwHRMDiagram_Connections()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia" containment="true"
	 * @generated
	 */
	EList getConnections();

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
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage#getHwHRMDiagram_Protocols()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocol" containment="true"
	 * @generated
	 */
	EList getProtocols();

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
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage#getHwHRMDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwHRMDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Datatypes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatypes</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage#getHwHRMDiagram_Datatypes()
	 * @model type="org.eclipse.uml2.uml.DataType" containment="true"
	 * @generated
	 */
	EList getDatatypes();

} // HwHRMDiagram
