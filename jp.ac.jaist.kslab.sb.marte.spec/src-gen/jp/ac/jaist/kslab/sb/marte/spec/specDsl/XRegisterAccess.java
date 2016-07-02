/**
 * <copyright>
 * </copyright>
 *

 */
package jp.ac.jaist.kslab.sb.marte.spec.specDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XRegister Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XRegisterAccess#getReg <em>Reg</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getXRegisterAccess()
 * @model
 * @generated
 */
public interface XRegisterAccess extends XBoolType
{
  /**
   * Returns the value of the '<em><b>Reg</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reg</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reg</em>' reference.
   * @see #setReg(DslRegister)
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getXRegisterAccess_Reg()
   * @model
   * @generated
   */
  DslRegister getReg();

  /**
   * Sets the value of the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XRegisterAccess#getReg <em>Reg</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reg</em>' reference.
   * @see #getReg()
   * @generated
   */
  void setReg(DslRegister value);

} // XRegisterAccess
