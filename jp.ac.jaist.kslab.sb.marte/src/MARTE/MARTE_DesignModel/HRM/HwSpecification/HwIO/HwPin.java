/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwEndPoint;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin#getPkgPin <em>Pkg Pin</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwIOPackage#getHwPin()
 * @model
 * @generated
 */
public interface HwPin extends HwEndPoint {
	/**
	 * Returns the value of the '<em><b>Pkg Pin</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin#getRefpin <em>Refpin</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pkg Pin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pkg Pin</em>' reference.
	 * @see #setPkgPin(HwPackagePin)
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwIOPackage#getHwPin_PkgPin()
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.HwPackagePin#getRefpin
	 * @model opposite="refpin"
	 * @generated
	 */
	HwPackagePin getPkgPin();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwPin#getPkgPin <em>Pkg Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pkg Pin</em>' reference.
	 * @see #getPkgPin()
	 * @generated
	 */
	void setPkgPin(HwPackagePin value);

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwIOPackage#getHwPin_Lines()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.HwLine"
	 * @generated
	 */
	EList getLines();

} // HwPin
