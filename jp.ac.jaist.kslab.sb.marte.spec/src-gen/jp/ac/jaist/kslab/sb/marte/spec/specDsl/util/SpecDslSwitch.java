/**
 * <copyright>
 * </copyright>
 *

 */
package jp.ac.jaist.kslab.sb.marte.spec.specDsl.util;

import jp.ac.jaist.kslab.sb.marte.spec.specDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage
 * @generated
 */
public class SpecDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SpecDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SpecDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SpecDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DATASHEET:
      {
        Datasheet datasheet = (Datasheet)theEObject;
        T result = caseDatasheet(datasheet);
        if (result == null) result = caseModel(datasheet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_PROTOCOL:
      {
        DslProtocol dslProtocol = (DslProtocol)theEObject;
        T result = caseDslProtocol(dslProtocol);
        if (result == null) result = caseModel(dslProtocol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_OPERATION:
      {
        DslOperation dslOperation = (DslOperation)theEObject;
        T result = caseDslOperation(dslOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_COMPONENT:
      {
        DslComponent dslComponent = (DslComponent)theEObject;
        T result = caseDslComponent(dslComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_MCU:
      {
        DslMcu dslMcu = (DslMcu)theEObject;
        T result = caseDslMcu(dslMcu);
        if (result == null) result = caseDslComponent(dslMcu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_DEVICE:
      {
        DslDevice dslDevice = (DslDevice)theEObject;
        T result = caseDslDevice(dslDevice);
        if (result == null) result = caseDslComponent(dslDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_PORT:
      {
        DslPort dslPort = (DslPort)theEObject;
        T result = caseDslPort(dslPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_PIN:
      {
        DslPin dslPin = (DslPin)theEObject;
        T result = caseDslPin(dslPin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_REGISTER:
      {
        DslRegister dslRegister = (DslRegister)theEObject;
        T result = caseDslRegister(dslRegister);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_BIT:
      {
        DslBit dslBit = (DslBit)theEObject;
        T result = caseDslBit(dslBit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_PACKAGE:
      {
        DslPackage dslPackage = (DslPackage)theEObject;
        T result = caseDslPackage(dslPackage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_PACKAGE_PIN:
      {
        DslPackagePin dslPackagePin = (DslPackagePin)theEObject;
        T result = caseDslPackagePin(dslPackagePin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_PERIPHERAL:
      {
        DslPeripheral dslPeripheral = (DslPeripheral)theEObject;
        T result = caseDslPeripheral(dslPeripheral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_OPERATION_IMPL:
      {
        DslOperationImpl dslOperationImpl = (DslOperationImpl)theEObject;
        T result = caseDslOperationImpl(dslOperationImpl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_PERIPHERAL_EXPRESSION:
      {
        DslPeripheralExpression dslPeripheralExpression = (DslPeripheralExpression)theEObject;
        T result = caseDslPeripheralExpression(dslPeripheralExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_REGISTER_READ:
      {
        DslRegisterRead dslRegisterRead = (DslRegisterRead)theEObject;
        T result = caseDslRegisterRead(dslRegisterRead);
        if (result == null) result = caseDslExpression(dslRegisterRead);
        if (result == null) result = caseDslPeripheralExpression(dslRegisterRead);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_REGISTER_WRITE:
      {
        DslRegisterWrite dslRegisterWrite = (DslRegisterWrite)theEObject;
        T result = caseDslRegisterWrite(dslRegisterWrite);
        if (result == null) result = caseDslExpression(dslRegisterWrite);
        if (result == null) result = caseDslPeripheralExpression(dslRegisterWrite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_VALUE:
      {
        DslValue dslValue = (DslValue)theEObject;
        T result = caseDslValue(dslValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_REF_VARIABLE:
      {
        DslRefVariable dslRefVariable = (DslRefVariable)theEObject;
        T result = caseDslRefVariable(dslRefVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_FUNCTION:
      {
        DslFunction dslFunction = (DslFunction)theEObject;
        T result = caseDslFunction(dslFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_TYPED_PARAMETER:
      {
        DslTypedParameter dslTypedParameter = (DslTypedParameter)theEObject;
        T result = caseDslTypedParameter(dslTypedParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_CALL_FUNCTION:
      {
        DslCallFunction dslCallFunction = (DslCallFunction)theEObject;
        T result = caseDslCallFunction(dslCallFunction);
        if (result == null) result = caseDslExpression(dslCallFunction);
        if (result == null) result = caseDslPeripheralExpression(dslCallFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_DEFINE_VARIABLE:
      {
        DslDefineVariable dslDefineVariable = (DslDefineVariable)theEObject;
        T result = caseDslDefineVariable(dslDefineVariable);
        if (result == null) result = caseDslExpression(dslDefineVariable);
        if (result == null) result = caseDslPeripheralExpression(dslDefineVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_RETURN:
      {
        DslReturn dslReturn = (DslReturn)theEObject;
        T result = caseDslReturn(dslReturn);
        if (result == null) result = caseDslExpression(dslReturn);
        if (result == null) result = caseDslPeripheralExpression(dslReturn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_TYPE:
      {
        DslType dslType = (DslType)theEObject;
        T result = caseDslType(dslType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_VARIABLE:
      {
        DslVariable dslVariable = (DslVariable)theEObject;
        T result = caseDslVariable(dslVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.DSL_EXPRESSION:
      {
        DslExpression dslExpression = (DslExpression)theEObject;
        T result = caseDslExpression(dslExpression);
        if (result == null) result = caseDslPeripheralExpression(dslExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.XBINARY_EXPRESSION:
      {
        XBinaryExpression xBinaryExpression = (XBinaryExpression)theEObject;
        T result = caseXBinaryExpression(xBinaryExpression);
        if (result == null) result = caseDslExpression(xBinaryExpression);
        if (result == null) result = caseDslPeripheralExpression(xBinaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.XBLOCK_EXPRESSION:
      {
        XBlockExpression xBlockExpression = (XBlockExpression)theEObject;
        T result = caseXBlockExpression(xBlockExpression);
        if (result == null) result = caseDslExpression(xBlockExpression);
        if (result == null) result = caseDslPeripheralExpression(xBlockExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.XPRIMARY_EXPRESSION:
      {
        XPrimaryExpression xPrimaryExpression = (XPrimaryExpression)theEObject;
        T result = caseXPrimaryExpression(xPrimaryExpression);
        if (result == null) result = caseDslExpression(xPrimaryExpression);
        if (result == null) result = caseDslPeripheralExpression(xPrimaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.XCONDITIONAL_EXPRESSION:
      {
        XConditionalExpression xConditionalExpression = (XConditionalExpression)theEObject;
        T result = caseXConditionalExpression(xConditionalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.XCONDITIONAL_BLOCK_EXPRESSION:
      {
        XConditionalBlockExpression xConditionalBlockExpression = (XConditionalBlockExpression)theEObject;
        T result = caseXConditionalBlockExpression(xConditionalBlockExpression);
        if (result == null) result = caseXConditionalExpression(xConditionalBlockExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.XCONDITIONAL_UNARY_EXPRESSION:
      {
        XConditionalUnaryExpression xConditionalUnaryExpression = (XConditionalUnaryExpression)theEObject;
        T result = caseXConditionalUnaryExpression(xConditionalUnaryExpression);
        if (result == null) result = caseXConditionalExpression(xConditionalUnaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.XBOOL_EXPRESSION:
      {
        XBoolExpression xBoolExpression = (XBoolExpression)theEObject;
        T result = caseXBoolExpression(xBoolExpression);
        if (result == null) result = caseXConditionalExpression(xBoolExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.XBOOL_TYPE:
      {
        XBoolType xBoolType = (XBoolType)theEObject;
        T result = caseXBoolType(xBoolType);
        if (result == null) result = caseDslValue(xBoolType);
        if (result == null) result = caseXConditionalExpression(xBoolType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.XBIT_ACCESS:
      {
        XBitAccess xBitAccess = (XBitAccess)theEObject;
        T result = caseXBitAccess(xBitAccess);
        if (result == null) result = caseXBoolType(xBitAccess);
        if (result == null) result = caseDslValue(xBitAccess);
        if (result == null) result = caseXConditionalExpression(xBitAccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.XREGISTER_ACCESS:
      {
        XRegisterAccess xRegisterAccess = (XRegisterAccess)theEObject;
        T result = caseXRegisterAccess(xRegisterAccess);
        if (result == null) result = caseXBoolType(xRegisterAccess);
        if (result == null) result = caseDslValue(xRegisterAccess);
        if (result == null) result = caseXConditionalExpression(xRegisterAccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.XVARIABLE_ACCESS:
      {
        XVariableAccess xVariableAccess = (XVariableAccess)theEObject;
        T result = caseXVariableAccess(xVariableAccess);
        if (result == null) result = caseXBoolType(xVariableAccess);
        if (result == null) result = caseDslValue(xVariableAccess);
        if (result == null) result = caseXConditionalExpression(xVariableAccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.XPARAM_VARIABLE_ACCESS:
      {
        XParamVariableAccess xParamVariableAccess = (XParamVariableAccess)theEObject;
        T result = caseXParamVariableAccess(xParamVariableAccess);
        if (result == null) result = caseXBoolType(xParamVariableAccess);
        if (result == null) result = caseDslValue(xParamVariableAccess);
        if (result == null) result = caseXConditionalExpression(xParamVariableAccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.XIF_EXPRESSION:
      {
        XIfExpression xIfExpression = (XIfExpression)theEObject;
        T result = caseXIfExpression(xIfExpression);
        if (result == null) result = caseXPrimaryExpression(xIfExpression);
        if (result == null) result = caseDslExpression(xIfExpression);
        if (result == null) result = caseDslPeripheralExpression(xIfExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.XWHILE_EXPRESSION:
      {
        XWhileExpression xWhileExpression = (XWhileExpression)theEObject;
        T result = caseXWhileExpression(xWhileExpression);
        if (result == null) result = caseXPrimaryExpression(xWhileExpression);
        if (result == null) result = caseDslExpression(xWhileExpression);
        if (result == null) result = caseDslPeripheralExpression(xWhileExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.XFOR_EXPRESSION:
      {
        XForExpression xForExpression = (XForExpression)theEObject;
        T result = caseXForExpression(xForExpression);
        if (result == null) result = caseXPrimaryExpression(xForExpression);
        if (result == null) result = caseDslExpression(xForExpression);
        if (result == null) result = caseDslPeripheralExpression(xForExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpecDslPackage.XDO_WHILE_EXPRESSION:
      {
        XDoWhileExpression xDoWhileExpression = (XDoWhileExpression)theEObject;
        T result = caseXDoWhileExpression(xDoWhileExpression);
        if (result == null) result = caseXPrimaryExpression(xDoWhileExpression);
        if (result == null) result = caseDslExpression(xDoWhileExpression);
        if (result == null) result = caseDslPeripheralExpression(xDoWhileExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datasheet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datasheet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatasheet(Datasheet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Protocol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Protocol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslProtocol(DslProtocol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslOperation(DslOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslComponent(DslComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Mcu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Mcu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslMcu(DslMcu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Device</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslDevice(DslDevice object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslPort(DslPort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Pin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Pin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslPin(DslPin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Register</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Register</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslRegister(DslRegister object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Bit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Bit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslBit(DslBit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslPackage(DslPackage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Package Pin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Package Pin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslPackagePin(DslPackagePin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Peripheral</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Peripheral</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslPeripheral(DslPeripheral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Operation Impl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Operation Impl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslOperationImpl(DslOperationImpl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Peripheral Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Peripheral Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslPeripheralExpression(DslPeripheralExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Register Read</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Register Read</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslRegisterRead(DslRegisterRead object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Register Write</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Register Write</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslRegisterWrite(DslRegisterWrite object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslValue(DslValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Ref Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Ref Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslRefVariable(DslRefVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslFunction(DslFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Typed Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Typed Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslTypedParameter(DslTypedParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Call Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Call Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslCallFunction(DslCallFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Define Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Define Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslDefineVariable(DslDefineVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Return</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Return</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslReturn(DslReturn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslType(DslType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslVariable(DslVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dsl Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dsl Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDslExpression(DslExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XBinary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XBinary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXBinaryExpression(XBinaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XBlock Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XBlock Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXBlockExpression(XBlockExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XPrimary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XPrimary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXPrimaryExpression(XPrimaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XConditional Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XConditional Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXConditionalExpression(XConditionalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XConditional Block Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XConditional Block Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXConditionalBlockExpression(XConditionalBlockExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XConditional Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XConditional Unary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXConditionalUnaryExpression(XConditionalUnaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XBool Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XBool Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXBoolExpression(XBoolExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XBool Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XBool Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXBoolType(XBoolType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XBit Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XBit Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXBitAccess(XBitAccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XRegister Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XRegister Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXRegisterAccess(XRegisterAccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XVariable Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XVariable Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXVariableAccess(XVariableAccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XParam Variable Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XParam Variable Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXParamVariableAccess(XParamVariableAccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XIf Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XIf Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXIfExpression(XIfExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XWhile Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XWhile Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXWhileExpression(XWhileExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XFor Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XFor Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXForExpression(XForExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XDo While Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XDo While Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXDoWhileExpression(XDoWhileExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SpecDslSwitch
