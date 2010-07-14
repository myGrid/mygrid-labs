package net.sf.taverna.t2.ui.perspectives.biocatalogue.integration.contextual_views;

import java.util.Arrays;
import java.util.List;

import net.sf.taverna.t2.workbench.ui.views.contextualviews.ContextualView;
import net.sf.taverna.t2.workbench.ui.views.contextualviews.activity.ContextualViewFactory;
import net.sf.taverna.t2.workflowmodel.processor.activity.ActivityOutputPort;


public class BioCataloguePluginOutputPortContextViewFactory implements
		ContextualViewFactory<ActivityOutputPort> {
  
	public boolean canHandle(Object selection) {
		return selection instanceof ActivityOutputPort;
	}
	
	public List<ContextualView> getViews(ActivityOutputPort selection) {
		return Arrays.<ContextualView>asList(new ProcessorOutputPortView(selection));
	}
	
}
