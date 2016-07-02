/**
 * <copyright>
 * </copyright>
 *

 */
package jp.ac.jaist.kslab.sb.marte.spec.specDsl.util;

import jp.ac.jaist.kslab.sb.marte.spec.specDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage
 * @generated
 */
public class SpecDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SpecDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SpecDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpecDslSwitch<Adapter> modelSwitch =
    new SpecDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseDatasheet(Datasheet object)
      {
        return createDatasheetAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseDslProtocol(DslProtocol object)
      {
        return createDslProtocolAdapter();
      }
      @Override
      public Adapter caseDslOperation(DslOperation object)
      {
        return createDslOperationAdapter();
      }
      @Override
      public Adapter caseDslComponent(DslComponent object)
      {
        return createDslComponentAdapter();
      }
      @Override
      public Adapter caseDslMcu(DslMcu object)
      {
        return createDslMcuAdapter();
      }
      @Override
      public Adapter caseDslDevice(DslDevice object)
      {
        return createDslDeviceAdapter();
      }
      @Override
      public Adapter caseDslPort(DslPort object)
      {
        return createDslPortAdapter();
      }
      @Override
      public Adapter caseDslPin(DslPin object)
      {
        return createDslPinAdapter();
      }
      @Override
      public Adapter caseDslRegister(DslRegister object)
      {
        return createDslRegisterAdapter();
      }
      @Override
      public Adapter caseDslBit(DslBit object)
      {
        return createDslBitAdapter();
      }
      @Override
      public Adapter caseDslPackage(DslPackage object)
      {
        return createDslPackageAdapter();
      }
      @Override
      public Adapter caseDslPackagePin(DslPackagePin object)
      {
        return createDslPackagePinAdapter();
      }
      @Override
      public Adapter caseDslPeripheral(DslPeripheral object)
      {
        return createDslPeripheralAdapter();
      }
      @Override
      public Adapter caseDslOperationImpl(DslOperationImpl object)
      {
        return createDslOperationImplAdapter();
      }
      @Override
      public Adapter caseDslPeripheralExpression(DslPeripheralExpression object)
      {
        return createDslPeripheralExpressionAdapter();
      }
      @Override
      public Adapter caseDslRegisterRead(DslRegisterRead object)
      {
        return createDslRegisterReadAdapter();
      }
      @Override
      public Adapter caseDslRegisterWrite(DslRegisterWrite object)
      {
        return createDslRegisterWriteAdapter();
      }
      @Override
      public Adapter caseDslValue(DslValue object)
      {
        return createDslValueAdapter();
      }
      @Override
      public Adapter caseDslRefVariable(DslRefVariable object)
      {
        return createDslRefVariableAdapter();
      }
      @Override
      public Adapter caseDslFunction(DslFunction object)
      {
        return createDslFunctionAdapter();
      }
      @Override
      public Adapter caseDslTypedParameter(DslTypedParameter object)
      {
        return createDslTypedParameterAdapter();
      }
      @Override
      public Adapter caseDslCallFunction(DslCallFunction object)
      {
        return createDslCallFunctionAdapter();
      }
      @Override
      public Adapter caseDslDefineVariable(DslDefineVariable object)
      {
        return createDslDefineVariableAdapter();
      }
      @Override
      public Adapter caseDslReturn(DslReturn object)
      {
        return createDslReturnAdapter();
      }
      @Override
      public Adapter caseDslType(DslType object)
      {
        return createDslTypeAdapter();
      }
      @Override
      public Adapter caseDslVariable(DslVariable object)
      {
        return createDslVariableAdapter();
      }
      @Override
      public Adapter caseDslExpression(DslExpression object)
      {
        return createDslExpressionAdapter();
      }
      @Override
      public Adapter caseXBinaryExpression(XBinaryExpression object)
      {
        return createXBinaryExpressionAdapter();
      }
      @Override
      public Adapter caseXBlockExpression(XBlockExpression object)
      {
        return createXBlockExpressionAdapter();
      }
      @Override
      public Adapter caseXPrimaryExpression(XPrimaryExpression object)
      {
        return createXPrimaryExpressionAdapter();
      }
      @Override
      public Adapter caseXConditionalExpression(XConditionalExpression object)
      {
        return createXConditionalExpressionAdapter();
      }
      @Override
      public Adapter caseXConditionalBlockExpression(XConditionalBlockExpression object)
      {
        return createXConditionalBlockExpressionAdapter();
      }
      @Override
      public Adapter caseXConditionalUnaryExpression(XConditionalUnaryExpression object)
      {
        return createXConditionalUnaryExpressionAdapter();
      }
      @Override
      public Adapter caseXBoolExpression(XBoolExpression object)
      {
        return createXBoolExpressionAdapter();
      }
      @Override
      public Adapter caseXBoolType(XBoolType object)
      {
        return createXBoolTypeAdapter();
      }
      @Override
      public Adapter caseXBitAccess(XBitAccess object)
      {
        return createXBitAccessAdapter();
      }
      @Override
      public Adapter caseXRegisterAccess(XRegisterAccess object)
      {
        return createXRegisterAccessAdapter();
      }
      @Override
      public Adapter caseXVariableAccess(XVariableAccess object)
      {
        return createXVariableAccessAdapter();
      }
      @Override
      public Adapter caseXParamVariableAccess(XParamVariableAccess object)
      {
        return createXParamVariableAccessAdapter();
      }
      @Override
      public Adapter caseXIfExpression(XIfExpression object)
      {
        return createXIfExpressionAdapter();
      }
      @Override
      public Adapter caseXWhileExpression(XWhileExpression object)
      {
        return createXWhileExpressionAdapter();
      }
      @Override
      public Adapter caseXForExpression(XForExpression object)
      {
        return createXForExpressionAdapter();
      }
      @Override
      public Adapter caseXDoWhileExpression(XDoWhileExpression object)
      {
        return createXDoWhileExpressionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.Datasheet <em>Datasheet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.Datasheet
   * @generated
   */
  public Adapter createDatasheetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslProtocol <em>Dsl Protocol</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslProtocol
   * @generated
   */
  public Adapter createDslProtocolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperation <em>Dsl Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperation
   * @generated
   */
  public Adapter createDslOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslComponent <em>Dsl Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslComponent
   * @generated
   */
  public Adapter createDslComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslMcu <em>Dsl Mcu</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslMcu
   * @generated
   */
  public Adapter createDslMcuAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslDevice <em>Dsl Device</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslDevice
   * @generated
   */
  public Adapter createDslDeviceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPort <em>Dsl Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPort
   * @generated
   */
  public Adapter createDslPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPin <em>Dsl Pin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPin
   * @generated
   */
  public Adapter createDslPinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegister <em>Dsl Register</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegister
   * @generated
   */
  public Adapter createDslRegisterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslBit <em>Dsl Bit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslBit
   * @generated
   */
  public Adapter createDslBitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackage <em>Dsl Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackage
   * @generated
   */
  public Adapter createDslPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackagePin <em>Dsl Package Pin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackagePin
   * @generated
   */
  public Adapter createDslPackagePinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPeripheral <em>Dsl Peripheral</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPeripheral
   * @generated
   */
  public Adapter createDslPeripheralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperationImpl <em>Dsl Operation Impl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperationImpl
   * @generated
   */
  public Adapter createDslOperationImplAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPeripheralExpression <em>Dsl Peripheral Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPeripheralExpression
   * @generated
   */
  public Adapter createDslPeripheralExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegisterRead <em>Dsl Register Read</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegisterRead
   * @generated
   */
  public Adapter createDslRegisterReadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegisterWrite <em>Dsl Register Write</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegisterWrite
   * @generated
   */
  public Adapter createDslRegisterWriteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslValue <em>Dsl Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslValue
   * @generated
   */
  public Adapter createDslValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRefVariable <em>Dsl Ref Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRefVariable
   * @generated
   */
  public Adapter createDslRefVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslFunction <em>Dsl Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslFunction
   * @generated
   */
  public Adapter createDslFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslTypedParameter <em>Dsl Typed Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslTypedParameter
   * @generated
   */
  public Adapter createDslTypedParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslCallFunction <em>Dsl Call Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslCallFunction
   * @generated
   */
  public Adapter createDslCallFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslDefineVariable <em>Dsl Define Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslDefineVariable
   * @generated
   */
  public Adapter createDslDefineVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslReturn <em>Dsl Return</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslReturn
   * @generated
   */
  public Adapter createDslReturnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslType <em>Dsl Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslType
   * @generated
   */
  public Adapter createDslTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslVariable <em>Dsl Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslVariable
   * @generated
   */
  public Adapter createDslVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslExpression <em>Dsl Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslExpression
   * @generated
   */
  public Adapter createDslExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBinaryExpression <em>XBinary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBinaryExpression
   * @generated
   */
  public Adapter createXBinaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBlockExpression <em>XBlock Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBlockExpression
   * @generated
   */
  public Adapter createXBlockExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XPrimaryExpression <em>XPrimary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XPrimaryExpression
   * @generated
   */
  public Adapter createXPrimaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalExpression <em>XConditional Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalExpression
   * @generated
   */
  public Adapter createXConditionalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalBlockExpression <em>XConditional Block Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalBlockExpression
   * @generated
   */
  public Adapter createXConditionalBlockExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalUnaryExpression <em>XConditional Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalUnaryExpression
   * @generated
   */
  public Adapter createXConditionalUnaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBoolExpression <em>XBool Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBoolExpression
   * @generated
   */
  public Adapter createXBoolExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBoolType <em>XBool Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBoolType
   * @generated
   */
  public Adapter createXBoolTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBitAccess <em>XBit Access</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBitAccess
   * @generated
   */
  public Adapter createXBitAccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XRegisterAccess <em>XRegister Access</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XRegisterAccess
   * @generated
   */
  public Adapter createXRegisterAccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XVariableAccess <em>XVariable Access</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XVariableAccess
   * @generated
   */
  public Adapter createXVariableAccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XParamVariableAccess <em>XParam Variable Access</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XParamVariableAccess
   * @generated
   */
  public Adapter createXParamVariableAccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XIfExpression <em>XIf Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XIfExpression
   * @generated
   */
  public Adapter createXIfExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XWhileExpression <em>XWhile Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XWhileExpression
   * @generated
   */
  public Adapter createXWhileExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XForExpression <em>XFor Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XForExpression
   * @generated
   */
  public Adapter createXForExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XDoWhileExpression <em>XDo While Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.XDoWhileExpression
   * @generated
   */
  public Adapter createXDoWhileExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SpecDslAdapterFactory
