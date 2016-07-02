/**
 */
package MARTE.MARTE_DesignModel.HLAM;

import MARTE.MARTE_Foundations.Time.TimedInstantObservation;

import MARTE_Library.BasicNFP_Types.ArrivalPattern;
import MARTE_Library.BasicNFP_Types.NFP_DateTime;
import MARTE_Library.BasicNFP_Types.NFP_Duration;
import MARTE_Library.BasicNFP_Types.NFP_Integer;
import MARTE_Library.BasicNFP_Types.NFP_Percentage;

import MARTE_Library.MARTE_DataTypes.UtilityType;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Comment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rt Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtSpecification#getUtility <em>Utility</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtSpecification#getOccKind <em>Occ Kind</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtSpecification#getTRef <em>TRef</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtSpecification#getRelDl <em>Rel Dl</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtSpecification#getAbsDl <em>Abs Dl</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtSpecification#getBoundDl <em>Bound Dl</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtSpecification#getRdTime <em>Rd Time</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtSpecification#getMiss <em>Miss</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtSpecification#getPriority <em>Priority</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HLAM.RtSpecification#getBase_Comment <em>Base Comment</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtSpecification()
 * @model
 * @generated
 */
public interface RtSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Utility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utility</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utility</em>' containment reference.
	 * @see #setUtility(UtilityType)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtSpecification_Utility()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	UtilityType getUtility();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtSpecification#getUtility <em>Utility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utility</em>' containment reference.
	 * @see #getUtility()
	 * @generated
	 */
	void setUtility(UtilityType value);

	/**
	 * Returns the value of the '<em><b>Occ Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occ Kind</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occ Kind</em>' containment reference.
	 * @see #setOccKind(ArrivalPattern)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtSpecification_OccKind()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ArrivalPattern getOccKind();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtSpecification#getOccKind <em>Occ Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occ Kind</em>' containment reference.
	 * @see #getOccKind()
	 * @generated
	 */
	void setOccKind(ArrivalPattern value);

	/**
	 * Returns the value of the '<em><b>TRef</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TRef</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TRef</em>' reference.
	 * @see #setTRef(TimedInstantObservation)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtSpecification_TRef()
	 * @model ordered="false"
	 * @generated
	 */
	TimedInstantObservation getTRef();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtSpecification#getTRef <em>TRef</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TRef</em>' reference.
	 * @see #getTRef()
	 * @generated
	 */
	void setTRef(TimedInstantObservation value);

	/**
	 * Returns the value of the '<em><b>Rel Dl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rel Dl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel Dl</em>' containment reference.
	 * @see #setRelDl(NFP_Duration)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtSpecification_RelDl()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getRelDl();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtSpecification#getRelDl <em>Rel Dl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Dl</em>' containment reference.
	 * @see #getRelDl()
	 * @generated
	 */
	void setRelDl(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Abs Dl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abs Dl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abs Dl</em>' containment reference.
	 * @see #setAbsDl(NFP_DateTime)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtSpecification_AbsDl()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_DateTime getAbsDl();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtSpecification#getAbsDl <em>Abs Dl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abs Dl</em>' containment reference.
	 * @see #getAbsDl()
	 * @generated
	 */
	void setAbsDl(NFP_DateTime value);

	/**
	 * Returns the value of the '<em><b>Bound Dl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Dl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Dl</em>' containment reference.
	 * @see #setBoundDl(NFP_Duration)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtSpecification_BoundDl()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getBoundDl();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtSpecification#getBoundDl <em>Bound Dl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Dl</em>' containment reference.
	 * @see #getBoundDl()
	 * @generated
	 */
	void setBoundDl(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Rd Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rd Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rd Time</em>' containment reference.
	 * @see #setRdTime(NFP_Duration)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtSpecification_RdTime()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Duration getRdTime();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtSpecification#getRdTime <em>Rd Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rd Time</em>' containment reference.
	 * @see #getRdTime()
	 * @generated
	 */
	void setRdTime(NFP_Duration value);

	/**
	 * Returns the value of the '<em><b>Miss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Miss</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Miss</em>' containment reference.
	 * @see #setMiss(NFP_Percentage)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtSpecification_Miss()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Percentage getMiss();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtSpecification#getMiss <em>Miss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Miss</em>' containment reference.
	 * @see #getMiss()
	 * @generated
	 */
	void setMiss(NFP_Percentage value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(NFP_Integer)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtSpecification_Priority()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Integer getPriority();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtSpecification#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(NFP_Integer value);

	/**
	 * Returns the value of the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Comment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Comment</em>' reference.
	 * @see #setBase_Comment(Comment)
	 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getRtSpecification_Base_Comment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Comment getBase_Comment();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HLAM.RtSpecification#getBase_Comment <em>Base Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Comment</em>' reference.
	 * @see #getBase_Comment()
	 * @generated
	 */
	void setBase_Comment(Comment value);

} // RtSpecification
