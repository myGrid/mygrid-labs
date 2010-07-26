package uk.org.taverna.tng.mockup3.workbench.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import uk.org.taverna.tng.mockup3.core.ComponentDefinitionGroup;
import uk.org.taverna.tng.mockup3.core.ComponentDefinitionsRegistry;
import uk.org.taverna.tng.mockup3.core.IComponentDefinition;
import uk.org.taverna.tng.mockup3.workbench.Application;

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
			return results.getSource().getName() + " ("
					+ results.getResults().size() + ")";
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

	private IWorkbenchAdapter componentDefinitionsRegistryAdapter = new IWorkbenchAdapter() {
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
			ComponentDefinitionsRegistry registry = (ComponentDefinitionsRegistry) o;
			List<ComponentDefinitionGroup> output = new ArrayList<ComponentDefinitionGroup>();
			collect(registry.getTopLevelGroups().iterator(), output);
			return output.toArray();
		}
	};

	private IWorkbenchAdapter componentDefinitionGroupAdapter = new IWorkbenchAdapter() {
		public Object getParent(Object o) {
			ComponentDefinitionGroup group = (ComponentDefinitionGroup) o;
			return group.getParent();
		}

		public String getLabel(Object o) {
			ComponentDefinitionGroup group = (ComponentDefinitionGroup) o;
			return group.getName();
		}

		public ImageDescriptor getImageDescriptor(Object o) {
			return AbstractUIPlugin.imageDescriptorFromPlugin(Application.PLUGIN_ID,
					IImageKeys.FOLDER_ICON);
		}

		public Object[] getChildren(Object o) {
			ComponentDefinitionGroup group = (ComponentDefinitionGroup) o;
			List<ComponentDefinitionGroup> output1 = new ArrayList<ComponentDefinitionGroup>();
			List<IComponentDefinition> output2 = new ArrayList<IComponentDefinition>();
			collect(group.getChildGroups().iterator(), output1);
			collect(group.getChildDefinitions().iterator(), output2);
			ArrayList output3 = new ArrayList(output1);
			output3.addAll(output2);
			return output3.toArray();
		}
	};
	
	private IWorkbenchAdapter componentDefinitionAdapter = new IWorkbenchAdapter() {
		public Object getParent(Object o) {
			IComponentDefinition item = (IComponentDefinition) o;
			return null;
		}

		public String getLabel(Object o) {
			IComponentDefinition item = (IComponentDefinition) o;
			return item.getName();
		}

		public ImageDescriptor getImageDescriptor(Object o) {
			IComponentDefinition item = (IComponentDefinition) o;
			return AbstractUIPlugin.imageDescriptorFromPlugin(Application.PLUGIN_ID,
					item.getIcon());
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
		if (adapterType == IWorkbenchAdapter.class
				&& adaptableObject instanceof ComponentDefinitionsRegistry)
			return componentDefinitionsRegistryAdapter;
		if (adapterType == IWorkbenchAdapter.class
				&& adaptableObject instanceof ComponentDefinitionGroup)
			return componentDefinitionGroupAdapter;
		if (adapterType == IWorkbenchAdapter.class
				&& adaptableObject instanceof IComponentDefinition)
			return componentDefinitionAdapter;
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
