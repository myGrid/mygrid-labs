package uk.org.taverna.t3.workbench.ui.widgets;

import java.awt.Container;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.gef.dnd.TemplateTransfer;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.nebula.jface.galleryviewer.GalleryTreeViewer;
import org.eclipse.nebula.widgets.gallery.DefaultGalleryGroupRenderer;
import org.eclipse.nebula.widgets.gallery.DefaultGalleryItemRenderer;
import org.eclipse.nebula.widgets.gallery.Gallery;
import org.eclipse.nebula.widgets.gallery.ListItemRenderer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSourceAdapter;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.Transfer;
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
import org.eclipse.ui.services.IDisposable;

import uk.org.taverna.t3.workbench.components.registry.ComponentsRegistry;
import uk.org.taverna.t3.workbench.ui.util.ComponentsPaletteLayout;
import uk.org.taverna.t3.workbench.ui.util.EnhancedGalleryListItemRenderer;
import uk.org.taverna.t3.workbench.ui.util.ListInputContainer;
import uk.org.taverna.t3.workbench.ui.util.SelectionProviderIntermediate;
import uk.org.taverna.t3.workbench.ui.util.UIUtils;

/**
 * Viewer widget for displaying and working with a workflow components palette.
 * 
 * @author Jits
 *
 */
public class ComponentsPaletteViewer extends SelectionProviderIntermediate implements IDisposable {
	private static int REFRESH_JOB_DELAY = 200;

	@Getter
	private ComponentsRegistry componentsRegistry;
	
	private Composite container;
	private Composite stacksContainer;
	private StackLayout stacksContainerLayout;
	private Composite galleryTreeViewerContainer;
	private GalleryTreeViewer galleryTreeViewer;
	private Composite treeViewerContainer;
	private TreeViewer treeViewer;
	private Button searchMoreButton;
	
	private ComponentsPaletteLayout currentComponentsLayout;
	
	private Job refreshJob;
	
	private IWorkbenchSiteProgressService siteProgressService;
	private IStatusLineManager statusLineManager;
	
	private boolean internalSelectionChanging = false;
	
	private List<Color> colors = new ArrayList<Color>();
	private List<Font> fonts = new ArrayList<Font>();
	
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
		
		createGalleryViewerControl();
		createTreeViewerControl();
		createSearchMoreButtonControl();
		
