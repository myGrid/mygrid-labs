package uk.org.taverna.t3.workbench.canvas.diagram.part;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.dnd.TemplateTransferDropTargetListener;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.dnd.DND;
import org.eclipse.ui.handlers.HandlerUtil;

import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.CanvasEditPart;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasFactory;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Component;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Processor;


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
             	
        if (this.getCurrentEvent().data instanceof Component && !this.getCurrentEvent().data.toString().equals(justAdded.toString())) {
        	
        	justAdded = (Component) this.getCurrentEvent().data;
        	createComponentOnCanvas((Component)this.getCurrentEvent().data);

        }
             
        return returnValue;
    }
    
    public void createComponentOnCanvas(final Component data) {
    	
    	ISelection selection = this.getViewer().getSelection();
		IStructuredSelection structuredSelection = (IStructuredSelection) selection;
		
		// usually first item but need to check if it's an instance of IGraphicalPart
		System.out.println(" edit part : " + structuredSelection.getFirstElement().toString());
		
		// change this to check if it's a canvas edit part, if not find it.
		CanvasEditPart canvasEditPart = (CanvasEditPart) structuredSelection.getFirstElement();
		
		// model element to add the dragged component to
    	final Canvas dev = (Canvas)((View)canvasEditPart.getModel()).getElement();
    	
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
				
				dev.getComponents().add(data);
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

