package net.sf.taverna.t2.ui.perspectives.biocatalogue.integration.contextual_views;

import java.util.Arrays;
import java.util.List;

import net.sf.taverna.t2.workbench.ui.views.contextualviews.ContextualView;
import net.sf.taverna.t2.workbench.ui.views.contextualviews.activity.ContextualViewFactory;
import net.sf.taverna.t2.workflowmodel.processor.activity.ActivityInputPort;


public class BioCataloguePluginInputPortContextViewFactory implements
		ContextualViewFactory<ActivityInputPort> {

	public boolean canHandle(Object selection) {
		return selection instanceof ActivityInputPort;
	}
	
	public List<ContextualView> getViews(ActivityInputPort selection) {
		return Arrays.<ContextualView>asList(new ProcessorInputPortView(selection));
	}

}
