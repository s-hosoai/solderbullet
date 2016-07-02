/**
 * <copyright>
 * </copyright>
 *

 */
package jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl;

import java.util.Collection;

import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslDevice;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslFunction;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegister;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslDeviceImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslDeviceImpl#getRegisters <em>Registers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DslDeviceImpl extends DslComponentImpl implements DslDevice
{
  /**
   * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctions()
   * @generated
   * @ordered
   */
  protected EList<DslFunction> functions;

  /**
   * The cached value of the '{@link #getRegisters() <em>Registers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegisters()
   * @generated
   * @ordered
   */
  protected EList<DslRegister> registers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DslDeviceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SpecDslPackage.Literals.DSL_DEVICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DslFunction> getFunctions()
  {
    if (functions == null)
    {
      functions = new EObjectContainmentEList<DslFunction>(DslFunction.class, this, SpecDslPackage.DSL_DEVICE__FUNCTIONS);
    }
    return functions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DslRegister> getRegisters()
  {
    if (registers == null)
    {
      registers = new EObjectContainmentEList<DslRegister>(DslRegister.class, this, SpecDslPackage.DSL_DEVICE__REGISTERS);
    }
    return registers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SpecDslPackage.DSL_DEVICE__FUNCTIONS:
        return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
      case SpecDslPackage.DSL_DEVICE__REGISTERS:
        return ((InternalEList<?>)getRegisters()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SpecDslPackage.DSL_DEVICE__FUNCTIONS:
        return getFunctions();
      case SpecDslPackage.DSL_DEVICE__REGISTERS:
        return getRegisters();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpecDslPackage.DSL_DEVICE__FUNCTIONS:
        getFunctions().clear();
        getFunctions().addAll((Collection<? extends DslFunction>)newValue);
        return;
      case SpecDslPackage.DSL_DEVICE__REGISTERS:
        getRegisters().clear();
        getRegisters().addAll((Collection<? extends DslRegister>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SpecDslPackage.DSL_DEVICE__FUNCTIONS:
        getFunctions().clear();
        return;
      case SpecDslPackage.DSL_DEVICE__REGISTERS:
        getRegisters().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SpecDslPackage.DSL_DEVICE__FUNCTIONS:
        return functions != null && !functions.isEmpty();
      case SpecDslPackage.DSL_DEVICE__REGISTERS:
        return registers != null && !registers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DslDeviceImpl
