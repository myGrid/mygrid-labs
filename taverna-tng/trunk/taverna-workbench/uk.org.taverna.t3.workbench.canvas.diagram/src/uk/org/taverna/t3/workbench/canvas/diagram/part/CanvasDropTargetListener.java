package uk.org.taverna.t3.workbench.canvas.diagram.part;

import java.util.Iterator;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.dnd.TemplateTransferDropTargetListener;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.dnd.DND;

import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.CanvasEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentComponentCompartmentEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.Processor2EditPart;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasFactory;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Component;
import uk.org.taverna.t3.workbench.common.DragContainer;


public class CanvasDropTargetListener extends
		TemplateTransferDropTargetListener {

	
	Component justAdded = CanvasFactory.eINSTANCE.createComponent();

	public CanvasDropTargetListener(EditPartViewer viewer) {
		super(viewer);
		// TODO Auto-generated constructor stub
	}
	

    protected Request getTargetRequest() {
   	
        CreateRequest returnValue = new CreateRequest();
        returnValue.setFactory(new MyElementFactory());
        
        System.out.println(" event " + this.getCurrentEvent().data);      
             	
       // if (this.getCurrentEvent().data instanceof Component && !this.getCurrentEvent().data.equals(justAdded)) {
        	
       // 	justAdded = (Component) this.getCurrentEvent().data;
       // 	createComponentOnCanvas((Component)this.getCurrentEvent().data);
        	
       // }
        
        if (this.getCurrentEvent().data instanceof DragContainer ) {
            System.out.println(" DragContainer detected " + this.getCurrentEvent().data);      

        	DragContainer helper = (DragContainer) this.getCurrentEvent().data;
        	System.out.println(" same as ? " + helper.isSameObject());
        	if (!helper.isSameObject()) {
        		
        		System.out.println(" DragContainer to add Component");
        		helper.setSameObject(true);
        		createComponentOnCanvas((Component) helper.getData());
        		createComponentOnCanvas((Component) helper.getData());

        	}
        	
        }
             
        return returnValue;
    }
    
    public void createComponentOnCanvas(final Component data) {
    	
    	ISelection selection = this.getViewer().getSelection();
    
		IStructuredSelection structuredSelection = (IStructuredSelection) selection;
		
		// usually first item but need to check if it's an instance of IGraphicalPart
		System.out.println(" edit part : " + structuredSelection.getFirstElement().toString());
		
		// change this to check if it's a canvas edit part, if not find it.
		CanvasEditPart canvasEditPart = null;
		if (structuredSelection.getFirstElement() instanceof CanvasEditPart) {
			
			canvasEditPart = (CanvasEditPart) structuredSelection.getFirstElement();
			
		} else { // find the CanvadEdit Part
			
			Iterator selectionIterator = structuredSelection.iterator();
			
			while (selectionIterator.hasNext()) {
				
				Object object = selectionIterator.next();
				System.out.println(" object found : " + object);
				
				if (object instanceof IGraphicalEditPart) {
					
					
					
				}
				
				if (object instanceof CanvasEditPart) {

					System.out.println(" Canvas found");
					canvasEditPart = (CanvasEditPart) object;
					
				} else {
					
					if (object instanceof ComponentEditPart) {
						canvasEditPart = (CanvasEditPart) ((IGraphicalEditPart) object).getParent();
					}
					
					if (object instanceof Processor2EditPart) {
						Object tempObject =  ((((IGraphicalEditPart) object).getParent()).getParent()).getParent();
						
						if (tempObject  instanceof CanvasEditPart) {
							canvasEditPart = (CanvasEditPart) tempObject;
						}
					
					}
					
					if (object instanceof ComponentComponentCompartmentEditPart) {
						
						Object tempObject = ((((IGraphicalEditPart) object).getParent())).getParent();
						System.out.println(" tempObject " + tempObject);
						
						if (tempObject instanceof CanvasEditPart) {
							canvasEditPart = (CanvasEditPart) tempObject;
						}
						
					}
					
					// do the same for processor inputs and outputs & workflow inputs and outputs
					
				}
				
			}
			
		}
		
		// model element to add the dragged component to
    	final Canvas canvas = (Canvas)((View)canvasEditPart.getModel()).getElement();
    	
    	// transactional editing domain for command stack 
		TransactionalEditingDomain editingDomain = canvasEditPart.getEditingDomain();
		editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {
			
			@SuppressWarnings("unchecked")
			protected void doExecute() {
				
				/*	[ debug ] test model elements - to be set on components side
				Component myComp = CanvasFactory.eINSTANCE.createComponent();
				Processor myProcessor = CanvasFactory.eINSTANCE.createProcessor();
				myProcessor.setName("A processor");
				
				Processor myProcessor2 = CanvasFactory.eINSTANCE.createProcessor();
				myProcessor2.setName("A processor 2");
				
				myComp.getProcessors().add(myProcessor);
				myComp.getProcessors().add(myProcessor2);
				myComp.setTitle("a title");
				*/
				
				// Add the received model elements to canvas
				System.out.println(" transaction data " + data);

				canvas.getComponents().add(data);
				System.out.println("FINISHED");
				
				
			}
		});
    }
    
    @Override
    protected void handleDragOver() {
        //System.out.println(" event " + this.getCurrentEvent().data);

    	super.handleDragOver();
                          
        getCurrentEvent().detail = DND.DROP_COPY;
        
    }
    
	    public class MyElementFactory implements CreationFactory {
	
		@Override
		public Object getNewObject() {
			// TODO Auto-generated method stub
			return CanvasFactory.eINSTANCE.createComponent();
		}
	
		@Override
		public Object getObjectType() {
			// TODO Auto-generated method stub
			return Component.class;
		}

}
}

