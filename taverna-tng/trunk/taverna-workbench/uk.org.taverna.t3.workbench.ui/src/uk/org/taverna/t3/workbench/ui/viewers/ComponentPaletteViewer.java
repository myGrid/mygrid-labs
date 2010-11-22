package uk.org.taverna.t3.workbench.ui.viewers;

import lombok.Getter;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.IPostSelectionProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.TreeViewer;
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
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.progress.WorkbenchJob;

import uk.org.taverna.t3.workbench.components.registry.ComponentsRegistry;

public class ComponentPaletteViewer implements IPostSelectionProvider {
	private int LOAD_JOB_DELAY = 200;

	@Getter
	private ComponentsRegistry componentsRegistry;
	
	private Composite parent;
	private Composite stacksContainer;
	private StackLayout stacksContainerLayout;
	private Composite galleryTreeViewerContainer;
	private GalleryTreeViewer galleryTreeViewer;
	private Composite treeViewerContainer;
	private TreeViewer treeViewer;
	private Button searchMoreButton;
	
	private Job loadJob;
	
	public ComponentPaletteViewer(Composite parent, String componentsDirPath) {
		this.parent = parent;
		this.componentsRegistry = new ComponentsRegistry(componentsDirPath);
		init();
	}
	
	public void setFocus() {
		this.galleryTreeViewer.getGallery().setFocus();
	}
	
	private void init() {
		createControls();
		createLoadJob();
		refresh();
	}
	
	public void refresh() {
		loadJob.cancel();
		loadJob.schedule(LOAD_JOB_DELAY);
	}
	
	private void createControls() {
		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout mainLayout = new GridLayout(1, true);
		mainLayout.marginWidth = 0;
		mainLayout.marginHeight = 0;
		parent.setLayout(mainLayout);
		
		stacksContainer = new Composite(parent, SWT.NONE);
		stacksContainer.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		stacksContainerLayout = new StackLayout();
		stacksContainer.setLayout(stacksContainerLayout);
		
		createGalleryViewerControl();
		createTreeViewerControl();
		createSearchMoreButtonControl();
		
		stacksContainerLayout.topControl = treeViewerContainer;
	}
	
	private void createGalleryViewerControl() {
		galleryTreeViewerContainer = new Composite(stacksContainer, SWT.NONE);
		GridLayout layout = new GridLayout(1, true);
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		galleryTreeViewerContainer.setLayout(layout);
		
		FontData parentFontData = parent.getFont().getFontData()[0];
		
		Gallery gallery = new Gallery(galleryTreeViewerContainer, SWT.V_SCROLL | SWT.MULTI);
		gallery.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		gallery.setAntialias(SWT.ON);
		gallery.setFont(new Font(parent.getDisplay(), parentFontData.getName(), 7, SWT.NONE));

		// Renderers
		
		DefaultGalleryGroupRenderer gr = new DefaultGalleryGroupRenderer();
		gr.setMinMargin(1);
		gr.setItemSize(60, 40);
		gr.setAutoMargin(false);
		gr.setAnimation(true);
		gr.setAnimationLength(200);
		gr.setFont(new Font(parent.getDisplay(), parentFontData.getName(), 9, SWT.BOLD));
		gr.setTitleBackground(new Color(parent.getDisplay(), 238, 238, 238));
		gr.setTitleForeground(new Color(parent.getDisplay(), 68, 68, 68));
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
//		galleryTreeViewer.setInput(componentsRegistry);
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
		treeViewer.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true));
		treeViewer.setContentProvider(new WorkbenchContentProvider());
		treeViewer.setLabelProvider(new WorkbenchLabelProvider());
		treeViewer.setInput(componentsRegistry);
	}
	
	private void createSearchMoreButtonControl() {
		searchMoreButton = new Button(parent, SWT.PUSH);
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
	
	private void createLoadJob() {
		loadJob = doCreateLoadJob();
		loadJob.setUser(true);
	}
	
	private WorkbenchJob doCreateLoadJob() {
		return new WorkbenchJob("Load local components") {
			
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
				if (galleryTreeViewer.getControl().isDisposed()) {
					return Status.CANCEL_STATUS;
				}
				
				boolean status = componentsRegistry.load();
				
				if (status) {
					galleryTreeViewer.refresh();
					treeViewer.refresh();
					return Status.OK_STATUS;
				} else {
					return Status.CANCEL_STATUS;
				}
			}
		};
	}
	
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ISelection getSelection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSelection(ISelection selection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPostSelectionChangedListener(
			ISelectionChangedListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePostSelectionChangedListener(
			ISelectionChangedListener listener) {
		// TODO Auto-generated method stub
		
	}
}
