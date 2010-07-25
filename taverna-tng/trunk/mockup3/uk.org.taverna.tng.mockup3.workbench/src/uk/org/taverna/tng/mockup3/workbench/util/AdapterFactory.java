package uk.org.taverna.tng.mockup3.workbench.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

public class AdapterFactory implements IAdapterFactory {
	
	private IWorkbenchAdapter componentSearchResultsAdapter = new IWorkbenchAdapter() {
		public Object getParent(Object o) {
			return null;
		}

		public String getLabel(Object o) {
			return "";
		}
		
		public ImageDescriptor getImageDescriptor(Object o) {
			return null;
		}

		public Object[] getChildren(Object o) {
			ComponentSearchResults results = (ComponentSearchResults) o;
			List<ComponentSearchSourceResults> output = new ArrayList<ComponentSearchSourceResults>();
			collect(results.getSourceResults().iterator(), output);
			return output.toArray();
		}
	};
	
	private IWorkbenchAdapter componentSearchSourceResultsAdapter = new IWorkbenchAdapter() {
		public Object getParent(Object o) {
			ComponentSearchSourceResults results = (ComponentSearchSourceResults) o;
			return results.getParent();
		}

		public String getLabel(Object o) {
			ComponentSearchSourceResults results = (ComponentSearchSourceResults) o;
			return results.getSource().getName() + " (" + results.getResults().size() + ")";
		}
		
		public ImageDescriptor getImageDescriptor(Object o) {
			ComponentSearchSourceResults results = (ComponentSearchSourceResults) o;
			return results.getSource().getIcon();
		}

		public Object[] getChildren(Object o) {
			ComponentSearchSourceResults results = (ComponentSearchSourceResults) o;
			List<ComponentSearchResultItem> output = new ArrayList<ComponentSearchResultItem>();
			collect(results.getResults().iterator(), output);
			return output.toArray();
		}
	};
	
	private IWorkbenchAdapter componentSearchResultItemAdapter = new IWorkbenchAdapter() {
		public Object getParent(Object o) {
			ComponentSearchResultItem item = (ComponentSearchResultItem) o;
			return item.getParent();
		}

		public String getLabel(Object o) {
			ComponentSearchResultItem item = (ComponentSearchResultItem) o;
			return item.getName();
		}
		
		public ImageDescriptor getImageDescriptor(Object o) {
			ComponentSearchResultItem item = (ComponentSearchResultItem) o;
			return item.getIcon();
		}

		public Object[] getChildren(Object o) {
			return new Object[0];
		}
	};
	
	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (adapterType == IWorkbenchAdapter.class
				&& adaptableObject instanceof ComponentSearchResults)
			return componentSearchResultsAdapter;
		if (adapterType == IWorkbenchAdapter.class
				&& adaptableObject instanceof ComponentSearchSourceResults)
			return componentSearchSourceResultsAdapter;
		if (adapterType == IWorkbenchAdapter.class
				&& adaptableObject instanceof ComponentSearchResultItem)
			return componentSearchResultItemAdapter;
		return null;
	}

	@Override
	public Class[] getAdapterList() {
		return new Class[] { IWorkbenchAdapter.class };
	}
	
	private void collect(Iterator itr, List list) {
		while (itr.hasNext())
			list.add(itr.next());
	}

}
