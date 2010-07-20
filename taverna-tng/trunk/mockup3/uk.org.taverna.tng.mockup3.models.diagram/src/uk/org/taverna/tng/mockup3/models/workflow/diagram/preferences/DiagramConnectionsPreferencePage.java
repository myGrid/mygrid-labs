package uk.org.taverna.tng.mockup3.models.workflow.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

import uk.org.taverna.tng.mockup3.models.workflow.diagram.part.WorkflowDiagramEditorPlugin;

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
