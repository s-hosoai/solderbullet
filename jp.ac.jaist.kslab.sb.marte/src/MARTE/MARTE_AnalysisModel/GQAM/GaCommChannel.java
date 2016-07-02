/**
 */
package MARTE.MARTE_AnalysisModel.GQAM;

import MARTE.MARTE_Foundations.GRM.SchedulableResource;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ga Comm Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaCommChannel#getPacketSize <em>Packet Size</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.GQAM.GaCommChannel#getUtlization <em>Utlization</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaCommChannel()
 * @model
 * @generated
 */
public interface GaCommChannel extends SchedulableResource {
	/**
	 * Returns the value of the '<em><b>Packet Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet Size</em>' containment reference.
	 * @see #setPacketSize(NFP_DataSize)
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaCommChannel_PacketSize()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_DataSize getPacketSize();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.GQAM.GaCommChannel#getPacketSize <em>Packet Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Size</em>' containment reference.
	 * @see #getPacketSize()
	 * @generated
	 */
	void setPacketSize(NFP_DataSize value);

	/**
	 * Returns the value of the '<em><b>Utlization</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Real}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utlization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utlization</em>' containment reference list.
	 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getGaCommChannel_Utlization()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Real" containment="true" ordered="false"
	 * @generated
	 */
	EList getUtlization();

} // GaCommChannel
