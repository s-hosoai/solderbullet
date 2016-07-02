/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource;

import MARTE.MARTE_Foundations.GRM.DeviceResource;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice#getFunctions <em>Functions</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice#getCompliant <em>Compliant</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice#getPackages <em>Packages</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice#getPins <em>Pins</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice#getRegisters <em>Registers</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage#getHwDevice()
 * @model
 * @generated
 */
public interface HwDevice extends HwResource, DeviceResource {
	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDeviceFunction.HwDeviceFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage#getHwDevice_Functions()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDeviceFunction.HwDeviceFunction" containment="true"
	 * @generated
	 */
	EList getFunctions();

	/**
	 * Returns the value of the '<em><b>Compliant</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compliant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compliant</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage#getHwDevice_Compliant()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwProtocol.HwProtocol"
	 * @generated
	 */
	EList getCompliant();

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage#getHwDevice_Packages()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage" containment="true"
	 * @generated
	 */
	EList getPackages();

	/**
	 * Returns the value of the '<em><b>Pins</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pins</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage#getHwDevice_Pins()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin" containment="true"
	 * @generated
	 */
	EList getPins();

	/**
	 * Returns the value of the '<em><b>Registers</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegister}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registers</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage#getHwDevice_Registers()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegister" containment="true"
	 * @generated
	 */
	EList getRegisters();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage#getHwDevice_Ports()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwPort" containment="true"
	 * @generated
	 */
	EList getPorts();

} // HwDevice
