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
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperationImpl;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecDslPackageImpl extends EPackageImpl implements SpecDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datasheetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslProtocolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslMcuEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslDeviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslPortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslPinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslRegisterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslBitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslPackageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslPackagePinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslPeripheralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslOperationImplEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslPeripheralExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslRegisterReadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslRegisterWriteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslRefVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslTypedParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslCallFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslDefineVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslReturnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xBinaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xBlockExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xPrimaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xConditionalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xConditionalBlockExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xConditionalUnaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xBoolExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xBoolTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xBitAccessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xRegisterAccessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xVariableAccessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xParamVariableAccessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xIfExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xWhileExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xForExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xDoWhileExpressionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SpecDslPackageImpl()
  {
    super(eNS_URI, SpecDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SpecDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SpecDslPackage init()
  {
    if (isInited) return (SpecDslPackage)EPackage.Registry.INSTANCE.getEPackage(SpecDslPackage.eNS_URI);

    // Obtain or create and register package
    SpecDslPackageImpl theSpecDslPackage = (SpecDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SpecDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SpecDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSpecDslPackage.createPackageContents();

    // Initialize created meta-data
    theSpecDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSpecDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SpecDslPackage.eNS_URI, theSpecDslPackage);
    return theSpecDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_Name()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatasheet()
  {
    return datasheetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatasheet_Revision()
  {
    return (EAttribute)datasheetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatasheet_Imports()
  {
    return (EReference)datasheetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatasheet_Components()
  {
    return (EReference)datasheetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslProtocol()
  {
    return dslProtocolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslProtocol_Operations()
  {
    return (EReference)dslProtocolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslOperation()
  {
    return dslOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslOperation_Type()
  {
    return (EReference)dslOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDslOperation_Name()
  {
    return (EAttribute)dslOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslOperation_ParamType()
  {
    return (EReference)dslOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDslOperation_Paramname()
  {
    return (EAttribute)dslOperationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslComponent()
  {
    return dslComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDslComponent_Name()
  {
    return (EAttribute)dslComponentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslComponent_Pins()
  {
    return (EReference)dslComponentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslComponent_Ports()
  {
    return (EReference)dslComponentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslComponent_Packages()
  {
    return (EReference)dslComponentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslMcu()
  {
    return dslMcuEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslMcu_Peripherals()
  {
    return (EReference)dslMcuEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslMcu_Sfr()
  {
    return (EReference)dslMcuEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslDevice()
  {
    return dslDeviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslDevice_Functions()
  {
    return (EReference)dslDeviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslDevice_Registers()
  {
    return (EReference)dslDeviceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslPort()
  {
    return dslPortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDslPort_Name()
  {
    return (EAttribute)dslPortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslPort_Pins()
  {
    return (EReference)dslPortEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslPin()
  {
    return dslPinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDslPin_Name()
  {
    return (EAttribute)dslPinEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslRegister()
  {
    return dslRegisterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDslRegister_Address()
  {
    return (EAttribute)dslRegisterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDslRegister_Name()
  {
    return (EAttribute)dslRegisterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslRegister_Bits()
  {
    return (EReference)dslRegisterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslBit()
  {
    return dslBitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDslBit_Name()
  {
    return (EAttribute)dslBitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslPackage()
  {
    return dslPackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDslPackage_Names()
  {
    return (EAttribute)dslPackageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslPackage_Pins()
  {
    return (EReference)dslPackageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslPackagePin()
  {
    return dslPackagePinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDslPackagePin_Name()
  {
    return (EAttribute)dslPackagePinEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDslPackagePin_PinNo()
  {
    return (EAttribute)dslPackagePinEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDslPackagePin_AltNames()
  {
    return (EAttribute)dslPackagePinEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslPeripheral()
  {
    return dslPeripheralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDslPeripheral_Name()
  {
    return (EAttribute)dslPeripheralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslPeripheral_Compliant()
  {
    return (EReference)dslPeripheralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslPeripheral_Operations()
  {
    return (EReference)dslPeripheralEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslOperationImpl()
  {
    return dslOperationImplEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslOperationImpl_Rettype()
  {
    return (EReference)dslOperationImplEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslOperationImpl_ImplOperation()
  {
    return (EReference)dslOperationImplEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslOperationImpl_Params()
  {
    return (EReference)dslOperationImplEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslOperationImpl_Expression()
  {
    return (EReference)dslOperationImplEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslPeripheralExpression()
  {
    return dslPeripheralExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslRegisterRead()
  {
    return dslRegisterReadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslRegisterRead_Ref()
  {
    return (EReference)dslRegisterReadEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslRegisterRead_Var()
  {
    return (EReference)dslRegisterReadEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslRegisterWrite()
  {
    return dslRegisterWriteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslRegisterWrite_Ref()
  {
    return (EReference)dslRegisterWriteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslRegisterWrite_Var()
  {
    return (EReference)dslRegisterWriteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslValue()
  {
    return dslValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslRefVariable()
  {
    return dslRefVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslRefVariable_Ref()
  {
    return (EReference)dslRefVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslFunction()
  {
    return dslFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslFunction_Type()
  {
    return (EReference)dslFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDslFunction_Name()
  {
    return (EAttribute)dslFunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslFunction_Params()
  {
    return (EReference)dslFunctionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslFunction_Expressions()
  {
    return (EReference)dslFunctionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslTypedParameter()
  {
    return dslTypedParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslTypedParameter_ParamType()
  {
    return (EReference)dslTypedParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDslTypedParameter_Name()
  {
    return (EAttribute)dslTypedParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslCallFunction()
  {
    return dslCallFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslCallFunction_Variables()
  {
    return (EReference)dslCallFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslCallFunction_Function()
  {
    return (EReference)dslCallFunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslCallFunction_Params()
  {
    return (EReference)dslCallFunctionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslDefineVariable()
  {
    return dslDefineVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDslDefineVariable_Name()
  {
    return (EAttribute)dslDefineVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslDefineVariable_Val()
  {
    return (EReference)dslDefineVariableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslReturn()
  {
    return dslReturnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslReturn_Val()
  {
    return (EReference)dslReturnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslType()
  {
    return dslTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDslType_Type()
  {
    return (EAttribute)dslTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslVariable()
  {
    return dslVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDslVariable_Var()
  {
    return (EReference)dslVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDslExpression()
  {
    return dslExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXBinaryExpression()
  {
    return xBinaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXBinaryExpression_Left()
  {
    return (EReference)xBinaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXBinaryExpression_Op()
  {
    return (EAttribute)xBinaryExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXBinaryExpression_Right()
  {
    return (EReference)xBinaryExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXBlockExpression()
  {
    return xBlockExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXBlockExpression_Expression()
  {
    return (EReference)xBlockExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXPrimaryExpression()
  {
    return xPrimaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXConditionalExpression()
  {
    return xConditionalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXConditionalBlockExpression()
  {
    return xConditionalBlockExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXConditionalBlockExpression_Expression()
  {
    return (EReference)xConditionalBlockExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXConditionalUnaryExpression()
  {
    return xConditionalUnaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXConditionalUnaryExpression_Expression()
  {
    return (EReference)xConditionalUnaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXBoolExpression()
  {
    return xBoolExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXBoolExpression_Left()
  {
    return (EReference)xBoolExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXBoolExpression_Op()
  {
    return (EAttribute)xBoolExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXBoolExpression_Right()
  {
    return (EReference)xBoolExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXBoolType()
  {
    return xBoolTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXBitAccess()
  {
    return xBitAccessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXBitAccess_Bit()
  {
    return (EReference)xBitAccessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXRegisterAccess()
  {
    return xRegisterAccessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXRegisterAccess_Reg()
  {
    return (EReference)xRegisterAccessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXVariableAccess()
  {
    return xVariableAccessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXVariableAccess_Var()
  {
    return (EReference)xVariableAccessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXParamVariableAccess()
  {
    return xParamVariableAccessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXParamVariableAccess_Var()
  {
    return (EReference)xParamVariableAccessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXIfExpression()
  {
    return xIfExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXIfExpression_If()
  {
    return (EReference)xIfExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXIfExpression_Then()
  {
    return (EReference)xIfExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXIfExpression_Else()
  {
    return (EReference)xIfExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXWhileExpression()
  {
    return xWhileExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXWhileExpression_Predicate()
  {
    return (EReference)xWhileExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXWhileExpression_Body()
  {
    return (EReference)xWhileExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXForExpression()
  {
    return xForExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXForExpression_Init()
  {
    return (EReference)xForExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXForExpression_Predicate()
  {
    return (EReference)xForExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXForExpression_Loop()
  {
    return (EReference)xForExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXForExpression_Body()
  {
    return (EReference)xForExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXDoWhileExpression()
  {
    return xDoWhileExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXDoWhileExpression_Body()
  {
    return (EReference)xDoWhileExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXDoWhileExpression_Predicate()
  {
    return (EReference)xDoWhileExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecDslFactory getSpecDslFactory()
  {
    return (SpecDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEAttribute(modelEClass, MODEL__NAME);

    datasheetEClass = createEClass(DATASHEET);
    createEAttribute(datasheetEClass, DATASHEET__REVISION);
    createEReference(datasheetEClass, DATASHEET__IMPORTS);
    createEReference(datasheetEClass, DATASHEET__COMPONENTS);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    dslProtocolEClass = createEClass(DSL_PROTOCOL);
    createEReference(dslProtocolEClass, DSL_PROTOCOL__OPERATIONS);

    dslOperationEClass = createEClass(DSL_OPERATION);
    createEReference(dslOperationEClass, DSL_OPERATION__TYPE);
    createEAttribute(dslOperationEClass, DSL_OPERATION__NAME);
    createEReference(dslOperationEClass, DSL_OPERATION__PARAM_TYPE);
    createEAttribute(dslOperationEClass, DSL_OPERATION__PARAMNAME);

    dslComponentEClass = createEClass(DSL_COMPONENT);
    createEAttribute(dslComponentEClass, DSL_COMPONENT__NAME);
    createEReference(dslComponentEClass, DSL_COMPONENT__PINS);
    createEReference(dslComponentEClass, DSL_COMPONENT__PORTS);
    createEReference(dslComponentEClass, DSL_COMPONENT__PACKAGES);

    dslMcuEClass = createEClass(DSL_MCU);
    createEReference(dslMcuEClass, DSL_MCU__PERIPHERALS);
    createEReference(dslMcuEClass, DSL_MCU__SFR);

    dslDeviceEClass = createEClass(DSL_DEVICE);
    createEReference(dslDeviceEClass, DSL_DEVICE__FUNCTIONS);
    createEReference(dslDeviceEClass, DSL_DEVICE__REGISTERS);

    dslPortEClass = createEClass(DSL_PORT);
    createEAttribute(dslPortEClass, DSL_PORT__NAME);
    createEReference(dslPortEClass, DSL_PORT__PINS);

    dslPinEClass = createEClass(DSL_PIN);
    createEAttribute(dslPinEClass, DSL_PIN__NAME);

    dslRegisterEClass = createEClass(DSL_REGISTER);
    createEAttribute(dslRegisterEClass, DSL_REGISTER__ADDRESS);
    createEAttribute(dslRegisterEClass, DSL_REGISTER__NAME);
    createEReference(dslRegisterEClass, DSL_REGISTER__BITS);

    dslBitEClass = createEClass(DSL_BIT);
    createEAttribute(dslBitEClass, DSL_BIT__NAME);

    dslPackageEClass = createEClass(DSL_PACKAGE);
    createEAttribute(dslPackageEClass, DSL_PACKAGE__NAMES);
    createEReference(dslPackageEClass, DSL_PACKAGE__PINS);

    dslPackagePinEClass = createEClass(DSL_PACKAGE_PIN);
    createEAttribute(dslPackagePinEClass, DSL_PACKAGE_PIN__NAME);
    createEAttribute(dslPackagePinEClass, DSL_PACKAGE_PIN__PIN_NO);
    createEAttribute(dslPackagePinEClass, DSL_PACKAGE_PIN__ALT_NAMES);

    dslPeripheralEClass = createEClass(DSL_PERIPHERAL);
    createEAttribute(dslPeripheralEClass, DSL_PERIPHERAL__NAME);
    createEReference(dslPeripheralEClass, DSL_PERIPHERAL__COMPLIANT);
    createEReference(dslPeripheralEClass, DSL_PERIPHERAL__OPERATIONS);

    dslOperationImplEClass = createEClass(DSL_OPERATION_IMPL);
    createEReference(dslOperationImplEClass, DSL_OPERATION_IMPL__RETTYPE);
    createEReference(dslOperationImplEClass, DSL_OPERATION_IMPL__IMPL_OPERATION);
    createEReference(dslOperationImplEClass, DSL_OPERATION_IMPL__PARAMS);
    createEReference(dslOperationImplEClass, DSL_OPERATION_IMPL__EXPRESSION);

    dslPeripheralExpressionEClass = createEClass(DSL_PERIPHERAL_EXPRESSION);

    dslRegisterReadEClass = createEClass(DSL_REGISTER_READ);
    createEReference(dslRegisterReadEClass, DSL_REGISTER_READ__REF);
    createEReference(dslRegisterReadEClass, DSL_REGISTER_READ__VAR);

    dslRegisterWriteEClass = createEClass(DSL_REGISTER_WRITE);
    createEReference(dslRegisterWriteEClass, DSL_REGISTER_WRITE__REF);
    createEReference(dslRegisterWriteEClass, DSL_REGISTER_WRITE__VAR);

    dslValueEClass = createEClass(DSL_VALUE);

    dslRefVariableEClass = createEClass(DSL_REF_VARIABLE);
    createEReference(dslRefVariableEClass, DSL_REF_VARIABLE__REF);

    dslFunctionEClass = createEClass(DSL_FUNCTION);
    createEReference(dslFunctionEClass, DSL_FUNCTION__TYPE);
    createEAttribute(dslFunctionEClass, DSL_FUNCTION__NAME);
    createEReference(dslFunctionEClass, DSL_FUNCTION__PARAMS);
    createEReference(dslFunctionEClass, DSL_FUNCTION__EXPRESSIONS);

    dslTypedParameterEClass = createEClass(DSL_TYPED_PARAMETER);
    createEReference(dslTypedParameterEClass, DSL_TYPED_PARAMETER__PARAM_TYPE);
    createEAttribute(dslTypedParameterEClass, DSL_TYPED_PARAMETER__NAME);

    dslCallFunctionEClass = createEClass(DSL_CALL_FUNCTION);
    createEReference(dslCallFunctionEClass, DSL_CALL_FUNCTION__VARIABLES);
    createEReference(dslCallFunctionEClass, DSL_CALL_FUNCTION__FUNCTION);
    createEReference(dslCallFunctionEClass, DSL_CALL_FUNCTION__PARAMS);

    dslDefineVariableEClass = createEClass(DSL_DEFINE_VARIABLE);
    createEAttribute(dslDefineVariableEClass, DSL_DEFINE_VARIABLE__NAME);
    createEReference(dslDefineVariableEClass, DSL_DEFINE_VARIABLE__VAL);

    dslReturnEClass = createEClass(DSL_RETURN);
    createEReference(dslReturnEClass, DSL_RETURN__VAL);

    dslTypeEClass = createEClass(DSL_TYPE);
    createEAttribute(dslTypeEClass, DSL_TYPE__TYPE);

    dslVariableEClass = createEClass(DSL_VARIABLE);
    createEReference(dslVariableEClass, DSL_VARIABLE__VAR);

    dslExpressionEClass = createEClass(DSL_EXPRESSION);

    xBinaryExpressionEClass = createEClass(XBINARY_EXPRESSION);
    createEReference(xBinaryExpressionEClass, XBINARY_EXPRESSION__LEFT);
    createEAttribute(xBinaryExpressionEClass, XBINARY_EXPRESSION__OP);
    createEReference(xBinaryExpressionEClass, XBINARY_EXPRESSION__RIGHT);

    xBlockExpressionEClass = createEClass(XBLOCK_EXPRESSION);
    createEReference(xBlockExpressionEClass, XBLOCK_EXPRESSION__EXPRESSION);

    xPrimaryExpressionEClass = createEClass(XPRIMARY_EXPRESSION);

    xConditionalExpressionEClass = createEClass(XCONDITIONAL_EXPRESSION);

    xConditionalBlockExpressionEClass = createEClass(XCONDITIONAL_BLOCK_EXPRESSION);
    createEReference(xConditionalBlockExpressionEClass, XCONDITIONAL_BLOCK_EXPRESSION__EXPRESSION);

    xConditionalUnaryExpressionEClass = createEClass(XCONDITIONAL_UNARY_EXPRESSION);
    createEReference(xConditionalUnaryExpressionEClass, XCONDITIONAL_UNARY_EXPRESSION__EXPRESSION);

    xBoolExpressionEClass = createEClass(XBOOL_EXPRESSION);
    createEReference(xBoolExpressionEClass, XBOOL_EXPRESSION__LEFT);
    createEAttribute(xBoolExpressionEClass, XBOOL_EXPRESSION__OP);
    createEReference(xBoolExpressionEClass, XBOOL_EXPRESSION__RIGHT);

    xBoolTypeEClass = createEClass(XBOOL_TYPE);

    xBitAccessEClass = createEClass(XBIT_ACCESS);
    createEReference(xBitAccessEClass, XBIT_ACCESS__BIT);

    xRegisterAccessEClass = createEClass(XREGISTER_ACCESS);
    createEReference(xRegisterAccessEClass, XREGISTER_ACCESS__REG);

    xVariableAccessEClass = createEClass(XVARIABLE_ACCESS);
    createEReference(xVariableAccessEClass, XVARIABLE_ACCESS__VAR);

    xParamVariableAccessEClass = createEClass(XPARAM_VARIABLE_ACCESS);
    createEReference(xParamVariableAccessEClass, XPARAM_VARIABLE_ACCESS__VAR);

    xIfExpressionEClass = createEClass(XIF_EXPRESSION);
    createEReference(xIfExpressionEClass, XIF_EXPRESSION__IF);
    createEReference(xIfExpressionEClass, XIF_EXPRESSION__THEN);
    createEReference(xIfExpressionEClass, XIF_EXPRESSION__ELSE);

    xWhileExpressionEClass = createEClass(XWHILE_EXPRESSION);
    createEReference(xWhileExpressionEClass, XWHILE_EXPRESSION__PREDICATE);
    createEReference(xWhileExpressionEClass, XWHILE_EXPRESSION__BODY);

    xForExpressionEClass = createEClass(XFOR_EXPRESSION);
    createEReference(xForExpressionEClass, XFOR_EXPRESSION__INIT);
    createEReference(xForExpressionEClass, XFOR_EXPRESSION__PREDICATE);
    createEReference(xForExpressionEClass, XFOR_EXPRESSION__LOOP);
    createEReference(xForExpressionEClass, XFOR_EXPRESSION__BODY);

    xDoWhileExpressionEClass = createEClass(XDO_WHILE_EXPRESSION);
    createEReference(xDoWhileExpressionEClass, XDO_WHILE_EXPRESSION__BODY);
    createEReference(xDoWhileExpressionEClass, XDO_WHILE_EXPRESSION__PREDICATE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    datasheetEClass.getESuperTypes().add(this.getModel());
    dslProtocolEClass.getESuperTypes().add(this.getModel());
    dslMcuEClass.getESuperTypes().add(this.getDslComponent());
    dslDeviceEClass.getESuperTypes().add(this.getDslComponent());
    dslRegisterReadEClass.getESuperTypes().add(this.getDslExpression());
    dslRegisterWriteEClass.getESuperTypes().add(this.getDslExpression());
    dslCallFunctionEClass.getESuperTypes().add(this.getDslExpression());
    dslDefineVariableEClass.getESuperTypes().add(this.getDslExpression());
    dslReturnEClass.getESuperTypes().add(this.getDslExpression());
    dslExpressionEClass.getESuperTypes().add(this.getDslPeripheralExpression());
    xBinaryExpressionEClass.getESuperTypes().add(this.getDslExpression());
    xBlockExpressionEClass.getESuperTypes().add(this.getDslExpression());
    xPrimaryExpressionEClass.getESuperTypes().add(this.getDslExpression());
    xConditionalBlockExpressionEClass.getESuperTypes().add(this.getXConditionalExpression());
    xConditionalUnaryExpressionEClass.getESuperTypes().add(this.getXConditionalExpression());
    xBoolExpressionEClass.getESuperTypes().add(this.getXConditionalExpression());
    xBoolTypeEClass.getESuperTypes().add(this.getDslValue());
    xBoolTypeEClass.getESuperTypes().add(this.getXConditionalExpression());
    xBitAccessEClass.getESuperTypes().add(this.getXBoolType());
    xRegisterAccessEClass.getESuperTypes().add(this.getXBoolType());
    xVariableAccessEClass.getESuperTypes().add(this.getXBoolType());
    xParamVariableAccessEClass.getESuperTypes().add(this.getXBoolType());
    xIfExpressionEClass.getESuperTypes().add(this.getXPrimaryExpression());
    xWhileExpressionEClass.getESuperTypes().add(this.getXPrimaryExpression());
    xForExpressionEClass.getESuperTypes().add(this.getXPrimaryExpression());
    xDoWhileExpressionEClass.getESuperTypes().add(this.getXPrimaryExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(datasheetEClass, Datasheet.class, "Datasheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDatasheet_Revision(), ecorePackage.getEString(), "revision", null, 0, 1, Datasheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatasheet_Imports(), this.getImport(), null, "imports", null, 0, -1, Datasheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatasheet_Components(), this.getDslComponent(), null, "components", null, 0, -1, Datasheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslProtocolEClass, DslProtocol.class, "DslProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDslProtocol_Operations(), this.getDslOperation(), null, "operations", null, 0, -1, DslProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslOperationEClass, DslOperation.class, "DslOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDslOperation_Type(), this.getDslType(), null, "type", null, 0, 1, DslOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDslOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDslOperation_ParamType(), this.getDslType(), null, "paramType", null, 0, -1, DslOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDslOperation_Paramname(), ecorePackage.getEString(), "paramname", null, 0, -1, DslOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslComponentEClass, DslComponent.class, "DslComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDslComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDslComponent_Pins(), this.getDslPin(), null, "pins", null, 0, -1, DslComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDslComponent_Ports(), this.getDslPort(), null, "ports", null, 0, -1, DslComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDslComponent_Packages(), this.getDslPackage(), null, "packages", null, 0, -1, DslComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslMcuEClass, DslMcu.class, "DslMcu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDslMcu_Peripherals(), this.getDslPeripheral(), null, "peripherals", null, 0, -1, DslMcu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDslMcu_Sfr(), this.getDslRegister(), null, "sfr", null, 0, -1, DslMcu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslDeviceEClass, DslDevice.class, "DslDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDslDevice_Functions(), this.getDslFunction(), null, "functions", null, 0, -1, DslDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDslDevice_Registers(), this.getDslRegister(), null, "registers", null, 0, -1, DslDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslPortEClass, DslPort.class, "DslPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDslPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDslPort_Pins(), this.getDslPin(), null, "pins", null, 0, -1, DslPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslPinEClass, DslPin.class, "DslPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDslPin_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslRegisterEClass, DslRegister.class, "DslRegister", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDslRegister_Address(), ecorePackage.getEString(), "address", null, 0, 1, DslRegister.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDslRegister_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslRegister.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDslRegister_Bits(), this.getDslBit(), null, "bits", null, 0, -1, DslRegister.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslBitEClass, DslBit.class, "DslBit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDslBit_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslBit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslPackageEClass, DslPackage.class, "DslPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDslPackage_Names(), ecorePackage.getEString(), "names", null, 0, -1, DslPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDslPackage_Pins(), this.getDslPackagePin(), null, "pins", null, 0, -1, DslPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslPackagePinEClass, DslPackagePin.class, "DslPackagePin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDslPackagePin_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslPackagePin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDslPackagePin_PinNo(), ecorePackage.getEString(), "pinNo", null, 0, 1, DslPackagePin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDslPackagePin_AltNames(), ecorePackage.getEString(), "altNames", null, 0, -1, DslPackagePin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslPeripheralEClass, DslPeripheral.class, "DslPeripheral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDslPeripheral_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslPeripheral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDslPeripheral_Compliant(), this.getDslProtocol(), null, "compliant", null, 0, -1, DslPeripheral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDslPeripheral_Operations(), this.getDslOperationImpl(), null, "operations", null, 0, -1, DslPeripheral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslOperationImplEClass, DslOperationImpl.class, "DslOperationImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDslOperationImpl_Rettype(), this.getDslType(), null, "rettype", null, 0, 1, DslOperationImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDslOperationImpl_ImplOperation(), this.getDslOperation(), null, "implOperation", null, 0, 1, DslOperationImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDslOperationImpl_Params(), this.getDslTypedParameter(), null, "params", null, 0, -1, DslOperationImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDslOperationImpl_Expression(), this.getDslPeripheralExpression(), null, "expression", null, 0, -1, DslOperationImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslPeripheralExpressionEClass, DslPeripheralExpression.class, "DslPeripheralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dslRegisterReadEClass, DslRegisterRead.class, "DslRegisterRead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDslRegisterRead_Ref(), this.getXBoolType(), null, "ref", null, 0, 1, DslRegisterRead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDslRegisterRead_Var(), this.getXBoolType(), null, "var", null, 0, 1, DslRegisterRead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslRegisterWriteEClass, DslRegisterWrite.class, "DslRegisterWrite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDslRegisterWrite_Ref(), this.getXBoolType(), null, "ref", null, 0, 1, DslRegisterWrite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDslRegisterWrite_Var(), this.getDslValue(), null, "var", null, 0, 1, DslRegisterWrite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslValueEClass, DslValue.class, "DslValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dslRefVariableEClass, DslRefVariable.class, "DslRefVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDslRefVariable_Ref(), this.getDslVariable(), null, "ref", null, 0, 1, DslRefVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslFunctionEClass, DslFunction.class, "DslFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDslFunction_Type(), this.getDslType(), null, "type", null, 0, 1, DslFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDslFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDslFunction_Params(), this.getDslTypedParameter(), null, "params", null, 0, -1, DslFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDslFunction_Expressions(), this.getDslExpression(), null, "expressions", null, 0, -1, DslFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslTypedParameterEClass, DslTypedParameter.class, "DslTypedParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDslTypedParameter_ParamType(), this.getDslType(), null, "paramType", null, 0, 1, DslTypedParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDslTypedParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslTypedParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslCallFunctionEClass, DslCallFunction.class, "DslCallFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDslCallFunction_Variables(), this.getXBoolType(), null, "variables", null, 0, 1, DslCallFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDslCallFunction_Function(), this.getDslOperation(), null, "function", null, 0, 1, DslCallFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDslCallFunction_Params(), this.getXConditionalExpression(), null, "params", null, 0, -1, DslCallFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslDefineVariableEClass, DslDefineVariable.class, "DslDefineVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDslDefineVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, DslDefineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDslDefineVariable_Val(), this.getXBoolType(), null, "val", null, 0, 1, DslDefineVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslReturnEClass, DslReturn.class, "DslReturn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDslReturn_Val(), this.getXBoolType(), null, "val", null, 0, 1, DslReturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslTypeEClass, DslType.class, "DslType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDslType_Type(), ecorePackage.getEString(), "type", null, 0, 1, DslType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslVariableEClass, DslVariable.class, "DslVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDslVariable_Var(), this.getDslDefineVariable(), null, "var", null, 0, 1, DslVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslExpressionEClass, DslExpression.class, "DslExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xBinaryExpressionEClass, XBinaryExpression.class, "XBinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXBinaryExpression_Left(), this.getDslVariable(), null, "left", null, 0, 1, XBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXBinaryExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, XBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXBinaryExpression_Right(), this.getDslExpression(), null, "right", null, 0, 1, XBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xBlockExpressionEClass, XBlockExpression.class, "XBlockExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXBlockExpression_Expression(), this.getDslExpression(), null, "expression", null, 0, 1, XBlockExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xPrimaryExpressionEClass, XPrimaryExpression.class, "XPrimaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xConditionalExpressionEClass, XConditionalExpression.class, "XConditionalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xConditionalBlockExpressionEClass, XConditionalBlockExpression.class, "XConditionalBlockExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXConditionalBlockExpression_Expression(), this.getXConditionalExpression(), null, "expression", null, 0, 1, XConditionalBlockExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xConditionalUnaryExpressionEClass, XConditionalUnaryExpression.class, "XConditionalUnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXConditionalUnaryExpression_Expression(), this.getXConditionalExpression(), null, "expression", null, 0, 1, XConditionalUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xBoolExpressionEClass, XBoolExpression.class, "XBoolExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXBoolExpression_Left(), this.getXBoolType(), null, "left", null, 0, 1, XBoolExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXBoolExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, XBoolExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXBoolExpression_Right(), this.getXConditionalExpression(), null, "right", null, 0, 1, XBoolExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xBoolTypeEClass, XBoolType.class, "XBoolType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xBitAccessEClass, XBitAccess.class, "XBitAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXBitAccess_Bit(), this.getDslBit(), null, "bit", null, 0, 1, XBitAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xRegisterAccessEClass, XRegisterAccess.class, "XRegisterAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXRegisterAccess_Reg(), this.getDslRegister(), null, "reg", null, 0, 1, XRegisterAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xVariableAccessEClass, XVariableAccess.class, "XVariableAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXVariableAccess_Var(), this.getDslDefineVariable(), null, "var", null, 0, 1, XVariableAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xParamVariableAccessEClass, XParamVariableAccess.class, "XParamVariableAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXParamVariableAccess_Var(), this.getDslTypedParameter(), null, "var", null, 0, 1, XParamVariableAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xIfExpressionEClass, XIfExpression.class, "XIfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXIfExpression_If(), this.getXConditionalExpression(), null, "if", null, 0, 1, XIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXIfExpression_Then(), this.getDslExpression(), null, "then", null, 0, 1, XIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXIfExpression_Else(), this.getDslExpression(), null, "else", null, 0, 1, XIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xWhileExpressionEClass, XWhileExpression.class, "XWhileExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXWhileExpression_Predicate(), this.getXConditionalExpression(), null, "predicate", null, 0, 1, XWhileExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXWhileExpression_Body(), this.getDslExpression(), null, "body", null, 0, 1, XWhileExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xForExpressionEClass, XForExpression.class, "XForExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXForExpression_Init(), this.getDslExpression(), null, "init", null, 0, 1, XForExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXForExpression_Predicate(), this.getXConditionalExpression(), null, "predicate", null, 0, 1, XForExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXForExpression_Loop(), this.getDslExpression(), null, "loop", null, 0, 1, XForExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXForExpression_Body(), this.getDslExpression(), null, "body", null, 0, 1, XForExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xDoWhileExpressionEClass, XDoWhileExpression.class, "XDoWhileExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXDoWhileExpression_Body(), this.getDslExpression(), null, "body", null, 0, 1, XDoWhileExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXDoWhileExpression_Predicate(), this.getXConditionalExpression(), null, "predicate", null, 0, 1, XDoWhileExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SpecDslPackageImpl
