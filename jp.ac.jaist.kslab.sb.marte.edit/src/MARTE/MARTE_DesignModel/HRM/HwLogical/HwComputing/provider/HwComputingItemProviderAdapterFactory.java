/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.provider;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.util.HwComputingAdapterFactory;

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
public class HwComputingItemProviderAdapterFactory extends HwComputingAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public HwComputingItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Organization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PLD_OrganizationItemProvider plD_OrganizationItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Organization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createPLD_OrganizationAdapter() {
		if (plD_OrganizationItemProvider == null) {
			plD_OrganizationItemProvider = new PLD_OrganizationItemProvider(this);
		}

		return plD_OrganizationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwProcessorItemProvider hwProcessorItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createHwProcessorAdapter() {
		if (hwProcessorItemProvider == null) {
			hwProcessorItemProvider = new HwProcessorItemProvider(this);
		}

		return hwProcessorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwComputingResourceItemProvider hwComputingResourceItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createHwComputingResourceAdapter() {
		if (hwComputingResourceItemProvider == null) {
			hwComputingResourceItemProvider = new HwComputingResourceItemProvider(this);
		}

		return hwComputingResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwISAItemProvider hwISAItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createHwISAAdapter() {
		if (hwISAItemProvider == null) {
			hwISAItemProvider = new HwISAItemProvider(this);
		}

		return hwISAItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwBranchPredictor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwBranchPredictorItemProvider hwBranchPredictorItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwBranchPredictor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createHwBranchPredictorAdapter() {
		if (hwBranchPredictorItemProvider == null) {
			hwBranchPredictorItemProvider = new HwBranchPredictorItemProvider(this);
		}

		return hwBranchPredictorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwASIC} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwASICItemProvider hwASICItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwASIC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createHwASICAdapter() {
		if (hwASICItemProvider == null) {
			hwASICItemProvider = new HwASICItemProvider(this);
		}

		return hwASICItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwPLDItemProvider hwPLDItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createHwPLDAdapter() {
		if (hwPLDItemProvider == null) {
			hwPLDItemProvider = new HwPLDItemProvider(this);
		}

		return hwPLDItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwMCUItemProvider hwMCUItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwMCU}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createHwMCUAdapter() {
		if (hwMCUItemProvider == null) {
			hwMCUItemProvider = new HwMCUItemProvider(this);
		}

		return hwMCUItemProvider;
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
		if (plD_OrganizationItemProvider != null) plD_OrganizationItemProvider.dispose();
		if (hwProcessorItemProvider != null) hwProcessorItemProvider.dispose();
		if (hwComputingResourceItemProvider != null) hwComputingResourceItemProvider.dispose();
		if (hwISAItemProvider != null) hwISAItemProvider.dispose();
		if (hwBranchPredictorItemProvider != null) hwBranchPredictorItemProvider.dispose();
		if (hwASICItemProvider != null) hwASICItemProvider.dispose();
		if (hwPLDItemProvider != null) hwPLDItemProvider.dispose();
		if (hwMCUItemProvider != null) hwMCUItemProvider.dispose();
	}

}
