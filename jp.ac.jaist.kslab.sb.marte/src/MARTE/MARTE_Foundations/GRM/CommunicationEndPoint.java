/**
 */
package MARTE.MARTE_Foundations.GRM;

import MARTE_Library.BasicNFP_Types.NFP_Integer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication End Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.CommunicationEndPoint#getPacketSize <em>Packet Size</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getCommunicationEndPoint()
 * @model
 * @generated
 */
public interface CommunicationEndPoint extends Resource {
	/**
	 * Returns the value of the '<em><b>Packet Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet Size</em>' containment reference.
	 * @see #setPacketSize(NFP_Integer)
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getCommunicationEndPoint_PacketSize()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Integer getPacketSize();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.GRM.CommunicationEndPoint#getPacketSize <em>Packet Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Size</em>' containment reference.
	 * @see #getPacketSize()
	 * @generated
	 */
	void setPacketSize(NFP_Integer value);

} // CommunicationEndPoint
