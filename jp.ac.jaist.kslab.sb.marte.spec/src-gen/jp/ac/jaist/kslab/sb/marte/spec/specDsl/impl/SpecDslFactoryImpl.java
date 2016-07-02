/**
 * <copyright>
 * </copyright>
 *

 */
package jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl;

import jp.ac.jaist.kslab.sb.marte.spec.specDsl.Datasheet;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslBit;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslCallFunction;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslComponent;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslDefineVariable;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslDevice;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslExpression;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslFunction;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslMcu;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperation;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackage;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackagePin;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPeripheral;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPeripheralExpression;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPin;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPort;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslProtocol;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRefVariable;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegister;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegisterRead;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegisterWrite;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslReturn;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslType;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslTypedParameter;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslValue;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslVariable;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.Import;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.Model;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslFactory;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBinaryExpression;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBitAccess;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBlockExpression;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBoolExpression;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBoolType;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalBlockExpression;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalExpression;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalUnaryExpression;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XDoWhileExpression;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XForExpression;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XIfExpression;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XParamVariableAccess;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XPrimaryExpression;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XRegisterAccess;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XVariableAccess;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XWhileExpression;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecDslFactoryImpl extends EFactoryImpl implements SpecDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SpecDslFactory init()
  {
    try
    {
      SpecDslFactory theSpecDslFactory = (SpecDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ac.jp/jaist/kslab/sb/marte/spec/SpecDsl"); 
      if (theSpecDslFactory != null)
      {
        return theSpecDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SpecDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SpecDslPackage.MODEL: return createModel();
      case SpecDslPackage.DATASHEET: return createDatasheet();
      case SpecDslPackage.IMPORT: return createImport();
      case SpecDslPackage.DSL_PROTOCOL: return createDslProtocol();
      case SpecDslPackage.DSL_OPERATION: return createDslOperation();
      case SpecDslPackage.DSL_COMPONENT: return createDslComponent();
      case SpecDslPackage.DSL_MCU: return createDslMcu();
      case SpecDslPackage.DSL_DEVICE: return createDslDevice();
      case SpecDslPackage.DSL_PORT: return createDslPort();
      case SpecDslPackage.DSL_PIN: return createDslPin();
      case SpecDslPackage.DSL_REGISTER: return createDslRegister();
      case SpecDslPackage.DSL_BIT: return createDslBit();
      case SpecDslPackage.DSL_PACKAGE: return createDslPackage();
      case SpecDslPackage.DSL_PACKAGE_PIN: return createDslPackagePin();
      case SpecDslPackage.DSL_PERIPHERAL: return createDslPeripheral();
      case SpecDslPackage.DSL_OPERATION_IMPL: return createDslOperationImpl();
      case SpecDslPackage.DSL_PERIPHERAL_EXPRESSION: return createDslPeripheralExpression();
      case SpecDslPackage.DSL_REGISTER_READ: return createDslRegisterRead();
      case SpecDslPackage.DSL_REGISTER_WRITE: return createDslRegisterWrite();
      case SpecDslPackage.DSL_VALUE: return createDslValue();
      case SpecDslPackage.DSL_REF_VARIABLE: return createDslRefVariable();
      case SpecDslPackage.DSL_FUNCTION: return createDslFunction();
      case SpecDslPackage.DSL_TYPED_PARAMETER: return createDslTypedParameter();
      case SpecDslPackage.DSL_CALL_FUNCTION: return createDslCallFunction();
      case SpecDslPackage.DSL_DEFINE_VARIABLE: return createDslDefineVariable();
      case SpecDslPackage.DSL_RETURN: return createDslReturn();
      case SpecDslPackage.DSL_TYPE: return createDslType();
      case SpecDslPackage.DSL_VARIABLE: return createDslVariable();
      case SpecDslPackage.DSL_EXPRESSION: return createDslExpression();
      case SpecDslPackage.XBINARY_EXPRESSION: return createXBinaryExpression();
      case SpecDslPackage.XBLOCK_EXPRESSION: return createXBlockExpression();
      case SpecDslPackage.XPRIMARY_EXPRESSION: return createXPrimaryExpression();
      case SpecDslPackage.XCONDITIONAL_EXPRESSION: return createXConditionalExpression();
      case SpecDslPackage.XCONDITIONAL_BLOCK_EXPRESSION: return createXConditionalBlockExpression();
      case SpecDslPackage.XCONDITIONAL_UNARY_EXPRESSION: return createXConditionalUnaryExpression();
      case SpecDslPackage.XBOOL_EXPRESSION: return createXBoolExpression();
      case SpecDslPackage.XBOOL_TYPE: return createXBoolType();
      case SpecDslPackage.XBIT_ACCESS: return createXBitAccess();
      case SpecDslPackage.XREGISTER_ACCESS: return createXRegisterAccess();
      case SpecDslPackage.XVARIABLE_ACCESS: return createXVariableAccess();
      case SpecDslPackage.XPARAM_VARIABLE_ACCESS: return createXParamVariableAccess();
      case SpecDslPackage.XIF_EXPRESSION: return createXIfExpression();
      case SpecDslPackage.XWHILE_EXPRESSION: return createXWhileExpression();
      case SpecDslPackage.XFOR_EXPRESSION: return createXForExpression();
      case SpecDslPackage.XDO_WHILE_EXPRESSION: return createXDoWhileExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Datasheet createDatasheet()
  {
    DatasheetImpl datasheet = new DatasheetImpl();
    return datasheet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslProtocol createDslProtocol()
  {
    DslProtocolImpl dslProtocol = new DslProtocolImpl();
    return dslProtocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslOperation createDslOperation()
  {
    DslOperationImpl dslOperation = new DslOperationImpl();
    return dslOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslComponent createDslComponent()
  {
    DslComponentImpl dslComponent = new DslComponentImpl();
    return dslComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslMcu createDslMcu()
  {
    DslMcuImpl dslMcu = new DslMcuImpl();
    return dslMcu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslDevice createDslDevice()
  {
    DslDeviceImpl dslDevice = new DslDeviceImpl();
    return dslDevice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslPort createDslPort()
  {
    DslPortImpl dslPort = new DslPortImpl();
    return dslPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslPin createDslPin()
  {
    DslPinImpl dslPin = new DslPinImpl();
    return dslPin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslRegister createDslRegister()
  {
    DslRegisterImpl dslRegister = new DslRegisterImpl();
    return dslRegister;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslBit createDslBit()
  {
    DslBitImpl dslBit = new DslBitImpl();
    return dslBit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslPackage createDslPackage()
  {
    DslPackageImpl dslPackage = new DslPackageImpl();
    return dslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslPackagePin createDslPackagePin()
  {
    DslPackagePinImpl dslPackagePin = new DslPackagePinImpl();
    return dslPackagePin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslPeripheral createDslPeripheral()
  {
    DslPeripheralImpl dslPeripheral = new DslPeripheralImpl();
    return dslPeripheral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperationImpl createDslOperationImpl()
  {
    DslOperationImplImpl dslOperationImpl = new DslOperationImplImpl();
    return dslOperationImpl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslPeripheralExpression createDslPeripheralExpression()
  {
    DslPeripheralExpressionImpl dslPeripheralExpression = new DslPeripheralExpressionImpl();
    return dslPeripheralExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslRegisterRead createDslRegisterRead()
  {
    DslRegisterReadImpl dslRegisterRead = new DslRegisterReadImpl();
    return dslRegisterRead;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslRegisterWrite createDslRegisterWrite()
  {
    DslRegisterWriteImpl dslRegisterWrite = new DslRegisterWriteImpl();
    return dslRegisterWrite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslValue createDslValue()
  {
    DslValueImpl dslValue = new DslValueImpl();
    return dslValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslRefVariable createDslRefVariable()
  {
    DslRefVariableImpl dslRefVariable = new DslRefVariableImpl();
    return dslRefVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslFunction createDslFunction()
  {
    DslFunctionImpl dslFunction = new DslFunctionImpl();
    return dslFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslTypedParameter createDslTypedParameter()
  {
    DslTypedParameterImpl dslTypedParameter = new DslTypedParameterImpl();
    return dslTypedParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslCallFunction createDslCallFunction()
  {
    DslCallFunctionImpl dslCallFunction = new DslCallFunctionImpl();
    return dslCallFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslDefineVariable createDslDefineVariable()
  {
    DslDefineVariableImpl dslDefineVariable = new DslDefineVariableImpl();
    return dslDefineVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslReturn createDslReturn()
  {
    DslReturnImpl dslReturn = new DslReturnImpl();
    return dslReturn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslType createDslType()
  {
    DslTypeImpl dslType = new DslTypeImpl();
    return dslType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslVariable createDslVariable()
  {
    DslVariableImpl dslVariable = new DslVariableImpl();
    return dslVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslExpression createDslExpression()
  {
    DslExpressionImpl dslExpression = new DslExpressionImpl();
    return dslExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XBinaryExpression createXBinaryExpression()
  {
    XBinaryExpressionImpl xBinaryExpression = new XBinaryExpressionImpl();
    return xBinaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XBlockExpression createXBlockExpression()
  {
    XBlockExpressionImpl xBlockExpression = new XBlockExpressionImpl();
    return xBlockExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XPrimaryExpression createXPrimaryExpression()
  {
    XPrimaryExpressionImpl xPrimaryExpression = new XPrimaryExpressionImpl();
    return xPrimaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XConditionalExpression createXConditionalExpression()
  {
    XConditionalExpressionImpl xConditionalExpression = new XConditionalExpressionImpl();
    return xConditionalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XConditionalBlockExpression createXConditionalBlockExpression()
  {
    XConditionalBlockExpressionImpl xConditionalBlockExpression = new XConditionalBlockExpressionImpl();
    return xConditionalBlockExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XConditionalUnaryExpression createXConditionalUnaryExpression()
  {
    XConditionalUnaryExpressionImpl xConditionalUnaryExpression = new XConditionalUnaryExpressionImpl();
    return xConditionalUnaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XBoolExpression createXBoolExpression()
  {
    XBoolExpressionImpl xBoolExpression = new XBoolExpressionImpl();
    return xBoolExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XBoolType createXBoolType()
  {
    XBoolTypeImpl xBoolType = new XBoolTypeImpl();
    return xBoolType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XBitAccess createXBitAccess()
  {
    XBitAccessImpl xBitAccess = new XBitAccessImpl();
    return xBitAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XRegisterAccess createXRegisterAccess()
  {
    XRegisterAccessImpl xRegisterAccess = new XRegisterAccessImpl();
    return xRegisterAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XVariableAccess createXVariableAccess()
  {
    XVariableAccessImpl xVariableAccess = new XVariableAccessImpl();
    return xVariableAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XParamVariableAccess createXParamVariableAccess()
  {
    XParamVariableAccessImpl xParamVariableAccess = new XParamVariableAccessImpl();
    return xParamVariableAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XIfExpression createXIfExpression()
  {
    XIfExpressionImpl xIfExpression = new XIfExpressionImpl();
    return xIfExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XWhileExpression createXWhileExpression()
  {
    XWhileExpressionImpl xWhileExpression = new XWhileExpressionImpl();
    return xWhileExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XForExpression createXForExpression()
  {
    XForExpressionImpl xForExpression = new XForExpressionImpl();
    return xForExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDoWhileExpression createXDoWhileExpression()
  {
    XDoWhileExpressionImpl xDoWhileExpression = new XDoWhileExpressionImpl();
    return xDoWhileExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecDslPackage getSpecDslPackage()
  {
    return (SpecDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SpecDslPackage getPackage()
  {
    return SpecDslPackage.eINSTANCE;
  }

} //SpecDslFactoryImpl
