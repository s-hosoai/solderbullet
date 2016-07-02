/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Peripheral</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral#getImplements <em>Implements</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral#getOperationimpls <em>Operationimpls</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral#getRefsfr <em>Refsfr</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral#getRefports <em>Refports</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral#getPeripheralActivities <em>Peripheral Activities</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage#getHwPeripheral()
 * @model
 * @generated
 */
public interface HwPeripheral extends HwDevice {
	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage#getHwPeripheral_Implements()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocol"
	 * @generated
	 */
	EList getImplements();

	/**
	 * Returns the value of the '<em><b>Operationimpls</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.OperationImpl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operationimpls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operationimpls</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage#getHwPeripheral_Operationimpls()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.OperationImpl" containment="true"
	 * @generated
	 */
	EList getOperationimpls();

	/**
	 * Returns the value of the '<em><b>Refsfr</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegister}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refsfr</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refsfr</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage#getHwPeripheral_Refsfr()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegister"
	 * @generated
	 */
	EList getRefsfr();

	/**
	 * Returns the value of the '<em><b>Refports</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refports</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage#getHwPeripheral_Refports()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwPort"
	 * @generated
	 */
	EList getRefports();

	/**
	 * Returns the value of the '<em><b>Peripheral Activities</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.PeripheralActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peripheral Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peripheral Activities</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage#getHwPeripheral_PeripheralActivities()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.PeripheralActivity" containment="true"
	 * @generated
	 */
	EList getPeripheralActivities();

} // HwPeripheral
