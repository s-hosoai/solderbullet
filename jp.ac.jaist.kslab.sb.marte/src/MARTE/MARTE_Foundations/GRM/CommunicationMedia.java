/**
 */
package MARTE.MARTE_Foundations.GRM;

import MARTE_Library.BasicNFP_Types.NFP_Integer;

import MARTE_Library.MARTE_DataTypes.TransmModeKind;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Connector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.CommunicationMedia#getElementSize <em>Element Size</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.CommunicationMedia#getBase_Connector <em>Base Connector</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.CommunicationMedia#getTransmMode <em>Transm Mode</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.CommunicationMedia#getBlockT <em>Block T</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.CommunicationMedia#getPacketT <em>Packet T</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.CommunicationMedia#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getCommunicationMedia()
 * @model
 * @generated
 */
public interface CommunicationMedia extends ProcessingResource {
	/**
	 * Returns the value of the '<em><b>Element Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Size</em>' containment reference.
	 * @see #setElementSize(NFP_Integer)
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getCommunicationMedia_ElementSize()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Integer getElementSize();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.GRM.CommunicationMedia#getElementSize <em>Element Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Size</em>' containment reference.
	 * @see #getElementSize()
	 * @generated
	 */
	void setElementSize(NFP_Integer value);

	/**
	 * Returns the value of the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Connector</em>' reference.
	 * @see #setBase_Connector(Connector)
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getCommunicationMedia_Base_Connector()
	 * @model ordered="false"
	 * @generated
	 */
	Connector getBase_Connector();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.GRM.CommunicationMedia#getBase_Connector <em>Base Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Connector</em>' reference.
	 * @see #getBase_Connector()
	 * @generated
	 */
	void setBase_Connector(Connector value);

	/**
	 * Returns the value of the '<em><b>Transm Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE_Library.MARTE_DataTypes.TransmModeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transm Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transm Mode</em>' attribute.
	 * @see MARTE_Library.MARTE_DataTypes.TransmModeKind
	 * @see #setTransmMode(TransmModeKind)
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getCommunicationMedia_TransmMode()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	TransmModeKind getTransmMode();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.GRM.CommunicationMedia#getTransmMode <em>Transm Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transm Mode</em>' attribute.
	 * @see MARTE_Library.MARTE_DataTypes.TransmModeKind
	 * @see #getTransmMode()
	 * @generated
	 */
	void setTransmMode(TransmModeKind value);

	/**
	 * Returns the value of the '<em><b>Block T</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block T</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block T</em>' containment reference list.
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getCommunicationMedia_BlockT()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Duration" containment="true" ordered="false"
	 * @generated
	 */
	EList getBlockT();

	/**
	 * Returns the value of the '<em><b>Packet T</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet T</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet T</em>' containment reference list.
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getCommunicationMedia_PacketT()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Duration" containment="true" ordered="false"
	 * @generated
	 */
	EList getPacketT();

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_DataTxRate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' containment reference list.
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getCommunicationMedia_Capacity()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_DataTxRate" containment="true" ordered="false"
	 * @generated
	 */
	EList getCapacity();

} // CommunicationMedia
