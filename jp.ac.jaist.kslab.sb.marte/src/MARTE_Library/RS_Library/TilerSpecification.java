/**
 */
package MARTE_Library.RS_Library;

import MARTE_Library.MARTE_DataTypes.IntegerMatrix;
import MARTE_Library.MARTE_DataTypes.IntegerVector;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tiler Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.RS_Library.TilerSpecification#getOrigin <em>Origin</em>}</li>
 *   <li>{@link MARTE_Library.RS_Library.TilerSpecification#getPaving <em>Paving</em>}</li>
 *   <li>{@link MARTE_Library.RS_Library.TilerSpecification#getFitting <em>Fitting</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.RS_Library.RS_LibraryPackage#getTilerSpecification()
 * @model
 * @generated
 */
public interface TilerSpecification extends EObject {
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
	 * @see MARTE_Library.RS_Library.RS_LibraryPackage#getTilerSpecification_Origin()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	IntegerVector getOrigin();

	/**
	 * Sets the value of the '{@link MARTE_Library.RS_Library.TilerSpecification#getOrigin <em>Origin</em>}' containment reference.
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
	 * @see MARTE_Library.RS_Library.RS_LibraryPackage#getTilerSpecification_Paving()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	IntegerMatrix getPaving();

	/**
	 * Sets the value of the '{@link MARTE_Library.RS_Library.TilerSpecification#getPaving <em>Paving</em>}' containment reference.
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
	 * @see #setFitting(IntegerVector)
	 * @see MARTE_Library.RS_Library.RS_LibraryPackage#getTilerSpecification_Fitting()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	IntegerVector getFitting();

	/**
	 * Sets the value of the '{@link MARTE_Library.RS_Library.TilerSpecification#getFitting <em>Fitting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fitting</em>' containment reference.
	 * @see #getFitting()
	 * @generated
	 */
	void setFitting(IntegerVector value);

} // TilerSpecification
