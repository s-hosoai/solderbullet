/**
 */
package MARTE.MARTE_DesignModel.HRM.HwProtocol;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocol#getOperations <em>Operations</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocol#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocolPackage#getHwProtocol()
 * @model
 * @generated
 */
public interface HwProtocol extends EObject {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocolPackage#getHwProtocol_Operations()
	 * @model type="org.eclipse.uml2.uml.Operation" containment="true"
	 * @generated
	 */
	EList getOperations();

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
	 * @see MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocolPackage#getHwProtocol_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocol#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // HwProtocol
