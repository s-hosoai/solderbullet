/**
 */
package MARTE.MARTE_Annexes.RSM.util;

import MARTE.MARTE_Annexes.RSM.*;

import MARTE.MARTE_Foundations.Alloc.Allocate;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_Annexes.RSM.RSMPackage
 * @generated
 */
public class RSMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RSMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RSMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RSMSwitch modelSwitch =
		new RSMSwitch() {
			public Object caseLinkTopology(LinkTopology object) {
				return createLinkTopologyAdapter();
			}
			public Object caseDefaultLink(DefaultLink object) {
				return createDefaultLinkAdapter();
			}
			public Object caseInterRepetition(InterRepetition object) {
				return createInterRepetitionAdapter();
			}
			public Object caseDistribute(Distribute object) {
				return createDistributeAdapter();
			}
			public Object caseReshape(Reshape object) {
				return createReshapeAdapter();
			}
			public Object caseTiler(Tiler object) {
				return createTilerAdapter();
			}
			public Object caseShaped(Shaped object) {
				return createShapedAdapter();
			}
			public Object caseAllocate(Allocate object) {
				return createAllocateAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Annexes.RSM.LinkTopology <em>Link Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Annexes.RSM.LinkTopology
	 * @generated
	 */
	public Adapter createLinkTopologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Annexes.RSM.DefaultLink <em>Default Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Annexes.RSM.DefaultLink
	 * @generated
	 */
	public Adapter createDefaultLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Annexes.RSM.InterRepetition <em>Inter Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Annexes.RSM.InterRepetition
	 * @generated
	 */
	public Adapter createInterRepetitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Annexes.RSM.Distribute <em>Distribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Annexes.RSM.Distribute
	 * @generated
	 */
	public Adapter createDistributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Annexes.RSM.Reshape <em>Reshape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Annexes.RSM.Reshape
	 * @generated
	 */
	public Adapter createReshapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Annexes.RSM.Tiler <em>Tiler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Annexes.RSM.Tiler
	 * @generated
	 */
	public Adapter createTilerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Annexes.RSM.Shaped <em>Shaped</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Annexes.RSM.Shaped
	 * @generated
	 */
	public Adapter createShapedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Foundations.Alloc.Allocate <em>Allocate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Foundations.Alloc.Allocate
	 * @generated
	 */
	public Adapter createAllocateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RSMAdapterFactory
