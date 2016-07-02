/**
 */
package MARTE.MARTE_Foundations.Alloc.impl;

import MARTE.MARTE_Foundations.Alloc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllocFactoryImpl extends EFactoryImpl implements AllocFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AllocFactory init() {
		try {
			AllocFactory theAllocFactory = (AllocFactory)EPackage.Registry.INSTANCE.getEFactory(AllocPackage.eNS_URI);
			if (theAllocFactory != null) {
				return theAllocFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AllocFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AllocPackage.ALLOCATED: return createAllocated();
			case AllocPackage.ALLOCATE_ACTIVITY_GROUP: return createAllocateActivityGroup();
			case AllocPackage.NFP_REFINE: return createNfpRefine();
			case AllocPackage.ASSIGN: return createAssign();
			case AllocPackage.ALLOCATE: return createAllocate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AllocPackage.ALLOCATION_END_KIND:
				return createAllocationEndKindFromString(eDataType, initialValue);
			case AllocPackage.ALLOCATION_NATURE:
				return createAllocationNatureFromString(eDataType, initialValue);
			case AllocPackage.ALLOCATION_KIND:
				return createAllocationKindFromString(eDataType, initialValue);
			case AllocPackage.ASSIGNMENT_KIND:
				return createAssignmentKindFromString(eDataType, initialValue);
			case AllocPackage.ASSIGNMENT_NATURE:
				return createAssignmentNatureFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AllocPackage.ALLOCATION_END_KIND:
				return convertAllocationEndKindToString(eDataType, instanceValue);
			case AllocPackage.ALLOCATION_NATURE:
				return convertAllocationNatureToString(eDataType, instanceValue);
			case AllocPackage.ALLOCATION_KIND:
				return convertAllocationKindToString(eDataType, instanceValue);
			case AllocPackage.ASSIGNMENT_KIND:
				return convertAssignmentKindToString(eDataType, instanceValue);
			case AllocPackage.ASSIGNMENT_NATURE:
				return convertAssignmentNatureToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allocated createAllocated() {
		AllocatedImpl allocated = new AllocatedImpl();
		return allocated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocateActivityGroup createAllocateActivityGroup() {
		AllocateActivityGroupImpl allocateActivityGroup = new AllocateActivityGroupImpl();
		return allocateActivityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NfpRefine createNfpRefine() {
		NfpRefineImpl nfpRefine = new NfpRefineImpl();
		return nfpRefine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assign createAssign() {
		AssignImpl assign = new AssignImpl();
		return assign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allocate createAllocate() {
		AllocateImpl allocate = new AllocateImpl();
		return allocate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationEndKind createAllocationEndKindFromString(EDataType eDataType, String initialValue) {
		AllocationEndKind result = AllocationEndKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllocationEndKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationNature createAllocationNatureFromString(EDataType eDataType, String initialValue) {
		AllocationNature result = AllocationNature.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllocationNatureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationKind createAllocationKindFromString(EDataType eDataType, String initialValue) {
		AllocationKind result = AllocationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllocationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentKind createAssignmentKindFromString(EDataType eDataType, String initialValue) {
		AssignmentKind result = AssignmentKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssignmentKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentNature createAssignmentNatureFromString(EDataType eDataType, String initialValue) {
		AssignmentNature result = AssignmentNature.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssignmentNatureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocPackage getAllocPackage() {
		return (AllocPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static AllocPackage getPackage() {
		return AllocPackage.eINSTANCE;
	}

} //AllocFactoryImpl
