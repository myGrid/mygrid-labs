package uk.org.taverna.t3.workbench.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.internal.dialogs.ViewContentProvider;
import org.eclipse.ui.part.ViewPart;

public class WorkflowsView extends ViewPart {
	
	public static final String ID = "uk.org.taverna.t3.workbench.ui.views.workflows";
	
	private FilteredTree tree;

	public WorkflowsView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		tree = new FilteredTree(parent, SWT.MULTI
				| SWT.H_SCROLL | SWT.V_SCROLL, new PatternFilter(), true);
		tree.getViewer().setContentProvider(new ViewContentProvider());
		tree.getViewer().setInput(getViewSite());

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
