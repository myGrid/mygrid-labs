package uk.org.taverna.t3.workbench.ui.viewers;

import lombok.Getter;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.nebula.jface.galleryviewer.GalleryTreeViewer;
import org.eclipse.nebula.widgets.gallery.DefaultGalleryGroupRenderer;
import org.eclipse.nebula.widgets.gallery.DefaultGalleryItemRenderer;
import org.eclipse.nebula.widgets.gallery.Gallery;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.progress.IWorkbenchSiteProgressService;

import uk.org.taverna.t3.workbench.components.registry.ComponentsRegistry;
import uk.org.taverna.t3.workbench.ui.util.ListInputContainer;
import uk.org.taverna.t3.workbench.ui.util.UIUtils;

public class ComponentsPaletteViewer extends Viewer {
	private static int REFRESH_JOB_DELAY = 200;

	@Getter
	private ComponentsRegistry componentsRegistry;
	
	private Composite container;
	private Composite stacksContainer;
	private StackLayout stacksContainerLayout;
	private Composite listViewerContainer;
	private ListViewer listViewer;
	private Composite galleryTreeViewerContainer;
	private GalleryTreeViewer galleryTreeViewer;
	private Composite treeViewerContainer;
	private TreeViewer treeViewer;
	private Button searchMoreButton;
	
	private Job refreshJob;
	
	IWorkbenchSiteProgressService siteProgressService;
	IStatusLineManager statusLineManager;
	
	public ComponentsPaletteViewer(ViewPart viewPart, Composite parent, String componentsDirPath) {
		this.container = new Composite(parent, SWT.NONE);
		this.componentsRegistry = new ComponentsRegistry(componentsDirPath);
		
		this.siteProgressService = (IWorkbenchSiteProgressService) viewPart.getSite().getService(IWorkbenchSiteProgressService.class);
		this.statusLineManager = viewPart.getViewSite().getActionBars().getStatusLineManager();
		
		createControls();
		createRefreshJob();
		refresh();
	}
	
	public void setFocus() {
		// TODO: set focus on the current sub-viewer that has been selected!
		treeViewer.getTree().setFocus();
	}
	
	public void refresh() {
		// TODO: maybe split out the load components vs refresh UI processes
		refreshJob.cancel();
		siteProgressService.schedule(refreshJob, REFRESH_JOB_DELAY);
	}
	
	private void createControls() {
		GridLayout mainLayout = new GridLayout(1, true);
		mainLayout.marginWidth = 0;
		mainLayout.marginHeight = 0;
		container.setLayout(mainLayout);
		
		stacksContainer = new Composite(container, SWT.NONE);
		stacksContainer.setLayoutData(new GridData(GridData.FILL_BOTH));
		stacksContainerLayout = new StackLayout();
		stacksContainer.setLayout(stacksContainerLayout);
		
		createListViewerControl();
		createGalleryViewerControl();
		createTreeViewerControl();
		createSearchMoreButtonControl();
		
		stacksContainerLayout.topControl = treeViewerContainer;
	}
	
