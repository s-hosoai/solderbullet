/**
 */
package MARTE_Library.GRM_BasicTypes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sched Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.SchedParameters#getEdf <em>Edf</em>}</li>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.SchedParameters#getFp <em>Fp</em>}</li>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.SchedParameters#getPooling <em>Pooling</em>}</li>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.SchedParameters#getServer <em>Server</em>}</li>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.SchedParameters#getTableEntry <em>Table Entry</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage#getSchedParameters()
 * @model
 * @generated
 */
public interface SchedParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Edf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edf</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edf</em>' containment reference.
	 * @see #setEdf(EDF_Parameters)
	 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage#getSchedParameters_Edf()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EDF_Parameters getEdf();

	/**
	 * Sets the value of the '{@link MARTE_Library.GRM_BasicTypes.SchedParameters#getEdf <em>Edf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edf</em>' containment reference.
	 * @see #getEdf()
	 * @generated
	 */
	void setEdf(EDF_Parameters value);

	/**
	 * Returns the value of the '<em><b>Fp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fp</em>' containment reference.
	 * @see #setFp(FixedPriorityParameters)
	 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage#getSchedParameters_Fp()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	FixedPriorityParameters getFp();

	/**
	 * Sets the value of the '{@link MARTE_Library.GRM_BasicTypes.SchedParameters#getFp <em>Fp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fp</em>' containment reference.
	 * @see #getFp()
	 * @generated
	 */
	void setFp(FixedPriorityParameters value);

	/**
	 * Returns the value of the '<em><b>Pooling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pooling</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pooling</em>' containment reference.
	 * @see #setPooling(PoolingParameters)
	 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage#getSchedParameters_Pooling()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PoolingParameters getPooling();

	/**
	 * Sets the value of the '{@link MARTE_Library.GRM_BasicTypes.SchedParameters#getPooling <em>Pooling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pooling</em>' containment reference.
	 * @see #getPooling()
	 * @generated
	 */
	void setPooling(PoolingParameters value);

	/**
	 * Returns the value of the '<em><b>Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' containment reference.
	 * @see #setServer(PeriodicServerParameters)
	 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage#getSchedParameters_Server()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PeriodicServerParameters getServer();

	/**
	 * Sets the value of the '{@link MARTE_Library.GRM_BasicTypes.SchedParameters#getServer <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' containment reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(PeriodicServerParameters value);

	/**
	 * Returns the value of the '<em><b>Table Entry</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Entry</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Entry</em>' attribute list.
	 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage#getSchedParameters_TableEntry()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.String" ordered="false"
	 * @generated
	 */
	EList<Object> getTableEntry();

} // SchedParameters
