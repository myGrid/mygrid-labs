package uk.org.taverna.t3.workbench.ui.viewers;

import lombok.Getter;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.nebula.jface.galleryviewer.GalleryTreeViewer;
import org.eclipse.nebula.widgets.gallery.DefaultGalleryGroupRenderer;
import org.eclipse.nebula.widgets.gallery.DefaultGalleryItemRenderer;
import org.eclipse.nebula.widgets.gallery.Gallery;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.progress.WorkbenchJob;

import uk.org.taverna.t3.workbench.components.registry.ComponentsRegistry;

public class ComponentPaletteViewer {
	private int LOAD_JOB_DELAY = 200;

	private Composite parent;
	
	private Job loadJob;
	
	@Getter
	private ComponentsRegistry componentsRegistry;
	
	private GalleryTreeViewer galleryTreeViewer;
	
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
		
		Gallery gallery = new Gallery(parent, SWT.V_SCROLL | SWT.MULTI);
		gallery.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		gallery.setAntialias(SWT.ON);

		// Renderers
		
		DefaultGalleryGroupRenderer gr = new DefaultGalleryGroupRenderer();
		gr.setMinMargin(2);
		gr.setItemHeight(16);
		gr.setItemWidth(16);
		gr.setAutoMargin(true);
		gallery.setGroupRenderer(gr);

		DefaultGalleryItemRenderer ir = new DefaultGalleryItemRenderer();
		gallery.setItemRenderer(ir);
		
		galleryTreeViewer = new GalleryTreeViewer(gallery);
		galleryTreeViewer.setContentProvider(new WorkbenchContentProvider());
		galleryTreeViewer.setLabelProvider(new WorkbenchLabelProvider());
		galleryTreeViewer.setInput(componentsRegistry);
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
					return Status.OK_STATUS;
				} else {
					return Status.CANCEL_STATUS;
				}
			}
		};
	}
}
