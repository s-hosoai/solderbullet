/**
 * <copyright>
 * </copyright>
 *

 */
package jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl;

import java.util.Collection;

import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperation;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperationImpl;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPeripheralExpression;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslType;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslTypedParameter;
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
 * An implementation of the model object '<em><b>Dsl Operation Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslOperationImplImpl#getRettype <em>Rettype</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslOperationImplImpl#getImplOperation <em>Impl Operation</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslOperationImplImpl#getParams <em>Params</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslOperationImplImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DslOperationImplImpl extends MinimalEObjectImpl.Container implements DslOperationImpl
{
  /**
   * The cached value of the '{@link #getRettype() <em>Rettype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRettype()
   * @generated
   * @ordered
   */
  protected DslType rettype;

  /**
   * The cached value of the '{@link #getImplOperation() <em>Impl Operation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplOperation()
   * @generated
   * @ordered
   */
  protected DslOperation implOperation;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<DslTypedParameter> params;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected EList<DslPeripheralExpression> expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DslOperationImplImpl()
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
    return SpecDslPackage.Literals.DSL_OPERATION_IMPL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslType getRettype()
  {
    return rettype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRettype(DslType newRettype, NotificationChain msgs)
  {
    DslType oldRettype = rettype;
    rettype = newRettype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecDslPackage.DSL_OPERATION_IMPL__RETTYPE, oldRettype, newRettype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRettype(DslType newRettype)
  {
    if (newRettype != rettype)
    {
      NotificationChain msgs = null;
      if (rettype != null)
        msgs = ((InternalEObject)rettype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpecDslPackage.DSL_OPERATION_IMPL__RETTYPE, null, msgs);
      if (newRettype != null)
        msgs = ((InternalEObject)newRettype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpecDslPackage.DSL_OPERATION_IMPL__RETTYPE, null, msgs);
      msgs = basicSetRettype(newRettype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecDslPackage.DSL_OPERATION_IMPL__RETTYPE, newRettype, newRettype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslOperation getImplOperation()
  {
    if (implOperation != null && implOperation.eIsProxy())
    {
      InternalEObject oldImplOperation = (InternalEObject)implOperation;
      implOperation = (DslOperation)eResolveProxy(oldImplOperation);
      if (implOperation != oldImplOperation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecDslPackage.DSL_OPERATION_IMPL__IMPL_OPERATION, oldImplOperation, implOperation));
      }
    }
    return implOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslOperation basicGetImplOperation()
  {
    return implOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplOperation(DslOperation newImplOperation)
  {
    DslOperation oldImplOperation = implOperation;
    implOperation = newImplOperation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecDslPackage.DSL_OPERATION_IMPL__IMPL_OPERATION, oldImplOperation, implOperation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DslTypedParameter> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<DslTypedParameter>(DslTypedParameter.class, this, SpecDslPackage.DSL_OPERATION_IMPL__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DslPeripheralExpression> getExpression()
  {
    if (expression == null)
    {
      expression = new EObjectContainmentEList<DslPeripheralExpression>(DslPeripheralExpression.class, this, SpecDslPackage.DSL_OPERATION_IMPL__EXPRESSION);
    }
    return expression;
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
      case SpecDslPackage.DSL_OPERATION_IMPL__RETTYPE:
        return basicSetRettype(null, msgs);
      case SpecDslPackage.DSL_OPERATION_IMPL__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case SpecDslPackage.DSL_OPERATION_IMPL__EXPRESSION:
        return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
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
      case SpecDslPackage.DSL_OPERATION_IMPL__RETTYPE:
        return getRettype();
      case SpecDslPackage.DSL_OPERATION_IMPL__IMPL_OPERATION:
        if (resolve) return getImplOperation();
        return basicGetImplOperation();
      case SpecDslPackage.DSL_OPERATION_IMPL__PARAMS:
        return getParams();
      case SpecDslPackage.DSL_OPERATION_IMPL__EXPRESSION:
        return getExpression();
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
      case SpecDslPackage.DSL_OPERATION_IMPL__RETTYPE:
        setRettype((DslType)newValue);
        return;
      case SpecDslPackage.DSL_OPERATION_IMPL__IMPL_OPERATION:
        setImplOperation((DslOperation)newValue);
        return;
      case SpecDslPackage.DSL_OPERATION_IMPL__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends DslTypedParameter>)newValue);
        return;
      case SpecDslPackage.DSL_OPERATION_IMPL__EXPRESSION:
        getExpression().clear();
        getExpression().addAll((Collection<? extends DslPeripheralExpression>)newValue);
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
      case SpecDslPackage.DSL_OPERATION_IMPL__RETTYPE:
        setRettype((DslType)null);
        return;
      case SpecDslPackage.DSL_OPERATION_IMPL__IMPL_OPERATION:
        setImplOperation((DslOperation)null);
        return;
      case SpecDslPackage.DSL_OPERATION_IMPL__PARAMS:
        getParams().clear();
        return;
      case SpecDslPackage.DSL_OPERATION_IMPL__EXPRESSION:
        getExpression().clear();
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
      case SpecDslPackage.DSL_OPERATION_IMPL__RETTYPE:
        return rettype != null;
      case SpecDslPackage.DSL_OPERATION_IMPL__IMPL_OPERATION:
        return implOperation != null;
      case SpecDslPackage.DSL_OPERATION_IMPL__PARAMS:
        return params != null && !params.isEmpty();
      case SpecDslPackage.DSL_OPERATION_IMPL__EXPRESSION:
        return expression != null && !expression.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DslOperationImplImpl
