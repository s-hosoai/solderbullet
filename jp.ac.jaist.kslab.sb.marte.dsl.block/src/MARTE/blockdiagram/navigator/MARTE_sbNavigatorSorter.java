package MARTE.blockdiagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import MARTE.blockdiagram.part.MARTE_sbVisualIDRegistry;

/**
 * @generated
 */
public class MARTE_sbNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof MARTE_sbNavigatorItem) {
			MARTE_sbNavigatorItem item = (MARTE_sbNavigatorItem) element;
			return MARTE_sbVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
