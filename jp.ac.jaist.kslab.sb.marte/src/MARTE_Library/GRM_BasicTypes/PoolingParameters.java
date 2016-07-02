/**
 */
package MARTE_Library.GRM_BasicTypes;

import MARTE_Library.BasicNFP_Types.NFP_Duration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pooling Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.PoolingParameters#getPeriod <em>Period</em>}</li>
 *   <li>{@link MARTE_Library.GRM_BasicTypes.PoolingParameters#getOverhead <em>Overhead</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage#getPoolingParameters()
 * @model
 * @generated
 */
public interface PoolingParameters extends FixedPriorityParameters {
	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(NFP_Duration)
	 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage#getPoolingParameters_Period()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getPeriod();

	/**
	 * Sets the value of the '{@link MARTE_Library.GRM_BasicTypes.PoolingParameters#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Overhead</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overhead</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overhead</em>' containment reference list.
	 * @see MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage#getPoolingParameters_Overhead()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<NFP_Duration> getOverhead();

} // PoolingParameters
