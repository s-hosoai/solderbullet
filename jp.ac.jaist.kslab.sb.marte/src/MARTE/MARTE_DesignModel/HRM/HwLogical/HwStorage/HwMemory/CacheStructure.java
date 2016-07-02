/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;
import MARTE_Library.BasicNFP_Types.NFP_Natural;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cache Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheStructure#getNbSets <em>Nb Sets</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheStructure#getBlockSize <em>Block Size</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheStructure#getAssociativity <em>Associativity</em>}</li>
 * </ul>
 *
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getCacheStructure()
 * @model
 * @generated
 */
public interface CacheStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Nb Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Sets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Sets</em>' containment reference.
	 * @see #setNbSets(NFP_Natural)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getCacheStructure_NbSets()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Natural getNbSets();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheStructure#getNbSets <em>Nb Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Sets</em>' containment reference.
	 * @see #getNbSets()
	 * @generated
	 */
	void setNbSets(NFP_Natural value);

	/**
	 * Returns the value of the '<em><b>Block Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Size</em>' containment reference.
	 * @see #setBlockSize(NFP_DataSize)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getCacheStructure_BlockSize()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_DataSize getBlockSize();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheStructure#getBlockSize <em>Block Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Size</em>' containment reference.
	 * @see #getBlockSize()
	 * @generated
	 */
	void setBlockSize(NFP_DataSize value);

	/**
	 * Returns the value of the '<em><b>Associativity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associativity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associativity</em>' containment reference.
	 * @see #setAssociativity(NFP_Natural)
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getCacheStructure_Associativity()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NFP_Natural getAssociativity();

	/**
	 * Sets the value of the '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheStructure#getAssociativity <em>Associativity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associativity</em>' containment reference.
	 * @see #getAssociativity()
	 * @generated
	 */
	void setAssociativity(NFP_Natural value);

} // CacheStructure
