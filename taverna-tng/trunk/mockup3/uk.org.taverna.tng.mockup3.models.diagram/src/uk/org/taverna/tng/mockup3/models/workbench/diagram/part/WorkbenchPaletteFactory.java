package uk.org.taverna.tng.mockup3.models.workbench.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

import uk.org.taverna.tng.mockup3.models.workbench.diagram.providers.WorkbenchElementTypes;

/**
 * @generated
 */
public class WorkbenchPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createWorkbench1Group());
	}

	/**
	 * Creates "workbench" palette tool group
	 * @generated
	 */
	private PaletteContainer createWorkbench1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Workbench1Group_title);
		paletteContainer.setId("createWorkbench1Group"); //$NON-NLS-1$
		paletteContainer.add(createComponent1CreationTool());
		paletteContainer.add(createWorkflow2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponent1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(WorkbenchElementTypes.Component_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Component1CreationTool_title,
				Messages.Component1CreationTool_desc, types);
		entry.setId("createComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WorkbenchElementTypes
				.getImageDescriptor(WorkbenchElementTypes.Component_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWorkflow2CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Workflow2CreationTool_title,
				Messages.Workflow2CreationTool_desc, null, null) {
		};
		entry.setId("createWorkflow2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
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
}
