/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwPort#getPins <em>Pins</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage#getHwPort()
 * @model
 * @generated
 */
public interface HwPort extends HwEndPoint {
	/**
	 * Returns the value of the '<em><b>Pins</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pins</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage#getHwPort_Pins()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin"
	 * @generated
	 */
	EList getPins();

} // HwPort
