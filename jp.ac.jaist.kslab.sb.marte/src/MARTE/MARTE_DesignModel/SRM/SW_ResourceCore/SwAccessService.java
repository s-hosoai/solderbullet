/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_ResourceCore;

import MARTE.MARTE_Foundations.GRM.GrService;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sw Access Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwAccessService#getIsModifier <em>Is Modifier</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwAccessService#getAccessedElement <em>Accessed Element</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SW_ResourceCorePackage#getSwAccessService()
 * @model
 * @generated
 */
public interface SwAccessService extends GrService {
	/**
	 * Returns the value of the '<em><b>Is Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Modifier</em>' attribute.
	 * @see #setIsModifier(Boolean)
	 * @see MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SW_ResourceCorePackage#getSwAccessService_IsModifier()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getIsModifier();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwAccessService#getIsModifier <em>Is Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Modifier</em>' attribute.
	 * @see #getIsModifier()
	 * @generated
	 */
	void setIsModifier(Boolean value);

	/**
	 * Returns the value of the '<em><b>Accessed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessed Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessed Element</em>' reference.
	 * @see #setAccessedElement(Property)
	 * @see MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SW_ResourceCorePackage#getSwAccessService_AccessedElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getAccessedElement();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwAccessService#getAccessedElement <em>Accessed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessed Element</em>' reference.
	 * @see #getAccessedElement()
	 * @generated
	 */
	void setAccessedElement(Property value);

} // SwAccessService
