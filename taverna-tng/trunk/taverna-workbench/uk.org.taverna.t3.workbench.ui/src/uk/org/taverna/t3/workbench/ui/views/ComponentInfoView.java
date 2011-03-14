package uk.org.taverna.t3.workbench.ui.views;

import lombok.Getter;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;
import uk.org.taverna.t3.workbench.ui.viewers.ComponentInfoViewer;

public class ComponentInfoView extends ViewPart {
	
	public static final String ID = "uk.org.taverna.t3.workbench.ui.views.componentInfo";
	
	@Getter
	private Composite parent;
	
	private ComponentInfoViewer componentInfoViewer;
	
	private ISelectionService selectionService;
	
	public ComponentInfoView() {
		
	}

	@Override
	public void createPartControl(Composite parent) {
		selectionService = getSite().getWorkbenchWindow().getSelectionService();
		
		this.parent = parent;
		parent.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout mainLayout = new GridLayout(1, true);
		mainLayout.marginWidth = 0;
		mainLayout.marginHeight = 0;
		parent.setLayout(mainLayout);
		
		componentInfoViewer = new ComponentInfoViewer(this, parent);
		componentInfoViewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
		
		registerListener();
	}
	
	private void registerListener() {
		selectionService.addPostSelectionListener(new ISelectionListener() {
			
			@Override
			public void selectionChanged(IWorkbenchPart part, ISelection selection) {
				
				if (selection instanceof IStructuredSelection) {
					IStructuredSelection structuredSelection = (IStructuredSelection) selection;
					if (structuredSelection.getFirstElement() instanceof ComponentDefinition) {
						componentInfoViewer.setComponentDefinition((ComponentDefinition) structuredSelection.getFirstElement());
					}
				}
				
			}
		});
	}

	@Override
	public void setFocus() {
		componentInfoViewer.setFocus();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		componentInfoViewer.dispose();
		super.dispose();
	}
	
}
