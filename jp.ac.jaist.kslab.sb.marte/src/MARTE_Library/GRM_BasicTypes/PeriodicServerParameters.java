/**
 */
package MARTE_Library.GRM_BasicTypes;

import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Integer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periodic Server Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.PeriodicServerParameters#getKind <em>Kind</em>}</li>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.PeriodicServerParameters#getBackgroundPriority <em>Background Priority</em>}</li>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.PeriodicServerParameters#getInitialBudget <em>Initial Budget</em>}</li>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.PeriodicServerParameters#getReplenishPeriod <em>Replenish Period</em>}</li>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.PeriodicServerParameters#getMaxPendingReplenish <em>Max Pending Replenish</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage#getPeriodicServerParameters()
 * @model
 * @generated
 */
public interface PeriodicServerParameters extends FixedPriorityParameters {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE_Library.GRM_BasicTypes.PeriodicServerKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see MARTE_Library.GRM_BasicTypes.PeriodicServerKind
	 * @see #setKind(PeriodicServerKind)
	 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage#getPeriodicServerParameters_Kind()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	PeriodicServerKind getKind();

	/**
	 * Sets the value of the '{@link MARTE_Library.GRM_BasicTypes.PeriodicServerParameters#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see MARTE_Library.GRM_BasicTypes.PeriodicServerKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PeriodicServerKind value);

	/**
	 * Returns the value of the '<em><b>Background Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Priority</em>' attribute.
	 * @see #setBackgroundPriority(Integer)
	 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage#getPeriodicServerParameters_BackgroundPriority()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Integer" ordered="false"
	 * @generated
	 */
	Object getBackgroundPriority();

	/**
	 * Sets the value of the '{@link MARTE_Library.GRM_BasicTypes.PeriodicServerParameters#getBackgroundPriority <em>Background Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Priority</em>' attribute.
	 * @see #getBackgroundPriority()
	 * @generated
	 */
	void setBackgroundPriority(Object value);

	/**
	 * Returns the value of the '<em><b>Initial Budget</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Budget</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Budget</em>' containment reference.
	 * @see #setInitialBudget(NFP_Duration)
	 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage#getPeriodicServerParameters_InitialBudget()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getInitialBudget();

	/**
	 * Sets the value of the '{@link MARTE_Library.GRM_BasicTypes.PeriodicServerParameters#getInitialBudget <em>Initial Budget</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Budget</em>' containment reference.
	 * @see #getInitialBudget()
	 * @generated
	 */
	void setInitialBudget(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Replenish Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replenish Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replenish Period</em>' containment reference.
	 * @see #setReplenishPeriod(NFP_Duration)
	 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage#getPeriodicServerParameters_ReplenishPeriod()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getReplenishPeriod();

	/**
	 * Sets the value of the '{@link MARTE_Library.GRM_BasicTypes.PeriodicServerParameters#getReplenishPeriod <em>Replenish Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replenish Period</em>' containment reference.
	 * @see #getReplenishPeriod()
	 * @generated
	 */
	void setReplenishPeriod(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Max Pending Replenish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Pending Replenish</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Pending Replenish</em>' containment reference.
	 * @see #setMaxPendingReplenish(NFP_Integer)
	 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage#getPeriodicServerParameters_MaxPendingReplenish()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Integer getMaxPendingReplenish();

	/**
	 * Sets the value of the '{@link MARTE_Library.GRM_BasicTypes.PeriodicServerParameters#getMaxPendingReplenish <em>Max Pending Replenish</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Pending Replenish</em>' containment reference.
	 * @see #getMaxPendingReplenish()
	 * @generated
	 */
	void setMaxPendingReplenish(NFP_Integer value);

} // PeriodicServerParameters
