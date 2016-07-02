/**
 */
package MARTE.MARTE_DesignModel.GCM.provider;

import MARTE.MARTE_DesignModel.GCM.util.GCMAdapterFactory;

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
public class GCMItemProviderAdapterFactory extends GCMAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public GCMItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.GCM.FlowProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowPropertyItemProvider flowPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.GCM.FlowProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createFlowPropertyAdapter() {
		if (flowPropertyItemProvider == null) {
			flowPropertyItemProvider = new FlowPropertyItemProvider(this);
		}

		return flowPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.GCM.FlowPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowPortItemProvider flowPortItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.GCM.FlowPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createFlowPortAdapter() {
		if (flowPortItemProvider == null) {
			flowPortItemProvider = new FlowPortItemProvider(this);
		}

		return flowPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.GCM.ClientServerPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientServerPortItemProvider clientServerPortItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.GCM.ClientServerPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createClientServerPortAdapter() {
		if (clientServerPortItemProvider == null) {
			clientServerPortItemProvider = new ClientServerPortItemProvider(this);
		}

		return clientServerPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.GCM.ClientServerSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientServerSpecificationItemProvider clientServerSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.GCM.ClientServerSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createClientServerSpecificationAdapter() {
		if (clientServerSpecificationItemProvider == null) {
			clientServerSpecificationItemProvider = new ClientServerSpecificationItemProvider(this);
		}

		return clientServerSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.GCM.FlowSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowSpecificationItemProvider flowSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.GCM.FlowSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createFlowSpecificationAdapter() {
		if (flowSpecificationItemProvider == null) {
			flowSpecificationItemProvider = new FlowSpecificationItemProvider(this);
		}

		return flowSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.GCM.ClientServerFeature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientServerFeatureItemProvider clientServerFeatureItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.GCM.ClientServerFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createClientServerFeatureAdapter() {
		if (clientServerFeatureItemProvider == null) {
			clientServerFeatureItemProvider = new ClientServerFeatureItemProvider(this);
		}

		return clientServerFeatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.GCM.GCMTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GCMTriggerItemProvider gcmTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.GCM.GCMTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createGCMTriggerAdapter() {
		if (gcmTriggerItemProvider == null) {
			gcmTriggerItemProvider = new GCMTriggerItemProvider(this);
		}

		return gcmTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.GCM.GCMInvocationAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GCMInvocationActionItemProvider gcmInvocationActionItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.GCM.GCMInvocationAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createGCMInvocationActionAdapter() {
		if (gcmInvocationActionItemProvider == null) {
			gcmInvocationActionItemProvider = new GCMInvocationActionItemProvider(this);
		}

		return gcmInvocationActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.GCM.DataEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataEventItemProvider dataEventItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.GCM.DataEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createDataEventAdapter() {
		if (dataEventItemProvider == null) {
			dataEventItemProvider = new DataEventItemProvider(this);
		}

		return dataEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.GCM.DataPool} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPoolItemProvider dataPoolItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.GCM.DataPool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createDataPoolAdapter() {
		if (dataPoolItemProvider == null) {
			dataPoolItemProvider = new DataPoolItemProvider(this);
		}

		return dataPoolItemProvider;
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
		if (flowPropertyItemProvider != null) flowPropertyItemProvider.dispose();
		if (flowPortItemProvider != null) flowPortItemProvider.dispose();
		if (clientServerPortItemProvider != null) clientServerPortItemProvider.dispose();
		if (clientServerSpecificationItemProvider != null) clientServerSpecificationItemProvider.dispose();
		if (flowSpecificationItemProvider != null) flowSpecificationItemProvider.dispose();
		if (clientServerFeatureItemProvider != null) clientServerFeatureItemProvider.dispose();
		if (gcmTriggerItemProvider != null) gcmTriggerItemProvider.dispose();
		if (gcmInvocationActionItemProvider != null) gcmInvocationActionItemProvider.dispose();
		if (dataEventItemProvider != null) dataEventItemProvider.dispose();
		if (dataPoolItemProvider != null) dataPoolItemProvider.dispose();
	}

}