/**
 * <copyright>
 * </copyright>
 *

 */
package jp.ac.jaist.kslab.sb.marte.spec.specDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Operation Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperationImpl#getRettype <em>Rettype</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperationImpl#getImplOperation <em>Impl Operation</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperationImpl#getParams <em>Params</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperationImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getDslOperationImpl()
 * @model
 * @generated
 */
public interface DslOperationImpl extends EObject
{
  /**
   * Returns the value of the '<em><b>Rettype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rettype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rettype</em>' containment reference.
   * @see #setRettype(DslType)
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getDslOperationImpl_Rettype()
   * @model containment="true"
   * @generated
   */
  DslType getRettype();

  /**
   * Sets the value of the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperationImpl#getRettype <em>Rettype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rettype</em>' containment reference.
   * @see #getRettype()
   * @generated
   */
  void setRettype(DslType value);

  /**
   * Returns the value of the '<em><b>Impl Operation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impl Operation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impl Operation</em>' reference.
   * @see #setImplOperation(DslOperation)
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getDslOperationImpl_ImplOperation()
   * @model
   * @generated
   */
  DslOperation getImplOperation();

  /**
   * Sets the value of the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperationImpl#getImplOperation <em>Impl Operation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Impl Operation</em>' reference.
   * @see #getImplOperation()
   * @generated
   */
  void setImplOperation(DslOperation value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslTypedParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getDslOperationImpl_Params()
   * @model containment="true"
   * @generated
   */
  EList<DslTypedParameter> getParams();

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
   * The list contents are of type {@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPeripheralExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference list.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getDslOperationImpl_Expression()
   * @model containment="true"
   * @generated
   */
  EList<DslPeripheralExpression> getExpression();

} // DslOperationImpl
