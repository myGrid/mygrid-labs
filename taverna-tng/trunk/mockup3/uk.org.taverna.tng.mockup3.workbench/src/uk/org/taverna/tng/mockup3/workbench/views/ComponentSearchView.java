package uk.org.taverna.tng.mockup3.workbench.views;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.part.ViewPart;

import uk.org.taverna.tng.mockup3.core.ISearchTermProvider;
import uk.org.taverna.tng.mockup3.workbench.commands.ICommandParameters;
import uk.org.taverna.tng.mockup3.workbench.commands.ICommands;
import uk.org.taverna.tng.mockup3.workbench.util.ComponentSearchResults;
import uk.org.taverna.tng.mockup3.workbench.util.CustomContentProvider;
import uk.org.taverna.tng.mockup3.workbench.util.CustomLabelProvider;

public class ComponentSearchView extends ViewPart implements
		ISearchTermProvider {
	
	public static final String VIEW_ID = "uk.org.taverna.tng.mockup3.workbench.views.ComponentSearchView";

	private Text searchBox;
	private TreeViewer searchResultsTreeViewer;
	
	private ComponentSearchResults currentSearchResults;
	
	public ComponentSearchView() {
		 
	}

	@Override
	public void createPartControl(Composite parent) {

		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		GridLayout mainLayout = new GridLayout(1, true);
		mainLayout.marginWidth = 0;
		mainLayout.marginHeight = 0;
		parent.setLayout(mainLayout);

		searchBox = new Text(parent, SWT.SINGLE | SWT.CANCEL | SWT.SEARCH
				| SWT.BORDER);
		searchBox.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false));
		searchBox.setMessage("Search for new components...");
		searchBox.addSelectionListener(new SelectionAdapter() {
			public void widgetDefaultSelected(SelectionEvent e) {
				if (e.detail == SWT.CANCEL) {
					System.out.println("Search cancelled");
				} else {
					try {
						// TODO: cache these instead of fetching each time!
						IHandlerService handlerService = (IHandlerService) getSite().getService(IHandlerService.class);
						ICommandService commandService = (ICommandService) getSite().getService(ICommandService.class);
						
						Command searchCommand = commandService.getCommand(ICommands.SEARCH_NEW_COMPONENTS);
						Map<String, Object> params = new HashMap<String, Object>();
						params.put(ICommandParameters.SEARCH_TERM, getSearchTerm());
						ParameterizedCommand paramSarchCommand = ParameterizedCommand.generateCommand(searchCommand, params);
						ExecutionEvent execEvent = handlerService.createExecutionEvent(paramSarchCommand, null);
						searchCommand.executeWithChecks(execEvent);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			}
		});

		searchResultsTreeViewer = new TreeViewer(parent, SWT.MULTI
				| SWT.H_SCROLL | SWT.V_SCROLL);
		searchResultsTreeViewer.getControl().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, true));
		getSite().setSelectionProvider(searchResultsTreeViewer);
		searchResultsTreeViewer
				.setContentProvider(new CustomContentProvider());
		searchResultsTreeViewer
				.setLabelProvider(new CustomLabelProvider());
		
		MenuManager menuManager = new MenuManager();
		Menu menu = menuManager.createContextMenu(searchResultsTreeViewer.getTree());
		// Set the MenuManager
		searchResultsTreeViewer.getTree().setMenu(menu);
		getSite().registerContextMenu(menuManager, searchResultsTreeViewer);
		// Make the selection available
		getSite().setSelectionProvider(searchResultsTreeViewer);
	}

	@Override
	public void setFocus() {
		if (searchBox != null) {
			searchBox.setFocus();
		}
	}

	@Override
	public String getSearchTerm() {
		if (searchBox != null) {
			return searchBox.getText();
		} else {
			return "";
		}
	}
	
	public void setSearchTerm(String searchTerm) {
		if (searchBox != null) {
			searchBox.setText(searchTerm);
		}
	}

	public ComponentSearchResults getSearchResults() {
		return currentSearchResults;
	}

	public void setSearchResults(ComponentSearchResults results) {
		currentSearchResults = results;
		searchResultsTreeViewer.getTree().setRedraw(false);
		searchResultsTreeViewer.setInput(results);
		searchResultsTreeViewer.getTree().setRedraw(true);
	}
	
}
