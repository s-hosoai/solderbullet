/**
 */
package MARTE.MARTE_DesignModel.HLAM;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.BehavioralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rt Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtService#getConcPolicy <em>Conc Policy</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtService#getExeKind <em>Exe Kind</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtService#getIsAtomic <em>Is Atomic</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtService#getSynchKind <em>Synch Kind</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtService#getBase_BehavioralFeature <em>Base Behavioral Feature</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtService()
 * @model
 * @generated
 */
public interface RtService extends EObject {
	/**
	 * Returns the value of the '<em><b>Conc Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.HLAM.ConcurrencyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conc Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conc Policy</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HLAM.ConcurrencyKind
	 * @see #setConcPolicy(ConcurrencyKind)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtService_ConcPolicy()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	ConcurrencyKind getConcPolicy();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtService#getConcPolicy <em>Conc Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conc Policy</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HLAM.ConcurrencyKind
	 * @see #getConcPolicy()
	 * @generated
	 */
	void setConcPolicy(ConcurrencyKind value);

	/**
	 * Returns the value of the '<em><b>Exe Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.HLAM.ExecutionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exe Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exe Kind</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HLAM.ExecutionKind
	 * @see #setExeKind(ExecutionKind)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtService_ExeKind()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	ExecutionKind getExeKind();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtService#getExeKind <em>Exe Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exe Kind</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HLAM.ExecutionKind
	 * @see #getExeKind()
	 * @generated
	 */
	void setExeKind(ExecutionKind value);

	/**
	 * Returns the value of the '<em><b>Is Atomic</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Atomic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Atomic</em>' attribute.
	 * @see #setIsAtomic(Boolean)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtService_IsAtomic()
	 * @model default="false" unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsAtomic();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtService#getIsAtomic <em>Is Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Atomic</em>' attribute.
	 * @see #getIsAtomic()
	 * @generated
	 */
	void setIsAtomic(Boolean value);

	/**
	 * Returns the value of the '<em><b>Synch Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.HLAM.SynchronizationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synch Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synch Kind</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HLAM.SynchronizationKind
	 * @see #setSynchKind(SynchronizationKind)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtService_SynchKind()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	SynchronizationKind getSynchKind();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtService#getSynchKind <em>Synch Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synch Kind</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HLAM.SynchronizationKind
	 * @see #getSynchKind()
	 * @generated
	 */
	void setSynchKind(SynchronizationKind value);

	/**
	 * Returns the value of the '<em><b>Base Behavioral Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Behavioral Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Behavioral Feature</em>' reference.
	 * @see #setBase_BehavioralFeature(BehavioralFeature)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtService_Base_BehavioralFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BehavioralFeature getBase_BehavioralFeature();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtService#getBase_BehavioralFeature <em>Base Behavioral Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Behavioral Feature</em>' reference.
	 * @see #getBase_BehavioralFeature()
	 * @generated
	 */
	void setBase_BehavioralFeature(BehavioralFeature value);

} // RtService
