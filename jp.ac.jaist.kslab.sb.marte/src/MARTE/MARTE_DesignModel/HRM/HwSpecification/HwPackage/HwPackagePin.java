/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwEndPoint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin#getRefpin <em>Refpin</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin#getWire <em>Wire</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin#getPinNo <em>Pin No</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin#getAltNames <em>Alt Names</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePackage#getHwPackagePin()
 * @model
 * @generated
 */
public interface HwPackagePin extends HwEndPoint {
	/**
	 * Returns the value of the '<em><b>Refpin</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin}.
	 * It is bidirectional and its opposite is '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin#getPkgPin <em>Pkg Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refpin</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refpin</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePackage#getHwPackagePin_Refpin()
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin#getPkgPin
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin" opposite="pkgPin"
	 * @generated
	 */
	EList getRefpin();

	/**
	 * Returns the value of the '<em><b>Wire</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwWire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wire</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePackage#getHwPackagePin_Wire()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwWire"
	 * @generated
	 */
	EList getWire();

	/**
	 * Returns the value of the '<em><b>Pin No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin No</em>' attribute.
	 * @see #setPinNo(String)
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePackage#getHwPackagePin_PinNo()
	 * @model
	 * @generated
	 */
	String getPinNo();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin#getPinNo <em>Pin No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin No</em>' attribute.
	 * @see #getPinNo()
	 * @generated
	 */
	void setPinNo(String value);

	/**
	 * Returns the value of the '<em><b>Alt Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Names</em>' attribute list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePackage#getHwPackagePin_AltNames()
	 * @model
	 * @generated
	 */
	EList getAltNames();

} // HwPackagePin
