/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl;

import MARTE.MARTE_DesignModel.SRM.SW_Concurrency.MemoryPartition;
import MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage;

import MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.impl.SwResourceImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.MemoryPartitionImpl#getConcurrentResources <em>Concurrent Resources</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.MemoryPartitionImpl#getMemorySpaces <em>Memory Spaces</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.MemoryPartitionImpl#getFork <em>Fork</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.MemoryPartitionImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Concurrency.impl.MemoryPartitionImpl#getBase_Namespace <em>Base Namespace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryPartitionImpl extends SwResourceImpl implements MemoryPartition {
	/**
	 * The cached value of the '{@link #getConcurrentResources() <em>Concurrent Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrentResources()
	 * @generated
	 * @ordered
	 */
	protected EList concurrentResources;

	/**
	 * The cached value of the '{@link #getMemorySpaces() <em>Memory Spaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySpaces()
	 * @generated
	 * @ordered
	 */
	protected EList memorySpaces;

	/**
	 * The cached value of the '{@link #getFork() <em>Fork</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFork()
	 * @generated
	 * @ordered
	 */
	protected EList fork;

	/**
	 * The cached value of the '{@link #getExit() <em>Exit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected EList exit;

	/**
	 * The cached value of the '{@link #getBase_Namespace() <em>Base Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Namespace()
	 * @generated
	 * @ordered
	 */
	protected Namespace base_Namespace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryPartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SW_ConcurrencyPackage.Literals.MEMORY_PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConcurrentResources() {
		if (concurrentResources == null) {
			concurrentResources = new EObjectResolvingEList(TypedElement.class, this, SW_ConcurrencyPackage.MEMORY_PARTITION__CONCURRENT_RESOURCES);
		}
		return concurrentResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMemorySpaces() {
		if (memorySpaces == null) {
			memorySpaces = new EObjectResolvingEList(TypedElement.class, this, SW_ConcurrencyPackage.MEMORY_PARTITION__MEMORY_SPACES);
		}
		return memorySpaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFork() {
		if (fork == null) {
			fork = new EObjectResolvingEList(BehavioralFeature.class, this, SW_ConcurrencyPackage.MEMORY_PARTITION__FORK);
		}
		return fork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExit() {
		if (exit == null) {
			exit = new EObjectResolvingEList(BehavioralFeature.class, this, SW_ConcurrencyPackage.MEMORY_PARTITION__EXIT);
		}
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getBase_Namespace() {
		if (base_Namespace != null && base_Namespace.eIsProxy()) {
			InternalEObject oldBase_Namespace = (InternalEObject)base_Namespace;
			base_Namespace = (Namespace)eResolveProxy(oldBase_Namespace);
			if (base_Namespace != oldBase_Namespace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SW_ConcurrencyPackage.MEMORY_PARTITION__BASE_NAMESPACE, oldBase_Namespace, base_Namespace));
			}
		}
		return base_Namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetBase_Namespace() {
		return base_Namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Namespace(Namespace newBase_Namespace) {
		Namespace oldBase_Namespace = base_Namespace;
		base_Namespace = newBase_Namespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SW_ConcurrencyPackage.MEMORY_PARTITION__BASE_NAMESPACE, oldBase_Namespace, base_Namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SW_ConcurrencyPackage.MEMORY_PARTITION__CONCURRENT_RESOURCES:
				return getConcurrentResources();
			case SW_ConcurrencyPackage.MEMORY_PARTITION__MEMORY_SPACES:
				return getMemorySpaces();
			case SW_ConcurrencyPackage.MEMORY_PARTITION__FORK:
				return getFork();
			case SW_ConcurrencyPackage.MEMORY_PARTITION__EXIT:
				return getExit();
			case SW_ConcurrencyPackage.MEMORY_PARTITION__BASE_NAMESPACE:
				if (resolve) return getBase_Namespace();
				return basicGetBase_Namespace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SW_ConcurrencyPackage.MEMORY_PARTITION__CONCURRENT_RESOURCES:
				getConcurrentResources().clear();
				getConcurrentResources().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.MEMORY_PARTITION__MEMORY_SPACES:
				getMemorySpaces().clear();
				getMemorySpaces().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.MEMORY_PARTITION__FORK:
				getFork().clear();
				getFork().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.MEMORY_PARTITION__EXIT:
				getExit().clear();
				getExit().addAll((Collection)newValue);
				return;
			case SW_ConcurrencyPackage.MEMORY_PARTITION__BASE_NAMESPACE:
				setBase_Namespace((Namespace)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case SW_ConcurrencyPackage.MEMORY_PARTITION__CONCURRENT_RESOURCES:
				getConcurrentResources().clear();
				return;
			case SW_ConcurrencyPackage.MEMORY_PARTITION__MEMORY_SPACES:
				getMemorySpaces().clear();
				return;
			case SW_ConcurrencyPackage.MEMORY_PARTITION__FORK:
				getFork().clear();
				return;
			case SW_ConcurrencyPackage.MEMORY_PARTITION__EXIT:
				getExit().clear();
				return;
			case SW_ConcurrencyPackage.MEMORY_PARTITION__BASE_NAMESPACE:
				setBase_Namespace((Namespace)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SW_ConcurrencyPackage.MEMORY_PARTITION__CONCURRENT_RESOURCES:
				return concurrentResources != null && !concurrentResources.isEmpty();
			case SW_ConcurrencyPackage.MEMORY_PARTITION__MEMORY_SPACES:
				return memorySpaces != null && !memorySpaces.isEmpty();
			case SW_ConcurrencyPackage.MEMORY_PARTITION__FORK:
				return fork != null && !fork.isEmpty();
			case SW_ConcurrencyPackage.MEMORY_PARTITION__EXIT:
				return exit != null && !exit.isEmpty();
			case SW_ConcurrencyPackage.MEMORY_PARTITION__BASE_NAMESPACE:
				return base_Namespace != null;
		}
		return super.eIsSet(featureID);
	}

} //MemoryPartitionImpl
