/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral;

import org.eclipse.uml2.uml.InputPin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Register Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.WriteRegisterAction#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.HwPeripheralPackage#getWriteRegisterAction()
 * @model
 * @generated
 */
public interface WriteRegisterAction extends RegisterAction {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(InputPin)
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.HwPeripheralPackage#getWriteRegisterAction_Value()
	 * @model containment="true"
	 * @generated
	 */
	InputPin getValue();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.WriteRegisterAction#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(InputPin value);

} // WriteRegisterAction
