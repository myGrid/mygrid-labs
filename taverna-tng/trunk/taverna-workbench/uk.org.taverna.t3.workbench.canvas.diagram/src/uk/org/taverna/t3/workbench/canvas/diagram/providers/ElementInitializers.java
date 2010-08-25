package uk.org.taverna.t3.workbench.canvas.diagram.providers;

import uk.org.taverna.t3.workbench.canvas.diagram.part.WorkflowDiagramEditorPlugin;

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
		ElementInitializers cached = WorkflowDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			WorkflowDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
