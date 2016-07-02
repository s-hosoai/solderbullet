package blockdiagram.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

import blockdiagram.diagram.providers.BlockDiagramElementTypes;

/**
 * @generated
 */
public class BlockDiagramPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createBlockdiagram1Group());
	}

	/**
	 * Creates "blockdiagram" palette tool group
	 * @generated
	 */
	private PaletteContainer createBlockdiagram1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Blockdiagram1Group_title);
		paletteContainer.setId("createBlockdiagram1Group"); //$NON-NLS-1$
		paletteContainer.add(createConnection1CreationTool());
		paletteContainer.add(createMCU2CreationTool());
		paletteContainer.add(createDevice3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnection1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Connection1CreationTool_title,
				Messages.Connection1CreationTool_desc,
				Collections
						.singletonList(BlockDiagramElementTypes.Connection_4001));
		entry.setId("createConnection1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BlockDiagramElementTypes
				.getImageDescriptor(BlockDiagramElementTypes.Connection_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMCU2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MCU2CreationTool_title,
				Messages.MCU2CreationTool_desc,
				Collections.singletonList(BlockDiagramElementTypes.MCU_2002));
		entry.setId("createMCU2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BlockDiagramElementTypes
				.getImageDescriptor(BlockDiagramElementTypes.MCU_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDevice3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Device3CreationTool_title,
				Messages.Device3CreationTool_desc,
				Collections.singletonList(BlockDiagramElementTypes.Device_2001));
		entry.setId("createDevice3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BlockDiagramElementTypes
				.getImageDescriptor(BlockDiagramElementTypes.Device_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(
				String title,
				String description,
				List/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(
				String title,
				String description,
				List/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
