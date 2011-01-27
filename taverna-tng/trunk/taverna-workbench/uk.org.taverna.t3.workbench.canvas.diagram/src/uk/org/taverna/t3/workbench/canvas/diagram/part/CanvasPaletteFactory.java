package uk.org.taverna.t3.workbench.canvas.diagram.part;

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
		paletteRoot.add(createCanvas1Group());
	}

	/**
	 * Creates "canvas" palette tool group
	 * @generated
	 */
	private PaletteContainer createCanvas1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Canvas1Group_title);
		paletteContainer.setId("createCanvas1Group"); //$NON-NLS-1$
		paletteContainer.add(createComponent1CreationTool());
		paletteContainer.add(createWorkflowInput2CreationTool());
		paletteContainer.add(createWorkflowOutput3CreationTool());
		paletteContainer.add(createCreateconnection4CreationTool());
		paletteContainer.add(createCreateComponentInput5CreationTool());
		paletteContainer.add(createCreateComponentOutput6CreationTool());
		paletteContainer.add(createProcessor7CreationTool());
		paletteContainer.add(createProcessorInput8CreationTool());
		paletteContainer.add(createProcessorOutput9CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponent1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Component1CreationTool_title,
				Messages.Component1CreationTool_desc,
				Collections.singletonList(CanvasElementTypes.Component_2004));
		entry.setId("createComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CanvasElementTypes
				.getImageDescriptor(CanvasElementTypes.Component_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWorkflowInput2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WorkflowInput2CreationTool_title,
				Messages.WorkflowInput2CreationTool_desc,
				Collections
						.singletonList(CanvasElementTypes.WorkflowInput_2001));
		entry.setId("createWorkflowInput2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CanvasElementTypes
				.getImageDescriptor(CanvasElementTypes.WorkflowInput_2001));
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
						.singletonList(CanvasElementTypes.WorkflowOutput_2003));
		entry.setId("createWorkflowOutput3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CanvasElementTypes
				.getImageDescriptor(CanvasElementTypes.WorkflowOutput_2003));
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
						.singletonList(CanvasElementTypes.SenderReceivers_4003));
		entry.setId("createCreateconnection4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CanvasElementTypes
				.getImageDescriptor(CanvasElementTypes.SenderReceivers_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCreateComponentInput5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CreateComponentInput5CreationTool_title,
				Messages.CreateComponentInput5CreationTool_desc,
				Collections
						.singletonList(CanvasElementTypes.ComponentInput_3004));
		entry.setId("createCreateComponentInput5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CanvasElementTypes
				.getImageDescriptor(CanvasElementTypes.ComponentInput_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCreateComponentOutput6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CreateComponentOutput6CreationTool_title,
				Messages.CreateComponentOutput6CreationTool_desc,
				Collections
						.singletonList(CanvasElementTypes.ComponentOutput_3005));
		entry.setId("createCreateComponentOutput6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CanvasElementTypes
				.getImageDescriptor(CanvasElementTypes.ComponentOutput_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcessor7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Processor7CreationTool_title,
				Messages.Processor7CreationTool_desc,
				Collections.singletonList(CanvasElementTypes.Processor_3001));
		entry.setId("createProcessor7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CanvasElementTypes
				.getImageDescriptor(CanvasElementTypes.Processor_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcessorInput8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ProcessorInput8CreationTool_title, null,
				Collections
						.singletonList(CanvasElementTypes.ProcessorInput_3002));
		entry.setId("createProcessorInput8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CanvasElementTypes
				.getImageDescriptor(CanvasElementTypes.ProcessorInput_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcessorOutput9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ProcessorOutput9CreationTool_title, null,
				Collections
						.singletonList(CanvasElementTypes.ProcessorOutput_3003));
		entry.setId("createProcessorOutput9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CanvasElementTypes
				.getImageDescriptor(CanvasElementTypes.ProcessorOutput_3003));
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
