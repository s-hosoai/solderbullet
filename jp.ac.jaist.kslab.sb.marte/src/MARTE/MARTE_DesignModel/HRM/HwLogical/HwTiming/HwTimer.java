/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;
import MARTE_Library.BasicNFP_Types.NFP_Natural;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwTimer#getNbCounters <em>Nb Counters</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwTimer#getCounterWidth <em>Counter Width</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwTimer#getInputClock <em>Input Clock</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwTimingPackage#getHwTimer()
 * @model
 * @generated
 */
public interface HwTimer extends HwTimingResource {
	/**
	 * Returns the value of the '<em><b>Nb Counters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Counters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Counters</em>' containment reference.
	 * @see #setNbCounters(NFP_Natural)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwTimingPackage#getHwTimer_NbCounters()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Natural getNbCounters();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwTimer#getNbCounters <em>Nb Counters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Counters</em>' containment reference.
	 * @see #getNbCounters()
	 * @generated
	 */
	void setNbCounters(NFP_Natural value);

	/**
	 * Returns the value of the '<em><b>Counter Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter Width</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter Width</em>' containment reference.
	 * @see #setCounterWidth(NFP_DataSize)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwTimingPackage#getHwTimer_CounterWidth()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_DataSize getCounterWidth();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwTimer#getCounterWidth <em>Counter Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Width</em>' containment reference.
	 * @see #getCounterWidth()
	 * @generated
	 */
	void setCounterWidth(NFP_DataSize value);

	/**
	 * Returns the value of the '<em><b>Input Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Clock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Clock</em>' reference.
	 * @see #setInputClock(HwClock)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwTimingPackage#getHwTimer_InputClock()
	 * @model ordered="false"
	 * @generated
	 */
	HwClock getInputClock();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwTimer#getInputClock <em>Input Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Clock</em>' reference.
	 * @see #getInputClock()
	 * @generated
	 */
	void setInputClock(HwClock value);

} // HwTimer
