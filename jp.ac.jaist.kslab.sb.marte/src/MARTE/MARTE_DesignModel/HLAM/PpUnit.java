/**
 */
package MARTE.MARTE_DesignModel.HLAM;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.BehavioredClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pp Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.PpUnit#getConcPolicy <em>Conc Policy</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.PpUnit#getMemorySize <em>Memory Size</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.PpUnit#getBase_BehavioredClassifier <em>Base Behaviored Classifier</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getPpUnit()
 * @model
 * @generated
 */
public interface PpUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Conc Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.HLAM.CallConcurrencyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conc Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conc Policy</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HLAM.CallConcurrencyKind
	 * @see #setConcPolicy(CallConcurrencyKind)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getPpUnit_ConcPolicy()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	CallConcurrencyKind getConcPolicy();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.PpUnit#getConcPolicy <em>Conc Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conc Policy</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HLAM.CallConcurrencyKind
	 * @see #getConcPolicy()
	 * @generated
	 */
	void setConcPolicy(CallConcurrencyKind value);

	/**
	 * Returns the value of the '<em><b>Memory Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Size</em>' containment reference.
	 * @see #setMemorySize(NFP_DataSize)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getPpUnit_MemorySize()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_DataSize getMemorySize();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.PpUnit#getMemorySize <em>Memory Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Size</em>' containment reference.
	 * @see #getMemorySize()
	 * @generated
	 */
	void setMemorySize(NFP_DataSize value);

	/**
	 * Returns the value of the '<em><b>Base Behaviored Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Behaviored Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Behaviored Classifier</em>' reference.
	 * @see #setBase_BehavioredClassifier(BehavioredClassifier)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getPpUnit_Base_BehavioredClassifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BehavioredClassifier getBase_BehavioredClassifier();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.PpUnit#getBase_BehavioredClassifier <em>Base Behaviored Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Behaviored Classifier</em>' reference.
	 * @see #getBase_BehavioredClassifier()
	 * @generated
	 */
	void setBase_BehavioredClassifier(BehavioredClassifier value);

} // PpUnit
