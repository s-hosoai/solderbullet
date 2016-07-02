/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication;

import MARTE_Library.BasicNFP_Types.NFP_Boolean;
import MARTE_Library.BasicNFP_Types.NFP_DataSize;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBus#getAdressWidth <em>Adress Width</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBus#getWordWidth <em>Word Width</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBus#getIsSynchronous <em>Is Synchronous</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBus#getIsSerial <em>Is Serial</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage#getHwBus()
 * @model
 * @generated
 */
public interface HwBus extends HwMedia {
	/**
	 * Returns the value of the '<em><b>Adress Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adress Width</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adress Width</em>' containment reference.
	 * @see #setAdressWidth(NFP_DataSize)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage#getHwBus_AdressWidth()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_DataSize getAdressWidth();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBus#getAdressWidth <em>Adress Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adress Width</em>' containment reference.
	 * @see #getAdressWidth()
	 * @generated
	 */
	void setAdressWidth(NFP_DataSize value);

	/**
	 * Returns the value of the '<em><b>Word Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Word Width</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Word Width</em>' containment reference.
	 * @see #setWordWidth(NFP_DataSize)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage#getHwBus_WordWidth()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_DataSize getWordWidth();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBus#getWordWidth <em>Word Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Word Width</em>' containment reference.
	 * @see #getWordWidth()
	 * @generated
	 */
	void setWordWidth(NFP_DataSize value);

	/**
	 * Returns the value of the '<em><b>Is Synchronous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Synchronous</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Synchronous</em>' containment reference.
	 * @see #setIsSynchronous(NFP_Boolean)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage#getHwBus_IsSynchronous()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Boolean getIsSynchronous();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBus#getIsSynchronous <em>Is Synchronous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Synchronous</em>' containment reference.
	 * @see #getIsSynchronous()
	 * @generated
	 */
	void setIsSynchronous(NFP_Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Serial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Serial</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Serial</em>' containment reference.
	 * @see #setIsSerial(NFP_Boolean)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage#getHwBus_IsSerial()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Boolean getIsSerial();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBus#getIsSerial <em>Is Serial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Serial</em>' containment reference.
	 * @see #getIsSerial()
	 * @generated
	 */
	void setIsSerial(NFP_Boolean value);

} // HwBus
