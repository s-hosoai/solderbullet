package MARTE.blockdiagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

import MARTE.blockdiagram.providers.MARTE_sbElementTypes;

/**
 * @generated
 */
public class MARTE_sbPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createMARTE1Group());
	}

	/**
	 * Creates "MARTE" palette tool group
	 * @generated
	 */
	private PaletteContainer createMARTE1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.MARTE1Group_title);
		paletteContainer.setId("createMARTE1Group"); //$NON-NLS-1$
		paletteContainer.add(createHwMCU1CreationTool());
		paletteContainer.add(createHwConnection2CreationTool());
		paletteContainer.add(createHwDevice3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHwMCU1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.HwMCU1CreationTool_title,
				Messages.HwMCU1CreationTool_desc,
				Collections.singletonList(MARTE_sbElementTypes.HwMCU_2001));
		entry.setId("createHwMCU1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MARTE_sbElementTypes
				.getImageDescriptor(MARTE_sbElementTypes.HwMCU_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHwConnection2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.HwConnection2CreationTool_title,
				Messages.HwConnection2CreationTool_desc,
				Collections
						.singletonList(MARTE_sbElementTypes.HwConnection_4001));
		entry.setId("createHwConnection2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MARTE_sbElementTypes
				.getImageDescriptor(MARTE_sbElementTypes.HwConnection_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHwDevice3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.HwDevice3CreationTool_title,
				Messages.HwDevice3CreationTool_desc,
				Collections.singletonList(MARTE_sbElementTypes.HwDevice_2002));
		entry.setId("createHwDevice3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MARTE_sbElementTypes
				.getImageDescriptor(MARTE_sbElementTypes.HwDevice_2002));
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
