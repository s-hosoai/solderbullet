/**
 */
package MARTE_Library.TimeLibrary;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see MARTE_Library.TimeLibrary.TimeLibraryFactory
 * @model kind="package"
 * @generated
 */
public interface TimeLibraryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TimeLibrary";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///MARTE_Library/TimeLibrary.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MARTE_Library.TimeLibrary";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimeLibraryPackage eINSTANCE = MARTE_Library.TimeLibrary.impl.TimeLibraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link MARTE_Library.TimeLibrary.impl.TimedValueTypeImpl <em>Timed Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.TimeLibrary.impl.TimedValueTypeImpl
	 * @see MARTE_Library.TimeLibrary.impl.TimeLibraryPackageImpl#getTimedValueType()
	 * @generated
	 */
	int TIMED_VALUE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_VALUE_TYPE__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_VALUE_TYPE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_VALUE_TYPE__EXPR = 2;

	/**
	 * The feature id for the '<em><b>On Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_VALUE_TYPE__ON_CLOCK = 3;

	/**
	 * The number of structural features of the '<em>Timed Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_VALUE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link MARTE_Library.TimeLibrary.impl.IdealClockImpl <em>Ideal Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.TimeLibrary.impl.IdealClockImpl
	 * @see MARTE_Library.TimeLibrary.impl.TimeLibraryPackageImpl#getIdealClock()
	 * @generated
	 */
	int IDEAL_CLOCK = 1;

	/**
	 * The number of structural features of the '<em>Ideal Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEAL_CLOCK_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link MARTE_Library.TimeLibrary.TUK <em>TUK</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.TimeLibrary.TUK
	 * @see MARTE_Library.TimeLibrary.impl.TimeLibraryPackageImpl#getTUK()
	 * @generated
	 */
	int TUK = 2;

	/**
	 * The meta object id for the '{@link MARTE_Library.TimeLibrary.TimeUnitKind <em>Time Unit Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.TimeLibrary.TimeUnitKind
	 * @see MARTE_Library.TimeLibrary.impl.TimeLibraryPackageImpl#getTimeUnitKind()
	 * @generated
	 */
	int TIME_UNIT_KIND = 3;

	/**
	 * The meta object id for the '{@link MARTE_Library.TimeLibrary.LogicalTimeUnit <em>Logical Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.TimeLibrary.LogicalTimeUnit
	 * @see MARTE_Library.TimeLibrary.impl.TimeLibraryPackageImpl#getLogicalTimeUnit()
	 * @generated
	 */
	int LOGICAL_TIME_UNIT = 4;

	/**
	 * The meta object id for the '<em>Clocked Value Specification</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see MARTE_Library.TimeLibrary.impl.TimeLibraryPackageImpl#getClockedValueSpecification()
	 * @generated
	 */
	int CLOCKED_VALUE_SPECIFICATION = 5;


	/**
	 * Returns the meta object for class '{@link MARTE_Library.TimeLibrary.TimedValueType <em>Timed Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Value Type</em>'.
	 * @see MARTE_Library.TimeLibrary.TimedValueType
	 * @generated
	 */
	EClass getTimedValueType();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.TimeLibrary.TimedValueType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MARTE_Library.TimeLibrary.TimedValueType#getUnit()
	 * @see #getTimedValueType()
	 * @generated
	 */
	EAttribute getTimedValueType_Unit();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.TimeLibrary.TimedValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see MARTE_Library.TimeLibrary.TimedValueType#getValue()
	 * @see #getTimedValueType()
	 * @generated
	 */
	EAttribute getTimedValueType_Value();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.TimeLibrary.TimedValueType#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr</em>'.
	 * @see MARTE_Library.TimeLibrary.TimedValueType#getExpr()
	 * @see #getTimedValueType()
	 * @generated
	 */
	EAttribute getTimedValueType_Expr();

	/**
	 * Returns the meta object for the attribute '{@link MARTE_Library.TimeLibrary.TimedValueType#getOnClock <em>On Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Clock</em>'.
	 * @see MARTE_Library.TimeLibrary.TimedValueType#getOnClock()
	 * @see #getTimedValueType()
	 * @generated
	 */
	EAttribute getTimedValueType_OnClock();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.TimeLibrary.IdealClock <em>Ideal Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ideal Clock</em>'.
	 * @see MARTE_Library.TimeLibrary.IdealClock
	 * @generated
	 */
	EClass getIdealClock();

	/**
	 * Returns the meta object for enum '{@link MARTE_Library.TimeLibrary.TUK <em>TUK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TUK</em>'.
	 * @see MARTE_Library.TimeLibrary.TUK
	 * @generated
	 */
	EEnum getTUK();

	/**
	 * Returns the meta object for enum '{@link MARTE_Library.TimeLibrary.TimeUnitKind <em>Time Unit Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit Kind</em>'.
	 * @see MARTE_Library.TimeLibrary.TimeUnitKind
	 * @generated
	 */
	EEnum getTimeUnitKind();

	/**
	 * Returns the meta object for enum '{@link MARTE_Library.TimeLibrary.LogicalTimeUnit <em>Logical Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Time Unit</em>'.
	 * @see MARTE_Library.TimeLibrary.LogicalTimeUnit
	 * @generated
	 */
	EEnum getLogicalTimeUnit();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Clocked Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Clocked Value Specification</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getClockedValueSpecification();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimeLibraryFactory getTimeLibraryFactory();

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
		 * The meta object literal for the '{@link MARTE_Library.TimeLibrary.impl.TimedValueTypeImpl <em>Timed Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.TimeLibrary.impl.TimedValueTypeImpl
		 * @see MARTE_Library.TimeLibrary.impl.TimeLibraryPackageImpl#getTimedValueType()
		 * @generated
		 */
		EClass TIMED_VALUE_TYPE = eINSTANCE.getTimedValueType();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_VALUE_TYPE__UNIT = eINSTANCE.getTimedValueType_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_VALUE_TYPE__VALUE = eINSTANCE.getTimedValueType_Value();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_VALUE_TYPE__EXPR = eINSTANCE.getTimedValueType_Expr();

		/**
		 * The meta object literal for the '<em><b>On Clock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_VALUE_TYPE__ON_CLOCK = eINSTANCE.getTimedValueType_OnClock();

		/**
		 * The meta object literal for the '{@link MARTE_Library.TimeLibrary.impl.IdealClockImpl <em>Ideal Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.TimeLibrary.impl.IdealClockImpl
		 * @see MARTE_Library.TimeLibrary.impl.TimeLibraryPackageImpl#getIdealClock()
		 * @generated
		 */
		EClass IDEAL_CLOCK = eINSTANCE.getIdealClock();

		/**
		 * The meta object literal for the '{@link MARTE_Library.TimeLibrary.TUK <em>TUK</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.TimeLibrary.TUK
		 * @see MARTE_Library.TimeLibrary.impl.TimeLibraryPackageImpl#getTUK()
		 * @generated
		 */
		EEnum TUK = eINSTANCE.getTUK();

		/**
		 * The meta object literal for the '{@link MARTE_Library.TimeLibrary.TimeUnitKind <em>Time Unit Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.TimeLibrary.TimeUnitKind
		 * @see MARTE_Library.TimeLibrary.impl.TimeLibraryPackageImpl#getTimeUnitKind()
		 * @generated
		 */
		EEnum TIME_UNIT_KIND = eINSTANCE.getTimeUnitKind();

		/**
		 * The meta object literal for the '{@link MARTE_Library.TimeLibrary.LogicalTimeUnit <em>Logical Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.TimeLibrary.LogicalTimeUnit
		 * @see MARTE_Library.TimeLibrary.impl.TimeLibraryPackageImpl#getLogicalTimeUnit()
		 * @generated
		 */
		EEnum LOGICAL_TIME_UNIT = eINSTANCE.getLogicalTimeUnit();

		/**
		 * The meta object literal for the '<em>Clocked Value Specification</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see MARTE_Library.TimeLibrary.impl.TimeLibraryPackageImpl#getClockedValueSpecification()
		 * @generated
		 */
		EDataType CLOCKED_VALUE_SPECIFICATION = eINSTANCE.getClockedValueSpecification();

	}

} //TimeLibraryPackage
