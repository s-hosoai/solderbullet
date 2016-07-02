/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Peripheral Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.PeripheralActivity#getRegisterActions <em>Register Actions</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.HwPeripheralPackage#getPeripheralActivity()
 * @model
 * @generated
 */
public interface PeripheralActivity extends Activity {
	/**
	 * Returns the value of the '<em><b>Register Actions</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.RegisterAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register Actions</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.HwPeripheralPackage#getPeripheralActivity_RegisterActions()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.RegisterAction" containment="true"
	 * @generated
	 */
	EList getRegisterActions();

} // PeripheralActivity
