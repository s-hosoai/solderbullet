/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory;

import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Timing#getNotation <em>Notation</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Timing#getDescription <em>Description</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Timing#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getTiming()
 * @model
 * @generated
 */
public interface Timing extends EObject {
	/**
	 * Returns the value of the '<em><b>Notation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation</em>' containment reference.
	 * @see #setNotation(NFP_String)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getTiming_Notation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_String getNotation();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Timing#getNotation <em>Notation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notation</em>' containment reference.
	 * @see #getNotation()
	 * @generated
	 */
	void setNotation(NFP_String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(NFP_String)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getTiming_Description()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_String getDescription();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Timing#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(NFP_String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(NFP_Duration)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getTiming_Value()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getValue();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Timing#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(NFP_Duration value);

} // Timing
