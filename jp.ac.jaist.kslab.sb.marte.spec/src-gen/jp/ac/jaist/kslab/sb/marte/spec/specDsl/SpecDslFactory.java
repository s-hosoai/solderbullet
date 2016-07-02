/**
 * <copyright>
 * </copyright>
 *

 */
package jp.ac.jaist.kslab.sb.marte.spec.specDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage
 * @generated
 */
public interface SpecDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SpecDslFactory eINSTANCE = jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.SpecDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Datasheet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Datasheet</em>'.
   * @generated
   */
  Datasheet createDatasheet();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Dsl Protocol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Protocol</em>'.
   * @generated
   */
  DslProtocol createDslProtocol();

  /**
   * Returns a new object of class '<em>Dsl Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Operation</em>'.
   * @generated
   */
  DslOperation createDslOperation();

  /**
   * Returns a new object of class '<em>Dsl Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Component</em>'.
   * @generated
   */
  DslComponent createDslComponent();

  /**
   * Returns a new object of class '<em>Dsl Mcu</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Mcu</em>'.
   * @generated
   */
  DslMcu createDslMcu();

  /**
   * Returns a new object of class '<em>Dsl Device</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Device</em>'.
   * @generated
   */
  DslDevice createDslDevice();

  /**
   * Returns a new object of class '<em>Dsl Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Port</em>'.
   * @generated
   */
  DslPort createDslPort();

  /**
   * Returns a new object of class '<em>Dsl Pin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Pin</em>'.
   * @generated
   */
  DslPin createDslPin();

  /**
   * Returns a new object of class '<em>Dsl Register</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Register</em>'.
   * @generated
   */
  DslRegister createDslRegister();

  /**
   * Returns a new object of class '<em>Dsl Bit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Bit</em>'.
   * @generated
   */
  DslBit createDslBit();

  /**
   * Returns a new object of class '<em>Dsl Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Package</em>'.
   * @generated
   */
  DslPackage createDslPackage();

  /**
   * Returns a new object of class '<em>Dsl Package Pin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Package Pin</em>'.
   * @generated
   */
  DslPackagePin createDslPackagePin();

  /**
   * Returns a new object of class '<em>Dsl Peripheral</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Peripheral</em>'.
   * @generated
   */
  DslPeripheral createDslPeripheral();

  /**
   * Returns a new object of class '<em>Dsl Operation Impl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Operation Impl</em>'.
   * @generated
   */
  DslOperationImpl createDslOperationImpl();

  /**
   * Returns a new object of class '<em>Dsl Peripheral Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Peripheral Expression</em>'.
   * @generated
   */
  DslPeripheralExpression createDslPeripheralExpression();

  /**
   * Returns a new object of class '<em>Dsl Register Read</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Register Read</em>'.
   * @generated
   */
  DslRegisterRead createDslRegisterRead();

  /**
   * Returns a new object of class '<em>Dsl Register Write</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Register Write</em>'.
   * @generated
   */
  DslRegisterWrite createDslRegisterWrite();

  /**
   * Returns a new object of class '<em>Dsl Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Value</em>'.
   * @generated
   */
  DslValue createDslValue();

  /**
   * Returns a new object of class '<em>Dsl Ref Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Ref Variable</em>'.
   * @generated
   */
  DslRefVariable createDslRefVariable();

  /**
   * Returns a new object of class '<em>Dsl Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Function</em>'.
   * @generated
   */
  DslFunction createDslFunction();

  /**
   * Returns a new object of class '<em>Dsl Typed Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Typed Parameter</em>'.
   * @generated
   */
  DslTypedParameter createDslTypedParameter();

  /**
   * Returns a new object of class '<em>Dsl Call Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Call Function</em>'.
   * @generated
   */
  DslCallFunction createDslCallFunction();

  /**
   * Returns a new object of class '<em>Dsl Define Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Define Variable</em>'.
   * @generated
   */
  DslDefineVariable createDslDefineVariable();

  /**
   * Returns a new object of class '<em>Dsl Return</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Return</em>'.
   * @generated
   */
  DslReturn createDslReturn();

  /**
   * Returns a new object of class '<em>Dsl Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Type</em>'.
   * @generated
   */
  DslType createDslType();

  /**
   * Returns a new object of class '<em>Dsl Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Variable</em>'.
   * @generated
   */
  DslVariable createDslVariable();

  /**
   * Returns a new object of class '<em>Dsl Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Expression</em>'.
   * @generated
   */
  DslExpression createDslExpression();

  /**
   * Returns a new object of class '<em>XBinary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XBinary Expression</em>'.
   * @generated
   */
  XBinaryExpression createXBinaryExpression();

  /**
   * Returns a new object of class '<em>XBlock Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XBlock Expression</em>'.
   * @generated
   */
  XBlockExpression createXBlockExpression();

  /**
   * Returns a new object of class '<em>XPrimary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XPrimary Expression</em>'.
   * @generated
   */
  XPrimaryExpression createXPrimaryExpression();

  /**
   * Returns a new object of class '<em>XConditional Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XConditional Expression</em>'.
   * @generated
   */
  XConditionalExpression createXConditionalExpression();

  /**
   * Returns a new object of class '<em>XConditional Block Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XConditional Block Expression</em>'.
   * @generated
   */
  XConditionalBlockExpression createXConditionalBlockExpression();

  /**
   * Returns a new object of class '<em>XConditional Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XConditional Unary Expression</em>'.
   * @generated
   */
  XConditionalUnaryExpression createXConditionalUnaryExpression();

  /**
   * Returns a new object of class '<em>XBool Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XBool Expression</em>'.
   * @generated
   */
  XBoolExpression createXBoolExpression();

  /**
   * Returns a new object of class '<em>XBool Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XBool Type</em>'.
   * @generated
   */
  XBoolType createXBoolType();

  /**
   * Returns a new object of class '<em>XBit Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XBit Access</em>'.
   * @generated
   */
  XBitAccess createXBitAccess();

  /**
   * Returns a new object of class '<em>XRegister Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XRegister Access</em>'.
   * @generated
   */
  XRegisterAccess createXRegisterAccess();

  /**
   * Returns a new object of class '<em>XVariable Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XVariable Access</em>'.
   * @generated
   */
  XVariableAccess createXVariableAccess();

  /**
   * Returns a new object of class '<em>XParam Variable Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XParam Variable Access</em>'.
   * @generated
   */
  XParamVariableAccess createXParamVariableAccess();

  /**
   * Returns a new object of class '<em>XIf Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XIf Expression</em>'.
   * @generated
   */
  XIfExpression createXIfExpression();

  /**
   * Returns a new object of class '<em>XWhile Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XWhile Expression</em>'.
   * @generated
   */
  XWhileExpression createXWhileExpression();

  /**
   * Returns a new object of class '<em>XFor Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XFor Expression</em>'.
   * @generated
   */
  XForExpression createXForExpression();

  /**
   * Returns a new object of class '<em>XDo While Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XDo While Expression</em>'.
   * @generated
   */
  XDoWhileExpression createXDoWhileExpression();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SpecDslPackage getSpecDslPackage();

} //SpecDslFactory
