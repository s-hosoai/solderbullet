/**
 * <copyright>
 * </copyright>
 *

 */
package jp.ac.jaist.kslab.sb.marte.spec.specDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XWhile Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XWhileExpression#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XWhileExpression#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getXWhileExpression()
 * @model
 * @generated
 */
public interface XWhileExpression extends XPrimaryExpression
{
  /**
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference.
   * @see #setPredicate(XConditionalExpression)
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getXWhileExpression_Predicate()
   * @model containment="true"
   * @generated
   */
  XConditionalExpression getPredicate();

  /**
   * Sets the value of the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XWhileExpression#getPredicate <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate</em>' containment reference.
   * @see #getPredicate()
   * @generated
   */
  void setPredicate(XConditionalExpression value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(DslExpression)
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getXWhileExpression_Body()
   * @model containment="true"
   * @generated
   */
  DslExpression getBody();

  /**
   * Sets the value of the '{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.XWhileExpression#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(DslExpression value);

} // XWhileExpression
