/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package blockdiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link blockdiagram.HwComponent#getConection <em>Conection</em>}</li>
 *   <li>{@link blockdiagram.HwComponent#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see blockdiagram.BlockdiagramPackage#getHwComponent()
 * @model
 * @generated
 */
public interface HwComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Conection</b></em>' containment reference list.
	 * The list contents are of type {@link blockdiagram.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conection</em>' containment reference list.
	 * @see blockdiagram.BlockdiagramPackage#getHwComponent_Conection()
	 * @model type="blockdiagram.Connection" containment="true"
	 * @generated
	 */
	EList getConection();

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
	 * @see blockdiagram.BlockdiagramPackage#getHwComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link blockdiagram.HwComponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // HwComponent
