/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing;

import MARTE_Library.BasicNFP_Types.NFP_Integer;
import MARTE_Library.BasicNFP_Types.NFP_Natural;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PLD Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Organization#getNbRows <em>Nb Rows</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Organization#getNbColumns <em>Nb Columns</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Organization#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getPLD_Organization()
 * @model
 * @generated
 */
public interface PLD_Organization extends EObject {
	/**
	 * Returns the value of the '<em><b>Nb Rows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Rows</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Rows</em>' containment reference.
	 * @see #setNbRows(NFP_Integer)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getPLD_Organization_NbRows()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Integer getNbRows();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Organization#getNbRows <em>Nb Rows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Rows</em>' containment reference.
	 * @see #getNbRows()
	 * @generated
	 */
	void setNbRows(NFP_Integer value);

	/**
	 * Returns the value of the '<em><b>Nb Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Columns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Columns</em>' containment reference.
	 * @see #setNbColumns(NFP_Natural)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getPLD_Organization_NbColumns()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Natural getNbColumns();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Organization#getNbColumns <em>Nb Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Columns</em>' containment reference.
	 * @see #getNbColumns()
	 * @generated
	 */
	void setNbColumns(NFP_Natural value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Class
	 * @see #setClass(PLD_Class)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getPLD_Organization_Class()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	PLD_Class getClass_();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Organization#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Class
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(PLD_Class value);

} // PLD_Organization
