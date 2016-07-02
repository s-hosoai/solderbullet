/**
 */
package MARTE.MARTE_DesignModel.HRM.HwGeneral;

import MARTE.MARTE_Foundations.GRM.Resource;

import MARTE_Library.BasicNFP_Types.NFP_Frequency;
import MARTE_Library.BasicNFP_Types.NFP_String;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getDescription <em>Description</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getP_HW_Services <em>PHW Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getR_HW_Services <em>RHW Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getOwnedHW <em>Owned HW</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getEndPoints <em>End Points</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getOperations <em>Operations</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getActivities <em>Activities</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage#getHwResource()
 * @model
 * @generated
 */
public interface HwResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(NFP_String)
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage#getHwResource_Description()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_String getDescription();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(NFP_String value);

	/**
	 * Returns the value of the '<em><b>PHW Services</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PHW Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PHW Services</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage#getHwResource_P_HW_Services()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResourceService" containment="true" ordered="false"
	 * @generated
	 */
	EList getP_HW_Services();

	/**
	 * Returns the value of the '<em><b>RHW Services</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RHW Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RHW Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage#getHwResource_R_HW_Services()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResourceService" ordered="false"
	 * @generated
	 */
	EList getR_HW_Services();

	/**
	 * Returns the value of the '<em><b>Owned HW</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned HW</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned HW</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage#getHwResource_OwnedHW()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource" containment="true" ordered="false"
	 * @generated
	 */
	EList getOwnedHW();

	/**
	 * Returns the value of the '<em><b>End Points</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwEndPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Points</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage#getHwResource_EndPoints()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwEndPoint" containment="true" ordered="false"
	 * @generated
	 */
	EList getEndPoints();

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' containment reference.
	 * @see #setFrequency(NFP_Frequency)
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage#getHwResource_Frequency()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Frequency getFrequency();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getFrequency <em>Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' containment reference.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(NFP_Frequency value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage#getHwResource_Operations()
	 * @model type="org.eclipse.uml2.uml.Operation" containment="true"
	 * @generated
	 */
	EList getOperations();

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage#getHwResource_Activities()
	 * @model type="org.eclipse.uml2.uml.Activity" containment="true"
	 * @generated
	 */
	EList getActivities();

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
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage#getHwResource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // HwResource
