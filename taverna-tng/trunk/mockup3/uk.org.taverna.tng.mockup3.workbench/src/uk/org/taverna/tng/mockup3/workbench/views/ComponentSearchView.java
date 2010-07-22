package uk.org.taverna.tng.mockup3.workbench.views;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.part.ViewPart;

import uk.org.taverna.tng.mockup3.core.ISearchTermProvider;
import uk.org.taverna.tng.mockup3.workbench.commands.CommandParameters;
import uk.org.taverna.tng.mockup3.workbench.commands.Commands;
import uk.org.taverna.tng.mockup3.workbench.util.CustomContentProvider;
import uk.org.taverna.tng.mockup3.workbench.util.CustomLabelProvider;

public class ComponentSearchView extends ViewPart implements
		ISearchTermProvider {

	private Text searchBox;
	private TreeViewer searchResultsTreeViewer;
	
	public ComponentSearchView() {
		 
	}

	@Override
	public void createPartControl(Composite parent) {

		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		GridLayout topLayout = new GridLayout(1, true);
		topLayout.marginWidth = 0;
		topLayout.marginHeight = 0;
		parent.setLayout(topLayout);

		this.searchBox = new Text(parent, SWT.SINGLE | SWT.CANCEL | SWT.SEARCH
				| SWT.BORDER);
		this.searchBox.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false));
		this.searchBox.setMessage("Search for new components...");
		this.searchBox.addSelectionListener(new SelectionAdapter() {
			public void widgetDefaultSelected(SelectionEvent e) {
				if (e.detail == SWT.CANCEL) {
					System.out.println("Search cancelled");
				} else {
					try {
						// TODO: cache these instead of fetching each time!
						IHandlerService handlerService = (IHandlerService) getSite().getService(IHandlerService.class);
						ICommandService commandService = (ICommandService) getSite().getService(ICommandService.class);
						
						Command searchCommand = commandService.getCommand(Commands.SEARCH_NEW_COMPONENTS);
						Map<String, Object> params = new HashMap<String, Object>();
						params.put(CommandParameters.SEARCH_TERM, getSearchTerm());
						ParameterizedCommand paramShowElement = ParameterizedCommand.generateCommand(searchCommand, params);
						ExecutionEvent execEvent = handlerService.createExecutionEvent(paramShowElement, null);
						searchCommand.executeWithChecks(execEvent);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			}
		});

		this.searchResultsTreeViewer = new TreeViewer(parent, SWT.MULTI
				| SWT.H_SCROLL | SWT.V_SCROLL);
		this.searchResultsTreeViewer.getControl().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, true));
		getSite().setSelectionProvider(this.searchResultsTreeViewer);
		this.searchResultsTreeViewer
				.setContentProvider(new CustomContentProvider());
		this.searchResultsTreeViewer
				.setLabelProvider(new CustomLabelProvider());

	}

	@Override
	public void setFocus() {
		if (this.searchBox != null) {
			this.searchBox.setFocus();
		}
	}

	@Override
	public String getSearchTerm() {
		if (this.searchBox != null) {
			return this.searchBox.getText();
		} else {
			return "";
		}
	}

}
