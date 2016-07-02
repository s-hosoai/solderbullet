/**
 */
package MARTE_Library.RS_Library;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see MARTE_Library.RS_Library.RS_LibraryFactory
 * @model kind="package"
 * @generated
 */
public interface RS_LibraryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RS_Library";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///MARTE_Library/RS_Library.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MARTE_Library.RS_Library";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RS_LibraryPackage eINSTANCE = MARTE_Library.RS_Library.impl.RS_LibraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link MARTE_Library.RS_Library.impl.TilerSpecificationImpl <em>Tiler Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.RS_Library.impl.TilerSpecificationImpl
	 * @see MARTE_Library.RS_Library.impl.RS_LibraryPackageImpl#getTilerSpecification()
	 * @generated
	 */
	int TILER_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILER_SPECIFICATION__ORIGIN = 0;

	/**
	 * The feature id for the '<em><b>Paving</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILER_SPECIFICATION__PAVING = 1;

	/**
	 * The feature id for the '<em><b>Fitting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILER_SPECIFICATION__FITTING = 2;

	/**
	 * The number of structural features of the '<em>Tiler Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILER_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link MARTE_Library.RS_Library.impl.ShapeSpecificationImpl <em>Shape Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE_Library.RS_Library.impl.ShapeSpecificationImpl
	 * @see MARTE_Library.RS_Library.impl.RS_LibraryPackageImpl#getShapeSpecification()
	 * @generated
	 */
	int SHAPE_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_SPECIFICATION__SIZE = 0;

	/**
	 * The number of structural features of the '<em>Shape Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_SPECIFICATION_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link MARTE_Library.RS_Library.TilerSpecification <em>Tiler Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tiler Specification</em>'.
	 * @see MARTE_Library.RS_Library.TilerSpecification
	 * @generated
	 */
	EClass getTilerSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.RS_Library.TilerSpecification#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Origin</em>'.
	 * @see MARTE_Library.RS_Library.TilerSpecification#getOrigin()
	 * @see #getTilerSpecification()
	 * @generated
	 */
	EReference getTilerSpecification_Origin();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.RS_Library.TilerSpecification#getPaving <em>Paving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Paving</em>'.
	 * @see MARTE_Library.RS_Library.TilerSpecification#getPaving()
	 * @see #getTilerSpecification()
	 * @generated
	 */
	EReference getTilerSpecification_Paving();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE_Library.RS_Library.TilerSpecification#getFitting <em>Fitting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fitting</em>'.
	 * @see MARTE_Library.RS_Library.TilerSpecification#getFitting()
	 * @see #getTilerSpecification()
	 * @generated
	 */
	EReference getTilerSpecification_Fitting();

	/**
	 * Returns the meta object for class '{@link MARTE_Library.RS_Library.ShapeSpecification <em>Shape Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape Specification</em>'.
	 * @see MARTE_Library.RS_Library.ShapeSpecification
	 * @generated
	 */
	EClass getShapeSpecification();

	/**
	 * Returns the meta object for the attribute list '{@link MARTE_Library.RS_Library.ShapeSpecification#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Size</em>'.
	 * @see MARTE_Library.RS_Library.ShapeSpecification#getSize()
	 * @see #getShapeSpecification()
	 * @generated
	 */
	EAttribute getShapeSpecification_Size();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RS_LibraryFactory getRS_LibraryFactory();

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
		 * The meta object literal for the '{@link MARTE_Library.RS_Library.impl.TilerSpecificationImpl <em>Tiler Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.RS_Library.impl.TilerSpecificationImpl
		 * @see MARTE_Library.RS_Library.impl.RS_LibraryPackageImpl#getTilerSpecification()
		 * @generated
		 */
		EClass TILER_SPECIFICATION = eINSTANCE.getTilerSpecification();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILER_SPECIFICATION__ORIGIN = eINSTANCE.getTilerSpecification_Origin();

		/**
		 * The meta object literal for the '<em><b>Paving</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILER_SPECIFICATION__PAVING = eINSTANCE.getTilerSpecification_Paving();

		/**
		 * The meta object literal for the '<em><b>Fitting</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILER_SPECIFICATION__FITTING = eINSTANCE.getTilerSpecification_Fitting();

		/**
		 * The meta object literal for the '{@link MARTE_Library.RS_Library.impl.ShapeSpecificationImpl <em>Shape Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE_Library.RS_Library.impl.ShapeSpecificationImpl
		 * @see MARTE_Library.RS_Library.impl.RS_LibraryPackageImpl#getShapeSpecification()
		 * @generated
		 */
		EClass SHAPE_SPECIFICATION = eINSTANCE.getShapeSpecification();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_SPECIFICATION__SIZE = eINSTANCE.getShapeSpecification_Size();

	}

} //RS_LibraryPackage
