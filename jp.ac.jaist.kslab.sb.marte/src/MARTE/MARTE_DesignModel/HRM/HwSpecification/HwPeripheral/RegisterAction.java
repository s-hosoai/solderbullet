/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegister;

import org.eclipse.uml2.uml.Action;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Register Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.RegisterAction#getRegister <em>Register</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.HwPeripheralPackage#getRegisterAction()
 * @model abstract="true"
 * @generated
 */
public interface RegisterAction extends Action {
	/**
	 * Returns the value of the '<em><b>Register</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register</em>' reference.
	 * @see #setRegister(HwRegister)
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.HwPeripheralPackage#getRegisterAction_Register()
	 * @model
	 * @generated
	 */
	HwRegister getRegister();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.RegisterAction#getRegister <em>Register</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register</em>' reference.
	 * @see #getRegister()
	 * @generated
	 */
	void setRegister(HwRegister value);

} // RegisterAction
