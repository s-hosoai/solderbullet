/**
 */
package MARTE.MARTE_Annexes.RSM;

import MARTE.MARTE_Foundations.Alloc.AllocPackage;

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
 * @see MARTE.MARTE_Annexes.RSM.RSMFactory
 * @model kind="package"
 * @generated
 */
public interface RSMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RSM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///MARTE/MARTE_Annexes/RSM.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MARTE.MARTE_Annexes.RSM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RSMPackage eINSTANCE = MARTE.MARTE_Annexes.RSM.impl.RSMPackageImpl.init();

	/**
	 * The meta object id for the '{@link MARTE.MARTE_Annexes.RSM.impl.LinkTopologyImpl <em>Link Topology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_Annexes.RSM.impl.LinkTopologyImpl
	 * @see MARTE.MARTE_Annexes.RSM.impl.RSMPackageImpl#getLinkTopology()
	 * @generated
	 */
	int LINK_TOPOLOGY = 0;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TOPOLOGY__BASE_CONNECTOR = 0;

	/**
	 * The number of structural features of the '<em>Link Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TOPOLOGY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_Annexes.RSM.impl.DefaultLinkImpl <em>Default Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_Annexes.RSM.impl.DefaultLinkImpl
	 * @see MARTE.MARTE_Annexes.RSM.impl.RSMPackageImpl#getDefaultLink()
	 * @generated
	 */
	int DEFAULT_LINK = 1;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_LINK__BASE_CONNECTOR = LINK_TOPOLOGY__BASE_CONNECTOR;

	/**
	 * The number of structural features of the '<em>Default Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_LINK_FEATURE_COUNT = LINK_TOPOLOGY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_Annexes.RSM.impl.InterRepetitionImpl <em>Inter Repetition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_Annexes.RSM.impl.InterRepetitionImpl
	 * @see MARTE.MARTE_Annexes.RSM.impl.RSMPackageImpl#getInterRepetition()
	 * @generated
	 */
	int INTER_REPETITION = 2;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_REPETITION__BASE_CONNECTOR = LINK_TOPOLOGY__BASE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Repetition Shape Dependence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_REPETITION__REPETITION_SHAPE_DEPENDENCE = LINK_TOPOLOGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Modulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_REPETITION__IS_MODULO = LINK_TOPOLOGY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inter Repetition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_REPETITION_FEATURE_COUNT = LINK_TOPOLOGY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_Annexes.RSM.impl.DistributeImpl <em>Distribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_Annexes.RSM.impl.DistributeImpl
	 * @see MARTE.MARTE_Annexes.RSM.impl.RSMPackageImpl#getDistribute()
	 * @generated
	 */
	int DISTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTE__KIND = AllocPackage.ALLOCATE__KIND;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTE__NATURE = AllocPackage.ALLOCATE__NATURE;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTE__BASE_ABSTRACTION = AllocPackage.ALLOCATE__BASE_ABSTRACTION;

	/**
	 * The feature id for the '<em><b>Implied Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTE__IMPLIED_CONSTRAINT = AllocPackage.ALLOCATE__IMPLIED_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Pattern Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTE__PATTERN_SHAPE = AllocPackage.ALLOCATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repetition Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTE__REPETITION_SPACE = AllocPackage.ALLOCATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Tiler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTE__FROM_TILER = AllocPackage.ALLOCATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To Tiler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTE__TO_TILER = AllocPackage.ALLOCATE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Distribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTE_FEATURE_COUNT = AllocPackage.ALLOCATE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_Annexes.RSM.impl.ReshapeImpl <em>Reshape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_Annexes.RSM.impl.ReshapeImpl
	 * @see MARTE.MARTE_Annexes.RSM.impl.RSMPackageImpl#getReshape()
	 * @generated
	 */
	int RESHAPE = 4;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE__BASE_CONNECTOR = LINK_TOPOLOGY__BASE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Pattern Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE__PATTERN_SHAPE = LINK_TOPOLOGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repetiton Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE__REPETITON_SHAPE = LINK_TOPOLOGY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reshape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESHAPE_FEATURE_COUNT = LINK_TOPOLOGY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_Annexes.RSM.impl.TilerImpl <em>Tiler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_Annexes.RSM.impl.TilerImpl
	 * @see MARTE.MARTE_Annexes.RSM.impl.RSMPackageImpl#getTiler()
	 * @generated
	 */
	int TILER = 5;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILER__BASE_CONNECTOR = LINK_TOPOLOGY__BASE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILER__ORIGIN = LINK_TOPOLOGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Paving</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILER__PAVING = LINK_TOPOLOGY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fitting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILER__FITTING = LINK_TOPOLOGY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tiler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILER__TILER = LINK_TOPOLOGY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Base Connector End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILER__BASE_CONNECTOR_END = LINK_TOPOLOGY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tiler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILER_FEATURE_COUNT = LINK_TOPOLOGY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link MARTE.MARTE_Annexes.RSM.impl.ShapedImpl <em>Shaped</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MARTE.MARTE_Annexes.RSM.impl.ShapedImpl
	 * @see MARTE.MARTE_Annexes.RSM.impl.RSMPackageImpl#getShaped()
	 * @generated
	 */
	int SHAPED = 6;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPED__SHAPE = 0;

	/**
	 * The feature id for the '<em><b>Base Multiplicity Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPED__BASE_MULTIPLICITY_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Shaped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPED_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_Annexes.RSM.LinkTopology <em>Link Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Topology</em>'.
	 * @see MARTE.MARTE_Annexes.RSM.LinkTopology
	 * @generated
	 */
	EClass getLinkTopology();

	/**
	 * Returns the meta object for the reference '{@link MARTE.MARTE_Annexes.RSM.LinkTopology#getBase_Connector <em>Base Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Connector</em>'.
	 * @see MARTE.MARTE_Annexes.RSM.LinkTopology#getBase_Connector()
	 * @see #getLinkTopology()
	 * @generated
	 */
	EReference getLinkTopology_Base_Connector();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_Annexes.RSM.DefaultLink <em>Default Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Link</em>'.
	 * @see MARTE.MARTE_Annexes.RSM.DefaultLink
	 * @generated
	 */
	EClass getDefaultLink();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_Annexes.RSM.InterRepetition <em>Inter Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter Repetition</em>'.
	 * @see MARTE.MARTE_Annexes.RSM.InterRepetition
	 * @generated
	 */
	EClass getInterRepetition();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_Annexes.RSM.InterRepetition#getRepetitionShapeDependence <em>Repetition Shape Dependence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repetition Shape Dependence</em>'.
	 * @see MARTE.MARTE_Annexes.RSM.InterRepetition#getRepetitionShapeDependence()
	 * @see #getInterRepetition()
	 * @generated
	 */
	EReference getInterRepetition_RepetitionShapeDependence();

	/**
	 * Returns the meta object for the attribute '{@link MARTE.MARTE_Annexes.RSM.InterRepetition#getIsModulo <em>Is Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Modulo</em>'.
	 * @see MARTE.MARTE_Annexes.RSM.InterRepetition#getIsModulo()
	 * @see #getInterRepetition()
	 * @generated
	 */
	EAttribute getInterRepetition_IsModulo();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_Annexes.RSM.Distribute <em>Distribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribute</em>'.
	 * @see MARTE.MARTE_Annexes.RSM.Distribute
	 * @generated
	 */
	EClass getDistribute();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_Annexes.RSM.Distribute#getPatternShape <em>Pattern Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern Shape</em>'.
	 * @see MARTE.MARTE_Annexes.RSM.Distribute#getPatternShape()
	 * @see #getDistribute()
	 * @generated
	 */
	EReference getDistribute_PatternShape();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_Annexes.RSM.Distribute#getRepetitionSpace <em>Repetition Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repetition Space</em>'.
	 * @see MARTE.MARTE_Annexes.RSM.Distribute#getRepetitionSpace()
	 * @see #getDistribute()
	 * @generated
	 */
	EReference getDistribute_RepetitionSpace();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_Annexes.RSM.Distribute#getFromTiler <em>From Tiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Tiler</em>'.
	 * @see MARTE.MARTE_Annexes.RSM.Distribute#getFromTiler()
	 * @see #getDistribute()
	 * @generated
	 */
	EReference getDistribute_FromTiler();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_Annexes.RSM.Distribute#getToTiler <em>To Tiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Tiler</em>'.
	 * @see MARTE.MARTE_Annexes.RSM.Distribute#getToTiler()
	 * @see #getDistribute()
	 * @generated
	 */
	EReference getDistribute_ToTiler();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_Annexes.RSM.Reshape <em>Reshape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reshape</em>'.
	 * @see MARTE.MARTE_Annexes.RSM.Reshape
	 * @generated
	 */
	EClass getReshape();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_Annexes.RSM.Reshape#getPatternShape <em>Pattern Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern Shape</em>'.
	 * @see MARTE.MARTE_Annexes.RSM.Reshape#getPatternShape()
	 * @see #getReshape()
	 * @generated
	 */
	EReference getReshape_PatternShape();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_Annexes.RSM.Reshape#getRepetitonShape <em>Repetiton Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repetiton Shape</em>'.
	 * @see MARTE.MARTE_Annexes.RSM.Reshape#getRepetitonShape()
	 * @see #getReshape()
	 * @generated
	 */
	EReference getReshape_RepetitonShape();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_Annexes.RSM.Tiler <em>Tiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tiler</em>'.
	 * @see MARTE.MARTE_Annexes.RSM.Tiler
	 * @generated
	 */
	EClass getTiler();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_Annexes.RSM.Tiler#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Origin</em>'.
	 * @see MARTE.MARTE_Annexes.RSM.Tiler#getOrigin()
	 * @see #getTiler()
	 * @generated
	 */
	EReference getTiler_Origin();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_Annexes.RSM.Tiler#getPaving <em>Paving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Paving</em>'.
	 * @see MARTE.MARTE_Annexes.RSM.Tiler#getPaving()
	 * @see #getTiler()
	 * @generated
	 */
	EReference getTiler_Paving();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_Annexes.RSM.Tiler#getFitting <em>Fitting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fitting</em>'.
	 * @see MARTE.MARTE_Annexes.RSM.Tiler#getFitting()
	 * @see #getTiler()
	 * @generated
	 */
	EReference getTiler_Fitting();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_Annexes.RSM.Tiler#getTiler <em>Tiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tiler</em>'.
	 * @see MARTE.MARTE_Annexes.RSM.Tiler#getTiler()
	 * @see #getTiler()
	 * @generated
	 */
	EReference getTiler_Tiler();

	/**
	 * Returns the meta object for the reference '{@link MARTE.MARTE_Annexes.RSM.Tiler#getBase_ConnectorEnd <em>Base Connector End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Connector End</em>'.
	 * @see MARTE.MARTE_Annexes.RSM.Tiler#getBase_ConnectorEnd()
	 * @see #getTiler()
	 * @generated
	 */
	EReference getTiler_Base_ConnectorEnd();

	/**
	 * Returns the meta object for class '{@link MARTE.MARTE_Annexes.RSM.Shaped <em>Shaped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shaped</em>'.
	 * @see MARTE.MARTE_Annexes.RSM.Shaped
	 * @generated
	 */
	EClass getShaped();

	/**
	 * Returns the meta object for the containment reference '{@link MARTE.MARTE_Annexes.RSM.Shaped#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shape</em>'.
	 * @see MARTE.MARTE_Annexes.RSM.Shaped#getShape()
	 * @see #getShaped()
	 * @generated
	 */
	EReference getShaped_Shape();

	/**
	 * Returns the meta object for the reference '{@link MARTE.MARTE_Annexes.RSM.Shaped#getBase_MultiplicityElement <em>Base Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Multiplicity Element</em>'.
	 * @see MARTE.MARTE_Annexes.RSM.Shaped#getBase_MultiplicityElement()
	 * @see #getShaped()
	 * @generated
	 */
	EReference getShaped_Base_MultiplicityElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RSMFactory getRSMFactory();

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
		 * The meta object literal for the '{@link MARTE.MARTE_Annexes.RSM.impl.LinkTopologyImpl <em>Link Topology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_Annexes.RSM.impl.LinkTopologyImpl
		 * @see MARTE.MARTE_Annexes.RSM.impl.RSMPackageImpl#getLinkTopology()
		 * @generated
		 */
		EClass LINK_TOPOLOGY = eINSTANCE.getLinkTopology();

		/**
		 * The meta object literal for the '<em><b>Base Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_TOPOLOGY__BASE_CONNECTOR = eINSTANCE.getLinkTopology_Base_Connector();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_Annexes.RSM.impl.DefaultLinkImpl <em>Default Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_Annexes.RSM.impl.DefaultLinkImpl
		 * @see MARTE.MARTE_Annexes.RSM.impl.RSMPackageImpl#getDefaultLink()
		 * @generated
		 */
		EClass DEFAULT_LINK = eINSTANCE.getDefaultLink();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_Annexes.RSM.impl.InterRepetitionImpl <em>Inter Repetition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_Annexes.RSM.impl.InterRepetitionImpl
		 * @see MARTE.MARTE_Annexes.RSM.impl.RSMPackageImpl#getInterRepetition()
		 * @generated
		 */
		EClass INTER_REPETITION = eINSTANCE.getInterRepetition();

		/**
		 * The meta object literal for the '<em><b>Repetition Shape Dependence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTER_REPETITION__REPETITION_SHAPE_DEPENDENCE = eINSTANCE.getInterRepetition_RepetitionShapeDependence();

		/**
		 * The meta object literal for the '<em><b>Is Modulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTER_REPETITION__IS_MODULO = eINSTANCE.getInterRepetition_IsModulo();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_Annexes.RSM.impl.DistributeImpl <em>Distribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_Annexes.RSM.impl.DistributeImpl
		 * @see MARTE.MARTE_Annexes.RSM.impl.RSMPackageImpl#getDistribute()
		 * @generated
		 */
		EClass DISTRIBUTE = eINSTANCE.getDistribute();

		/**
		 * The meta object literal for the '<em><b>Pattern Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTE__PATTERN_SHAPE = eINSTANCE.getDistribute_PatternShape();

		/**
		 * The meta object literal for the '<em><b>Repetition Space</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTE__REPETITION_SPACE = eINSTANCE.getDistribute_RepetitionSpace();

		/**
		 * The meta object literal for the '<em><b>From Tiler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTE__FROM_TILER = eINSTANCE.getDistribute_FromTiler();

		/**
		 * The meta object literal for the '<em><b>To Tiler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTE__TO_TILER = eINSTANCE.getDistribute_ToTiler();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_Annexes.RSM.impl.ReshapeImpl <em>Reshape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_Annexes.RSM.impl.ReshapeImpl
		 * @see MARTE.MARTE_Annexes.RSM.impl.RSMPackageImpl#getReshape()
		 * @generated
		 */
		EClass RESHAPE = eINSTANCE.getReshape();

		/**
		 * The meta object literal for the '<em><b>Pattern Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESHAPE__PATTERN_SHAPE = eINSTANCE.getReshape_PatternShape();

		/**
		 * The meta object literal for the '<em><b>Repetiton Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESHAPE__REPETITON_SHAPE = eINSTANCE.getReshape_RepetitonShape();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_Annexes.RSM.impl.TilerImpl <em>Tiler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_Annexes.RSM.impl.TilerImpl
		 * @see MARTE.MARTE_Annexes.RSM.impl.RSMPackageImpl#getTiler()
		 * @generated
		 */
		EClass TILER = eINSTANCE.getTiler();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILER__ORIGIN = eINSTANCE.getTiler_Origin();

		/**
		 * The meta object literal for the '<em><b>Paving</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILER__PAVING = eINSTANCE.getTiler_Paving();

		/**
		 * The meta object literal for the '<em><b>Fitting</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILER__FITTING = eINSTANCE.getTiler_Fitting();

		/**
		 * The meta object literal for the '<em><b>Tiler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILER__TILER = eINSTANCE.getTiler_Tiler();

		/**
		 * The meta object literal for the '<em><b>Base Connector End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILER__BASE_CONNECTOR_END = eINSTANCE.getTiler_Base_ConnectorEnd();

		/**
		 * The meta object literal for the '{@link MARTE.MARTE_Annexes.RSM.impl.ShapedImpl <em>Shaped</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MARTE.MARTE_Annexes.RSM.impl.ShapedImpl
		 * @see MARTE.MARTE_Annexes.RSM.impl.RSMPackageImpl#getShaped()
		 * @generated
		 */
		EClass SHAPED = eINSTANCE.getShaped();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPED__SHAPE = eINSTANCE.getShaped_Shape();

		/**
		 * The meta object literal for the '<em><b>Base Multiplicity Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPED__BASE_MULTIPLICITY_ELEMENT = eINSTANCE.getShaped_Base_MultiplicityElement();

	}

} //RSMPackage
