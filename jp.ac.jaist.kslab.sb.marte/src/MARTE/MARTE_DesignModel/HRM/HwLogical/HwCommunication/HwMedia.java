/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication;

import MARTE.MARTE_Foundations.GRM.CommunicationMedia;

import MARTE_Library.BasicNFP_Types.NFP_DataTxRate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia#getBandWidth <em>Band Width</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia#getArbiters <em>Arbiters</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage#getHwMedia()
 * @model
 * @generated
 */
public interface HwMedia extends CommunicationMedia, HwCommunicationResource {
	/**
	 * Returns the value of the '<em><b>Band Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Band Width</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Band Width</em>' containment reference.
	 * @see #setBandWidth(NFP_DataTxRate)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage#getHwMedia_BandWidth()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_DataTxRate getBandWidth();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia#getBandWidth <em>Band Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Band Width</em>' containment reference.
	 * @see #getBandWidth()
	 * @generated
	 */
	void setBandWidth(NFP_DataTxRate value);

	/**
	 * Returns the value of the '<em><b>Arbiters</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwArbiter}.
	 * It is bidirectional and its opposite is '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwArbiter#getControlledMedias <em>Controlled Medias</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arbiters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arbiters</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage#getHwMedia_Arbiters()
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwArbiter#getControlledMedias
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwArbiter" opposite="controlledMedias" ordered="false"
	 * @generated
	 */
	EList getArbiters();

} // HwMedia
