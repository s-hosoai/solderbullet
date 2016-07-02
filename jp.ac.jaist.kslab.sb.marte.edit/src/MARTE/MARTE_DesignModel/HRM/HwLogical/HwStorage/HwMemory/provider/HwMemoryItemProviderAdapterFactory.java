/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.provider;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.util.HwMemoryAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HwMemoryItemProviderAdapterFactory extends HwMemoryAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection supportedTypes = new ArrayList();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwMemoryItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwMemoryItemProvider hwMemoryItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createHwMemoryAdapter() {
		if (hwMemoryItemProvider == null) {
			hwMemoryItemProvider = new HwMemoryItemProvider(this);
		}

		return hwMemoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Timing} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingItemProvider timingItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.Timing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createTimingAdapter() {
		if (timingItemProvider == null) {
			timingItemProvider = new TimingItemProvider(this);
		}

		return timingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheStructure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CacheStructureItemProvider cacheStructureItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.CacheStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createCacheStructureAdapter() {
		if (cacheStructureItemProvider == null) {
			cacheStructureItemProvider = new CacheStructureItemProvider(this);
		}

		return cacheStructureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.MemoryOrganization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryOrganizationItemProvider memoryOrganizationItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.MemoryOrganization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createMemoryOrganizationAdapter() {
		if (memoryOrganizationItemProvider == null) {
			memoryOrganizationItemProvider = new MemoryOrganizationItemProvider(this);
		}

		return memoryOrganizationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwRAMItemProvider hwRAMItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwRAM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createHwRAMAdapter() {
		if (hwRAMItemProvider == null) {
			hwRAMItemProvider = new HwRAMItemProvider(this);
		}

		return hwRAMItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwROM} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwROMItemProvider hwROMItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwROM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createHwROMAdapter() {
		if (hwROMItemProvider == null) {
			hwROMItemProvider = new HwROMItemProvider(this);
		}

		return hwROMItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwDrive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwDriveItemProvider hwDriveItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwDrive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createHwDriveAdapter() {
		if (hwDriveItemProvider == null) {
			hwDriveItemProvider = new HwDriveItemProvider(this);
		}

		return hwDriveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwCacheItemProvider hwCacheItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwCache}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createHwCacheAdapter() {
		if (hwCacheItemProvider == null) {
			hwCacheItemProvider = new HwCacheItemProvider(this);
		}

		return hwCacheItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (hwMemoryItemProvider != null) hwMemoryItemProvider.dispose();
		if (timingItemProvider != null) timingItemProvider.dispose();
		if (cacheStructureItemProvider != null) cacheStructureItemProvider.dispose();
		if (memoryOrganizationItemProvider != null) memoryOrganizationItemProvider.dispose();
		if (hwRAMItemProvider != null) hwRAMItemProvider.dispose();
		if (hwROMItemProvider != null) hwROMItemProvider.dispose();
		if (hwDriveItemProvider != null) hwDriveItemProvider.dispose();
		if (hwCacheItemProvider != null) hwCacheItemProvider.dispose();
	}

}
