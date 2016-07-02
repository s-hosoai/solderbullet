package blockdiagram.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import blockdiagram.diagram.part.BlockDiagramVisualIDRegistry;

/**
 * @generated
 */
public class BlockDiagramNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof BlockDiagramNavigatorItem) {
			BlockDiagramNavigatorItem item = (BlockDiagramNavigatorItem) element;
			return BlockDiagramVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