	private void createListViewerControl() {
		listViewerContainer = new Composite(stacksContainer, SWT.NONE);
		GridLayout layout = new GridLayout(1, true);
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		listViewerContainer.setLayout(layout);
		
		listViewer = new ListViewer(listViewerContainer, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		listViewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
		listViewer.setContentProvider(new ArrayContentProvider());
		listViewer.setLabelProvider(new WorkbenchLabelProvider());
	}

	private void createGalleryViewerControl() {
		galleryTreeViewerContainer = new Composite(stacksContainer, SWT.NONE);
		GridLayout layout = new GridLayout(1, true);
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		galleryTreeViewerContainer.setLayout(layout);
		
		FontData parentFontData = container.getFont().getFontData()[0];
		
		Gallery gallery = new Gallery(galleryTreeViewerContainer, SWT.V_SCROLL | SWT.MULTI);
		gallery.setLayoutData(new GridData(GridData.FILL_BOTH));
		gallery.setAntialias(SWT.ON);
		gallery.setFont(new Font(container.getDisplay(), parentFontData.getName(), 7, SWT.NONE));

		// Renderers
		
		DefaultGalleryGroupRenderer gr = new DefaultGalleryGroupRenderer();
		gr.setMinMargin(1);
		gr.setItemSize(60, 40);
		gr.setAutoMargin(false);
		gr.setAnimation(true);
		gr.setAnimationLength(200);
		gr.setFont(new Font(container.getDisplay(), parentFontData.getName(), 9, SWT.BOLD));
		gr.setTitleBackground(new Color(container.getDisplay(), 238, 238, 238));
		gr.setTitleForeground(new Color(container.getDisplay(), 68, 68, 68));
		gallery.setGroupRenderer(gr);

		DefaultGalleryItemRenderer ir = new DefaultGalleryItemRenderer();
		ir.setDropShadows(false);
		ir.setShowRoundedSelectionCorners(false);
		ir.setShowLabels(true);
		gallery.setItemRenderer(ir);
		
//		ListItemRenderer ir = new ListItemRenderer();
//		ir.setShowLabels(true);
//		gallery.setItemRenderer(ir);
		
		galleryTreeViewer = new GalleryTreeViewer(gallery);
		galleryTreeViewer.setContentProvider(new WorkbenchContentProvider());
		galleryTreeViewer.setLabelProvider(new WorkbenchLabelProvider());
	}
	
	// TODO: find out from users if having these two different views is useful!
	// Maybe it's more useful to just have a simple vs detailed view on the gallery view?
	private void createTreeViewerControl() {
		treeViewerContainer = new Composite(stacksContainer, SWT.NONE);
		GridLayout layout = new GridLayout(1, true);
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		treeViewerContainer.setLayout(layout);
		
		// TODO: look into using FilteredTree.NotifyingTreeViewer.
		// It is needed for the filtering.
		treeViewer = new TreeViewer(treeViewerContainer, SWT.MULTI
				| SWT.H_SCROLL | SWT.V_SCROLL);
		treeViewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
		treeViewer.setContentProvider(new WorkbenchContentProvider());
		treeViewer.setLabelProvider(new WorkbenchLabelProvider());
	}
	
	private void createSearchMoreButtonControl() {
		searchMoreButton = new Button(container, SWT.PUSH);
		searchMoreButton.setText("Search for new components...");
		searchMoreButton.setLayoutData(new GridData(SWT.FILL, SWT.END, true,
				false));
		searchMoreButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
//				try {
//					// TODO: cache these instead of fetching each time!
//					IHandlerService handlerService = (IHandlerService) getSite()
//							.getService(IHandlerService.class);
//					ICommandService commandService = (ICommandService) getSite()
//							.getService(ICommandService.class);
//
//					Command searchCommand = commandService
//							.getCommand(ICommands.SEARCH_NEW_COMPONENTS);
//					Map<String, Object> params = new HashMap<String, Object>();
//					params.put(ICommandParameters.SEARCH_TERM, getSearchTerm());
//					ParameterizedCommand paramSarchCommand = ParameterizedCommand
//							.generateCommand(searchCommand, params);
//					ExecutionEvent execEvent = handlerService
//							.createExecutionEvent(paramSarchCommand, null);
//					searchCommand.executeWithChecks(execEvent);
//				} catch (Exception ex) {
//					ex.printStackTrace();
//				}
			}
		});
	}
	
	private void createRefreshJob() {
		refreshJob = createRefreshJobObject();
		refreshJob.addJobChangeListener(new JobChangeAdapter() {
			public void done(IJobChangeEvent event) {
				if (event.getResult().isOK()) {
					UIUtils.updateStatusBar(statusLineManager, componentsRegistry.totalDefinitions() + " workflow components found locally (in " + componentsRegistry.totalGroups() + " groups)");
				} else {
					UIUtils.updateStatusBar(statusLineManager, "Failed to refresh component palette");
				}
			}
		});
	}
	
	private Job createRefreshJobObject() {
		return new Job("Refreshng component palette") {
			
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				if (galleryTreeViewer.getControl().isDisposed() || treeViewer.getControl().isDisposed()) {
					return Status.CANCEL_STATUS;
				}
				
				monitor.beginTask("Loading components", 100);
				boolean status = componentsRegistry.load();
				monitor.worked(100);
				
				if (status) {
					Display.getDefault().asyncExec(new Runnable() {
						public void run() {
							refreshInputs();
						}
					});
					
					return Status.OK_STATUS;
				} else {
					return Status.CANCEL_STATUS;
				}
			}
			
		};
	}
	
	private void refreshInputs() {
		// FIXME: This currently does not work!!
		treeViewer.setInput(new ListInputContainer(componentsRegistry.getAllDefinitions()));
		
		galleryTreeViewer.setInput(new ListInputContainer(componentsRegistry.getTopLevelFlatGroups()));
		treeViewer.setInput(new ListInputContainer(componentsRegistry.getTopLevelTreeGroups()));
	}
	
	@Override
	public Control getControl() {
		return container;
	}

	@Override
	public Object getInput() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ISelection getSelection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInput(Object input) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSelection(ISelection selection, boolean reveal) {
		// TODO Auto-generated method stub
		
	}
	
}
