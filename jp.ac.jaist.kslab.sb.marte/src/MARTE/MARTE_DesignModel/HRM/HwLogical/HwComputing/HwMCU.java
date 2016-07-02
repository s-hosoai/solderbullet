/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw MCU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU#getProcessor <em>Processor</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU#getPeripherals <em>Peripherals</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU#getSfr <em>Sfr</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU#getPackages <em>Packages</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU#getPins <em>Pins</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwMCU()
 * @model
 * @generated
 */
public interface HwMCU extends HwComputingResource {
	/**
	 * Returns the value of the '<em><b>Processor</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwMCU_Processor()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor" containment="true"
	 * @generated
	 */
	EList getProcessor();

	/**
	 * Returns the value of the '<em><b>Peripherals</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peripherals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peripherals</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwMCU_Peripherals()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwPeripheral" containment="true"
	 * @generated
	 */
	EList getPeripherals();

	/**
	 * Returns the value of the '<em><b>Sfr</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegister}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sfr</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sfr</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwMCU_Sfr()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.HwRegister" containment="true"
	 * @generated
	 */
	EList getSfr();

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
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwMCU_Packages()
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
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwMCU_Pins()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin" containment="true"
	 * @generated
	 */
	EList getPins();

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
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getHwMCU_Ports()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwPort" containment="true"
	 * @generated
	 */
	EList getPorts();

} // HwMCU
