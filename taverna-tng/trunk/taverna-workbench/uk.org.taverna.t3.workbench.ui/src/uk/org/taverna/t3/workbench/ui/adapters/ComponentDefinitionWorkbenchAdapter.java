package uk.org.taverna.t3.workbench.ui.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.model.IWorkbenchAdapter2;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;
import uk.org.taverna.t3.workbench.ui.Application;
import uk.org.taverna.t3.workbench.ui.util.ImageKeys;

public class ComponentDefinitionWorkbenchAdapter implements IWorkbenchAdapter,
		IWorkbenchAdapter2 {

	@Override
	public RGB getForeground(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RGB getBackground(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FontData getFont(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] getChildren(Object o) {
		return new Object[] {};
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		ComponentDefinition def = (ComponentDefinition) object;
		if (def.getIcons().getMain() == null) {
			return AbstractUIPlugin.imageDescriptorFromPlugin(
					Application.PLUGIN_ID, ImageKeys.DEFAULT_COMPONENT_ICON);
		} else {
			return AbstractUIPlugin.imageDescriptorFromPlugin(
					Application.PLUGIN_ID, def.getIcons().getMain());
		}

	}

	@Override
	public String getLabel(Object o) {
		ComponentDefinition def = (ComponentDefinition) o;
		
		StringBuilder sb = new StringBuilder();
		sb.append(def.getLabel());
		sb.append("   (");
		sb.append(def.getPorts().getInputs().size());
		sb.append(" inputs, ");
		sb.append(def.getPorts().getOutputs().size());
		sb.append(" outputs)");
		
		return sb.toString();
	}

	@Override
	public Object getParent(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

}
