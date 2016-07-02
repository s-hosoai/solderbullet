/**
 * <copyright>
 * </copyright>
 *

 */
package jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl;

import java.util.Collection;

import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslComponent;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackage;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPin;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPort;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslComponentImpl#getPins <em>Pins</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslComponentImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslComponentImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DslComponentImpl extends MinimalEObjectImpl.Container implements DslComponent
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
   * The cached value of the '{@link #getPins() <em>Pins</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPins()
   * @generated
   * @ordered
   */
  protected EList<DslPin> pins;

  /**
   * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPorts()
   * @generated
   * @ordered
   */
  protected EList<DslPort> ports;

  /**
   * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackages()
   * @generated
   * @ordered
   */
  protected EList<DslPackage> packages;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DslComponentImpl()
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
    return SpecDslPackage.Literals.DSL_COMPONENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpecDslPackage.DSL_COMPONENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DslPin> getPins()
  {
    if (pins == null)
    {
      pins = new EObjectContainmentEList<DslPin>(DslPin.class, this, SpecDslPackage.DSL_COMPONENT__PINS);
    }
    return pins;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DslPort> getPorts()
  {
    if (ports == null)
    {
      ports = new EObjectContainmentEList<DslPort>(DslPort.class, this, SpecDslPackage.DSL_COMPONENT__PORTS);
    }
    return ports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DslPackage> getPackages()
  {
    if (packages == null)
    {
      packages = new EObjectContainmentEList<DslPackage>(DslPackage.class, this, SpecDslPackage.DSL_COMPONENT__PACKAGES);
    }
    return packages;
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
      case SpecDslPackage.DSL_COMPONENT__PINS:
        return ((InternalEList<?>)getPins()).basicRemove(otherEnd, msgs);
      case SpecDslPackage.DSL_COMPONENT__PORTS:
        return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
      case SpecDslPackage.DSL_COMPONENT__PACKAGES:
        return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
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
      case SpecDslPackage.DSL_COMPONENT__NAME:
        return getName();
      case SpecDslPackage.DSL_COMPONENT__PINS:
        return getPins();
      case SpecDslPackage.DSL_COMPONENT__PORTS:
        return getPorts();
      case SpecDslPackage.DSL_COMPONENT__PACKAGES:
        return getPackages();
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
      case SpecDslPackage.DSL_COMPONENT__NAME:
        setName((String)newValue);
        return;
      case SpecDslPackage.DSL_COMPONENT__PINS:
        getPins().clear();
        getPins().addAll((Collection<? extends DslPin>)newValue);
        return;
      case SpecDslPackage.DSL_COMPONENT__PORTS:
        getPorts().clear();
        getPorts().addAll((Collection<? extends DslPort>)newValue);
        return;
      case SpecDslPackage.DSL_COMPONENT__PACKAGES:
        getPackages().clear();
        getPackages().addAll((Collection<? extends DslPackage>)newValue);
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
      case SpecDslPackage.DSL_COMPONENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SpecDslPackage.DSL_COMPONENT__PINS:
        getPins().clear();
        return;
      case SpecDslPackage.DSL_COMPONENT__PORTS:
        getPorts().clear();
        return;
      case SpecDslPackage.DSL_COMPONENT__PACKAGES:
        getPackages().clear();
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
      case SpecDslPackage.DSL_COMPONENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SpecDslPackage.DSL_COMPONENT__PINS:
        return pins != null && !pins.isEmpty();
      case SpecDslPackage.DSL_COMPONENT__PORTS:
        return ports != null && !ports.isEmpty();
      case SpecDslPackage.DSL_COMPONENT__PACKAGES:
        return packages != null && !packages.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //DslComponentImpl
