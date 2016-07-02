/**
 */
package MARTE.MARTE_DesignModel.HRM.HwDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SRM Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.SRMDiagram#getDevices <em>Devices</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwDiagram.SRMDiagram#getHwcomponents <em>Hwcomponents</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage#getSRMDiagram()
 * @model
 * @generated
 */
public interface SRMDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.SRM.SW_Brokering.DeviceBroker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage#getSRMDiagram_Devices()
	 * @model type="MARTE.MARTE_DesignModel.SRM.SW_Brokering.DeviceBroker" containment="true"
	 * @generated
	 */
	EList getDevices();

	/**
	 * Returns the value of the '<em><b>Hwcomponents</b></em>' containment reference list.
	 * The list contents are of type {@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hwcomponents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hwcomponents</em>' containment reference list.
	 * @see MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage#getSRMDiagram_Hwcomponents()
	 * @model type="MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource" containment="true"
	 * @generated
	 */
	EList getHwcomponents();

} // SRMDiagram
