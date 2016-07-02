/**
 */
package MARTE.MARTE_DesignModel.HRM.HwDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Circuit Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwCircuitDiagram#getComponents <em>Components</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwCircuitDiagram#getWires <em>Wires</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwCircuitDiagram#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage#getHwCircuitDiagram()
 * @model
 * @generated
 */
public interface HwCircuitDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage#getHwCircuitDiagram_Components()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage" containment="true"
	 * @generated
	 */
	EList getComponents();

	/**
	 * Returns the value of the '<em><b>Wires</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwWire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wires</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wires</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage#getHwCircuitDiagram_Wires()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwWire" containment="true"
	 * @generated
	 */
	EList getWires();

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
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage#getHwCircuitDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.HwCircuitDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // HwCircuitDiagram
