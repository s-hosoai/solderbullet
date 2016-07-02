/**
 */
package MARTE.MARTE_DesignModel.HLAM.provider;

import MARTE.MARTE_DesignModel.HLAM.util.HLAMAdapterFactory;

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
public class HLAMItemProviderAdapterFactory extends HLAMAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public HLAMItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.HLAM.RtUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtUnitItemProvider rtUnitItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.HLAM.RtUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createRtUnitAdapter() {
		if (rtUnitItemProvider == null) {
			rtUnitItemProvider = new RtUnitItemProvider(this);
		}

		return rtUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.HLAM.PpUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PpUnitItemProvider ppUnitItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.HLAM.PpUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createPpUnitAdapter() {
		if (ppUnitItemProvider == null) {
			ppUnitItemProvider = new PpUnitItemProvider(this);
		}

		return ppUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.HLAM.RtFeature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtFeatureItemProvider rtFeatureItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.HLAM.RtFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createRtFeatureAdapter() {
		if (rtFeatureItemProvider == null) {
			rtFeatureItemProvider = new RtFeatureItemProvider(this);
		}

		return rtFeatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.HLAM.RtSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtSpecificationItemProvider rtSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.HLAM.RtSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createRtSpecificationAdapter() {
		if (rtSpecificationItemProvider == null) {
			rtSpecificationItemProvider = new RtSpecificationItemProvider(this);
		}

		return rtSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.HLAM.RtAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtActionItemProvider rtActionItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.HLAM.RtAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createRtActionAdapter() {
		if (rtActionItemProvider == null) {
			rtActionItemProvider = new RtActionItemProvider(this);
		}

		return rtActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.HLAM.RtService} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtServiceItemProvider rtServiceItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.HLAM.RtService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createRtServiceAdapter() {
		if (rtServiceItemProvider == null) {
			rtServiceItemProvider = new RtServiceItemProvider(this);
		}

		return rtServiceItemProvider;
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
		if (rtUnitItemProvider != null) rtUnitItemProvider.dispose();
		if (ppUnitItemProvider != null) ppUnitItemProvider.dispose();
		if (rtFeatureItemProvider != null) rtFeatureItemProvider.dispose();
		if (rtSpecificationItemProvider != null) rtSpecificationItemProvider.dispose();
		if (rtActionItemProvider != null) rtActionItemProvider.dispose();
		if (rtServiceItemProvider != null) rtServiceItemProvider.dispose();
	}

}