/**
 */
package MARTE.MARTE_DesignModel.HLAM;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;
import MARTE_Library.BasicNFP_Types.NFP_Duration;

import MARTE_Library.GRM_BasicTypes.SchedPolicyKind;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rt Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getIsDynamic <em>Is Dynamic</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getIsMain <em>Is Main</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getSrPoolSize <em>Sr Pool Size</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getSrPoolPolicy <em>Sr Pool Policy</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getSrPoolWaitingTime <em>Sr Pool Waiting Time</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getOperationalMode <em>Operational Mode</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getMain <em>Main</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getMemorySize <em>Memory Size</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getBase_BehavioredClassifier <em>Base Behaviored Classifier</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getQueueSchedPolicy <em>Queue Sched Policy</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getQueueSize <em>Queue Size</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getMsgMaxSize <em>Msg Max Size</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtUnit()
 * @model
 * @generated
 */
public interface RtUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Dynamic</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Dynamic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Dynamic</em>' attribute.
	 * @see #setIsDynamic(Boolean)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtUnit_IsDynamic()
	 * @model default="true" unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsDynamic();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getIsDynamic <em>Is Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Dynamic</em>' attribute.
	 * @see #getIsDynamic()
	 * @generated
	 */
	void setIsDynamic(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Main</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Main</em>' attribute.
	 * @see #setIsMain(Boolean)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtUnit_IsMain()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getIsMain();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getIsMain <em>Is Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Main</em>' attribute.
	 * @see #getIsMain()
	 * @generated
	 */
	void setIsMain(Boolean value);

	/**
	 * Returns the value of the '<em><b>Sr Pool Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Pool Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Pool Size</em>' attribute.
	 * @see #setSrPoolSize(Integer)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtUnit_SrPoolSize()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Integer" ordered="false"
	 * @generated
	 */
	Integer getSrPoolSize();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getSrPoolSize <em>Sr Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Pool Size</em>' attribute.
	 * @see #getSrPoolSize()
	 * @generated
	 */
	void setSrPoolSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Sr Pool Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE.MARTE_DesignModel.HLAM.PoolMgtPolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Pool Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Pool Policy</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HLAM.PoolMgtPolicyKind
	 * @see #setSrPoolPolicy(PoolMgtPolicyKind)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtUnit_SrPoolPolicy()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	PoolMgtPolicyKind getSrPoolPolicy();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getSrPoolPolicy <em>Sr Pool Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Pool Policy</em>' attribute.
	 * @see MARTE.MARTE_DesignModel.HLAM.PoolMgtPolicyKind
	 * @see #getSrPoolPolicy()
	 * @generated
	 */
	void setSrPoolPolicy(PoolMgtPolicyKind value);

	/**
	 * Returns the value of the '<em><b>Sr Pool Waiting Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Pool Waiting Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Pool Waiting Time</em>' containment reference.
	 * @see #setSrPoolWaitingTime(NFP_Duration)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtUnit_SrPoolWaitingTime()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getSrPoolWaitingTime();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getSrPoolWaitingTime <em>Sr Pool Waiting Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Pool Waiting Time</em>' containment reference.
	 * @see #getSrPoolWaitingTime()
	 * @generated
	 */
	void setSrPoolWaitingTime(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Operational Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Mode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Mode</em>' reference.
	 * @see #setOperationalMode(Behavior)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtUnit_OperationalMode()
	 * @model ordered="false"
	 * @generated
	 */
	Behavior getOperationalMode();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getOperationalMode <em>Operational Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Mode</em>' reference.
	 * @see #getOperationalMode()
	 * @generated
	 */
	void setOperationalMode(Behavior value);

	/**
	 * Returns the value of the '<em><b>Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' reference.
	 * @see #setMain(Operation)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtUnit_Main()
	 * @model ordered="false"
	 * @generated
	 */
	Operation getMain();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getMain <em>Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' reference.
	 * @see #getMain()
	 * @generated
	 */
	void setMain(Operation value);

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
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtUnit_MemorySize()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_DataSize getMemorySize();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getMemorySize <em>Memory Size</em>}' containment reference.
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
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtUnit_Base_BehavioredClassifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BehavioredClassifier getBase_BehavioredClassifier();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getBase_BehavioredClassifier <em>Base Behaviored Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Behaviored Classifier</em>' reference.
	 * @see #getBase_BehavioredClassifier()
	 * @generated
	 */
	void setBase_BehavioredClassifier(BehavioredClassifier value);

	/**
	 * Returns the value of the '<em><b>Queue Sched Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE_Library.GRM_BasicTypes.SchedPolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue Sched Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Sched Policy</em>' attribute.
	 * @see MARTE_Library.GRM_BasicTypes.SchedPolicyKind
	 * @see #setQueueSchedPolicy(SchedPolicyKind)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtUnit_QueueSchedPolicy()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	SchedPolicyKind getQueueSchedPolicy();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getQueueSchedPolicy <em>Queue Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Sched Policy</em>' attribute.
	 * @see MARTE_Library.GRM_BasicTypes.SchedPolicyKind
	 * @see #getQueueSchedPolicy()
	 * @generated
	 */
	void setQueueSchedPolicy(SchedPolicyKind value);

	/**
	 * Returns the value of the '<em><b>Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Size</em>' attribute.
	 * @see #setQueueSize(Integer)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtUnit_QueueSize()
	 * @model unique="false" dataType="MARTE_Library.MARTE_PrimitivesTypes.Integer" ordered="false"
	 * @generated
	 */
	Integer getQueueSize();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getQueueSize <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Size</em>' attribute.
	 * @see #getQueueSize()
	 * @generated
	 */
	void setQueueSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Msg Max Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg Max Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Max Size</em>' containment reference.
	 * @see #setMsgMaxSize(NFP_DataSize)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtUnit_MsgMaxSize()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_DataSize getMsgMaxSize();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtUnit#getMsgMaxSize <em>Msg Max Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg Max Size</em>' containment reference.
	 * @see #getMsgMaxSize()
	 * @generated
	 */
	void setMsgMaxSize(NFP_DataSize value);

} // RtUnit
