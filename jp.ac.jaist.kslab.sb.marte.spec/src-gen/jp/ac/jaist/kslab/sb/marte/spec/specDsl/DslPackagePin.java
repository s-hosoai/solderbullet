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
 * A representation of the model object '<em><b>Dsl Package Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackagePin#getName <em>Name</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackagePin#getPinNo <em>Pin No</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackagePin#getAltNames <em>Alt Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getDslPackagePin()
 * @model
 * @generated
 */
public interface DslPackagePin extends EObject
{
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
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getDslPackagePin_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackagePin#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Pin No</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pin No</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pin No</em>' attribute.
   * @see #setPinNo(String)
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getDslPackagePin_PinNo()
   * @model
   * @generated
   */
  String getPinNo();

  /**
   * Sets the value of the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPackagePin#getPinNo <em>Pin No</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pin No</em>' attribute.
   * @see #getPinNo()
   * @generated
   */
  void setPinNo(String value);

  /**
   * Returns the value of the '<em><b>Alt Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alt Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alt Names</em>' attribute list.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getDslPackagePin_AltNames()
   * @model unique="false"
   * @generated
   */
  EList<String> getAltNames();

} // DslPackagePin