		setComponentsLayout(ComponentsPaletteLayout.TREE);
	}
	
	private void createGalleryViewerControl() {
		// Fonts
		FontData parentFontData = container.getFont().getFontData()[0];
		Font groupFont = new Font(container.getDisplay(), parentFontData.getName(), 9, SWT.BOLD);
		fonts.add(groupFont);
		Font itemLabelFont = new Font(container.getDisplay(), parentFontData.getName(), 9, SWT.NONE);
		fonts.add(itemLabelFont);
		Font itemDescriptionFont = new Font(container.getDisplay(), parentFontData.getName(), 8, SWT.NONE);
		fonts.add(itemDescriptionFont);
		
		// Colors
		Color groupBackgroundColor = new Color(container.getDisplay(), 238, 238, 238);
		colors.add(groupBackgroundColor);
		Color groupForegroundColor = new Color(container.getDisplay(), 68, 68, 68);
		colors.add(groupForegroundColor);
		Color descriptionForegroundColor = new Color(container.getDisplay(), 102, 102, 102);
		colors.add(descriptionForegroundColor);
		
		galleryTreeViewerContainer = new Composite(stacksContainer, SWT.NONE);
		
		GridLayout layout = new GridLayout(1, true);
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		galleryTreeViewerContainer.setLayout(layout);
		
		Gallery gallery = new Gallery(galleryTreeViewerContainer, SWT.V_SCROLL | SWT.MULTI);
		gallery.setLayoutData(new GridData(GridData.FILL_BOTH));
		gallery.setAntialias(SWT.ON);

		// Renderers
		
		DefaultGalleryGroupRenderer gr = new DefaultGalleryGroupRenderer();
		gr.setMinMargin(2);
		gr.setItemSize(200, 24);
		gr.setAutoMargin(false);
		gr.setAnimation(true);
		gr.setAnimationLength(200);
		gr.setFont(groupFont);
		gr.setTitleBackground(groupBackgroundColor);
		gr.setTitleForeground(groupForegroundColor);
		gallery.setGroupRenderer(gr);

		EnhancedGalleryListItemRenderer ir = new EnhancedGalleryListItemRenderer();
		ir.setTextFont(itemLabelFont);
		ir.setDescriptionFont(itemDescriptionFont);
		gallery.setItemRenderer(ir);
		gallery.redraw();
		
		galleryTreeViewer = new GalleryTreeViewer(gallery);
		galleryTreeViewer.setContentProvider(new WorkbenchContentProvider());
		galleryTreeViewer.setLabelProvider(new WorkbenchLabelProvider());
		
		galleryTreeViewer.addPostSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				
				if (!internalSelectionChanging) {
					internalSelectionChanging = true;
					treeViewer.setSelection(event.getSelection(), true);
					internalSelectionChanging = false;
				}
				
			}
		});
	}
	
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
		
		treeViewer.addPostSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				
				if (!internalSelectionChanging) {
					internalSelectionChanging = true;
					galleryTreeViewer.setSelection(event.getSelection(), true);
					internalSelectionChanging = false;
				}
				
			}
		});
		
		// Example code to add drag support
		final String myData = "SOME DATA";
		treeViewer.addDragSupport( DND.DROP_COPY,
		        new Transfer[] { TemplateTransfer.getInstance() },
		        new DragSourceAdapter() {
		    public void dragSetData(DragSourceEvent event) {

		    }
		   
		    public void dragStart(DragSourceEvent event) {
		    	event.data = myData;
		    	System.out.println("DRAG STARTED with data: " + event.data);
		    }
		   
		});
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
					UIUtils.updateStatusBar(statusLineManager, "Failed to refresh components palette");
				}
			}
		});
	}
	
	private Job createRefreshJobObject() {
		return new Job("Refreshing components palette") {
			
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
							refreshViewerInputs();
						}
					});
					
					return Status.OK_STATUS;
				} else {
					return Status.CANCEL_STATUS;
				}
			}
			
		};
	}
	
	private void refreshViewerInputs() {
		galleryTreeViewer.setInput(new ListInputContainer(componentsRegistry.getTopLevelFlatGroups()));
		treeViewer.setInput(new ListInputContainer(componentsRegistry.getTopLevelTreeGroups()));
	}
	
	public Control getControl() {
		return container;
	}

	public ComponentsPaletteLayout cycleComponentsLayout() {
		switch (currentComponentsLayout) {
			case LIST:
				setComponentsLayout(ComponentsPaletteLayout.TREE);
				return ComponentsPaletteLayout.TREE;
			case TREE:
				setComponentsLayout(ComponentsPaletteLayout.LIST);
				return ComponentsPaletteLayout.LIST;
			default:
				return null;
		}
	}
	
	public void setComponentsLayout(ComponentsPaletteLayout layout) {
		if (layout != currentComponentsLayout) {
			switch (layout) {
				case LIST: 
					stacksContainerLayout.topControl = galleryTreeViewerContainer;
					currentComponentsLayout = ComponentsPaletteLayout.LIST;
					setSelectionProviderDelegate(galleryTreeViewer);
					break;
				case TREE: 
					stacksContainerLayout.topControl = treeViewerContainer;
					currentComponentsLayout = ComponentsPaletteLayout.TREE;
					setSelectionProviderDelegate(treeViewer);
					break;
			}
			
			stacksContainer.layout();
		}
	}
	
	@Override
	public void dispose() {
		if (colors != null) {
			for (Color c : colors) {
				if (c != null && !c.isDisposed())
					c.dispose();
			}
		}
		
		if (fonts != null) {
			for (Font f: fonts) {
				if (f != null && !f.isDisposed())
					f.dispose();
			}
		}
		
		if (container != null) {
			container.dispose();
		}
	}
}
