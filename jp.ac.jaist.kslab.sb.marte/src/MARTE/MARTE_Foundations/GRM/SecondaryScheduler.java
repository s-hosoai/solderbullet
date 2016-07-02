/**
 */
package MARTE.MARTE_Foundations.GRM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secondary Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_Foundations.GRM.SecondaryScheduler#getVirtualProcessingUnits <em>Virtual Processing Units</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getSecondaryScheduler()
 * @model
 * @generated
 */
public interface SecondaryScheduler extends Scheduler {
	/**
	 * Returns the value of the '<em><b>Virtual Processing Units</b></em>' reference list.
	 * The list contents are of type {@link MARTE.MARTE_Foundations.GRM.SchedulableResource}.
	 * It is bidirectional and its opposite is '{@link MARTE.MARTE_Foundations.GRM.SchedulableResource#getDependentScheduler <em>Dependent Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Processing Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Processing Units</em>' reference list.
	 * @see MARTE.MARTE_Foundations.GRM.GRMPackage#getSecondaryScheduler_VirtualProcessingUnits()
	 * @see MARTE.MARTE_Foundations.GRM.SchedulableResource#getDependentScheduler
	 * @model type="MARTE.MARTE_Foundations.GRM.SchedulableResource" opposite="dependentScheduler" ordered="false"
	 * @generated
	 */
	EList getVirtualProcessingUnits();

} // SecondaryScheduler
