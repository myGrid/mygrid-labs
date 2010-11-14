package uk.org.taverna.t3.workbench.ui.adapters;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.model.IWorkbenchAdapter2;

import uk.org.taverna.t3.workbench.workflows.model.WorkflowsCollectionManager;
import uk.org.taverna.t3.workbench.workflows.model.WorkflowsCollectionSource;

public class AdapterFactory implements IAdapterFactory {
	
	private final WorkflowsCollectionManagerWorkbenchAdapter workflowsCollectionManagerWorkbenchAdapter = new WorkflowsCollectionManagerWorkbenchAdapter();
	
	private final WorkflowsCollectionSourceWorkbenchAdapter workflowsCollectionSourceWorkbenchAdapter = new WorkflowsCollectionSourceWorkbenchAdapter();

	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (adapterType == IWorkbenchAdapter.class || adapterType == IWorkbenchAdapter2.class) {
			if (adaptableObject instanceof WorkflowsCollectionManager)
				return workflowsCollectionManagerWorkbenchAdapter;
			
			if (adaptableObject instanceof WorkflowsCollectionSource)
				return workflowsCollectionSourceWorkbenchAdapter;
		}
		
		return null;
	}

	@Override
	public Class[] getAdapterList() {
		return new Class[] { IWorkbenchAdapter.class, IWorkbenchAdapter2.class };
	}

}
