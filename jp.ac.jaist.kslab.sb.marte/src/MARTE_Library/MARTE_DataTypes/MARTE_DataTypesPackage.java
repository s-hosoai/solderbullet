/**
 */
package MARTE_Library.MARTE_DataTypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see MARTE_Library.MARTE_DataTypes.MARTE_DataTypesFactory
 * @model kind="package"
 * @generated
 */
public interface MARTE_DataTypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MARTE_DataTypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///MARTE_Library/MARTE_DataTypes.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MARTE_Library.MARTE_DataTypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MARTE_DataTypesPackage eINSTANCE = MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link MARTE_Library.MARTE_DataTypes.impl.IntegerVectorImpl <em>Integer Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.MARTE_DataTypes.impl.IntegerVectorImpl
	 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getIntegerVector()
	 * @generated
	 */
	int INTEGER_VECTOR = 0;

	/**
	 * The feature id for the '<em><b>Vector Elem</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VECTOR__VECTOR_ELEM = 0;

	/**
	 * The number of structural features of the '<em>Integer Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VECTOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link MARTE_Library.MARTE_DataTypes.impl.IntegerMatrixImpl <em>Integer Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.MARTE_DataTypes.impl.IntegerMatrixImpl
	 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getIntegerMatrix()
	 * @generated
	 */
	int INTEGER_MATRIX = 1;

	/**
	 * The feature id for the '<em><b>Matrix Elem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_MATRIX__MATRIX_ELEM = 0;

	/**
	 * The number of structural features of the '<em>Integer Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_MATRIX_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link MARTE_Library.MARTE_DataTypes.impl.IntegerIntervalImpl <em>Integer Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.MARTE_DataTypes.impl.IntegerIntervalImpl
	 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getIntegerInterval()
	 * @generated
	 */
	int INTEGER_INTERVAL = 2;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INTERVAL__BOUND = 0;

	/**
	 * The number of structural features of the '<em>Integer Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INTERVAL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link MARTE_Library.MARTE_DataTypes.impl.UtilityTypeImpl <em>Utility Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.MARTE_DataTypes.impl.UtilityTypeImpl
	 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getUtilityType()
	 * @generated
	 */
	int UTILITY_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Utility Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link MARTE_Library.MARTE_DataTypes.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.MARTE_DataTypes.impl.ArrayImpl
	 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 4;

	/**
	 * The feature id for the '<em><b>Vector Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__VECTOR_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link MARTE_Library.MARTE_DataTypes.impl.IntervalImpl <em>Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.MARTE_DataTypes.impl.IntervalImpl
	 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getInterval()
	 * @generated
	 */
	int INTERVAL = 5;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__BOUND = 0;

	/**
	 * The number of structural features of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link MARTE_Library.MARTE_DataTypes.impl.RealntervalImpl <em>Realnterval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.MARTE_DataTypes.impl.RealntervalImpl
	 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getRealnterval()
	 * @generated
	 */
	int REALNTERVAL = 6;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALNTERVAL__BOUND = 0;

	/**
	 * The number of structural features of the '<em>Realnterval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALNTERVAL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link MARTE_Library.MARTE_DataTypes.impl.NFP_FrequencyIntervalImpl <em>NFP Frequency Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.MARTE_DataTypes.impl.NFP_FrequencyIntervalImpl
	 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getNFP_FrequencyInterval()
	 * @generated
	 */
	int NFP_FREQUENCY_INTERVAL = 7;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_FREQUENCY_INTERVAL__BOUND = 0;

	/**
	 * The number of structural features of the '<em>NFP Frequency Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_FREQUENCY_INTERVAL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link MARTE_Library.MARTE_DataTypes.impl.NFP_NaturalIntervalImpl <em>NFP Natural Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.MARTE_DataTypes.impl.NFP_NaturalIntervalImpl
	 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getNFP_NaturalInterval()
	 * @generated
	 */
	int NFP_NATURAL_INTERVAL = 8;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_NATURAL_INTERVAL__BOUND = 0;

	/**
	 * The number of structural features of the '<em>NFP Natural Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_NATURAL_INTERVAL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link MARTE_Library.MARTE_DataTypes.impl.RealVectorImpl <em>Real Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.MARTE_DataTypes.impl.RealVectorImpl
	 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getRealVector()
	 * @generated
	 */
	int REAL_VECTOR = 9;

	/**
	 * The feature id for the '<em><b>Vector Elem</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VECTOR__VECTOR_ELEM = 0;

	/**
	 * The number of structural features of the '<em>Real Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VECTOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link MARTE_Library.MARTE_DataTypes.impl.RealMatrixImpl <em>Real Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.MARTE_DataTypes.impl.RealMatrixImpl
	 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getRealMatrix()
	 * @generated
	 */
	int REAL_MATRIX = 10;

	/**
	 * The feature id for the '<em><b>Matrix Elem</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_MATRIX__MATRIX_ELEM = 0;

	/**
	 * The number of structural features of the '<em>Real Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_MATRIX_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link MARTE_Library.MARTE_DataTypes.TransmModeKind <em>Transm Mode Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.MARTE_DataTypes.TransmModeKind
	 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getTransmModeKind()
	 * @generated
	 */
	int TRANSM_MODE_KIND = 11;

	/**
	 * The meta object id for the '<em>VSL Expression</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getVSL_Expression()
	 * @generated
	 */
	int VSL_EXPRESSION = 12;


	/**
	 * Returns the meta object for class '{@link MARTE_Library.MARTE_DataTypes.IntegerVector <em>Integer Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Vector</em>'.
	 * @see MARTE_Library.MARTE_DataTypes.IntegerVector
	 * @generated
	 */
	EClass getIntegerVector();

	/**
	 * Returns the meta object for the attribute list '{@link MARTE_Library.MARTE_DataTypes.IntegerVector#getVectorElem <em>Vector Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Vector Elem</em>'.
	 * @see MARTE_Library.MARTE_DataTypes.IntegerVector#getVectorElem()
	 * @see #getIntegerVector()
	 * @generated
	 */
	EAttribute getIntegerVector_VectorElem();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.MARTE_DataTypes.IntegerMatrix <em>Integer Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Matrix</em>'.
	 * @see MARTE_Library.MARTE_DataTypes.IntegerMatrix
	 * @generated
	 */
	EClass getIntegerMatrix();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE_Library.MARTE_DataTypes.IntegerMatrix#getMatrixElem <em>Matrix Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matrix Elem</em>'.
	 * @see MARTE_Library.MARTE_DataTypes.IntegerMatrix#getMatrixElem()
	 * @see #getIntegerMatrix()
	 * @generated
	 */
	EReference getIntegerMatrix_MatrixElem();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.MARTE_DataTypes.IntegerInterval <em>Integer Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Interval</em>'.
	 * @see MARTE_Library.MARTE_DataTypes.IntegerInterval
	 * @generated
	 */
	EClass getIntegerInterval();

	/**
	 * Returns the meta object for the attribute list '{@link MARTE_Library.MARTE_DataTypes.IntegerInterval#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bound</em>'.
	 * @see MARTE_Library.MARTE_DataTypes.IntegerInterval#getBound()
	 * @see #getIntegerInterval()
	 * @generated
	 */
	EAttribute getIntegerInterval_Bound();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.MARTE_DataTypes.UtilityType <em>Utility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utility Type</em>'.
	 * @see MARTE_Library.MARTE_DataTypes.UtilityType
	 * @generated
	 */
	EClass getUtilityType();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.MARTE_DataTypes.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see MARTE_Library.MARTE_DataTypes.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE_Library.MARTE_DataTypes.Array#getVectorElement <em>Vector Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vector Element</em>'.
	 * @see MARTE_Library.MARTE_DataTypes.Array#getVectorElement()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_VectorElement();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.MARTE_DataTypes.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval</em>'.
	 * @see MARTE_Library.MARTE_DataTypes.Interval
	 * @generated
	 */
	EClass getInterval();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE_Library.MARTE_DataTypes.Interval#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bound</em>'.
	 * @see MARTE_Library.MARTE_DataTypes.Interval#getBound()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_Bound();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.MARTE_DataTypes.Realnterval <em>Realnterval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realnterval</em>'.
	 * @see MARTE_Library.MARTE_DataTypes.Realnterval
	 * @generated
	 */
	EClass getRealnterval();

	/**
	 * Returns the meta object for the attribute list '{@link MARTE_Library.MARTE_DataTypes.Realnterval#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bound</em>'.
	 * @see MARTE_Library.MARTE_DataTypes.Realnterval#getBound()
	 * @see #getRealnterval()
	 * @generated
	 */
	EAttribute getRealnterval_Bound();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.MARTE_DataTypes.NFP_FrequencyInterval <em>NFP Frequency Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Frequency Interval</em>'.
	 * @see MARTE_Library.MARTE_DataTypes.NFP_FrequencyInterval
	 * @generated
	 */
	EClass getNFP_FrequencyInterval();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE_Library.MARTE_DataTypes.NFP_FrequencyInterval#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bound</em>'.
	 * @see MARTE_Library.MARTE_DataTypes.NFP_FrequencyInterval#getBound()
	 * @see #getNFP_FrequencyInterval()
	 * @generated
	 */
	EReference getNFP_FrequencyInterval_Bound();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.MARTE_DataTypes.NFP_NaturalInterval <em>NFP Natural Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Natural Interval</em>'.
	 * @see MARTE_Library.MARTE_DataTypes.NFP_NaturalInterval
	 * @generated
	 */
	EClass getNFP_NaturalInterval();

	/**
	 * Returns the meta object for the containment reference list '{@link MARTE_Library.MARTE_DataTypes.NFP_NaturalInterval#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bound</em>'.
	 * @see MARTE_Library.MARTE_DataTypes.NFP_NaturalInterval#getBound()
	 * @see #getNFP_NaturalInterval()
	 * @generated
	 */
	EReference getNFP_NaturalInterval_Bound();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.MARTE_DataTypes.RealVector <em>Real Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Vector</em>'.
	 * @see MARTE_Library.MARTE_DataTypes.RealVector
	 * @generated
	 */
	EClass getRealVector();

	/**
	 * Returns the meta object for the attribute list '{@link MARTE_Library.MARTE_DataTypes.RealVector#getVectorElem <em>Vector Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Vector Elem</em>'.
	 * @see MARTE_Library.MARTE_DataTypes.RealVector#getVectorElem()
	 * @see #getRealVector()
	 * @generated
	 */
	EAttribute getRealVector_VectorElem();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.MARTE_DataTypes.RealMatrix <em>Real Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Matrix</em>'.
	 * @see MARTE_Library.MARTE_DataTypes.RealMatrix
	 * @generated
	 */
	EClass getRealMatrix();

	/**
	 * Returns the meta object for the attribute list '{@link MARTE_Library.MARTE_DataTypes.RealMatrix#getMatrixElem <em>Matrix Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Matrix Elem</em>'.
	 * @see MARTE_Library.MARTE_DataTypes.RealMatrix#getMatrixElem()
	 * @see #getRealMatrix()
	 * @generated
	 */
	EAttribute getRealMatrix_MatrixElem();

	/**
	 * Returns the meta object for enum '{@link MARTE_Library.MARTE_DataTypes.TransmModeKind <em>Transm Mode Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transm Mode Kind</em>'.
	 * @see MARTE_Library.MARTE_DataTypes.TransmModeKind
	 * @generated
	 */
	EEnum getTransmModeKind();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>VSL Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>VSL Expression</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getVSL_Expression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MARTE_DataTypesFactory getMARTE_DataTypesFactory();

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
		 * The meta object literal for the '{@link MARTE_Library.MARTE_DataTypes.impl.IntegerVectorImpl <em>Integer Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.MARTE_DataTypes.impl.IntegerVectorImpl
		 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getIntegerVector()
		 * @generated
		 */
		EClass INTEGER_VECTOR = eINSTANCE.getIntegerVector();

		/**
		 * The meta object literal for the '<em><b>Vector Elem</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VECTOR__VECTOR_ELEM = eINSTANCE.getIntegerVector_VectorElem();

		/**
		 * The meta object literal for the '{@link MARTE_Library.MARTE_DataTypes.impl.IntegerMatrixImpl <em>Integer Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.MARTE_DataTypes.impl.IntegerMatrixImpl
		 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getIntegerMatrix()
		 * @generated
		 */
		EClass INTEGER_MATRIX = eINSTANCE.getIntegerMatrix();

		/**
		 * The meta object literal for the '<em><b>Matrix Elem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_MATRIX__MATRIX_ELEM = eINSTANCE.getIntegerMatrix_MatrixElem();

		/**
		 * The meta object literal for the '{@link MARTE_Library.MARTE_DataTypes.impl.IntegerIntervalImpl <em>Integer Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.MARTE_DataTypes.impl.IntegerIntervalImpl
		 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getIntegerInterval()
		 * @generated
		 */
		EClass INTEGER_INTERVAL = eINSTANCE.getIntegerInterval();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_INTERVAL__BOUND = eINSTANCE.getIntegerInterval_Bound();

		/**
		 * The meta object literal for the '{@link MARTE_Library.MARTE_DataTypes.impl.UtilityTypeImpl <em>Utility Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.MARTE_DataTypes.impl.UtilityTypeImpl
		 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getUtilityType()
		 * @generated
		 */
		EClass UTILITY_TYPE = eINSTANCE.getUtilityType();

		/**
		 * The meta object literal for the '{@link MARTE_Library.MARTE_DataTypes.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.MARTE_DataTypes.impl.ArrayImpl
		 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '<em><b>Vector Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__VECTOR_ELEMENT = eINSTANCE.getArray_VectorElement();

		/**
		 * The meta object literal for the '{@link MARTE_Library.MARTE_DataTypes.impl.IntervalImpl <em>Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.MARTE_DataTypes.impl.IntervalImpl
		 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getInterval()
		 * @generated
		 */
		EClass INTERVAL = eINSTANCE.getInterval();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL__BOUND = eINSTANCE.getInterval_Bound();

		/**
		 * The meta object literal for the '{@link MARTE_Library.MARTE_DataTypes.impl.RealntervalImpl <em>Realnterval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.MARTE_DataTypes.impl.RealntervalImpl
		 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getRealnterval()
		 * @generated
		 */
		EClass REALNTERVAL = eINSTANCE.getRealnterval();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REALNTERVAL__BOUND = eINSTANCE.getRealnterval_Bound();

		/**
		 * The meta object literal for the '{@link MARTE_Library.MARTE_DataTypes.impl.NFP_FrequencyIntervalImpl <em>NFP Frequency Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.MARTE_DataTypes.impl.NFP_FrequencyIntervalImpl
		 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getNFP_FrequencyInterval()
		 * @generated
		 */
		EClass NFP_FREQUENCY_INTERVAL = eINSTANCE.getNFP_FrequencyInterval();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NFP_FREQUENCY_INTERVAL__BOUND = eINSTANCE.getNFP_FrequencyInterval_Bound();

		/**
		 * The meta object literal for the '{@link MARTE_Library.MARTE_DataTypes.impl.NFP_NaturalIntervalImpl <em>NFP Natural Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.MARTE_DataTypes.impl.NFP_NaturalIntervalImpl
		 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getNFP_NaturalInterval()
		 * @generated
		 */
		EClass NFP_NATURAL_INTERVAL = eINSTANCE.getNFP_NaturalInterval();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NFP_NATURAL_INTERVAL__BOUND = eINSTANCE.getNFP_NaturalInterval_Bound();

		/**
		 * The meta object literal for the '{@link MARTE_Library.MARTE_DataTypes.impl.RealVectorImpl <em>Real Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.MARTE_DataTypes.impl.RealVectorImpl
		 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getRealVector()
		 * @generated
		 */
		EClass REAL_VECTOR = eINSTANCE.getRealVector();

		/**
		 * The meta object literal for the '<em><b>Vector Elem</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_VECTOR__VECTOR_ELEM = eINSTANCE.getRealVector_VectorElem();

		/**
		 * The meta object literal for the '{@link MARTE_Library.MARTE_DataTypes.impl.RealMatrixImpl <em>Real Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.MARTE_DataTypes.impl.RealMatrixImpl
		 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getRealMatrix()
		 * @generated
		 */
		EClass REAL_MATRIX = eINSTANCE.getRealMatrix();

		/**
		 * The meta object literal for the '<em><b>Matrix Elem</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_MATRIX__MATRIX_ELEM = eINSTANCE.getRealMatrix_MatrixElem();

		/**
		 * The meta object literal for the '{@link MARTE_Library.MARTE_DataTypes.TransmModeKind <em>Transm Mode Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.MARTE_DataTypes.TransmModeKind
		 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getTransmModeKind()
		 * @generated
		 */
		EEnum TRANSM_MODE_KIND = eINSTANCE.getTransmModeKind();

		/**
		 * The meta object literal for the '<em>VSL Expression</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see MARTE_Library.MARTE_DataTypes.impl.MARTE_DataTypesPackageImpl#getVSL_Expression()
		 * @generated
		 */
		EDataType VSL_EXPRESSION = eINSTANCE.getVSL_Expression();

	}

} //MARTE_DataTypesPackage
