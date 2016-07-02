/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Concurrency;

import MARTE.MARTE_Foundations.Alloc.Allocate;

import org.eclipse.uml2.uml.BehavioralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.EntryPoint#getIsReentrant <em>Is Reentrant</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.EntryPoint#getRoutine <em>Routine</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getEntryPoint()
 * @model
 * @generated
 */
public interface EntryPoint extends Allocate {
	/**
	 * Returns the value of the '<em><b>Is Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Reentrant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reentrant</em>' attribute.
	 * @see #setIsReentrant(Boolean)
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getEntryPoint_IsReentrant()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getIsReentrant();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.EntryPoint#getIsReentrant <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reentrant</em>' attribute.
	 * @see #getIsReentrant()
	 * @generated
	 */
	void setIsReentrant(Boolean value);

	/**
	 * Returns the value of the '<em><b>Routine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routine</em>' reference.
	 * @see #setRoutine(BehavioralFeature)
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getEntryPoint_Routine()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BehavioralFeature getRoutine();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.EntryPoint#getRoutine <em>Routine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routine</em>' reference.
	 * @see #getRoutine()
	 * @generated
	 */
	void setRoutine(BehavioralFeature value);

} // EntryPoint
