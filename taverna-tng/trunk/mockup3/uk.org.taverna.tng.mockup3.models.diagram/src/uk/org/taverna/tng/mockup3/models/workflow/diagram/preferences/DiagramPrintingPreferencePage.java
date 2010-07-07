package uk.org.taverna.tng.mockup3.models.workflow.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.PrintingPreferencePage;

import uk.org.taverna.tng.mockup3.models.workflow.diagram.part.WorkflowDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramPrintingPreferencePage extends PrintingPreferencePage {

	/**
	 * @generated
	 */
	public DiagramPrintingPreferencePage() {
		setPreferenceStore(WorkflowDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
