/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Arbiter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwArbiter#getControlledMedias <em>Controlled Medias</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage#getHwArbiter()
 * @model
 * @generated
 */
public interface HwArbiter extends HwCommunicationResource {
	/**
	 * Returns the value of the '<em><b>Controlled Medias</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia}.
	 * It is bidirectional and its opposite is '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia#getArbiters <em>Arbiters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlled Medias</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlled Medias</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage#getHwArbiter_ControlledMedias()
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia#getArbiters
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia" opposite="arbiters" ordered="false"
	 * @generated
	 */
	EList getControlledMedias();

} // HwArbiter
