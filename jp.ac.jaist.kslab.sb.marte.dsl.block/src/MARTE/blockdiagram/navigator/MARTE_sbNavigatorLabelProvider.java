package MARTE.blockdiagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwBlockDiagram;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwConnection;
import MARTE.blockdiagram.edit.parts.HwBlockDiagramEditPart;
import MARTE.blockdiagram.edit.parts.HwConnectionEditPart;
import MARTE.blockdiagram.edit.parts.HwDeviceEditPart;
import MARTE.blockdiagram.edit.parts.HwDeviceNameEditPart;
import MARTE.blockdiagram.edit.parts.HwMCUEditPart;
import MARTE.blockdiagram.edit.parts.HwMCUNameEditPart;
import MARTE.blockdiagram.part.MARTE_sbDiagramEditorPlugin;
import MARTE.blockdiagram.part.MARTE_sbVisualIDRegistry;
import MARTE.blockdiagram.providers.MARTE_sbElementTypes;
import MARTE.blockdiagram.providers.MARTE_sbParserProvider;

/**
 * @generated
 */
public class MARTE_sbNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		MARTE_sbDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		MARTE_sbDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof MARTE_sbNavigatorItem
				&& !isOwnView(((MARTE_sbNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof MARTE_sbNavigatorGroup) {
			MARTE_sbNavigatorGroup group = (MARTE_sbNavigatorGroup) element;
			return MARTE_sbDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof MARTE_sbNavigatorItem) {
			MARTE_sbNavigatorItem navigatorItem = (MARTE_sbNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (MARTE_sbVisualIDRegistry.getVisualID(view)) {
		case HwDeviceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///MARTE/MARTE_DesignModel/HRM/HwLogical/HwDevice.ecore?HwDevice", MARTE_sbElementTypes.HwDevice_2002); //$NON-NLS-1$
		case HwBlockDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///MARTE/MARTE_DesignModel/HRM/HwDiagram.ecore?HwBlockDiagram", MARTE_sbElementTypes.HwBlockDiagram_1000); //$NON-NLS-1$
		case HwMCUEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///MARTE/MARTE_DesignModel/HRM/HwLogical/HwComputing.ecore?HwMCU", MARTE_sbElementTypes.HwMCU_2001); //$NON-NLS-1$
		case HwConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///MARTE/MARTE_DesignModel/HRM/HwLogical/HwCommunication.ecore?HwConnection", MARTE_sbElementTypes.HwConnection_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MARTE_sbDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& MARTE_sbElementTypes.isKnownElementType(elementType)) {
			image = MARTE_sbElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof MARTE_sbNavigatorGroup) {
			MARTE_sbNavigatorGroup group = (MARTE_sbNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MARTE_sbNavigatorItem) {
			MARTE_sbNavigatorItem navigatorItem = (MARTE_sbNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (MARTE_sbVisualIDRegistry.getVisualID(view)) {
		case HwDeviceEditPart.VISUAL_ID:
			return getHwDevice_2002Text(view);
		case HwBlockDiagramEditPart.VISUAL_ID:
			return getHwBlockDiagram_1000Text(view);
		case HwMCUEditPart.VISUAL_ID:
			return getHwMCU_2001Text(view);
		case HwConnectionEditPart.VISUAL_ID:
			return getHwConnection_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getHwBlockDiagram_1000Text(View view) {
		HwBlockDiagram domainModelElement = (HwBlockDiagram) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			MARTE_sbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHwDevice_2002Text(View view) {
		IParser parser = MARTE_sbParserProvider.getParser(
				MARTE_sbElementTypes.HwDevice_2002,
				view.getElement() != null ? view.getElement() : view,
				MARTE_sbVisualIDRegistry
						.getType(HwDeviceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MARTE_sbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHwConnection_4001Text(View view) {
		HwConnection domainModelElement = (HwConnection) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			MARTE_sbDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHwMCU_2001Text(View view) {
		IParser parser = MARTE_sbParserProvider.getParser(
				MARTE_sbElementTypes.HwMCU_2001,
				view.getElement() != null ? view.getElement() : view,
				MARTE_sbVisualIDRegistry.getType(HwMCUNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MARTE_sbDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return HwBlockDiagramEditPart.MODEL_ID.equals(MARTE_sbVisualIDRegistry
				.getModelID(view));
	}

}
