/**
 */
package MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource;

import MARTE_Library.BasicNFP_Types.NFP_Area;
import MARTE_Library.BasicNFP_Types.NFP_Natural;
import MARTE_Library.BasicNFP_Types.NFP_Power;
import MARTE_Library.BasicNFP_Types.NFP_Price;
import MARTE_Library.BasicNFP_Types.NFP_Real;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getKind <em>Kind</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getArea <em>Area</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getPosition <em>Position</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getGrid <em>Grid</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getNbPins <em>Nb Pins</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getWeight <em>Weight</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getPrice <em>Price</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getR_Conditions <em>RConditions</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getPoweredServices <em>Powered Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getStaticConsumption <em>Static Consumption</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getStaticDissipation <em>Static Dissipation</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getSubComponents <em>Sub Components</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage#getHwComponent()
 * @model
 * @generated
 */
public interface HwComponent extends HwResource {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentKind
	 * @see #setKind(ComponentKind)
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage#getHwComponent_Kind()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	ComponentKind getKind();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ComponentKind value);

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Length}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage#getHwComponent_Dimensions()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Length" containment="true" upper="3" ordered="false"
	 * @generated
	 */
	EList getDimensions();

	/**
	 * Returns the value of the '<em><b>Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' reference.
	 * @see #setArea(NFP_Area)
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage#getHwComponent_Area()
	 * @model volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	NFP_Area getArea();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getArea <em>Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' reference.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(NFP_Area value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.MARTE_DataTypes.NFP_NaturalInterval}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage#getHwComponent_Position()
	 * @model type="MARTE_Library.MARTE_DataTypes.NFP_NaturalInterval" containment="true" upper="2" ordered="false"
	 * @generated
	 */
	EList getPosition();

	/**
	 * Returns the value of the '<em><b>Grid</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE_Library.BasicNFP_Types.NFP_Natural}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage#getHwComponent_Grid()
	 * @model type="MARTE_Library.BasicNFP_Types.NFP_Natural" containment="true" upper="2" ordered="false"
	 * @generated
	 */
	EList getGrid();

	/**
	 * Returns the value of the '<em><b>Nb Pins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Pins</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Pins</em>' containment reference.
	 * @see #setNbPins(NFP_Natural)
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage#getHwComponent_NbPins()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Natural getNbPins();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getNbPins <em>Nb Pins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Pins</em>' containment reference.
	 * @see #getNbPins()
	 * @generated
	 */
	void setNbPins(NFP_Natural value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' containment reference.
	 * @see #setWeight(NFP_Real)
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage#getHwComponent_Weight()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Real getWeight();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getWeight <em>Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' containment reference.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(NFP_Real value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' containment reference.
	 * @see #setPrice(NFP_Price)
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage#getHwComponent_Price()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Price getPrice();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getPrice <em>Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' containment reference.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(NFP_Price value);

	/**
	 * Returns the value of the '<em><b>RConditions</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RConditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RConditions</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage#getHwComponent_R_Conditions()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition" containment="true" ordered="false"
	 * @generated
	 */
	EList getR_Conditions();

	/**
	 * Returns the value of the '<em><b>Powered Services</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResourceService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powered Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powered Services</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage#getHwComponent_PoweredServices()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResourceService" containment="true" ordered="false"
	 * @generated
	 */
	EList getPoweredServices();

	/**
	 * Returns the value of the '<em><b>Static Consumption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Consumption</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Consumption</em>' containment reference.
	 * @see #setStaticConsumption(NFP_Power)
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage#getHwComponent_StaticConsumption()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Power getStaticConsumption();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getStaticConsumption <em>Static Consumption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Consumption</em>' containment reference.
	 * @see #getStaticConsumption()
	 * @generated
	 */
	void setStaticConsumption(NFP_Power value);

	/**
	 * Returns the value of the '<em><b>Static Dissipation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Dissipation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Dissipation</em>' containment reference.
	 * @see #setStaticDissipation(NFP_Power)
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage#getHwComponent_StaticDissipation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Power getStaticDissipation();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent#getStaticDissipation <em>Static Dissipation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Dissipation</em>' containment reference.
	 * @see #getStaticDissipation()
	 * @generated
	 */
	void setStaticDissipation(NFP_Power value);

	/**
	 * Returns the value of the '<em><b>Sub Components</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Components</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage#getHwComponent_SubComponents()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent" containment="true" ordered="false"
	 * @generated
	 */
	EList getSubComponents();

} // HwComponent
