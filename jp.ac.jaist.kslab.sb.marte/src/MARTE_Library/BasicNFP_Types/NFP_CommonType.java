/**
 */
package MARTE_Library.BasicNFP_Types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFP Common Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.BasicNFP_Types.NFP_CommonType#getExpr <em>Expr</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.NFP_CommonType#getSource <em>Source</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.NFP_CommonType#getStatQ <em>Stat Q</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.NFP_CommonType#getDir <em>Dir</em>}</li>
 *   <li>{@link MARTE_Library.BasicNFP_Types.NFP_CommonType#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_CommonType()
 * @model
 * @generated
 */
public interface NFP_CommonType extends EObject {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' attribute.
	 * @see #setExpr(Object)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_CommonType_Expr()
	 * @model unique="false" dataType="MARTE_Library.MARTE_DataTypes.VSL_Expression" ordered="false"
	 * @generated
	 */
	Object getExpr();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.NFP_CommonType#getExpr <em>Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' attribute.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Object value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE_Library.BasicNFP_Types.SourceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see MARTE_Library.BasicNFP_Types.SourceKind
	 * @see #setSource(SourceKind)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_CommonType_Source()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	SourceKind getSource();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.NFP_CommonType#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see MARTE_Library.BasicNFP_Types.SourceKind
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SourceKind value);

	/**
	 * Returns the value of the '<em><b>Stat Q</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE_Library.BasicNFP_Types.StatisticalQualifierKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stat Q</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stat Q</em>' attribute.
	 * @see MARTE_Library.BasicNFP_Types.StatisticalQualifierKind
	 * @see #setStatQ(StatisticalQualifierKind)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_CommonType_StatQ()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	StatisticalQualifierKind getStatQ();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.NFP_CommonType#getStatQ <em>Stat Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stat Q</em>' attribute.
	 * @see MARTE_Library.BasicNFP_Types.StatisticalQualifierKind
	 * @see #getStatQ()
	 * @generated
	 */
	void setStatQ(StatisticalQualifierKind value);

	/**
	 * Returns the value of the '<em><b>Dir</b></em>' attribute.
	 * The literals are from the enumeration {@link MARTE_Library.BasicNFP_Types.DirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir</em>' attribute.
	 * @see MARTE_Library.BasicNFP_Types.DirectionKind
	 * @see #setDir(DirectionKind)
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_CommonType_Dir()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	DirectionKind getDir();

	/**
	 * Sets the value of the '{@link MARTE_Library.BasicNFP_Types.NFP_CommonType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' attribute.
	 * @see MARTE_Library.BasicNFP_Types.DirectionKind
	 * @see #getDir()
	 * @generated
	 */
	void setDir(DirectionKind value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute list.
	 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage#getNFP_CommonType_Mode()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<String> getMode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model probDataType="MARTE_Library.MARTE_PrimitivesTypes.Real" probRequired="true" probOrdered="false"
	 * @generated
	 */
	void bernoulli(Object prob);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model probDataType="MARTE_Library.MARTE_PrimitivesTypes.Real" probRequired="true" probOrdered="false" trialsDataType="MARTE_Library.MARTE_PrimitivesTypes.Integer" trialsRequired="true" trialsOrdered="false"
	 * @generated
	 */
	void binomial(Object prob, Object trials);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model meanDataType="MARTE_Library.MARTE_PrimitivesTypes.Real" meanRequired="true" meanOrdered="false"
	 * @generated
	 */
	void exp(Object mean);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kDataType="MARTE_Library.MARTE_PrimitivesTypes.Integer" kRequired="true" kOrdered="false" meanDataType="MARTE_Library.MARTE_PrimitivesTypes.Real" meanRequired="true" meanOrdered="false"
	 * @generated
	 */
	void gamma(Object k, Object mean);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model meanDataType="MARTE_Library.MARTE_PrimitivesTypes.Real" meanRequired="true" meanOrdered="false" standDevDataType="MARTE_Library.MARTE_PrimitivesTypes.Real" standDevRequired="true" standDevOrdered="false"
	 * @generated
	 */
	void normal(Object mean, Object standDev);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model meanDataType="MARTE_Library.MARTE_PrimitivesTypes.Real" meanRequired="true" meanOrdered="false"
	 * @generated
	 */
	void poisson(Object mean);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model minDataType="MARTE_Library.MARTE_PrimitivesTypes.Real" minRequired="true" minOrdered="false" maxDataType="MARTE_Library.MARTE_PrimitivesTypes.Real" maxRequired="true" maxOrdered="false"
	 * @generated
	 */
	void uniform(Object min, Object max);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kRequired="true" kOrdered="false" meanDataType="MARTE_Library.MARTE_PrimitivesTypes.Real" meanRequired="true" meanOrdered="false"
	 * @generated
	 */
	void gamma(int k, Object mean);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pDataType="MARTE_Library.MARTE_PrimitivesTypes.Real" pRequired="true" pOrdered="false"
	 * @generated
	 */
	void geometric(Object p);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model minDataType="MARTE_Library.MARTE_PrimitivesTypes.Real" minRequired="true" minOrdered="false" maxDataType="MARTE_Library.MARTE_PrimitivesTypes.Real" maxRequired="true" maxOrdered="false" modeDataType="MARTE_Library.MARTE_PrimitivesTypes.Real" modeRequired="true" modeOrdered="false"
	 * @generated
	 */
	void triangular(Object min, Object max, Object mode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model thetaDataType="MARTE_Library.MARTE_PrimitivesTypes.Real" thetaRequired="true" thetaOrdered="false"
	 * @generated
	 */
	void logarithmic(Object theta);

} // NFP_CommonType
