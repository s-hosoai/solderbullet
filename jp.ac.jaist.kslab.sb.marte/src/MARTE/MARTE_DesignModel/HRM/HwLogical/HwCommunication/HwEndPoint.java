/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication;

import MARTE.MARTE_Foundations.GRM.CommunicationEndPoint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw End Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwEndPoint#getConnectedTo <em>Connected To</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage#getHwEndPoint()
 * @model
 * @generated
 */
public interface HwEndPoint extends HwCommunicationResource, CommunicationEndPoint {
	/**
	 * Returns the value of the '<em><b>Connected To</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected To</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage#getHwEndPoint_ConnectedTo()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia" ordered="false"
	 * @generated
	 */
	EList getConnectedTo();

} // HwEndPoint
