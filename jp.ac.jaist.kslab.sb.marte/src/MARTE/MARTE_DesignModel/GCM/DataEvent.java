/**
 */
package MARTE.MARTE_DesignModel.GCM;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.AnyReceiveEvent;
import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.DataEvent#getBase_AnyReceiveEvent <em>Base Any Receive Event</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.GCM.DataEvent#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getDataEvent()
 * @model
 * @generated
 */
public interface DataEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Any Receive Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Any Receive Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Any Receive Event</em>' reference.
	 * @see #setBase_AnyReceiveEvent(AnyReceiveEvent)
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getDataEvent_Base_AnyReceiveEvent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AnyReceiveEvent getBase_AnyReceiveEvent();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.GCM.DataEvent#getBase_AnyReceiveEvent <em>Base Any Receive Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Any Receive Event</em>' reference.
	 * @see #getBase_AnyReceiveEvent()
	 * @generated
	 */
	void setBase_AnyReceiveEvent(AnyReceiveEvent value);

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see #setClassifier(Classifier)
	 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getDataEvent_Classifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getClassifier();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.GCM.DataEvent#getClassifier <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' reference.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(Classifier value);

} // DataEvent
