/**
 * <copyright>
 * </copyright>
 *

 */
package jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl;

import java.util.Collection;

import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslCallFunction;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperation;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBoolType;
import jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsl Call Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslCallFunctionImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslCallFunctionImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.impl.DslCallFunctionImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DslCallFunctionImpl extends DslExpressionImpl implements DslCallFunction
{
  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected XBoolType variables;

  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected DslOperation function;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<XConditionalExpression> params;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DslCallFunctionImpl()
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
    return SpecDslPackage.Literals.DSL_CALL_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XBoolType getVariables()
  {
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariables(XBoolType newVariables, NotificationChain msgs)
  {
    XBoolType oldVariables = variables;
    variables = newVariables;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecDslPackage.DSL_CALL_FUNCTION__VARIABLES, oldVariables, newVariables);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariables(XBoolType newVariables)
  {
    if (newVariables != variables)
    {
      NotificationChain msgs = null;
      if (variables != null)
        msgs = ((InternalEObject)variables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpecDslPackage.DSL_CALL_FUNCTION__VARIABLES, null, msgs);
      if (newVariables != null)
        msgs = ((InternalEObject)newVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpecDslPackage.DSL_CALL_FUNCTION__VARIABLES, null, msgs);
      msgs = basicSetVariables(newVariables, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecDslPackage.DSL_CALL_FUNCTION__VARIABLES, newVariables, newVariables));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslOperation getFunction()
  {
    if (function != null && function.eIsProxy())
    {
      InternalEObject oldFunction = (InternalEObject)function;
      function = (DslOperation)eResolveProxy(oldFunction);
      if (function != oldFunction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecDslPackage.DSL_CALL_FUNCTION__FUNCTION, oldFunction, function));
      }
    }
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslOperation basicGetFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction(DslOperation newFunction)
  {
    DslOperation oldFunction = function;
    function = newFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecDslPackage.DSL_CALL_FUNCTION__FUNCTION, oldFunction, function));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XConditionalExpression> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<XConditionalExpression>(XConditionalExpression.class, this, SpecDslPackage.DSL_CALL_FUNCTION__PARAMS);
    }
    return params;
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
      case SpecDslPackage.DSL_CALL_FUNCTION__VARIABLES:
        return basicSetVariables(null, msgs);
      case SpecDslPackage.DSL_CALL_FUNCTION__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
      case SpecDslPackage.DSL_CALL_FUNCTION__VARIABLES:
        return getVariables();
      case SpecDslPackage.DSL_CALL_FUNCTION__FUNCTION:
        if (resolve) return getFunction();
        return basicGetFunction();
      case SpecDslPackage.DSL_CALL_FUNCTION__PARAMS:
        return getParams();
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
      case SpecDslPackage.DSL_CALL_FUNCTION__VARIABLES:
        setVariables((XBoolType)newValue);
        return;
      case SpecDslPackage.DSL_CALL_FUNCTION__FUNCTION:
        setFunction((DslOperation)newValue);
        return;
      case SpecDslPackage.DSL_CALL_FUNCTION__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends XConditionalExpression>)newValue);
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
      case SpecDslPackage.DSL_CALL_FUNCTION__VARIABLES:
        setVariables((XBoolType)null);
        return;
      case SpecDslPackage.DSL_CALL_FUNCTION__FUNCTION:
        setFunction((DslOperation)null);
        return;
      case SpecDslPackage.DSL_CALL_FUNCTION__PARAMS:
        getParams().clear();
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
      case SpecDslPackage.DSL_CALL_FUNCTION__VARIABLES:
        return variables != null;
      case SpecDslPackage.DSL_CALL_FUNCTION__FUNCTION:
        return function != null;
      case SpecDslPackage.DSL_CALL_FUNCTION__PARAMS:
        return params != null && !params.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DslCallFunctionImpl
