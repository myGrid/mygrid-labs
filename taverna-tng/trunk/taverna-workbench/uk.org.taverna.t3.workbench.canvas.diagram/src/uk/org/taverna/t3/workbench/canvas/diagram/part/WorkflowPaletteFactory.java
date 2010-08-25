package uk.org.taverna.t3.workbench.canvas.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import uk.org.taverna.t3.workbench.canvas.diagram.providers.WorkflowElementTypes;

/**
 * @generated
 */
public class WorkflowPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createWorkflow1Group());
	}

	/**
	 * Creates "workflow" palette tool group
	 * @generated
	 */
	private PaletteContainer createWorkflow1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Workflow1Group_title);
		paletteContainer.setId("createWorkflow1Group"); //$NON-NLS-1$
		paletteContainer.add(createComponentInstance1CreationTool());
		paletteContainer.add(createWorkflowInput2CreationTool());
		paletteContainer.add(createWorkflowOutput3CreationTool());
		paletteContainer.add(createCreateconnection4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponentInstance1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WorkflowElementTypes.ComponentInstance_2001);
		types.add(WorkflowElementTypes.ComponentInstanceOutput_3002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ComponentInstance1CreationTool_title,
				Messages.ComponentInstance1CreationTool_desc, types);
		entry.setId("createComponentInstance1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes
				.getImageDescriptor(WorkflowElementTypes.ComponentInstance_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWorkflowInput2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WorkflowElementTypes.ComponentInstanceInput_3001);
		types.add(WorkflowElementTypes.WorkflowInput_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WorkflowInput2CreationTool_title,
				Messages.WorkflowInput2CreationTool_desc, types);
		entry.setId("createWorkflowInput2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes
				.getImageDescriptor(WorkflowElementTypes.ComponentInstanceInput_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWorkflowOutput3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WorkflowOutput3CreationTool_title,
				Messages.WorkflowOutput3CreationTool_desc,
				Collections
						.singletonList(WorkflowElementTypes.WorkflowOutput_2003));
		entry.setId("createWorkflowOutput3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes
				.getImageDescriptor(WorkflowElementTypes.WorkflowOutput_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCreateconnection4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Createconnection4CreationTool_title,
				Messages.Createconnection4CreationTool_desc,
				Collections
						.singletonList(WorkflowElementTypes.SenderReceivers_4002));
		entry.setId("createCreateconnection4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkflowElementTypes
				.getImageDescriptor(WorkflowElementTypes.SenderReceivers_4002));
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
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
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
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
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
