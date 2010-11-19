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
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
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
		
		FontData parentFontData = parent.getFont().getFontData()[0];
		
		Gallery gallery = new Gallery(parent, SWT.V_SCROLL | SWT.MULTI);
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
