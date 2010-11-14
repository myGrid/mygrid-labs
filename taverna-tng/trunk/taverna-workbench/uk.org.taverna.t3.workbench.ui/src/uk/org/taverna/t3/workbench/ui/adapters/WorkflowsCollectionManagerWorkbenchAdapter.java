package uk.org.taverna.t3.workbench.ui.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import uk.org.taverna.t3.workbench.workflows.model.WorkflowsCollectionManager;

public class WorkflowsCollectionManagerWorkbenchAdapter implements
		IWorkbenchAdapter {

	@Override
	public Object[] getChildren(Object o) {
		WorkflowsCollectionManager manager = (WorkflowsCollectionManager) o;
		return manager.getSources().toArray();
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

}
