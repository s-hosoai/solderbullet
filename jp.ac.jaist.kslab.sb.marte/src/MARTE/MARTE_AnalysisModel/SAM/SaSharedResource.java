/**
 */
package MARTE.MARTE_AnalysisModel.SAM;

import MARTE.MARTE_Foundations.GRM.MutualExclusionResource;

import MARTE_Library.BasicNFP_Types.NFP_Boolean;
import MARTE_Library.BasicNFP_Types.NFP_Integer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sa Shared Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaSharedResource#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaSharedResource#getIsPreemp <em>Is Preemp</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaSharedResource#getIsConsum <em>Is Consum</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaSharedResource#getAcquisT <em>Acquis T</em>}</li>
 *   <li>{@link MARTE.MARTE_AnalysisModel.SAM.SaSharedResource#getReleaseT <em>Release T</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaSharedResource()
 * @model
 * @generated
 */
public interface SaSharedResource extends MutualExclusionResource {
	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' containment reference.
	 * @see #setCapacity(NFP_Integer)
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaSharedResource_Capacity()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Integer getCapacity();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaSharedResource#getCapacity <em>Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' containment reference.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(NFP_Integer value);

	/**
	 * Returns the value of the '<em><b>Is Preemp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Preemp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Preemp</em>' containment reference.
	 * @see #setIsPreemp(NFP_Boolean)
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaSharedResource_IsPreemp()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Boolean getIsPreemp();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaSharedResource#getIsPreemp <em>Is Preemp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Preemp</em>' containment reference.
	 * @see #getIsPreemp()
	 * @generated
	 */
	void setIsPreemp(NFP_Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Consum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Consum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Consum</em>' containment reference.
	 * @see #setIsConsum(NFP_Boolean)
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaSharedResource_IsConsum()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Boolean getIsConsum();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_AnalysisModel.SAM.SaSharedResource#getIsConsum <em>Is Consum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Consum</em>' containment reference.
	 * @see #getIsConsum()
	 * @generated
	 */
	void setIsConsum(NFP_Boolean value);

	/**
	 * Returns the value of the '<em><b>Acquis T</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acquis T</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acquis T</em>' containment reference list.
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaSharedResource_AcquisT()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Duration" containment="true" ordered="false"
	 * @generated
	 */
	EList getAcquisT();

	/**
	 * Returns the value of the '<em><b>Release T</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release T</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release T</em>' containment reference list.
	 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getSaSharedResource_ReleaseT()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Duration" containment="true" ordered="false"
	 * @generated
	 */
	EList getReleaseT();

} // SaSharedResource
