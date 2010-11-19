package uk.org.taverna.t3.workbench.ui.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.model.IWorkbenchAdapter2;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import uk.org.taverna.t3.workbench.components.registry.ComponentDefinitionFlatGroup;
import uk.org.taverna.t3.workbench.components.registry.ComponentDefinitionGroup;
import uk.org.taverna.t3.workbench.ui.Application;
import uk.org.taverna.t3.workbench.ui.util.ImageKeys;

public class ComponentDefinitionFlatGroupWorkbenchAdapter implements
		IWorkbenchAdapter, IWorkbenchAdapter2 {

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
		ComponentDefinitionFlatGroup group = (ComponentDefinitionFlatGroup) o;
		return group.getDefinitions().toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return AbstractUIPlugin.imageDescriptorFromPlugin(Application.PLUGIN_ID,
				ImageKeys.FOLDER_ICON);
	}

	@Override
	public String getLabel(Object o) {
		ComponentDefinitionGroup group = (ComponentDefinitionGroup) o;
		return group.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
