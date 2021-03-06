package uk.org.taverna.t3.workbench.ui.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.model.IWorkbenchAdapter2;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import uk.org.taverna.t3.workbench.components.registry.ComponentDefinitionTreeGroup;
import uk.org.taverna.t3.workbench.ui.Application;
import uk.org.taverna.t3.workbench.ui.util.ImageKeys;

public class ComponentDefinitionTreeGroupWorkbenchAdapter implements
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
		ComponentDefinitionTreeGroup group = (ComponentDefinitionTreeGroup) o;
		ArrayList<Object> output = new ArrayList<Object>(group.getChildGroups());
		output.addAll(group.getDefinitions());
		return output.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return AbstractUIPlugin.imageDescriptorFromPlugin(Application.PLUGIN_ID,
				ImageKeys.FOLDER_ICON);
	}

	@Override
	public String getLabel(Object o) {
		ComponentDefinitionTreeGroup group = (ComponentDefinitionTreeGroup) o;
		return group.getName(); 
	}

	@Override
	public Object getParent(Object o) {
		ComponentDefinitionTreeGroup group = (ComponentDefinitionTreeGroup) o;
		return group.getParent(); 
	}

}
