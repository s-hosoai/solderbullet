/**
 */
package MARTE.MARTE_Foundations.Alloc;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.ActivityPartition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocate Activity Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.Alloc.AllocateActivityGroup#getBase_ActivityPartition <em>Base Activity Partition</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.Alloc.AllocPackage#getAllocateActivityGroup()
 * @model
 * @generated
 */
public interface AllocateActivityGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Activity Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Activity Partition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Activity Partition</em>' reference.
	 * @see #setBase_ActivityPartition(ActivityPartition)
	 * @see MARTE.MARTE_Foundations.Alloc.AllocPackage#getAllocateActivityGroup_Base_ActivityPartition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActivityPartition getBase_ActivityPartition();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.Alloc.AllocateActivityGroup#getBase_ActivityPartition <em>Base Activity Partition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Activity Partition</em>' reference.
	 * @see #getBase_ActivityPartition()
	 * @generated
	 */
	void setBase_ActivityPartition(ActivityPartition value);

} // AllocateActivityGroup
