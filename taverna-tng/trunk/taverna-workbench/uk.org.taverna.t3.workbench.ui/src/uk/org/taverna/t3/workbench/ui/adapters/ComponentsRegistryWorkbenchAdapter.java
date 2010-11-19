package uk.org.taverna.t3.workbench.ui.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import uk.org.taverna.t3.workbench.components.registry.ComponentsRegistry;

public class ComponentsRegistryWorkbenchAdapter implements IWorkbenchAdapter {

	@Override
	public Object[] getChildren(Object o) {
		ComponentsRegistry registry = (ComponentsRegistry) o;
		return registry.getTopLevelFlatGroups().toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLabel(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getParent(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

}
