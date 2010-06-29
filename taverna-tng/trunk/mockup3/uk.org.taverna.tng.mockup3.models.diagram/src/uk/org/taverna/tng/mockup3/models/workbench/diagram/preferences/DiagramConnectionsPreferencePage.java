package uk.org.taverna.tng.mockup3.models.workbench.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

import uk.org.taverna.tng.mockup3.models.workbench.diagram.part.WorkbenchDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(WorkbenchDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
