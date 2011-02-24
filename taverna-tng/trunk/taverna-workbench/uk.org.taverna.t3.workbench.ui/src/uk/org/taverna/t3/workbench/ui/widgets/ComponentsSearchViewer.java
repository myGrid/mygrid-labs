package uk.org.taverna.t3.workbench.ui.widgets;

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
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.services.IDisposable;

import uk.org.taverna.t3.workbench.common.ISearchTermProvider;
import uk.org.taverna.t3.workbench.components.search.ComponentSearchResults;
import uk.org.taverna.t3.workbench.components.search.ComponentSearcher;
import uk.org.taverna.t3.workbench.components.search.IComponentSearchProvider;
import uk.org.taverna.t3.workbench.ui.commands.CommandParameters;
import uk.org.taverna.t3.workbench.ui.commands.Commands;
import uk.org.taverna.t3.workbench.ui.util.SelectionProviderIntermediate;

public class ComponentsSearchViewer extends SelectionProviderIntermediate implements IDisposable, ISearchTermProvider {

	private Composite container;
	private Text searchBox;
	private TreeViewer searchResultsTreeViewer;
	
	private IHandlerService handlerService; 
	private ICommandService commandService;
	
	public ComponentsSearchViewer(ViewPart viewPart, Composite parent) {
		this.container = new Composite(parent, SWT.NONE);
		
		handlerService = (IHandlerService) viewPart.getSite().getService(IHandlerService.class);
		commandService = (ICommandService) viewPart.getSite().getService(ICommandService.class);
		
		createControls();
	}
	
	private void createControls() {
		GridLayout mainLayout = new GridLayout(1, true);
		mainLayout.marginWidth = 0;
		mainLayout.marginHeight = 0;
		container.setLayout(mainLayout);
		
		createSearchBoxControl();
		createSearchResultsTreeViewer();
	}

	private void createSearchBoxControl() {
		searchBox = new Text(container, SWT.SINGLE | SWT.CANCEL | SWT.SEARCH
				| SWT.BORDER);
		searchBox.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false));
		searchBox.setMessage("Search term...");
		searchBox.addSelectionListener(new SelectionAdapter() {
			public void widgetDefaultSelected(SelectionEvent e) {
				if (e.detail == SWT.CANCEL) {
					System.out.println("Search cancelled");
				} else {
					try {
//						Command searchCommand = commandService.getCommand(Commands.SEARCH_NEW_COMPONENTS);
//						Map<String, Object> params = new HashMap<String, Object>();
//						params.put(CommandParameters.SEARCH_TERM, getSearchTerm());
//						ParameterizedCommand paramSarchCommand = ParameterizedCommand.generateCommand(searchCommand, params);
//						ExecutionEvent execEvent = handlerService.createExecutionEvent(paramSarchCommand, null);
//						searchCommand.executeWithChecks(execEvent);
						
						// TEMP:
						Map<IComponentSearchProvider, ComponentSearchResults> results = ComponentSearcher.getInstance().search(getSearchTerm());
						System.out.println("Results sets found: " + results.size());
						
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			}
		});
	}
	
	private void createSearchResultsTreeViewer() {
		searchResultsTreeViewer = new TreeViewer(container, SWT.MULTI
				| SWT.H_SCROLL | SWT.V_SCROLL);
		searchResultsTreeViewer.getControl().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, true));
		searchResultsTreeViewer.setContentProvider(new WorkbenchContentProvider());
		searchResultsTreeViewer.setLabelProvider(new WorkbenchLabelProvider());
	}
	
	public Control getControl() {
		return container;
	}
	
	public void setFocus() {
		searchBox.setFocus();
	}
	
	@Override
	public String getSearchTerm() {
		return searchBox.getText();
	}
	
	@Override
	public void dispose() {
		if (container != null) {
			container.dispose();
		}
	}

}
