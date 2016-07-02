package blockdiagram.diagram.navigator;

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

import blockdiagram.diagram.edit.parts.ConnectionEditPart;
import blockdiagram.diagram.edit.parts.ConnectionNameEditPart;
import blockdiagram.diagram.edit.parts.DeviceEditPart;
import blockdiagram.diagram.edit.parts.DeviceNameEditPart;
import blockdiagram.diagram.edit.parts.DiagramEditPart;
import blockdiagram.diagram.edit.parts.MCUEditPart;
import blockdiagram.diagram.edit.parts.MCUNameEditPart;
import blockdiagram.diagram.part.BlockDiagramDiagramEditorPlugin;
import blockdiagram.diagram.part.BlockDiagramVisualIDRegistry;
import blockdiagram.diagram.providers.BlockDiagramElementTypes;
import blockdiagram.diagram.providers.BlockDiagramParserProvider;

/**
 * @generated
 */
public class BlockDiagramNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		BlockDiagramDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		BlockDiagramDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof BlockDiagramNavigatorItem
				&& !isOwnView(((BlockDiagramNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof BlockDiagramNavigatorGroup) {
			BlockDiagramNavigatorGroup group = (BlockDiagramNavigatorGroup) element;
			return BlockDiagramDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof BlockDiagramNavigatorItem) {
			BlockDiagramNavigatorItem navigatorItem = (BlockDiagramNavigatorItem) element;
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
		switch (BlockDiagramVisualIDRegistry.getVisualID(view)) {
		case ConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://blockdiagram/1.0?Connection", BlockDiagramElementTypes.Connection_4001); //$NON-NLS-1$
		case DeviceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://blockdiagram/1.0?Device", BlockDiagramElementTypes.Device_2001); //$NON-NLS-1$
		case DiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://blockdiagram/1.0?Diagram", BlockDiagramElementTypes.Diagram_1000); //$NON-NLS-1$
		case MCUEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://blockdiagram/1.0?MCU", BlockDiagramElementTypes.MCU_2002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = BlockDiagramDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& BlockDiagramElementTypes.isKnownElementType(elementType)) {
			image = BlockDiagramElementTypes.getImage(elementType);
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
		if (element instanceof BlockDiagramNavigatorGroup) {
			BlockDiagramNavigatorGroup group = (BlockDiagramNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof BlockDiagramNavigatorItem) {
			BlockDiagramNavigatorItem navigatorItem = (BlockDiagramNavigatorItem) element;
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
		switch (BlockDiagramVisualIDRegistry.getVisualID(view)) {
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_4001Text(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2001Text(view);
		case DiagramEditPart.VISUAL_ID:
			return getDiagram_1000Text(view);
		case MCUEditPart.VISUAL_ID:
			return getMCU_2002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getConnection_4001Text(View view) {
		IParser parser = BlockDiagramParserProvider.getParser(
				BlockDiagramElementTypes.Connection_4001,
				view.getElement() != null ? view.getElement() : view,
				BlockDiagramVisualIDRegistry
						.getType(ConnectionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BlockDiagramDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDevice_2001Text(View view) {
		IParser parser = BlockDiagramParserProvider.getParser(
				BlockDiagramElementTypes.Device_2001,
				view.getElement() != null ? view.getElement() : view,
				BlockDiagramVisualIDRegistry
						.getType(DeviceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BlockDiagramDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMCU_2002Text(View view) {
		IParser parser = BlockDiagramParserProvider
				.getParser(BlockDiagramElementTypes.MCU_2002,
						view.getElement() != null ? view.getElement() : view,
						BlockDiagramVisualIDRegistry
								.getType(MCUNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BlockDiagramDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
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
		return DiagramEditPart.MODEL_ID.equals(BlockDiagramVisualIDRegistry
				.getModelID(view));
	}

}
