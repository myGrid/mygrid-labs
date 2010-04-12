package net.sf.taverna.t2.ui.perspectives.biocatalogue.integration.contextual_views;

import java.util.Arrays;
import java.util.List;

import net.sf.taverna.t2.workbench.ui.views.contextualviews.ContextualView;
import net.sf.taverna.t2.workbench.ui.views.contextualviews.activity.ContextualViewFactory;
import net.sf.taverna.t2.workflowmodel.Processor;

public class BioCataloguePluginProcessorContextViewFactory implements
		ContextualViewFactory<Processor> {
  
	public boolean canHandle(Object selection) {
		return selection instanceof Processor;
	}
	
	public List<ContextualView> getViews(Processor selection) {
		return Arrays.<ContextualView>asList(new ProcessorView(selection));
	}

}
