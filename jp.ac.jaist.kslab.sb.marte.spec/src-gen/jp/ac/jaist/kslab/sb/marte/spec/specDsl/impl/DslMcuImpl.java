/**
 * <copyright>
 * </copyright>
 *

 */
package jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl;

import java.util.Collection;

import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslMcu;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPeripheral;
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
 * An implementation of the model object '<em><b>Dsl Mcu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslMcuImpl#getPeripherals <em>Peripherals</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslMcuImpl#getSfr <em>Sfr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DslMcuImpl extends DslComponentImpl implements DslMcu
{
  /**
   * The cached value of the '{@link #getPeripherals() <em>Peripherals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeripherals()
   * @generated
   * @ordered
   */
  protected EList<DslPeripheral> peripherals;

  /**
   * The cached value of the '{@link #getSfr() <em>Sfr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSfr()
   * @generated
   * @ordered
   */
  protected EList<DslRegister> sfr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DslMcuImpl()
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
    return SpecDslPackage.Literals.DSL_MCU;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DslPeripheral> getPeripherals()
  {
    if (peripherals == null)
    {
      peripherals = new EObjectContainmentEList<DslPeripheral>(DslPeripheral.class, this, SpecDslPackage.DSL_MCU__PERIPHERALS);
    }
    return peripherals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DslRegister> getSfr()
  {
    if (sfr == null)
    {
      sfr = new EObjectContainmentEList<DslRegister>(DslRegister.class, this, SpecDslPackage.DSL_MCU__SFR);
    }
    return sfr;
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
      case SpecDslPackage.DSL_MCU__PERIPHERALS:
        return ((InternalEList<?>)getPeripherals()).basicRemove(otherEnd, msgs);
      case SpecDslPackage.DSL_MCU__SFR:
        return ((InternalEList<?>)getSfr()).basicRemove(otherEnd, msgs);
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
      case SpecDslPackage.DSL_MCU__PERIPHERALS:
        return getPeripherals();
      case SpecDslPackage.DSL_MCU__SFR:
        return getSfr();
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
      case SpecDslPackage.DSL_MCU__PERIPHERALS:
        getPeripherals().clear();
        getPeripherals().addAll((Collection<? extends DslPeripheral>)newValue);
        return;
      case SpecDslPackage.DSL_MCU__SFR:
        getSfr().clear();
        getSfr().addAll((Collection<? extends DslRegister>)newValue);
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
      case SpecDslPackage.DSL_MCU__PERIPHERALS:
        getPeripherals().clear();
        return;
      case SpecDslPackage.DSL_MCU__SFR:
        getSfr().clear();
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
      case SpecDslPackage.DSL_MCU__PERIPHERALS:
        return peripherals != null && !peripherals.isEmpty();
      case SpecDslPackage.DSL_MCU__SFR:
        return sfr != null && !sfr.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DslMcuImpl
