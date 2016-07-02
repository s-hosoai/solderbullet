package MARTE.blockdiagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.uml2.uml.edit.providers.UMLItemProviderAdapterFactory;
import org.osgi.framework.BundleContext;

import MARTE.blockdiagram.edit.policies.MARTE_sbBaseItemSemanticEditPolicy;
import MARTE.blockdiagram.providers.ElementInitializers;

/**
 * @generated
 */
public class MARTE_sbDiagramEditorPlugin extends AbstractUIPlugin {

	/**
	 * @generated
	 */
	public static final String ID = "jp.ac.jaist.kslab.sb.marte.dsl.block"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final PreferencesHint DIAGRAM_PREFERENCES_HINT = new PreferencesHint(
			ID);

	/**
	 * @generated
	 */
	private static MARTE_sbDiagramEditorPlugin instance;

	/**
	 * @generated
	 */
	private ComposedAdapterFactory adapterFactory;

	/**
	 * @generated
	 */
	private MARTE_sbDocumentProvider documentProvider;

	/**
	 * @generated
	 */
	private MARTE_sbBaseItemSemanticEditPolicy.LinkConstraints linkConstraints;

	/**
	 * @generated
	 */
	private ElementInitializers initializers;

	/**
	 * @generated
	 */
	public MARTE_sbDiagramEditorPlugin() {
	}

	/**
	 * @generated
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;
		PreferencesHint.registerPreferenceStore(DIAGRAM_PREFERENCES_HINT,
				getPreferenceStore());
		adapterFactory = createAdapterFactory();
	}

	/**
	 * @generated
	 */
	public void stop(BundleContext context) throws Exception {
		adapterFactory.dispose();
		adapterFactory = null;
		linkConstraints = null;
		initializers = null;
		instance = null;
		super.stop(context);
	}

	/**
	 * @generated
	 */
	public static MARTE_sbDiagramEditorPlugin getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	protected ComposedAdapterFactory createAdapterFactory() {
		ArrayList/*[org.eclipse.emf.common.notify.AdapterFactory]*/factories = new ArrayList/*[org.eclipse.emf.common.notify.AdapterFactory]*/();
		fillItemProviderFactories(factories);
		return new ComposedAdapterFactory(factories);
	}

