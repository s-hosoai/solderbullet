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
 * A representation of the model object '<em><b>Dsl Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperation#getType <em>Type</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperation#getName <em>Name</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperation#getParamType <em>Param Type</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperation#getParamname <em>Paramname</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getDslOperation()
 * @model
 * @generated
 */
public interface DslOperation extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(DslType)
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getDslOperation_Type()
   * @model containment="true"
   * @generated
   */
  DslType getType();

  /**
   * Sets the value of the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperation#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(DslType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getDslOperation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslOperation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Param Type</b></em>' containment reference list.
   * The list contents are of type {@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param Type</em>' containment reference list.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getDslOperation_ParamType()
   * @model containment="true"
   * @generated
   */
  EList<DslType> getParamType();

  /**
   * Returns the value of the '<em><b>Paramname</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paramname</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paramname</em>' attribute list.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getDslOperation_Paramname()
   * @model unique="false"
   * @generated
   */
  EList<String> getParamname();

} // DslOperation
