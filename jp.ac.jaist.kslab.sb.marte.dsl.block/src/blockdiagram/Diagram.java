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
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link blockdiagram.Diagram#getCom <em>Com</em>}</li>
 * </ul>
 * </p>
 *
 * @see blockdiagram.BlockdiagramPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Com</b></em>' containment reference list.
	 * The list contents are of type {@link blockdiagram.HwComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com</em>' containment reference list.
	 * @see blockdiagram.BlockdiagramPackage#getDiagram_Com()
	 * @model type="blockdiagram.HwComponent" containment="true"
	 * @generated
	 */
	EList getCom();

} // Diagram
