package uk.org.taverna.t3.workbench.canvas.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

import uk.org.taverna.t3.workbench.canvas.diagram.part.WorkflowDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(WorkflowDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
