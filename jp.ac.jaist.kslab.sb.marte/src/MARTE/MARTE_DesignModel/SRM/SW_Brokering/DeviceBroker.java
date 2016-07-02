/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Brokering;

import MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwResource;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Broker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.DeviceBroker#getAccessPolicy <em>Access Policy</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.DeviceBroker#getIsBuffered <em>Is Buffered</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.DeviceBroker#getDevices <em>Devices</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.DeviceBroker#getCloseServices <em>Close Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.DeviceBroker#getControlServices <em>Control Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.DeviceBroker#getOpenServices <em>Open Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.DeviceBroker#getReadServices <em>Read Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.DeviceBroker#getWriteServices <em>Write Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.DeviceBroker#getOperations <em>Operations</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.DeviceBroker#getActivities <em>Activities</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.DeviceBroker#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.SRM.SW_Brokering.SW_BrokeringPackage#getDeviceBroker()
 * @model
 * @generated
 */
public interface DeviceBroker extends SwResource {
	/**
	 * Returns the value of the '<em><b>Access Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.AccessPolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Policy</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Brokering.AccessPolicyKind
	 * @see #setAccessPolicy(AccessPolicyKind)
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Brokering.SW_BrokeringPackage#getDeviceBroker_AccessPolicy()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	AccessPolicyKind getAccessPolicy();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.DeviceBroker#getAccessPolicy <em>Access Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Policy</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Brokering.AccessPolicyKind
	 * @see #getAccessPolicy()
	 * @generated
	 */
	void setAccessPolicy(AccessPolicyKind value);

	/**
	 * Returns the value of the '<em><b>Is Buffered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Buffered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Buffered</em>' attribute.
	 * @see #setIsBuffered(Boolean)
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Brokering.SW_BrokeringPackage#getDeviceBroker_IsBuffered()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getIsBuffered();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.DeviceBroker#getIsBuffered <em>Is Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Buffered</em>' attribute.
	 * @see #getIsBuffered()
	 * @generated
	 */
	void setIsBuffered(Boolean value);

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Brokering.SW_BrokeringPackage#getDeviceBroker_Devices()
	 * @model type="org.eclipse.uml2.uml.TypedElement" ordered="false"
	 * @generated
	 */
	EList getDevices();

	/**
	 * Returns the value of the '<em><b>Close Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Close Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Close Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Brokering.SW_BrokeringPackage#getDeviceBroker_CloseServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getCloseServices();

	/**
	 * Returns the value of the '<em><b>Control Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Brokering.SW_BrokeringPackage#getDeviceBroker_ControlServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getControlServices();

	/**
	 * Returns the value of the '<em><b>Open Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Brokering.SW_BrokeringPackage#getDeviceBroker_OpenServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getOpenServices();

	/**
	 * Returns the value of the '<em><b>Read Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Brokering.SW_BrokeringPackage#getDeviceBroker_ReadServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getReadServices();

	/**
	 * Returns the value of the '<em><b>Write Services</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Services</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Brokering.SW_BrokeringPackage#getDeviceBroker_WriteServices()
	 * @model type="org.eclipse.uml2.uml.BehavioralFeature" ordered="false"
	 * @generated
	 */
	EList getWriteServices();

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
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Brokering.SW_BrokeringPackage#getDeviceBroker_Operations()
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
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Brokering.SW_BrokeringPackage#getDeviceBroker_Activities()
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
	 * @see MARTE.MARTE_DesignModel.SRM.SW_Brokering.SW_BrokeringPackage#getDeviceBroker_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.DeviceBroker#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DeviceBroker
