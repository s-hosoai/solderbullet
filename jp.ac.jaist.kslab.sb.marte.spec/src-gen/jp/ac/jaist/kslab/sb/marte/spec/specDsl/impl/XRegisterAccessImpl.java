/**
 * <copyright>
 * </copyright>
 *

 */
package jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl;

import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegister;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XRegisterAccess;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XRegister Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.XRegisterAccessImpl#getReg <em>Reg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XRegisterAccessImpl extends XBoolTypeImpl implements XRegisterAccess
{
  /**
   * The cached value of the '{@link #getReg() <em>Reg</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReg()
   * @generated
   * @ordered
   */
  protected DslRegister reg;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XRegisterAccessImpl()
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
    return SpecDslPackage.Literals.XREGISTER_ACCESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslRegister getReg()
  {
    if (reg != null && reg.eIsProxy())
    {
      InternalEObject oldReg = (InternalEObject)reg;
      reg = (DslRegister)eResolveProxy(oldReg);
      if (reg != oldReg)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecDslPackage.XREGISTER_ACCESS__REG, oldReg, reg));
      }
    }
    return reg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslRegister basicGetReg()
  {
    return reg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReg(DslRegister newReg)
  {
    DslRegister oldReg = reg;
    reg = newReg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecDslPackage.XREGISTER_ACCESS__REG, oldReg, reg));
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
      case SpecDslPackage.XREGISTER_ACCESS__REG:
        if (resolve) return getReg();
        return basicGetReg();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpecDslPackage.XREGISTER_ACCESS__REG:
        setReg((DslRegister)newValue);
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
      case SpecDslPackage.XREGISTER_ACCESS__REG:
        setReg((DslRegister)null);
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
      case SpecDslPackage.XREGISTER_ACCESS__REG:
        return reg != null;
    }
    return super.eIsSet(featureID);
  }

} //XRegisterAccessImpl
