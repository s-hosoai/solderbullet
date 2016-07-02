package blockdiagram.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

import blockdiagram.diagram.part.BlockDiagramDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(BlockDiagramDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
