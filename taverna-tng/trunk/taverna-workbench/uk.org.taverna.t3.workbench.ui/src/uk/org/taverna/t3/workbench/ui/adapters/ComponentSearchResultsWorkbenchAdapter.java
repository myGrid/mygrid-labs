package uk.org.taverna.t3.workbench.ui.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.model.IWorkbenchAdapter2;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import uk.org.taverna.t3.workbench.components.search.ComponentSearchResults;
import uk.org.taverna.t3.workbench.ui.Application;
import uk.org.taverna.t3.workbench.ui.util.ImageKeys;

public class ComponentSearchResultsWorkbenchAdapter implements
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
		ComponentSearchResults r = (ComponentSearchResults) o;
		return r.getResults().toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		ComponentSearchResults r = (ComponentSearchResults) object;
		if (r.getProvider().getIconRef() == null) {
			return AbstractUIPlugin.imageDescriptorFromPlugin(
					Application.PLUGIN_ID,
					ImageKeys.DEFAULT_COMPONENT_SEARCH_PROVIDER_ICON);
		} else {
			return AbstractUIPlugin.imageDescriptorFromPlugin(
					Application.PLUGIN_ID, r.getProvider().getIconRef());
		}
	}

	@Override
	public String getLabel(Object o) {
		ComponentSearchResults r = (ComponentSearchResults) o;
		return r.getProvider().getLabel() + " (" + r.getFetchedResultsCount() + "/" + r.getTotalResultsCount() + ")";
	}

	@Override
	public Object getParent(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

}
