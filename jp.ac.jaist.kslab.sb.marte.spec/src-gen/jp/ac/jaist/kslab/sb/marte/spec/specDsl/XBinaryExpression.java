/**
 * <copyright>
 * </copyright>
 *

 */
package jp.ac.jaist.kslab.sb.marte.spec.specDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XBinary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBinaryExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBinaryExpression#getOp <em>Op</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBinaryExpression#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getXBinaryExpression()
 * @model
 * @generated
 */
public interface XBinaryExpression extends DslExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(DslVariable)
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getXBinaryExpression_Left()
   * @model containment="true"
   * @generated
   */
  DslVariable getLeft();

  /**
   * Sets the value of the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBinaryExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(DslVariable value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getXBinaryExpression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBinaryExpression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(DslExpression)
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getXBinaryExpression_Right()
   * @model containment="true"
   * @generated
   */
  DslExpression getRight();

  /**
   * Sets the value of the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XBinaryExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(DslExpression value);

} // XBinaryExpression
