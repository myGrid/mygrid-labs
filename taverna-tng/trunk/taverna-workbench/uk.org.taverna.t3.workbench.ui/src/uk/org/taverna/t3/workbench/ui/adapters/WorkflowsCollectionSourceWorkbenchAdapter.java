package uk.org.taverna.t3.workbench.ui.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.model.IWorkbenchAdapter2;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import uk.org.taverna.t3.workbench.ui.Application;
import uk.org.taverna.t3.workbench.workflows.model.WorkflowsCollectionSource;

public class WorkflowsCollectionSourceWorkbenchAdapter implements
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
		return new Object[] { };
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		WorkflowsCollectionSource source = (WorkflowsCollectionSource) object;
		return AbstractUIPlugin.imageDescriptorFromPlugin(Application.PLUGIN_ID,
				source.getIcon());
	}

	@Override
	public String getLabel(Object o) {
		WorkflowsCollectionSource source = (WorkflowsCollectionSource) o;
		return source.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
