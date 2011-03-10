package uk.org.taverna.t3.workbench.ui.widgets;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.gef.dnd.TemplateTransfer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.services.IDisposable;

import uk.org.taverna.t3.workbench.common.ISearchQueryProvider;
import uk.org.taverna.t3.workbench.components.search.ComponentSearchResults;
import uk.org.taverna.t3.workbench.ui.commands.CommandParameters;
import uk.org.taverna.t3.workbench.ui.commands.Commands;
import uk.org.taverna.t3.workbench.ui.util.ComponentDefinitionDragListener;
import uk.org.taverna.t3.workbench.ui.util.ListInputContainer;
import uk.org.taverna.t3.workbench.ui.util.SelectionProviderIntermediate;

public class ComponentsSearchViewer extends SelectionProviderIntermediate implements IDisposable, ISearchQueryProvider {

	public static final String ID = "uk.org.taverna.t3.workbench.ui.views.componentsSearch";		//$NON-NLS-1$
	
	private Composite container;
	private Text searchBox;
	private TreeViewer searchResultsTreeViewer;
	
	private List<ComponentSearchResults> currentSearchResults;
	
	private IHandlerService handlerService; 
	private ICommandService commandService;
	
	public ComponentsSearchViewer(ViewPart viewPart, Composite parent) {
		container = new Composite(parent, SWT.NONE);
		
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
						Command searchCommand = commandService.getCommand(Commands.SEARCH_NEW_COMPONENTS);
						Map<String, Object> params = new HashMap<String, Object>();
						params.put(CommandParameters.SEARCH_QUERY, getSearchQuery());
						ParameterizedCommand paramSearchCommand = ParameterizedCommand.generateCommand(searchCommand, params);
						ExecutionEvent execEvent = handlerService.createExecutionEvent(paramSearchCommand, null);
						searchCommand.executeWithChecks(execEvent);
					} catch (Exception ex) {
						// TODO: change to use proper logging mechanism.
						// Dependent on JIRA task:
						// http://www.mygrid.org.uk/dev/issues/browse/TNG-105
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
		
		// Add drag and drop support to the TreeViewer
		searchResultsTreeViewer.addDragSupport(DND.DROP_COPY,
		        new Transfer[] { TemplateTransfer.getInstance() },
		        new ComponentDefinitionDragListener(searchResultsTreeViewer));
		
		setSelectionProviderDelegate(searchResultsTreeViewer);
	}
	
	public Control getControl() {
		return container;
	}
	
	public void setFocus() {
		searchBox.setFocus();
	}
	
	@Override
	public String getSearchQuery() {
		return searchBox.getText();
	}
	
	public void setSearchQuery(String searchQuery) {
		searchBox.setText(searchQuery);
	}

	public List<ComponentSearchResults> getCurrentSearchResults() {
		return currentSearchResults;
	}

	public void setSearchResults(List<ComponentSearchResults> results) {
		currentSearchResults = results;
		searchResultsTreeViewer.getTree().setRedraw(false);
		searchResultsTreeViewer.setInput(new ListInputContainer(results));
		searchResultsTreeViewer.getTree().setRedraw(true);
	}
	
	@Override
	public void dispose() {
		if (container != null) {
			container.dispose();
		}
	}

}
