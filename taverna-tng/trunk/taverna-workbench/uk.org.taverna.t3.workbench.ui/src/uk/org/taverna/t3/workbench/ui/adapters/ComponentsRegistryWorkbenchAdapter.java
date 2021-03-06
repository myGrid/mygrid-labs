package uk.org.taverna.t3.workbench.ui.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.model.IWorkbenchAdapter2;

import uk.org.taverna.t3.workbench.components.registry.ComponentsRegistry;

public class ComponentsRegistryWorkbenchAdapter implements IWorkbenchAdapter,
		IWorkbenchAdapter2 {

	@Override
	public Object[] getChildren(Object o) {
		ComponentsRegistry registry = (ComponentsRegistry) o;
		return registry.getTopLevelFlatGroups().toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		return null;
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

	@Override
	public RGB getForeground(Object element) {
		return null;
	}

	@Override
	public RGB getBackground(Object element) {
		return null;
	}

	@Override
	public FontData getFont(Object element) {
		return null;
	}

}
