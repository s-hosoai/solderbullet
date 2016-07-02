/**
 * <copyright>
 * </copyright>
 *

 */
package jp.ac.jaist.kslab.sb.marte.spec.specDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslFactory
 * @model kind="package"
 * @generated
 */
public interface SpecDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "specDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.jp/jaist/kslab/sb/marte/spec/SpecDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "specDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SpecDslPackage eINSTANCE = jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl.init();

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.ModelImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DatasheetImpl <em>Datasheet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DatasheetImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDatasheet()
   * @generated
   */
  int DATASHEET = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASHEET__NAME = MODEL__NAME;

  /**
   * The feature id for the '<em><b>Revision</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASHEET__REVISION = MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASHEET__IMPORTS = MODEL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASHEET__COMPONENTS = MODEL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Datasheet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATASHEET_FEATURE_COUNT = MODEL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.ImportImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslProtocolImpl <em>Dsl Protocol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslProtocolImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslProtocol()
   * @generated
   */
  int DSL_PROTOCOL = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_PROTOCOL__NAME = MODEL__NAME;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_PROTOCOL__OPERATIONS = MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dsl Protocol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_PROTOCOL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslOperationImpl <em>Dsl Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslOperationImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslOperation()
   * @generated
   */
  int DSL_OPERATION = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_OPERATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_OPERATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Param Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_OPERATION__PARAM_TYPE = 2;

  /**
   * The feature id for the '<em><b>Paramname</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_OPERATION__PARAMNAME = 3;

  /**
   * The number of structural features of the '<em>Dsl Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_OPERATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslComponentImpl <em>Dsl Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslComponentImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslComponent()
   * @generated
   */
  int DSL_COMPONENT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_COMPONENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Pins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_COMPONENT__PINS = 1;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_COMPONENT__PORTS = 2;

  /**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_COMPONENT__PACKAGES = 3;

  /**
   * The number of structural features of the '<em>Dsl Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_COMPONENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslMcuImpl <em>Dsl Mcu</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslMcuImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslMcu()
   * @generated
   */
  int DSL_MCU = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_MCU__NAME = DSL_COMPONENT__NAME;

  /**
   * The feature id for the '<em><b>Pins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_MCU__PINS = DSL_COMPONENT__PINS;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_MCU__PORTS = DSL_COMPONENT__PORTS;

  /**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_MCU__PACKAGES = DSL_COMPONENT__PACKAGES;

  /**
   * The feature id for the '<em><b>Peripherals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_MCU__PERIPHERALS = DSL_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sfr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_MCU__SFR = DSL_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Dsl Mcu</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_MCU_FEATURE_COUNT = DSL_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslDeviceImpl <em>Dsl Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslDeviceImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslDevice()
   * @generated
   */
  int DSL_DEVICE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_DEVICE__NAME = DSL_COMPONENT__NAME;

  /**
   * The feature id for the '<em><b>Pins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_DEVICE__PINS = DSL_COMPONENT__PINS;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_DEVICE__PORTS = DSL_COMPONENT__PORTS;

  /**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_DEVICE__PACKAGES = DSL_COMPONENT__PACKAGES;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_DEVICE__FUNCTIONS = DSL_COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Registers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_DEVICE__REGISTERS = DSL_COMPONENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Dsl Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_DEVICE_FEATURE_COUNT = DSL_COMPONENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPortImpl <em>Dsl Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPortImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslPort()
   * @generated
   */
  int DSL_PORT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_PORT__NAME = 0;

  /**
   * The feature id for the '<em><b>Pins</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_PORT__PINS = 1;

  /**
   * The number of structural features of the '<em>Dsl Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_PORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPinImpl <em>Dsl Pin</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPinImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslPin()
   * @generated
   */
  int DSL_PIN = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_PIN__NAME = 0;

  /**
   * The number of structural features of the '<em>Dsl Pin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_PIN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslRegisterImpl <em>Dsl Register</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslRegisterImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslRegister()
   * @generated
   */
  int DSL_REGISTER = 10;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_REGISTER__ADDRESS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_REGISTER__NAME = 1;

  /**
   * The feature id for the '<em><b>Bits</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_REGISTER__BITS = 2;

  /**
   * The number of structural features of the '<em>Dsl Register</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_REGISTER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslBitImpl <em>Dsl Bit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslBitImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslBit()
   * @generated
   */
  int DSL_BIT = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_BIT__NAME = 0;

  /**
   * The number of structural features of the '<em>Dsl Bit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_BIT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPackageImpl <em>Dsl Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPackageImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslPackage()
   * @generated
   */
  int DSL_PACKAGE = 12;

  /**
   * The feature id for the '<em><b>Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_PACKAGE__NAMES = 0;

  /**
   * The feature id for the '<em><b>Pins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_PACKAGE__PINS = 1;

  /**
   * The number of structural features of the '<em>Dsl Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_PACKAGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPackagePinImpl <em>Dsl Package Pin</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPackagePinImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslPackagePin()
   * @generated
   */
  int DSL_PACKAGE_PIN = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_PACKAGE_PIN__NAME = 0;

  /**
   * The feature id for the '<em><b>Pin No</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_PACKAGE_PIN__PIN_NO = 1;

  /**
   * The feature id for the '<em><b>Alt Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_PACKAGE_PIN__ALT_NAMES = 2;

  /**
   * The number of structural features of the '<em>Dsl Package Pin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_PACKAGE_PIN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPeripheralImpl <em>Dsl Peripheral</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPeripheralImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslPeripheral()
   * @generated
   */
  int DSL_PERIPHERAL = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_PERIPHERAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Compliant</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_PERIPHERAL__COMPLIANT = 1;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_PERIPHERAL__OPERATIONS = 2;

  /**
   * The number of structural features of the '<em>Dsl Peripheral</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_PERIPHERAL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslOperationImplImpl <em>Dsl Operation Impl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslOperationImplImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslOperationImpl()
   * @generated
   */
  int DSL_OPERATION_IMPL = 15;

  /**
   * The feature id for the '<em><b>Rettype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_OPERATION_IMPL__RETTYPE = 0;

  /**
   * The feature id for the '<em><b>Impl Operation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_OPERATION_IMPL__IMPL_OPERATION = 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_OPERATION_IMPL__PARAMS = 2;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_OPERATION_IMPL__EXPRESSION = 3;

  /**
   * The number of structural features of the '<em>Dsl Operation Impl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_OPERATION_IMPL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPeripheralExpressionImpl <em>Dsl Peripheral Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPeripheralExpressionImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslPeripheralExpression()
   * @generated
   */
  int DSL_PERIPHERAL_EXPRESSION = 16;

  /**
   * The number of structural features of the '<em>Dsl Peripheral Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_PERIPHERAL_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslExpressionImpl <em>Dsl Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslExpressionImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslExpression()
   * @generated
   */
  int DSL_EXPRESSION = 28;

  /**
   * The number of structural features of the '<em>Dsl Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_FEATURE_COUNT = DSL_PERIPHERAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslRegisterReadImpl <em>Dsl Register Read</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslRegisterReadImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslRegisterRead()
   * @generated
   */
  int DSL_REGISTER_READ = 17;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_REGISTER_READ__REF = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_REGISTER_READ__VAR = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Dsl Register Read</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_REGISTER_READ_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslRegisterWriteImpl <em>Dsl Register Write</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslRegisterWriteImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslRegisterWrite()
   * @generated
   */
  int DSL_REGISTER_WRITE = 18;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_REGISTER_WRITE__REF = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_REGISTER_WRITE__VAR = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Dsl Register Write</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_REGISTER_WRITE_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslValueImpl <em>Dsl Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslValueImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslValue()
   * @generated
   */
  int DSL_VALUE = 19;

  /**
   * The number of structural features of the '<em>Dsl Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslRefVariableImpl <em>Dsl Ref Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslRefVariableImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslRefVariable()
   * @generated
   */
  int DSL_REF_VARIABLE = 20;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_REF_VARIABLE__REF = 0;

  /**
   * The number of structural features of the '<em>Dsl Ref Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_REF_VARIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslFunctionImpl <em>Dsl Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslFunctionImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslFunction()
   * @generated
   */
  int DSL_FUNCTION = 21;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_FUNCTION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_FUNCTION__NAME = 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_FUNCTION__PARAMS = 2;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_FUNCTION__EXPRESSIONS = 3;

  /**
   * The number of structural features of the '<em>Dsl Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_FUNCTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslTypedParameterImpl <em>Dsl Typed Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslTypedParameterImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslTypedParameter()
   * @generated
   */
  int DSL_TYPED_PARAMETER = 22;

  /**
   * The feature id for the '<em><b>Param Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_TYPED_PARAMETER__PARAM_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_TYPED_PARAMETER__NAME = 1;

  /**
   * The number of structural features of the '<em>Dsl Typed Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_TYPED_PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslCallFunctionImpl <em>Dsl Call Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslCallFunctionImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslCallFunction()
   * @generated
   */
  int DSL_CALL_FUNCTION = 23;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CALL_FUNCTION__VARIABLES = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CALL_FUNCTION__FUNCTION = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CALL_FUNCTION__PARAMS = DSL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Dsl Call Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CALL_FUNCTION_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslDefineVariableImpl <em>Dsl Define Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslDefineVariableImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslDefineVariable()
   * @generated
   */
  int DSL_DEFINE_VARIABLE = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_DEFINE_VARIABLE__NAME = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_DEFINE_VARIABLE__VAL = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Dsl Define Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_DEFINE_VARIABLE_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslReturnImpl <em>Dsl Return</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslReturnImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslReturn()
   * @generated
   */
  int DSL_RETURN = 25;

  /**
   * The feature id for the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_RETURN__VAL = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dsl Return</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_RETURN_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslTypeImpl <em>Dsl Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslTypeImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslType()
   * @generated
   */
  int DSL_TYPE = 26;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Dsl Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslVariableImpl <em>Dsl Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslVariableImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslVariable()
   * @generated
   */
  int DSL_VARIABLE = 27;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_VARIABLE__VAR = 0;

  /**
   * The number of structural features of the '<em>Dsl Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_VARIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XBinaryExpressionImpl <em>XBinary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XBinaryExpressionImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXBinaryExpression()
   * @generated
   */
  int XBINARY_EXPRESSION = 29;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBINARY_EXPRESSION__LEFT = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBINARY_EXPRESSION__OP = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBINARY_EXPRESSION__RIGHT = DSL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>XBinary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBINARY_EXPRESSION_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XBlockExpressionImpl <em>XBlock Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XBlockExpressionImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXBlockExpression()
   * @generated
   */
  int XBLOCK_EXPRESSION = 30;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBLOCK_EXPRESSION__EXPRESSION = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XBlock Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBLOCK_EXPRESSION_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XPrimaryExpressionImpl <em>XPrimary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XPrimaryExpressionImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXPrimaryExpression()
   * @generated
   */
  int XPRIMARY_EXPRESSION = 31;

  /**
   * The number of structural features of the '<em>XPrimary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPRIMARY_EXPRESSION_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XConditionalExpressionImpl <em>XConditional Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XConditionalExpressionImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXConditionalExpression()
   * @generated
   */
  int XCONDITIONAL_EXPRESSION = 32;

  /**
   * The number of structural features of the '<em>XConditional Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCONDITIONAL_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XConditionalBlockExpressionImpl <em>XConditional Block Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XConditionalBlockExpressionImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXConditionalBlockExpression()
   * @generated
   */
  int XCONDITIONAL_BLOCK_EXPRESSION = 33;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCONDITIONAL_BLOCK_EXPRESSION__EXPRESSION = XCONDITIONAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XConditional Block Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCONDITIONAL_BLOCK_EXPRESSION_FEATURE_COUNT = XCONDITIONAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XConditionalUnaryExpressionImpl <em>XConditional Unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XConditionalUnaryExpressionImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXConditionalUnaryExpression()
   * @generated
   */
  int XCONDITIONAL_UNARY_EXPRESSION = 34;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCONDITIONAL_UNARY_EXPRESSION__EXPRESSION = XCONDITIONAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XConditional Unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCONDITIONAL_UNARY_EXPRESSION_FEATURE_COUNT = XCONDITIONAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XBoolExpressionImpl <em>XBool Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XBoolExpressionImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXBoolExpression()
   * @generated
   */
  int XBOOL_EXPRESSION = 35;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBOOL_EXPRESSION__LEFT = XCONDITIONAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBOOL_EXPRESSION__OP = XCONDITIONAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBOOL_EXPRESSION__RIGHT = XCONDITIONAL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>XBool Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBOOL_EXPRESSION_FEATURE_COUNT = XCONDITIONAL_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XBoolTypeImpl <em>XBool Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XBoolTypeImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXBoolType()
   * @generated
   */
  int XBOOL_TYPE = 36;

  /**
   * The number of structural features of the '<em>XBool Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBOOL_TYPE_FEATURE_COUNT = DSL_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XBitAccessImpl <em>XBit Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XBitAccessImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXBitAccess()
   * @generated
   */
  int XBIT_ACCESS = 37;

  /**
   * The feature id for the '<em><b>Bit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBIT_ACCESS__BIT = XBOOL_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XBit Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBIT_ACCESS_FEATURE_COUNT = XBOOL_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XRegisterAccessImpl <em>XRegister Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XRegisterAccessImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXRegisterAccess()
   * @generated
   */
  int XREGISTER_ACCESS = 38;

  /**
   * The feature id for the '<em><b>Reg</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XREGISTER_ACCESS__REG = XBOOL_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XRegister Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XREGISTER_ACCESS_FEATURE_COUNT = XBOOL_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XVariableAccessImpl <em>XVariable Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XVariableAccessImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXVariableAccess()
   * @generated
   */
  int XVARIABLE_ACCESS = 39;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XVARIABLE_ACCESS__VAR = XBOOL_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XVariable Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XVARIABLE_ACCESS_FEATURE_COUNT = XBOOL_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XParamVariableAccessImpl <em>XParam Variable Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XParamVariableAccessImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXParamVariableAccess()
   * @generated
   */
  int XPARAM_VARIABLE_ACCESS = 40;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPARAM_VARIABLE_ACCESS__VAR = XBOOL_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XParam Variable Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPARAM_VARIABLE_ACCESS_FEATURE_COUNT = XBOOL_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XIfExpressionImpl <em>XIf Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XIfExpressionImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXIfExpression()
   * @generated
   */
  int XIF_EXPRESSION = 41;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XIF_EXPRESSION__IF = XPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XIF_EXPRESSION__THEN = XPRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XIF_EXPRESSION__ELSE = XPRIMARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>XIf Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XIF_EXPRESSION_FEATURE_COUNT = XPRIMARY_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XWhileExpressionImpl <em>XWhile Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XWhileExpressionImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXWhileExpression()
   * @generated
   */
  int XWHILE_EXPRESSION = 42;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XWHILE_EXPRESSION__PREDICATE = XPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XWHILE_EXPRESSION__BODY = XPRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>XWhile Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XWHILE_EXPRESSION_FEATURE_COUNT = XPRIMARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XForExpressionImpl <em>XFor Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XForExpressionImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXForExpression()
   * @generated
   */
  int XFOR_EXPRESSION = 43;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XFOR_EXPRESSION__INIT = XPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XFOR_EXPRESSION__PREDICATE = XPRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Loop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XFOR_EXPRESSION__LOOP = XPRIMARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XFOR_EXPRESSION__BODY = XPRIMARY_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>XFor Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XFOR_EXPRESSION_FEATURE_COUNT = XPRIMARY_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XDoWhileExpressionImpl <em>XDo While Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XDoWhileExpressionImpl
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXDoWhileExpression()
   * @generated
   */
  int XDO_WHILE_EXPRESSION = 44;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDO_WHILE_EXPRESSION__BODY = XPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDO_WHILE_EXPRESSION__PREDICATE = XPRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>XDo While Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDO_WHILE_EXPRESSION_FEATURE_COUNT = XPRIMARY_EXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.Datasheet <em>Datasheet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datasheet</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.Datasheet
   * @generated
   */
  EClass getDatasheet();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.Datasheet#getRevision <em>Revision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Revision</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.Datasheet#getRevision()
   * @see #getDatasheet()
   * @generated
   */
  EAttribute getDatasheet_Revision();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.Datasheet#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.Datasheet#getImports()
   * @see #getDatasheet()
   * @generated
   */
  EReference getDatasheet_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.Datasheet#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.Datasheet#getComponents()
   * @see #getDatasheet()
   * @generated
   */
  EReference getDatasheet_Components();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslProtocol <em>Dsl Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Protocol</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslProtocol
   * @generated
   */
  EClass getDslProtocol();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslProtocol#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslProtocol#getOperations()
   * @see #getDslProtocol()
   * @generated
   */
  EReference getDslProtocol_Operations();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperation <em>Dsl Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Operation</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperation
   * @generated
   */
  EClass getDslOperation();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperation#getType()
   * @see #getDslOperation()
   * @generated
   */
  EReference getDslOperation_Type();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperation#getName()
   * @see #getDslOperation()
   * @generated
   */
  EAttribute getDslOperation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperation#getParamType <em>Param Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Param Type</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperation#getParamType()
   * @see #getDslOperation()
   * @generated
   */
  EReference getDslOperation_ParamType();

  /**
   * Returns the meta object for the attribute list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperation#getParamname <em>Paramname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Paramname</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperation#getParamname()
   * @see #getDslOperation()
   * @generated
   */
  EAttribute getDslOperation_Paramname();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslComponent <em>Dsl Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Component</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslComponent
   * @generated
   */
  EClass getDslComponent();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslComponent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslComponent#getName()
   * @see #getDslComponent()
   * @generated
   */
  EAttribute getDslComponent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslComponent#getPins <em>Pins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pins</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslComponent#getPins()
   * @see #getDslComponent()
   * @generated
   */
  EReference getDslComponent_Pins();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslComponent#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ports</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslComponent#getPorts()
   * @see #getDslComponent()
   * @generated
   */
  EReference getDslComponent_Ports();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslComponent#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packages</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslComponent#getPackages()
   * @see #getDslComponent()
   * @generated
   */
  EReference getDslComponent_Packages();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslMcu <em>Dsl Mcu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Mcu</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslMcu
   * @generated
   */
  EClass getDslMcu();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslMcu#getPeripherals <em>Peripherals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Peripherals</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslMcu#getPeripherals()
   * @see #getDslMcu()
   * @generated
   */
  EReference getDslMcu_Peripherals();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslMcu#getSfr <em>Sfr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sfr</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslMcu#getSfr()
   * @see #getDslMcu()
   * @generated
   */
  EReference getDslMcu_Sfr();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslDevice <em>Dsl Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Device</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslDevice
   * @generated
   */
  EClass getDslDevice();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslDevice#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslDevice#getFunctions()
   * @see #getDslDevice()
   * @generated
   */
  EReference getDslDevice_Functions();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslDevice#getRegisters <em>Registers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Registers</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslDevice#getRegisters()
   * @see #getDslDevice()
   * @generated
   */
  EReference getDslDevice_Registers();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPort <em>Dsl Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Port</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPort
   * @generated
   */
  EClass getDslPort();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPort#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPort#getName()
   * @see #getDslPort()
   * @generated
   */
  EAttribute getDslPort_Name();

  /**
   * Returns the meta object for the reference list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPort#getPins <em>Pins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Pins</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPort#getPins()
   * @see #getDslPort()
   * @generated
   */
  EReference getDslPort_Pins();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPin <em>Dsl Pin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Pin</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPin
   * @generated
   */
  EClass getDslPin();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPin#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPin#getName()
   * @see #getDslPin()
   * @generated
   */
  EAttribute getDslPin_Name();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegister <em>Dsl Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Register</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegister
   * @generated
   */
  EClass getDslRegister();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegister#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegister#getAddress()
   * @see #getDslRegister()
   * @generated
   */
  EAttribute getDslRegister_Address();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegister#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegister#getName()
   * @see #getDslRegister()
   * @generated
   */
  EAttribute getDslRegister_Name();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegister#getBits <em>Bits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bits</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegister#getBits()
   * @see #getDslRegister()
   * @generated
   */
  EReference getDslRegister_Bits();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslBit <em>Dsl Bit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Bit</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslBit
   * @generated
   */
  EClass getDslBit();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslBit#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslBit#getName()
   * @see #getDslBit()
   * @generated
   */
  EAttribute getDslBit_Name();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackage <em>Dsl Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Package</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackage
   * @generated
   */
  EClass getDslPackage();

  /**
   * Returns the meta object for the attribute list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackage#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Names</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackage#getNames()
   * @see #getDslPackage()
   * @generated
   */
  EAttribute getDslPackage_Names();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackage#getPins <em>Pins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pins</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackage#getPins()
   * @see #getDslPackage()
   * @generated
   */
  EReference getDslPackage_Pins();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackagePin <em>Dsl Package Pin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Package Pin</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackagePin
   * @generated
   */
  EClass getDslPackagePin();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackagePin#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackagePin#getName()
   * @see #getDslPackagePin()
   * @generated
   */
  EAttribute getDslPackagePin_Name();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackagePin#getPinNo <em>Pin No</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pin No</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackagePin#getPinNo()
   * @see #getDslPackagePin()
   * @generated
   */
  EAttribute getDslPackagePin_PinNo();

  /**
   * Returns the meta object for the attribute list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackagePin#getAltNames <em>Alt Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Alt Names</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackagePin#getAltNames()
   * @see #getDslPackagePin()
   * @generated
   */
  EAttribute getDslPackagePin_AltNames();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPeripheral <em>Dsl Peripheral</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Peripheral</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPeripheral
   * @generated
   */
  EClass getDslPeripheral();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPeripheral#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPeripheral#getName()
   * @see #getDslPeripheral()
   * @generated
   */
  EAttribute getDslPeripheral_Name();

  /**
   * Returns the meta object for the reference list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPeripheral#getCompliant <em>Compliant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Compliant</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPeripheral#getCompliant()
   * @see #getDslPeripheral()
   * @generated
   */
  EReference getDslPeripheral_Compliant();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPeripheral#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPeripheral#getOperations()
   * @see #getDslPeripheral()
   * @generated
   */
  EReference getDslPeripheral_Operations();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperationImpl <em>Dsl Operation Impl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Operation Impl</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperationImpl
   * @generated
   */
  EClass getDslOperationImpl();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperationImpl#getRettype <em>Rettype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rettype</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperationImpl#getRettype()
   * @see #getDslOperationImpl()
   * @generated
   */
  EReference getDslOperationImpl_Rettype();

  /**
   * Returns the meta object for the reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperationImpl#getImplOperation <em>Impl Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Impl Operation</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperationImpl#getImplOperation()
   * @see #getDslOperationImpl()
   * @generated
   */
  EReference getDslOperationImpl_ImplOperation();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperationImpl#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperationImpl#getParams()
   * @see #getDslOperationImpl()
   * @generated
   */
  EReference getDslOperationImpl_Params();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperationImpl#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperationImpl#getExpression()
   * @see #getDslOperationImpl()
   * @generated
   */
  EReference getDslOperationImpl_Expression();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPeripheralExpression <em>Dsl Peripheral Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Peripheral Expression</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPeripheralExpression
   * @generated
   */
  EClass getDslPeripheralExpression();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegisterRead <em>Dsl Register Read</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Register Read</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegisterRead
   * @generated
   */
  EClass getDslRegisterRead();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegisterRead#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegisterRead#getRef()
   * @see #getDslRegisterRead()
   * @generated
   */
  EReference getDslRegisterRead_Ref();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegisterRead#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegisterRead#getVar()
   * @see #getDslRegisterRead()
   * @generated
   */
  EReference getDslRegisterRead_Var();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegisterWrite <em>Dsl Register Write</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Register Write</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegisterWrite
   * @generated
   */
  EClass getDslRegisterWrite();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegisterWrite#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegisterWrite#getRef()
   * @see #getDslRegisterWrite()
   * @generated
   */
  EReference getDslRegisterWrite_Ref();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegisterWrite#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegisterWrite#getVar()
   * @see #getDslRegisterWrite()
   * @generated
   */
  EReference getDslRegisterWrite_Var();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslValue <em>Dsl Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Value</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslValue
   * @generated
   */
  EClass getDslValue();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRefVariable <em>Dsl Ref Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Ref Variable</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRefVariable
   * @generated
   */
  EClass getDslRefVariable();

  /**
   * Returns the meta object for the reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRefVariable#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRefVariable#getRef()
   * @see #getDslRefVariable()
   * @generated
   */
  EReference getDslRefVariable_Ref();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslFunction <em>Dsl Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Function</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslFunction
   * @generated
   */
  EClass getDslFunction();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslFunction#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslFunction#getType()
   * @see #getDslFunction()
   * @generated
   */
  EReference getDslFunction_Type();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslFunction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslFunction#getName()
   * @see #getDslFunction()
   * @generated
   */
  EAttribute getDslFunction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslFunction#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslFunction#getParams()
   * @see #getDslFunction()
   * @generated
   */
  EReference getDslFunction_Params();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslFunction#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslFunction#getExpressions()
   * @see #getDslFunction()
   * @generated
   */
  EReference getDslFunction_Expressions();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslTypedParameter <em>Dsl Typed Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Typed Parameter</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslTypedParameter
   * @generated
   */
  EClass getDslTypedParameter();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslTypedParameter#getParamType <em>Param Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Param Type</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslTypedParameter#getParamType()
   * @see #getDslTypedParameter()
   * @generated
   */
  EReference getDslTypedParameter_ParamType();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslTypedParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslTypedParameter#getName()
   * @see #getDslTypedParameter()
   * @generated
   */
  EAttribute getDslTypedParameter_Name();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslCallFunction <em>Dsl Call Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Call Function</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslCallFunction
   * @generated
   */
  EClass getDslCallFunction();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslCallFunction#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslCallFunction#getVariables()
   * @see #getDslCallFunction()
   * @generated
   */
  EReference getDslCallFunction_Variables();

  /**
   * Returns the meta object for the reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslCallFunction#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Function</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslCallFunction#getFunction()
   * @see #getDslCallFunction()
   * @generated
   */
  EReference getDslCallFunction_Function();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslCallFunction#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslCallFunction#getParams()
   * @see #getDslCallFunction()
   * @generated
   */
  EReference getDslCallFunction_Params();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslDefineVariable <em>Dsl Define Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Define Variable</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslDefineVariable
   * @generated
   */
  EClass getDslDefineVariable();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslDefineVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslDefineVariable#getName()
   * @see #getDslDefineVariable()
   * @generated
   */
  EAttribute getDslDefineVariable_Name();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslDefineVariable#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslDefineVariable#getVal()
   * @see #getDslDefineVariable()
   * @generated
   */
  EReference getDslDefineVariable_Val();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslReturn <em>Dsl Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Return</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslReturn
   * @generated
   */
  EClass getDslReturn();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslReturn#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslReturn#getVal()
   * @see #getDslReturn()
   * @generated
   */
  EReference getDslReturn_Val();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslType <em>Dsl Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Type</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslType
   * @generated
   */
  EClass getDslType();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslType#getType()
   * @see #getDslType()
   * @generated
   */
  EAttribute getDslType_Type();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslVariable <em>Dsl Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Variable</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslVariable
   * @generated
   */
  EClass getDslVariable();

  /**
   * Returns the meta object for the reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslVariable#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslVariable#getVar()
   * @see #getDslVariable()
   * @generated
   */
  EReference getDslVariable_Var();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslExpression <em>Dsl Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dsl Expression</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslExpression
   * @generated
   */
  EClass getDslExpression();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBinaryExpression <em>XBinary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XBinary Expression</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBinaryExpression
   * @generated
   */
  EClass getXBinaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBinaryExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBinaryExpression#getLeft()
   * @see #getXBinaryExpression()
   * @generated
   */
  EReference getXBinaryExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBinaryExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBinaryExpression#getOp()
   * @see #getXBinaryExpression()
   * @generated
   */
  EAttribute getXBinaryExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBinaryExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBinaryExpression#getRight()
   * @see #getXBinaryExpression()
   * @generated
   */
  EReference getXBinaryExpression_Right();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBlockExpression <em>XBlock Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XBlock Expression</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBlockExpression
   * @generated
   */
  EClass getXBlockExpression();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBlockExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBlockExpression#getExpression()
   * @see #getXBlockExpression()
   * @generated
   */
  EReference getXBlockExpression_Expression();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XPrimaryExpression <em>XPrimary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XPrimary Expression</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XPrimaryExpression
   * @generated
   */
  EClass getXPrimaryExpression();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalExpression <em>XConditional Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XConditional Expression</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalExpression
   * @generated
   */
  EClass getXConditionalExpression();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalBlockExpression <em>XConditional Block Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XConditional Block Expression</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalBlockExpression
   * @generated
   */
  EClass getXConditionalBlockExpression();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalBlockExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalBlockExpression#getExpression()
   * @see #getXConditionalBlockExpression()
   * @generated
   */
  EReference getXConditionalBlockExpression_Expression();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalUnaryExpression <em>XConditional Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XConditional Unary Expression</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalUnaryExpression
   * @generated
   */
  EClass getXConditionalUnaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalUnaryExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalUnaryExpression#getExpression()
   * @see #getXConditionalUnaryExpression()
   * @generated
   */
  EReference getXConditionalUnaryExpression_Expression();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBoolExpression <em>XBool Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XBool Expression</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBoolExpression
   * @generated
   */
  EClass getXBoolExpression();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBoolExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBoolExpression#getLeft()
   * @see #getXBoolExpression()
   * @generated
   */
  EReference getXBoolExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBoolExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBoolExpression#getOp()
   * @see #getXBoolExpression()
   * @generated
   */
  EAttribute getXBoolExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBoolExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBoolExpression#getRight()
   * @see #getXBoolExpression()
   * @generated
   */
  EReference getXBoolExpression_Right();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBoolType <em>XBool Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XBool Type</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBoolType
   * @generated
   */
  EClass getXBoolType();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBitAccess <em>XBit Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XBit Access</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBitAccess
   * @generated
   */
  EClass getXBitAccess();

  /**
   * Returns the meta object for the reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBitAccess#getBit <em>Bit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Bit</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBitAccess#getBit()
   * @see #getXBitAccess()
   * @generated
   */
  EReference getXBitAccess_Bit();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XRegisterAccess <em>XRegister Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XRegister Access</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XRegisterAccess
   * @generated
   */
  EClass getXRegisterAccess();

  /**
   * Returns the meta object for the reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XRegisterAccess#getReg <em>Reg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reg</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XRegisterAccess#getReg()
   * @see #getXRegisterAccess()
   * @generated
   */
  EReference getXRegisterAccess_Reg();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XVariableAccess <em>XVariable Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XVariable Access</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XVariableAccess
   * @generated
   */
  EClass getXVariableAccess();

  /**
   * Returns the meta object for the reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XVariableAccess#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XVariableAccess#getVar()
   * @see #getXVariableAccess()
   * @generated
   */
  EReference getXVariableAccess_Var();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XParamVariableAccess <em>XParam Variable Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XParam Variable Access</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XParamVariableAccess
   * @generated
   */
  EClass getXParamVariableAccess();

  /**
   * Returns the meta object for the reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XParamVariableAccess#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XParamVariableAccess#getVar()
   * @see #getXParamVariableAccess()
   * @generated
   */
  EReference getXParamVariableAccess_Var();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XIfExpression <em>XIf Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XIf Expression</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XIfExpression
   * @generated
   */
  EClass getXIfExpression();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XIfExpression#getIf <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XIfExpression#getIf()
   * @see #getXIfExpression()
   * @generated
   */
  EReference getXIfExpression_If();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XIfExpression#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XIfExpression#getThen()
   * @see #getXIfExpression()
   * @generated
   */
  EReference getXIfExpression_Then();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XIfExpression#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XIfExpression#getElse()
   * @see #getXIfExpression()
   * @generated
   */
  EReference getXIfExpression_Else();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XWhileExpression <em>XWhile Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XWhile Expression</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XWhileExpression
   * @generated
   */
  EClass getXWhileExpression();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XWhileExpression#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XWhileExpression#getPredicate()
   * @see #getXWhileExpression()
   * @generated
   */
  EReference getXWhileExpression_Predicate();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XWhileExpression#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XWhileExpression#getBody()
   * @see #getXWhileExpression()
   * @generated
   */
  EReference getXWhileExpression_Body();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XForExpression <em>XFor Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XFor Expression</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XForExpression
   * @generated
   */
  EClass getXForExpression();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XForExpression#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XForExpression#getInit()
   * @see #getXForExpression()
   * @generated
   */
  EReference getXForExpression_Init();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XForExpression#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XForExpression#getPredicate()
   * @see #getXForExpression()
   * @generated
   */
  EReference getXForExpression_Predicate();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XForExpression#getLoop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Loop</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XForExpression#getLoop()
   * @see #getXForExpression()
   * @generated
   */
  EReference getXForExpression_Loop();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XForExpression#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XForExpression#getBody()
   * @see #getXForExpression()
   * @generated
   */
  EReference getXForExpression_Body();

  /**
   * Returns the meta object for class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XDoWhileExpression <em>XDo While Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XDo While Expression</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XDoWhileExpression
   * @generated
   */
  EClass getXDoWhileExpression();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XDoWhileExpression#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XDoWhileExpression#getBody()
   * @see #getXDoWhileExpression()
   * @generated
   */
  EReference getXDoWhileExpression_Body();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XDoWhileExpression#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XDoWhileExpression#getPredicate()
   * @see #getXDoWhileExpression()
   * @generated
   */
  EReference getXDoWhileExpression_Predicate();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SpecDslFactory getSpecDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.ModelImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DatasheetImpl <em>Datasheet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DatasheetImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDatasheet()
     * @generated
     */
    EClass DATASHEET = eINSTANCE.getDatasheet();

    /**
     * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATASHEET__REVISION = eINSTANCE.getDatasheet_Revision();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATASHEET__IMPORTS = eINSTANCE.getDatasheet_Imports();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATASHEET__COMPONENTS = eINSTANCE.getDatasheet_Components();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.ImportImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslProtocolImpl <em>Dsl Protocol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslProtocolImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslProtocol()
     * @generated
     */
    EClass DSL_PROTOCOL = eINSTANCE.getDslProtocol();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_PROTOCOL__OPERATIONS = eINSTANCE.getDslProtocol_Operations();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslOperationImpl <em>Dsl Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslOperationImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslOperation()
     * @generated
     */
    EClass DSL_OPERATION = eINSTANCE.getDslOperation();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_OPERATION__TYPE = eINSTANCE.getDslOperation_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_OPERATION__NAME = eINSTANCE.getDslOperation_Name();

    /**
     * The meta object literal for the '<em><b>Param Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_OPERATION__PARAM_TYPE = eINSTANCE.getDslOperation_ParamType();

    /**
     * The meta object literal for the '<em><b>Paramname</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_OPERATION__PARAMNAME = eINSTANCE.getDslOperation_Paramname();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslComponentImpl <em>Dsl Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslComponentImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslComponent()
     * @generated
     */
    EClass DSL_COMPONENT = eINSTANCE.getDslComponent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_COMPONENT__NAME = eINSTANCE.getDslComponent_Name();

    /**
     * The meta object literal for the '<em><b>Pins</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_COMPONENT__PINS = eINSTANCE.getDslComponent_Pins();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_COMPONENT__PORTS = eINSTANCE.getDslComponent_Ports();

    /**
     * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_COMPONENT__PACKAGES = eINSTANCE.getDslComponent_Packages();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslMcuImpl <em>Dsl Mcu</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslMcuImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslMcu()
     * @generated
     */
    EClass DSL_MCU = eINSTANCE.getDslMcu();

    /**
     * The meta object literal for the '<em><b>Peripherals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_MCU__PERIPHERALS = eINSTANCE.getDslMcu_Peripherals();

    /**
     * The meta object literal for the '<em><b>Sfr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_MCU__SFR = eINSTANCE.getDslMcu_Sfr();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslDeviceImpl <em>Dsl Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslDeviceImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslDevice()
     * @generated
     */
    EClass DSL_DEVICE = eINSTANCE.getDslDevice();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_DEVICE__FUNCTIONS = eINSTANCE.getDslDevice_Functions();

    /**
     * The meta object literal for the '<em><b>Registers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_DEVICE__REGISTERS = eINSTANCE.getDslDevice_Registers();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPortImpl <em>Dsl Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPortImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslPort()
     * @generated
     */
    EClass DSL_PORT = eINSTANCE.getDslPort();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_PORT__NAME = eINSTANCE.getDslPort_Name();

    /**
     * The meta object literal for the '<em><b>Pins</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_PORT__PINS = eINSTANCE.getDslPort_Pins();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPinImpl <em>Dsl Pin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPinImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslPin()
     * @generated
     */
    EClass DSL_PIN = eINSTANCE.getDslPin();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_PIN__NAME = eINSTANCE.getDslPin_Name();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslRegisterImpl <em>Dsl Register</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslRegisterImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslRegister()
     * @generated
     */
    EClass DSL_REGISTER = eINSTANCE.getDslRegister();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_REGISTER__ADDRESS = eINSTANCE.getDslRegister_Address();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_REGISTER__NAME = eINSTANCE.getDslRegister_Name();

    /**
     * The meta object literal for the '<em><b>Bits</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_REGISTER__BITS = eINSTANCE.getDslRegister_Bits();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslBitImpl <em>Dsl Bit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslBitImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslBit()
     * @generated
     */
    EClass DSL_BIT = eINSTANCE.getDslBit();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_BIT__NAME = eINSTANCE.getDslBit_Name();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPackageImpl <em>Dsl Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPackageImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslPackage()
     * @generated
     */
    EClass DSL_PACKAGE = eINSTANCE.getDslPackage();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_PACKAGE__NAMES = eINSTANCE.getDslPackage_Names();

    /**
     * The meta object literal for the '<em><b>Pins</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_PACKAGE__PINS = eINSTANCE.getDslPackage_Pins();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPackagePinImpl <em>Dsl Package Pin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPackagePinImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslPackagePin()
     * @generated
     */
    EClass DSL_PACKAGE_PIN = eINSTANCE.getDslPackagePin();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_PACKAGE_PIN__NAME = eINSTANCE.getDslPackagePin_Name();

    /**
     * The meta object literal for the '<em><b>Pin No</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_PACKAGE_PIN__PIN_NO = eINSTANCE.getDslPackagePin_PinNo();

    /**
     * The meta object literal for the '<em><b>Alt Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_PACKAGE_PIN__ALT_NAMES = eINSTANCE.getDslPackagePin_AltNames();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPeripheralImpl <em>Dsl Peripheral</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPeripheralImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslPeripheral()
     * @generated
     */
    EClass DSL_PERIPHERAL = eINSTANCE.getDslPeripheral();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_PERIPHERAL__NAME = eINSTANCE.getDslPeripheral_Name();

    /**
     * The meta object literal for the '<em><b>Compliant</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_PERIPHERAL__COMPLIANT = eINSTANCE.getDslPeripheral_Compliant();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_PERIPHERAL__OPERATIONS = eINSTANCE.getDslPeripheral_Operations();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslOperationImplImpl <em>Dsl Operation Impl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslOperationImplImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslOperationImpl()
     * @generated
     */
    EClass DSL_OPERATION_IMPL = eINSTANCE.getDslOperationImpl();

    /**
     * The meta object literal for the '<em><b>Rettype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_OPERATION_IMPL__RETTYPE = eINSTANCE.getDslOperationImpl_Rettype();

    /**
     * The meta object literal for the '<em><b>Impl Operation</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_OPERATION_IMPL__IMPL_OPERATION = eINSTANCE.getDslOperationImpl_ImplOperation();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_OPERATION_IMPL__PARAMS = eINSTANCE.getDslOperationImpl_Params();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_OPERATION_IMPL__EXPRESSION = eINSTANCE.getDslOperationImpl_Expression();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPeripheralExpressionImpl <em>Dsl Peripheral Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPeripheralExpressionImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslPeripheralExpression()
     * @generated
     */
    EClass DSL_PERIPHERAL_EXPRESSION = eINSTANCE.getDslPeripheralExpression();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslRegisterReadImpl <em>Dsl Register Read</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslRegisterReadImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslRegisterRead()
     * @generated
     */
    EClass DSL_REGISTER_READ = eINSTANCE.getDslRegisterRead();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_REGISTER_READ__REF = eINSTANCE.getDslRegisterRead_Ref();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_REGISTER_READ__VAR = eINSTANCE.getDslRegisterRead_Var();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslRegisterWriteImpl <em>Dsl Register Write</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslRegisterWriteImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslRegisterWrite()
     * @generated
     */
    EClass DSL_REGISTER_WRITE = eINSTANCE.getDslRegisterWrite();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_REGISTER_WRITE__REF = eINSTANCE.getDslRegisterWrite_Ref();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_REGISTER_WRITE__VAR = eINSTANCE.getDslRegisterWrite_Var();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslValueImpl <em>Dsl Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslValueImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslValue()
     * @generated
     */
    EClass DSL_VALUE = eINSTANCE.getDslValue();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslRefVariableImpl <em>Dsl Ref Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslRefVariableImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslRefVariable()
     * @generated
     */
    EClass DSL_REF_VARIABLE = eINSTANCE.getDslRefVariable();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_REF_VARIABLE__REF = eINSTANCE.getDslRefVariable_Ref();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslFunctionImpl <em>Dsl Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslFunctionImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslFunction()
     * @generated
     */
    EClass DSL_FUNCTION = eINSTANCE.getDslFunction();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_FUNCTION__TYPE = eINSTANCE.getDslFunction_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_FUNCTION__NAME = eINSTANCE.getDslFunction_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_FUNCTION__PARAMS = eINSTANCE.getDslFunction_Params();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_FUNCTION__EXPRESSIONS = eINSTANCE.getDslFunction_Expressions();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslTypedParameterImpl <em>Dsl Typed Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslTypedParameterImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslTypedParameter()
     * @generated
     */
    EClass DSL_TYPED_PARAMETER = eINSTANCE.getDslTypedParameter();

    /**
     * The meta object literal for the '<em><b>Param Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_TYPED_PARAMETER__PARAM_TYPE = eINSTANCE.getDslTypedParameter_ParamType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_TYPED_PARAMETER__NAME = eINSTANCE.getDslTypedParameter_Name();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslCallFunctionImpl <em>Dsl Call Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslCallFunctionImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslCallFunction()
     * @generated
     */
    EClass DSL_CALL_FUNCTION = eINSTANCE.getDslCallFunction();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CALL_FUNCTION__VARIABLES = eINSTANCE.getDslCallFunction_Variables();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CALL_FUNCTION__FUNCTION = eINSTANCE.getDslCallFunction_Function();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CALL_FUNCTION__PARAMS = eINSTANCE.getDslCallFunction_Params();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslDefineVariableImpl <em>Dsl Define Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslDefineVariableImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslDefineVariable()
     * @generated
     */
    EClass DSL_DEFINE_VARIABLE = eINSTANCE.getDslDefineVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_DEFINE_VARIABLE__NAME = eINSTANCE.getDslDefineVariable_Name();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_DEFINE_VARIABLE__VAL = eINSTANCE.getDslDefineVariable_Val();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslReturnImpl <em>Dsl Return</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslReturnImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslReturn()
     * @generated
     */
    EClass DSL_RETURN = eINSTANCE.getDslReturn();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_RETURN__VAL = eINSTANCE.getDslReturn_Val();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslTypeImpl <em>Dsl Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslTypeImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslType()
     * @generated
     */
    EClass DSL_TYPE = eINSTANCE.getDslType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_TYPE__TYPE = eINSTANCE.getDslType_Type();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslVariableImpl <em>Dsl Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslVariableImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslVariable()
     * @generated
     */
    EClass DSL_VARIABLE = eINSTANCE.getDslVariable();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_VARIABLE__VAR = eINSTANCE.getDslVariable_Var();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslExpressionImpl <em>Dsl Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslExpressionImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getDslExpression()
     * @generated
     */
    EClass DSL_EXPRESSION = eINSTANCE.getDslExpression();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XBinaryExpressionImpl <em>XBinary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XBinaryExpressionImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXBinaryExpression()
     * @generated
     */
    EClass XBINARY_EXPRESSION = eINSTANCE.getXBinaryExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XBINARY_EXPRESSION__LEFT = eINSTANCE.getXBinaryExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XBINARY_EXPRESSION__OP = eINSTANCE.getXBinaryExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XBINARY_EXPRESSION__RIGHT = eINSTANCE.getXBinaryExpression_Right();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XBlockExpressionImpl <em>XBlock Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XBlockExpressionImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXBlockExpression()
     * @generated
     */
    EClass XBLOCK_EXPRESSION = eINSTANCE.getXBlockExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XBLOCK_EXPRESSION__EXPRESSION = eINSTANCE.getXBlockExpression_Expression();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XPrimaryExpressionImpl <em>XPrimary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XPrimaryExpressionImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXPrimaryExpression()
     * @generated
     */
    EClass XPRIMARY_EXPRESSION = eINSTANCE.getXPrimaryExpression();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XConditionalExpressionImpl <em>XConditional Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XConditionalExpressionImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXConditionalExpression()
     * @generated
     */
    EClass XCONDITIONAL_EXPRESSION = eINSTANCE.getXConditionalExpression();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XConditionalBlockExpressionImpl <em>XConditional Block Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XConditionalBlockExpressionImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXConditionalBlockExpression()
     * @generated
     */
    EClass XCONDITIONAL_BLOCK_EXPRESSION = eINSTANCE.getXConditionalBlockExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XCONDITIONAL_BLOCK_EXPRESSION__EXPRESSION = eINSTANCE.getXConditionalBlockExpression_Expression();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XConditionalUnaryExpressionImpl <em>XConditional Unary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XConditionalUnaryExpressionImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXConditionalUnaryExpression()
     * @generated
     */
    EClass XCONDITIONAL_UNARY_EXPRESSION = eINSTANCE.getXConditionalUnaryExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XCONDITIONAL_UNARY_EXPRESSION__EXPRESSION = eINSTANCE.getXConditionalUnaryExpression_Expression();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XBoolExpressionImpl <em>XBool Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XBoolExpressionImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXBoolExpression()
     * @generated
     */
    EClass XBOOL_EXPRESSION = eINSTANCE.getXBoolExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XBOOL_EXPRESSION__LEFT = eINSTANCE.getXBoolExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XBOOL_EXPRESSION__OP = eINSTANCE.getXBoolExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XBOOL_EXPRESSION__RIGHT = eINSTANCE.getXBoolExpression_Right();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XBoolTypeImpl <em>XBool Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XBoolTypeImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXBoolType()
     * @generated
     */
    EClass XBOOL_TYPE = eINSTANCE.getXBoolType();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XBitAccessImpl <em>XBit Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XBitAccessImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXBitAccess()
     * @generated
     */
    EClass XBIT_ACCESS = eINSTANCE.getXBitAccess();

    /**
     * The meta object literal for the '<em><b>Bit</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XBIT_ACCESS__BIT = eINSTANCE.getXBitAccess_Bit();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XRegisterAccessImpl <em>XRegister Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XRegisterAccessImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXRegisterAccess()
     * @generated
     */
    EClass XREGISTER_ACCESS = eINSTANCE.getXRegisterAccess();

    /**
     * The meta object literal for the '<em><b>Reg</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XREGISTER_ACCESS__REG = eINSTANCE.getXRegisterAccess_Reg();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XVariableAccessImpl <em>XVariable Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XVariableAccessImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXVariableAccess()
     * @generated
     */
    EClass XVARIABLE_ACCESS = eINSTANCE.getXVariableAccess();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XVARIABLE_ACCESS__VAR = eINSTANCE.getXVariableAccess_Var();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XParamVariableAccessImpl <em>XParam Variable Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XParamVariableAccessImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXParamVariableAccess()
     * @generated
     */
    EClass XPARAM_VARIABLE_ACCESS = eINSTANCE.getXParamVariableAccess();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPARAM_VARIABLE_ACCESS__VAR = eINSTANCE.getXParamVariableAccess_Var();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XIfExpressionImpl <em>XIf Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XIfExpressionImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXIfExpression()
     * @generated
     */
    EClass XIF_EXPRESSION = eINSTANCE.getXIfExpression();

    /**
     * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XIF_EXPRESSION__IF = eINSTANCE.getXIfExpression_If();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XIF_EXPRESSION__THEN = eINSTANCE.getXIfExpression_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XIF_EXPRESSION__ELSE = eINSTANCE.getXIfExpression_Else();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XWhileExpressionImpl <em>XWhile Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XWhileExpressionImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXWhileExpression()
     * @generated
     */
    EClass XWHILE_EXPRESSION = eINSTANCE.getXWhileExpression();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XWHILE_EXPRESSION__PREDICATE = eINSTANCE.getXWhileExpression_Predicate();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XWHILE_EXPRESSION__BODY = eINSTANCE.getXWhileExpression_Body();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XForExpressionImpl <em>XFor Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XForExpressionImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXForExpression()
     * @generated
     */
    EClass XFOR_EXPRESSION = eINSTANCE.getXForExpression();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XFOR_EXPRESSION__INIT = eINSTANCE.getXForExpression_Init();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XFOR_EXPRESSION__PREDICATE = eINSTANCE.getXForExpression_Predicate();

    /**
     * The meta object literal for the '<em><b>Loop</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XFOR_EXPRESSION__LOOP = eINSTANCE.getXForExpression_Loop();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XFOR_EXPRESSION__BODY = eINSTANCE.getXForExpression_Body();

    /**
     * The meta object literal for the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XDoWhileExpressionImpl <em>XDo While Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XDoWhileExpressionImpl
     * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslPackageImpl#getXDoWhileExpression()
     * @generated
     */
    EClass XDO_WHILE_EXPRESSION = eINSTANCE.getXDoWhileExpression();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XDO_WHILE_EXPRESSION__BODY = eINSTANCE.getXDoWhileExpression_Body();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XDO_WHILE_EXPRESSION__PREDICATE = eINSTANCE.getXDoWhileExpression_Predicate();

  }

} //SpecDslPackage