	/**
	 * @generated
	 */
	protected void fillItemProviderFactories(
			List/*[org.eclipse.emf.common.notify.AdapterFactory]*/factories) {
		factories
				.add(new MARTE.MARTE_Foundations.NFPs.provider.NFPsItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_Foundations.CoreElements.provider.CoreElementsItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_Foundations.Alloc.provider.AllocItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_Foundations.Time.provider.TimeItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_Foundations.GRM.provider.GRMItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_Annexes.RSM.provider.RSMItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_Annexes.VSL.Variables.provider.VariablesItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_Annexes.VSL.DataTypes.provider.DataTypesItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_DesignModel.HLAM.provider.HLAMItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.provider.HwComputingItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.provider.HwCommunicationItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.provider.HwStorageManagerItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.provider.HwMemoryItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.provider.HwTimingItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.provider.HwDeviceItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_DesignModel.HRM.HwGeneral.provider.HwGeneralItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.provider.HwLayoutItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.provider.HwPowerItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.provider.HwPeripheralItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDeviceFunction.provider.HwDeviceFunctionItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_DesignModel.HRM.HwSpecification.HwIO.provider.HwIOItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_DesignModel.HRM.HwSpecification.HwRegister.provider.HwRegisterItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDatasheet.provider.HwDatasheetItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPackage.provider.HwPackageItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_DesignModel.HRM.HwProtocol.provider.HwProtocolItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_DesignModel.HRM.HwDiagram.provider.HwDiagramItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.provider.SW_ResourceCoreItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_DesignModel.SRM.SW_Concurrency.provider.SW_ConcurrencyItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_DesignModel.SRM.SW_Brokering.provider.SW_BrokeringItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_DesignModel.SRM.SW_Interaction.provider.SW_InteractionItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_DesignModel.GCM.provider.GCMItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_AnalysisModel.GQAM.provider.GQAMItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_AnalysisModel.SAM.provider.SAMItemProviderAdapterFactory());
		factories
				.add(new MARTE.MARTE_AnalysisModel.PAM.provider.PAMItemProviderAdapterFactory());
		factories.add(new EcoreItemProviderAdapterFactory());
		factories
				.add(new MARTE_Library.GRM_BasicTypes.provider.GRM_BasicTypesItemProviderAdapterFactory());
		factories
				.add(new MARTE_Library.BasicNFP_Types.provider.BasicNFP_TypesItemProviderAdapterFactory());
		factories
				.add(new MARTE_Library.MARTE_DataTypes.provider.MARTE_DataTypesItemProviderAdapterFactory());
		factories
				.add(new MARTE_Library.TimeLibrary.provider.TimeLibraryItemProviderAdapterFactory());
		factories
				.add(new MARTE_Library.RS_Library.provider.RS_LibraryItemProviderAdapterFactory());
		factories.add(new UMLItemProviderAdapterFactory());
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());
	}

	/**
	 * @generated
	 */
	public AdapterFactory getItemProvidersAdapterFactory() {
		return adapterFactory;
	}

	/**
	 * @generated
	 */
	public ImageDescriptor getItemImageDescriptor(Object item) {
		IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory
				.adapt(item, IItemLabelProvider.class);
		if (labelProvider != null) {
			return ExtendedImageRegistry.getInstance().getImageDescriptor(
					labelProvider.getImage(item));
		}
		return null;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path.
	 *
	 * @generated
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getBundledImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin(ID, path);
	}

	/**
	 * Respects images residing in any plug-in. If path is relative,
	 * then this bundle is looked up for the image, otherwise, for absolute 
	 * path, first segment is taken as id of plug-in with image
	 *
	 * @generated
	 * @param path the path to image, either absolute (with plug-in id as first segment), or relative for bundled images
	 * @return the image descriptor
	 */
	public static ImageDescriptor findImageDescriptor(String path) {
		final IPath p = new Path(path);
		if (p.isAbsolute() && p.segmentCount() > 1) {
			return AbstractUIPlugin.imageDescriptorFromPlugin(p.segment(0), p
					.removeFirstSegments(1).makeAbsolute().toString());
		} else {
			return getBundledImageDescriptor(p.makeAbsolute().toString());
		}
	}

	/**
	 * Returns an image for the image file at the given plug-in relative path.
	 * Client do not need to dispose this image. Images will be disposed automatically.
	 *
	 * @generated
	 * @param path the path
	 * @return image instance
	 */
	public Image getBundledImage(String path) {
		Image image = getImageRegistry().get(path);
		if (image == null) {
			getImageRegistry().put(path, getBundledImageDescriptor(path));
			image = getImageRegistry().get(path);
		}
		return image;
	}

	/**
	 * Returns string from plug-in's resource bundle
	 *
	 * @generated
	 */
	public static String getString(String key) {
		return Platform.getResourceString(getInstance().getBundle(), "%" + key); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public MARTE_sbDocumentProvider getDocumentProvider() {
		if (documentProvider == null) {
			documentProvider = new MARTE_sbDocumentProvider();
		}
		return documentProvider;
	}

	/**
	 * @generated
	 */
	public MARTE_sbBaseItemSemanticEditPolicy.LinkConstraints getLinkConstraints() {
		return linkConstraints;
	}

	/**
	 * @generated
	 */
	public void setLinkConstraints(
			MARTE_sbBaseItemSemanticEditPolicy.LinkConstraints lc) {
		this.linkConstraints = lc;
	}

	/**
	 * @generated
	 */
	public ElementInitializers getElementInitializers() {
		return initializers;
	}

	/**
	 * @generated
	 */
	public void setElementInitializers(ElementInitializers i) {
		this.initializers = i;
	}

	/**
	 * @generated
	 */
	public void logError(String error) {
		logError(error, null);
	}

	/**
	 * @generated
	 */
	public void logError(String error, Throwable throwable) {
		if (error == null && throwable != null) {
			error = throwable.getMessage();
		}
		getLog().log(
				new Status(IStatus.ERROR, MARTE_sbDiagramEditorPlugin.ID,
						IStatus.OK, error, throwable));
		debug(error, throwable);
	}

	/**
	 * @generated
	 */
	public void logInfo(String message) {
		logInfo(message, null);
	}

	/**
	 * @generated
	 */
	public void logInfo(String message, Throwable throwable) {
		if (message == null && throwable != null) {
			message = throwable.getMessage();
		}
		getLog().log(
				new Status(IStatus.INFO, MARTE_sbDiagramEditorPlugin.ID,
						IStatus.OK, message, throwable));
		debug(message, throwable);
	}

	/**
	 * @generated
	 */
	private void debug(String message, Throwable throwable) {
		if (!isDebugging()) {
			return;
		}
		if (message != null) {
			System.err.println(message);
		}
		if (throwable != null) {
			throwable.printStackTrace();
		}
	}
}
