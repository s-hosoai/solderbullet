/**
 * <copyright>
 * </copyright>
 *

 */
package jp.ac.jaist.kslab.sb.marte.spec.specDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XConditional Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalUnaryExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getXConditionalUnaryExpression()
 * @model
 * @generated
 */
public interface XConditionalUnaryExpression extends XConditionalExpression
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(XConditionalExpression)
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getXConditionalUnaryExpression_Expression()
   * @model containment="true"
   * @generated
   */
  XConditionalExpression getExpression();

  /**
   * Sets the value of the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XConditionalUnaryExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(XConditionalExpression value);

} // XConditionalUnaryExpression
