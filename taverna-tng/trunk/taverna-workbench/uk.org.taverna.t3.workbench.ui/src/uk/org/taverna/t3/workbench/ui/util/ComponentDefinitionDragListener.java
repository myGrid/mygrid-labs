package uk.org.taverna.t3.workbench.ui.util;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.dnd.DragSourceAdapter;
import org.eclipse.swt.dnd.DragSourceEvent;

import uk.org.taverna.t3.workbench.common.DragContainer;
import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;
import uk.org.taverna.t3.workbench.ui.canvas.CanvasHelper;

public class ComponentDefinitionDragListener extends DragSourceAdapter {

	private CanvasHelper canvasHelper;
	
	private final TreeViewer viewer;

	public ComponentDefinitionDragListener(TreeViewer viewer) {
		canvasHelper = new CanvasHelper();
		
		this.viewer = viewer;
	}

	@Override
	public void dragFinished(DragSourceEvent event) {
		System.out.println("Component definition drag finished");
	}
	
	@Override
	public void dragSetData(DragSourceEvent event) {
		
		IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
		
		// TODO: currently only supports dragging a single component
		
		if (selection.getFirstElement() instanceof ComponentDefinition) {
			ComponentDefinition cd = (ComponentDefinition) selection.getFirstElement();
			
			final DragContainer dragContainer = new DragContainer();
			dragContainer.setData(canvasHelper.buildComponentFrom(cd));
			dragContainer.setId(cd.getId());
			dragContainer.setSameObject(false);
			
			event.data = dragContainer;
		}
	}
   
	@Override
    public void dragStart(DragSourceEvent event) {
    	System.out.println("Component definition drag started with data: " + event.data);
    }
	
}
