package net.sf.taverna.t2.activities.rest.ui.view;

import java.util.Arrays;
import java.util.List;

import net.sf.taverna.t2.workbench.ui.views.contextualviews.ContextualView;
import net.sf.taverna.t2.workbench.ui.views.contextualviews.activity.ContextualViewFactory;

import net.sf.taverna.t2.activities.rest.RESTActivity;

public class ExampleActivityContextViewFactory implements
		ContextualViewFactory<RESTActivity> {

	public boolean canHandle(Object selection) {
		return selection instanceof RESTActivity;
	}

	public List<ContextualView> getViews(RESTActivity selection) {
		return Arrays.<ContextualView>asList(new ExampleContextualView(selection));
	}
	
}
