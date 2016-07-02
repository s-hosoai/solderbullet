/**
 */
package MARTE.MARTE_DesignModel.HRM.HwGeneral;

import MARTE.MARTE_Foundations.GRM.GrService;

import MARTE_Library.BasicNFP_Types.NFP_Power;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Resource Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResourceService#getConsumption <em>Consumption</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResourceService#getDissipation <em>Dissipation</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage#getHwResourceService()
 * @model
 * @generated
 */
public interface HwResourceService extends GrService {
	/**
	 * Returns the value of the '<em><b>Consumption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumption</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumption</em>' containment reference.
	 * @see #setConsumption(NFP_Power)
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage#getHwResourceService_Consumption()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Power getConsumption();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResourceService#getConsumption <em>Consumption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumption</em>' containment reference.
	 * @see #getConsumption()
	 * @generated
	 */
	void setConsumption(NFP_Power value);

	/**
	 * Returns the value of the '<em><b>Dissipation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dissipation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dissipation</em>' containment reference.
	 * @see #setDissipation(NFP_Power)
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage#getHwResourceService_Dissipation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Power getDissipation();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResourceService#getDissipation <em>Dissipation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dissipation</em>' containment reference.
	 * @see #getDissipation()
	 * @generated
	 */
	void setDissipation(NFP_Power value);

} // HwResourceService
