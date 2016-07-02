/**
 */
package MARTE.MARTE_Foundations.GRM;

import MARTE_Library.BasicNFP_Types.NFP_Integer;

import MARTE_Library.GRM_BasicTypes.ProtectProtocolKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mutual Exclusion Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.MutualExclusionResource#getProtectKind <em>Protect Kind</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.MutualExclusionResource#getCeiling <em>Ceiling</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.MutualExclusionResource#getOtherProtectProtocol <em>Other Protect Protocol</em>}</li>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.MutualExclusionResource#getScheduler <em>Scheduler</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getMutualExclusionResource()
 * @model
 * @generated
 */
public interface MutualExclusionResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Protect Kind</b></em>' attribute.
	 * The default value is <code>"PriorityInheritance"</code>.
	 * The literals are from the enumeration {@link MARTE_Library.GRM_BasicTypes.ProtectProtocolKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protect Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protect Kind</em>' attribute.
	 * @see MARTE_Library.GRM_BasicTypes.ProtectProtocolKind
	 * @see #setProtectKind(ProtectProtocolKind)
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getMutualExclusionResource_ProtectKind()
	 * @model default="PriorityInheritance" unique="false" ordered="false"
	 * @generated
	 */
	ProtectProtocolKind getProtectKind();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.GRM.MutualExclusionResource#getProtectKind <em>Protect Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protect Kind</em>' attribute.
	 * @see MARTE_Library.GRM_BasicTypes.ProtectProtocolKind
	 * @see #getProtectKind()
	 * @generated
	 */
	void setProtectKind(ProtectProtocolKind value);

	/**
	 * Returns the value of the '<em><b>Ceiling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ceiling</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ceiling</em>' containment reference.
	 * @see #setCeiling(NFP_Integer)
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getMutualExclusionResource_Ceiling()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Integer getCeiling();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.GRM.MutualExclusionResource#getCeiling <em>Ceiling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ceiling</em>' containment reference.
	 * @see #getCeiling()
	 * @generated
	 */
	void setCeiling(NFP_Integer value);

	/**
	 * Returns the value of the '<em><b>Other Protect Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Protect Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Protect Protocol</em>' attribute.
	 * @see #setOtherProtectProtocol(String)
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getMutualExclusionResource_OtherProtectProtocol()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.String" ordered="false"
	 * @generated
	 */
	String getOtherProtectProtocol();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.GRM.MutualExclusionResource#getOtherProtectProtocol <em>Other Protect Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Protect Protocol</em>' attribute.
	 * @see #getOtherProtectProtocol()
	 * @generated
	 */
	void setOtherProtectProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Scheduler</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MARTE.MARTE_Foundations.GRM.Scheduler#getProtectedSharedRsources <em>Protected Shared Rsources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler</em>' reference.
	 * @see #setScheduler(Scheduler)
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getMutualExclusionResource_Scheduler()
	 * @see MARTE.MARTE_Foundations.GRM.Scheduler#getProtectedSharedRsources
	 * @model opposite="protectedSharedRsources" ordered="false"
	 * @generated
	 */
	Scheduler getScheduler();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_Foundations.GRM.MutualExclusionResource#getScheduler <em>Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler</em>' reference.
	 * @see #getScheduler()
	 * @generated
	 */
	void setScheduler(Scheduler value);

} // MutualExclusionResource
