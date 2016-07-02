/**
 */
package MARTE.MARTE_AnalysisModel.PAM.provider;

import MARTE.MARTE_AnalysisModel.PAM.util.PAMAdapterFactory;

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
public class PAMItemProviderAdapterFactory extends PAMAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public PAMItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_AnalysisModel.PAM.PaStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaStepItemProvider paStepItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_AnalysisModel.PAM.PaStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createPaStepAdapter() {
		if (paStepItemProvider == null) {
			paStepItemProvider = new PaStepItemProvider(this);
		}

		return paStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_AnalysisModel.PAM.PaRequestedStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaRequestedStepItemProvider paRequestedStepItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_AnalysisModel.PAM.PaRequestedStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createPaRequestedStepAdapter() {
		if (paRequestedStepItemProvider == null) {
			paRequestedStepItemProvider = new PaRequestedStepItemProvider(this);
		}

		return paRequestedStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_AnalysisModel.PAM.PaCommStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaCommStepItemProvider paCommStepItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_AnalysisModel.PAM.PaCommStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createPaCommStepAdapter() {
		if (paCommStepItemProvider == null) {
			paCommStepItemProvider = new PaCommStepItemProvider(this);
		}

		return paCommStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_AnalysisModel.PAM.PaResPassStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaResPassStepItemProvider paResPassStepItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_AnalysisModel.PAM.PaResPassStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createPaResPassStepAdapter() {
		if (paResPassStepItemProvider == null) {
			paResPassStepItemProvider = new PaResPassStepItemProvider(this);
		}

		return paResPassStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_AnalysisModel.PAM.PaLogicalResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaLogicalResourceItemProvider paLogicalResourceItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_AnalysisModel.PAM.PaLogicalResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createPaLogicalResourceAdapter() {
		if (paLogicalResourceItemProvider == null) {
			paLogicalResourceItemProvider = new PaLogicalResourceItemProvider(this);
		}

		return paLogicalResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MARTE.MARTE_AnalysisModel.PAM.PaRunTInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaRunTInstanceItemProvider paRunTInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link MARTE.MARTE_AnalysisModel.PAM.PaRunTInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createPaRunTInstanceAdapter() {
		if (paRunTInstanceItemProvider == null) {
			paRunTInstanceItemProvider = new PaRunTInstanceItemProvider(this);
		}

		return paRunTInstanceItemProvider;
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
		if (paStepItemProvider != null) paStepItemProvider.dispose();
		if (paRequestedStepItemProvider != null) paRequestedStepItemProvider.dispose();
		if (paCommStepItemProvider != null) paCommStepItemProvider.dispose();
		if (paResPassStepItemProvider != null) paResPassStepItemProvider.dispose();
		if (paLogicalResourceItemProvider != null) paLogicalResourceItemProvider.dispose();
		if (paRunTInstanceItemProvider != null) paRunTInstanceItemProvider.dispose();
	}

}
