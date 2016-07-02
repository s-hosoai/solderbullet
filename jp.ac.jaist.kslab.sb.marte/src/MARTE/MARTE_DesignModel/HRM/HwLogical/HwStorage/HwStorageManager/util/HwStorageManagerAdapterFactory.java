/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.util;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwArbiter;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationResource;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.*;

import MARTE.MARTE_Foundations.GRM.Resource;
import MARTE.MARTE_Foundations.GRM.StorageResource;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerPackage
 * @generated
 */
public class HwStorageManagerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HwStorageManagerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwStorageManagerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HwStorageManagerPackage.eINSTANCE;
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
	protected HwStorageManagerSwitch modelSwitch =
		new HwStorageManagerSwitch() {
			public Object caseHwStorageManager(HwStorageManager object) {
				return createHwStorageManagerAdapter();
			}
			public Object caseHwDMA(HwDMA object) {
				return createHwDMAAdapter();
			}
			public Object caseHwMMU(HwMMU object) {
				return createHwMMUAdapter();
			}
			public Object caseResource(Resource object) {
				return createResourceAdapter();
			}
			public Object caseHwResource(HwResource object) {
				return createHwResourceAdapter();
			}
			public Object caseStorageResource(StorageResource object) {
				return createStorageResourceAdapter();
			}
			public Object caseHwCommunicationResource(HwCommunicationResource object) {
				return createHwCommunicationResourceAdapter();
			}
			public Object caseHwArbiter(HwArbiter object) {
				return createHwArbiterAdapter();
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
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManager <em>Hw Storage Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManager
	 * @generated
	 */
	public Adapter createHwStorageManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwDMA <em>Hw DMA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwDMA
	 * @generated
	 */
	public Adapter createHwDMAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwMMU <em>Hw MMU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwMMU
	 * @generated
	 */
	public Adapter createHwMMUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Foundations.GRM.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Foundations.GRM.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource <em>Hw Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource
	 * @generated
	 */
	public Adapter createHwResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_Foundations.GRM.StorageResource <em>Storage Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_Foundations.GRM.StorageResource
	 * @generated
	 */
	public Adapter createStorageResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationResource
	 * @generated
	 */
	public Adapter createHwCommunicationResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwArbiter <em>Hw Arbiter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwArbiter
	 * @generated
	 */
	public Adapter createHwArbiterAdapter() {
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

} //HwStorageManagerAdapterFactory
