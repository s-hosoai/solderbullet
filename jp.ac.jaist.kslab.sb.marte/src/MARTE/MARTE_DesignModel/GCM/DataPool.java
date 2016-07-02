/**
 */
package MARTE.MARTE_DesignModel.GCM;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.DataPool#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.DataPool#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.DataPool#getInsertion <em>Insertion</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.DataPool#getSelection <em>Selection</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getDataPool()
 * @model
 * @generated
 */
public interface DataPool extends EObject {
	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' attribute.
	 * The default value is <code>"FIFO"</code>.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.GCM.DataPoolOrderingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordering</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.GCM.DataPoolOrderingKind
	 * @see #setOrdering(DataPoolOrderingKind)
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getDataPool_Ordering()
	 * @model default="FIFO" unique="false" required="true" ordered="false"
	 * @generated
	 */
	DataPoolOrderingKind getOrdering();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.GCM.DataPool#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.GCM.DataPoolOrderingKind
	 * @see #getOrdering()
	 * @generated
	 */
	void setOrdering(DataPoolOrderingKind value);

	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getDataPool_Base_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.GCM.DataPool#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

	/**
	 * Returns the value of the '<em><b>Insertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insertion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insertion</em>' reference.
	 * @see #setInsertion(Behavior)
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getDataPool_Insertion()
	 * @model ordered="false"
	 * @generated
	 */
	Behavior getInsertion();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.GCM.DataPool#getInsertion <em>Insertion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insertion</em>' reference.
	 * @see #getInsertion()
	 * @generated
	 */
	void setInsertion(Behavior value);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(Behavior)
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getDataPool_Selection()
	 * @model ordered="false"
	 * @generated
	 */
	Behavior getSelection();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.GCM.DataPool#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Behavior value);

} // DataPool
