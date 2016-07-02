/**
 * <copyright>
 * </copyright>
 *

 */
package jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl;

import java.util.Collection;

import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackagePin;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Package Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPackagePinImpl#getName <em>Name</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPackagePinImpl#getPinNo <em>Pin No</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslPackagePinImpl#getAltNames <em>Alt Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DslPackagePinImpl extends MinimalEObjectImpl.Container implements DslPackagePin
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPinNo() <em>Pin No</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPinNo()
   * @generated
   * @ordered
   */
  protected static final String PIN_NO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPinNo() <em>Pin No</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPinNo()
   * @generated
   * @ordered
   */
  protected String pinNo = PIN_NO_EDEFAULT;

  /**
   * The cached value of the '{@link #getAltNames() <em>Alt Names</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAltNames()
   * @generated
   * @ordered
   */
  protected EList<String> altNames;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DslPackagePinImpl()
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
    return SpecDslPackage.Literals.DSL_PACKAGE_PIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecDslPackage.DSL_PACKAGE_PIN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPinNo()
  {
    return pinNo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPinNo(String newPinNo)
  {
    String oldPinNo = pinNo;
    pinNo = newPinNo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecDslPackage.DSL_PACKAGE_PIN__PIN_NO, oldPinNo, pinNo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAltNames()
  {
    if (altNames == null)
    {
      altNames = new EDataTypeEList<String>(String.class, this, SpecDslPackage.DSL_PACKAGE_PIN__ALT_NAMES);
    }
    return altNames;
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
      case SpecDslPackage.DSL_PACKAGE_PIN__NAME:
        return getName();
      case SpecDslPackage.DSL_PACKAGE_PIN__PIN_NO:
        return getPinNo();
      case SpecDslPackage.DSL_PACKAGE_PIN__ALT_NAMES:
        return getAltNames();
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
      case SpecDslPackage.DSL_PACKAGE_PIN__NAME:
        setName((String)newValue);
        return;
      case SpecDslPackage.DSL_PACKAGE_PIN__PIN_NO:
        setPinNo((String)newValue);
        return;
      case SpecDslPackage.DSL_PACKAGE_PIN__ALT_NAMES:
        getAltNames().clear();
        getAltNames().addAll((Collection<? extends String>)newValue);
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
      case SpecDslPackage.DSL_PACKAGE_PIN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SpecDslPackage.DSL_PACKAGE_PIN__PIN_NO:
        setPinNo(PIN_NO_EDEFAULT);
        return;
      case SpecDslPackage.DSL_PACKAGE_PIN__ALT_NAMES:
        getAltNames().clear();
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
      case SpecDslPackage.DSL_PACKAGE_PIN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SpecDslPackage.DSL_PACKAGE_PIN__PIN_NO:
        return PIN_NO_EDEFAULT == null ? pinNo != null : !PIN_NO_EDEFAULT.equals(pinNo);
      case SpecDslPackage.DSL_PACKAGE_PIN__ALT_NAMES:
        return altNames != null && !altNames.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", pinNo: ");
    result.append(pinNo);
    result.append(", altNames: ");
    result.append(altNames);
    result.append(')');
    return result.toString();
  }

} //DslPackagePinImpl
