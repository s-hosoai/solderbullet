/**
 */
package MARTE_Library.RS_Library;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.RS_Library.ShapeSpecification#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.RS_Library.RS_LibraryPackage#getShapeSpecification()
 * @model
 * @generated
 */
public interface ShapeSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute list.
	 * @see MARTE_Library.RS_Library.RS_LibraryPackage#getShapeSpecification_Size()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.UnlimitedNatural" ordered="false"
	 * @generated
	 */
	EList<Object> getSize();

} // ShapeSpecification
