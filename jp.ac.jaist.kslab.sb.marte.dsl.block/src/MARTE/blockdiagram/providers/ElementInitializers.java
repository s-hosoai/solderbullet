package MARTE.blockdiagram.providers;

import MARTE.blockdiagram.part.MARTE_sbDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = MARTE_sbDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			MARTE_sbDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
