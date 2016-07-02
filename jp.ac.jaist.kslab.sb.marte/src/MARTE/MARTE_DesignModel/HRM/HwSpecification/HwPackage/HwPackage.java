/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage#getPins <em>Pins</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage#getPinNum <em>Pin Num</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage#getPackageType <em>Package Type</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePackage#getHwPackage()
 * @model
 * @generated
 */
public interface HwPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Pins</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pins</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePackage#getHwPackage_Pins()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin" containment="true"
	 * @generated
	 */
	EList getPins();

	/**
	 * Returns the value of the '<em><b>Pin Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Num</em>' attribute.
	 * @see #setPinNum(int)
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePackage#getHwPackage_PinNum()
	 * @model
	 * @generated
	 */
	int getPinNum();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage#getPinNum <em>Pin Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin Num</em>' attribute.
	 * @see #getPinNum()
	 * @generated
	 */
	void setPinNum(int value);

	/**
	 * Returns the value of the '<em><b>Package Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Type</em>' attribute.
	 * @see #setPackageType(String)
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePackage#getHwPackage_PackageType()
	 * @model
	 * @generated
	 */
	String getPackageType();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage#getPackageType <em>Package Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Type</em>' attribute.
	 * @see #getPackageType()
	 * @generated
	 */
	void setPackageType(String value);

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
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePackage#getHwPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // HwPackage
