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

import uk.org.taverna.t3.workbench.canvas.diagram.providers.CanvasElementTypes;

/**
 * @generated
 */
public class CanvasPaletteFactory {

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
		paletteContainer.add(createCoreComponentInstance1CreationTool());
		paletteContainer.add(createWorkflowInput2CreationTool());
		paletteContainer.add(createWorkflowOutput3CreationTool());
		paletteContainer.add(createCreateconnection4CreationTool());
		paletteContainer
				.add(createCreateHelperComponentInstance5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCoreComponentInstance1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CanvasElementTypes.WorkflowInput_2001);
		types.add(CanvasElementTypes.CoreComponentInstance_3001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CoreComponentInstance1CreationTool_title,
				Messages.CoreComponentInstance1CreationTool_desc, types);
		entry.setId("createCoreComponentInstance1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CanvasElementTypes
				.getImageDescriptor(CanvasElementTypes.WorkflowInput_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWorkflowInput2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CanvasElementTypes.Node_2002);
		types.add(CanvasElementTypes.ComponentInstanceInput_3002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WorkflowInput2CreationTool_title,
				Messages.WorkflowInput2CreationTool_desc, types);
		entry.setId("createWorkflowInput2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CanvasElementTypes
				.getImageDescriptor(CanvasElementTypes.Node_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWorkflowOutput3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CanvasElementTypes.ComponentInstanceOutput_3003);
		types.add(CanvasElementTypes.WorkflowOutput_2003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WorkflowOutput3CreationTool_title,
				Messages.WorkflowOutput3CreationTool_desc, types);
		entry.setId("createWorkflowOutput3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CanvasElementTypes
				.getImageDescriptor(CanvasElementTypes.ComponentInstanceOutput_3003));
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
						.singletonList(CanvasElementTypes.SenderReceivers_4001));
		entry.setId("createCreateconnection4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CanvasElementTypes
				.getImageDescriptor(CanvasElementTypes.SenderReceivers_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCreateHelperComponentInstance5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CreateHelperComponentInstance5CreationTool_title,
				Messages.CreateHelperComponentInstance5CreationTool_desc,
				Collections
						.singletonList(CanvasElementTypes.HelperComponentInstance_3004));
		entry.setId("createCreateHelperComponentInstance5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CanvasElementTypes
				.getImageDescriptor(CanvasElementTypes.HelperComponentInstance_3004));
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
