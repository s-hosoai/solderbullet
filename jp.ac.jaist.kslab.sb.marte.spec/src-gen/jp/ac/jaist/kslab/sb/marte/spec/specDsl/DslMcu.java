/**
 * <copyright>
 * </copyright>
 *

 */
package jp.ac.jaist.kslab.sb.marte.spec.specDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl Mcu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslMcu#getPeripherals <em>Peripherals</em>}</li>
 *   <li>{@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslMcu#getSfr <em>Sfr</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getDslMcu()
 * @model
 * @generated
 */
public interface DslMcu extends DslComponent
{
  /**
   * Returns the value of the '<em><b>Peripherals</b></em>' containment reference list.
   * The list contents are of type {@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslPeripheral}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Peripherals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Peripherals</em>' containment reference list.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getDslMcu_Peripherals()
   * @model containment="true"
   * @generated
   */
  EList<DslPeripheral> getPeripherals();

  /**
   * Returns the value of the '<em><b>Sfr</b></em>' containment reference list.
   * The list contents are of type {@link jp.ac.jaist.kslab.sb.marte.spec.specDsl.DslRegister}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sfr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sfr</em>' containment reference list.
   * @see jp.ac.jaist.kslab.sb.marte.spec.specDsl.SpecDslPackage#getDslMcu_Sfr()
   * @model containment="true"
   * @generated
   */
  EList<DslRegister> getSfr();

} // DslMcu
