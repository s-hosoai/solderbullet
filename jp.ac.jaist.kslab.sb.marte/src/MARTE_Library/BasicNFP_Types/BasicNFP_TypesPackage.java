/**
 */
package MARTE_Library.BasicNFP_Types;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MARTE_Library.BasicNFP_Types.BasicNFP_TypesFactory
 * @model kind="package"
 * @generated
 */
public interface BasicNFP_TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BasicNFP_Types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///MARTE_Library/BasicNFP_Types.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MARTE_Library.BasicNFP_Types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicNFP_TypesPackage eINSTANCE = MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_CommonTypeImpl <em>NFP Common Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.NFP_CommonTypeImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_CommonType()
	 * @generated
	 */
	int NFP_COMMON_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_COMMON_TYPE__EXPR = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_COMMON_TYPE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Stat Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_COMMON_TYPE__STAT_Q = 2;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_COMMON_TYPE__DIR = 3;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_COMMON_TYPE__MODE = 4;

	/**
	 * The number of structural features of the '<em>NFP Common Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_COMMON_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_RealImpl <em>NFP Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.NFP_RealImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Real()
	 * @generated
	 */
	int NFP_REAL = 2;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_REAL__EXPR = NFP_COMMON_TYPE__EXPR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_REAL__SOURCE = NFP_COMMON_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Stat Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_REAL__STAT_Q = NFP_COMMON_TYPE__STAT_Q;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_REAL__DIR = NFP_COMMON_TYPE__DIR;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_REAL__MODE = NFP_COMMON_TYPE__MODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_REAL__VALUE = NFP_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NFP Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_REAL_FEATURE_COUNT = NFP_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_FrequencyImpl <em>NFP Frequency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.NFP_FrequencyImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Frequency()
	 * @generated
	 */
	int NFP_FREQUENCY = 1;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_FREQUENCY__EXPR = NFP_REAL__EXPR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_FREQUENCY__SOURCE = NFP_REAL__SOURCE;

	/**
	 * The feature id for the '<em><b>Stat Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_FREQUENCY__STAT_Q = NFP_REAL__STAT_Q;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_FREQUENCY__DIR = NFP_REAL__DIR;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_FREQUENCY__MODE = NFP_REAL__MODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_FREQUENCY__VALUE = NFP_REAL__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_FREQUENCY__UNIT = NFP_REAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_FREQUENCY__PRECISION = NFP_REAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>NFP Frequency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_FREQUENCY_FEATURE_COUNT = NFP_REAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_NaturalImpl <em>NFP Natural</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.NFP_NaturalImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Natural()
	 * @generated
	 */
	int NFP_NATURAL = 3;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_NATURAL__EXPR = NFP_COMMON_TYPE__EXPR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_NATURAL__SOURCE = NFP_COMMON_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Stat Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_NATURAL__STAT_Q = NFP_COMMON_TYPE__STAT_Q;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_NATURAL__DIR = NFP_COMMON_TYPE__DIR;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_NATURAL__MODE = NFP_COMMON_TYPE__MODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_NATURAL__VALUE = NFP_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NFP Natural</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_NATURAL_FEATURE_COUNT = NFP_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_BooleanImpl <em>NFP Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.NFP_BooleanImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Boolean()
	 * @generated
	 */
	int NFP_BOOLEAN = 4;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_BOOLEAN__EXPR = NFP_COMMON_TYPE__EXPR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_BOOLEAN__SOURCE = NFP_COMMON_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Stat Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_BOOLEAN__STAT_Q = NFP_COMMON_TYPE__STAT_Q;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_BOOLEAN__DIR = NFP_COMMON_TYPE__DIR;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_BOOLEAN__MODE = NFP_COMMON_TYPE__MODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_BOOLEAN__VALUE = NFP_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NFP Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_BOOLEAN_FEATURE_COUNT = NFP_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_StringImpl <em>NFP String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.NFP_StringImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_String()
	 * @generated
	 */
	int NFP_STRING = 5;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_STRING__EXPR = NFP_COMMON_TYPE__EXPR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_STRING__SOURCE = NFP_COMMON_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Stat Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_STRING__STAT_Q = NFP_COMMON_TYPE__STAT_Q;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_STRING__DIR = NFP_COMMON_TYPE__DIR;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_STRING__MODE = NFP_COMMON_TYPE__MODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_STRING__VALUE = NFP_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NFP String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_STRING_FEATURE_COUNT = NFP_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_IntegerImpl <em>NFP Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.NFP_IntegerImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Integer()
	 * @generated
	 */
	int NFP_INTEGER = 6;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_INTEGER__EXPR = NFP_COMMON_TYPE__EXPR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_INTEGER__SOURCE = NFP_COMMON_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Stat Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_INTEGER__STAT_Q = NFP_COMMON_TYPE__STAT_Q;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_INTEGER__DIR = NFP_COMMON_TYPE__DIR;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_INTEGER__MODE = NFP_COMMON_TYPE__MODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_INTEGER__VALUE = NFP_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NFP Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_INTEGER_FEATURE_COUNT = NFP_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_DateTimeImpl <em>NFP Date Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.NFP_DateTimeImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_DateTime()
	 * @generated
	 */
	int NFP_DATE_TIME = 7;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATE_TIME__EXPR = NFP_COMMON_TYPE__EXPR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATE_TIME__SOURCE = NFP_COMMON_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Stat Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATE_TIME__STAT_Q = NFP_COMMON_TYPE__STAT_Q;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATE_TIME__DIR = NFP_COMMON_TYPE__DIR;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATE_TIME__MODE = NFP_COMMON_TYPE__MODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATE_TIME__VALUE = NFP_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NFP Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATE_TIME_FEATURE_COUNT = NFP_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_DataTxRateImpl <em>NFP Data Tx Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.NFP_DataTxRateImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_DataTxRate()
	 * @generated
	 */
	int NFP_DATA_TX_RATE = 8;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATA_TX_RATE__EXPR = NFP_REAL__EXPR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATA_TX_RATE__SOURCE = NFP_REAL__SOURCE;

	/**
	 * The feature id for the '<em><b>Stat Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATA_TX_RATE__STAT_Q = NFP_REAL__STAT_Q;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATA_TX_RATE__DIR = NFP_REAL__DIR;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATA_TX_RATE__MODE = NFP_REAL__MODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATA_TX_RATE__VALUE = NFP_REAL__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATA_TX_RATE__UNIT = NFP_REAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATA_TX_RATE__PRECISION = NFP_REAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>NFP Data Tx Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATA_TX_RATE_FEATURE_COUNT = NFP_REAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_PowerImpl <em>NFP Power</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.NFP_PowerImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Power()
	 * @generated
	 */
	int NFP_POWER = 9;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_POWER__EXPR = NFP_REAL__EXPR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_POWER__SOURCE = NFP_REAL__SOURCE;

	/**
	 * The feature id for the '<em><b>Stat Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_POWER__STAT_Q = NFP_REAL__STAT_Q;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_POWER__DIR = NFP_REAL__DIR;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_POWER__MODE = NFP_REAL__MODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_POWER__VALUE = NFP_REAL__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_POWER__UNIT = NFP_REAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_POWER__PRECISION = NFP_REAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>NFP Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_POWER_FEATURE_COUNT = NFP_REAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_DataSizeImpl <em>NFP Data Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.NFP_DataSizeImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_DataSize()
	 * @generated
	 */
	int NFP_DATA_SIZE = 10;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATA_SIZE__EXPR = NFP_REAL__EXPR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATA_SIZE__SOURCE = NFP_REAL__SOURCE;

	/**
	 * The feature id for the '<em><b>Stat Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATA_SIZE__STAT_Q = NFP_REAL__STAT_Q;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATA_SIZE__DIR = NFP_REAL__DIR;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATA_SIZE__MODE = NFP_REAL__MODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATA_SIZE__VALUE = NFP_REAL__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATA_SIZE__UNIT = NFP_REAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATA_SIZE__PRECISION = NFP_REAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>NFP Data Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DATA_SIZE_FEATURE_COUNT = NFP_REAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_EnergyImpl <em>NFP Energy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.NFP_EnergyImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Energy()
	 * @generated
	 */
	int NFP_ENERGY = 11;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_ENERGY__EXPR = NFP_REAL__EXPR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_ENERGY__SOURCE = NFP_REAL__SOURCE;

	/**
	 * The feature id for the '<em><b>Stat Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_ENERGY__STAT_Q = NFP_REAL__STAT_Q;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_ENERGY__DIR = NFP_REAL__DIR;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_ENERGY__MODE = NFP_REAL__MODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_ENERGY__VALUE = NFP_REAL__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_ENERGY__UNIT = NFP_REAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_ENERGY__PRECISION = NFP_REAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>NFP Energy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_ENERGY_FEATURE_COUNT = NFP_REAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_LengthImpl <em>NFP Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.NFP_LengthImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Length()
	 * @generated
	 */
	int NFP_LENGTH = 12;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_LENGTH__EXPR = NFP_REAL__EXPR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_LENGTH__SOURCE = NFP_REAL__SOURCE;

	/**
	 * The feature id for the '<em><b>Stat Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_LENGTH__STAT_Q = NFP_REAL__STAT_Q;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_LENGTH__DIR = NFP_REAL__DIR;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_LENGTH__MODE = NFP_REAL__MODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_LENGTH__VALUE = NFP_REAL__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_LENGTH__UNIT = NFP_REAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_LENGTH__PRECISION = NFP_REAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>NFP Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_LENGTH_FEATURE_COUNT = NFP_REAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_AreaImpl <em>NFP Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.NFP_AreaImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Area()
	 * @generated
	 */
	int NFP_AREA = 13;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_AREA__EXPR = NFP_REAL__EXPR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_AREA__SOURCE = NFP_REAL__SOURCE;

	/**
	 * The feature id for the '<em><b>Stat Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_AREA__STAT_Q = NFP_REAL__STAT_Q;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_AREA__DIR = NFP_REAL__DIR;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_AREA__MODE = NFP_REAL__MODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_AREA__VALUE = NFP_REAL__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_AREA__UNIT = NFP_REAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_AREA__PRECISION = NFP_REAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>NFP Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_AREA_FEATURE_COUNT = NFP_REAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.ArrivalPatternImpl <em>Arrival Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.ArrivalPatternImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getArrivalPattern()
	 * @generated
	 */
	int ARRIVAL_PATTERN = 14;

	/**
	 * The feature id for the '<em><b>Periodic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_PATTERN__PERIODIC = 0;

	/**
	 * The feature id for the '<em><b>Aperiodic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_PATTERN__APERIODIC = 1;

	/**
	 * The feature id for the '<em><b>Burst</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_PATTERN__BURST = 2;

	/**
	 * The feature id for the '<em><b>Irregular</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_PATTERN__IRREGULAR = 3;

	/**
	 * The feature id for the '<em><b>Closed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_PATTERN__CLOSED = 4;

	/**
	 * The feature id for the '<em><b>Sporadic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_PATTERN__SPORADIC = 5;

	/**
	 * The feature id for the '<em><b>Open</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_PATTERN__OPEN = 6;

	/**
	 * The number of structural features of the '<em>Arrival Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_PATTERN_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.PeriodicPatternImpl <em>Periodic Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.PeriodicPatternImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getPeriodicPattern()
	 * @generated
	 */
	int PERIODIC_PATTERN = 15;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PATTERN__PERIOD = 0;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PATTERN__JITTER = 1;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PATTERN__PHASE = 2;

	/**
	 * The feature id for the '<em><b>Occurrences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PATTERN__OCCURRENCES = 3;

	/**
	 * The number of structural features of the '<em>Periodic Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PATTERN_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.AperiodicPatternImpl <em>Aperiodic Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.AperiodicPatternImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getAperiodicPattern()
	 * @generated
	 */
	int APERIODIC_PATTERN = 16;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERIODIC_PATTERN__DISTRIBUTION = 0;

	/**
	 * The number of structural features of the '<em>Aperiodic Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERIODIC_PATTERN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.BurstPatternImpl <em>Burst Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.BurstPatternImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getBurstPattern()
	 * @generated
	 */
	int BURST_PATTERN = 17;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_PATTERN__DISTRIBUTION = APERIODIC_PATTERN__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Min Interarrival</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_PATTERN__MIN_INTERARRIVAL = APERIODIC_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Interarrival</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_PATTERN__MAX_INTERARRIVAL = APERIODIC_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Event Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_PATTERN__MIN_EVENT_INTERVAL = APERIODIC_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Event Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_PATTERN__MAX_EVENT_INTERVAL = APERIODIC_PATTERN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Burst Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_PATTERN__BURST_SIZE = APERIODIC_PATTERN_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Burst Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_PATTERN_FEATURE_COUNT = APERIODIC_PATTERN_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.IrregularPatternImpl <em>Irregular Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.IrregularPatternImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getIrregularPattern()
	 * @generated
	 */
	int IRREGULAR_PATTERN = 18;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_PATTERN__DISTRIBUTION = APERIODIC_PATTERN__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_PATTERN__PHASE = APERIODIC_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interarrivals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_PATTERN__INTERARRIVALS = APERIODIC_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Irregular Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRREGULAR_PATTERN_FEATURE_COUNT = APERIODIC_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.ClosedPatternImpl <em>Closed Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.ClosedPatternImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getClosedPattern()
	 * @generated
	 */
	int CLOSED_PATTERN = 19;

	/**
	 * The feature id for the '<em><b>Population</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PATTERN__POPULATION = 0;

	/**
	 * The feature id for the '<em><b>Ext Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PATTERN__EXT_DELAY = 1;

	/**
	 * The number of structural features of the '<em>Closed Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PATTERN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.SporadicPatternImpl <em>Sporadic Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.SporadicPatternImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getSporadicPattern()
	 * @generated
	 */
	int SPORADIC_PATTERN = 20;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_PATTERN__DISTRIBUTION = APERIODIC_PATTERN__DISTRIBUTION;

	/**
	 * The feature id for the '<em><b>Min Interarrival</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_PATTERN__MIN_INTERARRIVAL = APERIODIC_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Interarrival</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_PATTERN__MAX_INTERARRIVAL = APERIODIC_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_PATTERN__JITTER = APERIODIC_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sporadic Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_PATTERN_FEATURE_COUNT = APERIODIC_PATTERN_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.OpenPatternImpl <em>Open Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.OpenPatternImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getOpenPattern()
	 * @generated
	 */
	int OPEN_PATTERN = 21;

	/**
	 * The feature id for the '<em><b>Inter Arrival Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_PATTERN__INTER_ARRIVAL_TIME = 0;

	/**
	 * The feature id for the '<em><b>Arrival Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_PATTERN__ARRIVAL_RATE = 1;

	/**
	 * The feature id for the '<em><b>Arrival Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_PATTERN__ARRIVAL_PROCESS = 2;

	/**
	 * The number of structural features of the '<em>Open Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_PATTERN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_PercentageImpl <em>NFP Percentage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.NFP_PercentageImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Percentage()
	 * @generated
	 */
	int NFP_PERCENTAGE = 22;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_PERCENTAGE__EXPR = NFP_REAL__EXPR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_PERCENTAGE__SOURCE = NFP_REAL__SOURCE;

	/**
	 * The feature id for the '<em><b>Stat Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_PERCENTAGE__STAT_Q = NFP_REAL__STAT_Q;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_PERCENTAGE__DIR = NFP_REAL__DIR;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_PERCENTAGE__MODE = NFP_REAL__MODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_PERCENTAGE__VALUE = NFP_REAL__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_PERCENTAGE__UNIT = NFP_REAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NFP Percentage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_PERCENTAGE_FEATURE_COUNT = NFP_REAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_PriceImpl <em>NFP Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.NFP_PriceImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Price()
	 * @generated
	 */
	int NFP_PRICE = 23;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_PRICE__EXPR = NFP_REAL__EXPR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_PRICE__SOURCE = NFP_REAL__SOURCE;

	/**
	 * The feature id for the '<em><b>Stat Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_PRICE__STAT_Q = NFP_REAL__STAT_Q;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_PRICE__DIR = NFP_REAL__DIR;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_PRICE__MODE = NFP_REAL__MODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_PRICE__VALUE = NFP_REAL__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_PRICE__UNIT = NFP_REAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NFP Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_PRICE_FEATURE_COUNT = NFP_REAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_WeightImpl <em>NFP Weight</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.NFP_WeightImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Weight()
	 * @generated
	 */
	int NFP_WEIGHT = 24;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_WEIGHT__EXPR = NFP_REAL__EXPR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_WEIGHT__SOURCE = NFP_REAL__SOURCE;

	/**
	 * The feature id for the '<em><b>Stat Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_WEIGHT__STAT_Q = NFP_REAL__STAT_Q;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_WEIGHT__DIR = NFP_REAL__DIR;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_WEIGHT__MODE = NFP_REAL__MODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_WEIGHT__VALUE = NFP_REAL__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_WEIGHT__UNIT = NFP_REAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_WEIGHT__PRECISION = NFP_REAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>NFP Weight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_WEIGHT_FEATURE_COUNT = NFP_REAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_DurationImpl <em>NFP Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.impl.NFP_DurationImpl
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Duration()
	 * @generated
	 */
	int NFP_DURATION = 25;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DURATION__EXPR = NFP_REAL__EXPR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DURATION__SOURCE = NFP_REAL__SOURCE;

	/**
	 * The feature id for the '<em><b>Stat Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DURATION__STAT_Q = NFP_REAL__STAT_Q;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DURATION__DIR = NFP_REAL__DIR;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DURATION__MODE = NFP_REAL__MODE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DURATION__VALUE = NFP_REAL__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DURATION__UNIT = NFP_REAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DURATION__CLOCK = NFP_REAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DURATION__PRECISION = NFP_REAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Worst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DURATION__WORST = NFP_REAL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Best</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DURATION__BEST = NFP_REAL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>NFP Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_DURATION_FEATURE_COUNT = NFP_REAL_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.SourceKind <em>Source Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.SourceKind
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getSourceKind()
	 * @generated
	 */
	int SOURCE_KIND = 26;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.DirectionKind <em>Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.DirectionKind
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getDirectionKind()
	 * @generated
	 */
	int DIRECTION_KIND = 27;

	/**
	 * The meta object id for the '{@link MARTE_Library.BasicNFP_Types.StatisticalQualifierKind <em>Statistical Qualifier Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.BasicNFP_Types.StatisticalQualifierKind
	 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getStatisticalQualifierKind()
	 * @generated
	 */
	int STATISTICAL_QUALIFIER_KIND = 28;


	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.NFP_CommonType <em>NFP Common Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Common Type</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_CommonType
	 * @generated
	 */
	EClass getNFP_CommonType();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_CommonType#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_CommonType#getExpr()
	 * @see #getNFP_CommonType()
	 * @generated
	 */
	EAttribute getNFP_CommonType_Expr();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_CommonType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_CommonType#getSource()
	 * @see #getNFP_CommonType()
	 * @generated
	 */
	EAttribute getNFP_CommonType_Source();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_CommonType#getStatQ <em>Stat Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stat Q</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_CommonType#getStatQ()
	 * @see #getNFP_CommonType()
	 * @generated
	 */
	EAttribute getNFP_CommonType_StatQ();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_CommonType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_CommonType#getDir()
	 * @see #getNFP_CommonType()
	 * @generated
	 */
	EAttribute getNFP_CommonType_Dir();

	/**
	 * Returns the meta object for the attribute list '{@link MARTE_Library.BasicNFP_Types.NFP_CommonType#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mode</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_CommonType#getMode()
	 * @see #getNFP_CommonType()
	 * @generated
	 */
	EAttribute getNFP_CommonType_Mode();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.NFP_Frequency <em>NFP Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Frequency</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Frequency
	 * @generated
	 */
	EClass getNFP_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_Frequency#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Frequency#getUnit()
	 * @see #getNFP_Frequency()
	 * @generated
	 */
	EAttribute getNFP_Frequency_Unit();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_Frequency#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Frequency#getPrecision()
	 * @see #getNFP_Frequency()
	 * @generated
	 */
	EAttribute getNFP_Frequency_Precision();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.NFP_Real <em>NFP Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Real</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Real
	 * @generated
	 */
	EClass getNFP_Real();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_Real#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Real#getValue()
	 * @see #getNFP_Real()
	 * @generated
	 */
	EAttribute getNFP_Real_Value();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.NFP_Natural <em>NFP Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Natural</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Natural
	 * @generated
	 */
	EClass getNFP_Natural();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_Natural#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Natural#getValue()
	 * @see #getNFP_Natural()
	 * @generated
	 */
	EAttribute getNFP_Natural_Value();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.NFP_Boolean <em>NFP Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Boolean</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Boolean
	 * @generated
	 */
	EClass getNFP_Boolean();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_Boolean#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Boolean#getValue()
	 * @see #getNFP_Boolean()
	 * @generated
	 */
	EAttribute getNFP_Boolean_Value();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.NFP_String <em>NFP String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP String</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_String
	 * @generated
	 */
	EClass getNFP_String();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_String#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_String#getValue()
	 * @see #getNFP_String()
	 * @generated
	 */
	EAttribute getNFP_String_Value();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.NFP_Integer <em>NFP Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Integer</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Integer
	 * @generated
	 */
	EClass getNFP_Integer();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_Integer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Integer#getValue()
	 * @see #getNFP_Integer()
	 * @generated
	 */
	EAttribute getNFP_Integer_Value();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.NFP_DateTime <em>NFP Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Date Time</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_DateTime
	 * @generated
	 */
	EClass getNFP_DateTime();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_DateTime#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_DateTime#getValue()
	 * @see #getNFP_DateTime()
	 * @generated
	 */
	EAttribute getNFP_DateTime_Value();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.NFP_DataTxRate <em>NFP Data Tx Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Data Tx Rate</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_DataTxRate
	 * @generated
	 */
	EClass getNFP_DataTxRate();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_DataTxRate#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_DataTxRate#getUnit()
	 * @see #getNFP_DataTxRate()
	 * @generated
	 */
	EAttribute getNFP_DataTxRate_Unit();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_DataTxRate#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_DataTxRate#getPrecision()
	 * @see #getNFP_DataTxRate()
	 * @generated
	 */
	EAttribute getNFP_DataTxRate_Precision();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.NFP_Power <em>NFP Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Power</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Power
	 * @generated
	 */
	EClass getNFP_Power();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_Power#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Power#getUnit()
	 * @see #getNFP_Power()
	 * @generated
	 */
	EAttribute getNFP_Power_Unit();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_Power#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Power#getPrecision()
	 * @see #getNFP_Power()
	 * @generated
	 */
	EAttribute getNFP_Power_Precision();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.NFP_DataSize <em>NFP Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Data Size</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_DataSize
	 * @generated
	 */
	EClass getNFP_DataSize();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_DataSize#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_DataSize#getUnit()
	 * @see #getNFP_DataSize()
	 * @generated
	 */
	EAttribute getNFP_DataSize_Unit();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_DataSize#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_DataSize#getPrecision()
	 * @see #getNFP_DataSize()
	 * @generated
	 */
	EAttribute getNFP_DataSize_Precision();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.NFP_Energy <em>NFP Energy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Energy</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Energy
	 * @generated
	 */
	EClass getNFP_Energy();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_Energy#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Energy#getUnit()
	 * @see #getNFP_Energy()
	 * @generated
	 */
	EAttribute getNFP_Energy_Unit();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_Energy#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Energy#getPrecision()
	 * @see #getNFP_Energy()
	 * @generated
	 */
	EAttribute getNFP_Energy_Precision();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.NFP_Length <em>NFP Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Length</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Length
	 * @generated
	 */
	EClass getNFP_Length();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_Length#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Length#getUnit()
	 * @see #getNFP_Length()
	 * @generated
	 */
	EAttribute getNFP_Length_Unit();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_Length#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Length#getPrecision()
	 * @see #getNFP_Length()
	 * @generated
	 */
	EAttribute getNFP_Length_Precision();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.NFP_Area <em>NFP Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Area</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Area
	 * @generated
	 */
	EClass getNFP_Area();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_Area#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Area#getUnit()
	 * @see #getNFP_Area()
	 * @generated
	 */
	EAttribute getNFP_Area_Unit();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_Area#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Area#getPrecision()
	 * @see #getNFP_Area()
	 * @generated
	 */
	EAttribute getNFP_Area_Precision();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.ArrivalPattern <em>Arrival Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrival Pattern</em>'.
	 * @see MARTE_Library.BasicNFP_Types.ArrivalPattern
	 * @generated
	 */
	EClass getArrivalPattern();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.ArrivalPattern#getPeriodic <em>Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Periodic</em>'.
	 * @see MARTE_Library.BasicNFP_Types.ArrivalPattern#getPeriodic()
	 * @see #getArrivalPattern()
	 * @generated
	 */
	EReference getArrivalPattern_Periodic();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.ArrivalPattern#getAperiodic <em>Aperiodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aperiodic</em>'.
	 * @see MARTE_Library.BasicNFP_Types.ArrivalPattern#getAperiodic()
	 * @see #getArrivalPattern()
	 * @generated
	 */
	EReference getArrivalPattern_Aperiodic();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.ArrivalPattern#getBurst <em>Burst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Burst</em>'.
	 * @see MARTE_Library.BasicNFP_Types.ArrivalPattern#getBurst()
	 * @see #getArrivalPattern()
	 * @generated
	 */
	EReference getArrivalPattern_Burst();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.ArrivalPattern#getIrregular <em>Irregular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Irregular</em>'.
	 * @see MARTE_Library.BasicNFP_Types.ArrivalPattern#getIrregular()
	 * @see #getArrivalPattern()
	 * @generated
	 */
	EReference getArrivalPattern_Irregular();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.ArrivalPattern#getClosed <em>Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Closed</em>'.
	 * @see MARTE_Library.BasicNFP_Types.ArrivalPattern#getClosed()
	 * @see #getArrivalPattern()
	 * @generated
	 */
	EReference getArrivalPattern_Closed();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.ArrivalPattern#getSporadic <em>Sporadic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sporadic</em>'.
	 * @see MARTE_Library.BasicNFP_Types.ArrivalPattern#getSporadic()
	 * @see #getArrivalPattern()
	 * @generated
	 */
	EReference getArrivalPattern_Sporadic();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.ArrivalPattern#getOpen <em>Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Open</em>'.
	 * @see MARTE_Library.BasicNFP_Types.ArrivalPattern#getOpen()
	 * @see #getArrivalPattern()
	 * @generated
	 */
	EReference getArrivalPattern_Open();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.PeriodicPattern <em>Periodic Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Pattern</em>'.
	 * @see MARTE_Library.BasicNFP_Types.PeriodicPattern
	 * @generated
	 */
	EClass getPeriodicPattern();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.PeriodicPattern#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see MARTE_Library.BasicNFP_Types.PeriodicPattern#getPeriod()
	 * @see #getPeriodicPattern()
	 * @generated
	 */
	EReference getPeriodicPattern_Period();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.PeriodicPattern#getJitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jitter</em>'.
	 * @see MARTE_Library.BasicNFP_Types.PeriodicPattern#getJitter()
	 * @see #getPeriodicPattern()
	 * @generated
	 */
	EReference getPeriodicPattern_Jitter();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.PeriodicPattern#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phase</em>'.
	 * @see MARTE_Library.BasicNFP_Types.PeriodicPattern#getPhase()
	 * @see #getPeriodicPattern()
	 * @generated
	 */
	EReference getPeriodicPattern_Phase();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.PeriodicPattern#getOccurrences <em>Occurrences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Occurrences</em>'.
	 * @see MARTE_Library.BasicNFP_Types.PeriodicPattern#getOccurrences()
	 * @see #getPeriodicPattern()
	 * @generated
	 */
	EReference getPeriodicPattern_Occurrences();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.AperiodicPattern <em>Aperiodic Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aperiodic Pattern</em>'.
	 * @see MARTE_Library.BasicNFP_Types.AperiodicPattern
	 * @generated
	 */
	EClass getAperiodicPattern();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.AperiodicPattern#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distribution</em>'.
	 * @see MARTE_Library.BasicNFP_Types.AperiodicPattern#getDistribution()
	 * @see #getAperiodicPattern()
	 * @generated
	 */
	EReference getAperiodicPattern_Distribution();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.BurstPattern <em>Burst Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Burst Pattern</em>'.
	 * @see MARTE_Library.BasicNFP_Types.BurstPattern
	 * @generated
	 */
	EClass getBurstPattern();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.BurstPattern#getMinInterarrival <em>Min Interarrival</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Interarrival</em>'.
	 * @see MARTE_Library.BasicNFP_Types.BurstPattern#getMinInterarrival()
	 * @see #getBurstPattern()
	 * @generated
	 */
	EReference getBurstPattern_MinInterarrival();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.BurstPattern#getMaxInterarrival <em>Max Interarrival</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Interarrival</em>'.
	 * @see MARTE_Library.BasicNFP_Types.BurstPattern#getMaxInterarrival()
	 * @see #getBurstPattern()
	 * @generated
	 */
	EReference getBurstPattern_MaxInterarrival();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.BurstPattern#getMinEventInterval <em>Min Event Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Event Interval</em>'.
	 * @see MARTE_Library.BasicNFP_Types.BurstPattern#getMinEventInterval()
	 * @see #getBurstPattern()
	 * @generated
	 */
	EReference getBurstPattern_MinEventInterval();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.BurstPattern#getMaxEventInterval <em>Max Event Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Event Interval</em>'.
	 * @see MARTE_Library.BasicNFP_Types.BurstPattern#getMaxEventInterval()
	 * @see #getBurstPattern()
	 * @generated
	 */
	EReference getBurstPattern_MaxEventInterval();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.BurstPattern#getBurstSize <em>Burst Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Burst Size</em>'.
	 * @see MARTE_Library.BasicNFP_Types.BurstPattern#getBurstSize()
	 * @see #getBurstPattern()
	 * @generated
	 */
	EReference getBurstPattern_BurstSize();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.IrregularPattern <em>Irregular Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Irregular Pattern</em>'.
	 * @see MARTE_Library.BasicNFP_Types.IrregularPattern
	 * @generated
	 */
	EClass getIrregularPattern();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.IrregularPattern#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phase</em>'.
	 * @see MARTE_Library.BasicNFP_Types.IrregularPattern#getPhase()
	 * @see #getIrregularPattern()
	 * @generated
	 */
	EReference getIrregularPattern_Phase();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE_Library.BasicNFP_Types.IrregularPattern#getInterarrivals <em>Interarrivals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interarrivals</em>'.
	 * @see MARTE_Library.BasicNFP_Types.IrregularPattern#getInterarrivals()
	 * @see #getIrregularPattern()
	 * @generated
	 */
	EReference getIrregularPattern_Interarrivals();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.ClosedPattern <em>Closed Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Closed Pattern</em>'.
	 * @see MARTE_Library.BasicNFP_Types.ClosedPattern
	 * @generated
	 */
	EClass getClosedPattern();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.ClosedPattern#getPopulation <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Population</em>'.
	 * @see MARTE_Library.BasicNFP_Types.ClosedPattern#getPopulation()
	 * @see #getClosedPattern()
	 * @generated
	 */
	EReference getClosedPattern_Population();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.ClosedPattern#getExtDelay <em>Ext Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ext Delay</em>'.
	 * @see MARTE_Library.BasicNFP_Types.ClosedPattern#getExtDelay()
	 * @see #getClosedPattern()
	 * @generated
	 */
	EReference getClosedPattern_ExtDelay();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.SporadicPattern <em>Sporadic Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sporadic Pattern</em>'.
	 * @see MARTE_Library.BasicNFP_Types.SporadicPattern
	 * @generated
	 */
	EClass getSporadicPattern();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.SporadicPattern#getMinInterarrival <em>Min Interarrival</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Interarrival</em>'.
	 * @see MARTE_Library.BasicNFP_Types.SporadicPattern#getMinInterarrival()
	 * @see #getSporadicPattern()
	 * @generated
	 */
	EReference getSporadicPattern_MinInterarrival();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.SporadicPattern#getMaxInterarrival <em>Max Interarrival</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Interarrival</em>'.
	 * @see MARTE_Library.BasicNFP_Types.SporadicPattern#getMaxInterarrival()
	 * @see #getSporadicPattern()
	 * @generated
	 */
	EReference getSporadicPattern_MaxInterarrival();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.SporadicPattern#getJitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jitter</em>'.
	 * @see MARTE_Library.BasicNFP_Types.SporadicPattern#getJitter()
	 * @see #getSporadicPattern()
	 * @generated
	 */
	EReference getSporadicPattern_Jitter();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.OpenPattern <em>Open Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Pattern</em>'.
	 * @see MARTE_Library.BasicNFP_Types.OpenPattern
	 * @generated
	 */
	EClass getOpenPattern();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.OpenPattern#getInterArrivalTime <em>Inter Arrival Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inter Arrival Time</em>'.
	 * @see MARTE_Library.BasicNFP_Types.OpenPattern#getInterArrivalTime()
	 * @see #getOpenPattern()
	 * @generated
	 */
	EReference getOpenPattern_InterArrivalTime();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.BasicNFP_Types.OpenPattern#getArrivalRate <em>Arrival Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arrival Rate</em>'.
	 * @see MARTE_Library.BasicNFP_Types.OpenPattern#getArrivalRate()
	 * @see #getOpenPattern()
	 * @generated
	 */
	EReference getOpenPattern_ArrivalRate();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.OpenPattern#getArrivalProcess <em>Arrival Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrival Process</em>'.
	 * @see MARTE_Library.BasicNFP_Types.OpenPattern#getArrivalProcess()
	 * @see #getOpenPattern()
	 * @generated
	 */
	EAttribute getOpenPattern_ArrivalProcess();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.NFP_Percentage <em>NFP Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Percentage</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Percentage
	 * @generated
	 */
	EClass getNFP_Percentage();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_Percentage#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Percentage#getUnit()
	 * @see #getNFP_Percentage()
	 * @generated
	 */
	EAttribute getNFP_Percentage_Unit();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.NFP_Price <em>NFP Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Price</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Price
	 * @generated
	 */
	EClass getNFP_Price();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_Price#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Price#getUnit()
	 * @see #getNFP_Price()
	 * @generated
	 */
	EAttribute getNFP_Price_Unit();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.NFP_Weight <em>NFP Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Weight</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Weight
	 * @generated
	 */
	EClass getNFP_Weight();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_Weight#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Weight#getUnit()
	 * @see #getNFP_Weight()
	 * @generated
	 */
	EAttribute getNFP_Weight_Unit();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_Weight#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Weight#getPrecision()
	 * @see #getNFP_Weight()
	 * @generated
	 */
	EAttribute getNFP_Weight_Precision();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.BasicNFP_Types.NFP_Duration <em>NFP Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Duration</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Duration
	 * @generated
	 */
	EClass getNFP_Duration();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_Duration#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Duration#getUnit()
	 * @see #getNFP_Duration()
	 * @generated
	 */
	EAttribute getNFP_Duration_Unit();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_Duration#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Duration#getClock()
	 * @see #getNFP_Duration()
	 * @generated
	 */
	EAttribute getNFP_Duration_Clock();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_Duration#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Duration#getPrecision()
	 * @see #getNFP_Duration()
	 * @generated
	 */
	EAttribute getNFP_Duration_Precision();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_Duration#getWorst <em>Worst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worst</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Duration#getWorst()
	 * @see #getNFP_Duration()
	 * @generated
	 */
	EAttribute getNFP_Duration_Worst();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.BasicNFP_Types.NFP_Duration#getBest <em>Best</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Best</em>'.
	 * @see MARTE_Library.BasicNFP_Types.NFP_Duration#getBest()
	 * @see #getNFP_Duration()
	 * @generated
	 */
	EAttribute getNFP_Duration_Best();

	/**
	 * Returns the meta object for enum '{@link MARTE_Library.BasicNFP_Types.SourceKind <em>Source Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Source Kind</em>'.
	 * @see MARTE_Library.BasicNFP_Types.SourceKind
	 * @generated
	 */
	EEnum getSourceKind();

	/**
	 * Returns the meta object for enum '{@link MARTE_Library.BasicNFP_Types.DirectionKind <em>Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Kind</em>'.
	 * @see MARTE_Library.BasicNFP_Types.DirectionKind
	 * @generated
	 */
	EEnum getDirectionKind();

	/**
	 * Returns the meta object for enum '{@link MARTE_Library.BasicNFP_Types.StatisticalQualifierKind <em>Statistical Qualifier Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Statistical Qualifier Kind</em>'.
	 * @see MARTE_Library.BasicNFP_Types.StatisticalQualifierKind
	 * @generated
	 */
	EEnum getStatisticalQualifierKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasicNFP_TypesFactory getBasicNFP_TypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_CommonTypeImpl <em>NFP Common Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.NFP_CommonTypeImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_CommonType()
		 * @generated
		 */
		EClass NFP_COMMON_TYPE = eINSTANCE.getNFP_CommonType();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_COMMON_TYPE__EXPR = eINSTANCE.getNFP_CommonType_Expr();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_COMMON_TYPE__SOURCE = eINSTANCE.getNFP_CommonType_Source();

		/**
		 * The meta object literal for the '<em><b>Stat Q</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_COMMON_TYPE__STAT_Q = eINSTANCE.getNFP_CommonType_StatQ();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_COMMON_TYPE__DIR = eINSTANCE.getNFP_CommonType_Dir();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_COMMON_TYPE__MODE = eINSTANCE.getNFP_CommonType_Mode();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_FrequencyImpl <em>NFP Frequency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.NFP_FrequencyImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Frequency()
		 * @generated
		 */
		EClass NFP_FREQUENCY = eINSTANCE.getNFP_Frequency();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_FREQUENCY__UNIT = eINSTANCE.getNFP_Frequency_Unit();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_FREQUENCY__PRECISION = eINSTANCE.getNFP_Frequency_Precision();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_RealImpl <em>NFP Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.NFP_RealImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Real()
		 * @generated
		 */
		EClass NFP_REAL = eINSTANCE.getNFP_Real();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_REAL__VALUE = eINSTANCE.getNFP_Real_Value();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_NaturalImpl <em>NFP Natural</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.NFP_NaturalImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Natural()
		 * @generated
		 */
		EClass NFP_NATURAL = eINSTANCE.getNFP_Natural();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_NATURAL__VALUE = eINSTANCE.getNFP_Natural_Value();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_BooleanImpl <em>NFP Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.NFP_BooleanImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Boolean()
		 * @generated
		 */
		EClass NFP_BOOLEAN = eINSTANCE.getNFP_Boolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_BOOLEAN__VALUE = eINSTANCE.getNFP_Boolean_Value();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_StringImpl <em>NFP String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.NFP_StringImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_String()
		 * @generated
		 */
		EClass NFP_STRING = eINSTANCE.getNFP_String();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_STRING__VALUE = eINSTANCE.getNFP_String_Value();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_IntegerImpl <em>NFP Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.NFP_IntegerImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Integer()
		 * @generated
		 */
		EClass NFP_INTEGER = eINSTANCE.getNFP_Integer();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_INTEGER__VALUE = eINSTANCE.getNFP_Integer_Value();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_DateTimeImpl <em>NFP Date Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.NFP_DateTimeImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_DateTime()
		 * @generated
		 */
		EClass NFP_DATE_TIME = eINSTANCE.getNFP_DateTime();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_DATE_TIME__VALUE = eINSTANCE.getNFP_DateTime_Value();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_DataTxRateImpl <em>NFP Data Tx Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.NFP_DataTxRateImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_DataTxRate()
		 * @generated
		 */
		EClass NFP_DATA_TX_RATE = eINSTANCE.getNFP_DataTxRate();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_DATA_TX_RATE__UNIT = eINSTANCE.getNFP_DataTxRate_Unit();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_DATA_TX_RATE__PRECISION = eINSTANCE.getNFP_DataTxRate_Precision();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_PowerImpl <em>NFP Power</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.NFP_PowerImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Power()
		 * @generated
		 */
		EClass NFP_POWER = eINSTANCE.getNFP_Power();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_POWER__UNIT = eINSTANCE.getNFP_Power_Unit();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_POWER__PRECISION = eINSTANCE.getNFP_Power_Precision();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_DataSizeImpl <em>NFP Data Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.NFP_DataSizeImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_DataSize()
		 * @generated
		 */
		EClass NFP_DATA_SIZE = eINSTANCE.getNFP_DataSize();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_DATA_SIZE__UNIT = eINSTANCE.getNFP_DataSize_Unit();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_DATA_SIZE__PRECISION = eINSTANCE.getNFP_DataSize_Precision();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_EnergyImpl <em>NFP Energy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.NFP_EnergyImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Energy()
		 * @generated
		 */
		EClass NFP_ENERGY = eINSTANCE.getNFP_Energy();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_ENERGY__UNIT = eINSTANCE.getNFP_Energy_Unit();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_ENERGY__PRECISION = eINSTANCE.getNFP_Energy_Precision();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_LengthImpl <em>NFP Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.NFP_LengthImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Length()
		 * @generated
		 */
		EClass NFP_LENGTH = eINSTANCE.getNFP_Length();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_LENGTH__UNIT = eINSTANCE.getNFP_Length_Unit();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_LENGTH__PRECISION = eINSTANCE.getNFP_Length_Precision();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_AreaImpl <em>NFP Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.NFP_AreaImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Area()
		 * @generated
		 */
		EClass NFP_AREA = eINSTANCE.getNFP_Area();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_AREA__UNIT = eINSTANCE.getNFP_Area_Unit();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_AREA__PRECISION = eINSTANCE.getNFP_Area_Precision();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.ArrivalPatternImpl <em>Arrival Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.ArrivalPatternImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getArrivalPattern()
		 * @generated
		 */
		EClass ARRIVAL_PATTERN = eINSTANCE.getArrivalPattern();

		/**
		 * The meta object literal for the '<em><b>Periodic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRIVAL_PATTERN__PERIODIC = eINSTANCE.getArrivalPattern_Periodic();

		/**
		 * The meta object literal for the '<em><b>Aperiodic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRIVAL_PATTERN__APERIODIC = eINSTANCE.getArrivalPattern_Aperiodic();

		/**
		 * The meta object literal for the '<em><b>Burst</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRIVAL_PATTERN__BURST = eINSTANCE.getArrivalPattern_Burst();

		/**
		 * The meta object literal for the '<em><b>Irregular</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRIVAL_PATTERN__IRREGULAR = eINSTANCE.getArrivalPattern_Irregular();

		/**
		 * The meta object literal for the '<em><b>Closed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRIVAL_PATTERN__CLOSED = eINSTANCE.getArrivalPattern_Closed();

		/**
		 * The meta object literal for the '<em><b>Sporadic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRIVAL_PATTERN__SPORADIC = eINSTANCE.getArrivalPattern_Sporadic();

		/**
		 * The meta object literal for the '<em><b>Open</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRIVAL_PATTERN__OPEN = eINSTANCE.getArrivalPattern_Open();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.PeriodicPatternImpl <em>Periodic Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.PeriodicPatternImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getPeriodicPattern()
		 * @generated
		 */
		EClass PERIODIC_PATTERN = eINSTANCE.getPeriodicPattern();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_PATTERN__PERIOD = eINSTANCE.getPeriodicPattern_Period();

		/**
		 * The meta object literal for the '<em><b>Jitter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_PATTERN__JITTER = eINSTANCE.getPeriodicPattern_Jitter();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_PATTERN__PHASE = eINSTANCE.getPeriodicPattern_Phase();

		/**
		 * The meta object literal for the '<em><b>Occurrences</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_PATTERN__OCCURRENCES = eINSTANCE.getPeriodicPattern_Occurrences();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.AperiodicPatternImpl <em>Aperiodic Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.AperiodicPatternImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getAperiodicPattern()
		 * @generated
		 */
		EClass APERIODIC_PATTERN = eINSTANCE.getAperiodicPattern();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APERIODIC_PATTERN__DISTRIBUTION = eINSTANCE.getAperiodicPattern_Distribution();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.BurstPatternImpl <em>Burst Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.BurstPatternImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getBurstPattern()
		 * @generated
		 */
		EClass BURST_PATTERN = eINSTANCE.getBurstPattern();

		/**
		 * The meta object literal for the '<em><b>Min Interarrival</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BURST_PATTERN__MIN_INTERARRIVAL = eINSTANCE.getBurstPattern_MinInterarrival();

		/**
		 * The meta object literal for the '<em><b>Max Interarrival</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BURST_PATTERN__MAX_INTERARRIVAL = eINSTANCE.getBurstPattern_MaxInterarrival();

		/**
		 * The meta object literal for the '<em><b>Min Event Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BURST_PATTERN__MIN_EVENT_INTERVAL = eINSTANCE.getBurstPattern_MinEventInterval();

		/**
		 * The meta object literal for the '<em><b>Max Event Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BURST_PATTERN__MAX_EVENT_INTERVAL = eINSTANCE.getBurstPattern_MaxEventInterval();

		/**
		 * The meta object literal for the '<em><b>Burst Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BURST_PATTERN__BURST_SIZE = eINSTANCE.getBurstPattern_BurstSize();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.IrregularPatternImpl <em>Irregular Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.IrregularPatternImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getIrregularPattern()
		 * @generated
		 */
		EClass IRREGULAR_PATTERN = eINSTANCE.getIrregularPattern();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IRREGULAR_PATTERN__PHASE = eINSTANCE.getIrregularPattern_Phase();

		/**
		 * The meta object literal for the '<em><b>Interarrivals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IRREGULAR_PATTERN__INTERARRIVALS = eINSTANCE.getIrregularPattern_Interarrivals();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.ClosedPatternImpl <em>Closed Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.ClosedPatternImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getClosedPattern()
		 * @generated
		 */
		EClass CLOSED_PATTERN = eINSTANCE.getClosedPattern();

		/**
		 * The meta object literal for the '<em><b>Population</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOSED_PATTERN__POPULATION = eINSTANCE.getClosedPattern_Population();

		/**
		 * The meta object literal for the '<em><b>Ext Delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOSED_PATTERN__EXT_DELAY = eINSTANCE.getClosedPattern_ExtDelay();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.SporadicPatternImpl <em>Sporadic Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.SporadicPatternImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getSporadicPattern()
		 * @generated
		 */
		EClass SPORADIC_PATTERN = eINSTANCE.getSporadicPattern();

		/**
		 * The meta object literal for the '<em><b>Min Interarrival</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPORADIC_PATTERN__MIN_INTERARRIVAL = eINSTANCE.getSporadicPattern_MinInterarrival();

		/**
		 * The meta object literal for the '<em><b>Max Interarrival</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPORADIC_PATTERN__MAX_INTERARRIVAL = eINSTANCE.getSporadicPattern_MaxInterarrival();

		/**
		 * The meta object literal for the '<em><b>Jitter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPORADIC_PATTERN__JITTER = eINSTANCE.getSporadicPattern_Jitter();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.OpenPatternImpl <em>Open Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.OpenPatternImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getOpenPattern()
		 * @generated
		 */
		EClass OPEN_PATTERN = eINSTANCE.getOpenPattern();

		/**
		 * The meta object literal for the '<em><b>Inter Arrival Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_PATTERN__INTER_ARRIVAL_TIME = eINSTANCE.getOpenPattern_InterArrivalTime();

		/**
		 * The meta object literal for the '<em><b>Arrival Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_PATTERN__ARRIVAL_RATE = eINSTANCE.getOpenPattern_ArrivalRate();

		/**
		 * The meta object literal for the '<em><b>Arrival Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_PATTERN__ARRIVAL_PROCESS = eINSTANCE.getOpenPattern_ArrivalProcess();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_PercentageImpl <em>NFP Percentage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.NFP_PercentageImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Percentage()
		 * @generated
		 */
		EClass NFP_PERCENTAGE = eINSTANCE.getNFP_Percentage();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_PERCENTAGE__UNIT = eINSTANCE.getNFP_Percentage_Unit();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_PriceImpl <em>NFP Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.NFP_PriceImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Price()
		 * @generated
		 */
		EClass NFP_PRICE = eINSTANCE.getNFP_Price();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_PRICE__UNIT = eINSTANCE.getNFP_Price_Unit();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_WeightImpl <em>NFP Weight</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.NFP_WeightImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Weight()
		 * @generated
		 */
		EClass NFP_WEIGHT = eINSTANCE.getNFP_Weight();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_WEIGHT__UNIT = eINSTANCE.getNFP_Weight_Unit();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_WEIGHT__PRECISION = eINSTANCE.getNFP_Weight_Precision();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.impl.NFP_DurationImpl <em>NFP Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.impl.NFP_DurationImpl
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getNFP_Duration()
		 * @generated
		 */
		EClass NFP_DURATION = eINSTANCE.getNFP_Duration();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_DURATION__UNIT = eINSTANCE.getNFP_Duration_Unit();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_DURATION__CLOCK = eINSTANCE.getNFP_Duration_Clock();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_DURATION__PRECISION = eINSTANCE.getNFP_Duration_Precision();

		/**
		 * The meta object literal for the '<em><b>Worst</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_DURATION__WORST = eINSTANCE.getNFP_Duration_Worst();

		/**
		 * The meta object literal for the '<em><b>Best</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_DURATION__BEST = eINSTANCE.getNFP_Duration_Best();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.SourceKind <em>Source Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.SourceKind
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getSourceKind()
		 * @generated
		 */
		EEnum SOURCE_KIND = eINSTANCE.getSourceKind();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.DirectionKind <em>Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.DirectionKind
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getDirectionKind()
		 * @generated
		 */
		EEnum DIRECTION_KIND = eINSTANCE.getDirectionKind();

		/**
		 * The meta object literal for the '{@link MARTE_Library.BasicNFP_Types.StatisticalQualifierKind <em>Statistical Qualifier Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.BasicNFP_Types.StatisticalQualifierKind
		 * @see MARTE_Library.BasicNFP_Types.impl.BasicNFP_TypesPackageImpl#getStatisticalQualifierKind()
		 * @generated
		 */
		EEnum STATISTICAL_QUALIFIER_KIND = eINSTANCE.getStatisticalQualifierKind();

	}

} //BasicNFP_TypesPackage
